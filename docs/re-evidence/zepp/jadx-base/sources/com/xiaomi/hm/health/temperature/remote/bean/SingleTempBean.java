package com.xiaomi.hm.health.temperature.remote.bean;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import defpackage.b;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0002VUB{\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010!\u001a\u00020\u000f\u0012\b\b\u0002\u0010\"\u001a\u00020\u000b\u0012\b\b\u0002\u0010#\u001a\u00020\u000b\u0012\b\b\u0002\u0010$\u001a\u00020\u000b\u0012\b\b\u0002\u0010%\u001a\u00020\u000b¢\u0006\u0004\bO\u0010PB\u009b\u0001\b\u0017\u0012\u0006\u0010Q\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010!\u001a\u00020\u000f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010%\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010S\u001a\u0004\u0018\u00010R¢\u0006\u0004\bO\u0010TJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0012\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0013\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0015\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÆ\u0003J\u008d\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000bHÆ\u0001J\t\u0010'\u001a\u00020\u000bHÖ\u0001J\t\u0010(\u001a\u00020\u000fHÖ\u0001J\u0013\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0019\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R$\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u00101\u0012\u0004\b8\u00105\u001a\u0004\b7\u00103R\u0019\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b:\u00103R\u0019\u0010\u001d\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u001e\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u00103R\u0019\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bA\u00101\u001a\u0004\bB\u00103R\u0019\u0010 \u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bC\u00101\u001a\u0004\bD\u00103R\u0019\u0010!\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\bE\u0010<\u001a\u0004\bF\u0010>R\u0019\u0010\"\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bG\u00101\u001a\u0004\bH\u00103R\u0019\u0010#\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bI\u00101\u001a\u0004\bJ\u00103R\u0019\u0010$\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bK\u00101\u001a\u0004\bL\u00103R\u0019\u0010%\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bM\u00101\u001a\u0004\bN\u00103¨\u0006W"}, d2 = {"Lcom/xiaomi/hm/health/temperature/remote/bean/SingleTempBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "component4", "", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "timestamp", "temp", "envTemp", "userId", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "deviceType", "eventType", "subType", "appName", "timeZone", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", "Ljava/lang/String;", "getTemp", "()Ljava/lang/String;", "getTemp$annotations", "()V", "c", "getEnvTemp", "getEnvTemp$annotations", GoogleApiAvailabilityLight.a, "getUserId", "e", LogUtil.I, "getDeviceSource", "()I", "f", "getDeviceId", "g", "getDeviceMac", "h", "getDeviceSn", "i", "getDeviceType", z.j, "getEventType", hl.k, "getSubType", "l", "getAppName", "m", "getTimeZone", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class SingleTempBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String temp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String envTemp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int deviceSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceMac;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceSn;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final int deviceType;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @NotNull
    private final String eventType;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @NotNull
    private final String subType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @NotNull
    private final String timeZone;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/temperature/remote/bean/SingleTempBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/xiaomi/hm/health/temperature/remote/bean/SingleTempBean;", "serializer", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<SingleTempBean> serializer() {
            return SingleTempBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SingleTempBean(int i, long j, @SerialName("tempCalculateVal") String str, @SerialName("envCalculateVal") String str2, String str3, int i2, String str4, String str5, String str6, int i3, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (507 != (i & TypedValues.PositionType.TYPE_PERCENT_Y)) {
            PluginExceptionsKt.throwMissingFieldException(i, TypedValues.PositionType.TYPE_PERCENT_Y, SingleTempBean$$serializer.INSTANCE.getDescriptor());
        }
        this.timestamp = j;
        this.temp = str;
        this.envTemp = (i & 4) == 0 ? null : str2;
        this.userId = str3;
        this.deviceSource = i2;
        this.deviceId = str4;
        this.deviceMac = str5;
        this.deviceSn = str6;
        this.deviceType = i3;
        if ((i & 512) == 0) {
            this.eventType = "singleTemperature";
        } else {
            this.eventType = str7;
        }
        if ((i & 1024) == 0) {
            this.subType = "singleTemperature";
        } else {
            this.subType = str8;
        }
        this.appName = (i & 2048) == 0 ? "com.huami.midong" : str9;
        this.timeZone = (i & 4096) == 0 ? HealthDataTimeUtils.INSTANCE.getLocalTimeZoneDisplayName() : str10;
    }

    @SerialName("envCalculateVal")
    public static /* synthetic */ void getEnvTemp$annotations() {
    }

    @SerialName("tempCalculateVal")
    public static /* synthetic */ void getTemp$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull SingleTempBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.timestamp);
        output.encodeStringElement(serialDesc, 1, self.temp);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.envTemp != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.envTemp);
        }
        output.encodeStringElement(serialDesc, 3, self.userId);
        output.encodeIntElement(serialDesc, 4, self.deviceSource);
        output.encodeStringElement(serialDesc, 5, self.deviceId);
        output.encodeStringElement(serialDesc, 6, self.deviceMac);
        output.encodeStringElement(serialDesc, 7, self.deviceSn);
        output.encodeIntElement(serialDesc, 8, self.deviceType);
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !Intrinsics.areEqual(self.eventType, "singleTemperature")) {
            output.encodeStringElement(serialDesc, 9, self.eventType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || !Intrinsics.areEqual(self.subType, "singleTemperature")) {
            output.encodeStringElement(serialDesc, 10, self.subType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || !Intrinsics.areEqual(self.appName, "com.huami.midong")) {
            output.encodeStringElement(serialDesc, 11, self.appName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || !Intrinsics.areEqual(self.timeZone, HealthDataTimeUtils.INSTANCE.getLocalTimeZoneDisplayName())) {
            output.encodeStringElement(serialDesc, 12, self.timeZone);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTemp() {
        return this.temp;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEnvTemp() {
        return this.envTemp;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final SingleTempBean copy(long timestamp, @NotNull String temp, @Nullable String envTemp, @NotNull String userId, int deviceSource, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn, int deviceType, @NotNull String eventType, @NotNull String subType, @NotNull String appName, @NotNull String timeZone) {
        return new SingleTempBean(timestamp, temp, envTemp, userId, deviceSource, deviceId, deviceMac, deviceSn, deviceType, eventType, subType, appName, timeZone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleTempBean)) {
            return false;
        }
        SingleTempBean singleTempBean = (SingleTempBean) other;
        return this.timestamp == singleTempBean.timestamp && Intrinsics.areEqual(this.temp, singleTempBean.temp) && Intrinsics.areEqual(this.envTemp, singleTempBean.envTemp) && Intrinsics.areEqual(this.userId, singleTempBean.userId) && this.deviceSource == singleTempBean.deviceSource && Intrinsics.areEqual(this.deviceId, singleTempBean.deviceId) && Intrinsics.areEqual(this.deviceMac, singleTempBean.deviceMac) && Intrinsics.areEqual(this.deviceSn, singleTempBean.deviceSn) && this.deviceType == singleTempBean.deviceType && Intrinsics.areEqual(this.eventType, singleTempBean.eventType) && Intrinsics.areEqual(this.subType, singleTempBean.subType) && Intrinsics.areEqual(this.appName, singleTempBean.appName) && Intrinsics.areEqual(this.timeZone, singleTempBean.timeZone);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final String getEnvTemp() {
        return this.envTemp;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    public final String getSubType() {
        return this.subType;
    }

    @NotNull
    public final String getTemp() {
        return this.temp;
    }

    @NotNull
    public final String getTimeZone() {
        return this.timeZone;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = ((b.a(this.timestamp) * 31) + this.temp.hashCode()) * 31;
        String str = this.envTemp;
        return ((((((((((((((((((((iA + (str == null ? 0 : str.hashCode())) * 31) + this.userId.hashCode()) * 31) + this.deviceSource) * 31) + this.deviceId.hashCode()) * 31) + this.deviceMac.hashCode()) * 31) + this.deviceSn.hashCode()) * 31) + this.deviceType) * 31) + this.eventType.hashCode()) * 31) + this.subType.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.timeZone.hashCode();
    }

    @NotNull
    public String toString() {
        return "SingleTempBean(timestamp=" + this.timestamp + ", temp=" + this.temp + ", envTemp=" + this.envTemp + ", userId=" + this.userId + ", deviceSource=" + this.deviceSource + ", deviceId=" + this.deviceId + ", deviceMac=" + this.deviceMac + ", deviceSn=" + this.deviceSn + ", deviceType=" + this.deviceType + ", eventType=" + this.eventType + ", subType=" + this.subType + ", appName=" + this.appName + ", timeZone=" + this.timeZone + ")";
    }

    public SingleTempBean(long j, @NotNull String str, @Nullable String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i2, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        this.timestamp = j;
        this.temp = str;
        this.envTemp = str2;
        this.userId = str3;
        this.deviceSource = i;
        this.deviceId = str4;
        this.deviceMac = str5;
        this.deviceSn = str6;
        this.deviceType = i2;
        this.eventType = str7;
        this.subType = str8;
        this.appName = str9;
        this.timeZone = str10;
    }

    public /* synthetic */ SingleTempBean(long j, String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, String str7, String str8, String str9, String str10, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i3 & 4) != 0 ? null : str2, str3, i, str4, str5, str6, i2, (i3 & 512) != 0 ? "singleTemperature" : str7, (i3 & 1024) != 0 ? "singleTemperature" : str8, (i3 & 2048) != 0 ? "com.huami.midong" : str9, (i3 & 4096) != 0 ? HealthDataTimeUtils.INSTANCE.getLocalTimeZoneDisplayName() : str10);
    }
}
