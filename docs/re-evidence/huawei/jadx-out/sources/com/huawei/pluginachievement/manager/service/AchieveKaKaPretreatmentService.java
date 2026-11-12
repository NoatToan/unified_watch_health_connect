package com.huawei.pluginachievement.manager.service;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import defpackage.lmf;
import defpackage.otl;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class AchieveKaKaPretreatmentService implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        otl otlVarB = otl.b(context);
        if (otlVarB.q() == null || otlVarB.q().getHuid() == null) {
            LogUtil.j("AchieveKaKaPretreatmentService", "onPretreatment userProfile or uid is null!");
            otlVarB.ac();
            if (otlVarB.q() == null || otlVarB.q().getHuid() == null) {
                LogUtil.j("AchieveKaKaPretreatmentService", "onPretreatment getUserProfile or uid is null!");
                return false;
            }
        }
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.j("AchieveKaKaPretreatmentService", "onPretreatment uri is null!");
            return false;
        }
        b(uriO);
        AppRouter.c("/PluginAchievement/AchieveKaKaActivity").b(context);
        return false;
    }

    private void b(Uri uri) {
        if (uri == null) {
            LogUtil.j("AchieveKaKaPretreatmentService", "handleBiAnalytics getData is null");
            return;
        }
        String queryParameter = uri.getQueryParameter("from");
        HashMap map = new HashMap(2);
        if (!TextUtils.isEmpty(queryParameter)) {
            map.put("from", queryParameter);
        }
        Context context = BaseApplication.getContext();
        OpAnalyticsUtil.getInstance().init(context);
        lmf.d().c(LoginInit.getInstance(context).getAccountInfo(1011));
        lmf.d().a(LoginInit.getInstance(context).getAccountInfo(1010));
        lmf.d().c(context, AnalyticsValue.SUCCESSES_KAKA_1100007.value(), map, 0);
    }
}
