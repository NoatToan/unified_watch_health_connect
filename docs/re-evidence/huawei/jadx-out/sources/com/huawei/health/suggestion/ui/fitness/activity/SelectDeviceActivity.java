package com.huawei.health.suggestion.ui.fitness.activity;

import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.dialog.CustomDeviceSelectDialog;
import com.huawei.health.device.ui.dialog.DeviceCheckAdapter;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseActivity;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dmp;
import defpackage.dru;
import defpackage.hcd;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class SelectDeviceActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9133a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<ContentValues> f9134c;
    private HealthDevice.HealthDeviceKind d;
    private CustomDeviceSelectDialog e;

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initViewController() {
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initData() {
        LogUtil.a("Suggestion_SelectDeviceActivity", "come in SelectDeviceActivity");
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Suggestion_SelectDeviceActivity", "getIntent is null");
            return;
        }
        this.f9133a = intent.getIntExtra("SPORT_TYPE", 264);
        this.d = (HealthDevice.HealthDeviceKind) hcd.f36391c.get(Integer.valueOf(this.f9133a));
        this.f9134c = dmp.d().c(this.d);
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initLayout() {
        setContentView(R.layout.activity_fitness_device_connect);
        b();
    }

    private void b() {
        if (this.d == null) {
            LogUtil.j("Suggestion_SelectDeviceActivity", "showDeviceSelectDialog mCurrentDeviceKind is null");
            return;
        }
        CustomDeviceSelectDialog customDeviceSelectDialogB = new CustomDeviceSelectDialog.Builder(this).d(R.string.IDS_plugin_device_select).d(this.d).e(R.string.IDS_main_time_line_start_workout, new DeviceCheckAdapter.OnItemClickListener() { // from class: hgq
            @Override // com.huawei.health.device.ui.dialog.DeviceCheckAdapter.OnItemClickListener
            public final void onItemClick(dru druVar) {
                this.f36728b.e(druVar);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.SelectDeviceActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SelectDeviceActivity.this.e != null) {
                    SelectDeviceActivity.this.e.dismiss();
                    SelectDeviceActivity.this.e = null;
                    ObserverManagerUtil.e("DEVICE_ASSOCIATION", 152);
                } else {
                    LogUtil.j("Suggestion_SelectDeviceActivity", "showDeviceSelectDialog setNegativeButton mUnbindDialog is null");
                }
                SelectDeviceActivity.this.finish();
            }
        }).b();
        this.e = customDeviceSelectDialogB;
        customDeviceSelectDialogB.setCancelable(false);
        this.e.show();
    }

    public /* synthetic */ void e(dru druVar) {
        CustomDeviceSelectDialog customDeviceSelectDialog = this.e;
        if (customDeviceSelectDialog != null) {
            customDeviceSelectDialog.dismiss();
            this.e = null;
            ObserverManagerUtil.e("DEVICE_ASSOCIATION", druVar.d().getAsString("uniqueId"), hcd.e.get(Integer.valueOf(this.f9133a)));
        } else {
            LogUtil.j("Suggestion_SelectDeviceActivity", "showDeviceSelectDialog setPositiveButton mUnbindDialog is null");
        }
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        LogUtil.a("Suggestion_SelectDeviceActivity", "finish()");
        super.finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
