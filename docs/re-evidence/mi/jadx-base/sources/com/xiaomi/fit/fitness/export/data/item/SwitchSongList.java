package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongList;", "Ljava/io/Serializable;", "songList", "", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;", "<init>", "(Ljava/util/List;)V", "getSongList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SwitchSongList implements Serializable {

    @SerializedName("songList")
    @Nullable
    private final List<SwitchSongItem> songList;

    public SwitchSongList(@Nullable List<SwitchSongItem> list) {
        this.songList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SwitchSongList copy$default(SwitchSongList switchSongList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = switchSongList.songList;
        }
        return switchSongList.copy(list);
    }

    @Nullable
    public final List<SwitchSongItem> component1() {
        return this.songList;
    }

    @NotNull
    public final SwitchSongList copy(@Nullable List<SwitchSongItem> songList) {
        return new SwitchSongList(songList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SwitchSongList) && Intrinsics.areEqual(this.songList, ((SwitchSongList) other).songList);
    }

    @Nullable
    public final List<SwitchSongItem> getSongList() {
        return this.songList;
    }

    public int hashCode() {
        List<SwitchSongItem> list = this.songList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "SwitchSongList(songList=" + this.songList + ")";
    }
}
