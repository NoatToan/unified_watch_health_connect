package com.huawei.health.receiver;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.work.PeriodicWorkRequest;
import com.huawei.health.R;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.receiver.EcgReminderReceiver;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import defpackage.eej;
import defpackage.eey;
import defpackage.lsb;
import defpackage.mgg;
import defpackage.qrs;
import defpackage.ueb;
import defpackage.uek;
import defpackage.xjk;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.TimeZone;
import org.json.JSONException;

/* JADX INFO: loaded from: classes30.dex */
public class EcgReminderReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("reminderHuid");
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        long longExtra = intent.getLongExtra("reminderTime", 0L);
        String stringExtra2 = intent.getStringExtra("remindKey");
        if (TextUtils.isEmpty(stringExtra2)) {
            LogUtil.e("EcgReminderReceiver", "Receiver received reminder with empty remindKey");
            return;
        }
        int iE = xjk.e(intent);
        LogUtil.a("EcgReminderReceiver", "registerReminder time ", Long.valueOf(longExtra), ", remindKey = ", stringExtra2, ", timeZone offset = ", Integer.valueOf(iE));
        int intExtra = intent.getIntExtra("requestCode", 0);
        if (iE < 0) {
            a(intExtra, longExtra - ((long) iE), stringExtra, stringExtra2);
            return;
        }
        if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(accountInfo) && stringExtra.equals(accountInfo) && iE == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            DeviceInfo deviceInfoC = mgg.c("EcgReminderReceiver");
            if (b(deviceInfoC, stringExtra2) && Math.abs((jCurrentTimeMillis % 86400000) - (longExtra % 86400000)) <= PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS && !d(jCurrentTimeMillis)) {
                e(stringExtra2, eey.d(deviceInfoC, 138));
            }
        }
        if (intExtra <= 0) {
            LogUtil.j("EcgReminderReceiver", "registerReminder requestCode is invalid");
        } else {
            a(intExtra, (longExtra - ((long) iE)) + 604800000, stringExtra, stringExtra2);
        }
    }

    private void a(int i, long j, String str, String str2) {
        LogUtil.a("EcgReminderReceiver", "registerReminder requestCode ", Integer.valueOf(i), ", time ", Long.valueOf(j));
        Context context = BaseApplication.getContext();
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.health.receiver.EcgReminderReceiver");
        intent.putExtra("reminderHuid", str);
        intent.putExtra("reminderTime", j);
        intent.putExtra("requestCode", i);
        intent.putExtra("remindKey", str2);
        intent.putExtra("timeZoneId", TimeZone.getDefault().getID());
        xjk.c(i, intent, 201326592, 0, j);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    private boolean b(DeviceInfo deviceInfo, String str) {
        byte b2;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("EcgReminderReceiver", "remindKey is empty");
            return false;
        }
        LogUtil.a("EcgReminderReceiver", "isDeviceSupport, remindKey = ", str);
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("EcgReminderReceiver", "deviceInfo is null or device is not connected");
            return false;
        }
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -918899155) {
            if (iHashCode != 155319248) {
                if (iHashCode == 1407588978 && str.equals("com.huawei.health.ecgce.remind.measure.switch")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("com.huawei.health.ecg.remind.measure.switch")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("com.huawei.health.vascular-health.remind.measure.switch")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return eey.d(deviceInfo, 75);
        }
        if (b2 != 1) {
            if (b2 != 2) {
                return false;
            }
            return eey.d(deviceInfo, 106);
        }
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC != null && deviceCapabilityC.isSupportEcgAuth()) {
            return true;
        }
        LogUtil.j("EcgReminderReceiver", "capability is null or not support ecg");
        return false;
    }

    private boolean d(long j) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "last_time_notice_measure_ecg");
        if (TextUtils.isEmpty(strE) || Math.abs(j - qrs.f(strE)) >= 1800000) {
            return false;
        }
        LogUtil.a("EcgReminderReceiver", "isRepeatedNotification lastRemindTime ", strE);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    private void e(String str, boolean z) {
        byte b2;
        String string;
        String string2;
        lsb.d().e(20211202);
        Resources resources = BaseApplication.getContext().getResources();
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -918899155) {
            if (iHashCode != 155319248) {
                if (iHashCode == 1407588978 && str.equals("com.huawei.health.ecgce.remind.measure.switch")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("com.huawei.health.ecg.remind.measure.switch")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("com.huawei.health.vascular-health.remind.measure.switch")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            string = resources.getString(R.string.IDS_vascular_health_collection_title);
            string2 = resources.getString(R.string.IDS_vascular_health_remind_measure);
        } else if (b2 == 1) {
            string = resources.getString(R.string.IDS_ecg_collection_title);
            string2 = resources.getString(R.string.IDS_ecg_collection_remind_measure);
        } else if (b2 == 2) {
            string = resources.getString(R.string.IDS_quick_app_ecg_analysis);
            string2 = resources.getString(R.string.IDS_ecg_remind_measure);
        } else {
            LogUtil.e("EcgReminderReceiver", "setNotify Undefined remindKey");
            return;
        }
        Notification.Builder builderC = uek.c(string, string2, str);
        if (CommonUtil.ci()) {
            builderC.setGroupSummary(true);
            if (!z) {
                ueb.a().pingComand(d(string, string2, resources, builderC), "hw.watch.ecgrecorder.p2p");
            }
        }
        uek.d(builderC);
        LogUtil.a("EcgReminderReceiver", "sendMsgToNotification");
    }

    private PingCallback d(final String str, final String str2, final Resources resources, final Notification.Builder builder) {
        return new PingCallback() { // from class: gss
            @Override // com.huawei.health.deviceconnect.callback.PingCallback
            public final void onPingResult(int i) {
                EcgReminderReceiver.a(str, str2, resources, builder, i);
            }
        };
    }

    public static /* synthetic */ void a(String str, String str2, Resources resources, Notification.Builder builder, int i) {
        LogUtil.a("EcgReminderReceiver", "pingComand, errCode = ", Integer.valueOf(i));
        if (i == 202) {
            try {
                ueb.a().e(ueb.a().a(9001, str, str2, resources.getString(R.string.IDS_ecg_acquisition), resources.getString(R.string.IDS_ecg_ignore_reminder)).toString());
                return;
            } catch (JSONException unused) {
                LogUtil.j("EcgReminderReceiver", "JSONException");
                builder.setGroupSummary(false);
                uek.d(builder);
                return;
            }
        }
        builder.setGroupSummary(false);
        uek.d(builder);
    }
}
