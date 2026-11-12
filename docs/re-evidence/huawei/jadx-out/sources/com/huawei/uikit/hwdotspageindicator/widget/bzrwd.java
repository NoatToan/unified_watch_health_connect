package com.huawei.uikit.hwdotspageindicator.widget;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.uikit.hwdotspageindicator.R;
import defpackage.xel;
import defpackage.xeo;
import defpackage.xep;
import defpackage.xfs;

/* JADX INFO: loaded from: classes20.dex */
class bzrwd extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected HwDotsPageIndicatorAnimation f29450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected float f29451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeInterpolator f29452c;
    private float d;
    protected xeo e;
    protected float f;
    protected HwWatchDotsPageIndicatorAnimation g;
    protected float h;
    protected xel i;
    protected float j;
    private TimeInterpolator k;
    private TimeInterpolator l;
    private TimeInterpolator m;
    private TimeInterpolator n;
    private TimeInterpolator o;
    private TimeInterpolator r;
    private TimeInterpolator t;

    class a extends HwDotsPageIndicatorAnimation.AnimationStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f29453a;

        a(View view) {
            this.f29453a = view;
        }

        @Override // com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicatorAnimation.AnimationStateListener
        void a() {
            bzrwd.this.a(this.f29453a);
        }

        @Override // com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicatorAnimation.AnimationStateListener
        void b() {
            bzrwd.this.a(this.f29453a);
        }
    }

    class b extends HwDotsPageIndicatorAnimation.AnimationStateListener {
        final /* synthetic */ int d;

        b(int i) {
            this.d = i;
        }

        @Override // com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicatorAnimation.AnimationStateListener
        void b() {
            bzrwd.this.f29450a.d(this.d);
        }
    }

    class c extends HwDotsPageIndicatorAnimation.AnimationStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f29456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f29457b;

        c(int i, View view) {
            this.f29457b = i;
            this.f29456a = view;
        }

        @Override // com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicatorAnimation.AnimationStateListener
        void b() {
            bzrwd.this.e.m(this.f29457b);
            bzrwd.this.f29450a.e(this.f29457b);
            this.f29456a.invalidate();
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f29458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f29459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f29460c;
        float d;
        float e;

        d(boolean z, float f, float f2, float f3, float f4) {
            this.f29458a = z;
            this.d = f;
            this.e = f2;
            this.f29460c = f3;
            this.f29459b = f4;
        }
    }

    bzrwd(Context context, AttributeSet attributeSet, int i) {
        super(a(context, i), attributeSet, i);
        this.e = new xeo();
        this.i = new xel();
        this.f29451b = 0.47f;
        this.h = 700.0f;
        this.f = 0.2f;
        this.j = 800.0f;
    }

    public void a(float f, float f2, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener, HwDotsPageIndicatorAnimation.AnimationStateListener animationStateListener) {
        if (this.f29450a != null) {
            this.f29450a.a(new HwDotsPageIndicatorAnimation.d.b().a(f).d(f2).c(400L).d(getDecelerateInterpolator()).c(animationUpdateListener).c(animationStateListener).d());
        }
    }

    public void a(int i, float f, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener) {
        HwDotsPageIndicatorAnimation hwDotsPageIndicatorAnimation = this.f29450a;
        if (hwDotsPageIndicatorAnimation != null) {
            hwDotsPageIndicatorAnimation.f(i);
            this.f29450a.b(i, true, new HwDotsPageIndicatorAnimation.d.b().b(this.e.m()).i(f).c(100L).d(getAlphaInterpolator()).c(animationUpdateListener).c(new b(i)).d());
        }
    }

    public void a(boolean z, xeo xeoVar, View view, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener) {
        if (this.f29450a != null) {
            this.f29450a.c(new HwDotsPageIndicatorAnimation.d.b().e(this.e.i()).a(xeoVar).d(getAlphaInterpolator()).c(z ? 250L : 300L).c(animationUpdateListener).c(new a(view)).d());
            this.e.q(-1);
            this.e.b(false);
            this.e.g();
        }
    }

    public void c(RectF rectF, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener) {
        if (this.f29450a != null) {
            this.f29450a.b(true, new HwDotsPageIndicatorAnimation.d.b().b(this.e.r()).c(rectF).c(100L).d(getAlphaInterpolator()).c(animationUpdateListener).d());
            this.e.b(true);
        }
    }

    public void c(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalThreadStateException("Only main thread can call #" + str);
    }

    public void c(float[] fArr, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener) {
        if (this.f29450a != null) {
            this.f29450a.e(new HwDotsPageIndicatorAnimation.d.b().e(this.e.j()).a(fArr).c(400L).d(getAccelerateInterpolator()).c(animationUpdateListener).d());
        }
    }

    public void d(float f, float f2, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener, HwDotsPageIndicatorAnimation.AnimationStateListener animationStateListener) {
        if (this.f29450a != null) {
            this.f29450a.b(new HwDotsPageIndicatorAnimation.d.b().a(f).d(f2).c(400L).d(getAccelerateInterpolator()).c(animationUpdateListener).c(animationStateListener).d());
        }
    }

    public void d(RectF rectF, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener) {
        if (this.f29450a != null) {
            this.f29450a.b(false, new HwDotsPageIndicatorAnimation.d.b().b(this.e.r()).c(rectF).c(150L).d(getAlphaInterpolator()).c(animationUpdateListener).d());
            this.e.b(false);
        }
    }

    public void d(d dVar, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener) {
        if (this.f29450a != null) {
            this.f29450a.e(dVar.f29458a, new HwDotsPageIndicatorAnimation.d.b().a(dVar.d).d(dVar.e).e(dVar.f29460c).c(dVar.f29459b).c(animationUpdateListener).d());
        }
    }

    public void d(xeo xeoVar, boolean z, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener, HwDotsPageIndicatorAnimation.AnimationStateListener animationStateListener) {
        if (this.f29450a != null) {
            this.f29450a.d(new HwDotsPageIndicatorAnimation.d.b().e(this.e.i()).a(xeoVar).d(getAlphaInterpolator()).c(250L).c(animationUpdateListener).c(animationStateListener).d());
        }
    }

    public void e(float f, float f2, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener) {
        if (this.f29450a != null) {
            this.f29450a.b(new HwDotsPageIndicatorAnimation.d.b().a(f).d(f2).c(400L).d(getAccelerateInterpolator()).c(animationUpdateListener).d());
        }
    }

    public void e(int i, View view, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener) {
        HwDotsPageIndicatorAnimation hwDotsPageIndicatorAnimation = this.f29450a;
        if (hwDotsPageIndicatorAnimation != null) {
            hwDotsPageIndicatorAnimation.a(i);
            this.f29450a.b(i, false, new HwDotsPageIndicatorAnimation.d.b().b(this.e.aa()).i(this.e.m()).c(150L).d(getAlphaInterpolator()).c(animationUpdateListener).c(new c(i, view)).d());
        }
    }

    public boolean e() {
        HwDotsPageIndicatorAnimation hwDotsPageIndicatorAnimation = this.f29450a;
        return hwDotsPageIndicatorAnimation != null && hwDotsPageIndicatorAnimation.d();
    }

    public TimeInterpolator getAccelerateInterpolator() {
        if (this.o == null) {
            this.o = xep.b();
        }
        return this.o;
    }

    public TimeInterpolator getAlphaInterpolator() {
        if (this.f29452c == null) {
            this.f29452c = xep.c();
        }
        return this.f29452c;
    }

    public TimeInterpolator getDecelerateInterpolator() {
        if (this.l == null) {
            this.l = xep.a();
        }
        return this.l;
    }

    public float getMaxDiffFraction() {
        if (this.d == 0.0f) {
            this.d = xep.b(getAccelerateInterpolator(), getDecelerateInterpolator());
        }
        return this.d;
    }

    public TimeInterpolator getNavigationPointInterpolator() {
        if (this.m == null) {
            this.m = xep.d();
        }
        return this.m;
    }

    public TimeInterpolator getScaleInterpolator() {
        if (this.r == null) {
            this.r = xep.e();
        }
        return this.r;
    }

    public TimeInterpolator getWatchAccelerateInterpolator() {
        if (this.o == null) {
            this.o = xep.h();
        }
        return this.o;
    }

    public TimeInterpolator getWatchDecelerateInterpolator() {
        if (this.l == null) {
            this.l = xep.j();
        }
        return this.l;
    }

    public TimeInterpolator getWatchDotTouchAndSlideInterpolator() {
        if (this.t == null) {
            this.t = xep.g();
        }
        return this.t;
    }

    public TimeInterpolator getWatchTouchFocusAccelerateInterpolator() {
        if (this.n == null) {
            this.n = xep.i();
        }
        return this.n;
    }

    public TimeInterpolator getWatchTouchFocusDecelerateInterpolator() {
        if (this.k == null) {
            this.k = xep.f();
        }
        return this.k;
    }

    public boolean i() {
        HwDotsPageIndicatorAnimation hwDotsPageIndicatorAnimation = this.f29450a;
        return hwDotsPageIndicatorAnimation != null && hwDotsPageIndicatorAnimation.h();
    }

    public void j() {
        if (i()) {
            this.f29450a.o();
        }
    }

    public void setAlphaInterpolator(TimeInterpolator timeInterpolator) {
        this.f29452c = timeInterpolator;
    }

    public void setDragAccelerateInterpolator(TimeInterpolator timeInterpolator) {
        this.o = timeInterpolator;
        this.d = xep.b(timeInterpolator, getDecelerateInterpolator());
    }

    public void setDragDecelerateInterpolator(TimeInterpolator timeInterpolator) {
        this.l = timeInterpolator;
        this.d = xep.b(getAccelerateInterpolator(), this.l);
    }

    public void setScaleInterpolator(TimeInterpolator timeInterpolator) {
        this.r = timeInterpolator;
    }

    public void setSpringAnimationDamping(float f) {
        if (f <= 0.0f) {
            f = this.f29451b;
        }
        this.f29451b = f;
    }

    public void setSpringAnimationStiffness(float f) {
        if (f <= 0.0f) {
            f = this.h;
        }
        this.h = f;
    }

    private static Context a(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwDotsPageIndicator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        if (this.e.h()) {
            return;
        }
        this.e.g();
        view.invalidate();
    }
}
