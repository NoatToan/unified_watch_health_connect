package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class MonochromeRectangleDetector {
    private static final int b = 32;
    private final BitMatrix a;

    public MonochromeRectangleDetector(BitMatrix bitMatrix) {
        this.a = bitMatrix;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0020  */
    /* JADX WARN: Code duplicated, block: B:40:0x0056  */
    /* JADX WARN: Code duplicated, block: B:68:0x002b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0031 A[EDGE_INSN: B:69:0x0031->B:22:0x0031 BREAK  A[LOOP:1: B:13:0x001c->B:73:0x001c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0031 A[EDGE_INSN: B:70:0x0031->B:22:0x0031 BREAK  A[LOOP:1: B:13:0x001c->B:73:0x001c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0024 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0031 A[EDGE_INSN: B:72:0x0031->B:22:0x0031 BREAK  A[LOOP:1: B:13:0x001c->B:73:0x001c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x001c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x001c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0067 A[EDGE_INSN: B:86:0x0067->B:47:0x0067 BREAK  A[LOOP:3: B:38:0x0053->B:91:0x0053], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0067 A[EDGE_INSN: B:88:0x0067->B:47:0x0067 BREAK  A[LOOP:3: B:38:0x0053->B:91:0x0053], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0067 A[EDGE_INSN: B:90:0x0067->B:47:0x0067 BREAK  A[LOOP:3: B:38:0x0053->B:91:0x0053], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0053 A[SYNTHETIC] */
    private int[] a(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        BitMatrix bitMatrix;
        int i6;
        BitMatrix bitMatrix2;
        int i7 = (i3 + i4) / 2;
        int i8 = i7;
        while (i8 >= i3) {
            BitMatrix bitMatrix3 = this.a;
            if (!z) {
                if (!bitMatrix3.get(i, i8)) {
                    i6 = i8;
                    while (true) {
                        i6--;
                        if (i6 >= i3) {
                            break;
                            break;
                        }
                        bitMatrix2 = this.a;
                        if (z) {
                            if (bitMatrix2.get(i6, i)) {
                                break;
                                break;
                            }
                        } else if (bitMatrix2.get(i, i6)) {
                            break;
                            break;
                        }
                    }
                    int i9 = i8 - i6;
                    if (i6 < i3) {
                        break;
                    }
                    break;
                    break;
                }
                i8--;
            } else if (bitMatrix3.get(i8, i)) {
                i8--;
            } else {
                i6 = i8;
                while (true) {
                    i6--;
                    if (i6 >= i3) {
                        break;
                    }
                    bitMatrix2 = this.a;
                    if (z) {
                        if (bitMatrix2.get(i6, i)) {
                            break;
                        }
                    } else if (bitMatrix2.get(i, i6)) {
                        break;
                    }
                }
                int i10 = i8 - i6;
                if (i6 < i3 || i10 > i2) {
                    break;
                }
                i8 = i6;
            }
        }
        int i11 = i8 + 1;
        while (i7 < i4) {
            BitMatrix bitMatrix4 = this.a;
            if (!z) {
                if (!bitMatrix4.get(i, i7)) {
                    i5 = i7;
                    while (true) {
                        i5++;
                        if (i5 < i4) {
                            break;
                            break;
                        }
                        bitMatrix = this.a;
                        if (z) {
                            if (bitMatrix.get(i5, i)) {
                                break;
                                break;
                            }
                        } else if (bitMatrix.get(i, i5)) {
                            break;
                            break;
                        }
                    }
                    int i12 = i5 - i7;
                    if (i5 >= i4) {
                        break;
                    }
                    break;
                    break;
                }
                i7++;
            } else if (bitMatrix4.get(i7, i)) {
                i7++;
            } else {
                i5 = i7;
                while (true) {
                    i5++;
                    if (i5 < i4) {
                        break;
                    }
                    bitMatrix = this.a;
                    if (z) {
                        if (bitMatrix.get(i5, i)) {
                            break;
                        }
                    } else if (bitMatrix.get(i, i5)) {
                        break;
                    }
                }
                int i13 = i5 - i7;
                if (i5 >= i4 || i13 > i2) {
                    break;
                }
                i7 = i5;
            }
        }
        int i14 = i7 - 1;
        if (i14 > i11) {
            return new int[]{i11, i14};
        }
        return null;
    }

    private ResultPoint b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) throws NotFoundException {
        int[] iArr = null;
        int i10 = i;
        int i11 = i5;
        while (i11 < i8 && i11 >= i7 && i10 < i4 && i10 >= i3) {
            int[] iArrA = i2 == 0 ? a(i11, i9, i3, i4, true) : a(i10, i9, i7, i8, false);
            if (iArrA == null) {
                if (iArr == null) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (i2 == 0) {
                    int i12 = i11 - i6;
                    if (iArr[0] >= i) {
                        return new ResultPoint(iArr[1], i12);
                    }
                    if (iArr[1] > i) {
                        return new ResultPoint(iArr[i6 > 0 ? (char) 0 : (char) 1], i12);
                    }
                    return new ResultPoint(iArr[0], i12);
                }
                int i13 = i10 - i2;
                if (iArr[0] >= i5) {
                    return new ResultPoint(i13, iArr[1]);
                }
                if (iArr[1] > i5) {
                    return new ResultPoint(i13, iArr[i2 < 0 ? (char) 0 : (char) 1]);
                }
                return new ResultPoint(i13, iArr[0]);
            }
            i11 += i6;
            i10 += i2;
            iArr = iArrA;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public ResultPoint[] detect() throws NotFoundException {
        int height = this.a.getHeight();
        int width = this.a.getWidth();
        int i = height / 2;
        int i2 = width / 2;
        int iMax = Math.max(1, height / 256);
        int iMax2 = Math.max(1, width / 256);
        int i3 = -iMax;
        int i4 = i2 / 2;
        int y = ((int) b(i2, 0, 0, width, i, i3, 0, height, i4).getY()) - 1;
        int i5 = i / 2;
        ResultPoint resultPointB = b(i2, -iMax2, 0, width, i, 0, y, height, i5);
        int x = ((int) resultPointB.getX()) - 1;
        ResultPoint resultPointB2 = b(i2, iMax2, x, width, i, 0, y, height, i5);
        int x2 = ((int) resultPointB2.getX()) + 1;
        ResultPoint resultPointB3 = b(i2, 0, x, x2, i, iMax, y, height, i4);
        return new ResultPoint[]{b(i2, 0, x, x2, i, i3, y, ((int) resultPointB3.getY()) + 1, i2 / 4), resultPointB, resultPointB2, resultPointB3};
    }
}
