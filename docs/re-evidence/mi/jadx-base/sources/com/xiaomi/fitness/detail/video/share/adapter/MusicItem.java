package com.xiaomi.fitness.detail.video.share.adapter;

import com.mi.health.search.SearchContract;
import com.mibi.sdk.component.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/adapter/MusicItem;", "", "name", "", "styleId", SearchContract.COLUMN_ICON_RESID, "", Constants.KEY_RECHARGE_ICON_URL, "typeId", "state", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIZ)V", "getName", "()Ljava/lang/String;", "getStyleId", "getIconResId", "()I", "getIconUrl", "getTypeId", "getState", "setState", "(I)V", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MusicItem {
    private final int iconResId;

    @NotNull
    private final String iconUrl;
    private boolean isSelected;

    @NotNull
    private final String name;
    private int state;

    @NotNull
    private final String styleId;
    private final int typeId;

    public MusicItem(@NotNull String name, @NotNull String styleId, int i, @NotNull String iconUrl, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.name = name;
        this.styleId = styleId;
        this.iconResId = i;
        this.iconUrl = iconUrl;
        this.typeId = i2;
        this.state = i3;
        this.isSelected = z;
    }

    public static /* synthetic */ MusicItem copy$default(MusicItem musicItem, String str, String str2, int i, String str3, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = musicItem.name;
        }
        if ((i4 & 2) != 0) {
            str2 = musicItem.styleId;
        }
        String str4 = str2;
        if ((i4 & 4) != 0) {
            i = musicItem.iconResId;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            str3 = musicItem.iconUrl;
        }
        String str5 = str3;
        if ((i4 & 16) != 0) {
            i2 = musicItem.typeId;
        }
        int i6 = i2;
        if ((i4 & 32) != 0) {
            i3 = musicItem.state;
        }
        int i7 = i3;
        if ((i4 & 64) != 0) {
            z = musicItem.isSelected;
        }
        return musicItem.copy(str, str4, i5, str5, i6, i7, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStyleId() {
        return this.styleId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final MusicItem copy(@NotNull String name, @NotNull String styleId, int iconResId, @NotNull String iconUrl, int typeId, int state, boolean isSelected) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        return new MusicItem(name, styleId, iconResId, iconUrl, typeId, state, isSelected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicItem)) {
            return false;
        }
        MusicItem musicItem = (MusicItem) other;
        return Intrinsics.areEqual(this.name, musicItem.name) && Intrinsics.areEqual(this.styleId, musicItem.styleId) && this.iconResId == musicItem.iconResId && Intrinsics.areEqual(this.iconUrl, musicItem.iconUrl) && this.typeId == musicItem.typeId && this.state == musicItem.state && this.isSelected == musicItem.isSelected;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getState() {
        return this.state;
    }

    @NotNull
    public final String getStyleId() {
        return this.styleId;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public int hashCode() {
        return (((((((((((this.name.hashCode() * 31) + this.styleId.hashCode()) * 31) + Integer.hashCode(this.iconResId)) * 31) + this.iconUrl.hashCode()) * 31) + Integer.hashCode(this.typeId)) * 31) + Integer.hashCode(this.state)) * 31) + Boolean.hashCode(this.isSelected);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setState(int i) {
        this.state = i;
    }

    @NotNull
    public String toString() {
        return "MusicItem(name=" + this.name + ", styleId=" + this.styleId + ", iconResId=" + this.iconResId + ", iconUrl=" + this.iconUrl + ", typeId=" + this.typeId + ", state=" + this.state + ", isSelected=" + this.isSelected + ")";
    }

    public /* synthetic */ MusicItem(String str, String str2, int i, String str3, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i4 & 4) != 0 ? 0 : i, str3, i2, i3, (i4 & 64) != 0 ? false : z);
    }
}
