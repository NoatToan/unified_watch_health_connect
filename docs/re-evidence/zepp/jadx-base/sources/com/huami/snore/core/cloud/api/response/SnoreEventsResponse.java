package com.huami.snore.core.cloud.api.response;

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

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210BC\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b*\u0010+BU\b\u0017\u0012\u0006\u0010,\u001a\u00020\u0019\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u0014\u001a\u00020\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b*\u0010/J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\rHÆ\u0003JK\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0016\u001a\u00020\rHÆ\u0001J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b!\u0010 R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\"\u0010 R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b(\u0010 R\u0019\u0010\u0016\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b)\u0010%¨\u00062"}, d2 = {"Lcom/huami/snore/core/cloud/api/response/SnoreEventsResponse;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "userId", "fileName", "fileType", "startTime", "url", "duration", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "getFileName", "getFileType", "J", "getStartTime", "()J", "getStartTime$annotations", "()V", "getUrl", "getDuration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "snore_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class SnoreEventsResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long duration;

    @Nullable
    private final String fileName;

    @Nullable
    private final String fileType;
    private final long startTime;

    @Nullable
    private final String url;

    @NotNull
    private final String userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/snore/core/cloud/api/response/SnoreEventsResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/snore/core/cloud/api/response/SnoreEventsResponse;", "serializer", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<SnoreEventsResponse> serializer() {
            return SnoreEventsResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SnoreEventsResponse(int i, String str, String str2, String str3, @SerialName("timestamp") long j, String str4, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (41 != (i & 41)) {
            PluginExceptionsKt.throwMissingFieldException(i, 41, SnoreEventsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = str;
        if ((i & 2) == 0) {
            this.fileName = "";
        } else {
            this.fileName = str2;
        }
        if ((i & 4) == 0) {
            this.fileType = "";
        } else {
            this.fileType = str3;
        }
        this.startTime = j;
        if ((i & 16) == 0) {
            this.url = "";
        } else {
            this.url = str4;
        }
        this.duration = j2;
    }

    @SerialName("timestamp")
    public static /* synthetic */ void getStartTime$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull SnoreEventsResponse self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.userId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.fileName, "")) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.fileName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.fileType, "")) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.fileType);
        }
        output.encodeLongElement(serialDesc, 3, self.startTime);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.url, "")) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.url);
        }
        output.encodeLongElement(serialDesc, 5, self.duration);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileType() {
        return this.fileType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final SnoreEventsResponse copy(@NotNull String userId, @Nullable String fileName, @Nullable String fileType, long startTime, @Nullable String url, long duration) {
        return new SnoreEventsResponse(userId, fileName, fileType, startTime, url, duration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnoreEventsResponse)) {
            return false;
        }
        SnoreEventsResponse snoreEventsResponse = (SnoreEventsResponse) other;
        return Intrinsics.areEqual(this.userId, snoreEventsResponse.userId) && Intrinsics.areEqual(this.fileName, snoreEventsResponse.fileName) && Intrinsics.areEqual(this.fileType, snoreEventsResponse.fileType) && this.startTime == snoreEventsResponse.startTime && Intrinsics.areEqual(this.url, snoreEventsResponse.url) && this.duration == snoreEventsResponse.duration;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final String getFileType() {
        return this.fileType;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.userId.hashCode() * 31;
        String str = this.fileName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileType;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + b.a(this.startTime)) * 31;
        String str3 = this.url;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + b.a(this.duration);
    }

    @NotNull
    public String toString() {
        return "SnoreEventsResponse(userId=" + this.userId + ", fileName=" + this.fileName + ", fileType=" + this.fileType + ", startTime=" + this.startTime + ", url=" + this.url + ", duration=" + this.duration + ")";
    }

    public SnoreEventsResponse(@NotNull String str, @Nullable String str2, @Nullable String str3, long j, @Nullable String str4, long j2) {
        this.userId = str;
        this.fileName = str2;
        this.fileType = str3;
        this.startTime = j;
        this.url = str4;
        this.duration = j2;
    }

    public /* synthetic */ SnoreEventsResponse(String str, String str2, String str3, long j, String str4, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, j, (i & 16) != 0 ? "" : str4, j2);
    }
}
