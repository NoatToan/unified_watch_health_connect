package com.xiaomi.hm.health.traininglib.media;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.FileUtils;

/* JADX INFO: loaded from: classes22.dex */
public class StorageUtils {
    public static final int ONE_GB = 1073741824;
    public static final int ONE_KB = 1024;
    public static final int ONE_MB = 1048576;
    private static final String a = "StorageUtils";
    private static final int b = 1048576;

    private StorageUtils() {
    }

    public static boolean checkSdcardStorage(Context context, int i) {
        return (getSdCardAvailableSize(context) - ((long) i)) - 1048576 > 0;
    }

    public static long getAvailableSize(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        HMLog.i(a, "getAvailableSize path:" + str, new Object[0]);
        try {
            StatFs statFs = new StatFs(str);
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (Exception e) {
            HMLog.i(a, e.getMessage(), new Object[0]);
            return -1L;
        }
    }

    public static long getAvailableSizeK(String str) {
        return getAvailableSize(str) / 1024;
    }

    public static long getSdCardAvailableSize(Context context) {
        if (isSdCardMounted()) {
            return getAvailableSize(FileUtils.getExternalStorageDirectoryCompatible(context).getAbsolutePath());
        }
        return -1L;
    }

    public static long getSdCardAvailableSizeK(Context context) {
        return getSdCardAvailableSize(context) / 1024;
    }

    public static long getSdCardAvailableSizeM(Context context) {
        return (getSdCardAvailableSize(context) / 1024) / 1024;
    }

    public static String getStorageState(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            throw new IllegalArgumentException();
        }
        try {
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            if (storageManager != null) {
                return (String) StorageManager.class.getMethod("getVolumeState", String.class).invoke(storageManager, str);
            }
            return null;
        } catch (Exception e) {
            HMLog.i(a, e.getMessage(), new Object[0]);
            return null;
        }
    }

    public static boolean isSdCardMounted() {
        return "mounted".equals(Environment.getExternalStorageState());
    }
}
