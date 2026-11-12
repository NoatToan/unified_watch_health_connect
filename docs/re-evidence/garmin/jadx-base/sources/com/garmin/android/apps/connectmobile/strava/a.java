package com.garmin.android.apps.connectmobile.strava;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import lc.u0;
import o13.r;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/strava/a;", "Lq20/a;", "Lcom/garmin/android/apps/connectmobile/strava/a$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "consumerKey", "<init>", "(Lcom/garmin/android/apps/connectmobile/strava/a$a;Ljava/lang/String;)V", "a", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends q20.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0858a f44978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nk1.g f44980d;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.strava.a$a, reason: collision with other inner class name */
    public interface InterfaceC0858a {
        void a();

        void b(hk1.g gVar);
    }

    static {
        nk1.g.a aVar = nk1.g.f126421b;
    }

    public a(InterfaceC0858a interfaceC0858a, String str) {
        interfaceC0858a.getClass();
        str.getClass();
        this.f44978b = interfaceC0858a;
        this.f44979c = str;
        this.f44980d = nk1.g.a.a(nk1.g.f126421b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (ge1.b.e0(r2, r3, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (ge1.b.e0(r8, r2, r0) == r1) goto L32;
     */
    @Override // q20.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v13.c cVar) {
        fr1.b bVar;
        if (cVar instanceof fr1.b) {
            bVar = (fr1.b) cVar;
            int i14 = bVar.f73292c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f73292c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new fr1.b(this, cVar);
            }
        } else {
            bVar = new fr1.b(this, cVar);
        }
        Object objJ = bVar.f73290a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f73292c;
        if (i15 == 0) {
            r.b(objJ);
            bVar.f73292c = 1;
            nk1.g gVar = this.f44980d;
            gVar.getClass();
            objJ = f0.J(gVar, new nk1.j(gVar, this.f44979c, null), bVar);
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
            b bVar2 = new b(this, v2Var, null);
            bVar.f73292c = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            x53.c cVar3 = s0.f129406a;
            t1 t1Var2 = u53.o.f168762a;
            c cVar4 = new c(this, null);
            bVar.f73292c = 3;
        }
        return aVar;
    }
}
