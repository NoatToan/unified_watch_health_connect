package com.huawei.ui.device.activity.menstrualpredict;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.HealthMonitoringBaseActivity;
import defpackage.lmf;
import defpackage.mhs;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class MenstrualPredictActivity extends HealthMonitoringBaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthSwitchButton f24416c;
    private HealthTextView g;
    private boolean d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24415b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24414a = false;
    private CompoundButton.OnCheckedChangeListener e = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.menstrualpredict.MenstrualPredictActivity$$ExternalSyntheticLambda0
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.d.d(compoundButton, z);
        }
    };

    /* synthetic */ void d(CompoundButton compoundButton, boolean z) {
        LogUtil.a("MenstrualPredictActivity", "mMenstrualPredictSwitchListener isChecked = ", Boolean.valueOf(z));
        if (z) {
            LoginInit loginInit = LoginInit.getInstance(this);
            int iB = b(loginInit);
            int iD = d(loginInit);
            if (iB != 1 || iD < 18) {
                this.f24416c.setEnabled(false);
                a();
                return;
            }
        }
        if (this.d) {
            LogUtil.j("MenstrualPredictActivity", "mMenstrualPredictSwitchListener don't set menstrual predict status");
            this.d = false;
        } else {
            c(z);
        }
    }

    @Override // com.huawei.ui.device.activity.HealthMonitoringBaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_menstrual_predict);
        Intent intent = getIntent();
        if (intent != null) {
            this.f24415b = intent.getBooleanExtra("isFromHealthMonitoring", false);
        }
        e();
        c();
    }

    private void e() {
        this.f24416c = (HealthSwitchButton) findViewById(R.id.menstrual_predict_switch_button);
        this.g = (HealthTextView) findViewById(R.id.menstrual_predict_tv1);
        this.g.setText(getResources().getString(R.string.IDS_menstrual_predict_tips_overSea_2, UnitUtil.e(70.0d, 1, 0)));
    }

    private void c() {
        mhs.a().getSwitchSetting("menstrual_predict_switch", new IBaseResponseCallback() { // from class: qwq
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.a(i, obj);
            }
        });
    }

    public /* synthetic */ void a(int i, Object obj) {
        String str;
        LogUtil.a("MenstrualPredictActivity", "initSwitchStatus errorCode = ", Integer.valueOf(i));
        if (i == 0 && (obj instanceof String)) {
            str = (String) obj;
        } else {
            str = "0";
        }
        LogUtil.a("MenstrualPredictActivity", "initSwitchStatus switchStatus = ", str);
        final boolean zEquals = "1".equals(str);
        this.f24414a = zEquals;
        runOnUiThread(new Runnable() { // from class: qwk
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b(zEquals);
            }
        });
    }

    public /* synthetic */ void b(boolean z) {
        this.f24416c.setChecked(z);
        this.f24416c.setOnCheckedChangeListener(this.e);
    }

    private int b(LoginInit loginInit) {
        if (loginInit == null) {
            return -1;
        }
        String accountInfo = loginInit.getAccountInfo(1005);
        LogUtil.a("MenstrualPredictActivity", "getUserGender genderStr = ", accountInfo);
        return CommonUtil.e(accountInfo, -1);
    }

    private int d(LoginInit loginInit) {
        String accountInfo = loginInit.getAccountInfo(1006);
        if (TextUtils.isEmpty(accountInfo) || accountInfo.length() <= 4) {
            LogUtil.j("MenstrualPredictActivity", "getUserAge birthDate is empty or length is illegal");
            return 0;
        }
        int iD = HiDateUtil.d(System.currentTimeMillis());
        String strValueOf = String.valueOf(iD);
        if (strValueOf.length() <= 4) {
            LogUtil.j("MenstrualPredictActivity", "getUserAge currentDateStr length is illegal");
            return 0;
        }
        try {
            int i = Integer.parseInt(accountInfo.substring(accountInfo.length() - 4));
            int i2 = Integer.parseInt(strValueOf.substring(strValueOf.length() - 4));
            int i3 = (iD / 10000) - (Integer.parseInt(accountInfo) / 10000);
            return i2 < i ? i3 - 1 : i3;
        } catch (NumberFormatException unused) {
            LogUtil.e("MenstrualPredictActivity", "getUserAge NumberFormatException");
            return 0;
        }
    }

    private void c(boolean z) {
        LogUtil.a("MenstrualPredictActivity", "setMenstrualPredictStatus");
        this.f24414a = z;
        d(false);
        String str = z ? "1" : "0";
        this.f24416c.setEnabled(true);
        this.f24416c.setChecked(z);
        mhs.a().sendSettingSwitchCommand("hw.unitedevice.physiological", "hw.watch.health.physiological", 900300012L, str);
        mhs.a().setSwitchSetting("menstrual_predict_switch", str, new IBaseResponseCallback() { // from class: qwj
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                LogUtil.a("MenstrualPredictActivity", "setMenstrualPredictStatus errorCode = ", Integer.valueOf(i));
            }
        });
        Intent intent = new Intent();
        intent.putExtra("menstrualPredictResultStatus", str);
        setResult(-1, intent);
    }

    private void a() {
        LogUtil.a("MenstrualPredictActivity", "showNoticeDialog");
        String str = String.format(Locale.getDefault(), getResources().getString(R.string.IDS_menstrual_predict_dialog), 18);
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.a(str);
        builder.d(getResources().getString(R.string.IDS_hw_show_cancel), new View.OnClickListener() { // from class: qwo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46922b.b(view);
            }
        });
        builder.a(getString(R.string.IDS_hw_common_ui_dialog_confirm), new View.OnClickListener() { // from class: qwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void b(View view) {
        LogUtil.a("MenstrualPredictActivity", "click negative button");
        this.d = true;
        this.f24416c.setEnabled(true);
        this.f24416c.setChecked(false);
    }

    public /* synthetic */ void e(View view) {
        LogUtil.a("MenstrualPredictActivity", "click positive button");
        c(true);
    }

    @Override // com.huawei.ui.device.activity.HealthMonitoringBaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d(true);
    }

    private void d(boolean z) {
        LogUtil.a("MenstrualPredictActivity", "setSwitchStatusBi isSwitchStatus = ", Boolean.valueOf(z));
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (this.f24414a) {
            if (z) {
                map.put("switchStatus", "true");
            } else {
                map.put("event", "1");
            }
        } else if (z) {
            map.put("switchStatus", "false");
        } else {
            map.put("event", "2");
        }
        if (this.f24415b) {
            map.put("setPath", "2");
        } else {
            map.put("setPath", "1");
        }
        String strValue = AnalyticsValue.MENSTRUAL_PREDICT_SWITCH_EVENT.value();
        LogUtil.a("MenstrualPredictActivity", "setSwitchEventBi value = ", strValue, ", map = ", map.toString());
        lmf.d().c(this, strValue, map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
