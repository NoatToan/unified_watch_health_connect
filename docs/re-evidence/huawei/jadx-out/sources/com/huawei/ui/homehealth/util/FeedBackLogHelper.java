package com.huawei.ui.homehealth.util;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcrowdtestapi.HealthFeedbackCallback;
import com.huawei.hwcrowdtestapi.HealthFeedbackParams;
import com.huawei.hwdevice.mainprocess.callback.NotifyPhoneServiceCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxUploadCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.device.interactors.UploadMaintLogInteractor;
import com.huawei.ui.homewear21.R;
import defpackage.eei;
import defpackage.eey;
import defpackage.ltn;
import defpackage.ltr;
import defpackage.lvb;
import defpackage.lwp;
import defpackage.lws;
import defpackage.mfz;
import defpackage.mgg;
import defpackage.mjh;
import defpackage.mjj;
import defpackage.nio;
import defpackage.qpx;
import defpackage.qrc;
import defpackage.tfn;
import defpackage.tge;
import defpackage.tqp;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes17.dex */
public class FeedBackLogHelper {
    private Boolean ab;
    private boolean ac;
    private CommonDialog21 ag;
    private HealthRadioButton ah;
    private HealthRadioButton ai;
    private RelativeLayout aj;
    private String ak;
    private String al;
    private RelativeLayout am;
    private CustomAlertDialog aq;
    private DeviceInfo f;
    private CustomProgressDialog g;
    private CustomProgressDialog.Builder h;
    private CustomProgressDialog.Builder i;
    private CustomProgressDialog j;
    private String k;
    private CustomTextAlertDialog l;
    private CustomTextAlertDialog m;
    private CustomTextAlertDialog o;
    private CustomViewDialog p;
    private CustomViewDialog t;
    private HealthTextView x;
    private volatile boolean u = false;
    private volatile boolean y = false;
    private volatile boolean z = false;
    private volatile boolean v = false;
    private volatile boolean aa = false;
    private boolean ad = false;
    private volatile String s = "";
    private volatile int r = -1;
    private String as = "";
    private String af = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26139c = "lifeCycle";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26137a = "onDestroy";
    private final DeviceDfxUploadCallback an = new DeviceDfxUploadCallback() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.4
        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxUploadCallback
        public void startUpload(double d) {
            LogUtil.a("FeedBackLogHelper", "startUpload is ", Double.valueOf(d));
            FeedBackLogHelper.this.b();
            String string = FeedBackLogHelper.this.e.getString(R.string.IDS_device_log_upload_tips, new Object[]{UnitUtil.e((d / 1024.0d) / 1024.0d, 1, 2)});
            LogUtil.a("FeedBackLogHelper", "startUpload string is ", string);
            if (FeedBackLogHelper.this.w != null) {
                Message messageObtainMessage = FeedBackLogHelper.this.w.obtainMessage();
                messageObtainMessage.what = 1024;
                messageObtainMessage.obj = string;
                FeedBackLogHelper.this.w.sendMessage(messageObtainMessage);
                return;
            }
            LogUtil.j("FeedBackLogHelper", "mHandler is null");
        }
    };
    private final DeviceDfxBaseResponseCallback n = new DeviceDfxBaseResponseCallback() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.11
        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
        public void onSuccess(int i, String str) {
            if (i == 2) {
                LogUtil.j("FeedBackLogHelper", "start logging.");
                return;
            }
            if (i == 10000 && TextUtils.equals(str, "5.10.12 cancel timeout 7 minutes")) {
                LogUtil.a("FeedBackLogHelper", "cancel 5.10.12 timeout tip");
                FeedBackLogHelper.this.w.removeMessages(1041);
                FeedBackLogHelper.this.a(false);
                return;
            }
            ReleaseLogUtil.d("Dfx_FeedBackLogHelper", "mDfxCallback onSuccess errorCode = ", Integer.valueOf(i));
            FeedBackLogHelper feedBackLogHelper = FeedBackLogHelper.this;
            feedBackLogHelper.d(feedBackLogHelper.g);
            SharedPreferenceManager.d(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", 0);
            FeedBackLogHelper.this.v = true;
            FeedBackLogHelper.this.y = false;
            if (FeedBackLogHelper.this.e != null && FeedBackLogHelper.this.w != null) {
                FeedBackLogHelper.this.w.postDelayed(new Runnable() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.11.5
                    @Override // java.lang.Runnable
                    public void run() {
                        FeedBackLogHelper.this.d(FeedBackLogHelper.this.g);
                        if (!mjh.b(BaseApplication.getContext())) {
                            LogUtil.a("FeedBackLogHelper", "wifi and network are all disconnected.");
                            FeedBackLogHelper.this.q();
                            return;
                        }
                        if (mjh.e(BaseApplication.getContext())) {
                            FeedBackLogHelper.this.u = true;
                            FeedBackLogHelper.this.ad = true;
                            mjh.d(false);
                            FeedBackLogHelper.this.b();
                            if (!FeedBackLogHelper.this.i()) {
                                LogUtil.a("FeedBackLogHelper", "wifi upload 5.10.12 not timeout");
                                qpx.b(FeedBackLogHelper.this.d, R.string.IDS_hw_toast_log_upload_background);
                            }
                            LogUtil.a("FeedBackLogHelper", "start logging wifi upload");
                            lws.c(BaseApplication.getContext()).c(false, FeedBackLogHelper.this.k);
                            Message messageObtainMessage = FeedBackLogHelper.this.w.obtainMessage();
                            messageObtainMessage.what = 1021;
                            FeedBackLogHelper.this.w.sendMessageDelayed(messageObtainMessage, 600000L);
                            return;
                        }
                        if (!NetworkUtil.f()) {
                            LogUtil.a("FeedBackLogHelper", "Mobile is also disconnected");
                            FeedBackLogHelper.this.q();
                        } else {
                            LogUtil.a("FeedBackLogHelper", "wifi is dmIsConnected use network");
                            mjh.d(true);
                            lws.c(BaseApplication.getContext()).c(false, FeedBackLogHelper.this.k);
                            mjh.c(FeedBackLogHelper.this.an);
                        }
                    }
                }, 800L);
            } else {
                LogUtil.j("FeedBackLogHelper", "catch null pointer exception");
            }
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.a("Dfx_FeedBackLogHelper", "mDfxCallback onFailure errorCode = ", Integer.valueOf(i), ", errorMessage = ", str);
            FeedBackLogHelper.this.a(i, str);
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
        public void onProgress(int i, String str) {
            if (!FeedBackLogHelper.this.i()) {
                if (FeedBackLogHelper.this.e == null || FeedBackLogHelper.this.w == null) {
                    return;
                }
                LogUtil.a("FeedBackLogHelper", "update progress, progress: ", Integer.valueOf(i), ", progressDesc = ", str);
                if (!TextUtils.equals(str, FeedBackLogHelper.this.s) || FeedBackLogHelper.this.r != i) {
                    FeedBackLogHelper.this.s = str;
                    FeedBackLogHelper.this.r = i;
                    Message messageObtainMessage = FeedBackLogHelper.this.w.obtainMessage();
                    messageObtainMessage.what = 1026;
                    messageObtainMessage.arg1 = i;
                    messageObtainMessage.obj = str;
                    FeedBackLogHelper.this.w.sendMessage(messageObtainMessage);
                    return;
                }
                LogUtil.j("FeedBackLogHelper", "mDfxCallback onProgress same file process ignore");
                return;
            }
            LogUtil.j("FeedBackLogHelper", "mDfxCallback onProgress 5.10.12 already timeout");
        }
    };
    private final BroadcastReceiver ae = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.13
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.j("FeedBackLogHelper", "intent or intent.getAction is null");
                return;
            }
            LogUtil.a("FeedBackLogHelper", "phone service Died onReceive intent ", intent.getAction());
            if (!"com.huawei.health.action.ACTION_CALLBACKSERVICE_PHONESERVICE_DEAD".equals(intent.getAction())) {
                LogUtil.j("FeedBackLogHelper", "intent or intent.getAction is not equals");
                return;
            }
            xjt.r("FeedBackLogHelper, PhoneServiceDied broadcast: com.huawei.health.action.ACTION_CALLBACKSERVICE_PHONESERVICE_DEAD");
            if (SharedPreferenceManager.b(String.valueOf(10), "KEY_IS_CLICKED_BETA_FEEDBACK", false)) {
                xjt.r("FeedBackLogHelper, PhoneServiceDied CLICKED_BETA_FEEDBACK");
                DeviceInfo deviceInfoE = tfn.a().e(FeedBackLogHelper.this.k);
                if (deviceInfoE == null) {
                    ReleaseLogUtil.a("Dfx_FeedBackLogHelper", "currentDeviceInfo == null");
                    FeedBackLogHelper.this.b();
                    FeedBackLogHelper feedBackLogHelper = FeedBackLogHelper.this;
                    feedBackLogHelper.d(feedBackLogHelper.g);
                    SharedPreferenceManager.d(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", 0);
                    return;
                }
                int iC = SharedPreferenceManager.c(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", 0);
                if (iC < 1) {
                    ReleaseLogUtil.d("Dfx_FeedBackLogHelper", "retry time = 1");
                    if (FeedBackLogHelper.this.aa) {
                        FeedBackLogHelper.this.d(deviceInfoE);
                    } else {
                        FeedBackLogHelper.this.t();
                    }
                    SharedPreferenceManager.d(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", iC + 1);
                    return;
                }
                ReleaseLogUtil.a("Dfx_FeedBackLogHelper", "has reach retry time limit");
                FeedBackLogHelper.this.b();
                FeedBackLogHelper feedBackLogHelper2 = FeedBackLogHelper.this;
                feedBackLogHelper2.d(feedBackLogHelper2.g);
                SharedPreferenceManager.d(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", 0);
            }
        }
    };
    private final BroadcastReceiver ap = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.12
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkInfo activeNetworkInfo;
            if (intent == null || intent.getAction() == null) {
                LogUtil.j("FeedBackLogHelper", "intent or intent.getAction is null");
                return;
            }
            LogUtil.a("FeedBackLogHelper", "mWifiBroadcastReceiver onReceive intent ", intent.getAction(), " isAgree ", Boolean.valueOf(mjh.d()));
            if (!FeedBackLogHelper.this.u || FeedBackLogHelper.this.e.isFinishing()) {
                LogUtil.j("FeedBackLogHelper", "intent or intent.getAction not mIsFeedBackShowToast");
                return;
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                Object systemService = context.getSystemService("connectivity");
                if (systemService instanceof ConnectivityManager) {
                    LogUtil.a("FeedBackLogHelper", "connectivity action");
                    activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                } else {
                    activeNetworkInfo = null;
                }
                if (activeNetworkInfo != null) {
                    FeedBackLogHelper.this.b(activeNetworkInfo);
                    LogUtil.a("FeedBackLogHelper", "info.getTypeName()", activeNetworkInfo.getTypeName());
                    return;
                }
                LogUtil.a("FeedBackLogHelper", "has no network");
                FeedBackLogHelper.this.u = false;
                FeedBackLogHelper.this.ad = false;
                mjh.d(false);
                if (FeedBackLogHelper.this.i()) {
                    return;
                }
                LogUtil.a("FeedBackLogHelper", "has no network 5.10.12 not timeout");
                qpx.b(FeedBackLogHelper.this.d, R.string.IDS_hw_toast_log_upload_failed);
            }
        }
    };
    private final BroadcastReceiver ao = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.14
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || FeedBackLogHelper.this.y || !FeedBackLogHelper.this.u) {
                LogUtil.j("FeedBackLogHelper", "intent is null,mIsManualLog:", Boolean.valueOf(FeedBackLogHelper.this.y), "mIsFeedBackShowToast:", Boolean.valueOf(FeedBackLogHelper.this.u));
                return;
            }
            String action = intent.getAction();
            LogUtil.a("FeedBackLogHelper", "mUploadLogResultBroadcastReceiver action：", action);
            if ("com.huawei.crowdtestsdk.LOG_UPLOAD_RESULT".equals(action)) {
                FeedBackLogHelper.this.w.removeMessages(1021);
                int intExtra = intent.getIntExtra("logUploadResult", 1);
                LogUtil.a("FeedBackLogHelper", "result：", Integer.valueOf(intExtra));
                if (intExtra != 16) {
                    FeedBackLogHelper.this.a(intent);
                } else {
                    FeedBackLogHelper.this.w.sendEmptyMessageDelayed(1022, 1000L);
                }
            }
        }
    };
    private final BroadcastReceiver q = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.15
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            LogUtil.a("FeedBackLogHelper", "mUploadLogResultBroadcastReceiver action：", action);
            if ("com.huawei.health.action.H5_LIFE_CYCLE".equals(action) && "onDestroy".equals(intent.getStringExtra("lifeCycle"))) {
                FeedBackLogHelper.this.h();
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotifyPhoneServiceCallback f26138b = new AnonymousClass18();
    private Handler w = new Handler(Looper.getMainLooper()) { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.19
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            LogUtil.a("FeedBackLogHelper", "handleMessageWhenReferenceNotNull msg = ", message);
            int i = message.what;
            if (i == 1026) {
                FeedBackLogHelper.this.b(message);
                return;
            }
            if (i == 1033) {
                LogUtil.a("FeedBackLogHelper", "upload log DEVICE_GOTO_FEEDBACK");
                FeedBackLogHelper.this.g();
                return;
            }
            if (i != 1041) {
                switch (i) {
                    case 1021:
                        LogUtil.a("FeedBackLogHelper", "upload log overtimes");
                        FeedBackLogHelper.this.m();
                        break;
                    case 1022:
                        FeedBackLogHelper.this.l();
                        break;
                    case 1023:
                        FeedBackLogHelper.this.a(message);
                        break;
                    case 1024:
                        if (message.obj instanceof String) {
                            FeedBackLogHelper.this.d((String) message.obj);
                        }
                        break;
                    default:
                        LogUtil.j("FeedBackLogHelper", "dealReportResult, default");
                        break;
                }
                return;
            }
            FeedBackLogHelper.this.e();
        }
    };
    private Activity e = BaseApplication.getActivity();
    private Context d = BaseApplication.getContext();
    private UploadMaintLogInteractor ar = new UploadMaintLogInteractor(this.d.getApplicationContext());

    /* JADX INFO: loaded from: classes43.dex */
    public interface IResponseCallback {
        public static final int RESULT_FAIL = -1;
        public static final int RESULT_SUCCESS = 0;

        void onResponse(int i);
    }

    public FeedBackLogHelper() {
        this.ab = null;
        this.ab = Boolean.valueOf(Utils.k());
    }

    public void b(DeviceInfo deviceInfo) {
        this.f = deviceInfo;
        this.k = deviceInfo.getDeviceIdentify();
    }

    public void j() {
        if (Utils.o()) {
            ltr.b().setProductType(20);
        } else {
            ltr.b().setProductType(1);
        }
        c();
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.util.FeedBackLogHelper$18, reason: invalid class name */
    public class AnonymousClass18 implements NotifyPhoneServiceCallback {
        AnonymousClass18() {
        }

        @Override // com.huawei.hwdevice.mainprocess.callback.NotifyPhoneServiceCallback
        public void executeResponse(int i, final DeviceInfo deviceInfo, int i2, String str) {
            if (FeedBackLogHelper.this.e == null) {
                LogUtil.j("FeedBackLogHelper", "executeResponse mActivity == null ");
                return;
            }
            if (i == 0) {
                LogUtil.a("FeedBackLogHelper", "executeResponse progress : ", Integer.valueOf(i2));
                if (i2 == 100) {
                    FeedBackLogHelper.this.e.runOnUiThread(new Runnable() { // from class: tex
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f49037a.b();
                        }
                    });
                    FeedBackLogHelper.this.h(deviceInfo);
                    return;
                } else {
                    FeedBackLogHelper.this.d(i2, false);
                    return;
                }
            }
            if (i == 1) {
                LogUtil.a("FeedBackLogHelper", "executeResponse timeout");
                lvb.e().e("earphoneLogPre");
                FeedBackLogHelper.this.e.runOnUiThread(new Runnable() { // from class: tfa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49048c.c(deviceInfo);
                    }
                });
            } else {
                LogUtil.j("FeedBackLogHelper", "others");
                lvb.e().e("earphoneLogPre");
                FeedBackLogHelper.this.i(deviceInfo);
            }
        }

        public /* synthetic */ void b() {
            FeedBackLogHelper feedBackLogHelper = FeedBackLogHelper.this;
            feedBackLogHelper.d(feedBackLogHelper.j);
            SharedPreferenceManager.d(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", 0);
            lvb.e().e("earphoneLogPre");
        }

        public /* synthetic */ void c(DeviceInfo deviceInfo) {
            FeedBackLogHelper feedBackLogHelper = FeedBackLogHelper.this;
            feedBackLogHelper.d(feedBackLogHelper.j);
            SharedPreferenceManager.d(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", 0);
            FeedBackLogHelper.this.i(deviceInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        b();
        this.u = false;
        mjh.d(false);
        lws.c(BaseApplication.getContext()).c(false, this.k);
        if (i()) {
            return;
        }
        LogUtil.a("FeedBackLogHelper", "dealNetworkIsDisconnect 5.10.12 not timeout");
        qpx.b(this.d, R.string.IDS_hw_toast_log_upload_failed);
    }

    public void c(boolean z) {
        this.u = z;
    }

    public boolean d() {
        return this.u;
    }

    public boolean i() {
        return this.z;
    }

    public void a(boolean z) {
        this.z = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent) {
        String stringExtra = intent.getStringExtra("LogUploadFilePath");
        LogUtil.d("FeedBackLogHelper", "file：", stringExtra);
        if (stringExtra != null) {
            this.ad = false;
            if (new File(mjh.f41743c + stringExtra).exists()) {
                LogUtil.d("FeedBackLogHelper", "mUploadLogResultBroadcastReceiver log upload failed");
                this.w.post(new Runnable() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.17
                    @Override // java.lang.Runnable
                    public void run() {
                        FeedBackLogHelper.this.w.removeMessages(1022);
                        if (FeedBackLogHelper.this.i()) {
                            return;
                        }
                        LogUtil.a("FeedBackLogHelper", "dealWithLogUploadFail 5.10.12 not timeout");
                        qpx.b(FeedBackLogHelper.this.d, R.string.IDS_hw_toast_log_upload_failed);
                    }
                });
                return;
            }
        }
        this.w.sendEmptyMessageDelayed(1022, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(NetworkInfo networkInfo) {
        boolean zB = PowerKitManager.a().b();
        if (!networkInfo.isConnected() || zB) {
            LogUtil.a("FeedBackLogHelper", "network not connected ");
            this.u = false;
            mjh.d(false);
            if (i()) {
                return;
            }
            LogUtil.a("FeedBackLogHelper", "dealWithLogUploadFail 5.10.12 not timeout");
            qpx.b(this.d, R.string.IDS_hw_toast_log_upload_failed);
            return;
        }
        if (networkInfo.getType() == 1) {
            LogUtil.a("FeedBackLogHelper", "wifi available");
            return;
        }
        if (networkInfo.getType() == 0) {
            LogUtil.a("FeedBackLogHelper", "mobile available");
            if (mjh.d()) {
                return;
            }
            this.u = false;
            this.ad = false;
            mjh.d(false);
            if (i()) {
                return;
            }
            LogUtil.a("FeedBackLogHelper", "mobile available 5.10.12 not timeout");
            qpx.b(this.d, R.string.IDS_hw_toast_log_upload_failed);
            return;
        }
        LogUtil.j("FeedBackLogHelper", "activeNetwork else");
    }

    public void g() {
        LogUtil.a("FeedBackLogHelper", "enter handlerDeviceGotoFeedBack");
        if (Utils.o()) {
            ltr.b().setProductType(20);
        } else {
            ltr.b().setProductType(1);
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        Bundle data = message.getData();
        if (data != null) {
            int i = data.getInt("bugTypeId");
            String string = data.getString("fileLogId");
            String string2 = data.getString("dtsNumber");
            if (this.e == null || TextUtils.isEmpty(string2)) {
                return;
            }
            d(i, string2, string);
        }
    }

    public void m() {
        d(false);
        if (!d() || this.e.isFinishing()) {
            return;
        }
        LogUtil.a("FeedBackLogHelper", "upload log overtimes toast");
        if (!i()) {
            LogUtil.a("FeedBackLogHelper", "uploadLogTimeout 5.10.12 not timeout");
            qpx.b(this.d, R.string.IDS_hw_toast_log_upload_failed);
        }
        c(false);
        mjh.d(false);
    }

    public void b(Message message) {
        if (message == null || f()) {
            LogUtil.j("FeedBackLogHelper", "isCollectOver = ", Boolean.valueOf(f()));
            this.s = "";
            this.r = -1;
        } else {
            String str = message.obj instanceof String ? (String) message.obj : "";
            e(message.arg1, str);
            if (str.equals(this.af)) {
                return;
            }
            this.af = str;
            LogUtil.a("FeedBackLogHelper", "getDeviceLogProcess mLastProgressDesc :", str);
        }
    }

    public void e() {
        a(10001, "5.10.12 cancel timeout 7 minutes");
    }

    private void s() {
        if (this.l == null) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.e).a(R.string.IDS_about_feedback_log_title).b(R.string.IDS_about_feedback_logupload_content).a(R.string.IDS_user_permission_ok, new View.OnClickListener() { // from class: teo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49028b.b(view);
                }
            }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: tev
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("FeedBackLogHelper", "negative startFeedBackLog");
                }
            }).b();
            this.l = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
        }
        if (this.e.isFinishing()) {
            return;
        }
        this.l.show();
    }

    public /* synthetic */ void b(View view) {
        new Handler().post(new Runnable() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.1
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("FeedBackLogHelper", "positive startFeedBackLog");
                FeedBackLogHelper.this.p();
            }
        });
    }

    public void l() {
        boolean zI = mjh.i();
        this.ad = false;
        if (zI) {
            LogUtil.a("FeedBackLogHelper", "updateLogResult log upload success");
            if (!i()) {
                LogUtil.a("FeedBackLogHelper", "updateLogResult 5.10.12 not timeout");
                qpx.b(this.d, R.string.IDS_hw_toast_log_upload_success);
            }
            this.u = false;
            mjh.d(false);
            this.w.removeMessages(1022);
            return;
        }
        LogUtil.a("FeedBackLogHelper", "File not uploaded, waiting for file upload");
        Message messageObtainMessage = this.w.obtainMessage();
        messageObtainMessage.what = 1021;
        this.w.sendMessageDelayed(messageObtainMessage, 600000L);
    }

    public void d(String str) {
        LogUtil.a("FeedBackLogHelper", "showIsUseFlowDialogWith2Button enter.");
        CustomViewDialog customViewDialog = this.t;
        if (customViewDialog != null) {
            this.ac = false;
            customViewDialog.cancel();
            this.ak = "";
        }
        if (i()) {
            LogUtil.a("FeedBackLogHelper", "showIsUseFlowDialogWith2Button 5.10.12 already timeout");
            return;
        }
        View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.commonui_custom_view_tow_button, (ViewGroup) null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.dialog_alert_message);
        HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.dialog_btn_upload_now);
        HealthButton healthButton2 = (HealthButton) viewInflate.findViewById(R.id.dialog_btn_upload_by_wifi);
        healthButton.setText(this.e.getResources().getString(R.string.IDS_device_log_upload_now));
        healthButton2.setText(this.e.getResources().getString(R.string.IDS_device_log_upload_wifi));
        healthTextView.setText(str);
        this.ak = str;
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.e);
        builder.d(viewInflate);
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: tes
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.f(view);
            }
        });
        healthButton2.setOnClickListener(new View.OnClickListener() { // from class: tey
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.j(view);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.t = customViewDialogD;
        customViewDialogD.setCancelable(false);
        if (this.e.isFinishing()) {
            return;
        }
        this.t.show();
        this.ac = true;
    }

    public /* synthetic */ void f(View view) {
        a();
        b();
        if (!mjh.b(this.d)) {
            qpx.b(this.d, R.string.IDS_hw_toast_log_upload_failed);
            LogUtil.a("FeedBackLogHelper", "start showIsUseFlowDialogWith2Button showLongToast.");
            return;
        }
        if (!mjh.o(mjh.f41743c) && !mjh.o(mjh.e)) {
            this.ad = false;
            this.u = false;
            mjh.d(false);
            LogUtil.j("FeedBackLogHelper", "isHasZip is not wearable log");
            return;
        }
        this.ad = true;
        this.u = true;
        qpx.b(this.d, R.string.IDS_hw_toast_log_upload_background);
        LogUtil.a("FeedBackLogHelper", "start uploading log.");
        mjh.s(this.k);
        Message messageObtainMessage = this.w.obtainMessage();
        messageObtainMessage.what = 1021;
        this.w.sendMessageDelayed(messageObtainMessage, 600000L);
    }

    public /* synthetic */ void j(View view) {
        a();
        b();
        qpx.b(this.d, R.string.IDS_hw_toast_log_auto_upload_wlan);
        this.u = false;
        this.ad = false;
        mjh.d(false);
    }

    public void d(int i, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str3 = nio.e(this.k) + "BETA_QUESTION";
        try {
            long j = Long.parseLong(SharedPreferenceManager.e(this.d, String.valueOf(10), str3));
            LogUtil.a("FeedBackLogHelper", "WearHomeActivity currentTime is: ", Long.valueOf(jCurrentTimeMillis), ", lastTime is: ", Long.valueOf(j));
            if (jCurrentTimeMillis - j < 300000) {
                LogUtil.j("FeedBackLogHelper", "WearHomeActivity Less than five minutes");
                return;
            }
        } catch (NumberFormatException unused) {
            LogUtil.e("FeedBackLogHelper", "WearHomeActivity NumberFormatException");
        }
        SharedPreferenceManager.e(this.d, String.valueOf(10), str3, String.valueOf(jCurrentTimeMillis), new StorageParams(0));
        lws lwsVarC = lws.c(this.d);
        lwsVarC.b(i, str, str2);
        lwsVarC.b(0, this.k, new DeviceDfxBaseResponseCallback() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.2
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
            public void onSuccess(int i2, String str4) {
                ReleaseLogUtil.d("Dfx_FeedBackLogHelper", "handlerGetDeviceLog onSuccess successCode = ", Integer.valueOf(i2));
                mfz.d(3, true);
                FeedBackLogHelper.this.ar.d(false, FeedBackLogHelper.this.k);
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
            public void onFailure(int i2, String str4) {
                ReleaseLogUtil.a("Dfx_FeedBackLogHelper", "handlerGetDeviceLog onFailure errorCode = ", Integer.valueOf(i2), ", errorMessage = ", str4);
                mfz.d(3, true);
                FeedBackLogHelper.this.ar.d(false, FeedBackLogHelper.this.k);
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
            public void onProgress(int i2, String str4) {
                LogUtil.j("FeedBackLogHelper", "onProgress");
            }
        });
    }

    private void c(final int i, final String str) {
        LogUtil.a("FeedBackLogHelper", "startEarphoneDownLoadProgress progress: ", Integer.valueOf(i), " and progressDesc: ", str);
        Activity activity = this.e;
        if (activity == null) {
            LogUtil.j("FeedBackLogHelper", "startEarphoneDownLoadProgress mActivity == null ");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: ter
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49034c.d(i, str);
                }
            });
        }
    }

    public /* synthetic */ void d(int i, String str) {
        CustomProgressDialog customProgressDialog = this.j;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            this.i.b(i);
            this.i.d(i);
            return;
        }
        this.j = new CustomProgressDialog(this.d);
        CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.e);
        this.i = builder;
        builder.e(str);
        CustomProgressDialog customProgressDialogC = this.i.c();
        this.j = customProgressDialogC;
        customProgressDialogC.setCanceledOnTouchOutside(false);
        this.j.setCancelable(false);
        if (this.e.isFinishing()) {
            return;
        }
        this.j.show();
        this.i.b(0);
        this.i.d(0);
    }

    private void j(final DeviceInfo deviceInfo) {
        if (this.e == null) {
            LogUtil.j("FeedBackLogHelper", "startEarphoneDownLoadProgress mActivity == null ");
            return;
        }
        if (this.m == null) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.e).a(R.string.IDS_earphone_log_collect_title).b(R.string.IDS_earphone_log_collect_request_tips).b((Boolean) true).a(R.string.IDS_user_permission_ok, new View.OnClickListener() { // from class: tew
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.b(deviceInfo, view);
                }
            }).e(R.string.IDS_earphone_log_collect_ignore_tips, new View.OnClickListener() { // from class: tep
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.a(deviceInfo, view);
                }
            }).b();
            this.m = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
        }
        if (this.e.isFinishing()) {
            return;
        }
        this.m.show();
    }

    public /* synthetic */ void b(DeviceInfo deviceInfo, View view) {
        g(deviceInfo);
    }

    public /* synthetic */ void a(DeviceInfo deviceInfo, View view) {
        LogUtil.a("FeedBackLogHelper", "negative showEarphoneLogCollectDialog");
        c(deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final DeviceInfo deviceInfo) {
        if (this.e == null) {
            LogUtil.j("FeedBackLogHelper", "showEarphoneLogCollectFailedDialog mActivity == null ");
            return;
        }
        if (this.o == null) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.e).a(R.string.IDS_earphone_log_collect_failed_title).b(R.string.IDS_earphone_log_collect_failed_tips).a(R.string.IDS_notify_retry, new View.OnClickListener() { // from class: ten
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49027a.e(deviceInfo, view);
                }
            }).e(R.string.IDS_earphone_log_collect_ignore_tips, new View.OnClickListener() { // from class: teq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49031c.c(deviceInfo, view);
                }
            }).b();
            this.o = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
        }
        if (this.e.isFinishing()) {
            return;
        }
        this.o.show();
    }

    public /* synthetic */ void e(DeviceInfo deviceInfo, View view) {
        j(deviceInfo);
    }

    public /* synthetic */ void c(DeviceInfo deviceInfo, View view) {
        LogUtil.a("FeedBackLogHelper", "negative showEarphoneLogCollectFailedDialog");
        h(deviceInfo);
        lvb.e().e("earphoneLogPre");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(DeviceInfo deviceInfo) {
        Handler handler;
        if (this.e == null || (handler = this.w) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.3
            @Override // java.lang.Runnable
            public void run() {
                FeedBackLogHelper.this.v();
            }
        });
    }

    private void g(DeviceInfo deviceInfo) {
        c(0, this.d.getString(R.string.IDS_earphone_log_collect_tips));
        lvb.e().b("earphoneLogPre", this.f26138b);
        LogUtil.a("FeedBackLogHelper", "start sendDeviceEvent");
        lvb.e().b("earphoneLogPre", deviceInfo, 0, "1");
    }

    private void c(DeviceInfo deviceInfo) {
        Handler handler;
        if (this.e == null || (handler = this.w) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.5
            @Override // java.lang.Runnable
            public void run() {
                FeedBackLogHelper.this.v();
                lvb.e().e("earphoneLogPre");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, boolean z) {
        LogUtil.a("FeedBackLogHelper", "progress: ", Integer.valueOf(i), ",isTimeout: ", Boolean.valueOf(z));
        c(i, this.d.getString(R.string.IDS_earphone_log_collect_tips));
    }

    private void n() {
        HealthFeedbackParams healthFeedbackParams = new HealthFeedbackParams();
        DeviceInfo deviceInfoE = tfn.a().e(this.k);
        if (deviceInfoE != null) {
            LogUtil.a("FeedBackLogHelper", "goBetaFeedBack");
            String securityDeviceId = deviceInfoE.getSecurityDeviceId();
            String deviceIdentify = deviceInfoE.getDeviceIdentify();
            String udidFromDevice = deviceInfoE.getUdidFromDevice();
            int productType = deviceInfoE.getProductType();
            if (TextUtils.isEmpty(udidFromDevice)) {
                udidFromDevice = a(securityDeviceId, deviceIdentify, productType);
            }
            healthFeedbackParams.setDeviceId(udidFromDevice);
            healthFeedbackParams.setProductVersion(deviceInfoE.getSoftVersion());
            a(healthFeedbackParams, deviceInfoE);
            c(healthFeedbackParams);
            return;
        }
        LogUtil.d("FeedBackLogHelper", "no device");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        LogUtil.a("FeedBackLogHelper", "postStartFeedBackLog in. ");
        DeviceInfo deviceInfoE = tfn.a().e(this.k);
        boolean zD = eey.d(deviceInfoE, 134);
        LogUtil.a("FeedBackLogHelper", "handlerGetDeviceLog isSupportGet earPhone log isSupportEarphoneLogCollect: ", Boolean.valueOf(zD));
        if (zD) {
            j(deviceInfoE);
        } else {
            v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        LogUtil.a("FeedBackLogHelper", "send startFeedBackLog");
        if (!mjh.b(this.d)) {
            LogUtil.a("FeedBackLogHelper", "FeedBackLog is NoNetworkActive");
            qpx.b(this.d, R.string.IDS_hw_toast_log_upload_failed);
            return;
        }
        DeviceInfo deviceInfoE = tfn.a().e(this.k);
        if (deviceInfoE != null && deviceInfoE.getDeviceConnectState() != 2) {
            LogUtil.j("FeedBackLogHelper", "bt is dmIsConnected");
            b(R.string.IDS_hw_show_log_bt_disconnect, "");
            return;
        }
        if (lws.c(this.d).c(this.f)) {
            LogUtil.a("FeedBackLogHelper", "mIsSelected: ", Boolean.valueOf(this.aa));
            this.y = true;
            if (this.aa) {
                a(deviceInfoE);
                return;
            } else {
                k();
                return;
            }
        }
        LogUtil.a("FeedBackLogHelper", "device is not supported");
        if (!mjh.b(this.d)) {
            b();
            this.u = false;
            mjh.d(false);
            qpx.b(this.d, R.string.IDS_hw_toast_log_upload_failed);
            return;
        }
        if (!mjh.e(this.d)) {
            LogUtil.a("FeedBackLogHelper", "wifi is dmIsConnected , use network");
            mjh.d(true);
            lws.c(BaseApplication.getContext()).c(false, this.k);
            mjh.c(this.an);
            return;
        }
        this.u = true;
        b();
        qpx.b(this.d, R.string.IDS_hw_toast_log_upload_background);
        LogUtil.a("FeedBackLogHelper", "start logging wifi uploading");
        lws.c(BaseApplication.getContext()).c(false, this.k);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1021;
        this.w.sendMessageDelayed(messageObtain, 600000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        LogUtil.a("FeedBackLogHelper", "collectDeviceLog");
        this.al = this.d.getString(R.string.IDS_hw_show_log_progress);
        x();
        DeviceInfo deviceInfoC = mgg.c(this.k, "FeedBackLogHelper");
        if (deviceInfoC != null && mjh.k(deviceInfoC.getDeviceIdentify()) && eey.d(deviceInfoC, 217)) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1041;
            this.w.sendMessageDelayed(messageObtain, 420000L);
            a(false);
        }
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.6
            @Override // java.lang.Runnable
            public void run() {
                mfz.d(2, true);
                lws.c(FeedBackLogHelper.this.d).d(FeedBackLogHelper.this.k, FeedBackLogHelper.this.n);
            }
        });
    }

    private void a(DeviceInfo deviceInfo) {
        this.al = this.d.getString(R.string.IDS_device_capture_tips);
        x();
        d(deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo) {
        lws.c(this.d).b(deviceInfo, new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("FeedBackLogHelper", "onResponse errorCode: ", Integer.valueOf(i));
                lws.c(FeedBackLogHelper.this.d).e();
                FeedBackLogHelper.this.e.runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.9.4
                    @Override // java.lang.Runnable
                    public void run() {
                        FeedBackLogHelper.this.b();
                        FeedBackLogHelper.this.k();
                    }
                });
            }
        });
    }

    public void c() {
        LogUtil.a("FeedBackLogHelper", "goBetaFeedBack");
        n();
    }

    private String a(String str, String str2, int i) {
        String strE;
        boolean z = !str2.contains(":") && str2.length() > 12;
        if (!Utils.o() && !z) {
            strE = str2.replace(":", "");
        } else {
            strE = nio.e(str);
            if (strE.length() >= 24) {
                strE = e(strE);
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

    private String e(String str) {
        if (str == null) {
            return "";
        }
        return str.length() >= 24 ? str.replace(Marker.ANY_NON_NULL_MARKER, "A").replace("/", "A").replace("=", "A").substring(0, 24) : str;
    }

    private void c(HealthFeedbackParams healthFeedbackParams) {
        LogUtil.a("FeedBackLogHelper", "sendFeedback");
        lwp.a().b(this.d, healthFeedbackParams, new a(this.e, this.w));
    }

    static class a implements HealthFeedbackCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<Activity> f26154a;
        private Handler e;

        private a(Activity activity, Handler handler) {
            this.f26154a = new WeakReference<>(activity);
            this.e = handler;
        }

        @Override // com.huawei.hwcrowdtestapi.HealthFeedbackCallback
        public void onFailed(String str) {
            Activity activity = this.f26154a.get();
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                LogUtil.j("FeedBackLogHelper", "onFailed activity is null, finish or destroyed");
            } else {
                LogUtil.d("FeedBackLogHelper", "gotoFeedBack failed");
            }
        }

        @Override // com.huawei.hwcrowdtestapi.HealthFeedbackCallback
        public ltn collectLogs(int i, String str, String str2, boolean z) {
            LogUtil.a("FeedBackLogHelper", "bugTypeId: ", Integer.valueOf(i), "tbdtsNo: ", str2, ";fileLogId: ", str);
            Activity activity = this.f26154a.get();
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                LogUtil.j("FeedBackLogHelper", "onFailed activity is null, finish or destroyed");
                return null;
            }
            mjh.a(z);
            Object objA = qrc.a(913000005);
            qrc.c(objA, qrc.e("E913000005_ERRCODE_TINYINT"), 0);
            qrc.c(objA, qrc.e("E913000005_SUBERRCODE_TINYINT"), 1);
            LogUtil.a("FeedBackLogHelper", "ReflectionIMonitor isSendEvent is", Boolean.valueOf(qrc.a(objA)));
            qrc.b(objA);
            ArrayList arrayList = new ArrayList(0);
            String strO = LogConfig.o();
            if (!Utils.o() && !TextUtils.isEmpty(strO)) {
                LogUtil.a("FeedBackLogHelper", "add tracktest path");
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
            this.e.sendMessageDelayed(messageObtain, 5000L);
            return ltnVar;
        }
    }

    private void a(HealthFeedbackParams healthFeedbackParams, DeviceInfo deviceInfo) {
        String securityDeviceId = deviceInfo.getSecurityDeviceId();
        if (!TextUtils.isEmpty(securityDeviceId) && securityDeviceId.contains(":")) {
            securityDeviceId = securityDeviceId.replace(":", "");
        }
        int productType = deviceInfo.getProductType();
        String deviceModel = deviceInfo.getDeviceModel();
        String strC = mjj.c().c(productType, mjj.c().a(productType, deviceModel), deviceModel);
        if (deviceModel != null && eei.b(deviceModel)) {
            LogUtil.a("FeedBackLogHelper", "addGoBetaFeedBackParams currentDevice is honor device");
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
        if (this.e.isFinishing()) {
            return;
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.e);
        builder.a(R.string.IDS_service_area_notice_title);
        String string = this.e.getString(i);
        builder.a(string);
        ReleaseLogUtil.d("Dfx_FeedBackLogHelper", "showErrDialog content = " + string + ", errorCode = " + str);
        xjt.r("Dfx_FeedBackLogHelpershowErrDialog content = " + string + ", errorCode = " + str);
        builder.a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: teu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("FeedBackLogHelper", "showErrDialog onclick PositiveButton");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        if (customTextAlertDialogB.isShowing()) {
            return;
        }
        customTextAlertDialogB.show();
    }

    private void x() {
        LogUtil.a("FeedBackLogHelper", "showLoadingDialog()");
        if (this.e.isFinishing()) {
            return;
        }
        CommonDialog21 commonDialog21 = this.ag;
        if (commonDialog21 == null) {
            new CommonDialog21(this.d, R.style.app_update_dialogActivity);
            CommonDialog21 commonDialog21B = CommonDialog21.b(this.e);
            this.ag = commonDialog21B;
            commonDialog21B.b(this.al);
            this.ag.setCancelable(false);
        } else {
            commonDialog21.b(this.al);
        }
        if (this.ag.isShowing()) {
            return;
        }
        this.ag.c();
        LogUtil.a("FeedBackLogHelper", "mLoadingUserInformationDialog.show()");
    }

    public void b() {
        CommonDialog21 commonDialog21;
        LogUtil.a("FeedBackLogHelper", "enter dismissLoadingDialog()");
        if (this.e.isFinishing() || (commonDialog21 = this.ag) == null || !commonDialog21.isShowing()) {
            return;
        }
        LogUtil.a("FeedBackLogHelper", "dismissLoadingDialog()!");
        try {
            this.ag.cancel();
        } catch (IllegalArgumentException e) {
            LogUtil.e("FeedBackLogHelper", ExceptionUtils.c(e));
        }
        this.ag = null;
    }

    public void a() {
        if (this.e.isFinishing()) {
            return;
        }
        LogUtil.a("FeedBackLogHelper", "enter dismissIsUseFlowDialogWith2Button()");
        CustomViewDialog customViewDialog = this.t;
        if (customViewDialog == null || !customViewDialog.isShowing()) {
            return;
        }
        LogUtil.a("FeedBackLogHelper", "dismissIsUseFlowDialogWith2Button()!");
        this.ac = false;
        this.t.dismiss();
        this.t = null;
        this.ak = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(CustomProgressDialog customProgressDialog) {
        LogUtil.a("FeedBackLogHelper", "enter closeProgress");
        if (customProgressDialog == null || !customProgressDialog.isShowing() || this.e.isFinishing()) {
            return;
        }
        customProgressDialog.cancel();
        LogUtil.a("FeedBackLogHelper", "enter closeProgress cancel");
    }

    public void e(int i, String str) {
        CustomProgressDialog customProgressDialog = this.g;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            this.h.b(i);
            this.h.d(i);
            this.h.e(str);
            return;
        }
        CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.e);
        this.h = builder;
        builder.e(str);
        CustomProgressDialog customProgressDialogC = this.h.c();
        this.g = customProgressDialogC;
        customProgressDialogC.setCanceledOnTouchOutside(false);
        this.g.setCancelable(false);
        if (this.e.isFinishing()) {
            return;
        }
        this.g.show();
        this.h.b(0);
        this.h.d(0);
    }

    public void a(final int i, final String str) {
        Handler handler;
        LogUtil.a("FeedBackLogHelper", "get device log failed, errorMessage = ", str);
        d(this.g);
        SharedPreferenceManager.d(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", 0);
        this.y = false;
        if (this.e == null || (handler = this.w) == null) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.7
            @Override // java.lang.Runnable
            public void run() {
                FeedBackLogHelper feedBackLogHelper = FeedBackLogHelper.this;
                feedBackLogHelper.d(feedBackLogHelper.g);
                FeedBackLogHelper.this.b();
                if (!FeedBackLogHelper.this.i()) {
                    LogUtil.j("FeedBackLogHelper", "doOnFailure 5.10.12 not timeout");
                    if (TextUtils.equals(str, "5.10.12 cancel timeout 7 minutes")) {
                        FeedBackLogHelper.this.b(R.string.IDS_hw_show_log_bt_timeout_restart, i + "");
                        FeedBackLogHelper.this.a(true);
                    } else {
                        FeedBackLogHelper.this.b(R.string.IDS_hw_show_log_bt_disconnect, i + "");
                    }
                }
                lws.c(BaseApplication.getContext()).c(false, FeedBackLogHelper.this.k);
            }
        }, 800L);
    }

    public void o() {
        this.aa = false;
        this.v = false;
        if (this.ad) {
            y();
            return;
        }
        DeviceInfo deviceInfoE = tfn.a().e(this.k);
        if (deviceInfoE != null) {
            e(deviceInfoE);
        }
    }

    private void e(DeviceInfo deviceInfo) {
        DeviceInfo deviceInfoC;
        if (deviceInfo.getExpandCapability() == null && (deviceInfoC = mgg.c(deviceInfo.getDeviceIdentify(), "FeedBackLogHelper")) != null) {
            deviceInfo.setExpandCapability(deviceInfoC.getExpandCapability());
        }
        boolean zD = eey.d(deviceInfo, 32);
        LogUtil.a("FeedBackLogHelper", "isSupportCapture: ", Boolean.valueOf(zD));
        if (zD) {
            w();
        } else {
            s();
        }
    }

    private void y() {
        View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.hw_show_uploading_view, (ViewGroup) null);
        CustomAlertDialog.Builder builderA = new CustomAlertDialog.Builder(this.e).a(R.string.IDS_common_notification_know_tips, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.10
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (FeedBackLogHelper.this.aq != null) {
                    FeedBackLogHelper.this.aq.dismiss();
                    FeedBackLogHelper.this.aq = null;
                }
            }
        });
        this.aq = builderA.b();
        builderA.a(viewInflate);
        this.aq.setCancelable(false);
        if (this.aq.isShowing() || this.e.isFinishing()) {
            return;
        }
        this.aq.show();
    }

    private void w() {
        if (this.p == null) {
            View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.hw_show_select_option_view, (ViewGroup) null);
            CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(this.e).b(R.string.IDS_about_feedback_log_title).d(viewInflate).d(R.string.IDS_user_permission_ok, new View.OnClickListener() { // from class: tem
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.d(view);
                }
            }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: tet
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49035a.a(view);
                }
            }).d();
            this.p = customViewDialogD;
            customViewDialogD.setCancelable(false);
            if (!g(viewInflate)) {
                LogUtil.j("FeedBackLogHelper", "showGenderPickerDialog() dialog layout fail");
                this.p = null;
                return;
            }
        }
        if (this.e.isFinishing()) {
            return;
        }
        r();
        this.p.show();
    }

    public /* synthetic */ void d(View view) {
        new Handler().post(new Runnable() { // from class: com.huawei.ui.homehealth.util.FeedBackLogHelper.8
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("FeedBackLogHelper", "positive startFeedBackLog: ", Boolean.valueOf(FeedBackLogHelper.this.aa));
                SharedPreferenceManager.a(String.valueOf(10), "KEY_IS_CLICKED_BETA_FEEDBACK", true);
                FeedBackLogHelper.this.p();
            }
        });
    }

    public /* synthetic */ void a(View view) {
        LogUtil.a("FeedBackLogHelper", "negative startFeedBackLog: ", Boolean.valueOf(this.aa));
        SharedPreferenceManager.a(String.valueOf(10), "KEY_IS_CLICKED_BETA_FEEDBACK", false);
    }

    private boolean g(View view) {
        LogUtil.a("FeedBackLogHelper", "initializeGenderDialogLayout()");
        if (view == null) {
            return false;
        }
        this.x = (HealthTextView) view.findViewById(R.id.textView_content);
        this.ai = (HealthRadioButton) view.findViewById(R.id.radiobutton_log_include_capture);
        this.ah = (HealthRadioButton) view.findViewById(R.id.radiobutton_log_exclude_capture);
        this.am = (RelativeLayout) view.findViewById(R.id.relativelayout_log_include_capture);
        this.aj = (RelativeLayout) view.findViewById(R.id.relativelayout_log_exclude_capture);
        this.am.setOnClickListener(new b(true));
        this.aj.setOnClickListener(new b(false));
        this.x.setText(R.string.IDS_about_feedback_logupload_content);
        r();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.aa) {
            this.ai.setChecked(true);
            this.ah.setChecked(false);
        } else {
            this.ai.setChecked(false);
            this.ah.setChecked(true);
        }
    }

    class b implements View.OnClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f26155c;

        b(boolean z) {
            this.f26155c = z;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogUtil.a("FeedBackLogHelper", "MySelectionOptionOnClickListener onClick(), isSelect:", Boolean.valueOf(this.f26155c));
            FeedBackLogHelper.this.aa = this.f26155c;
            FeedBackLogHelper.this.r();
        }
    }

    public void h() {
        a();
        b();
        LogUtil.a("FeedBackLogHelper", "onDestroy enter");
        tqp.d(this.e, this.ap);
        tqp.d(this.e, this.ao);
        LogUtil.a("FeedBackLogHelper", "mUploadLogResultBroadcastReceiver unRegisterBroadcastNormal");
        tqp.d(this.e, this.ae);
        lvb.e().e("earphoneLogPre");
        tqp.d(this.e, this.q);
        this.ad = false;
        this.u = false;
        mjh.d(false);
        SharedPreferenceManager.a(String.valueOf(10), "KEY_IS_CLICKED_BETA_FEEDBACK", false);
        SharedPreferenceManager.d(String.valueOf(10), "KEY_RETRY_BETA_FEEDBACK_TIMES", 0);
        a(false);
    }

    public boolean f() {
        return this.v;
    }

    public void d(boolean z) {
        this.ad = z;
    }
}
