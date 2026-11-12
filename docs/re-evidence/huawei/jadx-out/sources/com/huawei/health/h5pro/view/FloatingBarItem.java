package com.huawei.health.h5pro.view;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes28.dex */
public class FloatingBarItem {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View.OnClickListener f7010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f7011c;
    private String d;

    public FloatingBarItem(String str, Drawable drawable, View.OnClickListener onClickListener) {
        this.d = str;
        this.f7011c = drawable;
        this.f7010b = onClickListener;
    }

    public View.OnClickListener getClickCallback() {
        return this.f7010b;
    }

    public Drawable getDistIcon() {
        return this.f7011c;
    }

    public String getDistName() {
        return this.d;
    }

    public void setClickCallback(View.OnClickListener onClickListener) {
        this.f7010b = onClickListener;
    }

    public void setDistIcon(Drawable drawable) {
        this.f7011c = drawable;
    }

    public void setDistName(String str) {
        this.d = str;
    }
}
