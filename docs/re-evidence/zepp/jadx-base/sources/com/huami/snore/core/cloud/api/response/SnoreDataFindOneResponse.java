package com.huami.snore.core.cloud.api.response;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/huami/snore/core/cloud/api/response/SnoreDataFindOneResponse;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/huami/snore/core/cloud/api/response/SnoreEventsResponse;", "component1", "data", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/huami/snore/core/cloud/api/response/SnoreEventsResponse;", "getData", "()Lcom/huami/snore/core/cloud/api/response/SnoreEventsResponse;", "<init>", "(Lcom/huami/snore/core/cloud/api/response/SnoreEventsResponse;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/huami/snore/core/cloud/api/response/SnoreEventsResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "snore_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class SnoreDataFindOneResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final SnoreEventsResponse data;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/snore/core/cloud/api/response/SnoreDataFindOneResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/snore/core/cloud/api/response/SnoreDataFindOneResponse;", "serializer", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<SnoreDataFindOneResponse> serializer() {
            return SnoreDataFindOneResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SnoreDataFindOneResponse(int i, SnoreEventsResponse snoreEventsResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SnoreDataFindOneResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.data = snoreEventsResponse;
    }

    public static /* synthetic */ SnoreDataFindOneResponse copy$default(SnoreDataFindOneResponse snoreDataFindOneResponse, SnoreEventsResponse snoreEventsResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            snoreEventsResponse = snoreDataFindOneResponse.data;
        }
        return snoreDataFindOneResponse.copy(snoreEventsResponse);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SnoreEventsResponse getData() {
        return this.data;
    }

    @NotNull
    public final SnoreDataFindOneResponse copy(@NotNull SnoreEventsResponse data) {
        return new SnoreDataFindOneResponse(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SnoreDataFindOneResponse) && Intrinsics.areEqual(this.data, ((SnoreDataFindOneResponse) other).data);
    }

    @NotNull
    public final SnoreEventsResponse getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "SnoreDataFindOneResponse(data=" + this.data + ")";
    }

    public SnoreDataFindOneResponse(@NotNull SnoreEventsResponse snoreEventsResponse) {
        this.data = snoreEventsResponse;
    }
}
