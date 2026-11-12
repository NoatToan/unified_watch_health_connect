package com.huawei.watchface.videoedit.utils;

import android.text.TextUtils;
import com.huawei.secure.android.common.util.SafeString;
import java.io.File;

/* JADX INFO: loaded from: classes45.dex */
public final class LogUtils {
    private static final int DEFAULT_SIZE = 16;

    public static String garbleFileName(String str) {
        String strSubstring;
        if (TextUtils.isEmpty(str) || str.startsWith("Screenshot_") || str.startsWith("IMG_") || str.startsWith("VID_") || str.startsWith("SVID_")) {
            return str;
        }
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf > 0) {
            strSubstring = SafeString.substring(str, iLastIndexOf, str.length());
            str = SafeString.substring(str, 0, iLastIndexOf);
        } else {
            strSubstring = "";
        }
        int length = str.length();
        if (length <= 3) {
            return "****" + SafeString.substring(str, length - 1) + strSubstring + "****";
        }
        if (length > 8) {
            return "**" + SafeString.substring(str, 8) + strSubstring + "**";
        }
        return "***" + SafeString.substring(str, length - 2) + strSubstring + "***";
    }

    public static String garbleFilePath(String str) {
        String[] strArrSplit;
        int length;
        if (TextUtils.isEmpty(str) || (length = (strArrSplit = str.split("/")).length) < 1) {
            return str;
        }
        String strGarbleFileName = garbleFileName(strArrSplit[length - 1]);
        if (length <= 2) {
            StringBuilder sb = new StringBuilder();
            String str2 = File.separator;
            sb.append(str2);
            sb.append(strArrSplit[0]);
            sb.append(str2);
            sb.append(strGarbleFileName);
            return sb.toString();
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        int i = length - 2;
        String strGarbleFileName2 = garbleFileName(strArrSplit[i]);
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(File.separator + strArrSplit[i2]);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(stringBuffer.toString());
        String str3 = File.separator;
        sb2.append(str3);
        sb2.append(strGarbleFileName2);
        sb2.append(str3);
        sb2.append(strGarbleFileName);
        return sb2.toString();
    }
}
