package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.ArmCircumferenceFragment;
import com.huawei.ui.main.stories.health.fragment.BustGirthFragment;
import com.huawei.ui.main.stories.health.fragment.CalvesFragment;
import com.huawei.ui.main.stories.health.fragment.HipLineFragment;
import com.huawei.ui.main.stories.health.fragment.ThighGirthFragment;
import com.huawei.ui.main.stories.health.fragment.WaistGirthFragment;
import com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.AiBodyShapeWaistToHipRatioFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.BodyShapeFragment;
import com.huawei.ui.main.stories.health.util.WeightAndAiBodyShapeCallback;
import defpackage.dnb;
import defpackage.njy;
import defpackage.qpn;
import defpackage.uww;
import defpackage.vei;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class WeightAiBodyDataActivity extends WeightDataActivity {
    private String j = "startTime";
    private String h = "endTime";
    private long i = 0;

    @Override // com.huawei.ui.main.stories.health.activity.healthdata.WeightDataActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27632a.setTitleText(BaseApplication.getContext().getString(R.string.IDS_aibs_ai_body_shape_data));
        Serializable serializableExtra = getIntent().getSerializableExtra("WeightBean");
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.d("HealthWeight_WeightAiBodyDataActivity", "onCreate Intent is null");
            return;
        }
        int intExtra = intent.getIntExtra("position", 0);
        long longExtra = intent.getLongExtra(this.j, this.i);
        long longExtra2 = intent.getLongExtra(this.h, this.i);
        long j = this.i;
        if (longExtra != j && longExtra2 != j) {
            LogUtil.a("HealthWeight_WeightAiBodyDataActivity", "position is ", Integer.valueOf(intExtra), "startTime is ", Long.valueOf(longExtra), "endTime is ", Long.valueOf(longExtra2));
            vei.e(longExtra, longExtra2, new b(this, intExtra));
        } else if (serializableExtra instanceof uww) {
            c();
            b(intExtra, (uww) serializableExtra);
            if (intExtra == 0 && njy.c(this.e, intExtra)) {
                a(this.e.get(intExtra).intValue());
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class b implements WeightAndAiBodyShapeCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27631b;
        private WeakReference<WeightAiBodyDataActivity> d;

        b(WeightAiBodyDataActivity weightAiBodyDataActivity, int i) {
            this.d = new WeakReference<>(weightAiBodyDataActivity);
            this.f27631b = i;
        }

        @Override // com.huawei.ui.main.stories.health.util.WeightAndAiBodyShapeCallback
        public void getWeightAndAIBodyShape(ArrayList<dnb> arrayList, ArrayList<uww> arrayList2) {
            if (njy.e(arrayList2)) {
                LogUtil.d("HealthWeight_WeightAiBodyDataActivity", "GetAiBodyShapeDataCallBack aiBodyData is null");
                return;
            }
            final uww uwwVar = arrayList2.get(0);
            if (uwwVar == null) {
                ReleaseLogUtil.d("HealthWeight_WeightAiBodyDataActivity", "GetAiBodyShapeDataCallBack getWeightAndAIBodyShape aiBodyShapeBean is null");
            } else {
                LogUtil.a("HealthWeight_WeightAiBodyDataActivity", "aiBodyShapeBean is ", uwwVar.toString());
                HandlerExecutor.c(new Runnable() { // from class: uqz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.d(uwwVar);
                    }
                });
            }
        }

        public /* synthetic */ void d(uww uwwVar) {
            WeightAiBodyDataActivity weightAiBodyDataActivity = this.d.get();
            if (weightAiBodyDataActivity != null && !weightAiBodyDataActivity.isFinishing() && !weightAiBodyDataActivity.isDestroyed()) {
                weightAiBodyDataActivity.c();
                weightAiBodyDataActivity.b(this.f27631b, uwwVar);
                if (this.f27631b == 0 && njy.c(weightAiBodyDataActivity.e, this.f27631b)) {
                    weightAiBodyDataActivity.a(weightAiBodyDataActivity.e.get(this.f27631b).intValue());
                    return;
                }
                return;
            }
            ReleaseLogUtil.d("HealthWeight_WeightAiBodyDataActivity", "GetAiBodyShapeDataCallBack getWeightAndAIBodyShape activity ", weightAiBodyDataActivity);
        }
    }

    @Override // com.huawei.ui.main.stories.health.activity.healthdata.WeightDataActivity
    protected String a() {
        return AnalyticsValue.HEALTH_HOME_AI_BODY_DETAIL_TAB_2160131.value();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Context context = BaseApplication.getContext();
        this.f27633b.add(context.getString(R.string.IDS_hw_weight_body_shape));
        this.f27634c.add(new BodyShapeFragment());
        this.e.add(27);
        this.f27633b.add(context.getString(R.string.IDS_weight_waist_to_hip_ratio));
        this.f27634c.add(new AiBodyShapeWaistToHipRatioFragment());
        this.e.add(28);
        this.f27633b.add(context.getString(R.string.IDS_aibs_bust_girth));
        this.f27634c.add(new BustGirthFragment());
        this.e.add(29);
        this.f27633b.add(context.getString(R.string.IDS_aibs_waist_girth));
        this.f27634c.add(new WaistGirthFragment());
        this.e.add(30);
        this.f27633b.add(context.getString(R.string.IDS_aibs_arm_circumference));
        this.f27634c.add(new HipLineFragment());
        this.e.add(31);
        this.f27633b.add(context.getString(R.string.IDS_aibs_large_arm));
        this.f27634c.add(new ArmCircumferenceFragment());
        this.e.add(32);
        this.f27633b.add(context.getString(R.string.IDS_aibs_thigh_girth));
        this.f27634c.add(new ThighGirthFragment());
        this.e.add(33);
        this.f27633b.add(context.getString(R.string.IDS_aibs_calves_girth));
        this.f27634c.add(new CalvesFragment());
        this.e.add(34);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, uww uwwVar) {
        qpn qpnVar = new qpn(this, this.g, this.d);
        int i2 = 0;
        while (i2 < this.f27633b.size()) {
            Bundle bundle = new Bundle();
            Fragment fragment = this.f27634c.get(i2);
            bundle.putSerializable(WeightBodyDataFragment.AI_BODY_SHAPE_BEAN, uwwVar);
            fragment.setArguments(bundle);
            qpnVar.b(this.d.b(this.f27633b.get(i2)), fragment, i == i2);
            i2++;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
