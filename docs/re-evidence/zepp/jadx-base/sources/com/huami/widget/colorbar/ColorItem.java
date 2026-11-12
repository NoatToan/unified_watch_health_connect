package com.huami.widget.colorbar;

/* JADX INFO: loaded from: classes17.dex */
public class ColorItem {
    public int color;
    public float weight;

    public static ColorItem create(int i, float f) {
        ColorItem colorItem = new ColorItem();
        colorItem.color = i;
        colorItem.weight = f;
        return colorItem;
    }
}
