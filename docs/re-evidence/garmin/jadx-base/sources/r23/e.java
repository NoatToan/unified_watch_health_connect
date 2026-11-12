package r23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o13.p;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.m0;
import p13.o0;
import p13.y;
import p43.a2;
import p43.g2;
import p43.n0;
import p43.v0;
import t23.a0;
import t23.d1;
import t23.j1;
import t23.l;
import t23.q;
import t23.u0;
import t23.v;
import t23.y0;
import u23.h;
import w23.r0;
import w23.x;
import w23.x0;
import w43.t;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends r0 {
    public static final a I = new a(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private e(l lVar, e eVar, t23.b.a aVar, boolean z14) {
        super(lVar, eVar, h.a.f168228b, t.f182033g, aVar, y0.f162076a);
        h.f168226x0.getClass();
        this.f181731m = true;
        this.f181740x = z14;
        this.f181741y = false;
    }

    @Override // w23.r0, w23.x
    public final x E0(l lVar, v vVar, h hVar, x33.f fVar, t23.b.a aVar, y0 y0Var) {
        lVar.getClass();
        aVar.getClass();
        hVar.getClass();
        return new e(lVar, (e) vVar, aVar, this.f181740x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w23.x
    public final x F0(x.a aVar) {
        x33.f fVar;
        e eVar = (e) super.F0(aVar);
        if (eVar == null) {
            return null;
        }
        List<j1> listF = eVar.f();
        listF.getClass();
        if (listF.isEmpty()) {
            return eVar;
        }
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            n0 type = ((j1) it.next()).getType();
            type.getClass();
            if (p005kotlin.reflect.jvm.internal.impl.builtins.c.c(type) != null) {
                List<j1> listF2 = eVar.f();
                listF2.getClass();
                ArrayList arrayList = new ArrayList(y.r(listF2, 10));
                Iterator<T> it3 = listF2.iterator();
                while (it3.hasNext()) {
                    n0 type2 = ((j1) it3.next()).getType();
                    type2.getClass();
                    arrayList.add(p005kotlin.reflect.jvm.internal.impl.builtins.c.c(type2));
                }
                int size = eVar.f().size() - arrayList.size();
                boolean z14 = true;
                if (size == 0) {
                    List<j1> listF3 = eVar.f();
                    listF3.getClass();
                    ArrayList<p> arrayListK1 = h0.k1(arrayList, listF3);
                    if (arrayListK1.isEmpty()) {
                        return eVar;
                    }
                    for (p pVar : arrayListK1) {
                        if (!s.g((x33.f) pVar.f128594a, ((j1) pVar.f128595b).getName())) {
                        }
                    }
                    return eVar;
                }
                List<j1> listF4 = eVar.f();
                listF4.getClass();
                ArrayList arrayList2 = new ArrayList(y.r(listF4, 10));
                for (j1 j1Var : listF4) {
                    x33.f name = j1Var.getName();
                    name.getClass();
                    int index = j1Var.getIndex();
                    int i14 = index - size;
                    if (i14 >= 0 && (fVar = (x33.f) arrayList.get(i14)) != null) {
                        name = fVar;
                    }
                    arrayList2.add(j1Var.w0(eVar, name, index));
                }
                x.a aVarI0 = eVar.I0(a2.f135794b);
                if (arrayList.isEmpty()) {
                    z14 = false;
                } else {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (((x33.f) it4.next()) == null) {
                        }
                    }
                    z14 = false;
                }
                aVarI0.f181764v = Boolean.valueOf(z14);
                aVarI0.f181749g = arrayList2;
                aVarI0.f181747e = eVar.a();
                x xVarF0 = super.F0(aVarI0);
                xVarF0.getClass();
                return xVarF0;
            }
        }
        return eVar;
    }

    @Override // w23.x, t23.v
    public final boolean W() {
        return false;
    }

    @Override // w23.x, t23.z
    public final boolean isExternal() {
        return false;
    }

    @Override // w23.x, t23.v
    public final boolean isInline() {
        return false;
    }

    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static e a(b bVar, boolean z14) {
            String lowerCase;
            bVar.getClass();
            List<d1> list = bVar.f149953l;
            e eVar = new e(bVar, null, t23.b.a.DECLARATION, z14, null);
            u0 u0VarK0 = bVar.k0();
            j0 j0Var = j0.f134944a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((d1) obj).m() != g2.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            p13.n0 n0VarJ1 = h0.j1(arrayList);
            ArrayList arrayList2 = new ArrayList(y.r(n0VarJ1, 10));
            Iterator it = n0VarJ1.iterator();
            while (true) {
                o0 o0Var = (o0) it;
                if (!o0Var.f134956a.hasNext()) {
                    eVar.H0(null, u0VarK0, j0Var, j0Var, arrayList2, ((d1) h0.m0(list)).p(), a0.ABSTRACT, q.f162050e);
                    eVar.f181742z = true;
                    return eVar;
                }
                m0 m0Var = (m0) o0Var.next();
                a aVar = e.I;
                int i14 = m0Var.f134951a;
                d1 d1Var = (d1) m0Var.f134952b;
                aVar.getClass();
                String strB = d1Var.getName().b();
                strB.getClass();
                if (strB.equals("T")) {
                    lowerCase = "instance";
                } else if (strB.equals("E")) {
                    lowerCase = "receiver";
                } else {
                    lowerCase = strB.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                h.f168226x0.getClass();
                h.a.C3153a c3153a = h.a.f168228b;
                x33.f fVarE = x33.f.e(lowerCase);
                v0 v0VarP = d1Var.p();
                v0VarP.getClass();
                y0.a aVar2 = y0.f162076a;
                aVar2.getClass();
                arrayList2.add(new x0(eVar, null, i14, c3153a, fVarE, v0VarP, false, false, false, null, aVar2));
            }
        }

        private a() {
        }
    }

    public /* synthetic */ e(l lVar, e eVar, t23.b.a aVar, boolean z14, j jVar) {
        this(lVar, eVar, aVar, z14);
    }
}
