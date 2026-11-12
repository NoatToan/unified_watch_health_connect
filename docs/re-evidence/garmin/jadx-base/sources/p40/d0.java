package p40;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import kotlin.o3;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import ta0.j1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135652a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f135653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f135654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f135655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f135656e;

    public /* synthetic */ d0(i53.c cVar, boolean z14, e23.l lVar, e23.a aVar) {
        this.f135653b = cVar;
        this.f135654c = z14;
        this.f135655d = lVar;
        this.f135656e = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0138  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f135652a) {
            case 0:
                ((Integer) obj2).getClass();
                e0.a(p3.p0.t(1), this.f135656e, this.f135655d, this.f135653b, (p3.m) obj, this.f135654c);
                return Unit.INSTANCE;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarD = x2.d(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarC = c2.l.C(c2.l.A(rVarD, eVar.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar2 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    da0.a0.a(0, 14, null, gl1.y.Q(mVar, R.string.we_found_devices), null, mVar, null);
                    h4.r rVarB = l4.k.b(c2.l.C(x2.x(x2.f(o3.c(aVar, "multiple_detections_list"), 1.0f), null, 3), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), k2.i.a(j92.b.f97900c.f97911c));
                    i53.c cVar = this.f135653b;
                    boolean zR = mVar.r(cVar);
                    boolean z14 = this.f135654c;
                    boolean zH = zR | mVar.h(z14);
                    e23.l lVar = this.f135655d;
                    boolean zB = zH | mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new ad0.f(cVar, lVar, z14, 23);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ad0.f(cVar, lVar, z14, 23);
                            mVar.K(objQ);
                        }
                    }
                    e2.c.b(rVarB, null, null, null, null, null, false, null, (e23.l) objQ, mVar, 0, 510);
                    c2.l.f(b0Var.a(aVar, 1.0f, true), mVar);
                    da0.b.a(null, gl1.y.Q(mVar, R.string.i_dont_see_my_device), this.f135656e, false, null, null, false, null, null, false, mVar, 0, 1017);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                j1.a(p3.p0.t(1), this.f135656e, this.f135655d, this.f135653b, (p3.m) obj, this.f135654c);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d0(i53.c cVar, boolean z14, e23.l lVar, e23.a aVar, int i14) {
        this.f135653b = cVar;
        this.f135654c = z14;
        this.f135655d = lVar;
        this.f135656e = aVar;
    }

    public /* synthetic */ d0(boolean z14, i53.c cVar, e23.l lVar, e23.a aVar, int i14) {
        this.f135654c = z14;
        this.f135653b = cVar;
        this.f135655d = lVar;
        this.f135656e = aVar;
    }
}
