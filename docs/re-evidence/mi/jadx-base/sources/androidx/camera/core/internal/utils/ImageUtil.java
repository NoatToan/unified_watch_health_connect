package androidx.camera.core.internal.utils;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.camera.core.m;
import defpackage.zpe;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ImageUtil {
    public static Rect a(Size size, Rational rational) {
        int i;
        if (!e(rational)) {
            zpe.k("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f = width;
        float f2 = height;
        float f3 = f / f2;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i2 = 0;
        if (rational.floatValue() > f3) {
            int iRound = Math.round((f / numerator) * denominator);
            i = (height - iRound) / 2;
            height = iRound;
        } else {
            int iRound2 = Math.round((f2 / denominator) * numerator);
            int i3 = (width - iRound2) / 2;
            width = iRound2;
            i = 0;
            i2 = i3;
        }
        return new Rect(i2, i, width + i2, height + i);
    }

    public static Rect b(Rect rect, int i, Size size, int i2) {
        Matrix matrix = new Matrix();
        matrix.setRotate(i2 - i);
        float[] fArrI = i(size);
        matrix.mapPoints(fArrI);
        matrix.postTranslate(-h(fArrI[0], fArrI[2], fArrI[4], fArrI[6]), -h(fArrI[1], fArrI[3], fArrI[5], fArrI[7]));
        matrix.invert(matrix);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, new RectF(rect));
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    public static Rational c(@IntRange(from = 0, to = 359) int i, Rational rational) {
        return (i == 90 || i == 270) ? d(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static Rational d(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean e(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    public static boolean f(Size size, Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && g(size, rational) && !rational.isNaN();
    }

    public static boolean g(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = rational.getNumerator();
        float denominator = rational.getDenominator();
        return (height == Math.round((((float) width) / numerator) * denominator) && width == Math.round((((float) height) / denominator) * numerator)) ? false : true;
    }

    public static float h(float f, float f2, float f3, float f4) {
        return Math.min(Math.min(f, f2), Math.min(f3, f4));
    }

    public static float[] i(Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static byte[] j(m mVar) {
        m.a aVar = mVar.x()[0];
        m.a aVar2 = mVar.x()[1];
        m.a aVar3 = mVar.x()[2];
        ByteBuffer buffer = aVar.getBuffer();
        ByteBuffer buffer2 = aVar2.getBuffer();
        ByteBuffer buffer3 = aVar3.getBuffer();
        buffer.rewind();
        buffer2.rewind();
        buffer3.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[((mVar.getWidth() * mVar.getHeight()) / 2) + iRemaining];
        int width = 0;
        for (int i = 0; i < mVar.getHeight(); i++) {
            buffer.get(bArr, width, mVar.getWidth());
            width += mVar.getWidth();
            buffer.position(Math.min(iRemaining, (buffer.position() - mVar.getWidth()) + aVar.a()));
        }
        int height = mVar.getHeight() / 2;
        int width2 = mVar.getWidth() / 2;
        int iA = aVar3.a();
        int iA2 = aVar2.a();
        int iB = aVar3.b();
        int iB2 = aVar2.b();
        byte[] bArr2 = new byte[iA];
        byte[] bArr3 = new byte[iA2];
        for (int i2 = 0; i2 < height; i2++) {
            buffer3.get(bArr2, 0, Math.min(iA, buffer3.remaining()));
            buffer2.get(bArr3, 0, Math.min(iA2, buffer2.remaining()));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < width2; i5++) {
                int i6 = width + 1;
                bArr[width] = bArr2[i3];
                width += 2;
                bArr[i6] = bArr3[i4];
                i3 += iB;
                i4 += iB2;
            }
        }
        return bArr;
    }

    public static final class CodecFailedException extends Exception {
        private FailureType mFailureType;

        public enum FailureType {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public CodecFailedException(String str) {
            super(str);
            this.mFailureType = FailureType.UNKNOWN;
        }

        public FailureType getFailureType() {
            return this.mFailureType;
        }

        public CodecFailedException(String str, FailureType failureType) {
            super(str);
            this.mFailureType = failureType;
        }
    }
}
