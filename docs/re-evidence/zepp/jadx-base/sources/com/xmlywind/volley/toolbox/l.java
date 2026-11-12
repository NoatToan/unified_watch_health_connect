package com.xmlywind.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.xmlywind.volley.p;
import com.xmlywind.volley.t;

/* JADX INFO: loaded from: classes22.dex */
public class l extends com.xmlywind.volley.l<Bitmap> {
    private static final Object b = new Object();
    private final Object c;
    private final Bitmap.Config d;
    private final int e;
    private final int f;
    private final ImageView.ScaleType g;
    private com.xmlywind.volley.n.b<Bitmap> h;

    public l(String str, com.xmlywind.volley.n.b<Bitmap> bVar, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, com.xmlywind.volley.n.a aVar) {
        super(0, str, aVar);
        this.c = new Object();
        a((p) new com.xmlywind.volley.c(1000, 2, 2.0f));
        this.h = bVar;
        this.d = config;
        this.e = i;
        this.f = i2;
        this.g = scaleType;
    }

    public static int a(int i, int i2, int i3, int i4) {
        double dMin = Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 > dMin) {
                return (int) f;
            }
            f = f2;
        }
    }

    private static int a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        double d;
        if (i != 0 || i2 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i == 0) {
                    return (int) ((((double) i2) / ((double) i4)) * ((double) i3));
                }
                if (i2 == 0) {
                    return i;
                }
                double d2 = ((double) i4) / ((double) i3);
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    d = i2;
                    if (((double) i) * d2 >= d) {
                        return i;
                    }
                } else {
                    d = i2;
                    if (((double) i) * d2 <= d) {
                        return i;
                    }
                }
                return (int) (d / d2);
            }
            if (i != 0) {
                return i;
            }
        }
        return i3;
    }

    private com.xmlywind.volley.n<Bitmap> b(com.xmlywind.volley.i iVar) {
        Bitmap bitmapDecodeByteArray;
        byte[] bArr = iVar.b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.e == 0 && this.f == 0) {
            options.inPreferredConfig = this.d;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int iA = a(this.e, this.f, i, i2, this.g);
            int iA2 = a(this.f, this.e, i2, i, this.g);
            options.inJustDecodeBounds = false;
            options.inSampleSize = a(i, i2, iA, iA2);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iA || bitmapDecodeByteArray.getHeight() > iA2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iA, iA2, true);
                bitmapDecodeByteArray.recycle();
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        return bitmapDecodeByteArray == null ? com.xmlywind.volley.n.a(new com.xmlywind.volley.k(iVar)) : com.xmlywind.volley.n.a(bitmapDecodeByteArray, h.a(iVar));
    }

    @Override // com.xmlywind.volley.l
    public com.xmlywind.volley.n<Bitmap> a(com.xmlywind.volley.i iVar) {
        com.xmlywind.volley.n<Bitmap> nVarA;
        synchronized (b) {
            try {
                try {
                    nVarA = b(iVar);
                } catch (OutOfMemoryError e) {
                    t.c("Caught OOM for %d byte image, url=%s", Integer.valueOf(iVar.b.length), h());
                    nVarA = com.xmlywind.volley.n.a(new com.xmlywind.volley.k(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVarA;
    }

    @Override // com.xmlywind.volley.l
    public void a(Bitmap bitmap) {
        com.xmlywind.volley.n.b<Bitmap> bVar;
        synchronized (this.c) {
            bVar = this.h;
        }
        if (bVar != null) {
            bVar.a(bitmap);
        }
    }

    @Override // com.xmlywind.volley.l
    public void j() {
        super.j();
        synchronized (this.c) {
            this.h = null;
        }
    }

    @Override // com.xmlywind.volley.l
    public com.xmlywind.volley.l.b o() {
        return com.xmlywind.volley.l.b.LOW;
    }
}
