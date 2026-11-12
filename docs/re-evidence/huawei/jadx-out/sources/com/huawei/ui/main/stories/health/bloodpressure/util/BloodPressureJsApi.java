package com.huawei.ui.main.stories.health.bloodpressure.util;

import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.interfaces.ServiceApiCallback;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import defpackage.fdm;
import defpackage.ftw;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@H5ProService(name = BloodPressureJsApi.TAG, users = {"9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class BloodPressureJsApi extends JsBaseModule {
    private static final String KEY_BLOOD_PRESSURE_GRADE_DES = "BloodPressureGradeDes";
    private static final String KEY_BLOOD_PRESSURE_TYPE = "BloodPressureType";
    private static final String TAG = "BloodPressureJsApi";

    @H5ProMethod(name = "getBloodPressureGradeDes")
    public static void getBloodPressureGradeDes(int i, int i2, ServiceApiCallback<String> serviceApiCallback) {
        if (serviceApiCallback == null) {
            LogUtil.j(TAG, "getBloodPressureGradeDes: callback is null");
            return;
        }
        String strE = ftw.e(i, i2);
        LogUtil.a(TAG, "getBloodPressureGradeDes, gradeDes: ", strE);
        serviceApiCallback.onSuccess(strE);
    }

    @H5ProMethod(name = "getBloodPressureGradeInfo")
    public static void getBloodPressureGradeInfo(int i, int i2, ServiceApiCallback<JSONObject> serviceApiCallback) {
        if (serviceApiCallback == null) {
            LogUtil.j(TAG, "getBloodPressureGradeDes: callback is null");
            return;
        }
        String strE = ftw.e(i, i2);
        int iB = ftw.b(i, i2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_BLOOD_PRESSURE_TYPE, iB);
            jSONObject.put(KEY_BLOOD_PRESSURE_GRADE_DES, strE);
        } catch (JSONException e) {
            LogUtil.e(TAG, "JSONException  ", e.getMessage());
        }
        LogUtil.a(TAG, "getBloodPressureGradeInfo, GradeInfo: ", jSONObject);
        serviceApiCallback.onSuccess(jSONObject);
    }

    @H5ProMethod(name = "getBloodPressureGradeTypeCount")
    public static void getBloodPressureGradeTypeCount(ServiceApiCallback<Integer> serviceApiCallback) {
        if (serviceApiCallback == null) {
            LogUtil.j(TAG, "getBloodPressureGradeTypeCount: callback is null");
            return;
        }
        int iA = ftw.a();
        LogUtil.a(TAG, "getBloodPressureGradeTypeCount, typeCount: ", Integer.valueOf(iA));
        serviceApiCallback.onSuccess(Integer.valueOf(iA));
    }

    @H5ProMethod(name = "getProgressOfBloodPressure")
    public static void getProgressOfBloodPressure(int i, int i2, ServiceApiCallback<Integer> serviceApiCallback) {
        if (serviceApiCallback == null) {
            LogUtil.j(TAG, "getProgressOfBloodPressure: callback is null");
            return;
        }
        int iA = BloodPressureUtil.a(i, i2);
        LogUtil.a(TAG, "getProgressOfBloodPressure, progress: ", Integer.valueOf(iA));
        serviceApiCallback.onSuccess(Integer.valueOf(iA));
    }

    @H5ProMethod(name = "getDynamicBloodPressureJson")
    public static void getDynamicBloodPressureJson(ServiceApiCallback<String> serviceApiCallback) {
        if (serviceApiCallback == null) {
            LogUtil.j(TAG, "getProgressOfBloodPressure: callback is null");
            return;
        }
        String strA = fdm.d().a();
        LogUtil.a(TAG, "getDynamicBloodPressureFeatureInfoJson is null: ", Boolean.valueOf(strA == null));
        serviceApiCallback.onSuccess(strA);
    }
}
