package com.airoha.android.lib.util.logger;

/* JADX INFO: loaded from: classes2.dex */
public class LogEvent {
    public static final int LOG_DUMP = 2;
    public static final int LOG_RAW = 1;
    public static final int LOG_STRING_WITH_TIMESTAMP = 0;
    public Boolean isOutputToFile;
    public Boolean isOutputToLogi;
    public String logName;
    public byte[] logRaw;
    public String logStr;
    public int logType;
    public String tag;
}
