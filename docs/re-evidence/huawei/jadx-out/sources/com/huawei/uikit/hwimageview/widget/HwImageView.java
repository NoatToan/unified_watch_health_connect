package com.huawei.uikit.hwimageview.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.widget.RemoteViews;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.uikit.hwdragdowntransition.anim.HwDragDownAnimationListener;
import com.huawei.uikit.hwdragdowntransition.anim.HwDragDownTransition;
import com.huawei.uikit.hwimageview.R;
import com.huawei.uikit.hwimageview.widget.drawable.HwAnimatedGradientDrawable;
import com.huawei.uikit.hwunifiedinteract.widget.HwCompoundEventDetector;
import defpackage.xeh;
import defpackage.xev;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes44.dex */
@RemoteViews.RemoteView
public class HwImageView extends AppCompatImageView implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f29507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwParallaxStyle f29509c;
    protected HwDragDownTransition d;
    private int[] e;
    private LayerDrawable f;
    private boolean g;
    private boolean h;
    private float i;
    private Context j;
    private float k;
    private float l;
    private HwCompoundEventDetector m;
    private float n;
    private boolean o;
    private HwCompoundEventDetector.OnZoomEventListener q;

    class b extends ViewOutlineProvider {
        final /* synthetic */ Drawable d;

        b(Drawable drawable) {
            this.d = drawable;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            this.d.getOutline(outline);
        }
    }

    class e implements HwCompoundEventDetector.OnZoomEventListener {
        e() {
        }

        @Override // com.huawei.uikit.hwunifiedinteract.widget.HwCompoundEventDetector.OnZoomEventListener
        public boolean onZoom(float f, MotionEvent motionEvent) {
            if (!HwImageView.this.e(f, 0.0f)) {
                HwImageView.this.e(f > 0.0f, motionEvent);
            }
            return true;
        }
    }

    public HwImageView(Context context) {
        this(context, null);
    }

    private boolean b(int i) {
        return i == 0 || i == 1;
    }

    private void d(Context context, AttributeSet attributeSet) {
        e(context);
        a(context, attributeSet);
        this.j = context;
        this.m = e();
        this.q = d();
        setValueFromPlume(context);
    }

    private void setParallaxStyleEffect(int i) {
        HwParallaxStyle hwParallaxStyle = this.f29509c;
        if (hwParallaxStyle != null) {
            hwParallaxStyle.onDetachedFromImageView(this);
            this.f29509c = null;
        }
        if (i == 0 || i != 1) {
            return;
        }
        xev xevVar = new xev();
        this.f29509c = xevVar;
        xevVar.onAttachedToImageView(this);
    }

    private void setValueFromPlume(Context context) {
        Method methodC = xeh.c("getBoolean", new Class[]{Context.class, View.class, String.class, Boolean.TYPE}, "huawei.android.widget.HwPlume");
        if (methodC == null) {
            return;
        }
        Object objC = xeh.c((Object) null, methodC, new Object[]{context, this, "zoomEnabled", Boolean.FALSE});
        if (objC instanceof Boolean) {
            setOnZoomEnabled(((Boolean) objC).booleanValue());
        }
    }

    public boolean c() {
        HwCompoundEventDetector hwCompoundEventDetector = this.m;
        return (hwCompoundEventDetector == null || hwCompoundEventDetector.d() == null) ? false : true;
    }

    protected HwCompoundEventDetector.OnZoomEventListener d() {
        return new e();
    }

    protected HwCompoundEventDetector e() {
        return new HwCompoundEventDetector(this.j);
    }

    @Override // android.view.View
    public Drawable getBackground() {
        LayerDrawable layerDrawable = this.f;
        if (layerDrawable == null) {
            return super.getBackground();
        }
        if (layerDrawable.getNumberOfLayers() == 1) {
            return null;
        }
        return this.f.getDrawable(0);
    }

    public HwCompoundEventDetector.OnZoomEventListener getOnZoomListener() {
        return this.q;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f29508b == 0) {
            b();
        } else {
            a();
        }
        HwDragDownTransition hwDragDownTransition = this.d;
        if (hwDragDownTransition != null && this.h) {
            hwDragDownTransition.d();
        }
        setOnZoomEnabled(c());
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        HwCompoundEventDetector hwCompoundEventDetector = this.m;
        if (hwCompoundEventDetector != null) {
            hwCompoundEventDetector.e();
        }
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        if (this.f29508b == 0 || getDrawable() == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.f29508b == 1 && this.f29509c != null) {
            getLocationInWindow(this.f29507a);
            this.f29509c.transform(this, canvas, this.f29507a, this.e);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        HwCompoundEventDetector hwCompoundEventDetector = this.m;
        if (hwCompoundEventDetector == null || !hwCompoundEventDetector.a(motionEvent)) {
            return super.onGenericMotionEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        HwCompoundEventDetector hwCompoundEventDetector = this.m;
        if (hwCompoundEventDetector == null || !hwCompoundEventDetector.e(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        HwCompoundEventDetector hwCompoundEventDetector = this.m;
        if (hwCompoundEventDetector == null || !hwCompoundEventDetector.e(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        if (this.f29508b != 0) {
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        HwDragDownTransition hwDragDownTransition = this.d;
        if (hwDragDownTransition == null || !hwDragDownTransition.e(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (this.f == null) {
            super.setBackground(drawable);
            return;
        }
        LayerDrawable layerDrawableB = b(drawable);
        this.f = layerDrawableB;
        super.setBackground(layerDrawableB);
    }

    public void setDestRect(Rect rect) {
        HwDragDownTransition hwDragDownTransition = this.d;
        if (hwDragDownTransition != null) {
            hwDragDownTransition.b(rect);
        }
    }

    public void setDragDownAnimationListener(HwDragDownAnimationListener hwDragDownAnimationListener) {
        HwDragDownTransition hwDragDownTransition = this.d;
        if (hwDragDownTransition != null) {
            hwDragDownTransition.e(hwDragDownAnimationListener);
        }
    }

    public void setOnZoomEnabled(boolean z) {
        HwCompoundEventDetector hwCompoundEventDetector = this.m;
        if (hwCompoundEventDetector == null) {
            return;
        }
        if (z) {
            hwCompoundEventDetector.e(this, this.q);
        } else {
            hwCompoundEventDetector.e(this, (HwCompoundEventDetector.OnZoomEventListener) null);
        }
    }

    public void setOnZoomListener(HwCompoundEventDetector.OnZoomEventListener onZoomEventListener) {
        HwCompoundEventDetector hwCompoundEventDetector = this.m;
        if (hwCompoundEventDetector == null) {
            Log.e("HwImageView", "setOnZoomListener: mHwCompoundEventDetector is null");
        } else {
            this.q = onZoomEventListener;
            hwCompoundEventDetector.e(this, onZoomEventListener);
        }
    }

    public void setParallaxStyle(int i) {
        if (!b(i)) {
            Log.e("HwImageView", "setParallaxStyle: Unsupported parallax style. Set HwImageView parallax style to 'none'.");
            this.f29508b = 0;
            setParallaxStyleEffect(0);
            b();
            requestLayout();
            return;
        }
        if (i != this.f29508b) {
            this.f29508b = i;
            setParallaxStyleEffect(i);
            if (this.f29508b == 0) {
                b();
            } else {
                a();
            }
            requestLayout();
        }
    }

    public HwImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29507a = new int[2];
        this.e = new int[2];
        this.f29508b = 0;
        this.g = false;
        this.h = false;
        this.f = null;
        this.i = 1.0f;
        this.l = 1.0f;
        this.o = false;
        this.k = 0.0f;
        this.n = 0.0f;
        this.m = null;
        d(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwImageView);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwImageView_hwClipToOutline, false);
        setClipToOutline(z);
        Drawable background = getBackground();
        if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwImageView_hwClickEffect, false)) {
            LayerDrawable layerDrawableB = b(background);
            this.f = layerDrawableB;
            super.setBackground(layerDrawableB);
        }
        if (z && background != null) {
            setOutlineProvider(new b(background));
        }
        int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.HwImageView_hwParallaxStyle, 0);
        this.f29508b = integer;
        setParallaxStyleEffect(integer);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void b() {
        if (this.g) {
            getViewTreeObserver().removeOnScrollChangedListener(this);
            this.g = false;
        }
    }

    private void e(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context instanceof Activity) {
            ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            displayMetrics = getResources().getDisplayMetrics();
        }
        int[] iArr = this.e;
        iArr[0] = displayMetrics.widthPixels;
        iArr[1] = displayMetrics.heightPixels;
    }

    private void a() {
        if (this.g) {
            return;
        }
        getViewTreeObserver().addOnScrollChangedListener(this);
        this.g = true;
    }

    private LayerDrawable b(Drawable drawable) {
        HwAnimatedGradientDrawable hwAnimatedGradientDrawable = new HwAnimatedGradientDrawable(getContext());
        if (drawable == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{hwAnimatedGradientDrawable});
            layerDrawable.setId(0, 1);
            return layerDrawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{drawable, hwAnimatedGradientDrawable});
        layerDrawable2.setId(0, 0);
        layerDrawable2.setId(1, 1);
        return layerDrawable2;
    }

    public HwImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29507a = new int[2];
        this.e = new int[2];
        this.f29508b = 0;
        this.g = false;
        this.h = false;
        this.f = null;
        this.i = 1.0f;
        this.l = 1.0f;
        this.o = false;
        this.k = 0.0f;
        this.n = 0.0f;
        this.m = null;
        d(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z, MotionEvent motionEvent) {
        if (z) {
            float f = this.i * 1.1f;
            if (f > 2.6f) {
                return;
            } else {
                this.i = f;
            }
        } else {
            float f2 = this.i;
            this.i = f2 - (0.1f * f2);
        }
        float[] fArr = new float[9];
        getMatrix().getValues(fArr);
        setPivotX(0.0f);
        setPivotY(0.0f);
        float f3 = this.i;
        if (f3 >= 1.0f && !e(f3, 1.0f)) {
            float x = fArr[2] - (motionEvent.getX() * (this.i - fArr[0]));
            float y = fArr[5] - (motionEvent.getY() * (this.i - fArr[4]));
            int width = getWidth();
            int height = getHeight();
            int iD = d(x, y, fArr, motionEvent);
            if (iD == 1) {
                a(fArr, motionEvent, true);
                return;
            }
            if (iD == 2) {
                a(fArr, motionEvent, false);
                return;
            }
            if (iD == 3) {
                d(fArr, motionEvent, width, true);
                return;
            } else {
                if (iD == 4) {
                    d(fArr, motionEvent, height, false);
                    return;
                }
                this.l = 1.0f;
                this.o = false;
                b(this.i, x, y);
                return;
            }
        }
        this.i = 1.0f;
        b(1.0f, 0.0f, 0.0f);
        this.n = 0.0f;
        this.k = 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    private int d(float f, float f2, float[] fArr, MotionEvent motionEvent) {
        float x;
        int i;
        if ((f > 0.0f || e(f, 0.0f)) && motionEvent.getX() > 0.0f) {
            x = (fArr[2] / motionEvent.getX()) + fArr[0];
            if (x > 1.0f) {
                i = 1;
            } else {
                i = 0;
                x = 1.0f;
            }
        } else {
            i = 0;
            x = 1.0f;
        }
        int i2 = 4;
        if ((f2 > 0.0f || e(f2, 0.0f)) && motionEvent.getY() > 0.0f) {
            float y = (fArr[5] / motionEvent.getY()) + fArr[4];
            if (y > x) {
                i = 2;
                x = y;
            }
        }
        float width = getWidth();
        float f3 = f + ((this.i - 1.0f) * width);
        if ((f3 < 0.0f || e(f3, 0.0f)) && motionEvent.getX() < width) {
            float x2 = ((fArr[2] - width) + (motionEvent.getX() * fArr[0])) / (motionEvent.getX() - width);
            if (x2 > x) {
                i = 3;
                x = x2;
            }
        }
        float height = getHeight();
        float f4 = f2 + ((this.i - 1.0f) * height);
        if ((f4 < 0.0f || e(f4, 0.0f)) && motionEvent.getY() < height) {
            float y2 = ((fArr[5] - height) + (motionEvent.getY() * fArr[4])) / (motionEvent.getY() - height);
            if (y2 > x) {
                x = y2;
            } else {
                i2 = i;
            }
        } else {
            i2 = i;
        }
        this.l = x;
        return i2;
    }

    private void a(float[] fArr, MotionEvent motionEvent, boolean z) {
        if (z) {
            if (!this.o) {
                float f = fArr[5];
                float y = motionEvent.getY();
                float f2 = this.l;
                float f3 = fArr[4];
                float f4 = f - (y * (f2 - f3));
                this.n = 0.0f;
                if (f2 > 1.0f) {
                    this.k = f4 / (1.0f - f2);
                } else if (f3 > 1.0f) {
                    this.k = fArr[5] / (1.0f - f3);
                } else {
                    this.k = 0.0f;
                }
                b(f2, 0.0f, f4);
                this.o = true;
            }
            float f5 = this.i;
            b(f5, 0.0f, this.k * (1.0f - f5));
            return;
        }
        if (!this.o) {
            float f6 = fArr[2];
            float x = motionEvent.getX();
            float f7 = this.l;
            float f8 = fArr[0];
            float f9 = f6 - (x * (f7 - f8));
            if (f7 > 1.0f) {
                this.n = f9 / (1.0f - f7);
            } else if (f8 > 1.0f) {
                this.n = fArr[2] / (1.0f - f8);
            } else {
                this.n = 0.0f;
            }
            this.k = 0.0f;
            b(f7, f9, 0.0f);
            this.o = true;
        }
        float f10 = this.i;
        b(f10, this.n * (1.0f - f10), 0.0f);
    }

    private void d(float[] fArr, MotionEvent motionEvent, int i, boolean z) {
        if (z) {
            if (!this.o) {
                float f = fArr[5];
                float y = motionEvent.getY();
                float f2 = this.l;
                float f3 = fArr[4];
                float f4 = f - (y * (f2 - f3));
                this.n = i;
                if (f2 > 1.0f) {
                    this.k = f4 / (1.0f - f2);
                } else if (f3 > 1.0f) {
                    this.k = fArr[5] / (1.0f - f3);
                } else {
                    this.k = getHeight();
                }
                b(this.l, fArr[2] - (motionEvent.getX() * (this.l - fArr[0])), f4);
                this.o = true;
            }
            float f5 = this.i;
            float f6 = 1.0f - f5;
            b(f5, this.n * f6, this.k * f6);
            return;
        }
        if (!this.o) {
            float f7 = fArr[2];
            float x = motionEvent.getX();
            float f8 = this.l;
            float f9 = fArr[0];
            float f10 = f7 - (x * (f8 - f9));
            if (f8 > 1.0f) {
                this.n = f10 / (1.0f - f8);
            } else if (f9 > 1.0f) {
                this.n = fArr[2] / (1.0f - f9);
            } else {
                this.n = getWidth();
            }
            this.k = i;
            b(this.l, f10, fArr[5] - (motionEvent.getX() * (this.l - fArr[4])));
            this.o = true;
        }
        float f11 = this.i;
        float f12 = 1.0f - f11;
        b(f11, this.n * f12, this.k * f12);
    }

    private void b(float f, float f2, float f3) {
        setScaleX(f);
        setScaleY(f);
        setTranslationX(f2);
        setTranslationY(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-6f;
    }
}
