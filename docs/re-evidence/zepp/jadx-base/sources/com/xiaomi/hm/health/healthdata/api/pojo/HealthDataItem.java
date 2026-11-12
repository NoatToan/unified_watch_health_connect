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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B?\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b1\u00102BW\b\u0017\u0012\u0006\u00103\u001a\u00020\u0019\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u0015\u001a\u00020\f\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b1\u00106J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\fHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0012\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\u0013\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0014\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\"\u0010\u0015\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010%\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010'R$\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010\u001f\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010!¨\u00069"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/api/pojo/HealthDataItem;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "", "component3", "component4", "component5", "component6", "eventType", "subType", "lastUpdateTime", "userId", "uploadTime", "value", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "b", "getSubType", "c", "J", "getLastUpdateTime", "()J", GoogleApiAvailabilityLight.a, "getUserId", "e", "getUploadTime", "getUploadTime$annotations", "()V", "f", "getValue", "getValue$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class HealthDataItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String eventType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String subType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long lastUpdateTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final long uploadTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/api/pojo/HealthDataItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/xiaomi/hm/health/healthdata/api/pojo/HealthDataItem;", "serializer", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<HealthDataItem> serializer() {
            return HealthDataItem$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ HealthDataItem(int i, String str, String str2, long j, String str3, @SerialName("timestamp") long j2, @SerialName("rawValue") String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i, 11, HealthDataItem$$serializer.INSTANCE.getDescriptor());
        }
        this.eventType = str;
        this.subType = str2;
        if ((i & 4) == 0) {
            this.lastUpdateTime = 0L;
        } else {
            this.lastUpdateTime = j;
        }
        this.userId = str3;
        if ((i & 16) == 0) {
            this.uploadTime = 0L;
        } else {
            this.uploadTime = j2;
        }
        if ((i & 32) == 0) {
            this.value = null;
        } else {
            this.value = str4;
        }
    }

    @SerialName("timestamp")
    public static /* synthetic */ void getUploadTime$annotations() {
    }

    @SerialName("rawValue")
    public static /* synthetic */ void getValue$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull HealthDataItem self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.eventType);
        output.encodeStringElement(serialDesc, 1, self.subType);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.lastUpdateTime != 0) {
            output.encodeLongElement(serialDesc, 2, self.lastUpdateTime);
        }
        output.encodeStringElement(serialDesc, 3, self.userId);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.uploadTime != 0) {
            output.encodeLongElement(serialDesc, 4, self.uploadTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.value != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.value);
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
    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getUploadTime() {
        return this.uploadTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final HealthDataItem copy(@NotNull String eventType, @NotNull String subType, long lastUpdateTime, @NotNull String userId, long uploadTime, @Nullable String value) {
        return new HealthDataItem(eventType, subType, lastUpdateTime, userId, uploadTime, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthDataItem)) {
            return false;
        }
        HealthDataItem healthDataItem = (HealthDataItem) other;
        return Intrinsics.areEqual(this.eventType, healthDataItem.eventType) && Intrinsics.areEqual(this.subType, healthDataItem.subType) && this.lastUpdateTime == healthDataItem.lastUpdateTime && Intrinsics.areEqual(this.userId, healthDataItem.userId) && this.uploadTime == healthDataItem.uploadTime && Intrinsics.areEqual(this.value, healthDataItem.value);
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

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.eventType.hashCode() * 31) + this.subType.hashCode()) * 31) + b.a(this.lastUpdateTime)) * 31) + this.userId.hashCode()) * 31) + b.a(this.uploadTime)) * 31;
        String str = this.value;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "HealthDataItem(eventType=" + this.eventType + ", subType=" + this.subType + ", lastUpdateTime=" + this.lastUpdateTime + ", userId=" + this.userId + ", uploadTime=" + this.uploadTime + ", value=" + this.value + ")";
    }

    public HealthDataItem(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, long j2, @Nullable String str4) {
        this.eventType = str;
        this.subType = str2;
        this.lastUpdateTime = j;
        this.userId = str3;
        this.uploadTime = j2;
        this.value = str4;
    }

    public /* synthetic */ HealthDataItem(String str, String str2, long j, String str3, long j2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? 0L : j, str3, (i & 16) != 0 ? 0L : j2, (i & 32) != 0 ? null : str4);
    }
}
