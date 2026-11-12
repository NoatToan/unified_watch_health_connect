package com.huawei.hianalytics.util;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.fileprotect.HwSfpPolicyManager;
import com.huawei.hianalytics.core.log.HiLog;

/* JADX INFO: loaded from: classes3.dex */
public class HwSfpPolicyUtils {
    public static void a(Context context, String str, String str2, int i) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HwSfpPolicyManager hwSfpPolicyManager = HwSfpPolicyManager.getDefault();
            if (hwSfpPolicyManager == null) {
                return;
            }
            String label = hwSfpPolicyManager.getLabel(context, str, "SecurityLevel");
            if (TextUtils.isEmpty(label)) {
                int label2 = hwSfpPolicyManager.setLabel(context, str, "SecurityLevel", str2, i);
                if (label2 != 0) {
                    HiLog.i("HWPU", "setProtectionLabel failed. result:" + label2);
                    return;
                }
                return;
            }
            if (TextUtils.equals(label, str2)) {
                return;
            }
            HiLog.i("HWPU", "setProtectionLabel failed, currentLabel: " + label + ", expectedLabel: " + str2);
        } catch (Throwable th) {
            HiLog.i("HWPU", "setProtectionLabel failed: " + th.getMessage());
        }
    }

    public static void setPublicProtectionLevel(Context context, String str, int i) {
        if (context != null && context.isDeviceProtectedStorage()) {
            a(context, str, "S0", i);
            HiLog.i("HWPU", "haJsSdk file LABEL_VALUE :S0");
        }
    }
}
