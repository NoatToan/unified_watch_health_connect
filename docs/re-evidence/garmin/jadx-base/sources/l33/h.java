package l33;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f109740a;

    public h(i iVar) {
        this.f109740a = iVar;
    }

    @Override // e23.a
    public final Object invoke() {
        i iVar = this.f109740a;
        ArrayList<o33.b> arrayListH = iVar.f109753b.h();
        ArrayList arrayList = new ArrayList();
        for (o33.b bVar : arrayListH) {
            x33.f name = bVar.getName();
            if (name == null) {
                name = h33.c0.f81420b;
            }
            d43.g<?> gVarD = iVar.d(bVar);
            o13.p pVar = gVarD != null ? new o13.p(name, gVarD) : null;
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        return p13.u0.l(arrayList);
    }
}
