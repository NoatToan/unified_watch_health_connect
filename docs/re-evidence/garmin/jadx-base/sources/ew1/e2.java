package ew1;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.g3;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f66418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComposeView f66419c;

    public /* synthetic */ e2(h2 h2Var, ComposeView composeView, int i14) {
        this.f66417a = i14;
        this.f66418b = h2Var;
        this.f66419c = composeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Integer numValueOf;
        Double dValueOf;
        List listI0;
        jv1.e eVar;
        bg0.a.b bVar;
        int i14 = this.f66417a;
        ComposeView composeView = this.f66419c;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                h2.a aVar = h2.f66500d;
                int i15 = 1;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(185410641, new e2(this.f66418b, composeView, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                h2.a aVar2 = h2.f66500d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h2 h2Var = this.f66418b;
                    p3.p1 p1VarG = o53.f0.G(h2Var.y6().j6(), mVar2);
                    p3.p1 p1VarG2 = o53.f0.G((androidx.lifecycle.s0) h2Var.y6().f13367a1.getValue(), mVar2);
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        jv1.s sVar = (jv1.s) p1VarG.getF182175a();
                        objQ = p3.p0.n(sVar != null ? sVar.f101127f : null);
                        mVar2.K(objQ);
                    }
                    p3.p1 p1Var = (p3.p1) objQ;
                    Object objQ2 = mVar2.q();
                    if (objQ2 == c2565a) {
                        jv1.s sVar2 = (jv1.s) p1VarG.getF182175a();
                        jv1.h hVar = sVar2 != null ? sVar2.f101127f : null;
                        jv1.g gVar = hVar instanceof jv1.g ? (jv1.g) hVar : null;
                        if ((gVar != null ? gVar.f101054c : null) == null || gVar.f101054c == vt1.n.OTHER) {
                            gg0.i iVar = gVar != null ? gVar.f101055d : null;
                            int i16 = iVar == null ? -1 : h2.b.f66503a[iVar.ordinal()];
                            if (i16 == 1) {
                                bVar = bg0.a.b.MILE;
                            } else if (i16 != 2) {
                                bg0.a.f17827a.getClass();
                                bVar = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? bg0.a.b.KILOMETER : bg0.a.b.MILE;
                            } else {
                                bVar = bg0.a.b.KILOMETER;
                            }
                        } else {
                            bg0.a.f17827a.getClass();
                            bVar = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? bg0.a.b.KILOMETER : bg0.a.b.MILE;
                        }
                        objQ2 = p3.p0.n(bVar);
                        mVar2.K(objQ2);
                    }
                    p3.p1 p1Var2 = (p3.p1) objQ2;
                    fy1.i.a aVar3 = fy1.i.f73924a;
                    aw1.h hVarY6 = h2Var.y6();
                    boolean z14 = (hVarY6.b7() && hVarY6.V5()) || (hVarY6.O6() && hVarY6.U5());
                    bg0.a.b bVar2 = (bg0.a.b) p1Var2.getF182175a();
                    aVar3.getClass();
                    bVar2.getClass();
                    if (z14) {
                        numValueOf = og0.a.v(bVar2);
                    } else {
                        numValueOf = Integer.valueOf(fy1.i.a.C1501a.f73938b[bVar2.ordinal()] == 1 ? 200 : 125);
                    }
                    double dDoubleValue = numValueOf.doubleValue();
                    aw1.h hVarY7 = h2Var.y6();
                    boolean z15 = (hVarY7.b7() && hVarY7.V5()) || (hVarY7.O6() && hVarY7.U5());
                    boolean zO6 = h2Var.y6().O6();
                    bg0.a.b bVar3 = (bg0.a.b) p1Var2.getF182175a();
                    bVar3.getClass();
                    if (z15 || !zO6) {
                        dValueOf = Double.valueOf(0.0d);
                    } else {
                        dValueOf = Double.valueOf(fy1.i.a.C1501a.f73938b[bVar3.ordinal()] == 1 ? 16.1d : 10.0d);
                    }
                    double dDoubleValue2 = dValueOf.doubleValue();
                    boolean z16 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g() == gg1.o0.METRIC;
                    aw1.h hVarY8 = h2Var.y6();
                    boolean z17 = (hVarY8.b7() && hVarY8.V5()) || (hVarY8.O6() && hVarY8.U5()) || h2Var.y6().O6();
                    Context context = composeView.getContext();
                    context.getClass();
                    bg0.a.b bVar4 = bg0.a.b.MILE;
                    int i17 = 54;
                    p005kotlin.jvm.internal.j jVar = null;
                    u4.d dVar = null;
                    u4.d dVar2 = null;
                    boolean z18 = false;
                    String str = null;
                    b82.j.a aVar4 = new b82.j.a(bVar4.toString(), dVar, dVar2, bVar4.a(context), z18, str, bVar4.b(context), i17, jVar);
                    bg0.a.b bVar5 = bg0.a.b.KILOMETER;
                    List listK = p13.x.k(aVar4, new b82.j.a(bVar5.toString(), dVar, dVar2, bVar5.a(context), z18, str, bVar5.b(context), i17, jVar));
                    bg0.a.b bVar6 = (bg0.a.b) p1Var2.getF182175a();
                    jv1.s sVar3 = (jv1.s) p1VarG.getF182175a();
                    vt1.o oVar = sVar3 != null ? sVar3.f101125d : null;
                    jv1.h hVar2 = (jv1.h) p1Var.getF182175a();
                    vt1.n.a aVar5 = vt1.n.f180163d;
                    aw1.h hVarY9 = h2Var.y6();
                    boolean z19 = (hVarY9.b7() && hVarY9.V5()) || (hVarY9.O6() && hVarY9.U5());
                    aVar5.getClass();
                    if (z19) {
                        listI0 = p13.u.i0(vt1.n.values());
                    } else {
                        vt1.n[] nVarArrValues = vt1.n.values();
                        ArrayList arrayList = new ArrayList();
                        int length = nVarArrValues.length;
                        int i18 = 0;
                        while (i18 < length) {
                            vt1.o oVar2 = oVar;
                            vt1.n nVar = nVarArrValues[i18];
                            boolean z24 = z16;
                            if (nVar != vt1.n.MARATHON && nVar != vt1.n.OTHER) {
                                arrayList.add(nVar);
                            }
                            i18++;
                            oVar = oVar2;
                            z16 = z24;
                        }
                        listI0 = arrayList;
                    }
                    vt1.o oVar3 = oVar;
                    boolean z25 = z16;
                    boolean zR5 = h2Var.y6().R5();
                    int iC5 = h2Var.y6().C5("FBTSelectDistanceOrTimeFragmentCompose");
                    int iY5 = h2Var.y6().Y5();
                    Object objQ3 = mVar2.q();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ3 == c2565a2) {
                        objQ3 = new et1.b2(p1Var2, 7);
                        mVar2.K(objQ3);
                    }
                    e23.l lVar = (e23.l) objQ3;
                    Object objQ4 = mVar2.q();
                    if (objQ4 == c2565a2) {
                        objQ4 = new et1.b2(p1Var, 8);
                        mVar2.K(objQ4);
                    }
                    e23.l lVar2 = (e23.l) objQ4;
                    boolean zR = mVar2.r(h2Var);
                    Object objQ5 = mVar2.q();
                    if (zR || objQ5 == c2565a2) {
                        objQ5 = new c2(p1Var, h2Var, 1);
                        mVar2.K(objQ5);
                    }
                    h2Var.w6(z25, z17, bVar6, listK, lVar, oVar3, hVar2, listI0, dDoubleValue2, dDoubleValue, zR5, iC5, iY5, lVar2, (e23.a) objQ5, mVar2, 24576);
                    g3 g3Var = (g3) p1VarG2.getF182175a();
                    boolean z26 = (g3Var != null ? g3Var.f35300a : null) == fw.p.LOADING;
                    e.f66404a.getClass();
                    g02.s0.a(null, z26, e.f66405b, mVar2, 384, 1);
                    g3 g3Var2 = (g3) p1VarG2.getF182175a();
                    if ((g3Var2 != null ? g3Var2.f35300a : null) == fw.p.SUCCESS) {
                        g3 g3Var3 = (g3) p1VarG2.getF182175a();
                        if (g3Var3 == null || (eVar = (jv1.e) g3Var3.f35301b) == null || !eVar.f101032a) {
                            h2Var.y6().i7();
                        } else {
                            h2Var.y6().g7();
                        }
                        h2Var.y6().s7();
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
