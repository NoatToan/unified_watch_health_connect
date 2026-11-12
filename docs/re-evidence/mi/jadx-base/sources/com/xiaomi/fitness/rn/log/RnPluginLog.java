package com.xiaomi.fitness.rn.log;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u0013\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0005JS\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000526\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\u0016H\u0082\bJ\u000e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0005J\"\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020\u0005J\u0018\u0010 \u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020\u0005J \u0010 \u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0005J\b\u0010\"\u001a\u00020\tH\u0002J\u000e\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0005J\u0010\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010'R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/rn/log/RnPluginLog;", "", "<init>", "()V", "LOG_TAG", "", "MAX_LOG_SIZE", "", "IS_OPEN_RN_DEBUG", "", "initShowLog", "", "isOpenRnDebug", "i", "msg", "tag", PluginDeviceInfo.FICONOFFLINE, "v", PluginDeviceInfo.FICONOFF, Constants.DEVICE_TYPE_WEAR, "log", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "ProcessName", "initProcessName", "processName", "addPluginLog", "logTag", "model", "message", "addFrameworkLog", "logLevel", "showShowLog", "writePluginLog", MiuiCursorConstants.CONTENT, "writePluginProcessLog", "context", "Landroid/content/Context;", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRnPluginLog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnPluginLog.kt\ncom/xiaomi/fitness/rn/log/RnPluginLog\n*L\n1#1,215:1\n105#1,18:216\n105#1,18:234\n105#1,18:252\n105#1,18:270\n105#1,18:288\n*S KotlinDebug\n*F\n+ 1 RnPluginLog.kt\ncom/xiaomi/fitness/rn/log/RnPluginLog\n*L\n37#1:216,18\n54#1:234,18\n71#1:252,18\n85#1:270,18\n99#1:288,18\n*E\n"})
public final class RnPluginLog {
    private static boolean IS_OPEN_RN_DEBUG = false;

    @NotNull
    private static final String LOG_TAG = "rn-plugin";
    private static final int MAX_LOG_SIZE = 2000;

    @NotNull
    public static final RnPluginLog INSTANCE = new RnPluginLog();

    @NotNull
    private static volatile String ProcessName = "";

    private RnPluginLog() {
    }

    private final void log(String tag, String msg, Function2<? super String, ? super String, Unit> block) {
        int length;
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        if (TextUtils.isEmpty(tag)) {
            tag = LOG_TAG;
        }
        if (!showShowLog() || (length = msg.length() / 2000) < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i * 2000;
            int i3 = i + 1;
            int length2 = i3 * 2000;
            if (length2 > msg.length()) {
                length2 = msg.length();
            }
            if (i2 >= length2) {
                i2 = length2 - 1;
            }
            Intrinsics.checkNotNull(tag);
            String strSubstring = msg.substring(i2, length2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            block.invoke(tag, strSubstring);
            if (i == length) {
                return;
            } else {
                i = i3;
            }
        }
    }

    private final boolean showShowLog() {
        return true;
    }

    public final void addFrameworkLog(@Nullable String logTag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        addFrameworkLog(logTag, 3, message);
    }

    public final void addPluginLog(@Nullable String logTag, @Nullable String model, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        TextUtils.isEmpty(message);
    }

    public final void d(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        d(LOG_TAG, msg);
    }

    public final void e(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        e(LOG_TAG, msg);
    }

    public final void i(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        i(LOG_TAG, msg);
    }

    public final void initProcessName(@NotNull String processName) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        ProcessName = processName;
    }

    public final void initShowLog(boolean isOpenRnDebug) {
        IS_OPEN_RN_DEBUG = isOpenRnDebug;
    }

    public final void v(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        v(LOG_TAG, msg);
    }

    public final void w(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        w(LOG_TAG, msg);
    }

    public final void writePluginLog(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (showShowLog()) {
            TextUtils.isEmpty(content);
        }
    }

    public final void writePluginProcessLog(@Nullable Context context) {
        if (showShowLog() && context != null) {
            Object systemService = context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (it.hasNext()) {
                    String str = it.next().processName;
                }
            }
        }
    }

    public final void addFrameworkLog(@Nullable String logTag, int logLevel, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (TextUtils.isEmpty(message)) {
            return;
        }
        Thread.currentThread().getId();
    }

    public final void d(@Nullable String tag, @NotNull String msg) {
        int length;
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        if (TextUtils.isEmpty(tag)) {
            tag = LOG_TAG;
        }
        if (!showShowLog() || (length = msg.length() / 2000) < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i * 2000;
            int i3 = i + 1;
            int length2 = i3 * 2000;
            if (length2 > msg.length()) {
                length2 = msg.length();
            }
            if (i2 >= length2) {
                i2 = length2 - 1;
            }
            Intrinsics.checkNotNull(tag);
            Intrinsics.checkNotNullExpressionValue(msg.substring(i2, length2), "substring(...)");
            if (i == length) {
                return;
            } else {
                i = i3;
            }
        }
    }

    public final void e(@Nullable String tag, @NotNull String msg) {
        int length;
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        if (TextUtils.isEmpty(tag)) {
            tag = LOG_TAG;
        }
        if (!showShowLog() || (length = msg.length() / 2000) < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i * 2000;
            int i3 = i + 1;
            int length2 = i3 * 2000;
            if (length2 > msg.length()) {
                length2 = msg.length();
            }
            if (i2 >= length2) {
                i2 = length2 - 1;
            }
            Intrinsics.checkNotNull(tag);
            Intrinsics.checkNotNullExpressionValue(msg.substring(i2, length2), "substring(...)");
            if (i == length) {
                return;
            } else {
                i = i3;
            }
        }
    }

    public final void i(@Nullable String tag, @NotNull String msg) {
        int length;
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        if (TextUtils.isEmpty(tag)) {
            tag = LOG_TAG;
        }
        if (!showShowLog() || (length = msg.length() / 2000) < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i * 2000;
            int i3 = i + 1;
            int length2 = i3 * 2000;
            if (length2 > msg.length()) {
                length2 = msg.length();
            }
            if (i2 >= length2) {
                i2 = length2 - 1;
            }
            Intrinsics.checkNotNull(tag);
            Intrinsics.checkNotNullExpressionValue(msg.substring(i2, length2), "substring(...)");
            if (i == length) {
                return;
            } else {
                i = i3;
            }
        }
    }

    public final void v(@Nullable String tag, @NotNull String msg) {
        int length;
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        if (TextUtils.isEmpty(tag)) {
            tag = LOG_TAG;
        }
        if (!showShowLog() || (length = msg.length() / 2000) < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i * 2000;
            int i3 = i + 1;
            int length2 = i3 * 2000;
            if (length2 > msg.length()) {
                length2 = msg.length();
            }
            if (i2 >= length2) {
                i2 = length2 - 1;
            }
            Intrinsics.checkNotNull(tag);
            Intrinsics.checkNotNullExpressionValue(msg.substring(i2, length2), "substring(...)");
            if (i == length) {
                return;
            } else {
                i = i3;
            }
        }
    }

    public final void w(@Nullable String tag, @NotNull String msg) {
        int length;
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        if (TextUtils.isEmpty(tag)) {
            tag = LOG_TAG;
        }
        if (!showShowLog() || (length = msg.length() / 2000) < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i * 2000;
            int i3 = i + 1;
            int length2 = i3 * 2000;
            if (length2 > msg.length()) {
                length2 = msg.length();
            }
            if (i2 >= length2) {
                i2 = length2 - 1;
            }
            Intrinsics.checkNotNull(tag);
            Intrinsics.checkNotNullExpressionValue(msg.substring(i2, length2), "substring(...)");
            if (i == length) {
                return;
            } else {
                i = i3;
            }
        }
    }

    public final void addFrameworkLog(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        addFrameworkLog(LOG_TAG, message);
    }
}
