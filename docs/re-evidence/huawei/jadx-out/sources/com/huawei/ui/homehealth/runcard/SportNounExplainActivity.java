package com.huawei.ui.homehealth.runcard;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.runcard.trackfragments.SportNounExplainFragment;
import com.huawei.ui.homehealth.runcard.trackfragments.SportNounExplainItemFragment;

/* JADX INFO: loaded from: classes43.dex */
public class SportNounExplainActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SportNounExplainFragment f25808b;
    private SportNounExplainItemFragment d;
    private CustomTitleBar i;
    private int j = 0;
    private boolean e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f25809c = new Handler();

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cancelMarginAdaptation();
        LogUtil.a("SportNounExplainActivity", "onCreate");
        setContentView(R.layout.activity_sport_noun_explain);
        b();
        d();
    }

    private void d() {
        clearBackgroundDrawable();
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.text_show_sport_type);
        this.i = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorSubBackground));
        b(this.j);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        if (this.j == 0) {
            this.f25808b = new SportNounExplainFragment();
            fragmentTransactionBeginTransaction.add(R.id.frag_sport_noun_explain_list, this.f25808b);
        } else {
            this.d = new SportNounExplainItemFragment(this.j, this.f25807a);
            fragmentTransactionBeginTransaction.add(R.id.frag_sport_noun_explain_list, this.d);
        }
        fragmentTransactionBeginTransaction.commit();
    }

    private void b(int i) {
        switch (i) {
            case 0:
                this.i.setTitleText(getResources().getString(R.string.IDS_sport_noun_explain));
                break;
            case 1:
                this.i.setTitleText(getResources().getString(R.string.IDS_main_watch_heart_rate_string));
                break;
            case 2:
                this.i.setTitleText(getResources().getString(R.string.IDS_pluginmotiontrack_detail_title_step));
                break;
            case 3:
                this.i.setTitleText(getResources().getString(R.string.IDS_pluginmotiontrack_detail_running_posture));
                break;
            case 4:
                this.i.setTitleText(getResources().getString(R.string.IDS_pluginmotiontrack_detail_title_train));
                break;
            case 5:
                this.i.setTitleText(getResources().getString(R.string.IDS_pluginmotiontrack_detail_title_swim));
                break;
            case 6:
                this.i.setTitleText(getResources().getString(R.string.IDS_aw_version2_basketball_data));
                break;
            case 7:
                this.i.setTitleText(getResources().getString(R.string.IDS_hw_pressure_explain));
                break;
            case 8:
                this.i.setTitleText(getResources().getString(R.string.IDS_pluginmotiontrack_detail_title_technical_stats));
                break;
            case 9:
                this.i.setTitleText(getResources().getString(R.string.IDS_rope_performance_indicator_title));
                break;
        }
    }

    private void b() {
        Intent intent = getIntent();
        if (intent != null) {
            this.j = intent.getIntExtra(BleConstants.SPORT_TYPE, 0);
            this.f25807a = intent.getIntExtra("eteAlgoKey", 0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.e) {
            LogUtil.a("SportNounExplainActivity", "don't click to fast");
        } else {
            this.f25809c.postDelayed(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.SportNounExplainActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    SportNounExplainActivity.this.e = false;
                }
            }, 500L);
            this.e = true;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
