package l70;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll70/b;", "", "<init>", "()V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f110596a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f110597b = "ATPTypesRepo";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.garmin.android.apps.connectmobile.s0 f110598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final jw.c f110599d;

    static {
        com.garmin.android.apps.connectmobile.s0 s0Var = (com.garmin.android.apps.connectmobile.s0) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.s0.class, null, null, 6, null);
        f110598c = s0Var;
        f110599d = s0Var.a(86400000L, 2592000000L);
    }

    private b() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, v13.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f110592c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f110592c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objJ = aVar.f110590a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f110592c;
        try {
            if (i15 == 0) {
                o13.r.b(objJ);
                fu.c cVar2 = (fu.c) KoinJavaComponent.get$default(fu.c.class, null, null, 6, null);
                aVar.f110592c = 1;
                cVar2.getClass();
                objJ = com.garmin.android.apps.connectmobile.f0.J(cVar2, new fu.b(cVar2, str, null), aVar);
                if (objJ == aVar2) {
                    return aVar2;
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
            jw.c cVar3 = f110599d;
            cVar3.e(String.valueOf(((v2.b) v2Var).f47388c));
            cVar3.d(Unit.INSTANCE, (String) ((v2.b) v2Var).f47386a);
            return (String) ((v2.b) v2Var).f47386a;
        } catch (Exception e4) {
            a2 a2Var = a2.DASHBOARD;
            String strN = fb1.c.n("Failed to fetch ATP Types. Error: ", e4.getMessage());
            i2.f36769a.getClass();
            i2.a.f(a2Var, f110597b, strN);
            return null;
        }
    }
}
