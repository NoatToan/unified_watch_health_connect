package com.xiaomi.fitness.training_plan.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettings;", "", "remindSwitch", "", "remindTime", "", "runningDays", "strengthDays", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRemindSwitch", "()Z", "getRemindTime", "()Ljava/lang/String;", "getRunningDays", "getStrengthDays", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SmartRunningRemindSettings {

    @SerializedName("remind_switch")
    private final boolean remindSwitch;

    @SerializedName(MiuiCursorConstants.REMIND_TIME)
    @NotNull
    private final String remindTime;

    @SerializedName("running_days")
    @Nullable
    private final String runningDays;

    @SerializedName("strength_days")
    @Nullable
    private final String strengthDays;

    public SmartRunningRemindSettings(boolean z, @NotNull String remindTime, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(remindTime, "remindTime");
        this.remindSwitch = z;
        this.remindTime = remindTime;
        this.runningDays = str;
        this.strengthDays = str2;
    }

    public static /* synthetic */ SmartRunningRemindSettings copy$default(SmartRunningRemindSettings smartRunningRemindSettings, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = smartRunningRemindSettings.remindSwitch;
        }
        if ((i & 2) != 0) {
            str = smartRunningRemindSettings.remindTime;
        }
        if ((i & 4) != 0) {
            str2 = smartRunningRemindSettings.runningDays;
        }
        if ((i & 8) != 0) {
            str3 = smartRunningRemindSettings.strengthDays;
        }
        return smartRunningRemindSettings.copy(z, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getRemindSwitch() {
        return this.remindSwitch;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRemindTime() {
        return this.remindTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRunningDays() {
        return this.runningDays;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStrengthDays() {
        return this.strengthDays;
    }

    @NotNull
    public final SmartRunningRemindSettings copy(boolean remindSwitch, @NotNull String remindTime, @Nullable String runningDays, @Nullable String strengthDays) {
        Intrinsics.checkNotNullParameter(remindTime, "remindTime");
        return new SmartRunningRemindSettings(remindSwitch, remindTime, runningDays, strengthDays);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartRunningRemindSettings)) {
            return false;
        }
        SmartRunningRemindSettings smartRunningRemindSettings = (SmartRunningRemindSettings) other;
        return this.remindSwitch == smartRunningRemindSettings.remindSwitch && Intrinsics.areEqual(this.remindTime, smartRunningRemindSettings.remindTime) && Intrinsics.areEqual(this.runningDays, smartRunningRemindSettings.runningDays) && Intrinsics.areEqual(this.strengthDays, smartRunningRemindSettings.strengthDays);
    }

    public final boolean getRemindSwitch() {
        return this.remindSwitch;
    }

    @NotNull
    public final String getRemindTime() {
        return this.remindTime;
    }

    @Nullable
    public final String getRunningDays() {
        return this.runningDays;
    }

    @Nullable
    public final String getStrengthDays() {
        return this.strengthDays;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.remindSwitch) * 31) + this.remindTime.hashCode()) * 31;
        String str = this.runningDays;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.strengthDays;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SmartRunningRemindSettings(remindSwitch=" + this.remindSwitch + ", remindTime=" + this.remindTime + ", runningDays=" + this.runningDays + ", strengthDays=" + this.strengthDays + ")";
    }
}
