package com.huawei.ui.commonui.transition;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.qjb;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.ReleaseLogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public class ActivityTransitionAnimator {
    private static volatile ActivityTransitionAnimator e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f23933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f23934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f23935c;
    private int d;
    private EnterListener f;
    private long g;
    private boolean h;
    private boolean i;
    private ExitListener j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private float p;
    private WeakReference<Activity> r;
    private int t;
    private final Observer q = new c(this);
    private boolean o = true;

    public interface EnterListener {
        void end();

        void start();
    }

    public interface ExitListener {
        void end();

        void start();
    }

    private ActivityTransitionAnimator() {
        int iB = qre.b(R.dimen.cardCornerRadius);
        this.d = iB;
        this.g = 350L;
        ReleaseLogUtil.c("ActivityTransitionAnimator", "ActivityTransitionAnimator mBitmapRadius ", Integer.valueOf(iB), " mDuration ", 350L);
    }

    public static ActivityTransitionAnimator c() {
        if (e == null) {
            synchronized (ActivityTransitionAnimator.class) {
                if (e == null) {
                    e = new ActivityTransitionAnimator();
                }
            }
        }
        return e;
    }

    public static void d() {
        synchronized (ActivityTransitionAnimator.class) {
            if (e != null) {
                e = null;
                ReleaseLogUtil.c("ActivityTransitionAnimator", "release");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(View view, int i) {
        if (view == null) {
            return;
        }
        view.setVisibility(i);
    }

    public boolean a() {
        return (this.k || this.h || this.f23933a == null || this.f23935c == null || this.f23934b == null || !VersionControlUtil.isSupportActivityTransitionAnimation(n()) || !this.m) ? false : true;
    }

    public ActivityTransitionAnimator a(boolean z) {
        this.l = z;
        return this;
    }

    public ActivityTransitionAnimator c(int i) {
        this.n = i;
        return this;
    }

    public ActivityTransitionAnimator d(int i) {
        this.t = i;
        return this;
    }

    public ActivityTransitionAnimator a(Context context) {
        Activity activityJ;
        if (context instanceof Activity) {
            activityJ = (Activity) context;
        } else {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "setDecorViewBitmap context ", context);
            activityJ = BaseApplication.j();
        }
        if (activityJ == null) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "setDecorViewBitmap activity is null");
            return this;
        }
        Window window = activityJ.getWindow();
        if (window == null) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "setDecorViewBitmap window is null");
            return this;
        }
        this.f23933a = qqf.e(window.getDecorView());
        this.h = false;
        this.k = false;
        g();
        return this;
    }

    public ActivityTransitionAnimator a(Activity activity) {
        boolean z = n() == null;
        this.m = z;
        if (z) {
            this.r = new WeakReference<>(activity);
        }
        return this;
    }

    public ActivityTransitionAnimator b(View view) {
        if (view == null) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "setCardParameter view is null");
            return this;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        this.f23935c = qqf.d(qqf.e(view), width, height, this.d);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        this.f23934b = new Rect(i, i2, width + i, height + i2);
        this.h = false;
        this.k = false;
        g();
        return this;
    }

    public ActivityTransitionAnimator d(EnterListener enterListener) {
        this.f = enterListener;
        return this;
    }

    public ActivityTransitionAnimator d(boolean z) {
        this.o = z;
        return this;
    }

    public ActivityTransitionAnimator f() {
        if (this.f23933a == null) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "setBackgroundDrawable mDecorViewBitmap is null");
            return this;
        }
        Activity activityN = n();
        if (activityN == null || activityN.isFinishing() || activityN.isDestroyed()) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "setBackgroundDrawable activity ", activityN);
            return this;
        }
        Window window = activityN.getWindow();
        if (window == null) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "setBackgroundDrawable window is null");
            return this;
        }
        window.setBackgroundDrawable(qqf.d(this.f23933a));
        return this;
    }

    private void g() {
        WeakReference<Activity> weakReference = this.r;
        if (weakReference == null) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "clearActivity mWeakReference is null");
        } else {
            weakReference.clear();
            this.r = null;
        }
    }

    private Activity n() {
        WeakReference<Activity> weakReference = this.r;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private Context l() {
        Activity activityN = n();
        if (activityN == null) {
            activityN = BaseApplication.j();
        }
        return activityN == null ? BaseApplication.b() : activityN;
    }

    private void h() {
        this.h = false;
        ObserverManagerUtil.c(this.q);
        Activity activityN = n();
        if (activityN == null || activityN.isFinishing() || activityN.isDestroyed()) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "finish activity ", activityN);
            return;
        }
        this.i = false;
        this.k = true;
        activityN.finish();
        activityN.overridePendingTransition(0, 0);
        this.f23934b = null;
        this.f23935c = null;
        this.f23933a = null;
        g();
        ReleaseLogUtil.c("ActivityTransitionAnimator", "finish");
    }

    private ViewGroup o() {
        Activity activityN = n();
        if (activityN == null || activityN.isFinishing() || activityN.isDestroyed()) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "getAndroidContentView activity ", activityN);
            return null;
        }
        return (ViewGroup) activityN.findViewById(android.R.id.content);
    }

    private void c(View view, final int i, final int i2, final float f) {
        if (view == null) {
            return;
        }
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.huawei.ui.commonui.transition.ActivityTransitionAnimator.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                if (outline == null) {
                    ReleaseLogUtil.d("ActivityTransitionAnimator", "setOutlineProvider outline is null");
                } else {
                    outline.setRoundRect(0, 0, i, i2, f);
                }
            }
        });
    }

    private void e(View view, int i, int i2) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }

    private void c(int i, int i2, View view, View view2, View view3) {
        c(view3, i, i2, this.p);
        e(view3, i, i2);
        c(view2, i, i2, this.p);
        e(view2, i, i2);
        c(view, i, i2, this.p);
        e(view, i, i2);
    }

    private void a(boolean z, float f, View view, View view2, View view3) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (z) {
            f2 = 1.0f - (3.0f * f);
            f5 = 1.0f - f;
            f4 = 1.0f;
            f3 = f;
        } else {
            f2 = f * 3.0f;
            f3 = 1.0f - f;
            f4 = 0.0f;
            f5 = f;
        }
        view.setAlpha(f2);
        if (view3 == null) {
            view2.setAlpha(f3);
            return;
        }
        view3.setAlpha(f5);
        if (f > 0.5f) {
            view2.setAlpha(f4);
        }
    }

    private View b(ViewGroup viewGroup, int i, int i2) {
        View view = new View(l());
        view.setClipToOutline(true);
        view.setBackgroundColor(qre.e(R.color.colorSubBackground));
        c(view, i, i2, this.d);
        viewGroup.addView(view, 0, new ViewGroup.LayoutParams(i, i2));
        return view;
    }

    private View d(ViewGroup viewGroup, int i, int i2) {
        ImageView imageView = new ImageView(l());
        imageView.setImageBitmap(this.f23935c);
        viewGroup.addView(imageView, new ViewGroup.LayoutParams(i, i2));
        return imageView;
    }

    private View d(ViewGroup viewGroup, View view, int i, int i2) {
        View view2;
        if (view instanceof SurfaceView) {
            ((SurfaceView) view).setZOrderOnTop(false);
            view2 = new View(l());
            view2.setClipToOutline(true);
            view2.setBackgroundColor(qre.e(R.color.colorSubBackground));
            viewGroup.addView(view2, 2, new ViewGroup.LayoutParams(i, i2));
        } else {
            view2 = null;
        }
        view.setClipToOutline(true);
        view.setAlpha(0.0f);
        return view2;
    }

    public void e() {
        ReleaseLogUtil.c("ActivityTransitionAnimator", "enterAnimation mIsConfigurationChanged ", Boolean.valueOf(this.h), " mIsFinish ", Boolean.valueOf(this.k));
        if (this.h || this.k || !VersionControlUtil.isSupportActivityTransitionAnimation(n())) {
            return;
        }
        if (this.f23934b == null) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "enterAnimation mCardRect is null");
            return;
        }
        final ViewGroup viewGroupO = o();
        if (viewGroupO == null) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "enterAnimation viewGroup is null");
            return;
        }
        final int iWidth = this.f23934b.width();
        final int i = this.o ? 0 : this.t;
        final int iM = (qrs.m() - i) - (this.l ? this.n : 0);
        final int i2 = qrs.i(l());
        if (iWidth <= 0 || iM <= 0 || i2 <= 0) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "enterAnimation rectWidth ", Integer.valueOf(iWidth), " screenHeight ", Integer.valueOf(iM), " currentWindowWidth ", Integer.valueOf(i2));
            return;
        }
        ObserverManagerUtil.d(this.q, ObserveLabels.CONFIG_LOCALE);
        ObserverManagerUtil.d(this.q, ObserveLabels.CONFIG_ORIENTATION);
        ObserverManagerUtil.d(this.q, ObserveLabels.CONFIG_SCREEN_LAYOUT);
        ObserverManagerUtil.d(this.q, ObserveLabels.CONFIG_UI_MODE);
        ObserverManagerUtil.d(this.q, ObserveLabels.CONFIG_SCREEN_SIZE);
        ObserverManagerUtil.d(this.q, ObserveLabels.CONFIG_SMALLEST_SCREEN_SIZE);
        ObserverManagerUtil.d(this.q, ObserveLabels.CONFIG_DENSITY);
        ObserverManagerUtil.d(this.q, ObserveLabels.CONFIG_LAYOUT_DIRECTION);
        ObserverManagerUtil.d(this.q, ObserveLabels.CONFIG_FONT_SCALE);
        e(viewGroupO, 8);
        viewGroupO.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.huawei.ui.commonui.transition.ActivityTransitionAnimator.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ReleaseLogUtil.c("ActivityTransitionAnimator", "enterAnimation viewGroup onPreDraw");
                viewGroupO.getViewTreeObserver().removeOnPreDrawListener(this);
                ActivityTransitionAnimator.this.e(viewGroupO, 0);
                ActivityTransitionAnimator.this.c(viewGroupO, iWidth, i, iM, i2);
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ViewGroup viewGroup, int i, int i2, int i3, final int i4) {
        Rect rect = this.f23934b;
        if (rect == null) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "enterAnimation mCardRect is null");
            return;
        }
        final int iHeight = (rect.height() * i4) / i;
        final View viewB = b(viewGroup, i4, iHeight);
        final View viewD = d(viewGroup, i4, iHeight);
        float f = i3;
        float fMax = Math.max(i / i4, this.f23934b.height() / f);
        viewGroup.setScaleX(fMax);
        viewGroup.setScaleY(fMax);
        viewGroup.setTranslationX(this.f23934b.left - ((i4 - i) / 2.0f));
        viewGroup.setTranslationY((this.f23934b.top - ((f / 2.0f) * (1.0f - fMax))) - i2);
        final View childAt = viewGroup.getChildAt(1);
        if (childAt == null) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "enterAnimation mainView is null");
            return;
        }
        final View viewD2 = d(viewGroup, childAt, i4, iHeight);
        e(childAt, i4, iHeight);
        final int i5 = ((i3 + i2) + (this.l ? this.n : 0)) - iHeight;
        viewGroup.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(this.g).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qqb
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.d.d(viewD, childAt, viewD2, iHeight, i5, i4, viewB, valueAnimator);
            }
        }).withEndAction(new Runnable() { // from class: qpy
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(viewB, viewD, childAt, viewD2);
            }
        }).withStartAction(new Runnable() { // from class: qqa
            @Override // java.lang.Runnable
            public final void run() {
                this.f46642b.i();
            }
        }).start();
    }

    public /* synthetic */ void d(View view, View view2, View view3, int i, int i2, int i3, View view4, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (animatedFraction > 0.0f) {
            this.p = this.d / animatedFraction;
        }
        a(true, animatedFraction, view, view2, view3);
        c(i3, (int) (i + (i2 * animatedFraction)), view2, view4, view3);
    }

    public /* synthetic */ void i() {
        this.p = this.d;
        EnterListener enterListener = this.f;
        if (enterListener == null) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "enterAnimation withStartAction mListener is null");
        } else {
            enterListener.start();
            ReleaseLogUtil.c("ActivityTransitionAnimator", "enterAnimation withStartAction");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void c(View view, View view2, View view3, View view4) {
        this.p = this.d;
        if (view4 == null) {
            e(view3, -1, -1);
        } else {
            e(view4, 8);
        }
        e(view, 8);
        e(view2, 8);
        EnterListener enterListener = this.f;
        if (enterListener == null) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "enterAnimationWithEndAction withEndAction mListener is null");
        } else {
            enterListener.end();
            ReleaseLogUtil.c("ActivityTransitionAnimator", "enterAnimationWithEndAction withEndAction");
        }
    }

    public void b() {
        View childAt;
        View childAt2;
        ReleaseLogUtil.c("ActivityTransitionAnimator", "exitAnimation mIsConfigurationChanged ", Boolean.valueOf(this.h), " mIsFinish ", Boolean.valueOf(this.k), " mIsExit ", Boolean.valueOf(this.i));
        if (this.i) {
            return;
        }
        this.i = true;
        if (!VersionControlUtil.isSupportActivityTransitionAnimation(n())) {
            h();
            return;
        }
        if (this.f23934b == null) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "exitAnimation mCardRect is null");
            h();
            return;
        }
        ViewGroup viewGroupO = o();
        if (viewGroupO == null) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "exitAnimation viewGroup is null");
            h();
            return;
        }
        final View childAt3 = viewGroupO.getChildAt(0);
        final View childAt4 = viewGroupO.getChildAt(1);
        if (childAt4 instanceof SurfaceView) {
            childAt = viewGroupO.getChildAt(3);
            childAt2 = viewGroupO.getChildAt(2);
        } else {
            childAt = viewGroupO.getChildAt(2);
            childAt2 = null;
        }
        final View view = childAt;
        if (childAt3 == null || childAt4 == null || view == null) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "exitAnimation backgroundView ", childAt3, " mainView ", childAt4, " imageView ", view);
            h();
            return;
        }
        int iWidth = this.f23934b.width();
        int i = this.o ? 0 : this.t;
        int i2 = this.l ? this.n : 0;
        final int iM = (qrs.m() - i) - i2;
        final int i3 = qrs.i(l());
        if (iWidth <= 0 || iM <= 0 || i3 <= 0) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "exitAnimation rectWidth ", Integer.valueOf(iWidth), " screenHeight ", Integer.valueOf(iM), " currentWindowWidth ", Integer.valueOf(i3));
            h();
            return;
        }
        e(childAt2, 0);
        e(childAt3, 0);
        e(view, 0);
        float f = iM;
        float fMax = Math.max(iWidth / i3, this.f23934b.height() / f);
        float f2 = this.f23934b.top;
        final View view2 = childAt2;
        final int iHeight = ((i + iM) + i2) - ((this.f23934b.height() * i3) / iWidth);
        viewGroupO.animate().scaleX(fMax).scaleY(fMax).translationX(this.f23934b.left - ((i3 - iWidth) / 2.0f)).translationY((f2 - ((f / 2.0f) * (1.0f - fMax))) - i).setDuration(this.g).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qpw
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f46631b.e(view, childAt4, view2, iM, iHeight, i3, childAt3, valueAnimator);
            }
        }).withEndAction(new Runnable() { // from class: qpz
            @Override // java.lang.Runnable
            public final void run() {
                this.f46639b.e(childAt4);
            }
        }).withStartAction(new Runnable() { // from class: qqc
            @Override // java.lang.Runnable
            public final void run() {
                this.f46646b.j();
            }
        }).start();
    }

    public /* synthetic */ void e(View view, View view2, View view3, int i, int i2, int i3, View view4, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (animatedFraction < 1.0f) {
            this.p = this.d / (1.0f - animatedFraction);
        }
        a(false, animatedFraction, view, view2, view3);
        c(i3, (int) (i - (i2 * animatedFraction)), view2, view4, view3);
    }

    public /* synthetic */ void e(View view) {
        this.p = this.d;
        e(view, 8);
        ExitListener exitListener = this.j;
        if (exitListener != null) {
            exitListener.end();
        }
        h();
        ReleaseLogUtil.c("ActivityTransitionAnimator", "exitAnimation withEndAction");
    }

    public /* synthetic */ void j() {
        qjb.c().d();
        this.p = this.d;
        ExitListener exitListener = this.j;
        if (exitListener == null) {
            ReleaseLogUtil.d("ActivityTransitionAnimator", "exitAnimation withStartAction mListener is null");
        } else {
            exitListener.start();
            ReleaseLogUtil.c("ActivityTransitionAnimator", "exitAnimation withStartAction");
        }
    }

    static class c implements Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<ActivityTransitionAnimator> f23942a;

        c(ActivityTransitionAnimator activityTransitionAnimator) {
            this.f23942a = new WeakReference<>(activityTransitionAnimator);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            ActivityTransitionAnimator activityTransitionAnimator = this.f23942a.get();
            if (activityTransitionAnimator == null) {
                ReleaseLogUtil.d("ActivityTransitionAnimator", "InnerObserver notify animator is null");
                return;
            }
            LogUtil.a("ActivityTransitionAnimator", "InnerObserver notify label ", str, " objects ", objArr);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            activityTransitionAnimator.h = true;
        }
    }
}
