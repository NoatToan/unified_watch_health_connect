package com.xiaomi.hm.health.bt.profile.collect;

import com.xiaomi.hm.health.bt.debug.Debug;

/* JADX INFO: loaded from: classes11.dex */
public class DataCollect {
    private static final String a = "DataCollect";
    public boolean mInited = false;
    public int mActySize = 0;
    public int mEcgCount = 0;
    public int mAfPpgCount = 0;
    public int mRRSize = 0;
    public int mPgs = 0;
    public int mRecvActySize = 0;
    public int mRecvECGCount = 0;
    public int mRecvAfPPGCount = 0;
    public int mRecvRRSize = 0;

    public DataCollect() {
    }

    private int a(int size) {
        if (size == 0) {
            return 0;
        }
        if (size <= 6000) {
            return 1;
        }
        if (size <= 12000) {
            return 2;
        }
        return size <= 18000 ? 3 : 4;
    }

    public void clear() {
        this.mInited = false;
        this.mPgs = 0;
        this.mAfPpgCount = 0;
        this.mEcgCount = 0;
        this.mRRSize = 0;
        this.mActySize = 0;
        this.mRecvRRSize = 0;
        this.mRecvAfPPGCount = 0;
        this.mRecvECGCount = 0;
        this.mRecvActySize = 0;
    }

    public int getActyPercent() {
        return this.mRecvActySize;
    }

    public int getActyTotal() {
        return this.mActySize;
    }

    public int getProgress() {
        int iA = this.mEcgCount + this.mAfPpgCount + a(this.mActySize) + a(this.mRRSize);
        if (iA <= 0) {
            return 0;
        }
        return ((((this.mRecvECGCount + this.mRecvAfPPGCount) + a(this.mRecvActySize)) + a(this.mRecvRRSize)) * 100) / iA;
    }

    public int getRRPercent() {
        return this.mRecvRRSize;
    }

    public int getRRTotal() {
        return this.mRRSize;
    }

    public int getTotalSize() {
        int i = this.mActySize;
        int i2 = i > 0 ? 0 + (i * 4) : 0;
        int i3 = this.mRRSize;
        if (i3 > 0) {
            i2 += i3;
        }
        int i4 = this.mEcgCount;
        if (i4 > 0) {
            i2 = i2 + (i4 * 60 * 250) + (i4 * 60 * 100);
        }
        int i5 = this.mAfPpgCount;
        return i5 > 0 ? i2 + (i5 * 7600) : i2;
    }

    public boolean isValid() {
        return this.mInited;
    }

    public void setData(byte[] data) {
        if (data == null) {
            return;
        }
        Byte[] bArr = new Byte[data.length];
        for (int i = 0; i < data.length; i++) {
            bArr[i] = Byte.valueOf(data[i]);
        }
        setValue(bArr);
    }

    public void setValue(Byte[] data) {
        if (data == null) {
            return;
        }
        int iByteValue = (data[0].byteValue() & 255) | ((data[1].byteValue() & 255) << 8) | ((data[2].byteValue() & 255) << 16) | ((data[3].byteValue() & 255) << 24);
        int iByteValue2 = (data[4].byteValue() & 255) | ((data[5].byteValue() & 255) << 8) | ((data[6].byteValue() & 255) << 16) | ((data[7].byteValue() & 255) << 24);
        int iByteValue3 = data[8].byteValue() & 255;
        int iByteValue4 = data[9].byteValue() & 255;
        Debug.i(a, "actySize:" + iByteValue + ",rr:" + iByteValue2 + ",ecgCount:" + iByteValue3 + ",afPpgCount:" + iByteValue4);
        this.mInited = true;
        this.mActySize = iByteValue;
        this.mRRSize = iByteValue2;
        this.mEcgCount = iByteValue3;
        this.mAfPpgCount = iByteValue4;
    }

    public DataCollect(byte[] data) {
        setData(data);
    }
}
