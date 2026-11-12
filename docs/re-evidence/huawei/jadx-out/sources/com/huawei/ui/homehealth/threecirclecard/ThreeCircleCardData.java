package com.huawei.ui.homehealth.threecirclecard;

import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.threecirclecard.model.StepsViewModel;
import com.huawei.ui.main.stories.me.util.StepCounterSupportUtil;
import defpackage.fft;
import defpackage.ieg;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.lsl;
import defpackage.lua;
import defpackage.qho;
import defpackage.qji;
import defpackage.qre;
import defpackage.qrs;
import defpackage.tbf;
import defpackage.tdy;
import defpackage.uin;
import defpackage.ujq;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class ThreeCircleCardData extends TwoModelBaseCard {
    private Context f;
    private volatile boolean g;
    private HealthTextView h;
    private final int[] j;
    private long k;
    private ThreeCircleCardViewHolder l;
    private final int[] m;

    private void aa() {
    }

    private void w() {
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard
    protected void e() {
    }

    public void i() {
    }

    public ThreeCircleCardData(Context context) {
        super(context);
        this.g = false;
        this.k = System.currentTimeMillis();
        this.j = new int[]{-1, -1, -1};
        this.m = new int[]{-1, -1, -1};
        CommonUtil.d("SCUI_ThreeCircleCardData", "ThreeCircleCardData");
        this.f = context == null ? BaseApplication.getContext() : context;
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        ThreeCircleCardViewHolder threeCircleCardViewHolder = new ThreeCircleCardViewHolder(viewGroup, this.f, false);
        this.l = threeCircleCardViewHolder;
        i(threeCircleCardViewHolder.z);
        h();
        r();
        c("threeCircleCard");
        w();
        j();
        return this.l;
    }

    protected void j() {
        View.OnClickListener onClickListenerB = new View.OnClickListener() { // from class: tbo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48949b.e(view);
            }
        };
        View.OnClickListener onClickListenerB2 = new View.OnClickListener() { // from class: tbk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        };
        View.OnClickListener onClickListenerB3 = new View.OnClickListener() { // from class: tbl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48947a.b(view);
            }
        };
        View.OnClickListener onClickListenerB4 = new View.OnClickListener() { // from class: tbn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(view);
            }
        };
        View.OnClickListener onClickListenerB5 = new View.OnClickListener() { // from class: com.huawei.ui.homehealth.threecirclecard.ThreeCircleCardData.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    return;
                }
                tdy.a(ThreeCircleCardData.this.f, ThreeCircleCardData.this.e, ThreeCircleCardData.this.f26120a, ThreeCircleCardData.this.d, "1");
            }
        };
        Context context = this.f;
        if (context instanceof BaseActivity) {
            onClickListenerB = qji.b(onClickListenerB, (BaseActivity) context, true, AnalyticsValue.HEALTH_HOME_STEP_DETAIL_2010002.value());
            onClickListenerB2 = qji.b(onClickListenerB2, (BaseActivity) this.f, true, AnalyticsValue.HEALTH_HOME_CAL_DETAIL_2010006.value());
            onClickListenerB3 = qji.b(onClickListenerB3, (BaseActivity) this.f, true, AnalyticsValue.HEALTH_TIME_STRENGTH_CLICK_2010098.value());
            onClickListenerB4 = qji.b(onClickListenerB4, (BaseActivity) this.f, true, AnalyticsValue.HEALTH_HOME_STEP_DETAIL_2010002.value());
            onClickListenerB5 = qji.b(onClickListenerB5, (BaseActivity) this.f, true, AnalyticsValue.HEALTH_HOME_CIRCLE_RING_1040091.value());
        }
        LogUtil.a("SCUI_ThreeCircleCardData", "setOnClickListener THREE_CIRCLE_CARD");
        d().d(0, onClickListenerB2);
        d().d(1, onClickListenerB3);
        d().d(2, onClickListenerB4);
        d().e(onClickListenerB5);
        d().c(onClickListenerB);
        m();
    }

    public /* synthetic */ void e(View view) {
        if (qrs.r()) {
            return;
        }
        o();
    }

    public /* synthetic */ void d(View view) {
        if (qrs.r()) {
            return;
        }
        ReleaseLogUtil.d("SCUI_ThreeCircleCardData", "click into calories = ", Integer.valueOf(this.f26120a[0]));
        p();
    }

    public /* synthetic */ void b(View view) {
        if (qrs.r()) {
            return;
        }
        l();
    }

    public /* synthetic */ void a(View view) {
        if (qrs.r()) {
            return;
        }
        ReleaseLogUtil.d("SCUI_ThreeCircleCardData", "click into activeHours = ", Integer.valueOf(this.f26120a[2]));
        tdy.e(this.f);
    }

    private void o() {
        if (WheelChairStateManager.a().d()) {
            qho.e(System.currentTimeMillis(), this.f26120a[6]);
        } else {
            ujq.b(1);
            tdy.d(this.f26121b, this.f, this.f26120a[3], this.f26120a[4]);
        }
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "SCUI_ThreeCircleCardData";
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard
    public void b(int i, int[] iArr, int[] iArr2) {
        super.b(i, iArr, iArr2);
        if (d() != null) {
            ac();
            c(iArr, iArr2);
            LogUtil.a("SCUI_ThreeCircleCardData", "processMsgDetail curData:", Arrays.toString(iArr), " mLast:", Arrays.toString(this.j), "  curGoalValue:", Arrays.toString(iArr2), " mLastGoal:", Arrays.toString(this.m));
            if (b(iArr, this.j) || d(iArr2, this.m)) {
                ad();
            }
        }
    }

    private void ac() {
        d().k();
        d().l();
    }

    private void c(int[] iArr, int[] iArr2) {
        if (WheelChairStateManager.a().d()) {
            a(iArr[6], 0);
            return;
        }
        int i = iArr[3];
        if (i <= 0) {
            LogUtil.a("SCUI_ThreeCircleCardData", "clearStepData tmpStep", Integer.valueOf(i));
            this.k = e(this.k);
        } else {
            a(i, iArr2[3]);
        }
    }

    private long e(long j) {
        if (this.f26121b != null) {
            y();
            if (!lsl.aa(j)) {
                j = System.currentTimeMillis();
                for (int i = 0; i < 3; i++) {
                    d().d(i, 0, this.d[i], false);
                    d().b(i, 0, this.d[i]);
                }
                if (u()) {
                    uin.e().g();
                    d().d(8);
                }
                ObserverManagerUtil.e("closeStepsTips", new Object[0]);
            }
        }
        return j;
    }

    private boolean u() {
        return this.f26120a[3] == 0 && this.f26120a[1] == 0 && this.f26120a[2] == 0 && this.f26120a[0] == 0;
    }

    private void a(int i, int i2) {
        d().a(i, i2);
    }

    private void ad() {
        if (d() == null) {
            LogUtil.a("SCUI_ThreeCircleCardData", "obj.getViewHolder() is null");
            return;
        }
        for (int i = 0; i < 3; i++) {
            e(this.f26120a[i], i, this.d[i]);
        }
    }

    private void e(int i, int i2, int i3) {
        d().d(i2, i, i3, false);
        LogUtil.a("SCUI_ThreeCircleCardData", "updateThreeCircle , update goal", Integer.valueOf(i3), "value", Integer.valueOf(i));
        d().b(i2, i, i3);
    }

    private void y() {
        if (StepCounterSupportUtil.b(BaseApplication.getContext()) == 3) {
            d().a(-1, this.d[3]);
        } else {
            d().a(0, this.d[3]);
        }
    }

    private boolean b(int[] iArr, int[] iArr2) {
        boolean z = false;
        for (int i = 0; i <= 2; i++) {
            int i2 = iArr[i];
            if (i2 != iArr2[i]) {
                z = true;
            }
            iArr2[i] = i2;
        }
        return z;
    }

    private boolean d(int[] iArr, int[] iArr2) {
        boolean z = false;
        for (int i = 0; i <= 2; i++) {
            int i2 = iArr[i];
            if (i2 != iArr2[i]) {
                z = true;
            }
            iArr2[i] = i2;
        }
        return z;
    }

    private void r() {
        LogUtil.a("SCUI_ThreeCircleCardData", "initSwitchBubble");
        if (tbf.b()) {
            LogUtil.j("SCUI_ThreeCircleCardData", "already switch before");
            return;
        }
        ThreeCircleCardViewHolder threeCircleCardViewHolder = this.l;
        if (threeCircleCardViewHolder == null) {
            return;
        }
        HealthTextView healthTextView = threeCircleCardViewHolder.i;
        this.h = healthTextView;
        if (healthTextView == null) {
            LogUtil.j("SCUI_ThreeCircleCardData", "bubble is null");
        } else {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.threecirclecard.ThreeCircleCardData.1
                @Override // java.lang.Runnable
                public void run() {
                    ThreeCircleCardData.this.s();
                }
            }, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        LogUtil.a("SCUI_ThreeCircleCardData", "checkSyncStatusAndShowBubble");
        if (((StepsViewModel) new ViewModelProvider((ViewModelStoreOwner) this.f).get(StepsViewModel.class)).e()) {
            LogUtil.a("SCUI_ThreeCircleCardData", "is syncing, show bubble delay");
            this.g = true;
            return;
        }
        HealthTextView healthTextView = this.h;
        if (healthTextView == null) {
            LogUtil.j("SCUI_ThreeCircleCardData", "bubble is null");
        } else {
            healthTextView.setVisibility(0);
        }
    }

    public void c() {
        LogUtil.a("SCUI_ThreeCircleCardData", "checkDelayStatusAndShowBubble");
        if (!this.g) {
            LogUtil.a("SCUI_ThreeCircleCardData", "no delay");
            return;
        }
        HealthTextView healthTextView = this.h;
        if (healthTextView == null) {
            LogUtil.j("SCUI_ThreeCircleCardData", "bubble is null");
        } else {
            healthTextView.setVisibility(0);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        h();
        ThreeCircleCardViewHolder threeCircleCardViewHolder = this.l;
        if (threeCircleCardViewHolder != null) {
            threeCircleCardViewHolder.m();
        }
        ReleaseLogUtil.d("SCUI_ThreeCircleCardData", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onDestroy() {
        LogUtil.a("SCUI_ThreeCircleCardData", "onDestroy");
        super.onDestroy();
    }

    protected void h() {
        if (d() == null || d().g() == null) {
            LogUtil.a("SCUI_ThreeCircleCardData", "getViewHolder() is null.");
            return;
        }
        d().g().setVisibility(0);
        if (!tdy.b()) {
            v();
        } else {
            x();
        }
    }

    private void v() {
        long jD = lua.d(fft.f34005c, "perfect_three_leaf", 0L);
        int iB = ieg.b(new Date(jD));
        int iB2 = ieg.b(new Date());
        LogUtil.a("SCUI_ThreeCircleCardData", "getPerfectTimeMills:", Long.valueOf(jD), " perfectDate:", Integer.valueOf(iB), " todayDate:", Integer.valueOf(iB2));
        if (jD != 0 && iB == iB2) {
            d().g().setBackground(this.f.getDrawable(R.drawable.perfect_three_leaf_icon));
        } else {
            d().g().setBackground(this.f.getDrawable(R.drawable.three_leaf_icon));
        }
        d().b(R.string.IDS_health_life_bubble_common_text);
        lrd.b(this.l.ax, qre.f(R.string.IDS_health_clover_title));
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        new HashMap().put("click", "1");
        int id = view.getId();
        if (id == R.id.activityLayout || id == R.id.data_layout_activity) {
            ReleaseLogUtil.d("SCUI_ThreeCircleCardData", "click into activityLayout");
            aa();
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.a("SCUI_ThreeCircleCardData", "oonConfigurationChanged");
        ThreeCircleCardViewHolder threeCircleCardViewHolder = this.l;
        if (threeCircleCardViewHolder == null) {
            LogUtil.a("SCUI_ThreeCircleCardData", "onConfigurationChanged holder is null");
        } else {
            threeCircleCardViewHolder.o();
            HandlerExecutor.c(new Runnable() { // from class: tbm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48948c.g();
                }
            }, 100L);
        }
    }

    public /* synthetic */ void g() {
        this.l.m();
    }

    public void f() {
        for (int i = 0; i < 3; i++) {
            d().d(i, 0, this.d[i], false);
        }
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ThreeCircleCardViewHolder d() {
        return this.l;
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard
    public void b(String str, int i) {
        ThreeCircleCardViewHolder threeCircleCardViewHolder = this.l;
        if (threeCircleCardViewHolder != null) {
            lrd.b(threeCircleCardViewHolder.g(), 8);
            this.l.c(8);
        }
        if (!"threeCircleCard".equals(str) || this.i == null) {
            return;
        }
        this.i.d(str, i);
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard
    protected void b() {
        e("calorie", this.f26120a[0], this.d[0]);
        e("MVPA", this.f26120a[1], this.d[1]);
        e("activity", this.f26120a[2], this.d[2]);
        e("walk", this.f26120a[3], this.d[3]);
    }

    private void e(String str, int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put(ParsedFieldTag.TASK_TYPE, str);
        map.put("taskFinishRate", Double.valueOf(UnitUtil.d((i / i2) * 100.0f, 0)));
        lmf.d().c(this.f, AnalyticsValue.HEALTH_EXIT_APP_MODE_COMPLETE_2010117.value(), map, 0);
    }

    private void x() {
        d().g().setBackground(qre.c(R.drawable.health_life_four_leaf_icon));
        lrd.b(this.l.ax, qre.f(R.string.IDS_health_life_title));
    }
}
