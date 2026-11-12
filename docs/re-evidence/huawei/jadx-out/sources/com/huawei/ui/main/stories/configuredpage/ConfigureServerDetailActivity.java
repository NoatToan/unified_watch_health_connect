package com.huawei.ui.main.stories.configuredpage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.configuredpage.adpters.ConfiguredServerAdapter;
import defpackage.dlm;
import defpackage.dlo;
import defpackage.njy;
import defpackage.out;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ConfigureServerDetailActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConfiguredServerAdapter f26369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f26370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f26371c;
    private dlo d;
    private List<dlm> e = new ArrayList(16);
    private HealthRecycleView h;
    private LinearLayoutManager i;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hw_configure_server_detail_layout);
        this.f26371c = this;
        d();
        e();
    }

    private void d() {
        this.f26370b = (CustomTitleBar) out.d(this, com.huawei.pluginachievement.R.id.title_layout);
        this.h = (HealthRecycleView) out.d(this, R.id.server_rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        this.i = linearLayoutManager;
        this.h.setLayoutManager(linearLayoutManager);
        ConfiguredServerAdapter configuredServerAdapter = new ConfiguredServerAdapter(this, this.e);
        this.f26369a = configuredServerAdapter;
        this.h.setAdapter(configuredServerAdapter);
    }

    private void e() {
        if (getIntent() == null) {
            LogUtil.j("ConfigureServerDetailActivity", "getIntent() == null!");
            return;
        }
        dlo dloVar = (dlo) getIntent().getSerializableExtra("server_name");
        this.d = dloVar;
        if (dloVar == null) {
            LogUtil.j("ConfigureServerDetailActivity", "mPageModule == null!");
            return;
        }
        if (!TextUtils.isEmpty(dloVar.f())) {
            this.f26370b.setTitleText(this.d.f());
        }
        List<dlm> listE = this.d.e();
        this.e = listE;
        if (!njy.e(listE)) {
            this.f26369a.d(this.e);
        } else {
            LogUtil.j("ConfigureServerDetailActivity", "initData() mList is empty.");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
