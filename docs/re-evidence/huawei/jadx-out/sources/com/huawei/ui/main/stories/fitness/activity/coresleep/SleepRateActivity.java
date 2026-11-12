package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepRateActivity;
import com.huawei.ui.main.stories.fitness.activity.coresleep.base.BaseCoreSleepActivity;
import defpackage.qre;
import defpackage.qrs;
import defpackage.uck;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class SleepRateActivity extends BaseCoreSleepActivity {
    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.base.BaseCoreSleepActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setContentView(R.layout.activity_explain);
        super.onCreate(bundle);
        d();
    }

    private void d() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.a("SleepRateActivity", "intent is null");
            return;
        }
        int intExtra = intent.getIntExtra("sleep_rate", 0);
        int intExtra2 = intent.getIntExtra("intent_status", 0);
        int intExtra3 = intent.getIntExtra("intent_version", 0);
        String stringExtra = intent.getStringExtra("intent_sleep_type");
        if (TextUtils.isEmpty(stringExtra)) {
            ReleaseLogUtil.d("SleepRateActivity", "setIntentData type ", stringExtra);
        } else {
            a(stringExtra, intExtra, intExtra2, intExtra3);
        }
    }

    private void c(int i) {
        boolean z = i == 5;
        HealthDivider healthDivider = (HealthDivider) findViewById(R.id.divider_reference_sleep);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.sleep_other_knowledge_title);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.sleep_other_knowledge_link);
        ImageView imageView = (ImageView) findViewById(R.id.aasm_sleep_link_arrow);
        linearLayout.setClickable(true);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            imageView.setScaleX(-1.0f);
        }
        final String str = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.knowledge?h5pro=true&isImmerse&urlType=4&pName=com.huawei.health&path=Knowledge&knowledgeNo=truSleep5";
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: uaq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRateActivity.a(str, view);
            }
        });
        if (z) {
            healthDivider.setVisibility(8);
            healthTextView.setVisibility(0);
            linearLayout.setVisibility(0);
        }
    }

    public static /* synthetic */ void a(String str, View view) {
        if (qrs.r()) {
            return;
        }
        AppRouter.e(Uri.parse(str)).b(com.huawei.haf.application.BaseApplication.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void a(String str, int i, int i2, int i3) {
        byte b2 = 0;
        boolean z = i3 == 5;
        e(str, i3);
        str.hashCode();
        switch (str.hashCode()) {
            case -785678506:
                if (!str.equals("TYPE_SLEEP_EFFICIENCY")) {
                    b2 = -1;
                }
                break;
            case -415951927:
                if (!str.equals("TYPE_DEEP_SLEEP")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 808690857:
                if (!str.equals("TYPE_LIGHT_SLEEP")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 1550128305:
                if (!str.equals("TYPE_SLUM_SLEEP_RATE")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            b(85, 100, i, i2, str);
            b();
            return;
        }
        if (b2 == 1) {
            b(z ? 10 : 20, z ? 30 : 60, i, i2, str);
            e(i3);
            c(i3);
        } else if (b2 == 2) {
            e(i3 == 5 ? 65 : 55, i, i2, str);
            a(i3);
            c(i3);
        } else {
            if (b2 == 3) {
                b(10, 30, i, i2, str);
                b(i3);
                c(i3);
                return;
            }
            LogUtil.e("SleepRateActivity", "current type is: ", str, ", no type match");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void e(String str, int i) {
        String string;
        byte b2 = 0;
        boolean z = i == 5;
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.titlebar_panel);
        str.hashCode();
        switch (str.hashCode()) {
            case -785678506:
                if (!str.equals("TYPE_SLEEP_EFFICIENCY")) {
                    b2 = -1;
                }
                break;
            case -415951927:
                if (!str.equals("TYPE_DEEP_SLEEP")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 808690857:
                if (!str.equals("TYPE_LIGHT_SLEEP")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 1550128305:
                if (!str.equals("TYPE_SLUM_SLEEP_RATE")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            string = BaseApplication.getContext().getString(R.string.IDS_manual_sleep_sleep_efficiency);
        } else if (b2 == 1) {
            string = BaseApplication.getContext().getString(R.string.IDS_fitness_core_sleep_deep_sleep_percent);
            if (z) {
                string = qre.f(R.string.IDS_hw_aasm_label_sleep_deepsleep_rate);
            }
        } else if (b2 == 2) {
            string = BaseApplication.getContext().getString(R.string.IDS_fitness_core_sleep_light_sleep_percent);
            if (z) {
                string = qre.f(R.string.IDS_hw_aasm_label_sleep_shallowsleep_rate);
            }
        } else if (b2 == 3) {
            string = BaseApplication.getContext().getString(R.string.IDS_fitness_core_sleep_rem_sleep_percent);
            if (z) {
                string = qre.f(R.string.IDS_hw_aasm_label_sleep_rem_rate);
            }
        } else {
            LogUtil.a("SleepRateActivity", "default title");
            string = "";
        }
        customTitleBar.setTitleText(string);
    }

    private void e(int i, int i2, int i3, String str) {
        String str2;
        String string = getResources().getString(R.string.IDS_sleep_referece_title_string);
        if (LanguageUtil.br(BaseApplication.getContext()) || LanguageUtil.x(BaseApplication.getContext())) {
            StringBuffer stringBuffer = new StringBuffer(UnitUtil.e(i, 1, 0));
            stringBuffer.insert(0, "%");
            str2 = String.format(Locale.ROOT, string, "< " + ((Object) stringBuffer));
        } else {
            str2 = String.format(Locale.ROOT, string, "< " + UnitUtil.e(i, 2, 0));
        }
        this.f.setText(str2);
        b(i2, i3, str);
    }

    private void b(int i, int i2, int i3, int i4, String str) {
        this.f.setText(uck.b(i, i2, 3));
        b(i3, i4, str);
    }

    private void b(int i, int i2, String str) {
        SpannableString spannableString = new SpannableString(UnitUtil.e(i, 2, 0));
        spannableString.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(R.dimen.health_common_24sp)), 0, spannableString.length(), 33);
        this.p.setText(spannableString);
        this.j.setText(uck.e(i2, str));
        switch (i2) {
            case 71:
                this.j.setTextColor(getResources().getColor(R.color.weight_tips_color_5));
                break;
            case ExerciseSessionRecord.EXERCISE_TYPE_SURFING /* 72 */:
                this.j.setTextColor(getResources().getColor(R.color.weight_tips_color_1));
                break;
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER /* 73 */:
                this.j.setTextColor(getResources().getColor(R.color.core_sleep_normal_tip_color));
                break;
            default:
                LogUtil.a("SleepRateActivity", "no status!");
                break;
        }
        if (i == 0) {
            this.j.setVisibility(8);
        }
    }

    private void e(int i) {
        String string = getResources().getString(R.string.IDS_deep_sleep_rate_explain_1, 1);
        boolean z = i == 5;
        if (z) {
            string = qre.a(R.string.IDS_deep_sleep_rate_explain_1_AASM, 1);
        }
        this.f26870c.setText(string);
        this.e.setText(getResources().getString(z ? R.string.IDS_deep_sleep_rate_content_1_aasm : R.string.IDS_deep_sleep_rate_content_1));
        this.f26868a.setText(getResources().getString(R.string.IDS_deep_sleep_rate_explain_2, 2));
        this.f26869b.setText(getResources().getString(R.string.IDS_light_sleep_rate_content_2_no_harvard) + "\n" + getResources().getString(R.string.IDS_light_sleep_rate_content_3, 1) + "\n" + getResources().getString(R.string.IDS_light_sleep_rate_content_4, 2) + "\n" + getResources().getString(R.string.IDS_light_sleep_rate_content_5, 3) + "\n" + getResources().getString(R.string.IDS_light_sleep_rate_content_6, 4) + "\n" + getResources().getString(R.string.IDS_light_sleep_rate_content_7, 5) + "\n" + getResources().getString(R.string.IDS_light_sleep_rate_content_8, 6));
        this.d.setText(uck.e(new String[]{getResources().getString(R.string.IDS_fitness_core_sleep_reference_5), getResources().getString(R.string.IDS_fitness_core_sleep_reference_6), getResources().getString(R.string.IDS_fitness_core_sleep_reference_4)}));
    }

    private void a(int i) {
        boolean z = i == 5;
        String string = getResources().getString(R.string.IDS_light_sleep_rate_explain_1, 1);
        if (z) {
            string = qre.a(R.string.IDS_light_sleep_rate_explain_1_AASM, 1);
        }
        this.f26870c.setText(string);
        this.e.setText(getResources().getString(z ? R.string.IDS_light_sleep_rate_content_1_aasm : R.string.IDS_light_sleep_rate_content_1));
        this.f26868a.setText(getResources().getString(R.string.IDS_light_sleep_rate_explain_2, 2));
        this.f26869b.setText(getResources().getString(R.string.IDS_light_sleep_rate_content_2_no_harvard) + "\n" + getResources().getString(R.string.IDS_light_sleep_rate_content_3, 1) + "\n" + getResources().getString(R.string.IDS_light_sleep_rate_content_4, 2) + "\n" + getResources().getString(R.string.IDS_light_sleep_rate_content_5, 3) + "\n" + getResources().getString(R.string.IDS_light_sleep_rate_content_6, 4) + "\n" + getResources().getString(R.string.IDS_light_sleep_rate_content_7, 5) + "\n" + getResources().getString(R.string.IDS_light_sleep_rate_content_8, 6));
        this.d.setText(uck.e(new String[]{getResources().getString(R.string.IDS_fitness_core_sleep_reference_5), getResources().getString(R.string.IDS_fitness_core_sleep_reference_6), getResources().getString(R.string.IDS_fitness_core_sleep_reference_4)}));
    }

    private void b() {
        this.f26870c.setText(getResources().getString(R.string.IDS_sleep_efficiency_content_2, 1));
        this.e.setText(getResources().getString(R.string.IDS_sleep_efficiency_content_3_new, uck.a(100.0d, 0), uck.a(85.0d, 0), uck.a(85.0d, 0)));
        this.f26868a.setText(getResources().getString(R.string.IDS_sleep_efficiency_content_4, 2));
        this.f26869b.setText(getResources().getString(R.string.IDS_sleep_efficiency_content_5_new, UnitUtil.e(1.0d, 1, 0), UnitUtil.e(2.0d, 1, 0), UnitUtil.e(3.0d, 1, 0), UnitUtil.e(4.0d, 1, 0), UnitUtil.e(5.0d, 1, 0), UnitUtil.e(6.0d, 1, 0), UnitUtil.e(7.0d, 1, 0)));
        this.h.setVisibility(8);
        this.d.setVisibility(8);
    }

    private void b(int i) {
        boolean z = i == 5;
        String string = getResources().getString(R.string.IDS_slum_sleep_rate_explain_1, 1);
        if (z) {
            string = qre.a(R.string.IDS_slum_sleep_rate_explain_1_AASM, 1);
        }
        this.f26870c.setText(string);
        this.e.setText(getResources().getString(z ? R.string.IDS_slum_sleep_rate_content_1_aasm : R.string.IDS_slum_sleep_rate_content_1));
        this.f26868a.setText(getResources().getString(R.string.IDS_slum_sleep_rate_explain_2, 2));
        this.f26869b.setText(getResources().getString(R.string.IDS_slum_sleep_rate_content_2) + "\n" + getResources().getString(R.string.IDS_slum_sleep_rate_content_3) + "\n" + getResources().getString(R.string.IDS_slum_sleep_rate_content_4_no_harvard) + "\n" + getResources().getString(R.string.IDS_slum_sleep_rate_content_5, 1) + "\n" + getResources().getString(R.string.IDS_slum_sleep_rate_content_6, 2) + "\n" + getResources().getString(R.string.IDS_slum_sleep_rate_content_7, 3));
        this.d.setText(uck.e(new String[]{getResources().getString(R.string.IDS_fitness_core_sleep_reference_7), getResources().getString(R.string.IDS_fitness_core_sleep_reference_8)}));
    }

    public static void d(Context context, String str, int i, int i2, int i3) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) SleepRateActivity.class);
        intent.setFlags(536870912);
        intent.putExtra("intent_sleep_type", str);
        intent.putExtra("sleep_rate", i);
        intent.putExtra("intent_status", i2);
        intent.putExtra("intent_version", i3);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("SleepRateActivity", "ActivityNotFoundException", e.getMessage());
        }
    }

    public static void a(Context context, String str, int i, int i2) {
        d(context, str, i, i2, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
