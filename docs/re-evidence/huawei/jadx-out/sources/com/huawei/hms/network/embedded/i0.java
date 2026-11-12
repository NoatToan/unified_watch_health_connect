package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes34.dex */
public class i0 implements Callable<m0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14892c = "DnsCallable";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f14894b;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h0 f14896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BlockingQueue f14897c;

        @Override // java.lang.Runnable
        public void run() {
            Logger.v(i0.f14892c, (this.f14896b == h0.f14838b ? "LocalDNS" : "HttpDNS").concat(" do look up"));
            m0 m0VarLookup = this.f14896b.lookup(this.f14895a);
            if (!m0VarLookup.j()) {
                this.f14897c.add(m0VarLookup);
            } else if (this.f14896b != h0.f14838b) {
                Logger.w(i0.f14892c, "HttpDNS do look up result is empty");
            } else {
                Logger.w(i0.f14892c, "LocalDNS do look up result is empty");
                this.f14897c.add(m0VarLookup);
            }
        }

        public a(String str, h0 h0Var, BlockingQueue blockingQueue) {
            this.f14895a = str;
            this.f14896b = h0Var;
            this.f14897c = blockingQueue;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public m0 call() {
        Throwable e;
        m0 m0Var;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        m0 m0Var2 = new m0();
        try {
            if (t.m().k()) {
                this.f14894b.execute(new a(this.f14893a, h0.d, linkedBlockingQueue));
            }
            this.f14894b.execute(new a(this.f14893a, h0.f14838b, linkedBlockingQueue));
            m0Var = (m0) linkedBlockingQueue.poll(y.a(), TimeUnit.MILLISECONDS);
            if (m0Var == null) {
                return m0Var2;
            }
            t.m().a(this.f14893a, m0Var.f());
            try {
                Logger.i(f14892c, (m0Var.f() == 3 ? "HttpDNS" : "LocalDNS").concat(" finish loop up"));
                return m0Var;
            } catch (InterruptedException e2) {
                e = e2;
            } catch (RuntimeException e3) {
                e = e3;
            }
        } catch (InterruptedException | RuntimeException e4) {
            e = e4;
            m0Var = m0Var2;
        }
        Logger.w(f14892c, "Dns loop Exception ", e);
        return m0Var;
    }

    public i0(String str, ExecutorService executorService) {
        this.f14893a = str;
        this.f14894b = executorService;
    }
}
