package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.huawei.ui.commonui.searchview.HealthSearchView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class reo {
    private static final Float d = Float.valueOf(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Float f47222a = Float.valueOf(12.0f);
    private static final Float e = Float.valueOf(20.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Float f47224c = Float.valueOf(24.0f);
    private static final Float j = Float.valueOf(48.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Float f47223b = Float.valueOf(0.0f);

    public static void a(Context context, c cVar) {
        int iD;
        if (context == null || cVar == null) {
            return;
        }
        HealthSearchView healthSearchViewE = cVar.e();
        LinearLayout linearLayoutC = cVar.c();
        LinearLayout linearLayoutB = cVar.b();
        CustomTitleBar customTitleBarA = cVar.a();
        if (a(healthSearchViewE, linearLayoutC, linearLayoutB, customTitleBarA) || (iD = d(context)) == 0) {
            return;
        }
        int iE = e(context, e.floatValue());
        int iE2 = e(context, f47224c.floatValue());
        ValueAnimator valueAnimatorE = e((View) healthSearchViewE, true);
        valueAnimatorE.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(healthSearchViewE, iD, iE, iE2, linearLayoutC, linearLayoutB, customTitleBarA) { // from class: reo.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f47225a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f47226b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            float f47227c;
            final /* synthetic */ int d;
            final /* synthetic */ View e;
            final /* synthetic */ int g;
            final /* synthetic */ View h;
            final /* synthetic */ CustomTitleBar j;

            {
                this.h = healthSearchViewE;
                this.f47226b = iD;
                this.g = iE;
                this.d = iE2;
                this.f47225a = linearLayoutC;
                this.e = linearLayoutB;
                this.j = customTitleBarA;
                this.f47227c = -healthSearchViewE.getHeight();
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator == null) {
                    return;
                }
                float fA = reo.a(valueAnimator);
                int height = this.h.getHeight();
                if (height > 0 && height != ((int) (-this.f47227c))) {
                    this.f47227c = -height;
                }
                reo.e(this.h, this.f47226b * fA);
                reo.c(this.h, this.g, this.d, fA);
                reo.c(this.f47225a, fA);
                reo.e(this.h, this.e, fA, this.f47227c);
                this.j.getViewTitle().setAlpha(1.0f - fA);
            }
        });
        b(valueAnimatorE);
    }

    public static void e(Context context, c cVar) {
        final int iD;
        if (context == null || cVar == null) {
            LogUtil.d("SearchAnimationUtils", "context or viewBeans is null");
            return;
        }
        final HealthSearchView healthSearchViewE = cVar.e();
        final LinearLayout linearLayoutC = cVar.c();
        final LinearLayout linearLayoutB = cVar.b();
        final CustomTitleBar customTitleBarA = cVar.a();
        if (a(healthSearchViewE, linearLayoutC, linearLayoutB, customTitleBarA) || (iD = d(context)) == 0) {
            return;
        }
        final int iE = e(context, e.floatValue());
        final int iE2 = e(context, f47224c.floatValue());
        ValueAnimator valueAnimatorE = e((View) healthSearchViewE, false);
        final float translationY = healthSearchViewE.getTranslationY();
        valueAnimatorE.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: reo.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator == null) {
                    return;
                }
                float fA = reo.a(valueAnimator);
                reo.e(healthSearchViewE, iD * fA);
                reo.c(healthSearchViewE, iE, iE2, fA);
                reo.c(linearLayoutC, fA);
                reo.e(healthSearchViewE, linearLayoutB, fA, translationY);
                customTitleBarA.getViewTitle().setAlpha(1.0f - fA);
            }
        });
        b(valueAnimatorE);
    }

    private static boolean a(View view, View view2, View view3, View view4) {
        if (view == null) {
            LogUtil.d("SearchAnimationUtils", "searchView is null");
            return true;
        }
        if (view2 == null) {
            LogUtil.d("SearchAnimationUtils", "searchMask is null");
            return true;
        }
        if (view3 == null) {
            LogUtil.d("SearchAnimationUtils", "searchHolder is null");
            return true;
        }
        if (view4 != null) {
            return false;
        }
        LogUtil.d("SearchAnimationUtils", "titleLayout is null");
        return true;
    }

    private static int d(Context context) {
        int iE = e(context, j.floatValue()) + e(context, f47222a.floatValue());
        if (iE > 0) {
            return iE;
        }
        return 0;
    }

    static ValueAnimator e(View view, boolean z) {
        Context context = view.getContext();
        ValueAnimator valueAnimatorOfFloat = z ? ValueAnimator.ofFloat(f47223b.floatValue(), 1.0f) : ValueAnimator.ofFloat(1.0f, f47223b.floatValue());
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, 17563661));
        valueAnimatorOfFloat.setDuration(300L);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(View view, int i, int i2, float f) {
        view.setPaddingRelative((int) (((-i) * f) + i2), 0, i2, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(View view, float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart((int) f);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(layoutParams);
            marginLayoutParams2.setMargins((int) f, 0, 0, 0);
            marginLayoutParams = marginLayoutParams2;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float a(ValueAnimator valueAnimator) {
        float fFloatValue = f47223b.floatValue();
        Object animatedValue = valueAnimator.getAnimatedValue();
        return animatedValue instanceof Float ? ((Float) animatedValue).floatValue() : fFloatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(View view, View view2, float f, float f2) {
        float f3 = f * f2;
        view.setTranslationY(f3);
        view2.getLayoutParams().height = view.getHeight() + ((int) f3);
        view.requestLayout();
        view2.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(View view, float f) {
        if (view != null) {
            view.setAlpha(f * 0.2f);
        }
    }

    private static void b(Animator animator) {
        if (animator != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(animator);
            animatorSet.start();
        }
    }

    public static int e(Context context, float f) {
        if (context == null) {
            LogUtil.d("SearchAnimationUtils", "dip2px,context is null");
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + d.floatValue());
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LinearLayout f47231a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthSearchView f47232c;
        private LinearLayout d;
        private CustomTitleBar e;

        public CustomTitleBar a() {
            return this.e;
        }

        public void d(CustomTitleBar customTitleBar) {
            this.e = customTitleBar;
        }

        public HealthSearchView e() {
            return this.f47232c;
        }

        public void c(HealthSearchView healthSearchView) {
            this.f47232c = healthSearchView;
        }

        public LinearLayout c() {
            return this.f47231a;
        }

        public void e(LinearLayout linearLayout) {
            this.f47231a = linearLayout;
        }

        public LinearLayout b() {
            return this.d;
        }

        public void a(LinearLayout linearLayout) {
            this.d = linearLayout;
        }
    }
}
