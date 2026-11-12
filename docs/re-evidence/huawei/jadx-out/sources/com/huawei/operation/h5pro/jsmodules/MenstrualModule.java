package com.huawei.operation.h5pro.jsmodules;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.core.app.NotificationCompat;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.beans.SwitchTimingInfo;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginhealthalgorithm.MenstrualPredictApi;
import defpackage.ecu;
import defpackage.eeb;
import defpackage.eed;
import defpackage.eeq;
import defpackage.eey;
import defpackage.njy;
import defpackage.pez;
import defpackage.qec;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class MenstrualModule extends JsBaseModule {
    private static final String MENSTRAL_PREDICT_CONFIG_ID = "900500016";
    private static final String MENSTRAL_PREDICT_CONFIG_NAME = "menstrualPredictSwitch";
    private static final String RELEASE_TAG = "R_MenstrualModule";
    private static final String SWITCH_MODE = "switchMode";
    private static final String TAG = "MenstrualModule";

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        if (!pez.d().isPluginAvaiable()) {
            pez.d().loadPlugin(null);
        }
        LogUtil.a(TAG, "onCreate");
    }

    @JavascriptInterface
    public void predict(long j, String str) {
        LogUtil.a(TAG, "predict json:", str);
        String strPredict = pez.d().predict(str);
        if (TextUtils.isEmpty(strPredict)) {
            onFailureCallback(j, "predict result==null");
        } else {
            onSuccessCallback(j, strPredict);
        }
    }

    @JavascriptInterface
    public void editPredict(long j, String str) {
        LogUtil.a(TAG, "editPredict json:", str);
        String strEditPredict = pez.d().editPredict(str);
        if (TextUtils.isEmpty(strEditPredict)) {
            onFailureCallback(j, "editPredict result==null");
        } else {
            onSuccessCallback(j, strEditPredict);
        }
    }

    @JavascriptInterface
    public void setReminder(long j, String str) {
        LogUtil.a(TAG, "setReminder, json = ", str);
        if (TextUtils.isEmpty(str)) {
            onFailureCallback(j, "setReminder, json is empty.");
        } else {
            handleAlarmManager(j, (List) new Gson().fromJson(str, new TypeToken<List<SwitchTimingInfo>>() { // from class: com.huawei.operation.h5pro.jsmodules.MenstrualModule.1
            }.getType()));
        }
    }

    private void handleAlarmManager(long j, List<SwitchTimingInfo> list) {
        if (njy.e(list)) {
            LogUtil.j(TAG, "switchTimingInfos is empty.");
            onFailureCallback(j, "switchTimingInfos is empty.");
            return;
        }
        boolean z = true;
        for (SwitchTimingInfo switchTimingInfo : list) {
            if (switchTimingInfo == null) {
                LogUtil.j(TAG, "switchTiming is null.");
            } else {
                List<SwitchTimingInfo.TimingInfo> timingInfo = switchTimingInfo.getTimingInfo();
                if (njy.e(timingInfo)) {
                    LogUtil.j(TAG, "timingInfoList is empty.");
                } else {
                    for (SwitchTimingInfo.TimingInfo timingInfo2 : timingInfo) {
                        if (timingInfo2 == null || TextUtils.isEmpty(timingInfo2.getDate())) {
                            LogUtil.j(TAG, "switchName = ", switchTimingInfo.getName(), ", timingInfo is null or getDate() is empty.");
                        } else if (!setAlarmManager(this.mContext, switchTimingInfo.getName(), timingInfo2.getCode(), timingInfo2.getDate())) {
                            z = false;
                        }
                    }
                }
            }
        }
        if (z) {
            onSuccessCallback(j, "setAlarmManager success");
        } else {
            onFailureCallback(j, "setAlarmManager failed");
        }
    }

    @JavascriptInterface
    public void getSwitchState(final long j, String str) {
        LogUtil.a(TAG, "getSwitchState switchKey: ", str);
        ((MenstrualPredictApi) Services.b("MenstrualPredict", MenstrualPredictApi.class)).getSwitchState(str, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.MenstrualModule$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1576x545474a9(j, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getSwitchState$0$com-huawei-operation-h5pro-jsmodules-MenstrualModule, reason: not valid java name */
    /* synthetic */ void m1576x545474a9(long j, int i, Object obj) {
        if (i == 0 && (obj instanceof Boolean)) {
            LogUtil.a(TAG, "getSwitchState success: ", obj);
            onSuccessCallback(j, obj);
        } else {
            onFailureCallback(j, "getSwitchState fail");
        }
    }

    @JavascriptInterface
    public void updateSwitchState(final long j, String str) {
        LogUtil.a(TAG, "updateSwitchState params: ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("switchKey");
            String strOptString2 = jSONObject.optString("isChecked");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                onFailureCallback(j, "updateSwitchState switchKey or isChecked is null");
            } else {
                ((MenstrualPredictApi) Services.b("MenstrualPredict", MenstrualPredictApi.class)).updateSwitchState(strOptString, strOptString2, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.MenstrualModule$$ExternalSyntheticLambda1
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.f$0.m1577xa9e02355(j, i, obj);
                    }
                });
            }
        } catch (JSONException unused) {
            onFailureCallback(j, "updateSwitchState parse params exception");
        }
    }

    /* JADX INFO: renamed from: lambda$updateSwitchState$1$com-huawei-operation-h5pro-jsmodules-MenstrualModule, reason: not valid java name */
    /* synthetic */ void m1577xa9e02355(long j, int i, Object obj) {
        if (i == 0) {
            LogUtil.a(TAG, "updateSwitchState success");
            onSuccessCallback(j, "updateSwitchState success");
        } else {
            onFailureCallback(j, "updateSwitchState fail");
        }
    }

    private boolean setAlarmManager(Context context, String str, int i, String str2) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.health.receiver.PhysiologicalCycleReceiver");
        intent.putExtra("switchType", str);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent, 201326592);
        Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (!(systemService instanceof AlarmManager)) {
            return false;
        }
        ((AlarmManager) systemService).set(0, CommonUtil.i(str2), broadcast);
        return true;
    }

    @JavascriptInterface
    public void cancelSwitchReminder(long j, String str) {
        LogUtil.a(TAG, "cancelSwitchReminder, json = ", str);
        if (TextUtils.isEmpty(str)) {
            onFailureCallback(j, "cancelSwitchReminder, json is empty.");
            return;
        }
        List list = (List) new Gson().fromJson(str, new TypeToken<List<Integer>>() { // from class: com.huawei.operation.h5pro.jsmodules.MenstrualModule.2
        }.getType());
        if (njy.e(list)) {
            onFailureCallback(j, "cancelSwitchReminder, getCodeList is empty.");
            return;
        }
        Iterator it = list.iterator();
        int iCancelAlarmManager = 0;
        while (it.hasNext()) {
            iCancelAlarmManager += cancelAlarmManager(this.mContext, ((Integer) it.next()).intValue());
        }
        if (iCancelAlarmManager == list.size()) {
            onSuccessCallback(j, "cancelAlarmManager success.");
            return;
        }
        onFailureCallback(j, "cancelSwitchReminder, totalCount = " + list.size() + ", cancelCount = " + iCancelAlarmManager);
    }

    private int cancelAlarmManager(Context context, int i) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.health.receiver.PhysiologicalCycleReceiver");
        PendingIntent broadcast = PendingIntent.getBroadcast(this.mContext, i, intent, 201326592);
        Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (!(systemService instanceof AlarmManager)) {
            return 0;
        }
        AlarmManager alarmManager = (AlarmManager) systemService;
        if (broadcast == null) {
            return 0;
        }
        broadcast.cancel();
        alarmManager.cancel(broadcast);
        return 1;
    }

    @JavascriptInterface
    public void syncMenstrualDataToDevice(long j, String str) {
        LogUtil.a(TAG, "enter syncMenstrualDataToDevice");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "json isEmpty");
            onFailureCallback(j, "json isEmpty");
            return;
        }
        if (!eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG), 174)) {
            LogUtil.j(TAG, "isSupportMenstrualSymptomMarker == false");
            onFailureCallback(j, "device not support");
            return;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("pointInfos");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int i2 = jSONObject.getInt("type");
                int i3 = jSONObject.getInt("value");
                eed eedVar = new eed();
                eedVar.e(i2);
                eedVar.a(eeq.h(i3));
                arrayList.add(eedVar);
                long jOptLong = jSONObject.optLong("startTime");
                long jOptLong2 = jSONObject.optLong("endTime");
                long jOptLong3 = jSONObject.optLong(ParsedFieldTag.TASK_MODIFY_TIME);
                eeb eebVar = new eeb();
                eebVar.c(jOptLong);
                eebVar.d(jOptLong2);
                eebVar.a(jOptLong3);
                eebVar.e(arrayList);
                arrayList2.add(eebVar);
            }
            onSuccessCallback(j, Boolean.valueOf(qec.a().syncMenstrualToDevice(arrayList2)));
        } catch (JSONException unused) {
            LogUtil.e(TAG, "syncMenstrualDataToDevice jsonException");
            onFailureCallback(j, "jsonException");
        }
    }

    @JavascriptInterface
    public void setSwitchMode(long j, String str) {
        ReleaseLogUtil.d(RELEASE_TAG, "setSwitchMode enter");
        LogUtil.a(TAG, "setSwitchMode, json = ", str);
        if (TextUtils.isEmpty(str)) {
            onFailureCallback(j, "setSwitchMode, json is empty.");
            return;
        }
        try {
            ecu.d().setMenstrualPredictSwitch(new JSONObject(str).optString(SWITCH_MODE));
            onSuccessCallback(j, "setSwitchMode success");
        } catch (JSONException e) {
            String strC = ExceptionUtils.c(e);
            ReleaseLogUtil.a(RELEASE_TAG, "setSwitchMode exception ", strC);
            onFailureCallback(j, strC);
        }
    }

    @JavascriptInterface
    public void querySwitchList(final long j) {
        ReleaseLogUtil.d(RELEASE_TAG, "querySwitchList enter");
        ecu.d().getMenstrualPredictSwitch(new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.MenstrualModule.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0) {
                    ArrayList arrayList = new ArrayList();
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("configId", MenstrualModule.MENSTRAL_PREDICT_CONFIG_ID);
                    jsonObject.addProperty("configName", MenstrualModule.MENSTRAL_PREDICT_CONFIG_NAME);
                    jsonObject.addProperty(MenstrualModule.SWITCH_MODE, obj.toString());
                    arrayList.add(jsonObject);
                    LogUtil.a(MenstrualModule.TAG, "querySwitchList result: ", arrayList);
                    MenstrualModule.this.onSuccessCallback(j, arrayList);
                    return;
                }
                MenstrualModule.this.onFailureCallback(j, "querySwitchList fail: ", i);
            }
        });
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a(TAG, "onDestroy");
    }
}
