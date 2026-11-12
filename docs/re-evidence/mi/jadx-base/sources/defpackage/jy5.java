package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class jy5 {
    public static jy5 d;
    public final Runnable c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<b> f23235a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f23236b = new Handler(Looper.getMainLooper());

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jy5.d();
            Iterator it = jy5.this.f23235a.iterator();
            while (it.hasNext()) {
                ((b) it.next()).release();
            }
            jy5.this.f23235a.clear();
        }
    }

    public interface b {
        void release();
    }

    public static void d() {
        b6i.i(Looper.getMainLooper().getThread() == Thread.currentThread());
    }

    public static synchronized jy5 e() {
        try {
            if (d == null) {
                d = new jy5();
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    public void c(b bVar) {
        d();
        this.f23235a.remove(bVar);
    }

    public void f(b bVar) {
        d();
        if (this.f23235a.add(bVar) && this.f23235a.size() == 1) {
            this.f23236b.post(this.c);
        }
    }
}
