package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class pp2 implements xqk<Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wbh<Integer> f30599b = wbh.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final wbh<Bitmap.CompressFormat> c = wbh.e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj1 f30600a;

    public pp2(nj1 nj1Var) {
        this.f30600a = nj1Var;
    }

    @Override // defpackage.xqk
    public EncodeStrategy a(cch cchVar) {
        return EncodeStrategy.TRANSFORMED;
    }

    @Override // defpackage.x98
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(kqk<Bitmap> kqkVar, File file, cch cchVar) {
        boolean z;
        Bitmap bitmap = kqkVar.get();
        Bitmap.CompressFormat compressFormatD = d(bitmap, cchVar);
        d0b.d("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatD);
        try {
            long jB = epe.b();
            int iIntValue = ((Integer) cchVar.c(f30599b)).intValue();
            OutputStream a63Var = null;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        a63Var = this.f30600a != null ? new a63(fileOutputStream, this.f30600a) : fileOutputStream;
                        bitmap.compress(compressFormatD, iIntValue, a63Var);
                        a63Var.close();
                        try {
                            a63Var.close();
                        } catch (IOException unused) {
                        }
                        z = true;
                    } catch (IOException unused2) {
                        a63Var = fileOutputStream;
                        Log.isLoggable("BitmapEncoder", 3);
                        if (a63Var != null) {
                            try {
                                a63Var.close();
                            } catch (IOException unused3) {
                            }
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        a63Var = fileOutputStream;
                        if (a63Var != null) {
                            try {
                                a63Var.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused5) {
                }
                if (Log.isLoggable("BitmapEncoder", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Compressed with type: ");
                    sb.append(compressFormatD);
                    sb.append(" of size ");
                    sb.append(ulq.i(bitmap));
                    sb.append(" in ");
                    sb.append(epe.a(jB));
                    sb.append(", options format: ");
                    sb.append(cchVar.c(c));
                    sb.append(", hasAlpha: ");
                    sb.append(bitmap.hasAlpha());
                }
                d0b.e();
                return z;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            d0b.e();
            throw th3;
        }
    }

    public final Bitmap.CompressFormat d(Bitmap bitmap, cch cchVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) cchVar.c(c);
        if (compressFormat != null) {
            return compressFormat;
        }
        return bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }
}
