package com.huami.rawdata_uploader.relation.remote;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 2*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u000232B3\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b,\u0010-BK\b\u0017\u0012\u0006\u0010.\u001a\u00020\u001d\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00018\u0000\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b,\u00101J;\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tHÇ\u0001J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\rHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0012\u001a\u00020\rHÆ\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JJ\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\rHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0019\u0010\u0015\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0016\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\u0017\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0018\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b)\u0010$R\u001b\u0010\u0019\u001a\u0004\u0018\u00018\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b+\u0010\u0014¨\u00064"}, d2 = {"Lcom/huami/rawdata_uploader/relation/remote/RawDataRequestEntity;", ExifInterface.GPS_DIRECTION_TRUE, "", "T0", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "", "write$Self", "", "component1", "component2", "", "component3", "component4", "component5", "()Ljava/lang/Object;", "eventType", "subType", "timestamp", "userId", "value", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Object;)Lcom/huami/rawdata_uploader/relation/remote/RawDataRequestEntity;", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "getSubType", "J", "getTimestamp", "()J", "getUserId", "Ljava/lang/Object;", "getValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Object;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class RawDataRequestEntity<T> {

    @NotNull
    private static final SerialDescriptor $cachedDescriptor;

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
    private final T value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0003\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0001¨\u0006\t"}, d2 = {"Lcom/huami/rawdata_uploader/relation/remote/RawDataRequestEntity$Companion;", "", "T0", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Lcom/huami/rawdata_uploader/relation/remote/RawDataRequestEntity;", "serializer", "<init>", "()V", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T0> KSerializer<RawDataRequestEntity<T0>> serializer(@NotNull KSerializer<T0> typeSerial0) {
            return new RawDataRequestEntity$$serializer(typeSerial0);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.huami.rawdata_uploader.relation.remote.RawDataRequestEntity", null, 5);
        pluginGeneratedSerialDescriptor.addElement("eventType", false);
        pluginGeneratedSerialDescriptor.addElement("subType", false);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("userId", false);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ RawDataRequestEntity(int i, String str, String str2, long j, String str3, Object obj, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, $cachedDescriptor);
        }
        this.eventType = str;
        this.subType = str2;
        this.timestamp = j;
        this.userId = str3;
        if ((i & 16) == 0) {
            this.value = null;
        } else {
            this.value = obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RawDataRequestEntity copy$default(RawDataRequestEntity rawDataRequestEntity, String str, String str2, long j, String str3, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = rawDataRequestEntity.eventType;
        }
        if ((i & 2) != 0) {
            str2 = rawDataRequestEntity.subType;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = rawDataRequestEntity.timestamp;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = rawDataRequestEntity.userId;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            obj = rawDataRequestEntity.value;
        }
        return rawDataRequestEntity.copy(str, str4, j2, str5, obj);
    }

    @JvmStatic
    public static final <T0> void write$Self(@NotNull RawDataRequestEntity<T0> self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc, @NotNull KSerializer<T0> typeSerial0) {
        output.encodeStringElement(serialDesc, 0, ((RawDataRequestEntity) self).eventType);
        output.encodeStringElement(serialDesc, 1, ((RawDataRequestEntity) self).subType);
        output.encodeLongElement(serialDesc, 2, ((RawDataRequestEntity) self).timestamp);
        output.encodeStringElement(serialDesc, 3, ((RawDataRequestEntity) self).userId);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || ((RawDataRequestEntity) self).value != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, typeSerial0, ((RawDataRequestEntity) self).value);
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
    public final T component5() {
        return this.value;
    }

    @NotNull
    public final RawDataRequestEntity<T> copy(@NotNull String eventType, @NotNull String subType, long timestamp, @NotNull String userId, @Nullable T value) {
        return new RawDataRequestEntity<>(eventType, subType, timestamp, userId, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawDataRequestEntity)) {
            return false;
        }
        RawDataRequestEntity rawDataRequestEntity = (RawDataRequestEntity) other;
        return Intrinsics.areEqual(this.eventType, rawDataRequestEntity.eventType) && Intrinsics.areEqual(this.subType, rawDataRequestEntity.subType) && this.timestamp == rawDataRequestEntity.timestamp && Intrinsics.areEqual(this.userId, rawDataRequestEntity.userId) && Intrinsics.areEqual(this.value, rawDataRequestEntity.value);
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
    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((((((this.eventType.hashCode() * 31) + this.subType.hashCode()) * 31) + b.a(this.timestamp)) * 31) + this.userId.hashCode()) * 31;
        T t = this.value;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    @NotNull
    public String toString() {
        return "RawDataRequestEntity(eventType=" + this.eventType + ", subType=" + this.subType + ", timestamp=" + this.timestamp + ", userId=" + this.userId + ", value=" + this.value + ")";
    }

    public RawDataRequestEntity(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @Nullable T t) {
        this.eventType = str;
        this.subType = str2;
        this.timestamp = j;
        this.userId = str3;
        this.value = t;
    }

    public /* synthetic */ RawDataRequestEntity(String str, String str2, long j, String str3, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, (i & 16) != 0 ? null : obj);
    }
}
