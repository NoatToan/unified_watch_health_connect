package com.huawei.basichealth.bloodpressure;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import androidx.core.util.Pair;
import com.google.gson.Gson;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.MainLoginCallBack;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import defpackage.dfl;
import defpackage.ecu;
import defpackage.eey;
import defpackage.xiu;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class BloodPressureSyncManager extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f5282a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AtomicInteger f5283b;
    private static volatile BloodPressureSyncManager e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Pair<Integer, IBloodPressureMeasureCallback> f5284c;
    private ExtendHandler d;
    private final ThreadPoolManager f;
    private Runnable h;

    public interface IBloodPressureMeasureCallback {
        void onMeasureFinish(int i, long j);

        void onMeasureStart(long j);

        void onNotifyMeasure(int i);
    }

    private BloodPressureSyncManager() {
        super(BaseApplication.b());
        this.d = null;
        this.f = ThreadPoolManager.b(1, 1, "BloodPressureSyncManager");
        this.d = HandlerCenter.b(new Handler.Callback() { // from class: com.huawei.basichealth.bloodpressure.BloodPressureSyncManager.3
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                return false;
            }
        }, "BloodPressureSyncManager");
    }

    public static BloodPressureSyncManager d() {
        synchronized (f5282a) {
            if (e == null) {
                f5283b = new AtomicInteger();
                e = new BloodPressureSyncManager();
            }
            f5283b.incrementAndGet();
        }
        return e;
    }

    private static void f() {
        LogUtil.a("BloodPressureSyncManager", "destory");
        f5283b = null;
        e = null;
    }

    public void c() {
        LogUtil.a("BloodPressureSyncManager", "release");
        synchronized (f5282a) {
            AtomicInteger atomicInteger = f5283b;
            if (atomicInteger != null && atomicInteger.decrementAndGet() == 0) {
                this.f.shutdown();
                this.d.quit(false);
                e.onDestroy();
                f();
            }
        }
    }

    private void d(Runnable runnable) {
        this.f.execute(runnable);
    }

    private void e(final byte[] bArr) {
        d(new Runnable() { // from class: bui
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(bArr);
            }
        });
    }

    public /* synthetic */ void c(byte[] bArr) {
        LogUtil.a("BloodPressureSyncManager", "parseMessage");
        try {
            String str = new String(bArr, StandardCharsets.UTF_8);
            LogUtil.a("BloodPressureSyncManager", "receive, ", str);
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("version");
            if (i == 1) {
                a(jSONObject);
            } else {
                LogUtil.j("BloodPressureSyncManager", "parseResponse Unknown version, version = ", Integer.valueOf(i));
            }
        } catch (JSONException e2) {
            LogUtil.e("BloodPressureSyncManager", e2);
        }
    }

    private void a(JSONObject jSONObject) {
        try {
            int i = jSONObject.getInt("msgType");
            JSONObject jSONObject2 = jSONObject.getJSONObject("msgBody");
            if (i == 900) {
                d(jSONObject2);
                return;
            }
            if (i == 8003) {
                e(jSONObject2);
            } else if (i != 8004) {
                LogUtil.j("BloodPressureSyncManager", "unknow case, type=", Integer.valueOf(i));
            } else {
                c(jSONObject2);
            }
        } catch (JSONException unused) {
            LogUtil.e("BloodPressureSyncManager", "startMeasure parseMessageVersionOne");
        }
    }

    private void d(JSONObject jSONObject) throws JSONException {
        LogUtil.a("BloodPressureSyncManager", "common response");
        int i = jSONObject.getInt("errcode");
        int i2 = jSONObject.getInt("rspMsgType");
        if (i2 == 8001) {
            if (i == 0) {
                LogUtil.a("BloodPressureSyncManager", "sync measure plan successed");
            } else {
                LogUtil.a("BloodPressureSyncManager", "sync measure plan failed");
            }
            c();
            return;
        }
        if (i2 != 8002) {
            if (i2 == 8005) {
                LogUtil.a("BloodPressureSyncManager", "sync wake up, code=", Integer.valueOf(i));
                c();
                return;
            } else {
                LogUtil.j("BloodPressureSyncManager", "unknow case, rspCode=", Integer.valueOf(i2));
                return;
            }
        }
        LogUtil.a("BloodPressureSyncManager", "notify measure, code=", Integer.valueOf(i));
        Pair<Integer, IBloodPressureMeasureCallback> pair = this.f5284c;
        if (pair != null) {
            pair.second.onNotifyMeasure(i);
            if (i != 0) {
                this.f5284c = null;
            }
        }
    }

    private void c(JSONObject jSONObject) throws JSONException {
        LogUtil.a("BloodPressureSyncManager", "measure finish");
        if (this.f5284c == null || jSONObject.getInt(EventMonitorRecord.EVENT_ID) != this.f5284c.first.intValue()) {
            return;
        }
        b(jSONObject.getInt("resultCode"), jSONObject.getLong("endTime"));
    }

    private void e(JSONObject jSONObject) throws JSONException {
        LogUtil.a("BloodPressureSyncManager", "measure start");
        if (this.f5284c == null || jSONObject.getInt(EventMonitorRecord.EVENT_ID) != this.f5284c.first.intValue()) {
            return;
        }
        j();
        this.f5284c.second.onMeasureStart(jSONObject.getLong("startTime"));
    }

    public void d(final IBloodPressureMeasureCallback iBloodPressureMeasureCallback) {
        d(new Runnable() { // from class: buj
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a(iBloodPressureMeasureCallback);
            }
        });
    }

    public /* synthetic */ void a(IBloodPressureMeasureCallback iBloodPressureMeasureCallback) {
        LogUtil.a("BloodPressureSyncManager", "notifyWearMeasure");
        try {
            this.f5284c = Pair.create(Integer.valueOf(i()), iBloodPressureMeasureCallback);
            JSONObject jSONObjectB = b(8002);
            jSONObjectB.getJSONObject("msgBody").put(EventMonitorRecord.EVENT_ID, this.f5284c.first);
            LogUtil.a("BloodPressureSyncManager", "send,", jSONObjectB.toString());
            b(jSONObjectB.toString());
        } catch (JSONException unused) {
            LogUtil.e("BloodPressureSyncManager", "startMeasure JSONException");
        }
    }

    private int i() {
        String strValueOf = String.valueOf(SystemClock.elapsedRealtime());
        int length = strValueOf.length();
        if (length > 6) {
            strValueOf = strValueOf.substring(length - 6, length);
        }
        try {
            return Integer.parseInt(strValueOf);
        } catch (NumberFormatException unused) {
            LogUtil.e("BloodPressureSyncManager", "Failed to createEventId");
            return -1;
        }
    }

    private void j() {
        Runnable runnable = this.h;
        if (runnable != null) {
            this.d.removeTasks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: buk
            @Override // java.lang.Runnable
            public final void run() {
                this.f1163c.e();
            }
        };
        this.h = runnable2;
        LogUtil.a("BloodPressureSyncManager", "startMeasureClock, ", runnable2);
        this.d.postTask(this.h, 90000L);
    }

    public /* synthetic */ void e() {
        LogUtil.a("BloodPressureSyncManager", "execute startMeasureClock");
        b(-2, 0L);
    }

    private void b(int i, long j) {
        synchronized (f5282a) {
            Runnable runnable = this.h;
            if (runnable != null && i != -2) {
                this.d.removeTasks(runnable);
                this.h = null;
            }
            Pair<Integer, IBloodPressureMeasureCallback> pair = this.f5284c;
            if (pair != null) {
                pair.second.onMeasureFinish(i, j);
                this.f5284c = null;
            }
        }
    }

    public void b(List<dfl> list) {
        LogUtil.a("BloodPressureSyncManager", "sendMeasurePlan");
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.e("BloodPressureSyncManager", "sendMeasurePlan measurePlans is empty");
            c();
            return;
        }
        try {
            JSONObject jSONObjectB = b(8001);
            JSONArray jSONArrayD = d(new HashSet(list));
            if (jSONArrayD.length() == 0) {
                LogUtil.a("BloodPressureSyncManager", "measure plan not need sync");
                c();
            } else {
                jSONObjectB.getJSONObject("msgBody").put("planVersion", 1);
                jSONObjectB.getJSONObject("msgBody").put("data", jSONArrayD);
                LogUtil.a("BloodPressureSyncManager", "send, ", jSONObjectB.toString());
                b(jSONObjectB.toString());
            }
        } catch (JSONException unused) {
            LogUtil.e("BloodPressureSyncManager", "sendMeasurePlan JSONException");
        }
    }

    private JSONObject b(int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("msgType", i);
        jSONObject.put("msgBody", new JSONObject());
        return jSONObject;
    }

    private JSONArray d(Set<dfl> set) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (set.size() > 0) {
            jSONArray = new JSONArray(new Gson().toJson(set));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                jSONObject.remove("alarmId");
                jSONObject.remove("name");
                jSONObject.remove("retryTimes");
                jSONObject.remove("toneDuration");
                jSONObject.remove("toneInterval");
                jSONObject.remove("vibrate");
                jSONObject.remove("isNeedSync");
                jSONObject.put("enabled", jSONObject.getBoolean("enabled") ? 1 : 0);
            }
        }
        return jSONArray;
    }

    public static boolean b() {
        return eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "BloodPressureSyncManager"), 59);
    }

    public static boolean a() {
        return eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "BloodPressureSyncManager"), 264);
    }

    public void c(final int i) {
        d(new Runnable() { // from class: bul
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d(i);
            }
        });
    }

    public /* synthetic */ void d(int i) {
        LogUtil.a("BloodPressureSyncManager", "sendWakeUpPlan");
        try {
            JSONObject jSONObjectB = b(MainLoginCallBack.MSG_NO_NETWORK);
            jSONObjectB.getJSONObject("msgBody").put("switchStatus", i);
            LogUtil.a("BloodPressureSyncManager", "send,", jSONObjectB.toString());
            b(jSONObjectB.toString());
        } catch (JSONException unused) {
            LogUtil.e("BloodPressureSyncManager", "sendWakeUpPlan JSONException");
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        if (xiuVar == null) {
            LogUtil.j("BloodPressureSyncManager", "data is null");
        } else {
            e(xiuVar.b());
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.BLOOD_PRESSURE_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "hw.watch.health.bp";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        LogUtil.a("BloodPressureSyncManager", "connectState ", connectState);
        if (connectState != ConnectState.CONNECTED) {
            LogUtil.a("BloodPressureSyncManager", "onDeviceDisconnected");
            b(-1, 0L);
        }
    }

    private void b(String str) {
        sendComand(new xiu.c().a(str.getBytes(StandardCharsets.UTF_8)).c(), new SendCallback() { // from class: com.huawei.basichealth.bloodpressure.BloodPressureSyncManager.1
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                LogUtil.a("BloodPressureSyncManager", "sendCommandResult=", Integer.valueOf(i));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str2) {
                LogUtil.a("BloodPressureSyncManager", "sendCommand onFileTransferReport transferWay: ", str2);
            }
        });
    }
}
