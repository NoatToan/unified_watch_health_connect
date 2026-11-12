package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.media3.exoplayer.DefaultLoadControl;
import com.huawei.agconnect.apms.Agent;
import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.kit.devicelogmgr.FilePuller;
import com.huawei.health.device.kit.devicelogmgr.FilePullerCallback;
import com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcrowdtestapi.HealthFeedbackCallback;
import com.huawei.hwcrowdtestapi.HealthFeedbackParams;
import com.huawei.hwcrowdtestapi.HealthSendLogCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.up.utils.Constants;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class dnn {
    private static String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WspFileTransferCallback f32061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f32062b;
    private WeakReference<Activity> f;
    private String g;
    private String j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<NoTitleCustomAlertDialog> f32063c = new WeakReference<>(null);
    private int e = 0;
    private FilePuller h = new dnk();
    private Handler i = new b();

    public dnn(Activity activity, String str, String str2) {
        this.j = str;
        this.g = str2;
        this.f = new WeakReference<>(activity);
    }

    public void a() {
        LogUtil.a("HwFileLogUpload", "start uploadDeviceLog Device Log");
        MeasurableDevice measurableDeviceB = dmp.d().b(this.g, false);
        if (measurableDeviceB instanceof eby) {
            LogUtil.a("HwFileLogUpload", "upload log wifi device");
            b((eby) measurableDeviceB);
        } else if (measurableDeviceB instanceof efx) {
            LogUtil.a("HwFileLogUpload", "upload log bluetooth device");
            d();
        } else {
            LogUtil.j("HwFileLogUpload", "No Device Log");
        }
    }

    private void b(eby ebyVar) {
        Activity activity = this.f.get();
        if (!(activity instanceof DeviceMainActivity)) {
            LogUtil.j("HwFileLogUpload", "mMainActivity not instanceof DeviceMainActivity");
        } else if (activity.isDestroyed() || activity.isFinishing()) {
            LogUtil.j("HwFileLogUpload", "mMainActivity is destroyed or finishing");
        } else {
            b(activity, ebyVar);
        }
    }

    private void b(final Activity activity, eby ebyVar) {
        LogUtil.a("HwFileLogUpload", "upload wifi device log two");
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.j);
        bundle.putString("deviceId", ebyVar.e());
        final dwl dwlVar = new dwl(activity);
        dwlVar.c(activity, R.string.IDS_hw_show_log_upload_progress, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS);
        dwlVar.d();
        this.h.syncDeviceLog(bundle, new FilePullerCallback() { // from class: dnn.4
            @Override // com.huawei.health.device.kit.devicelogmgr.FilePullerCallback
            public void onFail(int i) {
                LogUtil.j("HwFileLogUpload", "File log upload is fail");
                HandlerExecutor.b(new Runnable() { // from class: dnn.4.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (activity.isDestroyed() || activity.isFinishing()) {
                            LogUtil.j("HwFileLogUpload", "mMainActivity is destroyed or finishing");
                        } else {
                            dwlVar.c(activity, R.string.IDS_device_rope_beta_upload_failed, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS);
                            dwlVar.d();
                        }
                    }
                });
            }

            @Override // com.huawei.health.device.kit.devicelogmgr.FilePullerCallback
            public void onSuccess(Object obj) {
                LogUtil.a("HwFileLogUpload", "File log upload is success");
                HandlerExecutor.b(new Runnable() { // from class: dnn.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (activity.isDestroyed() || activity.isFinishing()) {
                            LogUtil.j("HwFileLogUpload", "mMainActivity is destroyed or finishing");
                        } else {
                            dwlVar.c(activity, R.string.IDS_device_rope_beta_upload_success, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS);
                            dwlVar.d();
                        }
                    }
                });
            }

            @Override // com.huawei.health.device.kit.devicelogmgr.FilePullerCallback
            public void onProgress(int i, String str) {
                LogUtil.a("HwFileLogUpload", "File log upload progress status = ", Integer.valueOf(i), ",desc =", str);
            }
        });
    }

    private HealthFeedbackParams c() {
        HealthFeedbackParams healthFeedbackParams = new HealthFeedbackParams();
        healthFeedbackParams.setProductType(1);
        MeasurableDevice measurableDeviceB = dmp.d().b(this.g, false);
        if (measurableDeviceB != null) {
            healthFeedbackParams.setProductName(measurableDeviceB.getDeviceName());
            healthFeedbackParams.setDeviceModel(dxm.g(this.j));
            if (measurableDeviceB instanceof eby) {
                eby ebyVar = (eby) measurableDeviceB;
                healthFeedbackParams.setDeviceId(nio.c(ebyVar.a().l() + "000000000000").toUpperCase(Locale.ENGLISH));
                healthFeedbackParams.setDeviceSn(ebyVar.a().l());
                String strM = dxm.m(this.g);
                if (TextUtils.isEmpty(strM)) {
                    strM = dxm.m(this.j);
                }
                if (!TextUtils.isEmpty(strM)) {
                    healthFeedbackParams.setProductVersion(strM);
                    return healthFeedbackParams;
                }
                healthFeedbackParams.setProductVersion(ebyVar.a().b());
                return healthFeedbackParams;
            }
            if (measurableDeviceB instanceof efx) {
                String strM2 = dxm.m(this.g);
                if (TextUtils.isEmpty(strM2)) {
                    strM2 = dxm.m(this.j);
                }
                healthFeedbackParams.setProductVersion(strM2);
                String strL = dxm.l(this.g);
                if (TextUtils.isEmpty(strL)) {
                    dxm.n(this.j);
                }
                healthFeedbackParams.setDeviceSn(strL);
                healthFeedbackParams.setDeviceId(nio.c(healthFeedbackParams.getDeviceSn() + "000000000000").toUpperCase(Locale.ENGLISH));
                return healthFeedbackParams;
            }
            LogUtil.j("HwFileLogUpload", "switchToSubUserWifiPage, nos bond device");
        }
        return healthFeedbackParams;
    }

    private ltp f() {
        int i;
        ltp ltpVar = new ltp();
        Context context = BaseApplication.getContext();
        ltpVar.d(context.getPackageName());
        ltpVar.e(LoginInit.getInstance(context).getAccountInfo(1009));
        ltpVar.b(LoginInit.getInstance(context).getAccountInfo(1008));
        ltpVar.j("at");
        String strK = CommonUtil.k(context);
        if (TextUtils.isEmpty(strK)) {
            strK = "000000000000000";
        }
        ltpVar.a(strK);
        try {
            String deviceType = SharedPreferenceUtil.getInstance(context).getDeviceType();
            i = deviceType != null ? Integer.parseInt(deviceType) : 0;
        } catch (NumberFormatException e2) {
            LogUtil.e("HwFileLogUpload", "exception:", LogAnonymous.b(e2));
        }
        ltpVar.e(Integer.valueOf(i));
        ltpVar.h(LoginInit.getInstance(context).getAccountInfo(1001));
        ltpVar.c(Agent.OS_NAME);
        ltpVar.b(Integer.valueOf(Constants.HEALTH_APP_LOGIN_CHANNEL));
        return ltpVar;
    }

    public void b() {
        LogUtil.a("HwFileLogUpload", "Enter gotoBetaFeedback!");
        HealthFeedbackParams healthFeedbackParamsC = c();
        ltr.b().gotoFeedback(BaseApplication.getContext(), f(), healthFeedbackParamsC, new e(this.i, healthFeedbackParamsC, this.f.get()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final HealthFeedbackParams healthFeedbackParams) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: dnn.5
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                ArrayList arrayList = new ArrayList(16);
                String strK = LogConfig.k();
                LogUtil.a("HwFileLogUpload", "root path ", strK);
                arrayList.add(strK + "com.huawei.health");
                arrayList.add(strK + "com.huawei.health.h5pro");
                arrayList.add(strK + "com.huawei.health_DaemonService");
                arrayList.add(strK + "com.huawei.health_pushservice");
                arrayList.add(strK + "huawei_crashLog_0.txt");
                arrayList.add(strK + "leak.txt");
                arrayList.add(strK + "LogAnalysis.txt");
                DfxBaseHandler.getAllDfxLogFileToPathList(new File(strK), arrayList);
                String strB = dnn.this.b(healthFeedbackParams, "_app_WearableBeta.zip");
                String strI = dnn.this.i();
                if (!TextUtils.isEmpty(strI)) {
                    strB = strB.replace("00000000", strI);
                }
                String str = strB;
                try {
                    dxu.d(dnn.this.c(arrayList), new File(str), "");
                } catch (IOException unused) {
                    LogUtil.e("HwFileLogUpload", "zip device log exception");
                }
                ltr.b().sendLog((Context) dnn.this.f.get(), healthFeedbackParams, str, true, true, new HealthSendLogCallback() { // from class: dnn.5.1
                    @Override // com.huawei.hwcrowdtestapi.HealthSendLogCallback
                    public void onSuccess(String str2) {
                        LogUtil.a("HwFileLogUpload", "compressAndSendLog send log success!");
                    }

                    @Override // com.huawei.hwcrowdtestapi.HealthSendLogCallback
                    public void onFailed(String str2) {
                        LogUtil.j("HwFileLogUpload", "compressAndSendLog send log fail!");
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final HealthFeedbackParams healthFeedbackParams, final List<String> list) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: dnn.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                String unused = dnn.d = dnn.this.b(healthFeedbackParams, "_device_WearableBeta.zip");
                String strI = dnn.this.i();
                if (!TextUtils.isEmpty(strI)) {
                    String unused2 = dnn.d = dnn.d.replace("00000000", strI);
                }
                File file = new File(dnn.d);
                try {
                    dxu.d(dnn.this.c((List<String>) list), file, "");
                } catch (IOException unused3) {
                    LogUtil.j("HwFileLogUpload", "zip device log exception");
                }
                if (!CommonUtil.ab(BaseApplication.getContext())) {
                    LogUtil.j("HwFileLogUpload", "netWork is fail");
                    HandlerExecutor.b(new Runnable() { // from class: dnn.1.5
                        @Override // java.lang.Runnable
                        public void run() {
                            qpx.e(BaseApplication.getContext(), R.string.IDS_hw_toast_log_upload_failed);
                        }
                    });
                    return;
                }
                double length = file.length();
                if (file.exists() && length != 0.0d) {
                    dnn.this.c(length, healthFeedbackParams);
                } else {
                    LogUtil.j("HwFileLogUpload", "Log file not exist");
                    HandlerExecutor.b(new Runnable() { // from class: dnn.1.4
                        @Override // java.lang.Runnable
                        public void run() {
                            qpx.e(BaseApplication.getContext(), R.string.IDS_hw_show_log_bt_disconnect);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final double d2, final HealthFeedbackParams healthFeedbackParams) {
        if (a(BaseApplication.getContext())) {
            LogUtil.a("HwFileLogUpload", "netWork is mobile network");
            HandlerExecutor.b(new Runnable() { // from class: dnn.2
                @Override // java.lang.Runnable
                public void run() {
                    dnn dnnVar = dnn.this;
                    dnnVar.e((Context) dnnVar.f.get(), d2, new View.OnClickListener() { // from class: dnn.2.4
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            dnn.this.c(healthFeedbackParams, dnn.d);
                        }
                    });
                }
            });
        } else {
            LogUtil.a("HwFileLogUpload", "netWork is wifi");
            c(healthFeedbackParams, d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HealthFeedbackParams healthFeedbackParams, String str) {
        ltr.b().sendLog(BaseApplication.getContext(), healthFeedbackParams, str, true, true, new HealthSendLogCallback() { // from class: dnn.3
            @Override // com.huawei.hwcrowdtestapi.HealthSendLogCallback
            public void onSuccess(String str2) {
                HandlerExecutor.b(new Runnable() { // from class: dnn.3.3
                    @Override // java.lang.Runnable
                    public void run() {
                        qpx.a(BaseApplication.getContext(), R.string.IDS_hw_toast_log_upload_success);
                    }
                });
                LogUtil.a("HwFileLogUpload", "send log success!");
            }

            @Override // com.huawei.hwcrowdtestapi.HealthSendLogCallback
            public void onFailed(String str2) {
                HandlerExecutor.b(new Runnable() { // from class: dnn.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        qpx.a(BaseApplication.getContext(), R.string.IDS_hw_toast_log_upload_fail);
                    }
                });
                LogUtil.j("HwFileLogUpload", "send log fail!");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, double d2, View.OnClickListener onClickListener) {
        if (context == null) {
            LogUtil.j("HwFileLogUpload", "showLogUploadDialog context is null");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f32063c.get();
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            LogUtil.j("HwFileLogUpload", "showLogUploadDialog already show");
            return;
        }
        double d3 = d2 / 1048576.0d;
        if (Double.compare(d3, 0.01d) < 0) {
            d3 = 0.01d;
        }
        String string = context.getString(R.string.IDS_about_feedback_logupload_network_content, UnitUtil.e(d3, 1, 2));
        LogUtil.a("HwFileLogUpload", "showLogUploadDialog uploadHint: ", string);
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.a(string);
        builder.a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dnn.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.c(R.string.IDS_settings_button_ok, onClickListener);
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
        this.f32063c = new WeakReference<>(noTitleCustomAlertDialogC);
    }

    private boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("connectivity");
        return (systemService instanceof ConnectivityManager) && (activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<File> c(List<String> list) {
        ArrayList<File> arrayList = new ArrayList<>(10);
        if (njy.e(list)) {
            LogUtil.j("HwFileLogUpload", "getFileList pathList is empty");
            return arrayList;
        }
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("HwFileLogUpload", "getFileList pathList item is empty");
            } else {
                File file = new File(str);
                if (file.exists()) {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(HealthFeedbackParams healthFeedbackParams, String str) {
        if (healthFeedbackParams == null) {
            LogUtil.j("HwFileLogUpload", "feedbackParams is null");
            return "";
        }
        String upperCase = nio.c(healthFeedbackParams.getDeviceSn() + "000000000000").toUpperCase(Locale.ENGLISH);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(LogConfig.k());
        stringBuffer.append(healthFeedbackParams.getDeviceModel());
        stringBuffer.append("_");
        stringBuffer.append(healthFeedbackParams.getProductVersion());
        stringBuffer.append("_");
        stringBuffer.append(upperCase);
        stringBuffer.append("_");
        stringBuffer.append(new SimpleDateFormat(HwDrmConstant.TIME_FORMAT, Locale.ENGLISH).format(new Date()));
        stringBuffer.append("_00000000");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String i() {
        Context context = BaseApplication.getContext();
        if (System.currentTimeMillis() - SharedPreferenceManager.b(context, "BETA_CLUB_QUESTION_NUMBER_TIME") > 43200000) {
            SharedPreferenceManager.f(context, "");
        }
        return SharedPreferenceManager.e(context);
    }

    private void d() {
        LogUtil.a("HwFileLogUpload", "start getLogFileFromDevice mProductId:", this.j, ",code:", CommonUtil.n(this.g));
        if (dti.d(this.j, this.g).c()) {
            dns.c().e(new WspFileTransferCallback() { // from class: dnn.10
                @Override // com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback
                public void onStart(int i) {
                    LogUtil.a("HwFileLogUpload", "getLogFileFromDevice onStart fileListSize:", Integer.valueOf(i));
                    dnn.this.e = i;
                    dnn.this.f32062b = new ArrayList(16);
                    if (dnn.this.f32061a != null) {
                        dnn.this.f32061a.onStart(i);
                    }
                }

                @Override // com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback
                public void onSuccess(int i, int i2, String str) {
                    LogUtil.a("HwFileLogUpload", "getLogFileFromDevice onSuccess, fileIndex:", Integer.valueOf(i), " successCode:", Integer.valueOf(i2));
                    dnn.this.d(i, i2, str);
                }

                @Override // com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("HwFileLogUpload", "getLogFileFromDevice onFailure errorCode:", Integer.valueOf(i), str);
                    if (dnn.this.f32061a != null) {
                        dnn.this.f32061a.onFailure(i, str);
                    }
                }

                @Override // com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback
                public void onProgress(int i, int i2, String str) {
                    LogUtil.a("HwFileLogUpload", "getLogFileFromDevice onProgress progress:", Integer.valueOf(i2));
                    if (dnn.this.f32061a != null) {
                        dnn.this.f32061a.onProgress(i, i2, str);
                    }
                }

                @Override // com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback
                public String getFilePath() {
                    if (dnn.this.f32061a != null) {
                        return dnn.this.f32061a.getFilePath();
                    }
                    LogUtil.j("HwFileLogUpload", "get empty file path");
                    return "";
                }
            });
            String packageName = BaseApplication.getContext().getPackageName();
            new dnt().c(packageName, packageName);
            qpx.b(BaseApplication.getContext(), c(R.string.IDS_device_rope_beta_upload_success));
            return;
        }
        qpx.b(BaseApplication.getContext(), c(R.string.IDS_device_rope_beta_upload_failed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2, String str) {
        List<String> list = this.f32062b;
        if (list != null) {
            list.add(str);
            if (this.f32062b.size() == this.e) {
                HealthFeedbackParams healthFeedbackParamsC = c();
                Message messageObtain = Message.obtain();
                messageObtain.what = 15;
                messageObtain.obj = healthFeedbackParamsC;
                this.i.sendMessage(messageObtain);
            }
        }
        WspFileTransferCallback wspFileTransferCallback = this.f32061a;
        if (wspFileTransferCallback != null) {
            wspFileTransferCallback.onSuccess(i, i2, str);
        }
    }

    public void c(WspFileTransferCallback wspFileTransferCallback) {
        this.f32061a = wspFileTransferCallback;
    }

    private String c(int i) {
        return BaseApplication.getContext().getResources().getString(i);
    }

    static class e implements HealthFeedbackCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f32078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthFeedbackParams f32079b;
        private WeakReference<Activity> d;

        private e(Handler handler, HealthFeedbackParams healthFeedbackParams, Activity activity) {
            this.f32078a = handler;
            this.f32079b = healthFeedbackParams;
            this.d = new WeakReference<>(activity);
        }

        @Override // com.huawei.hwcrowdtestapi.HealthFeedbackCallback
        public void onFailed(String str) {
            Activity activity = this.d.get();
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                LogUtil.j("HwFileLogUpload", "onFailed activity is null, finish or destroyed");
            } else {
                LogUtil.e("HwFileLogUpload", "goto BetaFeedback fail:", str);
            }
        }

        @Override // com.huawei.hwcrowdtestapi.HealthFeedbackCallback
        public ltn collectLogs(int i, String str, String str2, boolean z) {
            Activity activity = this.d.get();
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                LogUtil.j("HwFileLogUpload", "collectLogs activity is null, finish or destroyed");
                return null;
            }
            ArrayList arrayList = new ArrayList(16);
            String strK = LogConfig.k();
            arrayList.add(strK + "MaintenanceLog");
            arrayList.add(strK + "com.huawei.health");
            arrayList.add(strK + "com.huawei.health.h5pro");
            arrayList.add(strK + "com.huawei.health_PhoneService");
            arrayList.add(strK + "com.huawei.health_DaemonService");
            arrayList.add(strK + "com.huawei.health_leakcanary");
            arrayList.add(strK + "com.huawei.health_pushservice");
            arrayList.add(strK + "com.huawei.version.json");
            arrayList.add(strK + "huawei_crashLog_0.txt");
            arrayList.add(strK + "huawei_crashLog_1.txt");
            arrayList.add(strK + "huawei_crashLog_2.txt");
            arrayList.add(strK + "app_config_value.txt");
            arrayList.add(strK + "leak.txt");
            arrayList.add(strK + "LogAnalysis.txt");
            DfxBaseHandler.getAllDfxLogFileToPathList(new File(strK), arrayList);
            ltn ltnVar = new ltn();
            ltnVar.e(arrayList);
            Message messageObtain = Message.obtain();
            ltnVar.c(200);
            messageObtain.what = 14;
            messageObtain.obj = this.f32079b;
            this.f32078a.sendMessage(messageObtain);
            return ltnVar;
        }
    }

    static class b extends BaseHandler<dnn> {
        private b(dnn dnnVar) {
            super(dnnVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(dnn dnnVar, Message message) {
            int i = message.what;
            if (i == 14) {
                if (message.obj instanceof HealthFeedbackParams) {
                    dnnVar.d((HealthFeedbackParams) message.obj);
                }
                dnnVar.a();
            } else if (i == 15 && (message.obj instanceof HealthFeedbackParams)) {
                dnnVar.e((HealthFeedbackParams) message.obj, dnnVar.f32062b);
            }
        }
    }
}
