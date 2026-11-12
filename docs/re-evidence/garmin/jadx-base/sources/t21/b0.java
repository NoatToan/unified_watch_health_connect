package t21;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i3.n8;
import l72.p2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class b0 implements e23.r<j02.j, Boolean, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s21.n f161818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<s21.m.c, Unit> f161819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s21.m f161820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u21.i f161821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.p<Integer, Integer, Unit> f161822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f161823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f161824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f161825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b92.a f161826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f161827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f161828k;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(s21.n nVar, e23.l<? super s21.m.c, Unit> lVar, s21.m mVar, u21.i iVar, e23.p<? super Integer, ? super Integer, Unit> pVar, String str, String str2, String str3, b92.a aVar, String str4, float f14) {
        this.f161818a = nVar;
        this.f161819b = lVar;
        this.f161820c = mVar;
        this.f161821d = iVar;
        this.f161822e = pVar;
        this.f161823f = str;
        this.f161824g = str2;
        this.f161825h = str3;
        this.f161826i = aVar;
        this.f161827j = str4;
        this.f161828k = f14;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:49:0x0134  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ca  */
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
        p3.m mVar2;
        h4.r rVarE;
        float f14;
        j02.j jVar2 = jVar;
        boolean zBooleanValue = bool.booleanValue();
        p3.m mVar3 = mVar;
        int iIntValue = num.intValue();
        jVar2.getClass();
        if ((iIntValue & 6) == 0) {
            i14 = (mVar3.B(jVar2) ? 4 : 2) | iIntValue;
        } else {
            i14 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i14 |= mVar3.h(zBooleanValue) ? 32 : 16;
        }
        if (mVar3.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p2 p2Var = p2.f111205a;
            boolean z14 = this.f161818a.f156151a;
            e23.l<s21.m.c, Unit> lVar = this.f161819b;
            p3.m.a aVar = p3.m.f135153a;
            s21.m mVar4 = this.f161820c;
            if (z14) {
                mVar3.C(-1508454344);
                h4.r.a aVar2 = h4.r.S;
                boolean zB = mVar3.B(lVar) | mVar3.B(mVar4);
                Object objQ = mVar3.q();
                if (zB) {
                    objQ = new v(lVar, mVar4);
                    mVar3.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new v(lVar, mVar4);
                        mVar3.K(objQ);
                    }
                }
                e23.a aVar3 = (e23.a) objQ;
                u21.i iVar = this.f161821d;
                boolean zR = mVar3.r(iVar) | mVar3.B(mVar4);
                e23.p<Integer, Integer, Unit> pVar = this.f161822e;
                boolean zB2 = zR | mVar3.B(pVar);
                Object objQ2 = mVar3.q();
                if (zB2) {
                    objQ2 = new w(iVar, mVar4, pVar);
                    mVar3.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new w(iVar, mVar4, pVar);
                        mVar3.K(objQ2);
                    }
                }
                e23.a aVar4 = (e23.a) objQ2;
                boolean zR2 = mVar3.r(iVar) | mVar3.B(mVar4) | mVar3.B(pVar);
                Object objQ3 = mVar3.q();
                if (zR2) {
                    objQ3 = new x(iVar, mVar4, pVar);
                    mVar3.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new x(iVar, mVar4, pVar);
                        mVar3.K(objQ3);
                    }
                }
                e23.a aVar5 = (e23.a) objQ3;
                if (zBooleanValue) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f14 = j92.b.f97899b.f97918c;
                } else {
                    f14 = 0;
                    g6.f.a aVar6 = g6.f.f75994b;
                }
                x3 x3VarA = s1.f.a(f14, null, "", mVar3, 384, 10);
                mVar2 = mVar3;
                String str = this.f161823f;
                boolean zB3 = mVar2.B(str) | mVar2.B(aVar3);
                String str2 = this.f161824g;
                boolean zB4 = zB3 | mVar2.B(str2) | mVar2.B(aVar4);
                String str3 = this.f161825h;
                boolean zB5 = zB4 | mVar2.B(str3) | mVar2.B(aVar5);
                Object objQ4 = mVar2.q();
                if (zB5) {
                    s sVar = new s(str, str2, str3, aVar3, aVar4, aVar5, 0);
                    mVar2.K(sVar);
                    objQ4 = sVar;
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        s sVar2 = new s(str, str2, str3, aVar3, aVar4, aVar5, 0);
                        mVar2.K(sVar2);
                        objQ4 = sVar2;
                    }
                }
                h4.r rVarC = p5.v.c((e23.l) objQ4, aVar2, true);
                long jZ = fb1.c.z(d92.b.f58623a, mVar2);
                d92.b.f58625c.getClass();
                rVarE = jVar2.a(l4.w.a(u1.n.e(rVarC, jZ, k2.i.a(j92.b.f97899b.f97918c)), ((g6.f) x3VarA.getF182175a()).f75997a, null, false, 30), (View) mVar2.A(AndroidCompositionLocals_androidKt.f6046f), new ig2.d(29), new ik2.b(23));
                mVar2.f();
            } else {
                mVar2 = mVar3;
                mVar2.C(-1507275631);
                h4.r.a aVar7 = h4.r.S;
                boolean zB6 = mVar2.B(lVar) | mVar2.B(mVar4);
                Object objQ5 = mVar2.q();
                if (zB6) {
                    objQ5 = new y(lVar, mVar4);
                    mVar2.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new y(lVar, mVar4);
                        mVar2.K(objQ5);
                    }
                }
                e23.a aVar8 = (e23.a) objQ5;
                String str4 = this.f161823f;
                boolean zB7 = mVar2.B(str4) | mVar2.B(aVar8);
                Object objQ6 = mVar2.q();
                if (zB7) {
                    objQ6 = new n8(str4, aVar8, 2);
                    mVar2.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new n8(str4, aVar8, 2);
                        mVar2.K(objQ6);
                    }
                }
                h4.r rVarC2 = p5.v.c((e23.l) objQ6, aVar7, true);
                long jZ2 = fb1.c.z(d92.b.f58623a, mVar2);
                d92.b.f58625c.getClass();
                rVarE = u1.n.e(rVarC2, jZ2, k2.i.a(j92.b.f97899b.f97918c));
                mVar2.f();
            }
            h4.r rVar = rVarE;
            z3.e eVarC = z3.f.c(1494021062, new a0(this.f161818a, this.f161827j, this.f161819b, this.f161820c, this.f161828k), mVar2);
            int i15 = b92.a.f16960b;
            p2Var.f(rVar, eVarC, this.f161826i, false, false, null, null, mVar2, 48, 120);
        } else {
            mVar3.e();
        }
        return Unit.INSTANCE;
    }
}
