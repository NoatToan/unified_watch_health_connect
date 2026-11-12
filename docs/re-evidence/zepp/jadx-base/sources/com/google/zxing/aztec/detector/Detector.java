package com.google.zxing.aztec.detector;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import io.netty.util.internal.StringUtil;
import kotlin.text.Typography;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes4.dex */
public final class Detector {
    private static final int[] g = {3808, 476, 2107, RaceId.RACE_FLASH_PAGE_PROGRAM};
    private final BitMatrix a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;

    public static final class a {
        private final int a;
        private final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public ResultPoint c() {
            return new ResultPoint(a(), b());
        }

        public String toString() {
            return SearchCriteria.LT + this.a + StringUtil.SPACE + this.b + Typography.greater;
        }
    }

    public Detector(BitMatrix bitMatrix) {
        this.a = bitMatrix;
    }

    private static float a(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    private static float b(a aVar, a aVar2) {
        return MathUtils.distance(aVar.a(), aVar.b(), aVar2.a(), aVar2.b());
    }

    private static ResultPoint[] c(ResultPoint[] resultPointArr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        float x = resultPointArr[0].getX() - resultPointArr[2].getX();
        float y = resultPointArr[0].getY() - resultPointArr[2].getY();
        float x2 = (resultPointArr[0].getX() + resultPointArr[2].getX()) / 2.0f;
        float y2 = (resultPointArr[0].getY() + resultPointArr[2].getY()) / 2.0f;
        float f2 = x * f;
        float f3 = y * f;
        ResultPoint resultPoint = new ResultPoint(x2 + f2, y2 + f3);
        ResultPoint resultPoint2 = new ResultPoint(x2 - f2, y2 - f3);
        float x3 = resultPointArr[1].getX() - resultPointArr[3].getX();
        float y3 = resultPointArr[1].getY() - resultPointArr[3].getY();
        float x4 = (resultPointArr[1].getX() + resultPointArr[3].getX()) / 2.0f;
        float y4 = (resultPointArr[1].getY() + resultPointArr[3].getY()) / 2.0f;
        float f4 = x3 * f;
        float f5 = f * y3;
        return new ResultPoint[]{resultPoint, new ResultPoint(x4 + f4, y4 + f5), resultPoint2, new ResultPoint(x4 - f4, y4 - f5)};
    }

    private void d(ResultPoint[] resultPointArr) throws NotFoundException {
        long j;
        long j2;
        if (!n(resultPointArr[0]) || !n(resultPointArr[1]) || !n(resultPointArr[2]) || !n(resultPointArr[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i = this.e * 2;
        int[] iArr = {q(resultPointArr[0], resultPointArr[1], i), q(resultPointArr[1], resultPointArr[2], i), q(resultPointArr[2], resultPointArr[3], i), q(resultPointArr[3], resultPointArr[0], i)};
        this.f = l(iArr, i);
        long j3 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[(this.f + i2) % 4];
            if (this.b) {
                j = j3 << 7;
                j2 = (i3 >> 1) & 127;
            } else {
                j = j3 << 10;
                j2 = ((i3 >> 2) & 992) + ((i3 >> 1) & 31);
            }
            j3 = j + j2;
        }
        int iG = g(j3, this.b);
        if (this.b) {
            this.c = (iG >> 6) + 1;
            this.d = (iG & 63) + 1;
        } else {
            this.c = (iG >> 11) + 1;
            this.d = (iG & 2047) + 1;
        }
    }

    private ResultPoint[] e(a aVar) throws NotFoundException {
        this.e = 1;
        a aVar2 = aVar;
        a aVar3 = aVar2;
        a aVar4 = aVar3;
        a aVar5 = aVar4;
        boolean z = true;
        while (this.e < 9) {
            a aVarI = i(aVar2, z, 1, -1);
            a aVarI2 = i(aVar3, z, 1, 1);
            a aVarI3 = i(aVar4, z, -1, 1);
            a aVarI4 = i(aVar5, z, -1, -1);
            if (this.e > 2) {
                double dB = (b(aVarI4, aVarI) * this.e) / (b(aVar5, aVar2) * (this.e + 2));
                if (dB < 0.75d || dB > 1.25d || !o(aVarI, aVarI2, aVarI3, aVarI4)) {
                    break;
                }
            }
            z = !z;
            this.e++;
            aVar5 = aVarI4;
            aVar2 = aVarI;
            aVar3 = aVarI2;
            aVar4 = aVarI3;
        }
        int i = this.e;
        if (i != 5 && i != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.b = i == 5;
        ResultPoint[] resultPointArr = {new ResultPoint(aVar2.a() + 0.5f, aVar2.b() - 0.5f), new ResultPoint(aVar3.a() + 0.5f, aVar3.b() + 0.5f), new ResultPoint(aVar4.a() - 0.5f, aVar4.b() + 0.5f), new ResultPoint(aVar5.a() - 0.5f, aVar5.b() - 0.5f)};
        int i2 = this.e;
        return c(resultPointArr, (i2 * 2) - 3, i2 * 2);
    }

    private int f(a aVar, a aVar2) {
        float fB = b(aVar, aVar2);
        float fA = (aVar2.a() - aVar.a()) / fB;
        float fB2 = (aVar2.b() - aVar.b()) / fB;
        float fA2 = aVar.a();
        float fB3 = aVar.b();
        boolean z = this.a.get(aVar.a(), aVar.b());
        int iCeil = (int) Math.ceil(fB);
        int i = 0;
        for (int i2 = 0; i2 < iCeil; i2++) {
            fA2 += fA;
            fB3 += fB2;
            if (this.a.get(MathUtils.round(fA2), MathUtils.round(fB3)) != z) {
                i++;
            }
        }
        float f = i / fB;
        if (f <= 0.1f || f >= 0.9f) {
            return (f <= 0.1f) == z ? 1 : -1;
        }
        return 0;
    }

    private static int g(long j, boolean z) throws NotFoundException {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new ReedSolomonDecoder(GenericGF.AZTEC_PARAM).decode(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    private int h() {
        if (this.b) {
            return (this.c * 4) + 11;
        }
        int i = this.c;
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    private a i(a aVar, boolean z, int i, int i2) {
        int iA = aVar.a() + i;
        int iB = aVar.b();
        while (true) {
            iB += i2;
            if (!m(iA, iB) || this.a.get(iA, iB) != z) {
                break;
            }
            iA += i;
        }
        int i3 = iA - i;
        int i4 = iB - i2;
        while (m(i3, i4) && this.a.get(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (m(i5, i4) && this.a.get(i5, i4) == z) {
            i4 += i2;
        }
        return new a(i5, i4 - i2);
    }

    private a j() {
        ResultPoint resultPointC;
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        ResultPoint resultPointC2;
        ResultPoint resultPointC3;
        ResultPoint resultPointC4;
        ResultPoint resultPointC5;
        try {
            ResultPoint[] resultPointArrDetect = new WhiteRectangleDetector(this.a).detect();
            resultPoint2 = resultPointArrDetect[0];
            resultPoint3 = resultPointArrDetect[1];
            resultPoint = resultPointArrDetect[2];
            resultPointC = resultPointArrDetect[3];
        } catch (NotFoundException unused) {
            int width = this.a.getWidth() / 2;
            int height = this.a.getHeight() / 2;
            int i = width + 7;
            int i2 = height - 7;
            ResultPoint resultPointC6 = i(new a(i, i2), false, 1, -1).c();
            int i3 = height + 7;
            ResultPoint resultPointC7 = i(new a(i, i3), false, 1, 1).c();
            int i4 = width - 7;
            ResultPoint resultPointC8 = i(new a(i4, i3), false, -1, 1).c();
            resultPointC = i(new a(i4, i2), false, -1, -1).c();
            resultPoint = resultPointC8;
            resultPoint2 = resultPointC6;
            resultPoint3 = resultPointC7;
        }
        int iRound = MathUtils.round((((resultPoint2.getX() + resultPointC.getX()) + resultPoint3.getX()) + resultPoint.getX()) / 4.0f);
        int iRound2 = MathUtils.round((((resultPoint2.getY() + resultPointC.getY()) + resultPoint3.getY()) + resultPoint.getY()) / 4.0f);
        try {
            ResultPoint[] resultPointArrDetect2 = new WhiteRectangleDetector(this.a, 15, iRound, iRound2).detect();
            resultPointC2 = resultPointArrDetect2[0];
            resultPointC3 = resultPointArrDetect2[1];
            resultPointC4 = resultPointArrDetect2[2];
            resultPointC5 = resultPointArrDetect2[3];
        } catch (NotFoundException unused2) {
            int i5 = iRound + 7;
            int i6 = iRound2 - 7;
            resultPointC2 = i(new a(i5, i6), false, 1, -1).c();
            int i7 = iRound2 + 7;
            resultPointC3 = i(new a(i5, i7), false, 1, 1).c();
            int i8 = iRound - 7;
            resultPointC4 = i(new a(i8, i7), false, -1, 1).c();
            resultPointC5 = i(new a(i8, i6), false, -1, -1).c();
        }
        return new a(MathUtils.round((((resultPointC2.getX() + resultPointC5.getX()) + resultPointC3.getX()) + resultPointC4.getX()) / 4.0f), MathUtils.round((((resultPointC2.getY() + resultPointC5.getY()) + resultPointC3.getY()) + resultPointC4.getY()) / 4.0f));
    }

    private ResultPoint[] k(ResultPoint[] resultPointArr) {
        return c(resultPointArr, this.e * 2, h());
    }

    private static int l(int[] iArr, int i) throws NotFoundException {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private boolean m(int i, int i2) {
        return i >= 0 && i < this.a.getWidth() && i2 > 0 && i2 < this.a.getHeight();
    }

    private boolean n(ResultPoint resultPoint) {
        return m(MathUtils.round(resultPoint.getX()), MathUtils.round(resultPoint.getY()));
    }

    private boolean o(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a(aVar.a() - 3, aVar.b() + 3);
        a aVar6 = new a(aVar2.a() - 3, aVar2.b() - 3);
        a aVar7 = new a(aVar3.a() + 3, aVar3.b() - 3);
        a aVar8 = new a(aVar4.a() + 3, aVar4.b() + 3);
        int iF = f(aVar8, aVar5);
        return iF != 0 && f(aVar5, aVar6) == iF && f(aVar6, aVar7) == iF && f(aVar7, aVar8) == iF;
    }

    private BitMatrix p(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) throws NotFoundException {
        GridSampler gridSampler = GridSampler.getInstance();
        int iH = h();
        float f = iH / 2.0f;
        int i = this.e;
        float f2 = f - i;
        float f3 = f + i;
        return gridSampler.sampleGrid(bitMatrix, iH, iH, f2, f2, f3, f2, f3, f3, f2, f3, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint4.getX(), resultPoint4.getY());
    }

    private int q(ResultPoint resultPoint, ResultPoint resultPoint2, int i) {
        float fA = a(resultPoint, resultPoint2);
        float f = fA / i;
        float x = resultPoint.getX();
        float y = resultPoint.getY();
        float x2 = ((resultPoint2.getX() - resultPoint.getX()) * f) / fA;
        float y2 = (f * (resultPoint2.getY() - resultPoint.getY())) / fA;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.a.get(MathUtils.round((f2 * x2) + x), MathUtils.round((f2 * y2) + y))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    public AztecDetectorResult detect() throws NotFoundException {
        return detect(false);
    }

    public AztecDetectorResult detect(boolean z) throws NotFoundException {
        ResultPoint[] resultPointArrE = e(j());
        if (z) {
            ResultPoint resultPoint = resultPointArrE[0];
            resultPointArrE[0] = resultPointArrE[2];
            resultPointArrE[2] = resultPoint;
        }
        d(resultPointArrE);
        BitMatrix bitMatrix = this.a;
        int i = this.f;
        return new AztecDetectorResult(p(bitMatrix, resultPointArrE[i % 4], resultPointArrE[(i + 1) % 4], resultPointArrE[(i + 2) % 4], resultPointArrE[(i + 3) % 4]), k(resultPointArrE), this.b, this.d, this.c);
    }
}
