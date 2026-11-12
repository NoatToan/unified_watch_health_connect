package fe2;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/library/livetrack/d;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/library/livetrack/d;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicSession$terminateSessionsAsync$1", f = "ClassicSession.kt", l = {279}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super com.garmin.android.library.livetrack.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f70831b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b bVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f70831b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f70831b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super com.garmin.android.library.livetrack.d> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        com.garmin.android.library.livetrack.c cVar;
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f70830a;
        b bVar = this.f70831b;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.android.library.livetrack.d.a aVar2 = new com.garmin.android.library.livetrack.d.a(bVar.f70633a, com.garmin.android.library.livetrack.c.j.f50195a);
            if (!bVar.f70648p) {
                bVar.f70639g.warn("No sessions exist for device " + bVar.f70633a);
                return aVar2;
            }
            q qVar = new q(bVar.f70633a, bVar.f70637e, bVar.f70634b, bVar.f70635c);
            String strT = bVar.t();
            this.f70830a = 1;
            obj = qVar.d(strT, this);
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
            bVar.f70648p = false;
            return new com.garmin.android.library.livetrack.d.b(bVar.f70633a);
        }
        if (!(d2Var instanceof d2.a)) {
            lc.u0.r();
            return null;
        }
        bVar.f70648p = false;
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
        long j8 = bVar.f70633a;
        if (obj2 instanceof c2.b.d) {
            cVar = com.garmin.android.library.livetrack.c.e.f50190a;
        } else {
            cVar = obj2 instanceof c2.b.c ? com.garmin.android.library.livetrack.c.C0998c.f50188a : com.garmin.android.library.livetrack.c.h.f50193a;
        }
        return new com.garmin.android.library.livetrack.d.a(j8, cVar);
    }
}
