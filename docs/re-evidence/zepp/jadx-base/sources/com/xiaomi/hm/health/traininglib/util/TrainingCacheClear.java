package com.xiaomi.hm.health.traininglib.util;

import com.huami.account.ui.areas.SelectAreaManager;
import com.xiaomi.hm.health.baseutil.FileUtils;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingCacheClear {
    private static boolean a(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    if (!a(file2)) {
                        return false;
                    }
                } else if (!file2.delete()) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static boolean clearAllCachedFileSize() {
        return a(new File(FileUtils.getTrainingDir().getAbsolutePath()));
    }

    public static String getAllCachedFileSize() {
        return transSize(getDirSize(new File(FileUtils.getTrainingDir().getAbsolutePath())));
    }

    public static long getDirSize(File file) {
        long dirSize = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                dirSize += getDirSize(file2);
            }
        }
        return dirSize;
    }

    public static String transSize(double d) {
        double d2;
        String str;
        if (d >= 1.073741824E9d) {
            d2 = d / 1.073741824E9d;
            str = SelectAreaManager.GB;
        } else if (d >= 1048576.0d) {
            d2 = d / 1048576.0d;
            str = "MB";
        } else {
            d2 = d / 1024.0d;
            str = "KB";
        }
        String strReplaceAll = String.format(Locale.getDefault(), "%.1f", Double.valueOf(d2));
        if (strReplaceAll.indexOf(".") > 0) {
            strReplaceAll = strReplaceAll.replaceAll("0+?$", "").replaceAll("[.]$", "");
        }
        return String.format(Locale.getDefault(), "%s%s", strReplaceAll, str);
    }
}
