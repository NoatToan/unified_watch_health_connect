package com.xiaomi.eco.api;

import com.xiaomi.eco.api.EcoApiResult;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.ch7;
import defpackage.ht2;
import defpackage.ja0;
import defpackage.r90;
import defpackage.u7r;
import defpackage.ub0;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends e {
    public static final byte[] f = {16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, 26, 27};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11250b;
    public e c;
    public final String d;
    public final boolean e;

    public class a implements ht2<Void> {
        public a() {
        }

        @Override // defpackage.ht2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Void r2) {
            Logger.i("EcoBinderV2", "enableNotifications success");
            if (f.this.isCancelled()) {
                return;
            }
            f.this.c();
        }

        @Override // defpackage.ht2
        public void onFailed(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("enableNotifications fail status = ");
            sb.append(i);
            if (f.this.isCancelled()) {
                return;
            }
            f.this.mCallback.onBindFailure(1001, "enable notifications failed,code:" + i);
        }
    }

    public f(String str, String str2, boolean z, i iVar) {
        super(str, iVar);
        this.d = str2;
        this.e = z;
    }

    public final void c() {
        Logger.i("EcoBinderV2", "getBindInfo() called");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 17;
        ub0 ub0Var = new ub0();
        ub0Var.c = this.e;
        Logger.i("EcoBinderV2_checkDynamicCode:" + this.e, new Object[0]);
        r90 r90Var = new r90();
        r90Var.Q(ub0Var);
        u7rVar.z(r90Var);
        this.mApiTask = this.mApiCall.callTimeout(u7rVar, true, new p.a() { // from class: gi7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f19020a.d(ecoApiResult);
            }
        }, 15000);
    }

    @Override // com.xiaomi.eco.api.e
    public void cancel() {
        super.cancel();
        e eVar = this.c;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    public final /* synthetic */ void d(EcoApiResult ecoApiResult) {
        if (isCancelled()) {
            return;
        }
        if (!ecoApiResult.f()) {
            this.mCallback.onBindFailure(1005, "getBindInfo apiCode: " + ecoApiResult.a());
            return;
        }
        if (ecoApiResult.e().o().D()) {
            int iT = ecoApiResult.e().o().t();
            if (iT == 1) {
                this.mCallback.onBindFailure(1003, "device have bound");
                return;
            }
            this.mCallback.onBindFailure(1005, "getBindInfo errorCode: " + iT);
            return;
        }
        if (!ecoApiResult.e().o().C()) {
            this.mCallback.onBindFailure(1005, "not expected response for getBindInfo");
            return;
        }
        ja0 ja0VarR = ecoApiResult.e().o().r();
        int i = ja0VarR.c;
        this.f11249a = i;
        int i2 = ja0VarR.g;
        this.f11250b = i2;
        if (i != 2) {
            if (i == 1) {
                m mVar = new m(this.mUserId, (i) this.mApiCall);
                this.c = mVar;
                mVar.q(this.f11250b, ja0VarR.c, ja0VarR.f, ja0VarR.e, ja0VarR.d, ja0VarR.i, ja0VarR.h, this.mCallback);
                return;
            } else {
                this.mCallback.onBindFailure(1007, "verify mode (" + ja0VarR.c + ") not support");
                return;
            }
        }
        if (i2 == 3 || i2 == 2) {
            l lVar = new l(this.mUserId, (i) this.mApiCall, this.d);
            this.c = lVar;
            lVar.g(this.f11250b, ja0VarR.f, ja0VarR.e, ja0VarR.d, ja0VarR.i, this.mCallback);
        } else {
            this.mCallback.onBindFailure(1006, "oob mode (" + ja0VarR.g + ") not support");
        }
    }

    @Override // com.xiaomi.eco.api.e
    public final void start(ch7 ch7Var) {
        super.start(ch7Var);
        Logger.i("EcoBinderV2", "start enableNotifications called");
        ((i) this.mApiCall).E5(new a());
    }
}
