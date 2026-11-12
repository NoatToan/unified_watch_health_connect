package com.fitness.banner.export.newbieguide.model;

import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public interface HighLight {

    public enum Shape {
        CIRCLE,
        RECTANGLE,
        OVAL,
        ROUND_RECTANGLE
    }

    Shape a();

    RectF b(View view);

    int c();

    float d();

    b i();
}
