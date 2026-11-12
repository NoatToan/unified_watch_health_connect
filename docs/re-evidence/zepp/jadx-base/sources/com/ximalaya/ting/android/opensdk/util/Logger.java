package com.ximalaya.ting.android.opensdk.util;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.ximalaya.ting.android.opensdk.constants.ConstantsOpenSdk;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
public class Logger {
    public static String CACHE_DIR = "";
    public static final String JSON_ERROR = "解析json异常";
    public static String LOG_UPLOAD_FILE = "upload_log_file";
    public static boolean UPLOADING = false;
    private static SimpleDateFormat dateformat;
    public static String ERROR_LOG_PATH = Environment.getExternalStorageDirectory() + "/ting/errorLog/infor.log";
    public static Map<String, String> map = new HashMap();
    private static long nowTime = System.currentTimeMillis();
    private static int LOG_LEVEL = 0;

    /* JADX INFO: Removed unreachable split cross block B:79:0x00d9 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.FileReader] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.FileReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.FileReader] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    static {
        String externalStorageState;
        String[] strArrSplit;
        map.clear();
        ?? line = 0;
        line = 0;
        line = 0;
        line = 0;
        line = 0;
        try {
            externalStorageState = Environment.getExternalStorageState();
        } catch (Exception e) {
            e.printStackTrace();
            externalStorageState = null;
        }
        if (externalStorageState.equals("mounted")) {
            String str = Environment.getExternalStorageDirectory() + "/ting/config.ini";
            if (!TextUtils.isEmpty(str)) {
                ?? Exists = new File(str).exists();
                try {
                    try {
                        if (Exists != 0) {
                            try {
                                Exists = new FileReader(str);
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(Exists);
                                    while (true) {
                                        try {
                                            line = bufferedReader.readLine();
                                            if (line == 0) {
                                                try {
                                                    break;
                                                } catch (IOException e2) {
                                                    e2.printStackTrace();
                                                }
                                            } else if (!TextUtils.isEmpty(line) && (strArrSplit = line.split(SearchCriteria.EQ)) != null && strArrSplit.length == 2) {
                                                map.put(strArrSplit[0], strArrSplit[1]);
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            line = bufferedReader;
                                            e.printStackTrace();
                                            if (line != 0) {
                                                try {
                                                    line.close();
                                                } catch (IOException e4) {
                                                    e4.printStackTrace();
                                                }
                                            }
                                            if (Exists != 0) {
                                                Exists.close();
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            line = bufferedReader;
                                            if (line != 0) {
                                                try {
                                                    line.close();
                                                } catch (IOException e5) {
                                                    e5.printStackTrace();
                                                }
                                            }
                                            if (Exists == 0) {
                                                throw th;
                                            }
                                            try {
                                                Exists.close();
                                                throw th;
                                            } catch (IOException e6) {
                                                e6.printStackTrace();
                                                throw th;
                                            }
                                        }
                                    }
                                    bufferedReader.close();
                                    Exists.close();
                                } catch (Exception e7) {
                                    e = e7;
                                }
                            } catch (Exception e8) {
                                e = e8;
                                Exists = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                Exists = 0;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
        }
        dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public static boolean checkIfLog(String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.contains(entry.getKey()) && entry.getValue().equals("true")) {
                return true;
            }
        }
        return false;
    }

    public static void d(String str, String str2) {
        if (str2 == null || !isLoggable(str, 3)) {
            return;
        }
        Log.d(str, str2);
    }

    public static void e(Exception exc) {
        e("解析json异常", "解析json异常" + exc.getMessage() + getLineInfo());
    }

    public static String getCacheDir(Context context) {
        String path = context.getCacheDir().getPath();
        CACHE_DIR = path;
        return path;
    }

    public static String getLineInfo() {
        if (!ConstantsOpenSdk.isDebug) {
            return "";
        }
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return "@" + stackTraceElement.getFileName() + ": Line " + stackTraceElement.getLineNumber();
    }

    public static File getLogFilePath() {
        if (TextUtils.isEmpty(ERROR_LOG_PATH)) {
            return null;
        }
        File file = new File(ERROR_LOG_PATH);
        if (!file.exists()) {
            try {
                file.getParentFile().mkdirs();
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    public static void i(String str, String str2) {
        if (str2 == null || !isLoggable(str, 4)) {
            return;
        }
        Log.i(str, str2);
    }

    public static void init(Context context) {
        if (context == null || context.getExternalFilesDir("") == null) {
            return;
        }
        ERROR_LOG_PATH = context.getExternalFilesDir("") + "/errorLog/infor.log";
    }

    public static boolean isLoggable(String str, int i) {
        return ConstantsOpenSdk.isDebug && i >= LOG_LEVEL;
    }

    public static void log(Object obj) {
        if (ConstantsOpenSdk.isDebug) {
            Log.i("openTingSDK", obj + "");
        }
    }

    public static void logFuncRunTime(String str) {
        log("time " + str + ":" + (System.currentTimeMillis() - nowTime));
        nowTime = System.currentTimeMillis();
    }

    public static void logFuncRunTimeReset(String str) {
        log(str);
        nowTime = System.currentTimeMillis();
    }

    public static void logListToSD(List list, String str) {
        if (list == null || list.size() == 0) {
            return;
        }
        logToSd("start-log-list:" + str + ":size:" + list.size());
        for (Object obj : list) {
            if (obj != null) {
                logToSd(obj.toString());
            }
        }
        logToSd("end-log-list" + str);
    }

    public static void logToFile(String str) {
        if (!ConstantsOpenSdk.isLogToFile || TextUtils.isEmpty(str) || TextUtils.isEmpty(CACHE_DIR) || UPLOADING) {
            return;
        }
        logToSd(str, new File(CACHE_DIR, LOG_UPLOAD_FILE));
    }

    public static void logToSd(String str, File file) {
        if (file == null) {
            return;
        }
        PrintWriter printWriter = null;
        try {
            String str2 = dateformat.format(Long.valueOf(System.currentTimeMillis()));
            PrintWriter printWriter2 = new PrintWriter(new FileWriter(file, true));
            try {
                printWriter2.println(str + "  time:" + str2);
                printWriter2.close();
            } catch (Throwable unused) {
                printWriter = printWriter2;
                if (printWriter != null) {
                    printWriter.close();
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public static void setDebugLevel(int i) {
        LOG_LEVEL = i;
    }

    public static void throwRuntimeException(Object obj) {
        if (ConstantsOpenSdk.isDebug) {
            throw new RuntimeException("出现异常：" + obj);
        }
    }

    public static void v(String str, String str2) {
        if (str2 == null || !isLoggable(str, 2)) {
            return;
        }
        Log.v(str, str2);
    }

    public static void w(String str, String str2) {
        if (str2 == null || !isLoggable(str, 5)) {
            return;
        }
        Log.w(str, str2);
    }

    public static void e(String str, String str2) {
        if (str2 == null || !isLoggable(str, 6)) {
            return;
        }
        Log.e(str, str2);
    }

    public static void d(String str, String str2, Throwable th) {
        if (str2 == null || !isLoggable(str, 3)) {
            return;
        }
        Log.d(str, str2, th);
    }

    public static void i(String str, String str2, Throwable th) {
        if (str2 == null || !isLoggable(str, 4)) {
            return;
        }
        Log.i(str, str2, th);
    }

    public static void log(String str, String str2, boolean z) {
        if (str2 == null || !isLoggable(str, 3)) {
            return;
        }
        Log.d(str, str2);
    }

    public static void v(String str, String str2, Throwable th) {
        if (str2 == null || !isLoggable(str, 2)) {
            return;
        }
        Log.v(str, str2, th);
    }

    public static void w(String str, String str2, Throwable th) {
        if (str2 == null || !isLoggable(str, 5)) {
            return;
        }
        Log.w(str, str2, th);
    }

    public static void e(String str, String str2, Throwable th) {
        if (str2 == null || !isLoggable(str, 6)) {
            return;
        }
        Log.e(str, str2, th);
    }

    public static void logToSd(String str) {
        if (ConstantsOpenSdk.isDebug) {
            log(str);
            File logFilePath = getLogFilePath();
            if (logFilePath == null) {
                return;
            }
            logToSd(str, logFilePath);
        }
    }

    public static void w(String str, Throwable th) {
        if (th == null || !isLoggable(str, 5)) {
            return;
        }
        Log.w(str, th);
    }
}
