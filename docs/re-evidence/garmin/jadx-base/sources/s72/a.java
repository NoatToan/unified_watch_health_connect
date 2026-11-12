package s72;

import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.ui.catalog.library.help.HelpActivity;
import e23.p;
import g6.h;
import java.util.List;
import java.util.Set;
import kotlin.t1;
import o4.l1;
import o72.z0;
import oe.g;
import oe.o;
import p005kotlin.Unit;
import p13.j0;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import r53.i;
import t72.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HelpActivity f157852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f157853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f157854d;

    public /* synthetic */ a(HelpActivity helpActivity, f fVar, Bundle bundle, int i14) {
        this.f157851a = i14;
        this.f157852b = helpActivity;
        this.f157853c = fVar;
        this.f157854d = bundle;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0120  */
    /* JADX WARN: Code duplicated, block: B:41:0x0127  */
    /* JADX WARN: Code duplicated, block: B:44:0x0144  */
    /* JADX WARN: Code duplicated, block: B:46:0x014b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0160  */
    /* JADX WARN: Code duplicated, block: B:51:0x0167  */
    /* JADX WARN: Code duplicated, block: B:55:0x018d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0196  */
    /* JADX WARN: Code duplicated, block: B:58:0x0199  */
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
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        int i14;
        int i15;
        boolean zB;
        Object objQ;
        m.a aVar;
        g gVar;
        boolean zB2;
        Object objQ2;
        i iVar;
        boolean zR;
        Object objQ3;
        o3.b bVar;
        int i16;
        int i17;
        int i18;
        int i19 = 0;
        int i24 = 1;
        switch (this.f157851a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                HelpActivity.a aVar2 = HelpActivity.f49800a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    lg.d.d(false, null, null, z3.f.c(1550214531, new a(this.f157852b, this.f157853c, this.f157854d, i24), mVar), mVar, 3072, 7);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                HelpActivity.a aVar3 = HelpActivity.f49800a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    mVar2.A(AndroidCompositionLocals_androidKt.f6041a);
                    g6.c cVar = (g6.c) mVar2.A(t1.f91490h);
                    oe.n.f131242a.getClass();
                    z0 z0Var = oe.n.a.f131244b;
                    o oVar = oe.n.a.f131245c;
                    z0Var.getClass();
                    oVar.getClass();
                    HelpActivity helpActivity = this.f157852b;
                    long jA = cVar.A(l1.j(oVar.a(helpActivity).f131240a.c()).g());
                    o3.b.a aVar4 = o3.b.f128750c;
                    o3.c.f128753b.getClass();
                    Set<o3.c> set = o3.c.f128756e;
                    o3.a.f128743b.getClass();
                    Set<o3.a> set2 = o3.a.f128746e;
                    aVar4.getClass();
                    float fC = h.c(jA);
                    float f14 = 0;
                    if (g6.f.b(fC, f14) < 0) {
                        obj3 = null;
                        vb.h.s("Width must not be negative");
                    } else if (set.isEmpty()) {
                        obj3 = null;
                        vb.h.s("Must support at least one size class");
                    } else {
                        List<o3.c> list = o3.c.f128757f;
                        int size = list.size();
                        int i25 = 0;
                        while (true) {
                            if (i19 < size) {
                                i14 = i24;
                                i15 = list.get(i19).f128759a;
                                if (set.contains(o3.c.a(i15))) {
                                    o3.c.f128753b.getClass();
                                    if (g6.f.b(fC, o3.c.a.a(i15)) < 0) {
                                        i25 = i15;
                                    }
                                }
                                i19++;
                                i24 = i14;
                            } else {
                                i14 = i24;
                                i15 = i25;
                            }
                        }
                        o3.a.C2468a c2468a = o3.a.f128743b;
                        float fB = h.b(jA);
                        c2468a.getClass();
                        if (g6.f.b(fB, f14) < 0) {
                            obj3 = null;
                            vb.h.s("Width must not be negative");
                        } else if (set2.isEmpty()) {
                            obj3 = null;
                            vb.h.s("Must support at least one size class");
                        } else {
                            int i26 = o3.a.f128745d;
                            List<o3.a> list2 = o3.a.f128747f;
                            int size2 = list2.size();
                            for (int i27 = 0; i27 < size2; i27++) {
                                int i28 = list2.get(i27).f128749a;
                                if (set2.contains(o3.a.a(i28))) {
                                    o3.a.f128743b.getClass();
                                    if (g6.f.b(fB, o3.a.C2468a.a(i28)) >= 0) {
                                        i26 = i28;
                                        o3.b bVar2 = new o3.b(i15, i26, null);
                                        x1 x1Var3 = n.f135158a;
                                        zB = mVar2.B(helpActivity);
                                        objQ = mVar2.q();
                                        aVar = m.f135153a;
                                        if (zB) {
                                            g.f131220a.getClass();
                                            objQ = g.a.a(helpActivity);
                                            mVar2.K(objQ);
                                        } else {
                                            aVar.getClass();
                                            if (objQ == m.a.f135155b) {
                                                g.f131220a.getClass();
                                                objQ = g.a.a(helpActivity);
                                                mVar2.K(objQ);
                                            }
                                        }
                                        gVar = (g) objQ;
                                        zB2 = mVar2.B(gVar) | mVar2.B(helpActivity);
                                        objQ2 = mVar2.q();
                                        if (zB2) {
                                            objQ2 = gVar.a(helpActivity);
                                            mVar2.K(objQ2);
                                        } else {
                                            aVar.getClass();
                                            if (objQ2 == m.a.f135155b) {
                                                objQ2 = gVar.a(helpActivity);
                                                mVar2.K(objQ2);
                                            }
                                        }
                                        iVar = (i) objQ2;
                                        j0 j0Var = j0.f134944a;
                                        zR = mVar2.r(iVar);
                                        objQ3 = mVar2.q();
                                        if (zR) {
                                            objQ3 = new i82.f(iVar, null);
                                            mVar2.K(objQ3);
                                        } else {
                                            aVar.getClass();
                                            if (objQ3 == m.a.f135155b) {
                                                objQ3 = new i82.f(iVar, null);
                                                mVar2.K(objQ3);
                                            }
                                        }
                                        i82.b bVar3 = new i82.b(bVar2, (List) p0.o((p) objQ3, j0Var, mVar2).getF182175a());
                                        bVar = bVar3.f92266a;
                                        i16 = bVar.f128751a;
                                        o3.c.f128753b.getClass();
                                        if (i16 == 0) {
                                            i17 = i14;
                                        } else {
                                            i18 = bVar.f128752b;
                                            o3.a.f128743b.getClass();
                                            if (i18 == 0) {
                                                i17 = i14;
                                            } else {
                                                i17 = -1;
                                            }
                                        }
                                        helpActivity.setRequestedOrientation(i17);
                                        helpActivity.L9(this.f157853c, this.f157854d, bVar3, mVar2, h82.c.f82429e | 512);
                                    } else {
                                        i26 = i28;
                                    }
                                }
                            }
                            o3.b bVar4 = new o3.b(i15, i26, null);
                            x1 x1Var4 = n.f135158a;
                            zB = mVar2.B(helpActivity);
                            objQ = mVar2.q();
                            aVar = m.f135153a;
                            if (zB) {
                                aVar.getClass();
                                if (objQ == m.a.f135155b) {
                                    g.f131220a.getClass();
                                    objQ = g.a.a(helpActivity);
                                    mVar2.K(objQ);
                                }
                            } else {
                                g.f131220a.getClass();
                                objQ = g.a.a(helpActivity);
                                mVar2.K(objQ);
                            }
                            gVar = (g) objQ;
                            zB2 = mVar2.B(gVar) | mVar2.B(helpActivity);
                            objQ2 = mVar2.q();
                            if (zB2) {
                                aVar.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    objQ2 = gVar.a(helpActivity);
                                    mVar2.K(objQ2);
                                }
                            } else {
                                objQ2 = gVar.a(helpActivity);
                                mVar2.K(objQ2);
                            }
                            iVar = (i) objQ2;
                            j0 j0Var2 = j0.f134944a;
                            zR = mVar2.r(iVar);
                            objQ3 = mVar2.q();
                            if (zR) {
                                aVar.getClass();
                                if (objQ3 == m.a.f135155b) {
                                    objQ3 = new i82.f(iVar, null);
                                    mVar2.K(objQ3);
                                }
                            } else {
                                objQ3 = new i82.f(iVar, null);
                                mVar2.K(objQ3);
                            }
                            i82.b bVar5 = new i82.b(bVar4, (List) p0.o((p) objQ3, j0Var2, mVar2).getF182175a());
                            bVar = bVar5.f92266a;
                            i16 = bVar.f128751a;
                            o3.c.f128753b.getClass();
                            if (i16 == 0) {
                                i17 = i14;
                            } else {
                                i18 = bVar.f128752b;
                                o3.a.f128743b.getClass();
                                if (i18 == 0) {
                                    i17 = i14;
                                } else {
                                    i17 = -1;
                                }
                            }
                            helpActivity.setRequestedOrientation(i17);
                            helpActivity.L9(this.f157853c, this.f157854d, bVar5, mVar2, h82.c.f82429e | 512);
                        }
                    }
                    return obj3;
                }
                mVar2.e();
                return Unit.INSTANCE;
        }
    }
}
