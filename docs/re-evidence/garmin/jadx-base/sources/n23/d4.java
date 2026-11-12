package n23;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public class d4 extends p005kotlin.jvm.internal.t0 {
    public static i3 m(p005kotlin.jvm.internal.e eVar) {
        k23.f owner = eVar.getOwner();
        return owner instanceof i3 ? (i3) owner : y1.f122664d;
    }

    @Override // p005kotlin.jvm.internal.t0
    public final k23.g a(p005kotlin.jvm.internal.p pVar) {
        return new t0(m(pVar), pVar.getF122483i(), pVar.getSignature(), pVar.getBoundReceiver());
    }

    @Override // p005kotlin.jvm.internal.t0
    public final k23.d b(Class cls) {
        return h.a(cls);
    }

    @Override // p005kotlin.jvm.internal.t0
    public final k23.f c(Class cls) {
        i iVar = h.f122475a;
        cls.getClass();
        return (k23.f) h.f122476b.a(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p005kotlin.jvm.internal.t0
    public final k23.p d(k23.p pVar) {
        String strW;
        pVar.getClass();
        e23.a aVar = null;
        Object[] objArr = 0;
        if (!p4.f122570a) {
            b53.v vVar = (b53.v) pVar;
            k23.e eVar = vVar.f16153b;
            k23.d dVar = eVar instanceof k23.d ? (k23.d) eVar : null;
            if (dVar == null || (strW = dVar.getF16141b()) == null) {
                lc.u0.t(pVar, "Non-class type cannot be a mutable collection type: ");
                return null;
            }
            s23.c cVar = s23.c.f156232a;
            x33.d dVar2 = new x33.d(strW);
            cVar.getClass();
            x33.c cVar2 = s23.c.f156243l.get(dVar2);
            if (cVar2 != null) {
                return new b53.v(vVar.f16153b, vVar.f16154c, vVar.f16155d, vVar.f16156e, vVar.f16157f, vVar.f16158g, vVar.f16159h, vVar.f16160i, b53.s.a(cVar2, (k23.d) eVar), null, 512, null);
            }
            com.google.firebase.messaging.l.j(pVar, "Not a readonly collection: ");
            return null;
        }
        p43.n0 n0Var = ((b53.l) pVar).f16127b;
        if (!(n0Var instanceof p43.v0)) {
            vb.h.y(pVar, "Non-simple type cannot be a mutable collection type: ");
            return null;
        }
        t23.h hVarT = n0Var.F0().t();
        t23.e eVar2 = hVarT instanceof t23.e ? (t23.e) hVarT : null;
        if (eVar2 == null) {
            com.google.firebase.messaging.l.j(pVar, "Non-class type cannot be a mutable collection type: ");
            return null;
        }
        p43.v0 v0Var = (p43.v0) n0Var;
        s23.c cVar3 = s23.c.f156232a;
        int i14 = f43.e.f68881a;
        x33.d dVarF = b43.i.f(eVar2);
        dVarF.getClass();
        cVar3.getClass();
        x33.c cVar4 = s23.c.f156243l.get(dVarF);
        if (cVar4 == null) {
            com.google.firebase.messaging.l.j(eVar2, "Not a readonly collection: ");
            return null;
        }
        t23.e eVarJ = f43.e.e(eVar2).j(cVar4);
        eVarJ.getClass();
        p43.m1 m1VarH = eVarJ.h();
        m1VarH.getClass();
        p43.q0 q0Var = p43.q0.f135904a;
        p43.k1 k1VarE0 = v0Var.E0();
        List<p43.t1> listD0 = v0Var.D0();
        boolean zG0 = v0Var.G0();
        k1VarE0.getClass();
        listD0.getClass();
        return new b53.l(p43.q0.e(k1VarE0, m1VarH, listD0, zG0, null), aVar, 2, objArr == true ? 1 : 0);
    }

    @Override // p005kotlin.jvm.internal.t0
    public final k23.i e(p005kotlin.jvm.internal.y yVar) {
        return new v0(m(yVar), yVar.getF122483i(), yVar.getSignature(), yVar.getBoundReceiver());
    }

    @Override // p005kotlin.jvm.internal.t0
    public final k23.j f(p005kotlin.jvm.internal.a0 a0Var) {
        return new x0(m(a0Var), a0Var.getF122483i(), a0Var.getSignature(), a0Var.getBoundReceiver());
    }

    @Override // p005kotlin.jvm.internal.t0
    public final k23.m g(p005kotlin.jvm.internal.f0 f0Var) {
        return new o1(m(f0Var), f0Var.getF122483i(), f0Var.getSignature(), f0Var.getBoundReceiver());
    }

    @Override // p005kotlin.jvm.internal.t0
    public final k23.n h(p005kotlin.jvm.internal.h0 h0Var) {
        return new r1(m(h0Var), h0Var.getF122483i(), h0Var.getSignature(), h0Var.getBoundReceiver());
    }

    @Override // p005kotlin.jvm.internal.t0
    public final k23.o i(p005kotlin.jvm.internal.j0 j0Var) {
        return new u1(m(j0Var), j0Var.getF122483i(), j0Var.getSignature());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    @Override // p005kotlin.jvm.internal.t0
    public final String j(p005kotlin.jvm.internal.o oVar) throws IOException {
        t0 t0Var;
        Metadata metadata = (Metadata) oVar.getClass().getAnnotation(Metadata.class);
        Object obj = null;
        if (metadata == null) {
            t0Var = null;
        } else {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 == null) {
                t0Var = null;
            } else {
                o13.p<w33.e, s33.j> pVarG = w33.g.g(strArrD1, metadata.d2());
                w33.e eVar = pVarG.f128594a;
                s33.j jVar = pVarG.f128595b;
                u33.c cVar = new u33.c(metadata.mv(), (metadata.xi() & 8) != 0);
                Class<?> cls = oVar.getClass();
                s33.v vVar = jVar.f156696q;
                vVar.getClass();
                t0Var = new t0(y1.f122664d, (t23.x0) s4.e(cls, jVar, eVar, new u33.h(vVar), cVar, m23.c.f116207a));
            }
        }
        if (t0Var == null) {
            return super.j(oVar);
        }
        l4 l4Var = l4.f122528a;
        l4Var.getClass();
        StringBuilder sb3 = new StringBuilder();
        Iterator<T> it = t0Var.getParameters().iterator();
        boolean z14 = false;
        Object obj2 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z14) {
                    break;
                }
                obj = obj2;
                break;
            }
            Object next = it.next();
            if (((k23.k) next).getF122430c() == k23.k.a.EXTENSION_RECEIVER) {
                if (z14) {
                    break;
                }
                z14 = true;
                obj2 = next;
            }
        }
        k23.k kVar = (k23.k) obj;
        if (kVar != null) {
            sb3.append(l4Var.f(kVar.getType(), false));
            sb3.append(".");
        }
        p13.h0.j0(l23.b.a(t0Var), sb3, ", ", "(", ")", g4.f122474a, 48);
        sb3.append(" -> ");
        sb3.append(l4Var.f(t0Var.getReturnType(), false));
        return sb3.toString();
    }

    @Override // p005kotlin.jvm.internal.t0
    public final String k(p005kotlin.jvm.internal.w wVar) {
        return j(wVar);
    }

    @Override // p005kotlin.jvm.internal.t0
    public final k23.p l(k23.d dVar, List list, boolean z14) {
        if (!(dVar instanceof p005kotlin.jvm.internal.g)) {
            return l23.g.b(dVar, list, z14, Collections.EMPTY_LIST);
        }
        Class<?> clsJ = ((p005kotlin.jvm.internal.g) dVar).j();
        i iVar = h.f122475a;
        clsJ.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return z14 ? (k23.p) h.f122478d.a(clsJ) : (k23.p) h.f122477c.a(clsJ);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) h.f122479e.a(clsJ);
        o13.p pVar = new o13.p(list, Boolean.valueOf(z14));
        Object obj = concurrentHashMap.get(pVar);
        if (obj == null) {
            b53.a aVarB = l23.g.b(h.a(clsJ), list, z14, p13.j0.f134944a);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pVar, aVarB);
            obj = objPutIfAbsent == null ? aVarB : objPutIfAbsent;
        }
        return (k23.p) obj;
    }
}
