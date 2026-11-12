package com.huawei.hwarkuix.oHBrigdePlugin.device;

import android.content.Context;
import android.os.Bundle;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.ddq;
import defpackage.ddv;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import ohos.ace.adapter.capability.bridge.BridgePlugin;
import ohos.ace.adapter.capability.bridge.TaskOption;

/* JADX INFO: loaded from: classes37.dex */
public class GolfManagerBridge extends OHProBridgePlugin {
    private static final String TAG = "GolfManagerBridge";
    private static final String TAG_RELEASE = "R_GolfManagerBridge";
    private Context mContext;

    public GolfManagerBridge(Context context, String str, int i) {
        super(context, str, i);
        this.mContext = context;
    }

    public GolfManagerBridge(Context context, String str, int i, BridgePlugin.BridgeType bridgeType) {
        super(context, str, i, bridgeType);
        this.mContext = context;
    }

    public GolfManagerBridge(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
        this.mContext = context;
    }

    public GolfManagerBridge(Context context, String str, BridgeManager bridgeManager, BridgePlugin.BridgeType bridgeType) {
        super(context, str, bridgeManager, bridgeType);
        this.mContext = context;
    }

    public GolfManagerBridge(Context context, String str, BridgeManager bridgeManager, BridgePlugin.BridgeType bridgeType, TaskOption taskOption) {
        super(context, str, bridgeManager, bridgeType, taskOption);
        this.mContext = context;
    }

    public void onGolfMapClick(int i) {
        LogUtil.a(TAG, "onGolfMapClick");
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addCustomizeJsModule(RemoteMessageConst.NOTIFICATION, ddv.b().getCommonJsModule(RemoteMessageConst.NOTIFICATION));
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        builder.addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement"));
        builder.setImmerse();
        builder.showStatusBar();
        ddv.b().loadH5ProApp(this.mContext, "com.huawei.health.h5.golf", builder);
    }

    public void onGolfClubMgrClick(int i) {
        LogUtil.a(TAG, "onGolfClubMgrClick");
        Bundle bundle = new Bundle();
        bundle.putInt(BleConstants.SPORT_TYPE, 263);
        AppRouter.c("/Main/SportHistoryActivity").d(bundle).b(this.mContext);
    }
}
