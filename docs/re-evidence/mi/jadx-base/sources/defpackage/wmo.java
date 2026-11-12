package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wmo {
    public boolean A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StyledPlayerControlView f38137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f38138b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final View j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f38139k;
    public final AnimatorSet l;
    public final AnimatorSet m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final AnimatorSet p;
    public final ValueAnimator q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ValueAnimator f38140r;
    public final Runnable s = new Runnable() { // from class: jmo
        @Override // java.lang.Runnable
        public final void run() {
            this.f22931a.c0();
        }
    };
    public final Runnable t = new Runnable() { // from class: pmo
        @Override // java.lang.Runnable
        public final void run() {
            this.f30546a.D();
        }
    };
    public final Runnable u = new Runnable() { // from class: qmo
        @Override // java.lang.Runnable
        public final void run() {
            this.f31665a.H();
        }
    };
    public final Runnable v = new Runnable() { // from class: rmo
        @Override // java.lang.Runnable
        public final void run() {
            this.f32710a.G();
        }
    };
    public final Runnable w = new Runnable() { // from class: smo
        @Override // java.lang.Runnable
        public final void run() {
            this.f33793a.E();
        }
    };
    public final View.OnLayoutChangeListener x = new View.OnLayoutChangeListener() { // from class: tmo
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f34862a.R(view, i2, i3, i4, i5, i6, i7, i8, i9);
        }
    };
    public boolean C = true;
    public int z = 0;
    public final List<View> y = new ArrayList();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (wmo.this.f38138b != null) {
                wmo.this.f38138b.setVisibility(4);
            }
            if (wmo.this.c != null) {
                wmo.this.c.setVisibility(4);
            }
            if (wmo.this.e != null) {
                wmo.this.e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(wmo.this.j instanceof DefaultTimeBar) || wmo.this.A) {
                return;
            }
            ((DefaultTimeBar) wmo.this.j).g(250L);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (wmo.this.f38138b != null) {
                wmo.this.f38138b.setVisibility(0);
            }
            if (wmo.this.c != null) {
                wmo.this.c.setVisibility(0);
            }
            if (wmo.this.e != null) {
                wmo.this.e.setVisibility(wmo.this.A ? 0 : 4);
            }
            if (!(wmo.this.j instanceof DefaultTimeBar) || wmo.this.A) {
                return;
            }
            ((DefaultTimeBar) wmo.this.j).t(250L);
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ StyledPlayerControlView f38143a;

        public c(StyledPlayerControlView styledPlayerControlView) {
            this.f38143a = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            wmo.this.Z(1);
            if (wmo.this.B) {
                this.f38143a.post(wmo.this.s);
                wmo.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            wmo.this.Z(3);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ StyledPlayerControlView f38145a;

        public d(StyledPlayerControlView styledPlayerControlView) {
            this.f38145a = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            wmo.this.Z(2);
            if (wmo.this.B) {
                this.f38145a.post(wmo.this.s);
                wmo.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            wmo.this.Z(3);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ StyledPlayerControlView f38147a;

        public e(StyledPlayerControlView styledPlayerControlView) {
            this.f38147a = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            wmo.this.Z(2);
            if (wmo.this.B) {
                this.f38147a.post(wmo.this.s);
                wmo.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            wmo.this.Z(3);
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            wmo.this.Z(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            wmo.this.Z(4);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            wmo.this.Z(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            wmo.this.Z(4);
        }
    }

    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (wmo.this.f != null) {
                wmo.this.f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (wmo.this.h != null) {
                wmo.this.h.setVisibility(0);
                wmo.this.h.setTranslationX(wmo.this.h.getWidth());
                wmo.this.h.scrollTo(wmo.this.h.getWidth(), 0);
            }
        }
    }

    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (wmo.this.h != null) {
                wmo.this.h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (wmo.this.f != null) {
                wmo.this.f.setVisibility(0);
            }
        }
    }

    public wmo(StyledPlayerControlView styledPlayerControlView) {
        this.f38137a = styledPlayerControlView;
        this.f38138b = styledPlayerControlView.findViewById(hqi.l);
        this.c = (ViewGroup) styledPlayerControlView.findViewById(hqi.g);
        this.e = (ViewGroup) styledPlayerControlView.findViewById(hqi.v);
        ViewGroup viewGroup = (ViewGroup) styledPlayerControlView.findViewById(hqi.e);
        this.d = viewGroup;
        this.i = (ViewGroup) styledPlayerControlView.findViewById(hqi.T);
        View viewFindViewById = styledPlayerControlView.findViewById(hqi.H);
        this.j = viewFindViewById;
        this.f = (ViewGroup) styledPlayerControlView.findViewById(hqi.d);
        this.g = (ViewGroup) styledPlayerControlView.findViewById(hqi.o);
        this.h = (ViewGroup) styledPlayerControlView.findViewById(hqi.p);
        View viewFindViewById2 = styledPlayerControlView.findViewById(hqi.z);
        this.f38139k = viewFindViewById2;
        View viewFindViewById3 = styledPlayerControlView.findViewById(hqi.y);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: umo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f35941a.T(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: umo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f35941a.T(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vmo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f37035a.J(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kmo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f23988a.K(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = styledPlayerControlView.getResources();
        float dimension = resources.getDimension(omi.f29300b) - resources.getDimension(omi.c);
        float dimension2 = resources.getDimension(omi.f29300b);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(styledPlayerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(N(0.0f, dimension, viewFindViewById)).with(N(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(styledPlayerControlView));
        animatorSet2.play(N(dimension, dimension2, viewFindViewById)).with(N(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(styledPlayerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(N(0.0f, dimension2, viewFindViewById)).with(N(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(N(dimension, 0.0f, viewFindViewById)).with(N(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(N(dimension2, 0.0f, viewFindViewById)).with(N(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nmo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f28077a.L(valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f38140r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: omo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f29302a.M(valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    public static int B(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public static ObjectAnimator N(float f2, float f3, View view) {
        return ObjectAnimator.ofFloat(view, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, f2, f3);
    }

    public static int z(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public boolean A(View view) {
        return view != null && this.y.contains(view);
    }

    public void C() {
        int i2 = this.z;
        if (i2 == 3 || i2 == 2) {
            return;
        }
        V();
        if (!this.C) {
            E();
        } else if (this.z == 1) {
            H();
        } else {
            D();
        }
    }

    public final void D() {
        this.n.start();
    }

    public final void E() {
        Z(2);
    }

    public void F() {
        int i2 = this.z;
        if (i2 == 3 || i2 == 2) {
            return;
        }
        V();
        E();
    }

    public final void G() {
        this.l.start();
        U(this.u, VibrateModeProgressBar.sLongToLong);
    }

    public final void H() {
        this.m.start();
    }

    public boolean I() {
        return this.z == 0 && this.f38137a.j0();
    }

    public final /* synthetic */ void J(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f38138b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public final /* synthetic */ void K(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f38138b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public final /* synthetic */ void L(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final /* synthetic */ void M(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void O() {
        this.f38137a.addOnLayoutChangeListener(this.x);
    }

    public void P() {
        this.f38137a.removeOnLayoutChangeListener(this.x);
    }

    public void Q(boolean z, int i2, int i3, int i4, int i5) {
        View view = this.f38138b;
        if (view != null) {
            view.layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    public final void R(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean zE0 = e0();
        if (this.A != zE0) {
            this.A = zE0;
            view.post(new Runnable() { // from class: lmo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25223a.d0();
                }
            });
        }
        boolean z = i4 - i2 != i8 - i6;
        if (this.A || !z) {
            return;
        }
        view.post(new Runnable() { // from class: mmo
            @Override // java.lang.Runnable
            public final void run() {
                this.f27008a.S();
            }
        });
    }

    public final void S() {
        int i2;
        if (this.f == null || this.g == null) {
            return;
        }
        int width = (this.f38137a.getWidth() - this.f38137a.getPaddingLeft()) - this.f38137a.getPaddingRight();
        while (true) {
            if (this.g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.g.getChildCount() - 2;
            View childAt = this.g.getChildAt(childCount);
            this.g.removeViewAt(childCount);
            this.f.addView(childAt, 0);
        }
        View view = this.f38139k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iB = B(this.i);
        int childCount2 = this.f.getChildCount() - 1;
        for (int i3 = 0; i3 < childCount2; i3++) {
            iB += B(this.f.getChildAt(i3));
        }
        if (iB <= width) {
            ViewGroup viewGroup = this.h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f38140r.isStarted()) {
                return;
            }
            this.q.cancel();
            this.f38140r.start();
            return;
        }
        View view2 = this.f38139k;
        if (view2 != null) {
            view2.setVisibility(0);
            iB += B(this.f38139k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < childCount2; i4++) {
            View childAt2 = this.f.getChildAt(i4);
            iB -= B(childAt2);
            arrayList.add(childAt2);
            if (iB <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f.removeViews(0, arrayList.size());
        for (i2 = 0; i2 < arrayList.size(); i2++) {
            this.g.addView((View) arrayList.get(i2), this.g.getChildCount() - 1);
        }
    }

    public final void T(View view) {
        W();
        if (view.getId() == hqi.z) {
            this.q.start();
        } else if (view.getId() == hqi.y) {
            this.f38140r.start();
        }
    }

    public final void U(Runnable runnable, long j) {
        if (j >= 0) {
            this.f38137a.postDelayed(runnable, j);
        }
    }

    public void V() {
        this.f38137a.removeCallbacks(this.w);
        this.f38137a.removeCallbacks(this.t);
        this.f38137a.removeCallbacks(this.v);
        this.f38137a.removeCallbacks(this.u);
    }

    public void W() {
        if (this.z == 3) {
            return;
        }
        V();
        int showTimeoutMs = this.f38137a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                U(this.w, showTimeoutMs);
            } else if (this.z == 1) {
                U(this.u, VibrateModeProgressBar.sLongToLong);
            } else {
                U(this.v, showTimeoutMs);
            }
        }
    }

    public void X(boolean z) {
        this.C = z;
    }

    public void Y(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (!z) {
            view.setVisibility(8);
            this.y.remove(view);
            return;
        }
        if (this.A && a0(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.y.add(view);
    }

    public final void Z(int i2) {
        int i3 = this.z;
        this.z = i2;
        if (i2 == 2) {
            this.f38137a.setVisibility(8);
        } else if (i3 == 2) {
            this.f38137a.setVisibility(0);
        }
        if (i3 != i2) {
            this.f38137a.k0();
        }
    }

    public final boolean a0(View view) {
        int id = view.getId();
        return id == hqi.e || id == hqi.G || id == hqi.x || id == hqi.K || id == hqi.L || id == hqi.q || id == hqi.f20345r;
    }

    public void b0() {
        if (!this.f38137a.j0()) {
            this.f38137a.setVisibility(0);
            this.f38137a.u0();
            this.f38137a.p0();
        }
        c0();
    }

    public final void c0() {
        if (!this.C) {
            Z(0);
            W();
            return;
        }
        int i2 = this.z;
        if (i2 == 1) {
            this.o.start();
        } else if (i2 == 2) {
            this.p.start();
        } else if (i2 == 3) {
            this.B = true;
        } else if (i2 == 4) {
            return;
        }
        W();
    }

    public final void d0() {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.A ? 0 : 4);
        }
        View view = this.j;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int dimensionPixelSize = this.f38137a.getResources().getDimensionPixelSize(omi.d);
            if (this.A) {
                dimensionPixelSize = 0;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize;
            this.j.setLayoutParams(marginLayoutParams);
            View view2 = this.j;
            if (view2 instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
                if (this.A) {
                    defaultTimeBar.h(true);
                } else {
                    int i2 = this.z;
                    if (i2 == 1) {
                        defaultTimeBar.h(false);
                    } else if (i2 != 3) {
                        defaultTimeBar.s();
                    }
                }
            }
        }
        for (View view3 : this.y) {
            view3.setVisibility((this.A && a0(view3)) ? 4 : 0);
        }
    }

    public final boolean e0() {
        int width = (this.f38137a.getWidth() - this.f38137a.getPaddingLeft()) - this.f38137a.getPaddingRight();
        int height = (this.f38137a.getHeight() - this.f38137a.getPaddingBottom()) - this.f38137a.getPaddingTop();
        int iB = B(this.c);
        ViewGroup viewGroup = this.c;
        int paddingLeft = iB - (viewGroup != null ? viewGroup.getPaddingLeft() + this.c.getPaddingRight() : 0);
        int iZ = z(this.c);
        ViewGroup viewGroup2 = this.c;
        return width <= Math.max(paddingLeft, B(this.i) + B(this.f38139k)) || height <= (iZ - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.c.getPaddingBottom() : 0)) + (z(this.d) * 2);
    }

    public final void y(float f2) {
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            this.h.setTranslationX((int) (viewGroup.getWidth() * (1.0f - f2)));
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f2);
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f2);
        }
    }
}
