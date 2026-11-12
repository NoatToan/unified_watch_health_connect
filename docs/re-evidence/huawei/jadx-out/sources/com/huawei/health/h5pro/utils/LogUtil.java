package com.huawei.health.h5pro.utils;

import android.content.Context;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class LogUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Handler f6997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HandlerThread f6998c;
    private static LinkedHashMap<String, LogLevel> e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f6996a = new Object();
    private static final List<String> j = Collections.synchronizedList(new ArrayList());
    private static volatile boolean i = false;
    private static File f = null;
    private static File g = null;
    private static SimpleDateFormat h = null;
    private static ArrayDeque<StringBuilder> d = null;

    private LogUtil() {
    }

    public static void d(String str, String... strArr) {
        d(str, false, strArr);
    }

    public static void d(String str, boolean z, String... strArr) {
        e(z, LogLevel.DEBUG, str, strArr);
    }

    public static void i(String str, String... strArr) {
        i(str, false, strArr);
    }

    public static void i(String str, boolean z, String... strArr) {
        e(z, LogLevel.INFO, str, strArr);
    }

    public static void w(String str, String... strArr) {
        w(str, false, strArr);
    }

    public static void w(String str, boolean z, String... strArr) {
        e(z, LogLevel.WARN, str, strArr);
    }

    public static void e(String str, boolean z, Throwable th, String... strArr) {
        a(z, LogLevel.ERROR, str, th, strArr);
    }

    public static void e(String str, Throwable th, String... strArr) {
        e(str, false, th, strArr);
    }

    public static void e(String str, String str2, Throwable th) {
        e(str, th, str2);
    }

    public static void e(String str, String... strArr) {
        e(str, (Throwable) null, strArr);
    }

    public static String getTag(H5ProInstance h5ProInstance, String str) {
        return getTag(h5ProInstance != null ? h5ProInstance.getAppFlag() : "", str);
    }

    public static String getTag(String str, String str2) {
        return String.format(Locale.ROOT, "H5PRO_%1$s[%2$s]", str2, str);
    }

    private static void e(boolean z, LogLevel logLevel, String str, String... strArr) {
        a(z, logLevel, str, null, strArr);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    private static void a(boolean z, LogLevel logLevel, String str, Throwable th, String... strArr) {
        boolean z2;
        synchronized (f6996a) {
            boolean z3 = false;
            if (strArr != null) {
                try {
                    if (strArr.length > 0) {
                        String str2 = strArr[0];
                        z2 = str2 != null && str2.startsWith("[RELEASE]");
                        if (z2) {
                            strArr[0] = str2.substring(9);
                            str = str + "[R]";
                        }
                    } else {
                        z2 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                z2 = false;
            }
            if (i || z2) {
                LinkedHashMap<String, LogLevel> linkedHashMap = e;
                if (linkedHashMap == null || linkedHashMap.get(logLevel.level) == null) {
                    if (i || (z2 && z)) {
                        z3 = true;
                    }
                    StringBuilder sbB = b(z3, th, strArr);
                    if (logLevel == LogLevel.VERBOSE) {
                        Log.v(str, sbB.toString());
                    } else if (logLevel == LogLevel.DEBUG) {
                        Log.d(str, sbB.toString());
                    } else if (logLevel == LogLevel.INFO) {
                        Log.i(str, sbB.toString());
                    } else if (logLevel == LogLevel.WARN) {
                        Log.w(str, sbB.toString());
                    } else if (logLevel == LogLevel.ERROR) {
                        Log.e(str, sbB.toString());
                    }
                    a(logLevel, str, sbB);
                }
            }
        }
    }

    private static StringBuilder b(boolean z, Throwable th, String... strArr) {
        StringBuilder sb = new StringBuilder();
        if (strArr == null) {
            sb.append("messages: null");
            sb.append(System.getProperty("line.separator"));
        } else {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String strEncodingLog = strArr[i2];
                if (strEncodingLog == null) {
                    sb.append("index: ");
                    sb.append(i2);
                    sb.append(" - value：null");
                } else {
                    if (!z) {
                        strEncodingLog = LogPrintOperate.encodingLog(strEncodingLog);
                    }
                    sb.append(strEncodingLog);
                }
                sb.append(System.getProperty("line.separator"));
            }
        }
        if (th != null) {
            sb.append(th.getMessage());
            sb.append(System.getProperty("line.separator"));
        }
        return sb;
    }

    private static void a(LogLevel logLevel, String str, StringBuilder sb) {
        if (d == null) {
            d = new ArrayDeque<>(20);
        }
        sb.insert(0, "  ");
        sb.insert(0, str);
        sb.insert(0, "  ");
        sb.insert(0, logLevel.level);
        sb.insert(0, "  ");
        sb.insert(0, Binder.getCallingPid());
        sb.insert(0, "  ");
        SimpleDateFormat simpleDateFormat = h;
        sb.insert(0, simpleDateFormat == null ? "" : simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())));
        d.add(sb);
        if (d.size() >= 20) {
            a();
        }
    }

    private static void a() {
        ArrayDeque<StringBuilder> arrayDeque = d;
        if (arrayDeque == null || arrayDeque.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder(d.size());
        Iterator<StringBuilder> it = d.iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        d.clear();
        d(sb);
    }

    public static void logCacheFlushing() {
        synchronized (f6996a) {
            a();
            HandlerThread handlerThread = f6998c;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                f6998c = null;
                f6997b = null;
            }
        }
    }

    private static void d(final StringBuilder sb) {
        if (g == null) {
            return;
        }
        d();
        f6997b.post(new Runnable() { // from class: com.huawei.health.h5pro.utils.LogUtil.4
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.b();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(LogUtil.g, true);
                    try {
                        fileOutputStream.write(sb.toString().getBytes(StandardCharsets.UTF_8));
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                }
            }
        });
    }

    private static void d() {
        if (f6998c == null) {
            HandlerThread handlerThread = new HandlerThread("h5proFilePrintThread");
            f6998c = handlerThread;
            handlerThread.start();
        }
        if (f6997b == null) {
            f6997b = new Handler(f6998c.getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        if (g == null || f == null || j.isEmpty()) {
            return;
        }
        try {
            if (g.exists()) {
                return;
            }
            if (!f.exists()) {
                f.mkdirs();
            }
            File[] fileArrListFiles = f.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 1) {
                for (File file : fileArrListFiles) {
                    if (!j.contains(file.getName())) {
                        file.delete();
                    }
                }
            }
            g.createNewFile();
        } catch (IOException unused) {
        }
    }

    public static void setPrintAble(boolean z) {
        if (z == i) {
            return;
        }
        i = z;
    }

    public static boolean isPrint() {
        return i;
    }

    public static void setDisableLogLevel(LogLevel... logLevelArr) {
        LinkedHashMap<String, LogLevel> linkedHashMap = e;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
        if (logLevelArr == null || logLevelArr.length <= 0) {
            return;
        }
        if (e == null) {
            e = new LinkedHashMap<>();
        }
        for (LogLevel logLevel : logLevelArr) {
            if (logLevel != null) {
                e.put(logLevel.level, logLevel);
            }
        }
    }

    public static void init(Context context) {
        if (context == null) {
            Log.w("H5PRO_LogUtil", "context is null");
            return;
        }
        h = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ROOT);
        String packageName = context.getPackageName();
        if (EnvironmentHelper.getInstance().getBuildType() == EnvironmentHelper.BuildType.RELEASE) {
            f = new File(context.getFilesDir(), String.format(Locale.ENGLISH, "%s/%s.h5pro", packageName, packageName));
        } else {
            f = context.getExternalFilesDir(String.format(Locale.ENGLISH, "huaweisystem/%s/%s.h5pro", packageName, packageName));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd", Locale.ROOT);
        long jCurrentTimeMillis = System.currentTimeMillis();
        g = new File(f, String.format(Locale.ENGLISH, "%s.log", simpleDateFormat.format(Long.valueOf(jCurrentTimeMillis))));
        List<String> list = j;
        list.clear();
        list.add(String.format(Locale.ENGLISH, "%s.log", simpleDateFormat.format(Long.valueOf(jCurrentTimeMillis - 86400000))));
        list.add(String.format(Locale.ENGLISH, "%s.log", simpleDateFormat.format(Long.valueOf(jCurrentTimeMillis - com.huawei.openalliance.ad.constant.Constants.ANALYSIS_EVENT_KEEP_TIME))));
    }

    /* JADX INFO: loaded from: classes7.dex */
    public enum LogLevel {
        VERBOSE(ExifInterface.GPS_MEASUREMENT_INTERRUPTED),
        DEBUG("D"),
        INFO("I"),
        WARN("W"),
        ERROR(ExifInterface.LONGITUDE_EAST);

        private final String level;

        LogLevel(String str) {
            this.level = str;
        }
    }
}
