package com.huawei.ui.main.stories.messageremind.receiver;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.ICommonReport;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import defpackage.fga;
import defpackage.lsb;
import defpackage.nkb;
import defpackage.qrk;
import defpackage.qrs;
import defpackage.vyf;
import defpackage.vym;
import defpackage.wva;
import defpackage.xjk;
import health.compact.a.NotificationUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.Date;

/* JADX INFO: loaded from: classes19.dex */
public class SportReminderReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f28622c;
    private int d;
    private a f = new a(this);
    private b h = new b(this);
    private int j = 0;
    private HealthOpenSDK i = null;
    private Handler e = new Handler() { // from class: com.huawei.ui.main.stories.messageremind.receiver.SportReminderReceiver.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("Track_SportReminderReceiver", "message is null.");
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 10 || i == 11) {
                SportReminderReceiver.this.b();
            }
        }
    };

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LogUtil.a("Track_SportReminderReceiver", "onReceive intent ", intent);
        this.f28621b = context.getApplicationContext();
        a(intent);
    }

    private void a(Intent intent) {
        String stringExtra = intent.getStringExtra("sportReminderHuid");
        String accountInfo = LoginInit.getInstance(this.f28621b).getAccountInfo(1011);
        LogUtil.a("Track_SportReminderReceiver", "huid ", stringExtra, "currentUserId ", accountInfo);
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(accountInfo) || !stringExtra.equals(accountInfo)) {
            return;
        }
        this.f28622c = intent;
        int intExtra = intent.getIntExtra("reminderId", -1);
        LogUtil.a("Track_SportReminderReceiver", "reminderType: ", Integer.valueOf(intExtra), ", reminderTime: ", new Date(intent.getLongExtra("sportReminderTime", 0L)));
        if (intExtra == 1000) {
            LogUtil.a("Track_SportReminderReceiver", "enter get step");
            if (this.i == null) {
                LogUtil.a("Track_SportReminderReceiver", "openSdk == null init");
                this.i = fga.d(this.f28621b).e();
            }
            this.e.sendEmptyMessageDelayed(11, 100L);
            return;
        }
        if (intExtra == 1001 || intExtra == 1002 || intExtra == 1003 || intExtra == 1004 || intExtra == 1005 || intExtra == 1006 || intExtra == 1007) {
            nkb.d().c(new d(this, intent, intExtra));
        } else {
            b(intent, intExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Intent intent, int i) {
        int i2;
        int i3;
        boolean z = i == 1000;
        if (z && ((i2 = this.f28620a) > (i3 = this.d) || i3 == 0)) {
            LogUtil.j("Track_SportReminderReceiver", "mCurrentStep ", Integer.valueOf(i2), " mCurrentGoal ", Integer.valueOf(i3));
            return;
        }
        if (!xjk.d(intent)) {
            LogUtil.a("Track_SportReminderReceiver", "setNotify enter reminderId ", Integer.valueOf(i));
            Integer num = vyf.e().get(Integer.valueOf(i));
            int iIntValue = num.intValue();
            lsb.d().e(iIntValue);
            Notification.Builder builderC = lsb.d().c();
            qrs.c(builderC);
            String strA = a(i);
            builderC.setContentTitle(c(i));
            builderC.setContentText(strA);
            builderC.setTicker(strA);
            Intent intentA = NotificationUtil.a(this.f28621b);
            intentA.putExtra("isToSportTab", true);
            if (iIntValue == 20210605) {
                intentA.putExtra("mLaunchSource", 9);
                intentA.putExtra(BleConstants.SPORT_TYPE, 257);
                intentA.putExtra("remind_from_type", 1);
            } else {
                intentA.putExtra("mLaunchSource", 10);
                intentA.putExtra("remind_from_type", 2);
            }
            builderC.setContentIntent(PendingIntent.getActivity(this.f28621b, 0, intentA, 201326592));
            builderC.setAutoCancel(true);
            builderC.setDefaults(1);
            builderC.setOngoing(false);
            builderC.setOnlyAlertOnce(true);
            lsb.d().c(iIntValue, builderC.build());
            LogUtil.a("Track_SportReminderReceiver", "sendNotification, notificationId: ", num, ", reminderId: ", Integer.valueOf(i));
            if (i == 1000) {
                SharedPreferenceManager.e(this.f28621b, "goal_not_achieve_module_id", "goal_not_achieve_sp_key", qrk.c(System.currentTimeMillis()), new StorageParams(0));
                e();
                return;
            }
            return;
        }
        int i4 = z ? 1 : 7;
        long jE = xjk.e(intent, 5, i4);
        vym.a(i, jE, ((long) i4) * 86400000);
        ReleaseLogUtil.c("Track_SportReminderReceiver", "sendNotification reminderId ", Integer.valueOf(i), " amount ", Integer.valueOf(i4), " timeMillis ", Long.valueOf(jE));
    }

    private String c(int i) {
        switch (i) {
            case 1000:
                int i2 = this.d;
                return this.f28621b.getResources().getString(R.string.IDS_track_goal_dialog, UnitUtil.e(this.f28620a, 1, 0), UnitUtil.e(i2 != 0 ? Math.round((float) (((double) (this.f28620a * 100.0f)) / (((double) i2) * 1.0d))) : 0, 2, 0));
            case 1001:
            case 1002:
            case 1003:
            case 1004:
            case 1005:
            case 1006:
            case 1007:
                return this.f28621b.getResources().getString(R.string.IDS_track_remind_dialog);
            default:
                return "";
        }
    }

    private String a(int i) {
        switch (i) {
            case 1000:
                return this.f28621b.getResources().getString(R.string.IDS_track_goal_dialog_tip);
            case 1001:
            case 1002:
            case 1003:
            case 1004:
            case 1005:
            case 1006:
            case 1007:
                return this.f28621b.getResources().getString(vyf.b().get(Integer.valueOf(new SecureRandom().nextInt(4))).intValue());
            default:
                return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("Track_SportReminderReceiver", "enter registerStepReport ", this.i);
        HealthOpenSDK healthOpenSDK = this.i;
        if (healthOpenSDK != null) {
            healthOpenSDK.a(this.f, this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("Track_SportReminderReceiver", "enter unRegisterStepReport ", this.i);
        HealthOpenSDK healthOpenSDK = this.i;
        if (healthOpenSDK != null) {
            healthOpenSDK.e(this.f);
        }
    }

    static final class a implements ICommonReport {
        private final WeakReference<SportReminderReceiver> e;

        a(SportReminderReceiver sportReminderReceiver) {
            this.e = new WeakReference<>(sportReminderReceiver);
        }

        @Override // com.huawei.hihealth.motion.ICommonReport
        public void report(Bundle bundle) {
            LogUtil.a("Track_SportReminderReceiver", "SportDataCallback enter ");
            SportReminderReceiver sportReminderReceiver = this.e.get();
            if (sportReminderReceiver == null) {
                LogUtil.j("Track_SportReminderReceiver", "sportReminderReceiver == null");
                return;
            }
            if (bundle != null) {
                if (!qrk.c(System.currentTimeMillis()).equals(SharedPreferenceManager.e(sportReminderReceiver.f28621b, "goal_not_achieve_module_id", "goal_not_achieve_sp_key"))) {
                    sportReminderReceiver.f28620a = bundle.getInt("step", -1);
                    sportReminderReceiver.d = bundle.getInt("stepTarget", -1);
                    LogUtil.a("Track_SportReminderReceiver", "report sport step ", Integer.valueOf(sportReminderReceiver.f28620a), " goal ", Integer.valueOf(sportReminderReceiver.d));
                    sportReminderReceiver.b(sportReminderReceiver.f28622c, 1000);
                    return;
                }
                LogUtil.j("Track_SportReminderReceiver", "SportDataCallback report unRegisterStepReport");
                sportReminderReceiver.e();
                return;
            }
            LogUtil.j("Track_SportReminderReceiver", "report sport data fail, bundle is null");
        }
    }

    static class b implements IExecuteResult {
        private final WeakReference<SportReminderReceiver> d;

        b(SportReminderReceiver sportReminderReceiver) {
            this.d = new WeakReference<>(sportReminderReceiver);
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            if (this.d.get() == null) {
                LogUtil.j("Track_SportReminderReceiver", "OpenSdkRegisterListener reader is null");
            } else {
                LogUtil.a("Track_SportReminderReceiver", "onSuccess");
            }
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            LogUtil.j("Track_SportReminderReceiver", "onFailed");
            SportReminderReceiver sportReminderReceiver = this.d.get();
            if (sportReminderReceiver != null) {
                sportReminderReceiver.d();
            } else {
                LogUtil.j("Track_SportReminderReceiver", "OpenSdkRegisterListener reader is null");
            }
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            LogUtil.j("Track_SportReminderReceiver", "onServiceException");
        }
    }

    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<SportReminderReceiver> f28624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f28625c;
        private final Intent e;

        d(SportReminderReceiver sportReminderReceiver, Intent intent, int i) {
            this.f28624b = new WeakReference<>(sportReminderReceiver);
            this.e = intent;
            this.f28625c = i;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("Track_SportReminderReceiver", "LastTrackCallback onResponse()");
            SportReminderReceiver sportReminderReceiver = this.f28624b.get();
            if (sportReminderReceiver == null) {
                LogUtil.j("Track_SportReminderReceiver", "LastTrackCallback reader is null");
                return;
            }
            if (obj instanceof MotionPathSimplify) {
                MotionPathSimplify motionPathSimplify = (MotionPathSimplify) obj;
                int iRequestSportType = motionPathSimplify.requestSportType();
                long jRequestStartTime = motionPathSimplify.requestStartTime();
                if (iRequestSportType == 512) {
                    RelativeSportData relativeSportDataRequestFatherSportItem = motionPathSimplify.requestFatherSportItem();
                    if (relativeSportDataRequestFatherSportItem == null) {
                        LogUtil.j("Track_SportReminderReceiver", "LastTrackCallback relativeSportData == null");
                        return;
                    }
                    jRequestStartTime = relativeSportDataRequestFatherSportItem.getStartTime();
                }
                if (!wva.e(jRequestStartTime, System.currentTimeMillis())) {
                    sportReminderReceiver.b(this.e, this.f28625c);
                } else {
                    LogUtil.a("Track_SportReminderReceiver", "hadSportToday TRUE");
                }
            }
            if (obj == null) {
                LogUtil.a("Track_SportReminderReceiver", "get last record is null, send notification ");
                sportReminderReceiver.b(this.e, this.f28625c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Handler handler = this.e;
        if (handler == null || handler.hasMessages(10)) {
            return;
        }
        int i = this.j + 1;
        this.j = i;
        LogUtil.a("Track_SportReminderReceiver", "retryRegister mRegisterTimes=", Integer.valueOf(i));
        if (this.j <= 3) {
            this.e.sendEmptyMessageDelayed(10, 200L);
        }
    }
}
