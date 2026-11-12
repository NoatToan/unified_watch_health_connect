package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.gson.Gson;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginhealthzone.devicelink.callback.DeviceDataListener;
import com.huawei.pluginhealthzone.devicelink.deviceproxy.HealthZoneModelPolicy;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes42.dex */
public class pfu implements HealthZoneModelPolicy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile pfu f45295b;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<Integer, DeviceDataListener> f45296a;

    private pfu() {
    }

    public static pfu b() {
        if (f45295b == null) {
            synchronized (e) {
                if (f45295b == null) {
                    f45295b = new pfu();
                }
            }
        }
        return f45295b;
    }

    @Override // com.huawei.pluginhealthzone.devicelink.deviceproxy.HealthZoneModelPolicy
    public void receiveDataFromDevice(int i, xiu xiuVar) {
        LogUtil.a("HealthZoneModelPolicyControl", "receiveDataFromDevice code = ", Integer.valueOf(i));
        if (i != 530003) {
            LogUtil.j("HealthZoneModelPolicyControl", "code is not 530003");
            return;
        }
        if (xiuVar == null || xiuVar.b() == null) {
            LogUtil.j("HealthZoneModelPolicyControl", "receiveDataFromDevice msg = null");
            return;
        }
        byte[] bArrB = xiuVar.b();
        LogUtil.a("HealthZoneModelPolicyControl", "messageData = ", bArrB);
        e(bArrB);
    }

    private void e(byte[] bArr) {
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr, StandardCharsets.UTF_8));
            int i = jSONObject.getInt("msgType");
            LogUtil.a("HealthZoneModelPolicyControl", "msgType = ", Integer.valueOf(i));
            HashMap<Integer, DeviceDataListener> map = this.f45296a;
            if (map == null) {
                LogUtil.j("HealthZoneModelPolicyControl", "dataListeners = null");
                return;
            }
            DeviceDataListener deviceDataListener = map.get(Integer.valueOf(i));
            if (deviceDataListener == null) {
                LogUtil.j("HealthZoneModelPolicyControl", "deviceDataListener = null");
            } else {
                deviceDataListener.onResult(jSONObject.getJSONObject("msgBody").getInt("resultCode"), null);
            }
        } catch (JSONException unused) {
            LogUtil.e("HealthZoneModelPolicyControl", "jsonException");
        }
    }

    public void a(DeviceDataListener deviceDataListener, int i) {
        if (this.f45296a == null) {
            this.f45296a = new HashMap<>();
        }
        this.f45296a.put(Integer.valueOf(i), deviceDataListener);
    }

    public void a(int i) {
        HashMap<Integer, DeviceDataListener> map = this.f45296a;
        if (map == null || !map.containsKey(Integer.valueOf(i))) {
            return;
        }
        this.f45296a.remove(Integer.valueOf(i));
    }

    @Override // com.huawei.pluginhealthzone.devicelink.deviceproxy.HealthZoneModelPolicy
    public void activeSendMsgToDevice(int i, final pfx pfxVar, final DeviceDataListener deviceDataListener) {
        LogUtil.a("HealthZoneModelPolicyControl", "activeSendMsgToDevice responseMsgBody = ", pfxVar.toString());
        pfv.e().pingComand(new PingCallback() { // from class: pga
            @Override // com.huawei.health.deviceconnect.callback.PingCallback
            public final void onPingResult(int i2) {
                this.e.b(pfxVar, deviceDataListener, i2);
            }
        }, "com.huawei.watch.family");
    }

    /* synthetic */ void b(final pfx pfxVar, final DeviceDataListener deviceDataListener, int i) {
        LogUtil.a("HealthZoneModelPolicyControl", "onPingResult code = ", Integer.valueOf(i));
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: pgc
            @Override // java.lang.Runnable
            public final void run() {
                this.f45309b.c(pfxVar, deviceDataListener);
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void c(final pfx pfxVar, final DeviceDataListener deviceDataListener) {
        LogUtil.a("HealthZoneModelPolicyControl", "sendMsgToDevice enter");
        if (pfxVar == null) {
            LogUtil.j("HealthZoneModelPolicyControl", "sendMsgToDevice responseMsgBody = null");
            if (deviceDataListener != null) {
                deviceDataListener.onResult(-1, new pfx());
                return;
            }
            return;
        }
        LogUtil.a("HealthZoneModelPolicyControl", "responseMsgBody = ", pfxVar.toString());
        xiu.c cVar = new xiu.c();
        cVar.a(new Gson().toJson(pfxVar).getBytes(StandardCharsets.UTF_8));
        pfv.e().sendComand(cVar.c(), new SendCallback() { // from class: pfu.5
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                LogUtil.a("HealthZoneModelPolicyControl", "sendComand onSendResult code = ", Integer.valueOf(i));
                DeviceDataListener deviceDataListener2 = deviceDataListener;
                if (deviceDataListener2 != null) {
                    deviceDataListener2.onResult(i == 207 ? 0 : -1, pfxVar);
                }
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a("HealthZoneModelPolicyControl", "sendComand onSendProgress progress = ", Long.valueOf(j));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a("HealthZoneModelPolicyControl", "sendMsgToDevice onFileTransferReport transferWay: ", str);
            }
        });
    }
}
