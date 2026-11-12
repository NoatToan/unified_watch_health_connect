package com.xiaomi.push;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.xiaomi.push.service.bd;

/* JADX INFO: loaded from: classes22.dex */
class b0 implements bc.a {
    public Context b;
    private PendingIntent a = null;
    private volatile long c = 0;

    public b0(Context context) {
        this.b = null;
        this.b = context;
    }

    private void b(AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        try {
            AlarmManager.class.getMethod("setExact", Integer.TYPE, Long.TYPE, PendingIntent.class).invoke(alarmManager, 2, Long.valueOf(j), pendingIntent);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("[Alarm] invoke setExact method meet error. " + e);
        }
    }

    @Override // com.xiaomi.push.bc.a
    public void a() {
        if (this.a != null) {
            try {
                ((AlarmManager) this.b.getSystemService("alarm")).cancel(this.a);
            } catch (Exception unused) {
            } finally {
                this.a = null;
                com.xiaomi.channel.commonutils.logger.b.c("[Alarm] unregister timer");
                this.c = 0L;
            }
        }
        this.c = 0L;
    }

    @Override // com.xiaomi.push.bc.a
    public void a(boolean z) {
        long jA = com.xiaomi.push.service.n.a(this.b).a();
        if (z || this.c != 0) {
            if (z) {
                a();
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (!z && this.c != 0) {
                if (this.c <= jElapsedRealtime) {
                    this.c += jA;
                    if (this.c < jElapsedRealtime) {
                    }
                }
                Intent intent = new Intent(bd.q);
                intent.setPackage(this.b.getPackageName());
                c(intent, this.c);
            }
            jA -= jElapsedRealtime % jA;
            this.c = jElapsedRealtime + jA;
            Intent intent2 = new Intent(bd.q);
            intent2.setPackage(this.b.getPackageName());
            c(intent2, this.c);
        }
    }

    @Override // com.xiaomi.push.bc.a
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean mo3589a() {
        return this.c != 0;
    }

    public void c(Intent intent, long j) {
        AlarmManager alarmManager = (AlarmManager) this.b.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT;
        this.a = i >= 31 ? PendingIntent.getBroadcast(this.b, 0, intent, 33554432) : PendingIntent.getBroadcast(this.b, 0, intent, 0);
        if (i >= 23) {
            z.a((Object) alarmManager, "setExactAndAllowWhileIdle", 2, Long.valueOf(j), this.a);
        } else if (i >= 19) {
            b(alarmManager, j, this.a);
        } else {
            alarmManager.set(2, j, this.a);
        }
        com.xiaomi.channel.commonutils.logger.b.c("[Alarm] register timer " + j);
    }
}
