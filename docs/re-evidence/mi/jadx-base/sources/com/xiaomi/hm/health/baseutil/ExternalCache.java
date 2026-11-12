package com.xiaomi.hm.health.baseutil;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public class ExternalCache {
    private static File CACHE_DIR = null;
    private static final String CACHE_DIR_NAME = "cache";
    private static final String CACHE_ROOT_DIR = ".miband";
    private static File EXTERNAL_STORAGE_DIR = null;
    private static File FILE_DIR = null;
    private static final String FILE_DIR_NAME = "file";
    private static final String FILE_FIRMWARE = "firmware";
    private static final String FILE_ROOT_DIR = "miband";
    private static File LAB_DIR = null;
    private static final String LAB_DIR_NAME = "lab";
    private static File NO_MEDIA_FILE = null;
    private static final String NO_MEDIA_FILE_NAME = ".nomedia";
    private static File ROOT_DIR = null;
    private static File ROOT_HIDE_DIR = null;
    private static File THUMB_DIR = null;
    private static final String THUMB_DIR_NAME = "thumb";
    private static final String TRAINING_FILE_NAME = "training";
    private static File WATERMARK_DIR = null;
    private static final String WATERMARK_DIR_NAME = "miband";
    private static Context appContext;
    private static File trainingDir;

    public static boolean deleteAllFiles(File file) {
        if (!file.exists() || !file.isDirectory()) {
            return false;
        }
        boolean z = false;
        for (String str : file.list()) {
            File file2 = new File(file, str);
            if (file2.isFile()) {
                file2.delete();
            } else if (file2.isDirectory()) {
                File file3 = new File(file, str);
                deleteAllFiles(file3);
                deleteFolder(file3);
                z = true;
            }
        }
        return z;
    }

    public static void deleteFolder(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            deleteAllFiles(file);
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<String> deleteWatermarkFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!ROOT_DIR.exists()) {
            ROOT_DIR.mkdir();
        }
        if (!WATERMARK_DIR.exists()) {
            WATERMARK_DIR.mkdir();
        }
        ArrayList arrayList = new ArrayList();
        for (File file : WATERMARK_DIR.listFiles()) {
            if (file.getName().startsWith(str)) {
                arrayList.add(file.getAbsolutePath());
                file.delete();
            }
        }
        return arrayList;
    }

    public static String getBaseLogDir() {
        return appContext.getFilesDir().getAbsolutePath() + "/log";
    }

    public static File getCachePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!ROOT_HIDE_DIR.exists()) {
            ROOT_HIDE_DIR.mkdir();
        }
        if (!CACHE_DIR.exists()) {
            CACHE_DIR.mkdir();
        }
        return new File(CACHE_DIR, str);
    }

    public static String getExternalFwDir() {
        File externalFilesDir = appContext.getExternalFilesDir(FILE_FIRMWARE);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    public static File getFilePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!ROOT_HIDE_DIR.exists()) {
            ROOT_HIDE_DIR.mkdir();
        }
        if (!FILE_DIR.exists()) {
            FILE_DIR.mkdir();
        }
        return new File(FILE_DIR, str);
    }

    public static String getFwDir(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(appContext.getFilesDir().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(FILE_FIRMWARE);
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    public static String getFwPath(String str, String str2) {
        return getFwDir(str) + File.separator + str2;
    }

    public static String getGpxLogDir() {
        return getBaseLogDir() + "/gpx";
    }

    public static File getLabPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!ROOT_HIDE_DIR.exists()) {
            ROOT_HIDE_DIR.mkdir();
        }
        if (!LAB_DIR.exists()) {
            LAB_DIR.mkdir();
        }
        return new File(LAB_DIR, str);
    }

    public static String getSharingPath(String str) {
        return getFilePath(str).getAbsolutePath();
    }

    public static File getThumbPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!ROOT_HIDE_DIR.exists()) {
            ROOT_HIDE_DIR.mkdir();
        }
        if (!THUMB_DIR.exists()) {
            THUMB_DIR.mkdir();
            if (!NO_MEDIA_FILE.exists()) {
                try {
                    NO_MEDIA_FILE.createNewFile();
                } catch (IOException unused) {
                }
            }
        }
        return new File(THUMB_DIR, str);
    }

    public static File getTrainingDir() {
        if (appContext != null) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                trainingDir = appContext.getExternalFilesDir(TRAINING_FILE_NAME);
            } else {
                trainingDir = new File(appContext.getFilesDir(), TRAINING_FILE_NAME);
            }
        }
        File file = trainingDir;
        if (file == null) {
            if (!ROOT_HIDE_DIR.exists()) {
                ROOT_HIDE_DIR.mkdir();
            }
            trainingDir = new File(ROOT_HIDE_DIR, TRAINING_FILE_NAME);
        } else if (!file.exists()) {
            trainingDir.mkdir();
        }
        return trainingDir;
    }

    public static String getTrainingGaussBlurPath(String str) {
        return new File(getTrainingDir(), str).getAbsolutePath();
    }

    public static File getWatermarkFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!ROOT_DIR.exists()) {
            ROOT_DIR.mkdir();
        }
        if (!WATERMARK_DIR.exists()) {
            WATERMARK_DIR.mkdir();
        }
        return new File(WATERMARK_DIR, str);
    }

    public static String getWatermarkPath(String str) {
        return getWatermarkFile(str).getAbsolutePath();
    }

    public static void initAppContext(Context context) {
        appContext = context;
        initFiles(context);
        File file = new File(getBaseLogDir());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(getGpxLogDir());
        if (file2.exists()) {
            return;
        }
        file2.mkdirs();
    }

    private static void initFiles(Context context) {
        EXTERNAL_STORAGE_DIR = FileUtils.getExternalStorageDirectoryCompatible(context);
        ROOT_DIR = new File(EXTERNAL_STORAGE_DIR, "miband");
        WATERMARK_DIR = new File(ROOT_DIR, "miband");
        ROOT_HIDE_DIR = new File(EXTERNAL_STORAGE_DIR, CACHE_ROOT_DIR);
        CACHE_DIR = new File(ROOT_HIDE_DIR, "cache");
        FILE_DIR = new File(ROOT_HIDE_DIR, FILE_DIR_NAME);
        LAB_DIR = new File(ROOT_HIDE_DIR, LAB_DIR_NAME);
        THUMB_DIR = new File(ROOT_HIDE_DIR, THUMB_DIR_NAME);
        NO_MEDIA_FILE = new File(THUMB_DIR, NO_MEDIA_FILE_NAME);
    }
}
