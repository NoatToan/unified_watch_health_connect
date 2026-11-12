package com.huami.rawdata_uploader.relation.remote;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276BG\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b0\u00101Be\b\u0017\u0012\u0006\u00102\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b0\u00105J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0012\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0013\u001a\u00020\u000bHÆ\u0003JY\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001d\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001e\u001a\u00020\rHÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0014\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0016\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0017\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b,\u0010'R\u0019\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b-\u0010'R\u0019\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b.\u0010'R\u0019\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b/\u0010'¨\u00068"}, d2 = {"Lcom/huami/rawdata_uploader/relation/remote/RawDataBloodPressureRequestEntity;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", BloodPressureConst.ParamKey.MEASURETIME, "zipName", "deviceType", "deviceSource", ParamKey.deviceMac, "deviceId", ParamKey.deviceSn, "firmVersion", "copy", "toString", "hashCode", "other", "", "equals", "J", "getMeasureTime", "()J", "Ljava/lang/String;", "getZipName", "()Ljava/lang/String;", LogUtil.I, "getDeviceType", "()I", "getDeviceSource", "getDeviceMac", "getDeviceId", "getDeviceSn", "getFirmVersion", "<init>", "(JLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class RawDataBloodPressureRequestEntity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String deviceId;

    @NotNull
    private final String deviceMac;

    @NotNull
    private final String deviceSn;
    private final int deviceSource;
    private final int deviceType;

    @NotNull
    private final String firmVersion;
    private final long measureTime;

    @NotNull
    private final String zipName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/rawdata_uploader/relation/remote/RawDataBloodPressureRequestEntity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/rawdata_uploader/relation/remote/RawDataBloodPressureRequestEntity;", "serializer", "<init>", "()V", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<RawDataBloodPressureRequestEntity> serializer() {
            return RawDataBloodPressureRequestEntity$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ RawDataBloodPressureRequestEntity(int i, long j, String str, int i2, int i3, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, RawDataBloodPressureRequestEntity$$serializer.INSTANCE.getDescriptor());
        }
        this.measureTime = j;
        this.zipName = str;
        this.deviceType = i2;
        this.deviceSource = i3;
        this.deviceMac = str2;
        this.deviceId = str3;
        this.deviceSn = str4;
        this.firmVersion = str5;
    }

    @JvmStatic
    public static final void write$Self(@NotNull RawDataBloodPressureRequestEntity self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.measureTime);
        output.encodeStringElement(serialDesc, 1, self.zipName);
        output.encodeIntElement(serialDesc, 2, self.deviceType);
        output.encodeIntElement(serialDesc, 3, self.deviceSource);
        output.encodeStringElement(serialDesc, 4, self.deviceMac);
        output.encodeStringElement(serialDesc, 5, self.deviceId);
        output.encodeStringElement(serialDesc, 6, self.deviceSn);
        output.encodeStringElement(serialDesc, 7, self.firmVersion);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMeasureTime() {
        return this.measureTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getZipName() {
        return this.zipName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    @NotNull
    public final RawDataBloodPressureRequestEntity copy(long measureTime, @NotNull String zipName, int deviceType, int deviceSource, @NotNull String deviceMac, @NotNull String deviceId, @NotNull String deviceSn, @NotNull String firmVersion) {
        return new RawDataBloodPressureRequestEntity(measureTime, zipName, deviceType, deviceSource, deviceMac, deviceId, deviceSn, firmVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawDataBloodPressureRequestEntity)) {
            return false;
        }
        RawDataBloodPressureRequestEntity rawDataBloodPressureRequestEntity = (RawDataBloodPressureRequestEntity) other;
        return this.measureTime == rawDataBloodPressureRequestEntity.measureTime && Intrinsics.areEqual(this.zipName, rawDataBloodPressureRequestEntity.zipName) && this.deviceType == rawDataBloodPressureRequestEntity.deviceType && this.deviceSource == rawDataBloodPressureRequestEntity.deviceSource && Intrinsics.areEqual(this.deviceMac, rawDataBloodPressureRequestEntity.deviceMac) && Intrinsics.areEqual(this.deviceId, rawDataBloodPressureRequestEntity.deviceId) && Intrinsics.areEqual(this.deviceSn, rawDataBloodPressureRequestEntity.deviceSn) && Intrinsics.areEqual(this.firmVersion, rawDataBloodPressureRequestEntity.firmVersion);
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
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    public final long getMeasureTime() {
        return this.measureTime;
    }

    @NotNull
    public final String getZipName() {
        return this.zipName;
    }

    public int hashCode() {
        return (((((((((((((b.a(this.measureTime) * 31) + this.zipName.hashCode()) * 31) + this.deviceType) * 31) + this.deviceSource) * 31) + this.deviceMac.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.deviceSn.hashCode()) * 31) + this.firmVersion.hashCode();
    }

    @NotNull
    public String toString() {
        return "RawDataBloodPressureRequestEntity(measureTime=" + this.measureTime + ", zipName=" + this.zipName + ", deviceType=" + this.deviceType + ", deviceSource=" + this.deviceSource + ", deviceMac=" + this.deviceMac + ", deviceId=" + this.deviceId + ", deviceSn=" + this.deviceSn + ", firmVersion=" + this.firmVersion + ")";
    }

    public RawDataBloodPressureRequestEntity(long j, @NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        this.measureTime = j;
        this.zipName = str;
        this.deviceType = i;
        this.deviceSource = i2;
        this.deviceMac = str2;
        this.deviceId = str3;
        this.deviceSn = str4;
        this.firmVersion = str5;
    }
}
