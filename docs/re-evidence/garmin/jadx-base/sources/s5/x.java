package s5;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f157318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f157319b = 0;

    static {
        g6.q.f76018b.getClass();
        f157318a = g6.q.f76020d;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00eb  */
    public static final w a(w wVar, int i14, int i15, long j8, d6.n nVar, a0 a0Var, d6.f fVar, int i16, int i17, d6.o oVar) {
        long j14;
        d6.n nVar2;
        int i18;
        a0 a0Var2;
        a0 a0Var3;
        d6.f fVar2;
        int i19;
        int i24;
        d6.o oVar2;
        int i25 = i14;
        long j15 = j8;
        d6.h.a aVar = d6.h.f57752b;
        aVar.getClass();
        if (i25 != 0) {
            j14 = 0;
            if (i25 == wVar.f157306a) {
            }
            g6.q.a aVar2 = g6.q.f76018b;
            if ((j15 & 1095216660480L) == j14) {
                j15 = wVar.f157308c;
            }
            long j16 = j15;
            if (nVar == null) {
                nVar2 = wVar.f157309d;
            } else {
                nVar2 = nVar;
            }
            aVar.getClass();
            if (i25 == 0) {
                i25 = wVar.f157306a;
            }
            int i26 = i25;
            d6.j.f57765b.getClass();
            if (i15 == 0) {
                i18 = wVar.f157307b;
            } else {
                i18 = i15;
            }
            a0Var2 = wVar.f157310e;
            if (a0Var2 == null && a0Var == null) {
                a0Var3 = a0Var2;
            } else {
                a0Var3 = a0Var;
            }
            if (fVar == null) {
                fVar2 = wVar.f157311f;
            } else {
                fVar2 = fVar;
            }
            d6.e.f57712b.getClass();
            if (i16 == 0) {
                i19 = wVar.f157312g;
            } else {
                i19 = i16;
            }
            d6.d.f57708b.getClass();
            if (i17 == 0) {
                i24 = wVar.f157313h;
            } else {
                i24 = i17;
            }
            if (oVar == null) {
                oVar2 = wVar.f157314i;
            } else {
                oVar2 = oVar;
            }
            return new w(i26, i18, j16, nVar2, a0Var3, fVar2, i19, i24, oVar2, (p005kotlin.jvm.internal.j) null);
        }
        j14 = 0;
        g6.q.a aVar3 = g6.q.f76018b;
        if ((((j15 & 1095216660480L) == j14) || g6.q.b(j15, wVar.f157308c)) && (nVar == null || nVar.equals(wVar.f157309d))) {
            d6.j.f57765b.getClass();
            if ((i15 == 0 || i15 == wVar.f157307b) && ((a0Var == null || a0Var.equals(wVar.f157310e)) && (fVar == null || fVar.equals(wVar.f157311f)))) {
                d6.e.f57712b.getClass();
                if (i16 == 0 || i16 == wVar.f157312g) {
                    d6.d.f57708b.getClass();
                    if ((i17 == 0 || i17 == wVar.f157313h) && (oVar == null || oVar.equals(wVar.f157314i))) {
                        return wVar;
                    }
                }
            }
        }
        g6.q.a aVar4 = g6.q.f76018b;
        if ((j15 & 1095216660480L) == j14) {
            j15 = wVar.f157308c;
        }
        long j17 = j15;
        if (nVar == null) {
            nVar2 = wVar.f157309d;
        } else {
            nVar2 = nVar;
        }
        aVar.getClass();
        if (i25 == 0) {
            i25 = wVar.f157306a;
        }
        int i27 = i25;
        d6.j.f57765b.getClass();
        if (i15 == 0) {
            i18 = wVar.f157307b;
        } else {
            i18 = i15;
        }
        a0Var2 = wVar.f157310e;
        if (a0Var2 == null) {
            a0Var3 = a0Var;
        } else {
            a0Var3 = a0Var2;
        }
        if (fVar == null) {
            fVar2 = wVar.f157311f;
        } else {
            fVar2 = fVar;
        }
        d6.e.f57712b.getClass();
        if (i16 == 0) {
            i19 = wVar.f157312g;
        } else {
            i19 = i16;
        }
        d6.d.f57708b.getClass();
        if (i17 == 0) {
            i24 = wVar.f157313h;
        } else {
            i24 = i17;
        }
        if (oVar == null) {
            oVar2 = wVar.f157314i;
        } else {
            oVar2 = oVar;
        }
        return new w(i27, i18, j17, nVar2, a0Var3, fVar2, i19, i24, oVar2, (p005kotlin.jvm.internal.j) null);
    }
}
