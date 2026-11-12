package com.huami.nfc.bus.entities;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J3\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015¨\u0006\""}, d2 = {"Lcom/huami/nfc/bus/entities/ButtonInfo;", "", "", "component1", "", "component2", "", "component3", "component4", "title", "noMorePrompt", "linkType", "link", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "Z", "getNoMorePrompt", "()Z", "c", LogUtil.I, "getLinkType", "()I", GoogleApiAvailabilityLight.a, "getLink", "<init>", "(Ljava/lang/String;ZILjava/lang/String;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ButtonInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("noMorePrompt")
    private final boolean noMorePrompt;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("linkType")
    private final int linkType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("link")
    @Nullable
    private final String link;

    public ButtonInfo(@NotNull String str, boolean z, int i, @Nullable String str2) {
        this.title = str;
        this.noMorePrompt = z;
        this.linkType = i;
        this.link = str2;
    }

    public static /* synthetic */ ButtonInfo copy$default(ButtonInfo buttonInfo, String str, boolean z, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = buttonInfo.title;
        }
        if ((i2 & 2) != 0) {
            z = buttonInfo.noMorePrompt;
        }
        if ((i2 & 4) != 0) {
            i = buttonInfo.linkType;
        }
        if ((i2 & 8) != 0) {
            str2 = buttonInfo.link;
        }
        return buttonInfo.copy(str, z, i, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getNoMorePrompt() {
        return this.noMorePrompt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLinkType() {
        return this.linkType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final ButtonInfo copy(@NotNull String title, boolean noMorePrompt, int linkType, @Nullable String link) {
        return new ButtonInfo(title, noMorePrompt, linkType, link);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonInfo)) {
            return false;
        }
        ButtonInfo buttonInfo = (ButtonInfo) other;
        return Intrinsics.areEqual(this.title, buttonInfo.title) && this.noMorePrompt == buttonInfo.noMorePrompt && this.linkType == buttonInfo.linkType && Intrinsics.areEqual(this.link, buttonInfo.link);
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    public final int getLinkType() {
        return this.linkType;
    }

    public final boolean getNoMorePrompt() {
        return this.noMorePrompt;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        boolean z = this.noMorePrompt;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (((iHashCode + r1) * 31) + this.linkType) * 31;
        String str = this.link;
        return i + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "ButtonInfo(title=" + this.title + ", noMorePrompt=" + this.noMorePrompt + ", linkType=" + this.linkType + ", link=" + ((Object) this.link) + ')';
    }
}
