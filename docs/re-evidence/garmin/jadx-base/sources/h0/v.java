package h0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.utils.ImageUtil;
import b0.b1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class v {
    public final Object a(Object obj) throws Throwable {
        Throwable th3;
        Bitmap bitmapCreateBitmap;
        r0.k kVar = (r0.k) obj;
        androidx.camera.core.g gVar = null;
        try {
            try {
                int iE = kVar.e();
                if (iE == 35) {
                    androidx.camera.core.e eVar = (androidx.camera.core.e) kVar.c();
                    boolean z14 = kVar.f() % 180 != 0;
                    androidx.camera.core.g gVar2 = new androidx.camera.core.g(b0.q0.a(z14 ? eVar.getHeight() : eVar.getWidth(), z14 ? eVar.getWidth() : eVar.getHeight(), 1, 2));
                    try {
                        b1 b1VarD = ImageProcessingUtil.d(eVar, gVar2, ByteBuffer.allocateDirect(eVar.getWidth() * eVar.getHeight() * 4), kVar.f(), false);
                        eVar.close();
                        if (b1VarD == null) {
                            throw new ImageCaptureException(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapCreateBitmap = ImageUtil.a(b1VarD);
                        b1VarD.close();
                        gVar = gVar2;
                    } catch (UnsupportedOperationException e4) {
                        e = e4;
                        throw new ImageCaptureException(0, "Can't convert " + (kVar.e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th4) {
                        th3 = th4;
                        gVar = gVar2;
                        if (gVar == null) {
                            throw th3;
                        }
                        gVar.close();
                        throw th3;
                    }
                } else {
                    if (iE != 256 && iE != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + kVar.e());
                    }
                    androidx.camera.core.e eVar2 = (androidx.camera.core.e) kVar.c();
                    Bitmap bitmapA = ImageUtil.a(eVar2);
                    eVar2.close();
                    int iF = kVar.f();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(iF);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapA, 0, 0, bitmapA.getWidth(), bitmapA.getHeight(), matrix, true);
                }
                if (gVar != null) {
                    gVar.close();
                }
                return bitmapCreateBitmap;
            } catch (Throwable th5) {
                th3 = th5;
            }
        } catch (UnsupportedOperationException e14) {
            e = e14;
        }
    }
}
