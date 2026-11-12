package com.huawei.openalliance.ad.download;

import android.content.Context;
import androidx.media3.extractor.AacUtil;
import com.huawei.openalliance.ad.download.DownloadTask;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.ai;
import com.huawei.openalliance.ad.utils.o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes12.dex */
public class b<T extends DownloadTask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f18609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected com.huawei.openalliance.ad.download.a<T> f18611c;
    protected h d;
    protected d<T> e;
    private ExecutorService f;
    private Integer g;

    protected int d() {
        return AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
    }

    protected void j(T t) {
        if (t == null || t.q()) {
            return;
        }
        if (hw.a()) {
            hw.a("DownloadManager", "onDownloadFail, taskId:%s", t.n());
        }
        if (ai.b(t.e()) || ai.b(this.f18609a, t.d())) {
            b(t);
        } else {
            t.b(0);
        }
        t.a(e.FAILED);
        com.huawei.openalliance.ad.download.a<T> aVar = this.f18611c;
        if (aVar != null) {
            aVar.onDownloadFail(t);
        }
    }

    protected void i(T t) {
        if (t == null || t.q()) {
            return;
        }
        if (hw.a()) {
            hw.a("DownloadManager", "onDownloadSwitchSafeUrl, taskId:%s", t.n());
        }
        com.huawei.openalliance.ad.download.a<T> aVar = this.f18611c;
        if (aVar != null) {
            aVar.b(t);
        }
    }

    protected void h(T t) {
        if (t == null || t.q()) {
            return;
        }
        if (hw.a()) {
            hw.a("DownloadManager", "onDownloadSuccess, taskId:%s", t.n());
        }
        this.e.b(t);
        com.huawei.openalliance.ad.download.a<T> aVar = this.f18611c;
        if (aVar != null) {
            aVar.onDownloadSuccess(t);
        }
    }

    protected void g(T t) {
        if (t == null || t.q()) {
            return;
        }
        if (hw.a()) {
            hw.a("DownloadManager", "onDownloadStart, taskId:%s", t.n());
        }
        t.a(e.DOWNLOADING);
        com.huawei.openalliance.ad.download.a<T> aVar = this.f18611c;
        if (aVar != null) {
            aVar.onDownloadStart(t);
        }
    }

    public int g() {
        Integer num = this.g;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public boolean f() {
        Integer num = this.g;
        return num != null && num.intValue() > 0;
    }

    protected void f(T t) {
        if (t == null || t.q()) {
            return;
        }
        if (hw.a()) {
            hw.a("DownloadManager", "onDownloadWaiting, taskId:%s", t.n());
        }
        com.huawei.openalliance.ad.download.a<T> aVar = this.f18611c;
        if (aVar != null) {
            aVar.onDownloadWaiting(t);
        }
    }

    public void e(T t) {
        if (t == null || t.q()) {
            return;
        }
        if (hw.a()) {
            hw.a("DownloadManager", "onDownloadWaitingForWifi, taskId:%s", t.n());
        }
        t.a(e.WAITING_FOR_WIFI);
        t.a(DownloadTask.c.WAITING_WIFI_DOWNLOAD);
        com.huawei.openalliance.ad.download.a<T> aVar = this.f18611c;
        if (aVar != null) {
            aVar.a(t);
        }
    }

    public int e() {
        Context context = this.f18609a;
        if (context != null) {
            return fp.b(context).bD();
        }
        return 5;
    }

    protected boolean d(T t) {
        if (t == null) {
            return true;
        }
        boolean zD = this.e.d(t);
        if (!hw.a()) {
            return true;
        }
        hw.a("DownloadManager", "deleteTask, succ:%s, taskId:%s, priority:%d", Boolean.valueOf(zD), t.n(), Integer.valueOf(t.k()));
        return true;
    }

    protected void d(T t, boolean z) {
        if (t == null) {
            return;
        }
        if (hw.a()) {
            hw.a("DownloadManager", "onDownloadDeleted, taskId:%s", t.n());
        }
        com.huawei.openalliance.ad.download.a<T> aVar = this.f18611c;
        if (aVar != null) {
            aVar.a(t, z);
        }
    }

    public boolean c(T t) {
        e eVarI = t.i();
        boolean zQ = t.q();
        t.a(e.WAITING);
        t.b(false);
        boolean zA = this.e.a(t);
        if (hw.a()) {
            hw.a("DownloadManager", "addTask, added:%s, task:%s, priority:%d", Boolean.valueOf(zA), t.n(), Integer.valueOf(t.k()));
        }
        if (zA) {
            f(t);
            return zA;
        }
        t.a(eVarI);
        t.b(zQ);
        return zA;
    }

    protected void c(T t, boolean z) {
        if (t == null || t.q()) {
            return;
        }
        if (hw.a()) {
            hw.a("DownloadManager", "onDownloadResumed, taskId:%s", t.n());
        }
        com.huawei.openalliance.ad.download.a<T> aVar = this.f18611c;
        if (aVar != null) {
            aVar.c(t, z);
        }
    }

    protected int c() {
        return this.e.a();
    }

    public boolean b(T t) {
        return this.e.b(t);
    }

    protected void b(T t, boolean z) {
        if (t == null || t.q()) {
            return;
        }
        if (hw.a()) {
            hw.a("DownloadManager", "onDownloadPaused, taskId:%s", t.n());
        }
        com.huawei.openalliance.ad.download.a<T> aVar = this.f18611c;
        if (aVar != null) {
            aVar.b(t, z);
        }
    }

    protected T b() {
        return (T) this.e.b();
    }

    protected boolean a(T t, boolean z, boolean z2, boolean z3) {
        if (t == null) {
            return false;
        }
        if (z) {
            t.b(true);
        }
        hw.b("DownloadManager", "removeTask, succ:" + this.e.g(t) + ", fromUser:" + z);
        if (z2) {
            o.f(new a(t, this.f18609a));
        }
        if (z3) {
            d(t, z);
        }
        return true;
    }

    public boolean a(T t, boolean z) {
        if (t == null) {
            return false;
        }
        if (t.l() >= 100) {
            t.b(0);
        }
        boolean zQ = t.q();
        t.b(false);
        boolean zF = this.e.f(t);
        if (hw.a()) {
            hw.a("DownloadManager", "resumeTask, succ:%s, taskId:%s", Boolean.valueOf(zF), t.n());
        }
        if (!zF) {
            t.b(zQ);
            return false;
        }
        t.a(e.WAITING);
        c(t, z);
        return true;
    }

    public void a(Integer num) {
        this.g = num;
    }

    public void a(com.huawei.openalliance.ad.download.a<T> aVar) {
        this.f18611c = aVar;
    }

    public void a(T t, DownloadTask.c cVar) {
        if (t == null) {
            return;
        }
        boolean zE = this.e.e(t);
        if (hw.a()) {
            hw.a("DownloadManager", "pauseTask, succ:%s, taskId:%s", Boolean.valueOf(zE), t.n());
        }
        if (zE) {
            hw.b("DownloadManager", "reason:" + cVar);
            t.a(cVar);
            t.a(e.IDLE);
            b(t, DownloadTask.c.USER_CLICK == cVar);
        }
    }

    protected void a(T t, int i) {
        if (t == null || t.q()) {
            return;
        }
        if (hw.a() && i % 10 == 0) {
            hw.a("DownloadManager", "onDownloadProgress, progress:%d, taskId:%s", Integer.valueOf(i), t.n());
        }
        t.b(i);
        com.huawei.openalliance.ad.download.a<T> aVar = this.f18611c;
        if (aVar != null) {
            aVar.onDownloadProgress(t);
        }
    }

    protected void a(T t) {
        if (t != null) {
            if (hw.a()) {
                hw.a("DownloadManager", "onDownloadCompleted, taskId:%s, priority:%d", t.n(), Integer.valueOf(t.k()));
            }
            this.e.c(t);
        }
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DownloadTask f18612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f18613b;

        @Override // java.lang.Runnable
        public void run() {
            DownloadTask downloadTask = this.f18612a;
            if (downloadTask == null) {
                return;
            }
            ai.a(this.f18613b, downloadTask.e());
            ai.a(this.f18613b, this.f18612a.d());
        }

        a(DownloadTask downloadTask, Context context) {
            this.f18612a = downloadTask;
            this.f18613b = context;
        }
    }

    public void a() {
        if (this.e == null) {
            this.e = new d<>();
        }
        this.f = Executors.newFixedThreadPool(1, new f());
        h hVar = new h(this);
        this.d = hVar;
        this.f.execute(hVar);
    }

    public T a(String str) {
        return (T) this.e.a(str);
    }

    public b(Context context) {
        this.f18609a = context.getApplicationContext();
    }
}
