package com.huawei.hms.scankit.p;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes34.dex */
public abstract class n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SecureRandom f16230a = new SecureRandom();

    public static int a(int i) {
        return f16230a.nextInt(i);
    }

    public static float a(float f) {
        return f16230a.nextFloat() * f;
    }
}
