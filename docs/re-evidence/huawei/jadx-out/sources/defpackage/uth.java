package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.basichealth.bloodpressure.BloodPressureSyncManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.notification.HealthCommondReceiver;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity;
import health.compact.a.ReleaseLogUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class uth {
    public static void c(final List<dfl> list, final boolean z, final ResponseCallback<List<dfl>> responseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: utm
            @Override // java.lang.Runnable
            public final void run() {
                uth.a(list, z, responseCallback);
            }
        });
    }

    static /* synthetic */ void a(List list, boolean z, ResponseCallback responseCallback) {
        boolean zE = e();
        uub.e(list);
        if (z) {
            b();
        }
        if (responseCallback != null) {
            responseCallback.onResponse(zE ? 0 : -1, list);
        }
    }

    public static boolean e() {
        LogUtil.a("MeasurePlanHelper", "enter cancelAllAlarms");
        for (int i = 0; i < 10; i++) {
            for (int i2 = 0; i2 < 7; i2++) {
                xjk.d(i2, b(i, i2, -1, -1), 201326592);
            }
        }
        return true;
    }

    private static Intent b(int i, int i2, int i3, int i4) {
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) HealthCommondReceiver.class);
        intent.setAction("BLOOD_PRESSURE_MEASURE_PLAN_ACTION_" + i + Constants.LINK + i2);
        intent.putExtra("BLOOD_PRESSURE_MEASURE_PLAN_ID", i);
        intent.putExtra("BLOOD_PRESSURE_MEASURE_PLAN_HOUR_OF_DAY", i3);
        intent.putExtra("BLOOD_PRESSURE_MEASURE_PLAN_MINUTE", i4);
        return intent;
    }

    public static void b() {
        LogUtil.a("MeasurePlanHelper", "enter registerAllAlarm");
        utd.d();
    }

    public static void c(Intent intent, int i, int i2) {
        a(intent, i, i2);
        utd.d();
    }

    private static void a(Intent intent, int i, int i2) {
        LogUtil.a("MeasurePlanHelper", "hourOfDay=", Integer.valueOf(i), ", minute=", Integer.valueOf(i2));
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, 0);
        calendar.set(14, 0);
        LogUtil.a("MeasurePlanHelper", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(calendar.getTimeInMillis())));
        if (BloodPressureSyncManager.a()) {
            return;
        }
        boolean zD = xjk.d(intent);
        ReleaseLogUtil.c("MeasurePlanHelper", "tryNotify isDifferentTimeZone ", Boolean.valueOf(zD));
        if (zD) {
            return;
        }
        a();
    }

    private static void a() {
        lsb.d().e(20200319);
        Notification.Builder builderC = lsb.d().c();
        qrs.c(builderC);
        Context contextB = BaseApplication.b();
        String string = contextB.getString(R.string.IDS_new_blood_pressure_notify);
        builderC.setContentTitle(contextB.getString(R.string.IDS_blood_pressure_measure_plan_remind)).setContentText(string).setStyle(new Notification.BigTextStyle().bigText(string));
        builderC.setAutoCancel(true);
        if (fua.p()) {
            Bundle bundle = new Bundle();
            bundle.putString("page_id", ArkUIXConstants.KNIT_BLOOD_PRESSURE);
            bundle.putInt("module_type", 6);
            bundle.putString("bi_from_pullFrom", "MeasurePlan_Notify");
            bundle.putString("bi_from_resourceName", "blood_pressure_reminder");
            bundle.putString("bi_from_pullOrder", "");
            Intent intentC = fti.c(contextB, bundle);
            if (intentC != null) {
                builderC.setContentIntent(PendingIntent.getActivity(contextB, 0, intentC, 201326592));
            }
        } else {
            Intent intent = new Intent(contextB, (Class<?>) KnitBloodPressureActivity.class);
            intent.setFlags(67108864);
            intent.addFlags(536870912);
            builderC.setContentIntent(PendingIntent.getActivity(contextB, 0, intent, 201326592));
        }
        imr.b(20200319, builderC, string);
    }

    public static String c(dfl dflVar) {
        if (dflVar == null) {
            LogUtil.j("MeasurePlanHelper", "alarmInfo is null");
            return "";
        }
        if (dflVar.g() == 0) {
            return BaseApplication.b().getString(R.string.IDS_blood_pressure_get_up);
        }
        if (dflVar.g() == 9) {
            return BaseApplication.b().getString(R.string.IDS_blood_pressure_before_sleep);
        }
        return String.format(Locale.ROOT, BaseApplication.b().getString(R.string.IDS_blood_pressure_customize_title), Integer.valueOf(dflVar.d()));
    }

    public static Comparator<dfl> d() {
        return new Comparator() { // from class: utj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return uth.a((dfl) obj, (dfl) obj2);
            }
        };
    }

    static /* synthetic */ int a(dfl dflVar, dfl dflVar2) {
        if (dflVar == null || dflVar2 == null) {
            return 0;
        }
        int iC = dflVar.c() - dflVar2.c();
        return iC != 0 ? iC : dflVar.e() - dflVar2.e();
    }

    public static long e(int i, int i2) {
        Calendar calendarC = c();
        calendarC.set(11, i);
        calendarC.set(12, i2);
        return calendarC.getTimeInMillis();
    }

    public static Calendar c() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }
}
