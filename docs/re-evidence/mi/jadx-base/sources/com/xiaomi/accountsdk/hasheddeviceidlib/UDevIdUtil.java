package com.xiaomi.accountsdk.hasheddeviceidlib;

import android.content.Context;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.accountsdk.utils.FidSigningUtil;

/* JADX INFO: loaded from: classes6.dex */
public class UDevIdUtil {
    private static final String PREFIX = "ud:";
    private static final String TAG = "UDevIdUtil";

    public static String getUDevId(Context context, String str) throws FidSigningUtil.FidSignException {
        String fid = FidManager.getInstance().getFid(context);
        AccountLogger.log(TAG, "fidPrefix " + fid.substring(0, fid.length() / 2));
        return getUDevId(str, fid);
    }

    private static String getUDevId(String str, String str2) {
        String str3 = PREFIX + DeviceIdHasher.hashDeviceInfo(str + str2);
        AccountLogger.log(TAG, "uDevIdPrefix  " + str3.substring(0, str3.length() / 2));
        return str3;
    }
}
