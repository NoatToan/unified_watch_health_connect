package com.xiaomi.eco.api;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.ch7;
import defpackage.ht2;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends e {
    public static final byte[] i = {16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, 26, 27};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f11252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11253b;
    public final boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;

    public class a implements ht2<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ch7 f11254a;

        public a(ch7 ch7Var) {
            this.f11254a = ch7Var;
        }

        @Override // defpackage.ht2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Void r9) {
            Logger.i("EcoBinderV3ForShareBind", "enableNotifications success");
            if (g.this.isCancelled()) {
                return;
            }
            g gVar = g.this;
            String str = gVar.d;
            g gVar2 = g.this;
            gVar.f11252a = new n(str, gVar2.mUserId, (i) gVar2.mApiCall);
            ((n) g.this.f11252a).C(null, null, g.this.e, g.this.f, g.this.g, g.this.h, this.f11254a);
        }

        @Override // defpackage.ht2
        public void onFailed(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("enableNotifications fail status = ");
            sb.append(i);
            if (g.this.isCancelled()) {
                return;
            }
            g.this.mCallback.onBindFailure(1001, "enable notifications failed,code:" + i);
        }
    }

    public g(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, i iVar) {
        super(str2, iVar);
        this.d = str;
        this.f11253b = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.c = z;
    }

    @Override // com.xiaomi.eco.api.e
    public void cancel() {
        super.cancel();
        e eVar = this.f11252a;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.xiaomi.eco.api.e
    public final void start(ch7 ch7Var) {
        super.start(ch7Var);
        Logger.i("EcoBinderV3ForShareBind", "start enableNotifications called");
        ((i) this.mApiCall).E5(new a(ch7Var));
    }
}
