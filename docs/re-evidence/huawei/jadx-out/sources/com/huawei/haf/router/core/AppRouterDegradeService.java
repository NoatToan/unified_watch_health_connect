package com.huawei.haf.router.core;

import android.content.Context;
import android.net.Uri;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.NaviCallback;
import com.huawei.haf.router.facade.service.DegradeService;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
final class AppRouterDegradeService implements NaviCallback {
    private final DegradeService d = (DegradeService) AppRouterHelper.a(DegradeService.class);

    AppRouterDegradeService() {
    }

    void a(Context context, Guidepost guidepost) {
        Uri uriC;
        DegradeService degradeService = this.d;
        if ((degradeService == null || !degradeService.onLost(context, guidepost)) && (uriC = AppRouterHelper.d().c()) != null) {
            LogUtil.b("HAF_Degrade", "route degrade uri:", uriC);
            AppRouter.e(uriC).a(context, this);
        }
    }

    @Override // com.huawei.haf.router.NaviCallback
    public void onArrival(Guidepost guidepost) {
        LogUtil.b("HAF_Degrade", "arrival ", "route degrade uri:", guidepost.o());
    }
}
