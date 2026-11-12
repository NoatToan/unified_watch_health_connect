package com.xiaomi.accountsdk.account.config;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.xiaomi.accountsdk.account.data.XiaomiUserCoreInfo;

/* JADX INFO: loaded from: classes6.dex */
public class UserExperienceStatus {
    private static final String KEY_INT_USER_EXPERIENCE = "upload_log_pref";
    private static final String KEY_INT_USER_EXPERIENCE_LAST_STATUS_FOR_PASSPORT = "upload_log_pref_last_status_for_passport";

    public static void setWhenLogin(Context context, XiaomiUserCoreInfo xiaomiUserCoreInfo) {
        ContentResolver contentResolver = context.getContentResolver();
        Settings.Secure.putInt(contentResolver, KEY_INT_USER_EXPERIENCE_LAST_STATUS_FOR_PASSPORT, Settings.Secure.getInt(contentResolver, KEY_INT_USER_EXPERIENCE, -1));
        if (xiaomiUserCoreInfo.child) {
            Settings.Secure.putInt(context.getContentResolver(), KEY_INT_USER_EXPERIENCE, 0);
        }
    }

    public static void unsetWhenLogout(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        int i = Settings.Secure.getInt(contentResolver, KEY_INT_USER_EXPERIENCE_LAST_STATUS_FOR_PASSPORT, -1);
        int i2 = Settings.Secure.getInt(contentResolver, KEY_INT_USER_EXPERIENCE, i);
        if (i == i2 || i2 == 1) {
            return;
        }
        Settings.Secure.putInt(contentResolver, KEY_INT_USER_EXPERIENCE, i);
    }
}
