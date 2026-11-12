package defpackage;

import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.util.ArrayMap;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class mc1 {
    public static final boolean g = Boolean.parseBoolean(zhe.a("ro.display.mimotion", "false"));
    public static final ThreadLocal<mc1> h = new ThreadLocal<>();
    public e d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayMap<d, Long> f25989a = new ArrayMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<d> f25990b = new ArrayList<>();
    public final c c = new c();
    public long e = 0;
    public boolean f = false;

    public static class a extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Choreographer f25991b;
        public final Looper c;
        public final Choreographer.FrameCallback d;

        /* JADX INFO: renamed from: mc1$a$a, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC1016a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC1016a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                a.this.f25997a.a(j);
            }
        }

        public a(c cVar) {
            super(cVar);
            this.f25991b = Choreographer.getInstance();
            this.c = Looper.myLooper();
            this.d = new ChoreographerFrameCallbackC1016a();
        }

        @Override // mc1.e
        public boolean c() {
            return Thread.currentThread() == this.c.getThread();
        }

        @Override // mc1.e
        public void d() {
            this.f25991b.postFrameCallback(this.d);
        }
    }

    @RequiresApi(api = 33)
    public static class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Choreographer f25993b;
        public Method c;
        public final Looper d;
        public long e;
        public final Choreographer$VsyncCallback f;
        public final Choreographer.FrameCallback g;
        public boolean h;

        public class a implements Choreographer$VsyncCallback {
            public a() {
            }

            /* JADX WARN: Code duplicated, block: B:14:0x003f  */
            /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
            public void onVsync(Choreographer.FrameData frameData) {
                boolean z;
                Choreographer.FrameTimeline[] frameTimelines;
                int length;
                if (b.this.c != null) {
                    try {
                        long jLongValue = ((Long) b.this.c.invoke(b.this.f25993b, new Object[0])).longValue();
                        if (jLongValue != -1) {
                            b.this.e = jLongValue;
                            try {
                                b.this.h = true;
                                return;
                            } catch (Exception unused) {
                                z = true;
                                if (z) {
                                    return;
                                }
                                frameTimelines = frameData.getFrameTimelines();
                                length = frameTimelines.length;
                                if (length > 1) {
                                    int i = length - 1;
                                    b.this.e = Math.round(((frameTimelines[i].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos()) * 1.0d) / ((double) i));
                                }
                            }
                        }
                    } catch (Exception unused2) {
                        z = false;
                    }
                }
                frameTimelines = frameData.getFrameTimelines();
                length = frameTimelines.length;
                if (length > 1) {
                    int i2 = length - 1;
                    b.this.e = Math.round(((frameTimelines[i2].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos()) * 1.0d) / ((double) i2));
                }
            }
        }

        /* JADX INFO: renamed from: mc1$b$b, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC1017b implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC1017b() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                b.this.f25997a.a(j);
            }
        }

        public b(c cVar) {
            super(cVar);
            this.f25993b = Choreographer.getInstance();
            this.c = null;
            this.d = Looper.myLooper();
            this.e = 0L;
            this.h = false;
            if (mc1.g && this.c == null) {
                try {
                    Method declaredMethod = Choreographer.class.getDeclaredMethod("getFramePeriodNsecs", new Class[0]);
                    this.c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused) {
                }
            }
            this.f = new a();
            this.g = new ChoreographerFrameCallbackC1017b();
        }

        @Override // mc1.e
        public long a() {
            return this.e;
        }

        @Override // mc1.e
        public boolean b() {
            return this.h;
        }

        @Override // mc1.e
        public boolean c() {
            return Thread.currentThread() == this.d.getThread();
        }

        @Override // mc1.e
        public void d() {
            this.f25993b.postVsyncCallback(this.f);
            this.f25993b.postFrameCallback(this.g);
        }

        @Override // mc1.e
        public void e() {
            this.f25993b.postVsyncCallback(this.f);
        }
    }

    public class c {
        public c() {
        }

        public void a(long j) {
            mc1.this.f(j);
            if (mc1.this.f25990b.size() > 0) {
                mc1.this.j().d();
            }
        }
    }

    public interface d {
        boolean doAnimationFrame(long j);
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f25997a;

        public e(c cVar) {
            this.f25997a = cVar;
        }

        public long a() {
            return 0L;
        }

        public boolean b() {
            return false;
        }

        public abstract boolean c();

        public abstract void d();

        public void e() {
        }
    }

    public static mc1 i() {
        ThreadLocal<mc1> threadLocal = h;
        if (threadLocal.get() == null) {
            threadLocal.set(new mc1());
        }
        return threadLocal.get();
    }

    public void d(d dVar, long j) {
        if (this.f25990b.size() == 0) {
            j().d();
        }
        if (!this.f25990b.contains(dVar)) {
            this.f25990b.add(dVar);
        }
        if (j > 0) {
            this.f25989a.put(dVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    public final void e() {
        if (this.f) {
            for (int size = this.f25990b.size() - 1; size >= 0; size--) {
                if (this.f25990b.get(size) == null) {
                    this.f25990b.remove(size);
                }
            }
            this.f = false;
        }
    }

    public final void f(long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f25990b.size(); i++) {
            d dVar = this.f25990b.get(i);
            if (dVar != null && k(dVar, jUptimeMillis)) {
                dVar.doAnimationFrame(j);
            }
        }
        e();
    }

    public long g() {
        return j().a();
    }

    public boolean h() {
        return j().b();
    }

    public e j() {
        if (this.d == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                this.d = new b(this.c);
            } else {
                this.d = new a(this.c);
            }
        }
        return this.d;
    }

    public final boolean k(d dVar, long j) {
        Long l = this.f25989a.get(dVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f25989a.remove(dVar);
        return true;
    }

    public boolean l() {
        return j().c();
    }

    public void m() {
        j().e();
    }

    public void n(d dVar) {
        this.f25989a.remove(dVar);
        int iIndexOf = this.f25990b.indexOf(dVar);
        if (iIndexOf >= 0) {
            this.f25990b.set(iIndexOf, null);
            this.f = true;
        }
    }
}
