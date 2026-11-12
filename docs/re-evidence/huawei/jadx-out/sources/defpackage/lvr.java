package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.ecgservice.EcgIvActivationRequest;
import com.huawei.hwcloudmodel.model.ecgservice.EcgServiceActivationData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lvr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static lvr f40910b;
    private DeviceInfo g;
    private String h;
    private String i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40909a = new Object();
    private static final Object d = new Object();
    private boolean f = false;
    private List<IBaseResponseCallback> e = new ArrayList(16);
    private final BroadcastReceiver j = new BroadcastReceiver() { // from class: lvr.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("EcgServiceIVUtil", "mGetIvReceiver(): intent is ", intent.getAction());
            if (context == null) {
                LogUtil.j("EcgServiceIVUtil", "mGetIvReceiver context is null.");
                return;
            }
            if ("com.huawei.health.action.ecgiv.received".equals(intent.getAction())) {
                LogUtil.a("EcgServiceIVUtil", "handle GetIv BroadcastReceiver.");
                String stringExtra = intent.getStringExtra("dataIv");
                if (!TextUtils.isEmpty(stringExtra)) {
                    try {
                        JSONObject jSONObject = new JSONObject(stringExtra);
                        lvr.this.h = jSONObject.optString("ecgServiceIv");
                        lvr.this.i = jSONObject.optString("ecgServiceIvPsd");
                        LogUtil.a("EcgServiceIVUtil", "getEcgServiceIv receive ok.");
                    } catch (JSONException unused) {
                        LogUtil.e("EcgServiceIVUtil", "setCommandIdEcgServiceIv has JSONException");
                    }
                }
                LogUtil.d("EcgServiceIVUtil", "getEcgServiceIv end, mEcgIv:", lvr.this.h, ", mEcgGenerate:", lvr.this.i, ", mDeviceInfoSn:", lvr.this.g.getSecurityDeviceId());
                synchronized (lvr.d) {
                    if (!lvr.this.e.isEmpty()) {
                        lvr.this.d();
                    }
                }
            }
            lvr.this.i();
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f40911c = BaseApplication.getContext();

    private lvr() {
    }

    public static lvr a() {
        lvr lvrVar;
        synchronized (f40909a) {
            if (f40910b == null) {
                f40910b = new lvr();
            }
            lvrVar = f40910b;
        }
        return lvrVar;
    }

    public void b(DeviceInfo deviceInfo) {
        LogUtil.a("EcgServiceIVUtil", "start justGetEcgIv");
        if (c(deviceInfo)) {
            a(deviceInfo);
        }
    }

    public void c(IBaseResponseCallback iBaseResponseCallback, DeviceInfo deviceInfo) {
        LogUtil.a("EcgServiceIVUtil", "start getEcgIv");
        if (deviceInfo == null) {
            iBaseResponseCallback.a(-1, "deviceInfo is null");
            LogUtil.j("EcgServiceIVUtil", "getEcgIv deviceInfo is null");
            return;
        }
        synchronized (d) {
            this.e.add(iBaseResponseCallback);
        }
        if (c(deviceInfo)) {
            a(deviceInfo);
        } else if (this.f) {
            LogUtil.a("EcgServiceIVUtil", "getEcgIv is querying");
        } else {
            d();
        }
    }

    private boolean c(DeviceInfo deviceInfo) {
        if (TextUtils.isEmpty(this.h) || TextUtils.isEmpty(this.i) || this.g == null) {
            return true;
        }
        return !deviceInfo.getDeviceIdentify().equalsIgnoreCase(this.g.getDeviceIdentify());
    }

    private void a(DeviceInfo deviceInfo) {
        this.g = deviceInfo;
        c();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(35);
        deviceCommand.setCommandID(17);
        StringBuilder sb = new StringBuilder(16);
        sb.append(eeq.d(1));
        sb.append(eeq.d(0));
        sb.append(eeq.d(2));
        sb.append(eeq.d(0));
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        LogUtil.a("EcgServiceIVUtil", "5.35.17 command : ", sb.toString());
        lvb.e().c(deviceCommand);
    }

    private void a(int i, Object obj) {
        LogUtil.a("EcgServiceIVUtil", "enter handleResult");
        this.f = false;
        synchronized (d) {
            if (this.e.isEmpty()) {
                return;
            }
            LogUtil.a("EcgServiceIVUtil", "start handleResult callback");
            for (int size = this.e.size() - 1; size >= 0; size--) {
                IBaseResponseCallback iBaseResponseCallback = this.e.get(size);
                if (iBaseResponseCallback != null) {
                    LogUtil.a("EcgServiceIVUtil", "callback onResponse index:", Integer.valueOf(size));
                    iBaseResponseCallback.a(i, obj);
                }
                this.e.remove(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (TextUtils.isEmpty(this.h) || TextUtils.isEmpty(this.i)) {
            a(-1, "receive ecgIv error.");
            LogUtil.j("EcgServiceIVUtil", "receive ecgIv error.");
        } else {
            this.f = true;
            ThreadPoolManager.c().execute(new Runnable() { // from class: lvt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40913c.b();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b() {
        LogUtil.a("EcgServiceIVUtil", "enter startQuery");
        EcgIvActivationRequest ecgIvActivationRequest = new EcgIvActivationRequest();
        ecgIvActivationRequest.setDeviceIv(this.h);
        ecgIvActivationRequest.setDeviceCardPass(this.i);
        ecgIvActivationRequest.setDeviceSn(this.g.getSecurityDeviceId());
        b(ecgIvActivationRequest);
    }

    private void b(EcgIvActivationRequest ecgIvActivationRequest) {
        EcgServiceActivationData ecgServiceActivationDataA = lqo.b(BaseApplication.getContext()).a(ecgIvActivationRequest);
        if (ecgServiceActivationDataA != null) {
            LogUtil.a("EcgServiceIVUtil", "receive data:", ecgServiceActivationDataA.toString());
            if (ecgServiceActivationDataA.getResultCode().intValue() != 0) {
                a(-1, "receive data error.");
                return;
            } else {
                a(0, ecgServiceActivationDataA);
                return;
            }
        }
        a(-1, "receive device error.");
        LogUtil.a("EcgServiceIVUtil", "getEcgIvActivationStatus has error");
    }

    private void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.action.ecgiv.received");
        BroadcastManagerUtil.c(this.f40911c, this.j, intentFilter, LocalBroadcast.f36595c, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        try {
            this.f40911c.unregisterReceiver(this.j);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("EcgServiceIVUtil", "unregister NotifyRestart Broadcast exception");
        }
    }
}
