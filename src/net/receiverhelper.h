/***************************************************************************
 *   Copyright (C) 2007 by Lothar May                                      *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU General Public License     *
 *   along with this program; if not, write to the                         *
 *   Free Software Foundation, Inc.,                                       *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
 ***************************************************************************/
/* Network receiver helper class. NOTE: By design, this is not a thread. */

#ifndef _RECEIVERHELPER_H_
#define _RECEIVERHELPER_H_

#include <net/socket_helper.h>
#include <net/netpacket.h>

#include <deque>
#include <boost/shared_ptr.hpp>

// MUST be larger than MAX_PACKET_SIZE
#define RECV_BUF_SIZE		10 * MAX_PACKET_SIZE

class ReceiverHelper
{
public:
	ReceiverHelper();
	virtual ~ReceiverHelper();

	// Set the socket from which to receive data.
	void Init(SOCKET socket);

	boost::shared_ptr<NetPacket> Recv();

protected:
	boost::shared_ptr<NetPacket> InternalGetPacket();
	boost::shared_ptr<NetPacket> InternalCreateNetPacket(const NetPacketHeader *p);

private:

	SOCKET m_socket;

	char m_tmpInBuf[RECV_BUF_SIZE];
	unsigned m_tmpInBufSize;
};

#endif

