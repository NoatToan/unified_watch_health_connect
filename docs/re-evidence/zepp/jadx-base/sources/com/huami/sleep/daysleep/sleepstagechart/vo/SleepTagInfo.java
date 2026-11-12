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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eB-\b\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006%"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagInfo;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "tag", "tagType", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "b", LogUtil.I, "getTagType", "()I", "<init>", "(Ljava/lang/String;I)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "sleep_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class SleepTagInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int tagType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagInfo;", "serializer", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<SleepTagInfo> serializer() {
            return SleepTagInfo$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepTagInfo() {
        this((String) null, 0, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SleepTagInfo(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, SleepTagInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.tag = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.tagType = 0;
        } else {
            this.tagType = i2;
        }
    }

    public static /* synthetic */ SleepTagInfo copy$default(SleepTagInfo sleepTagInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sleepTagInfo.tag;
        }
        if ((i2 & 2) != 0) {
            i = sleepTagInfo.tagType;
        }
        return sleepTagInfo.copy(str, i);
    }

    @JvmStatic
    public static final void write$Self(@NotNull SleepTagInfo self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.tag, "")) {
            output.encodeStringElement(serialDesc, 0, self.tag);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.tagType != 0) {
            output.encodeIntElement(serialDesc, 1, self.tagType);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTagType() {
        return this.tagType;
    }

    @NotNull
    public final SleepTagInfo copy(@NotNull String tag, int tagType) {
        return new SleepTagInfo(tag, tagType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepTagInfo)) {
            return false;
        }
        SleepTagInfo sleepTagInfo = (SleepTagInfo) other;
        return Intrinsics.areEqual(this.tag, sleepTagInfo.tag) && this.tagType == sleepTagInfo.tagType;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final int getTagType() {
        return this.tagType;
    }

    public int hashCode() {
        return (this.tag.hashCode() * 31) + this.tagType;
    }

    @NotNull
    public String toString() {
        return "SleepTagInfo(tag=" + this.tag + ", tagType=" + this.tagType + ")";
    }

    public SleepTagInfo(@NotNull String str, int i) {
        this.tag = str;
        this.tagType = i;
    }

    public /* synthetic */ SleepTagInfo(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
