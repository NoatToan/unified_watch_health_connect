package com.huami.feedback.util;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.dev.Logcat;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes8.dex */
public class Utils {
    private static final String a = "Utils";
    private static final String b = "^[\\w\\-.]+@[\\w\\-]+(\\.\\w+)+$";
    private static final int c = 2000;
    private static long d = 0;
    private static int e = 0;
    private static final String f = "wear_companion.log";

    @Nullable
    private static File a(Context context) {
        try {
            File[] externalFilesDirs = ContextCompat.getExternalFilesDirs(context, null);
            if (externalFilesDirs.length > 0) {
                return externalFilesDirs[0];
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Nullable
    private static File b(File file) {
        if (file == null) {
            return null;
        }
        return new File(file, f);
    }

    private static boolean c(char c2) {
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(c2);
        return unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || unicodeBlockOf == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || unicodeBlockOf == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS || unicodeBlockOf == Character.UnicodeBlock.GENERAL_PUNCTUATION;
    }

    private static void d(ZipOutputStream zipOutputStream, File file) throws IOException {
        HMLog.i("Utils", "zip file:" + file.getName(), new Object[0]);
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                d(zipOutputStream, file2);
            }
            return;
        }
        byte[] bArr = new byte[1024];
        FileInputStream fileInputStream = new FileInputStream(file);
        zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i <= 0) {
                zipOutputStream.closeEntry();
                fileInputStream.close();
                return;
            }
            zipOutputStream.write(bArr, 0, i);
        }
    }

    public static File getLogFile(Context context) {
        return b(context.getFilesDir());
    }

    public static File getSDCardLogFile(Context context) {
        Logcat.i("Utils", "getSdkCardLogFile ");
        return b(a(context));
    }

    public static String getVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Exception unused) {
            HMLog.w("Utils", "get app version name fail", new Object[0]);
            return "";
        }
    }

    public static File getWearCompanionLog(Context context) {
        return !GlobalConfig.get().isBuildDebug() ? getLogFile(context) : getSDCardLogFile(context);
    }

    public static boolean hasChinese(String str) {
        for (char c2 : str.toCharArray()) {
            if (c(c2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isBluetoothEnable() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    public static boolean isEmailFormat(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return Pattern.compile(b).matcher(str).matches();
    }

    public static boolean isFastDoubleClick(View view) {
        if (view.getId() != e) {
            d = System.currentTimeMillis();
            e = view.getId();
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - d;
        if (0 < j && j < 2000) {
            return true;
        }
        d = jCurrentTimeMillis;
        return false;
    }

    public static boolean isReleaseVersion(Context context) {
        return getVersionName(context).split("\\.").length == 3;
    }

    public static boolean zipFiles(File file, File[] fileArr) {
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
            for (File file2 : fileArr) {
                d(zipOutputStream, file2);
            }
            zipOutputStream.close();
            return true;
        } catch (IOException e2) {
            HMLog.w("Utils", "Zip file error:" + e2.getMessage(), new Object[0]);
            return false;
        }
    }
}
