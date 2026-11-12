package com.huawei.hms.findnetwork.ultrasound.entity;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes33.dex */
public class UltrasoundMeasureParam {
    private long mBeginRecordTime;
    private byte[] mRecordByteArray;
    private long mUltrasoundTxTime = -1;
    private final AtomicBoolean mIsStopMeasuring = new AtomicBoolean(false);

    public String toString() {
        return "UltrasoundMeasureParam{mRecordByteArray=" + Arrays.toString(this.mRecordByteArray) + ", mBeginRecordTime=" + this.mBeginRecordTime + ", mIsStopMeasuring=" + this.mIsStopMeasuring + '}';
    }

    public void setUltrasoundTxTime(long j) {
        this.mUltrasoundTxTime = j;
    }

    public void setRecordByteArray(byte[] bArr) {
        if (bArr != null) {
            this.mRecordByteArray = (byte[]) bArr.clone();
        }
    }

    public void setBeginRecordTime(long j) {
        this.mBeginRecordTime = j;
    }

    public long getUltrasoundTxTime() {
        return this.mUltrasoundTxTime;
    }

    public byte[] getRecordByteArray() {
        byte[] bArr = this.mRecordByteArray;
        return bArr == null ? new byte[0] : (byte[]) bArr.clone();
    }

    public AtomicBoolean getIsStopMeasuring() {
        return this.mIsStopMeasuring;
    }

    public long getBeginRecordTime() {
        return this.mBeginRecordTime;
    }
}
