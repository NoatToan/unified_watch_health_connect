package com.huawei.basichealthmodel.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.media3.common.C;
import com.huawei.basichealthmodel.R;
import com.huawei.basichealthmodel.callback.CloverTaskStatusOnClickListener;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ucd.cloveranimation.AddFrameListener;
import com.huawei.ucd.cloveranimation.CloverView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.view.Clover;
import defpackage.cbg;
import defpackage.njy;
import defpackage.qqs;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrr;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class CloverTaskStatusView extends LinearLayout implements View.OnClickListener, CloverView.OnPetalClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConstraintLayout f5364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CloverTaskStatusOnClickListener f5365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Clover f5366c;
    private Context d;
    private ImageView e;
    private List<HealthLifeBean> f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthTextView i;
    private ImageView j;
    private HealthTextView k;
    private ImageView l;
    private HealthTextView m;
    private ImageView n;
    private HealthTextView o;
    private int p;
    private View r;
    private ViewStub s;
    private int t;

    public CloverTaskStatusView(Context context) {
        super(context);
        c();
    }

    public CloverTaskStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public CloverTaskStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    private void c() {
        Context contextB = BaseApplication.b();
        this.d = contextB;
        inflate(contextB, R.layout.view_stub_task_status, this);
        if (this.s == null) {
            this.s = (ViewStub) findViewById(R.id.view_stub_task_status);
        }
    }

    private void d() {
        if (this.s.getParent() != null) {
            try {
                this.r = this.s.inflate();
                ReleaseLogUtil.c("R_HL_TaskStatusView", "init inflate");
            } catch (Resources.NotFoundException | InflateException | IllegalArgumentException | IllegalStateException e) {
                ReleaseLogUtil.b("R_HL_TaskStatusView", "init exception ", ExceptionUtils.c(e));
            }
        }
        if (this.r == null) {
            ReleaseLogUtil.d("R_HL_TaskStatusView", "init mView is null");
            return;
        }
        if (this.e == null) {
            ImageView imageView = (ImageView) findViewById(R.id.view_task_status_kaka);
            this.e = imageView;
            imageView.setOnClickListener(this);
        }
        if (this.f5366c == null) {
            Clover clover = (Clover) findViewById(R.id.view_task_status_clover);
            this.f5366c = clover;
            clover.setCloverWithIcon(0.0f, 0.0f, 0.0f);
            this.f5366c.setAddFrameListener(new AddFrameListener() { // from class: cbi
                @Override // com.huawei.ucd.cloveranimation.AddFrameListener
                public final void onFinished() {
                    LogUtil.a("HL_TaskStatusView", "init onFinished");
                }
            });
        }
        if (this.f5364a == null) {
            this.f5364a = (ConstraintLayout) findViewById(R.id.view_task_status_layout);
        }
        if (this.k == null) {
            this.k = (HealthTextView) findViewById(R.id.view_task_status_sport);
        }
        if (this.o == null) {
            this.o = (HealthTextView) findViewById(R.id.view_task_status_sport_value);
        }
        if (this.g == null) {
            this.g = (HealthTextView) findViewById(R.id.view_task_status_mood);
        }
        if (this.i == null) {
            this.i = (HealthTextView) findViewById(R.id.view_task_status_mood_value);
        }
        if (this.h == null) {
            this.h = (HealthTextView) findViewById(R.id.view_task_status_slumber);
        }
        if (this.m == null) {
            this.m = (HealthTextView) findViewById(R.id.view_task_status_slumber_value);
        }
        j();
        g();
        this.f5366c.setPetalClickListener(this);
    }

    private void g() {
        int i;
        if (this.j == null) {
            this.j = (ImageView) findViewById(R.id.view_task_status_mood_arrow);
        }
        if (this.l == null) {
            this.l = (ImageView) findViewById(R.id.view_task_status_slumber_arrow);
        }
        if (this.n == null) {
            this.n = (ImageView) findViewById(R.id.view_task_status_sport_arrow);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.view_task_status_slumber_layout);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(this);
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.view_task_status_sport_layout);
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(this);
        }
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.view_task_status_mood_layout);
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(this);
        }
        boolean zH = h();
        this.j.setVisibility(zH ? 0 : 8);
        this.l.setVisibility(zH ? 0 : 8);
        this.n.setVisibility(zH ? 0 : 8);
        if (zH) {
            if (qqs.e(this.d)) {
                i = com.huawei.ui.commonui.R.drawable.ic_right_grey_update_dark;
            } else {
                i = com.huawei.ui.commonui.R.drawable.ic_right_grey_update;
            }
            Drawable drawableE = LanguageUtil.ba(this.d) ? qqz.e(this.d, i) : ContextCompat.getDrawable(this.d, i);
            this.j.setImageDrawable(drawableE);
            this.l.setImageDrawable(drawableE);
            this.n.setImageDrawable(drawableE);
            int i2 = this.t;
            if (i2 <= 0) {
                LogUtil.j("HL_TaskStatusView", "setArrow mWidth ", Integer.valueOf(i2));
                return;
            }
            int iD = (int) cbg.d((this.t - qre.a(com.huawei.ui.commonui.R.dimen.health_common_188dp)) - qre.a(com.huawei.ui.commonui.R.dimen.health_common_8dp), 0);
            this.i.setMaxWidth(iD);
            this.o.setMaxWidth(iD);
            this.m.setMaxWidth(iD);
        }
    }

    private boolean h() {
        HealthLifeBean healthLifeBean;
        return njy.e(this.f) || (healthLifeBean = this.f.get(0)) == null || this.p == healthLifeBean.getRecordDay();
    }

    private void e(boolean z) {
        Clover clover;
        d();
        View view = this.r;
        if (view == null || (clover = this.f5366c) == null) {
            ReleaseLogUtil.d("R_HL_TaskStatusView", "initClover mView ", view, " mClover ", this.f5366c, " isAllFull ", Boolean.valueOf(z));
            return;
        }
        if (clover.getVisibility() != 0) {
            this.f5366c.setVisibility(0);
        }
        this.f5366c.b();
        this.f5366c.setPlayAllFrameAnimation(true);
        this.f5366c.setAllFull(z);
    }

    private void j() {
        int i = this.t;
        if (i <= 0) {
            LogUtil.j("HL_TaskStatusView", "setLayoutParams mWidth ", Integer.valueOf(i));
        } else {
            i();
        }
    }

    private void i() {
        if (LanguageUtil.ab(this.d)) {
            this.k.setTextSize(1, 9.0f);
            this.o.setTextSize(1, 9.0f);
            this.g.setTextSize(1, 9.0f);
            this.i.setTextSize(1, 9.0f);
            this.h.setTextSize(1, 9.0f);
            this.m.setTextSize(1, 9.0f);
        }
    }

    private Drawable getLastDrawable() {
        return ContextCompat.getDrawable(this.d, R.drawable.icon_growth_value);
    }

    private void e(HealthTextView healthTextView, CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            LogUtil.j("HL_TaskStatusView", "setText charSequence is empty type = ", Integer.valueOf(i));
            this.k.setVisibility(8);
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.o.setVisibility(8);
            this.i.setVisibility(8);
            this.m.setVisibility(8);
            return;
        }
        healthTextView.setText(charSequence);
    }

    private void a(HealthTextView healthTextView, CharSequence charSequence, int i) {
        e(healthTextView, charSequence, i);
        if (LanguageUtil.f(this.d)) {
            healthTextView.setTypeface(qrr.c());
        }
    }

    public void setKakaVisibility(int i) {
        ImageView imageView;
        d();
        View view = this.r;
        if (view == null || (imageView = this.e) == null) {
            ReleaseLogUtil.d("R_HL_TaskStatusView", "setKakaVisibility mView ", view, " mKaka ", this.e, " visibility ", Integer.valueOf(i));
            return;
        }
        imageView.setImageDrawable(getLastDrawable());
        if (this.e.getVisibility() == 0) {
            if (i != 0) {
                this.e.setVisibility(4);
            }
        } else if (i == 0) {
            this.e.setVisibility(0);
        }
    }

    public void setCloverWithIcon(float f, float f2, float f3, boolean z) {
        Clover clover;
        e(z);
        View view = this.r;
        if (view == null || (clover = this.f5366c) == null) {
            ReleaseLogUtil.d("R_HL_TaskStatusView", "setCloverWithIcon mView ", view, " mClover ", this.f5366c, " top ", Float.valueOf(f), " left ", Float.valueOf(f2), " right ", Float.valueOf(f3), " isAllFull ", Boolean.valueOf(z));
        } else {
            clover.setCloverWithIcon(f, f2, f3);
        }
    }

    public void setCloverRunAnimation(float f, float f2, float f3, boolean z, boolean z2) {
        Clover clover;
        e(z);
        View view = this.r;
        if (view == null || (clover = this.f5366c) == null) {
            ReleaseLogUtil.d("R_HL_TaskStatusView", "setCloverRunAnimation mView ", view, " mClover ", this.f5366c, " top ", Float.valueOf(f), " left ", Float.valueOf(f2), " right ", Float.valueOf(f3), " isAllFull ", Boolean.valueOf(z), " isLastBasicTask ", Boolean.valueOf(z2));
            return;
        }
        clover.setCloverRunAnimator(f, f2, f3);
        if (z) {
            if (z2) {
                this.f5366c.postDelayed(new Runnable() { // from class: cbe
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1420b.e();
                    }
                }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            } else {
                this.f5366c.c();
            }
        }
    }

    public /* synthetic */ void e() {
        this.f5366c.c();
    }

    public void setCloverRunGrowAnimation(float f, float f2, float f3, boolean z) {
        Clover clover;
        e(z);
        View view = this.r;
        if (view == null || (clover = this.f5366c) == null) {
            ReleaseLogUtil.d("R_HL_TaskStatusView", "setCloverRunGrowAnimation mView ", view, " mClover ", this.f5366c, " top ", Float.valueOf(f), " left ", Float.valueOf(f2), " right ", Float.valueOf(f3), " isAllFull ", Boolean.valueOf(z));
        } else {
            clover.setCloverRunGrowAnimator(f, f2, f3);
        }
    }

    public void setTaskStatus(SparseArray<CharSequence> sparseArray, SparseArray<CharSequence> sparseArray2, List<HealthLifeBean> list, int i) {
        HealthTextView healthTextView;
        if (sparseArray == null || sparseArray2 == null || njy.e(list)) {
            LogUtil.j("HL_TaskStatusView", "setTaskStatus titleSparseArray is null or valueSparseArray is null");
            return;
        }
        this.f = list;
        this.p = i;
        d();
        View view = this.r;
        if (view == null || this.f5364a == null || (healthTextView = this.k) == null || this.g == null || this.h == null || this.o == null || this.i == null || this.m == null) {
            ReleaseLogUtil.d("R_HL_TaskStatusView", "setTaskStatus mView ", view, " mLayout ", this.f5364a, " mSport ", this.k, " mMood ", this.g, " mSlumber ", this.h, " mSportValue ", this.o, " mMoodValue ", this.i, " mSlumberValue ", this.m);
            return;
        }
        e(healthTextView, sparseArray.get(1), 1);
        e(this.g, sparseArray.get(2), 2);
        e(this.h, sparseArray.get(3), 3);
        a(this.o, sparseArray2.get(1), 1);
        a(this.i, sparseArray2.get(2), 2);
        a(this.m, sparseArray2.get(3), 3);
        if (this.f5364a.getVisibility() != 0) {
            this.f5364a.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            this.f5364a.startAnimation(alphaAnimation);
        }
        j();
    }

    public void setWidth(int i) {
        this.t = i;
    }

    public void b() {
        d();
    }

    public void setAnimationListener(AddFrameListener addFrameListener) {
        Clover clover;
        d();
        View view = this.r;
        if (view == null || (clover = this.f5366c) == null) {
            ReleaseLogUtil.d("R_HL_TaskStatusView", "setAnimationListener mView ", view, " mClover ", this.f5366c, " listener ", addFrameListener);
        } else {
            clover.setAnimEndListener(addFrameListener);
        }
    }

    public void setCloverTaskStatusOnClickListener(CloverTaskStatusOnClickListener cloverTaskStatusOnClickListener) {
        this.f5365b = cloverTaskStatusOnClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("HL_TaskStatusView", "onClick view is null");
            return;
        }
        if (this.f5365b == null) {
            LogUtil.j("HL_TaskStatusView", "onClick mCloverTaskStatusOnClickListener is null");
            return;
        }
        int id = view.getId();
        if (id == R.id.view_task_status_kaka) {
            this.f5365b.onCloverTaskStatusKakaClick();
        }
        if (id == R.id.view_task_status_slumber_layout) {
            this.f5365b.onBasicTaskClick(6);
        }
        if (id == R.id.view_task_status_sport_layout) {
            this.f5365b.onBasicTaskClick(cbg.a(this.f, 1));
        }
        if (id == R.id.view_task_status_mood_layout) {
            this.f5365b.onBasicTaskClick(5);
        }
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView.OnPetalClickListener
    public void onTopClick() {
        CloverTaskStatusOnClickListener cloverTaskStatusOnClickListener = this.f5365b;
        if (cloverTaskStatusOnClickListener != null) {
            cloverTaskStatusOnClickListener.onBasicTaskClick(cbg.a(this.f, 1));
        }
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView.OnPetalClickListener
    public void onLeftClick() {
        CloverTaskStatusOnClickListener cloverTaskStatusOnClickListener = this.f5365b;
        if (cloverTaskStatusOnClickListener != null) {
            cloverTaskStatusOnClickListener.onBasicTaskClick(6);
        }
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView.OnPetalClickListener
    public void onRightClick() {
        CloverTaskStatusOnClickListener cloverTaskStatusOnClickListener = this.f5365b;
        if (cloverTaskStatusOnClickListener != null) {
            cloverTaskStatusOnClickListener.onBasicTaskClick(5);
        }
    }
}
