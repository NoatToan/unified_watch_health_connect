package com.xiaomi.accountsdk.guestaccount;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public class SharedPreferencesUtils {
    private static SharedPreferences getSP(Context context) {
        return context.getSharedPreferences("uuid_data", 0);
    }

    public static String getUUID(Context context) {
        return getSP(context).getString("uuid", "");
    }

    public static void saveUUID(Context context, String str) {
        getSP(context).edit().putString("uuid", str).commit();
    }
}
