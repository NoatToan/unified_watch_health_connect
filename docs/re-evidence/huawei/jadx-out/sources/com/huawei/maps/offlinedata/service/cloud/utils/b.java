package com.huawei.maps.offlinedata.service.cloud.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.common.util.AGCUtils;
import com.huawei.hms.mlsdk.common.AgConnectInfo;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {
    public static String a(Context context) {
        String strA = a.a(context, AgConnectInfo.AgConnectKey.APPLICATION_ID);
        return TextUtils.isEmpty(strA) ? AGCUtils.getAppId(context) : strA;
    }

    public static String a() {
        String str = Build.MODEL;
        if (str == null || str.trim().isEmpty()) {
            str = "unknownModel";
        }
        return str.length() > 20 ? str.substring(0, 20) : str;
    }
}
