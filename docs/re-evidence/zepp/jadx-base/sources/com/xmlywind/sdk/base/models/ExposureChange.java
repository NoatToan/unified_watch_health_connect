package com.xmlywind.sdk.base.models;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ExposureChange {
    public float a;
    public Rect b;
    public List c;

    public ExposureChange(float f, Rect rect, List list) {
        this.a = f;
        this.b = rect;
        this.c = list;
    }

    public String toString() {
        return "\"exposureChange\"={\"exposedPercentage\"=" + this.a + ", \"visibleRectangle\"={\"x\"=" + this.b.left + ",\"y\"=" + this.b.top + ",\"width\"=" + this.b.width() + ",\"height\"=" + this.b.height() + "}, \"occlusionRectangles\"=[]}";
    }
}
