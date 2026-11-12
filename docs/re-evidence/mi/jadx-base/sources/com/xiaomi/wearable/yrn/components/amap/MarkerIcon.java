package com.xiaomi.wearable.yrn.components.amap;

import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.wearable.yrn.components.TextProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/MarkerIcon;", "", "title", "", "titleStyle", "Lcom/xiaomi/wearable/yrn/components/TextProps;", CardUIInfo.KEY_SUBTITILE, "subTitleStyle", "icon", "extra", "Lcom/xiaomi/wearable/yrn/components/amap/MarkerExtraProps;", "<init>", "(Ljava/lang/String;Lcom/xiaomi/wearable/yrn/components/TextProps;Ljava/lang/String;Lcom/xiaomi/wearable/yrn/components/TextProps;Ljava/lang/String;Lcom/xiaomi/wearable/yrn/components/amap/MarkerExtraProps;)V", "getTitle", "()Ljava/lang/String;", "getTitleStyle", "()Lcom/xiaomi/wearable/yrn/components/TextProps;", "getSubTitle", "getSubTitleStyle", "getIcon", "getExtra", "()Lcom/xiaomi/wearable/yrn/components/amap/MarkerExtraProps;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MarkerIcon {

    @Nullable
    private final MarkerExtraProps extra;

    @NotNull
    private final String icon;

    @Nullable
    private final String subTitle;

    @Nullable
    private final TextProps subTitleStyle;

    @NotNull
    private final String title;

    @Nullable
    private final TextProps titleStyle;

    public MarkerIcon(@NotNull String title, @Nullable TextProps textProps, @Nullable String str, @Nullable TextProps textProps2, @NotNull String icon, @Nullable MarkerExtraProps markerExtraProps) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.title = title;
        this.titleStyle = textProps;
        this.subTitle = str;
        this.subTitleStyle = textProps2;
        this.icon = icon;
        this.extra = markerExtraProps;
    }

    public static /* synthetic */ MarkerIcon copy$default(MarkerIcon markerIcon, String str, TextProps textProps, String str2, TextProps textProps2, String str3, MarkerExtraProps markerExtraProps, int i, Object obj) {
        if ((i & 1) != 0) {
            str = markerIcon.title;
        }
        if ((i & 2) != 0) {
            textProps = markerIcon.titleStyle;
        }
        TextProps textProps3 = textProps;
        if ((i & 4) != 0) {
            str2 = markerIcon.subTitle;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            textProps2 = markerIcon.subTitleStyle;
        }
        TextProps textProps4 = textProps2;
        if ((i & 16) != 0) {
            str3 = markerIcon.icon;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            markerExtraProps = markerIcon.extra;
        }
        return markerIcon.copy(str, textProps3, str4, textProps4, str5, markerExtraProps);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextProps getTitleStyle() {
        return this.titleStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextProps getSubTitleStyle() {
        return this.subTitleStyle;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MarkerExtraProps getExtra() {
        return this.extra;
    }

    @NotNull
    public final MarkerIcon copy(@NotNull String title, @Nullable TextProps titleStyle, @Nullable String subTitle, @Nullable TextProps subTitleStyle, @NotNull String icon, @Nullable MarkerExtraProps extra) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new MarkerIcon(title, titleStyle, subTitle, subTitleStyle, icon, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkerIcon)) {
            return false;
        }
        MarkerIcon markerIcon = (MarkerIcon) other;
        return Intrinsics.areEqual(this.title, markerIcon.title) && Intrinsics.areEqual(this.titleStyle, markerIcon.titleStyle) && Intrinsics.areEqual(this.subTitle, markerIcon.subTitle) && Intrinsics.areEqual(this.subTitleStyle, markerIcon.subTitleStyle) && Intrinsics.areEqual(this.icon, markerIcon.icon) && Intrinsics.areEqual(this.extra, markerIcon.extra);
    }

    @Nullable
    public final MarkerExtraProps getExtra() {
        return this.extra;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final TextProps getSubTitleStyle() {
        return this.subTitleStyle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final TextProps getTitleStyle() {
        return this.titleStyle;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextProps textProps = this.titleStyle;
        int iHashCode2 = (iHashCode + (textProps == null ? 0 : textProps.hashCode())) * 31;
        String str = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        TextProps textProps2 = this.subTitleStyle;
        int iHashCode4 = (((iHashCode3 + (textProps2 == null ? 0 : textProps2.hashCode())) * 31) + this.icon.hashCode()) * 31;
        MarkerExtraProps markerExtraProps = this.extra;
        return iHashCode4 + (markerExtraProps != null ? markerExtraProps.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarkerIcon(title=" + this.title + ", titleStyle=" + this.titleStyle + ", subTitle=" + this.subTitle + ", subTitleStyle=" + this.subTitleStyle + ", icon=" + this.icon + ", extra=" + this.extra + ")";
    }
}
