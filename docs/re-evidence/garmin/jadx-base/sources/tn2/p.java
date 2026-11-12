package tn2;

import com.google.common.base.Ascii;
import java.util.Arrays;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ul2.c f165614b;

    public /* synthetic */ p(w wVar, ul2.c cVar, int i14) {
        this.f165613a = i14;
        this.f165614b = cVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f165613a;
        ul2.c cVar = this.f165614b;
        switch (i14) {
            case 0:
                Boolean bool = (Boolean) obj;
                Logger logger = w.f165679d;
                bool.getClass();
                if (bool.booleanValue()) {
                    return z03.f.f200765a;
                }
                cVar.getClass();
                z03.j jVarN = as2.h.n(cVar, pn2.a.EnumC2623a.CRS.a());
                pn2.a.EnumC2623a enumC2623a = pn2.a.EnumC2623a.INSTANCE1;
                int length = enumC2623a.a().length;
                f.f165551a.getClass();
                byte[] bArrA = hb2.d.a("4F");
                bArrA.getClass();
                int length2 = bArrA.length + 1 + length;
                byte[] bArrA2 = hb2.d.a("80F00100");
                bArrA2.getClass();
                int length3 = bArrA2.length;
                byte[] bArrCopyOf = Arrays.copyOf(bArrA2, length3 + 1);
                bArrCopyOf[length3] = (byte) length2;
                byte[] bArrQ = p13.s.q(bArrCopyOf, bArrA);
                int length4 = bArrQ.length;
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrQ, length4 + 1);
                bArrCopyOf2[length4] = (byte) length;
                return jVarN.d(new z03.j(as2.h.m(cVar, p13.s.q(bArrCopyOf2, enumC2623a.a()), "")));
            default:
                byte[] bArr = (byte[]) obj;
                Logger logger2 = w.f165679d;
                bArr.getClass();
                wq2.a.f186629a.getClass();
                e13.o oVarM = as2.h.m(cVar, wq2.a.a((byte) -97, Ascii.DEL), "");
                r22.a aVar = new r22.a(new t52.c(28), 25);
                int i15 = w03.b.f181178a;
                return new e13.o(new e13.o(oVarM, aVar), new v(new ct2.d(bArr, 3), 9));
        }
    }
}
