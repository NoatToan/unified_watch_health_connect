package com.huawei.health.device.ui.util;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.health.device.util.EventBus;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceManagerInfoHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GetManagerAccountInfoListener f6429b;
    private final String[] e = {"manager_info_success", "manager_info_failed", "set_manager_info_result"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EventBus.ICallback f6430c = new EventBus.ICallback() { // from class: com.huawei.health.device.ui.util.DeviceManagerInfoHandler.5
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            DeviceManagerInfoHandler.this.e();
            String strE = dVar.e();
            Bundle bundleB = dVar.b();
            if (bundleB == null) {
                return;
            }
            if ("manager_info_success".equals(strE)) {
                DeviceManagerInfoHandler.this.f6428a = bundleB.getString("accountInfo");
                LogUtil.a("DeviceManagerInfoHandler", "DeviceManagerInfoHandler mManagerAccountId: ", DeviceManagerInfoHandler.this.f6428a);
                if (!TextUtils.isEmpty(DeviceManagerInfoHandler.this.f6428a)) {
                    DeviceManagerInfoHandler deviceManagerInfoHandler = DeviceManagerInfoHandler.this;
                    deviceManagerInfoHandler.f6428a = deviceManagerInfoHandler.f6428a.trim();
                }
                if (DeviceManagerInfoHandler.this.f6429b != null) {
                    DeviceManagerInfoHandler.this.f6429b.managerAccountInfo(DeviceManagerInfoHandler.this.f6428a);
                    return;
                } else {
                    LogUtil.j("DeviceManagerInfoHandler", "DeviceManagerInfoHandler mGetManagerAccountInfoListener is null!");
                    return;
                }
            }
            if ("manager_info_failed".equals(strE)) {
                LogUtil.j("DeviceManagerInfoHandler", "DeviceManagerInfoHandler get manager info fail!");
            } else if ("set_manager_info_result".equals(strE)) {
                LogUtil.j("DeviceManagerInfoHandler", "DeviceManagerInfoHandler mEventCallback result", Integer.valueOf(bundleB.getInt("ret")));
            } else {
                LogUtil.j("DeviceManagerInfoHandler", "DeviceManagerInfoHandler mEventCallback else");
            }
        }
    };

    public interface GetManagerAccountInfoListener {
        void managerAccountInfo(String str);
    }

    public void b(GetManagerAccountInfoListener getManagerAccountInfoListener) {
        this.f6429b = getManagerAccountInfoListener;
    }

    public void b() {
        c();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isGetAccountInfo", true);
        EventBus.a(new EventBus.d("get_manager_info", bundle));
    }

    private void c() {
        EventBus.b(this.f6430c, 0, this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        EventBus.a(this.f6430c, this.e);
    }
}
