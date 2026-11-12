package com.huawei.healthosa.location;

import android.content.Context;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.healthosa.HealthOsaApi;
import com.huawei.healthosa.h5.OsaServiceForH5Interaction;
import com.huawei.operation.h5pro.jsmodules.ArkUIJsApi;
import defpackage.ddv;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes33.dex */
public class OsaServiceForLocationInteraction implements HealthOsaApi {
    private static final Object LOCK = new Object();
    private static final String TAG = "OsaServiceForLocationInteraction";
    private static OsaServiceForLocationInteraction mInteraction;

    @Override // com.huawei.healthosa.HealthOsaApi
    public void initialize(HealthOsaApi healthOsaApi) {
    }

    private static OsaServiceForLocationInteraction getInstance() {
        synchronized (LOCK) {
            if (mInteraction == null) {
                mInteraction = new OsaServiceForLocationInteraction();
            }
        }
        return mInteraction;
    }

    @Override // com.huawei.healthosa.HealthOsaApi
    public void startOsaH5(Context context, String str) {
        LogUtil.c(TAG, "startOsaH5");
        ddv ddvVarB = ddv.b();
        ddvVarB.initH5Pro();
        H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.sleep-apnea", new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).addCustomizeJsModule("healthosa", OsaServiceForH5Interaction.class).addCustomizeJsModule("device", ddvVarB.getCommonJsModule("device")).addCustomizeJsModule("ecgJsModule", ddvVarB.getCommonJsModule("ecgJsModule")).addCustomizeJsModule("healthengine", ddvVarB.getCommonJsModule("healthengine")).addCustomizeJsModule(ArkUIJsApi.MODEL, ddvVarB.getCommonJsModule(ArkUIJsApi.MODEL)).setImmerse().showStatusBar().setStatusBarTextBlack(true).setNeedSoftInputAdapter().setForceDarkMode(1).addPath("#/?from=" + str).build());
    }

    @Override // com.huawei.healthosa.HealthOsaApi
    public Class<? extends JsBaseModule> getOsaJsModule(String str) {
        if ("healthosa".equals(str)) {
            return OsaServiceForH5Interaction.class;
        }
        LogUtil.e(TAG, "getOsaJsModule: ", str, " not implemented");
        return JsBaseModule.class;
    }
}
