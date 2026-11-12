package com.google.android.material.color;

import com.google.android.material.R;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class HarmonizedColorAttributes {
    private static final int[] HARMONIZED_MATERIAL_ATTRIBUTES = {R.attr.colorError, R.attr.colorOnError, R.attr.colorErrorContainer, R.attr.colorOnErrorContainer};
    private final int[] attributes;
    private final int themeOverlay;

    private HarmonizedColorAttributes(int[] iArr, int i14) {
        if (i14 != 0 && iArr.length == 0) {
            h.s("Theme overlay should be used with the accompanying int[] attributes.");
            throw null;
        }
        this.attributes = iArr;
        this.themeOverlay = i14;
    }

    public static HarmonizedColorAttributes create(int[] iArr) {
        return new HarmonizedColorAttributes(iArr, 0);
    }

    public static HarmonizedColorAttributes createMaterialDefaults() {
        return create(HARMONIZED_MATERIAL_ATTRIBUTES, R.style.ThemeOverlay_Material3_HarmonizedColors);
    }

    public int[] getAttributes() {
        return this.attributes;
    }

    public int getThemeOverlay() {
        return this.themeOverlay;
    }

    public static HarmonizedColorAttributes create(int[] iArr, int i14) {
        return new HarmonizedColorAttributes(iArr, i14);
    }
}
