package com.huawei.hwarkuix.oHBrigdePlugin.health;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.nqs;
import defpackage.qqt;
import java.util.ArrayList;
import java.util.List;
import ohos.ace.adapter.capability.bridge.BridgePlugin;
import ohos.ace.adapter.capability.bridge.MethodData;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class NativeInvokeBloodPressureBridge {
    private static final String FRESH_CHART = "freshChart";
    private static final String FRESH_DYNAMIC_BP_CARD = "freshDynamicBPCard";
    private static final String FRESH_HEALTH_DATA = "freshHealthData";
    private static final String R_TAG = "R_ArkUIX_NativeInvokeBloodPressureBridge";
    private static final String TAG = "ArkUIX_NativeInvokeBloodPressureBridge";
    private final BridgePlugin mInvokeArkuiBridge;
    private List<Integer> mSubscribeSuccessList = new ArrayList(6);
    private HiSubscribeListener mBPDataListener = new HiSubscribeListener() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeBloodPressureBridge.1
        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            LogUtil.a(NativeInvokeBloodPressureBridge.TAG, "HiSubscribeListener onResult");
            NativeInvokeBloodPressureBridge.this.mSubscribeSuccessList = list;
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            ReleaseLogUtil.c(NativeInvokeBloodPressureBridge.R_TAG, "type:", Integer.valueOf(i), " changeKey:", str);
            LogUtil.a(NativeInvokeBloodPressureBridge.TAG, " newValue:", qqt.b(hiHealthData));
            if (i == HiSubscribeType.f12261c) {
                if (ArkUIXConstants.INSERT.equals(str)) {
                    NativeInvokeBloodPressureBridge.this.refreshBloodPressureChart(NativeInvokeBloodPressureBridge.this.getNewInsertStartTime(hiHealthData));
                    NativeInvokeBloodPressureBridge.this.refreshDynamicBpCard();
                    return;
                } else {
                    if (ArkUIXConstants.DELETE.equals(str)) {
                        NativeInvokeBloodPressureBridge.this.refreshHealthData();
                        NativeInvokeBloodPressureBridge.this.refreshDynamicBpCard();
                        return;
                    }
                    return;
                }
            }
            if (i == 103) {
                if ("900300039".equals(str)) {
                    NativeInvokeBloodPressureBridge.this.refreshBloodPressureChart(0L);
                    NativeInvokeBloodPressureBridge.this.refreshDynamicBpCard();
                    return;
                }
                return;
            }
            if (i == DicDataTypeUtil.DataType.DYNAMIC_BP_REPORT.value()) {
                NativeInvokeBloodPressureBridge.this.refreshBloodPressureChart(0L);
                NativeInvokeBloodPressureBridge.this.refreshDynamicBpCard();
            }
        }
    };

    public NativeInvokeBloodPressureBridge(BridgePlugin bridgePlugin) {
        this.mInvokeArkuiBridge = bridgePlugin;
    }

    public void subscribeBloodPressureData() {
        ReleaseLogUtil.c(R_TAG, "subscribleBloodPressureData enter");
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.DYNAMIC_BP_REPORT.value()));
        arrayList.add(Integer.valueOf(HiSubscribeType.f12261c));
        arrayList.add(103);
        HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(arrayList, this.mBPDataListener);
    }

    public void unSubscribeBloodPressureData() {
        ReleaseLogUtil.c(R_TAG, "unSubscribeBloodPressureData enter");
        HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(this.mSubscribeSuccessList, new HiUnSubscribeListener() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeBloodPressureBridge$$ExternalSyntheticLambda0
            @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
            public final void onResult(boolean z) {
                LogUtil.a(NativeInvokeBloodPressureBridge.TAG, "unSubscribeBloodPressureData isSuccess = ", Boolean.valueOf(z));
            }
        });
    }

    public void refreshBloodPressureChart(long j) {
        ReleaseLogUtil.c(R_TAG, "refreshBloodPressureChart enter");
        Object[] objArr = new Object[1];
        if (j != 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timestamp", j);
                objArr[0] = jSONObject;
                LogUtil.a(TAG, "paramObject,", jSONObject.toString());
            } catch (JSONException e) {
                LogUtil.e(TAG, "refreshBloodPressure,", e.getMessage());
            }
        }
        this.mInvokeArkuiBridge.callMethod(new MethodData(FRESH_CHART, objArr));
    }

    public void refreshHealthData() {
        ReleaseLogUtil.c(R_TAG, "freshHealthData enter");
        this.mInvokeArkuiBridge.callMethod(new MethodData(FRESH_HEALTH_DATA, new Object[0]));
        ReleaseLogUtil.c(R_TAG, "freshHealthData end");
    }

    public void refreshDynamicBpCard() {
        ReleaseLogUtil.c(R_TAG, "freshDynamicBpCard enter");
        this.mInvokeArkuiBridge.callMethod(new MethodData(FRESH_DYNAMIC_BP_CARD, new Object[0]));
        ReleaseLogUtil.c(R_TAG, "freshDynamicBpCard end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getNewInsertStartTime(HiHealthData hiHealthData) {
        String changeDataInfos = hiHealthData.getChangeDataInfos();
        if (TextUtils.isEmpty(changeDataInfos)) {
            LogUtil.a(TAG, "getNewInsertStartTime null");
            return 0L;
        }
        List<nqs> list = (List) qqt.c(changeDataInfos, new TypeToken<List<nqs>>() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeBloodPressureBridge.2
        }.getType());
        if (!CollectionUtils.a(list)) {
            for (nqs nqsVar : list) {
                if (nqsVar == null) {
                    LogUtil.a(TAG, "getNewInsertStartTime changeInfoBean is null");
                } else if (nqsVar.e() == DicDataTypeUtil.DataType.BLOOD_PRESSURE_DIASTOLIC.value() || nqsVar.e() == DicDataTypeUtil.DataType.BLOOD_PRESSURE_SYSTOLIC.value()) {
                    return nqsVar.b();
                }
            }
        }
        return 0L;
    }
}
