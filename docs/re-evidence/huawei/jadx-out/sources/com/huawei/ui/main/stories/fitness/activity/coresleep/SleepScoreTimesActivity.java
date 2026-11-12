package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.base.BaseCoreSleepActivity;
import defpackage.uck;
import defpackage.wud;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
public class SleepScoreTimesActivity extends BaseCoreSleepActivity {
    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.base.BaseCoreSleepActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setContentView(R.layout.activity_explain);
        super.onCreate(bundle);
        c();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void c() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.e("R_Sleep_SleepTimeActivity", "intent is null!");
            return;
        }
        byte b2 = -1;
        int intExtra = intent.getIntExtra("intent_score", -1);
        int intExtra2 = intent.getIntExtra("intent_status", -1);
        String stringExtra = intent.getStringExtra("intent_sleep_type");
        if (TextUtils.isEmpty(stringExtra)) {
            ReleaseLogUtil.d("R_Sleep_SleepTimeActivity", "setData type ", stringExtra);
            return;
        }
        b(stringExtra);
        stringExtra.hashCode();
        switch (stringExtra.hashCode()) {
            case -1546853722:
                if (stringExtra.equals("TYPE_DEEP_SLEEP_CONTINUITY")) {
                    b2 = 0;
                }
                break;
            case -490874802:
                if (stringExtra.equals("TYPE_WAKE_UP_REGULAR")) {
                    b2 = 1;
                }
                break;
            case 841426407:
                if (stringExtra.equals("TYPE_FALL_SLEEPING_REGULAR")) {
                    b2 = 2;
                }
                break;
            case 1029392504:
                if (stringExtra.equals("TYPE_WAKE_UP_TIMES")) {
                    b2 = 3;
                }
                break;
            case 1745853349:
                if (stringExtra.equals("TYPE_BREATH_QUALITY")) {
                    b2 = 4;
                }
                break;
            case 1912088818:
                if (stringExtra.equals("TYPE_FALL_GO_TO_BED_REGULAR")) {
                    b2 = 5;
                }
                break;
        }
        if (b2 == 0) {
            e(70, 100, intExtra, intExtra2);
            a();
            return;
        }
        if (b2 != 1) {
            if (b2 != 2) {
                if (b2 == 3) {
                    a(0, 1, intExtra, intExtra2);
                    i();
                    return;
                } else if (b2 == 4) {
                    e(70, 100, intExtra, intExtra2);
                    e();
                    return;
                } else if (b2 != 5) {
                    LogUtil.a("SleepTimeActivity", "default type");
                    return;
                }
            }
            e(70, 100, intExtra, intExtra2);
            b();
            return;
        }
        e(70, 100, intExtra, intExtra2);
        d();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    private void b(String str) {
        byte b2;
        String string;
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.titlebar_panel);
        str.hashCode();
        switch (str) {
            case "TYPE_DEEP_SLEEP_CONTINUITY":
                b2 = 0;
                break;
            case "TYPE_WAKE_UP_REGULAR":
                b2 = 1;
                break;
            case "TYPE_FALL_SLEEPING_REGULAR":
                b2 = 2;
                break;
            case "TYPE_WAKE_UP_TIMES":
                b2 = 3;
                break;
            case "TYPE_BREATH_QUALITY":
                b2 = 4;
                break;
            case "TYPE_FALL_GO_TO_BED_REGULAR":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            string = getResources().getString(R.string.IDS_fitness_core_sleep_deep_sleep_continuity);
        } else if (b2 == 1) {
            string = getResources().getString(R.string.IDS_fitness_core_sleep_end_sleep_regularity);
        } else if (b2 == 2) {
            string = getResources().getString(R.string.IDS_fitness_core_sleep_start_sleep_regularity);
        } else {
            if (b2 == 3) {
                string = getResources().getString(R.string.IDS_details_sleep_sleep_awake_time);
            } else if (b2 == 4) {
                string = getResources().getString(R.string.IDS_fitness_core_sleep_rdi_score);
            } else if (b2 != 5) {
                string = "";
            } else {
                string = getResources().getString(R.string.IDS_manual_sleep_bedtime_regularity);
            }
            LogUtil.e("R_Sleep_SleepTimeActivity", "type error!");
        }
        customTitleBar.setTitleText(string);
    }

    private void e(int i, int i2, int i3, int i4) {
        this.f.setText(uck.b(i, i2, 0));
        String strE = UnitUtil.e(i3, 1, 0);
        SpannableString spannableString = new SpannableString(getResources().getQuantityString(R.plurals.IDS_sleep_referece_title_score_string, i3, strE));
        spannableString.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(R.dimen.health_common_24sp)), 0, strE.length(), 33);
        this.p.setVisibility(0);
        this.p.setText(spannableString);
        if (i3 == 0) {
            wud.d(this.j, 72);
        }
        wud.d(this.j, i4);
    }

    private void a(int i, int i2, int i3, int i4) {
        this.f.setText(uck.b(i, i2, 1));
        String strE = UnitUtil.e(i3, 1, 0);
        SpannableString spannableString = new SpannableString(getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, i3, strE));
        spannableString.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(R.dimen.health_common_24sp)), 0, strE.length(), 33);
        this.p.setVisibility(0);
        this.p.setText(spannableString);
        if (i3 == 0) {
            wud.d(this.j, 72);
        }
        wud.d(this.j, i4);
    }

    private void a() {
        this.f26870c.setText(getResources().getString(R.string.IDS_deep_sleep_continuity_explain_1, 1));
        this.e.setText(getResources().getString(R.string.IDS_deep_sleep_continuity_content_1));
        this.f26868a.setText(getResources().getString(R.string.IDS_deep_sleep_continuity_explain_2, 2));
        this.f26869b.setText(getResources().getString(R.string.IDS_deep_sleep_continuity_content_2_no_harvard) + "\n" + getResources().getString(R.string.IDS_deep_sleep_continuity_content_3, 1) + "\n" + getResources().getString(R.string.IDS_deep_sleep_continuity_content_4, 2) + "\n" + getResources().getString(R.string.IDS_deep_sleep_continuity_content_5, 3) + "\n" + getResources().getString(R.string.IDS_deep_sleep_continuity_content_6, 4) + "\n" + getResources().getString(R.string.IDS_deep_sleep_continuity_content_7, 5) + "\n" + getResources().getString(R.string.IDS_deep_sleep_continuity_content_8, 6));
        this.d.setText(uck.e(new String[]{getResources().getString(R.string.IDS_fitness_core_sleep_reference_5), getResources().getString(R.string.IDS_fitness_core_sleep_reference_6), getResources().getString(R.string.IDS_fitness_core_sleep_reference_4)}));
    }

    private void e() {
        this.f26870c.setText(getResources().getString(R.string.IDS_breath_quality_explain_1, 1));
        this.e.setText(getResources().getString(R.string.IDS_breath_quality_content_1_new, UnitUtil.e(1.0d, 1, 0), UnitUtil.e(2.0d, 1, 0), UnitUtil.e(10.0d, 1, 0), UnitUtil.e(80.0d, 1, 0), UnitUtil.e(30.0d, 1, 0), UnitUtil.e(60.0d, 1, 0)));
        this.f26868a.setText(getResources().getString(R.string.IDS_breath_quality_explain_2, 2));
        this.f26869b.setText(getResources().getString(R.string.IDS_breath_quality_content_2_new, UnitUtil.e(1.0d, 1, 0), UnitUtil.e(2.0d, 1, 0), UnitUtil.e(3.0d, 1, 0), UnitUtil.e(4.0d, 1, 0), UnitUtil.e(5.0d, 1, 0)));
        this.d.setText(uck.e(new String[]{getResources().getString(R.string.IDS_fitness_core_sleep_reference_11), getResources().getString(R.string.IDS_fitness_core_sleep_reference_12)}));
    }

    private void d() {
        this.f26870c.setText(getResources().getString(R.string.IDS_fitness_core_sleep_regular_explain_1_new, UnitUtil.e(1.0d, 1, 0)));
        this.e.setText(getResources().getString(R.string.IDS_fitness_core_sleep_regular_explain_2_new));
        j();
    }

    private void j() {
        this.f26868a.setText(getResources().getString(R.string.IDS_fitness_core_sleep_regular_schedule_explain_3_new, UnitUtil.e(2.0d, 1, 0)));
        this.f26869b.setText(getResources().getString(R.string.IDS_fitness_core_sleep_regular_schedule_explain_4_new));
        this.d.setText(uck.e(new String[]{getResources().getString(R.string.IDS_fitness_core_sleep_reference_2), getResources().getString(R.string.IDS_fitness_core_sleep_reference_5)}));
    }

    private void b() {
        this.f26870c.setText(getResources().getString(R.string.IDS_fitness_core_sleep_regular_schedule_explain_1_new, UnitUtil.e(1.0d, 1, 0)));
        this.e.setText(getResources().getString(R.string.IDS_fitness_core_sleep_regular_schedule_explain_2_new));
        j();
    }

    private void i() {
        this.f26870c.setText(getResources().getString(R.string.IDS_wake_times_explain_1, 1));
        String strE = UnitUtil.e(2.0d, 1, 0);
        String strE2 = UnitUtil.e(10.0d, 2, 0);
        if (LanguageUtil.br(BaseApplication.getContext()) || LanguageUtil.x(BaseApplication.getContext())) {
            StringBuilder sb = new StringBuilder(UnitUtil.e(10.0d, 1, 0));
            sb.insert(0, "%");
            strE2 = sb.toString();
        }
        this.e.setText(getResources().getString(R.string.IDS_wake_times_content_1_new, strE, strE2));
        this.f26868a.setText(getResources().getString(R.string.IDS_wake_times_explain_2, 2));
        this.f26869b.setText(getResources().getString(R.string.IDS_wake_times_content_2_no_harvard) + "\n" + getResources().getString(R.string.IDS_wake_times_content_3, 1) + "\n" + getResources().getString(R.string.IDS_wake_times_content_4, 2) + "\n" + getResources().getString(R.string.IDS_wake_times_content_5, 3) + "\n" + getResources().getString(R.string.IDS_wake_times_content_6, 4) + "\n" + getResources().getString(R.string.IDS_wake_times_content_7, 5));
        this.d.setText(uck.e(new String[]{getResources().getString(R.string.IDS_fitness_core_sleep_reference_9), getResources().getString(R.string.IDS_fitness_core_sleep_reference_2)}));
    }

    public static void b(Context context, String str, int i, int i2) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) SleepScoreTimesActivity.class);
        intent.setFlags(536870912);
        intent.putExtra("intent_sleep_type", str);
        intent.putExtra("intent_score", i);
        intent.putExtra("intent_status", i2);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("SleepTimeActivity", "ActivityNotFoundException", e.getMessage());
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
