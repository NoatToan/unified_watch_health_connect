package com.xiaomi.fitness.devicesettings.bluttooth.music.data;

import defpackage.clf;
import defpackage.elf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/MusicMedia;", "", "Lclf;", "component1", "()Lclf;", "Lelf;", "component2", "()Lelf;", "song", "songList", "copy", "(Lclf;Lelf;)Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/MusicMedia;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lclf;", "getSong", "Lelf;", "getSongList", "<init>", "(Lclf;Lelf;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final /* data */ class MusicMedia {

    @NotNull
    private final clf song;

    @NotNull
    private final elf songList;

    public MusicMedia(@NotNull clf song, @NotNull elf songList) {
        Intrinsics.checkNotNullParameter(song, "song");
        Intrinsics.checkNotNullParameter(songList, "songList");
        this.song = song;
        this.songList = songList;
    }

    public static /* synthetic */ MusicMedia copy$default(MusicMedia musicMedia, clf clfVar, elf elfVar, int i, Object obj) {
        if ((i & 1) != 0) {
            clfVar = musicMedia.song;
        }
        if ((i & 2) != 0) {
            elfVar = musicMedia.songList;
        }
        return musicMedia.copy(clfVar, elfVar);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final clf getSong() {
        return this.song;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final elf getSongList() {
        return this.songList;
    }

    @NotNull
    public final MusicMedia copy(@NotNull clf song, @NotNull elf songList) {
        Intrinsics.checkNotNullParameter(song, "song");
        Intrinsics.checkNotNullParameter(songList, "songList");
        return new MusicMedia(song, songList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicMedia)) {
            return false;
        }
        MusicMedia musicMedia = (MusicMedia) other;
        return Intrinsics.areEqual(this.song, musicMedia.song) && Intrinsics.areEqual(this.songList, musicMedia.songList);
    }

    @NotNull
    public final clf getSong() {
        return this.song;
    }

    @NotNull
    public final elf getSongList() {
        return this.songList;
    }

    public int hashCode() {
        return (this.song.hashCode() * 31) + this.songList.hashCode();
    }

    @NotNull
    public String toString() {
        return "MusicMedia(song=" + this.song + ", songList=" + this.songList + ")";
    }
}
