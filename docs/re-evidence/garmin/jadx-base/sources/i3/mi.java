package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class mi implements e23.q<e23.p<? super p3.m, ? super Integer, ? extends Unit>, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x5.l0 f89023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2.j f89024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sg f89025c;

    public mi(x5.l0 l0Var, a2.j jVar, sg sgVar) {
        this.f89023a = l0Var;
        this.f89024b = jVar;
        this.f89025c = sgVar;
    }

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
    @Override // e23.q
    public final Unit invoke(e23.p<? super p3.m, ? super Integer, ? extends Unit> pVar, p3.m mVar, Integer num) {
        e23.p<? super p3.m, ? super Integer, ? extends Unit> pVar2 = pVar;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar2.r(pVar2) ? 4 : 2;
        }
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            ba baVar = ba.f87580a;
            String str = this.f89023a.f188878a.f157138b;
            x5.r0.f188941a.getClass();
            nb0.b bVar = x5.r0.a.f188943b;
            g6.f.a aVar = g6.f.f75994b;
            c2.l2 l2VarA = c2.l.a(0);
            a2.j jVar = this.f89024b;
            sg sgVar = this.f89025c;
            baVar.b(str, pVar2, true, true, bVar, jVar, false, null, null, null, null, null, null, null, sgVar, l2VarA, z3.f.c(769667466, new li(jVar, sgVar), mVar2), mVar2, ((iIntValue << 3) & 112) | 224640, 14352384, 16320);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
