package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateBeanHm;", "", "name", "", "id", "times", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;[S)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getId", "setId", "getTimes", "()[S", "setTimes", "([S)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VibrateBeanHm {

    @NotNull
    private String id;

    @NotNull
    private String name;

    @NotNull
    private short[] times;

    public VibrateBeanHm(@NotNull String name, @NotNull String id, @NotNull short[] times) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(times, "times");
        this.name = name;
        this.id = id;
        this.times = times;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final short[] getTimes() {
        return this.times;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setTimes(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<set-?>");
        this.times = sArr;
    }
}
