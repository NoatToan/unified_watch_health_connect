package com.huawei.uikit.hwunifiedinteract.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes20.dex */
public class HwGenericEventDetector {
    private int h;
    private float i;
    private float j;
    private View o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnChangePageListener f29794a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnChangeProgressListener f29796c = null;
    private OnScrollListener d = null;
    private float e = -1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f29795b = -1.0f;
    private float f = 0.0f;
    private float g = 0.0f;
    private float n = 1.0f;

    public interface OnChangePageListener {
        boolean onChangePage(float f, MotionEvent motionEvent);
    }

    public interface OnChangeProgressListener {
        boolean onChangeProgress(int i, int i2, MotionEvent motionEvent);
    }

    /* JADX INFO: loaded from: classes44.dex */
    public interface OnChangeProgressListener2 extends OnChangeProgressListener {
        boolean onBegin();

        boolean onEnd(float f);
    }

    public interface OnScrollListener {
        boolean onScrollBy(float f, float f2, MotionEvent motionEvent);
    }

    /* JADX INFO: loaded from: classes44.dex */
    public interface OnScrollListener2 extends OnScrollListener {
        boolean onBegin();

        boolean onEnd(float f);
    }

    public HwGenericEventDetector(Context context) {
        this.i = 0.0f;
        this.j = 0.0f;
        this.h = 0;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.i = viewConfiguration.getScaledHorizontalScrollFactor();
        this.j = viewConfiguration.getScaledVerticalScrollFactor();
        this.h = viewConfiguration.getScaledTouchSlop();
    }

    private boolean e(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float f = this.e;
        float f2 = this.f;
        if (f - f2 > x || x > f + f2) {
            return true;
        }
        float f3 = this.f29795b;
        return f3 - f2 > y || y > f3 + f2;
    }

    public float a() {
        return this.i * this.n;
    }

    public void a(HwRotaryConverter hwRotaryConverter) {
        Log.d("HwGenericEventDetector", "Implement setRotaryConverter in the watch package.");
    }

    public boolean a(MotionEvent motionEvent) {
        if (this.d == null) {
            return false;
        }
        if (Float.compare(this.e, -1.0f) == 0 && Float.compare(this.f29795b, -1.0f) == 0) {
            return false;
        }
        if (!e(motionEvent)) {
            return c(motionEvent);
        }
        this.e = -1.0f;
        this.f29795b = -1.0f;
        return false;
    }

    public float c() {
        return this.j * this.n;
    }

    public void c(View view, OnScrollListener onScrollListener) {
        this.d = onScrollListener;
        this.o = view;
    }

    public void c(OnChangeProgressListener onChangeProgressListener) {
        this.f29796c = onChangeProgressListener;
    }

    public boolean c(MotionEvent motionEvent) {
        if (motionEvent.isFromSource(2) && motionEvent.getAction() == 8) {
            float axisValue = motionEvent.getAxisValue(10);
            float axisValue2 = motionEvent.getAxisValue(9);
            if (Float.compare(axisValue, 0.0f) == 0 && Float.compare(axisValue2, 0.0f) == 0) {
                return false;
            }
            float f = Float.compare(axisValue, 0.0f) == 0 ? -axisValue2 : axisValue;
            OnChangePageListener onChangePageListener = this.f29794a;
            if (onChangePageListener != null && onChangePageListener.onChangePage(f, motionEvent)) {
                return true;
            }
            OnChangeProgressListener onChangeProgressListener = this.f29796c;
            if (onChangeProgressListener != null && onChangeProgressListener.onChangeProgress((int) (-axisValue), (int) axisValue2, motionEvent)) {
                return true;
            }
            if (this.d != null) {
                if (this.d.onScrollBy(Math.round(axisValue * a()), Math.round((-axisValue2) * c()), motionEvent)) {
                    if (this.e < 0.0f || this.f29795b < 0.0f) {
                        this.e = motionEvent.getX();
                        this.f29795b = motionEvent.getY();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public float d() {
        return 0.0f;
    }

    public void d(float f) {
        this.n = f;
    }

    public void d(int i) {
        if (i == 0) {
            this.n = 1.0f;
        } else if (i == 2) {
            this.n = 0.6f;
        } else {
            this.n = 1.0f;
        }
    }

    public void d(OnChangePageListener onChangePageListener) {
        this.f29794a = onChangePageListener;
    }

    public float e() {
        return this.n;
    }
}
