package com.huawei.hwarkuix.oHBrigdePlugin.health;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.peh;
import defpackage.qdm;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import ohos.ace.adapter.capability.bridge.BridgePlugin;
import ohos.ace.adapter.capability.bridge.MethodData;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class NativeInvokeEmotionBridge {
    public static final int EMOTION_TYPE = 500031;
    private static final String R_TAG = "R_ArkUIX_NativeInvokeEmotionBridge";
    public static final String STRESS_TAG = "NATIVE_STRESS_RESULT";
    private static final String TAG = "ArkUIX_NativeInvokeEmotionBridge";
    private final BridgePlugin mInvokeArkuiBridge;
    private BroadcastReceiver mSyncStatusBroadcastReceiver;
    private List<Integer> mSubscribeSuccessList = new ArrayList(2);
    private List<Integer> mSubscribeTypes = new ArrayList(2);
    private HiSubscribeListener mDataListener = new HiSubscribeListener() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeEmotionBridge.1
        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            LogUtil.a(NativeInvokeEmotionBridge.TAG, "HiSubscribeListener onResult");
            NativeInvokeEmotionBridge.this.mSubscribeSuccessList = list;
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            ReleaseLogUtil.d(NativeInvokeEmotionBridge.R_TAG, "type:", Integer.valueOf(i), " changeKey:", str, ", newValue:", peh.c(hiHealthData));
            if ("sync download".equals(str)) {
                return;
            }
            if (i == 14 || i == 500031) {
                if (ArkUIXConstants.DELETE.equals(str) || ArkUIXConstants.INSERT.equals(str)) {
                    NativeInvokeEmotionBridge.this.freshHealthData();
                    return;
                }
                return;
            }
            LogUtil.a(NativeInvokeEmotionBridge.TAG, "other types");
        }
    };

    public NativeInvokeEmotionBridge(BridgePlugin bridgePlugin) {
        this.mInvokeArkuiBridge = bridgePlugin;
        this.mSubscribeTypes.add(Integer.valueOf(EMOTION_TYPE));
        this.mSubscribeTypes.add(11);
    }

    private void syncData(int i) {
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i == 14) {
            arrayList.add(11);
        } else {
            arrayList.add(Integer.valueOf(i));
        }
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncId(jCurrentTimeMillis);
        hiSyncOption.setForceSync(true);
        hiSyncOption.setSyncDataTypes(arrayList);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        HiHealthManager.d(BaseApplication.b()).synCloud(hiSyncOption, null);
    }

    private void registerSyncStatusBroadcastReceiver() {
        this.mSyncStatusBroadcastReceiver = new BroadcastReceiver() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeEmotionBridge.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    ReleaseLogUtil.e(NativeInvokeEmotionBridge.TAG, "registerSyncStatusBroadcastReceiver onReceive intent is null");
                    return;
                }
                String action = intent.getAction();
                if (!"com.huawei.hihealth.action_sync_data_result".equals(action)) {
                    ReleaseLogUtil.e(NativeInvokeEmotionBridge.TAG, "registerSyncStatusBroadcastReceiver onReceive action ", action);
                    return;
                }
                ReleaseLogUtil.d(NativeInvokeEmotionBridge.TAG, "registerSyncStatusBroadcastReceiver onReceive isSyncSuccess ", Boolean.valueOf(intent.getBooleanExtra("sync_data_result_success", true)), " syncDataResultSyncId ", Long.valueOf(intent.getLongExtra("sync_data_result_id", 0L)));
                String stringExtra = intent.getStringExtra("sync_data_result_type");
                boolean zC = qdm.c((List<Integer>) NativeInvokeEmotionBridge.this.mSubscribeTypes, stringExtra);
                ReleaseLogUtil.d(NativeInvokeEmotionBridge.TAG, "registerSyncStatusBroadcastReceiver onReceive isSyncType ", Boolean.valueOf(zC), " syncDataResultType ", stringExtra);
                if (zC) {
                    NativeInvokeEmotionBridge.this.freshHealthData();
                }
            }
        };
        BroadcastManagerUtil.d(BaseApplication.b(), this.mSyncStatusBroadcastReceiver, new IntentFilter("com.huawei.hihealth.action_sync_data_result"));
    }

    public void subscribeData() {
        ReleaseLogUtil.d(R_TAG, "subscribeData enter");
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(14);
        arrayList.add(Integer.valueOf(EMOTION_TYPE));
        HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(arrayList, this.mDataListener);
        registerPressureMeasuredReceiver();
        registerEmotionFreshTopBanner();
    }

    private void registerPressureMeasuredReceiver() {
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeEmotionBridge.3
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                NativeInvokeEmotionBridge.this.freshChart(1);
            }
        }, "PRESSURE_MEASURED");
    }

    public void unSubscribeData() {
        ReleaseLogUtil.d(R_TAG, "unSubscribeData enter");
        HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(this.mSubscribeSuccessList, new HiUnSubscribeListener() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeEmotionBridge$$ExternalSyntheticLambda0
            @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
            public final void onResult(boolean z) {
                LogUtil.a(NativeInvokeEmotionBridge.TAG, "unSubscribeData isSuccess = ", Boolean.valueOf(z));
            }
        });
        if (this.mSyncStatusBroadcastReceiver != null) {
            BroadcastManagerUtil.d(BaseApplication.b(), this.mSyncStatusBroadcastReceiver);
        }
        ObserverManagerUtil.a("PRESSURE_MEASURED");
        ObserverManagerUtil.a(ObserveLabels.EMOTION_SWITCH_CHANGED);
    }

    public void freshHealthData() {
        ReleaseLogUtil.d(R_TAG, "freshHealthData enter");
        this.mInvokeArkuiBridge.callMethod(new MethodData("freshHealthData", new Object[0]));
        ReleaseLogUtil.d(R_TAG, "freshHealthData end");
    }

    public void freshChart(int i) {
        ReleaseLogUtil.d(R_TAG, "freshChart enter");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("selectedType", i);
            LogUtil.a(TAG, "paramObject,", jSONObject.toString());
            this.mInvokeArkuiBridge.callMethod(new MethodData("freshChart", new Object[]{jSONObject}));
        } catch (JSONException e) {
            LogUtil.e(TAG, "freshChart,", e.getMessage());
        }
        ReleaseLogUtil.d(R_TAG, "freshChart end");
    }

    private void registerEmotionFreshTopBanner() {
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeEmotionBridge.4
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                NativeInvokeEmotionBridge.this.freshTopBanner();
            }
        }, ObserveLabels.EMOTION_SWITCH_CHANGED);
    }

    public void freshTopBanner() {
        ReleaseLogUtil.d(R_TAG, "freshTopBanner enter");
        this.mInvokeArkuiBridge.callMethod(new MethodData("freshTopBanner", new Object[0]));
        ReleaseLogUtil.d(R_TAG, "freshTopBanner end");
    }
}
