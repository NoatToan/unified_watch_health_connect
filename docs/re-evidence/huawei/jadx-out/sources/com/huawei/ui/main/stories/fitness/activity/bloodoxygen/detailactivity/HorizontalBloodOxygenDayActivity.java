package com.huawei.ui.main.stories.fitness.activity.bloodoxygen.detailactivity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.healthcloud.plugintrack.ui.TipsFragment;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenHorizontalFragment;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenHorizontalTipsFragment;
import defpackage.njy;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes43.dex */
public class HorizontalBloodOxygenDayActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f26612a;
    private TipsFragment d = null;
    private BloodOxygenHorizontalFragment e = new BloodOxygenHorizontalFragment();

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(0);
        setContentView(d());
        this.f26612a = BaseApplication.getContext();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (njy.e(supportFragmentManager.getFragments())) {
            FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            fragmentTransactionBeginTransaction.add(R.id.fragment_container, this.e);
            fragmentTransactionBeginTransaction.commit();
        }
        if (b()) {
            return;
        }
        a();
        b(true);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setTahitiModelOrientation() {
        setRequestedOrientation(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setDefaultOrientation() {
        setRequestedOrientation(0);
    }

    private void a() {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        TipsFragment tipsFragment = this.d;
        if (tipsFragment != null) {
            fragmentTransactionBeginTransaction.remove(tipsFragment);
            this.d = null;
        }
        BloodOxygenHorizontalTipsFragment bloodOxygenHorizontalTipsFragment = new BloodOxygenHorizontalTipsFragment();
        this.d = bloodOxygenHorizontalTipsFragment;
        bloodOxygenHorizontalTipsFragment.setOnNextClickListener(new View.OnClickListener() { // from class: twl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49735a.b(view);
            }
        });
        this.d.setOnCloseClickListener(new View.OnClickListener() { // from class: twr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49739c.e(view);
            }
        });
        fragmentTransactionBeginTransaction.add(R.id.fragment_container, this.d);
        fragmentTransactionBeginTransaction.commit();
    }

    public /* synthetic */ void b(View view) {
        if (this.d != null) {
            e();
        }
    }

    public /* synthetic */ void e(View view) {
        if (this.d != null) {
            e();
        }
    }

    private void e() {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        TipsFragment tipsFragment = this.d;
        if (tipsFragment != null) {
            fragmentTransactionBeginTransaction.remove(tipsFragment);
            this.d = null;
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    private boolean b() {
        String strE = SharedPreferenceManager.e(this.f26612a, String.valueOf(10006), "blood_oxygen_horizontal_chart_tips_shown");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        return Boolean.parseBoolean(strE);
    }

    private void b(boolean z) {
        SharedPreferenceManager.e(this.f26612a, String.valueOf(10006), "blood_oxygen_horizontal_chart_tips_shown", Boolean.toString(z), new StorageParams());
    }

    private int d() {
        return R.layout.horizontal_bloodoxygen_chart;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        LogUtil.a("HorizontalBloodOxygenDayActivity", "onConfigurationChanged");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (27 <= Build.VERSION.SDK_INT) {
            setRequestedOrientation(0);
        }
    }
}
