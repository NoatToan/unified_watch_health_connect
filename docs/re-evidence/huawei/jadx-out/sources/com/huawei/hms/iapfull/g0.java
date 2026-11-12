package com.huawei.hms.iapfull;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13670b;

    public void a(Context context, String str, f0 f0Var) {
        d1.a().a(new a(context, str, f0Var));
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g0 f13674a = new g0(null);
    }

    public static g0 a() {
        return b.f13674a;
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f13671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f0 f13673c;

        @Override // java.lang.Runnable
        public void run() {
            g0 g0Var = g0.this;
            Context context = this.f13671a;
            String str = this.f13672b;
            f0 f0Var = this.f13673c;
            g0Var.getClass();
            y0.b("GrsManager", "queryGrsFromSDK begin");
            GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
            grsBaseInfo.setSerCountry(str);
            grsBaseInfo.setCountrySource(str);
            Map<String, String> mapSynGetGrsUrls = new GrsClient(context, grsBaseInfo).synGetGrsUrls("com.huawei.cloud.pay.iap.global");
            if (mapSynGetGrsUrls == null || mapSynGetGrsUrls.isEmpty()) {
                y0.a("GrsManager", "queryGrsFromSDK, urlInfo is empty.");
                f0Var.a("705");
            } else {
                g0Var.f13669a = mapSynGetGrsUrls.get(h0.f13679b);
                g0Var.f13670b = mapSynGetGrsUrls.get("WebPay");
                y0.b("GrsManager", "queryGrsFromSDK success");
                f0Var.a();
            }
        }

        a(Context context, String str, f0 f0Var) {
            this.f13671a = context;
            this.f13672b = str;
            this.f13673c = f0Var;
        }
    }

    /* synthetic */ g0(a aVar) {
        this();
    }

    private g0() {
        this.f13669a = "";
        this.f13670b = "";
    }
}
