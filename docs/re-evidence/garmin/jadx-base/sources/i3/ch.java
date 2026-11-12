package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ch implements e23.q<e23.p<? super p3.m, ? super Integer, ? extends Unit>, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x5.l0 f87792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f87793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f87794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x5.r0 f87795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2.j f87796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f87797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87800i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87801j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87802k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87804m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f87805n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ sg f87806o;

    /* JADX WARN: Multi-variable type inference failed */
    public ch(x5.l0 l0Var, boolean z14, boolean z15, x5.r0 r0Var, a2.j jVar, boolean z16, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, e23.p<? super p3.m, ? super Integer, Unit> pVar4, e23.p<? super p3.m, ? super Integer, Unit> pVar5, e23.p<? super p3.m, ? super Integer, Unit> pVar6, e23.p<? super p3.m, ? super Integer, Unit> pVar7, o4.r1 r1Var, sg sgVar) {
        this.f87792a = l0Var;
        this.f87793b = z14;
        this.f87794c = z15;
        this.f87795d = r0Var;
        this.f87796e = jVar;
        this.f87797f = z16;
        this.f87798g = pVar;
        this.f87799h = pVar2;
        this.f87800i = pVar3;
        this.f87801j = pVar4;
        this.f87802k = pVar5;
        this.f87803l = pVar6;
        this.f87804m = pVar7;
        this.f87805n = r1Var;
        this.f87806o = sgVar;
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
            wg.f90137a.b(this.f87792a.f188878a.f157138b, pVar2, this.f87793b, this.f87794c, this.f87795d, this.f87796e, this.f87797f, this.f87798g, this.f87799h, this.f87800i, this.f87801j, this.f87802k, this.f87803l, this.f87804m, this.f87805n, this.f87806o, null, null, mVar2, (iIntValue << 3) & 112, 100663296, 196608);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
