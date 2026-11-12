package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class FinderPatternFinder {
    public static final int MAX_MODULES = 97;
    public static final int MIN_SKIP = 3;
    private static final int f = 2;
    private final BitMatrix a;
    private final List<FinderPattern> b;
    private boolean c;
    private final int[] d;
    private final ResultPointCallback e;

    public static final class b implements Serializable, Comparator<FinderPattern> {
        private final float a;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            int iCompare = Integer.compare(finderPattern2.d(), finderPattern.d());
            return iCompare == 0 ? Float.compare(Math.abs(finderPattern.getEstimatedModuleSize() - this.a), Math.abs(finderPattern2.getEstimatedModuleSize() - this.a)) : iCompare;
        }

        private b(float f) {
            this.a = f;
        }
    }

    public static final class c implements Serializable, Comparator<FinderPattern> {
        private final float a;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            return Float.compare(Math.abs(finderPattern2.getEstimatedModuleSize() - this.a), Math.abs(finderPattern.getEstimatedModuleSize() - this.a));
        }

        private c(float f) {
            this.a = f;
        }
    }

    public FinderPatternFinder(BitMatrix bitMatrix) {
        this(bitMatrix, null);
    }

    private static float a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    private boolean b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] iArrG = g();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.a.get(i2 - i6, i - i6)) {
            iArrG[2] = iArrG[2] + 1;
            i6++;
        }
        if (iArrG[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.a.get(i2 - i6, i - i6)) {
            iArrG[1] = iArrG[1] + 1;
            i6++;
        }
        if (iArrG[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.a.get(i2 - i6, i - i6)) {
            iArrG[0] = iArrG[0] + 1;
            i6++;
        }
        if (iArrG[0] == 0) {
            return false;
        }
        int height = this.a.getHeight();
        int width = this.a.getWidth();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 >= height || (i5 = i2 + i7) >= width || !this.a.get(i5, i8)) {
                break;
            }
            iArrG[2] = iArrG[2] + 1;
            i7++;
        }
        while (true) {
            int i9 = i + i7;
            if (i9 >= height || (i4 = i2 + i7) >= width || this.a.get(i4, i9)) {
                break;
            }
            iArrG[3] = iArrG[3] + 1;
            i7++;
        }
        if (iArrG[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 >= height || (i3 = i2 + i7) >= width || !this.a.get(i3, i10)) {
                break;
            }
            iArrG[4] = iArrG[4] + 1;
            i7++;
        }
        if (iArrG[4] == 0) {
            return false;
        }
        return foundPatternDiagonal(iArrG);
    }

    private float c(int i, int i2, int i3, int i4) {
        BitMatrix bitMatrix = this.a;
        int width = bitMatrix.getWidth();
        int[] iArrG = g();
        int i5 = i;
        while (i5 >= 0 && bitMatrix.get(i5, i2)) {
            iArrG[2] = iArrG[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bitMatrix.get(i5, i2) && iArrG[1] <= i3) {
            iArrG[1] = iArrG[1] + 1;
            i5--;
        }
        if (i5 >= 0 && iArrG[1] <= i3) {
            while (i5 >= 0 && bitMatrix.get(i5, i2) && iArrG[0] <= i3) {
                iArrG[0] = iArrG[0] + 1;
                i5--;
            }
            if (iArrG[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < width && bitMatrix.get(i6, i2)) {
                iArrG[2] = iArrG[2] + 1;
                i6++;
            }
            if (i6 == width) {
                return Float.NaN;
            }
            while (i6 < width && !bitMatrix.get(i6, i2) && iArrG[3] < i3) {
                iArrG[3] = iArrG[3] + 1;
                i6++;
            }
            if (i6 != width && iArrG[3] < i3) {
                while (i6 < width && bitMatrix.get(i6, i2) && iArrG[4] < i3) {
                    iArrG[4] = iArrG[4] + 1;
                    i6++;
                }
                if (iArrG[4] < i3 && Math.abs(((((iArrG[0] + iArrG[1]) + iArrG[2]) + iArrG[3]) + iArrG[4]) - i4) * 5 < i4 && foundPatternCross(iArrG)) {
                    return a(iArrG, i6);
                }
            }
        }
        return Float.NaN;
    }

    private float d(int i, int i2, int i3, int i4) {
        BitMatrix bitMatrix = this.a;
        int height = bitMatrix.getHeight();
        int[] iArrG = g();
        int i5 = i;
        while (i5 >= 0 && bitMatrix.get(i2, i5)) {
            iArrG[2] = iArrG[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bitMatrix.get(i2, i5) && iArrG[1] <= i3) {
            iArrG[1] = iArrG[1] + 1;
            i5--;
        }
        if (i5 >= 0 && iArrG[1] <= i3) {
            while (i5 >= 0 && bitMatrix.get(i2, i5) && iArrG[0] <= i3) {
                iArrG[0] = iArrG[0] + 1;
                i5--;
            }
            if (iArrG[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < height && bitMatrix.get(i2, i6)) {
                iArrG[2] = iArrG[2] + 1;
                i6++;
            }
            if (i6 == height) {
                return Float.NaN;
            }
            while (i6 < height && !bitMatrix.get(i2, i6) && iArrG[3] < i3) {
                iArrG[3] = iArrG[3] + 1;
                i6++;
            }
            if (i6 != height && iArrG[3] < i3) {
                while (i6 < height && bitMatrix.get(i2, i6) && iArrG[4] < i3) {
                    iArrG[4] = iArrG[4] + 1;
                    i6++;
                }
                if (iArrG[4] < i3 && Math.abs(((((iArrG[0] + iArrG[1]) + iArrG[2]) + iArrG[3]) + iArrG[4]) - i4) * 5 < i4 * 2 && foundPatternCross(iArrG)) {
                    return a(iArrG, i6);
                }
            }
        }
        return Float.NaN;
    }

    private int f() {
        if (this.b.size() <= 1) {
            return 0;
        }
        FinderPattern finderPattern = null;
        for (FinderPattern finderPattern2 : this.b) {
            if (finderPattern2.d() >= 2) {
                if (finderPattern != null) {
                    this.c = true;
                    return ((int) (Math.abs(finderPattern.getX() - finderPattern2.getX()) - Math.abs(finderPattern.getY() - finderPattern2.getY()))) / 2;
                }
                finderPattern = finderPattern2;
            }
        }
        return 0;
    }

    public static boolean foundPatternCross(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f2 = i / 7.0f;
        float f3 = f2 / 2.0f;
        return Math.abs(f2 - ((float) iArr[0])) < f3 && Math.abs(f2 - ((float) iArr[1])) < f3 && Math.abs((f2 * 3.0f) - ((float) iArr[2])) < 3.0f * f3 && Math.abs(f2 - ((float) iArr[3])) < f3 && Math.abs(f2 - ((float) iArr[4])) < f3;
    }

    public static boolean foundPatternDiagonal(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f2 = i / 7.0f;
        float f3 = f2 / 1.333f;
        return Math.abs(f2 - ((float) iArr[0])) < f3 && Math.abs(f2 - ((float) iArr[1])) < f3 && Math.abs((f2 * 3.0f) - ((float) iArr[2])) < 3.0f * f3 && Math.abs(f2 - ((float) iArr[3])) < f3 && Math.abs(f2 - ((float) iArr[4])) < f3;
    }

    private int[] g() {
        clearCounts(this.d);
        return this.d;
    }

    private boolean h() {
        int size = this.b.size();
        float fAbs = 0.0f;
        int i = 0;
        float estimatedModuleSize = 0.0f;
        for (FinderPattern finderPattern : this.b) {
            if (finderPattern.d() >= 2) {
                i++;
                estimatedModuleSize += finderPattern.getEstimatedModuleSize();
            }
        }
        if (i < 3) {
            return false;
        }
        float f2 = estimatedModuleSize / size;
        Iterator<FinderPattern> it2 = this.b.iterator();
        while (it2.hasNext()) {
            fAbs += Math.abs(it2.next().getEstimatedModuleSize() - f2);
        }
        return fAbs <= estimatedModuleSize * 0.05f;
    }

    private FinderPattern[] i() throws NotFoundException {
        int size = this.b.size();
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        float estimatedModuleSize = 0.0f;
        if (size > 3) {
            Iterator<FinderPattern> it2 = this.b.iterator();
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (it2.hasNext()) {
                float estimatedModuleSize2 = it2.next().getEstimatedModuleSize();
                f2 += estimatedModuleSize2;
                f3 += estimatedModuleSize2 * estimatedModuleSize2;
            }
            float f4 = size;
            float f5 = f2 / f4;
            float fSqrt = (float) Math.sqrt((f3 / f4) - (f5 * f5));
            Collections.sort(this.b, new c(f5));
            float fMax = Math.max(0.2f * f5, fSqrt);
            int i = 0;
            while (i < this.b.size() && this.b.size() > 3) {
                if (Math.abs(this.b.get(i).getEstimatedModuleSize() - f5) > fMax) {
                    this.b.remove(i);
                    i--;
                }
                i++;
            }
        }
        if (this.b.size() > 3) {
            Iterator<FinderPattern> it3 = this.b.iterator();
            while (it3.hasNext()) {
                estimatedModuleSize += it3.next().getEstimatedModuleSize();
            }
            Collections.sort(this.b, new b(estimatedModuleSize / this.b.size()));
            List<FinderPattern> list = this.b;
            list.subList(3, list.size()).clear();
        }
        return new FinderPattern[]{this.b.get(0), this.b.get(1), this.b.get(2)};
    }

    public final void clearCounts(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    public final FinderPatternInfo e(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        int height = this.a.getHeight();
        int width = this.a.getWidth();
        int i = (height * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean zH = false;
        while (i2 < height && !zH) {
            clearCounts(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < width) {
                if (this.a.get(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 != 4) {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                } else if (foundPatternCross(iArr) && handlePossibleCenter(iArr, i2, i3)) {
                    if (this.c) {
                        zH = h();
                    } else {
                        int iF = f();
                        if (iF > iArr[2]) {
                            i2 += (iF - iArr[2]) - 2;
                            i3 = width - 1;
                        }
                    }
                    clearCounts(iArr);
                    i = 2;
                    i4 = 0;
                } else {
                    shiftCounts2(iArr);
                    i4 = 3;
                }
                i3++;
            }
            if (foundPatternCross(iArr) && handlePossibleCenter(iArr, i2, width)) {
                i = iArr[0];
                if (this.c) {
                    zH = h();
                }
            }
            i2 += i;
        }
        FinderPattern[] finderPatternArrI = i();
        ResultPoint.orderBestPatterns(finderPatternArrI);
        return new FinderPatternInfo(finderPatternArrI);
    }

    public final BitMatrix getImage() {
        return this.a;
    }

    public final List<FinderPattern> getPossibleCenters() {
        return this.b;
    }

    @Deprecated
    public final boolean handlePossibleCenter(int[] iArr, int i, int i2, boolean z) {
        return handlePossibleCenter(iArr, i, i2);
    }

    public final void shiftCounts2(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    public FinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        this.a = bitMatrix;
        this.b = new ArrayList();
        this.d = new int[5];
        this.e = resultPointCallback;
    }

    public final boolean handlePossibleCenter(int[] iArr, int i, int i2) {
        boolean z = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iA = (int) a(iArr, i2);
        float fD = d(i, iA, iArr[2], i3);
        if (!Float.isNaN(fD)) {
            int i4 = (int) fD;
            float fC = c(iA, i4, iArr[2], i3);
            if (!Float.isNaN(fC) && b(i4, (int) fC)) {
                float f2 = i3 / 7.0f;
                for (int i5 = 0; i5 < this.b.size(); i5++) {
                    FinderPattern finderPattern = this.b.get(i5);
                    if (finderPattern.b(f2, fD, fC)) {
                        this.b.set(i5, finderPattern.c(fD, fC, f2));
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    FinderPattern finderPattern2 = new FinderPattern(fC, fD, f2);
                    this.b.add(finderPattern2);
                    ResultPointCallback resultPointCallback = this.e;
                    if (resultPointCallback != null) {
                        resultPointCallback.foundPossibleResultPoint(finderPattern2);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
