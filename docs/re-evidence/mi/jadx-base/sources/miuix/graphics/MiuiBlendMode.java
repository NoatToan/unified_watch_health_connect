package miuix.graphics;

import android.graphics.PorterDuff;

/* JADX INFO: loaded from: classes3.dex */
public enum MiuiBlendMode {
    CLEAR(0),
    SRC(1),
    DST(2),
    SRC_OVER(3),
    DST_OVER(4),
    SRC_IN(5),
    DST_IN(6),
    SRC_OUT(7),
    DST_OUT(8),
    SRC_ATOP(9),
    DST_ATOP(10),
    XOR(11),
    PLUS(12),
    MODULATE(13),
    SCREEN(14),
    OVERLAY(15),
    DARKEN(16),
    LIGHTEN(17),
    COLOR_DODGE(18),
    COLOR_BURN(19),
    HARD_LIGHT(20),
    SOFT_LIGHT(21),
    DIFFERENCE(22),
    EXCLUSION(23),
    MULTIPLY(24),
    HUE(25),
    SATURATION(26),
    COLOR(27),
    LUMINOSITY(28),
    LAST_COEFF(29),
    LAST_SEPARABLE(30),
    LAST(31),
    LINEAR_LIGHT(100),
    LINEAR_LIGHT_WITH_GREYSCALE(101),
    MI_DIFFERENCE(102),
    LAB_LIGHTEN_WITH_GREYSCALE(103),
    LAB_DARKEN_WITH_GREYSCALE(105),
    LAB(106),
    LINEAR_LIGHT_LAB(107),
    COLOR_DODGE_V2(118),
    COLOR_BURN_V2(119);

    private static final MiuiBlendMode[] BLEND_MODES = values();
    private final int mPorterDuffMode;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26632a;

        static {
            int[] iArr = new int[MiuiBlendMode.values().length];
            f26632a = iArr;
            try {
                iArr[MiuiBlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26632a[MiuiBlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26632a[MiuiBlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26632a[MiuiBlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26632a[MiuiBlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26632a[MiuiBlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26632a[MiuiBlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26632a[MiuiBlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26632a[MiuiBlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26632a[MiuiBlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26632a[MiuiBlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26632a[MiuiBlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26632a[MiuiBlendMode.DARKEN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f26632a[MiuiBlendMode.LIGHTEN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f26632a[MiuiBlendMode.MODULATE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f26632a[MiuiBlendMode.SCREEN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f26632a[MiuiBlendMode.PLUS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f26632a[MiuiBlendMode.OVERLAY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    MiuiBlendMode(int i) {
        this.mPorterDuffMode = i;
    }

    public static PorterDuff.Mode blendModeToPorterDuffMode(MiuiBlendMode miuiBlendMode) {
        if (miuiBlendMode == null) {
            return null;
        }
        switch (a.f26632a[miuiBlendMode.ordinal()]) {
            case 1:
                return PorterDuff.Mode.CLEAR;
            case 2:
                return PorterDuff.Mode.SRC;
            case 3:
                return PorterDuff.Mode.DST;
            case 4:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.DST_OVER;
            case 6:
                return PorterDuff.Mode.SRC_IN;
            case 7:
                return PorterDuff.Mode.DST_IN;
            case 8:
                return PorterDuff.Mode.SRC_OUT;
            case 9:
                return PorterDuff.Mode.DST_OUT;
            case 10:
                return PorterDuff.Mode.SRC_ATOP;
            case 11:
                return PorterDuff.Mode.DST_ATOP;
            case 12:
                return PorterDuff.Mode.XOR;
            case 13:
                return PorterDuff.Mode.DARKEN;
            case 14:
                return PorterDuff.Mode.LIGHTEN;
            case 15:
                return PorterDuff.Mode.MULTIPLY;
            case 16:
                return PorterDuff.Mode.SCREEN;
            case 17:
                return PorterDuff.Mode.ADD;
            case 18:
                return PorterDuff.Mode.OVERLAY;
            default:
                return null;
        }
    }

    public static MiuiBlendMode fromValue(int i) {
        for (MiuiBlendMode miuiBlendMode : BLEND_MODES) {
            if (miuiBlendMode.mPorterDuffMode == i) {
                return miuiBlendMode;
            }
        }
        return null;
    }

    public static int toValue(MiuiBlendMode miuiBlendMode) {
        return miuiBlendMode.mPorterDuffMode;
    }
}
