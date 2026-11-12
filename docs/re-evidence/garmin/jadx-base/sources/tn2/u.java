package tn2;

import java.util.List;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class u implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f165671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ul2.c f165672c;

    public /* synthetic */ u(w wVar, ul2.c cVar, int i14) {
        this.f165670a = i14;
        this.f165671b = wVar;
        this.f165672c = cVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f165670a;
        ul2.c cVar = this.f165672c;
        w wVar = this.f165671b;
        List list = (List) obj;
        switch (i14) {
            case 0:
                Logger logger = w.f165679d;
                list.getClass();
                e13.c cVarS = wVar.s(cVar, w.e.a.f165707a);
                r22.a aVar = new r22.a(new aq1.d0(list, 28), 20);
                int i15 = w03.b.f181178a;
                return new e13.o(cVarS, aVar);
            case 1:
                Logger logger2 = w.f165679d;
                list.getClass();
                e13.c cVarS2 = wVar.s(cVar, w.e.a.f165708b);
                v vVar = new v(new aq1.d0(list, 27), 10);
                int i16 = w03.b.f181178a;
                return new e13.o(cVarS2, vVar);
            default:
                Logger logger3 = w.f165679d;
                list.getClass();
                e13.c cVarS3 = wVar.s(cVar, w.e.a.f165709c);
                r22.a aVar2 = new r22.a(new aq1.d0(list, 26), 21);
                int i17 = w03.b.f181178a;
                return new e13.o(cVarS3, aVar2);
        }
    }
}
