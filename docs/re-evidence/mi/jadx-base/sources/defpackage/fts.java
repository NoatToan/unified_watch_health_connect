package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;

/* JADX INFO: loaded from: classes11.dex */
public class fts implements cts.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f18238b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PendingIntent f18237a = null;
    public volatile long c = 0;

    public fts(Context context) {
        this.f18238b = null;
        this.f18238b = context;
    }

    @Override // cts.a
    public void a(boolean z) {
        long jB = cdt.c(this.f18238b).b();
        if (z || this.c != 0) {
            if (z) {
                a();
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (z || this.c == 0) {
                this.c = jElapsedRealtime + (jB - (jElapsedRealtime % jB));
            } else if (this.c <= jElapsedRealtime) {
                this.c += jB;
                if (this.c < jElapsedRealtime) {
                    this.c = jElapsedRealtime + jB;
                }
            }
            Intent intent = new Intent(ccs.o);
            intent.setPackage(this.f18238b.getPackageName());
            b(intent, this.c);
        }
    }

    public void b(Intent intent, long j) {
        AlarmManager alarmManager = (AlarmManager) this.f18238b.getSystemService(DialWidgetType.ALARM);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            this.f18237a = PendingIntent.getBroadcast(this.f18238b, 0, intent, 33554432);
        } else {
            this.f18237a = PendingIntent.getBroadcast(this.f18238b, 0, intent, 0);
        }
        if (i < 31 || y0t.j(this.f18238b)) {
            zbs.e(alarmManager, "setExactAndAllowWhileIdle", 2, Long.valueOf(j), this.f18237a);
        } else {
            alarmManager.set(2, j, this.f18237a);
        }
        x9s.B("[Alarm] register timer " + j);
    }

    @Override // cts.a
    public void a() {
        if (this.f18237a != null) {
            try {
                ((AlarmManager) this.f18238b.getSystemService(DialWidgetType.ALARM)).cancel(this.f18237a);
            } catch (Exception unused) {
            } finally {
                this.f18237a = null;
                x9s.B("[Alarm] unregister timer");
                this.c = 0L;
            }
        }
        this.c = 0L;
    }

    @Override // cts.a
    /* JADX INFO: renamed from: a */
    public boolean mo874a() {
        return this.c != 0;
    }
}
