package com.huami.snore.core.cloud.api.response;

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

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aB/\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0010\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\r\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006!"}, d2 = {"Lcom/huami/snore/core/cloud/api/response/SnoreDataUploadResponse;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "putURI", "getURI", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getPutURI", "()Ljava/lang/String;", "getGetURI", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "snore_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class SnoreDataUploadResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String getURI;

    @NotNull
    private final String putURI;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/snore/core/cloud/api/response/SnoreDataUploadResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/snore/core/cloud/api/response/SnoreDataUploadResponse;", "serializer", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<SnoreDataUploadResponse> serializer() {
            return SnoreDataUploadResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SnoreDataUploadResponse(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SnoreDataUploadResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.putURI = str;
        this.getURI = str2;
    }

    public static /* synthetic */ SnoreDataUploadResponse copy$default(SnoreDataUploadResponse snoreDataUploadResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = snoreDataUploadResponse.putURI;
        }
        if ((i & 2) != 0) {
            str2 = snoreDataUploadResponse.getURI;
        }
        return snoreDataUploadResponse.copy(str, str2);
    }

    @JvmStatic
    public static final void write$Self(@NotNull SnoreDataUploadResponse self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.putURI);
        output.encodeStringElement(serialDesc, 1, self.getURI);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPutURI() {
        return this.putURI;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGetURI() {
        return this.getURI;
    }

    @NotNull
    public final SnoreDataUploadResponse copy(@NotNull String putURI, @NotNull String getURI) {
        return new SnoreDataUploadResponse(putURI, getURI);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnoreDataUploadResponse)) {
            return false;
        }
        SnoreDataUploadResponse snoreDataUploadResponse = (SnoreDataUploadResponse) other;
        return Intrinsics.areEqual(this.putURI, snoreDataUploadResponse.putURI) && Intrinsics.areEqual(this.getURI, snoreDataUploadResponse.getURI);
    }

    @NotNull
    public final String getGetURI() {
        return this.getURI;
    }

    @NotNull
    public final String getPutURI() {
        return this.putURI;
    }

    public int hashCode() {
        return (this.putURI.hashCode() * 31) + this.getURI.hashCode();
    }

    @NotNull
    public String toString() {
        return "SnoreDataUploadResponse(putURI=" + this.putURI + ", getURI=" + this.getURI + ")";
    }

    public SnoreDataUploadResponse(@NotNull String str, @NotNull String str2) {
        this.putURI = str;
        this.getURI = str2;
    }
}
