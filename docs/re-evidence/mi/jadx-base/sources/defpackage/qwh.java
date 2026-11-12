package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.miui.circulate.api.bean.ExtraBundle;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.device.api.Constant;
import com.miui.circulate.device.api.DeviceControlManager;
import com.miui.circulate.device.api.DeviceControlReceiver;
import com.miui.circulate.device.api.DeviceInfo;
import com.miui.circulate.device.api.GlobalDeviceControl;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public class qwh implements DeviceControlReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeviceControlManager f31909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f31910b;
    public final Map<String, DeviceInfo> c;
    public Handler d;

    public qwh(final Context context) {
        HandlerThread handlerThread = new HandlerThread("PinDeviceManager");
        this.f31910b = handlerThread;
        this.c = new ConcurrentHashMap();
        handlerThread.start();
        this.d = new Handler(handlerThread.getLooper());
        DeviceControlManager deviceControlManager = new DeviceControlManager(context, handlerThread.getLooper(), Collections.singletonList(Constant.INSTANCE.getPIN_URI()));
        this.f31909a = deviceControlManager;
        this.d.post(new Runnable() { // from class: owh
            @Override // java.lang.Runnable
            public final void run() {
                this.f29769a.f(context);
            }
        });
        deviceControlManager.start(this);
    }

    public DeviceInfo d(String str) {
        return this.c.get(str);
    }

    public final /* synthetic */ void e(DeviceInfo deviceInfo) {
        this.c.put(deviceInfo.getId(), deviceInfo);
    }

    public final /* synthetic */ void f(Context context) {
        GlobalDeviceControl.getDeviceListByUri(context.getContentResolver(), Constant.INSTANCE.getPIN_URI()).forEach(new Consumer() { // from class: pwh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f30857a.e((DeviceInfo) obj);
            }
        });
    }

    public final /* synthetic */ void g(DeviceInfo deviceInfo) {
        this.c.put(deviceInfo.getId(), deviceInfo);
    }

    public void h(CirculateDeviceInfo circulateDeviceInfo) {
        if (circulateDeviceInfo == null) {
            return;
        }
        DeviceInfo deviceInfoD = d(circulateDeviceInfo.f10301a);
        if (deviceInfoD == null || deviceInfoD.getPinIcon() == null) {
            circulateDeviceInfo.h = new ExtraBundle.b().b(circulateDeviceInfo.h.c()).g(CirculateDeviceInfo.DEVICE_PIN_TIME).g(CirculateDeviceInfo.DEVICE_PIN_ICON).a();
        } else {
            circulateDeviceInfo.h = new ExtraBundle.b().b(circulateDeviceInfo.h.c()).e(CirculateDeviceInfo.DEVICE_PIN_TIME, deviceInfoD.getPinTime()).f(CirculateDeviceInfo.DEVICE_PIN_ICON, deviceInfoD.getPinIcon().flat()).a();
        }
    }

    public void i() {
        this.f31909a.stop(this);
        this.f31910b.quit();
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.d = null;
    }

    @Override // com.miui.circulate.device.api.DeviceControlReceiver
    public void onDeviceChange(DeviceInfo deviceInfo) {
    }

    @Override // com.miui.circulate.device.api.DeviceControlReceiver
    public void onDeviceListChange(List<DeviceInfo> list) {
        this.c.clear();
        list.forEach(new Consumer() { // from class: mwh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f27290a.g((DeviceInfo) obj);
            }
        });
        qx3.g().h().forEach(new Consumer() { // from class: nwh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f28505a.h((CirculateDeviceInfo) obj);
            }
        });
    }
}
