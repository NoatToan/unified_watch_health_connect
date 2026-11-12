package com.sogou.map.loc;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
final class c2 {
    private static final byte[] c = new byte[0];
    private b2 a;
    private long b = -1;

    public c2(b2 b2Var) {
        this.a = b2Var;
    }

    private static void b(ByteArrayOutputStream byteArrayOutputStream) {
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
    }

    private static void c(ByteArrayOutputStream byteArrayOutputStream, int i) {
        byteArrayOutputStream.write(i >> 24);
        byteArrayOutputStream.write(i >> 16);
        byteArrayOutputStream.write(i >> 8);
        byteArrayOutputStream.write(i);
    }

    private void d(ByteArrayOutputStream byteArrayOutputStream, b1 b1Var) {
        int iMin = (int) Math.min(this.b - b1Var.d, 4294967295L);
        c(byteArrayOutputStream, b1Var.a);
        c(byteArrayOutputStream, b1Var.b);
        c(byteArrayOutputStream, b1Var.c);
        c(byteArrayOutputStream, iMin);
    }

    private static void e(ByteArrayOutputStream byteArrayOutputStream, e1 e1Var) {
        byte[] bArrB = e1Var.b();
        if (bArrB == null) {
            bArrB = c;
        }
        int iMin = Math.min(bArrB.length, 64);
        byteArrayOutputStream.write(iMin);
        byteArrayOutputStream.write(bArrB, 0, iMin);
        byteArrayOutputStream.write((byte) (e1Var.a >> 40));
        byteArrayOutputStream.write((byte) (e1Var.a >> 32));
        byteArrayOutputStream.write((byte) (e1Var.a >> 24));
        byteArrayOutputStream.write((byte) (e1Var.a >> 16));
        byteArrayOutputStream.write((byte) (e1Var.a >> 8));
        byteArrayOutputStream.write((byte) e1Var.a);
        c(byteArrayOutputStream, e1Var.c);
    }

    private static boolean f(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, int i) {
        if (bArr == null || bArr.length < 0) {
            return false;
        }
        byteArrayOutputStream.write(i);
        int iMin = Math.min(bArr.length, 64);
        byteArrayOutputStream.write(iMin);
        byteArrayOutputStream.write(bArr, 0, iMin);
        return true;
    }

    private static byte[] g(byte[] bArr, byte[] bArr2) {
        try {
            return EncodeUtil.encode(bArr, bArr2);
        } catch (Throwable unused) {
            return null;
        }
    }

    private void h(ByteArrayOutputStream byteArrayOutputStream) {
        List listA = this.a.a(false);
        if (listA == null || listA.size() == 0) {
            return;
        }
        int iMin = Math.min(listA.size(), 127);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(iMin);
        for (int i = 0; i < iMin; i++) {
            z0 z0Var = (z0) listA.get(i);
            c(byteArrayOutputStream, z0Var.a);
            c(byteArrayOutputStream, z0Var.b);
            c(byteArrayOutputStream, (int) Math.min(this.b - z0Var.c, ParserMinimalBase.MAX_INT_L));
        }
    }

    private static void i(ByteArrayOutputStream byteArrayOutputStream, int i) {
        byteArrayOutputStream.write(i >> 8);
        byteArrayOutputStream.write(i);
    }

    private void j(ByteArrayOutputStream byteArrayOutputStream) {
        List listI = this.a.i(false);
        if (listI == null || listI.size() == 0) {
            return;
        }
        int iMin = Math.min(listI.size(), 127);
        byteArrayOutputStream.write(4);
        byteArrayOutputStream.write(iMin);
        for (int i = 0; i < iMin; i++) {
            w0 w0Var = (w0) listI.get(i);
            c(byteArrayOutputStream, w0Var.a);
            c(byteArrayOutputStream, w0Var.b);
            c(byteArrayOutputStream, w0Var.c);
            c(byteArrayOutputStream, w0Var.d);
            c(byteArrayOutputStream, w0Var.e);
            c(byteArrayOutputStream, (int) Math.min(this.b - w0Var.f, ParserMinimalBase.MAX_INT_L));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    private void k(ByteArrayOutputStream byteArrayOutputStream) {
        boolean z;
        e1 e1VarH = this.a.h();
        List listK = this.a.k();
        if (e1VarH != null) {
            long j = e1VarH.a;
            z = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1)) != 0 && (j > 0L ? 1 : (j == 0L ? 0 : -1)) != 0 && e1VarH.c != -200;
        }
        int iMin = listK == null ? 0 : Math.min(listK.size(), 127);
        if (iMin != 0 || z) {
            byteArrayOutputStream.write(5);
            byteArrayOutputStream.write((z ? 128 : 0) | (iMin & 127));
            if (z) {
                e(byteArrayOutputStream, e1VarH);
            }
            for (int i = 0; i < iMin; i++) {
                e(byteArrayOutputStream, (e1) listK.get(i));
            }
        }
    }

    private void l(ByteArrayOutputStream byteArrayOutputStream) {
        v0 v0VarL = this.a.l();
        if (v0VarL == null || v0VarL.c()) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        int i = 0;
        for (List<int[]> list : v0VarL.d()) {
            if (list != null && !list.isEmpty()) {
                int[] iArr = (int[]) list.get(0);
                int i2 = iArr[0];
                if (i2 == 1) {
                    byteArrayOutputStream2.write(1);
                    i(byteArrayOutputStream2, iArr[3]);
                    i(byteArrayOutputStream2, iArr[4]);
                    byteArrayOutputStream2.write(list.size());
                    for (int[] iArr2 : list) {
                        c(byteArrayOutputStream2, iArr2[5]);
                        c(byteArrayOutputStream2, iArr2[6]);
                        byteArrayOutputStream2.write(iArr2[1]);
                        byteArrayOutputStream2.write(iArr2[2]);
                    }
                } else if (i2 == 2) {
                    byteArrayOutputStream2.write(2);
                    i(byteArrayOutputStream2, iArr[3]);
                    i(byteArrayOutputStream2, iArr[4]);
                    byteArrayOutputStream2.write(list.size());
                    for (int[] iArr3 : list) {
                        c(byteArrayOutputStream2, iArr3[5]);
                        byteArrayOutputStream2.write(iArr3[1]);
                        byteArrayOutputStream2.write(iArr3[2]);
                    }
                } else if (i2 == 3) {
                    byteArrayOutputStream2.write(3);
                    byteArrayOutputStream2.write(list.size());
                    for (int[] iArr4 : list) {
                        c(byteArrayOutputStream2, iArr4[3]);
                        c(byteArrayOutputStream2, iArr4[4]);
                        c(byteArrayOutputStream2, iArr4[5]);
                        byteArrayOutputStream2.write(iArr4[1]);
                        byteArrayOutputStream2.write(iArr4[2]);
                    }
                } else if (i2 == 4) {
                    byteArrayOutputStream2.write(4);
                    i(byteArrayOutputStream2, iArr[3]);
                    i(byteArrayOutputStream2, iArr[4]);
                    byteArrayOutputStream2.write(list.size());
                    for (int[] iArr5 : list) {
                        c(byteArrayOutputStream2, iArr5[5]);
                        c(byteArrayOutputStream2, iArr5[6]);
                        byteArrayOutputStream2.write(iArr5[1]);
                        byteArrayOutputStream2.write(iArr5[2]);
                    }
                } else if (i2 == 5) {
                    byteArrayOutputStream2.write(5);
                    i(byteArrayOutputStream2, iArr[3]);
                    i(byteArrayOutputStream2, iArr[4]);
                    byteArrayOutputStream2.write(list.size());
                    for (int[] iArr6 : list) {
                        c(byteArrayOutputStream2, iArr6[5]);
                        byteArrayOutputStream2.write(iArr6[1]);
                        byteArrayOutputStream2.write(iArr6[2]);
                    }
                }
                i++;
            }
        }
        if (i == 0) {
            return;
        }
        byteArrayOutputStream.write(10);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray(), 0, byteArrayOutputStream2.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    public final String a() {
        int i;
        long jB = this.b;
        if (jB == -1) {
            jB = j0.b();
        }
        this.b = jB;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(83);
            byteArrayOutputStream.write(71);
            int i2 = 2;
            byteArrayOutputStream.write(2);
            byteArrayOutputStream.write(0);
            c(byteArrayOutputStream, (int) this.b);
            i(byteArrayOutputStream2, 0);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            ?? F = f(byteArrayOutputStream3, this.a.a, 3);
            int i3 = F;
            if (f(byteArrayOutputStream3, null, 4)) {
                i3 = F + 1;
            }
            int i4 = i3;
            if (f(byteArrayOutputStream3, null, 5)) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (f(byteArrayOutputStream3, this.a.b, 6)) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (f(byteArrayOutputStream3, this.a.c, 7)) {
                i6 = i5 + 1;
            }
            int i7 = i6;
            if (f(byteArrayOutputStream3, this.a.d, 9)) {
                i7 = i6 + 1;
            }
            if (i7 != 0) {
                byteArrayOutputStream2.write(1);
                byteArrayOutputStream2.write(i7);
                byteArrayOutputStream2.write(byteArrayOutputStream3.toByteArray(), 0, byteArrayOutputStream3.size());
            }
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            byteArrayOutputStream4.write(3);
            byteArrayOutputStream4.write(this.a.f & 255);
            byteArrayOutputStream4.write(4);
            byteArrayOutputStream4.write(this.a.h == 1 ? 1 : 0);
            int i8 = f(byteArrayOutputStream4, this.a.g(), 6) ? 3 : 2;
            if (f(byteArrayOutputStream4, this.a.g, 9)) {
                i8++;
            }
            byteArrayOutputStream2.write(2);
            byteArrayOutputStream2.write(i8);
            byteArrayOutputStream2.write(byteArrayOutputStream4.toByteArray(), 0, byteArrayOutputStream4.size());
            h(byteArrayOutputStream2);
            j(byteArrayOutputStream2);
            k(byteArrayOutputStream2);
            l(byteArrayOutputStream2);
            b2 b2Var = this.a;
            int i9 = b2Var.n != null ? 1 : 0;
            boolean z = b2Var.o != null;
            if (i9 != 0 || z) {
                int i10 = (z ? 1 : 0) + i9;
                byteArrayOutputStream2.write(7);
                if (i9 != 0) {
                    byteArrayOutputStream2.write((1 < i10 ? 128 : 0) | 1);
                    d(byteArrayOutputStream2, this.a.n);
                }
                if (z) {
                    byteArrayOutputStream2.write(2);
                    d(byteArrayOutputStream2, this.a.o);
                }
            }
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            ?? F2 = f(byteArrayOutputStream5, this.a.p, 3);
            int i11 = F2;
            if (f(byteArrayOutputStream5, null, 4)) {
                i11 = F2 + 1;
            }
            int i12 = i11;
            if (f(byteArrayOutputStream5, this.a.q, 5)) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (f(byteArrayOutputStream5, this.a.r, 6)) {
                i = i12 + 1;
            }
            if (i13 != 0) {
                i13 = i;
                byteArrayOutputStream2.write(8);
                byteArrayOutputStream2.write(i13);
                byteArrayOutputStream2.write(byteArrayOutputStream5.toByteArray(), 0, byteArrayOutputStream5.size());
            }
            i13 = i;
            ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
            byteArrayOutputStream6.write(3);
            byteArrayOutputStream6.write(1);
            if (this.a.t != 0) {
                byteArrayOutputStream6.write(4);
                byteArrayOutputStream6.write(this.a.t);
            } else {
                i2 = 1;
            }
            byteArrayOutputStream2.write(9);
            byteArrayOutputStream2.write(i2);
            byteArrayOutputStream2.write(byteArrayOutputStream6.toByteArray(), 0, byteArrayOutputStream6.size());
            int size = byteArrayOutputStream2.size() % 16;
            if (size != 0) {
                for (int i14 = 0; i14 < 16 - size; i14++) {
                    byteArrayOutputStream2.write(0);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byte[] bArrG = g(byteArray, byteArrayOutputStream2.toByteArray());
            if (bArrG != null) {
                int length = byteArray.length + bArrG.length;
                byte[] bArr = new byte[length];
                System.arraycopy(byteArray, 0, bArr, 0, byteArray.length);
                System.arraycopy(bArrG, 0, bArr, byteArray.length, bArrG.length);
                return v1.d(bArr, 0, length);
            }
        } catch (Exception unused) {
        } finally {
            b(byteArrayOutputStream);
            b(byteArrayOutputStream2);
        }
        return null;
    }
}
