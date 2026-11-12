package com.huawei.openalliance.ad.download.app;

import com.huawei.openalliance.ad.hw;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f18605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CountDownLatch f18606b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18607c;
    private boolean d;
    private int e;

    public interface a {
        void a(int i);

        void a(n nVar);

        void b(n nVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f18605a == null) {
            return;
        }
        hw.a("RestoreTask", "task:%s startup", this.f18607c);
        if (this.d) {
            hw.a("RestoreTask", "task:%s is canceled", this.f18607c);
            return;
        }
        try {
            try {
                this.f18605a.a(this);
                this.f18605a.b(this);
                d();
                this.f18605a.a(this.e);
            } finally {
                this.f18605a.a(this.e);
            }
        } catch (Throwable unused) {
            hw.c("RestoreTask", "try restore has exception");
        }
    }

    public void c() {
        this.d = false;
    }

    public void b() {
        this.d = true;
    }

    public void a(int i) {
        hw.a("RestoreTask", "stub result code:%s", Integer.valueOf(i));
        if (i == -1 || i == 0) {
            this.e = i;
            this.f18606b.countDown();
        }
    }

    public String a() {
        return this.f18607c;
    }

    private void d() {
        try {
            boolean zAwait = this.f18606b.await(5L, TimeUnit.SECONDS);
            hw.b("RestoreTask", "wait restore success:%s", Boolean.valueOf(zAwait));
            if (zAwait) {
                return;
            }
            this.e = -1;
        } catch (Throwable unused) {
            hw.c("RestoreTask", "wait result failed");
        }
    }

    public n(String str, a aVar) {
        this.f18607c = "restore_" + str;
        this.f18605a = aVar;
    }
}
