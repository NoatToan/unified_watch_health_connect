package com.xiaomi.smarthome.framework.plugin.rn.utils;

import android.text.TextUtils;
import com.xiaomi.onetrack.util.z;

/* JADX INFO: loaded from: classes2.dex */
public class ModelUtil {
    public static String getCategoryByModel(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split(z.f14007a)) == null || strArrSplit.length <= 0 || TextUtils.isEmpty(strArrSplit[0])) ? "" : strArrSplit[1];
    }

    public static String getCompanyIdentifierByModel(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split(z.f14007a)) == null || strArrSplit.length <= 0 || TextUtils.isEmpty(strArrSplit[0])) ? "" : strArrSplit[0];
    }
}
