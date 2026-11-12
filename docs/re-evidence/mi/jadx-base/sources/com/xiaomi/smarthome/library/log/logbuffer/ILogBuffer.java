package com.xiaomi.smarthome.library.log.logbuffer;

import com.xiaomi.smarthome.library.log.LogType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0003H&¨\u0006\r"}, d2 = {"Lcom/xiaomi/smarthome/library/log/logbuffer/ILogBuffer;", "", "dump", "", "getLogType", "Lcom/xiaomi/smarthome/library/log/LogType;", "writeLog", "", "logType", "", "subType", "logTag", "message", "smarthome-log-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ILogBuffer {
    @NotNull
    String dump();

    @NotNull
    LogType getLogType();

    void writeLog(int logType, @Nullable String subType, @Nullable String logTag, @Nullable String message);
}
