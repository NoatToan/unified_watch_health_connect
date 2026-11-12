package com.garmin.android.apps.connectmobile.strava;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import lc.u0;
import nk1.p;
import o13.r;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/strava/j;", "Lq20/a;", "Lcom/garmin/android/apps/connectmobile/strava/j$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "consumerKey", "Lhk1/o;", "permission", "<init>", "(Lcom/garmin/android/apps/connectmobile/strava/j$a;Ljava/lang/String;Lhk1/o;)V", "a", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends q20.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f44994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hk1.o f44996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nk1.g f44997e;

    public interface a {
        void onSuccess();
    }

    static {
        nk1.g.a aVar = nk1.g.f126421b;
        Parcelable.Creator<hk1.o> creator = hk1.o.CREATOR;
    }

    public j(a aVar, String str, hk1.o oVar) {
        aVar.getClass();
        str.getClass();
        oVar.getClass();
        this.f44994b = aVar;
        this.f44995c = str;
        this.f44996d = oVar;
        this.f44997e = nk1.g.a.a(nk1.g.f126421b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (ge1.b.e0(r9, r2, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (ge1.b.e0(r9, r2, r0) == r1) goto L32;
     */
    @Override // q20.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v13.c cVar) {
        fr1.e eVar;
        if (cVar instanceof fr1.e) {
            eVar = (fr1.e) cVar;
            int i14 = eVar.f73301c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f73301c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new fr1.e(this, cVar);
            }
        } else {
            eVar = new fr1.e(this, cVar);
        }
        Object objJ = eVar.f73299a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f73301c;
        if (i15 == 0) {
            r.b(objJ);
            eVar.f73301c = 1;
            nk1.g gVar = this.f44997e;
            gVar.getClass();
            objJ = f0.J(gVar, new p(gVar, this.f44995c, this.f44996d, null), eVar);
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
            k kVar = new k(this, null);
            eVar.f73301c = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            x53.c cVar3 = s0.f129406a;
            t1 t1Var2 = u53.o.f168762a;
            l lVar = new l(this, null);
            eVar.f73301c = 3;
        }
        return aVar;
    }
}
