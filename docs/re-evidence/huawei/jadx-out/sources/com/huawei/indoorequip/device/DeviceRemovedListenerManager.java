package com.huawei.indoorequip.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.clx;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes40.dex */
public class DeviceRemovedListenerManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, IDeviceRemovedListener> f17796b;
    private final BroadcastReceiver d;

    public interface IDeviceRemovedListener {
        void onDeviceRemoved(String str);
    }

    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final DeviceRemovedListenerManager f17797c = new DeviceRemovedListenerManager();
    }

    public static DeviceRemovedListenerManager a() {
        return d.f17797c;
    }

    private DeviceRemovedListenerManager() {
        this.f17796b = new HashMap();
        this.d = new BroadcastReceiver() { // from class: com.huawei.indoorequip.device.DeviceRemovedListenerManager.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    LogUtil.b("DeviceRemovedListenerManager", "onReceive ", "intent or mContext is null");
                    return;
                }
                String action = intent.getAction();
                LogUtil.b("DeviceRemovedListenerManager", "DeviceRemovedReceiver receive action: ", action);
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                if (!"com.huawei.health.action.DEVICE_CHANGED".equals(action)) {
                    LogUtil.e("DeviceRemovedListenerManager", "Other action, no response");
                    return;
                }
                int intExtra = intent.getIntExtra("operation", 0);
                String stringExtra = intent.getStringExtra("uniqueId");
                if (intExtra == -1 && !TextUtils.isEmpty(stringExtra) && DeviceRemovedListenerManager.this.f17796b.containsKey(stringExtra)) {
                    IDeviceRemovedListener iDeviceRemovedListener = (IDeviceRemovedListener) DeviceRemovedListenerManager.this.f17796b.get(stringExtra);
                    if (iDeviceRemovedListener != null) {
                        iDeviceRemovedListener.onDeviceRemoved(stringExtra);
                        return;
                    }
                    return;
                }
                LogUtil.b("DeviceRemovedListenerManager", "Other operation or mac not match, no response");
            }
        };
    }

    public void a(String str, IDeviceRemovedListener iDeviceRemovedListener) {
        LogUtil.b("DeviceRemovedListenerManager", "enter registerDeviceRemovedListener");
        if (iDeviceRemovedListener == null) {
            LogUtil.e("DeviceRemovedListenerManager", "listener is null");
        } else {
            if (this.f17796b.containsKey(str)) {
                LogUtil.e("DeviceRemovedListenerManager", "duplicate mac address.");
                return;
            }
            if (this.f17796b.size() == 0) {
                d();
            }
            this.f17796b.put(str, iDeviceRemovedListener);
        }
    }

    public void b(String str) {
        LogUtil.b("DeviceRemovedListenerManager", "enter removeDeviceRemovedListener");
        if (!this.f17796b.containsKey(str)) {
            LogUtil.e("DeviceRemovedListenerManager", "mac not exists");
            return;
        }
        this.f17796b.remove(str);
        if (this.f17796b.size() == 0) {
            e();
        }
    }

    private void d() {
        LogUtil.b("DeviceRemovedListenerManager", "registerDeviceChangedReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.action.DEVICE_CHANGED");
        BroadcastManagerUtil.d(BaseApplication.getContext(), this.d, intentFilter, clx.e, null);
    }

    private void e() {
        BaseApplication.getContext().unregisterReceiver(this.d);
    }
}
