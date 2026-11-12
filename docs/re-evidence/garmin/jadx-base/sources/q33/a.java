package q33;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f142441a;

    public a(e eVar) {
        this.f142441a = eVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        x xVar = (x) obj;
        int i14 = e.f142455d;
        xVar.getClass();
        e eVar = this.f142441a;
        eVar.getClass();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        xVar.b(new d(eVar, map, xVar, map3, map2));
        return new i(map, map2, map3);
    }
}
