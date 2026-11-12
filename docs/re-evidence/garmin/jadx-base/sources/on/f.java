package on;

import c83.a0;
import java.util.List;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lsn/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.data.HealthRepositoryImpl$getAllActivities$result$1", f = "HealthRepositoryImpl.kt", l = {115}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.l<t13.d<? super a0<List<? extends sn.h>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f133016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f133017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f133018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, int i14, int i15, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f133016b = aVar;
        this.f133017c = i14;
        this.f133018d = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f133016b, this.f133017c, this.f133018d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends sn.h>>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133015a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        i0<a0<List<sn.h>>> i0VarF = this.f133016b.f132995a.f(this.f133017c, this.f133018d, fz0.d.b(dateTimeNow));
        this.f133015a = 1;
        Object objAwait = i0VarF.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
