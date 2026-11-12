package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.g.h;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    private static final String i = "c";
    private static final ExecutorService j = ExecutorsUtils.newSingleThreadExecutor("GrsInit");
    private static long k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private GrsBaseInfo f13274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f13275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f13276c;
    private com.huawei.hms.framework.network.grs.e.a d;
    private com.huawei.hms.framework.network.grs.e.c e;
    private com.huawei.hms.framework.network.grs.e.c f;
    private com.huawei.hms.framework.network.grs.a g;
    private FutureTask<Boolean> h;

    boolean b() {
        GrsBaseInfo grsBaseInfo;
        Context context;
        if (!f() || (grsBaseInfo = this.f13274a) == null || (context = this.f13275b) == null) {
            return false;
        }
        this.d.a(grsBaseInfo, context);
        return true;
    }

    boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass() && (obj instanceof c)) {
            return this.f13274a.compare(((c) obj).f13274a);
        }
        return false;
    }

    void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, int i2) {
        if (iQueryUrlCallBack == null) {
            Logger.w(i, "IQueryUrlCallBack is must not null for process continue.");
            return;
        }
        if (this.f13274a == null || str == null || str2 == null) {
            iQueryUrlCallBack.onCallBackFail(-6);
        } else if (f()) {
            this.g.a(str, str2, iQueryUrlCallBack, this.f13275b, i2);
        } else {
            Logger.i(i, "grs init task has not completed.");
            iQueryUrlCallBack.onCallBackFail(-7);
        }
    }

    void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, int i2) {
        if (iQueryUrlsCallBack == null) {
            Logger.w(i, "IQueryUrlsCallBack is must not null for process continue.");
            return;
        }
        if (this.f13274a == null || str == null) {
            iQueryUrlsCallBack.onCallBackFail(-6);
        } else if (f()) {
            this.g.a(str, iQueryUrlsCallBack, this.f13275b, i2);
        } else {
            Logger.i(i, "grs init task has not completed.");
            iQueryUrlsCallBack.onCallBackFail(-7);
        }
    }

    void a() {
        if (f()) {
            String grsParasKey = this.f13274a.getGrsParasKey(true, true, this.f13275b);
            this.e.a(grsParasKey);
            this.e.a(grsParasKey + "time");
            this.e.a(grsParasKey + "ETag");
            this.f13276c.a(grsParasKey);
        }
    }

    Map<String, String> a(String str, int i2) {
        if (this.f13274a != null && str != null) {
            return f() ? this.g.a(str, this.f13275b, i2) : new HashMap();
        }
        Logger.w(i, "invalid para!");
        return new HashMap();
    }

    String a(String str, String str2, int i2) {
        if (this.f13274a == null || str == null || str2 == null) {
            Logger.w(i, "invalid para!");
            return null;
        }
        if (f()) {
            return this.g.a(str, str2, this.f13275b, i2);
        }
        return null;
    }

    private boolean f() {
        String str;
        String str2;
        FutureTask<Boolean> futureTask = this.h;
        if (futureTask == null) {
            return false;
        }
        try {
            return futureTask.get(8L, TimeUnit.SECONDS).booleanValue();
        } catch (InterruptedException e) {
            e = e;
            str = i;
            str2 = "init compute task interrupted.";
            Logger.w(str, str2, e);
            return false;
        } catch (CancellationException unused) {
            Logger.i(i, "init compute task canceled.");
            return false;
        } catch (ExecutionException e2) {
            e = e2;
            str = i;
            str2 = "init compute task failed.";
            Logger.w(str, str2, e);
            return false;
        } catch (TimeoutException unused2) {
            Logger.w(i, "init compute task timed out");
            return false;
        } catch (Exception e3) {
            e = e3;
            str = i;
            str2 = "init compute task occur unknown Exception";
            Logger.w(str, str2, e);
            return false;
        }
    }

    private boolean b(long j2) {
        return System.currentTimeMillis() - j2 <= 604800000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, ?> map) {
        long j2;
        if (map == null || map.isEmpty()) {
            Logger.v(i, "sp's content is empty.");
            return;
        }
        Set<String> setKeySet = map.keySet();
        for (String str : setKeySet) {
            if (str.endsWith(this.f13275b.getPackageName() + "time")) {
                String strA = this.e.a(str, "");
                if (TextUtils.isEmpty(strA) || !strA.matches("\\d+")) {
                    j2 = 0;
                } else {
                    try {
                        j2 = Long.parseLong(strA);
                    } catch (NumberFormatException e) {
                        Logger.w(i, "convert expire time from String to Long catch NumberFormatException.", e);
                        j2 = 0;
                    }
                }
                String strSubstring = str.substring(0, str.length() - 4);
                String str2 = strSubstring + "ETag";
                if (!b(j2) || !setKeySet.contains(strSubstring) || !setKeySet.contains(str2)) {
                    Logger.i(i, "init interface auto clear some invalid sp's data: " + str);
                    this.e.a(strSubstring);
                    this.e.a(str);
                    this.e.a(str2);
                }
            }
        }
    }

    private void a(GrsBaseInfo grsBaseInfo) {
        try {
            this.f13274a = grsBaseInfo.m1344clone();
        } catch (CloneNotSupportedException e) {
            Logger.w(i, "GrsClient catch CloneNotSupportedException", e);
            this.f13274a = grsBaseInfo.copy();
        }
    }

    class a implements Callable<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f13277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GrsBaseInfo f13278b;

        /* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.c$a$a, reason: collision with other inner class name */
        class RunnableC0114a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.huawei.hms.framework.network.grs.f.b f13280a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.huawei.hms.framework.network.grs.e.c f13281b;

            @Override // java.lang.Runnable
            public void run() {
                this.f13280a.a(a.this.f13277a.getPackageName(), this.f13281b);
            }

            RunnableC0114a(com.huawei.hms.framework.network.grs.f.b bVar, com.huawei.hms.framework.network.grs.e.c cVar) {
                this.f13280a = bVar;
                this.f13281b = cVar;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            Logger.i(c.i, "GrsClientImpl run futureTask");
            c.this.f13276c = new g();
            c.this.e = new com.huawei.hms.framework.network.grs.e.c(this.f13277a, GrsApp.getInstance().getBrand("_") + "share_pre_grs_conf_");
            c.this.f = new com.huawei.hms.framework.network.grs.e.c(this.f13277a, GrsApp.getInstance().getBrand("_") + "share_pre_grs_services_");
            c cVar = c.this;
            cVar.d = new com.huawei.hms.framework.network.grs.e.a(cVar.e, c.this.f, c.this.f13276c);
            c cVar2 = c.this;
            cVar2.g = new com.huawei.hms.framework.network.grs.a(cVar2.f13274a, c.this.d, c.this.f13276c, c.this.f);
            if (com.huawei.hms.framework.network.grs.f.b.a(this.f13277a.getPackageName()) == null) {
                com.huawei.hms.framework.network.grs.e.c cVar3 = new com.huawei.hms.framework.network.grs.e.c(this.f13277a, GrsApp.getInstance().getBrand("_") + "share_pre_grs_local_conf_");
                String strA = cVar3.a(this.f13277a.getPackageName() + "#localConfig", "");
                Logger.i(c.i, "localCfgInSp is empty:" + TextUtils.isEmpty(strA));
                if (TextUtils.isEmpty(strA) || !new com.huawei.hms.framework.network.grs.f.b().a(this.f13277a, strA)) {
                    com.huawei.hms.framework.network.grs.f.b bVar = new com.huawei.hms.framework.network.grs.f.b(this.f13277a, true);
                    Logger.i(c.i, "localManagerProxy start");
                    c.j.execute(new RunnableC0114a(bVar, cVar3));
                }
            }
            String strC = new com.huawei.hms.framework.network.grs.g.j.c(this.f13278b, this.f13277a).c();
            Logger.v(c.i, "scan serviceSet is: " + strC);
            String strA2 = c.this.f.a("services", "");
            String strA3 = h.a(strA2, strC);
            if (!TextUtils.isEmpty(strA3)) {
                c.this.f.b("services", strA3);
                Logger.i(c.i, "postList is:" + StringUtils.anonymizeMessage(strA3));
                Logger.d(c.i, "currentServices:" + StringUtils.anonymizeMessage(strA2));
                if (!strA3.equals(strA2)) {
                    c.this.f13276c.a(c.this.f13274a.getGrsParasKey(true, true, this.f13277a));
                    c.this.f13276c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f13278b, this.f13277a), null, null, c.this.f, c.this.f13274a.getQueryTimeout());
                }
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = c.k;
            if (c.k == 0 || TimeUnit.MILLISECONDS.toHours(jElapsedRealtime - j) > 24) {
                Logger.i(c.i, "Try to clear unUsed sp data.");
                long unused = c.k = SystemClock.elapsedRealtime();
                c cVar4 = c.this;
                cVar4.a(cVar4.e.a());
            }
            c.this.d.b(this.f13278b, this.f13277a);
            return true;
        }

        a(Context context, GrsBaseInfo grsBaseInfo) {
            this.f13277a = context;
            this.f13278b = grsBaseInfo;
        }
    }

    c(GrsBaseInfo grsBaseInfo) {
        this.h = null;
        a(grsBaseInfo);
    }

    c(Context context, GrsBaseInfo grsBaseInfo) {
        this.h = null;
        String str = i;
        StringBuilder sb = new StringBuilder("GrsClientImpl context pkg:");
        sb.append(context == null ? "" : context.getPackageName());
        Logger.i(str, sb.toString());
        this.f13275b = context.getApplicationContext() == null ? context : context.getApplicationContext();
        Logger.i(str, "GrsClientImpl context:" + context);
        a(grsBaseInfo);
        GrsBaseInfo grsBaseInfo2 = this.f13274a;
        FutureTask<Boolean> futureTask = new FutureTask<>(new a(this.f13275b, grsBaseInfo2));
        this.h = futureTask;
        j.execute(futureTask);
        Logger.i(str, "GrsClient Instance is init, GRS SDK version: %s, GrsBaseInfoParam: app_name=%s, reg_country=%s, ser_country=%s, issue_country=%s ,queryTimeout=%d", com.huawei.hms.framework.network.grs.h.a.a(), grsBaseInfo2.getAppName(), grsBaseInfo.getRegCountry(), grsBaseInfo.getSerCountry(), grsBaseInfo.getIssueCountry(), Integer.valueOf(grsBaseInfo.getQueryTimeout()));
    }
}
