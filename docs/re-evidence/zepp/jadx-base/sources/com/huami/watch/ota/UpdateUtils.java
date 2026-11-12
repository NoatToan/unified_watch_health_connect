package com.huami.watch.ota;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.huami.watch.ota.cloud.RomInfo;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class UpdateUtils {
    public static final String CMD_FILTER = "#";
    public static final String CMD_RECOVERYING = "recoverying";
    public static final String CMD_SEND_FAILED = "failed";
    public static final String CMD_SEND_RESULT = "sendResult";
    public static final String CMD_SEND_SUCCESS = "success";
    public static final String CMD_UPDATE_CANCEL = "updateCancel";
    public static final String CONFIG_ALERT_INTERVAL = "alert_interval";
    public static final String CONFIG_BATTERY = "battery_value";
    public static final String CONFIG_BATTERY_CHARGING = "battery_CHARGING";
    public static final int CONFIG_DEFAULT_ALERT_INTERVAL = 3600;
    public static final String CONFIG_FORCE_UPDATE = "force_update";
    public static final String CONFIG_NEW_UPDATE_INFO = "new_update_info";
    public static final String CONFIG_RECOVERY_STATE = "recoverystate";
    public static final String CONFIG_UPDATELISTTIME = "updatelisttime";
    public static final String CONFIG_UPDATE_STATE = "update_state";
    public static final String CONFIG_URL = "update_url";
    public static final String CONFIG_WATCH_DEFAULT_ZIP_MD5 = "unknown";
    public static final String CONFIG_WATCH_DISPLAYID = "displayid";
    public static final String CONFIG_WATCH_MODEL = "model";
    public static final String CONFIG_WATCH_ZIP_EXIST = "exist";
    public static final String CONFIG_WATCH_ZIP_MD5 = "md5";
    public static final String CONN_BLE_CTRL = "com.huami.watch.extra.conn.ctrl";
    public static final String ENCODE = "UTF-8";
    public static final String EXTRA_DEVICE_CONNECTION_STATUS = "com.huami.watch.extra.DEVICE_CONNECTION_STATUS";
    public static final int LOW_BATTERY = 40;
    public static final int LOW_MEMORY = 150;
    public static final String PREFERENCE_NAME = "update_config";
    public static final int STATE_CHECKING_UPDATE = 65281;
    public static final int STATE_DEFAULT = 65535;
    public static final int STATE_DOWNLOADING = 65282;
    public static final int STATE_DOWNLOAD_FAIL = 65284;
    public static final int STATE_DOWNLOAD_SUCCESS = 65283;
    public static final int STATE_FILE_TRANSED_ERROR = 65287;
    public static final int STATE_FILE_TRANSED_SUCCESS = 65286;
    public static final int STATE_FILE_TRANSING = 65285;
    public static final int STATE_RECOVERED = 65289;
    public static final int STATE_RECOVERING = 65288;
    public static final int STATE_UPDATE_FROM_PHONE = 65290;
    public static final String UPDATE_ZIP_LOCAL = "/sdcard/update.zip";
    public static final String UPDATE_ZIP_LOCAL_PATH = "/data/media/0/update.zip";
    public static final String UPDATE_ZIP_REMOTE = "/sdcard/iwds/update.zip";
    public static final String UPDATE_ZIP_REMOTE_PATH = "/data/media/0/iwds/update.zip";
    public static final String URL_PRODUCTS_UPDATE = "http://dev.smartdevices.com.cn/ota_test/update_products_list.xml";
    public static String UUID_OTAFILE = "439536e2-cc6a-11e4-90da-5404a6abeabc";
    public static final String a = "HmOta-UpdateUtils";
    public static final int b = 1;
    public static final int c = 2;
    public static File RECOVERY_DIR = new File("/cache/recovery");
    public static File COMMAND_FILE = new File(RECOVERY_DIR, "command");
    public static File UPDATE_VERSION_FILE = new File(new File("/cache/"), "version");
    public static File LOG_FILE = new File(RECOVERY_DIR, "log");

    private static void a(Context context, String... strArr) throws IOException {
        RECOVERY_DIR.mkdirs();
        COMMAND_FILE.delete();
        LOG_FILE.delete();
        FileWriter fileWriter = new FileWriter(COMMAND_FILE);
        try {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    fileWriter.write(str);
                    fileWriter.write("\n");
                }
            }
            fileWriter.close();
            b(context);
            ((PowerManager) context.getSystemService("power")).reboot(StatEvent.SPORT_TP_VALUE_RECOVERY);
            throw new IOException("Reboot failed (no permissions?)");
        } catch (Throwable th) {
            fileWriter.close();
            throw th;
        }
    }

    private static void b(Context context) throws IOException {
        UPDATE_VERSION_FILE.delete();
        FileWriter fileWriter = new FileWriter(UPDATE_VERSION_FILE);
        try {
            fileWriter.write("");
            fileWriter.write("\n");
        } finally {
            fileWriter.close();
        }
    }

    public static long getAlertInterval(Context context, long j) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, 0);
        Log.d(a, " force_update value = [" + j + "]", new Object[0]);
        return sharedPreferences.getLong(CONFIG_ALERT_INTERVAL, j);
    }

    public static boolean getBatteryCharging(Context context) {
        return context.getSharedPreferences(PREFERENCE_NAME, 0).getBoolean(CONFIG_BATTERY_CHARGING, false);
    }

    public static int getBatteryValue(Context context, int i) {
        return context.getSharedPreferences(PREFERENCE_NAME, 0).getInt(CONFIG_BATTERY, i);
    }

    public static boolean getForceUpdate(Context context, boolean z) {
        return context.getSharedPreferences(PREFERENCE_NAME, 0).getBoolean("force_update", z);
    }

    public static String getLowBatteryMessage(Context context, String str) {
        return String.format(str, 40);
    }

    public static String getLowMemoryMessage(Context context, long j, String str) {
        return String.format(str, Long.valueOf(Math.round(j / 1048576)));
    }

    public static String getMd5ByFile(File file) throws FileNotFoundException {
        byte[] bArr = new byte[4096];
        byte[] bArrDigest = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            while (true) {
                try {
                    int i = fileInputStream.read(bArr);
                    if (i < 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            bArrDigest = messageDigest.digest();
            fileInputStream.close();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
        }
        String str = "";
        if (bArrDigest != null) {
            for (byte b2 : bArrDigest) {
                str = str + Integer.toString((b2 & 255) + 256, 16).substring(1);
            }
        }
        return str;
    }

    public static boolean getRecoveryState(Context context) {
        return context.getSharedPreferences(PREFERENCE_NAME, 0).getBoolean(CONFIG_RECOVERY_STATE, false);
    }

    public static String getRomUpdateMessage(Context context, RomInfo romInfo, String str) {
        return String.format(str, romInfo.getFirmwareVersion(), Long.valueOf(Math.round(Integer.parseInt(romInfo.getFileSize()) / 1048576)));
    }

    public static String getStringFromSP(Context context, String str) {
        return context.getSharedPreferences(PREFERENCE_NAME, 0).getString(str, "");
    }

    public static int getUpdateState(Context context) {
        int i = context.getSharedPreferences(PREFERENCE_NAME, 0).getInt(CONFIG_UPDATE_STATE, 65535);
        Log.i(a, "getUpdateState:" + i, new Object[0]);
        return i;
    }

    public static String getUpdatezipMD5(Context context) {
        return context.getSharedPreferences(PREFERENCE_NAME, 0).getString("md5", "unknown");
    }

    public static void installALLUpdatePkg(Context context, String str) {
        try {
            a(context, "--update_package=" + str, "--wipe_data", "--locale=" + Locale.getDefault().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void installUpdatePkg(Context context, String str) {
        try {
            a(context, "--update_package=" + str, "--wipe_dalvik_cache", "--locale=" + Locale.getDefault().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isLowBattery(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            intentRegisterReceiver.getIntExtra("status", 1);
            if ((intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, 0) * 100) / intentRegisterReceiver.getIntExtra(AnimatorViewWrapper.SCALE, 100) < 40) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPhoneConnected(Context context) {
        int i = (Settings.System.getInt(context.getContentResolver(), "com.huami.watch.extra.DEVICE_CONNECTION_STATUS", 0) > 0 || Settings.System.getInt(context.getContentResolver(), "com.huami.watch.extra.conn.ctrl", 0) > 0) ? 1 : 0;
        Log.d(a, "Read Device Connection Status : " + i, new Object[0]);
        return i == 1;
    }

    public static boolean isWifiConnected(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1).isConnected();
    }

    public static void putStringToSP(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCE_NAME, 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    public static void putUrlInfo(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCE_NAME, 0).edit();
        editorEdit.putString(CONFIG_URL, str);
        editorEdit.commit();
    }

    public static void setAlertInterval(Context context, long j) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, 0);
        Log.d(a, " alert_interval value = [" + j + "]", new Object[0]);
        sharedPreferences.edit().putLong(CONFIG_ALERT_INTERVAL, j).commit();
    }

    public static void setBatteryCharging(Context context, boolean z) {
        context.getSharedPreferences(PREFERENCE_NAME, 0).edit().putBoolean(CONFIG_BATTERY_CHARGING, z).commit();
    }

    public static void setBatteryValue(Context context, int i) {
        context.getSharedPreferences(PREFERENCE_NAME, 0).edit().putInt(CONFIG_BATTERY, i).commit();
    }

    public static void setForceUpdate(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, 0);
        Log.d(a, " force_update value = [" + str + "]", new Object[0]);
        if (str.equals("true")) {
            sharedPreferences.edit().putBoolean("force_update", true).commit();
        } else {
            sharedPreferences.edit().putBoolean("force_update", false).commit();
        }
    }

    public static void setUpdateLasttime(Context context, long j) {
        context.getSharedPreferences(PREFERENCE_NAME, 0).edit().putLong(CONFIG_UPDATELISTTIME, j).commit();
    }

    public static synchronized void setUpdateState(Context context, int i) {
        try {
            switch (i) {
                case 65282:
                    Log.i(a, "setUpdateState: " + i + " zip downloading", new Object[0]);
                    break;
                case STATE_DOWNLOAD_SUCCESS /* 65283 */:
                    Log.i(a, "setUpdateState: " + i + " zip downloaded", new Object[0]);
                    break;
                case STATE_FILE_TRANSING /* 65285 */:
                    Log.i(a, "setUpdateState: " + i + " file transing", new Object[0]);
                    break;
                case STATE_FILE_TRANSED_SUCCESS /* 65286 */:
                    Log.i(a, "setUpdateState: " + i + " file transed", new Object[0]);
                    break;
                case STATE_RECOVERING /* 65288 */:
                    Log.i(a, "setUpdateState: " + i + " recovering", new Object[0]);
                    break;
                case STATE_RECOVERED /* 65289 */:
                    Log.i(a, "setUpdateState: " + i + " recoveryed", new Object[0]);
                    break;
                case 65535:
                    Log.d(a, "setUpdateState: " + i + " default state", new Object[0]);
                    setUpdatezipMD5(context, "unknown");
                    setForceUpdate(context, "false");
                    setAlertInterval(context, TimeUtils.TIME_1_HOURS);
                    break;
                default:
                    Log.d(a, "setUpdateState  unkown", new Object[0]);
                    break;
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCE_NAME, 0).edit();
            editorEdit.putInt(CONFIG_UPDATE_STATE, i);
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void setUpdatezipMD5(Context context, String str) {
        context.getSharedPreferences(PREFERENCE_NAME, 0).edit().putString("md5", str).commit();
    }

    public static void setWatchVersionInfo(Context context, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCE_NAME, 0).edit();
        if (str.equals("") || str2.equals("")) {
            editorEdit.putString("model", str);
            editorEdit.putString(CONFIG_WATCH_DISPLAYID, str2);
            editorEdit.commit();
        } else {
            editorEdit.putString("model", str);
            editorEdit.putString(CONFIG_WATCH_DISPLAYID, str2);
            editorEdit.commit();
        }
    }

    public static boolean updatezipIsExist(String str, String str2) {
        File file = new File(str2);
        if (file.exists()) {
            try {
                String md5ByFile = getMd5ByFile(file);
                Log.i(a, "UpdateInfo md5:" + str, new Object[0]);
                Log.i(a, "local update.zip md5 :" + md5ByFile, new Object[0]);
                if (str.equals(md5ByFile)) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
