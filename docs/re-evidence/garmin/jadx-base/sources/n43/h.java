package n43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p43.v0;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f123633a;

    public h(n nVar) {
        this.f123633a = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    @Override // e23.a
    public final Object invoke() {
        Object d0Var;
        t43.i iVar;
        int i14 = n.A;
        n nVar = this.f123633a;
        if (nVar.isInline() || nVar.k()) {
            boolean zA = nVar.f123655g.a(1, 5, 1);
            s33.c cVar = nVar.f123654f;
            l43.p pVar = nVar.f123661m;
            u33.d dVar = pVar.f110086b;
            u33.h hVar = pVar.f110088d;
            s sVar = new s(pVar.f110092h);
            t tVar = new t(nVar);
            cVar.getClass();
            if ((cVar.f156524c & 8) == 8) {
                x33.f fVarD = x33.f.d(dVar.getString(cVar.f156544y));
                int i15 = cVar.f156524c;
                s33.s sVarA = (i15 & 16) == 16 ? cVar.f156545z : (i15 & 32) == 32 ? hVar.a(cVar.A) : null;
                if ((sVarA == null || (iVar = (t43.i) sVar.invoke(sVarA)) == null) && (iVar = (t43.i) tVar.invoke(fVarD)) == null) {
                    u0.u("cannot determine underlying type for value class ", x33.f.d(dVar.getString(cVar.f156526e)), " with property ", fVarD);
                    return null;
                }
                d0Var = new t23.w(fVarD, iVar);
            } else if (zA && u33.b.f168305k.d(cVar.f156525d).booleanValue()) {
                List<s33.e> list = cVar.f156537p;
                list.getClass();
                Iterator<T> it = list.iterator();
                boolean z14 = false;
                Object obj = null;
                while (true) {
                    if (!it.hasNext()) {
                        if (!z14) {
                            break;
                        }
                        break;
                    }
                    Object next = it.next();
                    if (!u33.b.f168308n.d(((s33.e) next).f156591d).booleanValue()) {
                        if (!z14) {
                            z14 = true;
                            obj = next;
                        }
                    }
                    obj = null;
                    break;
                }
                s33.e eVar = (s33.e) obj;
                if (eVar == null) {
                    d0Var = null;
                } else {
                    List<s33.w> list2 = eVar.f156592e;
                    list2.getClass();
                    ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
                    for (s33.w wVar : list2) {
                        arrayList.add(new o13.p(x33.f.d(dVar.getString(wVar.f156976e)), sVar.invoke(u33.g.k(wVar, hVar))));
                    }
                    d0Var = new t23.d0(arrayList);
                }
            } else {
                d0Var = null;
            }
            if (d0Var != null) {
                return d0Var;
            }
            if (!zA) {
                t23.d dVarS = nVar.s();
                if (dVarS != null) {
                    List<j1> listF = dVarS.f();
                    listF.getClass();
                    x33.f name = ((j1) p13.h0.b0(listF)).getName();
                    name.getClass();
                    v0 v0VarF0 = nVar.F0(name);
                    if (v0VarF0 != null) {
                        return new t23.w(name, v0VarF0);
                    }
                    ds.e0.t(nVar, "Value class has no underlying property: ");
                    return null;
                }
                ds.e0.t(nVar, "Inline class has no primary constructor: ");
            }
        }
        return null;
    }
}
