package defpackage;

import com.google.typography.font.sfntly.Font;
import com.google.typography.font.sfntly.table.core.FontHeaderTable;

/* JADX INFO: loaded from: classes5.dex */
public class rlb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f32670a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f32671b = 2;

    public apr a(Font font) {
        lac lacVar = (lac) font.h(tzo.A);
        nac nacVar = (nac) font.h(tzo.e);
        q9f q9fVar = (q9f) font.h(tzo.f);
        int iT = ((FontHeaderTable) font.h(tzo.c)).t();
        int iO = lacVar.o();
        int iL = q9fVar.l();
        fze fzeVar = new fze();
        for (int i = 0; i < iO; i++) {
            int iQ = lacVar.q(i);
            for (int i2 = 0; i2 < iL; i2++) {
                fzeVar.d(lacVar.t(i, i2) - ((((((iQ * 64) * nacVar.o(i2)) + (iT / 2)) / iT) + 32) / 64));
            }
        }
        fzeVar.a();
        byte[] bArrB = fzeVar.b();
        apr aprVarC = apr.C(bArrB.length + f32670a + (f32671b * iO));
        aprVarC.Q(0, 0);
        aprVarC.Q(2, iO);
        aprVarC.K(4, lacVar.r());
        for (int i3 = 0; i3 < iO; i3++) {
            aprVarC.G(f32670a + (f32671b * i3), (byte) lacVar.q(i3));
            aprVarC.G(f32670a + (f32671b * i3) + 1, (byte) lacVar.m(i3));
        }
        aprVarC.H(f32670a + (f32671b * iO), bArrB);
        return aprVarC;
    }
}
