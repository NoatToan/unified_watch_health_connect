package com.xiaomi.mipush.sdk;

/* JADX INFO: loaded from: classes22.dex */
/* synthetic */ class v {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[c.values().length];
        a = iArr;
        try {
            iArr[c.ASSEMBLE_PUSH_HUAWEI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[c.ASSEMBLE_PUSH_FCM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[c.ASSEMBLE_PUSH_COS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[c.ASSEMBLE_PUSH_FTOS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
