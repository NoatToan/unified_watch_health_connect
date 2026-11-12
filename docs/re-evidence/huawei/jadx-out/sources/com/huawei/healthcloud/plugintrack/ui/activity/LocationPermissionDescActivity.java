package com.huawei.healthcloud.plugintrack.ui.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import defpackage.ive;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes33.dex */
public class LocationPermissionDescActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f10832a;
    private HealthButton d;
    private int e = 258;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10833b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f10834c = -1.0f;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.location_description_layout);
        e();
        c();
    }

    private void c() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.e = intent.getIntExtra("map_tracking_sport_type_sportting", 258);
                this.f10833b = intent.getIntExtra("sport_target_type_sportting", this.f10833b);
                this.f10834c = intent.getFloatExtra("sport_target_value_sportting", this.f10834c);
            } catch (BadParcelableException unused) {
                ReleaseLogUtil.e("LocationPermissionDescActivity", "initData failed.");
            }
        }
    }

    private void e() {
        ((HealthCardView) findViewById(R.id.permission_desc_background)).setBackgroundResource(R.drawable.location_description_page_background);
        ((ImageView) findViewById(R.id.marker_logo)).setBackground(getResources().getDrawable(R.drawable.ic_location_description));
        this.d = (HealthButton) findViewById(R.id.reject);
        this.f10832a = (HealthButton) findViewById(R.id.agree);
        this.d.setOnClickListener(this);
        this.f10832a.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f10832a) {
            finish();
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.LocationPermissionDescActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    ive.c().c(LocationPermissionDescActivity.this.getApplicationContext(), LocationPermissionDescActivity.this.e, LocationPermissionDescActivity.this.f10833b, LocationPermissionDescActivity.this.f10834c);
                }
            }, 100L);
        } else if (view == this.d) {
            finish();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
