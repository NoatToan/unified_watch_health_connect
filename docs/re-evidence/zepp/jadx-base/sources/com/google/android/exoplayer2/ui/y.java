package com.google.android.exoplayer2.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class y {
    private static final long D = 2000;
    private static final long E = 250;
    private static final long F = 250;
    private static final int G = 0;
    private static final int H = 1;
    private static final int I = 2;
    private static final int J = 3;
    private static final int K = 4;
    private boolean A;
    private boolean B;
    private final StyledPlayerControlView a;

    @Nullable
    private final View b;

    @Nullable
    private final ViewGroup c;

    @Nullable
    private final ViewGroup d;

    @Nullable
    private final ViewGroup e;

    @Nullable
    private final ViewGroup f;

    @Nullable
    private final ViewGroup g;

    @Nullable
    private final ViewGroup h;

    @Nullable
    private final ViewGroup i;

    @Nullable
    private final View j;

    @Nullable
    private final View k;
    private final AnimatorSet l;
    private final AnimatorSet m;
    private final AnimatorSet n;
    private final AnimatorSet o;
    private final AnimatorSet p;
    private final ValueAnimator q;
    private final ValueAnimator r;
    private final Runnable s = new Runnable() { // from class: com.google.android.exoplayer2.ui.n
        @Override // java.lang.Runnable
        public final void run() {
            this.a.d0();
        }
    };
    private final Runnable t = new Runnable() { // from class: com.google.android.exoplayer2.ui.w
        @Override // java.lang.Runnable
        public final void run() {
            this.a.D();
        }
    };
    private final Runnable u = new Runnable() { // from class: com.google.android.exoplayer2.ui.l
        @Override // java.lang.Runnable
        public final void run() {
            this.a.H();
        }
    };
    private final Runnable v = new Runnable() { // from class: com.google.android.exoplayer2.ui.m
        @Override // java.lang.Runnable
        public final void run() {
            this.a.G();
        }
    };
    private final Runnable w = new Runnable() { // from class: com.google.android.exoplayer2.ui.x
        @Override // java.lang.Runnable
        public final void run() {
            this.a.E();
        }
    };
    private final View.OnLayoutChangeListener x = new View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.t
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.a.S(view, i2, i3, i4, i5, i6, i7, i8, i9);
        }
    };
    private boolean C = true;
    private int z = 0;
    private final List<View> y = new ArrayList();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            if (y.this.b != null) {
                y.this.b.setVisibility(4);
            }
            if (y.this.c != null) {
                y.this.c.setVisibility(4);
            }
            if (y.this.e != null) {
                y.this.e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            if (!(y.this.j instanceof DefaultTimeBar) || y.this.A) {
                return;
            }
            ((DefaultTimeBar) y.this.j).hideScrubber(250L);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            if (y.this.b != null) {
                y.this.b.setVisibility(0);
            }
            if (y.this.c != null) {
                y.this.c.setVisibility(0);
            }
            if (y.this.e != null) {
                y.this.e.setVisibility(y.this.A ? 0 : 4);
            }
            if (!(y.this.j instanceof DefaultTimeBar) || y.this.A) {
                return;
            }
            ((DefaultTimeBar) y.this.j).showScrubber(250L);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ StyledPlayerControlView a;

        public c(final StyledPlayerControlView val$styledPlayerControlView) {
            this.a = val$styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            y.this.a0(1);
            if (y.this.B) {
                this.a.post(y.this.s);
                y.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            y.this.a0(3);
        }
    }

    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ StyledPlayerControlView a;

        public d(final StyledPlayerControlView val$styledPlayerControlView) {
            this.a = val$styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            y.this.a0(2);
            if (y.this.B) {
                this.a.post(y.this.s);
                y.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            y.this.a0(3);
        }
    }

    public class e extends AnimatorListenerAdapter {
        public final /* synthetic */ StyledPlayerControlView a;

        public e(final StyledPlayerControlView val$styledPlayerControlView) {
            this.a = val$styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            y.this.a0(2);
            if (y.this.B) {
                this.a.post(y.this.s);
                y.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            y.this.a0(3);
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            y.this.a0(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            y.this.a0(4);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            y.this.a0(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            y.this.a0(4);
        }
    }

    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            if (y.this.f != null) {
                y.this.f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            if (y.this.h != null) {
                y.this.h.setVisibility(0);
                y.this.h.setTranslationX(y.this.h.getWidth());
                y.this.h.scrollTo(y.this.h.getWidth(), 0);
            }
        }
    }

    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            if (y.this.h != null) {
                y.this.h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            if (y.this.f != null) {
                y.this.f.setVisibility(0);
            }
        }
    }

    public y(StyledPlayerControlView styledPlayerControlView) {
        this.a = styledPlayerControlView;
        this.b = styledPlayerControlView.findViewById(R.id.exo_controls_background);
        this.c = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_center_controls);
        this.e = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_bottom_bar);
        this.d = viewGroup;
        this.i = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_time);
        View viewFindViewById = styledPlayerControlView.findViewById(R.id.exo_progress);
        this.j = viewFindViewById;
        this.f = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_basic_controls);
        this.g = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_extra_controls);
        this.h = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = styledPlayerControlView.findViewById(R.id.exo_overflow_show);
        this.k = viewFindViewById2;
        View viewFindViewById3 = styledPlayerControlView.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.U(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.U(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.K(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.L(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = styledPlayerControlView.getResources();
        int i2 = R.dimen.exo_styled_bottom_bar_height;
        float dimension = resources.getDimension(i2) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(i2);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(styledPlayerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(O(0.0f, dimension, viewFindViewById)).with(O(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(styledPlayerControlView));
        animatorSet2.play(O(dimension, dimension2, viewFindViewById)).with(O(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(styledPlayerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(O(0.0f, dimension2, viewFindViewById)).with(O(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(O(dimension, 0.0f, viewFindViewById)).with(O(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(O(dimension2, 0.0f, viewFindViewById)).with(O(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.p
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.M(valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.N(valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    private static int B(@Nullable View v) {
        if (v == null) {
            return 0;
        }
        int width = v.getWidth();
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        this.n.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        a0(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        this.l.start();
        V(this.u, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.m.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.b;
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.b;
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private static ObjectAnimator O(float startValue, float endValue, View target) {
        return ObjectAnimator.ofFloat(target, "translationY", startValue, endValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        boolean zF0 = f0();
        if (this.A != zF0) {
            this.A = zF0;
            v.post(new Runnable() { // from class: com.google.android.exoplayer2.ui.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e0();
                }
            });
        }
        boolean z = right - left != oldRight - oldLeft;
        if (this.A || !z) {
            return;
        }
        v.post(new Runnable() { // from class: com.google.android.exoplayer2.ui.v
            @Override // java.lang.Runnable
            public final void run() {
                this.a.T();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        int i2;
        if (this.f == null || this.g == null) {
            return;
        }
        int width = (this.a.getWidth() - this.a.getPaddingLeft()) - this.a.getPaddingRight();
        while (true) {
            if (this.g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.g.getChildCount() - 2;
            View childAt = this.g.getChildAt(childCount);
            this.g.removeViewAt(childCount);
            this.f.addView(childAt, 0);
        }
        View view = this.k;
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
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.r.isStarted()) {
                return;
            }
            this.q.cancel();
            this.r.start();
            return;
        }
        View view2 = this.k;
        if (view2 != null) {
            view2.setVisibility(0);
            iB += B(this.k);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void U(View v) {
        X();
        if (v.getId() == R.id.exo_overflow_show) {
            this.q.start();
        } else if (v.getId() == R.id.exo_overflow_hide) {
            this.r.start();
        }
    }

    private void V(Runnable runnable, long interval) {
        if (interval >= 0) {
            this.a.postDelayed(runnable, interval);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(int uxState) {
        int i2 = this.z;
        this.z = uxState;
        if (uxState == 2) {
            this.a.setVisibility(8);
        } else if (i2 == 2) {
            this.a.setVisibility(0);
        }
        if (i2 != uxState) {
            this.a.e0();
        }
    }

    private boolean b0(View button) {
        int id = button.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        if (!this.C) {
            a0(0);
            X();
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
        X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.A ? 0 : 4);
        }
        View view = this.j;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
            if (this.A) {
                dimensionPixelSize = 0;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize;
            this.j.setLayoutParams(marginLayoutParams);
            View view2 = this.j;
            if (view2 instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
                if (this.A) {
                    defaultTimeBar.hideScrubber(true);
                } else {
                    int i2 = this.z;
                    if (i2 == 1) {
                        defaultTimeBar.hideScrubber(false);
                    } else if (i2 != 3) {
                        defaultTimeBar.showScrubber();
                    }
                }
            }
        }
        for (View view3 : this.y) {
            view3.setVisibility((this.A && b0(view3)) ? 4 : 0);
        }
    }

    private boolean f0() {
        int width = (this.a.getWidth() - this.a.getPaddingLeft()) - this.a.getPaddingRight();
        int height = (this.a.getHeight() - this.a.getPaddingBottom()) - this.a.getPaddingTop();
        int iB = B(this.c);
        ViewGroup viewGroup = this.c;
        int paddingLeft = iB - (viewGroup != null ? viewGroup.getPaddingLeft() + this.c.getPaddingRight() : 0);
        int iZ = z(this.c);
        ViewGroup viewGroup2 = this.c;
        return width <= Math.max(paddingLeft, B(this.i) + B(this.k)) || height <= (iZ - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.c.getPaddingBottom() : 0)) + (z(this.d) * 2);
    }

    private void y(float animatedValue) {
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            this.h.setTranslationX((int) (viewGroup.getWidth() * (1.0f - animatedValue)));
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - animatedValue);
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - animatedValue);
        }
    }

    private static int z(@Nullable View v) {
        if (v == null) {
            return 0;
        }
        int height = v.getHeight();
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public boolean A(@Nullable View button) {
        return button != null && this.y.contains(button);
    }

    public void C() {
        int i2 = this.z;
        if (i2 == 3 || i2 == 2) {
            return;
        }
        W();
        if (!this.C) {
            E();
        } else if (this.z == 1) {
            H();
        } else {
            D();
        }
    }

    public void F() {
        int i2 = this.z;
        if (i2 == 3 || i2 == 2) {
            return;
        }
        W();
        E();
    }

    public boolean I() {
        return this.C;
    }

    public boolean J() {
        return this.z == 0 && this.a.isVisible();
    }

    public void P() {
        this.a.addOnLayoutChangeListener(this.x);
    }

    public void Q() {
        this.a.removeOnLayoutChangeListener(this.x);
    }

    public void R(boolean changed, int left, int top, int right, int bottom) {
        View view = this.b;
        if (view != null) {
            view.layout(0, 0, right - left, bottom - top);
        }
    }

    public void W() {
        this.a.removeCallbacks(this.w);
        this.a.removeCallbacks(this.t);
        this.a.removeCallbacks(this.v);
        this.a.removeCallbacks(this.u);
    }

    public void X() {
        if (this.z == 3) {
            return;
        }
        W();
        int showTimeoutMs = this.a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                V(this.w, showTimeoutMs);
            } else if (this.z == 1) {
                V(this.u, 2000L);
            } else {
                V(this.v, showTimeoutMs);
            }
        }
    }

    public void Y(boolean animationEnabled) {
        this.C = animationEnabled;
    }

    public void Z(@Nullable View button, boolean showButton) {
        if (button == null) {
            return;
        }
        if (!showButton) {
            button.setVisibility(8);
            this.y.remove(button);
            return;
        }
        if (this.A && b0(button)) {
            button.setVisibility(4);
        } else {
            button.setVisibility(0);
        }
        this.y.add(button);
    }

    public void c0() {
        if (!this.a.isVisible()) {
            this.a.setVisibility(0);
            this.a.m0();
            this.a.i0();
        }
        d0();
    }
}
