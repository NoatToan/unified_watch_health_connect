package com.xiaomi.push.service;

import com.xiaomi.push.dc;
import com.xiaomi.push.dd;

/* JADX INFO: loaded from: classes22.dex */
/* synthetic */ class z {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[dd.values().length];
        b = iArr;
        try {
            iArr[dd.INT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[dd.LONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[dd.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[dd.BOOLEAN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[dc.values().length];
        a = iArr2;
        try {
            iArr2[dc.MISC_CONFIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[dc.PLUGIN_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
