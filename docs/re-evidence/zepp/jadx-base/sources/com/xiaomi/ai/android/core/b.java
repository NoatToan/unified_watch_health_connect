package com.xiaomi.ai.android.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import com.xiaomi.ai.android.capability.TrackCapability;
import com.xiaomi.ai.android.netbeans.AivsCloudConfigBean;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import java.util.Random;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes18.dex */
public class b {
    private d a;
    private Context b;
    private Runnable c;
    private String d;
    private String e;
    private String f;
    private OkHttpClient g;
    private int h = 0;
    private ScheduledFuture i;

    public b(d dVar) {
        this.a = dVar;
        this.b = dVar.a();
        AivsConfig aivsConfigB = dVar.b();
        this.d = aivsConfigB.getString(AivsConfig.Auth.CLIENT_ID);
        this.f = aivsConfigB.getString("user_id");
        this.e = dVar.m().getDeviceId().isPresent() ? dVar.m().getDeviceId().get() : "";
        this.g = new OkHttpClient.Builder().addInterceptor(new com.xiaomi.ai.transport.a()).connectTimeout(aivsConfigB.getInt(AivsConfig.Connection.CONNECT_TIMEOUT), TimeUnit.SECONDS).build();
        this.c = new Runnable() { // from class: com.xiaomi.ai.android.core.b.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (b.class) {
                    b.this.a(0);
                    b bVar = b.this;
                    long jB = bVar.b(bVar.h);
                    Logger.b("CloudControlManager", "mRequestInterval : " + b.this.h + " min");
                    if (jB > 0) {
                        b.this.a(jB);
                    } else {
                        b.this.c();
                        b bVar2 = b.this;
                        bVar2.a(bVar2.b(bVar2.h));
                    }
                }
            }
        };
    }

    private long a(String str, long j) {
        String strA = com.xiaomi.ai.android.utils.e.a(this.b, "aivs_cloud_control", str);
        try {
            return !com.xiaomi.ai.b.f.a(strA) ? Long.parseLong(strA) : j;
        } catch (NumberFormatException e) {
            Logger.c("CloudControlManager", "get key error key:" + str + " error:" + Logger.throwableToString(e));
            return j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i > 0) {
            int i2 = i / 2;
            int iNextInt = i2 + new Random().nextInt(i2);
            this.h = iNextInt;
            b("cloud_config_interval", iNextInt);
            return;
        }
        int iA = (int) a("cloud_config_interval", 0L);
        this.h = iA;
        if (iA <= 0) {
            this.h = new Random().nextInt(60) + 60;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        Logger.b("CloudControlManager", "startNext: " + ((j / 1000) / 60) + " min");
        if (this.c == null) {
            Logger.b("CloudControlManager", "startNext error ,has been released");
            return;
        }
        if (this.i != null) {
            Logger.b("CloudControlManager", "remove last task");
            com.xiaomi.ai.b.c.a(this.i);
        }
        try {
            this.i = com.xiaomi.ai.b.c.a(this.c, j);
        } catch (RejectedExecutionException e) {
            Logger.d("CloudControlManager", Logger.throwableToString(e));
        }
    }

    private void a(AivsCloudConfigBean.ClearBean clearBean) {
        if (clearBean.isHttpdns()) {
            e();
        }
        if (clearBean.isPublickey()) {
            f();
        }
        if (clearBean.isAESkey()) {
            g();
        }
        if (clearBean.isNmapcache()) {
            h();
        }
        if (clearBean.isLogcache()) {
            i();
        }
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Logger.b("CloudControlManager", "updateLink mode:set link mode");
        this.a.h().a(this.a.g(), "link_mode", str);
    }

    private void a(boolean z) {
        Logger.b("CloudControlManager", "updateUpLoadLogSwitch: " + z);
        this.a.h().a(this.a.g(), "upload_log_switch", String.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long b(int i) {
        long jA = a("cloud_config_last_request_time", 0L);
        if (jA >= System.currentTimeMillis() || jA < 0) {
            Logger.b("CloudControlManager", "getNextInterval remove error num");
            b("cloud_config_last_request_time");
            return 0L;
        }
        if (jA == 0) {
            return 0L;
        }
        return (((long) (i * 60)) * 1000) - (System.currentTimeMillis() - jA);
    }

    private void b(String str) {
        com.xiaomi.ai.android.utils.e.b(this.b, "aivs_cloud_control", str);
    }

    private void b(String str, long j) {
        com.xiaomi.ai.android.utils.e.a(this.b, "aivs_cloud_control", str, String.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b("cloud_config_last_request_time", System.currentTimeMillis());
        AivsCloudConfigBean aivsCloudConfigBeanD = d();
        if (aivsCloudConfigBeanD == null || this.c == null) {
            return;
        }
        Logger.b("CloudControlManager", "getCloudConfigFromNet aivsCloudConfigBean:" + aivsCloudConfigBeanD);
        int version = aivsCloudConfigBeanD.getVersion();
        if (version <= 0) {
            Logger.d("CloudControlManager", "getCloudConfig error,illegal version :" + version);
            return;
        }
        int iA = (int) a("cloud_config_version", -1L);
        if (version == iA) {
            Logger.c("CloudControlManager", "getCloudConfig with old version :localVersion " + iA + " cloudVersion " + version);
            return;
        }
        if (com.xiaomi.ai.b.f.a(aivsCloudConfigBeanD.getLinkMode())) {
            Logger.c("CloudControlManager", "getCloudConfig error,illegal LinkMode ");
            return;
        }
        Logger.a("CloudControlManager", "cloudVersion:" + version + " localVersion:" + iA);
        b("cloud_config_version", (long) version);
        if (aivsCloudConfigBeanD.getClear() != null) {
            a(aivsCloudConfigBeanD.getClear());
        }
        a(aivsCloudConfigBeanD.getLinkMode());
        a(aivsCloudConfigBeanD.getRequestInterval());
        Logger.b("CloudControlManager", "next interval:" + this.h);
        a(aivsCloudConfigBeanD.getUploadLogSwitch());
    }

    private AivsCloudConfigBean d() {
        HttpUrl.Builder builderNewBuilder = HttpUrl.parse(new com.xiaomi.ai.core.c(this.a.b()).k()).newBuilder();
        builderNewBuilder.addQueryParameter("client_id", this.d);
        builderNewBuilder.addQueryParameter("did", this.e);
        builderNewBuilder.addQueryParameter("uid", this.f);
        Logger.a("CloudControlManager", "getCloudConfigFromNet client_id: " + this.d + " did: " + this.e + " uid:" + this.f);
        try {
            Response responseExecute = FirebasePerfOkHttpClient.execute(this.g.newCall(new Request.Builder().url(builderNewBuilder.build()).get().build()));
            if (responseExecute.isSuccessful()) {
                try {
                    String strString = responseExecute.body().string();
                    Logger.b("CloudControlManager", "getCloudConfigFromNet body: " + strString);
                    return (AivsCloudConfigBean) new Gson().fromJson(strString, AivsCloudConfigBean.class);
                } catch (Exception e) {
                    Logger.d("CloudControlManager", Logger.throwableToString(e));
                    return null;
                }
            }
            String string = responseExecute.toString();
            if (responseExecute.body() != null) {
                string = string + ", body=" + responseExecute.body().string();
            }
            Logger.d("CloudControlManager", "parse error" + string);
            return null;
        } catch (Exception e2) {
            Logger.d("CloudControlManager", Log.getStackTraceString(e2));
            return null;
        }
    }

    private void e() {
        Logger.b("CloudControlManager", "clear httpdns cache");
        this.a.g().getListener().b(this.a.g(), "http_dns_cache");
        this.a.g().getListener().b(this.a.g(), "ipv6_http_dns_cache");
    }

    private void f() {
        Logger.b("CloudControlManager", "clear PublicKey");
        synchronized ("pubkey_info") {
            this.a.g().getListener().b(this.a.g(), "pubkey_info");
        }
    }

    private void g() {
        Logger.b("CloudControlManager", "clear AESKey");
        synchronized ("aes_key_info") {
            this.a.g().getListener().b(this.a.g(), "aes_key");
            this.a.g().getListener().b(this.a.g(), "aes_token");
            this.a.g().getListener().b(this.a.g(), "aes_expire_at");
        }
    }

    private void h() {
        Logger.a("CloudControlManager", "clear NmapCache");
    }

    private void i() {
        Logger.b("CloudControlManager", "clear LogCache");
        TrackCapability trackCapability = (TrackCapability) this.a.a(TrackCapability.class);
        if (trackCapability != null) {
            trackCapability.removeKeyValue("track_failed_info");
        }
        com.xiaomi.ai.android.utils.e.b(this.b, "common_track", "track_cached_info");
    }

    public boolean a() {
        if (!this.a.g().getAivsConfig().getBoolean(AivsConfig.Connection.ENABLE_CLOUD_CONTROL)) {
            Logger.c("CloudControlManager", "start error ,CloudConfigManager not enable");
            return false;
        }
        Runnable runnable = this.c;
        if (runnable == null) {
            Logger.d("CloudControlManager", "start error ,CloudConfigManager has been released");
            return false;
        }
        com.xiaomi.ai.b.c.a.execute(runnable);
        return true;
    }

    public void b() {
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            com.xiaomi.ai.b.c.a(scheduledFuture);
            this.i = null;
        }
        this.c = null;
    }
}
