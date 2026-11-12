package com.xiaomi.fitness.heartrate.utils;

import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004\u001a\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"TYPE_DETECT_FINGER", "", "TYPE_DETECT_CAMERA", "HEARTRATE_TAG", "", "logi", "", "msg", "loge", "heartrate_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HeartRateExtKt {

    @NotNull
    private static final String HEARTRATE_TAG = "TAG_HEART_RATE";
    public static final int TYPE_DETECT_CAMERA = 2;
    public static final int TYPE_DETECT_FINGER = 1;

    public static final void loge(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.e(AnyExtKt.generateTag(HEARTRATE_TAG), msg);
    }

    public static final void logi(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.i(AnyExtKt.generateTag(HEARTRATE_TAG), msg);
    }
}
