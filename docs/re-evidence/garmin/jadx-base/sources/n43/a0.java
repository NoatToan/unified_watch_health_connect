package n43;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z.b f123618a;

    public a0(z.b bVar) {
        this.f123618a = bVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Collection<s33.j> collectionS;
        x33.f fVar = (x33.f) obj;
        k23.l<Object>[] lVarArr = z.b.f123700j;
        fVar.getClass();
        z.b bVar = this.f123618a;
        LinkedHashMap linkedHashMap = bVar.f123701a;
        s33.j.a aVar = s33.j.B;
        aVar.getClass();
        z zVar = bVar.f123709i;
        byte[] bArr = (byte[]) linkedHashMap.get(fVar);
        if (bArr == null || (collectionS = c53.c0.s(c53.q.d(new z.b.a(aVar, new ByteArrayInputStream(bArr), zVar)))) == null) {
            collectionS = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(collectionS.size());
        for (s33.j jVar : collectionS) {
            l43.l0 l0Var = zVar.f123696b.f110093i;
            jVar.getClass();
            h0 h0VarF = l0Var.f(jVar);
            if (!zVar.r(h0VarF)) {
                h0VarF = null;
            }
            if (h0VarF != null) {
                arrayList.add(h0VarF);
            }
        }
        zVar.j(arrayList, fVar);
        return w02.b0.f(arrayList);
    }
}
