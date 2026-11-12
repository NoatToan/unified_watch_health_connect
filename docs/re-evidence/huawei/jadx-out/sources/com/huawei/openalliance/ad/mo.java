package com.huawei.openalliance.ad;

import com.iab.omid.library.huawei.adsession.CreativeType;

/* JADX INFO: loaded from: classes12.dex */
public enum mo {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");

    private static boolean f;
    private final String g;

    @Override // java.lang.Enum
    public String toString() {
        return this.g;
    }

    public static boolean a() {
        return f;
    }

    public static CreativeType a(mo moVar) {
        if (!f) {
            return null;
        }
        int i = AnonymousClass1.f19632a[moVar.ordinal()];
        if (i == 1) {
            return CreativeType.DEFINED_BY_JAVASCRIPT;
        }
        if (i == 2) {
            return CreativeType.HTML_DISPLAY;
        }
        if (i == 3) {
            return CreativeType.NATIVE_DISPLAY;
        }
        if (i == 4) {
            return CreativeType.VIDEO;
        }
        if (i != 5) {
            return null;
        }
        return CreativeType.AUDIO;
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.mo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19632a;

        static {
            int[] iArr = new int[mo.values().length];
            f19632a = iArr;
            try {
                iArr[mo.DEFINED_BY_JAVASCRIPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19632a[mo.HTML_DISPLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19632a[mo.NATIVE_DISPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19632a[mo.VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19632a[mo.AUDIO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    mo(String str) {
        this.g = str;
    }

    static {
        f = false;
        f = mi.a("com.iab.omid.library.huawei.adsession.CreativeType");
    }
}
