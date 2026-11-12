package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.fullscenarioservice.pluginwearota.callback.InitCallback;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwcrowdtestapi.HealthFeedbackCallback;
import com.huawei.hwcrowdtestapi.HealthFeedbackParams;
import com.huawei.hwdevice.mainprocess.callback.NotifyPhoneServiceCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxUploadCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.h5pro.jsmodules.DeviceHiCare;
import com.huawei.operation.h5pro.jsmodules.JsInteractionCompact;
import com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService;
import com.huawei.operation.utils.HelpCustomerOperate;
import com.huawei.operation.utils.OnlineImUtil;
import com.huawei.sim.multisim.constants.BrandType;
import com.huawei.sim.multisim.constants.CarrierType;
import com.huawei.sim.multisim.constants.EsimType;
import com.huawei.sim.strategy.EsimCarrierStrategy;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.device.activity.update.UpdateVersionActivity;
import com.huawei.ui.device.interactors.UploadMaintLogInteractor;
import com.huawei.ui.device.utlis.FindNetworkUtils;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.aw70.Aw70ModeSelectActivity;
import com.huawei.ui.homewear21.home.WearHomeDeviceInfoActivity;
import com.huawei.ui.homewear21.home.WearHomeOldActivity;
import com.huawei.ui.homewear21.home.WearHomeOtherSettingActivity;
import com.huawei.ui.homewear21.home.action.WearWalletFactoryUtil;
import com.huawei.ui.main.stories.me.adapter.AdapterWithBottomView;
import com.huawei.up.utils.ErrorCode;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes18.dex */
public class tjc {
    private Boolean ab;
    private boolean ad;
    private RelativeLayout ae;
    private CommonDialog21 ag;
    private HealthRadioButton ah;
    private HealthRadioButton ai;
    private String ak;
    private RelativeLayout al;
    private CustomTextAlertDialog am;
    private String an;
    private UploadMaintLogInteractor ap;
    private CustomAlertDialog aq;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTextAlertDialog f49206b;
    private WearHomeOldActivity d;
    private CustomProgressDialog f;
    private CustomAlertDialog g;
    private Context h;
    private CustomProgressDialog.Builder i;
    private CustomProgressDialog j;
    private CustomTextAlertDialog k;
    private CustomTextAlertDialog l;
    private CustomTextAlertDialog m;
    private CustomProgressDialog.Builder o;
    private CustomViewDialog q;
    private CustomViewDialog r;
    private HealthTextView y;
    private CommonDialog21 z;
    private volatile boolean u = false;
    private volatile boolean x = false;
    private volatile boolean w = false;
    private volatile boolean v = false;
    private volatile boolean aa = false;
    private boolean ac = false;
    private volatile String s = "";
    private volatile int t = -1;
    private int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f49205a = false;
    private final DeviceDfxUploadCallback aj = new DeviceDfxUploadCallback() { // from class: tjc.2
        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxUploadCallback
        public void startUpload(double d) {
            LogUtil.a("WearHomeGeneralAction", "startUpload is ", Double.valueOf(d));
            tjc.this.b();
            String string = tjc.this.d.getString(R.string.IDS_device_log_upload_tips, new Object[]{UnitUtil.e((d / 1024.0d) / 1024.0d, 1, 2)});
            LogUtil.a("WearHomeGeneralAction", "startUpload string is ", string);
            if (tjc.this.d.d() != null) {
                Message messageObtainMessage = tjc.this.d.d().obtainMessage();
                messageObtainMessage.what = 1024;
                messageObtainMessage.obj = string;
                tjc.this.d.d().sendMessage(messageObtainMessage);
                return;
            }
            LogUtil.j("WearHomeGeneralAction", "mHandler is null");
        }
    };
    private final DeviceDfxBaseResponseCallback n = new DeviceDfxBaseResponseCallback() { // from class: tjc.13
        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
        public void onSuccess(int i, String str) {
            if (i == 2) {
                LogUtil.j("WearHomeGeneralAction", "start logging.");
                return;
            }
            if (i == 10000 && TextUtils.equals(str, "5.10.12 cancel timeout 7 minutes")) {
                LogUtil.a("WearHomeGeneralAction", "cancel 5.10.12 timeout tip");
                tjc.this.d.d().removeMessages(1041);
                tjc.this.e(false);
                return;
            }
            ReleaseLogUtil.d("Dfx_WearHomeGeneralAction", "mDfxCallback onSuccess errorCode = ", Integer.valueOf(i));
            tjc tjcVar = tjc.this;
            tjcVar.e(tjcVar.j);
            SharedPreferenceManager.d(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", 0);
            tjc.this.v = true;
            tjc.this.x = false;
            if (tjc.this.d != null && tjc.this.d.d() != null) {
                tjc.this.d.d().postDelayed(new Runnable() { // from class: tjc.13.5
                    @Override // java.lang.Runnable
                    public void run() {
                        tjc.this.e(tjc.this.j);
                        if (!mjh.b(BaseApplication.getContext())) {
                            LogUtil.a("WearHomeGeneralAction", "wifi and network are all disconnected.");
                            tjc.this.ad();
                            return;
                        }
                        if (mjh.e(BaseApplication.getContext())) {
                            tjc.this.u = true;
                            tjc.this.ac = true;
                            mjh.d(false);
                            tjc.this.b();
                            if (!tjc.this.f()) {
                                LogUtil.a("WearHomeGeneralAction", "wifi upload 5.10.12 not timeout");
                                qpx.b(tjc.this.h, R.string.IDS_hw_toast_log_upload_background);
                            }
                            LogUtil.a("WearHomeGeneralAction", "start logging wifi upload");
                            lws.c(BaseApplication.getContext()).c(false, tjc.this.d.f26233a);
                            Message messageObtainMessage = tjc.this.d.d().obtainMessage();
                            messageObtainMessage.what = 1021;
                            tjc.this.d.d().sendMessageDelayed(messageObtainMessage, 600000L);
                            return;
                        }
                        if (!NetworkUtil.f()) {
                            LogUtil.a("WearHomeGeneralAction", "Mobile is also disconnected");
                            tjc.this.ad();
                        } else {
                            LogUtil.a("WearHomeGeneralAction", "wifi is dmIsConnected use network");
                            mjh.d(true);
                            lws.c(BaseApplication.getContext()).c(false, tjc.this.d.f26233a);
                            mjh.c(tjc.this.aj);
                        }
                    }
                }, 800L);
            } else {
                LogUtil.j("WearHomeGeneralAction", "catch null pointer exception");
            }
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.a("Dfx_WearHomeGeneralAction", "mDfxCallback onFailure errorCode = ", Integer.valueOf(i), ", errorMessage = ", str);
            tjc.this.c(i, str);
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
        public void onProgress(int i, String str) {
            if (!tjc.this.f()) {
                if (tjc.this.d == null || tjc.this.d.d() == null) {
                    return;
                }
                LogUtil.a("WearHomeGeneralAction", "update progress, progress: ", Integer.valueOf(i), ", progressDesc = ", str);
                if (!TextUtils.equals(str, tjc.this.s) || tjc.this.t != i) {
                    tjc.this.s = str;
                    tjc.this.t = i;
                    Message messageObtainMessage = tjc.this.d.d().obtainMessage();
                    messageObtainMessage.what = 1026;
                    messageObtainMessage.arg1 = i;
                    messageObtainMessage.obj = str;
                    tjc.this.d.d().sendMessage(messageObtainMessage);
                    return;
                }
                LogUtil.j("WearHomeGeneralAction", "mDfxCallback onProgress same file process ignore");
                return;
            }
            LogUtil.j("WearHomeGeneralAction", "mDfxCallback onProgress 5.10.12 already timeout");
        }
    };
    private final BroadcastReceiver af = new BroadcastReceiver() { // from class: tjc.20
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.j("WearHomeGeneralAction", "intent or intent.getAction is null");
                return;
            }
            LogUtil.a("WearHomeGeneralAction", "phone service Died onReceive intent ", intent.getAction());
            if ("com.huawei.health.action.ACTION_CALLBACKSERVICE_PHONESERVICE_DEAD".equals(intent.getAction())) {
                xjt.r("WearHomeGeneralAction, PhoneServiceDied broadcast: com.huawei.health.action.ACTION_CALLBACKSERVICE_PHONESERVICE_DEAD");
                if (SharedPreferenceManager.b(String.valueOf(10), "KEY_IS_CLICKED_BETA_FEEDBACK", false)) {
                    xjt.r("WearHomeGeneralAction, PhoneServiceDied CLICKED_BETA_FEEDBACK");
                    DeviceInfo deviceInfoE = tfn.a().e(tjc.this.d.f26233a);
                    if (deviceInfoE == null) {
                        ReleaseLogUtil.a("Dfx_WearHomeGeneralAction", "currentDeviceInfo == null");
                        tjc.this.b();
                        tjc tjcVar = tjc.this;
                        tjcVar.e(tjcVar.j);
                        SharedPreferenceManager.d(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", 0);
                        return;
                    }
                    int iC = SharedPreferenceManager.c(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", 0);
                    if (iC < 1) {
                        ReleaseLogUtil.d("Dfx_WearHomeGeneralAction", "retry time = 1");
                        if (tjc.this.aa) {
                            tjc.this.d(deviceInfoE);
                        } else {
                            tjc.this.z();
                        }
                        SharedPreferenceManager.d(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", iC + 1);
                        return;
                    }
                    ReleaseLogUtil.a("Dfx_WearHomeGeneralAction", "has reach retry time limit");
                    tjc.this.b();
                    tjc tjcVar2 = tjc.this;
                    tjcVar2.e(tjcVar2.j);
                    SharedPreferenceManager.d(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", 0);
                }
            }
        }
    };
    private final BroadcastReceiver as = new BroadcastReceiver() { // from class: tjc.18
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkInfo activeNetworkInfo;
            if (intent == null || intent.getAction() == null) {
                LogUtil.j("WearHomeGeneralAction", "intent or intent.getAction is null");
                return;
            }
            LogUtil.a("WearHomeGeneralAction", "mWifiBroadcastReceiver onReceive intent ", intent.getAction(), " isAgree ", Boolean.valueOf(mjh.d()));
            if (tjc.this.u && !tjc.this.d.isFinishing() && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                Object systemService = context.getSystemService("connectivity");
                if (systemService instanceof ConnectivityManager) {
                    LogUtil.a("WearHomeGeneralAction", "connectivity action");
                    activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                } else {
                    activeNetworkInfo = null;
                }
                if (activeNetworkInfo != null) {
                    tjc.this.e(activeNetworkInfo);
                    LogUtil.a("WearHomeGeneralAction", "info.getTypeName()", activeNetworkInfo.getTypeName());
                    return;
                }
                LogUtil.a("WearHomeGeneralAction", "has no network");
                tjc.this.u = false;
                tjc.this.ac = false;
                mjh.d(false);
                if (tjc.this.f()) {
                    return;
                }
                LogUtil.a("WearHomeGeneralAction", "has no network 5.10.12 not timeout");
                qpx.b(tjc.this.h, R.string.IDS_hw_toast_log_upload_failed);
            }
        }
    };
    private final BroadcastReceiver ar = new BroadcastReceiver() { // from class: tjc.23
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || tjc.this.x || !tjc.this.u) {
                LogUtil.j("WearHomeGeneralAction", "intent is null,mIsManualLog:", Boolean.valueOf(tjc.this.x), "mIsFeedBackShowToast:", Boolean.valueOf(tjc.this.u));
                return;
            }
            String action = intent.getAction();
            LogUtil.a("WearHomeGeneralAction", "mUploadLogResultBroadcastReceiver action：", action);
            if ("com.huawei.crowdtestsdk.LOG_UPLOAD_RESULT".equals(action)) {
                tjc.this.d.d().removeMessages(1021);
                int intExtra = intent.getIntExtra("logUploadResult", 1);
                LogUtil.a("WearHomeGeneralAction", "result：", Integer.valueOf(intExtra));
                if (intExtra != 16) {
                    tjc.this.e(intent);
                } else {
                    tjc.this.d.d().sendEmptyMessageDelayed(1022, 1000L);
                }
            }
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NotifyPhoneServiceCallback f49207c = new AnonymousClass21();
    private Handler p = new Handler(Looper.getMainLooper()) { // from class: tjc.25
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            LogUtil.a("WearHomeGeneralAction", "handleMessageWhenReferenceNotNull msg = ", message);
            switch (message.what) {
                case 100001:
                    tjc.this.d(false);
                    tjc.this.ai();
                    tjc.this.a(message.arg1);
                    break;
                case ErrorCode.HWID_IS_STOPED /* 100002 */:
                    tjc.this.d(false);
                    tjc.this.ai();
                    tjc.this.e(message.arg1);
                    break;
                case 100003:
                case AdapterWithBottomView.TYPE_BOTTOM /* 100005 */:
                    tjc.this.af();
                    tjc.this.d(false);
                    tjc.this.d.b(false);
                    tjc.this.f49205a = false;
                    tjc.this.aq();
                    break;
                case 100004:
                case 100006:
                default:
                    tjc.this.e(message);
                    break;
                case WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007 /* 100007 */:
                    tjc.this.d(false);
                    tjc.this.ai();
                    tjc.this.b(message.arg1);
                    break;
            }
        }
    };

    /* JADX INFO: renamed from: tjc$21, reason: invalid class name */
    class AnonymousClass21 implements NotifyPhoneServiceCallback {
        AnonymousClass21() {
        }

        @Override // com.huawei.hwdevice.mainprocess.callback.NotifyPhoneServiceCallback
        public void executeResponse(int i, final DeviceInfo deviceInfo, int i2, String str) {
            if (tjc.this.d == null) {
                LogUtil.j("WearHomeGeneralAction", "executeResponse mActivity == null ");
                return;
            }
            if (i == 0) {
                LogUtil.a("WearHomeGeneralAction", "executeResponse progress : ", Integer.valueOf(i2));
                if (i2 == 100) {
                    tjc.this.d.runOnUiThread(new Runnable() { // from class: tkj
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.d.d();
                        }
                    });
                    tjc.this.c(deviceInfo);
                    return;
                } else {
                    tjc.this.a(i2, false);
                    return;
                }
            }
            if (i == 1) {
                LogUtil.a("WearHomeGeneralAction", "executeResponse timeout");
                lvb.e().e("earphoneLogPre");
                tjc.this.d.runOnUiThread(new Runnable() { // from class: tko
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49298b.d(deviceInfo);
                    }
                });
            } else {
                LogUtil.j("WearHomeGeneralAction", "others");
                lvb.e().e("earphoneLogPre");
                tjc.this.g(deviceInfo);
            }
        }

        /* synthetic */ void d() {
            tjc tjcVar = tjc.this;
            tjcVar.e(tjcVar.f);
            SharedPreferenceManager.d(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", 0);
            lvb.e().e("earphoneLogPre");
        }

        /* synthetic */ void d(DeviceInfo deviceInfo) {
            tjc tjcVar = tjc.this;
            tjcVar.e(tjcVar.f);
            SharedPreferenceManager.d(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", 0);
            tjc.this.g(deviceInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        b();
        this.u = false;
        mjh.d(false);
        lws.c(BaseApplication.getContext()).c(false, this.d.f26233a);
        if (f()) {
            return;
        }
        LogUtil.a("WearHomeGeneralAction", "dealNetworkIsDisconnect 5.10.12 not timeout");
        qpx.b(this.h, R.string.IDS_hw_toast_log_upload_failed);
    }

    public tjc(Context context, WearHomeOldActivity wearHomeOldActivity) {
        this.ab = null;
        this.d = wearHomeOldActivity;
        this.h = context;
        this.ap = new UploadMaintLogInteractor(this.h.getApplicationContext());
        this.ab = Boolean.valueOf(Utils.k());
    }

    public void a(boolean z) {
        this.u = z;
    }

    public boolean d() {
        return this.u;
    }

    public boolean f() {
        return this.w;
    }

    public void e(boolean z) {
        this.w = z;
    }

    public void d(boolean z) {
        CommonDialog21 commonDialog21;
        if (z) {
            qpx.e(this.h, R.string.IDS_plugin_menu_reset_failed);
        }
        if (this.d.isFinishing() || (commonDialog21 = this.z) == null || !commonDialog21.isShowing()) {
            return;
        }
        this.z.cancel();
        this.z = null;
        LogUtil.a("WearHomeGeneralAction", 0, "WearHomeGeneralAction", "destroy mLoadingDialog21");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Intent intent) {
        String stringExtra = intent.getStringExtra("LogUploadFilePath");
        LogUtil.d("WearHomeGeneralAction", "file：", stringExtra);
        if (stringExtra != null) {
            this.ac = false;
            if (new File(mjh.f41743c + stringExtra).exists()) {
                LogUtil.d("WearHomeGeneralAction", "mUploadLogResultBroadcastReceiver log upload failed");
                this.d.d().post(new Runnable() { // from class: tjc.24
                    @Override // java.lang.Runnable
                    public void run() {
                        tjc.this.d.d().removeMessages(1022);
                        if (tjc.this.f()) {
                            return;
                        }
                        LogUtil.a("WearHomeGeneralAction", "dealWithLogUploadFail 5.10.12 not timeout");
                        qpx.b(tjc.this.h, R.string.IDS_hw_toast_log_upload_failed);
                    }
                });
                return;
            }
        }
        this.d.d().sendEmptyMessageDelayed(1022, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(NetworkInfo networkInfo) {
        boolean zB = PowerKitManager.a().b();
        if (!networkInfo.isConnected() || zB) {
            LogUtil.a("WearHomeGeneralAction", "network not connected ");
            this.u = false;
            mjh.d(false);
            if (f()) {
                return;
            }
            LogUtil.a("WearHomeGeneralAction", "dealWithLogUploadFail 5.10.12 not timeout");
            qpx.b(this.h, R.string.IDS_hw_toast_log_upload_failed);
            return;
        }
        if (networkInfo.getType() == 1) {
            LogUtil.a("WearHomeGeneralAction", "wifi available");
            return;
        }
        if (networkInfo.getType() == 0) {
            LogUtil.a("WearHomeGeneralAction", "mobile available");
            if (mjh.d()) {
                return;
            }
            this.u = false;
            this.ac = false;
            mjh.d(false);
            if (f()) {
                return;
            }
            LogUtil.a("WearHomeGeneralAction", "mobile available 5.10.12 not timeout");
            qpx.b(this.h, R.string.IDS_hw_toast_log_upload_failed);
            return;
        }
        LogUtil.j("WearHomeGeneralAction", "activeNetwork else");
    }

    public void i() {
        Intent intent = new Intent();
        intent.putExtra("device_id", this.d.f26233a);
        intent.setClass(this.h, WearHomeOtherSettingActivity.class);
        this.d.startActivity(intent);
        qrs.ae(this.h);
    }

    public void h() {
        Intent intent = new Intent();
        intent.putExtra("device_id", this.d.f26233a);
        intent.setClass(this.h, WearHomeDeviceInfoActivity.class);
        this.d.startActivity(intent);
    }

    public void t() {
        LogUtil.a("WearHomeGeneralAction", "start AW70ModeSelectActivity");
        rdt.e();
        this.d.a(Aw70ModeSelectActivity.class, 36);
    }

    public void r() {
        WearHomeOldActivity wearHomeOldActivity = this.d;
        wearHomeOldActivity.e = wearHomeOldActivity.f26234b.e(this.d.f26233a);
        if (this.d.e != null && this.d.e.isSupportEsim()) {
            a(R.string.IDS_settings_restore_factory_settings_progerssdialog_msg, 2000);
            npz.b().t();
            npz.b().d(this.p);
            return;
        }
        av();
    }

    private void av() {
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010033.value(), new HashMap(16), 0);
        LogUtil.a("WearHomeGeneralAction", 1, "WearHomeGeneralAction", "enter showRestoreFactoryDialog()");
        this.d.d = tfn.a().e(this.d.f26233a);
        if (this.d.d == null) {
            return;
        }
        WearHomeOldActivity wearHomeOldActivity = this.d;
        wearHomeOldActivity.f26233a = wearHomeOldActivity.d.getDeviceIdentify();
        int productType = this.d.d.getProductType();
        LogUtil.a("WearHomeGeneralAction", 0, "WearHomeGeneralAction", "currentDeviceType is ", Integer.valueOf(productType));
        WearHomeOldActivity wearHomeOldActivity2 = this.d;
        String strA = tqp.a(wearHomeOldActivity2, wearHomeOldActivity2.f26233a);
        String string = this.d.getString(R.string.IDS_settings_restore_factory_prompt, new Object[]{strA});
        if (!TextUtils.isEmpty(this.d.d.getDeviceName()) && productType == 11 && this.d.d.getDeviceName().contains("HUAWEI CM-R1P")) {
            LogUtil.a("WearHomeGeneralAction", "Entering All device names");
            string = this.d.getString(R.string.IDS_settings_restore_factory_prompt, new Object[]{this.d.getString(R.string.IDS_huawei_r1_pro_content)});
        }
        WearHomeOldActivity wearHomeOldActivity3 = this.d;
        wearHomeOldActivity3.e = wearHomeOldActivity3.f26234b.e(this.d.f26233a);
        if (this.g == null && this.d.e != null && this.d.e.isSupportEsim() && npz.b().h().e) {
            LogUtil.a("WearHomeGeneralAction", "Entering ResetFactoryGalileoDialog Galileo");
            a(strA);
        } else {
            LogUtil.a("WearHomeGeneralAction", "Entering setResetFactoryDialog");
            e(string);
        }
    }

    private void a(String str) {
        View viewInflate = View.inflate(this.h, R.layout.dialog_galileo_reset_factory_rule, null);
        a(str, viewInflate);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.reminder_button_all_restores);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.reminder_button_reserved_esim);
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.reminder_button_cancel);
        healthTextView.setTextSize(1, 16.0f);
        healthTextView2.setTextSize(1, 16.0f);
        healthTextView3.setTextSize(1, 16.0f);
        this.d.m();
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.d);
        builder.a(viewInflate);
        healthTextView.setOnClickListener(an());
        healthTextView2.setOnClickListener(ap());
        healthTextView3.setOnClickListener(ay());
        CustomAlertDialog customAlertDialogB = builder.b();
        this.g = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        this.g.show();
        this.f49205a = false;
    }

    private View.OnClickListener ay() {
        return new View.OnClickListener() { // from class: tjt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49244a.s(view);
            }
        };
    }

    /* synthetic */ void s(View view) {
        LogUtil.a("WearHomeGeneralAction", "setResetFactoryGalileoDialog cancel");
        this.g.dismiss();
        this.g = null;
    }

    private View.OnClickListener ap() {
        return new View.OnClickListener() { // from class: tka
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49250b.h(view);
            }
        };
    }

    /* synthetic */ void h(View view) {
        LogUtil.a("WearHomeGeneralAction", "setResetFactoryGalileoDialog Retain Esim Card");
        rdt.c(1);
        this.g.dismiss();
        this.g = null;
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.a("WearHomeGeneralAction", "setResetFactoryGalileoDialog Retain Esim Card Bluetooth Disconnected");
            qpx.e(this.h, R.string.IDS_hw_health_music_check_bluetooth_connection);
        } else {
            d(new Consumer() { // from class: tkg
                @Override // com.huawei.framework.servicemgr.Consumer
                public final void accept(Object obj) {
                    this.f49258b.c((Boolean) obj);
                }
            });
        }
    }

    /* synthetic */ void c(Boolean bool) {
        if (bool.booleanValue()) {
            a(R.string.IDS_settings_restore_factory_settings_progerssdialog_msg, 2000);
            bb();
            this.d.f26234b.a(this.d.f26233a, this.d.d(), true);
        }
    }

    private View.OnClickListener an() {
        return new View.OnClickListener() { // from class: tjm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49237c.f(view);
            }
        };
    }

    /* synthetic */ void f(View view) {
        LogUtil.a("WearHomeGeneralAction", "setResetFactoryGalileoDialog All Resume Response Events");
        rdt.c(1);
        this.g.dismiss();
        this.g = null;
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.a("WearHomeGeneralAction", "setResetFactoryGalileoDialog Recover All Bluetooth Disconnected");
            qpx.e(this.h, R.string.IDS_hw_health_music_check_bluetooth_connection);
        } else {
            d(new Consumer() { // from class: tjo
                @Override // com.huawei.framework.servicemgr.Consumer
                public final void accept(Object obj) {
                    this.e.e((Boolean) obj);
                }
            });
        }
    }

    /* synthetic */ void e(Boolean bool) {
        LogUtil.a("WearHomeGeneralAction", "continueRestore : ", bool);
        if (bool.booleanValue()) {
            pxk.m(this.h);
            oeh oehVarH = npz.b().h();
            if (oehVarH.f44234c != null && pxk.b(oehVarH.f44233b, oehVarH.f44232a)) {
                LogUtil.a("WearHomeGeneralAction", " show dialog for cucc esim logout ");
                at();
            } else if (oehVarH.f44234c != null && pxk.h(oehVarH.f44233b) && pxk.c(oehVarH.f44232a)) {
                ar();
            } else {
                a(R.string.IDS_settings_restore_factory_settings_progerssdialog_msg, 2000);
                ak();
            }
        }
    }

    private void ar() {
        LogUtil.a("WearHomeGeneralAction", "enter showDeleteEsimDialog()");
        String string = this.h.getResources().getString(com.huawei.sim.R.string.IDS_delete_esim_dialog_text);
        String string2 = this.h.getResources().getString(com.huawei.sim.R.string.IDS_plugin_sim_esim_button_cannel);
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.d).a(com.huawei.sim.R.string.IDS_delete_esim_dialog_title).a(string).a(string2, new View.OnClickListener() { // from class: tjz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.j("WearHomeGeneralAction", "press cancel button");
            }
        }).b(this.h.getResources().getString(com.huawei.sim.R.string.IDS_plugin_sim_esim_button_delete), new View.OnClickListener() { // from class: tke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49256c.l(view);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    /* synthetic */ void l(View view) {
        a(R.string.IDS_settings_restore_factory_settings_progerssdialog_msg, 2000);
        ak();
    }

    private void ak() {
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.a("WearHomeGeneralAction", "setResetFactoryGalileoDialog Recover All Bluetooth Disconnected");
            qpx.e(this.h, R.string.IDS_hw_health_music_check_bluetooth_connection);
        } else {
            bb();
            this.d.f26234b.a(this.d.f26233a, this.d.d(), false);
        }
    }

    private void at() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.h);
        builder.a(this.h.getResources().getString(com.huawei.sim.R.string.IDS_restore_factory_esim_logout));
        builder.a(this.h.getResources().getString(com.huawei.sim.R.string.IDS_plugin_sim_esim_logout_ok), new View.OnClickListener() { // from class: tjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.q(view);
            }
        }).d(this.h.getResources().getString(com.huawei.sim.R.string.IDS_device_wear_home_skip_sync_account).toUpperCase(), new View.OnClickListener() { // from class: tjr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49242c.p(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* synthetic */ void q(View view) {
        LogUtil.a("WearHomeGeneralAction", "press Positive button go cancel esim");
        am();
    }

    /* synthetic */ void p(View view) {
        LogUtil.a("WearHomeGeneralAction", "press Negative button");
        ak();
    }

    private void am() {
        final String[] strArr;
        if (Build.VERSION.SDK_INT > 29) {
            strArr = new String[]{"android.permission.READ_PHONE_NUMBERS"};
        } else {
            strArr = new String[]{"android.permission.READ_PHONE_STATE"};
        }
        if (!lsg.d(this.h, strArr)) {
            LogUtil.j("WearHomeGeneralAction", "no permission, need to request");
            xjt.q("no permission, need to request.");
            lsg.a(this.d, strArr, new PermissionsResultAction() { // from class: tjc.22
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("WearHomeGeneralAction", "PermissionsResultAction onGranted: ", strArr[0]);
                    tjc.this.ax();
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    LogUtil.j("WearHomeGeneralAction", "PermissionsResultAction onDenied: ", str);
                }
            });
        } else {
            LogUtil.a("WearHomeGeneralAction", "have permissions: ", strArr);
            ax();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ax() {
        pxk.m(this.h);
        if (pxk.h(pxk.b())) {
            this.e = 0;
        } else if (pxk.h(pxk.c())) {
            this.e = 1;
        } else {
            aq();
            return;
        }
        pxn.e().a(CarrierType.CUCC, EsimType.ONE_NUMBER_MULTISIM, CommonUtil.bg() ? BrandType.HUAWEI : BrandType.THIRD);
        EsimCarrierStrategy esimCarrierStrategyB = pxn.e().b(this.h, this.p);
        pxp pxpVar = new pxp();
        pxpVar.i = this.e;
        pxpVar.h = this.e == 0 ? pxk.b() : pxk.c();
        pxpVar.m = new Runnable() { // from class: tjv
            @Override // java.lang.Runnable
            public final void run() {
                this.d.o();
            }
        };
        esimCarrierStrategyB.setRequest(pxpVar);
        esimCarrierStrategyB.authenticate();
    }

    /* synthetic */ void o() {
        a(R.string.sug_his_loading_more, 2000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq() {
        WearHomeOldActivity wearHomeOldActivity = this.d;
        e(this.d.getString(R.string.IDS_settings_restore_factory_prompt, new Object[]{tqp.a(wearHomeOldActivity, wearHomeOldActivity.f26233a)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        int i = message.what;
        if (i != 100006) {
            switch (i) {
                case 33002:
                    ai();
                    npz.b().d(this.p);
                    break;
                case 33003:
                case 33004:
                    this.p.removeMessages(33004);
                    d(false);
                    ai();
                    npz.b().c((IBaseResponseCallback) null);
                    av();
                    break;
                case 33005:
                    break;
                case 33006:
                    d(false);
                    ai();
                    npz.b().c((IBaseResponseCallback) null);
                    Context context = this.h;
                    qpx.e(context, context.getString(com.huawei.sim.R.string.IDS_card_status_error_tips));
                    av();
                    break;
                default:
                    ReleaseLogUtil.e("WearHomeGeneralAction", "unrecognized message");
                    break;
            }
            return;
        }
        d(false);
        ai();
        npz.b().c((IBaseResponseCallback) null);
        Context context2 = this.h;
        qpx.e(context2, context2.getString(com.huawei.sim.R.string.IDS_plugin_device_info_fail));
        av();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        LogUtil.a("WearHomeGeneralAction", "queryMultiSimServiceStatus result = ", Integer.valueOf(i));
        if (i == 1000) {
            pxn.e().b(this.h, this.p).getEsimStatus();
            return;
        }
        this.f49205a = false;
        this.d.b(false);
        aq();
        ReleaseLogUtil.a("WearHomeGeneralAction", "auth fail: ", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        LogUtil.a("WearHomeGeneralAction", "handleOpenResult: ", Integer.valueOf(i));
        if (i == 0) {
            this.f49205a = true;
            HandlerExecutor.b(new Runnable() { // from class: tkf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49257c.j();
                }
            });
        } else {
            this.d.b(false);
            Context context = this.h;
            qpx.e(context, context.getResources().getString(com.huawei.sim.R.string.IDS_oversea_es_load_fail));
        }
    }

    /* synthetic */ void j() {
        a(R.string.sug_his_loading_more, 2000);
    }

    public void m() {
        if (this.f49205a) {
            ReleaseLogUtil.d("WearHomeGeneralAction", "onResumeAuth hasEnteredEsimAccountMgmt, get esim open result again");
            ai();
            pxn.e().b(this.h, this.p).getEsimStatus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        ReleaseLogUtil.d("WearHomeGeneralAction", "handleQueryResult code = ", Integer.valueOf(i), ", hasEnteredEsimAccountMgmt : ", Boolean.valueOf(this.f49205a));
        if (i == 1000) {
            this.f49205a = false;
            oeh oehVarH = npz.b().h();
            if (CommonUtil.bg() && pxk.h(oehVarH.f44233b) && this.e == 0 && pxk.b(oehVarH.f44232a) && pxk.h(pxk.b()) && pxk.h(pxk.c())) {
                this.e = 1;
                EsimCarrierStrategy esimCarrierStrategyB = pxn.e().b(this.h, this.p);
                pxp pxpVar = new pxp();
                pxpVar.i = this.e;
                pxpVar.h = pxk.c();
                pxpVar.m = new Runnable() { // from class: tju
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49245c.n();
                    }
                };
                esimCarrierStrategyB.setRequest(pxpVar);
                esimCarrierStrategyB.authenticate();
                return;
            }
            this.d.b(false);
            pxk.d(this.h, this.d.getString(R.string.IDS_settings_restore_factory_settings), new View.OnClickListener() { // from class: tjs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49243a.j(view);
                }
            });
            return;
        }
        if (!this.f49205a && (i == 1200 || i == -1011)) {
            pxn.e().b(this.h, this.p).deactivateEsim();
            return;
        }
        this.f49205a = false;
        this.d.b(false);
        aq();
    }

    /* synthetic */ void n() {
        a(R.string.sug_his_loading_more, 2000);
    }

    /* synthetic */ void j(View view) {
        LogUtil.a("WearHomeGeneralAction", "press Positive button");
        ak();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        LogUtil.a("WearHomeGeneralAction", "removeTimeOutMessage");
        Handler handler = this.p;
        if (handler != null && handler.hasMessages(100003)) {
            this.p.removeMessages(100003);
        }
        Handler handler2 = this.p;
        if (handler2 != null && handler2.hasMessages(100006)) {
            this.p.removeMessages(100006);
        }
        Handler handler3 = this.p;
        if (handler3 == null || !handler3.hasMessages(AdapterWithBottomView.TYPE_BOTTOM)) {
            return;
        }
        this.p.removeMessages(AdapterWithBottomView.TYPE_BOTTOM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void af() {
        LogUtil.a("WearHomeGeneralAction", "removeAllMessage");
        ai();
        Handler handler = this.p;
        if (handler != null) {
            handler.removeMessages(100001);
            this.p.removeMessages(ErrorCode.HWID_IS_STOPED);
            this.p.removeMessages(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
        }
    }

    private void a(String str, View view) {
        ((HealthTextView) view.findViewById(R.id.reminder_dialog_title)).setText(R.string.IDS_settings_restore_factory_settings);
        ((HealthTextView) view.findViewById(R.id.reminder_device_content_one)).setText(this.h.getResources().getString(R.string.IDS_reset_factory_content_one, str));
        ((HealthTextView) view.findViewById(R.id.reminder_device_content_two)).setText(R.string.IDS_reset_factory_content_two);
        ((HealthTextView) view.findViewById(R.id.reminder_device_content_three)).setText(R.string.IDS_reset_factory_content_three);
    }

    private void e(String str) {
        LogUtil.a("WearHomeGeneralAction", "enter setResetFactoryDialog()");
        CustomTextAlertDialog.Builder builderE = new CustomTextAlertDialog.Builder(this.h).a(R.string.IDS_settings_restore_factory_settings).a(str).a(R.string.IDS_plugin_menu_reset, new View.OnClickListener() { // from class: tjq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49241c.o(view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: tjn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("WearHomeGeneralAction", "showLoginFail cancel click");
            }
        });
        try {
            try {
                CustomTextAlertDialog customTextAlertDialog = this.am;
                if (customTextAlertDialog != null) {
                    customTextAlertDialog.dismiss();
                }
            } catch (IllegalArgumentException e2) {
                LogUtil.e("WearHomeGeneralAction", "dismiss dialog error: " + ExceptionUtils.c(e2));
            }
        } finally {
            CustomTextAlertDialog customTextAlertDialogB = builderE.b();
            this.am = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            this.am.show();
        }
    }

    /* synthetic */ void o(View view) {
        LogUtil.a("WearHomeGeneralAction", "showLoginFail ok click");
        rdt.c(1);
        if (eey.d(this.d.d, 112)) {
            v();
        } else {
            d(new Consumer() { // from class: tjf
                @Override // com.huawei.framework.servicemgr.Consumer
                public final void accept(Object obj) {
                    this.f49235b.a((Boolean) obj);
                }
            });
        }
    }

    /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            al();
        }
    }

    private void d(Consumer<Boolean> consumer) {
        LogUtil.a("WearHomeGeneralAction", "walletCard cloud backup enter");
        WearWalletFactoryUtil wearWalletFactoryUtil = this.d.ab;
        if (wearWalletFactoryUtil == null) {
            consumer.accept(true);
        } else {
            wearWalletFactoryUtil.c(this.d.d, new AnonymousClass5(wearWalletFactoryUtil, consumer));
        }
    }

    /* JADX INFO: renamed from: tjc$5, reason: invalid class name */
    class AnonymousClass5 implements Consumer<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WearWalletFactoryUtil f49228c;
        final /* synthetic */ Consumer d;

        AnonymousClass5(WearWalletFactoryUtil wearWalletFactoryUtil, Consumer consumer) {
            this.f49228c = wearWalletFactoryUtil;
            this.d = consumer;
        }

        @Override // com.huawei.framework.servicemgr.Consumer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void accept(final Boolean bool) {
            WearHomeOldActivity wearHomeOldActivity = tjc.this.d;
            final WearWalletFactoryUtil wearWalletFactoryUtil = this.f49228c;
            final Consumer consumer = this.d;
            wearHomeOldActivity.runOnUiThread(new Runnable() { // from class: tkk
                @Override // java.lang.Runnable
                public final void run() {
                    tjc.AnonymousClass5.b(bool, wearWalletFactoryUtil, consumer);
                }
            });
        }

        static /* synthetic */ void b(Boolean bool, WearWalletFactoryUtil wearWalletFactoryUtil, Consumer consumer) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                wearWalletFactoryUtil.e(consumer);
            } else {
                consumer.accept(true);
            }
        }
    }

    private void v() {
        LogUtil.a("WearHomeGeneralAction", "checkEarphoneStateBeforeRestoreFactory in.");
        lxb.c().e(this.d.d, new EarPhoneResponseCallback() { // from class: tjc.4
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
            public void onResponse(int i, final edj edjVar) {
                tjc.this.d.runOnUiThread(new Runnable() { // from class: tjc.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        edj edjVar2 = edjVar;
                        if (edjVar2 == null) {
                            LogUtil.j("WearHomeGeneralAction", "earPhoneInfo is null");
                            tjc.this.aj();
                            return;
                        }
                        boolean z = edjVar2.a() == 1;
                        boolean z2 = edjVar.e() == 3;
                        if (!z || !z2) {
                            tjc.this.aj();
                        } else {
                            tjc.this.bc();
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aj() {
        LogUtil.a("WearHomeGeneralAction", "restoreFactoryShowEarphoneDialog in.");
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.h).a(R.string.IDS_earphone_restore_defaults_title).b(R.string.IDS_earphone_restore_defaults_content).a(R.string.IDS_retry, new View.OnClickListener() { // from class: tjx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.g(view);
            }
        }).e(R.string.IDS_earphone_log_collect_ignore_tips, new View.OnClickListener() { // from class: tjy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49246b.i(view);
            }
        }).b();
        this.f49206b = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.f49206b.show();
    }

    /* synthetic */ void g(View view) {
        LogUtil.j("WearHomeGeneralAction", "onClick restoreFactoryShowEarphoneDialog PositiveButton");
        this.f49206b.dismiss();
        this.f49206b = null;
        v();
    }

    /* synthetic */ void i(View view) {
        LogUtil.j("WearHomeGeneralAction", "onClick restoreFactoryShowEarphoneDialog NegativeButton");
        this.f49206b.dismiss();
        this.f49206b = null;
        bc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bc() {
        d(new Consumer() { // from class: tjj
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f49236b.d((Boolean) obj);
            }
        });
    }

    /* synthetic */ void d(Boolean bool) {
        if (bool.booleanValue()) {
            al();
        }
    }

    private void al() {
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.j("WearHomeGeneralAction", "setResetFactoryDialog BT switch is false!");
            qpx.e(this.h, R.string.IDS_hw_health_music_check_bluetooth_connection);
            return;
        }
        if (mga.b(this.d.d)) {
            a(R.string.IDS_settings_restore_factory_settings_progerssdialog_msg, 10000);
        } else {
            a(R.string.IDS_settings_restore_factory_settings_progerssdialog_msg, 2000);
        }
        WearHomeOldActivity wearHomeOldActivity = this.d;
        LogUtil.a("WearHomeGeneralAction", "resetFactory, mActivity: ", wearHomeOldActivity, ", handler: ", wearHomeOldActivity.d());
        bb();
        this.d.f26234b.a(this.d.f26233a, this.d.d(), false);
        DeviceInfo deviceInfo = this.d.d;
        if (deviceInfo != null) {
            rdt.c(deviceInfo);
            mhs.a().setSwitchSettingToDb(mip.a(deviceInfo.getDeviceIdentify()), "-1");
        }
    }

    private void bb() {
        if (this.d.d != null && CommonUtil.ab(BaseApplication.getContext())) {
            j(this.d.d);
        } else {
            ReleaseLogUtil.d("Dfx_WearHomeGeneralAction", "restoreFactory unPair mDeviceInfo is null");
        }
    }

    private void j(DeviceInfo deviceInfo) {
        FindNetworkUtils.e(deviceInfo, com.huawei.haf.application.BaseApplication.b(), new FindNetworkUtils.IFindNetworkCallback() { // from class: tjc.3
            @Override // com.huawei.ui.device.utlis.FindNetworkUtils.IFindNetworkCallback
            public void onSuccess(int i, HashMap<String, Object> map) {
                if (i == 1) {
                    ReleaseLogUtil.d("Dfx_WearHomeGeneralAction", "restoreFactory unPair findNetwork");
                    FindNetworkUtils.b(tjc.this.d.d, tjc.this.h);
                } else {
                    LogUtil.j("WearHomeGeneralAction", "status err:", Integer.valueOf(i));
                }
            }

            @Override // com.huawei.ui.device.utlis.FindNetworkUtils.IFindNetworkCallback
            public void onFail(String str) {
                LogUtil.j("WearHomeGeneralAction", "queryRegisterStatus fail message:", str);
            }
        });
    }

    public void a(int i, int i2) {
        if (this.d.isFinishing()) {
            LogUtil.j("WearHomeGeneralAction", 0, "WearHomeGeneralAction", "activity is finish");
            return;
        }
        if (this.z != null) {
            LogUtil.j("WearHomeGeneralAction", 0, "WearHomeGeneralAction", "mLoadingDialog is not null");
            return;
        }
        new CommonDialog21(this.h, R.style.app_update_dialogActivity);
        CommonDialog21 commonDialog21B = CommonDialog21.b(this.h);
        this.z = commonDialog21B;
        commonDialog21B.b(this.d.getString(i));
        this.z.c();
        Message messageObtainMessage = this.d.d().obtainMessage();
        messageObtainMessage.what = 11;
        messageObtainMessage.obj = false;
        this.d.d().sendMessageDelayed(messageObtainMessage, i2);
    }

    public void d(tlg tlgVar) {
        LogUtil.a("WearHomeGeneralAction", "startServiceSupport");
        String strE = tlgVar.b().e();
        H5proUtil.initH5pro();
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addCustomizeJsModule("JsInteraction", JsInteractionCompact.class);
        H5ProBundle h5ProBundle = new H5ProBundle();
        h5ProBundle.putString("siteCode", tlgVar.b().d());
        h5ProBundle.putString(DeviceHiCare.KEY_SITE_LANG, tlgVar.b().b());
        h5ProBundle.putString("mac", this.d.f26233a);
        builder.addCustomizeJsModule("DeviceHiCare", DeviceHiCare.class, h5ProBundle);
        builder.disableImageProxy();
        H5ProClient.getServiceManager().registerService(DeviceGeneralSettingManagerService.class);
        H5ProClient.startH5LightApp(this.d, strE, builder.build());
    }

    public void y() {
        final Intent intent = new Intent();
        intent.putExtra("device_id", this.d.f26233a);
        boolean zD = eey.d(this.d.d, 108);
        boolean zD2 = eey.d(this.d.d, 58);
        if (zD2 || zD) {
            if (this.ab == null) {
                this.ab = Boolean.valueOf(Utils.k());
            }
            final boolean z = zD2 || (zD && this.ab.booleanValue());
            intent.putExtra("moduleName", "PluginWearAbility");
            dad.c().launchActivity(this.d, intent, new AppBundleLauncher.InstallCallback() { // from class: tjc.1
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public boolean call(Context context, Intent intent2) {
                    HwOtaUpgradeManager.d().c(tjc.this.d.d.getDeviceUdid(), (InitCallback) null);
                    if (z) {
                        intent.setClass(context, UpdateVersionActivity.class);
                    } else {
                        intent.putExtra("UNIQUE_ID", tjc.this.d.d.getDeviceUdid());
                        intent.setClassName(BaseApplication.getContext().getPackageName(), ComponentInfo.PluginWearAbility_A_0);
                    }
                    ohf.e().b("PluginWearAbility");
                    LogUtil.a("WearHomeGeneralAction", "PluginWearOtaProxy launchActivity call");
                    try {
                        context.startActivity(intent);
                        return false;
                    } catch (ActivityNotFoundException unused) {
                        LogUtil.e("WearHomeGeneralAction", "ActivityNotFoundException intentUpdate");
                        return false;
                    }
                }
            });
            return;
        }
        intent.setClass(this.h, UpdateVersionActivity.class);
        this.d.startActivity(intent);
        qrs.ae(this.h);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010032.value(), new HashMap(16), 0);
    }

    private void as() {
        if (this.l == null) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.h).a(R.string.IDS_about_feedback_log_title).b(R.string.IDS_about_feedback_logupload_content).a(R.string.IDS_user_permission_ok, new View.OnClickListener() { // from class: tji
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.k(view);
                }
            }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: tjl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("WearHomeGeneralAction", "negative startFeedBackLog");
                }
            }).b();
            this.l = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
        }
        if (this.d.isFinishing()) {
            return;
        }
        this.l.show();
    }

    /* synthetic */ void k(View view) {
        new Handler().post(new Runnable() { // from class: tjc.7
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("WearHomeGeneralAction", "positive startFeedBackLog");
                tjc.this.ag();
            }
        });
    }

    public void w() {
        boolean zI = mjh.i();
        this.ac = false;
        if (zI) {
            LogUtil.a("WearHomeGeneralAction", "updateLogResult log upload success");
            if (!f()) {
                LogUtil.a("WearHomeGeneralAction", "updateLogResult 5.10.12 not timeout");
                qpx.b(this.h, R.string.IDS_hw_toast_log_upload_success);
            }
            this.u = false;
            mjh.d(false);
            this.d.d().removeMessages(1022);
            return;
        }
        LogUtil.a("WearHomeGeneralAction", "File not uploaded, waiting for file upload");
        Message messageObtainMessage = this.d.d().obtainMessage();
        messageObtainMessage.what = 1021;
        this.d.d().sendMessageDelayed(messageObtainMessage, 600000L);
    }

    public void c() {
        LogUtil.a("WearHomeGeneralAction", 0, "WearHomeGeneralAction", "Enter clearMessageCenterLocalDeviceMessage");
        final MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        messageCenterApi.getMessages("device", "device_type_connected", new IBaseResponseCallback() { // from class: tjc.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i != 0 || obj == null) {
                    return;
                }
                List list = (List) obj;
                LogUtil.a("WearHomeGeneralAction", 0, "WearHomeGeneralAction", "clearMessageCenterLocalDeviceMessage, responseMessageList.size() is ", Integer.valueOf(list.size()));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    messageCenterApi.deleteMessage(((MessageObject) it.next()).getMsgId());
                }
            }
        });
        messageCenterApi.getMessages("device", "device_ota", new IBaseResponseCallback() { // from class: tjc.8
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && obj != null && njy.b(obj, MessageObject.class)) {
                    List list = (List) obj;
                    LogUtil.a("WearHomeGeneralAction", 0, "WearHomeGeneralAction", "clearMessageCenterLocalDeviceMessage otaMessageList.size() is ", Integer.valueOf(list.size()));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        messageCenterApi.deleteMessage(((MessageObject) it.next()).getMsgId());
                    }
                    LogUtil.a("WearHomeGeneralAction", 0, "WearHomeGeneralAction", "Leave clearMessageCenterLocalDeviceMessage");
                }
            }
        });
        if (this.d.d != null) {
            lvb.e().a(this.d.d.getDeviceName());
            rcw.b(BaseApplication.getContext()).b(this.d.d);
        } else {
            LogUtil.j("WearHomeGeneralAction", "mCurrentDeviceInfo is null");
        }
        this.d.finish();
    }

    public void s() {
        LogUtil.a("WearHomeGeneralAction", "showIsUseFlowDialogWith2Button enter. config");
        if (!this.ad || TextUtils.isEmpty(this.an)) {
            return;
        }
        d(this.an);
    }

    public void d(String str) {
        LogUtil.a("WearHomeGeneralAction", "showIsUseFlowDialogWith2Button enter.");
        CustomViewDialog customViewDialog = this.q;
        if (customViewDialog != null) {
            this.ad = false;
            customViewDialog.cancel();
            this.an = "";
        }
        if (f()) {
            LogUtil.a("WearHomeGeneralAction", "showIsUseFlowDialogWith2Button 5.10.12 already timeout");
            return;
        }
        View viewInflate = LayoutInflater.from(this.h).inflate(R.layout.commonui_custom_view_tow_button, (ViewGroup) null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.dialog_alert_message);
        HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.dialog_btn_upload_now);
        HealthButton healthButton2 = (HealthButton) viewInflate.findViewById(R.id.dialog_btn_upload_by_wifi);
        healthButton.setText(this.d.getResources().getString(R.string.IDS_device_log_upload_now));
        healthButton2.setText(this.d.getResources().getString(R.string.IDS_device_log_upload_wifi));
        healthTextView.setText(str);
        this.an = str;
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.h);
        builder.d(viewInflate);
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: tje
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.t(view);
            }
        });
        healthButton2.setOnClickListener(new View.OnClickListener() { // from class: tjk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.r(view);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.q = customViewDialogD;
        customViewDialogD.setCancelable(false);
        if (this.d.isFinishing()) {
            return;
        }
        this.q.show();
        this.ad = true;
    }

    /* synthetic */ void t(View view) {
        a();
        b();
        if (!mjh.b(this.h)) {
            qpx.b(this.h, R.string.IDS_hw_toast_log_upload_failed);
            LogUtil.a("WearHomeGeneralAction", "start showIsUseFlowDialogWith2Button showLongToast.");
            return;
        }
        if (!mjh.o(mjh.f41743c) && !mjh.o(mjh.e)) {
            this.ac = false;
            this.u = false;
            mjh.d(false);
            LogUtil.j("WearHomeGeneralAction", "isHasZip is not wearable log");
            return;
        }
        this.ac = true;
        this.u = true;
        qpx.b(this.h, R.string.IDS_hw_toast_log_upload_background);
        LogUtil.a("WearHomeGeneralAction", "start uploading log.");
        mjh.s(this.d.f26233a);
        Message messageObtainMessage = this.d.d().obtainMessage();
        messageObtainMessage.what = 1021;
        this.d.d().sendMessageDelayed(messageObtainMessage, 600000L);
    }

    /* synthetic */ void r(View view) {
        a();
        b();
        qpx.b(this.h, R.string.IDS_hw_toast_log_auto_upload_wlan);
        this.u = false;
        this.ac = false;
        mjh.d(false);
    }

    public void c(int i, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str3 = nio.e(this.d.f26233a) + "BETA_QUESTION";
        try {
            long j = Long.parseLong(SharedPreferenceManager.e(this.h, String.valueOf(10), str3));
            LogUtil.a("WearHomeGeneralAction", "WearHomeOldActivity currentTime is: ", Long.valueOf(jCurrentTimeMillis), ", lastTime is: ", Long.valueOf(j));
            if (jCurrentTimeMillis - j < 300000) {
                LogUtil.j("WearHomeGeneralAction", "WearHomeOldActivity Less than five minutes");
                return;
            }
        } catch (NumberFormatException unused) {
            LogUtil.e("WearHomeGeneralAction", "WearHomeOldActivity NumberFormatException");
        }
        SharedPreferenceManager.e(this.h, String.valueOf(10), str3, String.valueOf(jCurrentTimeMillis), new StorageParams(0));
        lws lwsVarC = lws.c(this.h);
        lwsVarC.b(i, str, str2);
        lwsVarC.b(0, this.d.f26233a, new DeviceDfxBaseResponseCallback() { // from class: tjc.9
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
            public void onSuccess(int i2, String str4) {
                ReleaseLogUtil.d("Dfx_WearHomeGeneralAction", "handlerGetDeviceLog onSuccess successCode = ", Integer.valueOf(i2));
                mfz.d(3, true);
                tjc.this.ap.d(false, tjc.this.d.f26233a);
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
            public void onFailure(int i2, String str4) {
                ReleaseLogUtil.a("Dfx_WearHomeGeneralAction", "handlerGetDeviceLog onFailure errorCode = ", Integer.valueOf(i2), ", errorMessage = ", str4);
                mfz.d(3, true);
                tjc.this.ap.d(false, tjc.this.d.f26233a);
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
            public void onProgress(int i2, String str4) {
                LogUtil.j("WearHomeGeneralAction", "onProgress");
            }
        });
    }

    private void a(final int i, final String str) {
        LogUtil.a("WearHomeGeneralAction", "startEarphoneDownLoadProgress progress: ", Integer.valueOf(i), " and progressDesc: ", str);
        WearHomeOldActivity wearHomeOldActivity = this.d;
        if (wearHomeOldActivity == null) {
            LogUtil.j("WearHomeGeneralAction", "startEarphoneDownLoadProgress mActivity == null ");
        } else {
            wearHomeOldActivity.runOnUiThread(new Runnable() { // from class: tjp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49239b.d(i, str);
                }
            });
        }
    }

    /* synthetic */ void d(int i, String str) {
        CustomProgressDialog customProgressDialog = this.f;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            this.i.b(i);
            this.i.d(i);
            return;
        }
        this.f = new CustomProgressDialog(this.h);
        CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.h);
        this.i = builder;
        builder.e(str);
        CustomProgressDialog customProgressDialogC = this.i.c();
        this.f = customProgressDialogC;
        customProgressDialogC.setCanceledOnTouchOutside(false);
        this.f.setCancelable(false);
        if (this.d.isFinishing()) {
            return;
        }
        this.f.show();
        this.i.b(0);
        this.i.d(0);
    }

    private void i(final DeviceInfo deviceInfo) {
        if (this.d == null) {
            LogUtil.j("WearHomeGeneralAction", "startEarphoneDownLoadProgress mActivity == null ");
            return;
        }
        if (this.m == null) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.h).a(R.string.IDS_earphone_log_collect_title).b(R.string.IDS_earphone_log_collect_request_tips).b((Boolean) true).a(R.string.IDS_user_permission_ok, new View.OnClickListener() { // from class: tkb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49252b.a(deviceInfo, view);
                }
            }).e(R.string.IDS_earphone_log_collect_ignore_tips, new View.OnClickListener() { // from class: tkc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49254c.c(deviceInfo, view);
                }
            }).b();
            this.m = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
        }
        if (this.d.isFinishing()) {
            return;
        }
        this.m.show();
    }

    /* synthetic */ void a(DeviceInfo deviceInfo, View view) {
        f(deviceInfo);
    }

    /* synthetic */ void c(DeviceInfo deviceInfo, View view) {
        LogUtil.a("WearHomeGeneralAction", "negative showEarphoneLogCollectDialog");
        b(deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(final DeviceInfo deviceInfo) {
        if (this.k == null) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.h).a(R.string.IDS_earphone_log_collect_failed_title).b(R.string.IDS_earphone_log_collect_failed_tips).a(R.string.IDS_notify_retry, new View.OnClickListener() { // from class: tkd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.d(deviceInfo, view);
                }
            }).e(R.string.IDS_earphone_log_collect_ignore_tips, new View.OnClickListener() { // from class: tjd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49234c.e(deviceInfo, view);
                }
            }).b();
            this.k = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
        }
        if (this.d.isFinishing()) {
            return;
        }
        this.k.show();
    }

    /* synthetic */ void d(DeviceInfo deviceInfo, View view) {
        i(deviceInfo);
    }

    /* synthetic */ void e(DeviceInfo deviceInfo, View view) {
        LogUtil.a("WearHomeGeneralAction", "negative showEarphoneLogCollectFailedDialog");
        c(deviceInfo);
        lvb.e().e("earphoneLogPre");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceInfo deviceInfo) {
        WearHomeOldActivity wearHomeOldActivity = this.d;
        if (wearHomeOldActivity == null || wearHomeOldActivity.d() == null) {
            return;
        }
        this.d.d().post(new Runnable() { // from class: tjc.10
            @Override // java.lang.Runnable
            public void run() {
                tjc.this.az();
            }
        });
    }

    private void f(DeviceInfo deviceInfo) {
        a(0, this.h.getString(R.string.IDS_earphone_log_collect_tips));
        lvb.e().b("earphoneLogPre", this.f49207c);
        LogUtil.a("WearHomeGeneralAction", "start sendDeviceEvent");
        lvb.e().b("earphoneLogPre", deviceInfo, 0, "1");
    }

    private void b(DeviceInfo deviceInfo) {
        WearHomeOldActivity wearHomeOldActivity = this.d;
        if (wearHomeOldActivity == null || wearHomeOldActivity.d() == null) {
            return;
        }
        this.d.d().post(new Runnable() { // from class: tjc.11
            @Override // java.lang.Runnable
            public void run() {
                tjc.this.az();
                lvb.e().e("earphoneLogPre");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z) {
        LogUtil.a("WearHomeGeneralAction", "progress: ", Integer.valueOf(i), ",isTimeout: ", Boolean.valueOf(z));
        a(i, this.h.getString(R.string.IDS_earphone_log_collect_tips));
    }

    private void ac() {
        HealthFeedbackParams healthFeedbackParams = new HealthFeedbackParams();
        DeviceInfo deviceInfoE = tfn.a().e(this.d.f26233a);
        if (deviceInfoE != null) {
            LogUtil.a("WearHomeGeneralAction", "goBetaFeedBack");
            String securityDeviceId = deviceInfoE.getSecurityDeviceId();
            String deviceIdentify = deviceInfoE.getDeviceIdentify();
            String udidFromDevice = deviceInfoE.getUdidFromDevice();
            int productType = deviceInfoE.getProductType();
            if (TextUtils.isEmpty(udidFromDevice)) {
                udidFromDevice = b(securityDeviceId, deviceIdentify, productType);
            }
            healthFeedbackParams.setDeviceId(udidFromDevice);
            healthFeedbackParams.setProductVersion(deviceInfoE.getSoftVersion());
            b(healthFeedbackParams, deviceInfoE);
            c(healthFeedbackParams);
            return;
        }
        LogUtil.d("WearHomeGeneralAction", "no device");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        LogUtil.a("WearHomeGeneralAction", "postStartFeedBackLog in. ");
        DeviceInfo deviceInfoE = tfn.a().e(this.d.f26233a);
        boolean zD = eey.d(deviceInfoE, 134);
        LogUtil.a("WearHomeGeneralAction", "handlerGetDeviceLog isSupportGet earPhone log isSupportEarphoneLogCollect: ", Boolean.valueOf(zD));
        if (zD) {
            i(deviceInfoE);
        } else {
            az();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void az() {
        LogUtil.a("WearHomeGeneralAction", "send startFeedBackLog");
        if (!mjh.b(this.h)) {
            LogUtil.a("WearHomeGeneralAction", "FeedBackLog is NoNetworkActive");
            qpx.b(this.h, R.string.IDS_hw_toast_log_upload_failed);
            return;
        }
        DeviceInfo deviceInfoE = tfn.a().e(this.d.f26233a);
        if (deviceInfoE != null && deviceInfoE.getDeviceConnectState() != 2) {
            LogUtil.j("WearHomeGeneralAction", "bt is dmIsConnected");
            b(R.string.IDS_hw_show_log_bt_disconnect, "");
            return;
        }
        if (lws.c(this.h).c(this.d.d)) {
            LogUtil.a("WearHomeGeneralAction", "mIsSelected: ", Boolean.valueOf(this.aa));
            this.x = true;
            if (this.aa) {
                a(deviceInfoE);
                return;
            } else {
                ab();
                return;
            }
        }
        LogUtil.a("WearHomeGeneralAction", "device is not supported");
        if (!mjh.b(this.h)) {
            b();
            this.u = false;
            mjh.d(false);
            qpx.b(this.h, R.string.IDS_hw_toast_log_upload_failed);
            return;
        }
        if (!mjh.e(this.h)) {
            LogUtil.a("WearHomeGeneralAction", "wifi is dmIsConnected , use network");
            mjh.d(true);
            lws.c(BaseApplication.getContext()).c(false, this.d.f26233a);
            mjh.c(this.aj);
            return;
        }
        this.u = true;
        b();
        qpx.b(this.h, R.string.IDS_hw_toast_log_upload_background);
        LogUtil.a("WearHomeGeneralAction", "start logging wifi uploading");
        lws.c(BaseApplication.getContext()).c(false, this.d.f26233a);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1021;
        this.d.d().sendMessageDelayed(messageObtain, 600000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        LogUtil.a("WearHomeGeneralAction", "collectDeviceLog");
        this.ak = this.h.getString(R.string.IDS_hw_show_log_progress);
        aw();
        DeviceInfo deviceInfoC = mgg.c(this.d.f26233a, "WearHomeGeneralAction");
        if (deviceInfoC != null && mjh.k(deviceInfoC.getDeviceIdentify()) && eey.d(deviceInfoC, 217)) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1041;
            this.d.d().sendMessageDelayed(messageObtain, 420000L);
            e(false);
        }
        z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: tjc.12
            @Override // java.lang.Runnable
            public void run() {
                mfz.d(2, true);
                lws.c(tjc.this.h).d(tjc.this.d.f26233a, tjc.this.n);
            }
        });
    }

    private void a(DeviceInfo deviceInfo) {
        this.ak = this.h.getString(R.string.IDS_device_capture_tips);
        aw();
        d(deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo) {
        lws.c(this.h).b(deviceInfo, new IBaseResponseCallback() { // from class: tjc.15
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("WearHomeGeneralAction", "onResponse errorCode: ", Integer.valueOf(i));
                lws.c(tjc.this.h).e();
                tjc.this.d.runOnUiThread(new Runnable() { // from class: tjc.15.4
                    @Override // java.lang.Runnable
                    public void run() {
                        tjc.this.b();
                        tjc.this.ab();
                    }
                });
            }
        });
    }

    public void e() {
        LogUtil.a("WearHomeGeneralAction", "goBetaFeedBack");
        ac();
    }

    private String b(String str, String str2, int i) {
        String strE;
        boolean z = !str2.contains(":") && str2.length() > 12;
        if (!Utils.o() && !z) {
            strE = str2.replace(":", "");
        } else {
            strE = nio.e(str);
            if (strE.length() >= 24) {
                strE = b(strE);
            }
        }
        if (Utils.o() || i < 34) {
            return strE;
        }
        if (!str.equals(str2)) {
            return nio.c(str + str2);
        }
        return nio.c(str);
    }

    private String b(String str) {
        if (str == null) {
            return "";
        }
        return str.length() >= 24 ? str.replace(Marker.ANY_NON_NULL_MARKER, "A").replace("/", "A").replace("=", "A").substring(0, 24) : str;
    }

    private void c(HealthFeedbackParams healthFeedbackParams) {
        LogUtil.a("WearHomeGeneralAction", "sendFeedback");
        lwp lwpVarA = lwp.a();
        Context context = this.h;
        WearHomeOldActivity wearHomeOldActivity = this.d;
        lwpVarA.b(context, healthFeedbackParams, new c(wearHomeOldActivity, wearHomeOldActivity.d()));
    }

    public void l() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.h);
        builder.b(R.string.IDS_factory_reset_net_tip);
        builder.c(R.string.IDS_sync_account_know, new View.OnClickListener() { // from class: tjw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("WearHomeGeneralAction", "factory reset no satisfation condition");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        if (noTitleCustomAlertDialogC.isShowing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    static class c implements HealthFeedbackCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<Activity> f49232a;
        private Handler d;

        private c(Activity activity, Handler handler) {
            this.f49232a = new WeakReference<>(activity);
            this.d = handler;
        }

        @Override // com.huawei.hwcrowdtestapi.HealthFeedbackCallback
        public void onFailed(String str) {
            Activity activity = this.f49232a.get();
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                LogUtil.j("WearHomeGeneralAction", "onFailed activity is null, finish or destroyed");
            } else {
                LogUtil.d("WearHomeGeneralAction", "gotoFeedBack failed");
            }
        }

        @Override // com.huawei.hwcrowdtestapi.HealthFeedbackCallback
        public ltn collectLogs(int i, String str, String str2, boolean z) {
            LogUtil.a("WearHomeGeneralAction", "bugTypeId: ", Integer.valueOf(i), "tbdtsNo: ", str2, ";fileLogId: ", str);
            Activity activity = this.f49232a.get();
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                LogUtil.j("WearHomeGeneralAction", "onFailed activity is null, finish or destroyed");
                return null;
            }
            mjh.a(z);
            Object objA = qrc.a(913000005);
            qrc.c(objA, qrc.e("E913000005_ERRCODE_TINYINT"), 0);
            qrc.c(objA, qrc.e("E913000005_SUBERRCODE_TINYINT"), 1);
            LogUtil.a("WearHomeGeneralAction", "ReflectionIMonitor isSendEvent is", Boolean.valueOf(qrc.a(objA)));
            qrc.b(objA);
            ArrayList arrayList = new ArrayList(0);
            String strO = LogConfig.o();
            if (!Utils.o() && !TextUtils.isEmpty(strO)) {
                LogUtil.a("WearHomeGeneralAction", "add tracktest path");
                arrayList.add(strO + "tracktest");
            }
            arrayList.add(mjh.f41741a + "MaintenanceLog");
            arrayList.add(mjh.f41741a + tge.e);
            arrayList.add(mjh.f41741a + tge.f49093a);
            arrayList.add(mjh.f41741a + "com.huawei.version.json");
            arrayList.add(mjh.f41741a + "huawei_crashLog_0.txt");
            arrayList.add(mjh.f41741a + "app_config_value.txt");
            arrayList.add(mjh.f41741a + tge.d);
            arrayList.add(tge.f49095c);
            DfxBaseHandler.getAllDfxLogFileToPathList(new File(mjh.f41741a), arrayList);
            if (CommonUtil.ap() && CommonUtil.bg()) {
                arrayList.add(LogConfig.e);
            }
            ltn ltnVar = new ltn();
            ltnVar.e(arrayList);
            ltnVar.c(200);
            Message messageObtain = Message.obtain();
            messageObtain.what = 1023;
            Bundle bundle = new Bundle();
            bundle.putInt("bugTypeId", i);
            bundle.putString("fileLogId", str);
            bundle.putString("dtsNumber", str2);
            messageObtain.setData(bundle);
            this.d.sendMessageDelayed(messageObtain, 5000L);
            return ltnVar;
        }
    }

    private void b(HealthFeedbackParams healthFeedbackParams, DeviceInfo deviceInfo) {
        String securityDeviceId = deviceInfo.getSecurityDeviceId();
        if (!TextUtils.isEmpty(securityDeviceId) && securityDeviceId.contains(":")) {
            securityDeviceId = securityDeviceId.replace(":", "");
        }
        int productType = deviceInfo.getProductType();
        String deviceModel = deviceInfo.getDeviceModel();
        String strC = mjj.c().c(productType, mjj.c().a(productType, deviceModel), deviceModel);
        if (deviceModel != null && eei.b(deviceModel)) {
            LogUtil.a("WearHomeGeneralAction", "addGoBetaFeedBackParams currentDevice is honor device");
            healthFeedbackParams.setIsHonorDevice(true);
        }
        healthFeedbackParams.setProductName(strC);
        healthFeedbackParams.setDeviceModel(mjh.d(strC));
        healthFeedbackParams.setDeviceSn(securityDeviceId);
        if (Utils.o()) {
            healthFeedbackParams.setProductType(20);
        } else {
            healthFeedbackParams.setProductType(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str) {
        if (this.d.isFinishing()) {
            return;
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.h);
        builder.a(R.string.IDS_service_area_notice_title);
        String string = this.d.getString(i);
        builder.a(string);
        ReleaseLogUtil.d("Dfx_WearHomeGeneralAction", "showErrDialog content = " + string + ", errorCode = " + str);
        xjt.r("Dfx_WearHomeGeneralActionshowErrDialog content = " + string + ", errorCode = " + str);
        builder.a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: tjh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("WearHomeGeneralAction", "showErrDialog onclick PositiveButton");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        if (customTextAlertDialogB.isShowing()) {
            return;
        }
        customTextAlertDialogB.show();
    }

    private void aw() {
        LogUtil.a("WearHomeGeneralAction", "showLoadingDialog()");
        if (this.d.isFinishing()) {
            return;
        }
        CommonDialog21 commonDialog21 = this.ag;
        if (commonDialog21 == null) {
            new CommonDialog21(this.h, R.style.app_update_dialogActivity);
            CommonDialog21 commonDialog21B = CommonDialog21.b(this.h);
            this.ag = commonDialog21B;
            commonDialog21B.b(this.ak);
            this.ag.setCancelable(false);
        } else {
            commonDialog21.b(this.ak);
        }
        if (this.ag.isShowing()) {
            return;
        }
        this.ag.c();
        LogUtil.a("WearHomeGeneralAction", "mLoadingUserInformationDialog.show()");
    }

    public void b() {
        CommonDialog21 commonDialog21;
        LogUtil.a("WearHomeGeneralAction", "enter dismissLoadingDialog()");
        if (this.d.isFinishing() || (commonDialog21 = this.ag) == null || !commonDialog21.isShowing()) {
            return;
        }
        LogUtil.a("WearHomeGeneralAction", "dismissLoadingDialog()!");
        this.ag.cancel();
        this.ag = null;
    }

    public void a() {
        if (this.d.isFinishing()) {
            return;
        }
        LogUtil.a("WearHomeGeneralAction", "enter dismissIsUseFlowDialogWith2Button()");
        CustomViewDialog customViewDialog = this.q;
        if (customViewDialog == null || !customViewDialog.isShowing()) {
            return;
        }
        LogUtil.a("WearHomeGeneralAction", "dismissIsUseFlowDialogWith2Button()!");
        this.ad = false;
        this.q.dismiss();
        this.q = null;
        this.an = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(CustomProgressDialog customProgressDialog) {
        LogUtil.a("WearHomeGeneralAction", "enter closeProgress");
        if (customProgressDialog == null || !customProgressDialog.isShowing() || this.d.isFinishing()) {
            return;
        }
        customProgressDialog.cancel();
        LogUtil.a("WearHomeGeneralAction", "enter closeProgress cancel");
    }

    public void e(int i, String str) {
        CustomProgressDialog customProgressDialog = this.j;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            this.o.b(i);
            this.o.d(i);
            this.o.e(str);
            return;
        }
        CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.h);
        this.o = builder;
        builder.e(str);
        CustomProgressDialog customProgressDialogC = this.o.c();
        this.j = customProgressDialogC;
        customProgressDialogC.setCanceledOnTouchOutside(false);
        this.j.setCancelable(false);
        if (this.d.isFinishing()) {
            return;
        }
        this.j.show();
        this.o.b(0);
        this.o.d(0);
    }

    public void c(final int i, final String str) {
        LogUtil.a("WearHomeGeneralAction", "get device log failed, errorMessage = ", str);
        e(this.j);
        SharedPreferenceManager.d(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", 0);
        this.x = false;
        WearHomeOldActivity wearHomeOldActivity = this.d;
        if (wearHomeOldActivity == null || wearHomeOldActivity.d() == null) {
            return;
        }
        this.d.d().postDelayed(new Runnable() { // from class: tjc.14
            @Override // java.lang.Runnable
            public void run() {
                tjc tjcVar = tjc.this;
                tjcVar.e(tjcVar.j);
                tjc.this.b();
                if (!tjc.this.f()) {
                    LogUtil.j("WearHomeGeneralAction", "doOnFailure 5.10.12 not timeout");
                    if (TextUtils.equals(str, "5.10.12 cancel timeout 7 minutes")) {
                        tjc.this.b(R.string.IDS_hw_show_log_bt_timeout_restart, i + "");
                        tjc.this.e(true);
                    } else {
                        tjc.this.b(R.string.IDS_hw_show_log_bt_disconnect, i + "");
                    }
                }
                lws.c(BaseApplication.getContext()).c(false, tjc.this.d.f26233a);
            }
        }, 800L);
    }

    public void q() {
        ReleaseLogUtil.d("Dfx_WearHomeGeneralAction", "enter startDetection");
        DeviceInfo deviceInfoE = tfn.a().e(this.d.f26233a);
        if (deviceInfoE == null) {
            ReleaseLogUtil.e("Dfx_WearHomeGeneralAction", "deviceInfo is null");
        } else {
            lwo.c().e(deviceInfoE, 0);
        }
    }

    public void x() {
        this.aa = false;
        this.v = false;
        if (this.ac) {
            au();
            return;
        }
        DeviceInfo deviceInfoE = tfn.a().e(this.d.f26233a);
        if (deviceInfoE != null) {
            e(deviceInfoE);
        }
    }

    private void e(DeviceInfo deviceInfo) {
        DeviceInfo deviceInfoC;
        if (deviceInfo.getExpandCapability() == null && (deviceInfoC = mgg.c(deviceInfo.getDeviceIdentify(), "WearHomeGeneralAction")) != null) {
            deviceInfo.setExpandCapability(deviceInfoC.getExpandCapability());
        }
        boolean zD = eey.d(deviceInfo, 32);
        LogUtil.a("WearHomeGeneralAction", "isSupportCapture: ", Boolean.valueOf(zD));
        if (zD) {
            ao();
        } else {
            as();
        }
    }

    private void au() {
        View viewInflate = LayoutInflater.from(this.h).inflate(R.layout.hw_show_uploading_view, (ViewGroup) null);
        CustomAlertDialog.Builder builderA = new CustomAlertDialog.Builder(this.d).a(R.string.IDS_common_notification_know_tips, new DialogInterface.OnClickListener() { // from class: tjc.19
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (tjc.this.aq != null) {
                    tjc.this.aq.dismiss();
                    tjc.this.aq = null;
                }
                tjc.this.d.e(WearHomeOldActivity.EnumDialog.RATE);
            }
        });
        this.aq = builderA.b();
        builderA.a(viewInflate);
        this.aq.setCancelable(false);
        if (this.aq.isShowing() || this.d.isFinishing()) {
            return;
        }
        this.aq.show();
    }

    private void ao() {
        if (this.r == null) {
            View viewInflate = LayoutInflater.from(this.h).inflate(R.layout.hw_show_select_option_view, (ViewGroup) null);
            CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(this.h).b(R.string.IDS_about_feedback_log_title).d(viewInflate).d(R.string.IDS_user_permission_ok, new View.OnClickListener() { // from class: tkh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.m(view);
                }
            }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: tki
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49259c.n(view);
                }
            }).d();
            this.r = customViewDialogD;
            customViewDialogD.setCancelable(false);
            if (!w(viewInflate)) {
                LogUtil.j("WearHomeGeneralAction", "showGenderPickerDialog() dialog layout fail");
                this.r = null;
                return;
            }
        }
        if (this.d.isFinishing()) {
            return;
        }
        ah();
        this.r.show();
    }

    /* synthetic */ void m(View view) {
        new Handler().post(new Runnable() { // from class: tjc.16
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("WearHomeGeneralAction", "positive startFeedBackLog: ", Boolean.valueOf(tjc.this.aa));
                SharedPreferenceManager.a(String.valueOf(10), "KEY_IS_CLICKED_BETA_FEEDBACK", true);
                tjc.this.ag();
            }
        });
    }

    /* synthetic */ void n(View view) {
        LogUtil.a("WearHomeGeneralAction", "negative startFeedBackLog: ", Boolean.valueOf(this.aa));
        SharedPreferenceManager.a(String.valueOf(10), "KEY_IS_CLICKED_BETA_FEEDBACK", false);
    }

    private boolean w(View view) {
        LogUtil.a("WearHomeGeneralAction", "initializeGenderDialogLayout()");
        if (view == null) {
            return false;
        }
        this.y = (HealthTextView) view.findViewById(R.id.textView_content);
        this.ai = (HealthRadioButton) view.findViewById(R.id.radiobutton_log_include_capture);
        this.ah = (HealthRadioButton) view.findViewById(R.id.radiobutton_log_exclude_capture);
        this.al = (RelativeLayout) view.findViewById(R.id.relativelayout_log_include_capture);
        this.ae = (RelativeLayout) view.findViewById(R.id.relativelayout_log_exclude_capture);
        this.al.setOnClickListener(new e(true));
        this.ae.setOnClickListener(new e(false));
        this.y.setText(R.string.IDS_about_feedback_logupload_content);
        ah();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        if (this.aa) {
            this.ai.setChecked(true);
            this.ah.setChecked(false);
        } else {
            this.ai.setChecked(false);
            this.ah.setChecked(true);
        }
    }

    class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f49233b;

        e(boolean z) {
            this.f49233b = z;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogUtil.a("WearHomeGeneralAction", "MySelectionOptionOnClickListener onClick(), isSelect:", Boolean.valueOf(this.f49233b));
            tjc.this.aa = this.f49233b;
            tjc.this.ah();
        }
    }

    public void p() {
        if (this.d.r != null) {
            LogUtil.a("WearHomeGeneralAction", "upload log DEVICE_GOTO_FEEDBACK");
            this.d.r.c();
        }
    }

    public void u() {
        aa();
        GRSManager.c(this.h).d("helpCustomerUrl", new GrsQueryCallback() { // from class: tjc.17
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                if (!TextUtils.isEmpty(str)) {
                    tjc.this.i(str);
                } else {
                    LogUtil.j("WearHomeGeneralAction", "obtainTipsUrlDomain urlDomain is empty");
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("WearHomeGeneralAction", "obtainTipsUrlDomain onCallBackFail");
            }
        });
    }

    private void aa() {
        if (CommonUtil.bu() && LoginInit.getInstance(this.h).getIsLogined() && !tqp.i() && !lli.e().b() && !lli.e().f()) {
            LogUtil.a("WearHomeGeneralAction", "enter initFeedbackSdk");
            lli.e().b(false, null);
        } else {
            LogUtil.j("WearHomeGeneralAction", "initData , phoneservicesdk is not initialized");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        String str2;
        int i;
        String helpCustomerUrl = HelpCustomerOperate.getHelpCustomerUrl(str, "#/help?cid=11069");
        if (!ae()) {
            str2 = "&isDevice=1";
        } else {
            boolean zD = eey.d(this.d.d, 62);
            ReleaseLogUtil.d("Dfx_WearHomeGeneralAction", "startWebViewActivity isEnhanceMode: ", Boolean.valueOf(zD));
            str2 = "&isDevice=1&unitId=" + this.d.d.getDeviceIdentify() + "&isEnhancementMode=" + zD;
        }
        String str3 = helpCustomerUrl + str2;
        ReleaseLogUtil.d("Dfx_WearHomeGeneralAction", "startWebViewActivity isSupport: ", Boolean.valueOf(ae()));
        try {
            Intent intent = new Intent(this.h, (Class<?>) WebViewActivity.class);
            boolean zIsShowOnlineEntry = OnlineImUtil.isShowOnlineEntry();
            intent.putExtra("url", str3);
            Context context = this.h;
            if (zIsShowOnlineEntry) {
                i = com.huawei.ui.main.R.string.IDS_hw_personal_cetenr_help_customer_service;
            } else {
                i = com.huawei.ui.main.R.string.IDS_hwh_health_vo2max_help;
            }
            intent.putExtra("title", context.getString(i));
            intent.putExtra("deviceId", this.d.f26233a);
            Context context2 = this.h;
            if (context2 == null) {
                LogUtil.j("WearHomeGeneralAction", "startWebViewActivity mContext is null ");
            } else {
                context2.startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WearHomeGeneralAction", "startWebViewActivity ActivityNotFoundException");
        }
    }

    private boolean ae() {
        DeviceInfo deviceInfo = this.d.d;
        if (deviceInfo == null) {
            return false;
        }
        LogUtil.a("WearHomeGeneralAction", "isHonorDevice: ", Boolean.valueOf(eei.d(deviceInfo)));
        if (eei.d(deviceInfo)) {
            return false;
        }
        int versionType = this.d.d.getVersionType();
        ReleaseLogUtil.d("Dfx_WearHomeGeneralAction", "Device version type is ", Integer.valueOf(versionType));
        boolean z = versionType == 0;
        boolean zH = Utils.h();
        boolean zC = lli.c();
        boolean zO = Utils.o();
        boolean z2 = (!z || tqp.i() || mjh.k(this.d.f26233a)) ? false : true;
        boolean z3 = (zO || !z2 || lli.a()) ? false : true;
        boolean z4 = zO && z2 && zC && zH;
        ReleaseLogUtil.d("Dfx_WearHomeGeneralAction", "isAllowLogin: ", Boolean.valueOf(zH), ", isOpen: ", Boolean.valueOf(zC), ", isOverSea: ", Boolean.valueOf(zO));
        return z3 || z4;
    }

    public void k() {
        LogUtil.a("WearHomeGeneralAction", "onDestory enter");
        tqp.d(this.h, this.as);
        tqp.d(this.h, this.ar);
        LogUtil.a("WearHomeGeneralAction", "mUploadLogResultBroadcastReceiver unRegisterBroadcastNormal");
        tqp.d(this.h, this.af);
        lvb.e().e("earphoneLogPre");
        this.ac = false;
        this.u = false;
        mjh.d(false);
        SharedPreferenceManager.a(String.valueOf(10), "KEY_IS_CLICKED_BETA_FEEDBACK", false);
        SharedPreferenceManager.d(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", 0);
        e(false);
        af();
        WearHomeOldActivity wearHomeOldActivity = this.d;
        if (wearHomeOldActivity == null || wearHomeOldActivity.f26234b == null) {
            return;
        }
        LogUtil.a("WearHomeGeneralAction", "removeFactoryResetCallback");
        this.d.f26234b.g();
    }

    public boolean g() {
        return this.v;
    }

    public void b(boolean z) {
        this.ac = z;
    }

    public void c(String str) {
        this.s = str;
    }

    public void c(int i) {
        this.t = i;
    }
}
