package com.huami.sky.lib.entity;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/huami/sky/lib/entity/MusicPreference;", "", "", "component1", "component2", "", "Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "component3", "title", "subTitle", "items", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubTitle", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MusicPreference {

    @NotNull
    private final List<MusicPreferenceItem> items;

    @SerializedName(MessengerShareContentUtility.SUBTITLE)
    @NotNull
    private final String subTitle;

    @NotNull
    private final String title;

    public MusicPreference(@NotNull String str, @NotNull String str2, @NotNull List<MusicPreferenceItem> list) {
        this.title = str;
        this.subTitle = str2;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicPreference copy$default(MusicPreference musicPreference, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicPreference.title;
        }
        if ((i & 2) != 0) {
            str2 = musicPreference.subTitle;
        }
        if ((i & 4) != 0) {
            list = musicPreference.items;
        }
        return musicPreference.copy(str, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final List<MusicPreferenceItem> component3() {
        return this.items;
    }

    @NotNull
    public final MusicPreference copy(@NotNull String title, @NotNull String subTitle, @NotNull List<MusicPreferenceItem> items) {
        return new MusicPreference(title, subTitle, items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicPreference)) {
            return false;
        }
        MusicPreference musicPreference = (MusicPreference) other;
        return Intrinsics.areEqual(this.title, musicPreference.title) && Intrinsics.areEqual(this.subTitle, musicPreference.subTitle) && Intrinsics.areEqual(this.items, musicPreference.items);
    }

    @NotNull
    public final List<MusicPreferenceItem> getItems() {
        return this.items;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.subTitle.hashCode()) * 31) + this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return "MusicPreference(title=" + this.title + ", subTitle=" + this.subTitle + ", items=" + this.items + ")";
    }
}
