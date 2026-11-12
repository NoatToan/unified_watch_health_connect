package qt1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$sendDuplicateTrailAnalytics$1", f = "TrailDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f147741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f147742b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(long j8, k kVar, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f147741a = j8;
        this.f147742b = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l0(this.f147741a, this.f147742b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ns1.a aVar2 = ns1.a.f127814a;
        c80.p pVar = ((pt1.o) this.f147742b.f147673h.getValue()).f140926x;
        aVar2.getClass();
        ArrayList arrayListM = p13.x.m(new zk.e("curatedCourseId", Long.valueOf(this.f147741a)));
        if (pVar != null) {
            if (pVar instanceof c80.p.c) {
                str = "ineligible";
            } else if (pVar instanceof c80.p.b) {
                str = "eligible";
            } else {
                if (!(pVar instanceof c80.p.a)) {
                    lc.u0.r();
                    return null;
                }
                str = AppMeasurementSdk.ConditionalUserProperty.ACTIVE;
            }
            arrayListM.add(new zk.e("trailsFeatureStatus", str));
        }
        zk.a aVar3 = new zk.a("TRAILS_CUSTOMIZE_TRAIL", arrayListM, false, 0L, 12, null);
        zk.c cVar = zk.c.f205034a;
        List listC = p13.w.c("GCS");
        cVar.getClass();
        new zk.d(cVar, null, listC).a(aVar3);
        return Unit.INSTANCE;
    }
}
