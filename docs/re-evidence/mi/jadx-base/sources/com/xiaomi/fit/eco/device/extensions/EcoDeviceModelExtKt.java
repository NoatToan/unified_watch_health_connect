package com.xiaomi.fit.eco.device.extensions;

import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u001a\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"DEVICE_MODEL_TAG", "", "logi", "", "msg", "subTag", "logd", "loge", "throwable", "", "eco-device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoDeviceModelExtKt {

    @NotNull
    private static final String DEVICE_MODEL_TAG = "EcoDeviceModel";

    public static final void logd(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.d(DEVICE_MODEL_TAG, msg);
    }

    public static final void loge(@NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.e(DEVICE_MODEL_TAG, msg, th);
    }

    public static /* synthetic */ void loge$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        loge(str, th);
    }

    public static final void logi(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.i(DEVICE_MODEL_TAG, msg);
    }

    public static final void logd(@NotNull String subTag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.d(DEVICE_MODEL_TAG, subTag + " " + msg);
    }

    public static final void loge(@NotNull String subTag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.e(DEVICE_MODEL_TAG, subTag + " " + msg);
    }

    public static final void logi(@NotNull String subTag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.i(DEVICE_MODEL_TAG, subTag + " " + msg);
    }
}
