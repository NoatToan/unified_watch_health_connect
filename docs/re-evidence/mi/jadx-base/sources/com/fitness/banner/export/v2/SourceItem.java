package com.fitness.banner.export.v2;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jq\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006*"}, d2 = {"Lcom/fitness/banner/export/v2/SourceItem;", "Ljava/io/Serializable;", "headLinkType", "", "iconDefaultUrl", "", "iconLarge", "padIconLarge", "padIconSmall", "iconImgJumpUrl", "iconLayerTxtStr", "layerLinkType", "iconLayerJumpUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getHeadLinkType", "()I", "getIconDefaultUrl", "()Ljava/lang/String;", "getIconLarge", "getPadIconLarge", "getPadIconSmall", "getIconImgJumpUrl", "getIconLayerTxtStr", "getLayerLinkType", "getIconLayerJumpUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SourceItem implements Serializable {

    @SerializedName("head_link_type")
    private final int headLinkType;

    @SerializedName("icon_small")
    @Nullable
    private final String iconDefaultUrl;

    @SerializedName("icon_head_link")
    @Nullable
    private final String iconImgJumpUrl;

    @SerializedName("icon_large")
    @Nullable
    private final String iconLarge;

    @SerializedName("icon_layer_link")
    @Nullable
    private final String iconLayerJumpUrl;

    @SerializedName("icon_layer")
    @Nullable
    private final String iconLayerTxtStr;

    @SerializedName("layer_link_type")
    private final int layerLinkType;

    @SerializedName("pad_icon_large")
    @Nullable
    private final String padIconLarge;

    @SerializedName("pad_icon_small")
    @Nullable
    private final String padIconSmall;

    public SourceItem(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i2, @Nullable String str7) {
        this.headLinkType = i;
        this.iconDefaultUrl = str;
        this.iconLarge = str2;
        this.padIconLarge = str3;
        this.padIconSmall = str4;
        this.iconImgJumpUrl = str5;
        this.iconLayerTxtStr = str6;
        this.layerLinkType = i2;
        this.iconLayerJumpUrl = str7;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHeadLinkType() {
        return this.headLinkType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIconDefaultUrl() {
        return this.iconDefaultUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconLarge() {
        return this.iconLarge;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPadIconLarge() {
        return this.padIconLarge;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPadIconSmall() {
        return this.padIconSmall;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIconImgJumpUrl() {
        return this.iconImgJumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIconLayerTxtStr() {
        return this.iconLayerTxtStr;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getLayerLinkType() {
        return this.layerLinkType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIconLayerJumpUrl() {
        return this.iconLayerJumpUrl;
    }

    @NotNull
    public final SourceItem copy(int headLinkType, @Nullable String iconDefaultUrl, @Nullable String iconLarge, @Nullable String padIconLarge, @Nullable String padIconSmall, @Nullable String iconImgJumpUrl, @Nullable String iconLayerTxtStr, int layerLinkType, @Nullable String iconLayerJumpUrl) {
        return new SourceItem(headLinkType, iconDefaultUrl, iconLarge, padIconLarge, padIconSmall, iconImgJumpUrl, iconLayerTxtStr, layerLinkType, iconLayerJumpUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceItem)) {
            return false;
        }
        SourceItem sourceItem = (SourceItem) other;
        return this.headLinkType == sourceItem.headLinkType && Intrinsics.areEqual(this.iconDefaultUrl, sourceItem.iconDefaultUrl) && Intrinsics.areEqual(this.iconLarge, sourceItem.iconLarge) && Intrinsics.areEqual(this.padIconLarge, sourceItem.padIconLarge) && Intrinsics.areEqual(this.padIconSmall, sourceItem.padIconSmall) && Intrinsics.areEqual(this.iconImgJumpUrl, sourceItem.iconImgJumpUrl) && Intrinsics.areEqual(this.iconLayerTxtStr, sourceItem.iconLayerTxtStr) && this.layerLinkType == sourceItem.layerLinkType && Intrinsics.areEqual(this.iconLayerJumpUrl, sourceItem.iconLayerJumpUrl);
    }

    public final int getHeadLinkType() {
        return this.headLinkType;
    }

    @Nullable
    public final String getIconDefaultUrl() {
        return this.iconDefaultUrl;
    }

    @Nullable
    public final String getIconImgJumpUrl() {
        return this.iconImgJumpUrl;
    }

    @Nullable
    public final String getIconLarge() {
        return this.iconLarge;
    }

    @Nullable
    public final String getIconLayerJumpUrl() {
        return this.iconLayerJumpUrl;
    }

    @Nullable
    public final String getIconLayerTxtStr() {
        return this.iconLayerTxtStr;
    }

    public final int getLayerLinkType() {
        return this.layerLinkType;
    }

    @Nullable
    public final String getPadIconLarge() {
        return this.padIconLarge;
    }

    @Nullable
    public final String getPadIconSmall() {
        return this.padIconSmall;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.headLinkType) * 31;
        String str = this.iconDefaultUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconLarge;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.padIconLarge;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.padIconSmall;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconImgJumpUrl;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.iconLayerTxtStr;
        int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + Integer.hashCode(this.layerLinkType)) * 31;
        String str7 = this.iconLayerJumpUrl;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SourceItem(headLinkType=" + this.headLinkType + ", iconDefaultUrl=" + this.iconDefaultUrl + ", iconLarge=" + this.iconLarge + ", padIconLarge=" + this.padIconLarge + ", padIconSmall=" + this.padIconSmall + ", iconImgJumpUrl=" + this.iconImgJumpUrl + ", iconLayerTxtStr=" + this.iconLayerTxtStr + ", layerLinkType=" + this.layerLinkType + ", iconLayerJumpUrl=" + this.iconLayerJumpUrl + ")";
    }

    public /* synthetic */ SourceItem(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : str5, (i3 & 64) != 0 ? null : str6, i2, (i3 & 256) != 0 ? null : str7);
    }
}
