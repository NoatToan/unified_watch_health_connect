package com.huami.healthlabel.entry;

import com.baidu.ocr.sdk.utils.LogUtil;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&B=\b\u0017\u0012\u0006\u0010'\u001a\u00020\t\u0012\b\b\u0001\u0010\u000e\u001a\u00020\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0012\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u000f\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010 R\"\u0010\u0010\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u0012\u0004\b$\u0010\u001c\u001a\u0004\b#\u0010 ¨\u0006-"}, d2 = {"Lcom/huami/healthlabel/entry/RecordContent;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "labelId", "labelText", "labelColor", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getLabelId", "()I", "getLabelId$annotations", "()V", "b", "Ljava/lang/String;", "getLabelText", "()Ljava/lang/String;", "getLabelText$annotations", "c", "getLabelColor", "getLabelColor$annotations", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class RecordContent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int labelId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String labelText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String labelColor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/healthlabel/entry/RecordContent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/healthlabel/entry/RecordContent;", "serializer", "<init>", "()V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<RecordContent> serializer() {
            return RecordContent$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ RecordContent(int i, @SerialName("id") int i2, @SerialName("tag") String str, @SerialName("color") String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, RecordContent$$serializer.INSTANCE.getDescriptor());
        }
        this.labelId = i2;
        this.labelText = str;
        this.labelColor = str2;
    }

    public static /* synthetic */ RecordContent copy$default(RecordContent recordContent, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recordContent.labelId;
        }
        if ((i2 & 2) != 0) {
            str = recordContent.labelText;
        }
        if ((i2 & 4) != 0) {
            str2 = recordContent.labelColor;
        }
        return recordContent.copy(i, str, str2);
    }

    @SerialName("color")
    public static /* synthetic */ void getLabelColor$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getLabelId$annotations() {
    }

    @SerialName("tag")
    public static /* synthetic */ void getLabelText$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull RecordContent self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.labelId);
        output.encodeStringElement(serialDesc, 1, self.labelText);
        output.encodeStringElement(serialDesc, 2, self.labelColor);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLabelId() {
        return this.labelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabelText() {
        return this.labelText;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabelColor() {
        return this.labelColor;
    }

    @NotNull
    public final RecordContent copy(int labelId, @NotNull String labelText, @NotNull String labelColor) {
        return new RecordContent(labelId, labelText, labelColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordContent)) {
            return false;
        }
        RecordContent recordContent = (RecordContent) other;
        return this.labelId == recordContent.labelId && Intrinsics.areEqual(this.labelText, recordContent.labelText) && Intrinsics.areEqual(this.labelColor, recordContent.labelColor);
    }

    @NotNull
    public final String getLabelColor() {
        return this.labelColor;
    }

    public final int getLabelId() {
        return this.labelId;
    }

    @NotNull
    public final String getLabelText() {
        return this.labelText;
    }

    public int hashCode() {
        return (((this.labelId * 31) + this.labelText.hashCode()) * 31) + this.labelColor.hashCode();
    }

    @NotNull
    public String toString() {
        return "RecordContent(labelId=" + this.labelId + ", labelText=" + this.labelText + ", labelColor=" + this.labelColor + ")";
    }

    public RecordContent(int i, @NotNull String str, @NotNull String str2) {
        this.labelId = i;
        this.labelText = str;
        this.labelColor = str2;
    }
}
