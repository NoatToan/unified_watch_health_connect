package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
public enum dm {
    STYLE_ELEMENT_LABELFILL_OLD("labels.text.fill", 0),
    STYLE_ELEMENT_LABELSTROKE_OLD("labels.text.stroke", 1),
    STYLE_ELEMENT_GEOMETRYSTROKE_OLD("geometry.stroke", 2),
    STYLE_ELEMENT_GEOMETRYFILL_OLD("geometry.fill", 3),
    STYLE_ELEMENT_LABELFILL("textFillColor", 0),
    STYLE_ELEMENT_LABELSTROKE("textStrokeColor", 1),
    STYLE_ELEMENT_GEOMETRYSTROKE("strokeColor", 2),
    STYLE_ELEMENT_GEOMETRYFILL("fillColor", 3),
    STYLE_ELEMENT_GEOMETRYFILL1("color", 3),
    STYLE_ELEMENT_GEOMETRYFILL2("textureName", 3),
    STYLE_ELEMENT_BACKGROUNDFILL(com.google.android.exoplayer2.text.ttml.b.H, 4),
    STYLE_ELEMENT_VISIBLE("visible", 5);

    private String m;
    private int n;

    dm(String str, int i) {
        this.m = str;
        this.n = i;
    }

    public static int a(String str) {
        for (dm dmVar : values()) {
            if (dmVar.m.equals(str)) {
                return dmVar.n;
            }
        }
        return -1;
    }
}
