package com.huawei.hwarkuix.oHBrigdePlugin.health;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.peh;
import java.util.ArrayList;
import java.util.List;
import ohos.ace.adapter.capability.bridge.BridgePlugin;
import ohos.ace.adapter.capability.bridge.MethodData;

/* JADX INFO: loaded from: classes10.dex */
public class NativeInvokeHeartRateBridge {
    public static final int DATA_RATE_HEALTH_HRV = 500044;
    public static final int DATA_SEQUENCE_ELECTROCARDIOGRAM = 700009;
    public static final int DATA_SEQUENCE_PPG_OF_ARRHYTHMIA = 700004;
    public static final int DATA_VASCULAR_HEALTH = 400017;
    private static final String R_TAG = "R_ArkUIX_NativeInvokeHeartRateBridge";
    private static final String TAG = "ArkUIX_NativeInvokeHeartRateBridge";
    private final BridgePlugin mInvokeArkuiBridge;
    private List<Integer> mSubscribeSuccessList = new ArrayList(6);
    private HiSubscribeListener mHeartDataListener = new HiSubscribeListener() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeHeartRateBridge.1
        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            LogUtil.a(NativeInvokeHeartRateBridge.TAG, "HiSubscribeListener onResult");
            NativeInvokeHeartRateBridge.this.mSubscribeSuccessList = list;
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            ReleaseLogUtil.c(NativeInvokeHeartRateBridge.R_TAG, "type:", Integer.valueOf(i), " changeKey:", str);
            LogUtil.a(NativeInvokeHeartRateBridge.TAG, " newValue:", peh.c(hiHealthData));
            if (i == 5 || i == 6) {
                if (ArkUIXConstants.DELETE.equals(str)) {
                    NativeInvokeHeartRateBridge.this.refreshHeartRateData(500023);
                }
            } else {
                switch (i) {
                    case NativeInvokeHeartRateBridge.DATA_VASCULAR_HEALTH /* 400017 */:
                    case NativeInvokeHeartRateBridge.DATA_RATE_HEALTH_HRV /* 500044 */:
                    case NativeInvokeHeartRateBridge.DATA_SEQUENCE_PPG_OF_ARRHYTHMIA /* 700004 */:
                    case NativeInvokeHeartRateBridge.DATA_SEQUENCE_ELECTROCARDIOGRAM /* 700009 */:
                        if (ArkUIXConstants.DELETE.equals(str) || ArkUIXConstants.INSERT.equals(str)) {
                            NativeInvokeHeartRateBridge.this.refreshHeartRateData(i);
                        }
                        break;
                }
            }
        }
    };

    public NativeInvokeHeartRateBridge(BridgePlugin bridgePlugin) {
        this.mInvokeArkuiBridge = bridgePlugin;
    }

    public void subscribleHeartData() {
        ReleaseLogUtil.c(R_TAG, "subscribleHeartData enter");
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(Integer.valueOf(DATA_SEQUENCE_ELECTROCARDIOGRAM));
        arrayList.add(Integer.valueOf(DATA_SEQUENCE_PPG_OF_ARRHYTHMIA));
        arrayList.add(Integer.valueOf(DATA_VASCULAR_HEALTH));
        arrayList.add(Integer.valueOf(DATA_RATE_HEALTH_HRV));
        HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(arrayList, this.mHeartDataListener);
        registerHeartRateReceiver();
    }

    private void registerHeartRateReceiver() {
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeHeartRateBridge.2
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                NativeInvokeHeartRateBridge.this.refreshHeartRateData(1);
            }
        }, ObserveLabels.HEART_RATE);
    }

    public void unSubscribeHeartData() {
        ReleaseLogUtil.c(R_TAG, "unSubscribeHeartData enter");
        HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(this.mSubscribeSuccessList, new HiUnSubscribeListener() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeHeartRateBridge$$ExternalSyntheticLambda0
            @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
            public final void onResult(boolean z) {
                LogUtil.a(NativeInvokeHeartRateBridge.TAG, "unSubscribeHeartData isSuccess = ", Boolean.valueOf(z));
            }
        });
        ObserverManagerUtil.a(ObserveLabels.HEART_RATE);
    }

    public void refreshHeartRateData(int i) {
        ReleaseLogUtil.c(R_TAG, "refreshHeartRateData");
        this.mInvokeArkuiBridge.callMethod(new MethodData("freshHealthData", new Object[0]));
    }
}
