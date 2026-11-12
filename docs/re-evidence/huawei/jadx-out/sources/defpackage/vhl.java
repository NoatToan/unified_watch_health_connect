package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.main.stories.health.weight.notification.receiver.FastingLiteReceiver;
import health.compact.a.CommonUtils;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vhl {
    public int b(int i) {
        return i * 10;
    }

    private vhl() {
    }

    public static vhl e() {
        return a.e;
    }

    public void c() {
        b(false);
        b(true);
    }

    public void b(List<vhk> list, vhi vhiVar) {
        if (vhiVar == null) {
            LogUtil.j("HealthWeight_FastingLiteNoticeManager", "fastingLiteSetting is null!");
            return;
        }
        b(false);
        e(list);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (!njy.e(list)) {
            for (vhk vhkVar : list) {
                if (jCurrentTimeMillis < vhkVar.b()) {
                    jCurrentTimeMillis = vhkVar.b();
                }
            }
        }
        b(jCurrentTimeMillis, vhiVar);
        if (vhiVar.g() == 1) {
            d(20210707, c(vhn.c(vhiVar)) / 1000, false, vhiVar.c());
        }
    }

    private long c(long j) {
        int iM = lsl.m(j);
        return (iM < 8 || iM >= 22) ? lsl.a(lsl.g(System.currentTimeMillis()), 8, 0) : j;
    }

    private void e(List<vhk> list) {
        if (njy.e(list)) {
            LogUtil.j("HealthWeight_FastingLiteNoticeManager", "updateNonRepeatNotices nonRepeatEpoch is isEmpty!");
            return;
        }
        for (vhk vhkVar : list) {
            if (vhkVar != null) {
                b(vhkVar.c(), vhkVar.b());
            }
        }
    }

    private void b(long j, vhi vhiVar) {
        if (vhiVar == null) {
            LogUtil.j("HealthWeight_FastingLiteNoticeManager", "setting is null!");
            return;
        }
        Pair<Integer, Integer> pairE = vhiVar.e();
        Pair<Integer, Integer> pairD = vhiVar.d();
        b(true);
        long jR = lsl.r(System.currentTimeMillis()) / 1000;
        long jA = vhiVar.a();
        long jA2 = lsl.a(((jR + jA) + vhiVar.b()) * 1000, ((Integer) pairD.first).intValue(), ((Integer) pairD.second).intValue()) / 1000;
        long jA3 = jA2;
        for (int i = 1; jA3 < j && i < 3; i++) {
            jA3 = lsl.a((vhiVar.c() + jA2) * 1000, ((Integer) pairD.first).intValue(), ((Integer) pairD.second).intValue()) / 1000;
        }
        long j2 = jA3 * 1000;
        LogUtil.a("HealthWeight_FastingLiteNoticeManager", "resetRegularNotice start = ", DateFormatUtil.d(j * 1000, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT), " nextFastingLiteStartTime ", DateFormatUtil.d(j2, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT));
        long jA4 = lsl.a(((vhiVar.c() - vhiVar.b()) + jA3) * 1000, ((Integer) pairE.first).intValue(), ((Integer) pairE.second).intValue()) / 1000;
        b(jA3, jA4, true, vhiVar.c());
        LogUtil.a("HealthWeight_FastingLiteNoticeManager", "resetRegularNotice: startTime=", DateFormatUtil.d(j2, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT), ", endTime = ", DateFormatUtil.d(jA4 * 1000, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT));
    }

    private void b(long j, long j2) {
        LogUtil.a("HealthWeight_FastingLiteNoticeManager", " updateNonRepeatNotices ", DateFormatUtil.d(j * 1000, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT), " endTime ", DateFormatUtil.d(1000 * j2, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT));
        b(j, j2, false, 1L);
    }

    private void b(long j, long j2, boolean z, long j3) {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (j > jCurrentTimeMillis) {
            d(20100410, j, z, j3);
        }
        if (j2 > jCurrentTimeMillis) {
            d(20100413, j2, z, j3);
        }
    }

    private void b(boolean z) {
        a(20100410, z);
        a(20210707, z);
        a(20100412, z);
        a(20100413, z);
    }

    public void d(int i, long j, boolean z, long j2) {
        int iB = z ? i : b(i);
        Intent intentC = c(BaseApplication.b(), i, j);
        intentC.setPackage(BaseApplication.d());
        d(BaseApplication.b(), j, PendingIntent.getBroadcast(BaseApplication.b(), iB, intentC, 201326592), z, j2);
        LogUtil.a("HealthWeight_FastingLiteNoticeManager", "registerFastingLiteNotice: ", Integer.valueOf(iB), ", time = ", DateFormatUtil.d(1000 * j, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT));
    }

    public void a(int i, boolean z) {
        if (!z) {
            i = b(i);
        }
        e(BaseApplication.b(), i, new Intent(BaseApplication.b(), (Class<?>) FastingLiteReceiver.class));
        LogUtil.a("HealthWeight_FastingLiteNoticeManager", "cancelFastingLiteNotice: requestCode= " + i);
    }

    private void d(Context context, long j, PendingIntent pendingIntent, boolean z, long j2) {
        if (context == null || pendingIntent == null) {
            LogUtil.j("HealthWeight_FastingLiteNoticeManager", "context or pendingIntent is null!");
            return;
        }
        AlarmManager alarmManagerM = CommonUtils.m();
        if (alarmManagerM == null) {
            LogUtil.j("HealthWeight_FastingLiteNoticeManager", "manager is null!");
        } else if (z) {
            alarmManagerM.setRepeating(0, j * 1000, j2 * 1000, pendingIntent);
        } else {
            xjk.d(alarmManagerM, 0, j * 1000, pendingIntent, "HealthWeight_FastingLiteNoticeManagerregisterFastingLiteReminder");
        }
    }

    private void e(Context context, int i, Intent intent) {
        if (context == null || intent == null) {
            LogUtil.j("HealthWeight_FastingLiteNoticeManager", "context or intent is null!");
            return;
        }
        AlarmManager alarmManagerM = CommonUtils.m();
        if (alarmManagerM == null) {
            LogUtil.j("HealthWeight_FastingLiteNoticeManager", "manager is null!");
            return;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent, 201326592);
        if (broadcast != null) {
            broadcast.cancel();
            alarmManagerM.cancel(broadcast);
        }
    }

    private Intent c(Context context, int i, long j) {
        Intent intent = new Intent(context, (Class<?>) FastingLiteReceiver.class);
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        intent.putExtra("fastingLiteId", i);
        intent.putExtra("fastingLiteUid", accountInfo);
        long j2 = j * 1000;
        intent.putExtra("fastingLiteTime", j2);
        LogUtil.a("HealthWeight_FastingLiteNoticeManager", "reminderId ", Integer.valueOf(i), " FASTING_LITE_UID ", accountInfo, " FASTING_LITE_TIME ", Long.valueOf(j2));
        return intent;
    }

    static class a {
        private static final vhl e = new vhl();
    }
}
