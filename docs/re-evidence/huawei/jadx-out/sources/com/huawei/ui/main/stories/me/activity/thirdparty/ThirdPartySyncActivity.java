package com.huawei.ui.main.stories.me.activity.thirdparty;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.health.huaweihealth.HuaweiHealthApi;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hihealthservice.hmsauth.HmsAuthApi;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonPickerConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.downloadwidget.HealthDownLoadWidget;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.me.util.AppSettingUtil;
import com.tencent.open.SocialOperation;
import defpackage.qpx;
import defpackage.qrk;
import defpackage.qrs;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class ThirdPartySyncActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomProgressDialog.Builder f28493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomProgressDialog f28494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthOpenSDK f28495c;
    private AppSettingUtil d;
    private Context e;
    private c h;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        LogUtil.a("ThirdPartySyncActivity", "onCreate");
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.height = 0;
        attributes.width = 0;
        getWindow().setAttributes(attributes);
        this.e = this;
        this.h = new c();
        this.d = new AppSettingUtil(BaseApplication.b());
        b();
        if (NetworkUtil.h()) {
            LogUtil.a("ThirdPartySyncActivity", "Network is connected");
            d();
            a();
        } else {
            qpx.e(BaseApplication.b(), R.string.IDS_hw_show_set_about_privacy_connectting_error);
            finish();
        }
    }

    private String d(String str) {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("ThirdPartySyncActivity", "getParamFromIntent intent is null");
            return "";
        }
        Uri uriB = AppRouterUtils.b(intent);
        if (intent.hasExtra(str) || uriB == null) {
            return intent.getStringExtra(str);
        }
        return uriB.getQueryParameter(str);
    }

    private void d() {
        int color;
        if (this.f28494b == null) {
            try {
                color = Integer.parseInt(d("extraColor"));
            } catch (NumberFormatException e) {
                LogUtil.e("ThirdPartySyncActivity", "NumberFormatException: ", e.getMessage());
                color = 0;
            }
            if (color == getColor(R.color.health_dialog_bg_color)) {
                color = 0;
            }
            CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.e);
            this.f28493a = builder;
            builder.e(getResources().getString(R.string.IDS_third_party_sync_dialog_title));
            CustomProgressDialog customProgressDialogC = this.f28493a.c();
            this.f28494b = customProgressDialogC;
            customProgressDialogC.setCanceledOnTouchOutside(false);
            this.f28494b.setCancelable(false);
            HealthProgressBar healthProgressBar = (HealthProgressBar) this.f28494b.findViewById(R.id.custom_progress_dialog_progressbar);
            if (color == 0) {
                healthProgressBar.b(this.e, -1, R.color.common_colorAccent);
            } else {
                healthProgressBar.setProgressTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{color}));
            }
            HealthTextView healthTextView = new HealthTextView(this.e);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = qrs.d(this.e, 16.0f);
            layoutParams.gravity = 1;
            healthTextView.setLayoutParams(layoutParams);
            healthTextView.setText(R.string.cancel);
            if (color == 0) {
                color = ContextCompat.getColor(this.e, R.color.common_colorAccent);
            }
            healthTextView.setTextColor(color);
            healthTextView.setTextSize(16.0f);
            healthTextView.setOnClickListener(new View.OnClickListener() { // from class: vvj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f51625b.d(view);
                }
            });
            ((LinearLayout) this.f28494b.findViewById(R.id.AppUpdateDialog_progress_layout)).addView(healthTextView);
            this.f28494b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: vvn
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f51627a.e(dialogInterface);
                }
            });
        }
        this.f28494b.show();
        LogUtil.a("ThirdPartySyncActivity", "Dialog show");
    }

    public /* synthetic */ void d(View view) {
        ReleaseLogUtil.d("ThirdPartySyncActivity", "Canceling data synchronization");
        HiHealthNativeApi.a(BaseApplication.b()).synCloudCancel();
        this.f28494b.dismiss();
    }

    public /* synthetic */ void e(DialogInterface dialogInterface) {
        LogUtil.a("ThirdPartySyncActivity", "Dialog dismiss");
        finish();
    }

    private void a() {
        HealthOpenSDK healthOpenSDK = new HealthOpenSDK();
        this.f28495c = healthOpenSDK;
        healthOpenSDK.initSDK(BaseApplication.b(), new IExecuteResult() { // from class: com.huawei.ui.main.stories.me.activity.thirdparty.ThirdPartySyncActivity.4
            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onSuccess(Object obj) {
                LogUtil.a("ThirdPartySyncActivity", "healthOpenSdk.initSDK onSuccess");
                ThirdPartySyncActivity.this.i();
                ThirdPartySyncActivity.this.d.b(ThirdPartySyncActivity.this.f28495c, (HealthDownLoadWidget) null, (String) null);
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onFailed(Object obj) {
                LogUtil.e("ThirdPartySyncActivity", "healthOpenSdk.initSDK onFailed");
                ThirdPartySyncActivity.this.f();
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onServiceException(Object obj) {
                LogUtil.e("ThirdPartySyncActivity", "healthOpenSdk.initSDK onServiceException");
                ThirdPartySyncActivity.this.f();
            }
        }, "HuaweiHealth");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Intent intent = new Intent();
        intent.setAction("sync_cloud_data_action");
        intent.putExtra("sync_cloud_data_status", "sync_cloud_data_setting_flag");
        BroadcastManagerUtil.a(BaseApplication.b(), intent);
    }

    private void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.hihealth.action_sync");
        LocalBroadcastManager.getInstance().registerReceiver(this.h, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.d("ThirdPartySyncActivity", "finishDataSync sync done");
        Date date = new Date();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ReleaseLogUtil.d("ThirdPartySyncActivity", "finishDataSync formatDate:", new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMMdd")).format(date), " formatTime:", qrk.a(BaseApplication.b(), jCurrentTimeMillis, 1));
        SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10000), "last_sync_time", String.valueOf(jCurrentTimeMillis), new StorageParams());
        ((HuaweiHealthApi) Services.b("HuaweiHealth", HuaweiHealthApi.class)).updateSyncFinishTime(jCurrentTimeMillis);
        qpx.e(BaseApplication.b(), R.string.IDS_hw_show_synchronous_success);
        h();
        c();
    }

    private void c() {
        CustomProgressDialog customProgressDialog = this.f28494b;
        if (customProgressDialog != null) {
            customProgressDialog.dismiss();
        }
    }

    private void h() {
        ReleaseLogUtil.d("R_ThirdPartySyncActivity", "enter responseRedirection");
        String strD = d("appId");
        String strD2 = d(CommonPickerConstant.RequestParams.KEY_REDIRECT_URL);
        String strD3 = d(SocialOperation.GAME_SIGNATURE);
        if (TextUtils.isEmpty(strD2)) {
            ReleaseLogUtil.d("R_ThirdPartySyncActivity", "redirectUrl is null, no response redirection required");
            return;
        }
        if (((HmsAuthApi) Services.b("HealthKit", HmsAuthApi.class)).isValidRedirectUrl(strD, strD3, strD2)) {
            ReleaseLogUtil.a("R_ThirdPartySyncActivity", "responseRedirection isValidRedirectUri true");
            try {
                startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(d(CommonPickerConstant.RequestParams.KEY_REDIRECT_URL))));
                return;
            } catch (ActivityNotFoundException e) {
                ReleaseLogUtil.a("R_ThirdPartySyncActivity", "responseRedirection ActivityNotFoundException: ", e.getMessage());
                return;
            }
        }
        ReleaseLogUtil.a("R_ThirdPartySyncActivity", "responseRedirection isValidRedirectUri false");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        CustomProgressDialog.Builder builder = this.f28493a;
        if (builder != null) {
            builder.b(i);
            this.f28493a.d(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        qpx.e(BaseApplication.b(), R.string.IDS_hw_show_me_sync_fail);
        c();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("ThirdPartySyncActivity", "onDestroy");
        LocalBroadcastManager.getInstance().unregisterReceiver(this.h);
        HealthOpenSDK healthOpenSDK = this.f28495c;
        if (healthOpenSDK != null) {
            healthOpenSDK.destorySDK();
            this.f28495c = null;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.d("ThirdPartySyncActivity", "onReceive() to enter");
            if (intent == null) {
                LogUtil.j("ThirdPartySyncActivity", "onReceive intent is null");
                return;
            }
            if (!"com.huawei.hihealth.action_sync".equals(intent.getAction())) {
                LogUtil.j("ThirdPartySyncActivity", "onReceive action is not action_sync");
                return;
            }
            try {
                int intExtra = intent.getIntExtra("com.huawei.hihealth.action_sync_status", 6);
                if (intExtra == 0) {
                    LogUtil.d("ThirdPartySyncActivity", "updateSyncView Sync BEGIN");
                    return;
                }
                if (intExtra == 1) {
                    int doubleExtra = (int) intent.getDoubleExtra("com.huawei.hihealth.action_sync_process", 0.0d);
                    LogUtil.a("ThirdPartySyncActivity", "updateSyncView process = ", Integer.valueOf(doubleExtra));
                    ThirdPartySyncActivity.this.e(doubleExtra);
                } else if (intExtra == 2) {
                    ThirdPartySyncActivity.this.e();
                } else if (intExtra == 3) {
                    ThirdPartySyncActivity.this.f();
                } else {
                    LogUtil.a("ThirdPartySyncActivity", "unknown message.what");
                }
            } catch (Exception unused) {
                LogUtil.e("ThirdPartySyncActivity", "getDataFromIntent Exception");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
