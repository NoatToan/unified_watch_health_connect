package defpackage;

import android.bluetooth.BluetoothDevice;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback;

/* JADX INFO: loaded from: classes10.dex */
public class lnu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BluetoothDevice f40503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f40504c;
    private String d;
    private BtDeviceStateCallback e;
    private int f;

    public int e() {
        return this.f40502a;
    }

    public void c(int i) {
        this.f40502a = i;
    }

    public BluetoothDevice a() {
        return this.f40503b;
    }

    public void e(BluetoothDevice bluetoothDevice) {
        this.f40503b = bluetoothDevice;
    }

    public String d() {
        return this.f40504c;
    }

    public void b(String str) {
        this.f40504c = str;
    }

    public String b() {
        return this.d;
    }

    public void c(String str) {
        this.d = str;
    }

    public BtDeviceStateCallback c() {
        return this.e;
    }

    public void a(BtDeviceStateCallback btDeviceStateCallback) {
        this.e = btDeviceStateCallback;
    }

    public int f() {
        return this.f;
    }

    public void a(int i) {
        this.f = i;
    }
}
