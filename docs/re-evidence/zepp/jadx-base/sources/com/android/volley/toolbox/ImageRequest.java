package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;

/* JADX INFO: loaded from: classes2.dex */
public class ImageRequest extends Request<Bitmap> {
    private static final int f = 1000;
    private static final int g = 2;
    private static final float h = 2.0f;
    private static final Object i = new Object();
    private final Response.Listener<Bitmap> a;
    private final Bitmap.Config b;
    private final int c;
    private final int d;
    private ImageView.ScaleType e;

    public ImageRequest(String str, Response.Listener<Bitmap> listener, int i2, int i3, ImageView.ScaleType scaleType, Bitmap.Config config, Response.ErrorListener errorListener) {
        super(0, str, errorListener);
        setRetryPolicy(new DefaultRetryPolicy(1000, 2, 2.0f));
        this.a = listener;
        this.b = config;
        this.c = i2;
        this.d = i3;
        this.e = scaleType;
    }

    private Response<Bitmap> a(NetworkResponse networkResponse) {
        Bitmap bitmapDecodeByteArray;
        byte[] bArr = networkResponse.data;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.c == 0 && this.d == 0) {
            options.inPreferredConfig = this.b;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            int iC = c(this.c, this.d, i2, i3, this.e);
            int iC2 = c(this.d, this.c, i3, i2, this.e);
            options.inJustDecodeBounds = false;
            options.inSampleSize = b(i2, i3, iC, iC2);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iC || bitmapDecodeByteArray.getHeight() > iC2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iC, iC2, true);
                bitmapDecodeByteArray.recycle();
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        return bitmapDecodeByteArray == null ? Response.error(new ParseError(networkResponse)) : Response.success(bitmapDecodeByteArray, HttpHeaderParser.parseCacheHeaders(networkResponse));
    }

    public static int b(int i2, int i3, int i4, int i5) {
        double dMin = Math.min(((double) i2) / ((double) i4), ((double) i3) / ((double) i5));
        float f2 = 1.0f;
        while (true) {
            float f3 = 2.0f * f2;
            if (f3 > dMin) {
                return (int) f2;
            }
            f2 = f3;
        }
    }

    private static int c(int i2, int i3, int i4, int i5, ImageView.ScaleType scaleType) {
        if (i2 == 0 && i3 == 0) {
            return i4;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i2 == 0 ? i4 : i2;
        }
        if (i2 == 0) {
            return (int) (((double) i4) * (((double) i3) / ((double) i5)));
        }
        if (i3 == 0) {
            return i2;
        }
        double d = ((double) i5) / ((double) i4);
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d2 = i3;
            return ((double) i2) * d < d2 ? (int) (d2 / d) : i2;
        }
        double d3 = i3;
        return ((double) i2) * d > d3 ? (int) (d3 / d) : i2;
    }

    @Override // com.android.volley.Request
    public Request.Priority getPriority() {
        return Request.Priority.LOW;
    }

    @Override // com.android.volley.Request
    public Response<Bitmap> parseNetworkResponse(NetworkResponse networkResponse) {
        Response<Bitmap> responseA;
        synchronized (i) {
            try {
                try {
                    responseA = a(networkResponse);
                } catch (OutOfMemoryError e) {
                    VolleyLog.e("Caught OOM for %d byte image, url=%s", Integer.valueOf(networkResponse.data.length), getUrl());
                    return Response.error(new ParseError(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return responseA;
    }

    @Override // com.android.volley.Request
    public void deliverResponse(Bitmap bitmap) {
        this.a.onResponse(bitmap);
    }

    @Deprecated
    public ImageRequest(String str, Response.Listener<Bitmap> listener, int i2, int i3, Bitmap.Config config, Response.ErrorListener errorListener) {
        this(str, listener, i2, i3, ImageView.ScaleType.CENTER_INSIDE, config, errorListener);
    }
}
