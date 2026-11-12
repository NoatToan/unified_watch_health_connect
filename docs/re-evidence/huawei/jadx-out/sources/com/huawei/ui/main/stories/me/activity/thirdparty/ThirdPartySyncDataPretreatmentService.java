package com.huawei.ui.main.stories.me.activity.thirdparty;

import android.content.Context;
import android.net.Uri;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.hihealthservice.hmsauth.HmsAuthApi;
import com.huawei.hms.support.api.entity.common.CommonPickerConstant;
import com.huawei.login.ui.login.LoginInit;
import com.tencent.open.SocialOperation;
import health.compact.a.AuthorizationUtils;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes3.dex */
public class ThirdPartySyncDataPretreatmentService implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        ReleaseLogUtil.c("R_ThirdPartySyncDataPretreatmentService", "enter ThirdPartySyncData pretreatment");
        if (!AuthorizationUtils.c(context)) {
            ReleaseLogUtil.d("R_ThirdPartySyncDataPretreatmentService", "disagree to the privacy agreement, data sync is not allowed");
            return false;
        }
        if (SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
            ReleaseLogUtil.d("R_ThirdPartySyncDataPretreatmentService", "basic service mode, data sync is not allowed");
            return false;
        }
        if (LoginInit.getInstance(context).isBrowseMode()) {
            ReleaseLogUtil.d("R_ThirdPartySyncDataPretreatmentService", "not login, don't intercept");
            return true;
        }
        return ((HmsAuthApi) Services.b("HealthKit", HmsAuthApi.class)).isValidSignature(c(guidepost, "appId"), c(guidepost, SocialOperation.GAME_SIGNATURE), c(guidepost, CommonPickerConstant.RequestParams.KEY_REDIRECT_URL));
    }

    private String c(Guidepost guidepost, String str) {
        Uri uriO = guidepost.o();
        if (uriO != null) {
            return uriO.getQueryParameter(str);
        }
        return "";
    }
}
