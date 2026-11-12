package n43;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class b0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z.b f123619a;

    public b0(z.b bVar) {
        this.f123619a = bVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Collection<s33.o> collectionS;
        x33.f fVar = (x33.f) obj;
        k23.l<Object>[] lVarArr = z.b.f123700j;
        fVar.getClass();
        z.b bVar = this.f123619a;
        LinkedHashMap linkedHashMap = bVar.f123702b;
        s33.o.a aVar = s33.o.P;
        aVar.getClass();
        z zVar = bVar.f123709i;
        byte[] bArr = (byte[]) linkedHashMap.get(fVar);
        if (bArr == null || (collectionS = c53.c0.s(c53.q.d(new z.b.a(aVar, new ByteArrayInputStream(bArr), zVar)))) == null) {
            collectionS = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(collectionS.size());
        for (s33.o oVar : collectionS) {
            l43.l0 l0Var = zVar.f123696b.f110093i;
            oVar.getClass();
            arrayList.add(l0Var.g(oVar, false));
        }
        zVar.k(arrayList, fVar);
        return w02.b0.f(arrayList);
    }
}
