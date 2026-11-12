package com.xiaomi.hm.health.temperature.model;

import androidx.exifinterface.media.ExifInterface;
import defpackage.b;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b#\u0010$B3\b\u0017\u0012\u0006\u0010%\u001a\u00020\u0014\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b#\u0010(J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/temperature/model/TemperaturePair;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "timestamp", "envTempe", "bodyTempe", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", ExifInterface.LATITUDE_SOUTH, "getEnvTempe", "()S", "c", "getBodyTempe", "<init>", "(JSS)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJSSLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class TemperaturePair {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final short envTempe;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final short bodyTempe;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/temperature/model/TemperaturePair$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/xiaomi/hm/health/temperature/model/TemperaturePair;", "serializer", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<TemperaturePair> serializer() {
            return TemperaturePair$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ TemperaturePair(int i, long j, short s, short s2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, TemperaturePair$$serializer.INSTANCE.getDescriptor());
        }
        this.timestamp = j;
        this.envTempe = s;
        this.bodyTempe = s2;
    }

    public static /* synthetic */ TemperaturePair copy$default(TemperaturePair temperaturePair, long j, short s, short s2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = temperaturePair.timestamp;
        }
        if ((i & 2) != 0) {
            s = temperaturePair.envTempe;
        }
        if ((i & 4) != 0) {
            s2 = temperaturePair.bodyTempe;
        }
        return temperaturePair.copy(j, s, s2);
    }

    @JvmStatic
    public static final void write$Self(@NotNull TemperaturePair self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.timestamp);
        output.encodeShortElement(serialDesc, 1, self.envTempe);
        output.encodeShortElement(serialDesc, 2, self.bodyTempe);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final short getEnvTempe() {
        return this.envTempe;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final short getBodyTempe() {
        return this.bodyTempe;
    }

    @NotNull
    public final TemperaturePair copy(long timestamp, short envTempe, short bodyTempe) {
        return new TemperaturePair(timestamp, envTempe, bodyTempe);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemperaturePair)) {
            return false;
        }
        TemperaturePair temperaturePair = (TemperaturePair) other;
        return this.timestamp == temperaturePair.timestamp && this.envTempe == temperaturePair.envTempe && this.bodyTempe == temperaturePair.bodyTempe;
    }

    public final short getBodyTempe() {
        return this.bodyTempe;
    }

    public final short getEnvTempe() {
        return this.envTempe;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((b.a(this.timestamp) * 31) + this.envTempe) * 31) + this.bodyTempe;
    }

    @NotNull
    public String toString() {
        return "TemperaturePair(timestamp=" + this.timestamp + ", envTempe=" + ((int) this.envTempe) + ", bodyTempe=" + ((int) this.bodyTempe) + ")";
    }

    public TemperaturePair(long j, short s, short s2) {
        this.timestamp = j;
        this.envTempe = s;
        this.bodyTempe = s2;
    }
}
