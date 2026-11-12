package com.xiaomi.hm.health.baseutil;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Deprecated
public class ExternalCache {
    private static final String a = ".miband";
    private static final String b = "miband";
    private static final String c = "firmware";
    private static final String d = "miband";
    private static final String e = "cache";
    private static final String f = "file";
    private static final String g = "lab";
    private static final String h = "thumb";
    private static final String i = ".nomedia";
    private static final String j = "training";
    private static File k;
    private static File l;
    private static File m;
    private static File n;
    private static File o;
    private static File p;
    private static File q;
    private static File r;
    private static File s;
    private static File t;
    private static Context u;

    private static void a(Context context) {
        k = FileUtils.getExternalStorageDirectoryCompatible(context);
        l = new File(k, "miband");
        m = new File(l, "miband");
        n = new File(k, a);
        o = new File(n, e);
        p = new File(n, "file");
        q = new File(n, g);
        r = new File(n, h);
        s = new File(r, i);
    }

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
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static List<String> deleteWatermarkFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!l.exists()) {
            l.mkdir();
        }
        if (!m.exists()) {
            m.mkdir();
        }
        ArrayList arrayList = new ArrayList();
        for (File file : m.listFiles()) {
            if (file.getName().startsWith(str)) {
                arrayList.add(file.getAbsolutePath());
                file.delete();
            }
        }
        return arrayList;
    }

    public static String getBaseLogDir() {
        return u.getFilesDir().getAbsolutePath() + "/log";
    }

    public static File getCachePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!n.exists()) {
            n.mkdir();
        }
        if (!o.exists()) {
            o.mkdir();
        }
        return new File(o, str);
    }

    public static String getExternalFwDir() {
        File externalFilesDir = u.getExternalFilesDir(c);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    public static File getFilePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!n.exists()) {
            n.mkdir();
        }
        if (!p.exists()) {
            p.mkdir();
        }
        return new File(p, str);
    }

    public static String getFwDir(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(u.getFilesDir().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(c);
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
        if (!n.exists()) {
            n.mkdir();
        }
        if (!q.exists()) {
            q.mkdir();
        }
        return new File(q, str);
    }

    public static String getSharingPath(String str) {
        return getFilePath(str).getAbsolutePath();
    }

    public static File getThumbPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!n.exists()) {
            n.mkdir();
        }
        if (!r.exists()) {
            r.mkdir();
            if (!s.exists()) {
                try {
                    s.createNewFile();
                } catch (IOException unused) {
                }
            }
        }
        return new File(r, str);
    }

    public static File getTrainingDir() {
        if (u != null) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                t = u.getExternalFilesDir("training");
            } else {
                t = new File(u.getFilesDir(), "training");
            }
        }
        File file = t;
        if (file == null) {
            if (!n.exists()) {
                n.mkdir();
            }
            t = new File(n, "training");
        } else if (!file.exists()) {
            t.mkdir();
        }
        return t;
    }

    public static String getTrainingGaussBlurPath(String str) {
        return new File(getTrainingDir(), str).getAbsolutePath();
    }

    public static File getWatermarkFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!l.exists()) {
            l.mkdir();
        }
        if (!m.exists()) {
            m.mkdir();
        }
        return new File(m, str);
    }

    public static String getWatermarkPath(String str) {
        return getWatermarkFile(str).getAbsolutePath();
    }

    public static void initAppContext(Context context) {
        u = context;
        a(context);
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
}
