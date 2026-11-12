package com.tsmclient.smartcard.tlv;

import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.exception.TagNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
class ArrayTLVValue implements ITLVValue {
    private ByteArray mOrigin;
    private List<ITLVObject> mValues;

    public ArrayTLVValue(ByteArray byteArray, Collection<? extends ITLVObject> collection) {
        this.mOrigin = byteArray;
        ArrayList arrayList = new ArrayList();
        this.mValues = arrayList;
        arrayList.addAll(collection);
    }

    @Override // com.tsmclient.smartcard.tlv.ITLVValue
    public ITLVObject findTLV(ByteArray byteArray) throws TagNotFoundException {
        for (ITLVObject iTLVObject : this.mValues) {
            if (ByteArray.equals(byteArray, iTLVObject.getTag())) {
                return iTLVObject;
            }
        }
        throw new TagNotFoundException("tag not found: " + Coder.bytesToHexString(byteArray.toBytes()));
    }

    @Override // com.tsmclient.smartcard.tlv.ITLVValue
    public List<ITLVObject> findTLVList(ByteArray byteArray) throws TagNotFoundException {
        ArrayList arrayList = new ArrayList();
        for (ITLVObject iTLVObject : this.mValues) {
            if (ByteArray.equals(byteArray, iTLVObject.getTag())) {
                arrayList.add(iTLVObject);
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        throw new TagNotFoundException("tag not found: " + Coder.bytesToHexString(byteArray.toBytes()));
    }

    public int getSize() {
        return this.mValues.size();
    }

    @Override // com.tsmclient.smartcard.tlv.ITLVValue
    public ByteArray toBytes() {
        return this.mOrigin;
    }
}
