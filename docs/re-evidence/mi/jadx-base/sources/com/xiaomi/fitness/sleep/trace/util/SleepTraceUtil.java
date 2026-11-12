package com.xiaomi.fitness.sleep.trace.util;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sleep.trace.SleepTraceConfiguration;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u000bJ-\u0010\f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u000bJ7\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/util/SleepTraceUtil;", "", "<init>", "()V", "SLEEP_TRACE", "", "sleepTrace", "", "msg", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "debugSleepTrace", "throwIfDebug", PluginDeviceInfo.FICONOFFLINE, "Ljava/lang/Exception;", "(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V", "getUTCTimestamp", "", "elapsedNano", "isLoggable", "", "()Z", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepTraceUtil {

    @NotNull
    public static final SleepTraceUtil INSTANCE = new SleepTraceUtil();

    @NotNull
    private static final String SLEEP_TRACE = "sleep_trace";

    private SleepTraceUtil() {
    }

    public final void debugSleepTrace(@Nullable String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(msg);
        spreadBuilder.addSpread(args);
        Logger.d(SLEEP_TRACE, spreadBuilder.toArray(new Object[spreadBuilder.size()]));
    }

    public final long getUTCTimestamp(long elapsedNano) {
        return (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + TimeUnit.NANOSECONDS.toMillis(elapsedNano);
    }

    public final boolean isLoggable() {
        return Log.isLoggable(SLEEP_TRACE, 3);
    }

    public final void sleepTrace(@NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        LogExtKt.logi(msg);
    }

    public final void throwIfDebug(@Nullable Exception e, @Nullable String msg, @NotNull Object... args) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(args, "args");
        if (TextUtils.isEmpty(msg)) {
            strValueOf = String.valueOf(e);
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Intrinsics.checkNotNull(msg);
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(msg, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            strValueOf = str + " " + e;
        }
        if (SleepTraceConfiguration.INSTANCE.isDebugMode()) {
            throw new IllegalStateException(strValueOf, e);
        }
        Logger.e(SLEEP_TRACE, strValueOf, e);
    }
}
