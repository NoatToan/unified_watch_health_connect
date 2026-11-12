package defpackage;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"UseSparseArrays"})
public class ucp {
    public static final int f = Runtime.getRuntime().availableProcessors() * 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f35633b;
    public final LinkedList<vcp> c;
    public final int d;
    public Thread e;

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jpe.h("ThreadPoolManager", "start poolthread");
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    try {
                        vcp vcpVarG = ucp.this.g();
                        if (vcpVarG == null) {
                            try {
                                Thread.sleep(200L);
                            } catch (InterruptedException e) {
                                jpe.b("ThreadPoolManager", "threadpool sleep error : " + e.getMessage());
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            ucp.this.f(vcpVarG);
                        }
                    } catch (NullPointerException e2) {
                        jpe.b("ThreadPoolManager", "task is null : " + e2.getMessage());
                    } catch (RejectedExecutionException e3) {
                        jpe.b("ThreadPoolManager", "task rejected by threadpool execution  : " + e3.getMessage());
                    }
                } catch (Throwable th) {
                    ucp.this.f35633b.shutdownNow();
                    throw th;
                }
            }
            ucp.this.f35633b.shutdownNow();
            jpe.h("ThreadPoolManager", "end poolthread");
        }
    }

    public ucp() {
        this(0, 1);
    }

    public void d(vcp vcpVar) {
        if (vcpVar == null) {
            return;
        }
        synchronized (this.c) {
            jpe.h("ThreadPoolManager", "add task: task(" + vcpVar.a() + "," + vcpVar.b() + ")");
            this.c.addLast(vcpVar);
        }
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            jpe.h("ThreadPoolManager", "id is null,quit cancel");
            return;
        }
        synchronized (this.c) {
            for (int i = 0; i < this.c.size(); i++) {
                try {
                    vcp vcpVar = this.c.get(i);
                    if (vcpVar != null && vcpVar.a().equals(str)) {
                        this.c.remove(i);
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void f(vcp vcpVar) {
        this.f35633b.submit(vcpVar);
    }

    public final vcp g() {
        synchronized (this.c) {
            try {
                if (this.c.size() <= 0) {
                    return null;
                }
                vcp vcpVarRemoveFirst = this.d == 0 ? this.c.removeFirst() : this.c.removeLast();
                jpe.a("ThreadPoolManager", "start run task(" + vcpVarRemoveFirst.f36753a + "," + vcpVarRemoveFirst.b() + ")");
                return vcpVarRemoveFirst;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h() {
        jpe.h("ThreadPoolManager", StatConstants.PARAM_START);
        if (this.e == null) {
            Thread thread = new Thread(new b());
            this.e = thread;
            thread.start();
        }
    }

    public void i() {
        jpe.h("ThreadPoolManager", BroadcastsKt.SILENT_PUSHING_STOP);
        this.e.interrupt();
        this.e = null;
        synchronized (this.c) {
            this.c.clear();
        }
    }

    public ucp(int i, int i2) {
        this.d = i == 0 ? 0 : 1;
        i2 = i2 < 1 ? 1 : i2;
        int i3 = f;
        i2 = i2 > i3 ? i3 : i2;
        this.f35632a = i2;
        this.f35633b = Executors.newFixedThreadPool(i2);
        this.c = new LinkedList<>();
    }
}
