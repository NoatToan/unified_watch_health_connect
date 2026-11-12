package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.AchievementPredictionFragment;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningStateIndexData;
import defpackage.qrr;
import defpackage.qrs;
import defpackage.qsp;

/* JADX INFO: loaded from: classes3.dex */
public class AchievementPredictionActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomTitleBar f27366c;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cancelAdaptRingRegion();
        setContentView(R.layout.activity_achievement_prediction);
        d();
        b();
        e();
    }

    private void d() {
        this.f27366c = (CustomTitleBar) qsp.a(this, R.id.achievements_detail_titlebar);
        HealthSubHeader healthSubHeader = (HealthSubHeader) qsp.a(this, R.id.achievements_what_title_text);
        this.f27366c.setTitleBarBackgroundColor(ContextCompat.getColor(this, com.huawei.health.servicesui.R.color.common_transparent));
        this.f27366c.setHeadTitleAndLeftButton(getString(R.string.IDS_hwh_health_vo2max_record_forecast));
        healthSubHeader.setSubHeaderBackgroundColor(ContextCompat.getColor(this, com.huawei.health.servicesui.R.color.common_transparent));
        healthSubHeader.setPaddingStartEnd(0.0f, 0.0f);
        healthSubHeader.setHeadTitleTypeface(qrr.d(), 1);
    }

    private void b() {
        Intent intent = getIntent();
        RunningStateIndexData runningStateIndexData = null;
        int intExtra = 0;
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("running_level_data");
            runningStateIndexData = parcelableExtra instanceof RunningStateIndexData ? (RunningStateIndexData) parcelableExtra : null;
            intExtra = intent.getIntExtra("vo2max_value", 0);
        }
        AchievementPredictionFragment achievementPredictionFragment = new AchievementPredictionFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("running_level_data", runningStateIndexData);
        bundle.putInt("vo2max_value", intExtra);
        achievementPredictionFragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, achievementPredictionFragment).commit();
    }

    private void e() {
        this.f27366c.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AchievementPredictionActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.c(500)) {
                    LogUtil.j("AchievementPredictionActivity", "click title bar left button too fast");
                } else {
                    AchievementPredictionActivity.this.finish();
                }
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (this.f27366c != null) {
            this.f27366c = null;
        }
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
