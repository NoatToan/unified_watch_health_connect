package com.xiaomi.digitalkey.wearable.utils;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.UShort;

/* JADX INFO: loaded from: classes7.dex */
public class TLVParser {
    private static final boolean DEBUG = Logger.LOG_TLV;
    private static final String LogTag = "SDK-DKF-TLVPaser:";
    List<TLVObject> mTLVList = new ArrayList();

    public static byte[] getLenArray(int i) {
        if (i <= 127) {
            return new byte[]{(byte) i};
        }
        if (i <= 255) {
            return new byte[]{-127, (byte) i};
        }
        return i <= 65535 ? new byte[]{-126, (byte) ((65280 & i) >> 8), (byte) (i & 255)} : new byte[]{(byte) i};
    }

    public static byte[] getPayloadFromTag(byte[] bArr, byte[] bArr2) {
        TLVParser tLVParser = new TLVParser();
        tLVParser.parse(bArr);
        for (TLVObject tLVObject : tLVParser.getParseResult()) {
            if (ByteUtils.equals(tLVObject.getTag(), bArr2)) {
                bArr = tLVObject.getValue();
            }
        }
        return bArr;
    }

    public static byte[] getPayloadFromTagNullPossible(byte[] bArr, byte[] bArr2) {
        TLVParser tLVParser = new TLVParser();
        tLVParser.parse(bArr);
        for (TLVObject tLVObject : tLVParser.getParseResult()) {
            if (ByteUtils.equals(tLVObject.getTag(), bArr2)) {
                return tLVObject.getValue();
            }
        }
        return null;
    }

    public static int getTlvlen(byte[] bArr) {
        int i = 2;
        if (bArr == null || bArr.length < 2) {
            return 0;
        }
        int i2 = (bArr[0] & 31) == 31 ? 2 : 1;
        System.arraycopy(bArr, 0, new byte[i2], 0, i2);
        int i3 = bArr[i2];
        int i4 = i3 & 255;
        if (i4 == 129) {
            i3 = bArr[1 + i2] & 255;
        } else if (i4 == 130) {
            i3 = ByteBuffer.wrap(new byte[]{bArr[i2 + 1], bArr[i2 + 2]}).getShort();
            i = 3;
        } else {
            i = 1;
        }
        return i3 + i + i2;
    }

    public static int getTvlLenLen(int i) {
        return getLenArray(i).length;
    }

    public static byte[] updateTagData(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        TLVParser tLVParser = new TLVParser();
        tLVParser.parse(bArr);
        byte[] bArrConcatenate = null;
        for (TLVObject tLVObject : tLVParser.getParseResult()) {
            if (!ByteUtils.equals(tLVObject.getTag(), bArr2)) {
                byte[] bArrConcatenateTLV = ByteUtils.concatenateTLV(tLVObject.getTag(), tLVObject.getValue());
                bArrConcatenate = bArrConcatenate == null ? bArrConcatenateTLV : ByteUtils.concatenate(bArrConcatenate, bArrConcatenateTLV);
            }
        }
        return ByteUtils.concatenate(bArrConcatenate, ByteUtils.concatenateTLV(bArr2, bArr3));
    }

    public List<TLVObject> getParseResult() {
        return this.mTLVList;
    }

    public void parse(byte[] bArr) {
        int i;
        int i2;
        TLVObject tLVObject;
        int i3 = 4;
        if (bArr == null || bArr.length < 2) {
            return;
        }
        int i4 = (bArr[0] & 31) == 31 ? 2 : 1;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, 0, bArr2, 0, i4);
        int i5 = bArr[i4];
        int i6 = i5 & 255;
        if (i6 == 129) {
            i5 = bArr[1 + i4] & 255;
            i3 = 2;
        } else if (i6 == 130) {
            i5 = ByteBuffer.wrap(new byte[]{bArr[i4 + 1], bArr[i4 + 2]}).getShort() & UShort.MAX_VALUE;
            i3 = 3;
        } else if (i6 == 131) {
            i5 = ByteBuffer.wrap(new byte[]{0, bArr[i4 + 1], bArr[i4 + 2], bArr[i4 + 3]}).getInt();
        } else {
            i3 = 1;
        }
        if (i5 < 0 || bArr.length < (i2 = (i = i4 + i3) + i5)) {
            return;
        }
        if (i5 > 0) {
            byte[] bArr3 = new byte[i5];
            System.arraycopy(bArr, i, bArr3, 0, i5);
            tLVObject = new TLVObject(bArr2, i5, bArr3);
        } else {
            tLVObject = new TLVObject(bArr2, 0, null);
        }
        this.mTLVList.add(tLVObject);
        int length = ((bArr.length - i4) - i3) - i5;
        if (length >= 2) {
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr, i2, bArr4, 0, length);
            parse(bArr4);
        }
    }

    public byte[] wraper() {
        int length = 0;
        for (TLVObject tLVObject : this.mTLVList) {
            length = tLVObject.getTag().length == 1 ? length + tLVObject.getTag().length + 1 + tLVObject.getLength() : length + tLVObject.getTag().length + 1;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (TLVObject tLVObject2 : this.mTLVList) {
            if (tLVObject2.getTag().length == 1) {
                bArr[length2] = tLVObject2.getTag()[0];
                int i = length2 + 1;
                bArr[i] = (byte) (bArr[i] + tLVObject2.getLength());
                int i2 = length2 + 2;
                System.arraycopy(tLVObject2.getValue(), 0, bArr, i2, tLVObject2.getLength());
                length2 = i2 + tLVObject2.getLength();
            } else {
                System.arraycopy(tLVObject2.getTag(), 0, bArr, length2, 2);
                int i3 = length2 + 2;
                bArr[i3] = (byte) (bArr[i3] + tLVObject2.getLength());
                length2 += 3;
            }
        }
        return bArr;
    }
}
