package com.xiaomi.account.utils;

import android.accounts.Account;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;

/* JADX INFO: loaded from: classes6.dex */
public class AccountManagerCompat {
    private static final String TAG = "XmAccountManager";

    private static void checkNotNull(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2 + "must not be null");
        }
    }

    public static boolean getAccountVisible(XiaomiAccountManager xiaomiAccountManager, Account account, String str) {
        checkNotNull(str, "packageName");
        if (account != null) {
            return xiaomiAccountManager.getAccountVisibility(account, str) == 1;
        }
        AccountLogger.log(TAG, "no xiaomi account");
        return false;
    }

    private static String getBuildVersionMsg() {
        return "Build.VERSION.SDK_INT: " + Build.VERSION.SDK_INT + " ";
    }

    public static boolean setAccountVisible(XiaomiAccountManager xiaomiAccountManager, Account account, String str) {
        checkNotNull(str, "packageName");
        if (account != null) {
            return xiaomiAccountManager.setAccountVisibility(account, str, 1);
        }
        AccountLogger.log(TAG, "no xiaomi account");
        return false;
    }
}
