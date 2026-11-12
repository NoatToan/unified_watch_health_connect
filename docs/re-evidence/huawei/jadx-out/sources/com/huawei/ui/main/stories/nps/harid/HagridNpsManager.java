package com.huawei.ui.main.stories.nps.harid;

import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dmp;
import defpackage.drw;
import defpackage.dxm;
import defpackage.lrw;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes19.dex */
public class HagridNpsManager {
    private static final String HAGRID2021_B19 = "Hagrid2021-B19";
    private static final String HAGRID_B19 = "Hagrid-B19";
    private static final String HERM_B19 = "Herm-B19";
    private static final String LUPIN_B19HN = "Lupin-B19HN";
    private static final String TAG = "HagridNpsManager";
    private static volatile HagridNpsManager hwNpsManager;

    private HagridNpsManager() {
        LogUtil.a(TAG, "HagridNpsManager init");
    }

    public static HagridNpsManager getInstance() {
        if (hwNpsManager == null) {
            synchronized (HagridNpsManager.class) {
                if (hwNpsManager == null) {
                    hwNpsManager = new HagridNpsManager();
                }
            }
        }
        return hwNpsManager;
    }

    public boolean isBindWifiDevice() {
        boolean z;
        ArrayList<String> arrayListD = drw.e().d(HealthDevice.HealthDeviceKind.HDK_WEIGHT);
        if (arrayListD != null) {
            Iterator<String> it = arrayListD.iterator();
            while (it.hasNext()) {
                if (dxm.ag(it.next())) {
                    z = true;
                }
            }
            z = false;
        } else {
            z = false;
        }
        LogUtil.a(TAG, "isWifiScales: ", Boolean.valueOf(z));
        return z;
    }

    public boolean isWeightDeviceNps() {
        MeasurableDevice measurableDeviceB;
        boolean zAm = HAGRID_B19.equals(lrw.h()) || HAGRID2021_B19.equals(lrw.h()) || LUPIN_B19HN.equals(lrw.h()) || HERM_B19.equals(lrw.h());
        if (!zAm && (measurableDeviceB = dmp.d().b(lrw.n(), true)) != null) {
            zAm = dxm.am(measurableDeviceB.getProductId());
        }
        LogUtil.a(TAG, "isWeightDevice: ", Boolean.valueOf(zAm));
        return zAm;
    }
}
