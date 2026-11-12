package h0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.i2;
import androidx.camera.core.internal.utils.ImageUtil;
import com.google.auto.value.AutoValue;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0.d f80583a;

    @AutoValue
    public static abstract class a {
        public abstract int a();

        public abstract r0.k<androidx.camera.core.e> b();
    }

    public w(i2 i2Var) {
        this.f80583a = new p0.d(i2Var);
    }

    public static r0.b c(d dVar) throws ImageCaptureException {
        r0.k<androidx.camera.core.e> kVar = dVar.f80460a;
        androidx.camera.core.e eVarC = kVar.c();
        Rect rectB = kVar.b();
        try {
            byte[] bArrD = ImageUtil.d(eVarC, rectB, dVar.f80461b, kVar.f());
            try {
                j0.g gVarC = j0.g.c(new ByteArrayInputStream(bArrD));
                Size size = new Size(rectB.width(), rectB.height());
                Rect rect = new Rect(0, 0, rectB.width(), rectB.height());
                int iF = kVar.f();
                Matrix matrixG = kVar.g();
                RectF rectF = j0.v.f95963a;
                Matrix matrix = new Matrix(matrixG);
                matrix.postTranslate(-rectB.left, -rectB.top);
                return new r0.b(bArrD, gVarC, 256, size, rect, iF, matrix, kVar.a());
            } catch (IOException e4) {
                throw new ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e4);
            }
        } catch (ImageUtil.CodecFailedException e14) {
            throw new ImageCaptureException(1, "Failed to encode the image to JPEG.", e14);
        }
    }

    public final Object a(Object obj) throws Exception {
        r0.b bVarC;
        a aVar = (a) obj;
        try {
            int iE = aVar.b().e();
            if (iE != 35) {
                if (iE != 256 && iE != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + iE);
                }
                bVarC = b((d) aVar, iE);
            } else {
                bVarC = c((d) aVar);
            }
            aVar.b().c().close();
            return bVarC;
        } catch (Throwable th3) {
            aVar.b().c().close();
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r2 != (-1)) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r0.b b(d dVar, int i14) {
        byte[] bArr;
        byte[] bArrCopyOfRange;
        byte b14;
        r0.k<androidx.camera.core.e> kVar = dVar.f80460a;
        androidx.camera.core.e eVarC = kVar.c();
        int i15 = 0;
        if (this.f80583a.f134645a == null) {
            ByteBuffer byteBufferD = eVarC.A2()[0].d();
            bArrCopyOfRange = new byte[byteBufferD.capacity()];
            byteBufferD.rewind();
            byteBufferD.get(bArrCopyOfRange);
        } else {
            ByteBuffer byteBufferD2 = eVarC.A2()[0].d();
            int iCapacity = byteBufferD2.capacity();
            bArr = new byte[iCapacity];
            byteBufferD2.rewind();
            byteBufferD2.get(bArr);
            int i16 = 2;
            int i17 = 2;
            while (true) {
                if (i17 + 4 <= iCapacity && (b14 = bArr[i17]) == -1) {
                    if (b14 == -1 && bArr[i17 + 1] == -38) {
                        break;
                    }
                    i17 += (((bArr[i17 + 2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i17 + 3] & UnsignedBytes.MAX_VALUE)) + 2;
                } else {
                    while (true) {
                        int i18 = i16 + 1;
                        if (i18 <= iCapacity) {
                            if (bArr[i16] == -1 && bArr[i18] == -40) {
                                i15 = i16;
                                break;
                            }
                            i16 = i18;
                            i14 = i14;
                        } else {
                            i15 = -1;
                            break;
                        }
                    }
                }
            }
            bArrCopyOfRange = Arrays.copyOfRange(bArr, i15, byteBufferD2.limit());
        }
        bArr = bArrCopyOfRange;
        j0.g gVarD = kVar.d();
        Objects.requireNonNull(gVarD);
        return new r0.b(bArr, gVarD, i14, kVar.h(), kVar.b(), kVar.f(), kVar.g(), kVar.a());
    }
}
