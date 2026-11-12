package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseEntry {
    private Object mData;
    private Drawable mIcon;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f52817y;

    public BaseEntry() {
        this.f52817y = 0.0f;
        this.mData = null;
        this.mIcon = null;
    }

    public Object getData() {
        return this.mData;
    }

    public Drawable getIcon() {
        return this.mIcon;
    }

    public float getY() {
        return this.f52817y;
    }

    public void setData(Object obj) {
        this.mData = obj;
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
    }

    public void setY(float f14) {
        this.f52817y = f14;
    }

    public BaseEntry(float f14) {
        this.mData = null;
        this.mIcon = null;
        this.f52817y = f14;
    }

    public BaseEntry(float f14, Object obj) {
        this(f14);
        this.mData = obj;
    }

    public BaseEntry(float f14, Drawable drawable) {
        this(f14);
        this.mIcon = drawable;
    }

    public BaseEntry(float f14, Drawable drawable, Object obj) {
        this(f14);
        this.mIcon = drawable;
        this.mData = obj;
    }
}
