package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.devicesdk.callback.DeviceScanCallback;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
public class cjs {
    private final DeviceScanCallback d;
    private HandlerThread e;
    private Handler g;
    private final List<cmy> i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1648c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1647b = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1646a = 0;

    static /* synthetic */ int a(cjs cjsVar) {
        int i = cjsVar.f1646a;
        cjsVar.f1646a = i + 1;
        return i;
    }

    public cjs(DeviceScanCallback deviceScanCallback, List<cmy> list) {
        this.e = null;
        this.g = null;
        this.d = deviceScanCallback;
        this.i = new ArrayList(list);
        LogUtil.b("DeviceDiscoveryProcessor", "Enter start new handlerThread.");
        HandlerThread handlerThread = new HandlerThread("DeviceDiscoveryProcessor");
        this.e = handlerThread;
        handlerThread.start();
        this.g = new Handler(this.e.getLooper());
    }

    public boolean b() {
        return this.f1648c;
    }

    public void d(BluetoothDevice bluetoothDevice, int i, byte[] bArr, int i2) {
        if (bluetoothDevice == null) {
            LogUtil.d("DeviceDiscoveryProcessor", "device is null");
            return;
        }
        try {
            String name = bluetoothDevice.getName();
            LogUtil.b("DeviceDiscoveryProcessor", "onDeviceDiscovered. device name:", cpl.e(name), " getAddress:", cpl.a(bluetoothDevice.getAddress()), " rssi:", Integer.valueOf(i), " reportSwitch:", Boolean.valueOf(this.f1647b));
            if (this.f1647b) {
                b(name, i, bArr, bluetoothDevice.getAddress(), i2);
            }
        } catch (SecurityException unused) {
            LogUtil.d("DeviceDiscoveryProcessor", "get device name when onDevice Discovered failed with SecurityException");
        }
    }

    private boolean d(String str) {
        if (this.d == null || this.i == null) {
            LogUtil.d("DeviceDiscoveryProcessor", "mDeviceScanCallback or mScanFilters is null.");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("DEVMGR_DeviceDiscoveryProcessor", "notify result error.mac address is invalid.");
            return false;
        }
        if (this.e != null) {
            return true;
        }
        LogUtil.e("DeviceDiscoveryProcessor", "mHandlerThread is dead");
        return false;
    }

    private void b(final String str, final int i, final byte[] bArr, final String str2, final int i2) {
        if (d(str2)) {
            this.g.post(new Runnable() { // from class: cjs.2
                @Override // java.lang.Runnable
                public void run() {
                    String strB = cjs.this.b(str, bArr);
                    LogUtil.b("DeviceDiscoveryProcessor", "reportFoundDevice: mScanHandler.post run() deviceName: ", strB);
                    boolean zD = false;
                    for (cmy cmyVar : new ArrayList(cjs.this.i)) {
                        if (cmyVar != null) {
                            zD = cmyVar.c() == 5 ? cjs.this.d(cmyVar, str2) : cjs.this.a(cmyVar, strB);
                            if (zD) {
                                break;
                            }
                        }
                    }
                    if (zD) {
                        if (cop.h()) {
                            if (cjs.this.f1646a < 15) {
                                ReleaseLogUtil.c("DEVMGR_DeviceDiscoveryProcessor", "reportFoundDevice call back.", cpl.a(str2));
                            }
                            cjs.a(cjs.this);
                        } else {
                            LogUtil.b("DeviceDiscoveryProcessor", "reportFoundDevice call back.", cpl.a(str2));
                        }
                        cjs.this.f1648c = true;
                        UniteDevice uniteDeviceB = cpg.b(str2, strB);
                        String strD = cpg.d(Integer.valueOf(i), Integer.valueOf(i2));
                        cqp.a(100111, strB, cpl.a(str2), strD);
                        cjs.this.d.scanResult(uniteDeviceB, bArr, strD, 20);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str, byte[] bArr) {
        cme cmeVarA;
        return (str != null || bArr == null || (cmeVarA = cmq.e().a(bArr)) == null) ? str : cmeVarA.c();
    }

    public void e(boolean z) {
        LogUtil.b("DeviceDiscoveryProcessor", "onDeviceDiscoveryFinished ");
        if (!z) {
            this.d.scanResult(null, null, null, 22);
        }
        this.f1647b = false;
        c();
        a();
    }

    public void e(int i, String str) {
        LogUtil.e("DeviceDiscoveryProcessor", "onFailure");
        this.f1647b = false;
        c();
        a();
        if (this.d == null) {
            LogUtil.d("DeviceDiscoveryProcessor", "mDeviceScanCallback null.");
        } else {
            this.d.scanResult(null, null, cpg.d(null, null), 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(cmy cmyVar, String str) {
        int iC = cmyVar.c();
        String strA = cmyVar.a();
        if (iC == 0) {
            return true;
        }
        if (TextUtils.isEmpty(strA)) {
            LogUtil.e("DeviceDiscoveryProcessor", "isExpertDeviceName keyword is empty.");
            return false;
        }
        if (str == null) {
            return false;
        }
        String lowerCase = strA.toLowerCase(Locale.ENGLISH);
        String lowerCase2 = str.toLowerCase(Locale.ENGLISH);
        if (iC == 1) {
            return lowerCase2.equals(lowerCase);
        }
        if (iC == 2) {
            return lowerCase2.startsWith(lowerCase);
        }
        if (iC == 3) {
            return lowerCase2.endsWith(lowerCase);
        }
        if (iC == 4) {
            return lowerCase2.contains(lowerCase);
        }
        LogUtil.e("DeviceDiscoveryProcessor", "isExpertDeviceName default type: ", Integer.valueOf(iC));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(cmy cmyVar, String str) {
        String strA = cmyVar.a();
        if (strA == null) {
            LogUtil.d("DeviceDiscoveryProcessor", "keyword is null.");
            return false;
        }
        return str.equalsIgnoreCase(strA);
    }

    private void c() {
        List<cmy> list = this.i;
        if (list != null) {
            list.clear();
        }
    }

    private void a() {
        HandlerThread handlerThread = this.e;
        if (handlerThread != null) {
            LogUtil.b("DeviceDiscoveryProcessor", "Enter quitHandlerThread.");
            Looper looper = handlerThread.getLooper();
            if (looper != null) {
                looper.quit();
            }
            this.e = null;
        }
    }
}
