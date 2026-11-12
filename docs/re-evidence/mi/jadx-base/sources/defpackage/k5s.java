package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class k5s {
    public static volatile k5s e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ScheduledThreadPoolExecutor f23501a = new ScheduledThreadPoolExecutor(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, ScheduledFuture> f23502b = new HashMap();
    public Object c = new Object();
    public SharedPreferences d;

    public static abstract class a implements Runnable {
        public abstract String a();
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f23503a;

        public b(a aVar) {
            this.f23503a = aVar;
        }

        public void a() {
        }

        public void b() {
            throw null;
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
            this.f23503a.run();
            b();
        }
    }

    public k5s(Context context) {
        this.d = context.getSharedPreferences("mipush_extra", 0);
    }

    public static k5s a(Context context) {
        if (e == null) {
            synchronized (k5s.class) {
                try {
                    if (e == null) {
                        e = new k5s(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public static String d(String str) {
        return "last_job_time" + str;
    }

    public final ScheduledFuture f(a aVar) {
        ScheduledFuture scheduledFuture;
        synchronized (this.c) {
            scheduledFuture = this.f23502b.get(aVar.a());
        }
        return scheduledFuture;
    }

    public void g(Runnable runnable) {
        h(runnable, 0);
    }

    public void h(Runnable runnable, int i) {
        this.f23501a.schedule(runnable, i, TimeUnit.SECONDS);
    }

    public boolean i(a aVar) {
        return n(aVar, 0);
    }

    public boolean j(a aVar, int i) {
        return k(aVar, i, 0);
    }

    public boolean k(a aVar, int i, int i2) {
        return l(aVar, i, i2, false);
    }

    public boolean l(a aVar, int i, int i2, boolean z) {
        if (aVar == null || f(aVar) != null) {
            return false;
        }
        String strD = d(aVar.a());
        q5s q5sVar = new q5s(this, aVar, z, strD);
        if (!z) {
            long jAbs = Math.abs(System.currentTimeMillis() - this.d.getLong(strD, 0L)) / 1000;
            if (jAbs < i - i2) {
                i2 = (int) (((long) i) - jAbs);
            }
        }
        try {
            ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = this.f23501a.scheduleAtFixedRate(q5sVar, i2, i, TimeUnit.SECONDS);
            synchronized (this.c) {
                try {
                    this.f23502b.put(aVar.a(), scheduledFutureScheduleAtFixedRate);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Exception e2) {
            x9s.s(e2);
            return true;
        }
    }

    public boolean m(String str) {
        synchronized (this.c) {
            try {
                ScheduledFuture scheduledFuture = this.f23502b.get(str);
                if (scheduledFuture == null) {
                    return false;
                }
                this.f23502b.remove(str);
                return scheduledFuture.cancel(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean n(a aVar, int i) {
        if (aVar == null || f(aVar) != null) {
            return false;
        }
        ScheduledFuture<?> scheduledFutureSchedule = this.f23501a.schedule(new u5s(this, aVar), i, TimeUnit.SECONDS);
        synchronized (this.c) {
            this.f23502b.put(aVar.a(), scheduledFutureSchedule);
        }
        return true;
    }
}
