package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes12.dex */
public class mj {
    public static int a(float f, float f2) {
        if (f2 >= 75.0f && f < 75.0f) {
            return 75;
        }
        if (f2 < 50.0f || f >= 50.0f) {
            return (f2 < 25.0f || f >= 25.0f) ? 0 : 25;
        }
        return 50;
    }
}
