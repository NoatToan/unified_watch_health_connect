package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ah implements e23.q<e23.p<? super p3.m, ? super Integer, ? extends Unit>, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f87498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f87499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f87500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x5.r0 f87501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2.j f87502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f87503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87506i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87507j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87508k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87509l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87510m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f87511n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ sg f87512o;

    /* JADX WARN: Multi-variable type inference failed */
    public ah(String str, boolean z14, boolean z15, x5.r0 r0Var, a2.j jVar, boolean z16, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, e23.p<? super p3.m, ? super Integer, Unit> pVar4, e23.p<? super p3.m, ? super Integer, Unit> pVar5, e23.p<? super p3.m, ? super Integer, Unit> pVar6, e23.p<? super p3.m, ? super Integer, Unit> pVar7, o4.r1 r1Var, sg sgVar) {
        this.f87498a = str;
        this.f87499b = z14;
        this.f87500c = z15;
        this.f87501d = r0Var;
        this.f87502e = jVar;
        this.f87503f = z16;
        this.f87504g = pVar;
        this.f87505h = pVar2;
        this.f87506i = pVar3;
        this.f87507j = pVar4;
        this.f87508k = pVar5;
        this.f87509l = pVar6;
        this.f87510m = pVar7;
        this.f87511n = r1Var;
        this.f87512o = sgVar;
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
            wg.f90137a.b(this.f87498a, pVar2, this.f87499b, this.f87500c, this.f87501d, this.f87502e, this.f87503f, this.f87504g, this.f87505h, this.f87506i, this.f87507j, this.f87508k, this.f87509l, this.f87510m, this.f87511n, this.f87512o, null, null, mVar2, (iIntValue << 3) & 112, 100663296, 196608);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
