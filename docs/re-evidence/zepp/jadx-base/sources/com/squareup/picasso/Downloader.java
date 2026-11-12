package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes18.dex */
public interface Downloader {

    public static class ResponseException extends IOException {
        public final boolean a;
        public final int b;

        public ResponseException(String str, int i, int i2) {
            super(str);
            this.a = NetworkPolicy.isOfflineOnly(i);
            this.b = i2;
        }
    }

    Response load(Uri uri, int i) throws IOException;

    void shutdown();

    public static class Response {
        public final InputStream a;
        public final Bitmap b;
        public final boolean c;
        public final long d;

        @Deprecated
        public Response(Bitmap bitmap, boolean z) {
            if (bitmap == null) {
                throw new IllegalArgumentException("Bitmap may not be null.");
            }
            this.a = null;
            this.b = bitmap;
            this.c = z;
            this.d = -1L;
        }

        @Deprecated
        public Bitmap getBitmap() {
            return this.b;
        }

        public long getContentLength() {
            return this.d;
        }

        public InputStream getInputStream() {
            return this.a;
        }

        @Deprecated
        public Response(InputStream inputStream, boolean z) {
            this(inputStream, z, -1L);
        }

        @Deprecated
        public Response(Bitmap bitmap, boolean z, long j) {
            this(bitmap, z);
        }

        public Response(InputStream inputStream, boolean z, long j) {
            if (inputStream != null) {
                this.a = inputStream;
                this.b = null;
                this.c = z;
                this.d = j;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }
    }
}
