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
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.base.BaseCoreSleepActivity;
import defpackage.uck;
import defpackage.wud;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class SleepTimeActivity extends BaseCoreSleepActivity {
    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.base.BaseCoreSleepActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setContentView(R.layout.activity_explain);
        super.onCreate(bundle);
        c();
    }

    private void c() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.e("R_Sleep_SleepTimeActivity", "intent is null!");
            return;
        }
        int intExtra = intent.getIntExtra("intent_sleep_type", -1);
        String stringExtra = intent.getStringExtra("sleepTime");
        c(intExtra);
        a(intent, intExtra, stringExtra);
        wud.e(this.j, intent.getIntExtra("intent_status", 0), true);
    }

    private void c(int i) {
        String string;
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.titlebar_panel);
        if (i == 1) {
            string = getResources().getString(R.string.IDS_get_in_bed_time_label);
            d();
        } else if (i == 2) {
            string = getResources().getString(R.string.IDS_fitness_core_sleep_go_to_sleep_time);
            e();
        } else if (i == 3) {
            string = getResources().getString(R.string.IDS_manual_sleep_waking_time);
            b();
        } else if (i == 4) {
            string = getResources().getString(R.string.IDS_fitness_core_sleep_wake_up_time);
            a();
        } else {
            LogUtil.e("R_Sleep_SleepTimeActivity", "type error!");
            string = "";
        }
        customTitleBar.setTitleText(string);
    }

    private void d() {
        this.f26870c.setText(getResources().getString(R.string.IDS_go_bed_time_explain_1, UnitUtil.e(1.0d, 1, 0)));
        a(getResources().getString(R.string.IDS_go_bed_time_explain_2));
    }

    private void a(String str) {
        this.e.setText(str);
        this.f26868a.setText(getResources().getString(R.string.IDS_go_bed_time_explain_3, UnitUtil.e(2.0d, 1, 0)));
        this.f26869b.setText(getResources().getString(R.string.IDS_go_bed_time_explain_4, UnitUtil.e(1.0d, 1, 0), UnitUtil.e(2.0d, 1, 0)));
        this.d.setText(uck.e(new String[]{getResources().getString(R.string.IDS_fitness_core_sleep_reference_2), getResources().getString(R.string.IDS_fitness_core_sleep_reference_5)}));
    }

    private void e() {
        this.f26870c.setText(getResources().getString(R.string.IDS_fall_asleep_time_explain_1, UnitUtil.e(1.0d, 1, 0)));
        a(getResources().getString(R.string.IDS_fall_asleep_time_explain_2));
    }

    private void b() {
        this.f26870c.setText(getResources().getString(R.string.IDS_wake_up_explain_1, UnitUtil.e(1.0d, 1, 0)));
        a(getResources().getString(R.string.IDS_wake_up_explain_2));
    }

    private void a() {
        this.f26870c.setText(getResources().getString(R.string.IDS_off_bed_time_explain_1, UnitUtil.e(1.0d, 1, 0)));
        a(getResources().getString(R.string.IDS_off_bed_time_explain_2));
    }

    private void a(Intent intent, int i, String str) {
        String str2;
        String strE;
        Locale locale = Locale.getDefault();
        if (i == 1 || i == 2) {
            if (!LanguageUtil.c(this)) {
                str2 = "< 00:00";
            } else {
                str2 = String.format(locale, "%1$s", HiDataFilter.DataFilterExpression.LESS_THAN) + UnitUtil.c(0);
            }
            strE = e(intent);
        } else if (i == 3 || i == 4) {
            strE = e(intent);
            str2 = String.format(locale, "%1$s", HiDataFilter.DataFilterExpression.BIGGER_THAN) + " " + UnitUtil.c(d("6:0"));
        } else {
            LogUtil.e("R_Sleep_SleepTimeActivity", "type error!");
            strE = "";
            str2 = strE;
        }
        this.j.setText(strE);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(R.dimen.health_common_24sp)), 0, str.length(), 33);
        this.p.setText(spannableString);
        c(str2);
    }

    private String e(Intent intent) {
        String stringExtra = intent.getStringExtra("sleepTimeScore");
        if (stringExtra != null) {
            return UnitUtil.c(d(stringExtra));
        }
        return "--";
    }

    private void c(String str) {
        this.f.setText(String.format(getResources().getString(R.string.IDS_sleep_referece_title_string), str));
    }

    private int d(String str) {
        String[] strArrSplit = str.split(":");
        try {
            return (Integer.parseInt(strArrSplit[0]) * 3600) + (Integer.parseInt(strArrSplit[1]) * 60);
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            LogUtil.e("R_Sleep_SleepTimeActivity", "getSeconds exception = ", e.getMessage());
            return 0;
        }
    }

    public static void a(Context context, int i, String str, int i2) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) SleepTimeActivity.class);
        intent.setFlags(536870912);
        intent.putExtra("intent_sleep_type", i);
        intent.putExtra("sleepTime", str);
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
