package com.huawei.openalliance.ad.download.ag;

import android.content.Context;
import com.huawei.openalliance.ad.download.DownloadTask;
import com.huawei.openalliance.ad.hw;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class a<T extends DownloadTask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f18434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected com.huawei.openalliance.ad.download.a<T> f18435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected b<T> f18436c;

    public boolean c(T t) {
        if (t == null) {
            return false;
        }
        boolean zB = this.f18436c.b(t);
        hw.b("AdapterDownloadManager", "removeTask, succ:" + zB);
        if (zB) {
            a(t, true);
        }
        return true;
    }

    public void b(T t) {
        if (t == null) {
            return;
        }
        hw.b("AdapterDownloadManager", "deleteTask, succ:" + this.f18436c.b(t));
    }

    public void b() {
        hw.b("AdapterDownloadManager", "cancelAllDownload");
        Iterator<T> it = this.f18436c.a().iterator();
        while (it.hasNext()) {
            a(it.next(), true);
        }
        this.f18436c.b();
    }

    public void a(com.huawei.openalliance.ad.download.a<T> aVar) {
        this.f18435b = aVar;
    }

    protected void a(T t, boolean z) {
        if (t == null) {
            return;
        }
        if (hw.a()) {
            hw.a("AdapterDownloadManager", "onDownloadDeleted, taskId:%s", t.n());
        }
        com.huawei.openalliance.ad.download.a<T> aVar = this.f18435b;
        if (aVar != null) {
            aVar.a(t, z);
        }
    }

    public void a(T t) {
        this.f18436c.a(t);
        if (hw.a()) {
            hw.a("AdapterDownloadManager", "addTask, task:%s, priority:%d", t.n(), Integer.valueOf(t.k()));
        }
    }

    public void a() {
        if (this.f18436c == null) {
            this.f18436c = new b<>();
        }
    }

    protected T a(String str) {
        return (T) this.f18436c.a(str);
    }

    public a(Context context) {
        this.f18434a = context.getApplicationContext();
    }
}
