package com.xiaomi.hm.health.watermarkcamera.utils;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.hm.health.baseutil.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class WatermarkFileUtils {
    private static final String a = ".miband";
    private static final String b = "miband";
    private static final String c = "cache";
    private static final String d = "miband";
    private static final String e = "share";
    private static final String f = "share.jpg";

    private static File a(Context context) {
        return new File(b(context), c);
    }

    private static File b(Context context) {
        return new File(FileUtils.getExternalStorageDirectoryCompatible(context), a);
    }

    private static File c(Context context) {
        return new File(FileUtils.getExternalStorageDirectoryCompatible(context), "miband");
    }

    private static File d(Context context) {
        return new File(c(context), "miband");
    }

    public static List<String> deleteWatermarkFile(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d(context).mkdirs();
        ArrayList arrayList = new ArrayList();
        for (File file : d(context).listFiles()) {
            if (file.getName().startsWith(str)) {
                arrayList.add(file.getAbsolutePath());
                file.delete();
            }
        }
        return arrayList;
    }

    public static File getCachePath(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        a(context).mkdirs();
        return new File(a(context), str);
    }

    public static File getShareCacheFile(Context context, String str) {
        File file = new File(context.getExternalCacheDir(), "share");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file.getAbsolutePath(), str);
    }

    public static File getShareImagePath(Context context) {
        return getShareCacheFile(context, Calendar.getInstance().getTimeInMillis() + "_share.jpg");
    }

    public static File getWatermarkFile(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d(context).mkdirs();
        return new File(d(context), str);
    }

    public static String getWatermarkPath(Context context, String str) {
        return getWatermarkFile(context, str).getAbsolutePath();
    }
}
