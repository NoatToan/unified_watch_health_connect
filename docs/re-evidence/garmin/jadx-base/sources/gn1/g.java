package gn1;

import km1.r;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f78087a;

    static {
        int[] iArr = new int[r.values().length];
        try {
            iArr[r.ALIGNED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r.AHEAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r.BEHIND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r.NOT_ALIGNED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[r.IRREGULAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[r.ONBOARDING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[r.NOT_ENOUGH_DATA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[r.NO_SLEEP_DATA.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[r.JET_LAG_AUTODETECTED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[r.JET_LAG.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[r.JET_LAG_FOLLOWING_GUIDANCE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f78087a = iArr;
    }
}
