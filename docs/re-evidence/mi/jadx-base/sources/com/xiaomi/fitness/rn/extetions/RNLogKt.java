package com.xiaomi.fitness.rn.extetions;

import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"RN_TAG", "", "logi", "", "msg", "subTag", "loge", "sdk_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RNLogKt {

    @NotNull
    private static final String RN_TAG = "rn";

    public static final void loge(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.e("rn", msg);
    }

    public static final void logi(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.i("rn", msg);
    }

    public static final void loge(@NotNull String subTag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.e("rn: " + subTag, msg);
    }

    public static final void logi(@NotNull String subTag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.i("rn: " + subTag, msg);
    }
}
