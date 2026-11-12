package defpackage;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class xsk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Promise f39422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39423b;
    public boolean c;
    public AtomicInteger d;
    public WritableArray e;
    public boolean f;

    public final synchronized boolean a() {
        if (this.f) {
            return false;
        }
        return this.f39422a != null;
    }

    public synchronized void b(String str, String str2) {
        if (a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Promise rejected. ");
            sb.append(str2);
            this.f39422a.reject(str, str2);
            this.f = true;
        }
    }

    public synchronized void c(String str, Throwable th) {
        if (a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Promise rejected. ");
            sb.append(th.getMessage());
            this.f39422a.reject(str, th);
            this.f = true;
        }
    }

    public synchronized void d(WritableMap writableMap) {
        try {
            if (a()) {
                if (this.c) {
                    this.e.pushMap(writableMap);
                    if (this.d.addAndGet(1) == this.f39423b) {
                        this.f39422a.resolve(this.e);
                        this.f = true;
                    }
                } else {
                    this.f39422a.resolve(writableMap);
                    this.f = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e(int i) {
        this.f39423b = i;
        this.d = new AtomicInteger(0);
    }

    public synchronized void f(Promise promise, boolean z) {
        this.f39422a = promise;
        this.c = z;
        this.f = false;
        this.f39423b = 0;
        this.d = new AtomicInteger(0);
        if (z) {
            this.e = new WritableNativeArray();
        }
    }
}
