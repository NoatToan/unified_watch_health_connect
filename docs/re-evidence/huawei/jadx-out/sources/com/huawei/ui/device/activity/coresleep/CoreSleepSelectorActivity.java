package com.huawei.ui.device.activity.coresleep;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.share.HiHealthError;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.coresleep.CoreSleepSelectorActivity;
import defpackage.eey;
import defpackage.lmf;
import defpackage.mbt;
import defpackage.mgg;
import defpackage.mhs;
import defpackage.mhw;
import defpackage.qjy;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class CoreSleepSelectorActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthSwitchButton f24297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24299c = false;
    private boolean e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_core_sleep_selector);
        clearBackgroundDrawable();
        DeviceInfo deviceInfoD = mgg.d("CORESLEEPMISSON_CoreSleepSelectorActivity");
        final boolean zD = eey.d(deviceInfoD, HiHealthError.ERR_WRONG_DEVICE);
        final boolean zB = mbt.a().b(deviceInfoD);
        e(zD);
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CORESLEEPMISSON_CoreSleepSelectorActivity", "isSupportNormalSleepSunset ", Boolean.valueOf(zD), ", isSupportSleepBreathe ", Boolean.valueOf(zB));
        this.f24297a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.coresleep.CoreSleepSelectorActivity.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_CORESLEEPMISSON_CoreSleepSelectorActivity", "onCheckedChanged, isChecked is", Boolean.valueOf(z));
                if (compoundButton.isPressed()) {
                    LogUtil.a("CORESLEEPMISSON_CoreSleepSelectorActivity", "user change switch.");
                    CoreSleepSelectorActivity.this.f24299c = true;
                }
                if (!z && compoundButton.isPressed() && zD && !zB) {
                    CoreSleepSelectorActivity.this.a(false);
                } else if (z || !compoundButton.isPressed() || !zB) {
                    CoreSleepSelectorActivity.this.c(z);
                } else {
                    CoreSleepSelectorActivity.this.e();
                }
            }
        });
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("CORESLEEPMISSON_CoreSleepSelectorActivity", "Intent is null.");
        } else {
            boolean booleanExtra = intent.getBooleanExtra("core_sleep_active_open_control_btn", false);
            this.e = booleanExtra;
            LogUtil.a("CORESLEEPMISSON_CoreSleepSelectorActivity", "mIsFromRemindToast：", Boolean.valueOf(booleanExtra));
        }
        c();
    }

    private void a(ImageView imageView) {
        int iMin = (int) (((double) Math.min(qrs.m() / 2, qrs.q())) * 0.8d);
        imageView.getLayoutParams().height = iMin;
        imageView.getLayoutParams().width = iMin;
        imageView.setImageBitmap(qqf.e(qqf.e(R.mipmap.ic_core_sleep_img, BaseApplication.getContext()), imageView));
    }

    private void d() {
        View viewInflate = View.inflate(this, R.layout.dialog_close_core_sleep_layout, null);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
        builder.a(viewInflate).d(R.string.IDS_core_sleep_dialog_no, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.coresleep.CoreSleepSelectorActivity.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                CoreSleepSelectorActivity.this.f24297a.setChecked(true);
                LogUtil.a("CORESLEEPMISSON_CoreSleepSelectorActivity", "showNewAlertDialog no");
            }
        }).a(R.string.IDS_core_sleep_dialog_yes, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.coresleep.CoreSleepSelectorActivity.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                CoreSleepSelectorActivity.this.c(false);
                CoreSleepSelectorActivity.this.b();
                LogUtil.a("CORESLEEPMISSON_CoreSleepSelectorActivity", "showNewAlertDialog yes");
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(getResources().getString(R.string.IDS_core_sleep_switch_dialog)).c(R.string.IDS_core_sleep_dialog_no, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.coresleep.CoreSleepSelectorActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CoreSleepSelectorActivity.this.f24297a.setChecked(true);
                LogUtil.a("CORESLEEPMISSON_CoreSleepSelectorActivity", "showAlertDialog no");
            }
        }).a(R.string.IDS_core_sleep_dialog_yes, new View.OnClickListener() { // from class: qup
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(z, view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void c(boolean z, View view) {
        c(false);
        if (z) {
            b();
            qpx.e(getApplicationContext(), getString(R.string.IDS_core_sleep_disable_breathe));
        }
        LogUtil.a("CORESLEEPMISSON_CoreSleepSelectorActivity", "showAlertDialog yes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        if (!z) {
            qjy.e(this.f24298b, "core_sleep_btn_tips_do_not_remind_again", "core_sleep_btn_tips_cnt");
        }
        d(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        mhs.a().setSwitchSetting("sleep_breathe_key", "false", new IBaseResponseCallback() { // from class: qus
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                CoreSleepSelectorActivity.d(i, obj);
            }
        });
    }

    public static /* synthetic */ void d(int i, Object obj) {
        LogUtil.a("CORESLEEPMISSON_CoreSleepSelectorActivity", "setSleepBreatheSwitch errorCode: ", Integer.valueOf(i));
        if (i == 0) {
            mbt.a().d("false");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        mhs.a().getSwitchSetting("sleep_breathe_key", new IBaseResponseCallback() { // from class: qul
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f46876c.e(i, obj);
            }
        });
    }

    public /* synthetic */ void e(int i, Object obj) {
        LogUtil.a("CORESLEEPMISSON_CoreSleepSelectorActivity", "changeSleepBreatheSwitch errorCode: ", Integer.valueOf(i));
        if (i == 0 && ("false".equals(obj) || "0".equals(obj))) {
            runOnUiThread(new Runnable() { // from class: quq
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a();
                }
            });
        } else {
            final boolean zB = mbt.a().b();
            runOnUiThread(new Runnable() { // from class: qur
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46886a.b(zB);
                }
            });
        }
    }

    public /* synthetic */ void a() {
        a(false);
    }

    public /* synthetic */ void b(boolean z) {
        if (z) {
            d();
        } else {
            a(true);
        }
    }

    private void e(boolean z) {
        this.f24298b = this;
        this.f24297a = (HealthSwitchButton) findViewById(R.id.event_core_sleep_switch_btn);
        ((HealthTextView) findViewById(R.id.content_2)).setText(getResources().getString(R.string.IDS_core_sleep_content_2, 6));
        ((HealthTextView) findViewById(R.id.content_3)).setText(getResources().getString(R.string.IDS_core_sleep_content_3, 200));
        a((ImageView) findViewById(R.id.core_sleep_image));
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.core_switch_detail);
        if (z) {
            return;
        }
        healthTextView.setVisibility(8);
    }

    private void c() {
        LogUtil.a("CORESLEEPMISSON_CoreSleepSelectorActivity", "initData()");
        this.f24299c = false;
        final String strE = mhw.e();
        this.f24297a.setChecked("1".equals(strE));
        mhs.a().getSwitchSetting("core_sleep_button", new IBaseResponseCallback() { // from class: quo
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f46883a.e(strE, i, obj);
            }
        });
    }

    public /* synthetic */ void e(String str, int i, Object obj) {
        final boolean zEquals;
        LogUtil.a("CORESLEEPMISSON_CoreSleepSelectorActivity", "CORE_SLEEP_BUTTON errorCode = ", Integer.valueOf(i));
        if (i == 0 && (obj instanceof String)) {
            String str2 = (String) obj;
            zEquals = "1".equals(str2);
            if (!str.equals(str2)) {
                mhw.c(str2);
            }
        } else {
            zEquals = false;
        }
        LogUtil.a("CORESLEEPMISSON_CoreSleepSelectorActivity", "isEnable: ", Boolean.valueOf(zEquals));
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.coresleep.CoreSleepSelectorActivity.4
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("CORESLEEPMISSON_CoreSleepSelectorActivity", "runOnUiThread");
                if (!CoreSleepSelectorActivity.this.f24299c) {
                    if (CoreSleepSelectorActivity.this.e) {
                        boolean zIsChecked = CoreSleepSelectorActivity.this.f24297a.isChecked();
                        LogUtil.a("CORESLEEPMISSON_CoreSleepSelectorActivity", "switchButtonIsOpen", Boolean.valueOf(zIsChecked));
                        if (zIsChecked) {
                            CoreSleepSelectorActivity.this.d(true);
                        } else {
                            CoreSleepSelectorActivity.this.f24297a.setChecked(true);
                        }
                        CoreSleepSelectorActivity.this.e = false;
                        return;
                    }
                    LogUtil.a("CORESLEEPMISSON_CoreSleepSelectorActivity", "default : ", Boolean.valueOf(zEquals));
                    CoreSleepSelectorActivity.this.f24297a.setChecked(zEquals);
                    return;
                }
                LogUtil.j("CORESLEEPMISSON_CoreSleepSelectorActivity", "user already change switch, no need auto change");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        String str;
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CORESLEEPMISSON_CoreSleepSelectorActivity", "checked isChecked:", Boolean.valueOf(z));
        Intent intent = new Intent();
        Intent intent2 = new Intent();
        intent2.setAction("action_change_core_sleep_button");
        if (z) {
            intent.putExtra("status", "1");
            intent2.putExtra("status", "1");
            str = "1";
        } else {
            str = "0";
            intent.putExtra("status", "0");
            intent2.putExtra("status", "0");
        }
        BroadcastManagerUtil.e(this.f24298b, intent2);
        setResult(-1, intent);
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("status", str);
        String strValue = AnalyticsValue.SETTING_1090005.value();
        lmf.d().c(this.f24298b, strValue, map, 0);
        LogUtil.a("CORESLEEPMISSON_CoreSleepSelectorActivity", "BI save coreSleep click event finish, value is ", strValue);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("CORESLEEPMISSON_CoreSleepSelectorActivity", "onDestroy()");
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
