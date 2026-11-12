package com.huawei.updatesdk.service.global;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.appgallery.markethomecountrysdk.api.HomeCountryApi;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.updatesdk.service.otaupdate.f;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29960b;

    public abstract int a(Context context, String str);

    abstract String a();

    abstract String a(Context context);

    public abstract void a(List<String> list);

    public abstract String b();

    public void b(String str) {
    }

    public abstract boolean e(Context context);

    public String d(Context context) {
        if (!TextUtils.equals("SECURITY", com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.b.a())) {
            return b(context);
        }
        com.huawei.updatesdk.sdk.foundation.a.b("AbstractTaskInit", "UpdateSDK Get url is security url");
        return a(context);
    }

    private void c(Context context) {
        String issueCountryCode = GrsApp.getInstance().getIssueCountryCode(context);
        com.huawei.updatesdk.sdk.foundation.a.b("AbstractTaskInit", "UpdateSDK use grs issue country code");
        f.c().a(issueCountryCode);
    }

    private void c() {
        String str;
        Context contextA = com.huawei.updatesdk.sdk.service.app.a.c().a();
        try {
            String str2 = (String) Tasks.await(HomeCountryApi.getHomeCountry(contextA, "UpdateSDK", false));
            if (TextUtils.isEmpty(str2)) {
                c(contextA);
            } else {
                f.c().a(str2);
            }
        } catch (InterruptedException unused) {
            str = "get country code InterruptedException";
            com.huawei.updatesdk.sdk.foundation.a.a("AbstractTaskInit", str);
            c(contextA);
        } catch (ExecutionException unused2) {
            str = "get country code ExecutionException.";
            com.huawei.updatesdk.sdk.foundation.a.a("AbstractTaskInit", str);
            c(contextA);
        }
    }

    private String b(Context context) {
        c();
        String strA = f.c().a();
        if (!TextUtils.isEmpty(this.f29959a) && TextUtils.equals(this.f29959a, strA) && !TextUtils.isEmpty(this.f29960b)) {
            com.huawei.updatesdk.sdk.foundation.a.b("AbstractTaskInit", "UpdateSDK Get url from cache!" + a(this.f29960b));
            return this.f29960b;
        }
        this.f29959a = strA;
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setSerCountry(strA);
        this.f29960b = new GrsClient(context, grsBaseInfo).synGetGrsUrl(a(), "ROOT");
        com.huawei.updatesdk.sdk.foundation.a.b("AbstractTaskInit", "UpdateSDK Get url from GRS_SDK Success!" + a(this.f29960b));
        if (!TextUtils.isEmpty(this.f29960b)) {
            return this.f29960b;
        }
        com.huawei.updatesdk.sdk.foundation.a.b("AbstractTaskInit", "UpdateSDK Get url is default url");
        return a(context);
    }

    private String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.substring(0, str.indexOf(46));
        } catch (Exception e) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("AbstractTaskInit", e.toString());
            return null;
        }
    }
}
