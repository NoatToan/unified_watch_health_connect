package com.huami.widget.share;

import androidx.annotation.DrawableRes;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionItem {
    private FunctionType a;

    @DrawableRes
    public int icon;
    public String title;

    public FunctionItem(String str, int i) {
        this.title = str;
        this.icon = i;
    }

    public FunctionType getFunctionType() {
        return this.a;
    }

    public void setType(FunctionType functionType) {
        this.a = functionType;
    }
}
