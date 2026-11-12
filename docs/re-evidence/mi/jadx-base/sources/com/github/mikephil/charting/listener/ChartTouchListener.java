package com.github.mikephil.charting.listener;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.github.mikephil.charting.charts.Chart;
import defpackage.r7c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ChartTouchListener<T extends Chart<?>> extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ChartGesture f7802a = ChartGesture.NONE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7803b = 0;
    public r7c c;
    public GestureDetector d;
    public T e;

    public enum ChartGesture {
        NONE,
        DRAG,
        X_ZOOM,
        Y_ZOOM,
        PINCH_ZOOM,
        ROTATE,
        SINGLE_TAP,
        DOUBLE_TAP,
        LONG_PRESS,
        FLING
    }

    public ChartTouchListener(T t) {
        this.e = t;
        this.d = new GestureDetector(t.getContext(), this);
    }

    public static float a(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    public void b(MotionEvent motionEvent) {
        this.e.getOnChartGestureListener();
    }

    public void c(r7c r7cVar, MotionEvent motionEvent) {
        if (r7cVar == null || r7cVar.a(this.c)) {
            this.e.highlightValue(null, true);
            this.c = null;
        } else {
            this.e.highlightValue(r7cVar, true);
            this.c = r7cVar;
        }
    }

    public void d(r7c r7cVar) {
        this.c = r7cVar;
    }

    public void e(MotionEvent motionEvent) {
        this.e.getOnChartGestureListener();
    }
}
