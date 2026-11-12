package com.garmin.android.music;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.support.v4.media.MediaMetadataCompat;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import p005kotlin.Metadata;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002\u001a\u000e\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\tH\u0000\u001a\u001a\u0010\n\u001a\u00020\u000b*\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u0004\u0018\u00010\bH\u0000\u001a\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u0004\u0018\u00010\u000bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"PNG_ENCODE_QUALITY", "", "loadAlbumArtFromUri", "Landroid/graphics/Bitmap;", "Landroid/media/MediaMetadata;", "contentResolver", "Landroid/content/ContentResolver;", "toEntityPlayerStateData", "Lcom/garmin/android/music/EntityPlayerStateData;", "Landroid/media/session/PlaybackState;", "toEntityTrackData", "Lcom/garmin/android/music/EntityTrackData;", "toEntityUpdates", "", "Lcom/garmin/android/music/EntityUpdate;", "gncs-all-modules_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EntityDataKt {
    private static final int PNG_ENCODE_QUALITY = 100;

    private static final Bitmap loadAlbumArtFromUri(MediaMetadata mediaMetadata, ContentResolver contentResolver) {
        String string = mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI);
        if (string == null || contentResolver == null) {
            return null;
        }
        try {
            Uri uri = Uri.parse(string);
            uri.getClass();
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                inputStreamOpenInputStream.close();
                return bitmapDecodeStream;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(inputStreamOpenInputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            int i14 = gt2.c.f79010a;
            gt2.b.f79005a.i("MC#EntityData").warn("loadAlbumArtFromUri -> failed to load album art from URI", th5);
            return null;
        }
    }

    public static final EntityPlayerStateData toEntityPlayerStateData(PlaybackState playbackState) {
        int i14 = 0;
        switch (playbackState != null ? playbackState.getState() : 0) {
            case 3:
                i14 = 1;
                break;
            case 4:
                i14 = 3;
                break;
            case 5:
                i14 = 2;
                break;
        }
        return new EntityPlayerStateData(i14, (i14 == 0 || playbackState == null) ? 0.0f : playbackState.getPlaybackSpeed(), playbackState != null ? playbackState.getPosition() / 1000.0f : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    public static final EntityTrackData toEntityTrackData(MediaMetadata mediaMetadata, ContentResolver contentResolver) {
        String str;
        String string;
        Bitmap bitmapLoadAlbumArtFromUri;
        Bitmap bitmap;
        String string2 = mediaMetadata != null ? mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_ARTIST) : null;
        String string3 = mediaMetadata != null ? mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_ALBUM) : null;
        if (mediaMetadata != null && (string = mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE)) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                str = string;
            } else if (mediaMetadata != null) {
                string = mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_TITLE);
                str = string;
            } else {
                str = null;
            }
        } else if (mediaMetadata != null) {
            string = mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_TITLE);
            str = string;
        } else {
            str = null;
        }
        long j8 = mediaMetadata != null ? mediaMetadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION) / 1000 : 0L;
        if (mediaMetadata == null || (bitmap = mediaMetadata.getBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART)) == null) {
            bitmapLoadAlbumArtFromUri = mediaMetadata != null ? loadAlbumArtFromUri(mediaMetadata, contentResolver) : null;
        } else {
            bitmapLoadAlbumArtFromUri = bitmap;
        }
        return new EntityTrackData(string2, string3, str, j8, bitmapLoadAlbumArtFromUri);
    }

    public static /* synthetic */ EntityTrackData toEntityTrackData$default(MediaMetadata mediaMetadata, ContentResolver contentResolver, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            contentResolver = null;
        }
        return toEntityTrackData(mediaMetadata, contentResolver);
    }

    public static final List<EntityUpdate> toEntityUpdates(EntityTrackData entityTrackData) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if ((entityTrackData != null ? entityTrackData.getAlbumArt() : null) != null) {
            entityTrackData.getAlbumArt().compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        }
        return x.k(new EntityUpdate(2, 0, 0, entityTrackData != null ? entityTrackData.getArtist() : null), new EntityUpdate(2, 1, 0, entityTrackData != null ? entityTrackData.getAlbum() : null), new EntityUpdate(2, 2, 0, entityTrackData != null ? entityTrackData.getTitle() : null), new EntityUpdate(2, 3, 0, String.valueOf(entityTrackData != null ? entityTrackData.getDurationInSeconds() : 0L)), new EntityUpdate(2, 4, 0, byteArrayOutputStream.toByteArray()));
    }

    public static final List<EntityUpdate> toEntityUpdates(EntityPlayerStateData entityPlayerStateData) {
        return w.c(new EntityUpdate(0, 1, 0, (entityPlayerStateData != null ? entityPlayerStateData.getPlaybackState() : 0) + "," + (entityPlayerStateData != null ? entityPlayerStateData.getPlaybackSpeed() : 0.0f) + "," + (entityPlayerStateData != null ? entityPlayerStateData.getPlaybackPositionInSeconds() : 0.0f)));
    }
}
