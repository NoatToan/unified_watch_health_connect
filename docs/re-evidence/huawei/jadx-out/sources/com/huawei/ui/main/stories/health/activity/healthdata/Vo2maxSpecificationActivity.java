package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.template.BaseActivity;
import com.huawei.up.model.UserInfomation;
import defpackage.qsp;
import defpackage.vds;
import health.compact.a.Services;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
public class Vo2maxSpecificationActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTitleBar f27627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27629c;
    private UserInfomation d;
    private Integer[] e;
    private Vo2MaxHelp f;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_vo2max_specification_layout);
        e();
        c();
    }

    private void c() {
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        this.d = userInfo;
        if (userInfo == null) {
            LogUtil.e("Track_Vo2maxSpecificationActivity", "mLocalUserInfo is null");
            this.d = new UserInfomation(UnitUtil.f() ? 1 : 0);
        }
        this.f27628b = this.d.getGender();
        int age = this.d.getAge();
        this.f27629c = age;
        this.e = vds.a(this.f27628b, age);
        Vo2MaxHelp vo2MaxHelp = new Vo2MaxHelp(this);
        this.f = vo2MaxHelp;
        vo2MaxHelp.c(this.e, this.f27628b);
        this.f.e(findViewById(R.id.specification_help_view));
    }

    private void e() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.vo2max_speci_title_bar);
        this.f27627a = customTitleBar;
        customTitleBar.setTitleText(getString(R.string.IDS_fitness_core_sleep_explain_title));
        this.f27627a.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.Vo2maxSpecificationActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Vo2maxSpecificationActivity.this.finish();
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
