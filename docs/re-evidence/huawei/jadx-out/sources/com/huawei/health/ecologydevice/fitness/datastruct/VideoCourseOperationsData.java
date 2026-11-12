package com.huawei.health.ecologydevice.fitness.datastruct;

import defpackage.egx;
import defpackage.ehn;

/* JADX INFO: loaded from: classes7.dex */
public class VideoCourseOperationsData extends BaseRopeData {
    public VideoCourseOperationsData() {
        super(29);
    }

    public int getProgress() {
        Object obj = this.mFitnessData.get(40062);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public void setProgress(int i) {
        this.mFitnessData.put(40062, Integer.valueOf(i));
    }

    @Override // com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData
    public BaseRopeData parseData() {
        if (this.mCode == 1) {
            setProgress(ehn.d(this.mData, 17, this.mOffset));
        }
        return this;
    }

    @Override // com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData
    public egx getTransmitCommand() {
        byte[] bArr;
        egx.c cVar = new egx.c();
        cVar.a(this.mCommand);
        cVar.d(this.mCode);
        if (this.mCode == 1) {
            bArr = new byte[1];
            ehn.a(bArr, this.mPara[0], 0);
        } else {
            bArr = new byte[0];
        }
        cVar.e(bArr);
        return cVar.c();
    }
}
