package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes18.dex */
public abstract class RequestHandler {

    public static final class Result {
        private final Picasso.LoadedFrom a;
        private final Bitmap b;
        private final InputStream c;
        private final int d;

        public Result(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) u.e(bitmap, "bitmap == null"), null, loadedFrom, 0);
        }

        public int a() {
            return this.d;
        }

        public Bitmap getBitmap() {
            return this.b;
        }

        public Picasso.LoadedFrom getLoadedFrom() {
            return this.a;
        }

        public InputStream getStream() {
            return this.c;
        }

        public Result(InputStream inputStream, Picasso.LoadedFrom loadedFrom) {
            this(null, (InputStream) u.e(inputStream, "stream == null"), loadedFrom, 0);
        }

        public Result(Bitmap bitmap, InputStream inputStream, Picasso.LoadedFrom loadedFrom, int i) {
            if ((inputStream != null) ^ (bitmap != null)) {
                this.b = bitmap;
                this.c = inputStream;
                this.a = (Picasso.LoadedFrom) u.e(loadedFrom, "loadedFrom == null");
                this.d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    public static void a(int i, int i2, int i3, int i4, BitmapFactory.Options options, Request request) {
        int iMax;
        double dFloor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                dFloor = Math.floor(i3 / i);
            } else if (i == 0) {
                dFloor = Math.floor(i4 / i2);
            } else {
                int iFloor = (int) Math.floor(i4 / i2);
                int iFloor2 = (int) Math.floor(i3 / i);
                iMax = request.centerInside ? Math.max(iFloor, iFloor2) : Math.min(iFloor, iFloor2);
            }
            iMax = (int) dFloor;
        } else {
            iMax = 1;
        }
        options.inSampleSize = iMax;
        options.inJustDecodeBounds = false;
    }

    public static void b(int i, int i2, BitmapFactory.Options options, Request request) {
        a(i, i2, options.outWidth, options.outHeight, options, request);
    }

    public static BitmapFactory.Options c(Request request) {
        boolean zHasSize = request.hasSize();
        boolean z = request.config != null;
        BitmapFactory.Options options = null;
        if (zHasSize || z) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = zHasSize;
            if (z) {
                options.inPreferredConfig = request.config;
            }
        }
        return options;
    }

    public static boolean e(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean canHandleRequest(Request request);

    public int d() {
        return 0;
    }

    public boolean f(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    public boolean g() {
        return false;
    }

    public abstract Result load(Request request, int i) throws IOException;
}
