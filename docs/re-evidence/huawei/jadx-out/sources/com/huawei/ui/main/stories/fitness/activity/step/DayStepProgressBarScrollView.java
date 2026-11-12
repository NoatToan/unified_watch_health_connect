package com.huawei.ui.main.stories.fitness.activity.step;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView;
import com.huawei.uikit.hwprogressbar.widget.HwProgressBar;
import defpackage.lrd;
import defpackage.njy;
import defpackage.osg;
import defpackage.qgm;
import defpackage.qre;
import defpackage.qrs;
import defpackage.uhv;
import defpackage.wug;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes19.dex */
public class DayStepProgressBarScrollView extends RelativeLayout implements ScrollChartObserverTotalDataView.OnDataChange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthProgressBar f27014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f27015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f27016c;
    private View d;
    private final a e;
    private ImageView f;
    private volatile boolean g;
    private LinearLayout h;
    private volatile boolean i;
    private volatile boolean j;
    private final Handler k;
    private int l;
    private int m;
    private float n;
    private PopupWindow o;

    public DayStepProgressBarScrollView(Context context) {
        super(context);
        this.f27015b = BaseApplication.b();
        this.o = null;
        a aVar = new a();
        this.e = aVar;
        this.m = 0;
        this.l = 0;
        this.k = new Handler(Looper.getMainLooper()) { // from class: com.huawei.ui.main.stories.fitness.activity.step.DayStepProgressBarScrollView.4
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message == null) {
                    LogUtil.j("Step_DayStepProgressBarScrollView", "message is null.");
                    return;
                }
                super.handleMessage(message);
                int i = message.what;
                if (i == 200) {
                    DayStepProgressBarScrollView.this.j();
                } else {
                    if (i != 201) {
                        return;
                    }
                    DayStepProgressBarScrollView.this.getKakaTaskList();
                }
            }
        };
        a(context);
        this.f27016c = context;
        LogUtil.a("Step_DayStepProgressBarScrollView", "Step Goal fetch mGoalValue=", Integer.valueOf(aVar.f27026c));
        i();
    }

    private void a(Context context) {
        View viewInflate = View.inflate(context, R.layout.day_step_progress_layout, this);
        this.d = viewInflate.findViewById(R.id.day_progress_layout);
        this.f27014a = (HealthProgressBar) viewInflate.findViewById(R.id.day_step_progressbar);
        this.h = (LinearLayout) findViewById(R.id.kaka_list_layout);
        this.f = (ImageView) findViewById(R.id.kaka_bubble);
        o();
        this.f27014a.setMax(100);
        this.f27014a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.main.stories.fitness.activity.step.DayStepProgressBarScrollView.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (DayStepProgressBarScrollView.this.e.e == -1) {
                    DayStepProgressBarScrollView.this.e.e = DayStepProgressBarScrollView.this.f27014a.getWidth();
                    if (DayStepProgressBarScrollView.this.e.e != 0) {
                        DayStepProgressBarScrollView dayStepProgressBarScrollView = DayStepProgressBarScrollView.this;
                        dayStepProgressBarScrollView.m = Math.round((dayStepProgressBarScrollView.f27014a.getHeight() * 100.0f) / DayStepProgressBarScrollView.this.e.e);
                        DayStepProgressBarScrollView.this.getKakaTaskList();
                    }
                }
            }
        });
        this.f27014a.setProgressDrawable(qre.c(R.drawable.progress_drawable_section_step));
    }

    public void setKakaListLayoutVisibility(int i) {
        this.h.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getKakaTaskList() {
        wug.d(new e(this));
    }

    private void a(LinearLayout linearLayout, a aVar) {
        int iB;
        if (aVar.f27026c == 0) {
            LogUtil.j("Step_DayStepProgressBarScrollView", "addView goalValue == 0");
            return;
        }
        Collections.sort(aVar.f27025a, new Comparator<osg>() { // from class: com.huawei.ui.main.stories.fitness.activity.step.DayStepProgressBarScrollView.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(osg osgVar, osg osgVar2) {
                if (osgVar == null || osgVar2 == null) {
                    return 0;
                }
                return osgVar.ad() - osgVar2.ad();
            }
        });
        for (osg osgVar : aVar.f27025a) {
            int iAd = osgVar.ad();
            int iJ = CommonUtil.j(osgVar.t());
            if (iJ != 2 && osgVar.ac() != 2) {
                ReleaseLogUtil.d("Step_DayStepProgressBarScrollView", "level ", Integer.valueOf(iAd), "mGoalValue ", Integer.valueOf(aVar.f27026c));
                if (iAd > aVar.f27026c) {
                    return;
                }
                int iRound = Math.round(((iAd * aVar.e) * 1.0f) / aVar.f27026c);
                if (iRound == aVar.e) {
                    iRound = (iRound - qre.b(iJ == 1 ? R.dimen.health_common_20dp : R.dimen.health_common_16dp)) - ((Integer) BaseActivity.getSafeRegionWidth().second).intValue();
                    iB = qre.b(R.dimen.health_common_2dp);
                } else {
                    iB = qre.b(R.dimen.health_common_8dp);
                }
                View viewD = wug.d(iRound - iB, iJ);
                if (viewD instanceof ImageView) {
                    ImageView imageView = (ImageView) viewD;
                    e(iJ, imageView, osgVar);
                    linearLayout.addView(imageView);
                }
            }
        }
    }

    public void e() {
        this.f27014a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.main.stories.fitness.activity.step.DayStepProgressBarScrollView.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                DayStepProgressBarScrollView.this.e.e = DayStepProgressBarScrollView.this.f27014a.getWidth();
                if (DayStepProgressBarScrollView.this.e.e != 0) {
                    DayStepProgressBarScrollView dayStepProgressBarScrollView = DayStepProgressBarScrollView.this;
                    dayStepProgressBarScrollView.m = Math.round((dayStepProgressBarScrollView.f27014a.getHeight() * 100.0f) / DayStepProgressBarScrollView.this.e.e);
                    DayStepProgressBarScrollView.this.getKakaTaskList();
                }
            }
        });
    }

    private void e(int i, final ImageView imageView, final osg osgVar) {
        if (i == 0) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.step.DayStepProgressBarScrollView.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DayStepProgressBarScrollView.this.c(imageView, osgVar.ad(), osgVar.m());
                }
            });
        } else if (i == 1) {
            wug.d(imageView.getDrawable());
            imageView.setOnClickListener(new d(this.f27016c, osgVar));
        } else {
            LogUtil.a("Step_DayStepProgressBarScrollView", "No event is listened on imageView.");
        }
    }

    static class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private osg f27028a;
        private WeakReference<Context> e;

        d(Context context, osg osgVar) {
            this.e = new WeakReference<>(context);
            this.f27028a = osgVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            osg osgVar;
            Context context = this.e.get();
            if (context == null || (osgVar = this.f27028a) == null) {
                LogUtil.e("Step_DayStepProgressBarScrollView", "context == null || mTaskInfo == null");
                return;
            }
            int iM = osgVar.m();
            ReleaseLogUtil.d("Step_DayStepProgressBarScrollView", "addView award ", Integer.valueOf(iM));
            if (context instanceof FitnessStepDetailActivity) {
                ((FitnessStepDetailActivity) context).b(iM, this.f27028a.h(), this.f27028a.ac());
            }
        }
    }

    private void b(float f) {
        LogUtil.a("Step_DayStepProgressBarScrollView", "tmpTotal ", Float.valueOf(f), "goalValue ", Integer.valueOf(this.e.f27026c));
        Context context = this.f27016c;
        if (context instanceof FitnessStepDetailActivity) {
            ((FitnessStepDetailActivity) context).c((int) this.n, this.e.f27026c);
        }
        if (f >= this.e.f27026c && this.e.f27026c != 0) {
            uhv.d(this.f27016c);
        } else {
            uhv.e(this.f27016c, f, this.e.f27026c);
        }
        uhv.c(this.f27016c, this.e.f27026c);
        if (this.e.f27026c != 0 && f != 0.0f) {
            LogUtil.a("Step_DayStepProgressBarScrollView", "mCompletePercent ", Integer.valueOf(uhv.e(f, this.e.f27026c)));
            this.k.sendEmptyMessage(200);
        } else {
            this.f27014a.setProgress(0);
            g();
        }
    }

    private void g() {
        lrd.d(this.d, qre.e(R.plurals.accessibility_step_progress, this.e.f27026c, Integer.valueOf((int) this.n), Integer.valueOf(this.e.f27026c), UnitUtil.e(this.l, 2, 0)), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        HandlerExecutor.b(new Runnable() { // from class: uhi
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a();
            }
        });
    }

    public /* synthetic */ void a() {
        if (this.g && this.j) {
            b(this.n);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView.OnDataChange
    public void onChange(float f) {
        this.l = 0;
        this.n = f;
        this.g = true;
        k();
    }

    public void e(int i) {
        this.h.removeAllViews();
        this.e.f27026c = i;
        LogUtil.a("Step_DayStepProgressBarScrollView", "enter goal", Integer.valueOf(i));
        this.j = true;
        this.l = 0;
        k();
        getKakaTaskList();
    }

    private void i() {
        qgm.c("900200006", new c(this));
    }

    public static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<DayStepProgressBarScrollView> f27027b;

        c(DayStepProgressBarScrollView dayStepProgressBarScrollView) {
            this.f27027b = new WeakReference<>(dayStepProgressBarScrollView);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ReleaseLogUtil.d("Step_DayStepProgressBarScrollView", "GoalInfoCommonListener Enter,data is ", obj);
            DayStepProgressBarScrollView dayStepProgressBarScrollView = this.f27027b.get();
            if (dayStepProgressBarScrollView == null) {
                ReleaseLogUtil.e("Step_DayStepProgressBarScrollView", "scrollView == null");
                return;
            }
            if (obj instanceof Integer) {
                LogUtil.j("Step_DayStepProgressBarScrollView", "data not instance Of integer");
                dayStepProgressBarScrollView.e.f27026c = ((Integer) obj).intValue();
            } else {
                ReleaseLogUtil.a("Step_DayStepProgressBarScrollView", "target is not ready,use default");
            }
            LogUtil.a("Step_DayStepProgressBarScrollView", "mGoalValue is back ");
            dayStepProgressBarScrollView.j = true;
            dayStepProgressBarScrollView.k();
            dayStepProgressBarScrollView.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        int i = this.e.f27026c;
        int iMax = Math.max(uhv.e(this.n, i), this.m);
        float f = this.n;
        if (f <= 0.0f || i <= 0) {
            return;
        }
        float f2 = i;
        float fMin = Math.min(1.0f, (f * 1.0f) / f2);
        if (this.n >= f2) {
            this.l = 100;
            d(fMin, 1000);
        } else {
            this.f.setVisibility(4);
            this.l = iMax;
            this.f27014a.setProgress(iMax, true);
            g();
        }
    }

    public void d(final float f, final int i) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f);
        this.f27014a.setOnSetProgressAnimationDurationListener(new HwProgressBar.OnSetProgressAnimationDurationListener() { // from class: com.huawei.ui.main.stories.fitness.activity.step.DayStepProgressBarScrollView.10
            @Override // com.huawei.uikit.hwprogressbar.widget.HwProgressBar.OnSetProgressAnimationDurationListener
            public long getAnimationDuration(float f2) {
                LogUtil.a("Step_DayStepProgressBarScrollView", "getAnimationDuration is ", Float.valueOf(f2));
                return i;
            }
        });
        this.f27014a.setProgress(this.l, true);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.huawei.ui.main.stories.fitness.activity.step.DayStepProgressBarScrollView.9
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
                if (f >= 1.0f) {
                    DayStepProgressBarScrollView.this.f.setVisibility(0);
                    LogUtil.a("Step_DayStepProgressBarScrollView", "start animation from applyAlphaAnimator");
                    wug.d(DayStepProgressBarScrollView.this.f.getDrawable());
                }
            }
        });
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.start();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ImageView imageView, int i, int i2) {
        if (i < ((int) this.n)) {
            LogUtil.j("Step_DayStepProgressBarScrollView", " mTotalValue greater than level");
            return;
        }
        View viewInflate = LayoutInflater.from(this.f27016c).inflate(R.layout.kaka_receive_popupwindow, (ViewGroup) null);
        boolean z = (((float) i) * 1.0f) / ((float) this.e.f27026c) < 0.5f;
        d(viewInflate, i, i2, z);
        this.o = new PopupWindow(viewInflate, -2, -2);
        viewInflate.measure(0, 0);
        int measuredWidth = viewInflate.getMeasuredWidth();
        int measuredHeight = viewInflate.getMeasuredHeight();
        int[] iArr = new int[2];
        this.o.setOutsideTouchable(true);
        imageView.getLocationOnScreen(iArr);
        int iB = (iArr[1] - measuredHeight) - qre.b(R.dimen.health_common_10dp);
        int iQ = iArr[0];
        int iB2 = qre.b(R.dimen.health_common_48dp);
        if (qrs.ab(this.f27015b) && !LanguageUtil.ba(this.f27015b)) {
            iQ = (int) (((double) iQ) - (((double) qrs.q()) * 0.5d));
        }
        if (LanguageUtil.ba(this.f27015b)) {
            if (z) {
                this.o.showAtLocation(imageView, 0, (iQ - measuredWidth) + iB2, iB);
            } else {
                this.o.showAtLocation(imageView, 0, (iQ + ((int) (imageView.getWidth() * 0.5f))) - iB2, iB);
            }
        } else if (z) {
            this.o.showAtLocation(imageView, 0, (iQ + ((int) (imageView.getWidth() * 0.5f))) - iB2, iB);
        } else {
            this.o.showAtLocation(imageView, 0, (iQ - measuredWidth) + iB2, iB);
        }
        h();
    }

    private void d(View view, int i, int i2, boolean z) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.kaka_tip);
        healthTextView.setMaxWidth((int) (qrs.q() * 0.6f));
        int i3 = i - ((int) this.n);
        healthTextView.setText(qre.a(R.string.IDS_step_kaka_receive, qre.e(R.plurals.IDS_hwh_me_other_target_steps, i3, Integer.valueOf(i3)).replace(String.valueOf(i3), UnitUtil.e(i3, 1, 0)), qre.e(R.plurals.IDS_user_profile_achieve_kaka_unit, i2, Integer.valueOf(i2)).replace(String.valueOf(i2), UnitUtil.e(i2, 1, 0))));
        if (LanguageUtil.ba(this.f27015b)) {
            if (z) {
                healthTextView.setBackgroundResource(R.drawable.kaka_popup_right);
                return;
            } else {
                healthTextView.setBackgroundResource(R.drawable.kaka_popup_left);
                return;
            }
        }
        if (z) {
            healthTextView.setBackgroundResource(R.drawable.kaka_popup_left);
        } else {
            healthTextView.setBackgroundResource(R.drawable.kaka_popup_right);
        }
    }

    private void h() {
        this.k.postDelayed(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.step.DayStepProgressBarScrollView.7
            @Override // java.lang.Runnable
            public void run() {
                if (DayStepProgressBarScrollView.this.o == null || !DayStepProgressBarScrollView.this.o.isShowing()) {
                    return;
                }
                DayStepProgressBarScrollView.this.o.dismiss();
                DayStepProgressBarScrollView.this.o = null;
            }
        }, 2000L);
    }

    public void b() {
        this.k.sendMessage(this.k.obtainMessage(201));
    }

    private void o() {
        int iIntValue;
        int iIntValue2;
        if (f()) {
            iIntValue = ((Integer) BaseActivity.getSafeRegionWidth().first).intValue();
            iIntValue2 = ((Integer) BaseActivity.getSafeRegionWidth().second).intValue();
        } else {
            iIntValue = 0;
            iIntValue2 = 0;
        }
        ViewGroup.LayoutParams layoutParams = this.f27014a.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(iIntValue);
            marginLayoutParams.setMarginEnd(iIntValue2);
        }
        if (f()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.h.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginStart(iIntValue);
            marginLayoutParams2.setMarginEnd(iIntValue2);
        }
    }

    private boolean f() {
        return ((Integer) BaseActivity.getSafeRegionWidth().first).intValue() > 0 || ((Integer) BaseActivity.getSafeRegionWidth().second).intValue() > 0;
    }

    static class e implements ResponseCallback {
        private WeakReference<DayStepProgressBarScrollView> e;

        e(DayStepProgressBarScrollView dayStepProgressBarScrollView) {
            this.e = new WeakReference<>(dayStepProgressBarScrollView);
        }

        @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
        public void onResult(int i, Object obj) {
            WeakReference<DayStepProgressBarScrollView> weakReference = this.e;
            if (weakReference == null) {
                LogUtil.j("Step_DayStepProgressBarScrollView", "KakaResponseCallback mActivityReference == null");
                return;
            }
            DayStepProgressBarScrollView dayStepProgressBarScrollView = weakReference.get();
            if (dayStepProgressBarScrollView == null) {
                LogUtil.j("Step_DayStepProgressBarScrollView", "KakaResponseCallback activity == null");
                return;
            }
            LogUtil.a("Step_DayStepProgressBarScrollView", "errCode ", Integer.valueOf(i));
            if (njy.b(obj, osg.class)) {
                LogUtil.d("Step_DayStepProgressBarScrollView", "objData ", obj.toString());
                dayStepProgressBarScrollView.e.f27025a = (ArrayList) obj;
                dayStepProgressBarScrollView.i = true;
                dayStepProgressBarScrollView.n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.i && this.j) {
            LogUtil.a("Step_DayStepProgressBarScrollView", "is all back, enter Kaka");
            c();
        }
    }

    private void c() {
        HandlerExecutor.b(new Runnable() { // from class: uhm
            @Override // java.lang.Runnable
            public final void run() {
                this.f50097b.d();
            }
        });
    }

    public /* synthetic */ void d() {
        LinearLayout linearLayout = this.h;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        a(this.h, this.e);
    }

    public static class a {
        int e = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27026c = 10000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayList<osg> f27025a = new ArrayList<>(16);

        public String toString() {
            return "mProgressWidth is " + this.e + "mGoalValue is " + this.f27026c + "mTaskListBeanArrayList size," + this.f27025a.size();
        }
    }
}
