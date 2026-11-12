package mu0;

import android.content.Context;
import c2.b0;
import c2.y;
import c2.z;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h4.r;
import h5.e0;
import l72.p2;
import org.koin.java.KoinJavaComponent;
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
    public final /* synthetic */ int f121100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.b f121101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ iu0.e f121102c;

    public /* synthetic */ e(com.garmin.android.apps.connectmobile.liveeventsharing.ui.b bVar, iu0.e eVar, int i14) {
        this.f121100a = i14;
        this.f121101b = bVar;
        this.f121102c = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011a  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String string;
        int i14 = this.f121100a;
        iu0.e eVar = this.f121102c;
        com.garmin.android.apps.connectmobile.liveeventsharing.ui.b bVar = this.f121101b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.b.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.b.f38557g;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-220881955, new e(bVar, eVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.b.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.b.f38557g;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar3 = r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = h4.k.c(aVar3, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    p2 p2Var = p2.f111205a;
                    String strQ = gl1.y.Q(mVar2, R.string.live_event_sharing_completion_time);
                    if (eVar == null) {
                        string = bVar.getString(R.string.lbl_off);
                        string.getClass();
                    } else {
                        double d14 = eVar.f95027g;
                        if (!eVar.f95026f || Double.isNaN(d14)) {
                            string = bVar.getString(R.string.lbl_off);
                            string.getClass();
                        } else {
                            cu0.g gVar = cu0.g.f55579a;
                            boolean z14 = eVar.f95032l;
                            Double dValueOf = Double.valueOf(d14);
                            gVar.getClass();
                            iu0.b bVarA = cu0.g.a(dValueOf, z14);
                            if (bVarA != null) {
                                string = bVar.getString(bVarA.f95012b);
                                string.getClass();
                            } else {
                                m3 m3Var = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? m3.KILOMETER : m3.MILE;
                                l3.a aVar5 = l3.f23124b;
                                Context contextRequireContext = bVar.requireContext();
                                double d15 = eVar.f95027g;
                                aVar5.getClass();
                                string = l3.a.O(contextRequireContext, d15, m3Var, l3.f23130h, true);
                            }
                        }
                    }
                    String str = string;
                    boolean zR = mVar2.r(bVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new mh1.i(bVar, 15);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new mh1.i(bVar, 15);
                            mVar2.K(objQ);
                        }
                    }
                    p2Var.h(strQ, str, null, null, null, false, false, null, null, null, (e23.a) objQ, mVar2, 0, 0, 1020);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
