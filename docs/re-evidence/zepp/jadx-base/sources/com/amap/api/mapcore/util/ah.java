package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ah extends ai {
    public float a;
    public float b;
    public float c;
    public float d;
    private final float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;

    public ah(Context context) {
        super(context);
        this.s = 0.0f;
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = 0.0f;
        this.n = ViewConfiguration.get(context).getScaledEdgeSlop();
    }

    @Override // com.amap.api.mapcore.util.ai
    public void a(MotionEvent motionEvent) {
        super.a(motionEvent);
        MotionEvent motionEvent2 = this.g;
        int pointerCount = motionEvent2.getPointerCount();
        int pointerCount2 = motionEvent.getPointerCount();
        if (pointerCount2 == 2 && pointerCount2 == pointerCount) {
            this.q = -1.0f;
            this.r = -1.0f;
            float x = motionEvent2.getX(0);
            float y = motionEvent2.getY(0);
            float x2 = motionEvent2.getX(1);
            float y2 = motionEvent2.getY(1);
            this.a = x2 - x;
            this.b = y2 - y;
            float x3 = motionEvent.getX(0);
            float y3 = motionEvent.getY(0);
            float x4 = motionEvent.getX(1);
            float y4 = motionEvent.getY(1);
            this.c = x4 - x3;
            this.d = y4 - y3;
            this.s = x3 - x;
            this.t = y3 - y;
            this.u = x4 - x2;
            this.v = y4 - y2;
        }
    }

    public final PointF a(int i) {
        if (i == 0) {
            return new PointF(this.s, this.t);
        }
        return new PointF(this.u, this.v);
    }

    public final boolean a(MotionEvent motionEvent, int i, int i2) {
        int i3;
        int i4 = this.l;
        if (i4 != 0 && (i3 = this.m) != 0) {
            float f = this.n;
            this.o = i4 - f;
            this.p = i3 - f;
        } else {
            DisplayMetrics displayMetrics = this.e.getResources().getDisplayMetrics();
            float f2 = displayMetrics.widthPixels;
            float f3 = this.n;
            this.o = f2 - f3;
            this.p = displayMetrics.heightPixels - f3;
        }
        float f4 = this.n;
        float f5 = this.o;
        float f6 = this.p;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float x = 1 < motionEvent.getPointerCount() ? motionEvent.getX(1) + ((i + motionEvent.getX()) - motionEvent.getRawX()) : 0.0f;
        float y = 1 < motionEvent.getPointerCount() ? motionEvent.getY(1) + ((i2 + motionEvent.getY()) - motionEvent.getRawY()) : 0.0f;
        boolean z = rawX < f4 || rawY < f4 || rawX > f5 || rawY > f6;
        boolean z2 = x < f4 || y < f4 || x > f5 || y > f6;
        return (z && z2) || z || z2;
    }
}
