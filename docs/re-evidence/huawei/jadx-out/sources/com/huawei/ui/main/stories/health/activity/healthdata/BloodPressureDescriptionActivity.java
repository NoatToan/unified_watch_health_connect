package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.BloodPressureDescriptionActivity;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import com.huawei.ui.main.stories.template.BaseActivity;
import defpackage.fde;
import defpackage.ftw;
import defpackage.njy;
import defpackage.uub;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class BloodPressureDescriptionActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f27403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f27405c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private HealthTextView o;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (LanguageUtil.l(this)) {
            setContentView(R.layout.activity_blood_pressure_description);
        } else {
            setContentView(R.layout.activity_blood_pressure_description_other);
        }
        e();
        d();
    }

    private void e() {
        this.f = (HealthTextView) findViewById(R.id.low_pressure_des_text);
        this.j = (HealthTextView) findViewById(R.id.high_pressure_des_text);
        this.o = (HealthTextView) findViewById(R.id.twenty_four_hour_des_text);
        this.f27404b = (HealthTextView) findViewById(R.id.day_des_text);
        this.g = (HealthTextView) findViewById(R.id.night_des_text);
        this.f27403a = (HealthTextView) findViewById(R.id.grading_standard_text);
        this.h = (HealthTextView) findViewById(R.id.hypotension_des_source_text);
        this.i = (HealthTextView) findViewById(R.id.hypopiesis_title_text);
        this.d = (HealthTextView) findViewById(R.id.dynamic_blood_pressure_title_text);
        this.f27405c = (LinearLayout) findViewById(R.id.dynamic_blood_layout);
        this.e = (HealthTextView) findViewById(R.id.blood_data_des);
    }

    private void d() {
        this.f27403a.setText(String.format(Locale.ROOT, getString(R.string.IDS_hw_bp_grading_standard_value), UnitUtil.e(1.0d, 1, 0)));
        this.h.setText(BloodPressureUtil.c(1));
        this.i.setText(String.format(Locale.ROOT, getString(R.string.IDS_hw_hypopiesis_title_value), UnitUtil.e(2.0d, 1, 0)));
        this.j.setText(String.format(Locale.ROOT, getString(R.string.IDS_hw_sbp_high_pressure_value), UnitUtil.e(90.0d, 1, 0)));
        this.f.setText(String.format(Locale.ROOT, getString(R.string.IDS_hw_dbp_low_pressure_value), UnitUtil.e(60.0d, 1, 0), UnitUtil.e(140.0d, 1, 0)));
        if (Utils.c(BaseApplication.b())) {
            this.e.setText(getString(R.string.IDS_hw_dbp_low_bottom_japan_des));
        }
        a();
        if (njy.e(ftw.d())) {
            LogUtil.d("BloodPressureDescriptionActivity", "initData, BloodPressureList is null");
            return;
        }
        ArrayList<fde> arrayList = new ArrayList(ftw.d());
        LogUtil.a("BloodPressureDescriptionActivity", "featureInfoList,", Integer.valueOf(arrayList.size()));
        Collections.sort(arrayList, new Comparator() { // from class: unu
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BloodPressureDescriptionActivity.b((fde) obj, (fde) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (fde fdeVar : arrayList) {
            List<fde.b> listE = fdeVar.e();
            if (fdeVar.a() != 0 && !njy.e(listE)) {
                arrayList2.addAll(listE);
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: unv
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BloodPressureDescriptionActivity.a((fde.b) obj, (fde.b) obj2);
            }
        });
        b(arrayList2);
    }

    public static /* synthetic */ int b(fde fdeVar, fde fdeVar2) {
        return fdeVar.a() - fdeVar2.a();
    }

    public static /* synthetic */ int a(fde.b bVar, fde.b bVar2) {
        return bVar.c() - bVar2.c();
    }

    private void a() {
        this.d.setText(String.format(Locale.ROOT, getString(R.string.IDS_hw_hypopiesis_title_dynamic_blood_pressure), UnitUtil.e(3.0d, 1, 0)));
        Pair<Integer, Integer> pairB = uub.b("Twenty-four-hours");
        this.o.setText(String.format(Locale.ROOT, getString(R.string.IDS_hw_dbp_low_bottom_blood_measure_twenty_four), UnitUtil.e(24.0d, 1, 0), UnitUtil.e(((Integer) pairB.first).intValue(), 1, 0), UnitUtil.e(((Integer) pairB.second).intValue(), 1, 0)));
        Pair<Integer, Integer> pairB2 = uub.b("day");
        this.f27404b.setText(String.format(Locale.ROOT, getString(R.string.IDS_hw_dbp_low_bottom_blood_measure_day), UnitUtil.e(((Integer) pairB2.first).intValue(), 1, 0), UnitUtil.e(((Integer) pairB2.second).intValue(), 1, 0)));
        Pair<Integer, Integer> pairB3 = uub.b("night");
        this.g.setText(String.format(Locale.ROOT, getString(R.string.IDS_hw_dbp_low_bottom_blood_measure_night), UnitUtil.e(((Integer) pairB3.first).intValue(), 1, 0), UnitUtil.e(((Integer) pairB3.second).intValue(), 1, 0)));
        if (!BloodPressureUtil.b()) {
            this.f27405c.setVisibility(8);
        } else {
            this.f27405c.setVisibility(0);
        }
    }

    private void b(List<fde.b> list) {
        String[] strArrC = ftw.c();
        int[] iArrA = BloodPressureUtil.a(this);
        int i = 0;
        while (i < list.size()) {
            fde.b bVar = list.get(i);
            List<Integer> listD = bVar.d();
            int i2 = 1;
            String strE = njy.c(listD, 0) ? UnitUtil.e(listD.get(0).intValue(), 1, 0) : "";
            String strE2 = njy.c(listD, 1) ? UnitUtil.e(listD.get(1).intValue(), 1, 0) : "";
            List<Integer> listE = bVar.e();
            String[] strArr = {strE, strE2, njy.c(listE, 0) ? UnitUtil.e(listE.get(0).intValue(), 1, 0) : "", njy.c(listE, 1) ? UnitUtil.e(listE.get(1).intValue(), 1, 0) : ""};
            if (i == 0) {
                i2 = 0;
            } else if (i == list.size() - 1) {
                i2 = 2;
            }
            int i3 = i + 1;
            d(bVar, strArr, i2, strArrC[i3], iArrA[i]);
            i = i3;
        }
    }

    private void d(fde.b bVar, String[] strArr, int i, String str, int i2) {
        View viewInflate;
        if (LanguageUtil.l(this)) {
            viewInflate = LayoutInflater.from(this).inflate(R.layout.blood_pressure_description_item, (ViewGroup) null);
        } else {
            viewInflate = LayoutInflater.from(this).inflate(R.layout.blood_pressure_description_item_other, (ViewGroup) null);
        }
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.text_level);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.icon_level);
        healthTextView.setText(str);
        healthTextView2.getBackground().setTint(i2);
        ((HealthTextView) viewInflate.findViewById(R.id.text_and_or)).setText(bVar.b() == 0 ? getString(R.string.IDS_hw_and) : getString(R.string.IDS_hw_and_or));
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.text_systolic);
        HealthTextView healthTextView4 = (HealthTextView) viewInflate.findViewById(R.id.text_diastolic);
        if (i == 0) {
            healthTextView3.setText(String.format(Locale.ROOT, getString(R.string.IDS_bp_min_scope_value), strArr[1]));
            healthTextView4.setText(String.format(Locale.ROOT, getString(R.string.IDS_bp_min_scope_value), strArr[3]));
        } else if (i == 2) {
            healthTextView3.setText(String.format(Locale.ROOT, getString(R.string.IDS_bp_max_explain), strArr[0]));
            healthTextView4.setText(String.format(Locale.ROOT, getString(R.string.IDS_bp_max_explain), strArr[2]));
        } else {
            healthTextView3.setText(String.format(Locale.ROOT, getString(R.string.IDS_bp_range_value), strArr[0], strArr[1]));
            healthTextView4.setText(String.format(Locale.ROOT, getString(R.string.IDS_bp_range_value), strArr[2], strArr[3]));
        }
        ((ViewGroup) findViewById(R.id.list_item_container)).addView(viewInflate, 1);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
