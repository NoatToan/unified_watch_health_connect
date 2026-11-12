package com.xiaomi.smarthome.library.log;

/* JADX INFO: loaded from: classes2.dex */
public class LogCache {
    public static final int CACHE_TYPE_ONLY_LOGCAT = 1;
    public static final int CACHE_TYPE_WRITE_LOG_ON_ALL = 4;
    public static final int CACHE_TYPE_WRITE_LOG_ON_DEBUG = 2;
    public static final int CACHE_TYPE_WRITE_LOG_ON_GREY = 3;
    public long cacheTime = System.currentTimeMillis();
    public int cacheType;
    public int logLevel;
    public String logTag;
    public LogType logType;
    public String message;
    public String subType;

    public LogCache(int i, int i2, String str, String str2) {
        this.cacheType = i;
        this.logLevel = i2;
        this.logTag = str;
        this.message = str2;
    }

    public LogCache(int i, LogType logType, String str, String str2, String str3) {
        this.cacheType = i;
        this.logType = logType;
        this.subType = str;
        this.logTag = str2;
        this.message = str3;
    }
}
