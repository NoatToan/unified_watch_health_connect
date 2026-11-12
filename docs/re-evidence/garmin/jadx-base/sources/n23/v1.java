package n23;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 {
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    public static final o23.h a(h1.a aVar, boolean z14) {
        a2.e eVar;
        Method method;
        o23.h aVar2;
        v33.a.c cVar;
        o23.h cVar2;
        i3.f122504a.getClass();
        if (i3.f122506c.d(aVar.F().f122484j)) {
            return o23.k.f128727a;
        }
        m4 m4Var = m4.f122535a;
        t23.r0 r0VarE = aVar.F().e();
        m4Var.getClass();
        c2 c2VarB = m4.b(r0VarE);
        if (c2VarB instanceof c2.c) {
            c2.c cVar3 = (c2.c) c2VarB;
            u33.d dVar = cVar3.f122412d;
            v33.a.d dVar2 = cVar3.f122411c;
            if (z14) {
                if (dVar2.d()) {
                    cVar = dVar2.f175462e;
                } else {
                    cVar = null;
                }
            } else if ((dVar2.f175459b & 8) == 8) {
                cVar = dVar2.f175463f;
            } else {
                cVar = null;
            }
            Method methodG = cVar != null ? aVar.F().f122482h.G(dVar.getString(cVar.f175449c), dVar.getString(cVar.f175450d)) : null;
            if (methodG != null) {
                if (!Modifier.isStatic(methodG.getModifiers())) {
                    cVar2 = gg.b.H(aVar) ? new o23.i.h.a(methodG, aVar.F().F()) : new o23.i.h.e(methodG);
                } else if (aVar.F().e().getAnnotations().I3(s4.f122608a)) {
                    cVar2 = gg.b.H(aVar) ? new o23.i.h.b(methodG) : new o23.i.h.f(methodG);
                } else {
                    cVar2 = gg.b.H(aVar) ? new o23.i.h.c(methodG, false, aVar.F().F()) : new o23.i.h.g(methodG);
                }
                aVar2 = cVar2;
            } else if (b43.j.d(aVar.F().e()) && p005kotlin.jvm.internal.s.g(aVar.F().e().getVisibility(), t23.q.f162049d)) {
                Class clsR = gl.b.R(aVar.F().e().d());
                if (clsR == null) {
                    throw new w3("Underlying property of inline class " + aVar.F() + " should have a field");
                }
                Method methodX = gl.b.x(clsR, aVar.F().e());
                aVar2 = gg.b.H(aVar) ? new o23.j.a(methodX, aVar.F().F()) : new o23.j.b(methodX);
            } else {
                Field fieldB = aVar.F().B();
                if (fieldB == null) {
                    j.r(aVar.F(), "No accessors or field is found for property ");
                    return null;
                }
                aVar2 = b(aVar, z14, fieldB);
            }
        } else if (c2VarB instanceof c2.a) {
            aVar2 = b(aVar, z14, ((c2.a) c2VarB).f122406a);
        } else {
            if (!(c2VarB instanceof c2.b)) {
                if (!(c2VarB instanceof c2.d)) {
                    lc.u0.r();
                    return null;
                }
                if (z14) {
                    eVar = ((c2.d) c2VarB).f122415a;
                } else {
                    eVar = ((c2.d) c2VarB).f122416b;
                    if (eVar == null) {
                        j.r(aVar.F(), "No setter found for property ");
                        return null;
                    }
                }
                i3 i3Var = aVar.F().f122482h;
                w33.d.b bVar = eVar.f122391a;
                Method methodG2 = i3Var.G(bVar.f181895a, bVar.f181896b);
                if (methodG2 != null) {
                    Modifier.isStatic(methodG2.getModifiers());
                    return gg.b.H(aVar) ? new o23.i.h.a(methodG2, aVar.F().F()) : new o23.i.h.e(methodG2);
                }
                j.r(aVar.F(), "No accessor found for property ");
                return null;
            }
            if (z14) {
                method = ((c2.b) c2VarB).f122407a;
            } else {
                c2.b bVar2 = (c2.b) c2VarB;
                method = bVar2.f122408b;
                if (method == null) {
                    j.r(bVar2.f122407a, "No source found for setter of Java method property: ");
                    return null;
                }
            }
            aVar2 = gg.b.H(aVar) ? new o23.i.h.a(method, aVar.F().F()) : new o23.i.h.e(method);
        }
        return gl.b.o(aVar.E(), aVar2, false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
    public static final o23.i<Field> b(h1.a<?, ?> aVar, boolean z14, Field field) {
        t23.r0 r0VarE = aVar.F().e();
        t23.l lVarD = r0VarE.d();
        lVarD.getClass();
        if (b43.i.k(lVarD)) {
            t23.l lVarD2 = lVarD.d();
            if ((b43.i.l(lVarD2, t23.f.INTERFACE) || b43.i.l(lVarD2, t23.f.ANNOTATION_CLASS)) && (!(r0VarE instanceof n43.g0) || !w33.g.d(((n43.g0) r0VarE).D))) {
                if (Modifier.isStatic(field.getModifiers())) {
                    if (aVar.F().e().getAnnotations().I3(s4.f122608a)) {
                        if (z14) {
                        }
                    }
                    if (z14) {
                        if (gg.b.H(aVar)) {
                        }
                    }
                    if (gg.b.H(aVar)) {
                    }
                }
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            if (aVar.F().e().getAnnotations().I3(s4.f122608a)) {
                return z14 ? new o23.i.f.e(field) : new o23.i.g.e(field, c(aVar));
            }
            if (z14) {
                return gg.b.H(aVar) ? new o23.i.f.b(field) : new o23.i.f.d(field);
            }
            return gg.b.H(aVar) ? new o23.i.g.b(field, c(aVar)) : new o23.i.g.d(field, c(aVar));
        }
        if (z14) {
            return gg.b.H(aVar) ? new o23.i.f.a(field, aVar.F().F()) : new o23.i.f.c(field);
        }
        return gg.b.H(aVar) ? new o23.i.g.a(field, c(aVar), aVar.F().F()) : new o23.i.g.c(field, c(aVar));
    }

    public static final boolean c(h1.a<?, ?> aVar) {
        return !p43.d2.g(aVar.F().e().getType());
    }
}
