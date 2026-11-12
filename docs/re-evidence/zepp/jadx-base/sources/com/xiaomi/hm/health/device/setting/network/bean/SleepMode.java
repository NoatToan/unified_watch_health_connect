package com.xiaomi.hm.health.device.setting.network.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0002\u001a\u00020\u0000J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ(\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/SleepMode;", "Lcom/xiaomi/hm/health/device/setting/network/bean/IWatchSettings;", "clone", "", "other", "", "equals", "", "hashCode", "component1", "()Ljava/lang/Boolean;", "component2", "sleepModeDisplay", "sleepModeSmart", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/xiaomi/hm/health/device/setting/network/bean/SleepMode;", "", "toString", "a", "Ljava/lang/Boolean;", "getSleepModeDisplay", "setSleepModeDisplay", "(Ljava/lang/Boolean;)V", "b", "getSleepModeSmart", "setSleepModeSmart", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepMode implements IWatchSettings {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("sleepModeDisplay")
    @Nullable
    private Boolean sleepModeDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("sleepModeSmart")
    @Nullable
    private Boolean sleepModeSmart;

    /* JADX WARN: Multi-variable type inference failed */
    public SleepMode() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public SleepMode(@Nullable Boolean bool, @Nullable Boolean bool2) {
        this.sleepModeDisplay = bool;
        this.sleepModeSmart = bool2;
    }

    public static /* synthetic */ SleepMode copy$default(SleepMode sleepMode, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = sleepMode.sleepModeDisplay;
        }
        if ((i & 2) != 0) {
            bool2 = sleepMode.sleepModeSmart;
        }
        return sleepMode.copy(bool, bool2);
    }

    @NotNull
    public final SleepMode clone() {
        return new SleepMode(this.sleepModeDisplay, this.sleepModeSmart);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSleepModeDisplay() {
        return this.sleepModeDisplay;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getSleepModeSmart() {
        return this.sleepModeSmart;
    }

    @NotNull
    public final SleepMode copy(@Nullable Boolean sleepModeDisplay, @Nullable Boolean sleepModeSmart) {
        return new SleepMode(sleepModeDisplay, sleepModeSmart);
    }

    public boolean equals(@Nullable Object other) {
        SleepMode sleepMode = other instanceof SleepMode ? (SleepMode) other : null;
        return sleepMode != null && Intrinsics.areEqual(this.sleepModeDisplay, sleepMode.sleepModeDisplay) && Intrinsics.areEqual(this.sleepModeSmart, sleepMode.sleepModeSmart);
    }

    @Nullable
    public final Boolean getSleepModeDisplay() {
        return this.sleepModeDisplay;
    }

    @Nullable
    public final Boolean getSleepModeSmart() {
        return this.sleepModeSmart;
    }

    public int hashCode() {
        Boolean bool = this.sleepModeDisplay;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.sleepModeSmart;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final void setSleepModeDisplay(@Nullable Boolean bool) {
        this.sleepModeDisplay = bool;
    }

    public final void setSleepModeSmart(@Nullable Boolean bool) {
        this.sleepModeSmart = bool;
    }

    @NotNull
    public String toString() {
        return "SleepMode(sleepModeDisplay=" + this.sleepModeDisplay + ", sleepModeSmart=" + this.sleepModeSmart + ")";
    }

    public /* synthetic */ SleepMode(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
