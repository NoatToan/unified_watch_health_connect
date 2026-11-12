package com.garmin.android.music;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"ApplySharedPref"})
public class MusicControlsSharedPrefs {
    private static final String FILENAME = "MusicControlSettings";
    private static final String KEY_DEFAULT_MUSIC_PLAYER = "default_music_player";
    private static final String KEY_DEFAULT_MUSIC_PLAYER_ACTIVITY_INFO = "default_music_player_activityInfo";
    private static final String KEY_DEFAULT_MUSIC_PLAYER_APP_NAME = "default_music_player_app_name";
    private static final String KEY_LAST_MUSIC_PLAYER_PACKAGE = "last_music_player_package";

    private MusicControlsSharedPrefs() {
    }

    private static void deleteUserPreferredPlayer(Context context) {
        get(context).edit().remove(KEY_DEFAULT_MUSIC_PLAYER).remove(KEY_DEFAULT_MUSIC_PLAYER_ACTIVITY_INFO).remove(KEY_DEFAULT_MUSIC_PLAYER_APP_NAME).commit();
    }

    private static SharedPreferences get(Context context) {
        return context.getApplicationContext().getSharedPreferences(FILENAME, 0);
    }

    public static ComponentName getLastUsedPlayer(Context context) {
        PackageManager packageManager;
        Intent launchIntentForPackage;
        String string = get(context).getString(KEY_LAST_MUSIC_PLAYER_PACKAGE, null);
        if (TextUtils.isEmpty(string) || (packageManager = getPackageManager(context)) == null || !isAppInstalled(packageManager, string) || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(string)) == null) {
            return null;
        }
        return launchIntentForPackage.getComponent();
    }

    private static PackageManager getPackageManager(Context context) {
        return context.getApplicationContext().getPackageManager();
    }

    public static ComponentName getUserPreferredPlayer(Context context) {
        SharedPreferences sharedPreferences = get(context);
        String string = sharedPreferences.getString(KEY_DEFAULT_MUSIC_PLAYER, null);
        if (TextUtils.isEmpty(string)) {
            deleteUserPreferredPlayer(context);
            return null;
        }
        PackageManager packageManager = getPackageManager(context);
        if (packageManager == null) {
            deleteUserPreferredPlayer(context);
            return null;
        }
        if (!isAppInstalled(packageManager, string)) {
            deleteUserPreferredPlayer(context);
            return null;
        }
        String string2 = sharedPreferences.getString(KEY_DEFAULT_MUSIC_PLAYER_ACTIVITY_INFO, null);
        if (!TextUtils.isEmpty(string2)) {
            return new ComponentName(string, string2);
        }
        deleteUserPreferredPlayer(context);
        return null;
    }

    private static boolean isAppInstalled(PackageManager packageManager, String str) {
        try {
            return packageManager.getApplicationInfo(str, 128) != null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static void setLastUsedPlayer(Context context, String str) {
        get(context).edit().putString(KEY_LAST_MUSIC_PLAYER_PACKAGE, str).commit();
    }

    public static void setUserPreferredPlayer(Context context, ComponentName componentName) {
        try {
            PackageManager packageManager = getPackageManager(context);
            if (packageManager != null) {
                String packageName = componentName.getPackageName();
                get(context).edit().putString(KEY_DEFAULT_MUSIC_PLAYER, packageName).putString(KEY_DEFAULT_MUSIC_PLAYER_ACTIVITY_INFO, componentName.getClassName()).putString(KEY_DEFAULT_MUSIC_PLAYER_APP_NAME, packageManager.getApplicationInfo(packageName, 128).loadLabel(packageManager).toString()).commit();
            }
        } catch (PackageManager.NameNotFoundException e4) {
            int i14 = gt2.c.f79010a;
            gt2.b.f79005a.i("MC#SharedPrefs").error("saveDefaultMusicPlayer", (Throwable) e4);
        }
    }
}
