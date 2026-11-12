package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.BasalMetabolicRateFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.BodyAgeFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.BodyMassIndexFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.BodyShapeFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.BodyTypeFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.BodyWeightFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.BoneMineralContentFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.FatFreeFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.FatRateFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.HeartRateFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.MuscleMassFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.PressureIndexFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.ProteinFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.RelativeAppendicularSkeletalMuscleFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.SkeletalMuscleFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.TotalBodyWaterFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.VisceralFatGradeFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.WaistToHipRatioFragment;
import com.huawei.ui.main.stories.health.util.WeightAndAiBodyShapeCallback;
import defpackage.dnb;
import defpackage.njy;
import defpackage.qpn;
import defpackage.uww;
import defpackage.vcw;
import defpackage.vdo;
import defpackage.vei;
import health.compact.a.HiDateUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class WeightBodyDataActivity extends WeightDataActivity {
    private boolean f;
    private boolean j;
    private boolean n;
    private int o;
    private int l = 0;
    private long m = 0;
    private boolean h = false;
    private boolean i = false;

    @Override // com.huawei.ui.main.stories.health.activity.healthdata.WeightDataActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        HiAggregateOption hiAggregateOption;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("HealthWeight_WeightBodyDataActivity", "onCreate Intent is null");
            return;
        }
        this.l = intent.getIntExtra("start_type", this.l);
        this.m = intent.getLongExtra("start_time", this.m);
        this.h = intent.getBooleanExtra("is_show_change", this.h);
        this.i = intent.getBooleanExtra("isGuestMeasure", this.i);
        this.j = !vdo.a();
        this.n = intent.getBooleanExtra("isWeight", false);
        this.f = intent.getBooleanExtra("isBodyType", false);
        this.o = intent.getIntExtra("position", 0);
        dnb dnbVar = (dnb) intent.getSerializableExtra("WeightBean");
        LogUtil.a("HealthWeight_WeightBodyDataActivity", "onCreate mStartType ", Integer.valueOf(this.l), " mStartTime ", Long.valueOf(this.m), " mIsShowChange ", Boolean.valueOf(this.h), " mIsGuestMeasure ", Boolean.valueOf(this.i), " mIsHideCard ", Boolean.valueOf(this.j), " mIsWeight ", Boolean.valueOf(this.n), " mIsBodyType ", Boolean.valueOf(this.f), " mPosition ", Integer.valueOf(this.o), " weightBean ", dnbVar);
        if (dnbVar == null) {
            long longExtra = intent.getLongExtra("startTime", 0L);
            long longExtra2 = intent.getLongExtra("endTime", 0L);
            boolean booleanExtra = intent.getBooleanExtra("showTips", false);
            LogUtil.a("HealthWeight_WeightBodyDataActivity", "onCreate startTime ", Long.valueOf(longExtra), " endTime ", Long.valueOf(longExtra2), " isAiBodyShape ", Boolean.valueOf(booleanExtra));
            HiAggregateOption hiAggregateOption2 = new HiAggregateOption();
            hiAggregateOption2.setTimeRange(longExtra, longExtra2);
            hiAggregateOption2.setAggregateType(1);
            hiAggregateOption2.setGroupUnitType(0);
            hiAggregateOption2.setCount(1);
            if (booleanExtra) {
                hiAggregateOption = new HiAggregateOption();
                hiAggregateOption.setTimeRange(HiDateUtil.p(longExtra), HiDateUtil.g(longExtra2));
                hiAggregateOption.setAggregateType(1);
                hiAggregateOption.setGroupUnitType(0);
                hiAggregateOption.setCount(1);
                hiAggregateOption.setSortOrder(1);
            } else {
                hiAggregateOption = null;
            }
            vei.d(MultiUsersManager.INSTANCE.getCurrentUser(), hiAggregateOption2, hiAggregateOption, new b(this));
            return;
        }
        c(dnbVar);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class b implements WeightAndAiBodyShapeCallback {
        private final WeakReference<WeightBodyDataActivity> d;

        b(WeightBodyDataActivity weightBodyDataActivity) {
            this.d = new WeakReference<>(weightBodyDataActivity);
        }

        @Override // com.huawei.ui.main.stories.health.util.WeightAndAiBodyShapeCallback
        public void getWeightAndAIBodyShape(ArrayList<dnb> arrayList, ArrayList<uww> arrayList2) {
            if (njy.e(arrayList)) {
                LogUtil.j("HealthWeight_WeightBodyDataActivity", "InnerWeightAndAiBodyShapeCallback list ", arrayList);
                return;
            }
            WeightBodyDataActivity weightBodyDataActivity = this.d.get();
            if (weightBodyDataActivity == null || weightBodyDataActivity.isFinishing() || weightBodyDataActivity.isDestroyed()) {
                LogUtil.j("HealthWeight_WeightBodyDataActivity", "InnerWeightAndAiBodyShapeCallback getWeightAndAIBodyShape activity ", weightBodyDataActivity);
                return;
            }
            dnb dnbVar = arrayList.get(0);
            vei.a(dnbVar, njy.b(arrayList2) ? arrayList2.get(0) : null);
            weightBodyDataActivity.c(dnbVar);
        }
    }

    @Override // com.huawei.ui.main.stories.health.activity.healthdata.WeightDataActivity
    protected String a() {
        return AnalyticsValue.HEALTH_HOME_BODY_DETAIL_TAB_2030065.value();
    }

    private int e() {
        int iIndexOf = (this.e == null || this.e.isEmpty()) ? 0 : this.e.indexOf(13);
        LogUtil.a("HealthWeight_WeightBodyDataActivity", "getBodyTypePosition position ", Integer.valueOf(iIndexOf));
        return iIndexOf;
    }

    private void o(dnb dnbVar) {
        if (dnbVar == null) {
            LogUtil.j("HealthWeight_WeightBodyDataActivity", "initFragment WeightBean is null");
            return;
        }
        j(dnbVar);
        b(dnbVar);
        l(dnbVar);
        t(dnbVar);
        q(dnbVar);
        p(dnbVar);
        y(dnbVar);
        i(dnbVar);
        e(dnbVar);
        a(dnbVar);
        r(dnbVar);
        h(dnbVar);
        s(dnbVar);
        n(dnbVar);
        f(dnbVar);
        d(dnbVar);
        m(dnbVar);
        k(dnbVar);
    }

    private void j(dnb dnbVar) {
        if (dnbVar.isVisible(0, this.j)) {
            this.f27633b.add(vcw.j(0));
            this.e.add(0);
            this.f27634c.add(new BodyWeightFragment());
        }
    }

    private void b(dnb dnbVar) {
        if (dnbVar.isVisible(2, this.j)) {
            this.f27633b.add(vcw.a(0));
            this.e.add(2);
            this.f27634c.add(new BodyMassIndexFragment());
        }
    }

    private void l(dnb dnbVar) {
        if (dnbVar.isVisible(1, this.j)) {
            this.f27633b.add(vcw.h(0));
            this.e.add(1);
            this.f27634c.add(new FatRateFragment());
        }
    }

    private void t(dnb dnbVar) {
        if (dnbVar.isVisible(10, this.j)) {
            this.f27633b.add(vcw.n(0));
            this.e.add(10);
            this.f27634c.add(new SkeletalMuscleFragment());
        }
    }

    private void q(dnb dnbVar) {
        if (dnbVar.isVisible(5, this.j)) {
            this.f27633b.add(vcw.q(0));
            this.e.add(5);
            this.f27634c.add(new VisceralFatGradeFragment());
        }
    }

    private void p(dnb dnbVar) {
        if (dnbVar.isVisible(26, this.j)) {
            this.f27633b.add(vcw.o(0));
            this.e.add(26);
            this.f27634c.add(new RelativeAppendicularSkeletalMuscleFragment());
        }
    }

    private void y(dnb dnbVar) {
        if (dnbVar.isVisible(25, this.j)) {
            if (dnbVar.as() > 0.0d) {
                this.f27633b.add(getResources().getString(R.string.IDS_weight_waist_to_hip_ratio));
            } else {
                this.f27633b.add(vcw.p(0));
            }
            this.e.add(25);
            this.f27634c.add(new WaistToHipRatioFragment());
        }
    }

    private void i(dnb dnbVar) {
        if (dnbVar.isVisible(13, this.j)) {
            this.f27633b.add(vcw.c(0));
            this.e.add(13);
            this.f27634c.add(new BodyTypeFragment());
        }
    }

    private void e(dnb dnbVar) {
        if (dnbVar.isVisible(27, this.j)) {
            this.f27633b.add(vcw.b(0));
            this.e.add(27);
            this.f27634c.add(new BodyShapeFragment());
        }
    }

    private void a(dnb dnbVar) {
        if (dnbVar.isVisible(4, this.j)) {
            this.f27633b.add(vcw.d(0));
            this.e.add(4);
            this.f27634c.add(new BasalMetabolicRateFragment());
        }
    }

    private void r(dnb dnbVar) {
        if (dnbVar.isVisible(3, this.j)) {
            this.f27633b.add(vcw.s(0));
            this.e.add(3);
            this.f27634c.add(new TotalBodyWaterFragment());
        }
    }

    private void h(dnb dnbVar) {
        if (dnbVar.isVisible(7, this.j)) {
            this.f27633b.add(vcw.f(0));
            this.e.add(7);
            this.f27634c.add(new BoneMineralContentFragment());
        }
    }

    private void s(dnb dnbVar) {
        if (dnbVar.isVisible(8, this.j)) {
            this.f27633b.add(vcw.l(0));
            this.e.add(8);
            this.f27634c.add(new ProteinFragment());
        }
    }

    private void n(dnb dnbVar) {
        if (dnbVar.isVisible(6, this.j)) {
            this.f27633b.add(vcw.k(0));
            this.e.add(6);
            this.f27634c.add(new MuscleMassFragment());
        }
    }

    private void f(dnb dnbVar) {
        if (dnbVar.isVisible(14, this.j)) {
            this.f27633b.add(vcw.i(0));
            this.e.add(14);
            this.f27634c.add(new FatFreeFragment());
        }
    }

    private void d(dnb dnbVar) {
        if (dnbVar.isVisible(9, this.j)) {
            this.f27633b.add(vcw.e(0));
            this.e.add(9);
            this.f27634c.add(new BodyAgeFragment());
        }
    }

    private void m(dnb dnbVar) {
        if (dnbVar.isVisible(11, this.j)) {
            this.f27633b.add(vcw.g(0));
            this.e.add(11);
            this.f27634c.add(new HeartRateFragment());
        }
    }

    private void k(dnb dnbVar) {
        if (dnbVar.isVisible(12, this.j)) {
            this.f27633b.add(vcw.m(0));
            this.e.add(12);
            this.f27634c.add(new PressureIndexFragment());
        }
    }

    private void a(int i, dnb dnbVar) {
        qpn qpnVar = new qpn(this, this.g, this.d);
        int i2 = 0;
        while (i2 < this.f27633b.size()) {
            Bundle bundle = new Bundle();
            bundle.putInt("start_type", this.l);
            bundle.putLong("start_time", this.m);
            bundle.putBoolean("is_show_change", this.h);
            bundle.putSerializable("WeightBean", dnbVar);
            bundle.putBoolean("isGuestMeasure", this.i);
            bundle.putBoolean("is_oversea", Utils.o());
            Fragment fragment = this.f27634c.get(i2);
            fragment.setArguments(bundle);
            qpnVar.b(this.d.b(this.f27633b.get(i2)), fragment, i == i2);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(final dnb dnbVar) {
        int iE;
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: uqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50474a.c(dnbVar);
                }
            });
            return;
        }
        o(dnbVar);
        if (this.n) {
            iE = this.o;
        } else {
            iE = this.f ? e() : this.o + 1;
        }
        if (iE == 0 && njy.c(this.e, iE)) {
            a(this.e.get(iE).intValue());
        }
        a(iE, dnbVar);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
