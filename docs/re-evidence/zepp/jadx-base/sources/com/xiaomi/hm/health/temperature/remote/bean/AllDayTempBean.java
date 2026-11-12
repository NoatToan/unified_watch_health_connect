package com.xiaomi.hm.health.temperature.remote.bean;

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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002[ZB\u0093\u0001\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010!\u001a\u00020\u0011\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\u0006\u0010#\u001a\u00020\u000b\u0012\u0006\u0010$\u001a\u00020\u000b\u0012\u0006\u0010%\u001a\u00020\u0011\u0012\b\b\u0002\u0010&\u001a\u00020\u000b\u0012\b\b\u0002\u0010'\u001a\u00020\u000b\u0012\b\b\u0002\u0010(\u001a\u00020\u000b\u0012\b\b\u0002\u0010)\u001a\u00020\u000b¢\u0006\u0004\bT\u0010UB«\u0001\b\u0017\u0012\u0006\u0010V\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010!\u001a\u00020\u0011\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010%\u001a\u00020\u0011\u0012\b\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010'\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010)\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010X\u001a\u0004\u0018\u00010W¢\u0006\u0004\bT\u0010YJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\t\u0010\u0013\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0014\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0015\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÆ\u0003J\t\u0010\u0017\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003J¥\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000bHÆ\u0001J\t\u0010+\u001a\u00020\u000bHÖ\u0001J\t\u0010,\u001a\u00020\u0011HÖ\u0001J\u0013\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u001b\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u00107R\u0019\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\b=\u00107R\u0019\u0010 \u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b>\u00105\u001a\u0004\b?\u00107R\u0019\u0010!\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\"\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bD\u00105\u001a\u0004\bE\u00107R\u0019\u0010#\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bF\u00105\u001a\u0004\bG\u00107R\u0019\u0010$\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bH\u00105\u001a\u0004\bI\u00107R\u0019\u0010%\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010A\u001a\u0004\bK\u0010CR\u0019\u0010&\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bL\u00105\u001a\u0004\bM\u00107R\u0019\u0010'\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bN\u00105\u001a\u0004\bO\u00107R\u0019\u0010(\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bP\u00105\u001a\u0004\bQ\u00107R\u0019\u0010)\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bR\u00105\u001a\u0004\bS\u00107¨\u0006\\"}, d2 = {"Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "timestamp", "maxTemp", "minTemp", "avgTemp", "rawData", "userId", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "deviceType", "eventType", "subType", "appName", "timeZone", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", "Ljava/lang/String;", "getMaxTemp", "()Ljava/lang/String;", "c", "getMinTemp", GoogleApiAvailabilityLight.a, "getAvgTemp", "e", "getRawData", "f", "getUserId", "g", LogUtil.I, "getDeviceSource", "()I", "h", "getDeviceId", "i", "getDeviceMac", z.j, "getDeviceSn", hl.k, "getDeviceType", "l", "getEventType", "m", "getSubType", GoogleApiAvailabilityLight.b, "getAppName", "o", "getTimeZone", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class AllDayTempBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String maxTemp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String minTemp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String avgTemp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String rawData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int deviceSource;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceMac;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceSn;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private final int deviceType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @NotNull
    private final String eventType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @NotNull
    private final String subType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @NotNull
    private final String timeZone;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempBean;", "serializer", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<AllDayTempBean> serializer() {
            return AllDayTempBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AllDayTempBean(int i, long j, String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, String str8, int i3, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if (2033 != (i & 2033)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2033, AllDayTempBean$$serializer.INSTANCE.getDescriptor());
        }
        this.timestamp = j;
        if ((i & 2) == 0) {
            this.maxTemp = null;
        } else {
            this.maxTemp = str;
        }
        if ((i & 4) == 0) {
            this.minTemp = null;
        } else {
            this.minTemp = str2;
        }
        if ((i & 8) == 0) {
            this.avgTemp = null;
        } else {
            this.avgTemp = str3;
        }
        this.rawData = str4;
        this.userId = str5;
        this.deviceSource = i2;
        this.deviceId = str6;
        this.deviceMac = str7;
        this.deviceSn = str8;
        this.deviceType = i3;
        if ((i & 2048) == 0) {
            this.eventType = "allDayTemperature";
        } else {
            this.eventType = str9;
        }
        if ((i & 4096) == 0) {
            this.subType = "allDayTemperature";
        } else {
            this.subType = str10;
        }
        this.appName = (i & 8192) == 0 ? "com.huami.midong" : str11;
        this.timeZone = (i & 16384) == 0 ? HealthDataTimeUtils.INSTANCE.getLocalTimeZoneDisplayName() : str12;
    }

    @JvmStatic
    public static final void write$Self(@NotNull AllDayTempBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.timestamp);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.maxTemp != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.maxTemp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.minTemp != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.minTemp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.avgTemp != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.avgTemp);
        }
        output.encodeStringElement(serialDesc, 4, self.rawData);
        output.encodeStringElement(serialDesc, 5, self.userId);
        output.encodeIntElement(serialDesc, 6, self.deviceSource);
        output.encodeStringElement(serialDesc, 7, self.deviceId);
        output.encodeStringElement(serialDesc, 8, self.deviceMac);
        output.encodeStringElement(serialDesc, 9, self.deviceSn);
        output.encodeIntElement(serialDesc, 10, self.deviceType);
        if (output.shouldEncodeElementDefault(serialDesc, 11) || !Intrinsics.areEqual(self.eventType, "allDayTemperature")) {
            output.encodeStringElement(serialDesc, 11, self.eventType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || !Intrinsics.areEqual(self.subType, "allDayTemperature")) {
            output.encodeStringElement(serialDesc, 12, self.subType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || !Intrinsics.areEqual(self.appName, "com.huami.midong")) {
            output.encodeStringElement(serialDesc, 13, self.appName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || !Intrinsics.areEqual(self.timeZone, HealthDataTimeUtils.INSTANCE.getLocalTimeZoneDisplayName())) {
            output.encodeStringElement(serialDesc, 14, self.timeZone);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMaxTemp() {
        return this.maxTemp;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMinTemp() {
        return this.minTemp;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvgTemp() {
        return this.avgTemp;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRawData() {
        return this.rawData;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    public final AllDayTempBean copy(long timestamp, @Nullable String maxTemp, @Nullable String minTemp, @Nullable String avgTemp, @NotNull String rawData, @NotNull String userId, int deviceSource, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn, int deviceType, @NotNull String eventType, @NotNull String subType, @NotNull String appName, @NotNull String timeZone) {
        return new AllDayTempBean(timestamp, maxTemp, minTemp, avgTemp, rawData, userId, deviceSource, deviceId, deviceMac, deviceSn, deviceType, eventType, subType, appName, timeZone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllDayTempBean)) {
            return false;
        }
        AllDayTempBean allDayTempBean = (AllDayTempBean) other;
        return this.timestamp == allDayTempBean.timestamp && Intrinsics.areEqual(this.maxTemp, allDayTempBean.maxTemp) && Intrinsics.areEqual(this.minTemp, allDayTempBean.minTemp) && Intrinsics.areEqual(this.avgTemp, allDayTempBean.avgTemp) && Intrinsics.areEqual(this.rawData, allDayTempBean.rawData) && Intrinsics.areEqual(this.userId, allDayTempBean.userId) && this.deviceSource == allDayTempBean.deviceSource && Intrinsics.areEqual(this.deviceId, allDayTempBean.deviceId) && Intrinsics.areEqual(this.deviceMac, allDayTempBean.deviceMac) && Intrinsics.areEqual(this.deviceSn, allDayTempBean.deviceSn) && this.deviceType == allDayTempBean.deviceType && Intrinsics.areEqual(this.eventType, allDayTempBean.eventType) && Intrinsics.areEqual(this.subType, allDayTempBean.subType) && Intrinsics.areEqual(this.appName, allDayTempBean.appName) && Intrinsics.areEqual(this.timeZone, allDayTempBean.timeZone);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final String getAvgTemp() {
        return this.avgTemp;
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

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    public final String getMaxTemp() {
        return this.maxTemp;
    }

    @Nullable
    public final String getMinTemp() {
        return this.minTemp;
    }

    @NotNull
    public final String getRawData() {
        return this.rawData;
    }

    @NotNull
    public final String getSubType() {
        return this.subType;
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
        int iA = b.a(this.timestamp) * 31;
        String str = this.maxTemp;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.minTemp;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avgTemp;
        return ((((((((((((((((((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.rawData.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.deviceSource) * 31) + this.deviceId.hashCode()) * 31) + this.deviceMac.hashCode()) * 31) + this.deviceSn.hashCode()) * 31) + this.deviceType) * 31) + this.eventType.hashCode()) * 31) + this.subType.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.timeZone.hashCode();
    }

    @NotNull
    public String toString() {
        return "AllDayTempBean(timestamp=" + this.timestamp + ", maxTemp=" + this.maxTemp + ", minTemp=" + this.minTemp + ", avgTemp=" + this.avgTemp + ", rawData=" + this.rawData + ", userId=" + this.userId + ", deviceSource=" + this.deviceSource + ", deviceId=" + this.deviceId + ", deviceMac=" + this.deviceMac + ", deviceSn=" + this.deviceSn + ", deviceType=" + this.deviceType + ", eventType=" + this.eventType + ", subType=" + this.subType + ", appName=" + this.appName + ", timeZone=" + this.timeZone + ")";
    }

    public AllDayTempBean(long j, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i2, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
        this.timestamp = j;
        this.maxTemp = str;
        this.minTemp = str2;
        this.avgTemp = str3;
        this.rawData = str4;
        this.userId = str5;
        this.deviceSource = i;
        this.deviceId = str6;
        this.deviceMac = str7;
        this.deviceSn = str8;
        this.deviceType = i2;
        this.eventType = str9;
        this.subType = str10;
        this.appName = str11;
        this.timeZone = str12;
    }

    public /* synthetic */ AllDayTempBean(long j, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, str4, str5, i, str6, str7, str8, i2, (i3 & 2048) != 0 ? "allDayTemperature" : str9, (i3 & 4096) != 0 ? "allDayTemperature" : str10, (i3 & 8192) != 0 ? "com.huami.midong" : str11, (i3 & 16384) != 0 ? HealthDataTimeUtils.INSTANCE.getLocalTimeZoneDisplayName() : str12);
    }
}
