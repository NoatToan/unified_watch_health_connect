package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class tcm implements x5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34572b;

    public tcm(boolean z, int i) {
        this.f34571a = z;
        this.f34572b = i;
    }

    public static Bitmap.CompressFormat e(l4d l4dVar) {
        if (l4dVar != null && l4dVar != pv5.f30818a) {
            if (l4dVar == pv5.f30819b) {
                return Bitmap.CompressFormat.PNG;
            }
            return pv5.a(l4dVar) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @Override // defpackage.x5d
    public String a() {
        return "SimpleImageTranscoder";
    }

    @Override // defpackage.x5d
    public boolean b(o98 o98Var, jxk jxkVar, ypk ypkVar) {
        if (jxkVar == null) {
            jxkVar = jxk.a();
        }
        return this.f34571a && c47.b(jxkVar, ypkVar, o98Var, this.f34572b) > 1;
    }

    @Override // defpackage.x5d
    public boolean c(l4d l4dVar) {
        return l4dVar == pv5.f30820k || l4dVar == pv5.f30818a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [jxk] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // defpackage.x5d
    public w5d d(o98 o98Var, OutputStream outputStream, jxk jxkVar, ypk ypkVar, l4d l4dVar, Integer num) throws Throwable {
        Bitmap bitmapCreateBitmap;
        Integer num2 = num == null ? 85 : num;
        Bitmap bitmapA = jxkVar == null ? jxk.a() : jxkVar;
        int iF = f(o98Var, bitmapA, ypkVar);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iF;
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(o98Var.y(), null, options);
            if (bitmapDecodeStream == null) {
                cm8.i("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new w5d(2);
            }
            Matrix matrixG = srd.g(o98Var, bitmapA);
            try {
                if (matrixG != null) {
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrixG, false);
                    } catch (OutOfMemoryError e) {
                        e = e;
                        bitmapCreateBitmap = bitmapDecodeStream;
                        cm8.j("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                        w5d w5dVar = new w5d(2);
                        bitmapCreateBitmap.recycle();
                        bitmapDecodeStream.recycle();
                        return w5dVar;
                    } catch (Throwable th) {
                        th = th;
                        bitmapA = bitmapDecodeStream;
                        bitmapA.recycle();
                        bitmapDecodeStream.recycle();
                        throw th;
                    }
                } else {
                    bitmapCreateBitmap = bitmapDecodeStream;
                }
                try {
                    bitmapCreateBitmap.compress(e(l4dVar), num2.intValue(), outputStream);
                    w5d w5dVar2 = new w5d(iF > 1 ? 0 : 1);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return w5dVar2;
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    cm8.j("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    w5d w5dVar3 = new w5d(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return w5dVar3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (OutOfMemoryError e3) {
            cm8.j("SimpleImageTranscoder", "Out-Of-Memory during transcode", e3);
            return new w5d(2);
        }
    }

    public final int f(o98 o98Var, jxk jxkVar, ypk ypkVar) {
        if (this.f34571a) {
            return c47.b(jxkVar, ypkVar, o98Var, this.f34572b);
        }
        return 1;
    }
}
