package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class hs3 {
    public static void a(long j, okh okhVar, snp[] snpVarArr) {
        while (true) {
            if (okhVar.a() <= 1) {
                return;
            }
            int iC = c(okhVar);
            int iC2 = c(okhVar);
            int iE = okhVar.e() + iC2;
            if (iC2 == -1 || iC2 > okhVar.a()) {
                toe.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iE = okhVar.f();
            } else if (iC == 4 && iC2 >= 8) {
                int iD = okhVar.D();
                int iJ = okhVar.J();
                int iN = iJ == 49 ? okhVar.n() : 0;
                int iD2 = okhVar.D();
                if (iJ == 47) {
                    okhVar.Q(1);
                }
                boolean z = iD == 181 && (iJ == 49 || iJ == 47) && iD2 == 3;
                if (iJ == 49) {
                    z &= iN == 1195456820;
                }
                if (z) {
                    b(j, okhVar, snpVarArr);
                }
            }
            okhVar.P(iE);
        }
    }

    public static void b(long j, okh okhVar, snp[] snpVarArr) {
        int iD = okhVar.D();
        if ((iD & 64) != 0) {
            okhVar.Q(1);
            int i = (iD & 31) * 3;
            int iE = okhVar.e();
            for (snp snpVar : snpVarArr) {
                okhVar.P(iE);
                snpVar.d(okhVar, i);
                snpVar.e(j, 1, i, 0, null);
            }
        }
    }

    public static int c(okh okhVar) {
        int i = 0;
        while (okhVar.a() != 0) {
            int iD = okhVar.D();
            i += iD;
            if (iD != 255) {
                return i;
            }
        }
        return -1;
    }
}
