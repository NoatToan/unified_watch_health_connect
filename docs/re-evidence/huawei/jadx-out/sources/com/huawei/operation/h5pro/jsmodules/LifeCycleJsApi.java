package com.huawei.operation.h5pro.jsmodules;

import android.content.Intent;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes13.dex */
public class LifeCycleJsApi extends JsBaseModule {
    public final String keyLifeCycle = "lifeCycle";
    public final String keyLifeCycleValue = "onDestroy";

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a(this.TAG, "onDestroy,send ACTION_H5_LIFE_CYCLE LocalBroadcast");
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getContext().getPackageName());
        intent.setAction("com.huawei.health.action.H5_LIFE_CYCLE");
        intent.putExtra("lifeCycle", "onDestroy");
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }
}
