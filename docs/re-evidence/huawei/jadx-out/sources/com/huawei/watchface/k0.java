package com.huawei.watchface;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.wisecloud.drmclient.client.HwDrmClient;
import com.huawei.wisecloud.drmclient.exception.HwDrmException;
import com.huawei.wisecloud.drmclient.license.HwDrmLicense;

/* JADX INFO: loaded from: classes20.dex */
public abstract class k0 {
    public static String a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return HwDrmClient.newHWDRMClient(context).generateLicenseReq(str);
        }
        HwLog.e("DRMManager", "generateLicenseReq() TextUtils.isEmpty(keyID)");
        return "";
    }

    public static HwDrmLicense b(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return HwDrmClient.newHWDRMClient(context).getLocalLicense(str);
        }
        HwLog.e("DRMManager", "getLocalLicense() TextUtils.isEmpty(keyID)");
        return null;
    }

    public static HwDrmLicense c(Context context, String str) throws HwDrmException {
        if (TextUtils.isEmpty(str)) {
            HwLog.e("DRMManager", "parseLicenseRSP() TextUtils.isEmpty(licenseResp)");
            return null;
        }
        HwDrmLicense hwDrmLicensePraseLicenseRSP = HwDrmClient.newHWDRMClient(context).praseLicenseRSP(str);
        if (hwDrmLicensePraseLicenseRSP == null) {
            HwLog.e("DRMManager", "parseLicenseRSP() drmSdkParseLicenseResp == null");
        }
        return hwDrmLicensePraseLicenseRSP;
    }
}
