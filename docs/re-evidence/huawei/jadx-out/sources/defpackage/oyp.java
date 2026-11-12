package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.media3.extractor.ts.PsExtractor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.pluginachievement.manager.model.ResultCode;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class oyp implements AchieveObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NoTitleCustomAlertDialog f44980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f44981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f44982c;
    private int d;
    private otl e;
    private String f;
    private ioi j;

    static /* synthetic */ int a(oyp oypVar) {
        int i = oypVar.d;
        oypVar.d = i + 1;
        return i;
    }

    public oyp(Context context, Handler handler) {
        this.f44982c = context;
        this.f44981b = handler;
        otl otlVarB = otl.b(context.getApplicationContext());
        this.e = otlVarB;
        otlVarB.c(this);
        this.f = HiDateUtil.c((String) null);
        this.j = ioi.d();
    }

    public void c() {
        HashMap map = new HashMap(2);
        map.put("timestamp", String.valueOf(System.currentTimeMillis()));
        map.put("timeZone", this.f);
        otl otlVar = this.e;
        if (otlVar != null) {
            otlVar.a(19, map);
        }
    }

    public void d() {
        HashMap map = new HashMap(2);
        map.put("timestamp", String.valueOf(System.currentTimeMillis()));
        map.put("timeZone", this.f);
        otl otlVar = this.e;
        if (otlVar != null) {
            otlVar.a(20, map);
        }
    }

    public void a() {
        HashMap map = new HashMap(2);
        map.put("pageNo", String.valueOf(1));
        map.put(IAchieveDBMgr.PARAM_PAGE_SIZE, String.valueOf(80));
        map.put("timeZone", this.f);
        otl otlVar = this.e;
        if (otlVar != null) {
            otlVar.a(23, map);
        }
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, UserAchieveWrapper userAchieveWrapper) {
        if (i == -1) {
            if (CommonUtil.ca() || !pap.b(userAchieveWrapper)) {
                return;
            }
            d(1002, true);
            return;
        }
        d(1002, false);
        if (userAchieveWrapper == null) {
            return;
        }
        LogUtil.a("KakaActivitySupport", "onDataChanged resultCode=", userAchieveWrapper.getResultCode());
        if (!"0".equals(userAchieveWrapper.getResultCode())) {
            e(userAchieveWrapper.getResultCode(), userAchieveWrapper.getContentType());
            return;
        }
        int contentType = userAchieveWrapper.getContentType();
        if (contentType == 19) {
            d(11200, userAchieveWrapper.getKakaCheckInReturnBody());
        } else if (contentType == 20) {
            d(11201, userAchieveWrapper.getKakaCheckinRecords());
        } else {
            if (contentType != 23) {
                return;
            }
            d(MLAsrConstants.ERR_NO_UNDERSTAND, userAchieveWrapper.getRedeemGiftRecords());
        }
    }

    private <T> void d(int i, T t) {
        Handler handler = this.f44981b;
        if (handler == null) {
            LogUtil.j("KakaActivitySupport", "sendHandlerMessage handler is null!");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = t;
        handler.sendMessage(messageObtain);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 int, still in use, count: 4, list:
      (r0v2 int) from 0x0015: IF  (r0v2 int) != (-1948319192 int)  -> B:4:0x0017 A[HIDDEN]
      (r0v2 int) from 0x001a: IF  (r0v2 int) != (46730168 int)  -> B:6:0x001c A[HIDDEN]
      (r0v2 int) from 0x001f: SWITCH (r0v2 int)
     case -1948319223: goto B:42:0x008f
     case -1948319222: goto B:38:0x0084
     case -1948319221: goto B:34:0x0079
     case -1948319220: goto B:30:0x006c
     default: goto B:8:0x0022 A[RegionRef:SW:7]
      (r0v2 int) from 0x0022: SWITCH (r0v2 int)
     case -1948319198: goto B:26:0x005f
     case -1948319197: goto B:22:0x0051
     case -1948319196: goto B:18:0x0043
     case -1948319195: goto B:14:0x0035
     case -1948319194: goto B:10:0x0027
     default: goto B:64:0x00cf A[RegionRef:SW:8]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void e(String str, int i) {
        byte b2;
        String string;
        LogUtil.j("KakaActivitySupport", "handerErrorMessages errCode = ", str);
        str.hashCode();
        if (iHashCode != -1948319192) {
            if (iHashCode != 46730168) {
                switch (str) {
                    case "12030003":
                        b2 = 0;
                        break;
                    case "12030004":
                        b2 = 1;
                        break;
                    case "12030005":
                        b2 = 2;
                        break;
                    default:
                        switch (str) {
                            case -1948319223:
                                if (!str.equals(ResultCode.CODE_NON_REAL_TIME_CHECK_IN)) {
                                    b2 = -1;
                                } else {
                                    b2 = 3;
                                }
                                break;
                            case -1948319222:
                                if (!str.equals(ResultCode.CODE_GIFT_IS_NOT_EXIST)) {
                                    b2 = -1;
                                } else {
                                    b2 = 4;
                                }
                                break;
                            case -1948319221:
                                if (!str.equals(ResultCode.CODE_GIFT_IS_SOLD_OUT)) {
                                    b2 = -1;
                                } else {
                                    b2 = 5;
                                }
                                break;
                            case -1948319220:
                                if (!str.equals(ResultCode.CODE_EXCHANGE_OUT_OF_LIMIT)) {
                                    b2 = -1;
                                } else {
                                    b2 = 6;
                                }
                                break;
                            default:
                                switch (str) {
                                    case -1948319198:
                                        if (!str.equals(ResultCode.CODE_EXCHANGE_OUT_OF_USER_LIMIT)) {
                                            b2 = -1;
                                        } else {
                                            b2 = 7;
                                        }
                                        break;
                                    case -1948319197:
                                        if (!str.equals(ResultCode.CODE_TODAY_IS_CHECKED)) {
                                            b2 = -1;
                                        } else {
                                            b2 = 8;
                                        }
                                        break;
                                    case -1948319196:
                                        if (!str.equals(ResultCode.CODE_EXCHANGE_IS_STOPED)) {
                                            b2 = -1;
                                        } else {
                                            b2 = 9;
                                        }
                                        break;
                                    case -1948319195:
                                        if (!str.equals(ResultCode.CODE_EXCHANGE_IS_NOT_BEGIN)) {
                                            b2 = -1;
                                        } else {
                                            b2 = 10;
                                        }
                                        break;
                                    case -1948319194:
                                        if (!str.equals(ResultCode.CODE_EXCHANGE_OUT_OF_USER_EACH_DAY_LIMIT)) {
                                            b2 = -1;
                                        } else {
                                            b2 = 11;
                                        }
                                        break;
                                    default:
                                        b2 = -1;
                                        break;
                                }
                                break;
                        }
                }
            } else if (str.equals(ResultCode.CODE_PARAMETER_INVALID)) {
                b2 = 13;
            } else {
                b2 = -1;
            }
        } else if (str.equals(ResultCode.CODE_NOT_TODAY_TASK)) {
            b2 = 12;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
                LogUtil.j("KakaActivitySupport", "Redeem gift is processing.");
                break;
            case 1:
            case 13:
                string = (i != 23 && i != 21) ? this.f44982c.getString(R.string.IDS_achieve_kaka_redemption_fail) : null;
                break;
            case 2:
                LogUtil.j("KakaActivitySupport", "add kaka value is out limited");
                break;
            case 3:
                string = this.f44982c.getString(R.string.IDS_achieve_kaka_date_wrong);
                break;
            case 4:
            case 9:
                string = this.f44982c.getString(R.string.IDS_achieve_kaka_has_removed);
                break;
            case 5:
                string = this.f44982c.getString(R.string.IDS_achieve_kaka_gift_insufficient);
                break;
            case 6:
                string = this.f44982c.getString(R.string.IDS_kaka_gift_to_today_limit);
                break;
            case 7:
            case 11:
                string = this.f44982c.getString(R.string.IDS_achieve_kaka_to_limit);
                break;
            case 8:
                LogUtil.j("KakaActivitySupport", "today has checked");
                break;
            case 10:
                string = this.f44982c.getString(R.string.IDS_achieve_kaka_not_start);
                break;
            case 12:
                string = this.f44982c.getString(R.string.IDS_kaka_not_today_task);
                break;
            default:
                LogUtil.j("KakaActivitySupport", "unknow error:", str);
                break;
        }
        if (string != null) {
            d(1000, string);
        }
    }

    public void e() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f44980a;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.cancel();
            this.f44980a = null;
        }
        this.e.d(this);
        this.f44982c = null;
        Handler handler = this.f44981b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f44981b = null;
        }
    }

    public void b() {
        Bundle bundle = new Bundle();
        bundle.putString("from", "2");
        AppRouter.c("/HWUserProfileMgr/MyAwardActivity").d(bundle).b(this.f44982c);
    }

    public void a(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            LogUtil.j("KakaActivitySupport", "showSystemTimeErrorDialog activity is finish");
            return;
        }
        if (this.f44980a == null) {
            final WeakReference weakReference = new WeakReference(activity);
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activity).a(String.format(Locale.ENGLISH, activity.getResources().getString(R.string.IDS_system_time_error), qrs.f(activity))).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: oyq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    oyp.d(weakReference, view);
                }
            }).c();
            this.f44980a = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
        }
        if (this.f44980a.isShowing()) {
            return;
        }
        this.f44980a.show();
    }

    static /* synthetic */ void d(WeakReference weakReference, View view) {
        Activity activity = (Activity) weakReference.get();
        if (activity == null) {
            LogUtil.a("KakaActivitySupport", "setPositiveButton: activity is null");
        } else {
            activity.finish();
        }
    }

    public void a(Context context) {
        if (context == null) {
            LogUtil.j("KakaActivitySupport", "showKakaLotteryPage context is null.");
            return;
        }
        LogUtil.a("KakaActivitySupport", "showKakaLotteryPage enter");
        ddv.b().initH5Pro();
        ddv.b().loadH5ProApp(this.f44982c, KakaConstants.KAKA_H5_PACKAGE_NAME, new H5ProLaunchOption.Builder().addPath("#/lotteryOptimized").setBackgroundColor(Color.rgb(255, PsExtractor.PRIVATE_STREAM_1, 81)));
    }

    public void a(HealthSwitchButton healthSwitchButton) {
        if (!TextUtils.isEmpty(osa.e(this.f44982c, "kaka_checkin_reminder_show_time")) || healthSwitchButton.isChecked()) {
            LogUtil.j("KakaActivitySupport", "showCheckReminderDialog need not to show");
            return;
        }
        d(healthSwitchButton);
        osa.b(this.f44982c, "kaka_checkin_reminder_show_time", "" + System.currentTimeMillis());
    }

    public void b(final HealthSwitchButton healthSwitchButton) {
        if (healthSwitchButton == null) {
            LogUtil.j("KakaActivitySupport", "initReminderSwitch isnull");
            return;
        }
        String strC = this.j.c(403);
        LogUtil.a("KakaActivitySupport", "initReminderSwitch status = ", strC);
        if (String.valueOf(true).equals(strC)) {
            healthSwitchButton.setChecked(true);
        } else {
            healthSwitchButton.setChecked(false);
        }
        healthSwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oyp.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (compoundButton.isPressed()) {
                    if (z) {
                        LogUtil.a("KakaActivitySupport", "turn on check reminder");
                        oyp.this.a(true);
                        healthSwitchButton.setChecked(true);
                        return;
                    }
                    oyp.this.e(healthSwitchButton);
                }
            }
        });
    }

    public void d(HealthSwitchButton healthSwitchButton) {
        final WeakReference weakReference = new WeakReference(healthSwitchButton);
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f44982c).e(this.f44982c.getResources().getString(R.string.IDS_kaka_open_reminder_title)).a(this.f44982c.getResources().getString(R.string.IDS_kaka_open_reminder_content)).a(R.string.IDS_kaka_open_reminder_yes, new View.OnClickListener() { // from class: oyt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f44992a.c(weakReference, view);
            }
        }).e(R.string.IDS_kaka_open_reminder_no, new View.OnClickListener() { // from class: oyr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oyp.b(weakReference, view);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
        HashMap map = new HashMap(2);
        map.put("type", "1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.KAKA_SHOW_REMINDER_DIALOG_1100047.value(), map, 0);
    }

    /* synthetic */ void c(WeakReference weakReference, View view) {
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) weakReference.get();
        if (healthSwitchButton == null) {
            LogUtil.a("KakaActivitySupport", "setPositiveButton: button is null");
            return;
        }
        LogUtil.a("KakaActivitySupport", "turn on check reminder");
        a(true);
        healthSwitchButton.setChecked(true);
    }

    static /* synthetic */ void b(WeakReference weakReference, View view) {
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) weakReference.get();
        if (healthSwitchButton == null) {
            LogUtil.a("KakaActivitySupport", "setNegativeButton: button is null");
        } else {
            healthSwitchButton.setChecked(false);
            LogUtil.j("KakaActivitySupport", "turn on check reminder cancel");
        }
    }

    public void e(HealthSwitchButton healthSwitchButton) {
        final WeakReference weakReference = new WeakReference(healthSwitchButton);
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f44982c).e(this.f44982c.getResources().getString(R.string.IDS_kaka_close_reminder_title)).a(this.f44982c.getResources().getString(R.string.IDS_kaka_close_reminder_content)).a(R.string.IDS_kaka_close_reminder_no, new View.OnClickListener() { // from class: oyu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oyp.e(weakReference, view);
            }
        }).e(R.string.IDS_kaka_close_reminder_yes, new View.OnClickListener() { // from class: oys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f44990a.a(weakReference, view);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
        HashMap map = new HashMap(2);
        map.put("type", "-1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.KAKA_SHOW_REMINDER_DIALOG_1100047.value(), map, 0);
    }

    static /* synthetic */ void e(WeakReference weakReference, View view) {
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) weakReference.get();
        if (healthSwitchButton == null) {
            LogUtil.a("KakaActivitySupport", "setPositiveButton: button is null");
        } else {
            healthSwitchButton.setChecked(true);
            LogUtil.a("KakaActivitySupport", "turn off check reminder cancel");
        }
    }

    /* synthetic */ void a(WeakReference weakReference, View view) {
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) weakReference.get();
        if (healthSwitchButton == null) {
            LogUtil.a("KakaActivitySupport", "setNegativeButton: button is null");
            return;
        }
        LogUtil.a("KakaActivitySupport", "turn off check reminder");
        a(false);
        healthSwitchButton.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z) {
        int i;
        String str;
        ThreadPoolManager.c().execute(new Runnable() { // from class: oyp.2
            @Override // java.lang.Runnable
            public void run() {
                ioi ioiVar = oyp.this.j;
                boolean z2 = z;
                ioiVar.e(403, z2, String.valueOf(403), new d(oyp.this, z2));
            }
        });
        if (z) {
            pap.c();
            i = R.string.IDS_kaka_reminder_opened;
            str = "1";
        } else {
            pap.d();
            i = R.string.IDS_kaka_reminder_closed;
            str = "-1";
        }
        d(1000, this.f44982c.getString(i));
        HashMap map = new HashMap(2);
        map.put("type", str);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.KAKA_REMINDER_STATUS_CHANGE_1100048.value(), map, 0);
        LogUtil.a("KakaActivitySupport", "changeReminderStatus isChecked = ", Boolean.valueOf(z));
    }

    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f44986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<oyp> f44987c;

        d(oyp oypVar, boolean z) {
            this.f44987c = new WeakReference<>(oypVar);
            this.f44986b = z;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            oyp oypVar = this.f44987c.get();
            if (oypVar == null) {
                LogUtil.j("KakaActivitySupport", "healthKitActivity = null");
                return;
            }
            LogUtil.a("KakaActivitySupport", "MyReminderChangeCallback onResponse errorCode = ", Integer.valueOf(i));
            if (i == 0 || oypVar.d >= 3) {
                oypVar.d = 0;
                return;
            }
            ioi.d().e(403, this.f44986b, String.valueOf(403), this);
            oyp.a(oypVar);
            LogUtil.a("KakaActivitySupport", "retry update reminder status ", Integer.valueOf(oypVar.d));
        }
    }
}
