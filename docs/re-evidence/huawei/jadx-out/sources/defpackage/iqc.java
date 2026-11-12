package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.health.browseraction.HwSchemeBasicHealthActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class iqc {
    public static void c(Activity activity, int i, Uri uri) {
        if (i <= 0) {
            LogUtil.j("HealthSchemeUtil", "skipActivity invalid type.");
            return;
        }
        if (i != 22 && i != 110 && i != 6001) {
            switch (i) {
            }
            return;
        }
        d(activity, uri);
    }

    private static void d(Activity activity, Uri uri) {
        Intent intent = new Intent();
        intent.setClass(activity, HwSchemeBasicHealthActivity.class);
        intent.setData(uri);
        iov.d(activity, intent);
    }

    public static ContentValues c(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return new ContentValues();
        }
        ArrayList<ContentValues> arrayListC = dmp.d().c(str3);
        LogUtil.a("HealthSchemeUtil", "getDeviceInfoByWiseDeivceIdOrSubMac deviceInfos size is ", Integer.valueOf(arrayListC.size()));
        if (njy.e(arrayListC)) {
            return new ContentValues();
        }
        if (arrayListC.size() == 1) {
            return arrayListC.get(0);
        }
        for (ContentValues contentValues : arrayListC) {
            String asString = contentValues.getAsString("mDeviceId");
            if (!TextUtils.isEmpty(asString) && asString.equals(str)) {
                LogUtil.a("HealthSchemeUtil", "mDeviceId pass ");
                return contentValues;
            }
            String asString2 = contentValues.getAsString("uniqueId");
            if (!TextUtils.isEmpty(asString2) && asString2.equals(str)) {
                LogUtil.a("HealthSchemeUtil", "the device has bound on the cloud && no bound by Ble ");
                return contentValues;
            }
            if (dxm.y(str3) && a(str2, contentValues.getAsString("sn"))) {
                return contentValues;
            }
            if (!TextUtils.isEmpty(asString2)) {
                int length = str2.length();
                if (asString2.replace(":", "").endsWith(length > 3 ? str2.substring(length - 3, length) : str2)) {
                    LogUtil.a("HealthSchemeUtil", "uniqueId pass");
                    return contentValues;
                }
            }
        }
        return new ContentValues();
    }

    private static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            LogUtil.a("HealthSchemeUtil", "isMatchSubMac serialNumber is empty.");
            return false;
        }
        if (str2.endsWith(str)) {
            LogUtil.a("HealthSchemeUtil", "isMatchSubMac serialNumber pass.");
            return true;
        }
        if (!str.contains(Constants.LINK) || !str2.endsWith(str.substring(str.indexOf(Constants.LINK) + 1))) {
            return false;
        }
        LogUtil.a("HealthSchemeUtil", "isMatchSubMac serialNumber subMacTemp pass.");
        return true;
    }
}
