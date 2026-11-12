package com.garmin.android.apps.connectmobile.strava;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import hk1.a0;
import java.util.List;
import lc.u0;
import o13.r;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/strava/g;", "Lq20/a;", "Lcom/garmin/android/apps/connectmobile/strava/g$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/apps/connectmobile/strava/g$a;)V", "a", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends q20.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f44989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nk1.g f44990c;

    public interface a {
        void a();

        void b(List<a0> list);
    }

    static {
        nk1.g.a aVar = nk1.g.f126421b;
    }

    public g(a aVar) {
        aVar.getClass();
        this.f44989b = aVar;
        this.f44990c = nk1.g.a.a(nk1.g.f126421b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (ge1.b.e0(r2, r3, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (ge1.b.e0(r8, r2, r0) == r1) goto L32;
     */
    @Override // q20.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v13.c cVar) {
        fr1.d dVar;
        if (cVar instanceof fr1.d) {
            dVar = (fr1.d) cVar;
            int i14 = dVar.f73298c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f73298c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new fr1.d(this, cVar);
            }
        } else {
            dVar = new fr1.d(this, cVar);
        }
        Object objJ = dVar.f73296a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f73298c;
        if (i15 == 0) {
            r.b(objJ);
            dVar.f73298c = 1;
            nk1.g gVar = this.f44990c;
            gVar.getClass();
            objJ = f0.J(gVar, new nk1.o(gVar, null), dVar);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(objJ);
                return Unit.INSTANCE;
            }
            if (i15 == 3) {
                r.b(objJ);
                return Unit.INSTANCE;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objJ);
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            x53.c cVar2 = s0.f129406a;
            t1 t1Var = u53.o.f168762a;
            h hVar = new h(this, v2Var, null);
            dVar.f73298c = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            x53.c cVar3 = s0.f129406a;
            t1 t1Var2 = u53.o.f168762a;
            i iVar = new i(this, null);
            dVar.f73298c = 3;
        }
        return aVar;
    }
}
