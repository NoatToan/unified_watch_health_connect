package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import defpackage.b6i;
import defpackage.h0i;
import defpackage.ip2;
import defpackage.jp2;
import defpackage.jq2;
import defpackage.n5d;
import defpackage.o98;
import defpackage.w07;
import defpackage.w14;
import defpackage.wdp;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
@w07
public abstract class DalvikPurgeableDecoder implements h0i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f7120b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ip2 f7121a = jp2.a();

    static {
        n5d.a();
        f7120b = new byte[]{-1, -39};
    }

    public static BitmapFactory.Options e(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        return options;
    }

    @w07
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // defpackage.h0i
    public w14<Bitmap> a(o98 o98Var, Bitmap.Config config, Rect rect, boolean z) {
        BitmapFactory.Options optionsE = e(o98Var.E(), config);
        w14<PooledByteBuffer> w14VarL = o98Var.l();
        b6i.g(w14VarL);
        try {
            return f(c(w14VarL, optionsE));
        } finally {
            w14.l(w14VarL);
        }
    }

    @Override // defpackage.h0i
    public w14<Bitmap> b(o98 o98Var, Bitmap.Config config, Rect rect, int i, boolean z) {
        BitmapFactory.Options optionsE = e(o98Var.E(), config);
        w14<PooledByteBuffer> w14VarL = o98Var.l();
        b6i.g(w14VarL);
        try {
            return f(d(w14VarL, i, optionsE));
        } finally {
            w14.l(w14VarL);
        }
    }

    public abstract Bitmap c(w14<PooledByteBuffer> w14Var, BitmapFactory.Options options);

    public abstract Bitmap d(w14<PooledByteBuffer> w14Var, int i, BitmapFactory.Options options);

    public w14<Bitmap> f(Bitmap bitmap) {
        b6i.g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f7121a.g(bitmap)) {
                return w14.K(bitmap, this.f7121a.e());
            }
            int iE = jq2.e(bitmap);
            bitmap.recycle();
            throw new TooManyBitmapsException(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(iE), Integer.valueOf(this.f7121a.b()), Long.valueOf(this.f7121a.f()), Integer.valueOf(this.f7121a.c()), Integer.valueOf(this.f7121a.d())));
        } catch (Exception e) {
            bitmap.recycle();
            throw wdp.a(e);
        }
    }
}
