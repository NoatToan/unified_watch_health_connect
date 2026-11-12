package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() { // from class: android.support.v4.media.MediaDescriptionCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.fromMediaDescription(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f1293b;
    public final CharSequence c;
    public final CharSequence d;
    public final Bitmap e;
    public final Uri f;
    public final Bundle g;
    public final Uri h;
    public MediaDescription i;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f1295b;
        public CharSequence c;
        public CharSequence d;
        public Bitmap e;
        public Uri f;
        public Bundle g;
        public Uri h;

        public MediaDescriptionCompat build() {
            return new MediaDescriptionCompat(this.f1294a, this.f1295b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public Builder setDescription(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.g = bundle;
            return this;
        }

        public Builder setIconBitmap(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.f = uri;
            return this;
        }

        public Builder setMediaId(String str) {
            this.f1294a = str;
            return this;
        }

        public Builder setMediaUri(Uri uri) {
            this.h = uri;
            return this;
        }

        public Builder setSubtitle(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.f1295b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1292a = str;
        this.f1293b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.f = uri;
        this.g = bundle;
        this.h = uri2;
    }

    public static MediaDescriptionCompat fromMediaDescription(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        Builder builder = new Builder();
        MediaDescription mediaDescription = (MediaDescription) obj;
        builder.setMediaId(mediaDescription.getMediaId());
        builder.setTitle(mediaDescription.getTitle());
        builder.setSubtitle(mediaDescription.getSubtitle());
        builder.setDescription(mediaDescription.getDescription());
        builder.setIconBitmap(mediaDescription.getIconBitmap());
        builder.setIconUri(mediaDescription.getIconUri());
        Bundle extras = mediaDescription.getExtras();
        if (extras != null) {
            extras = MediaSessionCompat.unparcelWithClassLoader(extras);
        }
        Uri uri = extras != null ? (Uri) extras.getParcelable(DESCRIPTION_KEY_MEDIA_URI) : null;
        if (uri == null) {
            bundle = extras;
        } else if (!extras.containsKey(DESCRIPTION_KEY_NULL_BUNDLE_FLAG) || extras.size() != 2) {
            extras.remove(DESCRIPTION_KEY_MEDIA_URI);
            extras.remove(DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
            bundle = extras;
        }
        builder.setExtras(bundle);
        if (uri != null) {
            builder.setMediaUri(uri);
        } else {
            builder.setMediaUri(mediaDescription.getMediaUri());
        }
        MediaDescriptionCompat mediaDescriptionCompatBuild = builder.build();
        mediaDescriptionCompatBuild.i = mediaDescription;
        return mediaDescriptionCompatBuild;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CharSequence getDescription() {
        return this.d;
    }

    public Bundle getExtras() {
        return this.g;
    }

    public Bitmap getIconBitmap() {
        return this.e;
    }

    public Uri getIconUri() {
        return this.f;
    }

    public Object getMediaDescription() {
        MediaDescription mediaDescription = this.i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f1292a);
        builder.setTitle(this.f1293b);
        builder.setSubtitle(this.c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.f);
        builder.setExtras(this.g);
        builder.setMediaUri(this.h);
        MediaDescription mediaDescriptionBuild = builder.build();
        this.i = mediaDescriptionBuild;
        return mediaDescriptionBuild;
    }

    public String getMediaId() {
        return this.f1292a;
    }

    public Uri getMediaUri() {
        return this.h;
    }

    public CharSequence getSubtitle() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.f1293b;
    }

    public String toString() {
        return ((Object) this.f1293b) + ", " + ((Object) this.c) + ", " + ((Object) this.d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) getMediaDescription()).writeToParcel(parcel, i);
    }
}
