package com.huawei.ui.device.activity.heartrate;

import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.service.anotation.H5ProCallback;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qvl;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = HeartRateManager.TAG)
public class HeartRateManager extends JsBaseModule {
    private static final String TAG = "HeartRateManager";
    private static final qvl sHeartRateControl = new qvl();

    @H5ProCallback
    public interface HeartRateCallback {
        void onFailure(int i, String str);

        void onSuccess(Object obj);
    }

    @H5ProMethod(name = "queryHeartRateSwitch")
    public static void queryHeartRateSwitch(HeartRateCallback heartRateCallback) {
        LogUtil.a(TAG, "queryHeartRateSwitch start");
        if (heartRateCallback == null) {
            LogUtil.j(TAG, "queryHeartRateSwitch: callback is null");
        } else {
            sHeartRateControl.e(heartRateCallback);
        }
    }

    @H5ProMethod(name = "querySupportLimitRemind")
    public static void querySupportLimitRemind(HeartRateCallback heartRateCallback) {
        LogUtil.a(TAG, "querySupportLimitRemind start");
        if (heartRateCallback == null) {
            LogUtil.j(TAG, "querySupportLimitRemind: callback is null");
        } else {
            sHeartRateControl.g(heartRateCallback);
        }
    }

    @H5ProMethod(name = "queryDownRemind")
    public static void queryDownRemind(HeartRateCallback heartRateCallback) {
        LogUtil.a(TAG, "queryDownRemind start");
        if (heartRateCallback == null) {
            LogUtil.j(TAG, "queryDownRemind: callback is null");
        } else {
            sHeartRateControl.b(heartRateCallback);
        }
    }

    @H5ProMethod(name = "queryUpRemind")
    public static void queryUpRemind(HeartRateCallback heartRateCallback) {
        LogUtil.a(TAG, "queryUpRemind start");
        if (heartRateCallback == null) {
            LogUtil.j(TAG, "queryUpRemind: callback is null");
        } else {
            sHeartRateControl.i(heartRateCallback);
        }
    }

    @H5ProMethod(name = "querySupportContinueMeasurement")
    public static void querySupportContinueMeasurement(HeartRateCallback heartRateCallback) {
        LogUtil.a(TAG, "querySupportContinueMeasurement start");
        if (heartRateCallback == null) {
            LogUtil.j(TAG, "querySupportContinueMeasurement: callback is null");
        } else {
            sHeartRateControl.a(heartRateCallback);
        }
    }

    @H5ProMethod(name = "queryMeasurementMethod")
    public static void queryMeasurementMethod(HeartRateCallback heartRateCallback) {
        LogUtil.a(TAG, "queryMeasurementMethod start");
        if (heartRateCallback == null) {
            LogUtil.j(TAG, "queryMeasurementMethod: callback is null");
        } else {
            sHeartRateControl.d(heartRateCallback);
        }
    }

    @H5ProMethod(name = "setUpRemind")
    public static void setUpRemind(int i, HeartRateCallback heartRateCallback) {
        LogUtil.a(TAG, "setUpRemind start");
        if (heartRateCallback == null) {
            LogUtil.j(TAG, "setUpRemind: callback is null");
        } else {
            LogUtil.a(TAG, "setUpRemind", Integer.valueOf(i));
            sHeartRateControl.e(i, heartRateCallback);
        }
    }

    @H5ProMethod(name = "setDownRemind")
    public static void setDownRemind(int i, HeartRateCallback heartRateCallback) {
        LogUtil.a(TAG, "setDownRemind start");
        if (heartRateCallback == null) {
            LogUtil.j(TAG, "setDownRemind: callback is null");
        } else {
            LogUtil.a(TAG, "setDownRemind", Integer.valueOf(i));
            sHeartRateControl.d(i, heartRateCallback);
        }
    }

    @H5ProMethod(name = "setMeasurementMethod")
    public static void setMeasurementMethod(int i, HeartRateCallback heartRateCallback) {
        LogUtil.a(TAG, "setMeasurementMethod start");
        if (heartRateCallback == null) {
            LogUtil.j(TAG, "setMeasurementMethod: callback is null");
        } else {
            LogUtil.a(TAG, "setMeasurementMethod", Integer.valueOf(i));
            sHeartRateControl.a(i, heartRateCallback);
        }
    }

    @H5ProMethod(name = "setHeartRateSwitch")
    public static void setHeartRateSwitch(int i, HeartRateCallback heartRateCallback) {
        LogUtil.a(TAG, "setHeartRateSwitch start");
        if (heartRateCallback == null) {
            LogUtil.j(TAG, "setHeartRateSwitch: callback is null");
        } else {
            LogUtil.a(TAG, "setHeartRateSwitch", Integer.valueOf(i));
            sHeartRateControl.c(i, heartRateCallback);
        }
    }

    @H5ProMethod(name = "offHeartRateAndHyperTempSwitch")
    public static void offHeartRateAndHyperTempSwitch(HeartRateCallback heartRateCallback) {
        LogUtil.a(TAG, "offHeartRateAndHyperTempSwitch start");
        if (heartRateCallback == null) {
            LogUtil.j(TAG, "offHeartRateAndHyperTempSwitch: callback is null");
        } else {
            sHeartRateControl.c(heartRateCallback);
        }
    }
}
