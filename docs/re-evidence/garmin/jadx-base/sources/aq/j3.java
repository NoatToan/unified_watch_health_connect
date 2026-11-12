package aq;

import okhttp3.ResponseBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Laq/j3;", "Lk52/d;", "Lokhttp3/ResponseBody;", "Laq/h3;", "thirdPartyUploaderRepo", "<init>", "(Laq/h3;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j3 extends k52.d<ResponseBody> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h3 f12026c;

    public j3(h3 h3Var) {
        h3Var.getClass();
        this.f12026c = h3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k52.d
    public final Object y4(v13.c cVar) throws Throwable {
        i3 i3Var;
        if (cVar instanceof i3) {
            i3Var = (i3) cVar;
            int i14 = i3Var.f12012c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i3Var.f12012c = i14 - Integer.MIN_VALUE;
            } else {
                i3Var = new i3(this, cVar);
            }
        } else {
            i3Var = new i3(this, cVar);
        }
        Object objJ = i3Var.f12010a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i3Var.f12012c;
        if (i15 == 0) {
            o13.r.b(objJ);
            i3Var.f12012c = 1;
            h3 h3Var = this.f12026c;
            h3Var.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(h3Var, new g3(h3Var, null), i3Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objJ;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            return ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
        String str = ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c;
        String strN = fb1.c.n("Error fetching third party uploader: ", str);
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ThirdPartyUploadsViewModel", strN);
        throw new Throwable(str);
    }

    @Override // k52.d
    public final String z4() {
        return "ThirdPartyUploadsViewModel";
    }
}
