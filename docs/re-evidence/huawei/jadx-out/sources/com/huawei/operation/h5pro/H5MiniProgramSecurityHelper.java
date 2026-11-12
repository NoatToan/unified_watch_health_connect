package com.huawei.operation.h5pro;

import android.text.TextUtils;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.R;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class H5MiniProgramSecurityHelper {
    private static final String TAG = "H5PRO_H5MiniProgramSecurityHelper";
    private static volatile Map<String, String> sSuperTrustedMiniPrograms;
    private static volatile List<String> sTrustedMiniPrograms;

    private H5MiniProgramSecurityHelper() {
    }

    private static void initTrustedMiniProgramSource() {
        synchronized (H5MiniProgramSecurityHelper.class) {
            if (sTrustedMiniPrograms == null) {
                String[] stringArray = BaseApplication.getContext().getResources().getStringArray(R.array.trusted_mini_program);
                if (stringArray == null || stringArray.length == 0) {
                    sTrustedMiniPrograms = Collections.EMPTY_LIST;
                } else {
                    sTrustedMiniPrograms = Arrays.asList(stringArray);
                }
            }
            if (sSuperTrustedMiniPrograms != null) {
                return;
            }
            String[] stringArray2 = BaseApplication.getContext().getResources().getStringArray(R.array.super_trusted_mini_program);
            if (stringArray2 != null && stringArray2.length != 0) {
                String[] stringArray3 = BaseApplication.getContext().getResources().getStringArray(R.array.super_trusted_mini_program_cert_print);
                HashMap map = new HashMap(stringArray2.length);
                int i = 0;
                if (stringArray3 != null && stringArray3.length != 0) {
                    while (i < stringArray2.length) {
                        if (i < stringArray3.length) {
                            map.put(stringArray2[i], stringArray3[i]);
                        } else {
                            map.put(stringArray2[i], stringArray3[stringArray3.length - 1]);
                        }
                        i++;
                    }
                    sSuperTrustedMiniPrograms = Collections.unmodifiableMap(map);
                    return;
                }
                int length = stringArray2.length;
                while (i < length) {
                    map.put(stringArray2[i], "");
                    i++;
                }
                sSuperTrustedMiniPrograms = Collections.unmodifiableMap(map);
                return;
            }
            sSuperTrustedMiniPrograms = Collections.EMPTY_MAP;
        }
    }

    public static boolean isTrustedMiniProgram(H5ProAppInfo h5ProAppInfo) {
        if (h5ProAppInfo == null) {
            return false;
        }
        return isTrustedMiniProgram(h5ProAppInfo.getPkgName());
    }

    public static boolean isTrustedMiniProgram(String str) {
        initTrustedMiniProgramSource();
        return sTrustedMiniPrograms.contains(str) || sSuperTrustedMiniPrograms.containsKey(str);
    }

    public static boolean isSuperTrustedMiniProgram(H5ProAppInfo h5ProAppInfo) {
        if (h5ProAppInfo == null) {
            LogUtil.j(TAG, "isSuperTrustedMiniProgram h5ProAppInfo is null");
            return false;
        }
        return isSuperTrustedMiniProgram(h5ProAppInfo.getPkgName(), h5ProAppInfo.getCertPrint());
    }

    public static boolean isSuperTrustedMiniProgram(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "isSuperTrustedMiniProgram packageName is empty");
            return false;
        }
        initTrustedMiniProgramSource();
        String str3 = sSuperTrustedMiniPrograms.get(str);
        if (TextUtils.isEmpty(str3)) {
            LogUtil.a(TAG, "isSuperTrustedMiniProgram ", str, " is not SuperTrustedMiniProgram");
            return false;
        }
        return TextUtils.equals(str3, str2);
    }

    public static boolean isSuperTrustedMiniProgram(String str) {
        String miniProgramPackageName = getMiniProgramPackageName(str);
        if (TextUtils.isEmpty(miniProgramPackageName)) {
            LogUtil.j(TAG, "isSuperTrustedMiniProgram: packageName is empty");
            return false;
        }
        return isTrustedMiniProgram(miniProgramPackageName);
    }

    public static String getMiniProgramPackageName(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "getMiniProgramPackageName: url is empty");
            return "";
        }
        try {
            return reverseDomain(new URL(str).getHost());
        } catch (MalformedURLException e) {
            LogUtil.j(TAG, "getMiniProgramPackageName: exception -> " + e.getMessage());
            return "";
        }
    }

    private static String reverseDomain(String str) {
        String[] strArrSplit = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int length = strArrSplit.length - 1; length >= 0; length--) {
            sb.append(strArrSplit[length]);
            if (length != 0) {
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
