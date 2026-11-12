package p005kotlin.reflect.jvm.internal.impl.resolve;

import b43.d;
import b43.i;
import e23.p;
import java.util.Collection;
import p005kotlin.jvm.internal.s;
import p13.h0;
import q43.f;
import t23.b;
import t23.d1;
import t23.e;
import t23.l;
import t23.y0;
import t23.z;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f105943a = new a();

    private a() {
    }

    public static y0 d(t23.a aVar) {
        while (aVar instanceof b) {
            b bVar = (b) aVar;
            if (bVar.getKind() != b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends b> collectionO = bVar.o();
            collectionO.getClass();
            aVar = (b) h0.J0(collectionO);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.getSource();
    }

    public final boolean a(l lVar, l lVar2, boolean z14) {
        if ((lVar instanceof e) && (lVar2 instanceof e)) {
            return s.g(((e) lVar).h(), ((e) lVar2).h());
        }
        if ((lVar instanceof d1) && (lVar2 instanceof d1)) {
            return b((d1) lVar, (d1) lVar2, z14, d.f15721a);
        }
        if (!(lVar instanceof t23.a) || !(lVar2 instanceof t23.a)) {
            return ((lVar instanceof t23.h0) && (lVar2 instanceof t23.h0)) ? s.g(((t23.h0) lVar).c(), ((t23.h0) lVar2).c()) : s.g(lVar, lVar2);
        }
        t23.a aVar = (t23.a) lVar;
        t23.a aVar2 = (t23.a) lVar2;
        f.a aVar3 = f.a.f142788a;
        aVar3.getClass();
        if (!aVar.equals(aVar2)) {
            if (!s.g(aVar.getName(), aVar2.getName())) {
                return false;
            }
            if ((aVar instanceof z) && (aVar2 instanceof z) && ((z) aVar).O() != ((z) aVar2).O()) {
                return false;
            }
            if ((s.g(aVar.d(), aVar2.d()) && (!z14 || !s.g(d(aVar), d(aVar2)))) || i.m(aVar) || i.m(aVar2) || !c(aVar, aVar2, b43.e.f15722a, z14)) {
                return false;
            }
            b bVarE = b.e(aVar3, new b43.f(z14, aVar, aVar2));
            b.c.a aVarB = bVarE.o(aVar, aVar2, null, true).b();
            b.c.a aVar4 = b.c.a.OVERRIDABLE;
            if (aVarB != aVar4 || bVarE.o(aVar2, aVar, null, true).b() != aVar4) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(d1 d1Var, d1 d1Var2, boolean z14, p<? super l, ? super l, Boolean> pVar) {
        d1Var.getClass();
        d1Var2.getClass();
        pVar.getClass();
        if (d1Var.equals(d1Var2)) {
            return true;
        }
        return !s.g(d1Var.d(), d1Var2.d()) && c(d1Var, d1Var2, pVar, z14) && d1Var.getIndex() == d1Var2.getIndex();
    }

    public final boolean c(l lVar, l lVar2, p<? super l, ? super l, Boolean> pVar, boolean z14) {
        l lVarD = lVar.d();
        l lVarD2 = lVar2.d();
        return ((lVarD instanceof b) || (lVarD2 instanceof b)) ? pVar.invoke(lVarD, lVarD2).booleanValue() : a(lVarD, lVarD2, z14);
    }
}
