package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.knit.model.KnitSubPageConfig;
import com.huawei.health.knit.section.listener.BasePageResTrigger;
import com.huawei.health.knit.section.listener.IPageResTrigger;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.R;
import defpackage.peh;

/* JADX INFO: loaded from: classes3.dex */
public class KnitSleepTightActivity extends KnitHealthDetailActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private KnitFragment f26700a;

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public boolean getExtra(Bundle bundle) {
        return false;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public int getPageType() {
        return 35;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public DataInfos getSubPageDataInfos(int i) {
        return null;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public Fragment onCreateEmptyFragment(KnitSubPageConfig knitSubPageConfig) {
        hideNonEmptyFragment();
        if (knitSubPageConfig == null) {
            this.f26700a = null;
        } else {
            Bundle bundle = new Bundle();
            int resPosId = knitSubPageConfig.getResPosId();
            String strC = peh.c(knitSubPageConfig);
            IPageResTrigger extra = getResTrigger(getPageType(), resPosId, false).setExtra(bundle);
            if (extra instanceof BasePageResTrigger) {
                this.f26700a = KnitFragment.newInstance(strC, (BasePageResTrigger) extra);
            }
        }
        return this.f26700a;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void setEmptyFragmentBelowTitleBar(View view, CustomTitleBar customTitleBar) {
        if (view == null || customTitleBar == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, R.id.knit_health_detail_title_bar);
            view.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public String getLogTag() {
        return "KnitSleepTightActivity";
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configTitleBar(CustomTitleBar customTitleBar) {
        customTitleBar.setTitleText(getString(com.huawei.ui.commonui.R.string.IDS_sleep_tight_title_text));
        customTitleBar.setRightButtonVisibility(8);
        customTitleBar.setRightSoftkeyVisibility(8);
        customTitleBar.setTitleBarBackgroundColor(getColor(com.huawei.ui.commonui.R.color.health_chart_extend_background_color));
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configToolBar(HealthToolBar healthToolBar) {
        healthToolBar.setVisibility(8);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configExtraView(LinearLayout linearLayout) {
        linearLayout.setVisibility(8);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
