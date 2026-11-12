package com.airbnb.lottie.model.content;

import android.os.Build;
import c7.b;

/* JADX INFO: loaded from: classes7.dex */
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

    public b toNativeBlendMode() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return Build.VERSION.SDK_INT >= 29 ? b.MULTIPLY : b.MODULATE;
        }
        if (iOrdinal == 2) {
            return b.SCREEN;
        }
        if (iOrdinal == 3) {
            return b.OVERLAY;
        }
        if (iOrdinal == 4) {
            return b.DARKEN;
        }
        if (iOrdinal == 5) {
            return b.LIGHTEN;
        }
        if (iOrdinal != 16) {
            return null;
        }
        return b.PLUS;
    }
}
