package com.huami.sky.lib.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003JG\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\u0010\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "", "", "component1", "", "component2", "component3", "component4", "component5", "", "component6", "musicUrl", "id", "name", "animationUrl", "descriptionUrl", "isSelected", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getMusicUrl", "()Ljava/lang/String;", LogUtil.I, "getId", "()I", "getName", "getAnimationUrl", "getDescriptionUrl", "Z", "()Z", "setSelected", "(Z)V", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MusicPreferenceItem {

    @NotNull
    private final String animationUrl;

    @Nullable
    private final String descriptionUrl;
    private final int id;
    private boolean isSelected;

    @NotNull
    private final String musicUrl;

    @NotNull
    private final String name;

    public MusicPreferenceItem(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @Nullable String str4, boolean z) {
        this.musicUrl = str;
        this.id = i;
        this.name = str2;
        this.animationUrl = str3;
        this.descriptionUrl = str4;
        this.isSelected = z;
    }

    public static /* synthetic */ MusicPreferenceItem copy$default(MusicPreferenceItem musicPreferenceItem, String str, int i, String str2, String str3, String str4, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = musicPreferenceItem.musicUrl;
        }
        if ((i2 & 2) != 0) {
            i = musicPreferenceItem.id;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = musicPreferenceItem.name;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = musicPreferenceItem.animationUrl;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = musicPreferenceItem.descriptionUrl;
        }
        String str7 = str4;
        if ((i2 & 32) != 0) {
            z = musicPreferenceItem.isSelected;
        }
        return musicPreferenceItem.copy(str, i3, str5, str6, str7, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMusicUrl() {
        return this.musicUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAnimationUrl() {
        return this.animationUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescriptionUrl() {
        return this.descriptionUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final MusicPreferenceItem copy(@NotNull String musicUrl, int id, @NotNull String name, @NotNull String animationUrl, @Nullable String descriptionUrl, boolean isSelected) {
        return new MusicPreferenceItem(musicUrl, id, name, animationUrl, descriptionUrl, isSelected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicPreferenceItem)) {
            return false;
        }
        MusicPreferenceItem musicPreferenceItem = (MusicPreferenceItem) other;
        return Intrinsics.areEqual(this.musicUrl, musicPreferenceItem.musicUrl) && this.id == musicPreferenceItem.id && Intrinsics.areEqual(this.name, musicPreferenceItem.name) && Intrinsics.areEqual(this.animationUrl, musicPreferenceItem.animationUrl) && Intrinsics.areEqual(this.descriptionUrl, musicPreferenceItem.descriptionUrl) && this.isSelected == musicPreferenceItem.isSelected;
    }

    @NotNull
    public final String getAnimationUrl() {
        return this.animationUrl;
    }

    @Nullable
    public final String getDescriptionUrl() {
        return this.descriptionUrl;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getMusicUrl() {
        return this.musicUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((this.musicUrl.hashCode() * 31) + this.id) * 31) + this.name.hashCode()) * 31) + this.animationUrl.hashCode()) * 31;
        String str = this.descriptionUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isSelected;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode2 + r1;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    @NotNull
    public String toString() {
        return "MusicPreferenceItem(musicUrl=" + this.musicUrl + ", id=" + this.id + ", name=" + this.name + ", animationUrl=" + this.animationUrl + ", descriptionUrl=" + this.descriptionUrl + ", isSelected=" + this.isSelected + ")";
    }

    public /* synthetic */ MusicPreferenceItem(String str, int i, String str2, String str3, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, str4, (i2 & 32) != 0 ? false : z);
    }
}
