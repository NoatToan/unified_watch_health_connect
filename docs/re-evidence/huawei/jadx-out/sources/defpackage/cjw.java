package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HEXUtils;
import health.compact.a.ProcessUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class cjw implements DataReceiveCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, WeakReference<IBaseResponseCallback>> f1656c = new ConcurrentHashMap();

    static class d {
        private static final cjw e = new cjw();
    }

    public static cjw b() {
        if (ProcessUtil.b()) {
            return d.e;
        }
        throw new RuntimeException("DevicePullPageManager must run on main process");
    }

    public void c(DeviceInfo deviceInfo, String str, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.d("UIDV_DevicePullPageManager", "no callback to response, not send");
            return;
        }
        a();
        if (e(deviceInfo, str)) {
            this.f1656c.put(str, new WeakReference<>(iBaseResponseCallback));
        } else {
            iBaseResponseCallback.a(-1, -1);
        }
    }

    public boolean e(DeviceInfo deviceInfo, String str) {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.pullPage");
        eeeVar.setWearPkgName("hw.wearable.pullPage");
        eeeVar.setCommandId(2);
        eeeVar.a(800100010L);
        eeeVar.a(0);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pingUrl", str);
        LogUtil.a("UIDV_DevicePullPageManager", "event data: ", jsonObject);
        eeeVar.e(HEXUtils.a(HEXUtils.c(jsonObject.toString())));
        boolean zSendSampleEventCommand = edc.e().sendSampleEventCommand(deviceInfo, eeeVar, "UIDV_DevicePullPageManager");
        ReleaseLogUtil.d("UIDV_DevicePullPageManager", "sendEvent result data: ", Boolean.valueOf(zSendSampleEventCommand));
        return zSendSampleEventCommand;
    }

    public void a() {
        ReleaseLogUtil.d("UIDV_DevicePullPageManager", "registerDevicePullPage");
        edc.e().registerDeviceSampleListener("hw.unitedevice.pullPage", this);
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        ReleaseLogUtil.d("UIDV_DevicePullPageManager", "receive device event.", Integer.valueOf(i));
        if (eecVar instanceof eee) {
            eee eeeVar = (eee) eecVar;
            if (eeeVar.d() != 800100010 || !"hw.wearable.pullPage".equals(eeeVar.getSrcPkgName())) {
                ReleaseLogUtil.e("UIDV_DevicePullPageManager", "message commandId or pkgName not match.");
                return;
            }
            ReleaseLogUtil.d("UIDV_DevicePullPageManager", "message:", eeeVar);
            String strB = HEXUtils.b(HEXUtils.a(eeeVar.c()));
            if (TextUtils.isEmpty(strB)) {
                ReleaseLogUtil.a("UIDV_DevicePullPageManager", "onDataReceived eventData is null");
            } else {
                a(strB);
            }
        }
    }

    private void a(String str) {
        LogUtil.a("UIDV_DevicePullPageManager", "string data:", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("pingUrl");
            int i = jSONObject.getInt("pingResult");
            if (this.f1656c.containsKey(string)) {
                WeakReference<IBaseResponseCallback> weakReference = this.f1656c.get(string);
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().a(0, Integer.valueOf(i));
                    LogUtil.a("UIDV_DevicePullPageManager", "callback onResponse: ", Integer.valueOf(i));
                    this.f1656c.remove(string);
                    return;
                }
                ReleaseLogUtil.e("UIDV_DevicePullPageManager", "weakReference is null");
                this.f1656c.remove(string);
            }
        } catch (JSONException unused) {
            ReleaseLogUtil.a("UIDV_DevicePullPageManager", "parse json exception");
        }
    }
}
