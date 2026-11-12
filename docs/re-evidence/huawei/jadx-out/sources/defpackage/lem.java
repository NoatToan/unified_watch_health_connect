package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.ResultCallback;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Calendar;

/* JADX INFO: loaded from: classes10.dex */
public class lem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f39985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f39986b;
    private AlarmManager d;
    private AlarmManager e;
    private PendingIntent j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f39987c = 5000;
    private final int f = 300000;

    public void e(ResultCallback resultCallback) {
        if (this.e == null) {
            ReleaseLogUtil.d("HiH_DataObservableAlarmManager", "start step alarm manager");
            if (this.f39986b == null) {
                this.f39986b = new c(resultCallback);
            }
            BroadcastManagerUtil.d(BaseApplication.b(), this.f39986b, new IntentFilter("com.huawei.hihealth.action.get.step"), LocalBroadcast.f36595c, null);
            Intent intent = new Intent("com.huawei.hihealth.action.get.step");
            intent.setPackage(BaseApplication.d());
            this.j = PendingIntent.getBroadcast(BaseApplication.b(), 0, intent, 67108864);
            AlarmManager alarmManager = (AlarmManager) BaseApplication.b().getSystemService(NotificationCompat.CATEGORY_ALARM);
            this.e = alarmManager;
            alarmManager.setRepeating(1, System.currentTimeMillis() + 5000, 300000L, this.j);
            return;
        }
        ReleaseLogUtil.d("HiH_DataObservableAlarmManager", "alarm manager has started before");
    }

    public boolean d() {
        return this.e != null;
    }

    public void a() {
        if (this.e != null && this.j != null) {
            ReleaseLogUtil.d("HiH_DataObservableAlarmManager", "cancel step alarm manager");
            this.e.cancel(this.j);
            this.e = null;
        }
        if (this.f39986b != null) {
            try {
                BaseApplication.b().unregisterReceiver(this.f39986b);
            } catch (IllegalArgumentException e) {
                ReleaseLogUtil.a("HiH_DataObservableAlarmManager", "unregisterReceiver exception: ", e.getMessage());
            }
        }
    }

    public void c(ResultCallback resultCallback) {
        if (this.d == null) {
            ReleaseLogUtil.d("HiH_DataObservableAlarmManager", "start tomorrow alarm");
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.add(5, 1);
            if (this.f39985a == null) {
                this.f39985a = new c(resultCallback);
            }
            BroadcastManagerUtil.d(BaseApplication.b(), this.f39985a, new IntentFilter("com.huawei.hihealth.action.subscribe.data"), LocalBroadcast.f36595c, null);
            Intent intent = new Intent("com.huawei.hihealth.action.subscribe.data");
            intent.setPackage(BaseApplication.d());
            PendingIntent broadcast = PendingIntent.getBroadcast(BaseApplication.b(), 0, intent, 67108864);
            AlarmManager alarmManager = (AlarmManager) BaseApplication.b().getSystemService(NotificationCompat.CATEGORY_ALARM);
            this.d = alarmManager;
            alarmManager.set(1, calendar.getTimeInMillis(), broadcast);
        }
    }

    public void e() {
        this.d = null;
        if (this.f39985a != null) {
            BaseApplication.b().unregisterReceiver(this.f39985a);
        }
    }

    static class c extends BroadcastReceiver {
        private final ResultCallback e;

        c(ResultCallback resultCallback) {
            this.e = resultCallback;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ReleaseLogUtil.d("HiH_DataObservableAlarmManager", "StepBroadcastReceiver receive action ", intent.getAction());
            this.e.onResult(0, intent);
        }
    }
}
