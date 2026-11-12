package l33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p33.n1;
import p43.c2;

/* JADX INFO: loaded from: classes3.dex */
public class o implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f109792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k33.i f109793b;

    public o(a0 a0Var, k33.i iVar) {
        this.f109792a = a0Var;
        this.f109793b = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l33.a0, l33.u0] */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [j33.b] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [j33.b, w23.k, w23.x] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.a
    public final Object invoke() {
        Object obj;
        ?? r14;
        ?? arrayList;
        ?? r26;
        o13.p pVar;
        ?? r15 = this.f109792a;
        o33.f fVar = r15.f109695o;
        k33.i iVar = r15.f109810b;
        t23.e eVar = r15.f109694n;
        List<o33.j> listP = fVar.p();
        ArrayList arrayList2 = new ArrayList(listP.size());
        for (o33.j jVar : listP) {
            k33.f fVarN = gg.b.N(iVar, jVar);
            k33.c cVar = iVar.f102785a;
            j33.b bVarR0 = j33.b.R0(eVar, fVarN, false, cVar.f102760j.a(jVar));
            k33.i iVar2 = new k33.i(cVar, new k33.k(iVar, bVarR0, jVar, eVar.q().size()), iVar.f102787c);
            u0.b bVarU = u0.u(iVar2, bVarR0, jVar.f());
            List<t23.d1> listQ = eVar.q();
            listQ.getClass();
            ArrayList typeParameters = jVar.getTypeParameters();
            ArrayList arrayList3 = new ArrayList(p13.y.r(typeParameters, 10));
            Iterator it = typeParameters.iterator();
            while (it.hasNext()) {
                t23.d1 d1VarA = iVar2.f102786b.a((o33.u) it.next());
                d1VarA.getClass();
                arrayList3.add(d1VarA);
            }
            bVarR0.Q0(bVarU.f109827a, h33.l0.a(jVar.getVisibility()), p13.h0.C0(listQ, arrayList3));
            bVarR0.K0(false);
            bVarR0.L0(bVarU.f109828b);
            bVarR0.M0(eVar.p());
            iVar2.f102785a.f102757g.getClass();
            arrayList2.add(bVarR0);
        }
        boolean zX = fVar.x();
        k33.i iVar3 = this.f109793b;
        if (zX) {
            u23.h.f168226x0.getClass();
            j33.b bVarR1 = j33.b.R0(eVar, u23.h.a.f168228b, true, iVar.f102785a.f102760j.a(fVar));
            ArrayList<o33.s> arrayListV = fVar.v();
            ArrayList arrayList4 = new ArrayList(arrayListV.size());
            m33.a aVarP = gg.b.P(c2.COMMON, false, null, 6);
            int i14 = 0;
            for (o33.s sVar : arrayListV) {
                m33.d dVar = iVar.f102788d;
                k33.c cVar2 = iVar.f102785a;
                p43.n0 n0VarD = dVar.d(sVar.getType(), aVarP);
                u23.h.f168226x0.getClass();
                arrayList4.add(new w23.x0(bVarR1, null, i14, u23.h.a.f168228b, sVar.getName(), n0VarD, false, false, false, null, cVar2.f102760j.a(sVar)));
                i14++;
            }
            obj = null;
            bVarR1.L0(false);
            t23.r visibility = eVar.getVisibility();
            visibility.getClass();
            if (visibility.equals(h33.s.f81497b)) {
                visibility = h33.s.f81498c;
                visibility.getClass();
            }
            bVarR1.P0(arrayList4, visibility);
            bVarR1.K0(false);
            bVarR1.M0(eVar.p());
            String strA = q33.b0.a(bVarR1, 2);
            if (arrayList2.isEmpty()) {
                arrayList2.add(bVarR1);
                ((i33.j.a) iVar3.f102785a.f102757g).getClass();
                break;
            }
            Iterator it3 = arrayList2.iterator();
            do {
                if (!it3.hasNext()) {
                    arrayList2.add(bVarR1);
                    ((i33.j.a) iVar3.f102785a.f102757g).getClass();
                    break;
                }
            } while (!q33.b0.a((t23.d) it3.next(), 2).equals(strA));
        } else {
            obj = null;
        }
        iVar3.f102785a.f102774x.g(eVar, arrayList2, iVar3);
        n1 n1Var = iVar3.f102785a.f102768r;
        boolean zIsEmpty = arrayList2.isEmpty();
        List listL = arrayList2;
        if (zIsEmpty) {
            boolean zQ = fVar.q();
            fVar.n();
            if (zQ) {
                u23.h.f168226x0.getClass();
                u23.h.a.C3153a c3153a = u23.h.a.f168228b;
                k33.c cVar3 = iVar.f102785a;
                m33.d dVar2 = iVar.f102788d;
                j33.b bVarR2 = j33.b.R0(eVar, c3153a, true, cVar3.f102760j.a(fVar));
                if (zQ) {
                    List listE = fVar.e();
                    arrayList = new ArrayList(listE.size());
                    m33.a aVarP2 = gg.b.P(c2.COMMON, true, null, 6);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj2 : listE) {
                        if (p005kotlin.jvm.internal.s.g(((o33.o) obj2).getName(), h33.c0.f81420b)) {
                            arrayList5.add(obj2);
                        } else {
                            arrayList6.add(obj2);
                        }
                    }
                    o13.p pVar2 = new o13.p(arrayList5, arrayList6);
                    List list = (List) pVar2.f128594a;
                    List<o33.o> list2 = (List) pVar2.f128595b;
                    list.size();
                    o33.o oVar = (o33.o) p13.h0.d0(list);
                    if (oVar != null) {
                        o33.t tVarD = oVar.D();
                        if (tVarD instanceof o33.e) {
                            o33.e eVar2 = (o33.e) tVarD;
                            pVar = new o13.p(dVar2.c(eVar2, aVarP2, true), dVar2.d(eVar2.C(), aVarP2));
                        } else {
                            pVar = new o13.p(dVar2.d(tVarD, aVarP2), null);
                        }
                        j33.b bVar = bVarR2;
                        r15.v(arrayList, bVar, 0, oVar, (p43.n0) pVar.f128594a, (p43.n0) pVar.f128595b);
                        r14 = bVar;
                    } else {
                        r14 = bVarR2;
                    }
                    int i15 = oVar != null ? 1 : 0;
                    int i16 = 0;
                    for (o33.o oVar2 : list2) {
                        r15.v(arrayList, r14, i16 + i15, oVar2, dVar2.d(oVar2.D(), aVarP2), null);
                        i16++;
                    }
                } else {
                    r14 = bVarR2;
                    arrayList = Collections.EMPTY_LIST;
                }
                r14.L0(false);
                t23.r visibility2 = eVar.getVisibility();
                visibility2.getClass();
                if (visibility2.equals(h33.s.f81497b)) {
                    visibility2 = h33.s.f81498c;
                    visibility2.getClass();
                }
                r14.P0(arrayList, visibility2);
                r14.K0(true);
                r14.M0(eVar.p());
                ((i33.j.a) iVar.f102785a.f102757g).getClass();
                r26 = r14;
            } else {
                r26 = obj;
            }
            listL = p13.x.l(r26);
        }
        return p13.h0.b1(n1Var.c(iVar3, listL));
    }
}
