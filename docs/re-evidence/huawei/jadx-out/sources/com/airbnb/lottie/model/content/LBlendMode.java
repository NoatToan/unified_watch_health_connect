package com.airbnb.lottie.model.content;

import androidx.core.graphics.BlendModeCompat;

/* JADX INFO: loaded from: classes21.dex */
public enum LBlendMode {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.content.LBlendMode$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f1932c;

        static {
            int[] iArr = new int[LBlendMode.values().length];
            f1932c = iArr;
            try {
                iArr[LBlendMode.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1932c[LBlendMode.SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1932c[LBlendMode.OVERLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1932c[LBlendMode.DARKEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1932c[LBlendMode.LIGHTEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1932c[LBlendMode.ADD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1932c[LBlendMode.MULTIPLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1932c[LBlendMode.COLOR_DODGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1932c[LBlendMode.COLOR_BURN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1932c[LBlendMode.HARD_LIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1932c[LBlendMode.SOFT_LIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1932c[LBlendMode.DIFFERENCE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1932c[LBlendMode.EXCLUSION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1932c[LBlendMode.HUE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1932c[LBlendMode.SATURATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f1932c[LBlendMode.COLOR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f1932c[LBlendMode.LUMINOSITY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f1932c[LBlendMode.HARD_MIX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public BlendModeCompat toNativeBlendMode() {
        int i = AnonymousClass3.f1932c[ordinal()];
        if (i == 2) {
            return BlendModeCompat.SCREEN;
        }
        if (i == 3) {
            return BlendModeCompat.OVERLAY;
        }
        if (i == 4) {
            return BlendModeCompat.DARKEN;
        }
        if (i == 5) {
            return BlendModeCompat.LIGHTEN;
        }
        if (i != 6) {
            return null;
        }
        return BlendModeCompat.PLUS;
    }
}
