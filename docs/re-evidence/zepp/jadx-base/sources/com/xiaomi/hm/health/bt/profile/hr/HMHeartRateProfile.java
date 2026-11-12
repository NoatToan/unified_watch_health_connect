package com.xiaomi.hm.health.bt.profile.hr;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.bluetooth.profile.characteristic.DataCallback;
import com.huami.bluetooth.profile.characteristic.HMBleBluetoothCharacteristic;
import com.huami.bluetooth.profile.hr.HeartRateControl;
import com.huami.bluetooth.profile.hr.HeartRateControlImpl;
import com.huami.bluetooth.profile.hr.HeartRateMeasurement;
import com.huami.bluetooth.profile.hr.HeartRateMeasurementImpl;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"NewApi"})
public class HMHeartRateProfile {
    private static final String e = "HMHeartRateProfile";
    private static final String f = "HeartRateCenter";
    private static final UUID g = GattUtils.uuid16("180D");
    private static final UUID h = GattUtils.uuid16("2A39");
    private static final UUID i = GattUtils.uuid16("2A37");
    private AtomicInteger a;
    private IHeartRateChangedCallback b;

    @NonNull
    private HeartRateControl c;

    @NonNull
    private HeartRateMeasurement d;

    public interface IHeartRateChangedCallback {
        void onHeartRateChanged(int hr);
    }

    public HMHeartRateProfile(@NonNull GattPeripheral gattPeripheral) {
        this(d(gattPeripheral, h), d(gattPeripheral, i));
    }

    private static BluetoothCharacteristic d(GattPeripheral gattPeripheral, UUID uuid) {
        return new HMBleBluetoothCharacteristic(gattPeripheral, g, uuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(byte[] bArr) {
        Debug.i(e, "HeartRate:" + GattUtils.bytesToHexString(bArr));
        IHeartRateChangedCallback iHeartRateChangedCallback = this.b;
        if (iHeartRateChangedCallback != null) {
            iHeartRateChangedCallback.onHeartRateChanged(bArr[1] & 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(byte[] bArr) {
        Debug.i(e, "HeartRate:" + GattUtils.bytesToHexString(bArr));
        IHeartRateChangedCallback iHeartRateChangedCallback = this.b;
        if (iHeartRateChangedCallback != null) {
            iHeartRateChangedCallback.onHeartRateChanged(bArr[1] & 255);
        }
    }

    public static boolean isSupport(GattPeripheral gattPeripheral) {
        return (gattPeripheral == null || gattPeripheral.getService(g) == null) ? false : true;
    }

    public void c(IHeartRateChangedCallback callback) {
        this.b = callback;
    }

    public synchronized boolean deInit() {
        Debug.fi(f, "deInit, referenceCount: " + this.a.get());
        if (this.a.get() > 1) {
            this.a.decrementAndGet();
            return true;
        }
        if (this.a.get() > 0) {
            this.a.decrementAndGet();
        }
        return this.c.deInit() && this.d.unregisterCallback() && this.d.deInit();
    }

    public synchronized boolean deInitZeppOs() {
        Debug.fi(f, "deInit, referenceCount: " + this.a.get());
        if (this.a.get() > 1) {
            this.a.decrementAndGet();
            return true;
        }
        if (this.a.get() > 0) {
            this.a.decrementAndGet();
        }
        return this.d.unregisterCallback() && this.d.deInit();
    }

    public boolean e(Request.Command command, HeartRateControl.Operation operation) {
        return this.c.enableAbnormalHeartWarning(command, operation);
    }

    public boolean f() {
        return this.c.sendHeartbeat();
    }

    public HeartRateConfig g() {
        return this.c.getHeartRateConfig();
    }

    public synchronized boolean init() {
        Debug.fi(f, "init, referenceCount: " + this.a.get());
        boolean z = true;
        if (this.a.get() > 0) {
            this.a.incrementAndGet();
            return true;
        }
        if (!this.c.init() || !this.d.init() || !this.d.registerCallback(new DataCallback() { // from class: xz2
            @Override // com.huami.bluetooth.profile.characteristic.DataCallback
            public final void onReceived(byte[] bArr) {
                this.a.h(bArr);
            }
        })) {
            z = false;
        }
        if (z) {
            this.a.incrementAndGet();
        }
        return z;
    }

    public synchronized boolean initZeppOs() {
        Debug.fi(f, "init, referenceCount: " + this.a.get());
        boolean z = true;
        if (this.a.get() > 0) {
            this.a.incrementAndGet();
            return true;
        }
        if (!this.d.init() || !this.d.registerCallback(new DataCallback() { // from class: wz2
            @Override // com.huami.bluetooth.profile.characteristic.DataCallback
            public final void onReceived(byte[] bArr) {
                this.a.i(bArr);
            }
        })) {
            z = false;
        }
        if (z) {
            this.a.incrementAndGet();
        }
        return z;
    }

    public void j() {
        this.b = null;
    }

    public boolean k(HeartRateControl.Mode mode, HeartRateControl.Operation operation) {
        return this.c.setMode(mode, operation);
    }

    public boolean l(int interval) {
        return this.c.setInterval(interval);
    }

    public HMHeartRateProfile(@NonNull BluetoothCharacteristic control, @NonNull BluetoothCharacteristic measurement) {
        this.a = new AtomicInteger(0);
        this.b = null;
        this.c = new HeartRateControlImpl(control);
        this.d = new HeartRateMeasurementImpl(measurement);
    }
}
