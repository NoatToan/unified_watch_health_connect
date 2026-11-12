package s23;

import p005kotlin.jvm.internal.r0;
import q33.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends z43.b.a<t23.e, u.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f156305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0<u.a> f156306b;

    public w(String str, r0<u.a> r0Var) {
        this.f156305a = str;
        this.f156306b = r0Var;
    }

    @Override // z43.b.c
    public final Object a() {
        u.a aVar = this.f156306b.f105810a;
        return aVar == null ? u.a.NOT_CONSIDERED : aVar;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [T, s23.u$a] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, s23.u$a] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, s23.u$a] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, s23.u$a] */
    @Override // z43.b.a, z43.b.c
    public final boolean b(Object obj) {
        t23.e eVar = (t23.e) obj;
        eVar.getClass();
        String strI = oc.b.I(e0.f142457a, eVar, this.f156305a);
        z.f156309a.getClass();
        boolean zContains = z.f156311c.contains(strI);
        r0<u.a> r0Var = this.f156306b;
        if (zContains) {
            r0Var.f105810a = u.a.HIDDEN;
        } else if (z.f156313e.contains(strI)) {
            r0Var.f105810a = u.a.VISIBLE;
        } else if (z.f156312d.contains(strI)) {
            r0Var.f105810a = u.a.DEPRECATED_LIST_METHODS;
        } else if (z.f156310b.contains(strI)) {
            r0Var.f105810a = u.a.DROP;
        }
        return r0Var.f105810a == null;
    }
}
