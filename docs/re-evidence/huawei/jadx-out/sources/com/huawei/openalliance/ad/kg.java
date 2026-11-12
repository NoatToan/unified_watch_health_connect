package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.network.embedded.j2;
import com.huawei.openalliance.ad.beans.base.ReqBean;
import com.huawei.openalliance.ad.beans.server.AdContentReq;
import com.huawei.openalliance.ad.beans.server.ConsentConfigReq;
import com.huawei.openalliance.ad.beans.server.EventReportReq;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class kg extends com.huawei.openalliance.ad.net.http.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f19442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19443b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f19444c = "POST";

    public void b(ReqBean reqBean) {
        a("X-HW-AD-Sdkver", "3.4.84.300");
        a("X-HW-App-Id", reqBean.c());
        b(reqBean, "100003");
    }

    public void a(boolean z) {
        this.f19443b = z;
    }

    public void a(ConsentConfigReq consentConfigReq) {
        a("X-HW-AD-KitVersion", consentConfigReq.d());
        a("X-HW-App-Id", consentConfigReq.c());
        b(consentConfigReq, consentConfigReq.c());
    }

    public void a(ReqBean reqBean) {
        Pair pair;
        b();
        a("X-HW-AD-Sdkver", "3.4.84.300");
        a("X-HW-AD-Pkgname", this.f19442a.getPackageName());
        a("X-HW-AD-Osver", Build.VERSION.RELEASE);
        if (reqBean instanceof EventReportReq) {
            a("User-Agent", com.huawei.openalliance.ad.utils.d.j(this.f19442a));
        }
        Pair<Integer, Pair<String, String>> pairD = en.a(this.f19442a).d();
        if (pairD == null) {
            pairD = com.huawei.openalliance.ad.utils.cb.f(this.f19442a);
        }
        if (pairD != null && (pair = (Pair) pairD.second) != null) {
            a("X-HW-AD-Mcc", (String) pair.first);
            a("X-HW-AD-Mnc", (String) pair.second);
        }
        a(j2.v, Constants.GZIP);
        a("Authorization", a(reqBean, "100003"));
        a("Content-Type", "application/json");
        c(reqBean);
    }

    private void c(ReqBean reqBean) {
        Pair<String, Boolean> pairB;
        if (((reqBean instanceof AdContentReq) && ((AdContentReq) reqBean).P()) || (pairB = com.huawei.openalliance.ad.utils.d.b(this.f19442a, true)) == null || TextUtils.isEmpty((CharSequence) pairB.first) || ((Boolean) pairB.second).booleanValue()) {
            return;
        }
        a("X-HW-AD-Oaid", (String) pairB.first);
    }

    private void c() {
        String strB = com.huawei.openalliance.ad.utils.ab.b();
        if (com.huawei.openalliance.ad.utils.dg.b(strB)) {
            return;
        }
        a("X-HW-AD-Model", strB.toUpperCase(Locale.ENGLISH));
    }

    private void b(ReqBean reqBean, String str) {
        c();
        a(j2.v, Constants.GZIP);
        String strA = a(reqBean, str);
        if (!TextUtils.isEmpty(strA)) {
            a("Authorization", strA);
        }
        a("Content-Type", "application/json");
        c(reqBean);
    }

    private void b() {
        String strB = cc.a(this.f19442a).b();
        if (com.huawei.openalliance.ad.utils.dg.b(strB)) {
            return;
        }
        a("X-HW-AD-Model", strB.toUpperCase(Locale.ENGLISH));
    }

    public static void a(Map<String, String> map) {
        map.remove("X-HW-AD-Androidid");
        map.remove("X-HW-AD-Mcc");
        map.remove("X-HW-AD-Mnc");
    }

    private String a(String str, String str2, String str3, String str4, String str5) {
        return com.huawei.openalliance.ad.utils.at.a(str + ":" + str2 + ":" + com.huawei.openalliance.ad.utils.g.b(str4, com.huawei.openalliance.ad.utils.cw.a(this.f19442a)), str3 + ":" + this.f19444c + ":" + str5);
    }

    private String a(ReqBean reqBean, String str) {
        String strA = reqBean.a();
        String strValueOf = String.valueOf(com.huawei.openalliance.ad.utils.as.c());
        return "Digest username=" + str + ",realm=" + strA + ",nonce=" + strValueOf + ",response=" + a(str, strA, strValueOf, reqBean.a(this.f19442a), reqBean.b()) + ",algorithm=HmacSHA256";
    }

    public kg(Context context) {
        this.f19442a = context;
    }
}
