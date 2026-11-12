package com.huami.sleep.daysleep.sleepstagechart.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B9\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-BE\b\u0017\u0012\u0006\u0010.\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b,\u00101J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u000fHÆ\u0001J\t\u0010\u0017\u001a\u00020\fHÖ\u0001J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0012\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0013\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0014\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0019\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00064"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepUserTagInfo;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "", "component3", "component4", "", "component5", "startTime", "endTime", "tag", "tagType", "timestamp", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getStartTime", "()I", "b", "getEndTime", "c", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "getTagType", "e", "J", "getTimestamp", "()J", "<init>", "(IILjava/lang/String;IJ)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/lang/String;IJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "sleep_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class SleepUserTagInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int endTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int tagType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final long timestamp;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepUserTagInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepUserTagInfo;", "serializer", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<SleepUserTagInfo> serializer() {
            return SleepUserTagInfo$$serializer.INSTANCE;
        }
    }

    public SleepUserTagInfo() {
        this(0, 0, (String) null, 0, 0L, 31, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SleepUserTagInfo(int i, int i2, int i3, String str, int i4, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, SleepUserTagInfo$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.startTime = 0;
        } else {
            this.startTime = i2;
        }
        if ((i & 2) == 0) {
            this.endTime = 0;
        } else {
            this.endTime = i3;
        }
        if ((i & 4) == 0) {
            this.tag = "";
        } else {
            this.tag = str;
        }
        if ((i & 8) == 0) {
            this.tagType = 0;
        } else {
            this.tagType = i4;
        }
        if ((i & 16) == 0) {
            this.timestamp = 0L;
        } else {
            this.timestamp = j;
        }
    }

    public static /* synthetic */ SleepUserTagInfo copy$default(SleepUserTagInfo sleepUserTagInfo, int i, int i2, String str, int i3, long j, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = sleepUserTagInfo.startTime;
        }
        if ((i4 & 2) != 0) {
            i2 = sleepUserTagInfo.endTime;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            str = sleepUserTagInfo.tag;
        }
        String str2 = str;
        if ((i4 & 8) != 0) {
            i3 = sleepUserTagInfo.tagType;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            j = sleepUserTagInfo.timestamp;
        }
        return sleepUserTagInfo.copy(i, i5, str2, i6, j);
    }

    @JvmStatic
    public static final void write$Self(@NotNull SleepUserTagInfo self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.startTime != 0) {
            output.encodeIntElement(serialDesc, 0, self.startTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.endTime != 0) {
            output.encodeIntElement(serialDesc, 1, self.endTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.tag, "")) {
            output.encodeStringElement(serialDesc, 2, self.tag);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.tagType != 0) {
            output.encodeIntElement(serialDesc, 3, self.tagType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.timestamp != 0) {
            output.encodeLongElement(serialDesc, 4, self.timestamp);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEndTime() {
        return this.endTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTagType() {
        return this.tagType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final SleepUserTagInfo copy(int startTime, int endTime, @NotNull String tag, int tagType, long timestamp) {
        return new SleepUserTagInfo(startTime, endTime, tag, tagType, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepUserTagInfo)) {
            return false;
        }
        SleepUserTagInfo sleepUserTagInfo = (SleepUserTagInfo) other;
        return this.startTime == sleepUserTagInfo.startTime && this.endTime == sleepUserTagInfo.endTime && Intrinsics.areEqual(this.tag, sleepUserTagInfo.tag) && this.tagType == sleepUserTagInfo.tagType && this.timestamp == sleepUserTagInfo.timestamp;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final int getTagType() {
        return this.tagType;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((this.startTime * 31) + this.endTime) * 31) + this.tag.hashCode()) * 31) + this.tagType) * 31) + b.a(this.timestamp);
    }

    @NotNull
    public String toString() {
        return "SleepUserTagInfo(startTime=" + this.startTime + ", endTime=" + this.endTime + ", tag=" + this.tag + ", tagType=" + this.tagType + ", timestamp=" + this.timestamp + ")";
    }

    public SleepUserTagInfo(int i, int i2, @NotNull String str, int i3, long j) {
        this.startTime = i;
        this.endTime = i2;
        this.tag = str;
        this.tagType = i3;
        this.timestamp = j;
    }

    public /* synthetic */ SleepUserTagInfo(int i, int i2, String str, int i3, long j, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? "" : str, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? 0L : j);
    }
}
