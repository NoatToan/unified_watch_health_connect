package com.huawei.ui.thirdpartservice.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.thirdpartservice.R;
import com.huawei.ui.thirdpartservice.activity.healthkitthirdparty.ThirdPartAppAdapter;
import defpackage.njy;
import defpackage.qsp;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class DeviceShareActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRecycleView f29085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ThirdPartAppAdapter f29086b;
    private List<HiAppInfo> d;
    private Context e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_device_share);
        this.e = this;
        d();
        c();
    }

    private void c() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        try {
            this.d = intent.getParcelableArrayListExtra(KnitFragment.KEY_EXTRA);
        } catch (Exception unused) {
            LogUtil.e("DeviceShareActivity", "initData Exception");
        }
        b();
    }

    private void d() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) qsp.a(this, R.id.rv_device_share);
        this.f29085a = healthRecycleView;
        healthRecycleView.b(false);
        this.f29085a.e(false);
    }

    private void b() {
        if (njy.e(this.d)) {
            LogUtil.j("DeviceShareActivity", "addThirdPartyAppsInView list null");
            return;
        }
        this.f29085a.setLayoutManager(new LinearLayoutManager(this));
        this.f29086b = new ThirdPartAppAdapter(this.d);
        LogUtil.d("DeviceShareActivity", "appinfo size = ", Integer.valueOf(this.d.size()));
        this.f29086b.e(new ThirdPartAppAdapter.ItemClickListener() { // from class: wvo
            @Override // com.huawei.ui.thirdpartservice.activity.healthkitthirdparty.ThirdPartAppAdapter.ItemClickListener
            public final void onItemClick(View view, int i) {
                this.e.d(view, i);
            }
        });
        this.f29085a.setAdapter(this.f29086b);
        this.f29086b.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view, int i) {
        LogUtil.d("DeviceShareActivity", "appinfo onItemClick position = ", Integer.valueOf(i));
        Intent intent = new Intent();
        intent.setClassName(this.e, "com.huawei.ui.main.stories.me.activity.thirdparty.WearKitAuthActivity");
        if (njy.c(this.d, i)) {
            intent.putExtra(MapKeyNames.APP_INFO, this.d.get(i));
        } else {
            LogUtil.j("DeviceShareActivity", "addThirdPartyAppsInView onItemClick isInBounds is false");
        }
        this.e.startActivity(intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
