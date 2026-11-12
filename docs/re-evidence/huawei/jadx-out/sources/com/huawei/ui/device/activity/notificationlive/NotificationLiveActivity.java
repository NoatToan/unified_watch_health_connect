package com.huawei.ui.device.activity.notificationlive;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.device.R;
import com.huawei.ui.device.interactors.NotificationPushInteractor;
import defpackage.mhs;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationLiveActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f24565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f24566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NotificationPushInteractor f24567c;
    private Boolean d;
    private boolean e = false;
    private HealthSwitchButton f;
    private HealthTextView j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_notification_live);
        Intent intent = getIntent();
        if (intent != null) {
            this.d = Boolean.valueOf(intent.getBooleanExtra("LiveViewType", false));
        }
        LogUtil.a("NotificationLiveActivity", "LiveViewType: ", this.d);
        d();
        this.f24567c = new NotificationPushInteractor(this);
    }

    private void d() {
        this.f = (HealthSwitchButton) findViewById(R.id.notification_live_switch_btn);
        this.f24566b = (TextView) findViewById(R.id.notification_live_detail);
        this.j = (HealthTextView) findViewById(R.id.notification_live_switch_note);
        this.f24565a = (TextView) findViewById(R.id.notification_live_note);
        if (this.d.booleanValue()) {
            this.f24566b.setText(R.string.IDS_notification_live_detail_live);
            this.j.setText(R.string.IDS_notification_live_switch_content_live);
            this.f24565a.setText(R.string.IDS_notification_live_note_live);
        } else {
            this.f24566b.setText(R.string.IDS_notification_live_detail);
            this.j.setText(R.string.IDS_notification_live_switch_content);
            this.f24565a.setText(R.string.IDS_notification_live_note);
        }
        this.f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.notificationlive.NotificationLiveActivity.4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                String str;
                ReleaseLogUtil.d("R_NotificationLiveActivity", "onCheckedChanged, isChecked is", Boolean.valueOf(z));
                NotificationLiveActivity.this.e = true;
                if (z) {
                    str = "true";
                } else {
                    str = "false";
                }
                mhs.a().setSwitchSetting("notification_live_switch", str, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.notificationlive.NotificationLiveActivity.4.4
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        LogUtil.a("NotificationLiveActivity", "onCheckedChanged setSwitchSetting errorCode:", Integer.valueOf(i));
                    }
                });
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        e();
    }

    private void e() {
        this.f.setEnabled(this.f24567c.b());
        this.e = false;
        mhs.a().getSwitchSetting("notification_live_switch", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.notificationlive.NotificationLiveActivity.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("R_NotificationLiveActivity", "updateView getSwitchSetting onResponse errorCode:", Integer.valueOf(i), " objData:", obj);
                final boolean zEquals = true;
                if (i == 0 && (obj instanceof String)) {
                    zEquals = true ^ "false".equals(obj);
                }
                NotificationLiveActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.notificationlive.NotificationLiveActivity.5.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (NotificationLiveActivity.this.e) {
                            return;
                        }
                        NotificationLiveActivity.this.f.setChecked(zEquals);
                    }
                });
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
