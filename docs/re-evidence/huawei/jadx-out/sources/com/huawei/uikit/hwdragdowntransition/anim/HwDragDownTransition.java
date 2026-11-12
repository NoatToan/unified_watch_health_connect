package com.huawei.uikit.hwdragdowntransition.anim;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes44.dex */
public class HwDragDownTransition {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f29461c = "HwDragDownTransition";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29462a;
    private float aa;
    private float ab;
    private float ac;
    private float ad;
    private float ae;
    private float af;
    private float ag;
    private float ah;
    private float ai;
    private boolean aj;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29463b;
    private Matrix d;
    private Rect e;
    private bqmxo f;
    private Animator g;
    private PropertyValuesHolder h;
    private Animator i;
    private TimeInterpolator j;
    private HwDragDownAnimationListener k;
    private float l;
    private View m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HwDragDownTransition.this.c(0.0f, 0.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    class bqmxo extends View {
        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (canvas != null) {
                canvas.drawColor(-16777216);
            }
        }
    }

    class d implements Animator.AnimatorListener {
        d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HwDragDownTransition.this.f.setVisibility(8);
            HwDragDownTransition.this.m.setVisibility(8);
            HwDragDownTransition.this.g();
            HwDragDownTransition.this.c(0.0f, 0.0f);
            if (HwDragDownTransition.this.k != null) {
                HwDragDownTransition.this.k.onAnimationEnd();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (HwDragDownTransition.this.k != null) {
                HwDragDownTransition.this.k.onAnimationStart();
            }
        }
    }

    private boolean e() {
        return (!this.f29463b || this.m == null || this.e == null) ? false : true;
    }

    private void f() {
        if (c()) {
            return;
        }
        if (this.g == null) {
            PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("Progress", 0.0f, 1.0f);
            this.h = propertyValuesHolderOfFloat;
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, propertyValuesHolderOfFloat);
            this.g = objectAnimatorOfPropertyValuesHolder;
            objectAnimatorOfPropertyValuesHolder.addListener(new d());
            this.g.setDuration(200L);
            this.g.setInterpolator(this.j);
        }
        this.g.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ViewParent parent = this.m.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(this.m);
            viewGroup.removeView(this.f);
        }
    }

    private void h() {
        if (this.m == null) {
            return;
        }
        if (this.r == 0.0f) {
            a();
        }
        float fAbs = this.ah == 0.0f ? 0.0f : Math.abs(this.t) / this.ah;
        float f = this.w;
        float f2 = f - ((fAbs * f) * 0.39999998f);
        float f3 = this.p;
        float f4 = f3 - ((fAbs * f3) * 0.39999998f);
        this.m.setScaleX(f2);
        this.m.setScaleY(f4);
        this.d.reset();
        this.d.preScale(this.w, this.p, this.ai, this.ae);
        this.d.postTranslate(this.x, this.v);
        this.d.postScale(f2 / this.w, f4 / this.p, this.n, this.o);
        this.d.postTranslate(this.q, this.t);
        float[] fArr = new float[9];
        this.d.getValues(fArr);
        float f5 = fArr[2];
        float f6 = fArr[5];
        float f7 = fArr[0];
        float f8 = fArr[4];
        this.m.setPivotX(0.0f);
        this.m.setPivotY(0.0f);
        this.m.setScaleX(f7);
        this.m.setScaleY(f8);
        this.m.setTranslationX(f5);
        this.m.setTranslationY(f6);
        float f9 = 1.0f - (fAbs * 0.39999998f);
        this.f.setAlpha(f9);
        HwDragDownAnimationListener hwDragDownAnimationListener = this.k;
        if (hwDragDownAnimationListener != null) {
            hwDragDownAnimationListener.onAlphaChanged(f9);
        }
        this.ad = f2;
        this.aa = f9;
        this.ac = f5;
        this.ab = f6;
    }

    private void i() {
        if ((Math.abs(this.q) > 8.0f || Math.abs(this.t) > 8.0f) && this.aj) {
            this.aj = false;
            float f = this.t;
            if (f <= 0.0f || Math.abs(f) <= Math.abs(this.q)) {
                return;
            }
            this.f29462a = true;
        }
    }

    private void j() {
        if (Math.abs(this.t) > this.af) {
            f();
        } else {
            o();
        }
    }

    private void o() {
        if (c()) {
            return;
        }
        if (this.i == null) {
            PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("ResetProgress", 0.0f, 1.0f);
            this.h = propertyValuesHolderOfFloat;
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, propertyValuesHolderOfFloat);
            this.i = objectAnimatorOfPropertyValuesHolder;
            objectAnimatorOfPropertyValuesHolder.addListener(new a());
            this.i.setDuration(200L);
            this.i.setInterpolator(this.j);
        }
        this.i.start();
    }

    public void b(Rect rect) {
        this.e = rect;
    }

    public void d() {
        ViewParent parent = this.m.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        this.f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int iIndexOfChild = viewGroup.indexOfChild(this.m);
        this.f.setAlpha(1.0f);
        viewGroup.addView(this.f, iIndexOfChild);
        this.f.setVisibility(0);
    }

    public void e(HwDragDownAnimationListener hwDragDownAnimationListener) {
        this.k = hwDragDownAnimationListener;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    public boolean e(MotionEvent motionEvent) {
        if (motionEvent == null) {
            Log.w(f29461c, "onTouchEvent: motionEvent is null!");
            return false;
        }
        if (!e()) {
            Log.w(f29461c, "onTouchEvent: Not a valid Transition setting, do not handle!");
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(rawX, rawY);
        int actionMasked = motionEventObtain.getActionMasked();
        if (actionMasked == 0) {
            c(rawX, rawY);
        } else if (actionMasked == 1) {
            if (motionEventObtain.getPointerId(motionEventObtain.getActionIndex()) == 0) {
                if (!this.f29462a) {
                    c(0.0f, 0.0f);
                    motionEventObtain.recycle();
                    return false;
                }
                j();
            }
        } else if (actionMasked != 2) {
            if (actionMasked == 6) {
                if (motionEventObtain.getPointerId(motionEventObtain.getActionIndex()) == 0) {
                    if (!this.f29462a) {
                        c(0.0f, 0.0f);
                        motionEventObtain.recycle();
                        return false;
                    }
                    j();
                }
            }
        } else if (motionEventObtain.getPointerId(motionEventObtain.getActionIndex()) == 0) {
            if (this.n == 0.0f && this.o == 0.0f) {
                c(rawX, rawY);
            }
            d(rawX, rawY);
            i();
            if (this.f29462a) {
                h();
            }
        }
        motionEventObtain.recycle();
        return true;
    }

    private boolean c() {
        Animator animator = this.g;
        if (animator != null && animator.isStarted()) {
            return true;
        }
        Animator animator2 = this.i;
        return animator2 != null && animator2.isStarted();
    }

    private void d(float f, float f2) {
        this.t = f2 - this.o;
        this.q = f - this.n;
        this.l = f;
        this.s = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(float f, float f2) {
        this.n = f;
        this.o = f2;
        this.l = f;
        this.s = f2;
        b();
        this.aj = true;
        this.f29462a = false;
    }

    private void a() {
        float width;
        float height;
        int[] iArr = new int[2];
        this.m.getLocationOnScreen(iArr);
        int iWidth = this.e.width();
        int iHeight = this.e.height();
        View view = this.m;
        if (view instanceof ImageView) {
            RectF rectF = new RectF();
            Drawable drawable = ((ImageView) this.m).getDrawable();
            Matrix imageMatrix = ((ImageView) this.m).getImageMatrix();
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            imageMatrix.mapRect(rectF);
            width = rectF.right - rectF.left;
            height = rectF.bottom - rectF.top;
        } else {
            width = view.getWidth();
            height = this.m.getHeight();
        }
        float fWidth = this.e.width() / width;
        float fHeight = this.e.height() / height;
        this.r = fWidth > fHeight ? fWidth : fHeight;
        if (fWidth < fHeight) {
            this.z = ((this.m.getWidth() * fHeight) - iWidth) * (-0.5f);
        } else {
            this.ag = ((this.m.getHeight() * fWidth) - iHeight) * (-0.5f);
        }
        float f = this.w;
        float width2 = this.m.getWidth();
        float f2 = iArr[0];
        float f3 = this.x;
        float f4 = this.p;
        float height2 = this.m.getHeight();
        float f5 = iArr[1];
        float f6 = this.v;
        Rect rect = this.e;
        this.u = ((rect.left + rect.right) * 0.5f) - ((((f * width2) * 0.5f) + f2) - f3);
        this.y = ((rect.top + rect.bottom) * 0.5f) - ((((f4 * height2) * 0.5f) + f5) - f6);
    }

    private void b() {
        this.x = this.m.getTranslationX();
        this.v = this.m.getTranslationY();
        this.p = this.m.getScaleY();
        this.w = this.m.getScaleX();
        this.ai = this.m.getPivotX();
        this.ae = this.m.getPivotY();
        this.aa = 1.0f;
        this.ad = this.w;
        this.ac = this.x;
        this.ab = this.v;
    }
}
