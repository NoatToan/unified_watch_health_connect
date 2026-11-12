package com.huawei.ui.main.stories.messageremind.receiver;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity;
import defpackage.fua;
import defpackage.ift;
import defpackage.lsb;
import defpackage.njy;
import defpackage.qrs;
import defpackage.usv;
import defpackage.utk;
import defpackage.uub;
import defpackage.uwh;
import defpackage.xjk;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BloodPressureReminderReceiver extends BroadcastReceiver {
    private Context d;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        boolean zIsSystemBarNoticeSwitchOnOrDefault = CommonUtil.isSystemBarNoticeSwitchOnOrDefault(applicationContext);
        uub.d(zIsSystemBarNoticeSwitchOnOrDefault);
        boolean zD = xjk.d(intent);
        ReleaseLogUtil.c("BloodPressureReminderReceiver", "onReceive isOpenSwitch ", Boolean.valueOf(zIsSystemBarNoticeSwitchOnOrDefault), " isDifferentTimeZone ", Boolean.valueOf(zD));
        if (!zD && zIsSystemBarNoticeSwitchOnOrDefault) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vyl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51696b.d(intent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void d(Intent intent) {
        String accountInfo = LoginInit.getInstance(this.d).getAccountInfo(1011);
        int intExtra = intent.getIntExtra("reminderId", -1);
        final long longExtra = intent.getLongExtra("sportReminderTime", 0L);
        LogUtil.a("BloodPressureReminderReceiver", "processRemindNotify, reminderType is ", Integer.valueOf(intExtra), "reminderTime is ", Long.valueOf(longExtra));
        if (TextUtils.isEmpty(accountInfo) || intExtra != 1100) {
            return;
        }
        final long jA = ift.a(System.currentTimeMillis()) - 1123200000;
        new utk().d(true, jA, System.currentTimeMillis(), new IBaseResponseCallback() { // from class: vyo
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f51698a.a(jA, longExtra, i, obj);
            }
        });
    }

    public /* synthetic */ void a(long j, long j2, int i, Object obj) {
        List<uwh> list = obj instanceof List ? (List) obj : Collections.EMPTY_LIST;
        if (njy.e(list)) {
            LogUtil.a("BloodPressureReminderReceiver", "processRemindNotify, bloodPressureList is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (uwh uwhVar : list) {
            LogUtil.a("BloodPressureReminderReceiver", "processRemindNotify, bloodPressure is ", uwhVar);
            if (uwhVar.g() > 604800000 + j) {
                arrayList.add(uwhVar);
            } else {
                arrayList2.add(uwhVar);
            }
        }
        if (c(arrayList) && c(arrayList2)) {
            LogUtil.a("BloodPressureReminderReceiver", "processRemindNotify, show compare");
            a(arrayList, arrayList2, j2);
        } else if (c(arrayList)) {
            LogUtil.a("BloodPressureReminderReceiver", "processRemindNotify, lastWeekData size is not match");
            e(1, 6, j2);
        } else {
            LogUtil.a("BloodPressureReminderReceiver", "processRemindNotify, thisWeekData size is not match");
        }
    }

    private void a(List<uwh> list, List<uwh> list2, long j) {
        usv usvVarB = b(list);
        usv usvVarB2 = b(list2);
        int iA = a(usvVarB.d());
        int iA2 = a(usvVarB.b());
        int iA3 = a(usvVarB2.d());
        int iA4 = a(usvVarB2.b());
        if (iA > iA3 && iA2 > iA4) {
            e(2, 7, j);
        } else if (iA < iA3 && iA2 < iA4) {
            e(3, 7, j);
        } else {
            e(1, 7, j);
        }
    }

    private int a(double d) {
        return (int) UnitUtil.d(d, 0);
    }

    private boolean c(List<uwh> list) {
        return njy.b(list) && list.size() >= 3;
    }

    private usv b(List<uwh> list) {
        int size = list.size();
        double dM = 0.0d;
        double dO = 0.0d;
        for (uwh uwhVar : list) {
            dM += uwhVar.m();
            dO += uwhVar.o();
        }
        double d = size;
        return new usv(dM / d, dO / d);
    }

    private void e(int i, int i2, long j) {
        String string;
        if (fua.p()) {
            LogUtil.a("BloodPressureReminderReceiver", "sendNotification false");
            return;
        }
        LogUtil.a("BloodPressureReminderReceiver", "enter sendNotification ", Integer.valueOf(i));
        SharedPreferenceManager.c("BloodPressure", "update_time", System.currentTimeMillis());
        SharedPreferenceManager.d("BloodPressure", "content_type", i);
        SharedPreferenceManager.a("BloodPressure", "is_update_message", true);
        lsb.d().e(20220731);
        if (i == 1) {
            string = this.d.getResources().getString(R.string.IDS_blood_pressure_normal);
        } else if (i == 2) {
            string = this.d.getResources().getString(R.string.IDS_blood_pressure_higher);
        } else if (i != 3) {
            string = "";
        } else {
            string = this.d.getResources().getString(R.string.IDS_blood_pressure_lower);
        }
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("BloodPressureReminderReceiver", "sendNotification, content is empty");
            return;
        }
        Notification.Builder builderC = lsb.d().c();
        qrs.c(builderC);
        builderC.setContentTitle(this.d.getResources().getString(R.string.IDS_blood_pressure_title));
        builderC.setContentText(string);
        builderC.setStyle(new Notification.BigTextStyle().bigText(string));
        Intent intent = new Intent(this.d, (Class<?>) KnitBloodPressureActivity.class);
        intent.setPackage(this.d.getPackageName());
        intent.addFlags(268435456);
        intent.putExtra(KnitHealthDetailActivity.KEY_SUB_PAGE_INDEX, 1);
        intent.putExtra("biMessageType", i2);
        intent.putExtra("key_bundle_health_last_data_time", j);
        builderC.setContentIntent(PendingIntent.getActivity(this.d, 0, intent, 201326592));
        builderC.setAutoCancel(true);
        builderC.setDefaults(1);
        builderC.setOngoing(false);
        builderC.setOnlyAlertOnce(true);
        lsb.d().c(20220731, builderC.build());
        LogUtil.a("BloodPressureReminderReceiver", "sendNotification, notificationId: ", 20220731);
    }
}
