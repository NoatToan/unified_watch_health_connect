package com.huawei.basichealthmodel.receiver;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.basichealthmodel.R;
import com.huawei.basichealthmodel.devicelink.bean.NoticesBean;
import com.huawei.basichealthmodel.devicelink.bean.ResponseMsgBody;
import com.huawei.basichealthmodel.medicine.MedicinesRule;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.health.healthmodel.bean.TextBean;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.taskplatform.TaskEnum;
import defpackage.ayx;
import defpackage.bwe;
import defpackage.bxc;
import defpackage.bxp;
import defpackage.bzr;
import defpackage.cao;
import defpackage.cbg;
import defpackage.ccy;
import defpackage.cee;
import defpackage.cfb;
import defpackage.cfh;
import defpackage.cfu;
import defpackage.ffv;
import defpackage.imr;
import defpackage.lsb;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qfj;
import defpackage.qre;
import defpackage.qrf;
import defpackage.qrs;
import defpackage.xjk;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class ReminderReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f5341a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f5342c;
    private String d;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        boolean zL = ffv.l();
        LogUtil.a("HL_ReminderReceiver", "onReceive start, isHealthLife: ", Boolean.valueOf(zL));
        if (zL) {
            a(intent);
            return;
        }
        boolean zAe = cbg.ae();
        boolean zL2 = Utils.l();
        ReleaseLogUtil.c("R_HL_ReminderReceiver", "onReceive isUseNewHealthModel ", Boolean.valueOf(zAe), " isSupportHealthModel ", Boolean.valueOf(zL2));
        if (zAe || !zL2) {
            return;
        }
        this.f5342c = context;
        if (intent.hasExtra("reminderHuid")) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: cad
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1385b.c(intent);
                }
            });
        }
    }

    private void a(Intent intent) {
        String action = intent.getAction();
        LogUtil.a("HL_ReminderReceiver", "processHealthLifeNodify, action:", action);
        if (TextUtils.isEmpty(action)) {
            return;
        }
        if ("DRINK_WATER_REMIND_ACTION".equals(action)) {
            b(intent);
            cee.d();
        } else if ("TAKE_MEDICINE_REMIND_ACTION".equals(action)) {
            e(intent);
            cee.a();
        } else {
            LogUtil.j("HL_ReminderReceiver", "action undefined");
        }
    }

    private void b(Intent intent) {
        qfj qfjVarA = ffv.a((List<String>) Collections.EMPTY_LIST, (ResponseCallback<qfj>) null);
        if (qfjVarA != null && qfjVarA.c(TaskEnum.DRINK_WATER.getTaskId()) == 1) {
            ReleaseLogUtil.c("R_HL_ReminderReceiver", "sendDrinkWaterNotify task completed");
            return;
        }
        LogUtil.a("HL_ReminderReceiver", "sendDrinkWaterNotify enter");
        String strF = qre.f(R.string.IDS_drinkwater_reminder_title);
        String strF2 = qre.f(R.string.IDS_drink_water_reminder_content);
        String strF3 = qre.f(R.string.IDS_drink_water_reminder_content2);
        if (Math.random() >= 0.5d) {
            strF2 = strF3;
        }
        d(202004207, strF2, strF, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.health-clovers?h5pro=true&urlType=4&pName=com.huawei.health&path=HealthyLiving&taskId=10")));
    }

    private void e(Intent intent) {
        LogUtil.a("HL_ReminderReceiver", "sendTakeMedicineNotify enter");
        d(202004211, qre.f(R.string.IDS_take_medicine_reminder_content), qre.f(R.string.IDS_take_medicine_reminder_title), new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.health-clovers?h5pro=true&urlType=4&pName=com.huawei.health&path=HealthyLiving&taskId=11")));
    }

    private static void d(int i, String str, String str2, Intent intent) {
        lsb.d().e(i);
        Notification.Builder builderC = lsb.d().c();
        qrs.c(builderC);
        Context contextB = BaseApplication.b();
        intent.setFlags(67108864);
        intent.addFlags(536870912);
        builderC.setContentTitle(str2).setContentText(str).setContentIntent(PendingIntent.getActivity(contextB, 0, intent, 201326592));
        builderC.setAutoCancel(true);
        imr.b(i, builderC, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(Intent intent) {
        String stringExtra = intent.getStringExtra("reminderHuid");
        String accountInfo = LoginInit.getInstance(this.f5342c).getAccountInfo(1011);
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(accountInfo) || !stringExtra.equals(accountInfo)) {
            ReleaseLogUtil.d("R_HL_ReminderReceiver", "processRemindNotify invalid userId");
            return;
        }
        int intExtra = intent.getIntExtra("reminderId", -1);
        int intExtra2 = intent.getIntExtra("reminderTotalNumber", 1);
        int intExtra3 = intent.getIntExtra("reminderCurrentNumber", 1);
        if (xjk.d(intent)) {
            long jE = xjk.e(intent, 5, 1);
            ReleaseLogUtil.c("R_HL_ReminderReceiver", "processRemindNotify timeMillis ", Long.valueOf(jE), " reminderType ", Integer.valueOf(intExtra), " totalNumber ", Integer.valueOf(intExtra2), " reminderCurrentNumber ", Integer.valueOf(intExtra3));
            if (jE > 0) {
                cfb.d(intExtra, jE, intExtra2, intExtra3);
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (intExtra == 3000 && cfu.e() >= lsl.u(jCurrentTimeMillis)) {
            ReleaseLogUtil.c("R_HL_ReminderReceiver", "processRemindNotify have sent Celebrating message");
            return;
        }
        long jC = (xjk.c(intent) / 60000) * 60000;
        this.f5341a = jC;
        ReleaseLogUtil.c("R_HL_ReminderReceiver", "processRemindNotify reminderType ", Integer.valueOf(intExtra), " reminderCurrentNumber ", Integer.valueOf(intExtra3), " mReminderTime ", Long.valueOf(jC));
        this.d = intExtra + " " + intExtra3;
        if (Math.abs(jCurrentTimeMillis - this.f5341a) > (intExtra == 3011 ? 60 : 15) * 60000 || d(jCurrentTimeMillis)) {
            return;
        }
        bxp.b().c();
        a(intExtra, intExtra2, intExtra3);
    }

    private boolean d(long j) {
        String strC = ccy.c("health_model_remind_last_time_" + this.d);
        ReleaseLogUtil.c("R_HL_ReminderReceiver", "isRepeatedNotification mapString ", strC);
        if (TextUtils.isEmpty(strC) || Math.abs(j - qrs.f(strC)) >= 1800000) {
            return false;
        }
        ReleaseLogUtil.c("R_HL_ReminderReceiver", "isRepeatedNotification mMapKey ", this.d, " mapString ", strC);
        return true;
    }

    private void a(int i, int i2, int i3) {
        String strC;
        ReleaseLogUtil.c("R_HL_ReminderReceiver", "sendNotification reminderId ", Integer.valueOf(i), " reminderTotalNumber ", Integer.valueOf(i2), " reminderCurrentNumber ", Integer.valueOf(i3));
        if (i == 3000) {
            return;
        }
        int[] iArr = cfb.d().get(Integer.valueOf(i));
        if (iArr == null || iArr.length < 1) {
            ReleaseLogUtil.d("R_HL_ReminderReceiver", "sendNotification ids ", iArr);
            return;
        }
        int i4 = iArr[0];
        if (i4 == 14) {
            return;
        }
        cao caoVar = cfb.a().get(Integer.valueOf(i4));
        if (caoVar == null) {
            ReleaseLogUtil.d("R_HL_ReminderReceiver", "sendNotification reminderBean is null");
            return;
        }
        boolean zD = caoVar.d();
        ReleaseLogUtil.c("R_HL_ReminderReceiver", "sendNotification isEnabled ", Boolean.valueOf(zD));
        if (zD) {
            if (i == 4000) {
                strC = a(cfh.a("reticent_user_wake_up_two_day"));
            } else if (i == 4001) {
                strC = a(cfh.a("reticent_user_wake_up_seven_day"));
            } else if (i == 3011) {
                e(i, iArr[1], i4);
                return;
            } else {
                if (i4 == 10 && !d(caoVar, i2, i3)) {
                    ReleaseLogUtil.c("R_HL_ReminderReceiver", "sendNotification not need remind taskId ", Integer.valueOf(i4), " reminderCurrentNumber ", Integer.valueOf(i3), " reminderTotalNumber ", Integer.valueOf(i2));
                    return;
                }
                strC = cfb.c(i4);
            }
            a(i, iArr[1], i4, strC);
        }
    }

    private void e(final int i, final int i2, final int i3) {
        ReleaseLogUtil.c("R_HL_ReminderReceiver", "sendMedicineNotify reminderId", Integer.valueOf(i), ",taskId ", Integer.valueOf(i3));
        bzr.b(DateFormatUtil.a(System.currentTimeMillis()), new IBaseResponseCallback() { // from class: bzy
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i4, Object obj) {
                this.f1381c.c(i, i2, i3, i4, obj);
            }
        });
    }

    public /* synthetic */ void c(int i, int i2, int i3, int i4, Object obj) {
        if (i4 != 0 || !(obj instanceof Map)) {
            ReleaseLogUtil.d("R_HL_ReminderReceiver", "sendMedicineNotify errorCode ", Integer.valueOf(i4));
            return;
        }
        Map map = (Map) obj;
        LogUtil.a("HL_ReminderReceiver", "sendMedicineNotify medicinesRuleBeans ", map.toString());
        int iR = ((int) (this.f5341a - lsl.r(this.f5341a))) / 1000;
        List<MedicinesRule> list = (List) map.get(Integer.valueOf(iR));
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_HL_ReminderReceiver", "sendMedicineNotify medicinesRuleBeans ", list, " medicineTime ", Integer.valueOf(iR));
        } else {
            a(i, i2, i3, String.format(Locale.ENGLISH, this.f5342c.getResources().getString(R.string.IDS_health_model_medicines_remind_1), b(list)));
        }
    }

    private String b(List<MedicinesRule> list) {
        String name;
        String str;
        int size = list.size();
        String name2 = "";
        if (size < 1) {
            name = "";
        } else {
            name = list.get(0).getName();
        }
        if (size >= 2) {
            name2 = list.get(1).getName();
            str = String.format(Locale.ENGLISH, this.f5342c.getResources().getString(R.string.IDS_medicines_remind_2), name, name2);
        } else {
            str = name;
        }
        if (size == 3) {
            return String.format(Locale.ENGLISH, this.f5342c.getResources().getString(R.string.IDS_medicines_remind_3), name, name2, list.get(2).getName());
        }
        if (size > 3) {
            return String.format(Locale.ENGLISH, this.f5342c.getResources().getString(R.string.IDS_health_model_medicines_remind_4), name, name2, list.get(2).getName());
        }
        ReleaseLogUtil.d("R_HL_ReminderReceiver", "sendMedicineNotify others");
        return str;
    }

    private boolean d(cao caoVar, int i, int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (caoVar != null) {
            List<ayx> listB = caoVar.b();
            if (njy.b(listB)) {
                long jMin = 0;
                long jMax = 0;
                for (ayx ayxVar : listB) {
                    if (ayxVar != null) {
                        long jA = lsl.a(jCurrentTimeMillis, ayxVar.c(), ayxVar.e());
                        jMin = Math.min(jMin, jA);
                        jMax = Math.max(jMax, jA);
                    }
                }
                ReleaseLogUtil.c("R_HL_ReminderReceiver", "needRemind mReminderTime ", Long.valueOf(this.f5341a), " minReminderTime ", Long.valueOf(jMin), " maxReminderTime ", Long.valueOf(jMax), " reminderTimeRange ", 900000);
                long j = this.f5341a;
                if (j < jMin && jMin - j > 900000) {
                    return false;
                }
                if (j > jMax && j - jMax > 900000) {
                    return false;
                }
            }
        }
        HealthLifeBean healthLifeBeanC = bxc.c(10, DateFormatUtil.a(jCurrentTimeMillis), cbg.q());
        if (!cbg.h(healthLifeBeanC)) {
            ReleaseLogUtil.c("R_HL_ReminderReceiver", "needRemind bean ", healthLifeBeanC);
            return true;
        }
        if (i2 == 0 || i == 0) {
            ReleaseLogUtil.d("R_HL_ReminderReceiver", "needRemind reminderCurrentNumber ", Integer.valueOf(i2), " reminderTotalNumber ", Integer.valueOf(i));
            return false;
        }
        if (qrs.a(healthLifeBeanC.getResult()) / i2 < qrs.a(healthLifeBeanC.getTarget()) / i) {
            return true;
        }
        ReleaseLogUtil.c("R_HL_ReminderReceiver", "needRemind don't need sendNotification");
        return false;
    }

    private String a(bwe bweVar) {
        if (bweVar == null) {
            ReleaseLogUtil.d("R_HL_ReminderReceiver", "getContentText interactiveSemanticBean is null");
            return "";
        }
        ArrayList<TextBean> arrayListE = bweVar.e();
        if (njy.e(arrayListE)) {
            ReleaseLogUtil.d("R_HL_ReminderReceiver", "getContentText textBeanList is empty");
            return "";
        }
        ArrayList<String> arrayListE2 = cfh.e(arrayListE, (HashMap<String, String>) null);
        if (njy.e(arrayListE2)) {
            ReleaseLogUtil.d("R_HL_ReminderReceiver", "getContentText textList ", arrayListE2);
            return "";
        }
        return arrayListE2.get(qrf.d(arrayListE2.size()));
    }

    private void a(int i, int i2, int i3, String str) {
        PendingIntent activity;
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("R_HL_ReminderReceiver", "setNotify text ", str, " reminderId ", Integer.valueOf(i), " notificationId ", Integer.valueOf(i2), " taskId ", Integer.valueOf(i3));
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (d(jCurrentTimeMillis)) {
            ReleaseLogUtil.d("R_HL_ReminderReceiver", "setNotify isRepeatedNotification text ", str, " reminderId ", Integer.valueOf(i), " notificationId ", Integer.valueOf(i2), " taskId ", Integer.valueOf(i3));
            return;
        }
        lsb.d().e(i2);
        Notification.Builder builderC = lsb.d().c();
        qrs.c(builderC);
        if (PermissionUtil.f() || (PermissionUtil.d() && !CommonUtil.bg())) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/basicHealth?healthType=6&urlType=4&pName=com.huawei.health&id=" + i3));
            intent.setPackage(BaseApplication.d());
            activity = PendingIntent.getActivity(this.f5342c, i, intent, 201326592);
        } else {
            Intent intent2 = new Intent(this.f5342c, (Class<?>) NotificationReceiver.class);
            intent2.setPackage(BaseApplication.d());
            intent2.putExtra("id", i3);
            activity = PendingIntent.getBroadcast(this.f5342c, i, intent2, 201326592);
        }
        builderC.setContentTitle(cbg.f()).setContentText(str).setStyle(new Notification.BigTextStyle().bigText(str)).setTicker(str).setContentIntent(activity);
        builderC.setCategory("HwLifestyle01");
        builderC.setAutoCancel(true).setDefaults(1).setOngoing(false).setOnlyAlertOnce(true);
        if (e()) {
            ReleaseLogUtil.c("R_HL_ReminderReceiver", "setNotify isSupportDeviceRemind");
            builderC.setGroupSummary(true);
            ResponseMsgBody responseMsgBody = new ResponseMsgBody();
            responseMsgBody.setMsgType(2002);
            responseMsgBody.setNoticesBean(e(i3, str));
            bxp.b().e(2, responseMsgBody);
        }
        imr.b(i2, builderC, str);
        ccy.d("health_model_remind_last_time_" + this.d, String.valueOf(jCurrentTimeMillis));
        ReleaseLogUtil.c("R_HL_ReminderReceiver", "setNotify reminderId ", Integer.valueOf(i), " notificationId ", Integer.valueOf(i2), " taskId ", Integer.valueOf(i3), " text ", str, " lan ", CommonUtil.u());
        e(str, CommonUtil.u());
    }

    private void e(String str, String str2) {
        if (!CommonUtil.ap() || StringUtils.g(str)) {
            return;
        }
        if (StringUtils.g(str2) || (MLAsrConstants.LAN_ZH.equalsIgnoreCase(str2) && !b(str))) {
            LogUtil.b("HL_ReminderReceiver", "description not match language,  text: " + str + ", lan: " + str2);
        }
    }

    private boolean b(String str) {
        return str.matches(".*[\\u4e00-\\u9fa5].*");
    }

    private boolean e() {
        boolean zCi = CommonUtil.ci();
        boolean zF = bxp.b().f();
        boolean zA = cfb.a(BaseApplication.d());
        ReleaseLogUtil.c("R_HL_ReminderReceiver", "isSupportDeviceRemind isSynergy91 ", Boolean.valueOf(zCi), " isSupportCapability ", Boolean.valueOf(zF), " notificationStatus ", Boolean.valueOf(zA));
        return zCi && zF && zA;
    }

    private List<NoticesBean> e(int i, String str) {
        ReleaseLogUtil.c("R_HL_ReminderReceiver", "getDeviceRemindMsg id ", Integer.valueOf(i), " content ", str);
        NoticesBean noticesBean = new NoticesBean();
        if (i != 1 && cbg.b(i)) {
            noticesBean.setTaskName(BaseApplication.b().getResources().getString(ffv.i().get(i)));
        } else {
            noticesBean.setTaskName(cbg.f());
        }
        noticesBean.setRecordDay(DateFormatUtil.a(System.currentTimeMillis()));
        noticesBean.setTaskId(i);
        noticesBean.setMsg(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(noticesBean);
        return arrayList;
    }
}
