package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.os.Bundle;
import android.os.OperationCanceledException;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hiai.awareness.client.AwarenessEnvelope;
import com.huawei.hiai.awareness.client.AwarenessManager;
import com.huawei.hiai.awareness.client.AwarenessRequest;
import com.huawei.hiai.awareness.client.AwarenessServiceConnection;
import com.huawei.hiai.awareness.client.OnEnvelopeReceiver;
import com.huawei.hiai.awareness.client.ProfileLabel;
import com.huawei.hidatamanager.HiDataManager;
import com.huawei.hidatamanager.util.Const;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class fmb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile fmb f34237a;
    private AwarenessManager e;
    private volatile boolean f;
    private Context i;
    private HiDataManager j;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashMap<String, String> f34239c = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<String, String> f34238b = new HashMap<>();

    static {
        f34239c.put("pengine_daily_work_hour", "content://com.huawei.pengine.UserProfileProvider/DailyAverageWorkingHour");
        f34239c.put("pengine_sport_frequency", "content://com.huawei.pengine.UserProfileProvider/SportsFrequency");
        f34239c.put("pengine_sport_type_preference", "content://com.huawei.pengine.UserProfileProvider/SportsTypePreference");
        f34239c.put("pengine_work_day", "content://com.huawei.pengine.UserProfileProvider/WorkDay");
        f34239c.put("pengine_commuting_mode", "content://com.huawei.pengine.UserProfileProvider/CommutingMode");
        f34239c.put("pengine_leave_home_time", "content://com.huawei.pengine.UserProfileProvider/LeaveHomeTime");
        f34239c.put("pengine_arrive_home_time", "content://com.huawei.pengine.UserProfileProvider/ArriveHomeTime");
        f34239c.put("pengine_arrive_company_time", "content://com.huawei.pengine.UserProfileProvider/ArriveCompanyTime");
        f34239c.put("pengine_leave_company_time", "content://com.huawei.pengine.UserProfileProvider/LeaveCompanyTime");
        f34239c.put("pengine_commuting_duration", "content://com.huawei.pengine.UserProfileProvider/CommutingDuration");
        f34238b.put("pengine_daily_work_hour", "DailyAverageWorkingHour");
        f34238b.put("pengine_sport_frequency", "SportsFrequency");
        f34238b.put("pengine_sport_type_preference", "SportsTypePreference");
        f34238b.put("pengine_work_day", "WorkDay");
        f34238b.put("pengine_commuting_mode", "CommutingMode");
        f34238b.put("pengine_leave_home_time", "LeaveHomeTime");
        f34238b.put("pengine_arrive_home_time", "ArriveHomeTime");
        f34238b.put("pengine_arrive_company_time", "ArriveCompanyTime");
        f34238b.put("pengine_leave_company_time", "LeaveCompanyTime");
        f34238b.put("pengine_commuting_duration", "CommutingDuration");
    }

    private fmb(Context context) {
        this.i = context;
        i();
    }

    public static fmb b() {
        LogUtil.a("HiH_PengineUserLabelMgr", "QueryMemberManager getInstance");
        if (f34237a == null) {
            synchronized (d) {
                if (f34237a == null) {
                    f34237a = new fmb(BaseApplication.b());
                }
            }
        }
        return f34237a;
    }

    private void i() {
        if (f()) {
            HiDataManager hiDataManager = HiDataManager.getInstance();
            this.j = hiDataManager;
            hiDataManager.init(this.i);
            this.e = new AwarenessManager(this.i);
        }
    }

    private boolean f() {
        if (CommonUtil.ay()) {
            return true;
        }
        LogUtil.a("HiH_PengineUserLabelMgr", "CommonUtil.isEmui90(), version = ", Integer.valueOf(CommonUtil.ae()));
        return false;
    }

    public void c() {
        HiDataManager hiDataManager = this.j;
        if (hiDataManager != null) {
            hiDataManager.destroy();
        }
    }

    public void b(String str) {
        HiDataManager hiDataManager = this.j;
        if (hiDataManager == null) {
            return;
        }
        if (str == null) {
            LogUtil.j("HiH_PengineUserLabelMgr", "saveTrackDataToOdmf JsonData = null");
        } else {
            LogUtil.a("HiH_PengineUserLabelMgr", "saveBindingDeviceToOdmf, result = ", Integer.valueOf(hiDataManager.inputSourceData(Const.RawDataType.HEALTH_EVENT_RECORD, str)));
        }
    }

    public void e(String str) {
        HiDataManager hiDataManager = this.j;
        if (hiDataManager == null) {
            return;
        }
        if (str == null) {
            LogUtil.j("HiH_PengineUserLabelMgr", "saveBindingDeviceToOdmf JsonData = null");
        } else {
            LogUtil.a("HiH_PengineUserLabelMgr", "saveBindingDeviceToOdmf, result = ", Integer.valueOf(hiDataManager.inputSourceData(1000L, str)));
        }
    }

    public void g() {
        LogUtil.a("HiH_PengineUserLabelMgr", "UploadSportEvent enter");
        if (this.j != null) {
            o();
            n();
            j();
        }
    }

    private void o() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("121.525");
        jSONArray.put("25.0392");
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(10);
        jSONArray2.put(20);
        jSONArray2.put(10);
        jSONArray2.put(10);
        jSONArray2.put(20);
        jSONArray2.put(30);
        JSONArray jSONArray3 = new JSONArray();
        jSONArray3.put(3);
        jSONArray3.put(4);
        jSONArray3.put(3);
        jSONArray3.put(4);
        jSONArray3.put(5);
        jSONArray3.put(6);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("SportType", 257);
            jSONObject.put("SportStartTime", "2018-10-10 10:10:10");
            jSONObject.put("DeviceID", "xxxxxx");
            jSONObject.put("SportStartGPS", jSONArray);
            jSONObject.put("SportDuration", 3600);
            jSONObject.put("HeartDistribution", jSONArray2);
            jSONObject.put("SportSpeedDistribution", jSONArray3);
            jSONObject.put("HeatQuantity", 1200);
            LogUtil.a("HiH_PengineUserLabelMgr", "uploadWalkEvent, jsonObjectWalk = ", jSONObject.toString());
        } catch (JSONException unused) {
            LogUtil.e("HiH_PengineUserLabelMgr", "uploadWalkEvent jsonObjectWalk JSONException");
        }
        LogUtil.a("HiH_PengineUserLabelMgr", "uploadWalkEvent sportType = 257 , resultWalk = ", Integer.valueOf(this.j.inputSourceData(Const.RawDataType.HEALTH_EVENT_RECORD, jSONObject.toString())));
    }

    private void n() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("21.525");
        jSONArray.put("55.0392");
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(20);
        jSONArray2.put(10);
        jSONArray2.put(20);
        jSONArray2.put(10);
        jSONArray2.put(20);
        jSONArray2.put(20);
        JSONArray jSONArray3 = new JSONArray();
        jSONArray3.put(1);
        jSONArray3.put(2);
        jSONArray3.put(3);
        jSONArray3.put(4);
        jSONArray3.put(5);
        jSONArray3.put(6);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("SportType", 258);
            jSONObject.put("SportStartTime", "2018-11-11 11:11:11");
            jSONObject.put("DeviceID", "11111111");
            jSONObject.put("SportStartGPS", jSONArray);
            jSONObject.put("SportDuration", 600);
            jSONObject.put("HeartDistribution", jSONArray2);
            jSONObject.put("SportSpeedDistribution", jSONArray3);
            jSONObject.put("HeatQuantity", 2300);
            LogUtil.a("HiH_PengineUserLabelMgr", "upLoadRunEvent, jsonObjectRun = ", jSONObject.toString());
        } catch (JSONException unused) {
            LogUtil.e("HiH_PengineUserLabelMgr", "upLoadRunEvent jsonObjectRun JSONException");
        }
        LogUtil.a("HiH_PengineUserLabelMgr", "upLoadRunEvent sportType = 258 , resultRun = ", Integer.valueOf(this.j.inputSourceData(Const.RawDataType.HEALTH_EVENT_RECORD, jSONObject.toString())));
    }

    private void j() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("22.123");
        jSONArray.put("82.0312");
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(30);
        jSONArray2.put(10);
        jSONArray2.put(20);
        jSONArray2.put(10);
        jSONArray2.put(10);
        jSONArray2.put(20);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("SportType", 1001);
            jSONObject.put("SportStartTime", "2018-12-12 12:12:12");
            jSONObject.put("DeviceID", "22222222");
            jSONObject.put("SportStartGPS", jSONArray);
            jSONObject.put("SportDuration", 6000);
            jSONObject.put("HeartDistribution", jSONArray2);
            jSONObject.put("SportSpeedDistribution", (Object) null);
            jSONObject.put("HeatQuantity", IEventListener.EVENT_ID_MSDP_PORT_NUMBER);
            LogUtil.a("HiH_PengineUserLabelMgr", "upLoadExerciseEvent, jsonObjectExercise = ", jSONObject.toString());
        } catch (JSONException unused) {
            LogUtil.e("HiH_PengineUserLabelMgr", "upLoadExerciseEvent jsonObjectExercise JSONException");
        }
        LogUtil.a("HiH_PengineUserLabelMgr", "upLoadExerciseEvent sportType = 1001 , resultExercise = ", Integer.valueOf(this.j.inputSourceData(Const.RawDataType.HEALTH_EVENT_RECORD, jSONObject.toString())));
    }

    public void e() {
        LogUtil.a("HiH_PengineUserLabelMgr", "UploadBindingDevice enter");
        if (this.j == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("DeviceName", "Huawei Watch 2");
            jSONObject.put("DeviceID", "xxxxxx");
            jSONObject.put("DeviceType", 0);
            jSONObject.put("DeviceActiveTime", "2018-10-19 23:52:18");
            jSONObject.put("DeviceBrand", "Huawei");
            LogUtil.a("HiH_PengineUserLabelMgr", "UploadBindingDevice, jsonObject = ", jSONObject.toString());
        } catch (JSONException unused) {
            LogUtil.e("HiH_PengineUserLabelMgr", "UploadBindingDevice JSONException");
        }
        LogUtil.a("HiH_PengineUserLabelMgr", "UploadBindingDevice DeviceName = Huawei Watch 2 , result = ", Integer.valueOf(this.j.inputSourceData(1000L, jSONObject.toString())));
    }

    public void a() {
        LogUtil.a("HiH_PengineUserLabelMgr", "UploadSleepData enter");
        if (this.j == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(5);
        jSONArray.put(45);
        jSONArray.put(50);
        try {
            jSONObject.put("SleepStartTime", "2018-11-19 23:52:18");
            jSONObject.put("SleepEndTime", "2018-11-20 08:05:18");
            jSONObject.put("SleepQualityDistribution", jSONArray);
            LogUtil.a("HiH_PengineUserLabelMgr", "UploadSleepData, jsonObject = ", jSONObject.toString());
        } catch (JSONException unused) {
            LogUtil.e("HiH_PengineUserLabelMgr", "UploadSleepData JSONException");
        }
        LogUtil.a("HiH_PengineUserLabelMgr", "UploadSleepData , result = ", Integer.valueOf(this.j.inputSourceData(Const.RawDataType.HEALTH_SLEEP_RECORD, jSONObject.toString())));
    }

    public HashMap<String, String> d() {
        LogUtil.a("HiH_PengineUserLabelMgr", "getLabelByKey enter");
        HashMap<String, String> map = new HashMap<>();
        if (this.j != null) {
            ContentResolver contentResolver = this.i.getContentResolver();
            for (Map.Entry<String, String> entry : f34239c.entrySet()) {
                Uri uri = Uri.parse(entry.getValue());
                Cursor cursorQuery = null;
                try {
                    try {
                        cursorQuery = contentResolver.query(uri, null, null, null, null);
                        if (cursorQuery != null) {
                            while (cursorQuery.moveToNext()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("uriValue"));
                                if (string != null) {
                                    map.put(entry.getKey(), string);
                                }
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        } else {
                            LogUtil.j("HiH_PengineUserLabelMgr", "getLabelByKey cursor is null", " uri = ", uri);
                        }
                    } catch (Throwable th) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th;
                    }
                } catch (SQLException | OperationCanceledException e) {
                    LogUtil.e("HiH_PengineUserLabelMgr", "getLabelByKey SQLException | OperationCanceledException e = ", e.getClass().getName());
                    if (cursorQuery == null) {
                        LogUtil.j("HiH_PengineUserLabelMgr", "getLabelByKey cursor is null", " uri = ", uri);
                    }
                }
            }
        }
        return map;
    }

    public void d(BaseResponseCallback<HashMap<String, String>> baseResponseCallback) {
        if (this.j == null) {
            LogUtil.j("HiH_PengineUserLabelMgr", "getLabels mHiDataManager == null");
            b(-1, baseResponseCallback, null);
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = {false};
        ThreadPoolManager.c().execute(new Runnable() { // from class: fmb.1
            @Override // java.lang.Runnable
            public void run() {
                zArr[0] = fmb.this.e.connectService(new AwarenessServiceConnection() { // from class: fmb.1.5
                    @Override // com.huawei.hiai.awareness.client.AwarenessServiceConnection
                    public void onConnected() {
                        LogUtil.a("HiH_PengineUserLabelMgr", "isConnected true");
                        fmb.this.f = true;
                        if (countDownLatch != null) {
                            countDownLatch.countDown();
                        }
                    }

                    @Override // com.huawei.hiai.awareness.client.AwarenessServiceConnection
                    public void onDisconnected() {
                        LogUtil.a("HiH_PengineUserLabelMgr", "isConnected false");
                        fmb.this.f = false;
                        if (countDownLatch != null) {
                            countDownLatch.countDown();
                        }
                    }
                });
            }
        });
        try {
            LogUtil.a("HiH_PengineUserLabelMgr", "isCountZero= ", Boolean.valueOf(countDownLatch.await(5L, TimeUnit.SECONDS)), "isConnected= ", Boolean.valueOf(this.f));
        } catch (InterruptedException e) {
            ReleaseLogUtil.a("HiH_PengineUserLabelMgr", "interruptedException", ExceptionUtils.c(e));
        } catch (Exception e2) {
            ReleaseLogUtil.a("HiH_PengineUserLabelMgr", "exception:", ExceptionUtils.c(e2));
        }
        LogUtil.a("HiH_PengineUserLabelMgr", "getLabels isConnectService:", Boolean.valueOf(zArr[0]));
        if (!zArr[0]) {
            b(-1, baseResponseCallback, null);
        } else {
            a(baseResponseCallback);
        }
    }

    private void a(final BaseResponseCallback<HashMap<String, String>> baseResponseCallback) {
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<String, String> entry : f34238b.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        if (njy.e(arrayList)) {
            LogUtil.j("HiH_PengineUserLabelMgr", "keyList isEmpty");
            b(-1, baseResponseCallback, null);
            return;
        }
        final String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
        LogUtil.a("HiH_PengineUserLabelMgr", "getLabels addLabels:", Arrays.toString(strArr));
        ProfileLabel profileLabelCreate = ProfileLabel.create(300000001);
        profileLabelCreate.putArg("labels", strArr);
        try {
            AwarenessRequest profileLabel = AwarenessRequest.getProfileLabel(profileLabelCreate, new OnEnvelopeReceiver.Stub() { // from class: fmb.3
                @Override // com.huawei.hiai.awareness.client.OnEnvelopeReceiver
                public void onReceive(AwarenessEnvelope awarenessEnvelope) {
                    fmb.this.h();
                    if (awarenessEnvelope != null) {
                        fmb.this.e(awarenessEnvelope, baseResponseCallback, strArr, arrayList);
                    } else {
                        LogUtil.j("HiH_PengineUserLabelMgr", "awarenessEnvelope is null");
                        fmb.this.b(-1, baseResponseCallback, null);
                    }
                }
            });
            if (this.f) {
                ReleaseLogUtil.d("HiH_PengineUserLabelMgr", "isDispatch: ", Boolean.valueOf(this.e.dispatch(profileLabel)));
            }
        } catch (Exception e) {
            ReleaseLogUtil.a("HiH_PengineUserLabelMgr", "Exception", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(AwarenessEnvelope awarenessEnvelope, BaseResponseCallback<HashMap<String, String>> baseResponseCallback, String[] strArr, List<String> list) {
        Bundle args = awarenessEnvelope.getArgs();
        LogUtil.a("HiH_PengineUserLabelMgr", "parseEnvelope begin");
        if (args == null) {
            LogUtil.j("HiH_PengineUserLabelMgr", "args is null");
            b(-1, baseResponseCallback, null);
            return;
        }
        byte[] byteArray = args.getByteArray("Content");
        if (byteArray == null) {
            LogUtil.j("HiH_PengineUserLabelMgr", "bytes == null ");
            b(-1, baseResponseCallback, null);
            return;
        }
        try {
            List list2 = (List) new Gson().fromJson(new String(byteArray), new TypeToken<List<String>>() { // from class: com.huawei.health.hwuserlabelmgr.manager.PengineUserLabelMgr$3
            }.getType());
            if (njy.e(list2)) {
                LogUtil.j("HiH_PengineUserLabelMgr", "list isEmpty ");
                b(-1, baseResponseCallback, null);
                return;
            }
            if (list2.size() != list.size()) {
                LogUtil.j("HiH_PengineUserLabelMgr", "data mismatch");
                b(-1, baseResponseCallback, null);
                return;
            }
            HashMap<String, String> map = new HashMap<>();
            for (int i = 0; i < list2.size(); i++) {
                String str = list.get(i);
                String str2 = (String) list2.get(i);
                LogUtil.a("HiH_PengineUserLabelMgr", "key: ", str, " label: ", strArr[i], " content: ", str2);
                if (!TextUtils.isEmpty(str2)) {
                    map.put(str, str2);
                }
            }
            b(0, baseResponseCallback, map);
        } catch (Exception e) {
            ReleaseLogUtil.a("HiH_PengineUserLabelMgr", "awarenessEnvelope exception" + ExceptionUtils.c(e));
            b(-1, baseResponseCallback, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, BaseResponseCallback<HashMap<String, String>> baseResponseCallback, HashMap<String, String> map) {
        LogUtil.a("HiH_PengineUserLabelMgr", "callBack errorCode: ", Integer.valueOf(i));
        if (baseResponseCallback == null) {
            LogUtil.a("HiH_PengineUserLabelMgr", "callback == null ");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        baseResponseCallback.onResponse(i, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtil.a("HiH_PengineUserLabelMgr", "disconnectService");
        AwarenessManager awarenessManager = this.e;
        if (awarenessManager != null) {
            awarenessManager.disconnectService();
        }
    }
}
