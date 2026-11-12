package l70;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll70/i0;", "", "<init>", "()V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f110697a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.garmin.android.apps.connectmobile.s0 f110698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final jw.c f110699c;

    static {
        com.garmin.android.apps.connectmobile.s0 s0Var = (com.garmin.android.apps.connectmobile.s0) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.s0.class, null, null, 6, null);
        f110698b = s0Var;
        f110699c = s0Var.a(3600000L, 2592000000L);
    }

    private i0() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, String str2, v13.c cVar) {
        h0 h0Var;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i14 = h0Var.f110690c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h0Var.f110690c = i14 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, cVar);
            }
        } else {
            h0Var = new h0(this, cVar);
        }
        Object objJ = h0Var.f110688a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h0Var.f110690c;
        try {
            if (i15 == 0) {
                o13.r.b(objJ);
                fu.f fVar = (fu.f) KoinJavaComponent.get$default(fu.f.class, null, null, 6, null);
                h0Var.f110690c = 1;
                fVar.getClass();
                objJ = com.garmin.android.apps.connectmobile.f0.J(fVar, new fu.e(fVar, str, str2, null), h0Var);
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objJ);
            }
            v2 v2Var = (v2) objJ;
            if (!(v2Var instanceof v2.b)) {
                return null;
            }
            jw.c cVar2 = f110699c;
            cVar2.e(String.valueOf(((v2.b) v2Var).f47388c));
            cVar2.d(Unit.INSTANCE, (String) ((v2.b) v2Var).f47386a);
            return (String) ((v2.b) v2Var).f47386a;
        } catch (Exception e4) {
            a2 a2Var = a2.DASHBOARD;
            String strN = fb1.c.n("Failed to fetch fitness stats activities. Error: ", e4.getMessage());
            i2.f36769a.getClass();
            i2.a.f(a2Var, "FitnessStatsActivityRepo", strN);
            return null;
        }
    }
}
