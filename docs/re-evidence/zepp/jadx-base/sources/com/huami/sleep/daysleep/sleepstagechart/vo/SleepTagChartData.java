package com.huami.sleep.daysleep.sleepstagechart.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B%\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b!\u0010\"B5\b\u0017\u0012\u0006\u0010#\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0010\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006)"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagChartData;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "", "component3", "start", "end", "tag", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getStart", "()I", "b", "getEnd", "c", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "<init>", "(IILjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "sleep_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class SleepTagChartData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int end;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String tag;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagChartData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagChartData;", "serializer", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<SleepTagChartData> serializer() {
            return SleepTagChartData$$serializer.INSTANCE;
        }
    }

    public SleepTagChartData() {
        this(0, 0, (String) null, 7, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SleepTagChartData(int i, int i2, int i3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, SleepTagChartData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.start = 0;
        } else {
            this.start = i2;
        }
        if ((i & 2) == 0) {
            this.end = 0;
        } else {
            this.end = i3;
        }
        if ((i & 4) == 0) {
            this.tag = "";
        } else {
            this.tag = str;
        }
    }

    public static /* synthetic */ SleepTagChartData copy$default(SleepTagChartData sleepTagChartData, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sleepTagChartData.start;
        }
        if ((i3 & 2) != 0) {
            i2 = sleepTagChartData.end;
        }
        if ((i3 & 4) != 0) {
            str = sleepTagChartData.tag;
        }
        return sleepTagChartData.copy(i, i2, str);
    }

    @JvmStatic
    public static final void write$Self(@NotNull SleepTagChartData self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.start != 0) {
            output.encodeIntElement(serialDesc, 0, self.start);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.end != 0) {
            output.encodeIntElement(serialDesc, 1, self.end);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.tag, "")) {
            output.encodeStringElement(serialDesc, 2, self.tag);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final SleepTagChartData copy(int start, int end, @NotNull String tag) {
        return new SleepTagChartData(start, end, tag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepTagChartData)) {
            return false;
        }
        SleepTagChartData sleepTagChartData = (SleepTagChartData) other;
        return this.start == sleepTagChartData.start && this.end == sleepTagChartData.end && Intrinsics.areEqual(this.tag, sleepTagChartData.tag);
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (((this.start * 31) + this.end) * 31) + this.tag.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepTagChartData(start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ")";
    }

    public SleepTagChartData(int i, int i2, @NotNull String str) {
        this.start = i;
        this.end = i2;
        this.tag = str;
    }

    public /* synthetic */ SleepTagChartData(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str);
    }
}
