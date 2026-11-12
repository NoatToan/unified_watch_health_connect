package a73;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment;
import com.garmin.android.apps.connectmobile.q1;
import org.apache.commons.lang3.function.FailableLongConsumer;
import org.apache.commons.lang3.function.FailableRunnable;
import ps.a1;
import ps.n1;
import ps.s1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements FailableRunnable, jw.h, q1.a, u03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1819c;

    public /* synthetic */ b(Object obj, long j8, int i14) {
        this.f1817a = i14;
        this.f1819c = obj;
        this.f1818b = j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        ActivityDetailsFragment activityDetailsFragment = (ActivityDetailsFragment) this.f1819c;
        int i14 = ActivityDetailsFragment.I;
        if (z14) {
            qr.t tVarZ6 = activityDetailsFragment.z6();
            tVarZ6.getClass();
            is.a aVar = is.a.f94856a;
            String str = tVarZ6.A.f4358a;
            aVar.getClass();
            str.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("Screen", "ActivityDetails");
            bundle.putString("Action", "ExcludeFromPhysio");
            bundle.putString("ActivityType", str);
            ht.a.f85464a.getClass();
            ht.a.a(bundle, "UserAction");
            String str2 = null;
            ps.a aVar2 = null;
            ps.q1 q1Var = null;
            s1 s1Var = null;
            to.o oVar = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            Object[] objArr7 = 0 == true ? 1 : 0;
            Object[] objArr8 = 0 == true ? 1 : 0;
            Object[] objArr9 = 0 == true ? 1 : 0;
            Object[] objArr10 = 0 == true ? 1 : 0;
            Object[] objArr11 = 0 == true ? 1 : 0;
            Object[] objArr12 = 0 == true ? 1 : 0;
            tVarZ6.X5(this.f1818b, new ps.r(aVar2, objArr, objArr2, objArr3, str2, objArr4, objArr5, objArr6, objArr7, new a1(null, null, null, str2, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n1.SIMULATED.f139951a, null, null, -1, 458751, null), objArr8, objArr9, q1Var, s1Var, oVar, objArr10, objArr11, objArr12, 261631, 0 == true ? 1 : 0), nr.v0.EXCLUDE_FROM_PHYSIO_METRICS);
        }
    }

    @Override // org.apache.commons.lang3.function.FailableRunnable
    public void run() {
        switch (this.f1817a) {
            case 0:
                ((FailableLongConsumer) this.f1819c).accept(this.f1818b);
                break;
            default:
                to2.a aVar = (to2.a) this.f1819c;
                aVar.m();
                aVar.k();
                wr.g.v("startHeartBeatTimer: ", this.f1818b, " secs passed, resubscribing tp SSE...", aVar.f165846b);
                break;
        }
    }
}
