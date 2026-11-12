package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.a;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.SystemIdInfoKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.IdGenerator;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class g41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f18572a = ppe.i("Alarms");

    public static void a(Context context, WorkDatabase workDatabase, WorkGenerationalId workGenerationalId) {
        SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(workGenerationalId);
        if (systemIdInfo != null) {
            b(context, workGenerationalId, systemIdInfo.systemId);
            ppe.e().a(f18572a, "Removing SystemIdInfo for workSpecId (" + workGenerationalId + ")");
            systemIdInfoDao.removeSystemIdInfo(workGenerationalId);
        }
    }

    public static void b(Context context, WorkGenerationalId workGenerationalId, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(DialWidgetType.ALARM);
        PendingIntent service = PendingIntent.getService(context, i, a.b(context, workGenerationalId), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        ppe.e().a(f18572a, "Cancelling existing alarm with (workSpecId, systemId) (" + workGenerationalId + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void c(Context context, WorkDatabase workDatabase, WorkGenerationalId workGenerationalId, long j) {
        SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(workGenerationalId);
        if (systemIdInfo != null) {
            b(context, workGenerationalId, systemIdInfo.systemId);
            d(context, workGenerationalId, systemIdInfo.systemId, j);
        } else {
            int iNextAlarmManagerId = new IdGenerator(workDatabase).nextAlarmManagerId();
            systemIdInfoDao.insertSystemIdInfo(SystemIdInfoKt.systemIdInfo(workGenerationalId, iNextAlarmManagerId));
            d(context, workGenerationalId, iNextAlarmManagerId, j);
        }
    }

    public static void d(Context context, WorkGenerationalId workGenerationalId, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(DialWidgetType.ALARM);
        PendingIntent service = PendingIntent.getService(context, i, a.b(context, workGenerationalId), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
