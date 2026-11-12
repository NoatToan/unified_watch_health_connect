package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class lc1 {
    public static final ThreadLocal<lc1> g = new ThreadLocal<>();
    public c d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap<b, Long> f24882a = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f24883b = new ArrayList<>();
    public final a c = new a();
    public long e = 0;
    public boolean f = false;

    public class a {
        public a() {
        }

        public void a() {
            lc1.this.e = SystemClock.uptimeMillis();
            lc1 lc1Var = lc1.this;
            lc1Var.c(lc1Var.e);
            if (lc1.this.f24883b.size() > 0) {
                lc1.this.e().a();
            }
        }
    }

    public interface b {
        boolean doAnimationFrame(long j);
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f24885a;

        public c(a aVar) {
            this.f24885a = aVar;
        }

        public abstract void a();
    }

    @RequiresApi(16)
    public static class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Choreographer f24886b;
        public final Choreographer.FrameCallback c;

        public class a implements Choreographer.FrameCallback {
            public a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                d.this.f24885a.a();
            }
        }

        public d(a aVar) {
            super(aVar);
            this.f24886b = Choreographer.getInstance();
            this.c = new a();
        }

        @Override // lc1.c
        public void a() {
            this.f24886b.postFrameCallback(this.c);
        }
    }

    public static lc1 d() {
        ThreadLocal<lc1> threadLocal = g;
        if (threadLocal.get() == null) {
            threadLocal.set(new lc1());
        }
        return threadLocal.get();
    }

    public void a(b bVar, long j) {
        if (this.f24883b.size() == 0) {
            e().a();
        }
        if (!this.f24883b.contains(bVar)) {
            this.f24883b.add(bVar);
        }
        if (j > 0) {
            this.f24882a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    public final void b() {
        if (this.f) {
            for (int size = this.f24883b.size() - 1; size >= 0; size--) {
                if (this.f24883b.get(size) == null) {
                    this.f24883b.remove(size);
                }
            }
            this.f = false;
        }
    }

    public void c(long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f24883b.size(); i++) {
            b bVar = this.f24883b.get(i);
            if (bVar != null && f(bVar, jUptimeMillis)) {
                bVar.doAnimationFrame(j);
            }
        }
        b();
    }

    public c e() {
        if (this.d == null) {
            this.d = new d(this.c);
        }
        return this.d;
    }

    public final boolean f(b bVar, long j) {
        Long l = this.f24882a.get(bVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f24882a.remove(bVar);
        return true;
    }

    public void g(b bVar) {
        this.f24882a.remove(bVar);
        int iIndexOf = this.f24883b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.f24883b.set(iIndexOf, null);
            this.f = true;
        }
    }
}
