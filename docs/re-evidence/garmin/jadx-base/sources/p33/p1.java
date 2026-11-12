package p33;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 extends f<u23.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u23.a f135499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f135500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k33.i f135501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h33.c f135502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f135503e;

    public p1(u23.a aVar, boolean z14, k33.i iVar, h33.c cVar, boolean z15) {
        iVar.getClass();
        cVar.getClass();
        this.f135499a = aVar;
        this.f135500b = z14;
        this.f135501c = iVar;
        this.f135502d = cVar;
        this.f135503e = z15;
    }

    @Override // p33.f
    public final boolean b(u23.c cVar, t43.h hVar) {
        u23.c cVar2 = cVar;
        if ((cVar2 instanceof j33.g) && ((j33.g) cVar2).a()) {
            return true;
        }
        if (cVar2 instanceof l33.i) {
            n();
            if (((l33.i) cVar2).f109759h || this.f135502d == h33.c.TYPE_PARAMETER_BOUNDS) {
                return true;
            }
        }
        if (hVar == null || !p005kotlin.reflect.jvm.internal.impl.builtins.d.G((p43.n0) hVar)) {
            return false;
        }
        k33.i iVar = this.f135501c;
        h33.d dVar = iVar.f102785a.f102767q;
        dVar.getClass();
        cVar2.getClass();
        u23.c cVarD = dVar.d(cVar2, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105895u);
        boolean z14 = false;
        if (cVarD != null) {
            ArrayList arrayListA = dVar.a(cVarD, false);
            if (!arrayListA.isEmpty()) {
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    if (p005kotlin.jvm.internal.s.g((String) it.next(), "TYPE")) {
                        z14 = true;
                        break;
                    }
                }
            }
        }
        if (!z14) {
            return false;
        }
        iVar.f102785a.f102770t.getClass();
        return true;
    }

    @Override // p33.f
    public final h33.d c() {
        return this.f135501c.f102785a.f102767q;
    }

    @Override // p33.f
    public final u23.h d(t43.h hVar) {
        hVar.getClass();
        return ((p43.n0) hVar).getAnnotations();
    }

    @Override // p33.f
    public final h33.c f() {
        return this.f135502d;
    }

    @Override // p33.f
    public final h33.y g() {
        return this.f135501c.f102787c.getValue();
    }

    @Override // p33.f
    public final p43.n0 h(t43.h hVar) {
        hVar.getClass();
        return og.a.C((p43.n0) hVar);
    }

    @Override // p33.f
    public final boolean j() {
        return this.f135503e;
    }

    @Override // p33.f
    public final q43.s k() {
        return q43.s.f142813a;
    }

    @Override // p33.f
    public final boolean l(t43.n nVar) {
        nVar.getClass();
        return nVar instanceof l33.d1;
    }

    public final boolean n() {
        this.f135501c.f102785a.f102770t.getClass();
        return false;
    }

    public /* synthetic */ p1(u23.a aVar, boolean z14, k33.i iVar, h33.c cVar, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, z14, iVar, cVar, (i14 & 16) != 0 ? false : z15);
    }
}
