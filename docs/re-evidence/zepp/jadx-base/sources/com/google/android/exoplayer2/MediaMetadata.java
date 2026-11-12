package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaMetadata implements Bundleable {
    private static final int A = 26;
    private static final int B = 27;
    private static final int C = 28;
    private static final int D = 29;
    private static final int E = 1000;
    public static final int FOLDER_TYPE_ALBUMS = 2;
    public static final int FOLDER_TYPE_ARTISTS = 3;
    public static final int FOLDER_TYPE_GENRES = 4;
    public static final int FOLDER_TYPE_MIXED = 0;
    public static final int FOLDER_TYPE_NONE = -1;
    public static final int FOLDER_TYPE_PLAYLISTS = 5;
    public static final int FOLDER_TYPE_TITLES = 1;
    public static final int FOLDER_TYPE_YEARS = 6;
    public static final int PICTURE_TYPE_ARTIST_PERFORMER = 8;
    public static final int PICTURE_TYPE_A_BRIGHT_COLORED_FISH = 17;
    public static final int PICTURE_TYPE_BACK_COVER = 4;
    public static final int PICTURE_TYPE_BAND_ARTIST_LOGO = 19;
    public static final int PICTURE_TYPE_BAND_ORCHESTRA = 10;
    public static final int PICTURE_TYPE_COMPOSER = 11;
    public static final int PICTURE_TYPE_CONDUCTOR = 9;
    public static final int PICTURE_TYPE_DURING_PERFORMANCE = 15;
    public static final int PICTURE_TYPE_DURING_RECORDING = 14;
    public static final int PICTURE_TYPE_FILE_ICON = 1;
    public static final int PICTURE_TYPE_FILE_ICON_OTHER = 2;
    public static final int PICTURE_TYPE_FRONT_COVER = 3;
    public static final int PICTURE_TYPE_ILLUSTRATION = 18;
    public static final int PICTURE_TYPE_LEAD_ARTIST_PERFORMER = 7;
    public static final int PICTURE_TYPE_LEAFLET_PAGE = 5;
    public static final int PICTURE_TYPE_LYRICIST = 12;
    public static final int PICTURE_TYPE_MEDIA = 6;
    public static final int PICTURE_TYPE_MOVIE_VIDEO_SCREEN_CAPTURE = 16;
    public static final int PICTURE_TYPE_OTHER = 0;
    public static final int PICTURE_TYPE_PUBLISHER_STUDIO_LOGO = 20;
    public static final int PICTURE_TYPE_RECORDING_LOCATION = 13;
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = 5;
    private static final int g = 6;
    private static final int h = 7;
    private static final int i = 8;
    private static final int j = 9;
    private static final int k = 10;
    private static final int l = 11;
    private static final int m = 12;
    private static final int n = 13;
    private static final int o = 14;
    private static final int p = 15;
    private static final int q = 16;
    private static final int r = 17;
    private static final int s = 18;
    private static final int t = 19;
    private static final int u = 20;
    private static final int v = 21;
    private static final int w = 22;
    private static final int x = 23;
    private static final int y = 24;
    private static final int z = 25;

    @Nullable
    public final CharSequence albumArtist;

    @Nullable
    public final CharSequence albumTitle;

    @Nullable
    public final CharSequence artist;

    @Nullable
    public final byte[] artworkData;

    @Nullable
    public final Integer artworkDataType;

    @Nullable
    public final Uri artworkUri;

    @Nullable
    public final CharSequence compilation;

    @Nullable
    public final CharSequence composer;

    @Nullable
    public final CharSequence conductor;

    @Nullable
    public final CharSequence description;

    @Nullable
    public final Integer discNumber;

    @Nullable
    public final CharSequence displayTitle;

    @Nullable
    public final Bundle extras;

    @Nullable
    public final Integer folderType;

    @Nullable
    public final CharSequence genre;

    @Nullable
    public final Boolean isPlayable;

    @Nullable
    public final Uri mediaUri;

    @Nullable
    public final Rating overallRating;

    @Nullable
    public final Integer recordingDay;

    @Nullable
    public final Integer recordingMonth;

    @Nullable
    public final Integer recordingYear;

    @Nullable
    public final Integer releaseDay;

    @Nullable
    public final Integer releaseMonth;

    @Nullable
    public final Integer releaseYear;

    @Nullable
    public final CharSequence subtitle;

    @Nullable
    public final CharSequence title;

    @Nullable
    public final Integer totalDiscCount;

    @Nullable
    public final Integer totalTrackCount;

    @Nullable
    public final Integer trackNumber;

    @Nullable
    public final Rating userRating;

    @Nullable
    public final CharSequence writer;

    @Nullable
    @Deprecated
    public final Integer year;
    public static final MediaMetadata EMPTY = new Builder().build();
    public static final Bundleable.Creator<MediaMetadata> CREATOR = new Bundleable.Creator() { // from class: yw4
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return MediaMetadata.b(bundle);
        }
    };

    public static final class Builder {

        @Nullable
        private Integer A;

        @Nullable
        private Integer B;

        @Nullable
        private CharSequence C;

        @Nullable
        private CharSequence D;

        @Nullable
        private Bundle E;

        @Nullable
        private CharSequence a;

        @Nullable
        private CharSequence b;

        @Nullable
        private CharSequence c;

        @Nullable
        private CharSequence d;

        @Nullable
        private CharSequence e;

        @Nullable
        private CharSequence f;

        @Nullable
        private CharSequence g;

        @Nullable
        private Uri h;

        @Nullable
        private Rating i;

        @Nullable
        private Rating j;

        @Nullable
        private byte[] k;

        @Nullable
        private Integer l;

        @Nullable
        private Uri m;

        @Nullable
        private Integer n;

        @Nullable
        private Integer o;

        @Nullable
        private Integer p;

        @Nullable
        private Boolean q;

        @Nullable
        private Integer r;

        @Nullable
        private Integer s;

        @Nullable
        private Integer t;

        @Nullable
        private Integer u;

        @Nullable
        private Integer v;

        @Nullable
        private Integer w;

        @Nullable
        private CharSequence x;

        @Nullable
        private CharSequence y;

        @Nullable
        private CharSequence z;

        public MediaMetadata build() {
            return new MediaMetadata(this);
        }

        public Builder maybeSetArtworkData(byte[] artworkData, int artworkDataType) {
            if (this.k == null || Util.areEqual(Integer.valueOf(artworkDataType), 3) || !Util.areEqual(this.l, 3)) {
                this.k = (byte[]) artworkData.clone();
                this.l = Integer.valueOf(artworkDataType);
            }
            return this;
        }

        public Builder populateFromMetadata(Metadata metadata) {
            for (int i = 0; i < metadata.length(); i++) {
                metadata.get(i).populateMediaMetadata(this);
            }
            return this;
        }

        public Builder setAlbumArtist(@Nullable CharSequence albumArtist) {
            this.d = albumArtist;
            return this;
        }

        public Builder setAlbumTitle(@Nullable CharSequence albumTitle) {
            this.c = albumTitle;
            return this;
        }

        public Builder setArtist(@Nullable CharSequence artist) {
            this.b = artist;
            return this;
        }

        @Deprecated
        public Builder setArtworkData(@Nullable byte[] artworkData) {
            return setArtworkData(artworkData, null);
        }

        public Builder setArtworkUri(@Nullable Uri artworkUri) {
            this.m = artworkUri;
            return this;
        }

        public Builder setCompilation(@Nullable CharSequence compilation) {
            this.D = compilation;
            return this;
        }

        public Builder setComposer(@Nullable CharSequence composer) {
            this.y = composer;
            return this;
        }

        public Builder setConductor(@Nullable CharSequence conductor) {
            this.z = conductor;
            return this;
        }

        public Builder setDescription(@Nullable CharSequence description) {
            this.g = description;
            return this;
        }

        public Builder setDiscNumber(@Nullable Integer discNumber) {
            this.A = discNumber;
            return this;
        }

        public Builder setDisplayTitle(@Nullable CharSequence displayTitle) {
            this.e = displayTitle;
            return this;
        }

        public Builder setExtras(@Nullable Bundle extras) {
            this.E = extras;
            return this;
        }

        public Builder setFolderType(@Nullable Integer folderType) {
            this.p = folderType;
            return this;
        }

        public Builder setGenre(@Nullable CharSequence genre) {
            this.C = genre;
            return this;
        }

        public Builder setIsPlayable(@Nullable Boolean isPlayable) {
            this.q = isPlayable;
            return this;
        }

        public Builder setMediaUri(@Nullable Uri mediaUri) {
            this.h = mediaUri;
            return this;
        }

        public Builder setOverallRating(@Nullable Rating overallRating) {
            this.j = overallRating;
            return this;
        }

        public Builder setRecordingDay(@IntRange(from = 1, to = 31) @Nullable Integer recordingDay) {
            this.t = recordingDay;
            return this;
        }

        public Builder setRecordingMonth(@IntRange(from = 1, to = 12) @Nullable Integer recordingMonth) {
            this.s = recordingMonth;
            return this;
        }

        public Builder setRecordingYear(@Nullable Integer recordingYear) {
            this.r = recordingYear;
            return this;
        }

        public Builder setReleaseDay(@IntRange(from = 1, to = 31) @Nullable Integer releaseDay) {
            this.w = releaseDay;
            return this;
        }

        public Builder setReleaseMonth(@IntRange(from = 1, to = 12) @Nullable Integer releaseMonth) {
            this.v = releaseMonth;
            return this;
        }

        public Builder setReleaseYear(@Nullable Integer releaseYear) {
            this.u = releaseYear;
            return this;
        }

        public Builder setSubtitle(@Nullable CharSequence subtitle) {
            this.f = subtitle;
            return this;
        }

        public Builder setTitle(@Nullable CharSequence title) {
            this.a = title;
            return this;
        }

        public Builder setTotalDiscCount(@Nullable Integer totalDiscCount) {
            this.B = totalDiscCount;
            return this;
        }

        public Builder setTotalTrackCount(@Nullable Integer totalTrackCount) {
            this.o = totalTrackCount;
            return this;
        }

        public Builder setTrackNumber(@Nullable Integer trackNumber) {
            this.n = trackNumber;
            return this;
        }

        public Builder setUserRating(@Nullable Rating userRating) {
            this.i = userRating;
            return this;
        }

        public Builder setWriter(@Nullable CharSequence writer) {
            this.x = writer;
            return this;
        }

        @Deprecated
        public Builder setYear(@Nullable Integer year) {
            return setRecordingYear(year);
        }

        public Builder() {
        }

        public Builder setArtworkData(@Nullable byte[] artworkData, @Nullable Integer artworkDataType) {
            this.k = artworkData == null ? null : (byte[]) artworkData.clone();
            this.l = artworkDataType;
            return this;
        }

        private Builder(MediaMetadata mediaMetadata) {
            this.a = mediaMetadata.title;
            this.b = mediaMetadata.artist;
            this.c = mediaMetadata.albumTitle;
            this.d = mediaMetadata.albumArtist;
            this.e = mediaMetadata.displayTitle;
            this.f = mediaMetadata.subtitle;
            this.g = mediaMetadata.description;
            this.h = mediaMetadata.mediaUri;
            this.i = mediaMetadata.userRating;
            this.j = mediaMetadata.overallRating;
            this.k = mediaMetadata.artworkData;
            this.l = mediaMetadata.artworkDataType;
            this.m = mediaMetadata.artworkUri;
            this.n = mediaMetadata.trackNumber;
            this.o = mediaMetadata.totalTrackCount;
            this.p = mediaMetadata.folderType;
            this.q = mediaMetadata.isPlayable;
            this.r = mediaMetadata.recordingYear;
            this.s = mediaMetadata.recordingMonth;
            this.t = mediaMetadata.recordingDay;
            this.u = mediaMetadata.releaseYear;
            this.v = mediaMetadata.releaseMonth;
            this.w = mediaMetadata.releaseDay;
            this.x = mediaMetadata.writer;
            this.y = mediaMetadata.composer;
            this.z = mediaMetadata.conductor;
            this.A = mediaMetadata.discNumber;
            this.B = mediaMetadata.totalDiscCount;
            this.C = mediaMetadata.genre;
            this.D = mediaMetadata.compilation;
            this.E = mediaMetadata.extras;
        }

        public Builder populateFromMetadata(List<Metadata> metadataList) {
            for (int i = 0; i < metadataList.size(); i++) {
                Metadata metadata = metadataList.get(i);
                for (int i2 = 0; i2 < metadata.length(); i2++) {
                    metadata.get(i2).populateMediaMetadata(this);
                }
            }
            return this;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FolderType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PictureType {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaMetadata b(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        Builder builder = new Builder();
        builder.setTitle(bundle.getCharSequence(c(0))).setArtist(bundle.getCharSequence(c(1))).setAlbumTitle(bundle.getCharSequence(c(2))).setAlbumArtist(bundle.getCharSequence(c(3))).setDisplayTitle(bundle.getCharSequence(c(4))).setSubtitle(bundle.getCharSequence(c(5))).setDescription(bundle.getCharSequence(c(6))).setMediaUri((Uri) bundle.getParcelable(c(7))).setArtworkData(bundle.getByteArray(c(10)), bundle.containsKey(c(29)) ? Integer.valueOf(bundle.getInt(c(29))) : null).setArtworkUri((Uri) bundle.getParcelable(c(11))).setWriter(bundle.getCharSequence(c(22))).setComposer(bundle.getCharSequence(c(23))).setConductor(bundle.getCharSequence(c(24))).setGenre(bundle.getCharSequence(c(27))).setCompilation(bundle.getCharSequence(c(28))).setExtras(bundle.getBundle(c(1000)));
        if (bundle.containsKey(c(8)) && (bundle3 = bundle.getBundle(c(8))) != null) {
            builder.setUserRating((Rating) Rating.CREATOR.fromBundle(bundle3));
        }
        if (bundle.containsKey(c(9)) && (bundle2 = bundle.getBundle(c(9))) != null) {
            builder.setOverallRating((Rating) Rating.CREATOR.fromBundle(bundle2));
        }
        if (bundle.containsKey(c(12))) {
            builder.setTrackNumber(Integer.valueOf(bundle.getInt(c(12))));
        }
        if (bundle.containsKey(c(13))) {
            builder.setTotalTrackCount(Integer.valueOf(bundle.getInt(c(13))));
        }
        if (bundle.containsKey(c(14))) {
            builder.setFolderType(Integer.valueOf(bundle.getInt(c(14))));
        }
        if (bundle.containsKey(c(15))) {
            builder.setIsPlayable(Boolean.valueOf(bundle.getBoolean(c(15))));
        }
        if (bundle.containsKey(c(16))) {
            builder.setRecordingYear(Integer.valueOf(bundle.getInt(c(16))));
        }
        if (bundle.containsKey(c(17))) {
            builder.setRecordingMonth(Integer.valueOf(bundle.getInt(c(17))));
        }
        if (bundle.containsKey(c(18))) {
            builder.setRecordingDay(Integer.valueOf(bundle.getInt(c(18))));
        }
        if (bundle.containsKey(c(19))) {
            builder.setReleaseYear(Integer.valueOf(bundle.getInt(c(19))));
        }
        if (bundle.containsKey(c(20))) {
            builder.setReleaseMonth(Integer.valueOf(bundle.getInt(c(20))));
        }
        if (bundle.containsKey(c(21))) {
            builder.setReleaseDay(Integer.valueOf(bundle.getInt(c(21))));
        }
        if (bundle.containsKey(c(25))) {
            builder.setDiscNumber(Integer.valueOf(bundle.getInt(c(25))));
        }
        if (bundle.containsKey(c(26))) {
            builder.setTotalDiscCount(Integer.valueOf(bundle.getInt(c(26))));
        }
        return builder.build();
    }

    private static String c(int field) {
        return Integer.toString(field, 36);
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaMetadata.class != obj.getClass()) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return Util.areEqual(this.title, mediaMetadata.title) && Util.areEqual(this.artist, mediaMetadata.artist) && Util.areEqual(this.albumTitle, mediaMetadata.albumTitle) && Util.areEqual(this.albumArtist, mediaMetadata.albumArtist) && Util.areEqual(this.displayTitle, mediaMetadata.displayTitle) && Util.areEqual(this.subtitle, mediaMetadata.subtitle) && Util.areEqual(this.description, mediaMetadata.description) && Util.areEqual(this.mediaUri, mediaMetadata.mediaUri) && Util.areEqual(this.userRating, mediaMetadata.userRating) && Util.areEqual(this.overallRating, mediaMetadata.overallRating) && Arrays.equals(this.artworkData, mediaMetadata.artworkData) && Util.areEqual(this.artworkDataType, mediaMetadata.artworkDataType) && Util.areEqual(this.artworkUri, mediaMetadata.artworkUri) && Util.areEqual(this.trackNumber, mediaMetadata.trackNumber) && Util.areEqual(this.totalTrackCount, mediaMetadata.totalTrackCount) && Util.areEqual(this.folderType, mediaMetadata.folderType) && Util.areEqual(this.isPlayable, mediaMetadata.isPlayable) && Util.areEqual(this.recordingYear, mediaMetadata.recordingYear) && Util.areEqual(this.recordingMonth, mediaMetadata.recordingMonth) && Util.areEqual(this.recordingDay, mediaMetadata.recordingDay) && Util.areEqual(this.releaseYear, mediaMetadata.releaseYear) && Util.areEqual(this.releaseMonth, mediaMetadata.releaseMonth) && Util.areEqual(this.releaseDay, mediaMetadata.releaseDay) && Util.areEqual(this.writer, mediaMetadata.writer) && Util.areEqual(this.composer, mediaMetadata.composer) && Util.areEqual(this.conductor, mediaMetadata.conductor) && Util.areEqual(this.discNumber, mediaMetadata.discNumber) && Util.areEqual(this.totalDiscCount, mediaMetadata.totalDiscCount) && Util.areEqual(this.genre, mediaMetadata.genre) && Util.areEqual(this.compilation, mediaMetadata.compilation);
    }

    public int hashCode() {
        return Objects.hashCode(this.title, this.artist, this.albumTitle, this.albumArtist, this.displayTitle, this.subtitle, this.description, this.mediaUri, this.userRating, this.overallRating, Integer.valueOf(Arrays.hashCode(this.artworkData)), this.artworkDataType, this.artworkUri, this.trackNumber, this.totalTrackCount, this.folderType, this.isPlayable, this.recordingYear, this.recordingMonth, this.recordingDay, this.releaseYear, this.releaseMonth, this.releaseDay, this.writer, this.composer, this.conductor, this.discNumber, this.totalDiscCount, this.genre, this.compilation);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(c(0), this.title);
        bundle.putCharSequence(c(1), this.artist);
        bundle.putCharSequence(c(2), this.albumTitle);
        bundle.putCharSequence(c(3), this.albumArtist);
        bundle.putCharSequence(c(4), this.displayTitle);
        bundle.putCharSequence(c(5), this.subtitle);
        bundle.putCharSequence(c(6), this.description);
        bundle.putParcelable(c(7), this.mediaUri);
        bundle.putByteArray(c(10), this.artworkData);
        bundle.putParcelable(c(11), this.artworkUri);
        bundle.putCharSequence(c(22), this.writer);
        bundle.putCharSequence(c(23), this.composer);
        bundle.putCharSequence(c(24), this.conductor);
        bundle.putCharSequence(c(27), this.genre);
        bundle.putCharSequence(c(28), this.compilation);
        if (this.userRating != null) {
            bundle.putBundle(c(8), this.userRating.toBundle());
        }
        if (this.overallRating != null) {
            bundle.putBundle(c(9), this.overallRating.toBundle());
        }
        if (this.trackNumber != null) {
            bundle.putInt(c(12), this.trackNumber.intValue());
        }
        if (this.totalTrackCount != null) {
            bundle.putInt(c(13), this.totalTrackCount.intValue());
        }
        if (this.folderType != null) {
            bundle.putInt(c(14), this.folderType.intValue());
        }
        if (this.isPlayable != null) {
            bundle.putBoolean(c(15), this.isPlayable.booleanValue());
        }
        if (this.recordingYear != null) {
            bundle.putInt(c(16), this.recordingYear.intValue());
        }
        if (this.recordingMonth != null) {
            bundle.putInt(c(17), this.recordingMonth.intValue());
        }
        if (this.recordingDay != null) {
            bundle.putInt(c(18), this.recordingDay.intValue());
        }
        if (this.releaseYear != null) {
            bundle.putInt(c(19), this.releaseYear.intValue());
        }
        if (this.releaseMonth != null) {
            bundle.putInt(c(20), this.releaseMonth.intValue());
        }
        if (this.releaseDay != null) {
            bundle.putInt(c(21), this.releaseDay.intValue());
        }
        if (this.discNumber != null) {
            bundle.putInt(c(25), this.discNumber.intValue());
        }
        if (this.totalDiscCount != null) {
            bundle.putInt(c(26), this.totalDiscCount.intValue());
        }
        if (this.artworkDataType != null) {
            bundle.putInt(c(29), this.artworkDataType.intValue());
        }
        if (this.extras != null) {
            bundle.putBundle(c(1000), this.extras);
        }
        return bundle;
    }

    private MediaMetadata(Builder builder) {
        this.title = builder.a;
        this.artist = builder.b;
        this.albumTitle = builder.c;
        this.albumArtist = builder.d;
        this.displayTitle = builder.e;
        this.subtitle = builder.f;
        this.description = builder.g;
        this.mediaUri = builder.h;
        this.userRating = builder.i;
        this.overallRating = builder.j;
        this.artworkData = builder.k;
        this.artworkDataType = builder.l;
        this.artworkUri = builder.m;
        this.trackNumber = builder.n;
        this.totalTrackCount = builder.o;
        this.folderType = builder.p;
        this.isPlayable = builder.q;
        this.year = builder.r;
        this.recordingYear = builder.r;
        this.recordingMonth = builder.s;
        this.recordingDay = builder.t;
        this.releaseYear = builder.u;
        this.releaseMonth = builder.v;
        this.releaseDay = builder.w;
        this.writer = builder.x;
        this.composer = builder.y;
        this.conductor = builder.z;
        this.discNumber = builder.A;
        this.totalDiscCount = builder.B;
        this.genre = builder.C;
        this.compilation = builder.D;
        this.extras = builder.E;
    }
}
