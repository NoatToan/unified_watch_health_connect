package com.xiaomi.hm.health.device.setting.network.bean;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b>\u0010?J\u0006\u0010\u0002\u001a\u00020\u0000J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\nJp\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0010HÖ\u0001R$\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\n\"\u0004\b\"\u0010#R$\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\n\"\u0004\b&\u0010#R$\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010+R$\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010 \u001a\u0004\b-\u0010\n\"\u0004\b.\u0010#R$\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010 \u001a\u0004\b0\u0010\n\"\u0004\b1\u0010#R$\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b9\u0010\r\"\u0004\b:\u0010+R$\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010 \u001a\u0004\b<\u0010\n\"\u0004\b=\u0010#¨\u0006@"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/Sound;", "Lcom/xiaomi/hm/health/device/setting/network/bean/IWatchSettings;", "clone", "", "other", "", "equals", "", "hashCode", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "", "component6", "component7", "component8", "bellRemindSwitch", "coverScreenMutingSwitch", "volume", "vibrationFeedbackSwitch", "crownVibrationSwitch", "buzzerScenes", "buzzerVibrateStrength", "sportVoiceReportSwitch", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/xiaomi/hm/health/device/setting/network/bean/Sound;", "toString", "a", "Ljava/lang/Boolean;", "getBellRemindSwitch", "setBellRemindSwitch", "(Ljava/lang/Boolean;)V", "b", "getCoverScreenMutingSwitch", "setCoverScreenMutingSwitch", "c", "Ljava/lang/Integer;", "getVolume", "setVolume", "(Ljava/lang/Integer;)V", GoogleApiAvailabilityLight.a, "getVibrationFeedbackSwitch", "setVibrationFeedbackSwitch", "e", "getCrownVibrationSwitch", "setCrownVibrationSwitch", "f", "Ljava/lang/String;", "getBuzzerScenes", "()Ljava/lang/String;", "setBuzzerScenes", "(Ljava/lang/String;)V", "g", "getBuzzerVibrateStrength", "setBuzzerVibrateStrength", "h", "getSportVoiceReportSwitch", "setSportVoiceReportSwitch", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Sound implements IWatchSettings {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("bellRemind")
    @Nullable
    private Boolean bellRemindSwitch;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("coverSMute")
    @Nullable
    private Boolean coverScreenMutingSwitch;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("volume")
    @Nullable
    private Integer volume;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("vibrateFeedback")
    @Nullable
    private Boolean vibrationFeedbackSwitch;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("crownVibrate")
    @Nullable
    private Boolean crownVibrationSwitch;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("buzzerScenes")
    @Nullable
    private String buzzerScenes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("buzzerVibrateStrength")
    @Nullable
    private Integer buzzerVibrateStrength;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("sportVoiceReportSwitch")
    @Nullable
    private Boolean sportVoiceReportSwitch;

    public Sound() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public Sound(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str, @Nullable Integer num2, @Nullable Boolean bool5) {
        this.bellRemindSwitch = bool;
        this.coverScreenMutingSwitch = bool2;
        this.volume = num;
        this.vibrationFeedbackSwitch = bool3;
        this.crownVibrationSwitch = bool4;
        this.buzzerScenes = str;
        this.buzzerVibrateStrength = num2;
        this.sportVoiceReportSwitch = bool5;
    }

    @NotNull
    public final Sound clone() {
        return new Sound(this.bellRemindSwitch, this.coverScreenMutingSwitch, this.volume, this.vibrationFeedbackSwitch, this.crownVibrationSwitch, this.buzzerScenes, this.buzzerVibrateStrength, this.sportVoiceReportSwitch);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getBellRemindSwitch() {
        return this.bellRemindSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getCoverScreenMutingSwitch() {
        return this.coverScreenMutingSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getVolume() {
        return this.volume;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getVibrationFeedbackSwitch() {
        return this.vibrationFeedbackSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getCrownVibrationSwitch() {
        return this.crownVibrationSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBuzzerScenes() {
        return this.buzzerScenes;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getBuzzerVibrateStrength() {
        return this.buzzerVibrateStrength;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getSportVoiceReportSwitch() {
        return this.sportVoiceReportSwitch;
    }

    @NotNull
    public final Sound copy(@Nullable Boolean bellRemindSwitch, @Nullable Boolean coverScreenMutingSwitch, @Nullable Integer volume, @Nullable Boolean vibrationFeedbackSwitch, @Nullable Boolean crownVibrationSwitch, @Nullable String buzzerScenes, @Nullable Integer buzzerVibrateStrength, @Nullable Boolean sportVoiceReportSwitch) {
        return new Sound(bellRemindSwitch, coverScreenMutingSwitch, volume, vibrationFeedbackSwitch, crownVibrationSwitch, buzzerScenes, buzzerVibrateStrength, sportVoiceReportSwitch);
    }

    public boolean equals(@Nullable Object other) {
        Sound sound = other instanceof Sound ? (Sound) other : null;
        if (sound == null || !Intrinsics.areEqual(this.bellRemindSwitch, sound.bellRemindSwitch) || !Intrinsics.areEqual(this.coverScreenMutingSwitch, sound.coverScreenMutingSwitch) || !Intrinsics.areEqual(this.volume, sound.volume) || !Intrinsics.areEqual(this.vibrationFeedbackSwitch, sound.vibrationFeedbackSwitch) || !Intrinsics.areEqual(this.crownVibrationSwitch, sound.crownVibrationSwitch)) {
            return false;
        }
        Sound sound2 = (Sound) other;
        return Intrinsics.areEqual(this.buzzerScenes, sound2.buzzerScenes) && Intrinsics.areEqual(this.buzzerVibrateStrength, sound2.buzzerVibrateStrength) && Intrinsics.areEqual(this.sportVoiceReportSwitch, sound2.sportVoiceReportSwitch);
    }

    @Nullable
    public final Boolean getBellRemindSwitch() {
        return this.bellRemindSwitch;
    }

    @Nullable
    public final String getBuzzerScenes() {
        return this.buzzerScenes;
    }

    @Nullable
    public final Integer getBuzzerVibrateStrength() {
        return this.buzzerVibrateStrength;
    }

    @Nullable
    public final Boolean getCoverScreenMutingSwitch() {
        return this.coverScreenMutingSwitch;
    }

    @Nullable
    public final Boolean getCrownVibrationSwitch() {
        return this.crownVibrationSwitch;
    }

    @Nullable
    public final Boolean getSportVoiceReportSwitch() {
        return this.sportVoiceReportSwitch;
    }

    @Nullable
    public final Boolean getVibrationFeedbackSwitch() {
        return this.vibrationFeedbackSwitch;
    }

    @Nullable
    public final Integer getVolume() {
        return this.volume;
    }

    public int hashCode() {
        Boolean bool = this.bellRemindSwitch;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.coverScreenMutingSwitch;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.volume;
        int iIntValue = (iHashCode2 + (num == null ? 0 : num.intValue())) * 31;
        Boolean bool3 = this.vibrationFeedbackSwitch;
        int iHashCode3 = (iIntValue + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.crownVibrationSwitch;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str = this.buzzerScenes;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.buzzerVibrateStrength;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool5 = this.sportVoiceReportSwitch;
        return iHashCode6 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final void setBellRemindSwitch(@Nullable Boolean bool) {
        this.bellRemindSwitch = bool;
    }

    public final void setBuzzerScenes(@Nullable String str) {
        this.buzzerScenes = str;
    }

    public final void setBuzzerVibrateStrength(@Nullable Integer num) {
        this.buzzerVibrateStrength = num;
    }

    public final void setCoverScreenMutingSwitch(@Nullable Boolean bool) {
        this.coverScreenMutingSwitch = bool;
    }

    public final void setCrownVibrationSwitch(@Nullable Boolean bool) {
        this.crownVibrationSwitch = bool;
    }

    public final void setSportVoiceReportSwitch(@Nullable Boolean bool) {
        this.sportVoiceReportSwitch = bool;
    }

    public final void setVibrationFeedbackSwitch(@Nullable Boolean bool) {
        this.vibrationFeedbackSwitch = bool;
    }

    public final void setVolume(@Nullable Integer num) {
        this.volume = num;
    }

    @NotNull
    public String toString() {
        return "Sound(bellRemindSwitch=" + this.bellRemindSwitch + ", coverScreenMutingSwitch=" + this.coverScreenMutingSwitch + ", volume=" + this.volume + ", vibrationFeedbackSwitch=" + this.vibrationFeedbackSwitch + ", crownVibrationSwitch=" + this.crownVibrationSwitch + ", buzzerScenes=" + this.buzzerScenes + ", buzzerVibrateStrength=" + this.buzzerVibrateStrength + ", sportVoiceReportSwitch=" + this.sportVoiceReportSwitch + ")";
    }

    public /* synthetic */ Sound(Boolean bool, Boolean bool2, Integer num, Boolean bool3, Boolean bool4, String str, Integer num2, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : num2, (i & 128) == 0 ? bool5 : null);
    }
}
