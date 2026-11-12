package com.huawei.openalliance.ad.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f20414a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f20415b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20416c;
    private ao d;
    private HandlerThread e;
    private int f;

    public void b() {
        synchronized (this.f20414a) {
            if (d()) {
                int i = this.f - 1;
                this.f = i;
                if (i <= 0) {
                    this.f = 0;
                    c();
                }
                if (hw.a()) {
                    hw.a("HandlerExecAgent", "release exec agent - ref count: %d", Integer.valueOf(this.f));
                }
            } else {
                hw.b("HandlerExecAgent", "release exec agent - not working");
            }
        }
    }

    public void a(String str) {
        if (d()) {
            ao aoVarF = f();
            if (aoVarF != null) {
                aoVarF.a(str);
            } else {
                a(new a(2, null, str, 0L));
            }
        }
    }

    public void a(Runnable runnable, String str, long j) {
        if (d()) {
            ao aoVarF = f();
            if (aoVarF != null) {
                aoVarF.a(runnable, str, j);
            } else {
                a(new a(1, runnable, str, j));
            }
        }
    }

    public void a(Runnable runnable) {
        if (d()) {
            ao aoVarF = f();
            if (aoVarF != null) {
                aoVarF.a(runnable);
            } else {
                a(new a(1, runnable, null, 0L));
            }
        }
    }

    public void a() {
        synchronized (this.f20414a) {
            this.f++;
            ao aoVarF = f();
            if (aoVarF != null) {
                aoVarF.a("handler_exec_release_task");
            }
            if (hw.a()) {
                hw.a("HandlerExecAgent", "acquire exec agent. ref count: %d", Integer.valueOf(this.f));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ao f() {
        ao aoVar;
        synchronized (this.f20414a) {
            aoVar = this.d;
        }
        return aoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (d()) {
            synchronized (this.f20415b) {
                if (this.e == null) {
                    hw.b("HandlerExecAgent", "init handler thread");
                    HandlerThread handlerThread = new HandlerThread(this.f20416c);
                    handlerThread.start();
                    Looper looper = handlerThread.getLooper();
                    if (looper != null) {
                        this.e = handlerThread;
                        a(new ao(new Handler(looper)));
                    } else {
                        handlerThread.quit();
                    }
                }
            }
        }
    }

    private boolean d() {
        boolean z;
        synchronized (this.f20414a) {
            z = this.f > 0;
        }
        return z;
    }

    private void c() {
        ao aoVarF = f();
        if (aoVarF != null) {
            hw.b("HandlerExecAgent", "delay quit thread");
            aoVarF.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ap.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (ap.this.f20415b) {
                        if (ap.this.e != null) {
                            ap.this.e.quitSafely();
                            ap.this.e = null;
                        }
                        ap.this.a((ao) null);
                        hw.b("HandlerExecAgent", "quit thread and release");
                    }
                }
            }, "handler_exec_release_task", 60000L);
        }
    }

    private void a(final a aVar) {
        o.g(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ap.2
            @Override // java.lang.Runnable
            public void run() {
                ap.this.e();
                ao aoVarF = ap.this.f();
                if (aoVarF != null) {
                    if (aVar.f20420a == 1) {
                        aoVarF.a(aVar.f20421b, aVar.f20422c, aVar.d);
                    } else if (aVar.f20420a == 2) {
                        aoVarF.a(aVar.f20422c);
                    }
                }
            }
        });
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Runnable f20421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f20422c;
        long d;

        public String toString() {
            return "CacheTask{taskType=" + this.f20420a + ", id='" + this.f20422c + "'}";
        }

        a(int i, Runnable runnable, String str, long j) {
            this.f20420a = i;
            this.f20421b = runnable;
            this.f20422c = str;
            this.d = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ao aoVar) {
        synchronized (this.f20414a) {
            this.d = aoVar;
        }
    }

    public ap(String str) {
        this.f20416c = TextUtils.isEmpty(str) ? "handler_exec_thread" : str;
    }
}
