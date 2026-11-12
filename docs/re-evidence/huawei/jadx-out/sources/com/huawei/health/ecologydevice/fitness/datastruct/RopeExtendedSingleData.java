package com.huawei.health.ecologydevice.fitness.datastruct;

import defpackage.ehn;

/* JADX INFO: loaded from: classes7.dex */
public class RopeExtendedSingleData extends BaseRopeData {
    private static final int HEART_RATE_PARA_LENGTH = 3;

    public byte[] getHeartRateByteArray() {
        if (this.mCode != 0) {
            return null;
        }
        byte[] bArr = new byte[3];
        ehn.a(bArr, this.mCommand, 0);
        ehn.a(bArr, this.mCode, 1);
        ehn.a(bArr, this.mPara[0], 2);
        return bArr;
    }
}
