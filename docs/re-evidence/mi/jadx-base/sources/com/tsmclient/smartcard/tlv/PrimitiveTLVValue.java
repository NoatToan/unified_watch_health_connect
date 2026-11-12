package com.tsmclient.smartcard.tlv;

import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.exception.TagNotFoundException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
class PrimitiveTLVValue implements ITLVValue {
    private ByteArray mValue;

    public PrimitiveTLVValue(ByteArray byteArray) {
        this.mValue = byteArray;
    }

    @Override // com.tsmclient.smartcard.tlv.ITLVValue
    public ITLVObject findTLV(ByteArray byteArray) throws TagNotFoundException {
        throw new TagNotFoundException("it is a primitive tlv");
    }

    @Override // com.tsmclient.smartcard.tlv.ITLVValue
    public List<ITLVObject> findTLVList(ByteArray byteArray) throws TagNotFoundException {
        throw new TagNotFoundException("it is a primitive tlv");
    }

    @Override // com.tsmclient.smartcard.tlv.ITLVValue
    public ByteArray toBytes() {
        return this.mValue;
    }

    public String toString() {
        return this.mValue.toString();
    }
}
