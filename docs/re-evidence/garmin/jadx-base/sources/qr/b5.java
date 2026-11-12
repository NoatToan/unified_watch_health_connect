package qr;

import java.util.Collection;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getTrailsCandidates$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b5 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends List<? extends Long>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f146117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f146119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(t tVar, long j8, t13.d<? super b5> dVar) {
        super(2, dVar);
        this.f146118b = tVar;
        this.f146119c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b5 b5Var = new b5(this.f146118b, this.f146119c, dVar);
        b5Var.f146117a = obj;
        return b5Var;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends List<? extends Long>> v2Var, t13.d<? super Unit> dVar) {
        return ((b5) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146117a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            T t7 = ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            boolean zIsEmpty = ((Collection) t7).isEmpty();
            t tVar = this.f146118b;
            if (zIsEmpty) {
                int i14 = t.A2;
                tVar.z5().setValue(new nr.u0(null, null, 3, null));
            } else {
                List list = (List) t7;
                int i15 = t.A2;
                tVar.getClass();
                r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new d2(tVar, null), new r53.c2(new c2(list, tVar, this.f146119c, null))), new e2(tVar, null)), new f2(list, null)), new g2(tVar, null)), androidx.lifecycle.v1.a(tVar));
            }
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error fetching trails candidates: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
        }
        return Unit.INSTANCE;
    }
}
