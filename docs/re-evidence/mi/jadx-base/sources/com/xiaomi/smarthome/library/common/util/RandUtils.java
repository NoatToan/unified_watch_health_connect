package com.xiaomi.smarthome.library.common.util;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public class RandUtils {
    private static Random mRandom = new Random(System.currentTimeMillis());

    public static double randFloat() {
        return mRandom.nextDouble();
    }
}
