package com.huawei.health.suggestion.service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import defpackage.hot;
import defpackage.iov;
import health.compact.a.AuthorizationUtils;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes2.dex */
public class FitnessPretreatmentServiceImpl implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(final Context context, final Guidepost guidepost) {
        LogUtil.a("Suggestion_FitnessPretreatmentServiceImpl", "onPretreatment:", guidepost.g(), " ", guidepost.l());
        final Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.e("Suggestion_FitnessPretreatmentServiceImpl", "uri is null.");
            return false;
        }
        LoginInit loginInit = LoginInit.getInstance(context);
        String accountInfo = loginInit.getAccountInfo(1011);
        boolean zIsBrowseMode = loginInit.isBrowseMode();
        boolean zC = AuthorizationUtils.c(context);
        int iD = BaseApplication.d("com.huawei.health.MainActivity");
        if ((accountInfo == null && zIsBrowseMode) || !zC || (zIsBrowseMode && iD == -1)) {
            LogUtil.a("Suggestion_FitnessPretreatmentServiceImpl", "StartHealth to MainActivity userID:", accountInfo, " isBrowseMode:", Boolean.valueOf(zIsBrowseMode), " isAuthorized:", Boolean.valueOf(zC), " index:", Integer.valueOf(iD));
            Intent intent = new Intent();
            intent.setClassName(context.getPackageName(), "com.huawei.health.MainActivity");
            intent.putExtra("schemeDataType", 2);
            intent.putExtra(" schemeParamUri", uriO);
            intent.putExtra("needLogin", true);
            iov.d(context, intent);
            return false;
        }
        LogUtil.a("Suggestion_FitnessPretreatmentServiceImpl", "uri:", uriO.getQuery());
        if (((PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class)) == null) {
            LogUtil.j("Suggestion_FitnessPretreatmentServiceImpl", "plugin suggestion not install.");
            Services.c("PluginFitnessAdvice", PluginSuggestion.class, context, new Consumer<PluginSuggestion>() { // from class: com.huawei.health.suggestion.service.FitnessPretreatmentServiceImpl.1
                @Override // com.huawei.framework.servicemgr.Consumer
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void accept(PluginSuggestion pluginSuggestion) {
                    LogUtil.a("Suggestion_FitnessPretreatmentServiceImpl", "PluginSuggestion installed.");
                    new hot(context, uriO, guidepost.d()).a();
                }
            }, true);
        } else {
            new hot(context, uriO, guidepost.d()).a();
        }
        return false;
    }

    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
        LogUtil.a("Suggestion_FitnessPretreatmentServiceImpl", "init.");
    }
}
