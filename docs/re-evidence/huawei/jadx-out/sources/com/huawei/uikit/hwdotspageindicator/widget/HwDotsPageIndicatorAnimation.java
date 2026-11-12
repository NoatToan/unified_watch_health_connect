package com.huawei.uikit.hwdotspageindicator.widget;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import defpackage.xeo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
class HwDotsPageIndicatorAnimation implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<Integer, ValueAnimator> f29423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ValueAnimator f29424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<Integer, ValueAnimator> f29425c;
    private ValueAnimator d;
    private ValueAnimator e;
    private SpringAnimation f;
    private ValueAnimator g;
    private ValueAnimator h;
    private ValueAnimator i;
    private ValueAnimator j;
    private final ConcurrentHashMap<Animator, List<AnimationStateListener>> m = new ConcurrentHashMap<>();

    public static abstract class AnimationStateListener {
        void a() {
        }

        void a(float f) {
        }

        void b() {
        }

        void c() {
        }
    }

    public interface AnimationUpdateListener {
        void onAnimationUpdate(xeo xeoVar);

        void onDotCenterChanged(float[] fArr);

        void onFocusDotChanged(boolean z, float f);

        void onFocusSingleScaled(RectF rectF);

        void onSingleScaled(boolean z, int i, float f);

        void onSpringAnimationUpdate(boolean z, float f);
    }

    class a implements DynamicAnimation.OnAnimationEndListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f29426b;

        a(d dVar) {
            this.f29426b = dVar;
        }

        @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
        public void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            if (dynamicAnimation == null) {
                return;
            }
            this.f29426b.f().b();
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RectF f29427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f29428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f29429c;
        final /* synthetic */ float d;
        final /* synthetic */ float e;
        final /* synthetic */ float g;
        final /* synthetic */ d i;

        b(float f, RectF rectF, float f2, float f3, float f4, float f5, d dVar) {
            this.f29428b = f;
            this.f29427a = rectF;
            this.d = f2;
            this.e = f3;
            this.f29429c = f4;
            this.g = f5;
            this.i = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                return;
            }
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() - this.f29428b;
            RectF rectF = this.f29427a;
            float f = fFloatValue / 2.0f;
            rectF.top = this.d - f;
            rectF.left = this.e - fFloatValue;
            rectF.right = this.f29429c + fFloatValue;
            rectF.bottom = this.g + f;
            if (this.i.n != null) {
                this.i.n.onFocusSingleScaled(this.f29427a);
            }
        }
    }

    class c implements DynamicAnimation.OnAnimationUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f29430a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29431c;

        c(d dVar, boolean z) {
            this.f29430a = dVar;
            this.f29431c = z;
        }

        @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
        public void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
            if (dynamicAnimation == null || this.f29430a.p() == null) {
                return;
            }
            this.f29430a.p().onSpringAnimationUpdate(this.f29431c, f);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final xeo f29432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f29433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float[] f29434c;
        private final float d;
        private final xeo e;
        private final float f;
        private final RectF g;
        private final float[] h;
        private final float i;
        private final RectF j;
        private final float k;
        private final long l;
        private final float m;
        private final AnimationUpdateListener n;
        private final TimeInterpolator o;
        private final AnimationStateListener t;

        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private float[] f29435a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float[] f29436b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private float f29437c;
            private float d;
            private float e;
            private float f;
            private float g;
            private RectF h;
            private long i;
            private float j;
            private xeo k;
            private xeo l;
            private AnimationUpdateListener m;
            private RectF n;
            private TimeInterpolator o;
            private AnimationStateListener p;

            public b a(float f) {
                this.d = f;
                return this;
            }

            public b a(xeo xeoVar) {
                this.k = xeoVar;
                return this;
            }

            public b a(float[] fArr) {
                this.f29436b = fArr;
                return this;
            }

            public xeo a() {
                return this.k;
            }

            public TimeInterpolator b() {
                return this.o;
            }

            public b b(float f) {
                this.f29437c = f;
                return this;
            }

            public b b(RectF rectF) {
                this.h = rectF;
                return this;
            }

            public float c() {
                return this.g;
            }

            public b c(float f) {
                this.g = f;
                return this;
            }

            public b c(long j) {
                this.i = j;
                return this;
            }

            public b c(RectF rectF) {
                this.n = rectF;
                return this;
            }

            public b c(AnimationStateListener animationStateListener) {
                this.p = animationStateListener;
                return this;
            }

            public b c(AnimationUpdateListener animationUpdateListener) {
                this.m = animationUpdateListener;
                return this;
            }

            public b d(float f) {
                this.j = f;
                return this;
            }

            public b d(TimeInterpolator timeInterpolator) {
                this.o = timeInterpolator;
                return this;
            }

            public d d() {
                return new d(this);
            }

            public long e() {
                return this.i;
            }

            public b e(float f) {
                this.f = f;
                return this;
            }

            public b e(xeo xeoVar) {
                this.l = xeoVar;
                return this;
            }

            public b e(float[] fArr) {
                this.f29435a = fArr;
                return this;
            }

            public float f() {
                return this.f29437c;
            }

            public RectF g() {
                return this.h;
            }

            public float[] h() {
                return this.f29435a;
            }

            public b i(float f) {
                this.e = f;
                return this;
            }

            public xeo i() {
                return this.l;
            }

            public float j() {
                return this.d;
            }

            public RectF k() {
                return this.n;
            }

            public float l() {
                return this.j;
            }

            public float[] m() {
                return this.f29436b;
            }

            public AnimationStateListener n() {
                return this.p;
            }

            public float o() {
                return this.f;
            }

            public float q() {
                return this.e;
            }

            public AnimationUpdateListener s() {
                return this.m;
            }
        }

        d(b bVar) {
            this.e = bVar.i();
            this.f29432a = bVar.a();
            this.d = bVar.f();
            this.f29433b = bVar.q();
            this.f29434c = bVar.h();
            this.h = bVar.m();
            this.i = bVar.j();
            this.f = bVar.l();
            this.g = bVar.g();
            this.j = bVar.k();
            this.m = bVar.o();
            this.k = bVar.c();
            this.l = bVar.e();
            this.o = bVar.b();
            this.n = bVar.s();
            this.t = bVar.n();
        }

        public float[] a() {
            return this.f29434c;
        }

        public xeo b() {
            return this.e;
        }

        public long c() {
            return this.l;
        }

        public TimeInterpolator d() {
            return this.o;
        }

        public float e() {
            return this.k;
        }

        public AnimationStateListener f() {
            return this.t;
        }

        public float g() {
            return this.d;
        }

        public float h() {
            return this.i;
        }

        public float i() {
            return this.m;
        }

        public RectF j() {
            return this.g;
        }

        public RectF k() {
            return this.j;
        }

        public xeo l() {
            return this.f29432a;
        }

        public float m() {
            return this.f29433b;
        }

        public float n() {
            return this.f;
        }

        public float[] o() {
            return this.h;
        }

        public AnimationUpdateListener p() {
            return this.n;
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f29438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f29439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f29440c;

        e(d dVar, float f, float f2) {
            this.f29439b = dVar;
            this.f29440c = f;
            this.f29438a = f2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                return;
            }
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            HwDotsPageIndicatorAnimation.this.c(valueAnimator, fFloatValue);
            float interpolation = this.f29439b.d().getInterpolation(fFloatValue);
            if (this.f29439b.p() != null) {
                this.f29439b.p().onFocusDotChanged(true, HwDotsPageIndicatorAnimation.this.a(this.f29440c, this.f29438a, interpolation));
            }
        }
    }

    class f implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float[] f29441b;
        final /* synthetic */ d d;
        final /* synthetic */ float[] e;

        f(d dVar, float[] fArr, float[] fArr2) {
            this.d = dVar;
            this.e = fArr;
            this.f29441b = fArr2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                return;
            }
            float interpolation = this.d.d().getInterpolation(((Float) valueAnimator.getAnimatedValue()).floatValue());
            float[] fArr = new float[this.e.length];
            int i = 0;
            while (true) {
                float[] fArr2 = this.e;
                if (i >= fArr2.length) {
                    break;
                }
                float f = fArr2[i];
                fArr[i] = f + ((this.f29441b[i] - f) * interpolation);
                i++;
            }
            if (this.d.p() != null) {
                this.d.p().onDotCenterChanged(fArr);
            }
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ xeo f29443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ xeo f29444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ xeo f29445c;
        final /* synthetic */ ArgbEvaluator d;
        final /* synthetic */ d e;

        g(d dVar, ArgbEvaluator argbEvaluator, xeo xeoVar, xeo xeoVar2, xeo xeoVar3) {
            this.e = dVar;
            this.d = argbEvaluator;
            this.f29445c = xeoVar;
            this.f29443a = xeoVar2;
            this.f29444b = xeoVar3;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                return;
            }
            float interpolation = this.e.d().getInterpolation(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.f29444b.t(((Integer) this.d.evaluate(interpolation, Integer.valueOf(this.f29445c.ad()), Integer.valueOf(this.f29443a.ad()))).intValue());
            float fA = HwDotsPageIndicatorAnimation.this.a(this.f29445c.m(), this.f29443a.m(), interpolation);
            float fA2 = HwDotsPageIndicatorAnimation.this.a(this.f29445c.s(), this.f29443a.s(), interpolation);
            float fA3 = HwDotsPageIndicatorAnimation.this.a(this.f29445c.p(), this.f29443a.p(), interpolation);
            float fA4 = HwDotsPageIndicatorAnimation.this.a(this.f29445c.t(), this.f29443a.t(), interpolation);
            float fA5 = HwDotsPageIndicatorAnimation.this.a(this.f29445c.q(), this.f29443a.q(), interpolation);
            this.f29444b.d(HwDotsPageIndicatorAnimation.this.a(this.f29445c.w().left, this.f29443a.w().left, interpolation), HwDotsPageIndicatorAnimation.this.a(this.f29445c.w().top, this.f29443a.w().top, interpolation), HwDotsPageIndicatorAnimation.this.a(this.f29445c.w().right, this.f29443a.w().right, interpolation), HwDotsPageIndicatorAnimation.this.a(this.f29445c.w().bottom, this.f29443a.w().bottom, interpolation));
            this.f29444b.a(fA);
            this.f29444b.e(fA2, fA4, fA3, fA5);
            float[] fArr = new float[this.f29443a.j().length];
            for (int i = 0; i < this.f29443a.j().length; i++) {
                fArr[i] = HwDotsPageIndicatorAnimation.this.a(this.f29445c.j()[i], this.f29443a.j()[i], interpolation);
            }
            this.f29444b.c(fArr);
            this.f29444b.c(this.f29443a.f());
            if (this.e.p() != null) {
                this.e.p().onAnimationUpdate(this.f29444b);
            }
        }
    }

    class h implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f29446a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29447c;
        final /* synthetic */ int d;

        h(d dVar, boolean z, int i) {
            this.f29446a = dVar;
            this.f29447c = z;
            this.d = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                return;
            }
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f29446a.p() != null) {
                this.f29446a.p().onSingleScaled(this.f29447c, this.d, fFloatValue);
            }
        }
    }

    class j implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f29448a;
        final /* synthetic */ d d;
        final /* synthetic */ float e;

        j(d dVar, float f, float f2) {
            this.d = dVar;
            this.f29448a = f;
            this.e = f2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                return;
            }
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float interpolation = this.d.d().getInterpolation(fFloatValue);
            float f = this.f29448a;
            float f2 = this.e;
            HwDotsPageIndicatorAnimation.this.c(valueAnimator, fFloatValue);
            if (this.d.p() != null) {
                this.d.p().onFocusDotChanged(false, f + ((f2 - f) * interpolation));
            }
        }
    }

    HwDotsPageIndicatorAnimation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    public void a(int i) {
        if (b(i)) {
            this.f29423a.get(Integer.valueOf(i)).cancel();
        }
    }

    public boolean a() {
        ValueAnimator valueAnimator = this.i;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public boolean b() {
        ValueAnimator valueAnimator = this.d;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public boolean c() {
        ValueAnimator valueAnimator = this.h;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public boolean c(int i) {
        ValueAnimator valueAnimator;
        ConcurrentHashMap<Integer, ValueAnimator> concurrentHashMap = this.f29425c;
        return (concurrentHashMap == null || (valueAnimator = concurrentHashMap.get(Integer.valueOf(i))) == null || !valueAnimator.isRunning()) ? false : true;
    }

    public boolean d() {
        ValueAnimator valueAnimator = this.f29424b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public boolean e() {
        ValueAnimator valueAnimator = this.g;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public void f() {
        if (d()) {
            this.f29424b.cancel();
        }
    }

    public boolean g() {
        ValueAnimator valueAnimator = this.e;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public boolean h() {
        SpringAnimation springAnimation = this.f;
        return springAnimation != null && springAnimation.isRunning();
    }

    public void i() {
        if (a()) {
            this.i.cancel();
        }
    }

    public void j() {
        if (c()) {
            this.h.cancel();
        }
    }

    public void k() {
        if (e()) {
            this.g.cancel();
        }
    }

    public void l() {
        if (g()) {
            this.e.cancel();
        }
    }

    public void m() {
        if (b()) {
            this.d.cancel();
        }
    }

    public void o() {
        if (h()) {
            this.f.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        List<AnimationStateListener> listRemove;
        Set<Animator> setKeySet = this.m.keySet();
        if (setKeySet == null || setKeySet.size() == 0) {
            return;
        }
        for (Animator animator2 : setKeySet) {
            if (animator2 == animator && (listRemove = this.m.remove(animator2)) != null && listRemove.size() != 0) {
                Iterator<AnimationStateListener> it = listRemove.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        List<AnimationStateListener> listRemove;
        Set<Animator> setKeySet = this.m.keySet();
        if (setKeySet == null || setKeySet.size() == 0) {
            return;
        }
        for (Animator animator2 : setKeySet) {
            if (animator2 == animator && (listRemove = this.m.remove(animator2)) != null && listRemove.size() != 0) {
                Iterator<AnimationStateListener> it = listRemove.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        List<AnimationStateListener> list;
        Set<Animator> setKeySet = this.m.keySet();
        if (setKeySet == null || setKeySet.size() == 0) {
            return;
        }
        for (Animator animator2 : setKeySet) {
            if (animator2 == animator && (list = this.m.get(animator2)) != null && list.size() != 0) {
                Iterator<AnimationStateListener> it = list.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
            }
        }
    }

    public void c(d dVar) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = valueAnimatorOfFloat;
        a(valueAnimatorOfFloat, dVar);
    }

    public void d(int i) {
        ConcurrentHashMap<Integer, ValueAnimator> concurrentHashMap = this.f29423a;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(Integer.valueOf(i));
        }
    }

    public void f(int i) {
        if (c(i)) {
            this.f29425c.get(Integer.valueOf(i)).cancel();
        }
    }

    public boolean b(int i) {
        ValueAnimator valueAnimator;
        ConcurrentHashMap<Integer, ValueAnimator> concurrentHashMap = this.f29423a;
        return (concurrentHashMap == null || (valueAnimator = concurrentHashMap.get(Integer.valueOf(i))) == null || !valueAnimator.isRunning()) ? false : true;
    }

    public void b(d dVar) {
        if (dVar.d() == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f29424b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.f29424b.setDuration(dVar.c());
        this.f29424b.addListener(this);
        if (dVar.f() != null) {
            d(this.f29424b, dVar.f());
        }
        this.f29424b.addUpdateListener(new e(dVar, dVar.h(), dVar.n()));
        this.f29424b.start();
    }

    public void e(int i) {
        ConcurrentHashMap<Integer, ValueAnimator> concurrentHashMap = this.f29425c;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(Integer.valueOf(i));
        }
    }

    private void c(int i, ValueAnimator valueAnimator) {
        if (this.f29425c == null) {
            this.f29425c = new ConcurrentHashMap<>();
        }
        this.f29425c.put(Integer.valueOf(i), valueAnimator);
    }

    public void d(d dVar) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = valueAnimatorOfFloat;
        a(valueAnimatorOfFloat, dVar);
    }

    private void a(ValueAnimator valueAnimator, d dVar) {
        xeo xeoVarB = dVar.b();
        xeo xeoVarL = dVar.l();
        if (e(xeoVarB, xeoVarL, dVar.d())) {
            xeo xeoVarI = xeoVarB.i();
            valueAnimator.setInterpolator(new LinearInterpolator());
            valueAnimator.addUpdateListener(new g(dVar, new ArgbEvaluator(), xeoVarB, xeoVarL, xeoVarI));
            valueAnimator.addListener(this);
            if (dVar.f() != null) {
                d(valueAnimator, dVar.f());
            }
            valueAnimator.setDuration(dVar.c());
            valueAnimator.start();
        }
    }

    public void e(boolean z, d dVar) {
        this.f = new SpringAnimation(new FloatValueHolder(dVar.h()));
        float fN = dVar.n();
        this.f.addUpdateListener(new c(dVar, z));
        if (dVar.f() != null) {
            this.f.addEndListener(new a(dVar));
        }
        SpringForce springForce = new SpringForce();
        springForce.setDampingRatio(dVar.e()).setStiffness(dVar.i()).setFinalPosition(fN);
        this.f.setSpring(springForce);
        this.f.start();
    }

    public void a(d dVar) {
        if (dVar.d() == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.h.setDuration(dVar.l);
        this.h.addListener(this);
        if (dVar.t != null) {
            d(this.h, dVar.t);
        }
        this.h.addUpdateListener(new j(dVar, dVar.h(), dVar.n()));
        this.h.start();
    }

    private boolean e(xeo xeoVar, xeo xeoVar2, TimeInterpolator timeInterpolator) {
        if (xeoVar == null || xeoVar2 == null || timeInterpolator == null || xeoVar.w() == null || xeoVar2.w() == null) {
            return false;
        }
        float[] fArrJ = xeoVar2.j();
        float[] fArrJ2 = xeoVar.j();
        return (fArrJ == null || fArrJ2 == null || fArrJ.length != fArrJ2.length) ? false : true;
    }

    public void b(boolean z, d dVar) {
        RectF rectFJ = dVar.j();
        RectF rectFK = dVar.k();
        if (rectFJ == null || rectFK == null || dVar.d() == null) {
            return;
        }
        float f2 = rectFJ.left;
        float f3 = rectFJ.top;
        float f4 = rectFJ.right;
        float f5 = rectFJ.bottom;
        float f6 = f5 - f3;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f6, rectFK.bottom - rectFK.top);
        if (z) {
            this.i = valueAnimatorOfFloat;
        } else {
            this.g = valueAnimatorOfFloat;
        }
        valueAnimatorOfFloat.setInterpolator(dVar.d());
        valueAnimatorOfFloat.addUpdateListener(new b(f6, new RectF(), f3, f2, f4, f5, dVar));
        valueAnimatorOfFloat.start();
    }

    public void b(int i, boolean z, d dVar) {
        if (dVar.d() == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(dVar.g(), dVar.m());
        if (z) {
            a(i, valueAnimatorOfFloat);
        } else {
            c(i, valueAnimatorOfFloat);
        }
        valueAnimatorOfFloat.setDuration(dVar.c());
        valueAnimatorOfFloat.setInterpolator(dVar.d());
        valueAnimatorOfFloat.addListener(this);
        if (dVar.f() != null) {
            d(valueAnimatorOfFloat, dVar.f());
        }
        valueAnimatorOfFloat.addUpdateListener(new h(dVar, z, i));
        valueAnimatorOfFloat.start();
    }

    private void a(int i, ValueAnimator valueAnimator) {
        if (this.f29423a == null) {
            this.f29423a = new ConcurrentHashMap<>();
        }
        this.f29423a.put(Integer.valueOf(i), valueAnimator);
    }

    public void e(d dVar) {
        if (dVar.d() == null) {
            return;
        }
        float[] fArrA = dVar.a();
        float[] fArrO = dVar.o();
        if (fArrA == null || fArrO == null || fArrA.length != fArrO.length) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.j = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.j.setDuration(dVar.c());
        this.j.addListener(this);
        if (dVar.t != null) {
            d(this.j, dVar.t);
        }
        this.j.addUpdateListener(new f(dVar, fArrA, fArrO));
        this.j.start();
    }

    public void d(Animator animator, AnimationStateListener animationStateListener) {
        List<AnimationStateListener> arrayList = this.m.get(animator);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(animationStateListener);
        this.m.put(animator, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Animator animator, float f2) {
        List<AnimationStateListener> list;
        Set<Animator> setKeySet = this.m.keySet();
        if (setKeySet == null || setKeySet.size() == 0) {
            return;
        }
        for (Animator animator2 : setKeySet) {
            if (animator2 == animator && (list = this.m.get(animator2)) != null && list.size() != 0) {
                Iterator<AnimationStateListener> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(f2);
                }
            }
        }
    }
}
