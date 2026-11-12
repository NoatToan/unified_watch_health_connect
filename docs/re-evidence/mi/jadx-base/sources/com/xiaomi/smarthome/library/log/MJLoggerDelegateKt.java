package com.xiaomi.smarthome.library.log;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"DISABLE_ALL", "", "ENABLE_ALL", "LEVEL_ALL", "LEVEL_GREY", "LEVEL_RAW", "logger", "Lkotlin/Lazy;", "Lcom/xiaomi/smarthome/library/log/MJLogWrapper;", "type", "Lcom/xiaomi/smarthome/library/log/LogType;", "tag", "", "level", "smarthome-log-base_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class MJLoggerDelegateKt {
    public static final int DISABLE_ALL = 0;
    public static final int ENABLE_ALL = 7;
    public static final int LEVEL_ALL = 1;
    public static final int LEVEL_GREY = 2;
    public static final int LEVEL_RAW = 4;

    @NotNull
    public static final Lazy<MJLogWrapper> logger(@NotNull LogType type, @NotNull String tag, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new LoggerLazy(type, tag, i);
    }

    public static /* synthetic */ Lazy logger$default(LogType logType, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 7;
        }
        return logger(logType, str, i);
    }
}
