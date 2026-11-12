package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.phoneprocess.SampleSequenceAfterProcess;
import com.huawei.health.sleep.SleepApi;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.SleepDailyProcessResultCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class qea implements SampleSequenceAfterProcess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46046b;

    @Override // com.huawei.health.devicemgr.api.phoneprocess.SampleSequenceAfterProcess
    public HiHealthData onSampleSequenceAfterProcess(HiDataInsertOption hiDataInsertOption, HiHealthData hiHealthData, String str) {
        if (d(hiHealthData)) {
            try {
                JSONObject jSONObject = new JSONObject(hiHealthData.getMetaData());
                if (d(jSONObject)) {
                    this.f46046b = hiHealthData.getDeviceUuid();
                    qeb qebVar = new qeb(jSONObject, hiHealthData.getDeviceUuid());
                    b(jSONObject, qebVar);
                    a(hiHealthData.getSequenceData(), qebVar, jSONObject);
                    c(hiHealthData, jSONObject, qebVar);
                    return hiHealthData;
                }
            } catch (JSONException unused) {
                ReleaseLogUtil.a("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", "metadata jsonException");
                return hiHealthData;
            }
        }
        return hiHealthData;
    }

    private void c(HiHealthData hiHealthData, JSONObject jSONObject, qeb qebVar) {
        if (qebVar.e() == -1) {
            try {
                jSONObject.put("validData", 65535L);
                hiHealthData.setMetaData(jSONObject.toString());
            } catch (JSONException e) {
                ReleaseLogUtil.a("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", " trans validdata error: ", ExceptionUtils.c(e));
            }
        }
    }

    private boolean d(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", "checkParameters hiHealthData is null");
            return false;
        }
        if (TextUtils.isEmpty(hiHealthData.getDeviceUuid())) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", "checkParameters deviceUuid isEmpty");
            return false;
        }
        if (TextUtils.isEmpty(hiHealthData.getMetaData())) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", "checkParameters metaData isEmpty");
            return false;
        }
        LogUtil.a("CoreSleepSequenceAfterProcess", "metaData is ", hiHealthData.getMetaData());
        LogUtil.a("CoreSleepSequenceAfterProcess", "detailData is ", hiHealthData.getSequenceData());
        return true;
    }

    private boolean d(JSONObject jSONObject) {
        if (jSONObject.has("wakeupTime") && jSONObject.has("fallAsleepTime")) {
            return true;
        }
        ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", " no fallAsleepTime or wakeupTime");
        return false;
    }

    private void b(JSONObject jSONObject, qeb qebVar) {
        if (qebVar.e() == -1) {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", "validData is: ", Integer.valueOf(qebVar.e()));
            return;
        }
        List<HiHealthData> listD = qeg.d(jSONObject, qebVar);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(listD);
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", "insertSleepStatData start");
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: qea.5
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", "insertSleepStatData errorCode ", Integer.valueOf(i));
            }
        });
    }

    private void a(String str, final qeb qebVar, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", "checkParameters detailData isEmpty");
            return;
        }
        int length = str.length();
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", "detailDataLength is ", Integer.valueOf(length));
        if (length % 8 != 0) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", "detailData length error");
            return;
        }
        List<HiHealthData> listB = qed.b(str, qebVar, jSONObject);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(listB);
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", "insertSleepDetailData start, size:", Integer.valueOf(listB.size()));
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: qea.3
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", "insertSleepDetailData errorCode ", Integer.valueOf(i));
                if (i == 0) {
                    gwb.e(new Date());
                    qea.this.d();
                    OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_SLEEP_DATA_REPORT_85070001.value(), 0);
                    qea.this.a();
                    SharedPreferenceManager.a("MODULE_HW_AI_SCENES_SLEEP_MODEL", "KEY_HW_AI_SCENES_SLEEP_MODEL", false);
                    qea.this.e();
                }
                if (VersionControlUtil.isSupportSleepManagement()) {
                    qea.this.e(i, qebVar);
                } else if (qeh.c(i, 0, qea.this.f46046b, qebVar)) {
                    qeh.c(qebVar);
                }
            }
        });
    }

    public void e() {
        Map<String, String> mapE = SharedPreferenceManager.e(com.huawei.haf.application.BaseApplication.b(), "MODULE_HW_SLEEP_SEND_COUNT");
        if (mapE != null) {
            for (Map.Entry<String, String> entry : mapE.entrySet()) {
                String value = entry.getValue();
                String key = entry.getKey();
                if (!StringUtils.g(key) && !StringUtils.g(value)) {
                    LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                    linkedHashMap.put("dottingDate", key);
                    linkedHashMap.put("dottingCount", value);
                    OpAnalyticsUtil.getInstance().setEvent(OperationKey.HEALTH_APP_DEVICE_SLEEP_LINKAGE_2129059.value(), linkedHashMap);
                }
            }
        }
        SharedPreferenceManager.i(com.huawei.haf.application.BaseApplication.b(), "MODULE_HW_SLEEP_SEND_COUNT");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        qec.c().startSynBasicData(new IBaseResponseCallback() { // from class: qea.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", "insertSleepDetailData to syncFitnessDetailData, errorCode :", Integer.valueOf(i));
                if (i == 0) {
                    qea.this.d();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("CoreSleepSequenceAfterProcess", "start syncSleepAfterInsert");
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(20000);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final int i, final qeb qebVar) {
        SleepApi sleepApi = (SleepApi) Services.d("Main", SleepApi.class);
        if (sleepApi == null) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", "requestAndUpdateDailyResult sleepApi is null.");
            xjt.x("requestAndUpdateDailyResult sleepApi is null.");
        } else {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", "requestAndUpdateDailyResult start");
            sleepApi.requestAndUpdateDailyResult(ieg.c(System.currentTimeMillis()), new SleepDailyProcessResultCallback<gxd>() { // from class: qea.2
                @Override // com.huawei.hwbasemgr.SleepDailyProcessResultCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onResponse(int i2, gxd gxdVar) {
                    ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepSequenceAfterProcess", "requestAndUpdateDailyResult algorithmCode is ", Integer.valueOf(i2));
                    if (qeh.c(i, i2, qea.this.f46046b, qebVar)) {
                        qeh.c(qebVar);
                    }
                }
            });
        }
    }
}
