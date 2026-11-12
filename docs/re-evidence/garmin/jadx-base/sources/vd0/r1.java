package vd0;

import i3.i7;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class r1 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f177370a;

    public r1(boolean z14) {
        this.f177370a = z14;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        long jA;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            b3.b.f15502a.getClass();
            u4.d dVarA = d3.f.a();
            if (this.f177370a) {
                mVar2.C(112560313);
                d92.b.f58623a.getClass();
                jA = d92.b.a(mVar2).f().d();
                mVar2.f();
            } else {
                mVar2.C(112670332);
                d92.b.f58623a.getClass();
                jA = d92.b.a(mVar2).f().a();
                mVar2.f();
            }
            i7.b(dVarA, null, null, jA, mVar2, 48, 4);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
