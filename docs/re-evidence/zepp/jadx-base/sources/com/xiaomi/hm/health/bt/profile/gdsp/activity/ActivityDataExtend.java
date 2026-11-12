package com.xiaomi.hm.health.bt.profile.gdsp.activity;

/* JADX INFO: loaded from: classes14.dex */
public class ActivityDataExtend extends ActivityHrData {
    private byte[] b;
    private int c;
    private int d;
    private int e;
    private int f;

    public ActivityDataExtend(byte[] data) {
        super(data[1], data[2], data[0], data[3]);
        this.b = data;
        a();
    }

    private void a() {
        byte[] bArr = this.b;
        if (bArr.length < 8) {
            return;
        }
        this.c = bArr[4] & 255;
        this.d = bArr[5] & 255;
        this.e = bArr[6] & 255;
        this.f = bArr[7] & 255;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityHrData, com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData
    public byte[] getBytes() {
        return this.b;
    }

    public int getRetain() {
        return this.c;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityHrData, com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData
    public int getSize() {
        byte[] bArr = this.b;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    public int getSleepProbabilityAndPosture() {
        return this.d;
    }

    public int getSleepProbabilityDeep() {
        return this.e;
    }

    public int getSleepProbabilityRem() {
        return this.f;
    }
}
