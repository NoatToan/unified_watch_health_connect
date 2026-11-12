package com.huawei.openalliance.ad;

import com.iab.omid.library.huawei.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes12.dex */
public enum mp {
    VIDEO_CONTROLS,
    CLOSE_AD,
    NOT_VISIBLE,
    OTHER;

    private static boolean e;

    public static boolean a() {
        return e;
    }

    public static FriendlyObstructionPurpose a(mp mpVar) {
        if (!e) {
            return null;
        }
        int i = AnonymousClass1.f19636a[mpVar.ordinal()];
        if (i == 1) {
            return FriendlyObstructionPurpose.VIDEO_CONTROLS;
        }
        if (i == 2) {
            return FriendlyObstructionPurpose.CLOSE_AD;
        }
        if (i == 3) {
            return FriendlyObstructionPurpose.NOT_VISIBLE;
        }
        if (i != 4) {
            return null;
        }
        return FriendlyObstructionPurpose.OTHER;
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.mp$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19636a;

        static {
            int[] iArr = new int[mp.values().length];
            f19636a = iArr;
            try {
                iArr[mp.VIDEO_CONTROLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19636a[mp.CLOSE_AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19636a[mp.NOT_VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19636a[mp.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        e = false;
        e = mi.a("com.iab.omid.library.huawei.adsession.FriendlyObstructionPurpose");
    }
}
