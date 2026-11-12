package com.xiaomi.digitalkey.wearable.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class TLVObject {
    private static final boolean DEBUG = Logger.LOG_TLV;
    private final String LogTag;
    private int mLength;
    private List<TLVObject> mSubTLVData;
    private byte[] mTag;
    private byte[] mValues;

    public TLVObject(byte[] bArr, int i, byte[] bArr2) {
        this.LogTag = "SDK-DKF-TLVPaser:";
        this.mTag = bArr;
        this.mLength = i;
        this.mValues = bArr2;
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("new tlv tag: ");
            sb.append(ByteUtils.toHexString(bArr));
            sb.append(" len: ");
            sb.append(i);
            sb.append(" data: \n");
            sb.append(ByteUtils.toHexString(bArr2));
        }
    }

    public static byte[] getArrayBytes(List<TLVObject> list) {
        byte[] bArrConcatenate = new byte[0];
        Iterator<TLVObject> it = list.iterator();
        while (it.hasNext()) {
            bArrConcatenate = ByteUtils.concatenate(bArrConcatenate, it.next().toBytes());
        }
        return bArrConcatenate;
    }

    public int getLength() {
        return this.mLength;
    }

    public byte[] getTag() {
        return this.mTag;
    }

    public byte[] getValue() {
        return this.mValues;
    }

    public byte[] toBytes() {
        return ByteUtils.concatenateTLV(this.mTag, this.mValues);
    }

    public TLVObject(byte[] bArr, List<TLVObject> list) {
        this.LogTag = "SDK-DKF-TLVPaser:";
        this.mTag = bArr;
        this.mSubTLVData = list;
        byte[] bArrConcatenate = new byte[0];
        Iterator<TLVObject> it = list.iterator();
        while (it.hasNext()) {
            bArrConcatenate = ByteUtils.concatenate(bArrConcatenate, it.next().toBytes());
        }
        this.mValues = bArrConcatenate;
    }

    public TLVObject(byte[] bArr, byte[] bArr2) {
        this.LogTag = "SDK-DKF-TLVPaser:";
        this.mTag = bArr;
        this.mValues = bArr2;
        this.mSubTLVData = new ArrayList();
    }
}
