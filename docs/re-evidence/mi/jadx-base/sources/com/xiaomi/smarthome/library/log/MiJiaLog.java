package com.xiaomi.smarthome.library.log;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.smarthome.library.log.logbuffer.ILogBuffer;
import com.xiaomi.smarthome.library.log.logbuffer.LoginLogBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class MiJiaLog {
    public static final String ACTION_LOGRELEASE = "mijia_log_greydeveloper";
    private static final int CPU_COUNT;
    private static final ThreadPoolExecutor DEFAULT_THREAD_POOL_EXECUTOR;
    public static final String EXTRA_SHOWLOG = "showlog";
    private static final int MAX_CACHE_SIZE = 200;
    private static final int MAX_LOG_SIZE = 2000;
    private static final String TAG = "MiJiaLog";
    private static final Object sLock;
    private static Map<LogType, ILogBuffer> sLogBufferMap;
    private static List<LogCache> sLogCacheList;
    private static volatile MiJiaLogAdapter sMiJiaLogAdapter;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        DEFAULT_THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(Math.max(5, iAvailableProcessors), Math.max(5, iAvailableProcessors), 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(128), Executors.defaultThreadFactory());
        sMiJiaLogAdapter = null;
        sLock = new Object();
        sLogCacheList = new ArrayList();
        sLogBufferMap = new HashMap();
    }

    public static String dumpBufferedLog(LogType logType) {
        ILogBuffer iLogBuffer = sLogBufferMap.get(logType);
        if (iLogBuffer == null) {
            return null;
        }
        return iLogBuffer.dump();
    }

    public static void flushLog() {
        if (sMiJiaLogAdapter == null) {
            return;
        }
        sMiJiaLogAdapter.flushLog();
    }

    private static String getValidTag(String str) {
        if (TextUtils.isEmpty(str)) {
            return TAG;
        }
        return str.length() > 23 ? str.substring(0, 23) : str;
    }

    public static int onlyLogcat(String str, String str2) {
        return onlyLogcat(3, str, str2);
    }

    private static int printInternal(int i, String str, String str2) {
        if (i == 2) {
            return Log.v(str, str2);
        }
        if (i == 3) {
            return Log.d(str, str2);
        }
        if (i == 4) {
            return Log.i(str, str2);
        }
        if (i == 5) {
            return Log.w(str, str2);
        }
        if (i != 6) {
            return 0;
        }
        return Log.e(str, str2);
    }

    public static void printStackTraceString(String str, String str2) {
        if (sMiJiaLogAdapter != null) {
            if (sMiJiaLogAdapter.isDebugBuildType() || sMiJiaLogAdapter.isSdkBuildType()) {
                onlyLogcat(str, str2 + " " + Log.getStackTraceString(new Throwable()));
            }
        }
    }

    public static void setAdapter(MiJiaLogAdapter miJiaLogAdapter) {
        sMiJiaLogAdapter = miJiaLogAdapter;
        DEFAULT_THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.xiaomi.smarthome.library.log.MiJiaLog.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (MiJiaLog.sLock) {
                    try {
                        if (MiJiaLog.sLogCacheList.size() > 0) {
                            for (LogCache logCache : MiJiaLog.sLogCacheList) {
                                String str = "delayTime(" + (System.currentTimeMillis() - logCache.cacheTime) + "ms) " + logCache.message;
                                int i = logCache.cacheType;
                                if (i == 1) {
                                    MiJiaLog.onlyLogcat(logCache.logLevel, logCache.logTag, str);
                                } else if (i == 2) {
                                    MiJiaLog.writeLogOnDebug(logCache.logType, logCache.subType, logCache.logTag, str);
                                } else if (i == 3) {
                                    MiJiaLog.writeLogOnGrey(logCache.logType, logCache.subType, logCache.logTag, str);
                                } else if (i == 4) {
                                    MiJiaLog.writeLogOnAll(logCache.logType, logCache.subType, logCache.logTag, str);
                                }
                            }
                            MiJiaLog.sLogCacheList.clear();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        LoginLogBuffer loginLogBuffer = new LoginLogBuffer();
        sLogBufferMap.put(loginLogBuffer.getLogType(), loginLogBuffer);
    }

    private static void writeLog(LogType logType, String str, int i, String str2, String str3) {
        if (logType == null || LogType.ILLEGAL_TYPE == logType || TextUtils.isEmpty(str3) || sMiJiaLogAdapter == null) {
            return;
        }
        onlyLogcat(i, str2, str3);
        sMiJiaLogAdapter.writeLog(logType.value(), str, str2, str3);
        writeLogBuffer(logType, str, i, str2, str3);
    }

    private static void writeLogBuffer(LogType logType, String str, int i, String str2, String str3) {
        ILogBuffer iLogBuffer = sLogBufferMap.get(logType);
        if (iLogBuffer == null) {
            return;
        }
        iLogBuffer.writeLog(logType.value(), str, str2, str3);
    }

    public static void writeLogForAnalysis(int i, String str, String str2) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("code", str).put("msg", str2);
            writeLogOnAll(LogType.LOG_ANALYSIS, i + "", jSONObjectPut.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeLogOnAll(LogType logType, String str, String str2) {
        writeLogOnAll(logType, "", str, str2);
    }

    public static void writeLogOnDebug(LogType logType, String str, String str2) {
        writeLogOnDebug(logType, "", str, str2);
    }

    public static void writeLogOnGrey(LogType logType, String str, String str2) {
        writeLogOnGrey(logType, "", str, str2);
    }

    public static int onlyLogcat(int i, String str, String str2, boolean z) {
        String str3;
        if (z || TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (sMiJiaLogAdapter == null) {
            synchronized (sLock) {
                try {
                    if (sLogCacheList.size() > 200) {
                        sLogCacheList.clear();
                    }
                    sLogCacheList.add(new LogCache(1, i, str, str2));
                } catch (Throwable th) {
                    throw th;
                }
            }
            return 0;
        }
        if (!sMiJiaLogAdapter.isDebugBuildType() && !sMiJiaLogAdapter.isSdkBuildType()) {
            return 0;
        }
        String validTag = getValidTag(str);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            str3 = "main:";
        } else {
            str3 = Thread.currentThread().getId() + ":";
        }
        int length = 2000 - str3.length();
        if (length >= str2.length()) {
            return printInternal(i, validTag, str3 + str2);
        }
        int iPrintInternal = printInternal(i, validTag, str3 + str2.substring(0, length));
        int length2 = str2.length();
        while (length < length2) {
            int iMin = Math.min(2000, length2 - length) + length;
            int iPrintInternal2 = printInternal(i, validTag, str2.substring(length, iMin));
            length = iMin;
            iPrintInternal = iPrintInternal2;
        }
        return iPrintInternal;
    }

    public static void writeLogOnAll(LogType logType, String str, String str2, String str3) {
        writeLogOnAll(logType, str, 3, str2, str3);
    }

    public static void writeLogOnDebug(LogType logType, String str, String str2, String str3) {
        if (sMiJiaLogAdapter != null) {
            if (sMiJiaLogAdapter.isGreyDeveloperOpen() || sMiJiaLogAdapter.isDebugBuildType() || sMiJiaLogAdapter.isSdkBuildType()) {
                writeLog(logType, str, 3, str2, str3);
                return;
            }
            return;
        }
        synchronized (sLock) {
            try {
                if (sLogCacheList.size() > 200) {
                    sLogCacheList.clear();
                }
                sLogCacheList.add(new LogCache(2, logType, str, str2, str3));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void writeLogOnGrey(LogType logType, String str, String str2, String str3) {
        if (sMiJiaLogAdapter == null) {
            synchronized (sLock) {
                try {
                    if (sLogCacheList.size() > 200) {
                        sLogCacheList.clear();
                    }
                    sLogCacheList.add(new LogCache(3, logType, str, str2, str3));
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (sMiJiaLogAdapter.isGreyDeveloperOpen() || sMiJiaLogAdapter.isDebugBuildType() || sMiJiaLogAdapter.isSdkBuildType() || sMiJiaLogAdapter.isGreyPublish() || sMiJiaLogAdapter.isDevChannel()) {
            writeLog(logType, str, 3, str2, str3);
        }
    }

    public static void writeLogOnAll(LogType logType, String str, int i, String str2, String str3) {
        if (sMiJiaLogAdapter == null) {
            synchronized (sLock) {
                try {
                    if (sLogCacheList.size() > 200) {
                        sLogCacheList.clear();
                    }
                    sLogCacheList.add(new LogCache(4, logType, str, str2, str3));
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        writeLog(logType, str, i, str2, str3);
    }

    public static int onlyLogcat(int i, String str, String str2) {
        return onlyLogcat(i, str, str2, false);
    }
}
