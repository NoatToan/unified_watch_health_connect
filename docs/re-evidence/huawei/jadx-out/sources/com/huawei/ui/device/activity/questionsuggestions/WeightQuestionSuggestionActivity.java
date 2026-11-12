package com.huawei.ui.device.activity.questionsuggestions;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.device.R;
import defpackage.dmp;
import defpackage.dns;
import defpackage.dnt;
import defpackage.dti;
import defpackage.dxm;
import defpackage.lli;
import defpackage.mjj;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class WeightQuestionSuggestionActivity extends BaseQuestionSuggestionActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f24672b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile long f24674a = 0;
    private String e;
    private String g;
    private dti i;
    private static final String d = mjj.f41752c + File.separator + "WSP-BLE-LOG-FILE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f24673c = false;

    @Override // com.huawei.ui.device.activity.questionsuggestions.BaseQuestionSuggestionActivity, android.view.View.OnClickListener
    public /* bridge */ /* synthetic */ void onClick(View view) {
        super.onClick(view);
    }

    /* JADX INFO: loaded from: classes16.dex */
    static final class c implements WspFileTransferCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f24675b;
        private final WeakReference<WeightQuestionSuggestionActivity> d;

        private c(WeightQuestionSuggestionActivity weightQuestionSuggestionActivity, String str) {
            this.d = new WeakReference<>(weightQuestionSuggestionActivity);
            this.f24675b = str;
        }

        @Override // com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback
        public void onStart(int i) {
            ReleaseLogUtil.d("R_Weight_QuestionSuggestionActivity", "getLogFileFromDevice onStart fileListSize = ", Integer.valueOf(i));
            int unused = WeightQuestionSuggestionActivity.f24672b = i;
        }

        @Override // com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback
        public void onSuccess(int i, int i2, String str) {
            ReleaseLogUtil.d("R_Weight_QuestionSuggestionActivity", "getLogFileFromDevice onSuccess, fileIndex = ", Integer.valueOf(i), ", successCode = ", Integer.valueOf(i2));
            if (i + 1 >= WeightQuestionSuggestionActivity.f24672b) {
                boolean unused = WeightQuestionSuggestionActivity.f24673c = false;
                WeightQuestionSuggestionActivity weightQuestionSuggestionActivity = this.d.get();
                if (weightQuestionSuggestionActivity == null || weightQuestionSuggestionActivity.isFinishing() || weightQuestionSuggestionActivity.isDestroyed()) {
                    ReleaseLogUtil.e("R_Weight_QuestionSuggestionActivity", "activity is null");
                } else if (weightQuestionSuggestionActivity.mLogHandler != null) {
                    Message messageObtainMessage = weightQuestionSuggestionActivity.mLogHandler.obtainMessage();
                    messageObtainMessage.what = 3;
                    weightQuestionSuggestionActivity.mLogHandler.sendMessage(messageObtainMessage);
                }
            }
        }

        @Override // com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.e("R_Weight_QuestionSuggestionActivity", "getLogFileFromDevice onFailure errorCode = ", Integer.valueOf(i));
            boolean unused = WeightQuestionSuggestionActivity.f24673c = false;
            WeightQuestionSuggestionActivity weightQuestionSuggestionActivity = this.d.get();
            if (weightQuestionSuggestionActivity == null || weightQuestionSuggestionActivity.isFinishing() || weightQuestionSuggestionActivity.isDestroyed()) {
                ReleaseLogUtil.e("R_Weight_QuestionSuggestionActivity", "activity is null");
            } else if (weightQuestionSuggestionActivity.mLogHandler != null) {
                Message messageObtainMessage = weightQuestionSuggestionActivity.mLogHandler.obtainMessage();
                messageObtainMessage.what = 2;
                weightQuestionSuggestionActivity.mLogHandler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback
        public void onProgress(int i, int i2, String str) {
            ReleaseLogUtil.d("R_Weight_QuestionSuggestionActivity", "getLogFileFromDevice onProgress progress = ", Integer.valueOf(i2), ", fileIndex = ", Integer.valueOf(i));
            if (i2 >= 100) {
                i2 = 100;
            }
            WeightQuestionSuggestionActivity weightQuestionSuggestionActivity = this.d.get();
            if (weightQuestionSuggestionActivity != null) {
                weightQuestionSuggestionActivity.f24674a = System.currentTimeMillis();
                if (weightQuestionSuggestionActivity.mLogHandler != null) {
                    Message messageObtainMessage = weightQuestionSuggestionActivity.mLogHandler.obtainMessage();
                    messageObtainMessage.what = 1;
                    Bundle bundle = new Bundle();
                    bundle.putInt("CURRENT_PROCESS", i2);
                    bundle.putString("CURRENT_PROCESS_DESCRIPTION", UnitUtil.e(i + 1, 1, 0) + "/" + UnitUtil.e(WeightQuestionSuggestionActivity.f24672b, 1, 0));
                    messageObtainMessage.setData(bundle);
                    weightQuestionSuggestionActivity.mLogHandler.sendMessage(messageObtainMessage);
                    return;
                }
                return;
            }
            ReleaseLogUtil.e("R_Weight_QuestionSuggestionActivity", "activity is null");
        }

        @Override // com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback
        public String getFilePath() {
            return this.f24675b;
        }
    }

    @Override // com.huawei.ui.device.activity.questionsuggestions.BaseQuestionSuggestionActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mErrorTipContent = String.format(Locale.ENGLISH, this.mContext.getString(R.string.IDS_phone_release_scale_log_collecting_tip), 1);
        if (qrs.ah(BaseApplication.getContext())) {
            this.mErrorTipContent = String.format(Locale.ENGLISH, this.mContext.getString(R.string.IDS_pad_release_scale_log_collecting_tip), 1);
        }
    }

    @Override // com.huawei.ui.device.activity.questionsuggestions.BaseQuestionSuggestionActivity
    void processIntentData(Intent intent) {
        if (intent == null) {
            ReleaseLogUtil.e("R_Weight_QuestionSuggestionActivity", "intent null");
            return;
        }
        this.g = intent.getStringExtra("uniqueId");
        MeasurableDevice measurableDeviceB = dmp.d().b(this.g, false);
        if (measurableDeviceB == null) {
            ReleaseLogUtil.e("R_Weight_QuestionSuggestionActivity", "device is null");
        } else {
            this.e = measurableDeviceB.getProductId();
        }
    }

    @Override // com.huawei.ui.device.activity.questionsuggestions.BaseQuestionSuggestionActivity
    void onAgreeAndContinueClick() {
        ReleaseLogUtil.d("R_Weight_QuestionSuggestionActivity", "productId: ", CommonUtil.n(this.e), ", code: ", CommonUtil.n(this.g));
        dti dtiVarD = dti.d(this, this.e, this.g);
        this.i = dtiVarD;
        if (dtiVarD.c()) {
            ReleaseLogUtil.d("R_Weight_QuestionSuggestionActivity", "start get device log, isCollecting: ", Boolean.valueOf(f24673c));
            showLogsCollecting(this.mErrorTipContent);
            this.f24674a = System.currentTimeMillis();
            dns dnsVarC = dns.c();
            String str = d;
            dnsVarC.e(new c(str));
            if (!f24673c) {
                deleteLogFiles(new File(str));
                String packageName = BaseApplication.getContext().getPackageName();
                new dnt().c(packageName, packageName);
                f24673c = true;
            }
            b();
            return;
        }
        showSuggestionErrorMsg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.mButton == null || this.mLogHandler == null) {
            ReleaseLogUtil.e("R_Weight_QuestionSuggestionActivity", "check time out failed");
            return;
        }
        if (!f24673c) {
            ReleaseLogUtil.e("R_Weight_QuestionSuggestionActivity", "log collecting end");
            return;
        }
        if (Math.abs(System.currentTimeMillis() - this.f24674a) >= 5000) {
            ReleaseLogUtil.e("R_Weight_QuestionSuggestionActivity", "update progress time out");
            f24673c = false;
            Message messageObtainMessage = this.mLogHandler.obtainMessage();
            messageObtainMessage.what = 2;
            this.mLogHandler.sendMessage(messageObtainMessage);
            return;
        }
        this.mButton.postDelayed(new Runnable() { // from class: qzj
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b();
            }
        }, 5000L);
    }

    @Override // com.huawei.ui.device.activity.questionsuggestions.BaseQuestionSuggestionActivity
    void openQuestionSuggestion() {
        ReleaseLogUtil.d("R_Weight_QuestionSuggestionActivity", "openQuestionSuggestion");
        ReleaseLogUtil.d("R_Weight_QuestionSuggestionActivity", "openQuestionSuggestion() errorCode is: ", Integer.valueOf(lli.e().c(this, true, true, dxm.g(this.e), dxm.m(this.g))));
    }

    @Override // com.huawei.ui.device.activity.questionsuggestions.BaseQuestionSuggestionActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dti dtiVar = this.i;
        if (dtiVar != null) {
            dtiVar.a((Activity) null);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
