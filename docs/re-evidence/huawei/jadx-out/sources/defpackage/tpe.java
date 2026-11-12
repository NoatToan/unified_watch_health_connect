package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.main.stories.guide.interactors.GuideInteractors;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageResult;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes18.dex */
public class tpe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile tpe f49487a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f49488c = new Object();
    private BackLogCallback<Integer> h;
    private String i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f49489b = false;
    private WeakReference<CustomTextAlertDialog> d = null;
    public boolean e = false;
    private final BroadcastReceiver g = new BroadcastReceiver() { // from class: tpe.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            LogUtil.a("AccountSyncUtils", "mDeviceChangerBroadcastReceiver(): intent is ", intent.getAction());
            try {
                tpe.this.c(intent);
            } catch (ClassCastException unused) {
                health.compact.a.LogUtil.d("AccountSyncUtils", "ClassCastException");
            }
        }
    };
    private Handler j = new Handler(Looper.getMainLooper()) { // from class: tpe.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            LogUtil.a("AccountSyncUtils", "handleMessageWhenReferenceNotNull msg = ", message);
            ReleaseLogUtil.d("R_AccountSyncUtils", "what:", Integer.valueOf(message.what));
            switch (message.what) {
                case 300005:
                    break;
                case 300006:
                    tpe.this.a("MSG_TIMEOUT_SYNC_FAIL");
                    break;
                default:
                    LogUtil.j("AccountSyncUtils", "dealReportResult, default");
                    break;
            }
        }
    };
    private EventBus.ICallback f = new EventBus.ICallback() { // from class: tpe.2
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            if (dVar == null) {
                LogUtil.j("AccountSyncUtils", "event is null");
                return;
            }
            Bundle bundleB = dVar.b();
            if (bundleB == null) {
                LogUtil.j("AccountSyncUtils", "bundle is null");
                return;
            }
            if ("sign_account_hms_login_state_action".equals(dVar.e())) {
                if (tpe.this.j != null) {
                    tpe.this.j.removeMessages(300005);
                    tpe.this.j.removeMessages(300006);
                }
                String string = bundleB.getString("sign_account_hms_login_state_key");
                if (string == null) {
                    LogUtil.j("AccountSyncUtils", "state is null");
                    return;
                }
                if ("-1".equals(string)) {
                    LogUtil.j("AccountSyncUtils", "state is default");
                    tpe.this.a(2);
                    return;
                }
                if (!"1".equals(string) && tpe.this.j != null) {
                    tpe.this.j.sendEmptyMessageDelayed(300005, 2000L);
                    tpe.this.j();
                }
                tpe.this.a(lsk.a(string, 10));
                ReleaseLogUtil.d("R_AccountSyncUtils", "action  state is :", dVar.e(), string);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Intent intent) {
        LogUtil.a("AccountSyncUtils", "handleConnectStateChanged() Process.myPid():", Integer.valueOf(Process.myPid()));
        Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
        if (parcelableExtra instanceof DeviceInfo) {
            DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
            ReleaseLogUtil.d("R_AccountSyncUtils", "sendMsgConnectChange deviceName:", CommonUtil.n(deviceInfo.getDeviceName()), " Identify:", CommonUtil.n(deviceInfo.getDeviceIdentify()), " connectState:", Integer.valueOf(deviceInfo.getDeviceConnectState()));
            if (CommonUtil.x(BaseApplication.getContext())) {
                LogUtil.a("AccountSyncUtils", "APP isBackground");
            } else {
                d(deviceInfo);
            }
        }
    }

    private void d(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityA == null || !deviceCapabilityA.isSupportSyncAccount()) {
            ReleaseLogUtil.e("R_AccountSyncUtils", "updateAccountSyncState not support isSupportSyncAccount");
            return;
        }
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        ReleaseLogUtil.d("R_AccountSyncUtils", "updateAccountSyncState state = ", Integer.valueOf(deviceConnectState), ", isSyncingAccount = ", Boolean.valueOf(this.e));
        if (!this.e || deviceConnectState == 2) {
            return;
        }
        a(1);
    }

    public static tpe b() {
        tpe tpeVar;
        synchronized (f49488c) {
            if (f49487a == null) {
                f49487a = new tpe();
            }
            tpeVar = f49487a;
        }
        return tpeVar;
    }

    public void e(boolean z) {
        this.f49489b = z;
    }

    public void d(String str) {
        this.i = str;
    }

    public void d(BackLogCallback<Integer> backLogCallback) {
        this.h = backLogCallback;
    }

    private tpe() {
    }

    public void e() {
        a();
        ReleaseLogUtil.d("R_AccountSyncUtils", "startAccountSync mIsSyncingAccount = ", Boolean.valueOf(this.e));
        if (this.e) {
            qpx.b(BaseApplication.getContext(), R.string.IDS_loading_sync_account);
            return;
        }
        if (!h()) {
            n();
            return;
        }
        f();
        Activity activity = BaseApplication.getActivity();
        if (activity != null) {
            tqp.e(activity, this.g, 800, "com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        }
    }

    private boolean h() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10005), "KEY_SHOW_SYNC_ACCOUNT_ARK_UI_ON_REMINDERS_FLAG".concat(this.i));
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10005), "KEY_SHOW_SYNC_ACCOUNT_ON_HOME_ACTIVITY_FLAG".concat(this.i));
        ReleaseLogUtil.d("R_AccountSyncUtils", "accountSyncValue:", strE, ",accountFlagValue:", strE2);
        if (TextUtils.isEmpty(strE) && TextUtils.isEmpty(strE2)) {
            return true;
        }
        if (TextUtils.isEmpty(strE)) {
            return "true".equals(strE2);
        }
        return "UNCOMPLETE".equals(strE);
    }

    public boolean a(Context context, String str) {
        LogUtil.a("AccountSyncUtils", "isShowSyncAccountFlagInSharePreference enter");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10008), "currentIsNoCloud");
        LogUtil.a("AccountSyncUtils", "isNoCloudToWithCloud:", strE);
        if ("1".equals(strE)) {
            LogUtil.a("AccountSyncUtils", "this is noCloud with cloud scenes");
            SharedPreferenceManager.e(context, Integer.toString(10008), "currentIsNoCloud", "0", null);
            return true;
        }
        HiUserPreference userPreference = HiHealthManager.d(context).getUserPreference("sync_account_dialog_mark");
        if (userPreference != null) {
            String value = userPreference.getValue();
            LogUtil.a("AccountSyncUtils", "getValueFromDevice:", value);
            if ("1".equals(value)) {
                LogUtil.a("AccountSyncUtils", "getValueFromDevice scenes");
                return true;
            }
        } else {
            LogUtil.a("AccountSyncUtils", "userPreference is null");
        }
        String strE2 = SharedPreferenceManager.e(context, String.valueOf(10005), "KEY_SHOW_SYNC_ACCOUNT_ARK_UI_ON_REMINDERS_FLAG".concat(str));
        String strE3 = SharedPreferenceManager.e(context, String.valueOf(10005), "KEY_SHOW_SYNC_ACCOUNT_ON_HOME_ACTIVITY_FLAG".concat(str));
        ReleaseLogUtil.d("R_AccountSyncUtils", "accountSyncValue:", strE2, ",accountFlagValue:", strE3);
        if (TextUtils.isEmpty(strE2)) {
            return "true".equals(strE3);
        }
        return "UNCOMPLETE".equals(strE2);
    }

    private void e(final BaseResponseCallback<String> baseResponseCallback) {
        ThreadPoolManager.c().a("getAccountPlainTextInfo", new Runnable() { // from class: tpj
            @Override // java.lang.Runnable
            public final void run() {
                this.f49498a.c(baseResponseCallback);
            }
        });
    }

    /* synthetic */ void c(BaseResponseCallback baseResponseCallback) {
        final String[] strArr = {""};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1001, new StorageDataCallback() { // from class: tpe.1
            @Override // com.huawei.hwdataaccessmodel.utils.StorageDataCallback
            public void onProcessed(StorageResult storageResult) {
                if (storageResult.b() == 0) {
                    strArr[0] = String.valueOf(storageResult.c());
                } else {
                    LogUtil.j("AccountSyncUtils", "getAccountInfo getErrorCode:", Integer.valueOf(storageResult.b()));
                }
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(3L, TimeUnit.SECONDS)) {
                ReleaseLogUtil.e("R_AccountSyncUtils", "getAccountPlainTextInfo timeout");
            }
        } catch (InterruptedException unused) {
            ReleaseLogUtil.e("R_AccountSyncUtils", "getAccountPlainTextInfo InterruptedException");
        }
        baseResponseCallback.onResponse(0, strArr[0]);
    }

    private void f() {
        final Context contextB = com.huawei.haf.application.BaseApplication.b();
        final Activity activityJ = com.huawei.haf.application.BaseApplication.j();
        if (contextB == null || activityJ == null) {
            a("showSyncAccountDialog first");
            return;
        }
        LogUtil.a("AccountSyncUtils", 1, "AccountSyncUtils", "enter showSyncAccountDialog()");
        if (!Utils.h()) {
            ReleaseLogUtil.d("R_AccountSyncUtils", "showSyncAccountDialog no cloud empty account");
            lvj.c().b(2);
        } else {
            e(new BaseResponseCallback() { // from class: tpo
                @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f49504b.c(activityJ, contextB, i, (String) obj);
                }
            });
        }
    }

    /* synthetic */ void c(final Activity activity, final Context context, int i, final String str) {
        LogUtil.a("AccountSyncUtils", "getAccountPlainTextInfo errorCode:", Integer.valueOf(i));
        activity.runOnUiThread(new Runnable() { // from class: tpm
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b(activity, str, context);
            }
        });
    }

    /* synthetic */ void b(Activity activity, String str, Context context) {
        if (activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("AccountSyncUtils", "showSyncAccountDialog accountName is null");
            a("accountName empty");
            return;
        }
        String strC = tqo.c(str);
        boolean zMatches = Pattern.compile("^([0-9]|(\\+))\\d+$").matcher(str).matches();
        if ((LanguageUtil.z(context) || LanguageUtil.x(context)) && zMatches) {
            LogUtil.a("AccountSyncUtils", "enter isUrduLanguage or isFarsiLanguage");
            String strSubstring = strC.substring(0, 3);
            String strSubstring2 = strC.substring(strC.length() - 2, strC.length());
            StringBuilder sb = new StringBuilder(16);
            sb.append(strC);
            sb.replace(0, 3, strSubstring2);
            sb.replace(sb.length() - 3, sb.length(), strSubstring);
            LogUtil.a("AccountSyncUtils", "stringBuilder:", sb.toString());
            strC = sb.toString();
        }
        g();
        e(strC);
    }

    private void e(String str) {
        Context contextB = com.huawei.haf.application.BaseApplication.b();
        Activity activityJ = com.huawei.haf.application.BaseApplication.j();
        if (contextB == null || activityJ == null) {
            a("createAccountDialog");
            return;
        }
        String str2 = String.format(Locale.ENGLISH, contextB.getString(R.string.IDS_device_wear_home_sync_account_content), str);
        if (qrs.ah(BaseApplication.getContext())) {
            str2 = String.format(Locale.ENGLISH, contextB.getString(R.string.IDS_sync_account_content_pad), str);
        }
        final GuideInteractors guideInteractors = new GuideInteractors(contextB);
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(activityJ).a(R.string.IDS_device_wear_home_sync_account_title).a(str2).a(R.string.IDS_device_wear_home_confirm_sync_account, new View.OnClickListener() { // from class: tpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49497b.a(guideInteractors, view);
            }
        }).e(R.string.IDS_device_wear_home_skip_sync_account, new View.OnClickListener() { // from class: tpk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49499c.d(guideInteractors, view);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        this.d = new WeakReference<>(customTextAlertDialogB);
        b(activityJ);
    }

    /* synthetic */ void a(GuideInteractors guideInteractors, View view) {
        d(guideInteractors);
    }

    /* synthetic */ void d(GuideInteractors guideInteractors, View view) {
        ReleaseLogUtil.d("R_AccountSyncUtils", "showSyncAccountDialog skip click");
        j();
        guideInteractors.c(this.i, false);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10005), "KEY_SHOW_SYNC_ACCOUNT_ARK_UI_ON_REMINDERS_FLAG".concat(this.i), "UNCOMPLETE", null);
        a("skip");
        lvj.c().b(0);
    }

    private void d(GuideInteractors guideInteractors) {
        ReleaseLogUtil.d("R_AccountSyncUtils", "showSyncAccountDialog sync click");
        guideInteractors.c(this.i, false);
        j();
        if (!b(this.i) || !CommonUtil.ab(BaseApplication.getContext())) {
            a("syncAccount");
            qpx.b(BaseApplication.getContext(), R.string.IDS_sync_account_fail);
            return;
        }
        lvj.c().b(1);
        this.e = true;
        Handler handler = this.j;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(300006, 180000L);
        }
    }

    private boolean b(String str) {
        if (BluetoothAdapter.getDefaultAdapter() == null) {
            LogUtil.j("AccountSyncUtils", 1, "AccountSyncUtils", "BluetoothAdapter is null.");
            return false;
        }
        if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.a("AccountSyncUtils", 1, "AccountSyncUtils", "Bluetooth is not enabled or cannot be used.");
            return false;
        }
        DeviceInfo deviceInfoB = mgg.b(str, "AccountSyncUtils");
        if (deviceInfoB != null) {
            return deviceInfoB.getDeviceConnectState() == 2;
        }
        LogUtil.j("AccountSyncUtils", 1, "AccountSyncUtils", "currentDeviceInfo is null.");
        return false;
    }

    public void c() {
        ReleaseLogUtil.e("R_AccountSyncUtils", "ACCOUNT LOGIN_STATE unSubscribe");
        EventBus.ICallback iCallback = this.f;
        if (iCallback != null) {
            EventBus.a(iCallback, "sign_account_hms_login_state_action");
        }
        Activity activityJ = com.huawei.haf.application.BaseApplication.j();
        if (activityJ != null) {
            tqp.d(activityJ, this.g);
        }
    }

    public void a() {
        ReleaseLogUtil.d("R_AccountSyncUtils", "ACCOUNT LOGIN_STATE subscribe");
        EventBus.ICallback iCallback = this.f;
        if (iCallback != null) {
            EventBus.b(iCallback, 1, "sign_account_hms_login_state_action");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        boolean z = i == 2;
        this.e = z;
        ReleaseLogUtil.d("R_AccountSyncUtils", "showSyncCard mIsSyncingAccount = ", Boolean.valueOf(z), ", state = ", Integer.valueOf(i));
        if (i == 0) {
            n();
        } else if (i == 1) {
            i();
        } else if (i != 2) {
            LogUtil.j("AccountSyncUtils", "accountStateChange state default");
        }
    }

    private void n() {
        a("syncSuccess");
        qpx.b(BaseApplication.getContext(), R.string.IDS_sync_account_success);
    }

    private void i() {
        a("syncFail");
        HandlerExecutor.c(new Runnable() { // from class: tpi
            @Override // java.lang.Runnable
            public final void run() {
                qpx.b(BaseApplication.getContext(), R.string.IDS_sync_account_fail);
            }
        }, 100L);
    }

    public void a(String str) {
        ReleaseLogUtil.d("R_AccountSyncUtils", "function :", str);
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        j();
        c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        HandlerExecutor.a().post(new Runnable() { // from class: tph
            @Override // java.lang.Runnable
            public final void run() {
                this.e.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        WeakReference<CustomTextAlertDialog> weakReference = this.d;
        if (weakReference == null) {
            LogUtil.a("AccountSyncUtils", "dismissSyncAccountDialog dialogRef  is null");
            return;
        }
        CustomTextAlertDialog customTextAlertDialog = weakReference.get();
        if (customTextAlertDialog == null) {
            LogUtil.a("AccountSyncUtils", " dismissSyncAccountDialog syncAccountDialog is null ");
            return;
        }
        if (customTextAlertDialog.isShowing()) {
            try {
                customTextAlertDialog.dismiss();
            } catch (Exception e) {
                LogUtil.e("AccountSyncUtils", "dismissSyncAccountDialog e:", e);
            }
        }
        this.d.clear();
        this.d = null;
    }

    private void b(Activity activity) {
        if (this.d == null) {
            LogUtil.a("AccountSyncUtils", "showAccountDialog dialogRef  is null");
            return;
        }
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.a("AccountSyncUtils", "showAccountDialog activity is null or not running");
            return;
        }
        CustomTextAlertDialog customTextAlertDialog = this.d.get();
        if (customTextAlertDialog == null) {
            LogUtil.a("AccountSyncUtils", " showAccountDialog syncAccountDialog is null ");
        } else {
            if (customTextAlertDialog.isShowing()) {
                return;
            }
            customTextAlertDialog.show();
        }
    }

    public void c(String str) {
        if (!this.f49489b || this.h == null) {
            return;
        }
        LogUtil.a("AccountSyncUtils", "updateArkUi");
        if ("skip".equals(str)) {
            this.h.onSuccess(1);
        } else if ("syncSuccess".equals(str)) {
            this.h.onSuccess(0);
        } else {
            this.h.onFailure(-1, str);
        }
        this.f49489b = false;
    }
}
