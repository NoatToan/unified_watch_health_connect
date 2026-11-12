package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateBean;", "", "name", "", "id", "times", "", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeProgressBar$VibrateDataItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getId", "setId", "getTimes", "()Ljava/util/List;", "setTimes", "(Ljava/util/List;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VibrateBean {

    @NotNull
    private String id;

    @NotNull
    private String name;

    @NotNull
    private List<VibrateModeProgressBar.VibrateDataItem> times;

    public VibrateBean(@NotNull String name, @NotNull String id, @NotNull List<VibrateModeProgressBar.VibrateDataItem> times) {
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
    public final List<VibrateModeProgressBar.VibrateDataItem> getTimes() {
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

    public final void setTimes(@NotNull List<VibrateModeProgressBar.VibrateDataItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.times = list;
    }
}
