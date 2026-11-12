package com.huawei.hms.hwid;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.adapter.AvailableAdapter;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static int a() {
        return 40004000;
    }

    public static void a(Activity activity, AvailableAdapter.AvailableCallBack availableCallBack) {
        ar.b("HmsAccountKitVersionCheckUtil", "====== HMSSDK version: 61300303 ======", true);
        Context applicationContext = activity.getApplicationContext();
        int iA = a();
        ar.b("HmsAccountKitVersionCheckUtil", "check minVersion:" + iA, true);
        AvailableAdapter availableAdapter = new AvailableAdapter(iA);
        int iIsHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(applicationContext);
        if (iIsHuaweiMobileServicesAvailable == 0) {
            availableCallBack.onComplete(iIsHuaweiMobileServicesAvailable);
        } else if (availableAdapter.isUserResolvableError(iIsHuaweiMobileServicesAvailable)) {
            availableAdapter.startResolution(activity, availableCallBack);
        } else {
            availableCallBack.onComplete(iIsHuaweiMobileServicesAvailable);
        }
    }
}
