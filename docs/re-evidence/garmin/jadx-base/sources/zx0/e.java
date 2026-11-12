package zx0;

import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.moveiq.MoveIQEventDetailsActivity;
import e23.p;
import f21.v;
import h4.r;
import h5.e0;
import i3.mh;
import l72.x0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f207344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f207345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MoveIQEventDetailsActivity f207346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f207347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f207348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f207349g;

    public /* synthetic */ e(Integer num, Integer num2, MoveIQEventDetailsActivity moveIQEventDetailsActivity, String str, String str2, String str3, int i14) {
        this.f207343a = i14;
        this.f207344b = num;
        this.f207345c = num2;
        this.f207346d = moveIQEventDetailsActivity;
        this.f207347e = str;
        this.f207348f = str2;
        this.f207349g = str3;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        switch (this.f207343a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                MoveIQEventDetailsActivity.a aVar = MoveIQEventDetailsActivity.f39211k;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1427226162, new e(this.f207344b, this.f207345c, this.f207346d, this.f207347e, this.f207348f, this.f207349g, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                MoveIQEventDetailsActivity.a aVar2 = MoveIQEventDetailsActivity.f39211k;
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar3 = r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(aVar3, mVar);
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
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    x0 x0Var = x0.f111346a;
                    float f14 = 16;
                    g6.f.a aVar5 = g6.f.f75994b;
                    x0Var.e(c2.l.C(aVar3, f14, 0.0f, f14, f14, 2), z3.f.c(-1199813759, new v(this.f207347e, this.f207348f, this.f207349g, 5), mVar), mVar, (x0.f111348c << 6) | 54, 0);
                    Integer num = this.f207344b;
                    Integer num2 = this.f207345c;
                    if ((num == null || num.intValue() < 0) && (num2 == null || num2.intValue() < 0)) {
                        mVar.C(-621048902);
                        mVar.f();
                    } else {
                        mVar.C(-621507299);
                        String strQ = gl1.y.Q(mVar, R.string.title_intensity_minutes);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(strQ, c2.l.B(aVar3, f14, 24, f14, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar), mVar, 0, 0, 131068);
                        mVar = mVar;
                        this.f207346d.ca(num, num2, mVar, 0);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }
}
