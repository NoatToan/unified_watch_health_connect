package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
public final class dw {
    private short[] b;
    private double[] c;
    private int d;
    private final en a = new en();
    private final ec e = new ec();
    private final en f = new en();

    private int b(int i) {
        if (i == 0) {
            i = this.d;
        }
        return i - 1;
    }

    private int c(int i) {
        return (i + 1) % this.d;
    }

    public final en a(double[] dArr) {
        int length = dArr.length;
        this.c = dArr;
        int i = length / 2;
        this.d = i;
        en enVar = this.a;
        boolean z = false;
        enVar.b = 0;
        enVar.b(i);
        enVar.b = i;
        short[] sArr = enVar.a;
        this.b = sArr;
        int i2 = i - 1;
        for (int i3 = 0; i3 < i; i3++) {
            sArr[i3] = (short) ((i2 + 0) - i3);
        }
        ec ecVar = this.e;
        ecVar.b = 0;
        ecVar.b(i);
        for (int i4 = 0; i4 < i; i4++) {
            ecVar.a(a(i4));
        }
        en enVar2 = this.f;
        enVar2.b = 0;
        enVar2.b(Math.max(0, i - 2) * 3);
        int[] iArr = this.e.a;
        while (true) {
            int i5 = this.d;
            if (i5 <= 3) {
                if (i5 == 3) {
                    en enVar3 = this.f;
                    short[] sArr2 = this.b;
                    enVar3.a(sArr2[0]);
                    enVar3.a(sArr2[1]);
                    enVar3.a(sArr2[2]);
                }
                return enVar2;
            }
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    int[] iArr2 = this.e.a;
                    i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            i6 = 0;
                            break;
                        }
                        if (iArr2[i6] != -1) {
                            break;
                        }
                        i6++;
                    }
                } else {
                    int[] iArr3 = this.e.a;
                    if (iArr3[i6] != -1) {
                        int iB = b(i6);
                        int iC = c(i6);
                        short[] sArr3 = this.b;
                        int i7 = sArr3[iB] * 2;
                        int i8 = sArr3[i6] * 2;
                        int i9 = sArr3[iC] * 2;
                        double[] dArr2 = this.c;
                        double d = dArr2[i7];
                        double d2 = dArr2[i7 + 1];
                        double d3 = dArr2[i8];
                        double d4 = dArr2[i8 + 1];
                        double d5 = dArr2[i9];
                        double d6 = dArr2[i9 + 1];
                        while (true) {
                            iC = c(iC);
                            if (iC == iB) {
                                z = true;
                                break;
                            }
                            if (iArr3[iC] != 1) {
                                int i10 = sArr3[iC] * 2;
                                double d7 = dArr2[i10];
                                double d8 = dArr2[i10 + 1];
                                if (a(d5, d6, d, d2, d7, d8) >= 0 && a(d, d2, d3, d4, d7, d8) >= 0 && a(d3, d4, d5, d6, d7, d8) >= 0) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                    }
                    if (z) {
                        break;
                    }
                    i6++;
                    z = false;
                }
            }
            short[] sArr4 = this.b;
            en enVar4 = this.f;
            enVar4.a(sArr4[b(i6)]);
            enVar4.a(sArr4[i6]);
            enVar4.a(sArr4[c(i6)]);
            en enVar5 = this.a;
            int i11 = enVar5.b;
            if (i6 >= i11) {
                throw new IndexOutOfBoundsException("index can't be >= size: " + i6 + " >= " + enVar5.b);
            }
            short[] sArr5 = enVar5.a;
            int i12 = i11 - 1;
            enVar5.b = i12;
            if (enVar5.c) {
                System.arraycopy(sArr5, i6 + 1, sArr5, i6, i12 - i6);
            } else {
                sArr5[i6] = sArr5[i12];
            }
            ec ecVar2 = this.e;
            int i13 = ecVar2.b;
            if (i6 >= i13) {
                throw new IndexOutOfBoundsException("index can't be >= size: " + i6 + " >= " + ecVar2.b);
            }
            int[] iArr4 = ecVar2.a;
            int i14 = i13 - 1;
            ecVar2.b = i14;
            if (ecVar2.c) {
                System.arraycopy(iArr4, i6 + 1, iArr4, i6, i14 - i6);
            } else {
                iArr4[i6] = iArr4[i14];
            }
            this.d--;
            int iB2 = b(i6);
            if (i6 == this.d) {
                i6 = 0;
            }
            iArr[iB2] = a(iB2);
            iArr[i6] = a(i6);
            z = false;
        }
    }

    private int a(int i) {
        short[] sArr = this.b;
        int i2 = sArr[b(i)] * 2;
        int i3 = sArr[i] * 2;
        int i4 = sArr[c(i)] * 2;
        double[] dArr = this.c;
        return a(dArr[i2], dArr[i2 + 1], dArr[i3], dArr[i3 + 1], dArr[i4], dArr[i4 + 1]);
    }

    private static int a(double d, double d2, double d3, double d4, double d5, double d6) {
        return (int) Math.signum((d * (d6 - d4)) + (d3 * (d2 - d6)) + (d5 * (d4 - d2)));
    }
}
