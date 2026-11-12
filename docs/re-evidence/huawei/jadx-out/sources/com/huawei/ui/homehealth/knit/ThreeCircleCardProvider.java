package com.huawei.ui.homehealth.knit;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.homehealth.threecirclecard.model.StepsViewModel;
import com.huawei.ui.main.stories.me.util.StepCounterSupportUtil;
import defpackage.fsb;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.qho;
import defpackage.qji;
import defpackage.qrs;
import defpackage.tdy;
import defpackage.uin;
import defpackage.ujq;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class ThreeCircleCardProvider extends ModelBaseCardProvider {
    private Context i;
    private volatile boolean o = false;
    private long l = System.currentTimeMillis();
    private final int[] n = {-1, -1, -1};
    private final int[] k = {-1, -1, -1};
    private boolean j = true;

    public ThreeCircleCardProvider(Context context) {
        this.i = context;
    }

    @Override // com.huawei.ui.homehealth.knit.ModelBaseCardProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        super.b(context, sectionBean);
        CommonUtil.d("ThreeCircleCardProvider", "ThreeCircleCardData");
        if (context == null) {
            context = BaseApplication.getContext();
        }
        this.i = context;
        if (this.j) {
            e();
            r();
            j();
            l();
            f();
            this.j = false;
        }
    }

    protected void l() {
        s();
        View.OnClickListener onClickListenerB = new View.OnClickListener() { // from class: sqj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48526a.a(view);
            }
        };
        View.OnClickListener onClickListenerB2 = new View.OnClickListener() { // from class: sqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48525c.b(view);
            }
        };
        View.OnClickListener onClickListenerB3 = new View.OnClickListener() { // from class: sql
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48527c.e(view);
            }
        };
        View.OnClickListener onClickListenerB4 = new View.OnClickListener() { // from class: sqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48530b.c(view);
            }
        };
        Context context = this.i;
        if (context instanceof BaseActivity) {
            onClickListenerB = qji.b(onClickListenerB, (BaseActivity) context, true, AnalyticsValue.HEALTH_HOME_CAL_DETAIL_2010006.value());
            onClickListenerB2 = qji.b(onClickListenerB2, (BaseActivity) this.i, true, AnalyticsValue.HEALTH_TIME_STRENGTH_CLICK_2010098.value());
            onClickListenerB3 = qji.b(onClickListenerB3, (BaseActivity) this.i, true, AnalyticsValue.HEALTH_HOME_STEP_DETAIL_2010002.value());
            onClickListenerB4 = qji.b(onClickListenerB4, (BaseActivity) this.i, true, AnalyticsValue.HEALTH_HOME_CIRCLE_RING_1040091.value());
        }
        LogUtil.a("ThreeCircleCardProvider", "setOnClickListener THREE_CIRCLE_CARD");
        this.f.put("THREE_CIRCLE_OUTSIDE_LISTENER", onClickListenerB);
        this.f.put("THREE_CIRCLE_MIDDLE_LISTENER", onClickListenerB2);
        this.f.put("THREE_CIRCLE_INSIDE_LISTENER", onClickListenerB3);
        this.f.put("HOME_STEP_CARD_CLICK_LISTENER", onClickListenerB4);
    }

    public /* synthetic */ void a(View view) {
        if (qrs.r()) {
            return;
        }
        ReleaseLogUtil.d("ThreeCircleCardProvider", "click into calories = ", Integer.valueOf(this.d[0]));
        k();
    }

    public /* synthetic */ void b(View view) {
        if (qrs.r()) {
            return;
        }
        m();
    }

    public /* synthetic */ void e(View view) {
        if (qrs.r()) {
            return;
        }
        ReleaseLogUtil.d("ThreeCircleCardProvider", "click into activeHours = ", Integer.valueOf(this.d[2]));
        tdy.e(this.i);
    }

    public /* synthetic */ void c(View view) {
        if (qrs.r()) {
            return;
        }
        tdy.a(this.i, this.f25607b, this.d, this.h, "1");
    }

    private void s() {
        View.OnClickListener onClickListenerB = new View.OnClickListener() { // from class: sqo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48529b.d(view);
            }
        };
        Context context = this.i;
        if (context instanceof BaseActivity) {
            onClickListenerB = qji.b(onClickListenerB, (BaseActivity) context, true, AnalyticsValue.HEALTH_HOME_STEP_DETAIL_2010002.value());
        }
        this.f.put("STEP_CLICK_LISTENER", onClickListenerB);
    }

    public /* synthetic */ void d(View view) {
        if (qrs.r()) {
            return;
        }
        n();
    }

    protected void k() {
        ujq.d();
        tdy.a(this.g, this.i, this.d[0]);
    }

    protected void m() {
        HashMap map = new HashMap();
        map.put("click", "1");
        lmf.d().c(this.i, AnalyticsValue.HEALTH_TIME_STRENGTH_CLICK_2010098.value(), map, 0);
        ujq.b(4);
        g();
    }

    private void n() {
        if (WheelChairStateManager.a().d()) {
            qho.e(System.currentTimeMillis(), this.d[6]);
        } else {
            ujq.b(1);
            tdy.d(this.g, this.i, this.d[3], this.d[4]);
        }
    }

    @Override // com.huawei.ui.homehealth.knit.ModelBaseCardProvider
    protected void h() {
        e();
        super.h();
        f();
    }

    @Override // com.huawei.ui.homehealth.knit.ModelBaseCardProvider
    public void c(int i, int[] iArr, int[] iArr2) {
        e();
        super.c(i, iArr, iArr2);
        this.f.put("UPDATE_THREE_CIRCLE_LAYOUT", true);
        d(iArr, iArr2);
        LogUtil.a("ThreeCircleCardProvider", "processMsgDetail curData:", Arrays.toString(iArr), " mLast:", Arrays.toString(this.n), "  curGoalValue:", Arrays.toString(iArr2), " mLastGoal:", Arrays.toString(this.k));
        if (e(iArr, this.n) || b(iArr2, this.k)) {
            q();
        }
        f();
    }

    private void d(int[] iArr, int[] iArr2) {
        if (WheelChairStateManager.a().d()) {
            c(iArr[6], 0);
            return;
        }
        int i = iArr[3];
        if (i <= 0) {
            LogUtil.a("ThreeCircleCardProvider", "clearStepData tmpStep", Integer.valueOf(i));
            this.l = d(this.l);
        } else {
            c(i, iArr2[3]);
        }
    }

    private long d(long j) {
        if (this.g != null) {
            p();
            if (!lsl.aa(j)) {
                j = System.currentTimeMillis();
                this.f.put("RESET_ANIMATION", true);
                this.f.put("RESET_TEXT_BY_POSITION", true);
                if (t()) {
                    uin.e().g();
                    this.f.put("SET_FITNESS_DATA_ORIGIN_ICON2VISIBLE", 8);
                }
                ObserverManagerUtil.e("closeStepsTips", new Object[0]);
            }
        }
        return j;
    }

    private boolean t() {
        return this.d[3] == 0 && this.d[1] == 0 && this.d[2] == 0 && this.d[0] == 0;
    }

    private void c(int i, int i2) {
        this.f.put("UPDATE_BOTTOM_DATA_THREE_CIRCLE", new ArrayList<Integer>(i, i2) { // from class: com.huawei.ui.homehealth.knit.ThreeCircleCardProvider.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f25635a;
            final /* synthetic */ int e;

            {
                this.f25635a = i;
                this.e = i2;
                add(Integer.valueOf(i));
                add(Integer.valueOf(i2));
            }
        });
    }

    private void q() {
        this.f.put("UPDATE_THREE_CIRCLE_DATA", true);
    }

    private void p() {
        if (StepCounterSupportUtil.b(BaseApplication.getContext()) == 3) {
            c(-1, this.h[3]);
        } else {
            c(0, this.h[3]);
        }
    }

    private boolean e(int[] iArr, int[] iArr2) {
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

    private void r() {
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.knit.ThreeCircleCardProvider.4
            @Override // java.lang.Runnable
            public void run() {
                ThreeCircleCardProvider.this.o();
            }
        }, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("ThreeCircleCardProvider", "checkSyncStatusAndShowBubble");
        if (((StepsViewModel) new ViewModelProvider((ViewModelStoreOwner) this.i).get(StepsViewModel.class)).e()) {
            LogUtil.a("ThreeCircleCardProvider", "is syncing, show bubble delay");
            this.o = true;
        } else {
            this.f.put("BUBBLE_VISIBLE", 0);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        e();
        this.f.put("SET_THREE_LEAF_ICON", true);
        f();
        ReleaseLogUtil.d("ThreeCircleCardProvider", "finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.ui.homehealth.knit.ModelBaseCardProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        LogUtil.a("ThreeCircleCardProvider", "onDestroy");
        super.onDestroy();
    }

    @Override // com.huawei.ui.homehealth.knit.ModelBaseCardProvider
    protected void c(String str, int i) {
        e();
        this.f.put("AFTER_STEP_CARD_CHANGE", true);
        if ("threeCircleCard".equals(str)) {
            fsb.e(str, i);
        }
        f();
    }

    @Override // com.huawei.ui.homehealth.knit.ModelBaseCardProvider
    protected void b() {
        b("calorie", this.d[0], this.h[0]);
        b("MVPA", this.d[1], this.h[1]);
        b("activity", this.d[2], this.h[2]);
        b("walk", this.d[3], this.h[3]);
    }

    private void b(String str, int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put(ParsedFieldTag.TASK_TYPE, str);
        map.put("taskFinishRate", Double.valueOf(UnitUtil.d((i / i2) * 100.0f, 0)));
        lmf.d().c(this.i, AnalyticsValue.HEALTH_EXIT_APP_MODE_COMPLETE_2010117.value(), map, 0);
    }
}
