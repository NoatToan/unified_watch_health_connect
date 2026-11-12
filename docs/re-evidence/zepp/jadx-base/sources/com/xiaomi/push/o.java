package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
public class o {
    private static volatile o e;
    private ScheduledThreadPoolExecutor a = new ScheduledThreadPoolExecutor(1);
    private Map<String, ScheduledFuture> b = new HashMap();
    private Object c = new Object();
    private SharedPreferences d;

    public static abstract class a implements Runnable {
        public abstract String a();
    }

    public static class b implements Runnable {
        public a a;

        public b(a aVar) {
            this.a = aVar;
        }

        public void a() {
        }

        public void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
            this.a.run();
            b();
        }
    }

    private o(Context context) {
        this.d = context.getSharedPreferences("mipush_extra", 0);
    }

    public static o a(Context context) {
        if (e == null) {
            synchronized (o.class) {
                if (e == null) {
                    e = new o(context);
                }
            }
        }
        return e;
    }

    private static String c(String str) {
        return "last_job_time" + str;
    }

    private ScheduledFuture e(a aVar) {
        ScheduledFuture scheduledFuture;
        synchronized (this.c) {
            scheduledFuture = this.b.get(aVar.a());
        }
        return scheduledFuture;
    }

    public void a(Runnable runnable) {
        a(runnable, 0);
    }

    public void a(Runnable runnable, int i) {
        this.a.schedule(runnable, i, TimeUnit.SECONDS);
    }

    public boolean a(a aVar, int i) {
        return a(aVar, i, 0);
    }

    public boolean a(a aVar, int i, int i2) {
        return a(aVar, i, i2, false);
    }

    public boolean a(a aVar, int i, int i2, boolean z) {
        if (aVar == null || e(aVar) != null) {
            return false;
        }
        String strC = c(aVar.a());
        q0 q0Var = new q0(this, aVar, z, strC);
        if (!z) {
            long jAbs = Math.abs(System.currentTimeMillis() - this.d.getLong(strC, 0L)) / 1000;
            if (jAbs < i - i2) {
                i2 = (int) (((long) i) - jAbs);
            }
        }
        try {
            ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = this.a.scheduleAtFixedRate(q0Var, i2, i, TimeUnit.SECONDS);
            synchronized (this.c) {
                try {
                    this.b.put(aVar.a(), scheduledFutureScheduleAtFixedRate);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.a(e2);
            return true;
        }
    }

    public boolean a(String str) {
        synchronized (this.c) {
            ScheduledFuture scheduledFuture = this.b.get(str);
            if (scheduledFuture == null) {
                return false;
            }
            this.b.remove(str);
            return scheduledFuture.cancel(false);
        }
    }

    public boolean b(a aVar, int i) {
        if (aVar == null || e(aVar) != null) {
            return false;
        }
        ScheduledFuture<?> scheduledFutureSchedule = this.a.schedule(new r0(this, aVar), i, TimeUnit.SECONDS);
        synchronized (this.c) {
            this.b.put(aVar.a(), scheduledFutureSchedule);
        }
        return true;
    }
}
