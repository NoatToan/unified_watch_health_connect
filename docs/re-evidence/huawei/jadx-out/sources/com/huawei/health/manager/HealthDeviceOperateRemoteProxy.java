package com.huawei.health.manager;

import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.IHealthDeviceOperManager;
import com.huawei.health.manager.util.RemoteCallerFilter;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BluetoothMonitor;

/* JADX INFO: loaded from: classes2.dex */
public class HealthDeviceOperateRemoteProxy extends IHealthDeviceOperManager.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DaemonService f8041a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExtendHandler f8043c;
    private String i;
    private boolean d = false;
    private boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8042b = false;

    public HealthDeviceOperateRemoteProxy(DaemonService daemonService) {
        this.f8041a = null;
        LogUtil.a("HealthDeviceOper_RemoteProxy", "HealthDeviceOperateRemoteProxy is Set Up");
        if (daemonService != null) {
            this.f8041a = daemonService;
        } else {
            LogUtil.a("HealthDeviceOper_RemoteProxy", "service == null");
        }
    }

    private void b() {
        LogUtil.a("HealthDeviceOper_RemoteProxy", "HealthDeviceOperateRemoteProxy create thread");
        this.f8043c = HandlerCenter.b(new Handler.Callback() { // from class: com.huawei.health.manager.HealthDeviceOperateRemoteProxy.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 1) {
                    return false;
                }
                BluetoothMonitor.d().c(HealthDeviceOperateRemoteProxy.this.i);
                HealthDeviceOperateRemoteProxy.this.e = false;
                return true;
            }
        }, "HealthDeviceOper_RemoteProxy");
        this.f8042b = true;
    }

    @Override // com.huawei.health.IHealthDeviceOperManager.Stub, android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (!RemoteCallerFilter.e()) {
            throw new RemoteException("hw permission check failed");
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    @Override // com.huawei.health.IHealthDeviceOperManager
    public void holdDevice(String str) throws RemoteException {
        if (str == null) {
            LogUtil.j("HealthDeviceOper_RemoteProxy", "deviceInfo is null");
            return;
        }
        LogUtil.a("HealthDeviceOper_RemoteProxy", "HealthDeviceOperateRemoteProxy holdDevice() deviceInfo = " + str);
        this.i = str;
        this.d = true;
        if (!this.f8042b) {
            b();
        }
        if (!this.e) {
            BluetoothMonitor.d().b(str);
            this.e = true;
        }
        this.f8043c.removeMessages(1);
        this.f8043c.sendEmptyMessage(1, 30000L);
    }

    @Override // com.huawei.health.IHealthDeviceOperManager
    public void releaseDevice(String str) throws RemoteException {
        if (str == null) {
            LogUtil.j("HealthDeviceOper_RemoteProxy", "macAddress is null");
            return;
        }
        this.e = false;
        this.f8043c.removeMessages(1);
        if (this.d) {
            BluetoothMonitor.d().c(str);
            this.d = false;
        }
        if (this.f8043c != null) {
            LogUtil.a("HealthDeviceOper_RemoteProxy", "HealthDeviceOperateRemoteProxy finish thread");
            this.f8043c.quit(false);
            this.f8043c = null;
            this.f8042b = false;
        }
    }
}
