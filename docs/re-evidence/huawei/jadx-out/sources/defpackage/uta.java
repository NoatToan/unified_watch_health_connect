package defpackage;

import android.content.Context;
import android.util.Pair;
import com.huawei.basichealth.bloodpressure.BloodPressureSyncManager;
import com.huawei.health.bloodpressure.BloodPressureApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.health.bloodpressure.util.BloodPressureJsApi;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = BloodPressureApi.class)
@Singleton
public class uta implements BloodPressureApi {
    @Override // com.huawei.health.bloodpressure.BloodPressureApi
    public Class<? extends JsBaseModule> getBloodPressureJsApi() {
        return BloodPressureJsApi.class;
    }

    @Override // com.huawei.health.bloodpressure.BloodPressureApi
    public List<dfl> getBloodPressureMeasurePlan() {
        return uub.d();
    }

    @Override // com.huawei.health.bloodpressure.BloodPressureApi
    public void getBloodPressureMeasurePlan(ResponseCallback<List<dfl>> responseCallback) {
        uub.c(responseCallback);
    }

    @Override // com.huawei.health.bloodpressure.BloodPressureApi
    public void getBloodPressureMeasurePlanWithModifiedTime(ResponseCallback<Pair<Long, List<dfl>>> responseCallback) {
        uub.d(responseCallback);
    }

    @Override // com.huawei.health.bloodpressure.BloodPressureApi
    public void updateAllAlarm(List<dfl> list, boolean z, ResponseCallback<List<dfl>> responseCallback) {
        if (list == null || responseCallback == null) {
            LogUtil.j("BloodPressureImpl", "updateAllAlarm alarmInfoArray ", list, " callback ", responseCallback);
            return;
        }
        Iterator<dfl> it = list.iterator();
        while (it.hasNext()) {
            it.next().b(z);
        }
        uth.c(list, z, responseCallback);
    }

    @Override // com.huawei.health.bloodpressure.BloodPressureApi
    public JSONObject queryBloodPressureDeviceStatus() {
        try {
            boolean z = uub.c(BaseApplication.getContext()) > 0;
            boolean zB = BloodPressureSyncManager.b();
            LogUtil.a("BloodPressureImpl", "queryBloodPressureDeviceStatus isBondedProducts： ", Boolean.valueOf(z), ", isBloodPressureWatch: ", Boolean.valueOf(zB));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBondedProducts", z);
            jSONObject.put("isBloodPressureWatch", zB);
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.j("BloodPressureImpl", "queryBloodPressureDeviceStatus JSONException:", e.getMessage());
            return null;
        }
    }

    @Override // com.huawei.health.bloodpressure.BloodPressureApi
    public int getBloodPressureGradeType(int i, int i2) {
        return ftw.b(i, i2);
    }

    @Override // com.huawei.health.bloodpressure.BloodPressureApi
    public void registerScheduleNextReminder(boolean z) {
        DeviceInfo deviceInfoC;
        if (z && (deviceInfoC = mgg.c("BloodPressureImpl")) != null && deviceInfoC.getDeviceConnectState() == 2 && BloodPressureSyncManager.b()) {
            ReleaseLogUtil.d("BloodPressureImpl", "registerScheduleNextReminder has deviceConnect");
        } else {
            utd.d();
        }
    }

    @Override // com.huawei.health.bloodpressure.BloodPressureApi
    public String getBloodPressureGradeDes(int i, int i2) {
        return ftw.e(i, i2);
    }

    @Override // com.huawei.health.bloodpressure.BloodPressureApi
    public String getActivityActionText(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        List<uwu> listA = BloodPressureUtil.a();
        int iA = BloodPressureUtil.a(i);
        for (int i2 = 0; i2 < listA.size(); i2++) {
            uwu uwuVar = listA.get(i2);
            if ((uwuVar.e() & iA) == uwuVar.e() && !uwuVar.c()) {
                Context context = BaseApplication.getContext();
                if (LanguageUtil.f(context) || LanguageUtil.q(context) || uwuVar.e() != 1024) {
                    if (stringBuffer.length() == 0) {
                        stringBuffer.append(uwuVar.b());
                    } else {
                        stringBuffer.append(",").append(uwuVar.b());
                    }
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // com.huawei.health.bloodpressure.BloodPressureApi
    public String convertMeasureAbnormalType(int i) {
        return vzm.a.d(i);
    }

    @Override // com.huawei.health.bloodpressure.BloodPressureApi
    public void saveBloodPressurePlan(List<dfl> list) {
        uub.e(list);
    }

    @Override // com.huawei.health.bloodpressure.BloodPressureApi
    public void updOldBloodPressurePlan() {
        BloodPressureUtil.c(new BaseResponseCallback<String>() { // from class: uta.3
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, String str) {
                if (i == -1) {
                    LogUtil.j("BloodPressureImpl", "updOldBloodPressurePlan error ", str);
                }
            }
        });
    }
}
