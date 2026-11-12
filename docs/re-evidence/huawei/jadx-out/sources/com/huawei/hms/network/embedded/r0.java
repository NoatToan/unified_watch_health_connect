package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes34.dex */
public class r0 {
    public static final String f = "TaskManager";
    public static final String g = "lookupPool";
    public static final String h = "lazyPool";
    public static volatile r0 i = null;
    public static final int j = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExecutorService f15256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExecutorService f15257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15258c = new Object();
    public ConcurrentHashMap<String, Future> d = new ConcurrentHashMap<>();
    public ConcurrentHashMap<String, Future> e = new ConcurrentHashMap<>();

    public m0 b(String str) {
        Future futureSubmit;
        m0 m0Var;
        ExecutorService executorService;
        Future futurePutIfAbsent;
        synchronized (this.f15258c) {
            futureSubmit = this.d.get(str);
            if (futureSubmit == null && (futurePutIfAbsent = this.d.putIfAbsent(str, (futureSubmit = (executorService = this.f15257b).submit(new i0(str, executorService))))) != null) {
                futureSubmit = futurePutIfAbsent;
            }
        }
        try {
            m0Var = (m0) futureSubmit.get(y.a(), TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            Logger.w(f, "query failed DNS_TIMEOUT", e);
            m0Var = null;
        }
        this.d.remove(str);
        return m0Var;
    }

    public void a(Runnable runnable) {
        String str;
        try {
            this.f15256a.execute(runnable);
        } catch (RejectedExecutionException unused) {
            str = "the runnable task cannot be accepted for execution";
            Logger.v(f, str);
        } catch (Throwable unused2) {
            str = "the runnable task cannot be accepted for throwable";
            Logger.v(f, str);
        }
    }

    public static class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h0 f15260b;

        @Override // java.util.concurrent.Callable
        public List<InetAddress> call() {
            return y.a(this.f15260b.lookup(this.f15259a).d());
        }

        public a(String str, h0 h0Var) {
            this.f15259a = str;
            this.f15260b = h0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r2
      0x002f: PHI (r2v3 java.util.concurrent.Future) = (r2v2 java.util.concurrent.Future), (r2v9 java.util.concurrent.Future) binds: [B:5:0x0010, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    public List<InetAddress> a(String str, h0 h0Var) throws UnknownHostException {
        Future futurePutIfAbsent;
        List<InetAddress> arrayList = new ArrayList<>();
        synchronized (this.f15258c) {
            Future futureSubmit = this.e.get(str);
            if (futureSubmit == null) {
                Logger.i(f, "future == null");
                futureSubmit = this.f15257b.submit(new a(str, h0Var));
                futurePutIfAbsent = this.e.putIfAbsent(str, futureSubmit);
                if (futurePutIfAbsent == null) {
                    futurePutIfAbsent = futureSubmit;
                }
            } else {
                futurePutIfAbsent = futureSubmit;
            }
            Logger.v(f, "localDnslookup future = " + futurePutIfAbsent);
        }
        try {
            arrayList = (List) futurePutIfAbsent.get(y.a(), TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            Logger.w(f, "query failed CANCEL_TIMEOUT", e);
        }
        this.e.remove(str);
        if (arrayList != null && !arrayList.isEmpty()) {
            return arrayList;
        }
        Logger.w(f, "dns failed from local, domain is :" + str);
        throw new UnknownHostException("dns failed from local, domain is :" + str);
    }

    public m0 a(String str) throws UnknownHostException {
        m0 m0VarB = b(str);
        if (!y.b(m0VarB)) {
            return m0VarB;
        }
        Logger.w(f, "dns failed from DnsCallable, domain is :" + str);
        throw new UnknownHostException("Broken system behaviour for dns lookup of " + str);
    }

    public static r0 a() {
        if (i == null) {
            synchronized (r0.class) {
                if (i == null) {
                    i = new r0();
                }
            }
        }
        return i;
    }

    public r0() {
        Logger.i(f, "DNS ThreadPool init!");
        this.f15256a = ExecutorsUtils.newFixedThreadPool(10, h);
        this.f15257b = ExecutorsUtils.newCachedThreadPool(g);
    }
}
