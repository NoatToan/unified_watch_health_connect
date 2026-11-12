package com.huawei.ui.main.stories.me.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.core.content.ContextCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.wmq;
import defpackage.wuf;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class PrivacyTrainingStatisticsActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f28456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f28457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28458c;
    private HealthTextView d;
    private HealthSwitchButton e;
    private HealthTextView f;
    private wmq g;
    private int h = -1;
    private HealthSwitchButton i;
    private boolean j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28456a = this;
        c();
        b();
    }

    private void c() {
        setContentView(R.layout.activity_privacy_training_statistics);
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.training_statistics_set_titlebar);
        this.f28457b = customTitleBar;
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: vuz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51612a.c(view);
            }
        });
        this.i = (HealthSwitchButton) qsp.a(this, R.id.sport_statistics_switch);
        this.f = (HealthTextView) qsp.a(this, R.id.sport_statistics_text);
        this.e = (HealthSwitchButton) qsp.a(this, R.id.health_statistics_switch);
        this.d = (HealthTextView) qsp.a(this, R.id.health_statistics_text);
        this.i.setOnCheckedChangeListener(this);
        this.e.setOnCheckedChangeListener(this);
    }

    public /* synthetic */ void c(View view) {
        LogUtil.a("PrivacyTrainingStatisticsActivity", "initView out the page");
        finish();
    }

    private void b() {
        this.g = wmq.a(getApplicationContext());
        e();
        a();
    }

    private void a() {
        boolean zEquals = "true".equals(this.g.c(7));
        boolean zEquals2 = "true".equals(this.g.c(203));
        c(zEquals);
        boolean z = zEquals && zEquals2;
        this.f28458c = z;
        this.e.setChecked(z);
    }

    private void e() {
        boolean zEquals = "true".equals(this.g.c(3));
        boolean zEquals2 = "true".equals(this.g.c(202));
        h(zEquals);
        boolean z = zEquals && zEquals2;
        this.j = z;
        this.i.setChecked(z);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        LogUtil.a("PrivacyTrainingStatisticsActivity", "onConfigurationChanged");
        wuf.d(this.f28456a);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton == null) {
            LogUtil.j("PrivacyTrainingStatisticsActivity", "onCheckedChanged buttonView is null");
            return;
        }
        if (!compoundButton.isPressed() || !qrs.d((Activity) this)) {
            LogUtil.a("PrivacyTrainingStatisticsActivity", "onCheckedChanged isChecked() = ", Boolean.valueOf(z));
            int id = compoundButton.getId();
            this.h = id;
            if (id == R.id.sport_statistics_switch) {
                a(z);
                return;
            } else if (this.h != R.id.health_statistics_switch) {
                LogUtil.j("PrivacyTrainingStatisticsActivity", "handleOtherSwitch else");
                return;
            } else {
                b(z);
                return;
            }
        }
        compoundButton.setChecked(!z);
        LogUtil.a("PrivacyTrainingStatisticsActivity", "onCheckedChanged show no network dialog");
    }

    private void a(boolean z) {
        if (z) {
            e(this.f28456a.getString(R.string.IDS_privacy_sport_stats_open));
        } else {
            i(z);
            if (this.j) {
                e(false);
                d("0");
            }
        }
        this.j = true;
    }

    private void b(boolean z) {
        if (z) {
            e(this.f28456a.getString(R.string.IDS_privacy_health_stats_con));
        } else {
            i(z);
            if (this.f28458c) {
                e(false);
                d("0");
            }
        }
        this.f28458c = true;
    }

    private void e(boolean z) {
        int i;
        if (this.h == R.id.sport_statistics_switch) {
            i = 202;
        } else if (this.h == R.id.health_statistics_switch) {
            i = 203;
        } else {
            LogUtil.j("PrivacyTrainingStatisticsActivity", "savePersonalPrivacySettings else");
            i = -1;
        }
        LogUtil.a("PrivacyTrainingStatisticsActivity", "privacyId = ", Integer.valueOf(i), ", isOpen = ", Boolean.valueOf(z));
        if (i != -1) {
            this.g.a(i, z);
        }
    }

    private void e(String str) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(str).a(this.f28456a.getString(R.string.IDS_settings_button_ok).toUpperCase(Locale.getDefault()), new View.OnClickListener() { // from class: vva
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51613c.d(view);
            }
        }).d(this.f28456a.getString(R.string.IDS_settings_button_cancal).toUpperCase(Locale.getDefault()), new View.OnClickListener() { // from class: vuy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51611c.e(view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void d(View view) {
        e(true);
        d("1");
        i(true);
    }

    public /* synthetic */ void e(View view) {
        d(false);
        i(false);
    }

    private void i(boolean z) {
        if (this.h == R.id.sport_statistics_switch) {
            this.i.setChecked(z);
        } else if (this.h == R.id.health_statistics_switch) {
            this.e.setChecked(z);
        } else {
            LogUtil.j("PrivacyTrainingStatisticsActivity", "setSwitchButtonCheck else");
        }
    }

    private void d(String str) {
        if (this.h == R.id.sport_statistics_switch) {
            a(str);
            LogUtil.a("PrivacyTrainingStatisticsActivity", "handleUserOpenStatistics setUserCloseSportStatistics ", str);
        } else if (this.h == R.id.health_statistics_switch) {
            c(str);
            LogUtil.a("PrivacyTrainingStatisticsActivity", "handleUserOpenStatistics setUserCloseHealthStatistics ", str);
        } else {
            LogUtil.j("PrivacyTrainingStatisticsActivity", "handleUserOpenStatistics else");
        }
    }

    private void d(boolean z) {
        if (this.h == R.id.sport_statistics_switch) {
            this.j = z;
        } else if (this.h == R.id.health_statistics_switch) {
            this.f28458c = z;
        } else {
            LogUtil.j("PrivacyTrainingStatisticsActivity", "saveInitSatus else");
        }
    }

    private void h(boolean z) {
        this.i.setClickable(z);
        this.i.setEnabled(z);
        this.f.setTextColor(ContextCompat.getColor(this, z ? R.color.textColorPrimary : R.color.textColorSecondary));
    }

    private void c(boolean z) {
        this.e.setClickable(z);
        this.e.setEnabled(z);
        this.d.setTextColor(ContextCompat.getColor(this, z ? R.color.textColorPrimary : R.color.textColorSecondary));
    }

    private void a(String str) {
        SharedPreferenceManager.e(this.f28456a, Integer.toString(10000), "key_user_close_training", str, new StorageParams());
    }

    private void c(String str) {
        SharedPreferenceManager.e(this.f28456a, Integer.toString(10000), "key_user_close_health_training_statistics", str, new StorageParams());
    }
}
