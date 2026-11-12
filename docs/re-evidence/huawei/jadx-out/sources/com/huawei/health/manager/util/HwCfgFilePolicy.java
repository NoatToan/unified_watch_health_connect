package com.huawei.health.manager.util;

import android.util.Log;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class HwCfgFilePolicy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f8143b;
    private static String[] e;

    static {
        String str = System.getenv("CUST_POLICY_DIRS");
        LogUtil.a("Step_CfgFilePolicy", "policy=", str);
        if (str == null || str.length() == 0) {
            Log.i("Step_CfgFilePolicy", "ERROR: env CUST_POLICY_DIRS not set, use default");
            str = "/system/emui:/system/global:/system/etc:/oem:/data/cust:/cust_spec";
        }
        String[] strArrSplit = str.split(":");
        f8143b = strArrSplit;
        e = (String[]) strArrSplit.clone();
        int i = 0;
        while (true) {
            String[] strArr = e;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i].endsWith("/etc") && !e[i].equals("/etc")) {
                String[] strArr2 = e;
                strArr2[i] = strArr2[i].replace("/etc", "");
            }
            i++;
        }
    }

    private HwCfgFilePolicy() {
    }

    public static File c(String str, int i) throws NoClassDefFoundError {
        LogUtil.a("Step_CfgFilePolicy", "getCfgFile enter...");
        String[] strArr = i == 1 ? e : f8143b;
        for (int length = strArr.length - 1; length >= 0; length--) {
            File file = new File(strArr[length], str);
            if (file.exists()) {
                return file;
            }
        }
        LogUtil.d("Step_CfgFilePolicy", "mCfgDirs length : ", Integer.valueOf(f8143b.length));
        return null;
    }
}
