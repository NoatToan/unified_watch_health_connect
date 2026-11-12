package com.huawei.healthcloud.plugintrack.ui.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import defpackage.juu;
import defpackage.lrd;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ShowDataPanelLayout extends RelativeLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f11291c;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private juu l;
    private int m;
    private LinearLayout n;
    private int o;
    private int p;
    private int q;
    private ImageButton r;
    private HealthColumnRelativeLayout s;
    private View t;
    private View u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f11289a = R.dimen.health_common_420dp;
    public static final int e = R.dimen.health_common_500dp;
    private static final int d = R.dimen.health_common_110dp;

    public interface HeightChangeListener {
        void onFinish(boolean z);
    }

    public ShowDataPanelLayout(Context context) {
        this(context, null);
    }

    public ShowDataPanelLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShowDataPanelLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = false;
        this.j = false;
        this.k = 6;
        this.q = 6;
        this.i = false;
        a(context);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iAbs;
        if (motionEvent == null) {
            return false;
        }
        juu juuVar = this.l;
        if (juuVar != null && juuVar.r()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            d(motionEvent);
        } else if (action == 2 && (iAbs = Math.abs(this.g - ((int) motionEvent.getRawY()))) > Math.abs(this.f - ((int) motionEvent.getRawX())) && iAbs >= 20) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                if (getHeight() < 10 || this.i) {
                    return false;
                }
                int rawY = (int) (this.g - motionEvent.getRawY());
                int rawY2 = (int) (this.p - motionEvent.getRawY());
                this.h = rawY > 0;
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = getHeight() + rawY2;
                setLayoutParams(layoutParams);
                this.p = (int) motionEvent.getRawY();
                juu juuVar = this.l;
                if (juuVar != null) {
                    juuVar.aa();
                }
                return true;
            }
            if (action != 3) {
                return super.onTouchEvent(motionEvent);
            }
        }
        if (this.i) {
            return false;
        }
        this.i = true;
        if (d()) {
            return false;
        }
        int height = getHeight();
        LogUtil.a("Track_ShowDataPanelLayout", "onTouchEvent height ", Integer.valueOf(height), " mMinHeight ", Integer.valueOf(this.o), " mMaxHeight ", Integer.valueOf(this.m), " mIsGoingUp ", Boolean.valueOf(this.h));
        if (height > 0) {
            int i = this.o;
            if (height < i + (i / 3)) {
                e();
            } else if (this.h || height >= (this.m / 10) * 9) {
                c();
            } else {
                e();
            }
        }
        return true;
    }

    public void c(Context context) {
        Drawable drawableD;
        if (this.r == null || (drawableD = qre.d(context, R.drawable.slider_normal)) == null) {
            return;
        }
        this.r.setBackground(qqf.c(drawableD, qre.e(context, R.color.colorPrimary)));
    }

    public void setMainViewHolder(juu juuVar) {
        this.l = juuVar;
    }

    public void setMaxPanelMode(int i) {
        this.k = i;
    }

    public void setPanelMode(int i) {
        this.q = i;
    }

    public int getPanelMode() {
        return this.q;
    }

    public boolean getIsPanelMoving() {
        return this.i;
    }

    public void b(final int i) {
        final int i2 = i - this.f11290b;
        if (Math.abs(i2) < 10 || this.i) {
            return;
        }
        if (this.q == 0) {
            c(i2, i);
            return;
        }
        a();
        int height = getHeight();
        Animator animatorC = c(this, height, height + i2);
        if (animatorC == null) {
            return;
        }
        animatorC.addListener(new b() { // from class: com.huawei.healthcloud.plugintrack.ui.view.ShowDataPanelLayout.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.view.ShowDataPanelLayout.b, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ShowDataPanelLayout.this.i = false;
                ShowDataPanelLayout.this.c(i2, i);
            }
        });
        this.i = true;
        animatorC.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2) {
        this.m += i;
        this.f11290b = i2;
    }

    public void a(final int i, final int i2, final HeightChangeListener heightChangeListener) {
        if (heightChangeListener == null) {
            ReleaseLogUtil.e("Track_ShowDataPanelLayout", "HeightChangeListener is null");
            return;
        }
        if (this.i) {
            heightChangeListener.onFinish(false);
        }
        a();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.m;
        LogUtil.a("Track_ShowDataPanelLayout", "goingDefaultHeight mMaxHeight ", Integer.valueOf(this.m));
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.healthcloud.plugintrack.ui.view.ShowDataPanelLayout.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ShowDataPanelLayout.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ShowDataPanelLayout.this.q = i;
                ShowDataPanelLayout showDataPanelLayout = ShowDataPanelLayout.this;
                showDataPanelLayout.e(showDataPanelLayout.m + i2);
                heightChangeListener.onFinish(true);
                LogUtil.a("Track_ShowDataPanelLayout", " finish goingDefaultHeight");
            }
        });
        setLayoutParams(layoutParams);
        juu juuVar = this.l;
        if (juuVar != null) {
            juuVar.aa();
        }
    }

    private boolean d() {
        Context context = getContext();
        if (!(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        return activity.isDestroyed() || activity.isFinishing();
    }

    private void a(Context context) {
        View viewInflate = View.inflate(context, R.layout.track_sport_real_time_data_layout_new, this);
        this.t = viewInflate;
        this.f11291c = (LinearLayout) viewInflate.findViewById(R.id.halffragment);
        View viewFindViewById = this.t.findViewById(R.id.wholefragment);
        this.u = viewFindViewById;
        viewFindViewById.setClickable(true);
        this.r = (ImageButton) this.t.findViewById(R.id.track_main_page_btn_updown);
        this.s = (HealthColumnRelativeLayout) this.t.findViewById(R.id.layout_operation);
        this.n = (LinearLayout) this.t.findViewById(R.id.layout_lockoperation);
        setLongClickContentDescription(R.string.accessibility_top);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongClickContentDescription(int i) {
        lrd.a(this.r, qre.a(R.string.accessibility_view_handle, qre.f(i)), qre.f(R.string.accessibility_drag_up_and_down));
    }

    private void e() {
        if (this.t == null) {
            LogUtil.e("Track_ShowDataPanelLayout", "performActionUpLowerThanMinHeight(), mRootView == null");
            return;
        }
        if (this.f11291c.getVisibility() != 0) {
            this.u.setVisibility(8);
            this.s.setVisibility(8);
            this.n.setVisibility(8);
            this.f11291c.setVisibility(0);
            this.f11291c.setAlpha(1.0f);
        }
        Animator animatorC = c(this, getHeight(), this.o);
        if (animatorC == null) {
            ReleaseLogUtil.e("Track_ShowDataPanelLayout", "performActionUpLowerThanMinHeight animator is null");
        } else {
            animatorC.addListener(new b() { // from class: com.huawei.healthcloud.plugintrack.ui.view.ShowDataPanelLayout.4
                @Override // com.huawei.healthcloud.plugintrack.ui.view.ShowDataPanelLayout.b, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ShowDataPanelLayout.this.i = false;
                    ShowDataPanelLayout.this.q = 0;
                    ShowDataPanelLayout showDataPanelLayout = ShowDataPanelLayout.this;
                    showDataPanelLayout.e(showDataPanelLayout.o);
                    ShowDataPanelLayout.this.setLongClickContentDescription(R.string.accessibility_bottom);
                }
            });
            animatorC.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        juu juuVar = this.l;
        if (juuVar == null) {
            ReleaseLogUtil.e("Track_ShowDataPanelLayout", "refresh mMainViewHolder is null offset ", Integer.valueOf(i));
            return;
        }
        juuVar.x();
        Context context = getContext();
        this.l.e(((qrs.g(context) - i) / 2) + qrs.s(context));
    }

    private void c() {
        View view = this.t;
        if (view == null) {
            ReleaseLogUtil.e("Track_ShowDataPanelLayout", "performActionUpOverMaxHeight mRootView is null");
            return;
        }
        View viewFindViewById = view.findViewById(R.id.layout_operation);
        View viewFindViewById2 = this.t.findViewById(R.id.layout_lockoperation);
        juu juuVar = this.l;
        if (juuVar != null) {
            if (!juuVar.r()) {
                viewFindViewById.setVisibility(0);
                viewFindViewById2.setVisibility(4);
            } else {
                viewFindViewById.setVisibility(4);
                viewFindViewById2.setVisibility(0);
            }
        }
        this.f11291c.setVisibility(4);
        this.u.setVisibility(0);
        this.u.setAlpha(1.0f);
        Animator animatorC = c(this, getHeight(), this.m);
        if (animatorC == null) {
            ReleaseLogUtil.e("Track_ShowDataPanelLayout", "performActionUpOverMaxHeight animator is null");
        } else {
            animatorC.addListener(new b() { // from class: com.huawei.healthcloud.plugintrack.ui.view.ShowDataPanelLayout.2
                @Override // com.huawei.healthcloud.plugintrack.ui.view.ShowDataPanelLayout.b, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ShowDataPanelLayout.this.i = false;
                    ShowDataPanelLayout showDataPanelLayout = ShowDataPanelLayout.this;
                    showDataPanelLayout.q = showDataPanelLayout.k;
                    ShowDataPanelLayout showDataPanelLayout2 = ShowDataPanelLayout.this;
                    showDataPanelLayout2.e(showDataPanelLayout2.m);
                    ShowDataPanelLayout.this.setLongClickContentDescription(R.string.accessibility_top);
                }
            });
            animatorC.start();
        }
    }

    private void d(MotionEvent motionEvent) {
        this.g = (int) motionEvent.getRawY();
        this.f = (int) motionEvent.getRawX();
        this.p = this.g;
        if (this.j || this.t == null) {
            return;
        }
        this.j = true;
        a();
    }

    private void a() {
        if (this.m > 0) {
            return;
        }
        int height = getHeight();
        if (height == 0) {
            height = qre.b(e);
            int iB = qre.b(f11289a);
            ReleaseLogUtil.e("Track_ShowDataPanelLayout", "calibrateHeight panelHeight is 0 mMaxPanelMode ", Integer.valueOf(this.k), " initMaxHeight ", Integer.valueOf(height), " initHeight ", Integer.valueOf(iB));
            if (this.k != 6) {
                height = iB;
            }
        }
        this.m = height;
        View viewFindViewById = this.t.findViewById(R.id.layout_updown);
        View viewFindViewById2 = this.t.findViewById(R.id.halffragment);
        if (viewFindViewById2 != null) {
            this.o = viewFindViewById2.getHeight() + viewFindViewById2.getPaddingBottom() + viewFindViewById.getHeight();
            int iB2 = qre.b(d);
            int i = this.o;
            if (i < iB2) {
                ReleaseLogUtil.e("Track_ShowDataPanelLayout", "calibrateHeight mMinHeight ", Integer.valueOf(i), " initMinHeight ", Integer.valueOf(iB2));
                this.o = iB2;
            }
        }
        ReleaseLogUtil.d("Track_ShowDataPanelLayout", "calibrateHeight panelHeight ", Integer.valueOf(height), " mMaxHeight ", Integer.valueOf(this.m), " mMinHeight ", Integer.valueOf(this.o), " mIsGoingUp ", Boolean.valueOf(this.h));
    }

    private Animator c(final View view, int i, int i2) {
        if (view == null) {
            return null;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jsk
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f38972a.d(view, valueAnimator);
            }
        });
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = ((Integer) animatedValue).intValue();
            view.setLayoutParams(layoutParams);
            juu juuVar = this.l;
            if (juuVar != null) {
                juuVar.aa();
            }
        }
    }

    class b implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        private b(ShowDataPanelLayout showDataPanelLayout) {
        }
    }
}
