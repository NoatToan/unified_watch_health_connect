package com.huami.bloodpressure_core.dc.remote;

import androidx.annotation.Keep;
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

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B;\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b+\u0010,BW\b\u0017\u0012\u0006\u0010-\u001a\u00020\u0019\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b+\u00100J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\tHÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0013\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b$\u0010 R\"\u0010\u0014\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010!\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010#R\u0019\u0010\u0015\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b(\u0010 R\"\u0010\u0016\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001e\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010 ¨\u00063"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestEntity;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "eventType", "lastUpdateTime", "subType", "uploadTime", "userId", "value", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "J", "getLastUpdateTime", "()J", "getSubType", "getUploadTime", "getUploadTime$annotations", "()V", "getUserId", "getValue", "getValue$annotations", "<init>", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class BloodPressureRequestEntity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String eventType;
    private final long lastUpdateTime;

    @NotNull
    private final String subType;
    private final long uploadTime;

    @NotNull
    private final String userId;

    @NotNull
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestEntity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestEntity;", "serializer", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<BloodPressureRequestEntity> serializer() {
            return BloodPressureRequestEntity$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BloodPressureRequestEntity(int i, String str, long j, String str2, @SerialName("timestamp") long j2, String str3, @SerialName("rawValue") String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (60 != (i & 60)) {
            PluginExceptionsKt.throwMissingFieldException(i, 60, BloodPressureRequestEntity$$serializer.INSTANCE.getDescriptor());
        }
        this.eventType = (i & 1) == 0 ? "health_data" : str;
        if ((i & 2) == 0) {
            this.lastUpdateTime = 0L;
        } else {
            this.lastUpdateTime = j;
        }
        this.subType = str2;
        this.uploadTime = j2;
        this.userId = str3;
        this.value = str4;
    }

    @SerialName("timestamp")
    public static /* synthetic */ void getUploadTime$annotations() {
    }

    @SerialName("rawValue")
    public static /* synthetic */ void getValue$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull BloodPressureRequestEntity self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.eventType, "health_data")) {
            output.encodeStringElement(serialDesc, 0, self.eventType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.lastUpdateTime != 0) {
            output.encodeLongElement(serialDesc, 1, self.lastUpdateTime);
        }
        output.encodeStringElement(serialDesc, 2, self.subType);
        output.encodeLongElement(serialDesc, 3, self.uploadTime);
        output.encodeStringElement(serialDesc, 4, self.userId);
        output.encodeStringElement(serialDesc, 5, self.value);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
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

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final BloodPressureRequestEntity copy(@NotNull String eventType, long lastUpdateTime, @NotNull String subType, long uploadTime, @NotNull String userId, @NotNull String value) {
        return new BloodPressureRequestEntity(eventType, lastUpdateTime, subType, uploadTime, userId, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureRequestEntity)) {
            return false;
        }
        BloodPressureRequestEntity bloodPressureRequestEntity = (BloodPressureRequestEntity) other;
        return Intrinsics.areEqual(this.eventType, bloodPressureRequestEntity.eventType) && this.lastUpdateTime == bloodPressureRequestEntity.lastUpdateTime && Intrinsics.areEqual(this.subType, bloodPressureRequestEntity.subType) && this.uploadTime == bloodPressureRequestEntity.uploadTime && Intrinsics.areEqual(this.userId, bloodPressureRequestEntity.userId) && Intrinsics.areEqual(this.value, bloodPressureRequestEntity.value);
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
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

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((((this.eventType.hashCode() * 31) + b.a(this.lastUpdateTime)) * 31) + this.subType.hashCode()) * 31) + b.a(this.uploadTime)) * 31) + this.userId.hashCode()) * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "BloodPressureRequestEntity(eventType=" + this.eventType + ", lastUpdateTime=" + this.lastUpdateTime + ", subType=" + this.subType + ", uploadTime=" + this.uploadTime + ", userId=" + this.userId + ", value=" + this.value + ")";
    }

    public BloodPressureRequestEntity(@NotNull String str, long j, @NotNull String str2, long j2, @NotNull String str3, @NotNull String str4) {
        this.eventType = str;
        this.lastUpdateTime = j;
        this.subType = str2;
        this.uploadTime = j2;
        this.userId = str3;
        this.value = str4;
    }

    public /* synthetic */ BloodPressureRequestEntity(String str, long j, String str2, long j2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "health_data" : str, (i & 2) != 0 ? 0L : j, str2, j2, str3, str4);
    }
}
