package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItemArtist;", "Ljava/io/Serializable;", "artist", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getArtist", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SwitchSongItemArtist implements Serializable {

    @SerializedName("artist")
    @NotNull
    private final String artist;

    @SerializedName("title")
    @NotNull
    private final String title;

    public SwitchSongItemArtist(@NotNull String artist, @NotNull String title) {
        Intrinsics.checkNotNullParameter(artist, "artist");
        Intrinsics.checkNotNullParameter(title, "title");
        this.artist = artist;
        this.title = title;
    }

    public static /* synthetic */ SwitchSongItemArtist copy$default(SwitchSongItemArtist switchSongItemArtist, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = switchSongItemArtist.artist;
        }
        if ((i & 2) != 0) {
            str2 = switchSongItemArtist.title;
        }
        return switchSongItemArtist.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getArtist() {
        return this.artist;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final SwitchSongItemArtist copy(@NotNull String artist, @NotNull String title) {
        Intrinsics.checkNotNullParameter(artist, "artist");
        Intrinsics.checkNotNullParameter(title, "title");
        return new SwitchSongItemArtist(artist, title);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchSongItemArtist)) {
            return false;
        }
        SwitchSongItemArtist switchSongItemArtist = (SwitchSongItemArtist) other;
        return Intrinsics.areEqual(this.artist, switchSongItemArtist.artist) && Intrinsics.areEqual(this.title, switchSongItemArtist.title);
    }

    @NotNull
    public final String getArtist() {
        return this.artist;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.artist.hashCode() * 31) + this.title.hashCode();
    }

    @NotNull
    public String toString() {
        return "SwitchSongItemArtist(artist=" + this.artist + ", title=" + this.title + ")";
    }
}
