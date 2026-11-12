package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.h5pro.service.H5ProServiceLiveTerm;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.operation.h5pro.jsmodules.interfaces.ServiceApiCallback;
import com.huawei.ui.commonui.R;
import defpackage.qpx;

/* JADX INFO: loaded from: classes2.dex */
@H5ProService(liveTerm = H5ProServiceLiveTerm.WEB_VIEW, name = "SleepJsApi")
public class SleepJsApi {
    @H5ProMethod(name = "setManualSleepInsertSuccess")
    public static void setManualSleepInsertSuccess(String str, ServiceApiCallback<String> serviceApiCallback) {
        Context contextB = BaseApplication.b();
        try {
            long j = Long.parseLong(str);
            qpx.e(contextB, contextB.getResources().getString(R.string.IDS_manual_sleep_input_success));
            ObserverManagerUtil.e("FINISH_SLEEP_TAG", Long.valueOf(j));
            serviceApiCallback.onSuccess("success");
        } catch (NumberFormatException unused) {
            serviceApiCallback.onFailure(-1, "time is error");
        }
    }
}
