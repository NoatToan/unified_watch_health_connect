package r21;

import java.util.List;
import l72.p2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f149502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f149503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.q f149504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f149506e;

    public k(List list, Object obj, e23.q qVar, int i14, e23.l lVar) {
        this.f149502a = list;
        this.f149503b = obj;
        this.f149504c = qVar;
        this.f149505d = i14;
        this.f149506e = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
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
    @Override // e23.r
    public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
        int i14;
        e2.d dVar2 = dVar;
        int iIntValue = num.intValue();
        p3.m mVar2 = mVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
        } else {
            i14 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i14 |= mVar2.k(iIntValue) ? 32 : 16;
        }
        if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object obj = this.f149502a.get(iIntValue);
            mVar2.C(1663760721);
            boolean zG = s.g(obj, this.f149503b);
            c.f149479a.getClass();
            z3.e eVar = c.f149482d;
            p2 p2Var = p2.f111205a;
            String str = (String) this.f149504c.invoke(obj, mVar2, Integer.valueOf((this.f149505d >> 6) & 8));
            if (!zG) {
                eVar = null;
            }
            z3.e eVar2 = eVar;
            e23.l lVar = this.f149506e;
            boolean zB = mVar2.B(lVar) | mVar2.r(obj);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new h(lVar, obj);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h(lVar, obj);
                    mVar2.K(objQ);
                }
            }
            p2Var.g(str, null, null, null, eVar2, false, zG, (e23.a) objQ, mVar2, 0, 174);
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
