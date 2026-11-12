package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class n0 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f89036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.q<c2.h2, p3.m, Integer, Unit> f89038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f89039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f89040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f89041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f89042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f89043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f89044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f89045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f89046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e23.q<c2.a0, p3.m, Integer, Unit> f89048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e23.q<fe, p3.m, Integer, Unit> f89049n;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(a1 a1Var, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.q<? super c2.h2, ? super p3.m, ? super Integer, Unit> qVar, float f14, float f15, boolean z14, o4.r1 r1Var, long j8, long j14, float f16, float f17, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar2, e23.q<? super fe, ? super p3.m, ? super Integer, Unit> qVar3) {
        this.f89036a = a1Var;
        this.f89037b = pVar;
        this.f89038c = qVar;
        this.f89039d = f14;
        this.f89040e = f15;
        this.f89041f = z14;
        this.f89042g = r1Var;
        this.f89043h = j8;
        this.f89044i = j14;
        this.f89045j = f16;
        this.f89046k = f17;
        this.f89047l = pVar2;
        this.f89048m = qVar2;
        this.f89049n = qVar3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0083  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            a1 a1Var = this.f89036a;
            mc mcVar = a1Var.f87409a;
            z3.e eVarC = z3.f.c(-519581786, new k0(this.f89038c, this.f89039d), mVar2);
            z3.e eVarC2 = z3.f.c(-815624571, new l0(this.f89036a, this.f89039d, this.f89040e, this.f89041f, this.f89042g, this.f89043h, this.f89044i, this.f89045j, this.f89046k, this.f89047l, this.f89048m), mVar2);
            z3.e eVarC3 = z3.f.c(-1111667356, new m0(this.f89049n, a1Var), mVar2);
            boolean zB = mVar2.B(a1Var);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new h62.j(a1Var, 29);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h62.j(a1Var, 29);
                    mVar2.K(objQ);
                }
            }
            z0.b(this.f89037b, eVarC, eVarC2, eVarC3, (e23.a) objQ, mcVar, mVar2, 3504);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
