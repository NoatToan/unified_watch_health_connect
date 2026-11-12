package ne0;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lne0/c;", "", "Lme0/w;", "dogsRepository", "Lo53/z;", "backgroundDispatcher", "<init>", "(Lme0/w;Lo53/z;)V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me0.w f125432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.z f125433b;

    public c(me0.w wVar, o53.z zVar) {
        wVar.getClass();
        zVar.getClass();
        this.f125432a = wVar;
        this.f125433b = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(c cVar, je0.f fVar, boolean z14, v13.c cVar2) {
        a aVar;
        cVar.getClass();
        if (cVar2 instanceof a) {
            aVar = (a) cVar2;
            int i14 = aVar.f125424d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f125424d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(cVar, cVar2);
            }
        } else {
            aVar = new a(cVar, cVar2);
        }
        Object objC = aVar.f125422b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f125424d;
        if (i15 == 0) {
            o13.r.b(objC);
            long j8 = fVar.f98501a;
            Long l14 = fVar.f98502b;
            l14.getClass();
            je0.b bVar = new je0.b(z14, j8, l14.longValue(), "DOG");
            me0.w wVar = cVar.f125432a;
            aVar.f125421a = fVar;
            aVar.f125424d = 1;
            objC = wVar.c(bVar, aVar);
            if (objC == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = aVar.f125421a;
            o13.r.b(objC);
        }
        je0.f fVar2 = fVar;
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            return new v2.b(fVar2, ((v2.b) v2Var).f47387b, null, null, 12, null);
        }
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(me0.w wVar, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(wVar, zVar);
    }
}
