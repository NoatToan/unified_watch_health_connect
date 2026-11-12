package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class la implements e23.q<e23.p<? super p3.m, ? super Integer, ? extends Unit>, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x5.l0 f88872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f88873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f88874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x5.r0 f88875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2.j f88876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f88877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ sg f88885n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f88886o;

    /* JADX WARN: Multi-variable type inference failed */
    public la(x5.l0 l0Var, boolean z14, boolean z15, x5.r0 r0Var, a2.j jVar, boolean z16, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, e23.p<? super p3.m, ? super Integer, Unit> pVar4, e23.p<? super p3.m, ? super Integer, Unit> pVar5, e23.p<? super p3.m, ? super Integer, Unit> pVar6, e23.p<? super p3.m, ? super Integer, Unit> pVar7, sg sgVar, o4.r1 r1Var) {
        this.f88872a = l0Var;
        this.f88873b = z14;
        this.f88874c = z15;
        this.f88875d = r0Var;
        this.f88876e = jVar;
        this.f88877f = z16;
        this.f88878g = pVar;
        this.f88879h = pVar2;
        this.f88880i = pVar3;
        this.f88881j = pVar4;
        this.f88882k = pVar5;
        this.f88883l = pVar6;
        this.f88884m = pVar7;
        this.f88885n = sgVar;
        this.f88886o = r1Var;
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
            String str = this.f88872a.f188878a.f157138b;
            o4.r1 r1Var = this.f88886o;
            boolean z14 = this.f88873b;
            boolean z15 = this.f88877f;
            a2.j jVar = this.f88876e;
            sg sgVar = this.f88885n;
            baVar.b(str, pVar2, z14, this.f88874c, this.f88875d, jVar, z15, this.f88878g, this.f88879h, this.f88880i, this.f88881j, this.f88882k, this.f88883l, this.f88884m, sgVar, null, z3.f.c(1409265477, new ka(z14, z15, jVar, sgVar, r1Var), mVar2), mVar2, (iIntValue << 3) & 112, 14155776, 32768);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
