package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.EcgDataSourceImpl$triggerServerCall$1", f = "EcgDataSourceImpl.kt", l = {101}, m = "invokeSuspend", v = 2)
public final class i1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f33232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f33233c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(d1 d1Var, t13.d<? super i1> dVar) {
        super(2, dVar);
        this.f33233c = d1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i1 i1Var = new i1(this.f33233c, dVar);
        i1Var.f33232b = obj;
        return i1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        c83.a0 a0Var;
        j1 j1Var;
        o53.b0 b0Var = (o53.b0) this.f33232b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f33231a;
        d1 d1Var = this.f33233c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                String string = d1Var.f33166g.toString("yyyy-MM-dd");
                String string2 = d1Var.f33167h.toString("yyyy-MM-dd");
                b1 b1Var = d1Var.f33160a;
                string.getClass();
                string2.getClass();
                this.f33232b = b0Var;
                this.f33231a = 1;
                obj = b1Var.a(string, string2, this);
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
            a0Var = (c83.a0) obj;
        } catch (Exception e4) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "ECG data fetch failed: ");
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "EcgDataSource", strD);
            a0Var = null;
        }
        int i15 = d1.f33159i;
        d1Var.getClass();
        p2 p2Var = d1Var.f33164e;
        if (a0Var != null && !a0Var.f25745a.isSuccessful()) {
            ResponseBody responseBody = a0Var.f25747c;
            String strString = responseBody != null ? responseBody.string() : null;
            if (strString != null && d53.w.z(strString, "mfa_required", true)) {
                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "EcgDataSource", "ECG data fetch failed: MFA required");
                d1Var.f33162c.w();
            }
        }
        String str = (a0Var == null || !a0Var.f25745a.isSuccessful()) ? null : (String) a0Var.f25746b;
        if (str != null) {
            ge1.b.T(d1Var.f33163d, null, null, new g1(d1Var, str, null), 3);
            j1Var = new j1(new yz1.d(yz1.u.SUCCESS, yz1.c.SERVER, false, 4, null), str);
        } else {
            j1Var = new j1(new yz1.d(yz1.u.ERROR, ((j1) p2Var.getValue()).f33241a.f200299b, false, 4, null), ((j1) p2Var.getValue()).f33242b);
        }
        p2Var.k(null, j1Var);
        return Unit.INSTANCE;
    }
}
