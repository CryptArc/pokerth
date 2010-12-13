
package pokerth_protocol;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.*;
import org.bn.annotations.*;
import org.bn.annotations.constraints.*;
import org.bn.coders.*;
import org.bn.types.*;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "InitAckMessage" )
    public class InitAckMessage implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "InitAckMessage" , isSet = false )
       public static class InitAckMessageSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "yourSessionId", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Guid yourSessionId = null;
                
  
        @ASN1Element ( name = "yourPlayerId", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private NonZeroId yourPlayerId = null;
                
  
        @ASN1Element ( name = "yourAvatar", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private AvatarHash yourAvatar = null;
                
  
        
        public Guid getYourSessionId () {
            return this.yourSessionId;
        }

        

        public void setYourSessionId (Guid value) {
            this.yourSessionId = value;
        }
        
  
        
        public NonZeroId getYourPlayerId () {
            return this.yourPlayerId;
        }

        

        public void setYourPlayerId (NonZeroId value) {
            this.yourPlayerId = value;
        }
        
  
        
        public AvatarHash getYourAvatar () {
            return this.yourAvatar;
        }

        
        public boolean isYourAvatarPresent () {
            return this.yourAvatar != null;
        }
        

        public void setYourAvatar (AvatarHash value) {
            this.yourAvatar = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_InitAckMessageSequenceType;
        }

       private static IASN1PreparedElementData preparedData_InitAckMessageSequenceType = CoderFactory.getInstance().newPreparedElementData(InitAckMessageSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "InitAckMessage", isOptional =  false , hasTag =  true, tag = 3, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private InitAckMessageSequenceType  value;        

        
        
        public InitAckMessage () {
        }
        
        
        
        public void setValue(InitAckMessageSequenceType value) {
            this.value = value;
        }
        
        
        
        public InitAckMessageSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(InitAckMessage.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            