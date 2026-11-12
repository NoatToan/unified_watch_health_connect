package com.huami.snore.core.cloud.api.request;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u001b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001b\u0010\u001cB/\b\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0013\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u001a\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huami/snore/core/cloud/api/request/UploadVoiceDataRequest;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "()Ljava/lang/Long;", "component2", "timestamp", "duration", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/huami/snore/core/cloud/api/request/UploadVoiceDataRequest;", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Long;", "getTimestamp", "getDuration", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "snore_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class UploadVoiceDataRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Long duration;

    @Nullable
    private final Long timestamp;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/snore/core/cloud/api/request/UploadVoiceDataRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/snore/core/cloud/api/request/UploadVoiceDataRequest;", "serializer", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<UploadVoiceDataRequest> serializer() {
            return UploadVoiceDataRequest$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ UploadVoiceDataRequest(int i, Long l, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, UploadVoiceDataRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.timestamp = l;
        this.duration = l2;
    }

    public static /* synthetic */ UploadVoiceDataRequest copy$default(UploadVoiceDataRequest uploadVoiceDataRequest, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = uploadVoiceDataRequest.timestamp;
        }
        if ((i & 2) != 0) {
            l2 = uploadVoiceDataRequest.duration;
        }
        return uploadVoiceDataRequest.copy(l, l2);
    }

    @JvmStatic
    public static final void write$Self(@NotNull UploadVoiceDataRequest self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, longSerializer, self.timestamp);
        output.encodeNullableSerializableElement(serialDesc, 1, longSerializer, self.duration);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    @NotNull
    public final UploadVoiceDataRequest copy(@Nullable Long timestamp, @Nullable Long duration) {
        return new UploadVoiceDataRequest(timestamp, duration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadVoiceDataRequest)) {
            return false;
        }
        UploadVoiceDataRequest uploadVoiceDataRequest = (UploadVoiceDataRequest) other;
        return Intrinsics.areEqual(this.timestamp, uploadVoiceDataRequest.timestamp) && Intrinsics.areEqual(this.duration, uploadVoiceDataRequest.duration);
    }

    @Nullable
    public final Long getDuration() {
        return this.duration;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        Long l = this.timestamp;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.duration;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UploadVoiceDataRequest(timestamp=" + this.timestamp + ", duration=" + this.duration + ")";
    }

    public UploadVoiceDataRequest(@Nullable Long l, @Nullable Long l2) {
        this.timestamp = l;
        this.duration = l2;
    }
}
