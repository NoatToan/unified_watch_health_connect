package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ia implements e23.q<e23.p<? super p3.m, ? super Integer, ? extends Unit>, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f88417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f88418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f88419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x5.r0 f88420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2.j f88421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f88422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ sg f88430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f88431o;

    /* JADX WARN: Multi-variable type inference failed */
    public ia(String str, boolean z14, boolean z15, x5.r0 r0Var, a2.j jVar, boolean z16, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, e23.p<? super p3.m, ? super Integer, Unit> pVar4, e23.p<? super p3.m, ? super Integer, Unit> pVar5, e23.p<? super p3.m, ? super Integer, Unit> pVar6, e23.p<? super p3.m, ? super Integer, Unit> pVar7, sg sgVar, o4.r1 r1Var) {
        this.f88417a = str;
        this.f88418b = z14;
        this.f88419c = z15;
        this.f88420d = r0Var;
        this.f88421e = jVar;
        this.f88422f = z16;
        this.f88423g = pVar;
        this.f88424h = pVar2;
        this.f88425i = pVar3;
        this.f88426j = pVar4;
        this.f88427k = pVar5;
        this.f88428l = pVar6;
        this.f88429m = pVar7;
        this.f88430n = sgVar;
        this.f88431o = r1Var;
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
            o4.r1 r1Var = this.f88431o;
            boolean z14 = this.f88418b;
            boolean z15 = this.f88422f;
            a2.j jVar = this.f88421e;
            sg sgVar = this.f88430n;
            baVar.b(this.f88417a, pVar2, z14, this.f88419c, this.f88420d, jVar, z15, this.f88423g, this.f88424h, this.f88425i, this.f88426j, this.f88427k, this.f88428l, this.f88429m, sgVar, null, z3.f.c(-656940872, new ha(z14, z15, jVar, sgVar, r1Var), mVar2), mVar2, (iIntValue << 3) & 112, 14155776, 32768);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
