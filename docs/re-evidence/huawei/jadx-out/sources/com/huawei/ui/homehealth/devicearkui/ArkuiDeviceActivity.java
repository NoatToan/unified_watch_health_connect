package com.huawei.ui.homehealth.devicearkui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.homehealth.R;
import defpackage.qre;
import defpackage.qsp;
import defpackage.qtv;
import defpackage.rdt;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes17.dex */
public class ArkuiDeviceActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArkuiDeviceFragment f25366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f25367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f25368c;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f25368c = this;
        setContentView(R.layout.activity_arkui_device_layout);
        b();
        c(bundle);
    }

    private void b() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.device_page_titlebar);
        this.f25367b = customTitleBar;
        customTitleBar.setTitleTextColor(getResources().getColor(R.color.textColorPrimary));
        this.f25367b.setRightButtonVisibility(0);
        this.f25367b.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_more), qre.f(com.huawei.ui.homewear21.R.string.accessibility_more_item));
        this.f25367b.setTitleBarBackgroundColor(getResources().getColor(com.huawei.ui.homewear21.R.color.colorSubBackground));
        this.f25367b.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: rvy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.a(view);
            }
        });
        this.f25367b.setRightButtonOnClickListener(new View.OnClickListener() { // from class: rvw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    public /* synthetic */ void c(View view) {
        new PopViewList(this.f25368c, this.f25367b, new ArrayList(Collections.singletonList(getString(R.string.IDS_device_wear_home_delete_device)))).b(new PopViewList.PopViewClickListener() { // from class: rwa
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i) {
                this.d.c(i);
            }
        });
    }

    public /* synthetic */ void c(int i) {
        if (i == 0) {
            a();
        }
    }

    private void a() {
        rdt.e(1);
        this.f25366a.b();
    }

    private void c(Bundle bundle) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag("FRAGMENT_TAG_ARKUI_DEVICE");
        if (fragmentFindFragmentByTag != null) {
            if (fragmentFindFragmentByTag instanceof ArkuiDeviceFragment) {
                this.f25366a = (ArkuiDeviceFragment) fragmentFindFragmentByTag;
            } else {
                ReleaseLogUtil.e("R_ArkuiDeviceActivity", "initDeviceFragment fragment can‘t instanceof ArkuiDeviceFragment");
            }
            ReleaseLogUtil.e("R_ArkuiDeviceActivity", "initDeviceFragment has exist fragment, savedInstanceState: ", Boolean.valueOf(bundle != null));
            return;
        }
        String stringExtra = getIntent().getStringExtra("device_id");
        LogUtil.a("ArkuiDeviceActivity", "initDeviceFragment deviceMac:", CommonUtil.n(stringExtra));
        this.f25366a = new ArkuiDeviceFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("device_id", stringExtra);
        bundle2.putBoolean("key_is_detail_activity", true);
        this.f25366a.setArguments(bundle2);
        supportFragmentManager.beginTransaction().add(R.id.device_container_layout, this.f25366a, "FRAGMENT_TAG_ARKUI_DEVICE").commitNow();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            this.f25366a.onActivityResult(i, i2, intent);
        } else if (i2 == 2) {
            qtv.e(intent, this, qtv.c(i2, true, intent.getIntExtra("product_type", -1), true));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
