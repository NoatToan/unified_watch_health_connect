package com.huami.healthlabel.entry;

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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 62\u00020\u0001:\u000276B3\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b0\u00101BU\b\u0017\u0012\u0006\u00102\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b0\u00105J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\tHÆ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010!\u001a\u0004\b$\u0010%R\"\u0010\u0012\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u001d\u0012\u0004\b)\u0010!\u001a\u0004\b(\u0010\u001fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u001d\u0012\u0004\b,\u0010!\u001a\u0004\b+\u0010\u001fR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\u001d\u0012\u0004\b/\u0010!\u001a\u0004\b.\u0010\u001f¨\u00068"}, d2 = {"Lcom/huami/healthlabel/entry/HealthTagRecord;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "component4", "component5", "userId", "timestamp", "content", "eventType", "subType", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "getUserId$annotations", "()V", "b", "J", "getTimestamp", "()J", "getTimestamp$annotations", "c", "getContent", "getContent$annotations", GoogleApiAvailabilityLight.a, "getEventType", "getEventType$annotations", "e", "getSubType", "getSubType$annotations", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class HealthTagRecord {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String eventType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String subType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/healthlabel/entry/HealthTagRecord$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/healthlabel/entry/HealthTagRecord;", "serializer", "<init>", "()V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<HealthTagRecord> serializer() {
            return HealthTagRecord$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ HealthTagRecord(int i, @SerialName("userId") String str, @SerialName("timestamp") long j, @SerialName("content") String str2, @SerialName("eventType") String str3, @SerialName("subType") String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, HealthTagRecord$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = str;
        this.timestamp = j;
        this.content = str2;
        if ((i & 8) == 0) {
            this.eventType = "HealthTagRecord";
        } else {
            this.eventType = str3;
        }
        if ((i & 16) == 0) {
            this.subType = "HealthTagRecord";
        } else {
            this.subType = str4;
        }
    }

    public static /* synthetic */ HealthTagRecord copy$default(HealthTagRecord healthTagRecord, String str, long j, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthTagRecord.userId;
        }
        if ((i & 2) != 0) {
            j = healthTagRecord.timestamp;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = healthTagRecord.content;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = healthTagRecord.eventType;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = healthTagRecord.subType;
        }
        return healthTagRecord.copy(str, j2, str5, str6, str4);
    }

    @SerialName("content")
    public static /* synthetic */ void getContent$annotations() {
    }

    @SerialName("eventType")
    public static /* synthetic */ void getEventType$annotations() {
    }

    @SerialName("subType")
    public static /* synthetic */ void getSubType$annotations() {
    }

    @SerialName("timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    @SerialName("userId")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull HealthTagRecord self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.userId);
        output.encodeLongElement(serialDesc, 1, self.timestamp);
        output.encodeStringElement(serialDesc, 2, self.content);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.eventType, "HealthTagRecord")) {
            output.encodeStringElement(serialDesc, 3, self.eventType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.subType, "HealthTagRecord")) {
            output.encodeStringElement(serialDesc, 4, self.subType);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    @NotNull
    public final HealthTagRecord copy(@NotNull String userId, long timestamp, @NotNull String content, @NotNull String eventType, @NotNull String subType) {
        return new HealthTagRecord(userId, timestamp, content, eventType, subType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthTagRecord)) {
            return false;
        }
        HealthTagRecord healthTagRecord = (HealthTagRecord) other;
        return Intrinsics.areEqual(this.userId, healthTagRecord.userId) && this.timestamp == healthTagRecord.timestamp && Intrinsics.areEqual(this.content, healthTagRecord.content) && Intrinsics.areEqual(this.eventType, healthTagRecord.eventType) && Intrinsics.areEqual(this.subType, healthTagRecord.subType);
    }

    @NotNull
    public final String getContent() {
        return this.content;
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

    public int hashCode() {
        return (((((((this.userId.hashCode() * 31) + b.a(this.timestamp)) * 31) + this.content.hashCode()) * 31) + this.eventType.hashCode()) * 31) + this.subType.hashCode();
    }

    @NotNull
    public String toString() {
        return "HealthTagRecord(userId=" + this.userId + ", timestamp=" + this.timestamp + ", content=" + this.content + ", eventType=" + this.eventType + ", subType=" + this.subType + ")";
    }

    public HealthTagRecord(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.userId = str;
        this.timestamp = j;
        this.content = str2;
        this.eventType = str3;
        this.subType = str4;
    }

    public /* synthetic */ HealthTagRecord(String str, long j, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, (i & 8) != 0 ? "HealthTagRecord" : str3, (i & 16) != 0 ? "HealthTagRecord" : str4);
    }
}
