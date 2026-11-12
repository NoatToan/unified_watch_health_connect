package tn2;

import com.google.common.primitives.UnsignedBytes;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f165590b;

    public /* synthetic */ l(w wVar, int i14) {
        this.f165589a = i14;
        this.f165590b = wVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f165589a;
        int i15 = 0;
        w wVar = this.f165590b;
        switch (i14) {
            case 0:
                byte[] bArr = (byte[]) obj;
                Logger logger = w.f165679d;
                bArr.getClass();
                wVar.getClass();
                return Integer.valueOf(((bArr[2] & UnsignedBytes.MAX_VALUE) << 16) | (bArr[0] & UnsignedBytes.MAX_VALUE) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 8));
            case 1:
                ul2.c cVar = (ul2.c) obj;
                Logger logger2 = w.f165679d;
                cVar.getClass();
                w.a.EnumC3112a.f165688a.getClass();
                byte[] bArrB = wq2.a.b(pn2.a.EnumC2623a.MSI.a());
                wVar.getClass();
                e13.o oVarM = as2.h.m(cVar, bArrB, "");
                w.a.EnumC3112a.f165689b.getClass();
                e13.w wVarL = q03.r.l(oVarM, as2.h.m(cVar, wq2.a.b(pn2.a.EnumC2623a.INSTANCE0.a()), ""), new tn.k(2));
                hq2.c cVar2 = new hq2.c(cVar, 4);
                int i16 = w03.b.f181178a;
                return new e13.h(wVarL, cVar2);
            default:
                ul2.c cVar3 = (ul2.c) obj;
                Logger logger3 = w.f165679d;
                cVar3.getClass();
                e13.o oVarM2 = as2.h.m(cVar3, wq2.a.b(pn2.a.EnumC2623a.INSTANCE1.a()), "");
                int i17 = 5;
                n nVar = new n(new m(i17), 27);
                int i18 = w03.b.f181178a;
                e13.k kVar = new e13.k(new e13.o(oVarM2, nVar), new n(new p(wVar, cVar3, i15), 6));
                hq2.c cVar4 = new hq2.c(cVar3, i17);
                w03.a.d dVar = w03.a.f181172c;
                w03.a.c cVar5 = w03.a.f181171b;
                return kVar.f(dVar, dVar, cVar5, cVar4, cVar5, cVar5);
        }
    }
}
