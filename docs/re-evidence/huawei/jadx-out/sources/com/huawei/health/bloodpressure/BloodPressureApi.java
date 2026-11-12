package com.huawei.health.bloodpressure;

import android.util.Pair;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwbasemgr.ResponseCallback;
import defpackage.dfl;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface BloodPressureApi {
    String convertMeasureAbnormalType(int i);

    String getActivityActionText(int i);

    String getBloodPressureGradeDes(int i, int i2);

    int getBloodPressureGradeType(int i, int i2);

    Class<? extends JsBaseModule> getBloodPressureJsApi();

    List<dfl> getBloodPressureMeasurePlan();

    void getBloodPressureMeasurePlan(ResponseCallback<List<dfl>> responseCallback);

    void getBloodPressureMeasurePlanWithModifiedTime(ResponseCallback<Pair<Long, List<dfl>>> responseCallback);

    JSONObject queryBloodPressureDeviceStatus();

    void registerScheduleNextReminder(boolean z);

    void saveBloodPressurePlan(List<dfl> list);

    void updOldBloodPressurePlan();

    void updateAllAlarm(List<dfl> list, boolean z, ResponseCallback<List<dfl>> responseCallback);
}
