package com.huami.pai.web.bean;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.web.CalendarDaySerializer;
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

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B'\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b.\u0010/BE\b\u0017\u0012\u0006\u00100\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0010\u001a\u00020\t\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b.\u00103J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000eHÆ\u0001J\t\u0010\u0015\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010 \u001a\u0004\b#\u0010$R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\"\u0012\u0004\b(\u0010 \u001a\u0004\b'\u0010$R\"\u0010\u0013\u001a\u00020\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010 \u001a\u0004\b+\u0010,¨\u00066"}, d2 = {"Lcom/huami/pai/web/bean/FitnessAgeBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "", "component4", "calendarDay", "fitnessAge", "vo2max", "source", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getCalendarDay", "()J", "getCalendarDay$annotations", "()V", "b", "F", "getFitnessAge", "()F", "getFitnessAge$annotations", "c", "getVo2max", "getVo2max$annotations", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getSource", "()Ljava/lang/String;", "getSource$annotations", "<init>", "(JFFLjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJFFLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "lib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class FitnessAgeBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long calendarDay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float fitnessAge;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float vo2max;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String source;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/pai/web/bean/FitnessAgeBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/pai/web/bean/FitnessAgeBean;", "serializer", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<FitnessAgeBean> serializer() {
            return FitnessAgeBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FitnessAgeBean(int i, @SerialName("calendarDay") @Serializable(with = CalendarDaySerializer.class) long j, @SerialName("fitnessAge") float f, @SerialName("score") float f2, @SerialName("source") String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, FitnessAgeBean$$serializer.INSTANCE.getDescriptor());
        }
        this.calendarDay = j;
        this.fitnessAge = f;
        this.vo2max = f2;
        this.source = str;
    }

    public static /* synthetic */ FitnessAgeBean copy$default(FitnessAgeBean fitnessAgeBean, long j, float f, float f2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = fitnessAgeBean.calendarDay;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f = fitnessAgeBean.fitnessAge;
        }
        float f3 = f;
        if ((i & 4) != 0) {
            f2 = fitnessAgeBean.vo2max;
        }
        float f4 = f2;
        if ((i & 8) != 0) {
            str = fitnessAgeBean.source;
        }
        return fitnessAgeBean.copy(j2, f3, f4, str);
    }

    @SerialName("calendarDay")
    @Serializable(with = CalendarDaySerializer.class)
    public static /* synthetic */ void getCalendarDay$annotations() {
    }

    @SerialName("fitnessAge")
    public static /* synthetic */ void getFitnessAge$annotations() {
    }

    @SerialName("source")
    public static /* synthetic */ void getSource$annotations() {
    }

    @SerialName("score")
    public static /* synthetic */ void getVo2max$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull FitnessAgeBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, new CalendarDaySerializer(), Long.valueOf(self.calendarDay));
        output.encodeFloatElement(serialDesc, 1, self.fitnessAge);
        output.encodeFloatElement(serialDesc, 2, self.vo2max);
        output.encodeStringElement(serialDesc, 3, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCalendarDay() {
        return this.calendarDay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getFitnessAge() {
        return this.fitnessAge;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getVo2max() {
        return this.vo2max;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final FitnessAgeBean copy(long calendarDay, float fitnessAge, float vo2max, @NotNull String source) {
        return new FitnessAgeBean(calendarDay, fitnessAge, vo2max, source);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FitnessAgeBean)) {
            return false;
        }
        FitnessAgeBean fitnessAgeBean = (FitnessAgeBean) other;
        return this.calendarDay == fitnessAgeBean.calendarDay && Intrinsics.areEqual((Object) Float.valueOf(this.fitnessAge), (Object) Float.valueOf(fitnessAgeBean.fitnessAge)) && Intrinsics.areEqual((Object) Float.valueOf(this.vo2max), (Object) Float.valueOf(fitnessAgeBean.vo2max)) && Intrinsics.areEqual(this.source, fitnessAgeBean.source);
    }

    public final long getCalendarDay() {
        return this.calendarDay;
    }

    public final float getFitnessAge() {
        return this.fitnessAge;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public final float getVo2max() {
        return this.vo2max;
    }

    public int hashCode() {
        return (((((b.a(this.calendarDay) * 31) + Float.floatToIntBits(this.fitnessAge)) * 31) + Float.floatToIntBits(this.vo2max)) * 31) + this.source.hashCode();
    }

    @NotNull
    public String toString() {
        return "FitnessAgeBean(calendarDay=" + this.calendarDay + ", fitnessAge=" + this.fitnessAge + ", vo2max=" + this.vo2max + ", source=" + this.source + ")";
    }

    public FitnessAgeBean(long j, float f, float f2, @NotNull String str) {
        this.calendarDay = j;
        this.fitnessAge = f;
        this.vo2max = f2;
        this.source = str;
    }
}
