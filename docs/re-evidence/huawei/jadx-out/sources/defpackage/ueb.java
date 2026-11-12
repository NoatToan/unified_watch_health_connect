package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import health.compact.a.HEXUtils;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class ueb extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f49980a = new Object();
    private static volatile ueb e;

    private ueb() {
        super(BaseApplication.b());
    }

    public static ueb a() {
        if (e == null) {
            synchronized (f49980a) {
                if (e == null) {
                    e = new ueb();
                }
            }
        }
        return e;
    }

    private void e() {
        lsb.d().e(20211202);
        uek.d(uek.b(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getString(R.string.IDS_ecg_collection_title), com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getString(R.string.IDS_ecg_remind_measure), false));
    }

    private void d(final byte[] bArr) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: uej
            @Override // java.lang.Runnable
            public final void run() {
                this.f49989c.a(bArr);
            }
        });
    }

    /* synthetic */ void a(byte[] bArr) {
        LogUtil.a("EcgReminderEngineLogicMgr", "parseMessage");
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr, StandardCharsets.UTF_8));
            int i = jSONObject.getInt("version");
            if (i == 1) {
                b(jSONObject);
            } else {
                LogUtil.j("EcgReminderEngineLogicMgr", "parseMessage, unknown version = ", Integer.valueOf(i));
            }
        } catch (JSONException unused) {
            LogUtil.e("EcgReminderEngineLogicMgr", "parseMessage, JSONException");
        }
    }

    private void b(JSONObject jSONObject) {
        try {
            int i = jSONObject.getInt("msgType");
            JSONObject jSONObject2 = jSONObject.getJSONObject("msgBody");
            if (i != 900) {
                LogUtil.j("EcgReminderEngineLogicMgr", "unknow case, type = ", Integer.valueOf(i));
            } else if (jSONObject2.getInt("errorCode") != 2) {
                e();
            }
        } catch (JSONException unused) {
            LogUtil.e("EcgReminderEngineLogicMgr", "parseMessageVersionOne, JSONException");
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        if (xiuVar == null) {
            LogUtil.j("EcgReminderEngineLogicMgr", "message is null");
        } else {
            d(xiuVar.b());
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.ECG_REMINDER_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "hw.watch.ecgrecorder.p2p";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        LogUtil.a("EcgReminderEngineLogicMgr", "connectState ", connectState);
        if (connectState == ConnectState.CONNECTED) {
            LogUtil.a("EcgReminderEngineLogicMgr", "onDeviceConnected");
        } else {
            LogUtil.a("EcgReminderEngineLogicMgr", "onDeviceDisconnected");
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void pingComand(PingCallback pingCallback, String str) {
        super.pingComand(pingCallback, str);
    }

    public JSONObject a(int i, String str, String str2, String str3, String str4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("msgType", i);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("title", str);
        jSONObject2.put("content", str2);
        jSONObject2.put("button1Text", str3);
        jSONObject2.put("button2Text", str4);
        jSONObject.put("msgBody", jSONObject2);
        return jSONObject;
    }

    public void e(String str) {
        sendComand(new xiu.c().a(uek.e(HEXUtils.a("00000000"), str.getBytes(StandardCharsets.UTF_8))).c(), new SendCallback() { // from class: ueb.5
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                LogUtil.a("EcgReminderEngineLogicMgr", "sendCommand, onSendResult, i = ", Integer.valueOf(i));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a("EcgReminderEngineLogicMgr", "sendCommand, onSendProgress, l = ", Long.valueOf(j));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str2) {
                LogUtil.a("EcgReminderEngineLogicMgr", "sendCommand transferWay: ", str2);
            }
        });
    }
}
