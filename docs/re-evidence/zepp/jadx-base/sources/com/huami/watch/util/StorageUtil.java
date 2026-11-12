package com.huami.watch.util;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.Random;

/* JADX INFO: loaded from: classes11.dex */
public class StorageUtil {
    public static String FILE_PROVIDER_AUTH = "com.huami.watch.companion.fileprovider";
    public static final String WATCH_FACE_BG_NAME = "watch_face_bg.png";
    private static final String a = "Util-Storage";
    private static final String b = "amazfit";
    private static final String c = "wear_companion.log";
    private static final String d = "logcat.log";
    private static final String e = "share";
    private static final String f = "watch_face_bg";
    private static final String g = "dataflow";
    private static final String h = "agps";
    private static final String i = "agps_qualcomm.bin";
    private static final String j = "agps_data.zip";
    private static final String k = "rom";
    private static final String l = "resource_default";

    private StorageUtil() {
    }

    private static File a(Context context, String str) {
        return e(getDataFile(context, g), str);
    }

    private static File b(@NonNull Context context, String str) {
        File file = null;
        try {
            File[] externalCacheDirs = ContextCompat.getExternalCacheDirs(context);
            if (externalCacheDirs.length > 0) {
                file = externalCacheDirs[0];
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return e(file, str);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    /* JADX WARN: Code duplicated, block: B:6:0x000a A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x0011), top: B:19:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0011 A[Catch: Exception -> 0x0014, TRY_LEAVE, TryCatch #0 {Exception -> 0x0014, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x0011), top: B:19:0x0004 }] */
    @Nullable
    private static File c(Context context, boolean z, String str) {
        File file;
        File[] externalFilesDirs;
        if (z) {
            externalFilesDirs = ContextCompat.getExternalFilesDirs(context, str);
            if (externalFilesDirs.length > 0) {
                file = externalFilesDirs[0];
            } else {
                file = null;
            }
        } else {
            try {
                if (DeviceCompatibility.isQ()) {
                    externalFilesDirs = ContextCompat.getExternalFilesDirs(context, str);
                    if (externalFilesDirs.length > 0) {
                        file = externalFilesDirs[0];
                    } else {
                        file = null;
                    }
                } else {
                    file = null;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (file == null) {
            Log.w(a, "ExternalDir is Null!!", new Object[0]);
            return null;
        }
        Log.d(a, "Get ExternalDir : " + file + ", IsAndroidDataDir : " + z + ", Type : " + str, new Object[0]);
        return file;
    }

    private static File d(Context context, boolean z, String str, String str2) {
        return e(c(context, z, str), str2);
    }

    @Nullable
    private static File e(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            Log.w(a, "FileName is Empty : " + str, new Object[0]);
            return null;
        }
        if (file == null) {
            Log.w(a, "Dir is Null!!", new Object[0]);
            return null;
        }
        if (!file.exists()) {
            Log.d(a, "MakeDirs : " + file + ", Success : " + file.mkdirs(), new Object[0]);
        }
        File file2 = new File(file, str);
        Log.d(a, "Get File : " + file2, new Object[0]);
        return file2;
    }

    public static File getAGpsDownloadFile(Context context, boolean z) {
        return e(z ? getExternalDataFile(context, h) : getDataFile(context, h), j);
    }

    public static File getAGpsQualcommDownloadFile(Context context, boolean z) {
        return e(z ? getExternalDataFile(context, h) : getDataFile(context, h), i);
    }

    public static File getAccountLogFile(Context context) {
        return getExternalDataFile(context, "hm_pan.txt");
    }

    public static File getAvatarFile(Context context) {
        return getExternalDataFile(context, (System.currentTimeMillis() * ((long) new Random().nextInt(9999))) + "_avatar.jpg");
    }

    public static File getDataFile(@NonNull Context context, String str) {
        return e(context.getFilesDir(), str);
    }

    public static File getExternalAmazfitDir(Context context) {
        return e(c(context, false, null), "amazfit");
    }

    public static File getExternalDataFile(@NonNull Context context, String str) {
        return d(context, true, null, str);
    }

    public static Uri getFileUri(@NonNull Context context, File file) {
        if (file != null) {
            return Build.VERSION.SDK_INT >= 24 ? FileProvider.getUriForFile(context, FILE_PROVIDER_AUTH, file) : Uri.fromFile(file);
        }
        return Uri.EMPTY;
    }

    public static File getImageCaptureFile(Context context) {
        return b(context, "image_capture.jpg");
    }

    public static File getLogFile(Context context, boolean z) {
        return !z ? getLogFile(context) : getSDCardLogFile(context);
    }

    public static File getLogcatFile(Context context, boolean z) {
        return !z ? getDataFile(context, d) : getExternalDataFile(context, d);
    }

    public static File getRomDownloadFile(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = l;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        return e(getDataFile(context, k), sb.toString());
    }

    public static File getSDCardLogFile(Context context) {
        return getExternalDataFile(context, c);
    }

    public static File getSportDetailRawDataFile(Context context, long j2, String str) {
        return a(context, j2 + "_" + str + "_sport_detail.data");
    }

    public static File getSportHealthLogFile(Context context) {
        return getDataFile(context, "springchannel");
    }

    public static File getSportSummaryRawDataFile(Context context, long j2, String str) {
        return a(context, j2 + "_" + str + "_sport_summary.data");
    }

    public static File getWatchFaceBgDir(Context context) {
        return b(context, f);
    }

    public static File getWatchFaceBgFile(Context context, String str) {
        return e(getWatchFaceBgDir(context), str);
    }

    public static boolean isSDCardMounted() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static void setProviderAuth(String str) {
        FILE_PROVIDER_AUTH = str;
    }

    public static Uri toUri(File file) {
        return file != null ? Uri.fromFile(file) : Uri.EMPTY;
    }

    public static File getLogFile(Context context) {
        return getDataFile(context, c);
    }
}
