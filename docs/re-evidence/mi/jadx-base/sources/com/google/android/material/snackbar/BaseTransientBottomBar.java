package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import defpackage.ayq;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.i8f;
import defpackage.k47;
import defpackage.k8f;
import defpackage.ki4;
import defpackage.kwi;
import defpackage.m80;
import defpackage.n8f;
import defpackage.o7h;
import defpackage.pii;
import defpackage.pmi;
import defpackage.wc1;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f8799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8800b;
    public final SnackbarBaseLayout c;
    public final ki4 d;
    public int e;
    public boolean f;
    public q g;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8801k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public List<r<B>> p;
    public Behavior q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AccessibilityManager f8802r;
    public static final boolean u = false;
    public static final int[] v = {pii.V};
    public static final String w = BaseTransientBottomBar.class.getSimpleName();
    public static final Handler t = new Handler(Looper.getMainLooper(), new h());
    public boolean h = false;

    @RequiresApi(29)
    public final Runnable i = new i();
    public com.google.android.material.snackbar.a.b s = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final s f8803k = new s(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean a(View view) {
            return this.f8803k.a(view);
        }

        public final void k(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f8803k.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f8803k.b(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class SnackbarBaseLayout extends FrameLayout {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final View.OnTouchListener f8804k = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BaseTransientBottomBar<?> f8805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8806b;
        public final float c;
        public final float d;
        public final int e;
        public final int f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public Rect i;
        public boolean j;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public SnackbarBaseLayout(Context context) {
            this(context, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f8805a = baseTransientBottomBar;
        }

        public void c(ViewGroup viewGroup) {
            this.j = true;
            viewGroup.addView(this);
            this.j = false;
        }

        public final Drawable d() {
            float dimension = getResources().getDimension(pmi.y0);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(i8f.i(this, pii.s, pii.p, getBackgroundOverlayColorAlpha()));
            if (this.g == null) {
                return k47.r(gradientDrawable);
            }
            Drawable drawableR = k47.r(gradientDrawable);
            k47.o(drawableR, this.g);
            return drawableR;
        }

        public final void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.d;
        }

        public int getAnimationMode() {
            return this.f8806b;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.c;
        }

        public int getMaxInlineActionWidth() {
            return this.f;
        }

        public int getMaxWidth() {
            return this.e;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f8805a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.I();
            }
            androidx.core.view.c.n0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f8805a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.J();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f8805a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.K();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.e;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setAnimationMode(int i) {
            this.f8806b = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.g != null) {
                drawable = k47.r(drawable.mutate());
                k47.o(drawable, this.g);
                k47.p(drawable, this.h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.g = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = k47.r(getBackground().mutate());
                k47.o(drawableR, colorStateList);
                k47.p(drawableR, this.h);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.h = mode;
            if (getBackground() != null) {
                Drawable drawableR = k47.r(getBackground().mutate());
                k47.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.j || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f8805a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.a0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f8804k);
            super.setOnClickListener(onClickListener);
        }

        public SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(n8f.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, b4j.e8);
            if (typedArrayObtainStyledAttributes.hasValue(b4j.l8)) {
                androidx.core.view.c.z0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(b4j.l8, 0));
            }
            this.f8806b = typedArrayObtainStyledAttributes.getInt(b4j.h8, 0);
            this.c = typedArrayObtainStyledAttributes.getFloat(b4j.i8, 1.0f);
            setBackgroundTintList(k8f.b(context2, typedArrayObtainStyledAttributes, b4j.j8));
            setBackgroundTintMode(ayq.k(typedArrayObtainStyledAttributes.getInt(b4j.k8, -1), PorterDuff.Mode.SRC_IN));
            this.d = typedArrayObtainStyledAttributes.getFloat(b4j.g8, 1.0f);
            this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(b4j.f8, -1);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(b4j.m8, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f8804k);
            setFocusable(true);
            if (getBackground() == null) {
                androidx.core.view.c.v0(this, d());
            }
        }
    }

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8807a;

        public a(int i) {
            this.f8807a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.L(this.f8807a);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.c.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.c.setScaleY(fFloatValue);
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.d.a(70, 180);
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f8813b;

        public e(int i) {
            this.f8813b = i;
            this.f8812a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.u) {
                androidx.core.view.c.b0(BaseTransientBottomBar.this.c, iIntValue - this.f8812a);
            } else {
                BaseTransientBottomBar.this.c.setTranslationY(iIntValue);
            }
            this.f8812a = iIntValue;
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8814a;

        public f(int i) {
            this.f8814a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.L(this.f8814a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.d.b(0, 180);
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8816a = 0;

        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.u) {
                androidx.core.view.c.b0(BaseTransientBottomBar.this.c, iIntValue - this.f8816a);
            } else {
                BaseTransientBottomBar.this.c.setTranslationY(iIntValue);
            }
            this.f8816a = iIntValue;
        }
    }

    public class h implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).U();
                return true;
            }
            if (i != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).F(message.arg1);
            return true;
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int iZ;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.c == null || baseTransientBottomBar.f8800b == null || (iZ = (BaseTransientBottomBar.this.z() - BaseTransientBottomBar.this.D()) + ((int) BaseTransientBottomBar.this.c.getTranslationY())) >= BaseTransientBottomBar.this.m) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.c.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                String unused = BaseTransientBottomBar.w;
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.m - iZ;
            BaseTransientBottomBar.this.c.requestLayout();
        }
    }

    public class j implements o7h {
        public j() {
        }

        @Override // defpackage.o7h
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            BaseTransientBottomBar.this.j = windowInsetsCompat.j();
            BaseTransientBottomBar.this.f8801k = windowInsetsCompat.k();
            BaseTransientBottomBar.this.l = windowInsetsCompat.l();
            BaseTransientBottomBar.this.a0();
            return windowInsetsCompat;
        }
    }

    public class k extends androidx.core.view.a {
        public k() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.a(EventRecurrence.TH);
            m80Var.n0(true);
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            BaseTransientBottomBar.this.s();
            return true;
        }
    }

    public class l implements com.google.android.material.snackbar.a.b {
        public l() {
        }

        @Override // com.google.android.material.snackbar.a.b
        public void a() {
            Handler handler = BaseTransientBottomBar.t;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.a.b
        public void e(int i) {
            Handler handler = BaseTransientBottomBar.t;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.L(3);
        }
    }

    public class n implements SwipeDismissBehavior.c {
        public n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.t(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i) {
            if (i == 0) {
                com.google.android.material.snackbar.a.c().k(BaseTransientBottomBar.this.s);
            } else if (i == 1 || i == 2) {
                com.google.android.material.snackbar.a.c().j(BaseTransientBottomBar.this.s);
            }
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.c;
            if (snackbarBaseLayout == null) {
                return;
            }
            if (snackbarBaseLayout.getParent() != null) {
                BaseTransientBottomBar.this.c.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.c.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.W();
            } else {
                BaseTransientBottomBar.this.Y();
            }
        }
    }

    public class p extends AnimatorListenerAdapter {
        public p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.M();
        }
    }

    public static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<BaseTransientBottomBar> f8826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<View> f8827b;

        public q(BaseTransientBottomBar baseTransientBottomBar, View view) {
            this.f8826a = new WeakReference<>(baseTransientBottomBar);
            this.f8827b = new WeakReference<>(view);
        }

        public static q a(BaseTransientBottomBar baseTransientBottomBar, View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (androidx.core.view.c.T(view)) {
                ayq.a(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        public View b() {
            return this.f8827b.get();
        }

        public void c() {
            if (this.f8827b.get() != null) {
                this.f8827b.get().removeOnAttachStateChangeListener(this);
                ayq.l(this.f8827b.get(), this);
            }
            this.f8827b.clear();
            this.f8826a.clear();
        }

        public final boolean d() {
            if (this.f8826a.get() != null) {
                return false;
            }
            c();
            return true;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (d() || !this.f8826a.get().h) {
                return;
            }
            this.f8826a.get().N();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            ayq.a(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            ayq.l(view, this);
        }
    }

    public static abstract class r<B> {
        public void a(B b2, int i) {
        }

        public void b(B b2) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.google.android.material.snackbar.a.b f8828a;

        public s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.g(0.1f);
            swipeDismissBehavior.f(0.6f);
            swipeDismissBehavior.h(0);
        }

        public boolean a(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.c().j(this.f8828a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.c().k(this.f8828a);
            }
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f8828a = baseTransientBottomBar.s;
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, ki4 ki4Var) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (ki4Var == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f8799a = viewGroup;
        this.d = ki4Var;
        this.f8800b = context;
        c9p.a(context);
        SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(A(), viewGroup, false);
        this.c = snackbarBaseLayout;
        snackbarBaseLayout.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(snackbarBaseLayout.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
        }
        snackbarBaseLayout.addView(view);
        androidx.core.view.c.t0(snackbarBaseLayout, 1);
        androidx.core.view.c.C0(snackbarBaseLayout, 1);
        androidx.core.view.c.A0(snackbarBaseLayout, true);
        androidx.core.view.c.H0(snackbarBaseLayout, new j());
        androidx.core.view.c.r0(snackbarBaseLayout, new k());
        this.f8802r = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public int A() {
        return E() ? kwi.C : kwi.c;
    }

    public final int B() {
        int height = this.c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public View C() {
        return this.c;
    }

    public final int D() {
        int[] iArr = new int[2];
        this.c.getLocationOnScreen(iArr);
        return iArr[1] + this.c.getHeight();
    }

    public boolean E() {
        TypedArray typedArrayObtainStyledAttributes = this.f8800b.obtainStyledAttributes(v);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public final void F(int i2) {
        if (R() && this.c.getVisibility() == 0) {
            q(i2);
        } else {
            L(i2);
        }
    }

    public boolean G() {
        return com.google.android.material.snackbar.a.c().e(this.s);
    }

    public final boolean H() {
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.e) && (((CoordinatorLayout.e) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    public void I() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.c.getRootWindowInsets()) == null) {
            return;
        }
        this.m = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        a0();
    }

    public void J() {
        if (G()) {
            t.post(new m());
        }
    }

    public void K() {
        if (this.o) {
            V();
            this.o = false;
        }
    }

    public void L(int i2) {
        com.google.android.material.snackbar.a.c().h(this.s);
        List<r<B>> list = this.p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.p.get(size).a(this, i2);
            }
        }
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    public void M() {
        com.google.android.material.snackbar.a.c().i(this.s);
        List<r<B>> list = this.p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.p.get(size).b(this);
            }
        }
    }

    public final void N() {
        this.n = r();
        a0();
    }

    public B O(View view) {
        q qVar = this.g;
        if (qVar != null) {
            qVar.c();
        }
        this.g = view == null ? null : q.a(this, view);
        return this;
    }

    public B P(int i2) {
        this.e = i2;
        return this;
    }

    public final void Q(CoordinatorLayout.e eVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorX = this.q;
        if (swipeDismissBehaviorX == null) {
            swipeDismissBehaviorX = x();
        }
        if (swipeDismissBehaviorX instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorX).k(this);
        }
        swipeDismissBehaviorX.setListener(new n());
        eVar.o(swipeDismissBehaviorX);
        if (v() == null) {
            eVar.g = 80;
        }
    }

    public boolean R() {
        AccessibilityManager accessibilityManager = this.f8802r;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final boolean S() {
        return this.m > 0 && !this.f && H();
    }

    public void T() {
        com.google.android.material.snackbar.a.c().m(w(), this.s);
    }

    public final void U() {
        if (this.c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                Q((CoordinatorLayout.e) layoutParams);
            }
            this.c.c(this.f8799a);
            N();
            this.c.setVisibility(4);
        }
        if (androidx.core.view.c.U(this.c)) {
            V();
        } else {
            this.o = true;
        }
    }

    public final void V() {
        if (R()) {
            p();
            return;
        }
        if (this.c.getParent() != null) {
            this.c.setVisibility(0);
        }
        M();
    }

    public final void W() {
        ValueAnimator valueAnimatorU = u(0.0f, 1.0f);
        ValueAnimator valueAnimatorY = y(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorU, valueAnimatorY);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    public final void X(int i2) {
        ValueAnimator valueAnimatorU = u(1.0f, 0.0f);
        valueAnimatorU.setDuration(75L);
        valueAnimatorU.addListener(new a(i2));
        valueAnimatorU.start();
    }

    public final void Y() {
        int iB = B();
        if (u) {
            androidx.core.view.c.b0(this.c, iB);
        } else {
            this.c.setTranslationY(iB);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iB, 0);
        valueAnimator.setInterpolator(wc1.f37827b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(iB));
        valueAnimator.start();
    }

    public final void Z(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, B());
        valueAnimator.setInterpolator(wc1.f37827b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new f(i2));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    public final void a0() {
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || this.c.i == null || this.c.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = this.c.i.bottom + (v() != null ? this.n : this.j);
        marginLayoutParams.leftMargin = this.c.i.left + this.f8801k;
        marginLayoutParams.rightMargin = this.c.i.right + this.l;
        marginLayoutParams.topMargin = this.c.i.top;
        this.c.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || !S()) {
            return;
        }
        this.c.removeCallbacks(this.i);
        this.c.post(this.i);
    }

    public void p() {
        this.c.post(new o());
    }

    public final void q(int i2) {
        if (this.c.getAnimationMode() == 1) {
            X(i2);
        } else {
            Z(i2);
        }
    }

    public final int r() {
        if (v() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        v().getLocationOnScreen(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.f8799a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f8799a.getHeight()) - i2;
    }

    public void s() {
        t(3);
    }

    public void t(int i2) {
        com.google.android.material.snackbar.a.c().b(this.s, i2);
    }

    public final ValueAnimator u(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(wc1.f37826a);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    public View v() {
        q qVar = this.g;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public int w() {
        return this.e;
    }

    public SwipeDismissBehavior<? extends View> x() {
        return new Behavior();
    }

    public final ValueAnimator y(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(wc1.d);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    @RequiresApi(17)
    public final int z() {
        WindowManager windowManager = (WindowManager) this.f8800b.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }
}
