package com.xiaomi.hm.health.healthdata.api.pojo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBO\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b<\u0010=Bs\b\u0017\u0012\u0006\u0010>\u001a\u00020\u001f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\b<\u0010AJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\tHÆ\u0003J\t\u0010\u0011\u001a\u00020\tHÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003Jc\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\tHÆ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010 \u001a\u00020\u001fHÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0014\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0015\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\u0016\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\"\u0010\u0017\u001a\u00020\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u0019\u0010\u0018\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\u0019\u0010\u0019\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b5\u0010'R\u0019\u0010\u001a\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'R\u0019\u0010\u001b\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010%\u001a\u0004\b9\u0010'R\u0019\u0010\u001c\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010%\u001a\u0004\b;\u0010'¨\u0006D"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/api/pojo/HealthDataFindResponse;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "component7", "component8", "component9", "userId", "eventType", "subType", "uploadTime", "lastUpdateTime", "sbp", "dbp", "deviceSource", "measureType", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "getEventType", "c", "getSubType", GoogleApiAvailabilityLight.a, "J", "getUploadTime", "()J", "getUploadTime$annotations", "()V", "e", "getLastUpdateTime", "f", "getSbp", "g", "getDbp", "h", "getDeviceSource", "i", "getMeasureType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class HealthDataFindResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String eventType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String subType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long uploadTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final long lastUpdateTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String sbp;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final String dbp;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceSource;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    private final String measureType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/api/pojo/HealthDataFindResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/xiaomi/hm/health/healthdata/api/pojo/HealthDataFindResponse;", "serializer", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<HealthDataFindResponse> serializer() {
            return HealthDataFindResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ HealthDataFindResponse(int i, String str, String str2, String str3, @SerialName("timestamp") long j, long j2, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & 511)) {
            PluginExceptionsKt.throwMissingFieldException(i, 511, HealthDataFindResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = str;
        this.eventType = str2;
        this.subType = str3;
        this.uploadTime = j;
        this.lastUpdateTime = j2;
        this.sbp = str4;
        this.dbp = str5;
        this.deviceSource = str6;
        this.measureType = str7;
    }

    @SerialName("timestamp")
    public static /* synthetic */ void getUploadTime$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull HealthDataFindResponse self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.userId);
        output.encodeStringElement(serialDesc, 1, self.eventType);
        output.encodeStringElement(serialDesc, 2, self.subType);
        output.encodeLongElement(serialDesc, 3, self.uploadTime);
        output.encodeLongElement(serialDesc, 4, self.lastUpdateTime);
        output.encodeStringElement(serialDesc, 5, self.sbp);
        output.encodeStringElement(serialDesc, 6, self.dbp);
        output.encodeStringElement(serialDesc, 7, self.deviceSource);
        output.encodeStringElement(serialDesc, 8, self.measureType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getUploadTime() {
        return this.uploadTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSbp() {
        return this.sbp;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDbp() {
        return this.dbp;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMeasureType() {
        return this.measureType;
    }

    @NotNull
    public final HealthDataFindResponse copy(@NotNull String userId, @NotNull String eventType, @NotNull String subType, long uploadTime, long lastUpdateTime, @NotNull String sbp, @NotNull String dbp, @NotNull String deviceSource, @NotNull String measureType) {
        return new HealthDataFindResponse(userId, eventType, subType, uploadTime, lastUpdateTime, sbp, dbp, deviceSource, measureType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthDataFindResponse)) {
            return false;
        }
        HealthDataFindResponse healthDataFindResponse = (HealthDataFindResponse) other;
        return Intrinsics.areEqual(this.userId, healthDataFindResponse.userId) && Intrinsics.areEqual(this.eventType, healthDataFindResponse.eventType) && Intrinsics.areEqual(this.subType, healthDataFindResponse.subType) && this.uploadTime == healthDataFindResponse.uploadTime && this.lastUpdateTime == healthDataFindResponse.lastUpdateTime && Intrinsics.areEqual(this.sbp, healthDataFindResponse.sbp) && Intrinsics.areEqual(this.dbp, healthDataFindResponse.dbp) && Intrinsics.areEqual(this.deviceSource, healthDataFindResponse.deviceSource) && Intrinsics.areEqual(this.measureType, healthDataFindResponse.measureType);
    }

    @NotNull
    public final String getDbp() {
        return this.dbp;
    }

    @NotNull
    public final String getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @NotNull
    public final String getMeasureType() {
        return this.measureType;
    }

    @NotNull
    public final String getSbp() {
        return this.sbp;
    }

    @NotNull
    public final String getSubType() {
        return this.subType;
    }

    public final long getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((((((this.userId.hashCode() * 31) + this.eventType.hashCode()) * 31) + this.subType.hashCode()) * 31) + b.a(this.uploadTime)) * 31) + b.a(this.lastUpdateTime)) * 31) + this.sbp.hashCode()) * 31) + this.dbp.hashCode()) * 31) + this.deviceSource.hashCode()) * 31) + this.measureType.hashCode();
    }

    @NotNull
    public String toString() {
        return "HealthDataFindResponse(userId=" + this.userId + ", eventType=" + this.eventType + ", subType=" + this.subType + ", uploadTime=" + this.uploadTime + ", lastUpdateTime=" + this.lastUpdateTime + ", sbp=" + this.sbp + ", dbp=" + this.dbp + ", deviceSource=" + this.deviceSource + ", measureType=" + this.measureType + ")";
    }

    public HealthDataFindResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, long j2, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        this.userId = str;
        this.eventType = str2;
        this.subType = str3;
        this.uploadTime = j;
        this.lastUpdateTime = j2;
        this.sbp = str4;
        this.dbp = str5;
        this.deviceSource = str6;
        this.measureType = str7;
    }
}
