package com.huawei.health.h5pro.utils;

import android.text.TextUtils;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class LogPrintOperate {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile LogDecodePrintInterceptor f6995b;
    private static final Pattern e = Pattern.compile("\\d*[a-z|A-Z]*[一-龥]*");

    public interface LogDecodePrintInterceptor {
        boolean isDecodePrint(String str);
    }

    public static String encodingLog(String str) {
        synchronized (LogPrintOperate.class) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            int length = str.length();
            int i = 1;
            if (1 == length) {
                return str;
            }
            StringBuilder sb = new StringBuilder(length);
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (e.matcher(String.valueOf(cCharAt)).matches()) {
                    if (i % 2 == 0) {
                        cCharAt = '*';
                    }
                    i++;
                }
                sb.append(cCharAt);
            }
            return sb.toString();
        }
    }

    public static void setLogDecodePrintInterceptor(LogDecodePrintInterceptor logDecodePrintInterceptor) {
        synchronized (LogPrintOperate.class) {
            f6995b = logDecodePrintInterceptor;
        }
    }

    public static boolean isDecodePrint(String str) {
        synchronized (LogPrintOperate.class) {
            if (LogUtil.isPrint()) {
                return true;
            }
            return f6995b != null && f6995b.isDecodePrint(str);
        }
    }

    public static boolean isDecodePrint(H5ProInstance h5ProInstance) {
        synchronized (LogPrintOperate.class) {
            if (LogUtil.isPrint()) {
                return true;
            }
            if (h5ProInstance == null) {
                return false;
            }
            H5ProAppInfo appInfo = h5ProInstance.getAppInfo();
            if (appInfo == null) {
                return false;
            }
            String pkgName = appInfo.getPkgName();
            if (appInfo.getH5ProAppType() != H5ProAppInfo.H5ProAppType.H5_MINI_PROGRAM) {
                pkgName = h5ProInstance.getUrl();
            }
            return f6995b != null && f6995b.isDecodePrint(pkgName);
        }
    }
}
