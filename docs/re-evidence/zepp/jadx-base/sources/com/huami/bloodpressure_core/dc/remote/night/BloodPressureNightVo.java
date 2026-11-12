package com.huami.bloodpressure_core.dc.remote.night;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B;\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,BM\b\u0017\u0012\u0006\u0010-\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b+\u00100J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÆ\u0003JN\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001c\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0012\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b&\u0010%R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b(\u0010\u000fR\u0019\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b)\u0010%R\u0019\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b*\u0010%¨\u00063"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/night/BloodPressureNightVo;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", BloodPressureConst.ParamKey.MEASURETIME, "sbp", "dbp", "bpm", "timezone", "type", "copy", "(JIILjava/lang/Integer;II)Lcom/huami/bloodpressure_core/dc/remote/night/BloodPressureNightVo;", "", "toString", "hashCode", "other", "", "equals", "J", "getMeasureTime", "()J", LogUtil.I, "getSbp", "()I", "getDbp", "Ljava/lang/Integer;", "getBpm", "getTimezone", "getType", "<init>", "(JIILjava/lang/Integer;II)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJIILjava/lang/Integer;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class BloodPressureNightVo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer bpm;
    private final int dbp;
    private final long measureTime;
    private final int sbp;
    private final int timezone;
    private final int type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/night/BloodPressureNightVo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/bloodpressure_core/dc/remote/night/BloodPressureNightVo;", "serializer", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<BloodPressureNightVo> serializer() {
            return BloodPressureNightVo$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BloodPressureNightVo(int i, long j, int i2, int i3, Integer num, int i4, int i5, SerializationConstructorMarker serializationConstructorMarker) {
        if (55 != (i & 55)) {
            PluginExceptionsKt.throwMissingFieldException(i, 55, BloodPressureNightVo$$serializer.INSTANCE.getDescriptor());
        }
        this.measureTime = j;
        this.sbp = i2;
        this.dbp = i3;
        if ((i & 8) == 0) {
            this.bpm = null;
        } else {
            this.bpm = num;
        }
        this.timezone = i4;
        this.type = i5;
    }

    @JvmStatic
    public static final void write$Self(@NotNull BloodPressureNightVo self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.measureTime);
        output.encodeIntElement(serialDesc, 1, self.sbp);
        output.encodeIntElement(serialDesc, 2, self.dbp);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.bpm != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.bpm);
        }
        output.encodeIntElement(serialDesc, 4, self.timezone);
        output.encodeIntElement(serialDesc, 5, self.type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMeasureTime() {
        return this.measureTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSbp() {
        return this.sbp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDbp() {
        return this.dbp;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getBpm() {
        return this.bpm;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTimezone() {
        return this.timezone;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final BloodPressureNightVo copy(long measureTime, int sbp, int dbp, @Nullable Integer bpm, int timezone, int type) {
        return new BloodPressureNightVo(measureTime, sbp, dbp, bpm, timezone, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureNightVo)) {
            return false;
        }
        BloodPressureNightVo bloodPressureNightVo = (BloodPressureNightVo) other;
        return this.measureTime == bloodPressureNightVo.measureTime && this.sbp == bloodPressureNightVo.sbp && this.dbp == bloodPressureNightVo.dbp && Intrinsics.areEqual(this.bpm, bloodPressureNightVo.bpm) && this.timezone == bloodPressureNightVo.timezone && this.type == bloodPressureNightVo.type;
    }

    @Nullable
    public final Integer getBpm() {
        return this.bpm;
    }

    public final int getDbp() {
        return this.dbp;
    }

    public final long getMeasureTime() {
        return this.measureTime;
    }

    public final int getSbp() {
        return this.sbp;
    }

    public final int getTimezone() {
        return this.timezone;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = ((((b.a(this.measureTime) * 31) + this.sbp) * 31) + this.dbp) * 31;
        Integer num = this.bpm;
        return ((((iA + (num == null ? 0 : num.hashCode())) * 31) + this.timezone) * 31) + this.type;
    }

    @NotNull
    public String toString() {
        return "BloodPressureNightVo(measureTime=" + this.measureTime + ", sbp=" + this.sbp + ", dbp=" + this.dbp + ", bpm=" + this.bpm + ", timezone=" + this.timezone + ", type=" + this.type + ")";
    }

    public BloodPressureNightVo(long j, int i, int i2, @Nullable Integer num, int i3, int i4) {
        this.measureTime = j;
        this.sbp = i;
        this.dbp = i2;
        this.bpm = num;
        this.timezone = i3;
        this.type = i4;
    }

    public /* synthetic */ BloodPressureNightVo(long j, int i, int i2, Integer num, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, (i5 & 8) != 0 ? null : num, i3, i4);
    }
}
