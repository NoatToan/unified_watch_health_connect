package com.huami.bluetooth.profile.channel.module.sport;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBB\u007f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b<\u0010=B\u007f\b\u0017\u0012\u0006\u0010>\u001a\u00020\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\b<\u0010AJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000bJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000bJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000bJ\u0088\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\t\u0010\"\u001a\u00020!HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001J\u0013\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000bR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u000bR\u001b\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u000bR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u000bR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010\u000bR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u000bR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010\u000bR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010\u000bR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010\u000bR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010(\u001a\u0004\b;\u0010\u000b¨\u0006D"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNExerciseInfoMessageDto;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "flag_recommended_exercise", "hr_lower_zone1", "hr_upper_zone1", "hr_lower_zone2", "hr_upper_zone2", "hr_lower_zone3", "hr_upper_zone3", "duration_zone1", "duration_zone2", "duration_zone3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huami/bluetooth/profile/channel/module/sport/PHNExerciseInfoMessageDto;", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/Integer;", "getFlag_recommended_exercise", "b", "getHr_lower_zone1", "c", "getHr_upper_zone1", GoogleApiAvailabilityLight.a, "getHr_lower_zone2", "e", "getHr_upper_zone2", "f", "getHr_lower_zone3", "g", "getHr_upper_zone3", "h", "getDuration_zone1", "i", "getDuration_zone2", z.j, "getDuration_zone3", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class PHNExerciseInfoMessageDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer flag_recommended_exercise;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer hr_lower_zone1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer hr_upper_zone1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer hr_lower_zone2;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer hr_upper_zone2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer hr_lower_zone3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer hr_upper_zone3;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer duration_zone1;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer duration_zone2;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer duration_zone3;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNExerciseInfoMessageDto$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNExerciseInfoMessageDto;", "serializer", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<PHNExerciseInfoMessageDto> serializer() {
            return PHNExerciseInfoMessageDto$$serializer.INSTANCE;
        }
    }

    public PHNExerciseInfoMessageDto() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 1023, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PHNExerciseInfoMessageDto(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, PHNExerciseInfoMessageDto$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.flag_recommended_exercise = null;
        } else {
            this.flag_recommended_exercise = num;
        }
        if ((i & 2) == 0) {
            this.hr_lower_zone1 = null;
        } else {
            this.hr_lower_zone1 = num2;
        }
        if ((i & 4) == 0) {
            this.hr_upper_zone1 = null;
        } else {
            this.hr_upper_zone1 = num3;
        }
        if ((i & 8) == 0) {
            this.hr_lower_zone2 = null;
        } else {
            this.hr_lower_zone2 = num4;
        }
        if ((i & 16) == 0) {
            this.hr_upper_zone2 = null;
        } else {
            this.hr_upper_zone2 = num5;
        }
        if ((i & 32) == 0) {
            this.hr_lower_zone3 = null;
        } else {
            this.hr_lower_zone3 = num6;
        }
        if ((i & 64) == 0) {
            this.hr_upper_zone3 = null;
        } else {
            this.hr_upper_zone3 = num7;
        }
        if ((i & 128) == 0) {
            this.duration_zone1 = null;
        } else {
            this.duration_zone1 = num8;
        }
        if ((i & 256) == 0) {
            this.duration_zone2 = null;
        } else {
            this.duration_zone2 = num9;
        }
        if ((i & 512) == 0) {
            this.duration_zone3 = null;
        } else {
            this.duration_zone3 = num10;
        }
    }

    @JvmStatic
    public static final void write$Self(@NotNull PHNExerciseInfoMessageDto self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.flag_recommended_exercise != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.flag_recommended_exercise);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.hr_lower_zone1 != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.hr_lower_zone1);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.hr_upper_zone1 != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.hr_upper_zone1);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.hr_lower_zone2 != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.hr_lower_zone2);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.hr_upper_zone2 != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.hr_upper_zone2);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.hr_lower_zone3 != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, IntSerializer.INSTANCE, self.hr_lower_zone3);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.hr_upper_zone3 != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.hr_upper_zone3);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.duration_zone1 != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, IntSerializer.INSTANCE, self.duration_zone1);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.duration_zone2 != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, IntSerializer.INSTANCE, self.duration_zone2);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.duration_zone3 != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.duration_zone3);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getFlag_recommended_exercise() {
        return this.flag_recommended_exercise;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getDuration_zone3() {
        return this.duration_zone3;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getHr_lower_zone1() {
        return this.hr_lower_zone1;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getHr_upper_zone1() {
        return this.hr_upper_zone1;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getHr_lower_zone2() {
        return this.hr_lower_zone2;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getHr_upper_zone2() {
        return this.hr_upper_zone2;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getHr_lower_zone3() {
        return this.hr_lower_zone3;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getHr_upper_zone3() {
        return this.hr_upper_zone3;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getDuration_zone1() {
        return this.duration_zone1;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getDuration_zone2() {
        return this.duration_zone2;
    }

    @NotNull
    public final PHNExerciseInfoMessageDto copy(@Nullable Integer flag_recommended_exercise, @Nullable Integer hr_lower_zone1, @Nullable Integer hr_upper_zone1, @Nullable Integer hr_lower_zone2, @Nullable Integer hr_upper_zone2, @Nullable Integer hr_lower_zone3, @Nullable Integer hr_upper_zone3, @Nullable Integer duration_zone1, @Nullable Integer duration_zone2, @Nullable Integer duration_zone3) {
        return new PHNExerciseInfoMessageDto(flag_recommended_exercise, hr_lower_zone1, hr_upper_zone1, hr_lower_zone2, hr_upper_zone2, hr_lower_zone3, hr_upper_zone3, duration_zone1, duration_zone2, duration_zone3);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PHNExerciseInfoMessageDto)) {
            return false;
        }
        PHNExerciseInfoMessageDto pHNExerciseInfoMessageDto = (PHNExerciseInfoMessageDto) other;
        return Intrinsics.areEqual(this.flag_recommended_exercise, pHNExerciseInfoMessageDto.flag_recommended_exercise) && Intrinsics.areEqual(this.hr_lower_zone1, pHNExerciseInfoMessageDto.hr_lower_zone1) && Intrinsics.areEqual(this.hr_upper_zone1, pHNExerciseInfoMessageDto.hr_upper_zone1) && Intrinsics.areEqual(this.hr_lower_zone2, pHNExerciseInfoMessageDto.hr_lower_zone2) && Intrinsics.areEqual(this.hr_upper_zone2, pHNExerciseInfoMessageDto.hr_upper_zone2) && Intrinsics.areEqual(this.hr_lower_zone3, pHNExerciseInfoMessageDto.hr_lower_zone3) && Intrinsics.areEqual(this.hr_upper_zone3, pHNExerciseInfoMessageDto.hr_upper_zone3) && Intrinsics.areEqual(this.duration_zone1, pHNExerciseInfoMessageDto.duration_zone1) && Intrinsics.areEqual(this.duration_zone2, pHNExerciseInfoMessageDto.duration_zone2) && Intrinsics.areEqual(this.duration_zone3, pHNExerciseInfoMessageDto.duration_zone3);
    }

    @Nullable
    public final Integer getDuration_zone1() {
        return this.duration_zone1;
    }

    @Nullable
    public final Integer getDuration_zone2() {
        return this.duration_zone2;
    }

    @Nullable
    public final Integer getDuration_zone3() {
        return this.duration_zone3;
    }

    @Nullable
    public final Integer getFlag_recommended_exercise() {
        return this.flag_recommended_exercise;
    }

    @Nullable
    public final Integer getHr_lower_zone1() {
        return this.hr_lower_zone1;
    }

    @Nullable
    public final Integer getHr_lower_zone2() {
        return this.hr_lower_zone2;
    }

    @Nullable
    public final Integer getHr_lower_zone3() {
        return this.hr_lower_zone3;
    }

    @Nullable
    public final Integer getHr_upper_zone1() {
        return this.hr_upper_zone1;
    }

    @Nullable
    public final Integer getHr_upper_zone2() {
        return this.hr_upper_zone2;
    }

    @Nullable
    public final Integer getHr_upper_zone3() {
        return this.hr_upper_zone3;
    }

    public int hashCode() {
        Integer num = this.flag_recommended_exercise;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.hr_lower_zone1;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.hr_upper_zone1;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.hr_lower_zone2;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.hr_upper_zone2;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.hr_lower_zone3;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.hr_upper_zone3;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.duration_zone1;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.duration_zone2;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.duration_zone3;
        return iHashCode9 + (num10 != null ? num10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PHNExerciseInfoMessageDto(flag_recommended_exercise=" + this.flag_recommended_exercise + ", hr_lower_zone1=" + this.hr_lower_zone1 + ", hr_upper_zone1=" + this.hr_upper_zone1 + ", hr_lower_zone2=" + this.hr_lower_zone2 + ", hr_upper_zone2=" + this.hr_upper_zone2 + ", hr_lower_zone3=" + this.hr_lower_zone3 + ", hr_upper_zone3=" + this.hr_upper_zone3 + ", duration_zone1=" + this.duration_zone1 + ", duration_zone2=" + this.duration_zone2 + ", duration_zone3=" + this.duration_zone3 + ')';
    }

    public PHNExerciseInfoMessageDto(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10) {
        this.flag_recommended_exercise = num;
        this.hr_lower_zone1 = num2;
        this.hr_upper_zone1 = num3;
        this.hr_lower_zone2 = num4;
        this.hr_upper_zone2 = num5;
        this.hr_lower_zone3 = num6;
        this.hr_upper_zone3 = num7;
        this.duration_zone1 = num8;
        this.duration_zone2 = num9;
        this.duration_zone3 = num10;
    }

    public /* synthetic */ PHNExerciseInfoMessageDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : num8, (i & 256) != 0 ? null : num9, (i & 512) == 0 ? num10 : null);
    }
}
