package n23;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class s0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f122603a;

    public s0(t0 t0Var) {
        this.f122603a = t0Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[LOOP:2: B:33:0x00cc->B:100:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x0221  */
    /* JADX WARN: Code duplicated, block: B:94:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00e0 A[EDGE_INSN: B:96:0x00e0->B:39:0x00e0 BREAK  A[LOOP:1: B:27:0x00ad->B:97:0x00ad, LOOP_LABEL: LOOP:1: B:27:0x00ad->B:97:0x00ad], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00ad A[SYNTHETIC] */
    @Override // e23.a
    public final Object invoke() {
        GenericDeclaration declaredConstructor;
        o23.i<Constructor<?>> iVarF;
        t23.l lVarD;
        Member memberC;
        c53.h.a aVar;
        Object next;
        t23.v vVar;
        List<t23.j1> listF;
        Iterator<T> it;
        k23.l<Object>[] lVarArr = t0.f122612n;
        m4 m4Var = m4.f122535a;
        t0 t0Var = this.f122603a;
        t23.v vVarE = t0Var.e();
        i3 i3Var = t0Var.f122613h;
        m4Var.getClass();
        a2 a2VarC = m4.c(vVarE);
        if (a2VarC instanceof a2.e) {
            t23.v vVarE2 = t0Var.e();
            t23.l lVarD2 = vVarE2.d();
            lVarD2.getClass();
            if (b43.j.c(lVarD2) && (vVarE2 instanceof t23.k) && ((t23.k) vVarE2).L()) {
                throw new w3(t0Var.e().d() + " cannot have default arguments");
            }
            t23.v vVarE3 = t0Var.e();
            List<t23.j1> listF2 = vVarE3.f();
            listF2.getClass();
            if (listF2.isEmpty()) {
                lVarD = vVarE3.d();
                lVarD.getClass();
                if (b43.j.e(lVarD)) {
                    memberC = t0Var.A().c();
                    memberC.getClass();
                    if (Modifier.isStatic(memberC.getModifiers())) {
                        aVar = new c53.h.a(f43.e.j(vVarE3, false));
                        loop1: while (true) {
                            if (aVar.hasNext()) {
                                next = null;
                                break;
                            }
                            next = aVar.next();
                            listF = ((t23.b) next).f();
                            listF.getClass();
                            if (listF.isEmpty()) {
                                it = listF.iterator();
                                while (it.hasNext()) {
                                    if (((t23.j1) it.next()).h0()) {
                                        break loop1;
                                    }
                                }
                            }
                        }
                        if (next instanceof t23.v) {
                            vVar = (t23.v) next;
                        } else {
                            vVar = null;
                        }
                    } else {
                        vVar = null;
                    }
                } else {
                    vVar = null;
                }
            } else {
                Iterator<T> it3 = listF2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        lVarD = vVarE3.d();
                        lVarD.getClass();
                        if (b43.j.e(lVarD)) {
                            memberC = t0Var.A().c();
                            memberC.getClass();
                            if (Modifier.isStatic(memberC.getModifiers())) {
                                aVar = new c53.h.a(f43.e.j(vVarE3, false));
                                loop1: while (true) {
                                    if (aVar.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = aVar.next();
                                    listF = ((t23.b) next).f();
                                    listF.getClass();
                                    if (listF.isEmpty()) {
                                        it = listF.iterator();
                                        while (it.hasNext()) {
                                            if (((t23.j1) it.next()).h0()) {
                                                break loop1;
                                                break loop1;
                                            }
                                        }
                                    }
                                }
                                if (next instanceof t23.v) {
                                    vVar = (t23.v) next;
                                }
                            }
                        }
                    } else if (((t23.j1) it3.next()).h0()) {
                    }
                    vVar = null;
                }
            }
            if (vVar != null) {
                m4.f122535a.getClass();
                w33.d.b bVar = ((a2.e) m4.c(vVar)).f122391a;
                declaredConstructor = i3Var.F(bVar.f181895a, bVar.f181896b, true);
            } else {
                w33.d.b bVar2 = ((a2.e) a2VarC).f122391a;
                String str = bVar2.f181895a;
                String str2 = bVar2.f181896b;
                Member memberC2 = t0Var.A().c();
                memberC2.getClass();
                declaredConstructor = i3Var.F(str, str2, !Modifier.isStatic(memberC2.getModifiers()));
            }
        } else {
            if (a2VarC instanceof a2.d) {
                if (t0Var.C()) {
                    Class<?> clsJ = i3Var.j();
                    List<k23.k> parameters = t0Var.getParameters();
                    ArrayList arrayList = new ArrayList(p13.y.r(parameters, 10));
                    Iterator<T> it4 = parameters.iterator();
                    while (it4.hasNext()) {
                        String name = ((k23.k) it4.next()).getName();
                        name.getClass();
                        arrayList.add(name);
                    }
                    return new o23.a(clsJ, arrayList, o23.a.EnumC2467a.CALL_BY_NAME, o23.a.b.KOTLIN, null, 16, null);
                }
                String str3 = ((a2.d) a2VarC).f122389a.f181896b;
                i3Var.getClass();
                str3.getClass();
                Class<?> clsJ2 = i3Var.j();
                ArrayList arrayList2 = new ArrayList();
                i3.E(arrayList2, i3Var.N(str3, false).f122509a, true);
                Unit unit = Unit.INSTANCE;
                try {
                    Class[] clsArr = (Class[]) arrayList2.toArray(new Class[0]);
                    declaredConstructor = clsJ2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                } catch (NoSuchMethodException unused) {
                    declaredConstructor = null;
                }
            } else if (a2VarC instanceof a2.a) {
                List<Method> list = ((a2.a) a2VarC).f122386a;
                Class<?> clsJ3 = i3Var.j();
                ArrayList arrayList3 = new ArrayList(p13.y.r(list, 10));
                Iterator<T> it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(((Method) it5.next()).getName());
                }
                return new o23.a(clsJ3, arrayList3, o23.a.EnumC2467a.CALL_BY_NAME, o23.a.b.JAVA, list);
            }
            declaredConstructor = null;
        }
        if (declaredConstructor instanceof Constructor) {
            iVarF = t0Var.E((Constructor) declaredConstructor, t0Var.e(), true);
        } else if (!(declaredConstructor instanceof Method)) {
            iVarF = null;
        } else if (t0Var.e().getAnnotations().z(s4.f122608a) != null) {
            t23.l lVarD3 = t0Var.e().d();
            lVarD3.getClass();
            if (((t23.e) lVarD3).s0()) {
                iVarF = t0Var.F((Method) declaredConstructor, t0Var.A().a());
            } else {
                Method method = (Method) declaredConstructor;
                iVarF = gg.b.H(t0Var) ? new o23.i.h.b(method) : new o23.i.h.f(method);
            }
        } else {
            iVarF = t0Var.F((Method) declaredConstructor, t0Var.A().a());
        }
        if (iVarF != null) {
            return gl.b.o(t0Var.e(), iVarF, true);
        }
        return null;
    }
}
