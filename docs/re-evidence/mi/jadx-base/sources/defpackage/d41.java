package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class d41 {

    @RequiresApi(23)
    public static class a {
        public static void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        }

        public static void b(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
        }
    }

    public static void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        a.b(alarmManager, i, j, pendingIntent);
    }
}
