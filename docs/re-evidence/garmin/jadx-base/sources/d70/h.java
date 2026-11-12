package d70;

import c2.x2;
import e23.p;
import h4.r;
import i3.ve;
import l72.u1;
import m92.y;
import o4.d0;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f58107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f58108c;

    public /* synthetic */ h(int i14, long j8) {
        this.f58106a = 0;
        this.f58108c = i14;
        this.f58107b = j8;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f58106a;
        long j8 = this.f58107b;
        int i15 = this.f58108c;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    y.b(d0.a(j8), String.valueOf(i15), null, null, gl1.y.Q(mVar, i61.a.b(i15)), null, mVar, 384, 40);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                ((Integer) obj2).intValue();
                h81.e.a(j8, (p3.m) obj, p0.t(i15 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                u1.a(j8, (p3.m) obj, p0.t(i15 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                u1.c(j8, (p3.m) obj, p0.t(i15 | 1));
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    ve.a(x2.d(r.S, 1.0f), null, this.f58107b, 0L, 0.0f, 0.0f, null, z3.f.c(1521811253, new ba2.e(i15, 10), mVar2), mVar2, 12582918, 122);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h(long j8, int i14, int i15) {
        this.f58106a = i15;
        this.f58107b = j8;
        this.f58108c = i14;
    }
}
