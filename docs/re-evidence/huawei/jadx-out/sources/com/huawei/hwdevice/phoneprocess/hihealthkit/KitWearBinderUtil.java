package com.huawei.hwdevice.phoneprocess.hihealthkit;

import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinderUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ecu;
import defpackage.eel;
import defpackage.eey;
import defpackage.mkb;
import defpackage.mkf;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class KitWearBinderUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f17456b = {123, 2, 0, 5};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f17455a = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f17457c = 6;

    private static boolean a(byte[] bArr) {
        if (bArr == null || bArr.length < f17457c) {
            return false;
        }
        for (int i = 0; i < f17455a; i++) {
            if (f17456b[i] != bArr[i + 2]) {
                return false;
            }
        }
        LogUtil.a("HwKitWearBinderUtil", "isForTheme fix.");
        return true;
    }

    public static int d(String str) {
        int iAvailable;
        Object obj = "openFileInput close error IOException";
        FileInputStream fileInputStreamOpenFileInput = null;
        try {
            try {
                fileInputStreamOpenFileInput = BaseApplication.getContext().openFileInput(str);
                iAvailable = fileInputStreamOpenFileInput.available();
                obj = obj;
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                        obj = obj;
                    } catch (IOException unused) {
                        Object[] objArr = {"openFileInput close error IOException"};
                        LogUtil.e("HwKitWearBinderUtil", objArr);
                        obj = objArr;
                    }
                }
            } catch (Throwable th) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused2) {
                        LogUtil.e("HwKitWearBinderUtil", obj);
                    }
                }
                throw th;
            }
        } catch (IOException unused3) {
            LogUtil.e("HwKitWearBinderUtil", "openFileInput IOException");
            if (fileInputStreamOpenFileInput != null) {
                try {
                    fileInputStreamOpenFileInput.close();
                } catch (IOException unused4) {
                    LogUtil.e("HwKitWearBinderUtil", "openFileInput close error IOException");
                }
            }
            iAvailable = 0;
            obj = obj;
        }
        return iAvailable;
    }

    public static boolean a(DeviceInfo deviceInfo, byte[] bArr) {
        if (deviceInfo == null) {
            LogUtil.j("HwKitWearBinderUtil", "device info is null.");
            return false;
        }
        if (!a(bArr)) {
            return false;
        }
        DeviceCapability deviceCapabilityC = mkb.c(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityC == null) {
            LogUtil.j("HwKitWearBinderUtil", "isForThemeData capability is null. please check.");
            return false;
        }
        if (!deviceCapabilityC.isSupportWatchFaceAppId()) {
            return false;
        }
        KitWearBinder.handleDataReceive(bArr);
        return true;
    }

    public static DeviceInfo c(String str) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, str);
        if (deviceList.size() > 0) {
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (!eel.d(deviceInfo2.getProductType())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
        }
        ReleaseLogUtil.d("R_HwKitWearBinderUtil", "getConnectMainNotAw70Device caller: ", str, ", has device: ", Boolean.valueOf(deviceInfo != null));
        return deviceInfo;
    }

    public static boolean a(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 66);
    }

    public static DevicePermissionResult b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.a("R_HwKitWearBinderUtil", "getAuthorizationStatus deviceInfo is null");
            return DevicePermissionResult.OTHER_ERROR;
        }
        if (TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            ReleaseLogUtil.a("R_HwKitWearBinderUtil", "getAuthorizationStatus deviceIdentify is null");
            return DevicePermissionResult.OTHER_ERROR;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(37);
        deviceCommand.setCommandID(15);
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final DevicePermissionResult[] devicePermissionResultArr = {DevicePermissionResult.OTHER_ERROR};
        AuthSupport.c().e(deviceInfo.getDeviceIdentify(), new AuthSupport.IAuthCallback() { // from class: mle
            @Override // com.huawei.hwdevice.phoneprocess.hihealthkit.AuthSupport.IAuthCallback
            public final void onResult(int i, String str) {
                KitWearBinderUtil.c(devicePermissionResultArr, countDownLatch, i, str);
            }
        });
        try {
            boolean zAwait = countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
            ReleaseLogUtil.d("HwKitWearBinderUtil", "getAuthorizationStatus isOnTime ", Boolean.valueOf(zAwait));
            if (!zAwait) {
                AuthSupport.c().e(deviceInfo.getDeviceIdentify());
            }
        } catch (InterruptedException e) {
            ReleaseLogUtil.a("HwKitWearBinderUtil", "getAuthorizationStatus InterruptedException: ", e.getMessage());
            AuthSupport.c().e(deviceInfo.getDeviceIdentify());
        }
        ReleaseLogUtil.d("HwKitWearBinderUtil", "getAuthorizationStatus: ", Integer.valueOf(devicePermissionResultArr[0].getValue()));
        return devicePermissionResultArr[0];
    }

    public static /* synthetic */ void c(DevicePermissionResult[] devicePermissionResultArr, CountDownLatch countDownLatch, int i, String str) {
        ReleaseLogUtil.d("R_HwKitWearBinderUtil", "auth resultCode: ", Integer.valueOf(i), ", msg: ", str);
        if (i == 100) {
            devicePermissionResultArr[0] = DevicePermissionResult.GRANTED;
        } else if (i == 1) {
            devicePermissionResultArr[0] = DevicePermissionResult.OTHER_ERROR;
        } else {
            devicePermissionResultArr[0] = DevicePermissionResult.DENIED;
        }
        countDownLatch.countDown();
    }

    public enum DevicePermissionResult {
        GRANTED(100),
        DENIED(1025),
        OTHER_ERROR(1);

        int value;

        DevicePermissionResult(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }
}
