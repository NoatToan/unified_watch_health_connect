package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.base.BaseCoreSleepActivity;
import defpackage.qre;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes19.dex */
public class SuggestActivity extends BaseCoreSleepActivity {
    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.base.BaseCoreSleepActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setContentView(R.layout.activity_suggest);
        super.onCreate(bundle);
        String string = getResources().getString(R.string.IDS_fitness_core_sleep_reference_14, 1);
        String string2 = getResources().getString(R.string.IDS_fitness_core_sleep_reference_14, 2);
        if (LanguageUtil.t(this)) {
            this.f.setText(string + " ");
            this.p.setText(string2 + " ");
        } else {
            this.f.setText(string);
            this.p.setText(string2);
        }
        String str = String.format(getResources().getString(R.string.IDS_details_sleep_explain_1), 1);
        String strA = qre.a(R.string.IDS_device_pair_minute_and_second, qre.a(R.string.IDS_details_night_sleep_content_3, 4, 6, 90, 100), qre.f(R.string.IDS_details_night_sleep_content_4));
        String str2 = String.format(getResources().getString(R.string.IDS_details_sleep_explain_2), 2);
        String str3 = String.format(getResources().getString(R.string.IDS_details_sleep_explain_3), 3);
        this.j.setText(str);
        this.i.setText(strA);
        this.f26870c.setText(str2);
        this.e.setText(str3);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
