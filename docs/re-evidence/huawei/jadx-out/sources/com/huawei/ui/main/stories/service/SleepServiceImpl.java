package com.huawei.ui.main.stories.service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.sleep.SleepApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.h5pro.jsmodules.trade.JsTradeApi;
import com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity;
import defpackage.ddv;
import defpackage.iov;
import defpackage.uit;
import health.compact.a.CommonUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes3.dex */
public class SleepServiceImpl implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        LogUtil.a("SleepServiceImpl", "onPretreatment:", guidepost.g(), " ", guidepost.l());
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.e("SleepServiceImpl", "uri is null.");
            return false;
        }
        LogUtil.a("SleepServiceImpl", "uri:", uriO.getQuery());
        if (e(uriO) == 1) {
            new uit(context, uriO).c();
        } else {
            a(context, uriO);
        }
        return false;
    }

    public static void a(Context context, Uri uri) {
        Intent intent = new Intent(context, (Class<?>) KnitSleepDetailActivity.class);
        intent.putExtra("NTwe23AtQb8U", uri);
        iov.d(context, intent);
    }

    public static void a(String str) {
        H5proUtil.initH5pro();
        H5ProClient.startH5MiniProgram(BaseApplication.getContext(), "com.huawei.health.h5.sleep-management", new H5ProLaunchOption.Builder().setImmerse().showStatusBar().setNeedSoftInputAdapter().setStatusBarTextBlack(true).setForceDarkMode(1).addPath(str).addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("SleepManagementApi", ((SleepApi) Services.b("Main", SleepApi.class)).getSleepManagementH5Bridge()).addCustomizeJsModule("tradeApi", JsTradeApi.class).build());
    }

    public static int e(Uri uri) {
        try {
            int iJ = CommonUtils.j(uri.getQueryParameter(CommonUtil.PAGE_TYPE));
            LogUtil.a("SleepServiceImpl", "type:", Integer.valueOf(iJ));
            return iJ;
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            LogUtil.e("SleepServiceImpl", "get type IllegalArgumentException:", CommonUtil.PAGE_TYPE, LogAnonymous.b(e));
            return -1;
        }
    }

    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
        LogUtil.a("SleepServiceImpl", "init.");
    }
}
