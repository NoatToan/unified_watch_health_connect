package com.huami.bloodpressure_core.dc.remote;

import androidx.annotation.Keep;
import com.huami.bloodpressure_core.dc.local.BloodPressureVo;
import com.huami.bloodpressure_core.dc.local.BloodPressureVo$$serializer;
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

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B3\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b(\u0010)BK\b\u0017\u0012\u0006\u0010*\u001a\u00020\u0018\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b(\u0010-J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0012\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u0013\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0014\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010'¨\u00060"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestV2Entity;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "", "component3", "component4", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureVo;", "component5", "eventType", "subType", "timestamp", "userId", "value", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "getSubType", "J", "getTimestamp", "()J", "getUserId", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureVo;", "getValue", "()Lcom/huami/bloodpressure_core/dc/local/BloodPressureVo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lcom/huami/bloodpressure_core/dc/local/BloodPressureVo;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Lcom/huami/bloodpressure_core/dc/local/BloodPressureVo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class BloodPressureRequestV2Entity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String eventType;

    @NotNull
    private final String subType;
    private final long timestamp;

    @NotNull
    private final String userId;

    @Nullable
    private final BloodPressureVo value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestV2Entity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestV2Entity;", "serializer", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<BloodPressureRequestV2Entity> serializer() {
            return BloodPressureRequestV2Entity$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BloodPressureRequestV2Entity(int i, String str, String str2, long j, String str3, BloodPressureVo bloodPressureVo, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, BloodPressureRequestV2Entity$$serializer.INSTANCE.getDescriptor());
        }
        this.eventType = str;
        this.subType = str2;
        this.timestamp = j;
        this.userId = str3;
        if ((i & 16) == 0) {
            this.value = null;
        } else {
            this.value = bloodPressureVo;
        }
    }

    public static /* synthetic */ BloodPressureRequestV2Entity copy$default(BloodPressureRequestV2Entity bloodPressureRequestV2Entity, String str, String str2, long j, String str3, BloodPressureVo bloodPressureVo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bloodPressureRequestV2Entity.eventType;
        }
        if ((i & 2) != 0) {
            str2 = bloodPressureRequestV2Entity.subType;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = bloodPressureRequestV2Entity.timestamp;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = bloodPressureRequestV2Entity.userId;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            bloodPressureVo = bloodPressureRequestV2Entity.value;
        }
        return bloodPressureRequestV2Entity.copy(str, str4, j2, str5, bloodPressureVo);
    }

    @JvmStatic
    public static final void write$Self(@NotNull BloodPressureRequestV2Entity self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.eventType);
        output.encodeStringElement(serialDesc, 1, self.subType);
        output.encodeLongElement(serialDesc, 2, self.timestamp);
        output.encodeStringElement(serialDesc, 3, self.userId);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.value != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, BloodPressureVo$$serializer.INSTANCE, self.value);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BloodPressureVo getValue() {
        return this.value;
    }

    @NotNull
    public final BloodPressureRequestV2Entity copy(@NotNull String eventType, @NotNull String subType, long timestamp, @NotNull String userId, @Nullable BloodPressureVo value) {
        return new BloodPressureRequestV2Entity(eventType, subType, timestamp, userId, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureRequestV2Entity)) {
            return false;
        }
        BloodPressureRequestV2Entity bloodPressureRequestV2Entity = (BloodPressureRequestV2Entity) other;
        return Intrinsics.areEqual(this.eventType, bloodPressureRequestV2Entity.eventType) && Intrinsics.areEqual(this.subType, bloodPressureRequestV2Entity.subType) && this.timestamp == bloodPressureRequestV2Entity.timestamp && Intrinsics.areEqual(this.userId, bloodPressureRequestV2Entity.userId) && Intrinsics.areEqual(this.value, bloodPressureRequestV2Entity.value);
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
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

    @Nullable
    public final BloodPressureVo getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((((((this.eventType.hashCode() * 31) + this.subType.hashCode()) * 31) + b.a(this.timestamp)) * 31) + this.userId.hashCode()) * 31;
        BloodPressureVo bloodPressureVo = this.value;
        return iHashCode + (bloodPressureVo == null ? 0 : bloodPressureVo.hashCode());
    }

    @NotNull
    public String toString() {
        return "BloodPressureRequestV2Entity(eventType=" + this.eventType + ", subType=" + this.subType + ", timestamp=" + this.timestamp + ", userId=" + this.userId + ", value=" + this.value + ")";
    }

    public BloodPressureRequestV2Entity(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @Nullable BloodPressureVo bloodPressureVo) {
        this.eventType = str;
        this.subType = str2;
        this.timestamp = j;
        this.userId = str3;
        this.value = bloodPressureVo;
    }

    public /* synthetic */ BloodPressureRequestV2Entity(String str, String str2, long j, String str3, BloodPressureVo bloodPressureVo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, (i & 16) != 0 ? null : bloodPressureVo);
    }
}
