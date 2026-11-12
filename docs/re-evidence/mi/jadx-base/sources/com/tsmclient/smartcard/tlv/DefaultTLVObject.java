package com.tsmclient.smartcard.tlv;

import com.tsmclient.smartcard.ByteArray;

/* JADX INFO: loaded from: classes6.dex */
class DefaultTLVObject implements ITLVObject {
    private ByteArray mLength;
    private ByteArray mTag;
    private ITLVValue mValue;

    public DefaultTLVObject(ByteArray byteArray, ByteArray byteArray2, ITLVValue iTLVValue) {
        this.mTag = byteArray;
        this.mLength = byteArray2;
        this.mValue = iTLVValue;
    }

    @Override // com.tsmclient.smartcard.tlv.ITLVObject
    public ByteArray getLength() {
        return this.mLength;
    }

    @Override // com.tsmclient.smartcard.tlv.ITLVObject
    public ByteArray getTag() {
        return this.mTag;
    }

    @Override // com.tsmclient.smartcard.tlv.ITLVObject
    public ITLVValue getValue() {
        return this.mValue;
    }

    public void setLength(ByteArray byteArray) {
        this.mLength = byteArray;
    }

    public void setTag(ByteArray byteArray) {
        this.mTag = byteArray;
    }

    public void setValue(ITLVValue iTLVValue) {
        this.mValue = iTLVValue;
    }
}
