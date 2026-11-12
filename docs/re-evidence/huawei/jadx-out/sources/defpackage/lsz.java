package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.animation.EnterAnimationCallback;
import com.huawei.hwcommonmodel.utils.animation.ExitAnimationCallback;
import com.huawei.hwcommonmodel.utils.animation.ExitAnimationStartCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lsz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ObjectAnimator f40769a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f40771c;
    private ViewGroup d;
    private ValueAnimator e;
    private ExitAnimationStartCallback f;
    private EnterAnimationCallback g;
    private ValueAnimator h;
    private ExitAnimationCallback j;
    private float l;
    private float m;
    private int n;
    private Rect o;
    private int s;
    private Rect q = new Rect();
    private boolean i = false;
    private boolean k = false;
    private List<View> t = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Property<View, Rect> f40770b = new Property<View, Rect>(Rect.class, "bounds") { // from class: lsz.5
        @Override // android.util.Property
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            if (view == null) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(view.getLayoutParams());
            if (rect != null) {
                marginLayoutParams.setMarginStart(rect.left);
                marginLayoutParams.topMargin = rect.top;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams);
                layoutParams.height = rect.height();
                layoutParams.width = rect.width();
                view.setLayoutParams(layoutParams);
            }
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    };

    public lsz(Rect rect, ViewGroup viewGroup) {
        this.o = rect;
        this.d = viewGroup;
    }

    public void e(ViewGroup viewGroup) {
        this.d = viewGroup;
    }

    public void b(ExitAnimationCallback exitAnimationCallback) {
        this.j = exitAnimationCallback;
    }

    public void d(ExitAnimationStartCallback exitAnimationStartCallback) {
        this.f = exitAnimationStartCallback;
    }

    public void c(EnterAnimationCallback enterAnimationCallback) {
        this.g = enterAnimationCallback;
    }

    public void e() {
        Rect rect = this.o;
        if (rect == null || this.d == null) {
            LogUtil.j("ActivityAnimationHelper", "mSourceRect or mBootLayout is null");
            return;
        }
        this.s = rect.right - this.o.left;
        this.n = this.o.bottom - this.o.top;
        this.d.post(new Runnable() { // from class: lsz.4
            @Override // java.lang.Runnable
            public void run() {
                lsz.this.d.getGlobalVisibleRect(lsz.this.q);
                int i = lsz.this.q.right - lsz.this.q.left;
                int i2 = lsz.this.q.bottom - lsz.this.q.top;
                if (i == 0 || i2 == 0) {
                    LogUtil.j("ActivityAnimationHelper", "targetWidth or targetHeight is 0");
                    lsz.this.d.setVisibility(0);
                    return;
                }
                lsz lszVar = lsz.this;
                lszVar.l = lszVar.s / i;
                lsz lszVar2 = lsz.this;
                lszVar2.m = lszVar2.n / i2;
                if (lsz.this.d.getChildCount() > 0) {
                    lsz lszVar3 = lsz.this;
                    lszVar3.f40771c = lszVar3.d.getChildAt(0);
                }
                if (lsz.this.f40771c == null) {
                    lsz.this.d.setVisibility(0);
                    return;
                }
                lsz.this.f();
                lsz.this.i();
                lsz.this.d.postDelayed(new Runnable() { // from class: lsz.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        lsz.this.b();
                    }
                }, 300L);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.d.setOutlineProvider(new ViewOutlineProvider() { // from class: lsz.3
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (outline != null) {
                    outline.setRoundRect(lsz.this.q.left, lsz.this.q.top, lsz.this.q.right, lsz.this.q.bottom, 90.0f);
                }
            }
        });
        this.d.setClipToOutline(true);
        this.f40771c.setOutlineProvider(new ViewOutlineProvider() { // from class: lsz.9
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (outline != null) {
                    outline.setRoundRect(lsz.this.q.left, lsz.this.q.top, lsz.this.q.right, lsz.this.q.bottom, 90.0f);
                }
            }
        });
        this.f40771c.setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        d();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.e.setInterpolator(new DecelerateInterpolator());
        this.e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lsz.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator == null || valueAnimator.getAnimatedValue() == null) {
                    return;
                }
                lsz.this.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.d.setVisibility(0);
        this.e.start();
        EnterAnimationCallback enterAnimationCallback = this.g;
        if (enterAnimationCallback != null) {
            enterAnimationCallback.onEnterAnimationStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(float f) {
        float f2 = this.l;
        float f3 = this.m;
        float f4 = ((1.0f - f3) * f) + f3;
        this.d.setScaleX(((1.0f - f2) * f) + f2);
        this.d.setScaleY(f4);
        float f5 = 1.0f - f;
        this.d.setTranslationX(((this.o.left + ((this.o.right - this.o.left) / 2.0f)) - (this.q.left + ((this.q.right - this.q.left) / 2.0f))) * f5);
        this.d.setTranslationY(((this.o.top + ((this.o.bottom - this.o.top) / 2.0f)) - (this.q.top + ((this.q.bottom - this.q.top) / 2.0f))) * f5);
        View view = this.f40771c;
        if (view != null) {
            if (f4 > 0.0f) {
                float f6 = this.l;
                view.setScaleY((((1.0f - f6) * f) + f6) * (1.0f / f4));
            }
            if (f < 0.01f) {
                this.f40771c.setAlpha(0.0f);
            } else if (f <= 0.5f) {
                this.f40771c.setAlpha((0.4f * f) + 0.8f);
            } else {
                LogUtil.d("ActivityAnimationHelper", "mChildView");
                this.f40771c.setAlpha(1.0f);
            }
        }
        Iterator<View> it = this.t.iterator();
        while (it.hasNext()) {
            it.next().setAlpha(f);
        }
    }

    private void d() {
        this.t.clear();
        View view = this.f40771c;
        if (view == null || !(view instanceof ViewGroup)) {
            return;
        }
        for (int i = 0; i < ((ViewGroup) this.f40771c).getChildCount(); i++) {
            View childAt = ((ViewGroup) this.f40771c).getChildAt(i);
            if (childAt != null && childAt.getVisibility() == 0) {
                this.t.add(childAt);
            }
        }
    }

    private void g() {
        this.d.setBackgroundColor(0);
        d();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lsz.7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator == null || valueAnimator.getAnimatedValue() == null) {
                    return;
                }
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = lsz.this.l;
                float f2 = lsz.this.m;
                lsz.this.d.setScaleX(((f - 1.0f) * fFloatValue) + 1.0f);
                lsz.this.d.setScaleY(((f2 - 1.0f) * fFloatValue) + 1.0f);
                lsz.this.d.setTranslationX(((lsz.this.o.left + ((lsz.this.o.right - lsz.this.o.left) / 2.0f)) - (lsz.this.q.left + ((lsz.this.q.right - lsz.this.q.left) / 2.0f))) * fFloatValue);
                lsz.this.d.setTranslationY(((lsz.this.o.top + ((lsz.this.o.bottom - lsz.this.o.top) / 2.0f)) - (lsz.this.q.top + ((lsz.this.q.bottom - lsz.this.q.top) / 2.0f))) * fFloatValue);
                if (lsz.this.f40771c != null) {
                    float f3 = ((lsz.this.m - 1.0f) * fFloatValue) + 1.0f;
                    if (f3 > 0.0f) {
                        lsz.this.f40771c.setScaleY((((lsz.this.l - 1.0f) * fFloatValue) + 1.0f) * (1.0f / f3));
                    }
                }
                if (fFloatValue > 0.99f) {
                    lsz.this.f40771c.setAlpha(0.0f);
                } else if (fFloatValue >= 0.5f) {
                    lsz.this.f40771c.setAlpha(1.0f - ((fFloatValue - 0.5f) * 0.4f));
                } else {
                    LogUtil.d("ActivityAnimationHelper", "no care");
                }
                Iterator it = lsz.this.t.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setAlpha(1.0f - fFloatValue);
                }
            }
        });
        this.h.addListener(new Animator.AnimatorListener() { // from class: lsz.10
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                lsz.this.f40771c.clearAnimation();
                lsz.this.d.clearAnimation();
            }
        });
        this.h.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d.setAlpha(1.0f);
        this.d.setTranslationX(0.0f);
        this.d.setTranslationY(0.0f);
        this.d.setScaleX(1.0f);
        this.d.setScaleY(1.0f);
        this.d.setBackgroundColor(qqn.d(R.color.colorBackground));
        this.d.setClipToOutline(false);
        View view = this.f40771c;
        if (view != null) {
            view.setAlpha(1.0f);
            this.f40771c.setTranslationX(0.0f);
            this.f40771c.setTranslationY(0.0f);
            this.f40771c.setScaleX(1.0f);
            this.f40771c.setScaleY(1.0f);
            this.f40771c.setClipToOutline(false);
        }
        EnterAnimationCallback enterAnimationCallback = this.g;
        if (enterAnimationCallback != null) {
            enterAnimationCallback.onEnterAnimationEnd();
        }
    }

    public void a() {
        ViewGroup viewGroup;
        if (this.o == null || (viewGroup = this.d) == null || this.f40771c == null) {
            LogUtil.j("ActivityAnimationHelper", "startExit mSourceRect,mBootLayout or mChildView is null");
            ExitAnimationCallback exitAnimationCallback = this.j;
            if (exitAnimationCallback != null) {
                exitAnimationCallback.onExitAnimationEnd();
                return;
            }
            return;
        }
        if (this.i) {
            LogUtil.j("ActivityAnimationHelper", "startExit is doing!");
            return;
        }
        this.i = true;
        viewGroup.setBackgroundColor(qqn.d(R.color.common_transparent));
        ExitAnimationStartCallback exitAnimationStartCallback = this.f;
        if (exitAnimationStartCallback != null) {
            exitAnimationStartCallback.onExitAnimationStart();
        }
        this.f40771c.setOutlineProvider(new ViewOutlineProvider() { // from class: lsz.8
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (outline == null || view == null) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), lsz.c(30.0f));
            }
        });
        this.f40771c.setClipToOutline(true);
        this.d.setOutlineProvider(new ViewOutlineProvider() { // from class: lsz.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (outline == null || view == null) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), lsz.c(30.0f));
            }
        });
        this.d.setClipToOutline(true);
        g();
        this.d.postDelayed(new Runnable() { // from class: lsz.1
            @Override // java.lang.Runnable
            public void run() {
                lsz.this.c();
            }
        }, 300L);
    }

    private boolean j() {
        return this.k && !CommonUtil.bg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.d.setVisibility(4);
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimator = this.f40769a;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.h;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.d.setAlpha(1.0f);
        this.d.setTranslationX(0.0f);
        this.d.setTranslationY(0.0f);
        this.d.setScaleX(1.0f);
        this.d.setScaleY(1.0f);
        this.d.setClipToOutline(false);
        View view = this.f40771c;
        if (view != null) {
            view.setAlpha(1.0f);
            this.f40771c.setTranslationX(0.0f);
            this.f40771c.setTranslationY(0.0f);
            this.f40771c.setScaleX(1.0f);
            this.f40771c.setScaleY(1.0f);
            this.f40771c.setClipToOutline(false);
            if (!j()) {
                this.f40770b.set(this.f40771c, this.q);
            }
        }
        ExitAnimationCallback exitAnimationCallback = this.j;
        if (exitAnimationCallback != null) {
            exitAnimationCallback.onExitAnimationEnd();
        }
        this.i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float c(float f) {
        return f * BaseApplication.getContext().getResources().getDisplayMetrics().density;
    }
}
