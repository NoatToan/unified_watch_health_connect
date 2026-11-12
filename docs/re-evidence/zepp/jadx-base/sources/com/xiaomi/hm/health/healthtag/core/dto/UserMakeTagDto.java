package com.xiaomi.hm.health.healthtag.core.dto;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
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

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B/\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b%\u0010&B=\b\u0017\u0012\u0006\u0010'\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\tHÆ\u0001J\t\u0010\u0014\u001a\u00020\fHÖ\u0001J\t\u0010\u0015\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0010\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0012\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001c¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/core/dto/UserMakeTagDto;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "", "component3", "component4", "startTime", "endTime", "tag", "tagType", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getStartTime", "()I", "b", "getEndTime", "c", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "getTagType", "<init>", "(IILjava/lang/String;I)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class UserMakeTagDto {

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/core/dto/UserMakeTagDto$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/xiaomi/hm/health/healthtag/core/dto/UserMakeTagDto;", "serializer", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<UserMakeTagDto> serializer() {
            return UserMakeTagDto$$serializer.INSTANCE;
        }
    }

    public UserMakeTagDto() {
        this(0, 0, (String) null, 0, 15, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ UserMakeTagDto(int i, int i2, int i3, String str, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, UserMakeTagDto$$serializer.INSTANCE.getDescriptor());
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
    }

    public static /* synthetic */ UserMakeTagDto copy$default(UserMakeTagDto userMakeTagDto, int i, int i2, String str, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = userMakeTagDto.startTime;
        }
        if ((i4 & 2) != 0) {
            i2 = userMakeTagDto.endTime;
        }
        if ((i4 & 4) != 0) {
            str = userMakeTagDto.tag;
        }
        if ((i4 & 8) != 0) {
            i3 = userMakeTagDto.tagType;
        }
        return userMakeTagDto.copy(i, i2, str, i3);
    }

    @JvmStatic
    public static final void write$Self(@NotNull UserMakeTagDto self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
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

    @NotNull
    public final UserMakeTagDto copy(int startTime, int endTime, @NotNull String tag, int tagType) {
        return new UserMakeTagDto(startTime, endTime, tag, tagType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserMakeTagDto)) {
            return false;
        }
        UserMakeTagDto userMakeTagDto = (UserMakeTagDto) other;
        return this.startTime == userMakeTagDto.startTime && this.endTime == userMakeTagDto.endTime && Intrinsics.areEqual(this.tag, userMakeTagDto.tag) && this.tagType == userMakeTagDto.tagType;
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

    public int hashCode() {
        return (((((this.startTime * 31) + this.endTime) * 31) + this.tag.hashCode()) * 31) + this.tagType;
    }

    @NotNull
    public String toString() {
        return "UserMakeTagDto(startTime=" + this.startTime + ", endTime=" + this.endTime + ", tag=" + this.tag + ", tagType=" + this.tagType + ")";
    }

    public UserMakeTagDto(int i, int i2, @NotNull String str, int i3) {
        this.startTime = i;
        this.endTime = i2;
        this.tag = str;
        this.tagType = i3;
    }

    public /* synthetic */ UserMakeTagDto(int i, int i2, String str, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? 0 : i3);
    }
}
