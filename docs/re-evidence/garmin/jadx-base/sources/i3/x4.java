package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class x4 implements e23.q<q5, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f90271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f90272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f90273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<Long, Long, Unit> f90274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l<Long, Unit> f90275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l3.e0 f90276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j23.l f90277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l3 f90278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bc f90279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b3 f90280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m4.b0 f90281k;

    /* JADX WARN: Multi-variable type inference failed */
    public x4(Long l14, Long l15, long j8, e23.p<? super Long, ? super Long, Unit> pVar, e23.l<? super Long, Unit> lVar, l3.e0 e0Var, j23.l lVar2, l3 l3Var, bc bcVar, b3 b3Var, m4.b0 b0Var) {
        this.f90271a = l14;
        this.f90272b = l15;
        this.f90273c = j8;
        this.f90274d = pVar;
        this.f90275e = lVar;
        this.f90276f = e0Var;
        this.f90277g = lVar2;
        this.f90278h = l3Var;
        this.f90279i = bcVar;
        this.f90280j = b3Var;
        this.f90281k = b0Var;
    }

    @Override // e23.q
    public final Unit invoke(q5 q5Var, p3.m mVar, Integer num) {
        int i14 = q5Var.f89412a;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar2.k(i14) ? 4 : 2;
        }
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            q5.f89410b.getClass();
            if (i14 == 0) {
                mVar2.C(-619517270);
                w4.b(this.f90271a, this.f90272b, this.f90273c, this.f90274d, this.f90275e, this.f90276f, this.f90277g, this.f90278h, this.f90279i, this.f90280j, mVar2, 0);
                mVar2.f();
            } else if (i14 == q5.f89411c) {
                mVar2.C(-619495944);
                o4.a(this.f90271a, this.f90272b, this.f90274d, this.f90276f, this.f90277g, this.f90278h, this.f90279i, this.f90280j, this.f90281k, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.C(-2023979101);
                mVar2.f();
            }
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
