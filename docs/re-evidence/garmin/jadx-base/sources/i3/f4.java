package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class f4 implements e23.r<r1.l, q5, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f88063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f88064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<Long, Unit> f88065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<Long, Unit> f88066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l3.e0 f88067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j23.l f88068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l3 f88069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bc f88070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b3 f88071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m4.b0 f88072j;

    /* JADX WARN: Multi-variable type inference failed */
    public f4(Long l14, long j8, e23.l<? super Long, Unit> lVar, e23.l<? super Long, Unit> lVar2, l3.e0 e0Var, j23.l lVar3, l3 l3Var, bc bcVar, b3 b3Var, m4.b0 b0Var) {
        this.f88063a = l14;
        this.f88064b = j8;
        this.f88065c = lVar;
        this.f88066d = lVar2;
        this.f88067e = e0Var;
        this.f88068f = lVar3;
        this.f88069g = l3Var;
        this.f88070h = bcVar;
        this.f88071i = b3Var;
        this.f88072j = b0Var;
    }

    @Override // e23.r
    public final Unit invoke(r1.l lVar, q5 q5Var, p3.m mVar, Integer num) {
        int i14 = q5Var.f89412a;
        p3.m mVar2 = mVar;
        num.intValue();
        p3.x1 x1Var = p3.n.f135158a;
        q5.f89410b.getClass();
        if (i14 == 0) {
            mVar2.C(1567031954);
            x3.c(this.f88063a, this.f88064b, this.f88065c, this.f88066d, this.f88067e, this.f88068f, this.f88069g, this.f88070h, this.f88071i, mVar2, 0);
            mVar2.f();
        } else if (i14 == q5.f89411c) {
            mVar2.C(1567050592);
            w2.a(this.f88063a, this.f88065c, this.f88067e, this.f88068f, this.f88069g, this.f88070h, this.f88071i, this.f88072j, mVar2, 0);
            mVar2.f();
        } else {
            mVar2.C(1334373351);
            mVar2.f();
        }
        return Unit.INSTANCE;
    }
}
