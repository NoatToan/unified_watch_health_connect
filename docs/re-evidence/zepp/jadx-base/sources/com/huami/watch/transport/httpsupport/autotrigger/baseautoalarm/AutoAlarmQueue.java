package com.huami.watch.transport.httpsupport.autotrigger.baseautoalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class AutoAlarmQueue {
    private int a = hashCode() + new Random(100).nextInt();
    private List<AutoAlarm> b;
    private AutoAlarm c;
    private Context d;
    private String e;

    public static class AutoAlarm {
        private int a;
        private int b;
        private int c;
        private int d;
        public AutoAlarmAlertListener listener;

        public AutoAlarm(int i, int i2, int i3, int i4) {
            this.b = i;
            this.a = i2;
            this.d = i3;
            this.c = i4;
        }

        public AutoAlarm(int i, int i2, int i3, int i4, AutoAlarmAlertListener autoAlarmAlertListener) {
            this.b = i;
            this.a = i2;
            this.d = i3;
            this.c = i4;
            this.listener = autoAlarmAlertListener;
        }

        private long b() {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, this.a);
            calendar.set(12, this.d);
            return calendar.getTimeInMillis();
        }

        public long c() {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(b());
            calendar.add(12, (int) (Math.random() * ((double) this.c)));
            return calendar.getTimeInMillis();
        }

        public long d() {
            return b();
        }

        public long e(boolean z) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(d());
            calendar.add(5, 1);
            if (z) {
                calendar.add(12, (int) (Math.random() * ((double) this.c)));
            }
            return calendar.getTimeInMillis();
        }

        public int getId() {
            return this.b;
        }

        public AutoAlarmAlertListener getListener() {
            return this.listener;
        }

        public void setId(int i) {
            this.b = i;
        }

        public void setListener(AutoAlarmAlertListener autoAlarmAlertListener) {
            this.listener = autoAlarmAlertListener;
        }
    }

    public interface AutoAlarmAlertListener {
        boolean autoAlarmAlert(AutoAlarm autoAlarm);
    }

    public class a implements Comparator<AutoAlarm> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AutoAlarm autoAlarm, AutoAlarm autoAlarm2) {
            try {
                if (autoAlarm.d() > autoAlarm2.d()) {
                    return 1;
                }
                if (autoAlarm.d() < autoAlarm2.d()) {
                    return -1;
                }
                autoAlarm.d();
                autoAlarm2.d();
                return 0;
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }
    }

    public AutoAlarmQueue(Context context, String str, List<AutoAlarm> list) {
        this.d = context;
        this.e = str;
        this.b = list;
        d();
    }

    private long a() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i < this.b.size(); i++) {
            if (i == this.b.size() - 1) {
                this.c = this.b.get(0);
                return this.b.get(0).e(true);
            }
            if (timeInMillis < this.b.get(i).d()) {
                this.c = this.b.get(i);
                return this.b.get(i).c();
            }
            if (timeInMillis >= this.b.get(i).d()) {
                int i2 = i + 1;
                if (timeInMillis <= this.b.get(i2).d()) {
                    this.c = this.b.get(i2);
                    return this.b.get(i2).c();
                }
            }
        }
        return 0L;
    }

    private void b(Context context) {
        ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, this.a, new Intent(AutoAlarmManager.AutoAlarmBroadCastReceiver.ACTION), AMapEngineUtils.HALF_MAX_P20_WIDTH));
        Log.i(this.e, "cancelAlarm:" + this.a);
    }

    private long c(Context context) {
        return context.getSharedPreferences(this.e, 0).getLong(this.e, 0L);
    }

    private void d() {
        g();
        f(this.d);
        Log.i(this.e, PointCategory.INIT);
    }

    private void e(Context context, long j) {
        context.getSharedPreferences(this.e, 0).edit().putLong(this.e, j).apply();
    }

    private void f(Context context) {
        if (context == null) {
            return;
        }
        long jA = a();
        Log.i(this.e, "settingAlarmClock:" + jA + ",id:" + this.a);
        Intent intent = new Intent(AutoAlarmManager.AutoAlarmBroadCastReceiver.ACTION);
        intent.putExtra("name", this.e);
        intent.putExtra("id", this.c.getId());
        ((AlarmManager) context.getSystemService("alarm")).setExact(0, jA, PendingIntent.getBroadcast(context, this.a, intent, AMapEngineUtils.HALF_MAX_P20_WIDTH));
        e(context, jA);
    }

    private void g() {
        Collections.sort(this.b, new a());
    }

    public void clear() {
    }

    public void notice(Context context, long j) {
        for (AutoAlarm autoAlarm : this.b) {
            if (autoAlarm != null && autoAlarm.listener != null && autoAlarm.b == j) {
                boolean zAutoAlarmAlert = autoAlarm.listener.autoAlarmAlert(autoAlarm);
                Log.i(this.e, "notice:" + autoAlarm.b);
                if (zAutoAlarmAlert) {
                    f(context);
                }
            }
        }
    }

    public void timeChanged(Context context) {
        Log.i(this.e, "timeChanged:" + this.e);
        if (System.currentTimeMillis() < c(context)) {
            b(this.d);
            f(context);
        }
    }
}
