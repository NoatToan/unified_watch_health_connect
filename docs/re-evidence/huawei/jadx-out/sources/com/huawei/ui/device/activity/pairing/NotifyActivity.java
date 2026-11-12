package com.huawei.ui.device.activity.pairing;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.connectmgr.DeviceDialogMessage;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IWearPhoneServiceAIDL;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import defpackage.lug;
import defpackage.qql;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes43.dex */
public class NotifyActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f24650b = new Handler();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24651c;
    private long e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("NotifyActivity", "NotifyActivity onCreate.");
        Window window = getWindow();
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        Intent intent = getIntent();
        if (intent != null) {
            this.f24651c = intent.getStringExtra("deviceName");
            this.f24649a = intent.getIntExtra("dialog_style", 0);
            this.e = intent.getLongExtra("device_id", -1L);
            if (!TextUtils.isEmpty(this.f24651c)) {
                this.f24649a = 100;
            }
            e(this.f24649a);
        }
    }

    private void e(int i) {
        switch (i) {
            case 100:
                a();
                break;
            case 101:
                if (!isFinishing()) {
                    qql.b(this, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.NotifyActivity.5
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            NotifyActivity.this.finish();
                        }
                    }, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.NotifyActivity.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            NotifyActivity.this.finish();
                        }
                    });
                }
                break;
            case 102:
                if (!isFinishing()) {
                    qql.a(this, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.NotifyActivity.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            NotifyActivity notifyActivity = NotifyActivity.this;
                            notifyActivity.b(notifyActivity.e);
                            NotifyActivity.this.finish();
                        }
                    }, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.NotifyActivity.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            NotifyActivity.this.finish();
                        }
                    });
                }
                break;
            default:
                LogUtil.a("NotifyActivity", "unknown dialog style.");
                finish();
                break;
        }
    }

    private void a() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this);
        builder.e(getResources().getString(R.string.IDS_hwh_open_service_pop_up_notification_note));
        builder.a(getResources().getString(R.string.IDS_hw_health_double_phone_dialog_content1));
        builder.a(getResources().getString(R.string.IDS_settings_button_cancal), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.NotifyActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("NotifyActivity", "close");
                NotifyActivity.this.b();
                NotifyActivity notifyActivity = NotifyActivity.this;
                notifyActivity.d(1, notifyActivity.f24651c);
                NotifyActivity.this.finish();
            }
        });
        builder.b(getResources().getString(R.string.IDS_btsdk_confirm_connect), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.NotifyActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NotifyActivity.this.b();
                NotifyActivity notifyActivity = NotifyActivity.this;
                notifyActivity.d(0, notifyActivity.f24651c);
                NotifyActivity.this.finish();
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        if (isFinishing()) {
            return;
        }
        customTextAlertDialogB.show();
        e();
    }

    private void e() {
        LogUtil.a("NotifyActivity", "Enter handleDoublePhoneTimeout.");
        Handler handler = this.f24650b;
        if (handler == null) {
            LogUtil.j("NotifyActivity", "handleDoublePhoneTimeout mHandler is null.");
        } else {
            handler.postDelayed(new Runnable() { // from class: com.huawei.ui.device.activity.pairing.NotifyActivity.8
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("NotifyActivity", "double phone dialog select timeout.");
                    NotifyActivity notifyActivity = NotifyActivity.this;
                    notifyActivity.d(1, notifyActivity.f24651c);
                    NotifyActivity.this.finish();
                }
            }, 60000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f24650b != null) {
            LogUtil.a("NotifyActivity", "remove handler message.");
            this.f24650b.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, String str) {
        if (str == null) {
            LogUtil.a("NotifyActivity", "deviceName is null.");
        } else {
            LogUtil.a("NotifyActivity", "send broadcast : ", "com.huawei.health.action.ACTION_DOUBLE_PHONE_CONFIRM_OR_CANCEL", str);
            c(str, i);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        CommonUtil.d(BaseApplication.getContext());
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC != null) {
            try {
                DeviceDialogMessage deviceDialogMessage = new DeviceDialogMessage();
                deviceDialogMessage.setMethod(PrebakedEffectId.RT_SPEED_UP);
                deviceDialogMessage.setIsStatusFlag(false);
                deviceDialogMessage.setSelectId(j);
                deviceDialogMessage.setDeviceName(null);
                iWearPhoneServiceAIDLC.dialogMessage(deviceDialogMessage, null);
            } catch (RemoteException unused) {
                LogUtil.e("NotifyActivity", "connectDevice RemoteException");
            }
        }
    }

    private void c(String str, int i) {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC != null) {
            try {
                DeviceDialogMessage deviceDialogMessage = new DeviceDialogMessage();
                deviceDialogMessage.setMethod(PrebakedEffectId.RT_JUMP);
                deviceDialogMessage.setSelectId(0L);
                deviceDialogMessage.setDeviceName(str);
                if (i == 0) {
                    deviceDialogMessage.setIsStatusFlag(false);
                    iWearPhoneServiceAIDLC.dialogMessage(deviceDialogMessage, null);
                } else if (i != 1) {
                    LogUtil.a("NotifyActivity", "notifyDeviceDoublePhone else branch");
                } else {
                    deviceDialogMessage.setIsStatusFlag(true);
                    iWearPhoneServiceAIDLC.dialogMessage(deviceDialogMessage, null);
                }
            } catch (RemoteException unused) {
                LogUtil.e("NotifyActivity", "notifyDeviceDoublePhone RemoteException");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
