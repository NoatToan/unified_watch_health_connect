package com.huawei.hms.maps.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.maps.utils.LogM;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.HMSPackageManager;

/* JADX INFO: loaded from: classes10.dex */
public class HmsUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f14161a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f14162b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f14163c = false;
    private static int d = 12;
    private static boolean e = false;

    private static void a(AvailableAdapter availableAdapter, Context context) {
        LogM.d("HmsUtil", "Hms is resolution :");
        Activity activityFindActivity = findActivity(context);
        if (activityFindActivity == null) {
            LogM.e("HmsUtil", "Hms is not available26");
        } else {
            availableAdapter.startResolution(activityFindActivity, new maa());
        }
    }

    private static void a(Context context) {
        String str;
        Activity activityFindActivity = findActivity(context);
        if (activityFindActivity == null) {
            str = "Hms is not available26";
        } else {
            try {
                LogM.i("HmsUtil", "4.0 framework HMSCore upgrade process");
                String hMSPackageName = HMSPackageManager.getInstance(activityFindActivity.getApplicationContext()).getHMSPackageName();
                ComponentName componentName = new ComponentName(hMSPackageName, "com.huawei.hms.fwksdk.stub.UpdateStubActivity");
                Intent intent = new Intent();
                intent.putExtra(KpmsConstant.CALLER_PACKAGE_NAME, activityFindActivity.getApplicationContext().getPackageName());
                intent.putExtra(KpmsConstant.UPDATE_PACKAGE_NAME, hMSPackageName);
                intent.setComponent(componentName);
                activityFindActivity.startActivityForResult(intent, 25);
                return;
            } catch (ActivityNotFoundException unused) {
                str = "not found activity :com.huawei.hms.fwksdk.stub.UpdateStubActivity";
            }
        }
        LogM.e("HmsUtil", str);
    }

    public static void setRepeatFlag(boolean z) {
        f14162b = z;
        mab.b(z);
    }

    public static void setHmApk(boolean z) {
        LogM.i("HmsUtil", "setHmApk: " + z);
        e = z;
    }

    public static int isHmsAvailable(Context context) {
        if (d == 0) {
            return 0;
        }
        LogM.d("HmsUtil", "isInitialized is: " + f14161a + ", repeatFlag is: " + f14162b);
        if (f14161a || !f14162b) {
            return 1;
        }
        AvailableAdapter availableAdapter = new AvailableAdapter(getMinHmsVersion(context));
        int iIsHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(context);
        LogM.d("HmsUtil", "Hms is :" + iIsHuaweiMobileServicesAvailable);
        f14161a = true;
        if (iIsHuaweiMobileServicesAvailable == 0) {
            LogM.i("HmsUtil", "Hms is avaiable");
        } else if (!availableAdapter.isUserResolvableError(iIsHuaweiMobileServicesAvailable)) {
            LogM.e("HmsUtil", "Hms is not avaiable 26");
        } else if (!f14163c) {
            if (2 == iIsHuaweiMobileServicesAvailable && e) {
                LogM.i("HmsUtil", "Hms is resolution, isHmApk: " + e);
                a(context);
            } else {
                a(availableAdapter, context);
                f14163c = true;
            }
        }
        d = iIsHuaweiMobileServicesAvailable;
        return iIsHuaweiMobileServicesAvailable;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0076  */
    public static int getMinHmsVersion(Context context) {
        String string;
        int i;
        try {
            string = context.getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), 128).metaData.getString("com.huawei.hms.map.version");
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            LogM.e("HmsUtil", "NameNotFoundException ");
            string = null;
        }
        if (string == null || "".equals(string)) {
            i = 60200300;
        } else {
            String[] strArrSplit = string.split("\\.");
            if (strArrSplit.length == 4) {
                StringBuilder sb = new StringBuilder();
                sb.append(strArrSplit[0]);
                sb.append("0");
                sb.append(strArrSplit[1]);
                sb.append("0");
                sb.append(strArrSplit[2]);
                sb.append(strArrSplit[3]);
                LogM.i("HmsUtil", "hmsVersionStr " + string);
                i = Integer.parseInt(sb.toString());
            } else {
                i = 60200300;
            }
        }
        LogM.i("HmsUtil", "baseVersion " + i);
        return i;
    }

    public static Activity findActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return findActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    class maa implements AvailableAdapter.AvailableCallBack {
        @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
        public void onComplete(int i) {
            if (i == 0) {
                int unused = HmsUtil.d = i;
                LogM.i("HmsUtil", "Hms is available");
                return;
            }
            LogM.e("HmsUtil", "Hms update version failed: " + i);
            boolean unused2 = HmsUtil.f14161a = false;
            boolean unused3 = HmsUtil.f14162b = false;
        }

        maa() {
        }
    }
}
