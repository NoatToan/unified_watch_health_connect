package com.xiaomi.fitness.active.pk.util;

import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\fJ3\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\fJ\u001e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J3\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\fJ\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/active/pk/util/PkLogger;", "", "<init>", "()V", "TAG", "", PluginDeviceInfo.FICONOFF, "", "childTag", "msg", "args", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "i", Constants.DEVICE_TYPE_WEAR, PluginDeviceInfo.FICONOFFLINE, "", "getFormatMessage", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PkLogger {

    @NotNull
    public static final PkLogger INSTANCE = new PkLogger();

    @NotNull
    private static final String TAG = "ActivePk";

    private PkLogger() {
    }

    private final String getFormatMessage(String childTag, String msg) {
        return childTag + "-" + msg;
    }

    public final void d(@NotNull String childTag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(childTag, "childTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        Logger.d(TAG, getFormatMessage(childTag, msg), args);
    }

    public final void e(@NotNull String childTag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(childTag, "childTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        Logger.e(TAG, getFormatMessage(childTag, msg), args);
    }

    public final void i(@NotNull String childTag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(childTag, "childTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        Logger.i(TAG, getFormatMessage(childTag, msg), args);
    }

    public final void w(@NotNull String childTag, @NotNull String msg, @NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(childTag, "childTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(e, "e");
        Logger.w(TAG, getFormatMessage(childTag, msg), e);
    }
}
