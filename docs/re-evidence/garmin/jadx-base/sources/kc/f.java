package kc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public boolean A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.ui.c f103853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f103854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f103855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f103856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f103857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewGroup f103858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f103859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewGroup f103860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewGroup f103861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f103862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f103863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AnimatorSet f103864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AnimatorSet f103865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AnimatorSet f103866n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AnimatorSet f103867o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AnimatorSet f103868p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ValueAnimator f103869q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ValueAnimator f103870r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kc.d f103871s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final kc.d f103872t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final kc.d f103874v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.google.android.material.carousel.a f103876x;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final kc.d f103873u = new kc.d(this, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kc.d f103875w = new kc.d(this, 6);
    public boolean C = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f103878z = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f103877y = new ArrayList();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            f fVar = f.this;
            View view2 = fVar.f103854b;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            ViewGroup viewGroup = fVar.f103855c;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            ViewGroup viewGroup2 = fVar.f103857e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            f fVar = f.this;
            View view2 = fVar.f103862j;
            if (!(view2 instanceof androidx.media3.ui.b) || fVar.A) {
                return;
            }
            androidx.media3.ui.b bVar = (androidx.media3.ui.b) view2;
            ValueAnimator valueAnimator = bVar.I;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            valueAnimator.setFloatValues(bVar.P, 0.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            f fVar = f.this;
            View view2 = fVar.f103854b;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            ViewGroup viewGroup = fVar.f103855c;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = fVar.f103857e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(fVar.A ? 0 : 4);
            }
            View view3 = fVar.f103862j;
            if (!(view3 instanceof androidx.media3.ui.b) || fVar.A) {
                return;
            }
            androidx.media3.ui.b bVar = (androidx.media3.ui.b) view3;
            ValueAnimator valueAnimator = bVar.I;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            bVar.T = false;
            valueAnimator.setFloatValues(bVar.P, 1.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.media3.ui.c f103881a;

        public c(androidx.media3.ui.c cVar) {
            this.f103881a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            f fVar = f.this;
            fVar.i(1);
            if (fVar.B) {
                this.f103881a.post(fVar.f103871s);
                fVar.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            f.this.i(3);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.media3.ui.c f103883a;

        public d(androidx.media3.ui.c cVar) {
            this.f103883a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            f fVar = f.this;
            fVar.i(2);
            if (fVar.B) {
                this.f103883a.post(fVar.f103871s);
                fVar.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            f.this.i(3);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.media3.ui.c f103885a;

        public e(androidx.media3.ui.c cVar) {
            this.f103885a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            f fVar = f.this;
            fVar.i(2);
            if (fVar.B) {
                this.f103885a.post(fVar.f103871s);
                fVar.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            f.this.i(3);
        }
    }

    /* JADX INFO: renamed from: kc.f$f, reason: collision with other inner class name */
    public class C1991f extends AnimatorListenerAdapter {
        public C1991f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            f.this.i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            f.this.i(4);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            f.this.i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            f.this.i(4);
        }
    }

    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = f.this.f103858f;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            f fVar = f.this;
            ViewGroup viewGroup = fVar.f103860h;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                ViewGroup viewGroup2 = fVar.f103860h;
                viewGroup2.setTranslationX(viewGroup2.getWidth());
                ViewGroup viewGroup3 = fVar.f103860h;
                viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
            }
        }
    }

    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = f.this.f103860h;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = f.this.f103858f;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    public f(androidx.media3.ui.c cVar) {
        this.f103853a = cVar;
        final int i14 = 0;
        this.f103871s = new kc.d(this, i14);
        final int i15 = 3;
        this.f103872t = new kc.d(this, i15);
        int i16 = 5;
        this.f103874v = new kc.d(this, i16);
        this.f103876x = new com.google.android.material.carousel.a(this, i16);
        final int i17 = 1;
        this.f103854b = cVar.findViewById(R.id.exo_controls_background);
        this.f103855c = (ViewGroup) cVar.findViewById(R.id.exo_center_controls);
        this.f103857e = (ViewGroup) cVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) cVar.findViewById(R.id.exo_bottom_bar);
        this.f103856d = viewGroup;
        this.f103861i = (ViewGroup) cVar.findViewById(R.id.exo_time);
        View viewFindViewById = cVar.findViewById(R.id.exo_progress);
        this.f103862j = viewFindViewById;
        this.f103858f = (ViewGroup) cVar.findViewById(R.id.exo_basic_controls);
        this.f103859g = (ViewGroup) cVar.findViewById(R.id.exo_extra_controls);
        this.f103860h = (ViewGroup) cVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = cVar.findViewById(R.id.exo_overflow_show);
        this.f103863k = viewFindViewById2;
        View viewFindViewById3 = cVar.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            int i18 = 8;
            viewFindViewById2.setOnClickListener(new js0.d(this, i18));
            viewFindViewById3.setOnClickListener(new js0.d(this, i18));
        }
        final int i19 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: kc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f103852b;

            {
                this.f103852b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i15) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        f fVar = this.f103852b;
                        View view2 = fVar.f103854b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = fVar.f103855c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = fVar.f103857e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        this.f103852b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        this.f103852b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        f fVar2 = this.f103852b;
                        View view3 = fVar2.f103854b;
                        if (view3 != null) {
                            view3.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = fVar2.f103855c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = fVar2.f103857e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: kc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f103852b;

            {
                this.f103852b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i14) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        f fVar = this.f103852b;
                        View view2 = fVar.f103854b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = fVar.f103855c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = fVar.f103857e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        this.f103852b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        this.f103852b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        f fVar2 = this.f103852b;
                        View view3 = fVar2.f103854b;
                        if (view3 != null) {
                            view3.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = fVar2.f103855c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = fVar2.f103857e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = cVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f103864l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(cVar));
        animatorSet.play(valueAnimatorOfFloat).with(d(0.0f, dimension, viewFindViewById)).with(d(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f103865m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(cVar));
        animatorSet2.play(d(dimension, dimension2, viewFindViewById)).with(d(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f103866n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(cVar));
        animatorSet3.play(valueAnimatorOfFloat).with(d(0.0f, dimension2, viewFindViewById)).with(d(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f103867o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new C1991f());
        animatorSet4.play(valueAnimatorOfFloat2).with(d(dimension, 0.0f, viewFindViewById)).with(d(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f103868p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(d(dimension2, 0.0f, viewFindViewById)).with(d(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f103869q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: kc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f103852b;

            {
                this.f103852b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i17) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        f fVar = this.f103852b;
                        View view2 = fVar.f103854b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = fVar.f103855c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = fVar.f103857e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        this.f103852b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        this.f103852b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        f fVar2 = this.f103852b;
                        View view3 = fVar2.f103854b;
                        if (view3 != null) {
                            view3.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = fVar2.f103855c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = fVar2.f103857e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f103870r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: kc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f103852b;

            {
                this.f103852b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i19) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        f fVar = this.f103852b;
                        View view2 = fVar.f103854b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = fVar.f103855c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = fVar.f103857e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        this.f103852b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        this.f103852b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        f fVar2 = this.f103852b;
                        View view3 = fVar2.f103854b;
                        if (view3 != null) {
                            view3.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = fVar2.f103855c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = fVar2.f103857e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    public static int c(View view2) {
        if (view2 == null) {
            return 0;
        }
        int width = view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator d(float f14, float f15, View view2) {
        return ObjectAnimator.ofFloat(view2, "translationY", f14, f15);
    }

    public static boolean j(View view2) {
        int id3 = view2.getId();
        return id3 == R.id.exo_bottom_bar || id3 == R.id.exo_prev || id3 == R.id.exo_next || id3 == R.id.exo_rew || id3 == R.id.exo_rew_with_amount || id3 == R.id.exo_ffwd || id3 == R.id.exo_ffwd_with_amount;
    }

    public final void a(float f14) {
        ViewGroup viewGroup = this.f103860h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f14) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f103861i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f14);
        }
        ViewGroup viewGroup3 = this.f103858f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f14);
        }
    }

    public final boolean b(View view2) {
        return view2 != null && this.f103877y.contains(view2);
    }

    public final void e(Runnable runnable, long j8) {
        if (j8 >= 0) {
            this.f103853a.postDelayed(runnable, j8);
        }
    }

    public final void f() {
        kc.d dVar = this.f103875w;
        androidx.media3.ui.c cVar = this.f103853a;
        cVar.removeCallbacks(dVar);
        cVar.removeCallbacks(this.f103872t);
        cVar.removeCallbacks(this.f103874v);
        cVar.removeCallbacks(this.f103873u);
    }

    public final void g() {
        if (this.f103878z == 3) {
            return;
        }
        f();
        int showTimeoutMs = this.f103853a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                e(this.f103875w, showTimeoutMs);
            } else if (this.f103878z == 1) {
                e(this.f103873u, 2000L);
            } else {
                e(this.f103874v, showTimeoutMs);
            }
        }
    }

    public final void h(View view2, boolean z14) {
        if (view2 == null) {
            return;
        }
        ArrayList arrayList = this.f103877y;
        if (!z14) {
            view2.setVisibility(8);
            arrayList.remove(view2);
            return;
        }
        if (this.A && j(view2)) {
            view2.setVisibility(4);
        } else {
            view2.setVisibility(0);
        }
        arrayList.add(view2);
    }

    public final void i(int i14) {
        int i15 = this.f103878z;
        this.f103878z = i14;
        androidx.media3.ui.c cVar = this.f103853a;
        if (i14 == 2) {
            cVar.setVisibility(8);
        } else if (i15 == 2) {
            cVar.setVisibility(0);
        }
        if (i15 != i14) {
            Iterator<androidx.media3.ui.c.m> it = cVar.f10043d.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(cVar.getVisibility());
            }
        }
    }

    public final void k() {
        if (!this.C) {
            i(0);
            g();
            return;
        }
        int i14 = this.f103878z;
        if (i14 == 1) {
            this.f103867o.start();
        } else if (i14 == 2) {
            this.f103868p.start();
        } else if (i14 == 3) {
            this.B = true;
        } else if (i14 == 4) {
            return;
        }
        g();
    }
}
