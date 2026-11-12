package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes7.dex */
public class eai {
    public static void c(String str, String str2, MeasurableDevice measurableDevice) {
        if (Utils.o() || measurableDevice == null) {
            LogUtil.j("IntellLifeConstants", "IntellLifeConstants can not upload device, is oversea : ", Boolean.valueOf(Utils.o()));
            return;
        }
        LogUtil.a("IntellLifeConstants", "IntellLifeConstants uploadDeviceToCloud ");
        String productId = measurableDevice.getProductId();
        final DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setDeviceConnectState(0);
        if (dxm.ag(productId)) {
            deviceInfo.setProductType(dxm.j(productId));
        }
        deviceInfo.setDeviceProtocol(2);
        deviceInfo.setDeviceIdentify(measurableDevice.getUniqueId());
        deviceInfo.setDeviceActiveState(1);
        deviceInfo.setDeviceBluetoothType(measurableDevice instanceof efx ? 2 : -1);
        deviceInfo.setUuid(str);
        deviceInfo.setDeviceName(str2);
        ThreadPoolManager.c().execute(new Runnable() { // from class: eai.3
            @Override // java.lang.Runnable
            public void run() {
                new eag().c(deviceInfo);
            }
        });
    }

    public static void e(final String str, final String str2) {
        if (Utils.o()) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: eai.2
            @Override // java.lang.Runnable
            public void run() {
                new eag().c(str, str2);
            }
        });
    }
}
