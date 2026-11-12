package com.huawei.ui.main.stories.fitness.activity.sportintensity;

import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import defpackage.pqo;
import defpackage.qsp;
import health.compact.a.SportIntensityUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public class SportIntensityExplain extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f27008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f27009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f27010c;
    private pqo d = new pqo();

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.sport_intensity_explain);
        d();
        a();
    }

    private void d() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.fitness_detail_titlebar);
        this.f27009b = customTitleBar;
        customTitleBar.setTitleText(getString(R.string.IDS_hw_pressure_explain));
    }

    private void a() {
        this.d = SportIntensityUtil.b();
        this.f27010c = (HealthTextView) qsp.a(this, R.id.activity_textview);
        this.f27008a = (HealthTextView) qsp.a(this, R.id.rules_textview);
        String quantityString = getResources().getQuantityString(R.plurals.sug_fitness_train_minutes, this.d.d(), Integer.valueOf(this.d.d()));
        try {
            this.f27010c.setText(String.format(getResources().getString(R.string.IDS_hw_sport_intensity_new_suggest), Integer.valueOf(UnitUtil.e(150.0d, 1, 0)), Integer.valueOf(UnitUtil.e(300.0d, 1, 0)), Integer.valueOf(UnitUtil.e(75.0d, 1, 0))));
            this.f27008a.setText(String.format(getResources().getString(R.string.IDS_hw_sport_intensity_new_detail), quantityString));
        } catch (NumberFormatException e) {
            LogUtil.e("Step_SportIntensityExplain", "NumberFormatException", e.getMessage());
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
