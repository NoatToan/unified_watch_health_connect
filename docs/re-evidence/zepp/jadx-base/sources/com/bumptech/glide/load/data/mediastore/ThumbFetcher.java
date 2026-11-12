package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.ExifOrientationStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ThumbFetcher implements DataFetcher<InputStream> {
    private static final String d = "MediaStoreThumbFetcher";
    private final Uri a;
    private final c b;
    private InputStream c;

    public static class a implements com.bumptech.glide.load.data.mediastore.b {
        private static final String[] b = {"_data"};
        private static final String c = "kind = 1 AND image_id = ?";
        private final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.b
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, c, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public static class b implements com.bumptech.glide.load.data.mediastore.b {
        private static final String[] b = {"_data"};
        private static final String c = "kind = 1 AND video_id = ?";
        private final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.b
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, c, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @VisibleForTesting
    public ThumbFetcher(Uri uri, c cVar) {
        this.a = uri;
        this.b = cVar;
    }

    private static ThumbFetcher a(Context context, Uri uri, com.bumptech.glide.load.data.mediastore.b bVar) {
        return new ThumbFetcher(uri, new c(Glide.get(context).getRegistry().getImageHeaderParsers(), bVar, Glide.get(context).getArrayPool(), context.getContentResolver()));
    }

    private InputStream b() throws FileNotFoundException {
        InputStream inputStreamD = this.b.d(this.a);
        int iA = inputStreamD != null ? this.b.a(this.a) : -1;
        return iA != -1 ? new ExifOrientationStream(inputStreamD, iA) : inputStreamD;
    }

    public static ThumbFetcher buildImageFetcher(Context context, Uri uri) {
        return a(context, uri, new a(context.getContentResolver()));
    }

    public static ThumbFetcher buildVideoFetcher(Context context, Uri uri) {
        return a(context, uri, new b(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super InputStream> dataCallback) {
        try {
            InputStream inputStreamB = b();
            this.c = inputStreamB;
            dataCallback.onDataReady(inputStreamB);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable(d, 3)) {
                Log.d(d, "Failed to find thumbnail file", e);
            }
            dataCallback.onLoadFailed(e);
        }
    }
}
