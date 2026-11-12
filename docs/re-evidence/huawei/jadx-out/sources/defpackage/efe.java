package defpackage;

import android.util.SparseArray;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class efe {
    private static boolean d() {
        boolean z = false;
        if (!f()) {
            return false;
        }
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC != null && deviceCapabilityC.isSupportEcgAuth()) {
            z = true;
        }
        LogUtil.a("EcgFilterUtil", "hasEcgCollectionDevice: ", Boolean.valueOf(z));
        return z;
    }

    private static boolean g() {
        DeviceInfo deviceInfoE = e();
        boolean z = a(deviceInfoE) && eey.d(deviceInfoE, 106);
        LogUtil.a("EcgFilterUtil", "hasEcgDiagramDevice: ", Boolean.valueOf(z));
        return z;
    }

    private static DeviceInfo e() {
        return ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "EcgFilterUtil");
    }

    private static boolean f() {
        return a(e());
    }

    private static boolean a(DeviceInfo deviceInfo) {
        return deviceInfo != null && deviceInfo.getDeviceConnectState() == 2;
    }

    private static boolean b() {
        return c(new int[]{31002});
    }

    private static boolean c() {
        return c(new int[]{DicDataTypeUtil.DataType.ELECTROCARDIOGRAM.value()});
    }

    public static boolean c(int[] iArr) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(System.currentTimeMillis());
        hiDataReadOption.setCount(1);
        hiDataReadOption.setType(iArr);
        final Object[] objArr = {null};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: efe.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                objArr[0] = obj;
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                LogUtil.e("EcgFilterUtil", "wait time out");
            }
            boolean zE = e(objArr[0]);
            LogUtil.a("EcgFilterUtil", "hasEcgData dataTypes: ", Arrays.toString(iArr), " result: ", Boolean.valueOf(zE));
            return zE;
        } catch (InterruptedException unused) {
            LogUtil.e("EcgFilterUtil", "hasEcgCollectionData InterruptedException");
            return false;
        }
    }

    private static boolean e(Object obj) {
        return (obj instanceof SparseArray) && ((SparseArray) obj).size() > 0;
    }

    public static boolean a() {
        boolean zG = g();
        if (zG || !d()) {
            return (zG || c() || !b()) ? false : true;
        }
        return true;
    }
}
