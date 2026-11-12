package com.xiaomi.eco.api;

import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.ch7;
import defpackage.nj7;

/* JADX INFO: loaded from: classes7.dex */
public class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f11256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11257b;
    public String c;
    public String d;
    public String e;
    public final String f;
    public final boolean g;

    public class a implements nj7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f11258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ch7 f11259b;

        public a(long j, ch7 ch7Var) {
            this.f11258a = j;
            this.f11259b = ch7Var;
        }

        @Override // defpackage.nj7
        public void onConnectFailure(int i) {
            Logger.i("EcoBinderWrapper", "onConnectFailure() called with: status = [" + i + "], cost = " + ((System.currentTimeMillis() - this.f11258a) / 1000.0f));
            if (h.this.isCancelled()) {
                return;
            }
            h.this.mCallback.onConnectFailure(i);
        }

        @Override // defpackage.nj7
        public void onConnectSuccess() {
            Logger.i("EcoBinderWrapper", "onConnectSuccess() called cost = " + ((System.currentTimeMillis() - this.f11258a) / 1000.0f));
            if (h.this.isCancelled()) {
                Logger.i("EcoBinderWrapper", "onConnectSuccess: cancel()");
                return;
            }
            h.this.mCallback.onConnectSuccess();
            if (h.this.f11256a != null) {
                h.this.f11256a.cancel();
            }
            if (h.this.mApiCall.isBindAbandon()) {
                Logger.i("EcoBinderWrapper", "onConnectSuccess: abandon()");
                return;
            }
            int version = ((i) h.this.mApiCall).getVersion();
            String strJ5 = ((i) h.this.mApiCall).J5();
            StringBuilder sb = new StringBuilder();
            sb.append("onConnectSuccess version = ");
            sb.append(version);
            if (version == 0) {
                h hVar = h.this;
                h hVar2 = h.this;
                hVar.f11256a = new j(hVar2.mUserId, (i) hVar2.mApiCall);
            } else {
                h hVar3 = h.this;
                if (hVar3.j(hVar3.f11257b)) {
                    h hVar4 = h.this;
                    h hVar5 = h.this;
                    hVar4.f11256a = new g(strJ5, hVar5.mUserId, hVar5.f, h.this.f11257b, h.this.c, h.this.d, h.this.e, h.this.g, (i) h.this.mApiCall);
                } else {
                    h hVar6 = h.this;
                    h hVar7 = h.this;
                    hVar6.f11256a = new f(hVar7.mUserId, hVar7.f, h.this.g, (i) h.this.mApiCall);
                }
            }
            h.this.f11256a.start(this.f11259b);
        }
    }

    public h(String str, String str2, boolean z, String str3, String str4, String str5, String str6, com.xiaomi.eco.api.a aVar) {
        super(str, aVar);
        this.f = str2;
        this.f11257b = str3;
        this.c = str4;
        this.d = str5;
        this.e = str6;
        this.g = z;
    }

    @Override // com.xiaomi.eco.api.e
    public final void cancel() {
        super.cancel();
        e eVar = this.f11256a;
        if (eVar != null) {
            eVar.cancel();
            this.f11256a = null;
        }
    }

    public final boolean j(String str) {
        return !TextUtils.isEmpty(str);
    }

    @Override // com.xiaomi.eco.api.e
    public final void start(ch7 ch7Var) {
        super.start(ch7Var);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.i("EcoBinderWrapper", "eco ble start connect called");
        ((i) this.mApiCall).O5(new a(jCurrentTimeMillis, ch7Var));
    }
}
