package com.xiaomi.fitness.component;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.log.Logger;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005J\u0018\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0005J\u0016\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/component/DebugUtils;", "", "<init>", "()V", "TAG_APP_COMP", "", "LOG_ENABLE", "", "sTimingMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/StringBuffer;", "log", "", "msg", "warn", "err", PluginDeviceInfo.FICONOFFLINE, "", "newTimingLogger", "label", "split", "dumpLog", "release", "component-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DebugUtils {

    @NotNull
    public static final DebugUtils INSTANCE = new DebugUtils();
    private static final boolean LOG_ENABLE = true;

    @NotNull
    public static final String TAG_APP_COMP = "miuix-app-comp";

    @Nullable
    private static ConcurrentHashMap<String, StringBuffer> sTimingMap;

    private DebugUtils() {
    }

    public final void dumpLog(@NotNull String label, boolean release) {
        Intrinsics.checkNotNullParameter(label, "label");
        if (LOG_ENABLE) {
            ConcurrentHashMap<String, StringBuffer> concurrentHashMap = sTimingMap;
            Intrinsics.checkNotNull(concurrentHashMap);
            StringBuffer stringBuffer = concurrentHashMap.get(label);
            if (stringBuffer == null) {
                return;
            }
            String string = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Logger.i(TAG_APP_COMP, string);
            ConcurrentHashMap<String, StringBuffer> concurrentHashMap2 = sTimingMap;
            Intrinsics.checkNotNull(concurrentHashMap2);
            concurrentHashMap2.remove(label);
        }
    }

    public final void err(@Nullable Throwable e, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public final void log(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public final void newTimingLogger(@NotNull String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        if (LOG_ENABLE) {
            if (sTimingMap == null) {
                sTimingMap = new ConcurrentHashMap<>();
            }
            ConcurrentHashMap<String, StringBuffer> concurrentHashMap = sTimingMap;
            Intrinsics.checkNotNull(concurrentHashMap);
            if (concurrentHashMap.get(label) == null) {
                StringBuffer stringBuffer = new StringBuffer(TAG_APP_COMP);
                stringBuffer.append(":" + label);
                ConcurrentHashMap<String, StringBuffer> concurrentHashMap2 = sTimingMap;
                Intrinsics.checkNotNull(concurrentHashMap2);
                concurrentHashMap2.put(label, stringBuffer);
            }
        }
    }

    public final void split(@NotNull String label, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (LOG_ENABLE) {
            ConcurrentHashMap<String, StringBuffer> concurrentHashMap = sTimingMap;
            Intrinsics.checkNotNull(concurrentHashMap);
            StringBuffer stringBuffer = concurrentHashMap.get(label);
            if (stringBuffer == null) {
                return;
            }
            stringBuffer.append(msg);
            stringBuffer.append("\n\r");
        }
    }

    public final void warn(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}
