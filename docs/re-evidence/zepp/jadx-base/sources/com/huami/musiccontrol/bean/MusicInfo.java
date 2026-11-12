package com.huami.musiccontrol.bean;

import com.alipay.sdk.m.x.d;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.companion.facestore.database.WactchFacesProvider;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\"\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/huami/musiccontrol/bean/MusicInfo;", "", "other", "", "equals", "", "hashCode", "", "component1", "component2", "component3", "", "component4", WactchFacesProvider.DatabaseHelper.ARTIST, "album", "title", "duration", "copy", "toString", "a", "Ljava/lang/String;", "getArtist", "()Ljava/lang/String;", "setArtist", "(Ljava/lang/String;)V", "b", "getAlbum", "setAlbum", "c", "getTitle", d.o, GoogleApiAvailabilityLight.a, "J", "getDuration", "()J", "setDuration", "(J)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "music_control_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class MusicInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private String artist;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private String album;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private long duration;

    public MusicInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, long j) {
        this.artist = str;
        this.album = str2;
        this.title = str3;
        this.duration = j;
    }

    public static /* synthetic */ MusicInfo copy$default(MusicInfo musicInfo, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicInfo.artist;
        }
        if ((i & 2) != 0) {
            str2 = musicInfo.album;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = musicInfo.title;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = musicInfo.duration;
        }
        return musicInfo.copy(str, str4, str5, j);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getArtist() {
        return this.artist;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlbum() {
        return this.album;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final MusicInfo copy(@Nullable String artist, @Nullable String album, @Nullable String title, long duration) {
        return new MusicInfo(artist, album, title, duration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(MusicInfo.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.musiccontrol.bean.MusicInfo");
        MusicInfo musicInfo = (MusicInfo) other;
        return ((Intrinsics.areEqual(this.artist, musicInfo.artist) ^ true) || (Intrinsics.areEqual(this.album, musicInfo.album) ^ true) || (Intrinsics.areEqual(this.title, musicInfo.title) ^ true) || this.duration != musicInfo.duration) ? false : true;
    }

    @Nullable
    public final String getAlbum() {
        return this.album;
    }

    @Nullable
    public final String getArtist() {
        return this.artist;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.artist;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.album;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAlbum(@Nullable String str) {
        this.album = str;
    }

    public final void setArtist(@Nullable String str) {
        this.artist = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "MusicInfo(artist=" + this.artist + ", album=" + this.album + ", title=" + this.title + ", duration=" + this.duration + ")";
    }

    public /* synthetic */ MusicInfo(String str, String str2, String str3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? -1L : j);
    }
}
