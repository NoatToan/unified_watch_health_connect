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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B?\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b+\u0010,BU\b\u0017\u0012\u0006\u0010-\u001a\u00020\u001b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b+\u00100J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JP\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0012\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0013\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\u0014\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\u0015\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b(\u0010\"R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b*\u0010\u0011¨\u00063"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteEntity;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "()Ljava/lang/Long;", "userId", "eventType", "subType", "timestamp", "rawValue", "lastUpdateTime", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Long;)Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteEntity;", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "getEventType", "getSubType", "J", "getTimestamp", "()J", "getRawValue", "Ljava/lang/Long;", "getLastUpdateTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Long;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class BloodPressureRemoteEntity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String eventType;

    @Nullable
    private final Long lastUpdateTime;

    @Nullable
    private final String rawValue;

    @NotNull
    private final String subType;
    private final long timestamp;

    @NotNull
    private final String userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteEntity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteEntity;", "serializer", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<BloodPressureRemoteEntity> serializer() {
            return BloodPressureRemoteEntity$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BloodPressureRemoteEntity(int i, String str, String str2, String str3, long j, String str4, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, BloodPressureRemoteEntity$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = str;
        this.eventType = str2;
        this.subType = str3;
        this.timestamp = j;
        if ((i & 16) == 0) {
            this.rawValue = null;
        } else {
            this.rawValue = str4;
        }
        if ((i & 32) == 0) {
            this.lastUpdateTime = null;
        } else {
            this.lastUpdateTime = l;
        }
    }

    public static /* synthetic */ BloodPressureRemoteEntity copy$default(BloodPressureRemoteEntity bloodPressureRemoteEntity, String str, String str2, String str3, long j, String str4, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bloodPressureRemoteEntity.userId;
        }
        if ((i & 2) != 0) {
            str2 = bloodPressureRemoteEntity.eventType;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = bloodPressureRemoteEntity.subType;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            j = bloodPressureRemoteEntity.timestamp;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            str4 = bloodPressureRemoteEntity.rawValue;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            l = bloodPressureRemoteEntity.lastUpdateTime;
        }
        return bloodPressureRemoteEntity.copy(str, str5, str6, j2, str7, l);
    }

    @JvmStatic
    public static final void write$Self(@NotNull BloodPressureRemoteEntity self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.userId);
        output.encodeStringElement(serialDesc, 1, self.eventType);
        output.encodeStringElement(serialDesc, 2, self.subType);
        output.encodeLongElement(serialDesc, 3, self.timestamp);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.rawValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.rawValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.lastUpdateTime != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, LongSerializer.INSTANCE, self.lastUpdateTime);
        }
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
    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @NotNull
    public final BloodPressureRemoteEntity copy(@NotNull String userId, @NotNull String eventType, @NotNull String subType, long timestamp, @Nullable String rawValue, @Nullable Long lastUpdateTime) {
        return new BloodPressureRemoteEntity(userId, eventType, subType, timestamp, rawValue, lastUpdateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureRemoteEntity)) {
            return false;
        }
        BloodPressureRemoteEntity bloodPressureRemoteEntity = (BloodPressureRemoteEntity) other;
        return Intrinsics.areEqual(this.userId, bloodPressureRemoteEntity.userId) && Intrinsics.areEqual(this.eventType, bloodPressureRemoteEntity.eventType) && Intrinsics.areEqual(this.subType, bloodPressureRemoteEntity.subType) && this.timestamp == bloodPressureRemoteEntity.timestamp && Intrinsics.areEqual(this.rawValue, bloodPressureRemoteEntity.rawValue) && Intrinsics.areEqual(this.lastUpdateTime, bloodPressureRemoteEntity.lastUpdateTime);
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    public final Long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @Nullable
    public final String getRawValue() {
        return this.rawValue;
    }

    @NotNull
    public final String getSubType() {
        return this.subType;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = ((((((this.userId.hashCode() * 31) + this.eventType.hashCode()) * 31) + this.subType.hashCode()) * 31) + b.a(this.timestamp)) * 31;
        String str = this.rawValue;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.lastUpdateTime;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BloodPressureRemoteEntity(userId=" + this.userId + ", eventType=" + this.eventType + ", subType=" + this.subType + ", timestamp=" + this.timestamp + ", rawValue=" + this.rawValue + ", lastUpdateTime=" + this.lastUpdateTime + ")";
    }

    public BloodPressureRemoteEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @Nullable String str4, @Nullable Long l) {
        this.userId = str;
        this.eventType = str2;
        this.subType = str3;
        this.timestamp = j;
        this.rawValue = str4;
        this.lastUpdateTime = l;
    }

    public /* synthetic */ BloodPressureRemoteEntity(String str, String str2, String str3, long j, String str4, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l);
    }
}
