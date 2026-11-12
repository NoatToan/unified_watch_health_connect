package com.huawei.health.suggestion;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.suggestion.h5pro.AiFitnessServiceH5Repository;
import com.huawei.health.suggestion.h5pro.AiSportVoiceH5Repository;
import com.huawei.health.suggestion.h5pro.BodySenseCourseH5Repository;
import com.huawei.health.suggestion.h5pro.BodySenseH5Bridge;
import com.huawei.health.suggestion.h5pro.BodySenseManager;
import com.huawei.health.suggestion.h5pro.CourseDetailH5Bridge;
import com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository;
import com.huawei.health.suggestion.ui.AiFitnessPlanCardFragment;
import com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment;
import com.huawei.health.suggestion.ui.run.activity.fragment.RunPlanFragment;
import com.huawei.health.suggestion.ui.run.activity.fragment.RunRecommendFragment;
import com.huawei.health.suggestion.ui.tabfragments.provider.RopeSkipRecommendCourseProvider;
import com.huawei.health.suggestion.ui.tabfragments.provider.YogaMyCourseProvider;
import com.huawei.health.suggestion.ui.tabfragments.provider.YogaRecommendCourseProvider;
import com.huawei.health.suggestion.ui.tabfragments.provider.YogaSeriesCourseProvider;
import com.huawei.health.suggestion.ui.tabfragments.provider.YogaStatisticProvider;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import defpackage.btx;
import defpackage.deo;
import defpackage.hcs;
import defpackage.hcz;
import defpackage.hdh;
import defpackage.hdp;
import defpackage.hjd;
import defpackage.hot;
import defpackage.hvp;
import defpackage.iem;
import defpackage.iep;
import defpackage.pcd;
import defpackage.pea;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@ApiDefine(uri = FitnessAdviceApi.class)
@Singleton
public class FitnessExternalUtils implements FitnessAdviceApi {
    public static boolean c() {
        return false;
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public PluginSuggestion getPluginSuggestion() {
        return (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public BaseFragment createPlanRecommendFragment(int i) {
        return c(i);
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public BaseFragment createRunRecommendFragment() {
        return RunRecommendFragment.d();
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public BaseFragment createFitnessInstanceFragment(int i, int i2) {
        if (i == 0) {
            return c(i2);
        }
        if (i == 2) {
            return RunRecommendFragment.d();
        }
        if (i == 3) {
            if (b()) {
                return AiFitnessPlanCardFragment.e();
            }
            return null;
        }
        return new BaseFragment();
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public boolean uploadFitnessRecordData(WorkoutRecord workoutRecord) {
        return hcs.c(workoutRecord);
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public Object createFitnessDataProvider(int i) {
        if (i == 1) {
            return new YogaStatisticProvider();
        }
        if (i == 2) {
            return new YogaMyCourseProvider();
        }
        if (i == 3) {
            return new YogaRecommendCourseProvider();
        }
        if (i == 4) {
            return new YogaSeriesCourseProvider();
        }
        if (i != 6) {
            return null;
        }
        return new RopeSkipRecommendCourseProvider();
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public BaseFragment createIntelligencePlanTabFragment() {
        if (b()) {
            return IntelligencePlanFragment.e();
        }
        return null;
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public void createAiFitnessPlanCardView(ViewGroup viewGroup, boolean z) {
        if (b()) {
            iep.e(viewGroup, z);
        }
    }

    public static boolean b() {
        return SportSupportUtil.f();
    }

    public static boolean e() {
        return SportSupportUtil.d();
    }

    public static boolean d() {
        return (Utils.o() || CommonUtil.ca()) ? false : true;
    }

    private BaseFragment c(int i) {
        LogUtil.a("Suggestion_FitnessExternalUtils", "isAiRunPlanOpen ：", Boolean.valueOf(b()));
        return RunPlanFragment.d();
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public void launchMyPlanH5() {
        JumpUtil.e(btx.c());
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public void launchPlanTab() {
        JumpUtil.a(btx.c());
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public void launchTrainDetail(Bundle bundle) {
        if (bundle == null) {
            ReleaseLogUtil.a("Suggestion_FitnessExternalUtils", "launchTrainDetail bundle is null.");
            return;
        }
        ReleaseLogUtil.d("Suggestion_FitnessExternalUtils", "launchTrainDetail bundle:", bundle.toString());
        String string = bundle.getString("workoutid");
        String string2 = bundle.getString("version");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return;
        }
        pcd pcdVar = new pcd(string);
        pcdVar.e(true);
        pcdVar.q(string2);
        pea.a(BaseApplication.getContext(), pcdVar);
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public void jumpFitnessPage(Context context, Uri uri, Bundle bundle) {
        new hot(context, uri, bundle).a();
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public Class<?> getIntelligentPlanH5RepositoryApi() {
        return IntelligentPlanH5Repository.class;
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public Class<?> getBodySenseCourseH5RepositoryApi() {
        return BodySenseCourseH5Repository.class;
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public Class<?> getAiFitnessServiceH5RepositoryApi() {
        return AiFitnessServiceH5Repository.class;
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public Class<? extends JsBaseModule> getBodySenseJsBridgeApi() {
        return BodySenseH5Bridge.class;
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public void jumpToAllCourse(Context context, int i, int i2, String str) {
        JumpUtil.a(context, i, i2, str);
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public Class<?> getAiSportVoiceH5RepositoryApi() {
        return AiSportVoiceH5Repository.class;
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public void sendFitnessLinkCommand(int i) {
        if (i == 1) {
            BodySenseManager.getInstance().resumeFitnessLink();
            return;
        }
        if (i == 2) {
            BodySenseManager.getInstance().pauseFitnessLink();
        } else if (i == 3) {
            BodySenseManager.getInstance().stopFitnessLink();
        } else {
            if (i != 4) {
                return;
            }
            BodySenseManager.getInstance().startFitnessLink();
        }
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public void donateBySportRemind(Map<String, String> map) {
        hvp.c(map);
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public void deleteFitnessCard() {
        hvp.d();
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public Class<? extends JsBaseModule> getCourseDetailH5Bridge() {
        return CourseDetailH5Bridge.class;
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public void startMoreDeviceActivity(Context context) {
        iem.d(context);
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public void startAddHeartRateDevice(Context context) {
        new hjd(new Handler(), context).a(context);
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public void getDeviceSportStatus(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("Suggestion_FitnessExternalUtils", "getDeviceSportStatus callback == null");
        } else if (deo.c()) {
            deo.c(iBaseResponseCallback);
        } else {
            iBaseResponseCallback.a(100000, 0);
        }
    }

    @Override // com.huawei.health.fitnessadvice.api.FitnessAdviceApi
    public void getFoodRecommendDetail(String str, String str2, hcz hczVar, UiCallback<hdh> uiCallback) {
        new hdp().getFoodRecommendDetail(str, str2, hczVar, uiCallback);
    }
}
