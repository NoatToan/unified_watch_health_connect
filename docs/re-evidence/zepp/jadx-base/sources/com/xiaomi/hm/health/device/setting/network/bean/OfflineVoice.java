package com.xiaomi.hm.health.device.setting.network.bean;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0002\u001a\u00020\u0000J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ@\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001R$\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u001bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u001bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\u001bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/OfflineVoice;", "Lcom/xiaomi/hm/health/device/setting/network/bean/IWatchSettings;", "clone", "", "other", "", "equals", "", "hashCode", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "activeWithInFiveSecondsByTurningWristSwitch", "activeWithInFiveSecondsWhenScreenOnSwitch", "activeDuringScreenOnSwitch", "offlineVoiceLanguage", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/xiaomi/hm/health/device/setting/network/bean/OfflineVoice;", "", "toString", "a", "Ljava/lang/Boolean;", "getActiveWithInFiveSecondsByTurningWristSwitch", "setActiveWithInFiveSecondsByTurningWristSwitch", "(Ljava/lang/Boolean;)V", "b", "getActiveWithInFiveSecondsWhenScreenOnSwitch", "setActiveWithInFiveSecondsWhenScreenOnSwitch", "c", "getActiveDuringScreenOnSwitch", "setActiveDuringScreenOnSwitch", GoogleApiAvailabilityLight.a, "Ljava/lang/Integer;", "getOfflineVoiceLanguage", "setOfflineVoiceLanguage", "(Ljava/lang/Integer;)V", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class OfflineVoice implements IWatchSettings {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("fiveSTurnWristActive")
    @Nullable
    private Boolean activeWithInFiveSecondsByTurningWristSwitch;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("fiveSScreenOnActive")
    @Nullable
    private Boolean activeWithInFiveSecondsWhenScreenOnSwitch;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("screenOnActive")
    @Nullable
    private Boolean activeDuringScreenOnSwitch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("offlineVoiceLang")
    @Nullable
    private Integer offlineVoiceLanguage;

    public OfflineVoice() {
        this(null, null, null, null, 15, null);
    }

    public OfflineVoice(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Integer num) {
        this.activeWithInFiveSecondsByTurningWristSwitch = bool;
        this.activeWithInFiveSecondsWhenScreenOnSwitch = bool2;
        this.activeDuringScreenOnSwitch = bool3;
        this.offlineVoiceLanguage = num;
    }

    public static /* synthetic */ OfflineVoice copy$default(OfflineVoice offlineVoice, Boolean bool, Boolean bool2, Boolean bool3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = offlineVoice.activeWithInFiveSecondsByTurningWristSwitch;
        }
        if ((i & 2) != 0) {
            bool2 = offlineVoice.activeWithInFiveSecondsWhenScreenOnSwitch;
        }
        if ((i & 4) != 0) {
            bool3 = offlineVoice.activeDuringScreenOnSwitch;
        }
        if ((i & 8) != 0) {
            num = offlineVoice.offlineVoiceLanguage;
        }
        return offlineVoice.copy(bool, bool2, bool3, num);
    }

    @NotNull
    public final OfflineVoice clone() {
        return new OfflineVoice(this.activeWithInFiveSecondsByTurningWristSwitch, this.activeWithInFiveSecondsWhenScreenOnSwitch, this.activeDuringScreenOnSwitch, this.offlineVoiceLanguage);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getActiveWithInFiveSecondsByTurningWristSwitch() {
        return this.activeWithInFiveSecondsByTurningWristSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getActiveWithInFiveSecondsWhenScreenOnSwitch() {
        return this.activeWithInFiveSecondsWhenScreenOnSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getActiveDuringScreenOnSwitch() {
        return this.activeDuringScreenOnSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getOfflineVoiceLanguage() {
        return this.offlineVoiceLanguage;
    }

    @NotNull
    public final OfflineVoice copy(@Nullable Boolean activeWithInFiveSecondsByTurningWristSwitch, @Nullable Boolean activeWithInFiveSecondsWhenScreenOnSwitch, @Nullable Boolean activeDuringScreenOnSwitch, @Nullable Integer offlineVoiceLanguage) {
        return new OfflineVoice(activeWithInFiveSecondsByTurningWristSwitch, activeWithInFiveSecondsWhenScreenOnSwitch, activeDuringScreenOnSwitch, offlineVoiceLanguage);
    }

    public boolean equals(@Nullable Object other) {
        OfflineVoice offlineVoice = other instanceof OfflineVoice ? (OfflineVoice) other : null;
        return offlineVoice != null && Intrinsics.areEqual(this.activeWithInFiveSecondsByTurningWristSwitch, offlineVoice.activeWithInFiveSecondsByTurningWristSwitch) && Intrinsics.areEqual(this.activeWithInFiveSecondsWhenScreenOnSwitch, offlineVoice.activeWithInFiveSecondsWhenScreenOnSwitch) && Intrinsics.areEqual(this.activeDuringScreenOnSwitch, offlineVoice.activeDuringScreenOnSwitch) && Intrinsics.areEqual(this.offlineVoiceLanguage, offlineVoice.offlineVoiceLanguage);
    }

    @Nullable
    public final Boolean getActiveDuringScreenOnSwitch() {
        return this.activeDuringScreenOnSwitch;
    }

    @Nullable
    public final Boolean getActiveWithInFiveSecondsByTurningWristSwitch() {
        return this.activeWithInFiveSecondsByTurningWristSwitch;
    }

    @Nullable
    public final Boolean getActiveWithInFiveSecondsWhenScreenOnSwitch() {
        return this.activeWithInFiveSecondsWhenScreenOnSwitch;
    }

    @Nullable
    public final Integer getOfflineVoiceLanguage() {
        return this.offlineVoiceLanguage;
    }

    public int hashCode() {
        Boolean bool = this.activeWithInFiveSecondsByTurningWristSwitch;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.activeWithInFiveSecondsWhenScreenOnSwitch;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.activeDuringScreenOnSwitch;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.offlineVoiceLanguage;
        return iHashCode3 + (num != null ? num.intValue() : 0);
    }

    public final void setActiveDuringScreenOnSwitch(@Nullable Boolean bool) {
        this.activeDuringScreenOnSwitch = bool;
    }

    public final void setActiveWithInFiveSecondsByTurningWristSwitch(@Nullable Boolean bool) {
        this.activeWithInFiveSecondsByTurningWristSwitch = bool;
    }

    public final void setActiveWithInFiveSecondsWhenScreenOnSwitch(@Nullable Boolean bool) {
        this.activeWithInFiveSecondsWhenScreenOnSwitch = bool;
    }

    public final void setOfflineVoiceLanguage(@Nullable Integer num) {
        this.offlineVoiceLanguage = num;
    }

    @NotNull
    public String toString() {
        return "OfflineVoice(activeWithInFiveSecondsByTurningWristSwitch=" + this.activeWithInFiveSecondsByTurningWristSwitch + ", activeWithInFiveSecondsWhenScreenOnSwitch=" + this.activeWithInFiveSecondsWhenScreenOnSwitch + ", activeDuringScreenOnSwitch=" + this.activeDuringScreenOnSwitch + ", offlineVoiceLanguage=" + this.offlineVoiceLanguage + ")";
    }

    public /* synthetic */ OfflineVoice(Boolean bool, Boolean bool2, Boolean bool3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : num);
    }
}
