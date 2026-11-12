package bu0;

import au0.z;
import o13.q;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbu0/m;", "", "Lau0/z;", "liveActivityRepositoryWrapper", "Lbu0/j;", "isLockedInLiveActivitySessionInProgress", "<init>", "(Lau0/z;Lbu0/j;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f21217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f21218b;

    public m(z zVar, j jVar) {
        zVar.getClass();
        jVar.getClass();
        this.f21217a = zVar;
        this.f21218b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) {
        l lVar;
        Object objA;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f21216c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f21216c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object obj = lVar.f21214a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f21216c;
        if (i15 == 0) {
            r.b(obj);
            j jVar = this.f21218b;
            if (!jVar.a(jVar.f21211b.a(null))) {
                int i16 = q.f128596b;
                return Boolean.FALSE;
            }
            lVar.f21216c = 1;
            objA = this.f21217a.a(lVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objA = ((q) obj).f128597a;
        }
        int i17 = q.f128596b;
        if (objA instanceof q.b) {
            return objA;
        }
        return Boolean.TRUE;
    }
}
