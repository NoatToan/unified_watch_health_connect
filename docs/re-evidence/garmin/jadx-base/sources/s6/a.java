package s6;

import androidx.browser.trusted.c;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import m6.d;
import t6.e;
import t6.f;
import t6.l;

/* JADX INFO: loaded from: classes.dex */
public class a extends l {
    public f J0;
    public e[] K0;
    public int M0;
    public int N0;
    public int O0;
    public int P0;
    public float Q0;
    public float R0;
    public String S0;
    public String T0;
    public String U0;
    public String V0;
    public int W0;
    public boolean[][] Y0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int[][] f157609a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f157610b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public int[][] f157611c1;
    public boolean L0 = false;
    public int X0 = 0;
    public final HashSet Z0 = new HashSet();

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f157612d1 = 0;

    public a(int i14, int i15) {
        this.N0 = i14;
        this.P0 = i15;
        if (i14 > 50) {
            this.N0 = 3;
        }
        if (i15 > 50) {
            this.P0 = 3;
        }
        n0();
        i0();
    }

    public static void c0(e eVar) {
        eVar.f162633p0[1] = -1.0f;
        eVar.M.j();
        eVar.O.j();
        eVar.P.j();
    }

    public static float[] m0(int i14, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        float[] fArr = new float[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 < strArrSplit.length) {
                try {
                    fArr[i15] = Float.parseFloat(strArrSplit[i15]);
                } catch (Exception e4) {
                    System.err.println("Error parsing `" + strArrSplit[i15] + "`: " + e4.getMessage());
                    fArr[i15] = 1.0f;
                }
            } else {
                fArr[i15] = 1.0f;
            }
        }
        return fArr;
    }

    @Override // t6.l
    public final void a0(int i14, int i15, int i16, int i17) {
        int[][] iArrL0;
        this.J0 = (f) this.X;
        if (this.M0 >= 1 && this.O0 >= 1) {
            this.X0 = 0;
            String str = this.V0;
            if (str != null && !str.trim().isEmpty() && (iArrL0 = l0(this.V0, false)) != null) {
                g0(iArrL0);
            }
            String str2 = this.U0;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.f157611c1 = l0(this.U0, true);
            }
            int iMax = Math.max(this.M0, this.O0);
            e[] eVarArr = this.K0;
            if (eVarArr == null) {
                this.K0 = new e[iMax];
                int i18 = 0;
                while (true) {
                    e[] eVarArr2 = this.K0;
                    if (i18 >= eVarArr2.length) {
                        break;
                    }
                    e eVar = new e();
                    e.b[] bVarArr = eVar.W;
                    e.b bVar = e.b.MATCH_CONSTRAINT;
                    bVarArr[0] = bVar;
                    bVarArr[1] = bVar;
                    eVar.f162624l = String.valueOf(eVar.hashCode());
                    eVarArr2[i18] = eVar;
                    i18++;
                }
            } else if (iMax != eVarArr.length) {
                e[] eVarArr3 = new e[iMax];
                for (int i19 = 0; i19 < iMax; i19++) {
                    e[] eVarArr4 = this.K0;
                    if (i19 < eVarArr4.length) {
                        eVarArr3[i19] = eVarArr4[i19];
                    } else {
                        e eVar2 = new e();
                        e.b[] bVarArr2 = eVar2.W;
                        e.b bVar2 = e.b.MATCH_CONSTRAINT;
                        bVarArr2[0] = bVar2;
                        bVarArr2[1] = bVar2;
                        eVar2.f162624l = String.valueOf(eVar2.hashCode());
                        eVarArr3[i19] = eVar2;
                    }
                }
                while (true) {
                    e[] eVarArr5 = this.K0;
                    if (iMax >= eVarArr5.length) {
                        break;
                    }
                    e eVar3 = eVarArr5[iMax];
                    this.J0.f162695w0.remove(eVar3);
                    eVar3.E();
                    iMax++;
                }
                this.K0 = eVarArr3;
            }
            int[][] iArr = this.f157611c1;
            if (iArr != null) {
                h0(iArr);
            }
        }
        f fVar = this.J0;
        e[] eVarArr6 = this.K0;
        fVar.getClass();
        for (e eVar4 : eVarArr6) {
            fVar.W(eVar4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01b3  */
    @Override // t6.e
    public final void c(d dVar, boolean z14) {
        int i14;
        int i15;
        int[][] iArr;
        int i16;
        super.c(dVar, z14);
        int iMax = Math.max(this.M0, this.O0);
        e eVar = this.K0[0];
        float[] fArrM0 = m0(this.M0, this.S0);
        int i17 = this.M0;
        t6.d dVar2 = this.O;
        t6.d dVar3 = this.M;
        if (i17 == 1) {
            c0(eVar);
            eVar.M.a(dVar3, 0);
            eVar.O.a(dVar2, 0);
        } else {
            int i18 = 0;
            while (true) {
                i14 = this.M0;
                if (i18 >= i14) {
                    break;
                }
                e eVar2 = this.K0[i18];
                c0(eVar2);
                t6.d dVar4 = eVar2.M;
                if (fArrM0 != null) {
                    eVar2.f162633p0[1] = fArrM0[i18];
                }
                if (i18 > 0) {
                    dVar4.a(this.K0[i18 - 1].O, 0);
                } else {
                    dVar4.a(dVar3, 0);
                }
                int i19 = this.M0 - 1;
                t6.d dVar5 = eVar2.O;
                if (i18 < i19) {
                    dVar5.a(this.K0[i18 + 1].M, 0);
                } else {
                    dVar5.a(dVar2, 0);
                }
                if (i18 > 0) {
                    dVar4.f162589g = (int) this.R0;
                }
                i18++;
            }
            while (i14 < iMax) {
                e eVar3 = this.K0[i14];
                c0(eVar3);
                eVar3.M.a(dVar3, 0);
                eVar3.O.a(dVar2, 0);
                i14++;
            }
        }
        int iMax2 = Math.max(this.M0, this.O0);
        e eVar4 = this.K0[0];
        float[] fArrM1 = m0(this.O0, this.T0);
        int i24 = this.O0;
        t6.d dVar6 = this.N;
        t6.d dVar7 = this.L;
        if (i24 == 1) {
            float[] fArr = eVar4.f162633p0;
            t6.d dVar8 = eVar4.N;
            t6.d dVar9 = eVar4.L;
            fArr[0] = -1.0f;
            dVar9.j();
            dVar8.j();
            dVar9.a(dVar7, 0);
            dVar8.a(dVar6, 0);
        } else {
            int i25 = 0;
            while (true) {
                i15 = this.O0;
                if (i25 >= i15) {
                    break;
                }
                e eVar5 = this.K0[i25];
                float[] fArr2 = eVar5.f162633p0;
                t6.d dVar10 = eVar5.N;
                t6.d dVar11 = eVar5.L;
                fArr2[0] = -1.0f;
                dVar11.j();
                dVar10.j();
                if (fArrM1 != null) {
                    eVar5.f162633p0[0] = fArrM1[i25];
                }
                if (i25 > 0) {
                    dVar11.a(this.K0[i25 - 1].N, 0);
                } else {
                    dVar11.a(dVar7, 0);
                }
                if (i25 < this.O0 - 1) {
                    dVar10.a(this.K0[i25 + 1].L, 0);
                } else {
                    dVar10.a(dVar6, 0);
                }
                if (i25 > 0) {
                    dVar11.f162589g = (int) this.Q0;
                }
                i25++;
            }
            while (i15 < iMax2) {
                e eVar6 = this.K0[i15];
                float[] fArr3 = eVar6.f162633p0;
                t6.d dVar12 = eVar6.N;
                t6.d dVar13 = eVar6.L;
                fArr3[0] = -1.0f;
                dVar13.j();
                dVar12.j();
                dVar13.a(dVar7, 0);
                dVar12.a(dVar6, 0);
                i15++;
            }
        }
        for (int i26 = 0; i26 < this.f162691x0; i26++) {
            if (!this.Z0.contains(this.f162690w0[i26].f162624l)) {
                boolean z15 = false;
                int i27 = 0;
                while (!z15) {
                    i27 = this.X0;
                    if (i27 >= this.M0 * this.O0) {
                        i27 = -1;
                        break;
                    }
                    int iF0 = f0(i27);
                    int iE0 = e0(this.X0);
                    boolean[] zArr = this.Y0[iF0];
                    if (zArr[iE0]) {
                        zArr[iE0] = false;
                        z15 = true;
                    }
                    this.X0++;
                }
                int iF1 = f0(i27);
                int iE1 = e0(i27);
                if (i27 == -1) {
                    return;
                }
                if ((this.f157610b1 & 2) <= 0 || (iArr = this.f157611c1) == null || (i16 = this.f157612d1) >= iArr.length) {
                    d0(this.f162690w0[i26], iF1, iE1, 1, 1);
                } else {
                    int[] iArr2 = iArr[i16];
                    if (iArr2[0] == i27) {
                        this.Y0[iF1][iE1] = true;
                        if (k0(iF1, iE1, iArr2[1], iArr2[2])) {
                            e eVar7 = this.f162690w0[i26];
                            int[] iArr3 = this.f157611c1[this.f157612d1];
                            d0(eVar7, iF1, iE1, iArr3[1], iArr3[2]);
                            this.f157612d1++;
                        }
                    } else {
                        d0(this.f162690w0[i26], iF1, iE1, 1, 1);
                    }
                }
            }
        }
    }

    public final void d0(e eVar, int i14, int i15, int i16, int i17) {
        eVar.L.a(this.K0[i15].L, 0);
        eVar.M.a(this.K0[i14].M, 0);
        eVar.N.a(this.K0[(i15 + i17) - 1].N, 0);
        eVar.O.a(this.K0[(i14 + i16) - 1].O, 0);
    }

    public final int e0(int i14) {
        return this.W0 == 1 ? i14 / this.M0 : i14 % this.O0;
    }

    public final int f0(int i14) {
        return this.W0 == 1 ? i14 % this.M0 : i14 / this.O0;
    }

    public final void g0(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!k0(f0(iArr2[0]), e0(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    public final void h0(int[][] iArr) {
        if ((this.f157610b1 & 2) > 0) {
            return;
        }
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int iF0 = f0(iArr[i14][0]);
            int iE0 = e0(iArr[i14][0]);
            int[] iArr2 = iArr[i14];
            if (!k0(iF0, iE0, iArr2[1], iArr2[2])) {
                break;
            }
            e eVar = this.f162690w0[i14];
            int[] iArr3 = iArr[i14];
            d0(eVar, iF0, iE0, iArr3[1], iArr3[2]);
            this.Z0.add(this.f162690w0[i14].f162624l);
        }
    }

    public final void i0() {
        int[][] iArrL0;
        int[][] iArrL1;
        boolean[][] zArr;
        int[][] iArr = this.f157609a1;
        boolean z14 = iArr != null && iArr.length == this.f162691x0 && (zArr = this.Y0) != null && zArr.length == this.M0 && zArr[0].length == this.O0;
        if (!z14) {
            j0();
        }
        if (z14) {
            for (int i14 = 0; i14 < this.Y0.length; i14++) {
                int i15 = 0;
                while (true) {
                    boolean[][] zArr2 = this.Y0;
                    if (i15 < zArr2[0].length) {
                        zArr2[i14][i15] = true;
                        i15++;
                    }
                }
            }
            for (int i16 = 0; i16 < this.f157609a1.length; i16++) {
                int i17 = 0;
                while (true) {
                    int[][] iArr2 = this.f157609a1;
                    if (i17 < iArr2[0].length) {
                        iArr2[i16][i17] = -1;
                        i17++;
                    }
                }
            }
        }
        this.X0 = 0;
        String str = this.V0;
        if (str != null && !str.trim().isEmpty() && (iArrL1 = l0(this.V0, false)) != null) {
            g0(iArrL1);
        }
        String str2 = this.U0;
        if (str2 == null || str2.trim().isEmpty() || (iArrL0 = l0(this.U0, true)) == null) {
            return;
        }
        h0(iArrL0);
    }

    public final void j0() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.M0, this.O0);
        this.Y0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i14 = this.f162691x0;
        if (i14 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i14, 4);
            this.f157609a1 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final boolean k0(int i14, int i15, int i16, int i17) {
        for (int i18 = i14; i18 < i14 + i16; i18++) {
            for (int i19 = i15; i19 < i15 + i17; i19++) {
                boolean[][] zArr = this.Y0;
                if (i18 < zArr.length && i19 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i18];
                    if (zArr2[i19]) {
                        zArr2[i19] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final int[][] l0(String str, boolean z14) {
        int i14;
        int i15;
        try {
            String[] strArrSplit = str.split(",");
            Arrays.sort(strArrSplit, new c(28));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.M0 != 1 && this.O0 != 1) {
                for (int i16 = 0; i16 < strArrSplit.length; i16++) {
                    String[] strArrSplit2 = strArrSplit[i16].trim().split(":");
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i16][0] = Integer.parseInt(strArrSplit2[0]);
                    if ((this.f157610b1 & 1) > 0) {
                        iArr[i16][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i16][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i16][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i16][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < strArrSplit.length; i19++) {
                String[] strArrSplit4 = strArrSplit[i19].trim().split(":");
                iArr[i19][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i19];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.O0 == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i17 += iArr[i19][1];
                    if (z14) {
                        i17--;
                    }
                }
                if (this.M0 == 1) {
                    iArr[i19][2] = Integer.parseInt(strArrSplit4[1]);
                    i18 += iArr[i19][2];
                    if (z14) {
                        i18--;
                    }
                }
            }
            if (i17 != 0 && !this.L0 && (i15 = this.M0 + i17) <= 50 && this.N0 != i15) {
                this.N0 = i15;
                n0();
                j0();
            }
            if (i18 != 0 && !this.L0 && (i14 = this.O0 + i18) <= 50 && this.P0 != i14) {
                this.P0 = i14;
                n0();
                j0();
            }
            this.L0 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void n0() {
        int i14;
        int i15 = this.N0;
        if (i15 != 0 && (i14 = this.P0) != 0) {
            this.M0 = i15;
            this.O0 = i14;
            return;
        }
        int i16 = this.P0;
        if (i16 > 0) {
            this.O0 = i16;
            this.M0 = ((this.f162691x0 + i16) - 1) / i16;
        } else if (i15 > 0) {
            this.M0 = i15;
            this.O0 = ((this.f162691x0 + i15) - 1) / i15;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f162691x0) + 1.5d);
            this.M0 = iSqrt;
            this.O0 = ((this.f162691x0 + iSqrt) - 1) / iSqrt;
        }
    }

    public a() {
        n0();
        i0();
    }
}
