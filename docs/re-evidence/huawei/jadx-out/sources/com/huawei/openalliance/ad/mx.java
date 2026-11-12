package com.huawei.openalliance.ad;

import com.iab.omid.library.huawei.adsession.media.Position;

/* JADX INFO: loaded from: classes12.dex */
public enum mx {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");

    private static boolean e;
    private final String f;

    @Override // java.lang.Enum
    public String toString() {
        return this.f;
    }

    public static Position a(mx mxVar) {
        if (!e) {
            return null;
        }
        int i = AnonymousClass1.f19654a[mxVar.ordinal()];
        if (i == 1 || i == 2) {
            return Position.PREROLL;
        }
        if (i == 3) {
            return Position.POSTROLL;
        }
        if (i != 4) {
            return null;
        }
        return Position.STANDALONE;
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.mx$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19654a;

        static {
            int[] iArr = new int[mx.values().length];
            f19654a = iArr;
            try {
                iArr[mx.PREROLL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19654a[mx.MIDROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19654a[mx.POSTROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19654a[mx.STANDALONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    mx(String str) {
        this.f = str;
    }

    static {
        e = false;
        e = mi.a("com.iab.omid.library.huawei.adsession.media.Position");
    }
}
