package ne0;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lne0/i0;", "", "Lme0/w;", "dogsRepository", "Lo53/z;", "backgroundDispatcher", "<init>", "(Lme0/w;Lo53/z;)V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me0.w f125478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.z f125479b;

    public i0(me0.w wVar, o53.z zVar) {
        wVar.getClass();
        zVar.getClass();
        this.f125478a = wVar;
        this.f125479b = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(i0 i0Var, je0.f fVar, boolean z14, v13.c cVar) throws Exception {
        h0 h0Var;
        i0Var.getClass();
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i14 = h0Var.f125473d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h0Var.f125473d = i14 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(i0Var, cVar);
            }
        } else {
            h0Var = new h0(i0Var, cVar);
        }
        Object objF = h0Var.f125471b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h0Var.f125473d;
        if (i15 == 0) {
            o13.r.b(objF);
            long j8 = fVar.f98501a;
            Long l14 = fVar.f98502b;
            l14.getClass();
            je0.b bVar = new je0.b(z14, j8, l14.longValue(), "DOG");
            me0.w wVar = i0Var.f125478a;
            long j14 = fVar.f98501a;
            h0Var.f125470a = fVar;
            h0Var.f125473d = 1;
            objF = wVar.f(j14, bVar, h0Var);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = h0Var.f125470a;
            o13.r.b(objF);
        }
        v2 v2Var = (v2) objF;
        if (v2Var instanceof v2.b) {
            return fVar;
        }
        if (v2Var instanceof v2.a) {
            q2.u("Failed to update animal");
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i0(me0.w wVar, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(wVar, zVar);
    }
}
