package com.xiaomi.fit.data.common.log;

import android.support.v4.media.session.PlaybackStateCompat;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.log.Logger;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007J \u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007J \u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007J \u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007J\u001e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fit/data/common/log/FitnessLogUtils;", "", "<init>", "()V", "PATTERN_MSG", "", "TAG", "FILETAG", "FAMATE", "DebugFileSize", "", "UserFileSize", "v", "", "tag", "message", PluginDeviceInfo.FICONOFF, "tr", "", "i", PluginDeviceInfo.FICONOFFLINE, Constants.DEVICE_TYPE_WEAR, "generateXLogMsg", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessLogUtils {

    @NotNull
    public static final FitnessLogUtils INSTANCE = new FitnessLogUtils();

    @NotNull
    private static final String PATTERN_MSG = "[%s] %s";

    @NotNull
    private static final String TAG = "fitness";

    @NotNull
    private static final String FILETAG = "fitness";

    @NotNull
    private static final String FAMATE = "%s|%s|%s|%s|%s";
    private static final long DebugFileSize = 10485760;
    private static final long UserFileSize = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;

    private FitnessLogUtils() {
    }

    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger.d(TAG, INSTANCE.generateXLogMsg(tag, message));
    }

    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger.e(TAG, INSTANCE.generateXLogMsg(tag, message));
    }

    private final String generateXLogMsg(String tag, String message) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(PATTERN_MSG, Arrays.copyOf(new Object[]{tag, message}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @JvmStatic
    public static final void i(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger.i(TAG, INSTANCE.generateXLogMsg(tag, message));
    }

    @JvmStatic
    public static final void w(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger.w(TAG, INSTANCE.generateXLogMsg(tag, message));
    }

    public final void v(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger.INSTANCE.v(TAG, generateXLogMsg(tag, message));
    }

    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull String message, @NotNull Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tr, "tr");
        Logger.d(TAG, INSTANCE.generateXLogMsg(tag, message), tr);
    }

    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull String message, @NotNull Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tr, "tr");
        Logger.e(TAG, INSTANCE.generateXLogMsg(tag, message), tr);
    }

    @JvmStatic
    public static final void i(@NotNull String tag, @NotNull String message, @NotNull Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tr, "tr");
        Logger.i(TAG, INSTANCE.generateXLogMsg(tag, message), tr);
    }

    public final void w(@NotNull String tag, @NotNull String message, @NotNull Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tr, "tr");
        Logger.w(TAG, generateXLogMsg(tag, message), tr);
    }
}
