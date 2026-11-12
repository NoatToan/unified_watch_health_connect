package fl1;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.q;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfl1/b;", "", "Ldl1/a;", "recordActivityRepository", "Lcl1/a;", "activityRecordingPreferences", "<init>", "(Ldl1/a;Lcl1/a;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl1.a f71990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl1.a f71991b;

    public b(dl1.a aVar, cl1.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.f71990a = aVar;
        this.f71991b = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j8, v13.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f71989c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f71989c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objB = aVar.f71987a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f71989c;
        if (i15 == 0) {
            r.b(objB);
            if (this.f71991b.f(j8)) {
                int i16 = q.f128596b;
                return Boolean.TRUE;
            }
            aVar.f71989c = 1;
            objB = this.f71990a.b(j8, aVar);
            if (objB == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objB);
        }
        v2 v2Var = (v2) objB;
        if (v2Var instanceof v2.b) {
            int i17 = q.f128596b;
            return ((v2.b) v2Var).f47386a;
        }
        if (v2Var instanceof v2.a) {
            int i18 = q.f128596b;
            return r.a(((v2.a) v2Var).f47383a);
        }
        u0.r();
        return null;
    }
}
