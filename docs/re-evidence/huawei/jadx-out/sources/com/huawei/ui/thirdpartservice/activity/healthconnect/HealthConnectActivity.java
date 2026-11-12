package com.huawei.ui.thirdpartservice.activity.healthconnect;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.PermissionController;
import androidx.health.connect.client.permission.HealthPermission;
import androidx.health.connect.client.records.ActiveCaloriesBurnedRecord;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.StepsRecord;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.view.CustomWebView$$ExternalSyntheticBackport0;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.thirdpartservice.R;
import defpackage.java;
import defpackage.ltc;
import defpackage.lua;
import defpackage.wyx;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public class HealthConnectActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f29099a = CustomWebView$$ExternalSyntheticBackport0.m1631m(new Object[]{HealthPermission.getWritePermission(java.b(StepsRecord.class)), HealthPermission.getWritePermission(java.b(ActiveCaloriesBurnedRecord.class)), HealthPermission.getWritePermission(java.b(SleepSessionRecord.class))});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f29101c;
    private HealthButton d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthColumnLinearLayout g;
    private HealthButton h;
    private Context i;
    private HealthColumnLinearLayout j;
    private HealthButton k;
    private HealthButton l;
    private HealthTextView m;
    private ActivityResultLauncher<Set<String>> n;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i = this;
        LogUtil.a("HealthConnectActivity", "enter onCreate()");
        this.f29100b = lua.e("THIRD_PARTY_SERVICE", "HEALTH_CONNECT_AGREEMENT_STATUS", false);
        b();
        a();
        c();
    }

    private void b() {
        this.n = registerForActivityResult(PermissionController.createRequestPermissionResultContract(BaseApplication.d()), new ActivityResultCallback<Set<String>>(this) { // from class: com.huawei.ui.thirdpartservice.activity.healthconnect.HealthConnectActivity.1
            @Override // androidx.activity.result.ActivityResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onActivityResult(Set<String> set) {
                LogUtil.a("HealthConnectActivity", "onActivityResult:", set);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("HealthConnectActivity", "onActivityResult, requestCode: ", Integer.valueOf(i), ", resultCode: ", Integer.valueOf(i2), ", data: ", HiJsonUtil.d(intent));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("HealthConnectActivity", "onResume()");
        if (lua.e("THIRD_PARTY_SERVICE", "HEALTH_CONNECT_AGREEMENT_STATUS", false)) {
            if (wyx.c().h()) {
                wyx.c().n();
            }
            if (wyx.c().g()) {
                wyx.c().l();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LogUtil.a("HealthConnectActivity", "onNewIntent()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        LogUtil.a("HealthConnectActivity", "onRequestPermissionsResult()");
        c();
    }

    private void a() {
        setContentView(R.layout.activity_health_connect);
        this.m = (HealthTextView) findViewById(R.id.health_connect_content);
        this.e = (HealthTextView) findViewById(R.id.health_connect_desc_1);
        this.e.setText(getString(R.string.IDS_health_connect_desc_1, new Object[]{ltc.c(1.0d, 1, 0)}));
        this.f29101c = (HealthTextView) findViewById(R.id.health_connect_desc_2);
        this.f29101c.setText(getString(R.string.IDS_health_connect_desc_2, new Object[]{ltc.c(2.0d, 1, 0)}));
        this.f = (HealthTextView) findViewById(R.id.health_connect_desc_4);
        this.g = (HealthColumnLinearLayout) findViewById(R.id.healthconnect_agreement);
        this.j = (HealthColumnLinearLayout) findViewById(R.id.healthconnect_authorize);
    }

    private void c() {
        if (this.f29100b) {
            this.m.setText(R.string.IDS_health_connect_guide);
            this.j.setVisibility(0);
            this.g.setVisibility(8);
            this.f.setVisibility(0);
            this.f.setText(getString(R.string.IDS_health_connect_desc_4, new Object[]{ltc.c(3.0d, 1, 0)}));
            this.k = (HealthButton) findViewById(R.id.healthconnect_manage_btn);
            this.l = (HealthButton) findViewById(R.id.healthconnect_revoke_btn);
            this.k.setOnClickListener(new View.OnClickListener() { // from class: wwy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f52567c.b(view);
                }
            });
            this.l.setOnClickListener(new View.OnClickListener() { // from class: wxa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f52570c.d(view);
                }
            });
            return;
        }
        this.m.setText(R.string.IDS_health_connect_agree);
        this.g.setVisibility(0);
        this.j.setVisibility(8);
        this.f.setVisibility(8);
        this.d = (HealthButton) findViewById(R.id.healthconnect_agree_btn);
        this.h = (HealthButton) findViewById(R.id.healthconnect_disagree_btn);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: wxe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(view);
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: wxc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52573c.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        finish();
    }

    private void e() {
        LogUtil.a("HealthConnectActivity", "jumpToAuthorize");
        lua.b("THIRD_PARTY_SERVICE", "HEALTH_CONNECT_AGREEMENT_STATUS", true);
        this.f29100b = true;
        wyx.c().b();
        boolean zF = wyx.c().f();
        boolean zD = wyx.c().d();
        boolean zE = wyx.c().e();
        LogUtil.a("HealthConnectActivity", "step: ", Boolean.valueOf(zF), ", calories: ", Boolean.valueOf(zD), ", sleep: ", Boolean.valueOf(zE));
        LogUtil.a("HealthConnectActivity", FitRunPlayAudio.OPPORTUNITY_M);
        if (zF && zD && zE) {
            c();
        } else {
            this.n.launch(f29099a);
        }
    }

    private void d() {
        LogUtil.a("HealthConnectActivity", "manage permissions");
        Intent intent = new Intent();
        intent.setAction(HealthConnectClient.getHealthConnectSettingsAction());
        startActivity(intent);
    }

    private void f() {
        LogUtil.a("HealthConnectActivity", "revoke all permissions");
        lua.b("THIRD_PARTY_SERVICE", "HEALTH_CONNECT_AGREEMENT_STATUS", false);
        wyx.c().o();
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
