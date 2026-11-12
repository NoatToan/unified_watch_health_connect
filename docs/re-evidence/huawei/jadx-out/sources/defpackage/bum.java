package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.basichealth.bloodsugar.BloodSugarEngineLogicManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.model.HiBloodSugarMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class bum {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile bum f1164c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BloodSugarEngineLogicManager f1165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<String> f1166b;
    private final Context d;
    private volatile long f;
    private final ThreadPoolManager g;
    private BroadcastReceiver h = new BroadcastReceiver() { // from class: bum.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("BloodSugarSyncManager", "intent is null");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("BloodSugarSyncManager", "mSyncBloodSugarDataReceiver action: ", action);
            if ("com.huawei.health.action.SYNC_BLOOD_SUGAR_DATA".equals(action)) {
                bum.this.d();
            }
        }
    };

    private bum() {
        Context context = BaseApplication.getContext();
        this.d = context;
        this.g = ThreadPoolManager.d(1, 1);
        this.f1166b = new AtomicReference<>();
        BroadcastManagerUtil.d(context, this.h, new IntentFilter("com.huawei.health.action.SYNC_BLOOD_SUGAR_DATA"));
    }

    public static bum c() {
        if (f1164c == null) {
            LogUtil.d("BloodSugarSyncManager", "mInstance go init");
            synchronized (e) {
                if (f1164c == null) {
                    f1164c = new bum();
                }
            }
        }
        return f1164c;
    }

    public void d() {
        LogUtil.a("BloodSugarSyncManager", "start mManager is ", this.f1165a);
        if (this.f1165a == null) {
            BloodSugarEngineLogicManager bloodSugarEngineLogicManager = new BloodSugarEngineLogicManager(this.d);
            this.f1165a = bloodSugarEngineLogicManager;
            bloodSugarEngineLogicManager.e(new BloodSugarEngineLogicManager.BloodSugarEngineLogicListener() { // from class: bum.1
                @Override // com.huawei.basichealth.bloodsugar.BloodSugarEngineLogicManager.BloodSugarEngineLogicListener
                public void onDeviceConnected(String str) {
                    LogUtil.a("BloodSugarSyncManager", "onDeviceConnected");
                    bum.this.f1166b.set(str);
                    bum.this.h();
                }

                @Override // com.huawei.basichealth.bloodsugar.BloodSugarEngineLogicManager.BloodSugarEngineLogicListener
                public void onDeviceDisconnected() {
                    LogUtil.a("BloodSugarSyncManager", "onDeviceDisconnected");
                    bum.this.f1166b.set(null);
                }

                @Override // com.huawei.basichealth.bloodsugar.BloodSugarEngineLogicManager.BloodSugarEngineLogicListener
                public void onReceiveDeviceCommand(byte[] bArr) {
                    if (bArr == null) {
                        LogUtil.j("BloodSugarSyncManager", "data is null");
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    LogUtil.a("BloodSugarSyncManager", "onReceiveDeviceCommand, currentTime = ", Long.valueOf(jCurrentTimeMillis), ", diffTime = ", Long.valueOf(Math.subtractExact(jCurrentTimeMillis, bum.this.f)));
                    String str = (String) bum.this.f1166b.get();
                    if (str != null) {
                        bum.this.b(bArr, str);
                    } else {
                        LogUtil.j("BloodSugarSyncManager", "ReceiveDeviceCommand deviceUuid is null");
                    }
                }
            });
            LogUtil.a("BloodSugarSyncManager", "create mManager is ", this.f1165a);
        }
        if (TextUtils.isEmpty(this.f1166b.get())) {
            String strA = this.f1165a.a((DeviceInfo) null);
            LogUtil.a("BloodSugarSyncManager", "deviceUuid = ", strA);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            this.f1166b.set(strA);
            h();
            return;
        }
        h();
    }

    private JSONObject c(int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", "1");
        jSONObject.put("msgType", i);
        jSONObject.put("msgBody", new JSONObject());
        return jSONObject;
    }

    private void d(Runnable runnable) {
        this.g.execute(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtil.a("BloodSugarSyncManager", "sync data");
        d(new Runnable() { // from class: bup
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b();
            }
        });
    }

    /* synthetic */ void b() {
        this.f1165a.a(new PingCallback() { // from class: buq
            @Override // com.huawei.health.deviceconnect.callback.PingCallback
            public final void onPingResult(int i) {
                this.e.a(i);
            }
        });
    }

    /* synthetic */ void a(final int i) {
        LogUtil.a("BloodSugarSyncManager", "onPingResult code = ", Integer.valueOf(i));
        d(new Runnable() { // from class: buw
            @Override // java.lang.Runnable
            public final void run() {
                this.f1182b.e(i);
            }
        });
    }

    /* synthetic */ void e(int i) {
        if (i == 202) {
            a();
        }
    }

    private void a() {
        LogUtil.a("BloodSugarSyncManager", "sendSyncMessage");
        try {
            JSONObject jSONObjectC = c(1002);
            JSONObject jSONObject = jSONObjectC.getJSONObject("msgBody");
            this.f = System.currentTimeMillis();
            jSONObject.put("time", this.f);
            jSONObject.put("triggerBloodSugar", true);
            this.f1165a.b(e(jSONObjectC));
            LogUtil.a("BloodSugarSyncManager", "sendSyncMessage time = ", Long.valueOf(this.f));
        } catch (UnsupportedEncodingException | JSONException unused) {
            LogUtil.e("BloodSugarSyncManager", "syncData JSONException or UnsupportedEncodingException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final byte[] bArr, final String str) {
        LogUtil.a("BloodSugarSyncManager", "execute parseAndRespond");
        d(new Runnable() { // from class: buo
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a(bArr, str);
            }
        });
    }

    /* synthetic */ void a(byte[] bArr, String str) {
        int iC = c(bArr, str);
        LogUtil.d("BloodSugarSyncManager", "parseAndResponse resultCode = ", Integer.valueOf(iC), " deviceUuid ", str);
        if (iC == 0) {
            e(true, str);
        } else if (iC == 1) {
            e(false, str);
        } else {
            LogUtil.a("BloodSugarSyncManager", "do not respond msg");
        }
    }

    private void e(boolean z, String str) {
        String str2 = this.f1166b.get();
        LogUtil.d("BloodSugarSyncManager", "responseAppCommand currentUuid is ", str2);
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        a(z);
    }

    private int c(byte[] bArr, String str) {
        LogUtil.a("BloodSugarSyncManager", "execute parseMessage");
        int iB = -1;
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr, "UTF-8"));
            String string = jSONObject.getString("version");
            if (TextUtils.isEmpty(string)) {
                LogUtil.j("BloodSugarSyncManager", "parseResponse version = null");
                return -1;
            }
            LogUtil.d("BloodSugarSyncManager", "parseResponse json ", jSONObject.toString());
            if (string.hashCode() == 49 && string.equals("1")) {
                iB = b(jSONObject, str);
            } else {
                LogUtil.j("BloodSugarSyncManager", "parseResponse Unknown version, version = ", string);
            }
            LogUtil.a("BloodSugarSyncManager", "execute parseMessage resultCode = ", Integer.valueOf(iB));
            return iB;
        } catch (UnsupportedEncodingException | JSONException e2) {
            LogUtil.e("BloodSugarSyncManager", e2);
        }
    }

    private int b(JSONObject jSONObject, String str) {
        int iD;
        LogUtil.a("BloodSugarSyncManager", "execute parseMessageVersionOne");
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("msgBody");
            if (TextUtils.isEmpty(jSONObject2.toString())) {
                LogUtil.j("BloodSugarSyncManager", "parseResponseDataVersionOne messageBody is empty");
            } else {
                int i = jSONObject.getInt("msgType");
                if (i == 1001) {
                    iD = d(jSONObject2);
                } else if (i == 1003) {
                    iD = d(jSONObject2, str);
                } else {
                    LogUtil.j("BloodSugarSyncManager", "messageType is Unknown, messageType = ", Integer.valueOf(i), " object: ", jSONObject.toString());
                }
                LogUtil.a("BloodSugarSyncManager", "execute parseMessageVersionOne resultCode = ", Integer.valueOf(iD));
                return iD;
            }
        } catch (JSONException e2) {
            LogUtil.e("BloodSugarSyncManager", e2);
        }
        iD = -1;
        LogUtil.a("BloodSugarSyncManager", "execute parseMessageVersionOne resultCode = ", Integer.valueOf(iD));
        return iD;
    }

    private int d(JSONObject jSONObject) {
        int i;
        LogUtil.a("BloodSugarSyncManager", "execute parseThresholdDataVersionOne");
        try {
            CountDownLatch countDownLatch = new CountDownLatch(2);
            AtomicInteger atomicInteger = new AtomicInteger(2);
            c("BLOOD_SUGAR_CONTINUE_MAX_THRESHOLD", jSONObject.getString("bloodSugarMaxTreshold"), countDownLatch, atomicInteger);
            c("BLOOD_SUGAR_CONTINUE_MIN_THRESHOLD", jSONObject.getString("bloodSugarMinTreshold"), countDownLatch, atomicInteger);
            countDownLatch.await();
            i = atomicInteger.get() == 0 ? 0 : 1;
        } catch (InterruptedException e2) {
            LogUtil.e("BloodSugarSyncManager", e2);
        } catch (JSONException e3) {
            LogUtil.e("BloodSugarSyncManager", e3);
            i = -1;
        }
        LogUtil.a("BloodSugarSyncManager", "execute parseThresholdDataVersionOne resultCode = ", Integer.valueOf(i));
        return i;
    }

    private int d(JSONObject jSONObject, String str) {
        LogUtil.a("BloodSugarSyncManager", "execute parseBloodSugarDataVersionOne");
        int iD = -1;
        try {
            int i = jSONObject.getInt("type");
            LogUtil.a("BloodSugarSyncManager", "parseBloodSugarDataVersionOne type = ", Integer.valueOf(i));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
            if (jSONArrayOptJSONArray == null) {
                LogUtil.a("BloodSugarSyncManager", "bloodSugar sync finish");
                e();
                return -1;
            }
            LogUtil.a("BloodSugarSyncManager", "bloodSugar length is ", Integer.valueOf(jSONArrayOptJSONArray.length()));
            iD = d(jSONArrayOptJSONArray, i, str);
            LogUtil.a("BloodSugarSyncManager", "execute parseBloodSugarDataVersionOne resultCode = ", Integer.valueOf(iD));
            return iD;
        } catch (JSONException e2) {
            LogUtil.e("BloodSugarSyncManager", e2);
        }
    }

    private int d(JSONArray jSONArray, int i, String str) {
        try {
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (TextUtils.isEmpty(jSONObject.toString())) {
                    LogUtil.j("BloodSugarSyncManager", "insertBloodSugarData data is empty");
                    return -1;
                }
                long j = jSONObject.getLong("startTime");
                JSONObject jSONObject2 = jSONObject.getJSONObject("value");
                if (TextUtils.isEmpty(jSONObject2.toString())) {
                    LogUtil.j("BloodSugarSyncManager", "insertBloodSugarData value is empty");
                    return -1;
                }
                LogUtil.d("BloodSugarSyncManager", "TYPE_BLOOD_SUGAR_CONTINUE is inserting", ", time=", Long.valueOf(j), ", type=", Integer.valueOf(i), ", value=", jSONObject2);
                double d = jSONObject2.getDouble("bloodSugar");
                HiHealthData hiHealthData = new HiHealthData(2108);
                hiHealthData.setDeviceUuid(str);
                hiHealthData.setTimeInterval(j, j);
                hiHealthData.setType(i);
                hiHealthData.setValue(d);
                HiBloodSugarMetaData hiBloodSugarMetaData = new HiBloodSugarMetaData();
                hiBloodSugarMetaData.setConfirmed(true);
                hiHealthData.setMetaData(HiJsonUtil.d(hiBloodSugarMetaData));
                hiDataInsertOption.addData(hiHealthData);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AtomicInteger atomicInteger = new AtomicInteger(1);
            d(hiDataInsertOption, countDownLatch, atomicInteger);
            countDownLatch.await();
            LogUtil.a("BloodSugarSyncManager", "insertBatchData time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            return atomicInteger.get() == 0 ? 0 : 1;
        } catch (InterruptedException e2) {
            LogUtil.e("BloodSugarSyncManager", e2);
            return 1;
        } catch (JSONException e3) {
            LogUtil.e("BloodSugarSyncManager", e3);
            return -1;
        }
    }

    private void a(boolean z) {
        try {
            JSONObject jSONObjectC = c(900);
            jSONObjectC.getJSONObject("msgBody").put("errcode", !z ? 1 : 0);
            this.f1165a.b(e(jSONObjectC));
            this.f = System.currentTimeMillis();
            LogUtil.d("BloodSugarSyncManager", "sendCommand 900 to response ", Boolean.valueOf(z));
        } catch (UnsupportedEncodingException | JSONException unused) {
            LogUtil.e("BloodSugarSyncManager", "responseCommand JSONException or UnsupportedEncodingException");
        }
    }

    private byte[] e(JSONObject jSONObject) throws UnsupportedEncodingException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private void c(final String str, final String str2, final CountDownLatch countDownLatch, final AtomicInteger atomicInteger) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: bur
            @Override // java.lang.Runnable
            public final void run() {
                bum.e(str, str2, atomicInteger, countDownLatch);
            }
        });
    }

    static /* synthetic */ void e(String str, String str2, AtomicInteger atomicInteger, CountDownLatch countDownLatch) {
        if (HiHealthManager.d(BaseApplication.getContext()).setUserPreference(new HiUserPreference(str, str2), true)) {
            LogUtil.d("BloodSugarSyncManager", "Succeeded to insertThreshold type = ", str, ", value = ", str2);
            atomicInteger.decrementAndGet();
        } else {
            LogUtil.j("BloodSugarSyncManager", "Failed to insertThreshold type = ", str, ", value = ", str2);
        }
        countDownLatch.countDown();
        ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).setPreference(str, str2);
    }

    private void d(HiDataInsertOption hiDataInsertOption, final CountDownLatch countDownLatch, final AtomicInteger atomicInteger) {
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: bun
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                bum.d(atomicInteger, countDownLatch, i, obj);
            }
        });
    }

    static /* synthetic */ void d(AtomicInteger atomicInteger, CountDownLatch countDownLatch, int i, Object obj) {
        if (obj == null || i != 0) {
            LogUtil.j("BloodSugarSyncManager", "Failed to insertBatchData, errorCode=", Integer.valueOf(i));
        } else {
            LogUtil.a("BloodSugarSyncManager", "Succeeded to insertBatchData");
            atomicInteger.decrementAndGet();
        }
        countDownLatch.countDown();
    }

    private void e() {
        Intent intent = new Intent();
        intent.setClassName(this.d, "com.huawei.ui.main.stories.fitness.activity.coresleep.notification.HealthCommondReceiver");
        intent.setAction("ACTION_BLOOD_SUGAR_SYNC");
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }
}
