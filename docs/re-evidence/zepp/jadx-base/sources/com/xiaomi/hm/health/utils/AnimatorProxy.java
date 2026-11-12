package com.xiaomi.hm.health.utils;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes22.dex */
public final class AnimatorProxy extends Animation {
    public static final boolean NEEDS_PROXY;
    private static final WeakHashMap<View, AnimatorProxy> q;
    private final WeakReference<View> a;
    private boolean c;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float l;
    private float m;
    private final Camera b = new Camera();
    private float d = 1.0f;
    private float j = 1.0f;
    private float k = 1.0f;
    private final RectF n = new RectF();
    private final RectF o = new RectF();
    private final Matrix p = new Matrix();

    static {
        NEEDS_PROXY = Integer.valueOf(Build.VERSION.SDK).intValue() < 11;
        q = new WeakHashMap<>();
    }

    private AnimatorProxy(View view) {
        setDuration(0L);
        setFillAfter(true);
        view.setAnimation(this);
        this.a = new WeakReference<>(view);
    }

    private void a(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        Matrix matrix = this.p;
        matrix.reset();
        d(matrix, view);
        this.p.mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        float f = rectF.right;
        float f2 = rectF.left;
        if (f < f2) {
            rectF.right = f2;
            rectF.left = f;
        }
        float f3 = rectF.bottom;
        float f4 = rectF.top;
        if (f3 < f4) {
            rectF.top = f3;
            rectF.bottom = f4;
        }
    }

    private void b() {
        View view = this.a.get();
        if (view == null || view.getParent() == null) {
            return;
        }
        RectF rectF = this.o;
        a(rectF, view);
        rectF.union(this.n);
        ((View) view.getParent()).invalidate((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void c() {
        View view = this.a.get();
        if (view != null) {
            a(this.n, view);
        }
    }

    private void d(Matrix matrix, View view) {
        float width = view.getWidth();
        float height = view.getHeight();
        boolean z = this.c;
        float f = z ? this.e : width / 2.0f;
        float f2 = z ? this.f : height / 2.0f;
        float f3 = this.g;
        float f4 = this.h;
        float f5 = this.i;
        if (f3 != 0.0f || f4 != 0.0f || f5 != 0.0f) {
            Camera camera = this.b;
            camera.save();
            camera.rotateX(f3);
            camera.rotateY(f4);
            camera.rotateZ(-f5);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f, -f2);
            matrix.postTranslate(f, f2);
        }
        float f6 = this.j;
        float f7 = this.k;
        if (f6 != 1.0f || f7 != 1.0f) {
            matrix.postScale(f6, f7);
            matrix.postTranslate((-(f / width)) * ((f6 * width) - width), (-(f2 / height)) * ((f7 * height) - height));
        }
        matrix.postTranslate(this.l, this.m);
    }

    public static AnimatorProxy wrap(View view) {
        WeakHashMap<View, AnimatorProxy> weakHashMap = q;
        AnimatorProxy animatorProxy = weakHashMap.get(view);
        if (animatorProxy != null && animatorProxy == view.getAnimation()) {
            return animatorProxy;
        }
        AnimatorProxy animatorProxy2 = new AnimatorProxy(view);
        weakHashMap.put(view, animatorProxy2);
        return animatorProxy2;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        View view = this.a.get();
        if (view != null) {
            transformation.setAlpha(this.d);
            d(transformation.getMatrix(), view);
        }
    }

    public float getAlpha() {
        return this.d;
    }

    public float getPivotX() {
        return this.e;
    }

    public float getPivotY() {
        return this.f;
    }

    public float getRotation() {
        return this.i;
    }

    public float getRotationX() {
        return this.g;
    }

    public float getRotationY() {
        return this.h;
    }

    public float getScaleX() {
        return this.j;
    }

    public float getScaleY() {
        return this.k;
    }

    public int getScrollX() {
        View view = this.a.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollX();
    }

    public int getScrollY() {
        View view = this.a.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollY();
    }

    public float getTranslationX() {
        return this.l;
    }

    public float getTranslationY() {
        return this.m;
    }

    public float getX() {
        View view = this.a.get();
        if (view == null) {
            return 0.0f;
        }
        return view.getLeft() + this.l;
    }

    public float getY() {
        View view = this.a.get();
        if (view == null) {
            return 0.0f;
        }
        return view.getTop() + this.m;
    }

    public void setAlpha(float f) {
        if (this.d != f) {
            this.d = f;
            View view = this.a.get();
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public void setPivotX(float f) {
        if (this.c && this.e == f) {
            return;
        }
        c();
        this.c = true;
        this.e = f;
        b();
    }

    public void setPivotY(float f) {
        if (this.c && this.f == f) {
            return;
        }
        c();
        this.c = true;
        this.f = f;
        b();
    }

    public void setRotation(float f) {
        if (this.i != f) {
            c();
            this.i = f;
            b();
        }
    }

    public void setRotationX(float f) {
        if (this.g != f) {
            c();
            this.g = f;
            b();
        }
    }

    public void setRotationY(float f) {
        if (this.h != f) {
            c();
            this.h = f;
            b();
        }
    }

    public void setScaleX(float f) {
        if (this.j != f) {
            c();
            this.j = f;
            b();
        }
    }

    public void setScaleY(float f) {
        if (this.k != f) {
            c();
            this.k = f;
            b();
        }
    }

    public void setScrollX(int i) {
        View view = this.a.get();
        if (view != null) {
            view.scrollTo(i, view.getScrollY());
        }
    }

    public void setScrollY(int i) {
        View view = this.a.get();
        if (view != null) {
            view.scrollTo(view.getScrollX(), i);
        }
    }

    public void setTranslationX(float f) {
        if (this.l != f) {
            c();
            this.l = f;
            b();
        }
    }

    public void setTranslationY(float f) {
        if (this.m != f) {
            c();
            this.m = f;
            b();
        }
    }

    public void setX(float f) {
        View view = this.a.get();
        if (view != null) {
            setTranslationX(f - view.getLeft());
        }
    }

    public void setY(float f) {
        View view = this.a.get();
        if (view != null) {
            setTranslationY(f - view.getTop());
        }
    }
}
