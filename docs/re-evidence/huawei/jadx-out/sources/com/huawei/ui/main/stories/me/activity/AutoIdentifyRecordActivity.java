package com.huawei.ui.main.stories.me.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.CompoundButton;
import androidx.core.content.ContextCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.me.util.AppSettingUtil;
import defpackage.des;
import defpackage.ive;
import defpackage.iyd;
import defpackage.lmf;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class AutoIdentifyRecordActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28400a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppSettingUtil f28401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthSwitchButton f28402c;
    private iyd e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_auto_identify_record);
        d();
        a();
        c();
    }

    private void d() {
        ((CustomTitleBar) findViewById(R.id.ctb_auto_identify_record)).setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.common_transparent));
        this.f28402c = (HealthSwitchButton) findViewById(R.id.hwb_auto_switch);
    }

    private void a() {
        e();
        iyd iydVarD = ive.c().d(this);
        this.e = iydVarD;
        if (iydVarD.h()) {
            this.e.e(false);
        }
        this.f28401b = new AppSettingUtil(this);
        this.e.a(this);
        b();
        if (this.e.f()) {
            return;
        }
        ((HealthTextView) findViewById(R.id.auto_identify_record_explain)).setText(R.string.IDS_auto_track_explain_run);
    }

    private void c() {
        this.f28402c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.me.activity.AutoIdentifyRecordActivity$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f28403b.e(compoundButton, z);
            }
        });
    }

    /* synthetic */ void e(CompoundButton compoundButton, final boolean z) {
        if (this.f28402c.isPressed()) {
            LoginInit.getInstance(this).browsingToLogin(new IBaseResponseCallback() { // from class: vso
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f51565c.e(z, i, obj);
                }
            }, "");
        }
    }

    public /* synthetic */ void e(boolean z, int i, Object obj) {
        if (i == 0) {
            this.f28401b.e(z, this.e, this.f28402c);
            des.a(this, this.f28400a, true, this.f28402c.isChecked(), (int) this.e.a());
        } else {
            this.f28402c.setChecked(!z);
            LogUtil.j("Track_AutoIdentifyRecordActivity", "errorCode is not success", Integer.valueOf(i));
        }
    }

    private void e() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Track_AutoIdentifyRecordActivity", "initIntentData intent is null");
        } else {
            c(intent.getIntExtra("auto_track_launch_source", 0));
        }
    }

    private void c(int i) {
        if (i == 0) {
            LogUtil.j("Track_AutoIdentifyRecordActivity", "setLaunchSourceBi launchSourceCode is error");
            return;
        }
        this.f28400a = i;
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("from", Integer.valueOf(i));
        lmf.d().c(this, AnalyticsValue.HEALTH_AUTO_TRACK_ENTER_1040072.value(), map, 0);
    }

    private void b() {
        this.f28402c.setChecked(this.e.e());
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
