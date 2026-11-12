package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes4.dex */
public final class WhiteRectangleDetector {
    private static final int h = 10;
    private static final int i = 1;
    private final BitMatrix a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public WhiteRectangleDetector(BitMatrix bitMatrix) throws NotFoundException {
        this(bitMatrix, 10, bitMatrix.getWidth() / 2, bitMatrix.getHeight() / 2);
    }

    private ResultPoint[] a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        float x = resultPoint.getX();
        float y = resultPoint.getY();
        float x2 = resultPoint2.getX();
        float y2 = resultPoint2.getY();
        float x3 = resultPoint3.getX();
        float y3 = resultPoint3.getY();
        float x4 = resultPoint4.getX();
        float y4 = resultPoint4.getY();
        return x < ((float) this.c) / 2.0f ? new ResultPoint[]{new ResultPoint(x4 - 1.0f, y4 + 1.0f), new ResultPoint(x2 + 1.0f, y2 + 1.0f), new ResultPoint(x3 - 1.0f, y3 - 1.0f), new ResultPoint(x + 1.0f, y - 1.0f)} : new ResultPoint[]{new ResultPoint(x4 + 1.0f, y4 + 1.0f), new ResultPoint(x2 + 1.0f, y2 - 1.0f), new ResultPoint(x3 - 1.0f, y3 + 1.0f), new ResultPoint(x - 1.0f, y - 1.0f)};
    }

    private boolean b(int i2, int i3, int i4, boolean z) {
        if (z) {
            while (i2 <= i3) {
                if (this.a.get(i2, i4)) {
                    return true;
                }
                i2++;
            }
            return false;
        }
        while (i2 <= i3) {
            if (this.a.get(i4, i2)) {
                return true;
            }
            i2++;
        }
        return false;
    }

    private ResultPoint c(float f, float f2, float f3, float f4) {
        int iRound = MathUtils.round(MathUtils.distance(f, f2, f3, f4));
        float f5 = iRound;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i2 = 0; i2 < iRound; i2++) {
            float f8 = i2;
            int iRound2 = MathUtils.round((f8 * f6) + f);
            int iRound3 = MathUtils.round((f8 * f7) + f2);
            if (this.a.get(iRound2, iRound3)) {
                return new ResultPoint(iRound2, iRound3);
            }
        }
        return null;
    }

    public ResultPoint[] detect() throws NotFoundException {
        int i2 = this.d;
        int i3 = this.e;
        int i4 = this.g;
        int i5 = this.f;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (z2) {
            boolean zB = true;
            boolean z8 = false;
            while (true) {
                if ((!zB && z3) || i3 >= this.c) {
                    break;
                }
                zB = b(i4, i5, i3, false);
                if (zB) {
                    i3++;
                    z3 = true;
                    z8 = true;
                } else if (!z3) {
                    i3++;
                }
            }
            if (i3 < this.c) {
                boolean zB2 = true;
                while (true) {
                    if ((!zB2 && z4) || i5 >= this.b) {
                        break;
                    }
                    zB2 = b(i2, i3, i5, true);
                    if (zB2) {
                        i5++;
                        z4 = true;
                        z8 = true;
                    } else if (!z4) {
                        i5++;
                    }
                }
                if (i5 < this.b) {
                    boolean zB3 = true;
                    while (true) {
                        if ((!zB3 && z5) || i2 < 0) {
                            break;
                        }
                        zB3 = b(i4, i5, i2, false);
                        if (zB3) {
                            i2--;
                            z5 = true;
                            z8 = true;
                        } else if (!z5) {
                            i2--;
                        }
                    }
                    if (i2 >= 0) {
                        z2 = z8;
                        boolean zB4 = true;
                        while (true) {
                            if ((!zB4 && z7) || i4 < 0) {
                                break;
                            }
                            zB4 = b(i2, i3, i4, true);
                            if (zB4) {
                                i4--;
                                z2 = true;
                                z7 = true;
                            } else if (!z7) {
                                i4--;
                            }
                        }
                        if (i4 >= 0) {
                            if (z2) {
                                z6 = true;
                            }
                        }
                    }
                }
            }
            z = true;
            break;
        }
        if (z || !z6) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i6 = i3 - i2;
        ResultPoint resultPointC = null;
        ResultPoint resultPointC2 = null;
        for (int i7 = 1; resultPointC2 == null && i7 < i6; i7++) {
            resultPointC2 = c(i2, i5 - i7, i2 + i7, i5);
        }
        if (resultPointC2 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint resultPointC3 = null;
        for (int i8 = 1; resultPointC3 == null && i8 < i6; i8++) {
            resultPointC3 = c(i2, i4 + i8, i2 + i8, i4);
        }
        if (resultPointC3 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint resultPointC4 = null;
        for (int i9 = 1; resultPointC4 == null && i9 < i6; i9++) {
            resultPointC4 = c(i3, i4 + i9, i3 - i9, i4);
        }
        if (resultPointC4 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        for (int i10 = 1; resultPointC == null && i10 < i6; i10++) {
            resultPointC = c(i3, i5 - i10, i3 - i10, i5);
        }
        if (resultPointC != null) {
            return a(resultPointC, resultPointC2, resultPointC4, resultPointC3);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public WhiteRectangleDetector(BitMatrix bitMatrix, int i2, int i3, int i4) throws NotFoundException {
        this.a = bitMatrix;
        int height = bitMatrix.getHeight();
        this.b = height;
        int width = bitMatrix.getWidth();
        this.c = width;
        int i5 = i2 / 2;
        int i6 = i3 - i5;
        this.d = i6;
        int i7 = i3 + i5;
        this.e = i7;
        int i8 = i4 - i5;
        this.g = i8;
        int i9 = i4 + i5;
        this.f = i9;
        if (i8 < 0 || i6 < 0 || i9 >= height || i7 >= width) {
            throw NotFoundException.getNotFoundInstance();
        }
    }
}
