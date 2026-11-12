package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.mainprocess.callback.NotifyPhoneServiceCallback;
import com.huawei.hwdevicemgr.framework.INoitifyPhoneServiceCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
class lvc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private INoitifyPhoneServiceCallback f40882a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, NotifyPhoneServiceCallback> f40883c;

    private lvc() {
        this.f40883c = new HashMap(16);
        this.f40882a = new INoitifyPhoneServiceCallback.Stub() { // from class: lvc.4
            @Override // com.huawei.hwdevicemgr.framework.INoitifyPhoneServiceCallback
            public void executeResponse(String str, int i, DeviceInfo deviceInfo, int i2, String str2) {
                LogUtil.a("ProcessInfoRequest", "executeResponse begin.");
                if (!TextUtils.isEmpty(str) && deviceInfo != null) {
                    boolean z = false;
                    for (Map.Entry entry : lvc.this.f40883c.entrySet()) {
                        if (str.equals(entry.getKey()) && entry.getValue() != null) {
                            ((NotifyPhoneServiceCallback) entry.getValue()).executeResponse(i, deviceInfo, i2, str2);
                            z = true;
                        }
                    }
                    LogUtil.a("ProcessInfoRequest", "executeResponse end. isFound: ", Boolean.valueOf(z));
                    return;
                }
                LogUtil.j("ProcessInfoRequest", "callback executeResponse input is invalid.");
            }
        };
        LogUtil.a("ProcessInfoRequest", "create ProcessInfoRequest");
    }

    public INoitifyPhoneServiceCallback c() {
        return this.f40882a;
    }

    public static lvc e() {
        return e.d;
    }

    public void c(String str, NotifyPhoneServiceCallback notifyPhoneServiceCallback) {
        LogUtil.j("ProcessInfoRequest", "registerCallback put: ", str);
        this.f40883c.put(str, notifyPhoneServiceCallback);
    }

    public void c(String str) {
        LogUtil.j("ProcessInfoRequest", "unregisterCallback remove: ", str);
        this.f40883c.remove(str);
    }

    static class e {
        private static lvc d = new lvc();
    }
}
