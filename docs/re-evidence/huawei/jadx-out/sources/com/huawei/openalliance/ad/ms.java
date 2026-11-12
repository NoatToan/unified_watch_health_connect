package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.constant.Constants;
import com.iab.omid.library.huawei.adsession.Owner;

/* JADX INFO: loaded from: classes12.dex */
public enum ms {
    NATIVE(Constants.NATIVE_CACHE),
    JAVASCRIPT("javascript"),
    NONE("none");

    private static boolean d;
    private final String e;

    @Override // java.lang.Enum
    public String toString() {
        return this.e;
    }

    public static boolean a() {
        return d;
    }

    public static Owner a(ms msVar) {
        if (!d) {
            return null;
        }
        int i = AnonymousClass1.f19644a[msVar.ordinal()];
        if (i == 1) {
            return Owner.NATIVE;
        }
        if (i == 2) {
            return Owner.JAVASCRIPT;
        }
        if (i != 3) {
            return null;
        }
        return Owner.NONE;
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.ms$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19644a;

        static {
            int[] iArr = new int[ms.values().length];
            f19644a = iArr;
            try {
                iArr[ms.NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19644a[ms.JAVASCRIPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19644a[ms.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    ms(String str) {
        this.e = str;
    }

    static {
        d = false;
        d = mi.a("com.iab.omid.library.huawei.adsession.Owner");
    }
}
