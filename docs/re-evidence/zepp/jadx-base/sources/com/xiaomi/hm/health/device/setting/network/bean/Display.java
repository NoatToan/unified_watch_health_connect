package com.xiaomi.hm.health.device.setting.network.bean;

import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\bY\b\u0086\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bf\u0010gJ\u0006\u0010\u0002\u001a\u00020\u0000J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\fJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\nJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\fJÐ\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b,\u0010-J\t\u0010.\u001a\u00020\u000fHÖ\u0001R$\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010\n\"\u0004\b2\u00103R$\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u0010\f\"\u0004\b7\u00108R$\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u00105\u001a\u0004\b:\u0010\f\"\u0004\b;\u00108R$\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u00100\u001a\u0004\b=\u0010\n\"\u0004\b>\u00103R$\u0010 \u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010!\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u00105\u001a\u0004\bF\u0010\f\"\u0004\bG\u00108R$\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u00105\u001a\u0004\bI\u0010\f\"\u0004\bJ\u00108R$\u0010#\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u00105\u001a\u0004\bL\u0010\f\"\u0004\bM\u00108R$\u0010$\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u00105\u001a\u0004\bO\u0010\f\"\u0004\bP\u00108R$\u0010%\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u00105\u001a\u0004\bR\u0010\f\"\u0004\bS\u00108R$\u0010&\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u00105\u001a\u0004\bU\u0010\f\"\u0004\bV\u00108R$\u0010'\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u00105\u001a\u0004\bX\u0010\f\"\u0004\bY\u00108R$\u0010(\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u00100\u001a\u0004\b[\u0010\n\"\u0004\b\\\u00103R$\u0010)\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b]\u0010@\u001a\u0004\b^\u0010B\"\u0004\b_\u0010DR$\u0010*\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b`\u00100\u001a\u0004\ba\u0010\n\"\u0004\bb\u00103R$\u0010+\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bc\u00105\u001a\u0004\bd\u0010\f\"\u0004\be\u00108¨\u0006h"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/Display;", "Lcom/xiaomi/hm/health/device/setting/network/bean/IWatchSettings;", "clone", "", "other", "", "equals", "", "hashCode", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "autoBrightness", "brightness", "screenOffTime", "screenOffFollowCurrentDialSwitch", "screenOffDialId", "screenOffDisplayMode", "screenOffDisplayBeginTime", "screenOffDisplayEndTime", "screenOnByTurningWristMode", "screenOnByTurningWristActiveSpeed", "screenOnByTurningWristBeginTime", "screenOnByTurningWristEndTime", "screenOnByNewNotificationSwitch", "homeScreenStyle", "screenOnDuringSport", "screenColorStyle", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/xiaomi/hm/health/device/setting/network/bean/Display;", "toString", "a", "Ljava/lang/Boolean;", "getAutoBrightness", "setAutoBrightness", "(Ljava/lang/Boolean;)V", "b", "Ljava/lang/Integer;", "getBrightness", "setBrightness", "(Ljava/lang/Integer;)V", "c", "getScreenOffTime", "setScreenOffTime", GoogleApiAvailabilityLight.a, "getScreenOffFollowCurrentDialSwitch", "setScreenOffFollowCurrentDialSwitch", "e", "Ljava/lang/String;", "getScreenOffDialId", "()Ljava/lang/String;", "setScreenOffDialId", "(Ljava/lang/String;)V", "f", "getScreenOffDisplayMode", "setScreenOffDisplayMode", "g", "getScreenOffDisplayBeginTime", "setScreenOffDisplayBeginTime", "h", "getScreenOffDisplayEndTime", "setScreenOffDisplayEndTime", "i", "getScreenOnByTurningWristMode", "setScreenOnByTurningWristMode", z.j, "getScreenOnByTurningWristActiveSpeed", "setScreenOnByTurningWristActiveSpeed", hl.k, "getScreenOnByTurningWristBeginTime", "setScreenOnByTurningWristBeginTime", "l", "getScreenOnByTurningWristEndTime", "setScreenOnByTurningWristEndTime", "m", "getScreenOnByNewNotificationSwitch", "setScreenOnByNewNotificationSwitch", GoogleApiAvailabilityLight.b, "getHomeScreenStyle", "setHomeScreenStyle", "o", "getScreenOnDuringSport", "setScreenOnDuringSport", b.r, "getScreenColorStyle", "setScreenColorStyle", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Display implements IWatchSettings {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("autoBright")
    @Nullable
    private Boolean autoBrightness;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("bright")
    @Nullable
    private Integer brightness;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("sOffTime")
    @Nullable
    private Integer screenOffTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("sOffFollowDial")
    @Nullable
    private Boolean screenOffFollowCurrentDialSwitch;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("sOffDialId")
    @Nullable
    private String screenOffDialId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("sOffDisMode")
    @Nullable
    private Integer screenOffDisplayMode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("sOffDisBeginT")
    @Nullable
    private Integer screenOffDisplayBeginTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("sOffDisEndT")
    @Nullable
    private Integer screenOffDisplayEndTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("sOnByTurnWristM")
    @Nullable
    private Integer screenOnByTurningWristMode;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @SerializedName("sOnByTurnWristActiveS")
    @Nullable
    private Integer screenOnByTurningWristActiveSpeed;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName("sOnByTurnWristBeginT")
    @Nullable
    private Integer screenOnByTurningWristBeginTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @SerializedName("sOnByTurnWristEndT")
    @Nullable
    private Integer screenOnByTurningWristEndTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @SerializedName("sOnByNotify")
    @Nullable
    private Boolean screenOnByNewNotificationSwitch;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @SerializedName("homeStyle")
    @Nullable
    private String homeScreenStyle;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @SerializedName("screenOnDuringSport")
    @Nullable
    private Boolean screenOnDuringSport;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @SerializedName("sceenColorStyle")
    @Nullable
    private Integer screenColorStyle;

    public Display() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public Display(@Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable String str, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Boolean bool3, @Nullable String str2, @Nullable Boolean bool4, @Nullable Integer num10) {
        this.autoBrightness = bool;
        this.brightness = num;
        this.screenOffTime = num2;
        this.screenOffFollowCurrentDialSwitch = bool2;
        this.screenOffDialId = str;
        this.screenOffDisplayMode = num3;
        this.screenOffDisplayBeginTime = num4;
        this.screenOffDisplayEndTime = num5;
        this.screenOnByTurningWristMode = num6;
        this.screenOnByTurningWristActiveSpeed = num7;
        this.screenOnByTurningWristBeginTime = num8;
        this.screenOnByTurningWristEndTime = num9;
        this.screenOnByNewNotificationSwitch = bool3;
        this.homeScreenStyle = str2;
        this.screenOnDuringSport = bool4;
        this.screenColorStyle = num10;
    }

    @NotNull
    public final Display clone() {
        return new Display(this.autoBrightness, this.brightness, this.screenOffTime, this.screenOffFollowCurrentDialSwitch, this.screenOffDialId, this.screenOffDisplayMode, this.screenOffDisplayBeginTime, this.screenOffDisplayEndTime, this.screenOnByTurningWristMode, this.screenOnByTurningWristActiveSpeed, this.screenOnByTurningWristBeginTime, this.screenOnByTurningWristEndTime, this.screenOnByNewNotificationSwitch, this.homeScreenStyle, this.screenOnDuringSport, this.screenColorStyle);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAutoBrightness() {
        return this.autoBrightness;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getScreenOnByTurningWristActiveSpeed() {
        return this.screenOnByTurningWristActiveSpeed;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getScreenOnByTurningWristBeginTime() {
        return this.screenOnByTurningWristBeginTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getScreenOnByTurningWristEndTime() {
        return this.screenOnByTurningWristEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getScreenOnByNewNotificationSwitch() {
        return this.screenOnByNewNotificationSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getHomeScreenStyle() {
        return this.homeScreenStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getScreenOnDuringSport() {
        return this.screenOnDuringSport;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getScreenColorStyle() {
        return this.screenColorStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getBrightness() {
        return this.brightness;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getScreenOffTime() {
        return this.screenOffTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getScreenOffFollowCurrentDialSwitch() {
        return this.screenOffFollowCurrentDialSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getScreenOffDialId() {
        return this.screenOffDialId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getScreenOffDisplayMode() {
        return this.screenOffDisplayMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getScreenOffDisplayBeginTime() {
        return this.screenOffDisplayBeginTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getScreenOffDisplayEndTime() {
        return this.screenOffDisplayEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getScreenOnByTurningWristMode() {
        return this.screenOnByTurningWristMode;
    }

    @NotNull
    public final Display copy(@Nullable Boolean autoBrightness, @Nullable Integer brightness, @Nullable Integer screenOffTime, @Nullable Boolean screenOffFollowCurrentDialSwitch, @Nullable String screenOffDialId, @Nullable Integer screenOffDisplayMode, @Nullable Integer screenOffDisplayBeginTime, @Nullable Integer screenOffDisplayEndTime, @Nullable Integer screenOnByTurningWristMode, @Nullable Integer screenOnByTurningWristActiveSpeed, @Nullable Integer screenOnByTurningWristBeginTime, @Nullable Integer screenOnByTurningWristEndTime, @Nullable Boolean screenOnByNewNotificationSwitch, @Nullable String homeScreenStyle, @Nullable Boolean screenOnDuringSport, @Nullable Integer screenColorStyle) {
        return new Display(autoBrightness, brightness, screenOffTime, screenOffFollowCurrentDialSwitch, screenOffDialId, screenOffDisplayMode, screenOffDisplayBeginTime, screenOffDisplayEndTime, screenOnByTurningWristMode, screenOnByTurningWristActiveSpeed, screenOnByTurningWristBeginTime, screenOnByTurningWristEndTime, screenOnByNewNotificationSwitch, homeScreenStyle, screenOnDuringSport, screenColorStyle);
    }

    public boolean equals(@Nullable Object other) {
        Display display = other instanceof Display ? (Display) other : null;
        return display != null && Intrinsics.areEqual(this.autoBrightness, display.autoBrightness) && Intrinsics.areEqual(this.brightness, display.brightness) && Intrinsics.areEqual(this.screenOffTime, display.screenOffTime) && Intrinsics.areEqual(this.screenOffFollowCurrentDialSwitch, display.screenOffFollowCurrentDialSwitch) && Intrinsics.areEqual(this.screenOffDialId, display.screenOffDialId) && Intrinsics.areEqual(this.screenOffDisplayMode, display.screenOffDisplayMode) && Intrinsics.areEqual(this.screenOffDisplayBeginTime, display.screenOffDisplayBeginTime) && Intrinsics.areEqual(this.screenOffDisplayEndTime, display.screenOffDisplayEndTime) && Intrinsics.areEqual(this.screenOnByTurningWristMode, display.screenOnByTurningWristMode) && Intrinsics.areEqual(this.screenOnByTurningWristActiveSpeed, display.screenOnByTurningWristActiveSpeed) && Intrinsics.areEqual(this.screenOnByTurningWristBeginTime, display.screenOnByTurningWristBeginTime) && Intrinsics.areEqual(this.screenOnByTurningWristEndTime, display.screenOnByTurningWristEndTime) && Intrinsics.areEqual(this.screenOnByNewNotificationSwitch, display.screenOnByNewNotificationSwitch) && Intrinsics.areEqual(this.homeScreenStyle, display.homeScreenStyle) && Intrinsics.areEqual(this.screenOnDuringSport, display.screenOnDuringSport) && Intrinsics.areEqual(this.screenColorStyle, display.screenColorStyle);
    }

    @Nullable
    public final Boolean getAutoBrightness() {
        return this.autoBrightness;
    }

    @Nullable
    public final Integer getBrightness() {
        return this.brightness;
    }

    @Nullable
    public final String getHomeScreenStyle() {
        return this.homeScreenStyle;
    }

    @Nullable
    public final Integer getScreenColorStyle() {
        return this.screenColorStyle;
    }

    @Nullable
    public final String getScreenOffDialId() {
        return this.screenOffDialId;
    }

    @Nullable
    public final Integer getScreenOffDisplayBeginTime() {
        return this.screenOffDisplayBeginTime;
    }

    @Nullable
    public final Integer getScreenOffDisplayEndTime() {
        return this.screenOffDisplayEndTime;
    }

    @Nullable
    public final Integer getScreenOffDisplayMode() {
        return this.screenOffDisplayMode;
    }

    @Nullable
    public final Boolean getScreenOffFollowCurrentDialSwitch() {
        return this.screenOffFollowCurrentDialSwitch;
    }

    @Nullable
    public final Integer getScreenOffTime() {
        return this.screenOffTime;
    }

    @Nullable
    public final Boolean getScreenOnByNewNotificationSwitch() {
        return this.screenOnByNewNotificationSwitch;
    }

    @Nullable
    public final Integer getScreenOnByTurningWristActiveSpeed() {
        return this.screenOnByTurningWristActiveSpeed;
    }

    @Nullable
    public final Integer getScreenOnByTurningWristBeginTime() {
        return this.screenOnByTurningWristBeginTime;
    }

    @Nullable
    public final Integer getScreenOnByTurningWristEndTime() {
        return this.screenOnByTurningWristEndTime;
    }

    @Nullable
    public final Integer getScreenOnByTurningWristMode() {
        return this.screenOnByTurningWristMode;
    }

    @Nullable
    public final Boolean getScreenOnDuringSport() {
        return this.screenOnDuringSport;
    }

    public int hashCode() {
        Boolean bool = this.autoBrightness;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.brightness;
        int iIntValue = (iHashCode + (num == null ? 0 : num.intValue())) * 31;
        Integer num2 = this.screenOffTime;
        int iIntValue2 = (iIntValue + (num2 == null ? 0 : num2.intValue())) * 31;
        Boolean bool2 = this.screenOffFollowCurrentDialSwitch;
        int iHashCode2 = (iIntValue2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.screenOffDialId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.screenOffDisplayMode;
        int iIntValue3 = (iHashCode3 + (num3 == null ? 0 : num3.intValue())) * 31;
        Integer num4 = this.screenOffDisplayBeginTime;
        int iIntValue4 = (iIntValue3 + (num4 == null ? 0 : num4.intValue())) * 31;
        Integer num5 = this.screenOffDisplayEndTime;
        int iIntValue5 = (iIntValue4 + (num5 == null ? 0 : num5.intValue())) * 31;
        Integer num6 = this.screenOnByTurningWristMode;
        int iIntValue6 = (iIntValue5 + (num6 == null ? 0 : num6.intValue())) * 31;
        Integer num7 = this.screenOnByTurningWristActiveSpeed;
        int iIntValue7 = (iIntValue6 + (num7 == null ? 0 : num7.intValue())) * 31;
        Integer num8 = this.screenOnByTurningWristBeginTime;
        int iIntValue8 = (iIntValue7 + (num8 == null ? 0 : num8.intValue())) * 31;
        Integer num9 = this.screenOnByTurningWristEndTime;
        int iIntValue9 = (iIntValue8 + (num9 == null ? 0 : num9.intValue())) * 31;
        Boolean bool3 = this.screenOnByNewNotificationSwitch;
        int iHashCode4 = (iIntValue9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.homeScreenStyle;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool4 = this.screenOnDuringSport;
        int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num10 = this.screenColorStyle;
        return iHashCode6 + (num10 != null ? num10.hashCode() : 0);
    }

    public final void setAutoBrightness(@Nullable Boolean bool) {
        this.autoBrightness = bool;
    }

    public final void setBrightness(@Nullable Integer num) {
        this.brightness = num;
    }

    public final void setHomeScreenStyle(@Nullable String str) {
        this.homeScreenStyle = str;
    }

    public final void setScreenColorStyle(@Nullable Integer num) {
        this.screenColorStyle = num;
    }

    public final void setScreenOffDialId(@Nullable String str) {
        this.screenOffDialId = str;
    }

    public final void setScreenOffDisplayBeginTime(@Nullable Integer num) {
        this.screenOffDisplayBeginTime = num;
    }

    public final void setScreenOffDisplayEndTime(@Nullable Integer num) {
        this.screenOffDisplayEndTime = num;
    }

    public final void setScreenOffDisplayMode(@Nullable Integer num) {
        this.screenOffDisplayMode = num;
    }

    public final void setScreenOffFollowCurrentDialSwitch(@Nullable Boolean bool) {
        this.screenOffFollowCurrentDialSwitch = bool;
    }

    public final void setScreenOffTime(@Nullable Integer num) {
        this.screenOffTime = num;
    }

    public final void setScreenOnByNewNotificationSwitch(@Nullable Boolean bool) {
        this.screenOnByNewNotificationSwitch = bool;
    }

    public final void setScreenOnByTurningWristActiveSpeed(@Nullable Integer num) {
        this.screenOnByTurningWristActiveSpeed = num;
    }

    public final void setScreenOnByTurningWristBeginTime(@Nullable Integer num) {
        this.screenOnByTurningWristBeginTime = num;
    }

    public final void setScreenOnByTurningWristEndTime(@Nullable Integer num) {
        this.screenOnByTurningWristEndTime = num;
    }

    public final void setScreenOnByTurningWristMode(@Nullable Integer num) {
        this.screenOnByTurningWristMode = num;
    }

    public final void setScreenOnDuringSport(@Nullable Boolean bool) {
        this.screenOnDuringSport = bool;
    }

    @NotNull
    public String toString() {
        return "Display(autoBrightness=" + this.autoBrightness + ", brightness=" + this.brightness + ", screenOffTime=" + this.screenOffTime + ", screenOffFollowCurrentDialSwitch=" + this.screenOffFollowCurrentDialSwitch + ", screenOffDialId=" + this.screenOffDialId + ", screenOffDisplayMode=" + this.screenOffDisplayMode + ", screenOffDisplayBeginTime=" + this.screenOffDisplayBeginTime + ", screenOffDisplayEndTime=" + this.screenOffDisplayEndTime + ", screenOnByTurningWristMode=" + this.screenOnByTurningWristMode + ", screenOnByTurningWristActiveSpeed=" + this.screenOnByTurningWristActiveSpeed + ", screenOnByTurningWristBeginTime=" + this.screenOnByTurningWristBeginTime + ", screenOnByTurningWristEndTime=" + this.screenOnByTurningWristEndTime + ", screenOnByNewNotificationSwitch=" + this.screenOnByNewNotificationSwitch + ", homeScreenStyle=" + this.homeScreenStyle + ", screenOnDuringSport=" + this.screenOnDuringSport + ", screenColorStyle=" + this.screenColorStyle + ")";
    }

    public /* synthetic */ Display(Boolean bool, Integer num, Integer num2, Boolean bool2, String str, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Boolean bool3, String str2, Boolean bool4, Integer num10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : num5, (i & 256) != 0 ? null : num6, (i & 512) != 0 ? null : num7, (i & 1024) != 0 ? null : num8, (i & 2048) != 0 ? null : num9, (i & 4096) != 0 ? null : bool3, (i & 8192) != 0 ? null : str2, (i & 16384) != 0 ? null : bool4, (i & 32768) != 0 ? null : num10);
    }
}
