package com.xiaomi.smarthome.library.log.logbuffer;

import com.xiaomi.smarthome.library.common.util.ListCache;
import com.xiaomi.smarthome.library.log.LogType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/smarthome/library/log/logbuffer/LoginLogBuffer;", "Lcom/xiaomi/smarthome/library/log/logbuffer/ILogBuffer;", "()V", "listCache", "Lcom/xiaomi/smarthome/library/common/util/ListCache;", "", "sdf", "Ljava/text/SimpleDateFormat;", "getSdf", "()Ljava/text/SimpleDateFormat;", "setSdf", "(Ljava/text/SimpleDateFormat;)V", "dump", "getLogType", "Lcom/xiaomi/smarthome/library/log/LogType;", "writeLog", "", "logType", "", "subType", "logTag", "message", "smarthome-log-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LoginLogBuffer implements ILogBuffer {

    @NotNull
    private final ListCache<String> listCache = new ListCache<>(50);

    @NotNull
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    @Override // com.xiaomi.smarthome.library.log.logbuffer.ILogBuffer
    @NotNull
    public String dump() {
        List<String> list = this.listCache.toList();
        Intrinsics.checkNotNullExpressionValue(list, "listCache.toList()");
        return CollectionsKt___CollectionsKt.joinToString$default(list, "\n", null, null, 0, null, null, 62, null);
    }

    @Override // com.xiaomi.smarthome.library.log.logbuffer.ILogBuffer
    @NotNull
    public LogType getLogType() {
        return LogType.LOGIN;
    }

    @NotNull
    public final SimpleDateFormat getSdf() {
        return this.sdf;
    }

    public final void setSdf(@NotNull SimpleDateFormat simpleDateFormat) {
        Intrinsics.checkNotNullParameter(simpleDateFormat, "<set-?>");
        this.sdf = simpleDateFormat;
    }

    @Override // com.xiaomi.smarthome.library.log.logbuffer.ILogBuffer
    public synchronized void writeLog(int logType, @Nullable String subType, @Nullable String logTag, @Nullable String message) {
        this.listCache.add(((Object) this.sdf.format(new Date(System.currentTimeMillis()))) + ' ' + ((Object) logTag) + ": " + ((Object) message));
    }
}
