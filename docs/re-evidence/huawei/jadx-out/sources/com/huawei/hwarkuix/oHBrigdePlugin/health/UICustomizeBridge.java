package com.huawei.hwarkuix.oHBrigdePlugin.health;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.vip.api.EquityApi;
import com.huawei.health.vip.api.VipApi;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import defpackage.qhu;
import defpackage.qrg;
import health.compact.a.Services;
import java.util.List;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import ohos.ace.adapter.capability.bridge.BridgePlugin;

/* JADX INFO: loaded from: classes10.dex */
public class UICustomizeBridge extends OHProBridgePlugin {
    public static final String IS_FIRST_LOGIN_SHOW_DIALOG = "BLOOD_SHOW_DIALOG";
    private static final String R_TAG = "R_ArkUIX_BloodPressureBridge";
    public static final String SHOW_DIALOG_COUNT = "BLOOD_SHOW_DIALOG_COUNT";
    public static final String START_TIME = "BLOOD_START_TIME";
    private static final String TAG = "ArkUIX_BloodPressureBridge";

    public UICustomizeBridge(Context context, String str, int i) {
        super(context, str, i);
    }

    public UICustomizeBridge(Context context, String str, int i, BridgePlugin.BridgeType bridgeType) {
        super(context, str, i, bridgeType);
    }

    public UICustomizeBridge(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
    }

    public UICustomizeBridge(Context context, String str, BridgeManager bridgeManager, BridgePlugin.BridgeType bridgeType) {
        super(context, str, bridgeManager, bridgeType);
    }

    public void showEquityDialog(int i) {
        ReleaseLogUtil.c(R_TAG, "showEquityDialog enter：callbackId:", Integer.valueOf(i));
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi != null) {
            vipApi.startEquityDialogActivity();
        }
        ohProOnSuccess(i, "");
    }

    public void showDeviceBenefitsDialog(int i) {
        long jD;
        int iB;
        ReleaseLogUtil.c(R_TAG, "showDeviceBenefitsDialog enter：callbackId:", Integer.valueOf(i));
        if (qrg.e(IS_FIRST_LOGIN_SHOW_DIALOG)) {
            jD = 0;
            iB = 0;
        } else {
            jD = qrg.d(START_TIME);
            iB = qrg.b(SHOW_DIALOG_COUNT);
        }
        List<DeviceBenefitQueryParam> listD = qhu.d(TAG, DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_ALL);
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi != null) {
            payApi.getAllDeviceBenefits(listD, new DeviceBenefitsCallback(jD, iB));
        }
        ohProOnSuccess(i, "");
    }

    /* JADX INFO: loaded from: classes37.dex */
    class DeviceBenefitsCallback implements IBaseResponseCallback {
        private final int mShowDialogCount;
        private final long mStartTime;

        DeviceBenefitsCallback(long j, int i) {
            this.mStartTime = j;
            this.mShowDialogCount = i;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a(UICustomizeBridge.TAG, "showDeviceBenefitsDialog onResponse errorCode ", Integer.valueOf(i), " object ", obj);
            if (i == 0) {
                ((EquityApi) Services.d("Main", EquityApi.class)).showDeviceEquityDialog(obj, BaseApplication.j(), 2, this.mStartTime, this.mShowDialogCount);
            }
        }
    }
}
