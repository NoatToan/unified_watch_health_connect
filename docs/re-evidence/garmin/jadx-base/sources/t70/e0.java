package t70;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import l72.p2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e0 implements e23.r<j02.j, Boolean, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f162838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f162839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<List<c1>> f162840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f162841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f162842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f162843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b92.a.C0235a f162844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f162845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f162846i;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(c1 c1Var, l0 l0Var, x3<? extends List<? extends c1>> x3Var, String str, String str2, String str3, b92.a.C0235a c0235a, float f14, int i14) {
        this.f162838a = c1Var;
        this.f162839b = l0Var;
        this.f162840c = x3Var;
        this.f162841d = str;
        this.f162842e = str2;
        this.f162843f = str3;
        this.f162844g = c0235a;
        this.f162845h = f14;
        this.f162846i = i14;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
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
    @Override // e23.r
    public final Unit invoke(j02.j jVar, Boolean bool, p3.m mVar, Integer num) {
        int i14;
        h4.r rVarO;
        j02.j jVar2 = jVar;
        boolean zBooleanValue = bool.booleanValue();
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        jVar2.getClass();
        if ((iIntValue & 6) == 0) {
            i14 = (mVar2.B(jVar2) ? 4 : 2) | iIntValue;
        } else {
            i14 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i14 |= mVar2.h(zBooleanValue) ? 32 : 16;
        }
        if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p2 p2Var = p2.f111205a;
            c1 c1Var = this.f162838a;
            boolean z14 = ((c1.b) c1Var).f162823c;
            p3.m.a aVar = p3.m.f135153a;
            l0 l0Var = this.f162839b;
            if (z14) {
                mVar2.C(1499416924);
                int i15 = i14;
                h4.r.a aVar2 = h4.r.S;
                boolean zR = mVar2.r(l0Var) | mVar2.B(c1Var);
                Object objQ = mVar2.q();
                if (zR) {
                    objQ = new x(l0Var, c1Var);
                    mVar2.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new x(l0Var, c1Var);
                        mVar2.K(objQ);
                    }
                }
                e23.a aVar3 = (e23.a) objQ;
                x3<List<c1>> x3Var = this.f162840c;
                boolean zB = mVar2.B(x3Var) | mVar2.B(c1Var) | mVar2.r(l0Var);
                Object objQ2 = mVar2.q();
                if (zB) {
                    objQ2 = new y(c1Var, l0Var, x3Var);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new y(c1Var, l0Var, x3Var);
                        mVar2.K(objQ2);
                    }
                }
                e23.a aVar4 = (e23.a) objQ2;
                boolean zB2 = mVar2.B(x3Var) | mVar2.B(c1Var) | mVar2.r(l0Var);
                Object objQ3 = mVar2.q();
                if (zB2) {
                    objQ3 = new z(c1Var, l0Var, x3Var);
                    mVar2.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new z(c1Var, l0Var, x3Var);
                        mVar2.K(objQ3);
                    }
                }
                rVarO = jVar2.a(og.a.a0(aVar2, zBooleanValue, aVar3, aVar4, (e23.a) objQ3, this.f162841d, this.f162842e, this.f162843f, mVar2, (i15 & 112) | 6), (View) mVar2.A(AndroidCompositionLocals_androidKt.f6046f), new ig2.d(29), new ik2.b(23));
                mVar2.f();
            } else {
                mVar2.C(1500596939);
                h4.r.a aVar5 = h4.r.S;
                boolean zR2 = mVar2.r(l0Var) | mVar2.B(c1Var);
                Object objQ4 = mVar2.q();
                if (zR2) {
                    objQ4 = new a0(l0Var, c1Var);
                    mVar2.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new a0(l0Var, c1Var);
                        mVar2.K(objQ4);
                    }
                }
                rVarO = og.a.O(aVar5, (e23.a) objQ4, this.f162841d, mVar2);
                mVar2.f();
            }
            h4.r rVar = rVarO;
            b92.a aVarB = this.f162844g.b();
            z3.e eVarC = z3.f.c(362512017, new d0(this.f162845h, c1Var, l0Var, this.f162846i), mVar2);
            int i16 = b92.a.f16960b;
            p2Var.f(rVar, eVarC, aVarB, false, false, null, null, mVar2, 48, 120);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
