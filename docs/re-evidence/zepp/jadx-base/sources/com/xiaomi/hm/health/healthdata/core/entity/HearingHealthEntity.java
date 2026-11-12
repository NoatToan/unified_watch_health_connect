package com.xiaomi.hm.health.healthdata.core.entity;

import androidx.room.Entity;
import com.baidu.ocr.sdk.utils.LogUtil;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Entity(primaryKeys = {"timestamp", "userId"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B1\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b0\u00101BA\b\u0017\u0012\u0006\u00102\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b0\u00105J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000fHÆ\u0001J\t\u0010\u0017\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R(\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b.\u0010/\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00068"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/entity/HearingHealthEntity;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "component4", "", "component5", "timestamp", "userId", "eventType", "data", "status", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "c", "getEventType", GoogleApiAvailabilityLight.a, "getData", "e", LogUtil.I, "getStatus", "()I", "setStatus", "(I)V", "getStatus$annotations", "()V", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class HearingHealthEntity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String eventType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private int status;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/entity/HearingHealthEntity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/xiaomi/hm/health/healthdata/core/entity/HearingHealthEntity;", "serializer", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<HearingHealthEntity> serializer() {
            return HearingHealthEntity$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ HearingHealthEntity(int i, long j, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, HearingHealthEntity$$serializer.INSTANCE.getDescriptor());
        }
        this.timestamp = j;
        this.userId = str;
        this.eventType = str2;
        this.data = str3;
        this.status = 0;
    }

    public static /* synthetic */ HearingHealthEntity copy$default(HearingHealthEntity hearingHealthEntity, long j, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = hearingHealthEntity.timestamp;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = hearingHealthEntity.userId;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = hearingHealthEntity.eventType;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = hearingHealthEntity.data;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            i = hearingHealthEntity.status;
        }
        return hearingHealthEntity.copy(j2, str4, str5, str6, i);
    }

    @Transient
    public static /* synthetic */ void getStatus$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull HearingHealthEntity self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.timestamp);
        output.encodeStringElement(serialDesc, 1, self.userId);
        output.encodeStringElement(serialDesc, 2, self.eventType);
        output.encodeStringElement(serialDesc, 3, self.data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final HearingHealthEntity copy(long timestamp, @NotNull String userId, @NotNull String eventType, @NotNull String data, int status) {
        return new HearingHealthEntity(timestamp, userId, eventType, data, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HearingHealthEntity)) {
            return false;
        }
        HearingHealthEntity hearingHealthEntity = (HearingHealthEntity) other;
        return this.timestamp == hearingHealthEntity.timestamp && Intrinsics.areEqual(this.userId, hearingHealthEntity.userId) && Intrinsics.areEqual(this.eventType, hearingHealthEntity.eventType) && Intrinsics.areEqual(this.data, hearingHealthEntity.data) && this.status == hearingHealthEntity.status;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((b.a(this.timestamp) * 31) + this.userId.hashCode()) * 31) + this.eventType.hashCode()) * 31) + this.data.hashCode()) * 31) + this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @NotNull
    public String toString() {
        return "HearingHealthEntity(timestamp=" + this.timestamp + ", userId=" + this.userId + ", eventType=" + this.eventType + ", data=" + this.data + ", status=" + this.status + ")";
    }

    public HearingHealthEntity(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        this.timestamp = j;
        this.userId = str;
        this.eventType = str2;
        this.data = str3;
        this.status = i;
    }

    public /* synthetic */ HearingHealthEntity(long j, String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, (i2 & 16) != 0 ? 0 : i);
    }
}
