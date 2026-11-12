package com.huami.step.utils;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0012\"\u001c\u0010\u0005\u001a\u00020\u00008\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001c\u0010\b\u001a\u00020\u00008\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u001c\u0010\u000b\u001a\u00020\u00008\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001c\u0010\u000e\u001a\u00020\u00008\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004\"\u001c\u0010\u0011\u001a\u00020\u00008\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"", "a", "Ljava/lang/String;", "getHEALTH_STEP_GAME_ENTER_C", "()Ljava/lang/String;", "HEALTH_STEP_GAME_ENTER_C", "b", "getHEALTH_STEP_GAME_ENTER_C_STATE", "HEALTH_STEP_GAME_ENTER_C_STATE", "c", "getHEALTH_STEP_GAME_ENTER_C_START", "HEALTH_STEP_GAME_ENTER_C_START", GoogleApiAvailabilityLight.a, "getHEALTH_STEP_GAME_ENTER_C_CONTINUE", "HEALTH_STEP_GAME_ENTER_C_CONTINUE", "e", "getHEALTH_STEP_GAME_ENTER_C_DONE", "HEALTH_STEP_GAME_ENTER_C_DONE", "step_release"}, k = 2, mv = {1, 5, 1})
public final class StepStatEventKt {

    @NotNull
    private static final String a = "HEALTH_STEP_GAME_ENTER_C";

    @NotNull
    private static final String b = "state";

    @NotNull
    private static final String c = "start";

    @NotNull
    private static final String d = "continue";

    @NotNull
    private static final String e = "done";

    @NotNull
    public static final String getHEALTH_STEP_GAME_ENTER_C() {
        return a;
    }

    @NotNull
    public static final String getHEALTH_STEP_GAME_ENTER_C_CONTINUE() {
        return d;
    }

    @NotNull
    public static final String getHEALTH_STEP_GAME_ENTER_C_DONE() {
        return e;
    }

    @NotNull
    public static final String getHEALTH_STEP_GAME_ENTER_C_START() {
        return c;
    }

    @NotNull
    public static final String getHEALTH_STEP_GAME_ENTER_C_STATE() {
        return b;
    }
}
