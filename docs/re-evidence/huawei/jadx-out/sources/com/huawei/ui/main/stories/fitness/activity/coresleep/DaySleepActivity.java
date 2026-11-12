package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.base.BaseCoreSleepActivity;
import defpackage.qrs;
import defpackage.wud;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class DaySleepActivity extends BaseCoreSleepActivity {
    private String q;
    private LinearLayout r;
    private ArrayList<String> s;
    private String t;
    private int x;

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.base.BaseCoreSleepActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setContentView(R.layout.activity_daysleep);
        super.onCreate(bundle);
        b();
        d();
        e();
    }

    private void b() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.a("DaySleepActivity", "intent is null.");
            return;
        }
        this.t = intent.getStringExtra("intent_hour");
        this.q = intent.getStringExtra("intent_minutes");
        this.x = intent.getIntExtra("intent_status", 0);
        try {
            this.s = intent.getStringArrayListExtra("intent_list");
        } catch (ArrayIndexOutOfBoundsException unused) {
            LogUtil.j("DaySleepActivity", "getIntentData error: ArrayIndexOutOfBoundsException");
        }
    }

    private void d() {
        this.r = (LinearLayout) findViewById(R.id.noon_sleep_ll);
    }

    private void e() {
        String strB = wud.b(this);
        this.f.setText(String.format(getResources().getString(R.string.IDS_sleep_referece_title_string), UnitUtil.e(0.0d, 1, 0) + strB + UnitUtil.e(40.0d, 1, 0) + " "));
        if (CommonUtil.n(this, this.t) == 0) {
            this.p.setVisibility(8);
            this.j.setVisibility(8);
            this.e.setText(R.string.IDS_messagecenter_time_minute_value);
        }
        this.p.setText(this.t + " ");
        this.f26870c.setText(this.q + " ");
        if (CommonUtil.n(this, this.t) == 0 && CommonUtil.n(this, this.q) == 0) {
            this.f26868a.setVisibility(8);
        }
        switch (this.x) {
            case 71:
                this.f26868a.setText(R.string.IDS_hwh_runningstyle_longer);
                this.f26868a.setTextColor(Color.parseColor("#FFFF3C3C"));
                break;
            case ExerciseSessionRecord.EXERCISE_TYPE_SURFING /* 72 */:
                this.f26868a.setText(R.string.IDS_hwh_runningstyle_shorter);
                this.f26868a.setTextColor(Color.parseColor("#FFF79A3C"));
                break;
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER /* 73 */:
                this.f26868a.setText(R.string.IDS_details_sleep_grade_normal);
                this.f26868a.setTextColor(Color.parseColor("#FF4CC51F"));
                break;
            default:
                LogUtil.a("DaySleepActivity", "no status!");
                break;
        }
        a();
    }

    private void a() {
        View viewInflate;
        ArrayList<String> arrayList = this.s;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (qrs.y()) {
                    viewInflate = LayoutInflater.from(this).inflate(R.layout.layout_noon_sleep_item_largre_mode, (ViewGroup) null);
                } else {
                    viewInflate = LayoutInflater.from(this).inflate(R.layout.layout_noon_sleep_item, (ViewGroup) null);
                }
                HealthDivider healthDivider = (HealthDivider) viewInflate.findViewById(R.id.noon_sleep_divide);
                viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                ((HealthTextView) viewInflate.findViewById(R.id.time_tv)).setText(this.s.get(i).toString());
                if (this.s.size() - 1 >= 0 && i == this.s.size() - 1) {
                    healthDivider.setVisibility(8);
                } else {
                    healthDivider.setVisibility(0);
                }
                this.r.addView(viewInflate);
            }
        } else {
            LogUtil.j("DaySleepActivity", "noonSleepList is null!");
        }
        this.f26869b.setText(getResources().getString(R.string.IDS_day_sleep_explain_1, 1));
        this.g.setText(getResources().getString(R.string.IDS_day_sleep_explain_2, 2));
        this.n.setText(getResources().getString(R.string.IDS_day_sleep_content_1, 15, 30));
        this.k.setText(getResources().getString(R.string.IDS_day_sleep_content_2, getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, UnitUtil.e(40.0d, 1, 0))));
        this.l.setText(getResources().getString(R.string.IDS_day_sleep_content_4, 1));
        this.o.setText(getResources().getString(R.string.IDS_day_sleep_content_3, getResources().getQuantityString(R.plurals.IDS_hour_string, 3, UnitUtil.e(3.0d, 1, 0))));
        if (!LanguageUtil.t(this)) {
            this.d.setText(getResources().getString(R.string.IDS_fitness_core_sleep_reference_14, 1));
            this.m.setText(getResources().getString(R.string.IDS_fitness_core_sleep_reference_14, 2));
            return;
        }
        this.d.setText(getResources().getString(R.string.IDS_fitness_core_sleep_reference_14, 1) + " ");
        this.m.setText(getResources().getString(R.string.IDS_fitness_core_sleep_reference_14, 2) + " ");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        wud.e(this.j);
        wud.e(this.e);
    }

    public static void d(Context context, String str, String str2, int i, ArrayList<String> arrayList) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) DaySleepActivity.class);
        intent.setFlags(536870912);
        intent.putExtra("intent_hour", str);
        intent.putExtra("intent_minutes", str2);
        intent.putExtra("intent_status", i);
        intent.putExtra("intent_list", arrayList);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("DaySleepActivity", "ActivityNotFoundException", e.getMessage());
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
