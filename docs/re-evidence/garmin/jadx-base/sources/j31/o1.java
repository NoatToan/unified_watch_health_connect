package j31;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.e3;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.vo2.reports.presentation.activity.VO2MaxReportsActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj31/o1;", "Lj31/z0;", "Lb31/f;", "onboardingChecksRepository", "Lcom/garmin/android/apps/connectmobile/e3;", "trainingPlanDelegate", "<init>", "(Lb31/f;Lcom/garmin/android/apps/connectmobile/e3;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o1 implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.f f96919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3 f96920c;

    public o1(b31.f fVar, e3 e3Var) {
        fVar.getClass();
        e3Var.getClass();
        this.f96919b = fVar;
        this.f96920c = e3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        n1 n1Var;
        if (cVar instanceof n1) {
            n1Var = (n1) cVar;
            int i14 = n1Var.f96918c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n1Var.f96918c = i14 - Integer.MIN_VALUE;
            } else {
                n1Var = new n1(this, cVar);
            }
        } else {
            n1Var = new n1(this, cVar);
        }
        Object objH = n1Var.f96916a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n1Var.f96918c;
        if (i15 == 0) {
            o13.r.b(objH);
            n1Var.f96918c = 1;
            objH = this.f96920c.H(n1Var);
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objH);
        }
        v2 v2Var = (v2) objH;
        if ((v2Var instanceof v2.b) && ((o61.p) ((v2.b) v2Var).f47386a).getGeneric() != null) {
            this.f96919b.b(e31.a.HAS_ENTERED_VO2MAX_TEST);
        }
        return Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        ds.e0.p(context, str, str2);
        VO2MaxReportsActivity.f47876b.getClass();
        context.startActivity(new Intent(context, (Class<?>) VO2MaxReportsActivity.class));
    }
}
