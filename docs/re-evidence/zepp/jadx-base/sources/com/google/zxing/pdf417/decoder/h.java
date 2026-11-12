package com.google.zxing.pdf417.decoder;

import com.google.zxing.ResultPoint;

/* JADX INFO: loaded from: classes4.dex */
final class h extends g {
    private final boolean d;

    public h(c cVar, boolean z) {
        super(cVar);
        this.d = z;
    }

    private void h(a aVar) {
        c cVarA = a();
        ResultPoint resultPointH = this.d ? cVarA.h() : cVarA.i();
        ResultPoint resultPointB = this.d ? cVarA.b() : cVarA.c();
        int iE = e((int) resultPointB.getY());
        d[] dVarArrD = d();
        int iC = -1;
        int i = 0;
        int iMax = 1;
        for (int iE2 = e((int) resultPointH.getY()); iE2 < iE; iE2++) {
            if (dVarArrD[iE2] != null) {
                d dVar = dVarArrD[iE2];
                dVar.j();
                int iC2 = dVar.c() - iC;
                if (iC2 == 0) {
                    i++;
                } else {
                    if (iC2 == 1) {
                        iMax = Math.max(iMax, i);
                        iC = dVar.c();
                    } else if (dVar.c() >= aVar.c()) {
                        dVarArrD[iE2] = null;
                    } else {
                        iC = dVar.c();
                    }
                    i = 1;
                }
            }
        }
    }

    private void l(d[] dVarArr, a aVar) {
        for (int i = 0; i < dVarArr.length; i++) {
            d dVar = dVarArr[i];
            if (dVarArr[i] != null) {
                int iE = dVar.e() % 30;
                int iC = dVar.c();
                if (iC > aVar.c()) {
                    dVarArr[i] = null;
                } else {
                    if (!this.d) {
                        iC += 2;
                    }
                    int i2 = iC % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && iE + 1 != aVar.a()) {
                                dVarArr[i] = null;
                            }
                        } else if (iE / 3 != aVar.b() || iE % 3 != aVar.d()) {
                            dVarArr[i] = null;
                        }
                    } else if ((iE * 3) + 1 != aVar.e()) {
                        dVarArr[i] = null;
                    }
                }
            }
        }
    }

    private void m() {
        for (d dVar : d()) {
            if (dVar != null) {
                dVar.j();
            }
        }
    }

    public void g(a aVar) {
        d[] dVarArrD = d();
        m();
        l(dVarArrD, aVar);
        c cVarA = a();
        ResultPoint resultPointH = this.d ? cVarA.h() : cVarA.i();
        ResultPoint resultPointB = this.d ? cVarA.b() : cVarA.c();
        int iE = e((int) resultPointH.getY());
        int iE2 = e((int) resultPointB.getY());
        int iC = -1;
        int i = 0;
        int iMax = 1;
        while (iE < iE2) {
            if (dVarArrD[iE] != null) {
                d dVar = dVarArrD[iE];
                int iC2 = dVar.c() - iC;
                if (iC2 == 0) {
                    i++;
                } else {
                    if (iC2 == 1) {
                        iMax = Math.max(iMax, i);
                        iC = dVar.c();
                    } else if (iC2 < 0 || dVar.c() >= aVar.c() || iC2 > iE) {
                        dVarArrD[iE] = null;
                    } else {
                        if (iMax > 2) {
                            iC2 *= iMax - 2;
                        }
                        boolean z = iC2 >= iE;
                        for (int i2 = 1; i2 <= iC2 && !z; i2++) {
                            z = dVarArrD[iE - i2] != null;
                        }
                        if (z) {
                            dVarArrD[iE] = null;
                        } else {
                            iC = dVar.c();
                        }
                    }
                    i = 1;
                }
            }
            iE++;
        }
    }

    public a i() {
        d[] dVarArrD = d();
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        for (d dVar : dVarArrD) {
            if (dVar != null) {
                dVar.j();
                int iE = dVar.e() % 30;
                int iC = dVar.c();
                if (!this.d) {
                    iC += 2;
                }
                int i = iC % 3;
                if (i == 0) {
                    bVar2.c((iE * 3) + 1);
                } else if (i == 1) {
                    bVar4.c(iE / 3);
                    bVar3.c(iE % 3);
                } else if (i == 2) {
                    bVar.c(iE + 1);
                }
            }
        }
        if (bVar.b().length == 0 || bVar2.b().length == 0 || bVar3.b().length == 0 || bVar4.b().length == 0 || bVar.b()[0] <= 0 || bVar2.b()[0] + bVar3.b()[0] < 3 || bVar2.b()[0] + bVar3.b()[0] > 90) {
            return null;
        }
        a aVar = new a(bVar.b()[0], bVar2.b()[0], bVar3.b()[0], bVar4.b()[0]);
        l(dVarArrD, aVar);
        return aVar;
    }

    public int[] j() {
        int iC;
        a aVarI = i();
        if (aVarI == null) {
            return null;
        }
        h(aVarI);
        int iC2 = aVarI.c();
        int[] iArr = new int[iC2];
        for (d dVar : d()) {
            if (dVar != null && (iC = dVar.c()) < iC2) {
                iArr[iC] = iArr[iC] + 1;
            }
        }
        return iArr;
    }

    public boolean k() {
        return this.d;
    }

    @Override // com.google.zxing.pdf417.decoder.g
    public String toString() {
        return "IsLeft: " + this.d + '\n' + super.toString();
    }
}
