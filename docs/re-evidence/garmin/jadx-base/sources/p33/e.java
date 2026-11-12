package p33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f135426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t43.p f135427b;

    public e(f fVar, t43.p pVar) {
        this.f135426a = fVar;
        this.f135427b = pVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        t43.m mVarG;
        List<t43.n> listF0;
        f.a aVar = (f.a) obj;
        aVar.getClass();
        t43.h hVar = aVar.f135430a;
        f fVar = this.f135426a;
        boolean zJ = fVar.j();
        t43.p pVar = this.f135427b;
        if ((zJ && hVar != null && pVar.M(hVar)) || hVar == null || (mVarG = pVar.G(hVar)) == null || (listF0 = pVar.f0(mVarG)) == null) {
            return null;
        }
        List<t43.l> listL0 = pVar.l0(hVar);
        Iterator<T> it = listF0.iterator();
        Iterator<T> it3 = listL0.iterator();
        ArrayList arrayList = new ArrayList(Math.min(p13.y.r(listF0, 10), p13.y.r(listL0, 10)));
        while (it.hasNext() && it3.hasNext()) {
            t43.n nVar = (t43.n) it.next();
            t43.h hVarP = pVar.p((t43.l) it3.next());
            h33.y yVar = aVar.f135431b;
            arrayList.add(hVarP == null ? new f.a(null, yVar, nVar) : new f.a(hVarP, h33.b.b(fVar.c(), yVar, fVar.d(hVarP)), nVar));
        }
        return arrayList;
    }
}
