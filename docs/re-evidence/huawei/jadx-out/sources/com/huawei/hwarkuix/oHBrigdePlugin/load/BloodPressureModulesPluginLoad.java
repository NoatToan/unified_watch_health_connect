package com.huawei.hwarkuix.oHBrigdePlugin.load;

import android.content.Context;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.bloodpressure.BloodPressureApi;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeBloodPressureBridge;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.dfp;
import defpackage.fdm;
import defpackage.lwx;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import ohos.ace.adapter.capability.bridge.BridgeManager;

/* JADX INFO: loaded from: classes10.dex */
public class BloodPressureModulesPluginLoad extends BaseModulesPluginLoad {
    private static final String R_TAG = "R_ArkUIX_BloodPressureModulesPluginLoad";
    private NativeInvokeBloodPressureBridge mNativeInvokeBloodPressureBridge;

    @Override // com.huawei.hwarkuix.oHBrigdePlugin.load.BaseModulesPluginLoad, com.huawei.hwarkuix.oHBrigdePlugin.load.IPluginLoad
    public void loadPlugin(Context context, BridgeManager bridgeManager, boolean z) {
        ReleaseLogUtil.c(R_TAG, "BloodPressureModulesPluginLoad loadPlugin");
        super.loadPlugin(context, bridgeManager, z);
        NativeInvokeBloodPressureBridge nativeInvokeBloodPressureBridge = new NativeInvokeBloodPressureBridge(getNativeInvokeArkuiBridge());
        this.mNativeInvokeBloodPressureBridge = nativeInvokeBloodPressureBridge;
        nativeInvokeBloodPressureBridge.subscribeBloodPressureData();
        ((BloodPressureApi) Services.d("Main", BloodPressureApi.class)).updOldBloodPressurePlan();
        if (CollectionUtils.a(fdm.d().j()) && CommonUtil.ab(BaseApplication.getContext())) {
            dfp.d();
        }
    }

    @Override // com.huawei.hwarkuix.oHBrigdePlugin.load.BaseModulesPluginLoad, com.huawei.hwarkuix.oHBrigdePlugin.load.IPluginLoad
    public void onDestroy() {
        ReleaseLogUtil.c(R_TAG, "BloodPressureModulesPluginLoad onDestroy");
        super.onDestroy();
        this.mNativeInvokeBloodPressureBridge.unSubscribeBloodPressureData();
        lwx.e();
    }
}
