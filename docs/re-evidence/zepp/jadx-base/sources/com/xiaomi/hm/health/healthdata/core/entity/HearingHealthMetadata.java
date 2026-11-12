package com.xiaomi.hm.health.healthdata.core.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cB+\b\u0017\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\r\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/entity/HearingHealthMetadata;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "currentDB", "totalDuration", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getCurrentDB", "()I", "b", "getTotalDuration", "<init>", "(II)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class HearingHealthMetadata {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int currentDB;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int totalDuration;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/entity/HearingHealthMetadata$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/xiaomi/hm/health/healthdata/core/entity/HearingHealthMetadata;", "serializer", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<HearingHealthMetadata> serializer() {
            return HearingHealthMetadata$$serializer.INSTANCE;
        }
    }

    public HearingHealthMetadata(int i, int i2) {
        this.currentDB = i;
        this.totalDuration = i2;
    }

    public static /* synthetic */ HearingHealthMetadata copy$default(HearingHealthMetadata hearingHealthMetadata, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = hearingHealthMetadata.currentDB;
        }
        if ((i3 & 2) != 0) {
            i2 = hearingHealthMetadata.totalDuration;
        }
        return hearingHealthMetadata.copy(i, i2);
    }

    @JvmStatic
    public static final void write$Self(@NotNull HearingHealthMetadata self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.currentDB);
        output.encodeIntElement(serialDesc, 1, self.totalDuration);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCurrentDB() {
        return this.currentDB;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalDuration() {
        return this.totalDuration;
    }

    @NotNull
    public final HearingHealthMetadata copy(int currentDB, int totalDuration) {
        return new HearingHealthMetadata(currentDB, totalDuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HearingHealthMetadata)) {
            return false;
        }
        HearingHealthMetadata hearingHealthMetadata = (HearingHealthMetadata) other;
        return this.currentDB == hearingHealthMetadata.currentDB && this.totalDuration == hearingHealthMetadata.totalDuration;
    }

    public final int getCurrentDB() {
        return this.currentDB;
    }

    public final int getTotalDuration() {
        return this.totalDuration;
    }

    public int hashCode() {
        return (this.currentDB * 31) + this.totalDuration;
    }

    @NotNull
    public String toString() {
        return "HearingHealthMetadata(currentDB=" + this.currentDB + ", totalDuration=" + this.totalDuration + ")";
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ HearingHealthMetadata(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, HearingHealthMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.currentDB = i2;
        this.totalDuration = i3;
    }
}
