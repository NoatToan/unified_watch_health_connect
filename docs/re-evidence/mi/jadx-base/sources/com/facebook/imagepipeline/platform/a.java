package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import androidx.core.util.Pools;
import defpackage.b6i;
import defpackage.bq2;
import defpackage.cm8;
import defpackage.gcm;
import defpackage.h0i;
import defpackage.o98;
import defpackage.tfe;
import defpackage.w14;
import defpackage.xzo;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(21)
public abstract class a implements h0i {
    public static final Class<?> d = a.class;
    public static final byte[] e = {-1, -39};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bq2 f7126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PreverificationHelper f7127b = new PreverificationHelper();
    public final Pools.SynchronizedPool<ByteBuffer> c;

    public a(bq2 bq2Var, int i, Pools.SynchronizedPool synchronizedPool) {
        this.f7126a = bq2Var;
        this.c = synchronizedPool;
        for (int i2 = 0; i2 < i; i2++) {
            this.c.release(ByteBuffer.allocate(16384));
        }
    }

    public static BitmapFactory.Options e(o98 o98Var, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = o98Var.E();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(o98Var.y(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    @Override // defpackage.h0i
    public w14<Bitmap> a(o98 o98Var, Bitmap.Config config, Rect rect, boolean z) {
        BitmapFactory.Options optionsE = e(o98Var, config);
        boolean z2 = optionsE.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return c(o98Var.y(), optionsE, rect, z);
        } catch (RuntimeException e2) {
            if (z2) {
                return a(o98Var, Bitmap.Config.ARGB_8888, rect, z);
            }
            throw e2;
        }
    }

    @Override // defpackage.h0i
    public w14<Bitmap> b(o98 o98Var, Bitmap.Config config, Rect rect, int i, boolean z) {
        boolean zK = o98Var.K(i);
        BitmapFactory.Options optionsE = e(o98Var, config);
        InputStream inputStreamY = o98Var.y();
        b6i.g(inputStreamY);
        if (o98Var.J() > i) {
            inputStreamY = new tfe(inputStreamY, i);
        }
        if (!zK) {
            inputStreamY = new xzo(inputStreamY, e);
        }
        boolean z2 = optionsE.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return c(inputStreamY, optionsE, rect, z);
        } catch (RuntimeException e2) {
            if (z2) {
                return b(o98Var, Bitmap.Config.ARGB_8888, rect, i, z);
            }
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00a2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final w14<Bitmap> c(InputStream inputStream, BitmapFactory.Options options, Rect rect, boolean z) {
        Bitmap bitmap;
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        Bitmap bitmapDecodeRegion;
        b6i.g(inputStream);
        int i = options.outWidth;
        int iHeight = options.outHeight;
        ?? r0 = i;
        if (rect != null) {
            int iWidth = rect.width() / options.inSampleSize;
            iHeight = rect.height() / options.inSampleSize;
            r0 = iWidth;
        }
        PreverificationHelper preverificationHelper = this.f7127b;
        boolean z2 = preverificationHelper != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig);
        BitmapRegionDecoder bitmapRegionDecoder = 0;
        if (rect == null && z2) {
            options.inMutable = false;
            bitmap = 0;
        } else {
            if (rect != null && z2) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
            Bitmap bitmap2 = this.f7126a.get(d(r0, iHeight, options));
            bitmap = bitmap2;
            if (bitmap2 == null) {
                throw new NullPointerException("BitmapPool.get returned null");
            }
        }
        options.inBitmap = bitmap;
        if (z) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        ByteBuffer byteBufferAcquire = this.c.acquire();
        if (byteBufferAcquire == null) {
            byteBufferAcquire = ByteBuffer.allocate(16384);
        }
        try {
            try {
                options.inTempStorage = byteBufferAcquire.array();
                if (rect != null) {
                    try {
                        if (bitmap != 0) {
                            try {
                                bitmap.reconfigure(r0, iHeight, options.inPreferredConfig);
                                bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStream, true);
                                try {
                                    bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
                                    bitmapRegionDecoderNewInstance.recycle();
                                } catch (IOException unused) {
                                    cm8.g(d, "Could not decode region %s, decoding full bitmap instead.", rect);
                                    if (bitmapRegionDecoderNewInstance != null) {
                                        bitmapRegionDecoderNewInstance.recycle();
                                    }
                                    bitmapDecodeRegion = null;
                                }
                            } catch (IOException unused2) {
                                bitmapRegionDecoderNewInstance = null;
                            } catch (Throwable th) {
                                th = th;
                                if (bitmapRegionDecoder != 0) {
                                    bitmapRegionDecoder.recycle();
                                }
                                throw th;
                            }
                        } else {
                            bitmapDecodeRegion = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bitmapRegionDecoder = r0;
                    }
                } else {
                    bitmapDecodeRegion = null;
                }
                if (bitmapDecodeRegion == null) {
                    bitmapDecodeRegion = BitmapFactory.decodeStream(inputStream, null, options);
                }
                this.c.release(byteBufferAcquire);
                if (bitmap == 0 || bitmap == bitmapDecodeRegion) {
                    return w14.K(bitmapDecodeRegion, this.f7126a);
                }
                this.f7126a.release(bitmap);
                bitmapDecodeRegion.recycle();
                throw new IllegalStateException();
            } catch (Throwable th3) {
                this.c.release(byteBufferAcquire);
                throw th3;
            }
        } catch (IllegalArgumentException e2) {
            if (bitmap != 0) {
                this.f7126a.release(bitmap);
            }
            try {
                inputStream.reset();
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                if (bitmapDecodeStream == null) {
                    throw e2;
                }
                w14<Bitmap> w14VarK = w14.K(bitmapDecodeStream, gcm.a());
                this.c.release(byteBufferAcquire);
                return w14VarK;
            } catch (IOException unused3) {
                throw e2;
            }
        } catch (RuntimeException e3) {
            if (bitmap != 0) {
                this.f7126a.release(bitmap);
            }
            throw e3;
        }
    }

    public abstract int d(int i, int i2, BitmapFactory.Options options);
}
