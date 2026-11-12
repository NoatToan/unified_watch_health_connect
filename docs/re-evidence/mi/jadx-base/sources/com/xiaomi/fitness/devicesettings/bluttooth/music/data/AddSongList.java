package com.xiaomi.fitness.devicesettings.bluttooth.music.data;

import defpackage.elf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSongList;", "", "", "component1", "()I", "Lelf;", "component2", "()Lelf;", "status", "songList", "copy", "(ILelf;)Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSongList;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStatus", "setStatus", "(I)V", "Lelf;", "getSongList", "<init>", "(ILelf;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final /* data */ class AddSongList {

    @NotNull
    private final elf songList;
    private int status;

    public AddSongList(int i, @NotNull elf songList) {
        Intrinsics.checkNotNullParameter(songList, "songList");
        this.status = i;
        this.songList = songList;
    }

    public static /* synthetic */ AddSongList copy$default(AddSongList addSongList, int i, elf elfVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = addSongList.status;
        }
        if ((i2 & 2) != 0) {
            elfVar = addSongList.songList;
        }
        return addSongList.copy(i, elfVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final elf getSongList() {
        return this.songList;
    }

    @NotNull
    public final AddSongList copy(int status, @NotNull elf songList) {
        Intrinsics.checkNotNullParameter(songList, "songList");
        return new AddSongList(status, songList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddSongList)) {
            return false;
        }
        AddSongList addSongList = (AddSongList) other;
        return this.status == addSongList.status && Intrinsics.areEqual(this.songList, addSongList.songList);
    }

    @NotNull
    public final elf getSongList() {
        return this.songList;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (Integer.hashCode(this.status) * 31) + this.songList.hashCode();
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @NotNull
    public String toString() {
        return "AddSongList(status=" + this.status + ", songList=" + this.songList + ")";
    }
}
