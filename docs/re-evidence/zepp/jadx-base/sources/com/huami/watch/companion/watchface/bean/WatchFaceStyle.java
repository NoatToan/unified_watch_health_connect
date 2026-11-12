package com.huami.watch.companion.watchface.bean;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceStyle {
    private int iconRes;
    private String name;
    private int style;

    public int getIconRes() {
        return this.iconRes;
    }

    public String getName() {
        return this.name;
    }

    public int getStyle() {
        return this.style;
    }

    public void setIconRes(int i) {
        this.iconRes = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    public String toString() {
        return "<Style: " + this.style + ", IconRes: " + this.iconRes + ", Name: '" + this.name + '\'' + Typography.greater;
    }
}
