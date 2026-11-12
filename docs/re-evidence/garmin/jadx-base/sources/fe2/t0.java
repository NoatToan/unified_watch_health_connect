package fe2;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/library/livetrack/d;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/library/livetrack/d;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenSession$terminateSessionsAsync$1", f = "DeviceDrivenSession.kt", l = {281}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.p<o53.b0, t13.d<? super com.garmin.android.library.livetrack.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f70932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<String> f70933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(j0 j0Var, List<String> list, t13.d<? super t0> dVar) {
        super(2, dVar);
        this.f70932b = j0Var;
        this.f70933c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t0(this.f70932b, this.f70933c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super com.garmin.android.library.livetrack.d> dVar) {
        return ((t0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        com.garmin.android.library.livetrack.c cVar;
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f70931a;
        j0 j0Var = this.f70932b;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.android.library.livetrack.d.a aVar2 = new com.garmin.android.library.livetrack.d.a(j0Var.f70789a, com.garmin.android.library.livetrack.c.j.f50195a);
            if (!j0Var.f70802n) {
                j0Var.f70794f.warn("No sessions exist for device " + j0Var.f70789a);
                return aVar2;
            }
            z0 z0Var = new z0(j0Var.f70789a, j0Var.f70798j, this.f70933c, j0Var.f70791c, j0Var.f70792d);
            String strW = j0Var.w();
            this.f70931a = 1;
            obj = z0Var.d(strW, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        d2 d2Var = (d2) obj;
        if (d2Var instanceof d2.b) {
            j0Var.f70802n = false;
            return new com.garmin.android.library.livetrack.d.b(j0Var.f70789a);
        }
        if (!(d2Var instanceof d2.a)) {
            lc.u0.r();
            return null;
        }
        List<c2> list = d2Var.f70702a;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((c2) next) instanceof c2.b));
            obj2 = (c2) next;
            if (obj2 == null) {
                obj2 = c2.b.a.f70685a;
            }
        } else {
            obj2 = c2.b.a.f70685a;
        }
        long j8 = j0Var.f70789a;
        if (obj2 instanceof c2.b.d) {
            cVar = com.garmin.android.library.livetrack.c.e.f50190a;
        } else {
            cVar = obj2 instanceof c2.b.c ? com.garmin.android.library.livetrack.c.C0998c.f50188a : com.garmin.android.library.livetrack.c.h.f50193a;
        }
        return new com.garmin.android.library.livetrack.d.a(j8, cVar);
    }
}
