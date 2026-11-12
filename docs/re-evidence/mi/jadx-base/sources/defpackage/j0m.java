package defpackage;

import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class j0m implements a {
    public static final Object i = new Object();
    public static j0m j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f22304k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c93 f22305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22306b;
    public long c;
    public long d;
    public long e;
    public IOException f;
    public CacheEventListener.EvictionReason g;
    public j0m h;

    public static j0m a() {
        synchronized (i) {
            try {
                j0m j0mVar = j;
                if (j0mVar == null) {
                    return new j0m();
                }
                j = j0mVar.h;
                j0mVar.h = null;
                f22304k--;
                return j0mVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (i) {
            try {
                if (f22304k < 5) {
                    c();
                    f22304k++;
                    j0m j0mVar = j;
                    if (j0mVar != null) {
                        this.h = j0mVar;
                    }
                    j = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        this.f22305a = null;
        this.f22306b = null;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = null;
        this.g = null;
    }

    public j0m d(c93 c93Var) {
        this.f22305a = c93Var;
        return this;
    }

    public j0m e(long j2) {
        this.d = j2;
        return this;
    }

    public j0m f(long j2) {
        this.e = j2;
        return this;
    }

    public j0m g(CacheEventListener.EvictionReason evictionReason) {
        this.g = evictionReason;
        return this;
    }

    public j0m h(IOException iOException) {
        this.f = iOException;
        return this;
    }

    public j0m i(long j2) {
        this.c = j2;
        return this;
    }

    public j0m j(String str) {
        this.f22306b = str;
        return this;
    }
}
