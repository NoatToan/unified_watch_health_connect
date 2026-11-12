package com.huawei.ui.homehealth.device;

import android.os.Handler;
import android.os.Looper;
import com.huawei.callback.DeviceConnectStateListener;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.homehealth.device.util.ReconnectUtils;
import defpackage.lss;
import defpackage.lut;
import health.compact.a.LogUtil;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceOperateManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<Map.Entry<String, Integer>> f25214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f25215b;
    private Runnable d;
    private final AtomicReference<Map.Entry<String, ConnectCallback>> e;

    public interface ConnectCallback {
        void onStartConnectFailed();

        void onStartConnectSuccess();

        void onTimeout();

        void showFailTip();
    }

    private DeviceOperateManager() {
        this.e = new AtomicReference<>();
        this.f25214a = new AtomicReference<>();
        this.f25215b = new Handler(Looper.getMainLooper());
        lut.a().d(new DeviceConnectStateListener() { // from class: rng
            @Override // com.huawei.callback.DeviceConnectStateListener
            public final void onDeviceConnectChange(DeviceInfo deviceInfo, int i) {
                this.e.d(deviceInfo, i);
            }
        });
    }

    public /* synthetic */ void d(DeviceInfo deviceInfo, int i) {
        Map.Entry<String, ConnectCallback> entry = this.e.get();
        if (entry != null && deviceInfo.getDeviceIdentify().equals(entry.getKey())) {
            a(deviceInfo);
        }
    }

    public void a(DeviceInfo deviceInfo, ConnectCallback connectCallback) {
        Map.Entry<String, ConnectCallback> andSet = this.e.getAndSet(new AbstractMap.SimpleEntry(deviceInfo.getDeviceIdentify(), connectCallback));
        if (andSet != null && !Objects.equals(deviceInfo.getDeviceIdentify(), andSet.getKey())) {
            i();
        }
        e(deviceInfo);
    }

    private void e(final DeviceInfo deviceInfo) {
        ReconnectUtils.d(deviceInfo, new SimpleChain.Emitter() { // from class: com.huawei.ui.homehealth.device.DeviceOperateManager.5
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public void onSuccess(Object... objArr) {
                LogUtil.b("DeviceOperateManager", "startConnect Success");
                DeviceOperateManager.this.c(deviceInfo);
            }

            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public void onError(String str) {
                LogUtil.b("DeviceOperateManager", "startConnect onError");
                DeviceOperateManager.this.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceInfo deviceInfo) {
        c();
        d(deviceInfo);
        Map.Entry<String, Integer> entry = this.f25214a.get();
        if (entry == null || !Objects.equals(deviceInfo.getDeviceIdentify(), entry.getKey())) {
            this.f25214a.set(new AbstractMap.SimpleEntry(deviceInfo.getDeviceIdentify(), 1));
        } else {
            entry.setValue(Integer.valueOf(entry.getValue().intValue() + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b();
        i();
    }

    private void d(final DeviceInfo deviceInfo) {
        f();
        Handler handler = this.f25215b;
        Runnable runnable = new Runnable() { // from class: rnf
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b(deviceInfo);
            }
        };
        this.d = runnable;
        handler.postDelayed(runnable, 20000L);
    }

    public /* synthetic */ void b(DeviceInfo deviceInfo) {
        a();
        d(deviceInfo, true);
    }

    private void f() {
        Runnable runnable = this.d;
        final Handler handler = this.f25215b;
        Objects.requireNonNull(handler);
        lss.a(runnable, new Consumer() { // from class: rnh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                handler.removeCallbacks((Runnable) obj);
            }
        });
    }

    private void i() {
        f();
        this.e.set(null);
        this.f25214a.set(null);
    }

    private void d(DeviceInfo deviceInfo, boolean z) {
        f();
        Map.Entry<String, ConnectCallback> andSet = this.e.getAndSet(null);
        Map.Entry<String, Integer> entry = this.f25214a.get();
        LogUtil.b("DeviceOperateManager", "connectFail name:", deviceInfo.getDeviceName(), " isTimeout:", Boolean.valueOf(z), " count:", entry == null ? Constants.NULL : entry.getValue());
        if (!(z && (deviceInfo instanceof CloudDeviceInfo)) && (entry == null || entry.getValue().intValue() < 3)) {
            return;
        }
        a(andSet);
        if (entry != null) {
            entry.setValue(0);
        }
    }

    private void a(DeviceInfo deviceInfo) {
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        if (deviceConnectState == 2) {
            i();
        } else if (deviceConnectState == 3 || deviceConnectState == 4) {
            d(deviceInfo, false);
        }
    }

    private void c() {
        Map.Entry<String, ConnectCallback> entry = this.e.get();
        if (entry != null) {
            entry.getValue().onStartConnectSuccess();
        }
    }

    private void b() {
        Map.Entry<String, ConnectCallback> entry = this.e.get();
        if (entry != null) {
            entry.getValue().onStartConnectFailed();
        }
    }

    private void a() {
        Map.Entry<String, ConnectCallback> entry = this.e.get();
        if (entry != null) {
            entry.getValue().onTimeout();
        }
    }

    private void a(Map.Entry<String, ConnectCallback> entry) {
        if (entry != null) {
            entry.getValue().showFailTip();
        }
    }

    public void e(ConnectCallback connectCallback) {
        Map.Entry<String, ConnectCallback> entry = this.e.get();
        if (entry == null || !Objects.equals(connectCallback, entry.getValue())) {
            return;
        }
        f();
        this.e.set(null);
    }

    public static DeviceOperateManager d() {
        return a.f25217c;
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final DeviceOperateManager f25217c = new DeviceOperateManager();
    }
}
