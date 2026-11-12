package com.huami.widget.hrsection;

import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes17.dex */
public class HeartRateSectionItem {

    @ColorInt
    public int color;
    public String name;
    public String time;

    public static HeartRateSectionItem create(@ColorInt int i, String str, String str2) {
        HeartRateSectionItem heartRateSectionItem = new HeartRateSectionItem();
        heartRateSectionItem.color = i;
        heartRateSectionItem.name = str;
        heartRateSectionItem.time = str2;
        return heartRateSectionItem;
    }
}
