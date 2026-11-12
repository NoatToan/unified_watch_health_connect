package cg1;

import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import com.garmin.android.apps.connectmobile.segments.presentation.SegmentDetailsActivity;
import h5.e0;
import l72.x0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SegmentDetailsActivity f27153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SegmentDetailsDTO f27155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f27156e;

    public /* synthetic */ k(SegmentDetailsActivity segmentDetailsActivity, String str, SegmentDetailsDTO segmentDetailsDTO, String str2, int i14) {
        this.f27152a = i14;
        this.f27153b = segmentDetailsActivity;
        this.f27154c = str;
        this.f27155d = segmentDetailsDTO;
        this.f27156e = str2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        switch (this.f27152a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                SegmentDetailsActivity.a aVar = SegmentDetailsActivity.Z;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1707378839, new k(this.f27153b, this.f27154c, this.f27155d, this.f27156e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                SegmentDetailsActivity.a aVar2 = SegmentDetailsActivity.Z;
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(aVar3, mVar);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    x0 x0Var = x0.f111346a;
                    float f14 = 16;
                    g6.f.a aVar5 = g6.f.f75994b;
                    h4.r rVarY = c2.l.y(aVar3, f14);
                    SegmentDetailsActivity segmentDetailsActivity = this.f27153b;
                    String str = this.f27154c;
                    SegmentDetailsDTO segmentDetailsDTO = this.f27155d;
                    z3.e eVarC = z3.f.c(-475856838, new m(segmentDetailsActivity, str, segmentDetailsDTO), mVar);
                    int i14 = (x0.f111348c << 6) | 54;
                    x0Var.e(rVarY, eVarC, mVar, i14, 0);
                    x0Var.e(c2.l.C(aVar3, f14, 0.0f, f14, f14, 2), z3.f.c(223659363, new m(segmentDetailsDTO, segmentDetailsActivity, this.f27156e), mVar), mVar, i14, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }
}
