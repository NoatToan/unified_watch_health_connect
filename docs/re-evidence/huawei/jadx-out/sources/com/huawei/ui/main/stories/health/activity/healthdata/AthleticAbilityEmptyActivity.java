package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.wka;

/* JADX INFO: loaded from: classes19.dex */
public class AthleticAbilityEmptyActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f27391a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthSubHeader f27392c;
    private CustomTitleBar d;
    private HealthTextView e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_athletic_ability_empty);
        e();
        c();
        b();
    }

    private void e() {
        clearBackgroundDrawable();
        this.d = (CustomTitleBar) qsp.a(this, R.id.empty_title_bar);
        this.e = (HealthTextView) qsp.a(this, R.id.tv_no_record_content);
        this.d.setTitleBarBackgroundColor(ContextCompat.getColor(this, com.huawei.health.servicesui.R.color.common_transparent));
        this.f27391a = (HealthTextView) qsp.a(this, R.id.text1);
        HealthSubHeader healthSubHeader = (HealthSubHeader) qsp.a(this, R.id.sub_header);
        this.f27392c = healthSubHeader;
        healthSubHeader.setSubHeaderBackgroundColor(ContextCompat.getColor(this, R.color.common_transparent));
        this.f27392c.setHeadTitleMaxLine(3);
    }

    private void c() {
        a();
    }

    private void b() {
        this.d.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AthleticAbilityEmptyActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.c(500)) {
                    LogUtil.j("AthleticAbilityEmptyActivity", "click finish AthleticAbilityEmptyActivity is too fast");
                } else {
                    AthleticAbilityEmptyActivity.this.finish();
                }
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    private void a() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("AthleticAbilityEmptyActivity", "setSubHeaderAndProduce intent is null");
            return;
        }
        String stringExtra = intent.getStringExtra("athletic_ability_empty_flag");
        if (TextUtils.isEmpty(stringExtra)) {
            LogUtil.j("AthleticAbilityEmptyActivity", "setSubHeaderAndProduce emptyFlag is null");
        } else {
            b(stringExtra);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    private void b(String str) {
        byte b2;
        String string;
        String string2;
        String string3;
        String string4;
        str.hashCode();
        switch (str) {
            case "running_no_record":
                b2 = 0;
                break;
            case "running_lactic_no_record":
                b2 = 1;
                break;
            case "vo_to_max_no_record":
                b2 = 2;
                break;
            case "state_no_record":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            string = getString(R.string.IDS_data_running_index_title_outside);
            wka.d(this, this.d, "RUNNING_STATE_INDEX");
            string2 = getString(R.string.IDS_rq_no_record_guide_run);
            string3 = getString(R.string.IDS_data_what_is_running_index);
            string4 = getString(R.string.IDS_data_running_index_explain);
        } else if (b2 == 1) {
            string = getString(R.string.IDS_running_lactate_threshold);
            wka.d(this, this.d, "LACTATE_THRESHOLD");
            string2 = getString(R.string.IDS_rq_no_record_guide_lactic);
            string3 = getString(R.string.IDS_running_lactate_threshold_q);
            string4 = getString(R.string.IDS_running_lactate_threshold_a);
        } else if (b2 == 2) {
            string = getString(R.string.IDS_hwh_health_vo2max);
            wka.d(this, this.d, "VO2_MAX");
            string2 = getString(R.string.IDS_rq_no_record_guide);
            string3 = getString(R.string.IDS_hw_motiontrack_vo2max_explain);
            string4 = getString(R.string.IDS_hwh_health_vo2max_explain);
        } else if (b2 == 3) {
            string = getString(R.string.IDS_data_state_index_title);
            wka.d(this, this.d, "TRAIN_CONDITION");
            string2 = getString(R.string.IDS_rq_no_record_guide_training);
            string3 = getString(R.string.IDS_data_what_is_train_condition);
            string4 = getString(R.string.IDS_data_train_condition_explain);
        } else {
            LogUtil.j("AthleticAbilityEmptyActivity", "setSubHeaderAndProduce default");
            string = "";
            string2 = "";
            string3 = string2;
            string4 = string3;
        }
        this.d.setTitleText(string);
        this.e.setText(string2);
        b(string3, string4);
    }

    private void b(String str, String str2) {
        this.f27392c.setHeadTitleText(str);
        this.f27391a.setText(str2);
    }
}
