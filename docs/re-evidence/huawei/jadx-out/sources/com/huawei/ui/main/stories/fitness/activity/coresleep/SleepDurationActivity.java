package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.base.BaseCoreSleepActivity;
import defpackage.iov;
import defpackage.qre;
import defpackage.qsp;
import defpackage.uck;
import defpackage.wud;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
public class SleepDurationActivity extends BaseCoreSleepActivity {
    private int q;
    private boolean r;
    private int s;
    private int t;
    private String y;

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.base.BaseCoreSleepActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setContentView(R.layout.activity_explain);
        super.onCreate(bundle);
        b();
        e();
    }

    private void b() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.e("R_Sleep_TotalDataActivity", "intent is null");
            return;
        }
        this.s = intent.getIntExtra("intent_hour", 0);
        this.q = intent.getIntExtra("intent_minutes", 0);
        this.r = intent.getBooleanExtra("intent_is_phone", false);
        String stringExtra = intent.getStringExtra("intent_type");
        if (TextUtils.isEmpty(stringExtra)) {
            ReleaseLogUtil.d("R_Sleep_TotalDataActivity", "getIntentData type ", stringExtra);
            this.y = "";
        } else {
            this.y = stringExtra;
        }
        this.t = intent.getIntExtra("intent_status", 0);
    }

    private void e() {
        l();
        d();
        f();
        k();
    }

    private void k() {
        this.j.setText(uck.e(this.t, this.y));
        switch (this.t) {
            case 71:
                this.j.setTextColor(qre.e(R.color.weight_tips_color_5));
                break;
            case ExerciseSessionRecord.EXERCISE_TYPE_SURFING /* 72 */:
                this.j.setTextColor(qre.e(R.color.weight_tips_color_1));
                break;
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER /* 73 */:
                this.j.setTextColor(qre.e(R.color.core_sleep_normal_tip_color));
                break;
            default:
                LogUtil.a("TotalDataActivity", "no status!");
                break;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void f() {
        SpannableString spannableString;
        int length = 1;
        if (this.s == 0) {
            Resources resources = getResources();
            int i = R.plurals.IDS_min_unit;
            int i2 = this.q;
            String quantityString = resources.getQuantityString(i, i2, UnitUtil.e(i2, 1, 0));
            int length2 = String.valueOf(this.q).length();
            spannableString = new SpannableString(quantityString);
            boolean zContains = quantityString.contains("\u200f");
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(getResources().getDimensionPixelSize(R.dimen.health_common_24sp));
            int i3 = length2 + (zContains ? 1 : 0);
            spannableString.setSpan(absoluteSizeSpan, zContains ? 1 : 0, i3, 33);
            spannableString.setSpan(new ForegroundColorSpan(BaseApplication.getContext().getColor(R.color.textColorSecondary)), i3, quantityString.length(), 33);
        } else {
            Resources resources2 = getResources();
            int i4 = R.plurals.IDS_hour_unit;
            int i5 = this.s;
            String quantityString2 = resources2.getQuantityString(i4, i5, UnitUtil.e(i5, 1, 0));
            Resources resources3 = getResources();
            int i6 = R.plurals.IDS_min_unit;
            int i7 = this.q;
            String quantityString3 = resources3.getQuantityString(i6, i7, UnitUtil.e(i7, 1, 0));
            String str = quantityString2 + " " + quantityString3;
            if (LanguageUtil.c(this)) {
                String string = getString(R.string.IDS_hw_about_service_and);
                length = 1 + string.length();
                str = quantityString2 + " " + string + quantityString3;
            }
            boolean zContains2 = quantityString3.contains("\u200f");
            boolean zContains3 = quantityString2.contains("\u200f");
            int length3 = String.valueOf(this.s).length();
            int length4 = String.valueOf(this.q).length();
            SpannableString spannableString2 = new SpannableString(str);
            AbsoluteSizeSpan absoluteSizeSpan2 = new AbsoluteSizeSpan(getResources().getDimensionPixelSize(R.dimen.health_common_24sp));
            int i8 = length3 + (zContains3 ? 1 : 0);
            spannableString2.setSpan(absoluteSizeSpan2, zContains3 ? 1 : 0, i8, 33);
            spannableString2.setSpan(new ForegroundColorSpan(BaseApplication.getContext().getColor(R.color.textColorSecondary)), i8, quantityString2.length(), 33);
            spannableString2.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(R.dimen.health_common_24sp)), quantityString2.length() + length + (zContains2 ? 1 : 0), quantityString2.length() + length4 + length + (zContains2 ? 1 : 0), 33);
            spannableString2.setSpan(new ForegroundColorSpan(BaseApplication.getContext().getColor(R.color.textColorSecondary)), quantityString2.length() + length4 + length + (zContains2 ? 1 : 0), str.length(), 33);
            spannableString = spannableString2;
        }
        this.p.setVisibility(0);
        this.p.setText(spannableString);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    private void l() {
        String string;
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.titlebar_panel);
        String str = this.y;
        str.hashCode();
        switch (str) {
            case "TYPE_SLEEP_BREATH_RATE":
                string = BaseApplication.getContext().getString(R.string.IDS_fitness_core_sleep_breathrate);
                h();
                break;
            case "TYPE_NIGHT_SLEEP_TIME":
                string = getString(R.string.IDS_fitness_core_sleep_night_sleep);
                d(true);
                break;
            case "TYPE_SLEEP_BLOOD_OX":
                string = BaseApplication.getContext().getString(R.string.IDS_fitness_core_sleep_oxygen_saturation);
                j();
                break;
            case "TYPE_SLEEP_TIME":
                string = getString(R.string.IDS_fitness_core_sleep_sleep_duration);
                d(false);
                break;
            case "TYPE_SLEEP_LATENCY_TIME":
                string = BaseApplication.getContext().getString(R.string.IDS_sleep_latency_title);
                g();
                break;
            case "TYPE_SLEEP_HEART_RATE":
                string = BaseApplication.getContext().getString(R.string.IDS_fitness_core_sleep_heartrate);
                i();
                break;
            case "TYPE_SLEEP_BED_TIME":
                string = getString(R.string.IDS_manual_sleep_bed_time);
                a();
                break;
            default:
                LogUtil.a("TotalDataActivity", "default title");
                string = "";
                break;
        }
        customTitleBar.setTitleText(string);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    private void d() {
        byte b2;
        String strB;
        String str = this.y;
        str.hashCode();
        switch (str) {
            case "TYPE_NIGHT_SLEEP_TIME":
                b2 = 0;
                break;
            case "TYPE_SLEEP_TIME":
                b2 = 1;
                break;
            case "TYPE_SLEEP_LATENCY_TIME":
                b2 = 2;
                break;
            case "TYPE_SLEEP_BED_TIME":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0 || b2 == 1) {
            strB = uck.b(6, (int) 10.0f, 2);
        } else if (b2 == 2) {
            strB = uck.b(0, (int) 30.0f, 4);
        } else if (b2 != 3) {
            strB = "";
        } else {
            strB = uck.b(UnitUtil.e(6, 1, 0), UnitUtil.e(10.5f, 1, 1)) + getString(R.string.IDS_messagecenter_time_hour_value);
        }
        this.f.setText(strB);
    }

    private void d(boolean z) {
        int i;
        int i2;
        this.f26870c.setText(String.format(getResources().getString(R.string.IDS_details_night_sleep_explain_1), 1));
        if (LanguageUtil.br(BaseApplication.getContext())) {
            i2 = 6;
            i = 10;
        } else {
            i = 6;
            i2 = 10;
        }
        this.e.setText(getResources().getString(R.string.IDS_details_night_sleep_content_1, Integer.valueOf(i), Integer.valueOf(i2)) + "\n" + getResources().getString(R.string.IDS_details_night_sleep_content_2, getResources().getQuantityString(R.plurals.IDS_sleep_hour_day, 10, 10), getResources().getQuantityString(R.plurals.IDS_sleep_hour_day, 6, 6)));
        if (!this.r && z) {
            this.f26868a.setText(String.format(getResources().getString(R.string.IDS_details_night_sleep_explain_2), 2));
            this.f26869b.setText(qre.a(R.string.IDS_device_pair_minute_and_second, qre.a(R.string.IDS_details_night_sleep_content_3, 4, 6, 90, 100), qre.f(R.string.IDS_details_night_sleep_content_4)));
        } else {
            qsp.c((View) this.f26868a, 8);
            qsp.c((View) this.f26869b, 8);
        }
        this.d.setText(uck.e(new String[]{getResources().getString(R.string.IDS_fitness_core_sleep_reference_1), getResources().getString(R.string.IDS_fitness_core_sleep_reference_2)}));
    }

    private void a() {
        this.f26870c.setText(getResources().getString(R.string.IDS_length_of_stay_in_bed_title_new));
        this.e.setText(getResources().getString(R.string.IDS_length_of_stay_in_bed_content_new));
        qsp.c((View) this.f26868a, 8);
        qsp.c((View) this.f26869b, 8);
        qsp.c((View) this.h, 8);
        qsp.c((View) this.d, 8);
    }

    private void g() {
        this.f26870c.setText(getResources().getString(R.string.IDS_sleep_latency_explain, 1));
        this.e.setText(getResources().getString(R.string.IDS_sleep_latency_improvement_content_new, UnitUtil.e(30.0d, 1, 0), UnitUtil.e(30.0d, 1, 0)));
        this.f26868a.setText(getResources().getString(R.string.IDS_sleep_latency_improvement_explain, 2));
        this.f26869b.setText(getResources().getString(R.string.IDS_sleep_latency_improvement_content_1_new, UnitUtil.e(1.0d, 1, 0), UnitUtil.e(2.0d, 1, 0), UnitUtil.e(3.0d, 1, 0), UnitUtil.e(4.0d, 1, 0), UnitUtil.e(5.0d, 1, 0), UnitUtil.e(6.0d, 1, 0), UnitUtil.e(7.0d, 1, 0)));
        this.h.setVisibility(8);
        this.d.setVisibility(8);
    }

    private void i() {
        this.f26870c.setText(getResources().getString(R.string.IDS_sleep_heart_rate_subtile));
        this.e.setText(getResources().getString(R.string.IDS_sleep_heart_rate_explain, UnitUtil.e(60.0d, 1, 0), UnitUtil.e(100.0d, 1, 0)));
        c();
    }

    private void c() {
        findViewById(R.id.scrollView).setVisibility(8);
        findViewById(R.id.divider1).setVisibility(8);
        this.f26868a.setVisibility(8);
        this.f26869b.setVisibility(8);
        this.h.setVisibility(8);
        this.d.setVisibility(8);
    }

    private void j() {
        this.f26870c.setText(getResources().getString(R.string.IDS_sleep_ox_subtile));
        this.e.setText(getResources().getString(R.string.IDS_sleep_ox_explain, uck.a(95.0d, 0), uck.a(100.0d, 0)));
        c();
    }

    private void h() {
        this.f26870c.setText(getResources().getString(R.string.IDS_sleep_breath_rate_subtile));
        this.e.setText(getResources().getString(R.string.IDS_sleep_breate_rate_explain, UnitUtil.e(16.0d, 1, 0), UnitUtil.e(20.0d, 1, 0)));
        c();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        wud.e(this.p);
        wud.e(this.e);
    }

    public static void e(Context context, String str, int i, int i2, int i3) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) SleepDurationActivity.class);
        intent.setFlags(536870912);
        intent.putExtra("intent_hour", i);
        intent.putExtra("intent_minutes", i2);
        intent.putExtra("intent_status", i3);
        intent.putExtra("intent_type", str);
        iov.d(context, intent);
    }

    public static void e(Context context, String str, int i, int i2, int i3, boolean z) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) SleepDurationActivity.class);
        intent.setFlags(536870912);
        intent.putExtra("intent_hour", i);
        intent.putExtra("intent_minutes", i2);
        intent.putExtra("intent_status", i3);
        intent.putExtra("intent_is_phone", z);
        intent.putExtra("intent_type", str);
        try {
            iov.d(context, intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("TotalDataActivity", "ActivityNotFoundException", e.getMessage());
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
