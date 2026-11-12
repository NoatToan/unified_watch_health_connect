package com.xiaomi.fitness.electronic.scale;

import com.xiaomi.fitness.common.log.Logger;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a/\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0002\u0010\t\u001a\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u001a\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a/\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"LOG_TAG", "", "logi", "", "msg", "subTag", "args", "", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "logd", "loge", "throwable", "", "electronic-scale_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OTALogExtKt {

    @NotNull
    private static final String LOG_TAG = "wifiOTA";

    public static final void logd(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.d(LOG_TAG, msg);
    }

    public static final void loge(@NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.e(LOG_TAG, msg, th);
    }

    public static /* synthetic */ void loge$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        loge(str, th);
    }

    public static final void logi(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.i(LOG_TAG, msg);
    }

    public static final void logd(@NotNull String subTag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.d(LOG_TAG, subTag + " " + msg);
    }

    public static final void loge(@NotNull String subTag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.e(LOG_TAG, subTag + " " + msg);
    }

    public static final void logi(@NotNull String subTag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.i(LOG_TAG, subTag + " " + msg);
    }

    public static final void loge(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.e(LOG_TAG, msg);
    }

    public static final void logi(@NotNull String subTag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(msg, Arrays.copyOf(new Object[]{args}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Logger.i(LOG_TAG, subTag + " " + str);
    }

    public static final void loge(@NotNull String subTag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(msg, Arrays.copyOf(new Object[]{args}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Logger.e(LOG_TAG, subTag + " " + str);
    }
}
