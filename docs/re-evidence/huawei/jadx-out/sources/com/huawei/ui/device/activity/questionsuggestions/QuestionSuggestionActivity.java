package com.huawei.ui.device.activity.questionsuggestions;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.callback.NotifyPhoneServiceCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.device.R;
import defpackage.ean;
import defpackage.ecu;
import defpackage.edc;
import defpackage.eef;
import defpackage.eeg;
import defpackage.eeq;
import defpackage.eey;
import defpackage.ioi;
import defpackage.lli;
import defpackage.lvb;
import defpackage.lws;
import defpackage.mgg;
import defpackage.mjh;
import defpackage.mjj;
import defpackage.niz;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qzf;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class QuestionSuggestionActivity extends BaseQuestionSuggestionActivity implements CompoundButton.OnCheckedChangeListener, NotifyPhoneServiceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomProgressDialog f24668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f24670c;
    private CustomProgressDialog.Builder e;
    private CustomTextAlertDialog f;
    private CustomViewDialog g;
    private String h;
    private CustomTextAlertDialog i;
    private int k;
    private lvb n;
    private String d = "";
    private DeviceDfxBaseResponseCallback j = new DeviceDfxBaseResponseCallback() { // from class: com.huawei.ui.device.activity.questionsuggestions.QuestionSuggestionActivity.2
        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
        public void onSuccess(int i, String str) {
            ReleaseLogUtil.d("Dfx_QuestionSuggestionActivity", "mDfxCallback onSuccess() ", Integer.valueOf(i));
            if (QuestionSuggestionActivity.this.mLogHandler != null) {
                Message messageObtainMessage = QuestionSuggestionActivity.this.mLogHandler.obtainMessage();
                messageObtainMessage.what = 3;
                QuestionSuggestionActivity.this.mLogHandler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.a("Dfx_QuestionSuggestionActivity", "mDfxCallback onFailure(), errorCode is ", Integer.valueOf(i), ", errorMsg = ", str);
            if (QuestionSuggestionActivity.this.mLogHandler != null) {
                Message messageObtainMessage = QuestionSuggestionActivity.this.mLogHandler.obtainMessage();
                messageObtainMessage.what = 2;
                QuestionSuggestionActivity.this.mLogHandler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
        public void onProgress(int i, String str) {
            ReleaseLogUtil.d("QuestionSuggestionActivity", "mDfxCallback onProgress() progress is: ", Integer.valueOf(i), ", progressDescription is: ", str);
            if (StringUtils.g(str) || QuestionSuggestionActivity.this.mLogHandler == null) {
                return;
            }
            Message messageObtainMessage = QuestionSuggestionActivity.this.mLogHandler.obtainMessage();
            messageObtainMessage.what = 1;
            Bundle bundle = new Bundle();
            bundle.putInt("CURRENT_PROCESS", i);
            Matcher matcher = Pattern.compile("(?<=\\()[^\\)]+").matcher(str);
            String strC = QuestionSuggestionActivity.this.mLastProgressDescription;
            if (matcher.find()) {
                String strGroup = matcher.group();
                ReleaseLogUtil.d("Dfx_QuestionSuggestionActivity", "LogHandler progress tipText is: ", strGroup);
                strC = QuestionSuggestionActivity.this.c(strGroup);
            }
            bundle.putString("CURRENT_PROCESS_DESCRIPTION", strC);
            messageObtainMessage.setData(bundle);
            QuestionSuggestionActivity.this.mLogHandler.sendMessage(messageObtainMessage);
        }
    };

    @Override // com.huawei.ui.device.activity.questionsuggestions.BaseQuestionSuggestionActivity, android.view.View.OnClickListener
    public /* bridge */ /* synthetic */ void onClick(View view) {
        super.onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        String strE;
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("/");
        if (strArrSplit == null || strArrSplit.length <= 1) {
            strE = "";
        } else {
            String strE2 = UnitUtil.e(qrs.g(strArrSplit[0]), 1, 0);
            strE = UnitUtil.e(qrs.g(strArrSplit[1]), 1, 0);
            str2 = strE2;
        }
        return str2 + "/" + strE;
    }

    private void e() {
        ReleaseLogUtil.d("QuestionSuggestionActivity", "enter showEnhanceLogDialog");
        if (this.g == null) {
            View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.hw_show_enhance_log_view, (ViewGroup) null);
            CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(this.mContext).b(R.string.IDS_device_log_enhancement).d(viewInflate).b(false).d(R.string.IDS_device_log_enhancement_ok, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.questionsuggestions.QuestionSuggestionActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    QuestionSuggestionActivity.this.mLogEnhancementModeCheckbox.setChecked(true);
                    QuestionSuggestionActivity.this.k = 1;
                    QuestionSuggestionActivity.this.a(true);
                }
            }).c(R.string.IDS_device_log_enhancement_cancel, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.questionsuggestions.QuestionSuggestionActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    QuestionSuggestionActivity.this.k = 0;
                    QuestionSuggestionActivity.this.mLogEnhancementModeCheckbox.setChecked(false);
                }
            }).d();
            this.g = customViewDialogD;
            customViewDialogD.setCancelable(false);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            ReleaseLogUtil.d("QuestionSuggestionActivity", "screen height:", Integer.valueOf(i));
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = i / 3;
            viewInflate.setLayoutParams(layoutParams);
        }
        if (isFinishing()) {
            return;
        }
        this.g.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        DeviceInfo deviceInfoB = mgg.b(this.d, "QuestionSuggestionActivity");
        if (deviceInfoB == null) {
            ReleaseLogUtil.e("Dfx_QuestionSuggestionActivity", "sendLogCommand deviceInfo is null");
        } else if (eey.d(deviceInfoB, 129)) {
            ReleaseLogUtil.d("Dfx_QuestionSuggestionActivity", "sendTrustListCommand device support log trust is support");
            d(z, deviceInfoB);
        } else {
            ReleaseLogUtil.d("Dfx_QuestionSuggestionActivity", "sendTrustListCommand device support log trust is not support");
        }
    }

    private void d(boolean z, DeviceInfo deviceInfo) {
        eef eefVarD = d(z);
        ReleaseLogUtil.d("Dfx_QuestionSuggestionActivity", "sendLogCommand constructLogSampleConfig: ", eefVarD.toString());
        edc.e().sendSampleConfigCommand(deviceInfo, eefVarD, "QuestionSuggestionActivity");
    }

    private eef d(boolean z) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.uniedevice.hiviewEnhance");
        eefVar.setWearPkgName("HiviewEnhance");
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(900100016L);
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append("");
        int i = !"true".equals(sb.toString()) ? 1 : 0;
        String str = eeq.d(1) + eeq.d(1) + eeq.d(i);
        ReleaseLogUtil.d("Dfx_QuestionSuggestionActivity", "constructSampleConfig status is: ", Integer.valueOf(i));
        eegVar.d(eeq.c(str));
        eegVar.b(1);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            e();
        } else {
            this.k = 0;
            a(false);
        }
    }

    @Override // com.huawei.ui.device.activity.questionsuggestions.BaseQuestionSuggestionActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mErrorTipContent = this.mContext.getString(R.string.IDS_device_release_user_profile_log_collect_failure_tip);
    }

    @Override // com.huawei.ui.device.activity.questionsuggestions.BaseQuestionSuggestionActivity
    void processIntentData(Intent intent) {
        if (intent == null) {
            ReleaseLogUtil.e("Dfx_QuestionSuggestionActivity", "intent is empty");
            return;
        }
        String stringExtra = intent.getStringExtra("deviceType");
        this.h = stringExtra;
        if (!TextUtils.isEmpty(stringExtra) && "3".equals(this.h)) {
            DeviceInfo deviceInfoC = c();
            if (deviceInfoC == null) {
                ReleaseLogUtil.e("Dfx_QuestionSuggestionActivity", "deviceInfo is null");
            } else {
                this.d = deviceInfoC.getDeviceIdentify();
                this.f24669b = eey.d(deviceInfoC, 62);
            }
        } else {
            this.d = intent.getStringExtra("device_id");
            this.f24669b = intent.getBooleanExtra("enhancement_mode", false);
        }
        ReleaseLogUtil.d("Dfx_QuestionSuggestionActivity", "isSupportLogEnhancementMode:", Boolean.valueOf(this.f24669b));
        if (Utils.o() || !this.f24669b) {
            return;
        }
        this.mSwitchLayout.setVisibility(0);
        this.mLogEnhancementModeCheckbox.setOnCheckedChangeListener(this);
        a(false);
    }

    private DeviceInfo c() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "QuestionSuggestionActivity");
        if (deviceList == null || deviceList.size() == 0) {
            ReleaseLogUtil.e("Dfx_QuestionSuggestionActivity", "deviceInfos is null ");
            return null;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            int versionType = deviceInfo.getVersionType();
            ReleaseLogUtil.d("Dfx_QuestionSuggestionActivity", "Device version type is ", Integer.valueOf(versionType));
            boolean z = versionType == 0;
            boolean zK = mjh.k(deviceInfo.getDeviceIdentify());
            if (z && !zK) {
                return deviceInfo;
            }
        }
        return null;
    }

    @Override // com.huawei.ui.device.activity.questionsuggestions.BaseQuestionSuggestionActivity
    void onAgreeAndContinueClick() {
        if (niz.c()) {
            h();
            return;
        }
        b(this.mContext.getString(R.string.IDS_device_release_user_profile_log_privacy_tip_title) + System.lineSeparator() + System.lineSeparator() + this.mContext.getString(R.string.IDS_device_release_user_profile_log_privacy_tip_content));
    }

    private void b(String str) {
        new NoTitleCustomAlertDialog.Builder(this).a(str).a(this.mContext.getString(R.string.IDS_device_release_user_profile_log_collect_agree).toUpperCase(Locale.getDefault()), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.questionsuggestions.QuestionSuggestionActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ioi.d().e(11, true, null, null);
                ean.e(true);
                QuestionSuggestionActivity.this.h();
                QuestionSuggestionActivity.this.mSwitchLayout.setVisibility(8);
            }
        }).d(this.mContext.getString(R.string.IDS_device_release_user_profile_log_collect_cancel).toUpperCase(Locale.getDefault()), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.questionsuggestions.QuestionSuggestionActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).c().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        deleteLogFiles(new File(mjj.f41752c));
        if (!mjh.b(this.mContext)) {
            ReleaseLogUtil.e("Dfx_QuestionSuggestionActivity", "FeedBackLog is NoNetworkActive");
            qpx.b(this.mContext, R.string.IDS_hw_toast_log_upload_failed);
            return;
        }
        if (this.n == null) {
            this.n = lvb.e();
        }
        DeviceInfo deviceInfoB = mgg.b(this.d, "QuestionSuggestionActivity");
        if (deviceInfoB != null && deviceInfoB.getDeviceConnectState() != 2) {
            ReleaseLogUtil.e("Dfx_QuestionSuggestionActivity", "startGetDeviceLog() bt is not connected");
            return;
        }
        boolean zD = eey.d(deviceInfoB, 134);
        ReleaseLogUtil.d("QuestionSuggestionActivity", "startGetDeviceLog isSupportGet earPhone log isSupport: ", Boolean.valueOf(zD));
        if (zD) {
            e(deviceInfoB);
        } else {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (lws.c(this.mContext).d(this.d)) {
            this.mSwitchLayout.setVisibility(8);
            ReleaseLogUtil.d("Dfx_QuestionSuggestionActivity", "mSelectedFlag", Integer.valueOf(this.k));
            lws.c(this.mContext).a(this.d, this.j, this.k);
            String string = this.mContext.getString(R.string.IDS_device_release_user_profile_log_collecting_tip);
            if (qrs.ah(BaseApplication.getContext())) {
                string = String.format(Locale.ENGLISH, this.mContext.getString(R.string.IDS_pad_device_collecting_tip), 1);
            }
            showLogsCollecting(string);
            return;
        }
        ReleaseLogUtil.e("Dfx_QuestionSuggestionActivity", "startGetDeviceLog() device is not supported");
    }

    private void b() {
        if (this.mLogHandler != null) {
            this.mLogHandler.post(new Runnable() { // from class: com.huawei.ui.device.activity.questionsuggestions.QuestionSuggestionActivity.9
                @Override // java.lang.Runnable
                public void run() {
                    QuestionSuggestionActivity.this.d();
                }
            });
        }
        lvb.e().e("earphoneLogPre");
    }

    private void a(DeviceInfo deviceInfo) {
        e(0, this.mContext.getString(R.string.IDS_earphone_log_collect_tips));
        lvb.e().b("earphoneLogPre", this);
        ReleaseLogUtil.d("QuestionSuggestionActivity", "start sendDeviceEvent");
        lvb.e().b("earphoneLogPre", deviceInfo, 0, "send_device_event_beta_club");
    }

    @Override // com.huawei.hwdevice.mainprocess.callback.NotifyPhoneServiceCallback
    public void executeResponse(int i, DeviceInfo deviceInfo, int i2, String str) {
        if (i == 0) {
            ReleaseLogUtil.d("QuestionSuggestionActivity", "executeResponse progress reserve: ", Integer.valueOf(i2));
            if (i2 == 100) {
                runOnUiThread(new Runnable() { // from class: qzl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.a();
                    }
                });
                b();
                return;
            } else {
                a(i2, false);
                return;
            }
        }
        if (i != 1) {
            ReleaseLogUtil.e("QuestionSuggestionActivity", "others");
            c(deviceInfo);
        } else {
            ReleaseLogUtil.d("QuestionSuggestionActivity", "executeResponse timeout");
            b(this.f24668a);
            c(deviceInfo);
        }
    }

    public /* synthetic */ void a() {
        b(this.f24668a);
    }

    private void e(final DeviceInfo deviceInfo) {
        if (this.f == null) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.mContext).a(R.string.IDS_earphone_log_collect_title).b(R.string.IDS_earphone_log_collect_request_tips).a(R.string.IDS_user_permission_ok, new View.OnClickListener() { // from class: qzk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.d(deviceInfo, view);
                }
            }).e(R.string.IDS_earphone_log_collect_ignore_tips, new View.OnClickListener() { // from class: qzm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.e(view);
                }
            }).b();
            this.f = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
        }
        if (isFinishing()) {
            return;
        }
        this.f.show();
    }

    public /* synthetic */ void d(DeviceInfo deviceInfo, View view) {
        a(deviceInfo);
    }

    public /* synthetic */ void e(View view) {
        ReleaseLogUtil.d("QuestionSuggestionActivity", "negative showEarphoneLogCollectDialog");
        b();
    }

    private void c(final DeviceInfo deviceInfo) {
        if (this.i == null) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.mContext).a(R.string.IDS_earphone_log_collect_failed_title).b(R.string.IDS_earphone_log_collect_failed_tips).a(R.string.IDS_notify_retry, new View.OnClickListener() { // from class: qze
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47025c.b(deviceInfo, view);
                }
            }).e(R.string.IDS_earphone_log_collect_ignore_tips, new View.OnClickListener() { // from class: qzg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47026a.a(view);
                }
            }).b();
            this.i = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
        }
        if (isFinishing()) {
            return;
        }
        this.i.show();
    }

    public /* synthetic */ void b(DeviceInfo deviceInfo, View view) {
        e(deviceInfo);
    }

    public /* synthetic */ void a(View view) {
        ReleaseLogUtil.d("QuestionSuggestionActivity", "negative showEarphoneLogCollectFailedDialog");
        b();
    }

    private void b(CustomProgressDialog customProgressDialog) {
        ReleaseLogUtil.d("QuestionSuggestionActivity", "enter closeProgress");
        if (customProgressDialog == null || !customProgressDialog.isShowing() || isFinishing()) {
            return;
        }
        customProgressDialog.cancel();
        ReleaseLogUtil.d("QuestionSuggestionActivity", "enter closeProgress cancel");
    }

    private void a(int i, boolean z) {
        ReleaseLogUtil.d("QuestionSuggestionActivity", ",progress: ", Integer.valueOf(i), ",isTimeout: ", Boolean.valueOf(z));
        e(i, this.mContext.getString(R.string.IDS_earphone_log_collect_tips));
    }

    private void e(final int i, final String str) {
        ReleaseLogUtil.d("QuestionSuggestionActivity", "startEarphoneDownLoadProgress progress: ", Integer.valueOf(i), " and progressDesc: ", str);
        runOnUiThread(new Runnable() { // from class: qzn
            @Override // java.lang.Runnable
            public final void run() {
                this.f47030a.d(i, str);
            }
        });
    }

    public /* synthetic */ void d(int i, String str) {
        CustomProgressDialog customProgressDialog = this.f24668a;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            this.e.b(i);
            this.e.d(i);
            return;
        }
        this.f24668a = new CustomProgressDialog(this.mContext);
        CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.mContext);
        this.e = builder;
        builder.e(str);
        CustomProgressDialog customProgressDialogC = this.e.c();
        this.f24668a = customProgressDialogC;
        customProgressDialogC.setCanceledOnTouchOutside(false);
        this.f24668a.setCancelable(false);
        if (isFinishing()) {
            return;
        }
        this.f24668a.show();
        this.e.b(0);
        this.e.d(0);
    }

    @Override // com.huawei.ui.device.activity.questionsuggestions.BaseQuestionSuggestionActivity
    void openQuestionSuggestion() {
        String str;
        String softVersion;
        ReleaseLogUtil.d("Dfx_QuestionSuggestionActivity", "openQuestionSuggestion");
        DeviceInfo deviceInfoB = mgg.b(this.d, "QuestionSuggestionActivity");
        if (deviceInfoB == null) {
            str = "";
            softVersion = str;
        } else {
            int productType = deviceInfoB.getProductType();
            String strA = mjh.a(productType, mjh.e(productType, deviceInfoB.getDeviceModel()), deviceInfoB.getDeviceModel());
            softVersion = deviceInfoB.getSoftVersion();
            str = strA;
        }
        int iC = lli.e().c(this, true, true, str, softVersion);
        if (this.f24670c == null) {
            this.f24670c = new qzf();
        }
        this.f24670c.sendEmptyMessage(1);
        ReleaseLogUtil.d("Dfx_QuestionSuggestionActivity", "openQuestionSuggestion() errorCode is: ", Integer.valueOf(iC));
    }

    @Override // com.huawei.ui.device.activity.questionsuggestions.BaseQuestionSuggestionActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.d("Dfx_QuestionSuggestionActivity", "onDestroy");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
