package com.huawei.ui.homehealth.devicearkui.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.huawei.health.device.api.DeviceGeneralSettingApi;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.BaseDeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy;
import com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceTipViewModel;
import defpackage.dse;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qhu;
import defpackage.riq;
import defpackage.roj;
import defpackage.rpq;
import defpackage.rtk;
import defpackage.rvj;
import defpackage.rvl;
import health.compact.a.Services;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceTipViewModel extends ViewModel {

    public interface IBenefitDataCallback {
        void onResponse(int i, JSONObject jSONObject, List<BaseDeviceBenefitInfo> list, rvl rvlVar, List<DeviceBenefitInfo> list2);
    }

    public void e(final DeviceInfo deviceInfo, final BaseResponseCallback<JSONObject> baseResponseCallback) {
        SimpleChain.b("DeviceTipViewModel").e(new SimpleChain.INext() { // from class: sga
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                ykx.b(deviceInfo, emitter);
            }
        }).e(new SimpleChain.INext() { // from class: sfw
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                this.e.e(deviceInfo, emitter, objArr);
            }
        }).d(new SimpleChain.Emitter() { // from class: sfx
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                DeviceTipViewModel.b(baseResponseCallback, objArr);
            }
        }, new Object[0]);
    }

    public /* synthetic */ void e(DeviceInfo deviceInfo, final SimpleChain.Emitter emitter, Object[] objArr) {
        if (objArr.length > 0) {
            final String string = objArr[0].toString();
            riq riqVar = new riq();
            LogUtil.a("DeviceTipViewModel", "queryBacklogEvents request");
            riqVar.a(deviceInfo, new BackLogCallback<List<dse>>() { // from class: com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceTipViewModel.1
                @Override // com.huawei.health.device.callback.BackLogCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<dse> list) {
                    LogUtil.a("DeviceTipViewModel", "queryBacklogEvents result", Integer.valueOf(list.size()));
                    synchronized (list) {
                        int i = 0;
                        int i2 = 0;
                        for (dse dseVar : list) {
                            if (!dseVar.b()) {
                                i++;
                            }
                            if (!dseVar.a()) {
                                i2++;
                            }
                        }
                        JSONObject jSONObject = new JSONObject();
                        String str = "true";
                        try {
                            if ("06D".equals(string)) {
                                str = "true";
                            } else if ("06E".equals(string)) {
                                str = "";
                            }
                            jSONObject.put("isWatch", str);
                            jSONObject.put("notFinishBacklogNum", i2);
                            jSONObject.put("notViewedBacklogNum", i);
                            if (!list.isEmpty()) {
                                jSONObject.put("firstBacklogTitle", list.get(0).d());
                            }
                        } catch (JSONException unused) {
                            LogUtil.j("DeviceTipViewModel", "queryBacklogEvent JSONException");
                            emitter.onError("queryBacklogEvent JSONException");
                        }
                        emitter.onSuccess(jSONObject);
                    }
                }

                @Override // com.huawei.health.device.callback.BackLogCallback
                public void onFailure(int i, String str) {
                    emitter.onError("next args is empty");
                }
            });
            return;
        }
        emitter.onError("next args is empty");
    }

    public static /* synthetic */ void b(BaseResponseCallback baseResponseCallback, Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            LogUtil.a("DeviceTipViewModel", "subscribe args is empty");
            baseResponseCallback.onResponse(0, new JSONObject());
        } else {
            Object obj = objArr[0];
            if (obj instanceof JSONObject) {
                baseResponseCallback.onResponse(0, (JSONObject) obj);
            }
        }
    }

    public void a(final DeviceInfo deviceInfo, final IBenefitDataCallback iBenefitDataCallback) {
        if (((DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class)) == null) {
            JSONObject jSONObject = new JSONObject();
            LogUtil.j("DeviceTipViewModel", "queryBenefitData api_is null: ");
            iBenefitDataCallback.onResponse(0, jSONObject, null, null, null);
        } else {
            final JSONObject jSONObject2 = new JSONObject();
            if (deviceInfo.getDeviceConnectState() != 2) {
                iBenefitDataCallback.onResponse(0, jSONObject2, null, null, null);
            } else {
                lsy.a(new Runnable() { // from class: sgc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeviceTipViewModel.a(iBenefitDataCallback, jSONObject2, deviceInfo);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void a(final IBenefitDataCallback iBenefitDataCallback, final JSONObject jSONObject, final DeviceInfo deviceInfo) {
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            iBenefitDataCallback.onResponse(0, jSONObject, null, null, null);
        } else {
            payApi.getDeviceBenefits(qhu.d(deviceInfo, DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_ALL, true), new IBaseResponseCallback() { // from class: sfz
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    DeviceTipViewModel.c(deviceInfo, iBenefitDataCallback, jSONObject, i, obj);
                }
            });
        }
    }

    public static /* synthetic */ void c(DeviceInfo deviceInfo, IBenefitDataCallback iBenefitDataCallback, JSONObject jSONObject, int i, Object obj) {
        List<BaseDeviceBenefitInfo> listA = rvj.a(i, obj, deviceInfo);
        List<DeviceBenefitInfo> listC = rvj.c(i, obj);
        if (njy.e(listA)) {
            iBenefitDataCallback.onResponse(0, jSONObject, null, null, listC);
            return;
        }
        rvl rvlVarA = rvj.a(listA.get(0), deviceInfo);
        try {
            jSONObject.put("description", rvlVarA.d());
            jSONObject.put("countNumber", listA.size());
            jSONObject.put("isWatch", rvlVarA.c());
            jSONObject.put("type", rvlVarA.b());
            jSONObject.put("value", rvlVarA.a());
        } catch (JSONException unused) {
            LogUtil.a("DeviceTipViewModel", "queryBenefitData error");
        }
        iBenefitDataCallback.onResponse(0, jSONObject, listA, rvlVarA, listC);
    }

    public void a(DeviceInfo deviceInfo, String str) {
        FeatureStrategy featureStrategyC = rpq.c(FeatureType.TODO_LIST);
        Bundle bundle = new Bundle();
        bundle.putString("isWatch", str);
        featureStrategyC.jumpToFeaturePage(deviceInfo, bundle, new SimpleChain.Emitter() { // from class: sfy
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("DeviceTipViewModel", "jumpToFeaturePage onSuccess");
            }
        });
    }

    public void a(JSONObject jSONObject) {
        boolean zOptBoolean = jSONObject.optBoolean("isWatch");
        int iOptInt = jSONObject.optInt("type");
        String strOptString = jSONObject.optString("value");
        LogUtil.a("DeviceTipViewModel", "jumpToFeaturePage isWatch:", Boolean.valueOf(zOptBoolean), " type:", Integer.valueOf(iOptInt), " value:", strOptString);
        rtk.d(BaseApplication.getActivity(), iOptInt, strOptString);
        if (Boolean.TRUE.equals(Boolean.valueOf(zOptBoolean))) {
            roj.b(1);
        }
    }
}
