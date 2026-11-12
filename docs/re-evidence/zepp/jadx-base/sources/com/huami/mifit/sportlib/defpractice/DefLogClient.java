package com.huami.mifit.sportlib.defpractice;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.huami.mifit.sportlib.defpractice.DefLogClient;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class DefLogClient {
    private static int a = -1;
    private static int b = 0;
    private static int c = 1;
    private static int d = 2;
    private static final String e = "sportlib_log";
    private static final String f = "sportlib_log.txt";
    private static String g = null;
    private static final int h = 10;
    private static final String i = "sportdata";
    private static final String j = ".csv";
    private static String k = null;
    private static String l = null;
    private static int m = 0;
    private static boolean n = true;
    private static int o = 2;
    private static int p = 20971520;
    private static boolean q = true;
    private static Handler r;

    private static String d() {
        return "<Unknown>";
    }

    private static String e() {
        return new SimpleDateFormat(TrainingDateUtils.PATTERN_YMD_HMSS).format(new Date());
    }

    public static void enable(boolean z, boolean z2, String str) {
        File file = new File(str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + f);
        if (file.exists()) {
            file.delete();
        }
        l = str;
        g = str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + f;
        m = z ? b : a;
        q = z;
        n = z2;
    }

    public static void err(String str, String str2) {
        if (m > a) {
            Log.e(str, d() + str2);
        }
    }

    public static void f(final String str, final String str2) {
        if (!n || g == null) {
            return;
        }
        j(new Runnable() { // from class: d51
            @Override // java.lang.Runnable
            public final void run() {
                DefLogClient.h(str, str2);
            }
        });
    }

    public static void fi(String str, String str2) {
        int i2 = m;
        if (i2 > a && i2 < c) {
            Log.i(str, d() + str2);
        }
        f(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean g(File file, String str) {
        return str.endsWith(j);
    }

    public static String getLogFilePath() {
        return g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String str, String str2) {
        File file = new File(g);
        if (file.exists() && file.length() > p) {
            file.delete();
        }
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(e() + "  " + str + "  " + str2 + "\n");
            fileWriter.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(String str, String str2) {
        k = l + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + i + "_" + str + j;
        File file = new File(k);
        if (!file.exists()) {
            f();
        }
        if (file.exists() && file.length() > p) {
            file.delete();
        }
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(str2 + "\n");
            fileWriter.close();
        } catch (IOException unused) {
        }
    }

    public static void info(String str, String str2) {
        int i2 = m;
        if (i2 <= a || i2 >= c) {
            return;
        }
        Log.i(str, d() + str2);
    }

    public static boolean isEnabled() {
        int i2 = m;
        return i2 > a && i2 < d;
    }

    public static boolean isEnaledFile() {
        return n;
    }

    private static void j(Runnable runnable) {
        if (r == null) {
            HandlerThread handlerThread = new HandlerThread("DEBUG");
            handlerThread.start();
            r = new Handler(handlerThread.getLooper());
        }
        r.post(runnable);
    }

    public static void saveAsCsv(final String str, final String str2) {
        if (n) {
            j(new Runnable() { // from class: c51
                @Override // java.lang.Runnable
                public final void run() {
                    DefLogClient.i(str, str2);
                }
            });
        }
    }

    public static void setLogFileMaxSize(int i2) {
        p = i2;
    }

    public static void warn(String str, String str2) {
        int i2 = m;
        if (i2 <= a || i2 >= d) {
            return;
        }
        Log.w(str, d() + str2);
    }

    private static void f() {
        File[] fileArrListFiles = new File(l + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE).listFiles(new FilenameFilter() { // from class: b51
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return DefLogClient.g(file, str);
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length <= 10) {
            return;
        }
        for (File file : fileArrListFiles) {
            file.delete();
        }
    }
}
