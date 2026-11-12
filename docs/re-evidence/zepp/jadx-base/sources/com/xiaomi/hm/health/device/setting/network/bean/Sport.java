package com.xiaomi.hm.health.device.setting.network.bean;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\bI\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bR\u0010SJ\u0006\u0010\u0002\u001a\u00020\u0000J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\nJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\nJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\nJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\nJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\nJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\nJ \u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b$\u0010%J\t\u0010&\u001a\u00020\u000bHÖ\u0001R$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\n\"\u0004\b*\u0010+R$\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u000e\"\u0004\b5\u00106R$\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010(\u001a\u0004\b8\u0010\n\"\u0004\b9\u0010+R$\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010(\u001a\u0004\b;\u0010\n\"\u0004\b<\u0010+R$\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010(\u001a\u0004\b>\u0010\n\"\u0004\b?\u0010+R$\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010(\u001a\u0004\bA\u0010\n\"\u0004\bB\u0010+R$\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010(\u001a\u0004\bD\u0010\n\"\u0004\bE\u0010+R$\u0010 \u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010(\u001a\u0004\bG\u0010\n\"\u0004\bH\u0010+R$\u0010!\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010(\u001a\u0004\bJ\u0010\n\"\u0004\bK\u0010+R$\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u00103\u001a\u0004\bM\u0010\u000e\"\u0004\bN\u00106R$\u0010#\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010(\u001a\u0004\bP\u0010\n\"\u0004\bQ\u0010+¨\u0006T"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/Sport;", "Lcom/xiaomi/hm/health/device/setting/network/bean/IWatchSettings;", "clone", "", "other", "", "equals", "", "hashCode", "component1", "()Ljava/lang/Integer;", "", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "sportRecognitionSensitivity", "sportRecognitionTypes", "sportRecognizedRemindSwitch", "poolSwimmingLaneLength", "rowingMachineWearingWrist", "gpsMode", "gpsSystemChoice", "gpsFrequencyBand", "gpsSearchingPreference", "gpsDataInterval", "aGpsOutOfDateRemindSwitch", "aGpsOutOfDateRemindTime", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/xiaomi/hm/health/device/setting/network/bean/Sport;", "toString", "a", "Ljava/lang/Integer;", "getSportRecognitionSensitivity", "setSportRecognitionSensitivity", "(Ljava/lang/Integer;)V", "b", "Ljava/lang/String;", "getSportRecognitionTypes", "()Ljava/lang/String;", "setSportRecognitionTypes", "(Ljava/lang/String;)V", "c", "Ljava/lang/Boolean;", "getSportRecognizedRemindSwitch", "setSportRecognizedRemindSwitch", "(Ljava/lang/Boolean;)V", GoogleApiAvailabilityLight.a, "getPoolSwimmingLaneLength", "setPoolSwimmingLaneLength", "e", "getRowingMachineWearingWrist", "setRowingMachineWearingWrist", "f", "getGpsMode", "setGpsMode", "g", "getGpsSystemChoice", "setGpsSystemChoice", "h", "getGpsFrequencyBand", "setGpsFrequencyBand", "i", "getGpsSearchingPreference", "setGpsSearchingPreference", z.j, "getGpsDataInterval", "setGpsDataInterval", hl.k, "getAGpsOutOfDateRemindSwitch", "setAGpsOutOfDateRemindSwitch", "l", "getAGpsOutOfDateRemindTime", "setAGpsOutOfDateRemindTime", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Sport implements IWatchSettings {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("sportRecoSensitivity")
    @Nullable
    private Integer sportRecognitionSensitivity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("sportRecoTypes")
    @Nullable
    private String sportRecognitionTypes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("sportRecoRemind")
    @Nullable
    private Boolean sportRecognizedRemindSwitch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("poolSwimLaneLength")
    @Nullable
    private Integer poolSwimmingLaneLength;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("rowMachineWearWrist")
    @Nullable
    private Integer rowingMachineWearingWrist;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("gpsMode")
    @Nullable
    private Integer gpsMode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("gpsSysChoice")
    @Nullable
    private Integer gpsSystemChoice;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("GpsFreqBand")
    @Nullable
    private Integer gpsFrequencyBand;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("gpsSearchPref")
    @Nullable
    private Integer gpsSearchingPreference;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @SerializedName("gpsDataInterval")
    @Nullable
    private Integer gpsDataInterval;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName("aGpsOutOfDateRemind")
    @Nullable
    private Boolean aGpsOutOfDateRemindSwitch;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @SerializedName("aGpsOutOfDataRemindT")
    @Nullable
    private Integer aGpsOutOfDateRemindTime;

    public Sport() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public Sport(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Boolean bool2, @Nullable Integer num9) {
        this.sportRecognitionSensitivity = num;
        this.sportRecognitionTypes = str;
        this.sportRecognizedRemindSwitch = bool;
        this.poolSwimmingLaneLength = num2;
        this.rowingMachineWearingWrist = num3;
        this.gpsMode = num4;
        this.gpsSystemChoice = num5;
        this.gpsFrequencyBand = num6;
        this.gpsSearchingPreference = num7;
        this.gpsDataInterval = num8;
        this.aGpsOutOfDateRemindSwitch = bool2;
        this.aGpsOutOfDateRemindTime = num9;
    }

    @NotNull
    public final Sport clone() {
        return new Sport(this.sportRecognitionSensitivity, this.sportRecognitionTypes, this.sportRecognizedRemindSwitch, this.poolSwimmingLaneLength, this.rowingMachineWearingWrist, this.gpsMode, this.gpsSystemChoice, this.gpsFrequencyBand, this.gpsSearchingPreference, this.gpsDataInterval, this.aGpsOutOfDateRemindSwitch, this.aGpsOutOfDateRemindTime);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getSportRecognitionSensitivity() {
        return this.sportRecognitionSensitivity;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getGpsDataInterval() {
        return this.gpsDataInterval;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getAGpsOutOfDateRemindSwitch() {
        return this.aGpsOutOfDateRemindSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getAGpsOutOfDateRemindTime() {
        return this.aGpsOutOfDateRemindTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSportRecognitionTypes() {
        return this.sportRecognitionTypes;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getSportRecognizedRemindSwitch() {
        return this.sportRecognizedRemindSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getPoolSwimmingLaneLength() {
        return this.poolSwimmingLaneLength;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getRowingMachineWearingWrist() {
        return this.rowingMachineWearingWrist;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getGpsMode() {
        return this.gpsMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getGpsSystemChoice() {
        return this.gpsSystemChoice;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getGpsFrequencyBand() {
        return this.gpsFrequencyBand;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getGpsSearchingPreference() {
        return this.gpsSearchingPreference;
    }

    @NotNull
    public final Sport copy(@Nullable Integer sportRecognitionSensitivity, @Nullable String sportRecognitionTypes, @Nullable Boolean sportRecognizedRemindSwitch, @Nullable Integer poolSwimmingLaneLength, @Nullable Integer rowingMachineWearingWrist, @Nullable Integer gpsMode, @Nullable Integer gpsSystemChoice, @Nullable Integer gpsFrequencyBand, @Nullable Integer gpsSearchingPreference, @Nullable Integer gpsDataInterval, @Nullable Boolean aGpsOutOfDateRemindSwitch, @Nullable Integer aGpsOutOfDateRemindTime) {
        return new Sport(sportRecognitionSensitivity, sportRecognitionTypes, sportRecognizedRemindSwitch, poolSwimmingLaneLength, rowingMachineWearingWrist, gpsMode, gpsSystemChoice, gpsFrequencyBand, gpsSearchingPreference, gpsDataInterval, aGpsOutOfDateRemindSwitch, aGpsOutOfDateRemindTime);
    }

    public boolean equals(@Nullable Object other) {
        Sport sport = other instanceof Sport ? (Sport) other : null;
        return sport != null && Intrinsics.areEqual(this.sportRecognitionSensitivity, sport.sportRecognitionSensitivity) && Intrinsics.areEqual(this.sportRecognitionTypes, sport.sportRecognitionTypes) && Intrinsics.areEqual(this.sportRecognizedRemindSwitch, sport.sportRecognizedRemindSwitch) && Intrinsics.areEqual(this.poolSwimmingLaneLength, sport.poolSwimmingLaneLength) && Intrinsics.areEqual(this.rowingMachineWearingWrist, sport.rowingMachineWearingWrist) && Intrinsics.areEqual(this.gpsMode, sport.gpsMode) && Intrinsics.areEqual(this.gpsSystemChoice, sport.gpsSystemChoice) && Intrinsics.areEqual(this.gpsFrequencyBand, sport.gpsFrequencyBand) && Intrinsics.areEqual(this.gpsSearchingPreference, sport.gpsSearchingPreference) && Intrinsics.areEqual(this.gpsDataInterval, sport.gpsDataInterval) && Intrinsics.areEqual(this.aGpsOutOfDateRemindSwitch, sport.aGpsOutOfDateRemindSwitch) && Intrinsics.areEqual(this.aGpsOutOfDateRemindTime, sport.aGpsOutOfDateRemindTime);
    }

    @Nullable
    public final Boolean getAGpsOutOfDateRemindSwitch() {
        return this.aGpsOutOfDateRemindSwitch;
    }

    @Nullable
    public final Integer getAGpsOutOfDateRemindTime() {
        return this.aGpsOutOfDateRemindTime;
    }

    @Nullable
    public final Integer getGpsDataInterval() {
        return this.gpsDataInterval;
    }

    @Nullable
    public final Integer getGpsFrequencyBand() {
        return this.gpsFrequencyBand;
    }

    @Nullable
    public final Integer getGpsMode() {
        return this.gpsMode;
    }

    @Nullable
    public final Integer getGpsSearchingPreference() {
        return this.gpsSearchingPreference;
    }

    @Nullable
    public final Integer getGpsSystemChoice() {
        return this.gpsSystemChoice;
    }

    @Nullable
    public final Integer getPoolSwimmingLaneLength() {
        return this.poolSwimmingLaneLength;
    }

    @Nullable
    public final Integer getRowingMachineWearingWrist() {
        return this.rowingMachineWearingWrist;
    }

    @Nullable
    public final Integer getSportRecognitionSensitivity() {
        return this.sportRecognitionSensitivity;
    }

    @Nullable
    public final String getSportRecognitionTypes() {
        return this.sportRecognitionTypes;
    }

    @Nullable
    public final Boolean getSportRecognizedRemindSwitch() {
        return this.sportRecognizedRemindSwitch;
    }

    public int hashCode() {
        Integer num = this.sportRecognitionSensitivity;
        int iIntValue = (num == null ? 0 : num.intValue()) * 31;
        String str = this.sportRecognitionTypes;
        int iHashCode = (iIntValue + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.sportRecognizedRemindSwitch;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.poolSwimmingLaneLength;
        int iIntValue2 = (iHashCode2 + (num2 == null ? 0 : num2.intValue())) * 31;
        Integer num3 = this.rowingMachineWearingWrist;
        int iIntValue3 = (iIntValue2 + (num3 == null ? 0 : num3.intValue())) * 31;
        Integer num4 = this.gpsMode;
        int iIntValue4 = (iIntValue3 + (num4 == null ? 0 : num4.intValue())) * 31;
        Integer num5 = this.gpsSystemChoice;
        int iIntValue5 = (iIntValue4 + (num5 == null ? 0 : num5.intValue())) * 31;
        Integer num6 = this.gpsFrequencyBand;
        int iIntValue6 = (iIntValue5 + (num6 == null ? 0 : num6.intValue())) * 31;
        Integer num7 = this.gpsSearchingPreference;
        int iIntValue7 = (iIntValue6 + (num7 == null ? 0 : num7.intValue())) * 31;
        Integer num8 = this.gpsDataInterval;
        int iIntValue8 = (iIntValue7 + (num8 == null ? 0 : num8.intValue())) * 31;
        Boolean bool2 = this.aGpsOutOfDateRemindSwitch;
        int iHashCode3 = (iIntValue8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num9 = this.aGpsOutOfDateRemindTime;
        return iHashCode3 + (num9 != null ? num9.intValue() : 0);
    }

    public final void setAGpsOutOfDateRemindSwitch(@Nullable Boolean bool) {
        this.aGpsOutOfDateRemindSwitch = bool;
    }

    public final void setAGpsOutOfDateRemindTime(@Nullable Integer num) {
        this.aGpsOutOfDateRemindTime = num;
    }

    public final void setGpsDataInterval(@Nullable Integer num) {
        this.gpsDataInterval = num;
    }

    public final void setGpsFrequencyBand(@Nullable Integer num) {
        this.gpsFrequencyBand = num;
    }

    public final void setGpsMode(@Nullable Integer num) {
        this.gpsMode = num;
    }

    public final void setGpsSearchingPreference(@Nullable Integer num) {
        this.gpsSearchingPreference = num;
    }

    public final void setGpsSystemChoice(@Nullable Integer num) {
        this.gpsSystemChoice = num;
    }

    public final void setPoolSwimmingLaneLength(@Nullable Integer num) {
        this.poolSwimmingLaneLength = num;
    }

    public final void setRowingMachineWearingWrist(@Nullable Integer num) {
        this.rowingMachineWearingWrist = num;
    }

    public final void setSportRecognitionSensitivity(@Nullable Integer num) {
        this.sportRecognitionSensitivity = num;
    }

    public final void setSportRecognitionTypes(@Nullable String str) {
        this.sportRecognitionTypes = str;
    }

    public final void setSportRecognizedRemindSwitch(@Nullable Boolean bool) {
        this.sportRecognizedRemindSwitch = bool;
    }

    @NotNull
    public String toString() {
        return "Sport(sportRecognitionSensitivity=" + this.sportRecognitionSensitivity + ", sportRecognitionTypes=" + this.sportRecognitionTypes + ", sportRecognizedRemindSwitch=" + this.sportRecognizedRemindSwitch + ", poolSwimmingLaneLength=" + this.poolSwimmingLaneLength + ", rowingMachineWearingWrist=" + this.rowingMachineWearingWrist + ", gpsMode=" + this.gpsMode + ", gpsSystemChoice=" + this.gpsSystemChoice + ", gpsFrequencyBand=" + this.gpsFrequencyBand + ", gpsSearchingPreference=" + this.gpsSearchingPreference + ", gpsDataInterval=" + this.gpsDataInterval + ", aGpsOutOfDateRemindSwitch=" + this.aGpsOutOfDateRemindSwitch + ", aGpsOutOfDateRemindTime=" + this.aGpsOutOfDateRemindTime + ")";
    }

    public /* synthetic */ Sport(Integer num, String str, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Boolean bool2, Integer num9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4, (i & 64) != 0 ? null : num5, (i & 128) != 0 ? null : num6, (i & 256) != 0 ? null : num7, (i & 512) != 0 ? null : num8, (i & 1024) != 0 ? null : bool2, (i & 2048) == 0 ? num9 : null);
    }
}
