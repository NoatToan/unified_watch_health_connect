package com.huawei.watchface;

import android.content.SharedPreferences;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public abstract class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30303a = "m4";

    public static void a(boolean z) {
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "DEFAULT_WATCH_FACE_OPERATION_RESULT_PREF");
        if (sharedPreferencesB == null) {
            HwLog.i(f30303a, "sharedPreferences is null");
            return;
        }
        sharedPreferencesB.edit().putBoolean("DEFAULT_WATCH_FACE_OPERATION_RESULT_DATA_PREF", z).apply();
        HwLog.i(f30303a, "saveDefaultWatchFaceOperationResult: " + z);
    }

    public static boolean a() {
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "DEFAULT_WATCH_FACE_OPERATION_RESULT_PREF");
        if (sharedPreferencesB == null) {
            HwLog.i(f30303a, "sharedPreferences is null");
            return false;
        }
        HwLog.d(f30303a, "isDefaultWatchFaceOperationResultSuccess() completed.");
        return sharedPreferencesB.getBoolean("DEFAULT_WATCH_FACE_OPERATION_RESULT_DATA_PREF", false);
    }
}
