package n23;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public class f1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f122439a;

    public f1(h1 h1Var) {
        this.f122439a = h1Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    @Override // e23.a
    public final Object invoke() {
        w23.u uVarG0;
        boolean zI3;
        Class<?> enclosingClass;
        Object obj = h1.f122481n;
        m4 m4Var = m4.f122535a;
        h1 h1Var = this.f122439a;
        t23.r0 r0VarE = h1Var.e();
        i3 i3Var = h1Var.f122482h;
        m4Var.getClass();
        c2 c2VarB = m4.b(r0VarE);
        if (c2VarB instanceof c2.c) {
            c2.c cVar = (c2.c) c2VarB;
            s33.o oVar = cVar.f122410b;
            t23.r0 r0Var = cVar.f122409a;
            w33.g gVar = w33.g.f181902a;
            u33.d dVar = cVar.f122412d;
            u33.h hVar = cVar.f122413e;
            gVar.getClass();
            boolean z14 = true;
            w33.d.a aVarB = w33.g.b(oVar, dVar, hVar, true);
            if (aVarB != null) {
                if (r0Var == null) {
                    h33.l.a(0);
                    throw null;
                }
                if (r0Var.getKind() != t23.b.a.FAKE_OVERRIDE) {
                    t23.l lVarD = r0Var.d();
                    if (lVarD == null) {
                        h33.l.a(1);
                        throw null;
                    }
                    if (b43.i.k(lVarD)) {
                        t23.l lVarD2 = lVarD.d();
                        if (b43.i.l(lVarD2, t23.f.CLASS) || b43.i.l(lVarD2, t23.f.ENUM_CLASS)) {
                            t23.e eVar = (t23.e) lVarD;
                            p005kotlin.reflect.jvm.internal.impl.builtins.a.f105828a.getClass();
                            if (b43.i.k(eVar)) {
                                LinkedHashSet linkedHashSet = p005kotlin.reflect.jvm.internal.impl.builtins.a.f105829b;
                                x33.b bVarF = f43.e.f(eVar);
                                if (p13.h0.R(linkedHashSet, bVarF != null ? bVarF.e() : null)) {
                                    if (b43.i.k(r0Var.d())) {
                                        uVarG0 = r0Var.g0();
                                        if (uVarG0 == null && uVarG0.getAnnotations().I3(h33.b0.f81410b)) {
                                            zI3 = true;
                                        } else {
                                            zI3 = r0Var.getAnnotations().I3(h33.b0.f81410b);
                                        }
                                        if (!zI3) {
                                            z14 = false;
                                        }
                                    } else {
                                        z14 = false;
                                    }
                                }
                            }
                        } else if (b43.i.k(r0Var.d())) {
                            z14 = false;
                        } else {
                            uVarG0 = r0Var.g0();
                            if (uVarG0 == null) {
                                zI3 = r0Var.getAnnotations().I3(h33.b0.f81410b);
                            } else {
                                zI3 = r0Var.getAnnotations().I3(h33.b0.f81410b);
                            }
                            if (!zI3) {
                                z14 = false;
                            }
                        }
                    } else if (b43.i.k(r0Var.d())) {
                        z14 = false;
                    } else {
                        uVarG0 = r0Var.g0();
                        if (uVarG0 == null) {
                            zI3 = r0Var.getAnnotations().I3(h33.b0.f81410b);
                        } else {
                            zI3 = r0Var.getAnnotations().I3(h33.b0.f81410b);
                        }
                        if (!zI3) {
                            z14 = false;
                        }
                    }
                } else {
                    z14 = false;
                }
                if (z14 || w33.g.d(oVar)) {
                    enclosingClass = i3Var.j().getEnclosingClass();
                } else {
                    t23.l lVarD3 = r0Var.d();
                    enclosingClass = lVarD3 instanceof t23.e ? s4.i((t23.e) lVarD3) : i3Var.j();
                }
                if (enclosingClass != null) {
                    try {
                        return enclosingClass.getDeclaredField(aVarB.f181893a);
                    } catch (NoSuchFieldException unused) {
                    }
                }
            }
        } else {
            if (c2VarB instanceof c2.a) {
                return ((c2.a) c2VarB).f122406a;
            }
            if (!(c2VarB instanceof c2.b) && !(c2VarB instanceof c2.d)) {
                lc.u0.r();
                return null;
            }
        }
        return null;
    }
}
