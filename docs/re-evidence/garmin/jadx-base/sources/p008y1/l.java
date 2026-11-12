package p008y1;

import a5.j;
import n4.c;
import p005kotlin.Unit;
import u1.r1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f193386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f193387c;

    public /* synthetic */ l(p pVar, a aVar, int i14) {
        this.f193385a = i14;
        this.f193386b = pVar;
        this.f193387c = aVar;
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
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f193385a) {
            case 0:
                p pVar = this.f193386b;
                r<T> rVar = pVar.f193507x;
                long j8 = ((c) obj).f123544a;
                float fD = rVar.d(Float.intBitsToFloat((int) (pVar.f193508y == b2.Vertical ? j8 & 4294967295L : j8 >> 32)));
                long jQ2 = p.q2(pVar, fD - pVar.f193507x.e());
                this.f193387c.a(fD, 0.0f);
                return c.a(jQ2);
            default:
                long j14 = ((e0.b) obj).f193174a;
                p pVar2 = this.f193386b;
                long jK = c.k(pVar2.r2() ? -1.0f : 1.0f, j14);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (pVar2.f193508y == b2.Vertical ? jK & 4294967295L : jK >> 32));
                r1 r1Var = pVar2.A;
                a aVar = this.f193387c;
                if (r1Var == null) {
                    aVar.a(pVar2.f193507x.d(fIntBitsToFloat), 0.0f);
                } else {
                    long jQ3 = p.q2(pVar2, fIntBitsToFloat);
                    j.f1233b.getClass();
                    c.a(r1Var.b(j.f1234c, jQ3, new l(pVar2, aVar, 0)));
                }
                return Unit.INSTANCE;
        }
    }
}
