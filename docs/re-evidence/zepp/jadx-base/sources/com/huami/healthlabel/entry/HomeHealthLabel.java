package com.huami.healthlabel.entry;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.internal.ServerProtocol;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 B2\u00020\u0001:\u0002CBB9\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b<\u0010=B]\b\u0017\u0012\u0006\u0010>\u001a\u00020\t\u0012\b\b\u0001\u0010\u0013\u001a\u00020\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\b<\u0010AJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0012\u001a\u00020\u000bHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001a\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0013\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0014\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010#\u001a\u0004\b&\u0010'R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010%\u0012\u0004\b+\u0010#\u001a\u0004\b*\u0010'R\"\u0010\u0016\u001a\u00020\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u0010#\u001a\u0004\b\u0016\u0010.R(\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b0\u00101\u0012\u0004\b6\u0010#\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b7\u0010%\u0012\u0004\b;\u0010#\u001a\u0004\b8\u0010'\"\u0004\b9\u0010:¨\u0006D"}, d2 = {"Lcom/huami/healthlabel/entry/HomeHealthLabel;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "", "component4", "", "component5", "component6", "labelId", "labelText", "labelColor", "isShow", "sort", "reason", "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getLabelId", "()I", "getLabelId$annotations", "()V", "b", "Ljava/lang/String;", "getLabelText", "()Ljava/lang/String;", "getLabelText$annotations", "c", "getLabelColor", "getLabelColor$annotations", GoogleApiAvailabilityLight.a, "Z", "()Z", "isShow$annotations", "e", "J", "getSort", "()J", "setSort", "(J)V", "getSort$annotations", "f", "getReason", "setReason", "(Ljava/lang/String;)V", "getReason$annotations", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZJLjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;ZJLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class HomeHealthLabel {

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

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean isShow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private long sort;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private String reason;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/healthlabel/entry/HomeHealthLabel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/healthlabel/entry/HomeHealthLabel;", "serializer", "<init>", "()V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<HomeHealthLabel> serializer() {
            return HomeHealthLabel$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ HomeHealthLabel(int i, @SerialName("id") int i2, @SerialName("tag") String str, @SerialName("color") String str2, @SerialName(ServerProtocol.DIALOG_PARAM_DISPLAY) boolean z, @SerialName("sort") long j, @SerialName("reason") String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, HomeHealthLabel$$serializer.INSTANCE.getDescriptor());
        }
        this.labelId = i2;
        this.labelText = str;
        this.labelColor = str2;
        this.isShow = z;
        this.sort = j;
        if ((i & 32) == 0) {
            this.reason = "";
        } else {
            this.reason = str3;
        }
    }

    public static /* synthetic */ HomeHealthLabel copy$default(HomeHealthLabel homeHealthLabel, int i, String str, String str2, boolean z, long j, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = homeHealthLabel.labelId;
        }
        if ((i2 & 2) != 0) {
            str = homeHealthLabel.labelText;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = homeHealthLabel.labelColor;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            z = homeHealthLabel.isShow;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            j = homeHealthLabel.sort;
        }
        long j2 = j;
        if ((i2 & 32) != 0) {
            str3 = homeHealthLabel.reason;
        }
        return homeHealthLabel.copy(i, str4, str5, z2, j2, str3);
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

    @SerialName("reason")
    public static /* synthetic */ void getReason$annotations() {
    }

    @SerialName("sort")
    public static /* synthetic */ void getSort$annotations() {
    }

    @SerialName(ServerProtocol.DIALOG_PARAM_DISPLAY)
    public static /* synthetic */ void isShow$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull HomeHealthLabel self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.labelId);
        output.encodeStringElement(serialDesc, 1, self.labelText);
        output.encodeStringElement(serialDesc, 2, self.labelColor);
        output.encodeBooleanElement(serialDesc, 3, self.isShow);
        output.encodeLongElement(serialDesc, 4, self.sort);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !Intrinsics.areEqual(self.reason, "")) {
            output.encodeStringElement(serialDesc, 5, self.reason);
        }
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getSort() {
        return this.sort;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final HomeHealthLabel copy(int labelId, @NotNull String labelText, @NotNull String labelColor, boolean isShow, long sort, @NotNull String reason) {
        return new HomeHealthLabel(labelId, labelText, labelColor, isShow, sort, reason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeHealthLabel)) {
            return false;
        }
        HomeHealthLabel homeHealthLabel = (HomeHealthLabel) other;
        return this.labelId == homeHealthLabel.labelId && Intrinsics.areEqual(this.labelText, homeHealthLabel.labelText) && Intrinsics.areEqual(this.labelColor, homeHealthLabel.labelColor) && this.isShow == homeHealthLabel.isShow && this.sort == homeHealthLabel.sort && Intrinsics.areEqual(this.reason, homeHealthLabel.reason);
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

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    public final long getSort() {
        return this.sort;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    public int hashCode() {
        int iHashCode = ((((this.labelId * 31) + this.labelText.hashCode()) * 31) + this.labelColor.hashCode()) * 31;
        boolean z = this.isShow;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + b.a(this.sort)) * 31) + this.reason.hashCode();
    }

    public final boolean isShow() {
        return this.isShow;
    }

    public final void setReason(@NotNull String str) {
        this.reason = str;
    }

    public final void setSort(long j) {
        this.sort = j;
    }

    @NotNull
    public String toString() {
        return "HomeHealthLabel(labelId=" + this.labelId + ", labelText=" + this.labelText + ", labelColor=" + this.labelColor + ", isShow=" + this.isShow + ", sort=" + this.sort + ", reason=" + this.reason + ")";
    }

    public HomeHealthLabel(int i, @NotNull String str, @NotNull String str2, boolean z, long j, @NotNull String str3) {
        this.labelId = i;
        this.labelText = str;
        this.labelColor = str2;
        this.isShow = z;
        this.sort = j;
        this.reason = str3;
    }

    public /* synthetic */ HomeHealthLabel(int i, String str, String str2, boolean z, long j, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, z, j, (i2 & 32) != 0 ? "" : str3);
    }
}
