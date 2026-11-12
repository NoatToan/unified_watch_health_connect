package k33;

import c2.o3;
import c53.c0;
import c53.h0;
import c53.q;
import c53.s;
import java.util.Iterator;
import p13.u;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements u23.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f102777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o33.c f102778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f102779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o43.i<o33.a, u23.c> f102780d;

    public f(i iVar, o33.c cVar, boolean z14) {
        iVar.getClass();
        cVar.getClass();
        this.f102777a = iVar;
        this.f102778b = cVar;
        this.f102779c = z14;
        this.f102780d = iVar.f102785a.f102751a.h(new e(this));
    }

    @Override // u23.h
    public final /* bridge */ boolean I3(x33.c cVar) {
        return u23.h.b.b(this, cVar);
    }

    @Override // u23.h
    public final boolean isEmpty() {
        return this.f102778b.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<u23.c> iterator() {
        o33.c cVar = this.f102778b;
        h0 h0VarO = c0.o(p13.h0.M(cVar.getAnnotations()), this.f102780d);
        i33.d dVar = i33.d.f90793a;
        x33.c cVar2 = kotlin.reflect.jvm.internal.impl.builtins.f.a.f105888n;
        dVar.getClass();
        c53.j jVarV = u.v(new c53.j[]{h0VarO, new s(i33.d.a(cVar2, cVar, this.f102777a))});
        jVarV.getClass();
        return new c53.g.a(c0.i(q.c(jVarV, new o3(15)), new o3(17)));
    }

    @Override // u23.h
    public final u23.c z(x33.c cVar) {
        u23.c cVarInvoke;
        cVar.getClass();
        o33.c cVar2 = this.f102778b;
        o33.a aVarZ = cVar2.z(cVar);
        if (aVarZ != null && (cVarInvoke = this.f102780d.invoke(aVarZ)) != null) {
            return cVarInvoke;
        }
        i33.d.f90793a.getClass();
        return i33.d.a(cVar, cVar2, this.f102777a);
    }

    public /* synthetic */ f(i iVar, o33.c cVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(iVar, cVar, (i14 & 4) != 0 ? false : z14);
    }
}
