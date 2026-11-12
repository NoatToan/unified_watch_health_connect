package com.huami.step.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\"\u001c\u0010\u0005\u001a\u00020\u00008\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001c\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001c\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n\"\u001c\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"", "a", "Ljava/lang/String;", "getSTEP_GAME_ENABLE", "()Ljava/lang/String;", "STEP_GAME_ENABLE", "", "b", LogUtil.I, "getSTEP_GAME_STATUS_NOSTART", "()I", "STEP_GAME_STATUS_NOSTART", "c", "getSTEP_GAME_STATUS_ING", "STEP_GAME_STATUS_ING", GoogleApiAvailabilityLight.a, "getSTEP_GAME_STATUS_END", "STEP_GAME_STATUS_END", "step_release"}, k = 2, mv = {1, 5, 1})
public final class StepGameConstKt {

    @NotNull
    private static final String a = "STEP_GAME_ENABLE";
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;

    @NotNull
    public static final String getSTEP_GAME_ENABLE() {
        return a;
    }

    public static final int getSTEP_GAME_STATUS_END() {
        return d;
    }

    public static final int getSTEP_GAME_STATUS_ING() {
        return c;
    }

    public static final int getSTEP_GAME_STATUS_NOSTART() {
        return b;
    }
}
