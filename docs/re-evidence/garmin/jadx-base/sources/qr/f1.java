package qr;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lps/y0;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityLaps$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f1 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends ps.y0>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f146202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f146204c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Long.valueOf(((ps.x0) t7).Z2()), Long.valueOf(((ps.x0) t14).Z2()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(t tVar, boolean z14, t13.d<? super f1> dVar) {
        super(2, dVar);
        this.f146203b = tVar;
        this.f146204c = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f1 f1Var = new f1(this.f146203b, this.f146204c, dVar);
        f1Var.f146202a = obj;
        return f1Var;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends ps.y0> v2Var, t13.d<? super Unit> dVar) {
        return ((f1) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List listN0;
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146202a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ArrayList arrayList = null;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            int i14 = t.A2;
            t tVar = this.f146203b;
            r53.z1<ps.p> z1VarU4 = tVar.U4();
            ps.p value = tVar.U4().getValue();
            ps.y0 y0Var = (ps.y0) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            long activityId = y0Var.getActivityId();
            List<ps.o0> listD = y0Var.d();
            List<ps.x0> listF = y0Var.f();
            if (listF != null && (listN0 = p13.h0.N0(listF, new a())) != null) {
                arrayList = new ArrayList(listN0);
            }
            z1VarU4.setValue(ps.p.b(value, activityId, listD, arrayList, null, 24));
            if (this.f146204c) {
                t.A4(tVar);
            }
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error fetching laps: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
        }
        return Unit.INSTANCE;
    }
}
