package h0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public final Object a(Object obj) throws ImageCaptureException {
        j0.g gVarC;
        i0.b bVar = (i0.b) obj;
        androidx.camera.core.e eVarA = bVar.a();
        j0 j0VarB = bVar.b();
        if (ImageUtil.c(eVarA.getFormat())) {
            try {
                j0.g.a aVar = j0.g.f95913b;
                ByteBuffer byteBufferD = eVarA.A2()[0].d();
                byteBufferD.rewind();
                byte[] bArr = new byte[byteBufferD.capacity()];
                byteBufferD.get(bArr);
                gVarC = j0.g.c(new ByteArrayInputStream(bArr));
                eVarA.A2()[0].d().rewind();
            } catch (IOException e4) {
                throw new ImageCaptureException(1, "Failed to extract EXIF data.", e4);
            }
        } else {
            gVarC = null;
        }
        y.f80585g.getClass();
        if (((ImageCaptureRotationOptionQuirk) o0.a.f128480a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
            androidx.camera.core.impl.h hVar = androidx.camera.core.impl.v0.f5810i;
        } else if (ImageUtil.c(eVarA.getFormat())) {
            k7.h.e(gVarC, "JPEG image must have exif.");
            Size size = new Size(eVarA.getWidth(), eVarA.getHeight());
            int iD = j0VarB.f80513f - gVarC.d();
            Size size2 = j0.v.d(j0.v.l(iD)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix matrixA = j0.v.a(iD, false, new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()));
            RectF rectF = new RectF(j0VarB.f80512e);
            matrixA.mapRect(rectF);
            rectF.sort();
            Size size3 = size2;
            Rect rect = new Rect();
            rectF.round(rect);
            int iD2 = gVarC.d();
            Matrix matrix = new Matrix(j0VarB.f80515h);
            matrix.postConcat(matrixA);
            androidx.camera.core.impl.c0 aVar2 = eVarA.A0() instanceof m0.b ? ((m0.b) eVarA.A0()).f115491a : new androidx.camera.core.impl.c0.a();
            eVarA.getFormat();
            return new r0.b(eVarA, gVarC, eVarA.getFormat(), size3, rect, iD2, matrix, aVar2);
        }
        j0.g gVar = gVarC;
        Rect rect2 = j0VarB.f80512e;
        int i14 = j0VarB.f80513f;
        Matrix matrix2 = j0VarB.f80515h;
        androidx.camera.core.impl.c0 aVar3 = eVarA.A0() instanceof m0.b ? ((m0.b) eVarA.A0()).f115491a : new androidx.camera.core.impl.c0.a();
        Size size4 = new Size(eVarA.getWidth(), eVarA.getHeight());
        if (ImageUtil.c(eVarA.getFormat())) {
            k7.h.e(gVar, "JPEG image must have Exif.");
        }
        return new r0.b(eVarA, gVar, eVarA.getFormat(), size4, rect2, i14, matrix2, aVar3);
    }
}
