package com.google.zxing.datamatrix.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Detector {
    private final BitMatrix a;
    private final WhiteRectangleDetector b;

    public static final class b {
        private final ResultPoint a;
        private final ResultPoint b;
        private final int c;

        public ResultPoint a() {
            return this.a;
        }

        public ResultPoint b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public String toString() {
            return this.a + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.b + '/' + this.c;
        }

        private b(ResultPoint resultPoint, ResultPoint resultPoint2, int i) {
            this.a = resultPoint;
            this.b = resultPoint2;
            this.c = i;
        }
    }

    public static final class c implements Serializable, Comparator<b> {
        private c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar.c() - bVar2.c();
        }
    }

    public Detector(BitMatrix bitMatrix) throws NotFoundException {
        this.a = bitMatrix;
        this.b = new WhiteRectangleDetector(bitMatrix);
    }

    private ResultPoint a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i) {
        float f = i;
        float fC = c(resultPoint, resultPoint2) / f;
        float fC2 = c(resultPoint3, resultPoint4);
        ResultPoint resultPoint5 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint3.getX()) / fC2) * fC), resultPoint4.getY() + (fC * ((resultPoint4.getY() - resultPoint3.getY()) / fC2)));
        float fC3 = c(resultPoint, resultPoint3) / f;
        float fC4 = c(resultPoint2, resultPoint4);
        ResultPoint resultPoint6 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint2.getX()) / fC4) * fC3), resultPoint4.getY() + (fC3 * ((resultPoint4.getY() - resultPoint2.getY()) / fC4)));
        if (e(resultPoint5)) {
            return (e(resultPoint6) && Math.abs(g(resultPoint3, resultPoint5).c() - g(resultPoint2, resultPoint5).c()) > Math.abs(g(resultPoint3, resultPoint6).c() - g(resultPoint2, resultPoint6).c())) ? resultPoint6 : resultPoint5;
        }
        if (e(resultPoint6)) {
            return resultPoint6;
        }
        return null;
    }

    private ResultPoint b(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i, int i2) {
        float fC = c(resultPoint, resultPoint2) / i;
        float fC2 = c(resultPoint3, resultPoint4);
        ResultPoint resultPoint5 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint3.getX()) / fC2) * fC), resultPoint4.getY() + (fC * ((resultPoint4.getY() - resultPoint3.getY()) / fC2)));
        float fC3 = c(resultPoint, resultPoint3) / i2;
        float fC4 = c(resultPoint2, resultPoint4);
        ResultPoint resultPoint6 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint2.getX()) / fC4) * fC3), resultPoint4.getY() + (fC3 * ((resultPoint4.getY() - resultPoint2.getY()) / fC4)));
        if (e(resultPoint5)) {
            return (e(resultPoint6) && Math.abs(i - g(resultPoint3, resultPoint5).c()) + Math.abs(i2 - g(resultPoint2, resultPoint5).c()) > Math.abs(i - g(resultPoint3, resultPoint6).c()) + Math.abs(i2 - g(resultPoint2, resultPoint6).c())) ? resultPoint6 : resultPoint5;
        }
        if (e(resultPoint6)) {
            return resultPoint6;
        }
        return null;
    }

    private static int c(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2));
    }

    private static void d(Map<ResultPoint, Integer> map, ResultPoint resultPoint) {
        Integer num = map.get(resultPoint);
        map.put(resultPoint, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    private boolean e(ResultPoint resultPoint) {
        return resultPoint.getX() >= 0.0f && resultPoint.getX() < ((float) this.a.getWidth()) && resultPoint.getY() > 0.0f && resultPoint.getY() < ((float) this.a.getHeight());
    }

    private static BitMatrix f(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i, int i2) throws NotFoundException {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return GridSampler.getInstance().sampleGrid(bitMatrix, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, resultPoint.getX(), resultPoint.getY(), resultPoint4.getX(), resultPoint4.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    private b g(ResultPoint resultPoint, ResultPoint resultPoint2) {
        int x = (int) resultPoint.getX();
        int y = (int) resultPoint.getY();
        int x2 = (int) resultPoint2.getX();
        int y2 = (int) resultPoint2.getY();
        int i = 0;
        boolean z = Math.abs(y2 - y) > Math.abs(x2 - x);
        if (z) {
            y = x;
            x = y;
            y2 = x2;
            x2 = y2;
        }
        int iAbs = Math.abs(x2 - x);
        int iAbs2 = Math.abs(y2 - y);
        int i2 = (-iAbs) / 2;
        int i3 = y < y2 ? 1 : -1;
        int i4 = x >= x2 ? -1 : 1;
        boolean z2 = this.a.get(z ? y : x, z ? x : y);
        while (x != x2) {
            boolean z3 = this.a.get(z ? y : x, z ? x : y);
            if (z3 != z2) {
                i++;
                z2 = z3;
            }
            i2 += iAbs2;
            if (i2 > 0) {
                if (y == y2) {
                    break;
                }
                y += i3;
                i2 -= iAbs;
            }
            x += i4;
        }
        return new b(resultPoint, resultPoint2, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DetectorResult detect() throws NotFoundException {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        BitMatrix bitMatrixF;
        ResultPoint[] resultPointArrDetect = this.b.detect();
        ResultPoint resultPoint3 = resultPointArrDetect[0];
        ResultPoint resultPoint4 = resultPointArrDetect[1];
        ResultPoint resultPoint5 = resultPointArrDetect[2];
        ResultPoint resultPoint6 = resultPointArrDetect[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(g(resultPoint3, resultPoint4));
        arrayList.add(g(resultPoint3, resultPoint5));
        arrayList.add(g(resultPoint4, resultPoint6));
        arrayList.add(g(resultPoint5, resultPoint6));
        ResultPoint resultPoint7 = null;
        Collections.sort(arrayList, new c());
        b bVar = (b) arrayList.get(0);
        b bVar2 = (b) arrayList.get(1);
        HashMap map = new HashMap();
        d(map, bVar.a());
        d(map, bVar.b());
        d(map, bVar2.a());
        d(map, bVar2.b());
        ResultPoint resultPoint8 = null;
        ResultPoint resultPoint9 = null;
        for (Map.Entry entry : map.entrySet()) {
            ResultPoint resultPoint10 = (ResultPoint) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                resultPoint8 = resultPoint10;
            } else if (resultPoint7 == null) {
                resultPoint7 = resultPoint10;
            } else {
                resultPoint9 = resultPoint10;
            }
        }
        if (resultPoint7 == null || resultPoint8 == null || resultPoint9 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint[] resultPointArr = {resultPoint7, resultPoint8, resultPoint9};
        ResultPoint.orderBestPatterns(resultPointArr);
        ResultPoint resultPoint11 = resultPointArr[0];
        ResultPoint resultPoint12 = resultPointArr[1];
        ResultPoint resultPoint13 = resultPointArr[2];
        if (!map.containsKey(resultPoint3)) {
            resultPoint = resultPoint3;
        } else if (map.containsKey(resultPoint4)) {
            resultPoint = !map.containsKey(resultPoint5) ? resultPoint5 : resultPoint6;
        } else {
            resultPoint = resultPoint4;
        }
        int iC = g(resultPoint13, resultPoint).c();
        int iC2 = g(resultPoint11, resultPoint).c();
        if ((iC & 1) == 1) {
            iC++;
        }
        int i = iC + 2;
        if ((iC2 & 1) == 1) {
            iC2++;
        }
        int i2 = iC2 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            resultPoint2 = resultPoint13;
            ResultPoint resultPointB = b(resultPoint12, resultPoint11, resultPoint13, resultPoint, i, i2);
            if (resultPointB != null) {
                resultPoint = resultPointB;
            }
            int iC3 = g(resultPoint2, resultPoint).c();
            int iC4 = g(resultPoint11, resultPoint).c();
            if ((iC3 & 1) == 1) {
                iC3++;
            }
            int i3 = iC3;
            if ((iC4 & 1) == 1) {
                iC4++;
            }
            bitMatrixF = f(this.a, resultPoint2, resultPoint12, resultPoint11, resultPoint, i3, iC4);
        } else {
            ResultPoint resultPointA = a(resultPoint12, resultPoint11, resultPoint13, resultPoint, Math.min(i2, i));
            if (resultPointA != null) {
                resultPoint = resultPointA;
            }
            int iMax = Math.max(g(resultPoint13, resultPoint).c(), g(resultPoint11, resultPoint).c()) + 1;
            if ((iMax & 1) == 1) {
                iMax++;
            }
            int i4 = iMax;
            bitMatrixF = f(this.a, resultPoint13, resultPoint12, resultPoint11, resultPoint, i4, i4);
            resultPoint2 = resultPoint13;
        }
        return new DetectorResult(bitMatrixF, new ResultPoint[]{resultPoint2, resultPoint12, resultPoint11, resultPoint});
    }
}
