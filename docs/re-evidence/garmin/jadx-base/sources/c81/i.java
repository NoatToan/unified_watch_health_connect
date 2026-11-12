package c81;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import cq.t;
import e23.p;
import gt1.w;
import h4.r;
import h5.e0;
import i3.mh;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.x1;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f25698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f25700d;

    public /* synthetic */ i(String str, String str2, String str3) {
        this.f25697a = 1;
        this.f25698b = str;
        this.f25699c = str2;
        this.f25700d = str3;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009b  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f25697a;
        String str = this.f25700d;
        String str2 = this.f25699c;
        String str3 = this.f25698b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                j.a(str3, str2, str, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar = r.S;
                    r rVarD = x2.d(aVar, 1.0f);
                    boolean zB = mVar.B(str3);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new t(str3, 27);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new t(str3, 27);
                            mVar.K(objQ);
                        }
                    }
                    r rVarC = v.c((e23.l) objQ, rVarD, false);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC2 = h4.k.c(rVarC, mVar);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97930g;
                    mh.c(this.f25699c, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar), mVar, 0, 0, 131070);
                    d92.b.f58625c.getClass();
                    mh.c(this.f25700d, c2.l.C(aVar, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar), mVar, 0, 0, 131068);
                    mh.c(gl1.y.Q(mVar, R.string.tr_factor_acute_load), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131070);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                w.a(str3, str2, str, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                nf1.h.a(str3, str2, str, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                rv1.i.d(str3, str2, str, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ty.a.a(str3, str2, str, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(int i14, int i15, String str, String str2, String str3) {
        this.f25697a = i15;
        this.f25698b = str;
        this.f25699c = str2;
        this.f25700d = str3;
    }
}
