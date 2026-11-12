package com.garmin.android.music;

import android.graphics.Bitmap;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0002J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0002J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/garmin/android/music/EntityTrackData;", "", "artist", "", "album", "title", "durationInSeconds", "", "albumArt", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroid/graphics/Bitmap;)V", "getAlbum", "()Ljava/lang/String;", "getAlbumArt", "()Landroid/graphics/Bitmap;", "getArtist", "getDurationInSeconds", "()J", "getTitle", "albumArtEquals", "", "other", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "hashCode", "", "metadataEquals", "toString", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EntityTrackData {
    private final String album;
    private final Bitmap albumArt;
    private final String artist;
    private final long durationInSeconds;
    private final String title;

    public EntityTrackData(String str, String str2, String str3, long j8, Bitmap bitmap) {
        this.artist = str;
        this.album = str2;
        this.title = str3;
        this.durationInSeconds = j8;
        this.albumArt = bitmap;
    }

    private final boolean albumArtEquals(EntityTrackData other) {
        Bitmap bitmap = this.albumArt;
        Bitmap bitmap2 = other.albumArt;
        if (bitmap == bitmap2) {
            return true;
        }
        return bitmap != null && bitmap.sameAs(bitmap2);
    }

    public static /* synthetic */ EntityTrackData copy$default(EntityTrackData entityTrackData, String str, String str2, String str3, long j8, Bitmap bitmap, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = entityTrackData.artist;
        }
        if ((i14 & 2) != 0) {
            str2 = entityTrackData.album;
        }
        if ((i14 & 4) != 0) {
            str3 = entityTrackData.title;
        }
        if ((i14 & 8) != 0) {
            j8 = entityTrackData.durationInSeconds;
        }
        if ((i14 & 16) != 0) {
            bitmap = entityTrackData.albumArt;
        }
        Bitmap bitmap2 = bitmap;
        String str4 = str3;
        return entityTrackData.copy(str, str2, str4, j8, bitmap2);
    }

    private final boolean metadataEquals(EntityTrackData other) {
        return s.g(this.artist, other.artist) && s.g(this.album, other.album) && s.g(this.title, other.title) && this.durationInSeconds == other.durationInSeconds;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getArtist() {
        return this.artist;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlbum() {
        return this.album;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Bitmap getAlbumArt() {
        return this.albumArt;
    }

    public final EntityTrackData copy(String artist, String album, String title, long durationInSeconds, Bitmap albumArt) {
        return new EntityTrackData(artist, album, title, durationInSeconds, albumArt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntityTrackData)) {
            return false;
        }
        EntityTrackData entityTrackData = (EntityTrackData) other;
        return metadataEquals(entityTrackData) && albumArtEquals(entityTrackData);
    }

    public final String getAlbum() {
        return this.album;
    }

    public final Bitmap getAlbumArt() {
        return this.albumArt;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final long getDurationInSeconds() {
        return this.durationInSeconds;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.artist;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.album;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        int iE = f.e((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.durationInSeconds);
        Bitmap bitmap = this.albumArt;
        return iE + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public String toString() {
        String str = this.artist;
        String str2 = this.album;
        String str3 = this.title;
        long j8 = this.durationInSeconds;
        Bitmap bitmap = this.albumArt;
        StringBuilder sbI = p6.b.i("EntityTrackData(artist=", str, ", album=", str2, ", title=");
        e5.s(j8, str3, ", durationInSeconds=", sbI);
        sbI.append(", albumArt=");
        sbI.append(bitmap);
        sbI.append(")");
        return sbI.toString();
    }
}
