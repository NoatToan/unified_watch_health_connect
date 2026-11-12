package defpackage;

import android.os.RemoteException;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.callback.DeviceStatusCallback;
import com.huawei.datatype.DeviceStatusParam;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lun {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static lun f40850b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40849a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f40851c = new Object();

    public void a(DeviceInfo deviceInfo, int i, byte[] bArr) throws RemoteException {
    }

    private lun() {
    }

    public void c(DeviceInfo deviceInfo, int i, byte[] bArr) throws RemoteException {
        if (bArr != null && bArr.length >= 2) {
            byte b2 = bArr[0];
            byte b3 = bArr[1];
            if (lvb.e().e(b2) || lvb.e().d(b2)) {
                ReleaseLogUtil.c("DEVMGR_DeviceCommandProcessManager", "onDataReceived serviceId is,", Integer.valueOf(b2), "commandId is:", Integer.valueOf(b3));
            }
        }
        if (bArr == null || bArr.length <= 0 || deviceInfo == null) {
            ReleaseLogUtil.d("DeviceCommandProcessManager", "onDataReceived() Received data is null or deviceInfo is null");
            return;
        }
        LogUtil.a("DeviceCommandProcessManager", "onDataReceived() Received data :", eeq.e(bArr));
        lvs.b(bArr);
        if (b(deviceInfo, bArr)) {
            return;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        int productType = deviceInfo.getProductType();
        if (bArr[0] == 1) {
            mer.a().e(deviceIdentify, productType, bArr);
        } else {
            a(deviceInfo, bArr);
        }
    }

    public void b(DeviceInfo deviceInfo, int i, String str) {
        LogUtil.a("DeviceCommandProcessManager", "onDataReceived() Received model :", Integer.valueOf(i), ", data :", str);
        synchronized (f40851c) {
            BluetoothDataReceiveCallback bluetoothDataReceiveCallbackA = lvk.a(i);
            if (bluetoothDataReceiveCallbackA != null) {
                bluetoothDataReceiveCallbackA.onDataReceived(0, deviceInfo, str.getBytes(Charset.defaultCharset()));
            }
        }
    }

    public void d(DeviceInfo deviceInfo, int i, DeviceStatusParam deviceStatusParam) {
        LogUtil.a("DeviceCommandProcessManager", "onDeviceConnectionStateChanged: ", CommonUtil.n(deviceInfo.getDeviceIdentify()), ", deviceStatus: ", Integer.valueOf(i));
        Iterator<Map.Entry<String, DeviceStatusCallback>> it = lvk.c().entrySet().iterator();
        if (it == null) {
            LogUtil.a("DeviceCommandProcessManager", "onDeviceConnectionStateChanged iterator is null.");
            return;
        }
        while (it.hasNext()) {
            DeviceStatusCallback value = it.next().getValue();
            if (value != null) {
                value.onDeviceConnectedChanged(deviceInfo, i, deviceStatusParam);
            }
        }
    }

    private boolean d(DeviceInfo deviceInfo, int i, int i2) {
        if (eel.d(deviceInfo.getProductType()) && i == 7) {
            return true;
        }
        return i == 32 && i2 == 9;
    }

    private boolean b(DeviceInfo deviceInfo, byte[] bArr) {
        if (!mih.e(deviceInfo) || !mih.b(bArr)) {
            return false;
        }
        ReleaseLogUtil.c("DEVMGR_DeviceCommandProcessManager", "is wallet callback");
        BluetoothDataReceiveCallback bluetoothDataReceiveCallbackA = lvk.a(27);
        ReleaseLogUtil.c("DEVMGR_DeviceCommandProcessManager", "dataReceiveCallback is:", bluetoothDataReceiveCallbackA);
        if (bluetoothDataReceiveCallbackA == null) {
            return true;
        }
        bluetoothDataReceiveCallbackA.onDataReceived(0, deviceInfo, bArr);
        return true;
    }

    private void a(DeviceInfo deviceInfo, byte[] bArr) {
        synchronized (f40851c) {
            int i = bArr[0];
            byte b2 = bArr[1];
            if (d(deviceInfo, i, b2)) {
                i += 100000;
            }
            ReleaseLogUtil.c("DEVMGR_DeviceCommandProcessManager", "processDataOrder serviceId is:", Integer.valueOf(i), " commandId is:", Integer.valueOf(b2));
            BluetoothDataReceiveCallback bluetoothDataReceiveCallbackA = lvk.a(i);
            ReleaseLogUtil.c("DEVMGR_DeviceCommandProcessManager", "dataReceiveCallback is:", bluetoothDataReceiveCallbackA);
            if (bluetoothDataReceiveCallbackA != null) {
                bluetoothDataReceiveCallbackA.onDataReceived(0, deviceInfo, bArr);
            } else if (i == 8) {
                c(bArr);
            } else if (i == 26) {
                d(deviceInfo, bArr);
            } else {
                ReleaseLogUtil.c("DEVMGR_DeviceCommandProcessManager", "no support");
            }
        }
    }

    private void c(byte[] bArr) {
        if (bArr.length > 1) {
            byte b2 = bArr[1];
            ReleaseLogUtil.c("DEVMGR_DeviceCommandProcessManager", "handleClockMessage commandId: ", Integer.valueOf(b2));
            lvv lvvVarC = lvv.c(BaseApplication.getContext());
            if (b2 == 5) {
                lvvVarC.a(eeq.e(bArr));
            } else if (b2 == 8) {
                lvvVarC.d(eeq.e(bArr));
            } else {
                ReleaseLogUtil.c("DEVMGR_DeviceCommandProcessManager", "no support");
            }
        }
    }

    private void d(DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr.length > 1) {
            byte b2 = bArr[1];
            if (b2 == 7 || b2 == 9) {
                lvj.c().onDataReceived(0, deviceInfo, bArr);
            }
        }
    }

    public static lun a() {
        lun lunVar;
        synchronized (f40849a) {
            if (f40850b == null) {
                f40850b = new lun();
            }
            lunVar = f40850b;
        }
        return lunVar;
    }
}
