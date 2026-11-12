package com.huawei.hms.support.picker.common;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.common.internal.constant.AuthInternalPickerConstant;
import defpackage.nox;

/* JADX INFO: loaded from: classes10.dex */
public class HMSAPKVersionCheckUtil {
    private static final String TAG = "HMSAPKVersionCheckUtil";

    private static int getMinApkVersion() {
        return AuthInternalPickerConstant.HMS_APK_VERSION_MIN;
    }

    public static void checkAvailabilityAndConnect(Activity activity, int i, AvailableAdapter.AvailableCallBack availableCallBack) {
        nox.b(TAG, "====== HMSSDK version: 61300303 ======", true);
        Context applicationContext = activity.getApplicationContext();
        int minApkVersion = getMinApkVersion();
        nox.b(TAG, "check minVersion:" + minApkVersion, true);
        AvailableAdapter availableAdapter = new AvailableAdapter(minApkVersion);
        int iIsHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(applicationContext);
        if (2 == iIsHuaweiMobileServicesAvailable || ((1 == iIsHuaweiMobileServicesAvailable && i == 2) || (1 == iIsHuaweiMobileServicesAvailable && i == 3))) {
            availableAdapter.startResolution(activity, availableCallBack);
        } else {
            availableCallBack.onComplete(iIsHuaweiMobileServicesAvailable);
        }
    }
}
