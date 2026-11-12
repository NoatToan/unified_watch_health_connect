package com.xiaomi.ai.android.core;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.ai.android.capability.TrackCapability;
import com.xiaomi.ai.android.netbeans.AivsCloudConfigBean;
import com.xiaomi.ai.api.common.APIUtils;
import defpackage.d2s;
import defpackage.d3s;
import defpackage.e01;
import defpackage.gt3;
import defpackage.ues;
import defpackage.wpe;
import defpackage.yrs;
import java.security.SecureRandom;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f10883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10884b;
    private Runnable c;
    private String d;
    private String e;
    private String f;
    private OkHttpClient g;
    private ScheduledFuture<?> i;
    private int h = 0;
    private SecureRandom j = new SecureRandom();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.class) {
                try {
                    c.this.b(0);
                    c cVar = c.this;
                    long jA = cVar.a(cVar.h);
                    wpe.h("CloudControlManager", "mRequestInterval : " + c.this.h + " min");
                    if (jA > 0) {
                        c.this.a(jA);
                    } else {
                        c.this.a();
                        c cVar2 = c.this;
                        cVar2.a(cVar2.a(cVar2.h));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public c(e eVar) {
        this.f10883a = eVar;
        this.f10884b = eVar.j();
        e01 e01VarI = eVar.i();
        this.d = e01VarI.i("auth.client_id");
        this.f = e01VarI.i("user_id");
        this.e = eVar.h().getDeviceId().c() ? eVar.h().getDeviceId().b() : "";
        this.g = new OkHttpClient.Builder().addInterceptor(new d2s()).connectTimeout(e01VarI.e("connection.connect_timeout"), TimeUnit.SECONDS).build();
        this.c = new a();
    }

    private void c() {
        wpe.h("CloudControlManager", "clear httpdns cache");
        gt3 gt3VarE = this.f10883a.e();
        if (gt3VarE == null) {
            wpe.e("CloudControlManager", "clearHttpDns: Channel is null");
        } else {
            gt3VarE.getListener().onRemove(gt3VarE, "http_dns_cache");
            gt3VarE.getListener().onRemove(gt3VarE, "ipv6_http_dns_cache");
        }
    }

    private void d() {
        wpe.h("CloudControlManager", "clear LogCache");
        TrackCapability trackCapability = (TrackCapability) this.f10883a.a(TrackCapability.class);
        if (trackCapability != null) {
            trackCapability.removeKeyValue("track_failed_info");
        }
        com.xiaomi.ai.android.utils.d.b(this.f10884b, "common_track", "track_cached_info");
    }

    private void e() {
        wpe.b("CloudControlManager", "clear NmapCache");
    }

    private void f() {
        wpe.h("CloudControlManager", "clear PublicKey");
        synchronized ("pubkey_info") {
            try {
                gt3 gt3VarE = this.f10883a.e();
                if (gt3VarE == null) {
                    wpe.e("CloudControlManager", "clearPublicKey: Channel is null");
                } else {
                    gt3VarE.getListener().onRemove(gt3VarE, "pubkey_info");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private AivsCloudConfigBean g() {
        HttpUrl.Builder builderNewBuilder = HttpUrl.parse(new d3s(this.f10883a.i()).d()).newBuilder();
        builderNewBuilder.addQueryParameter("client_id", this.d);
        builderNewBuilder.addQueryParameter("did", this.e);
        builderNewBuilder.addQueryParameter("uid", this.f);
        wpe.b("CloudControlManager", "getCloudConfigFromNet client_id: " + this.d + " did: " + this.e + " uid:" + this.f);
        try {
            Response responseExecute = this.g.newCall(new Request.Builder().url(builderNewBuilder.build()).get().build()).execute();
            if (responseExecute.isSuccessful()) {
                String strString = responseExecute.body().string();
                wpe.h("CloudControlManager", "getCloudConfigFromNet body: " + strString);
                return (AivsCloudConfigBean) APIUtils.getObjectMapper().readValue(strString, AivsCloudConfigBean.class);
            }
            String string = responseExecute.toString();
            if (responseExecute.body() != null) {
                string = string + ", body=" + responseExecute.body().string();
            }
            wpe.e("CloudControlManager", "parse error" + string);
            return null;
        } catch (Exception e) {
            wpe.e("CloudControlManager", wpe.o(e));
            return null;
        }
    }

    public void h() {
        ScheduledFuture<?> scheduledFuture = this.i;
        if (scheduledFuture != null) {
            ues.c(scheduledFuture);
            this.i = null;
        }
        this.c = null;
    }

    public boolean i() {
        if (!this.f10883a.e().getAivsConfig().b("connection.enable_cloud_control")) {
            wpe.k("CloudControlManager", "start error ,CloudConfigManager not enable");
            return false;
        }
        Runnable runnable = this.c;
        if (runnable == null) {
            wpe.e("CloudControlManager", "start error ,CloudConfigManager has been released");
            return false;
        }
        ues.f35695a.execute(runnable);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(int i) {
        long jA = a("cloud_config_last_request_time", 0L);
        if (jA >= System.currentTimeMillis() || jA < 0) {
            wpe.h("CloudControlManager", "getNextInterval remove error num");
            a("cloud_config_last_request_time");
            return 0L;
        }
        if (jA == 0) {
            return 0L;
        }
        return (((long) (i * 60)) * 1000) - (System.currentTimeMillis() - jA);
    }

    private void b() {
        wpe.h("CloudControlManager", "clear AESKey");
        synchronized ("aes_key_info") {
            try {
                gt3 gt3VarE = this.f10883a.e();
                if (gt3VarE == null) {
                    wpe.e("CloudControlManager", "clearAESKey: Channel is null");
                    return;
                }
                gt3VarE.getListener().onRemove(gt3VarE, "aes_key");
                gt3VarE.getListener().onRemove(gt3VarE, "aes_token");
                gt3VarE.getListener().onRemove(gt3VarE, "aes_expire_at");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private long a(String str, long j) {
        String strA = com.xiaomi.ai.android.utils.d.a(this.f10884b, "aivs_cloud_control", str);
        try {
            return !yrs.b(strA) ? Long.parseLong(strA) : j;
        } catch (NumberFormatException e) {
            wpe.k("CloudControlManager", "get key error key:" + str + " error:" + wpe.o(e));
            return j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (i > 0) {
            int i2 = i / 2;
            int iNextInt = i2 + this.j.nextInt(i2);
            this.h = iNextInt;
            b("cloud_config_interval", iNextInt);
            return;
        }
        int iA = (int) a("cloud_config_interval", 0L);
        this.h = iA;
        if (iA <= 0) {
            this.h = this.j.nextInt(60) + 60;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        b("cloud_config_last_request_time", System.currentTimeMillis());
        AivsCloudConfigBean aivsCloudConfigBeanG = g();
        if (aivsCloudConfigBeanG == null || this.c == null) {
            wpe.h("CloudControlManager", "applyCloudConfig: aivsCloudConfigBean == null or mUpdateRunnable == null");
            return;
        }
        wpe.h("CloudControlManager", "applyCloudConfig: aivsCloudConfigBean:" + aivsCloudConfigBeanG);
        int version = aivsCloudConfigBeanG.getVersion();
        if (version <= 0) {
            wpe.e("CloudControlManager", "applyCloudConfig: error,illegal version :" + version);
            return;
        }
        int iA = (int) a("cloud_config_version", -1L);
        if (!yrs.b(com.xiaomi.ai.android.utils.d.a(this.f10884b, "aivs_cloud_control", "link_mode")) && version == iA) {
            wpe.k("CloudControlManager", "applyCloudConfig: localVersion: " + iA + " cloudVersion: " + version);
            return;
        }
        if (yrs.b(aivsCloudConfigBeanG.getLinkMode())) {
            wpe.k("CloudControlManager", "applyCloudConfig: illegal LinkMode");
            return;
        }
        wpe.b("CloudControlManager", "applyCloudConfig: cloudVersion:" + version + " localVersion:" + iA);
        b("cloud_config_version", (long) version);
        if (aivsCloudConfigBeanG.getClear() != null) {
            a(aivsCloudConfigBeanG.getClear());
        }
        b(aivsCloudConfigBeanG.getLinkMode());
        b(aivsCloudConfigBeanG.getRequestInterval());
        wpe.h("CloudControlManager", "next interval:" + this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        wpe.h("CloudControlManager", "startNext: " + ((j / 1000) / 60) + " min");
        if (this.c == null) {
            wpe.h("CloudControlManager", "startNext error ,has been released");
            return;
        }
        if (this.i != null) {
            wpe.h("CloudControlManager", "remove last task");
            ues.c(this.i);
        }
        try {
            this.i = ues.a(this.c, j);
        } catch (RejectedExecutionException e) {
            wpe.e("CloudControlManager", wpe.o(e));
        }
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        wpe.h("CloudControlManager", "updateLink mode:set link mode");
        com.xiaomi.ai.android.utils.d.a(this.f10884b, "aivs_cloud_control", "link_mode", str);
    }

    private void b(String str, long j) {
        com.xiaomi.ai.android.utils.d.a(this.f10884b, "aivs_cloud_control", str, String.valueOf(j));
    }

    private void a(AivsCloudConfigBean.ClearBean clearBean) {
        if (clearBean.isHttpdns()) {
            c();
        }
        if (clearBean.isPublickey()) {
            f();
        }
        if (clearBean.isAESkey()) {
            b();
        }
        if (clearBean.isNmapcache()) {
            e();
        }
        if (clearBean.isLogcache()) {
            d();
        }
    }

    private void a(String str) {
        com.xiaomi.ai.android.utils.d.b(this.f10884b, "aivs_cloud_control", str);
    }
}
