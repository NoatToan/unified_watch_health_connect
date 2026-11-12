package com.huawei.ui.main.stories.fitness.views.bloodsugar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.util.Pair;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.weight.callback.DietDiaryRepository;
import defpackage.umb;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarDietMonitorCardView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f27213c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthDivider g;
    private ImageView h;
    private HealthTextView i;
    private ImageView j;
    private View k;
    private LinearLayout m;

    public BloodSugarDietMonitorCardView(Context context) {
        super(context);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = -1;
            layoutParams2.height = -1;
        }
        setOrientation(1);
        this.f27211a = context;
    }

    public void e(umb umbVar, List<Pair<Long, Float>> list, long j, long j2, float[] fArr) {
        LogUtil.a("BloodSugarDietMonitorCardView", "data size=", Integer.valueOf(list.size()));
        e();
        d(list, j, j2, fArr);
        setInfoView(umbVar);
    }

    private void e() {
        LayoutInflater.from(this.f27211a).inflate(R.layout.layout_blood_sugar_diet_monitor_card_view, this);
        this.k = findViewById(R.id.item_diet_analysis_heat);
        this.m = (LinearLayout) findViewById(R.id.line_chart_container);
        this.j = (ImageView) findViewById(R.id.blood_sugar_heat_diet_img);
        this.f27212b = (HealthTextView) findViewById(R.id.blood_sugar_diet_title);
        this.d = (HealthTextView) findViewById(R.id.blood_sugar_diet_calorie);
        this.e = (HealthTextView) findViewById(R.id.blood_sugar_diet_carbohydrates);
        this.f27213c = findViewById(R.id.blood_sugar_diet_highGi_view);
        this.g = (HealthDivider) findViewById(R.id.divider_last);
        this.h = (ImageView) findViewById(R.id.blood_sugar_food_diet_img);
        this.i = (HealthTextView) findViewById(R.id.blood_sugar_diet_highGi_title);
        this.f = (HealthTextView) findViewById(R.id.blood_sugar_diet_highGi_food);
    }

    private void d(List<Pair<Long, Float>> list, long j, long j2, float[] fArr) {
        this.m.addView(d(j, j2, list, fArr), -1, -1);
    }

    private void setInfoView(final umb umbVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(umbVar.n() * 1000);
        c(umbVar, (HealthTextView) findViewById(R.id.text_title), UnitUtil.e(calendar, 1), UnitUtil.e(2.0d, 1, 0));
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.text_content);
        if (BigDecimal.valueOf(umbVar.i()).setScale(0, 1).compareTo(BigDecimal.valueOf(umbVar.i())) == 0) {
            healthTextView.setText(UnitUtil.e(umbVar.i(), 2, 0));
        } else {
            healthTextView.setText(UnitUtil.e(umbVar.i(), 2, 1));
        }
        if (LanguageUtil.bh(this.f27211a) || LanguageUtil.q(this.f27211a)) {
            this.d.setText(String.format(Locale.ROOT, "%s%s", UnitUtil.e(umbVar.b(), 1, 1), " " + this.f27211a.getString(R.string.IDS_hw_show_sport_cal_unit)));
        } else {
            this.d.setText(String.format(Locale.ROOT, "%s%s", UnitUtil.e(umbVar.b(), 1, 1), this.f27211a.getString(R.string.IDS_hw_show_sport_cal_unit)));
        }
        this.e.setText(this.f27211a.getResources().getQuantityString(R.plurals.IDS_gravity_unit_with_value, (int) umbVar.d(), Integer.valueOf((int) umbVar.d())));
        this.k.setOnClickListener(new View.OnClickListener() { // from class: ulf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(umbVar, view);
            }
        });
        if (!LanguageUtil.l(this.f27211a) || umbVar.h().isEmpty()) {
            this.f27213c.setVisibility(8);
            this.g.setVisibility(8);
        } else {
            this.f.setText(umbVar.h());
        }
    }

    public /* synthetic */ void c(umb umbVar, View view) {
        String str = "#/breakfast_detail?whichMeal=" + umbVar.l() + "&whichMealLabel=" + ((Object) this.f27212b.getText()) + "&date=" + (HiDateUtil.p(umbVar.n() * 1000) / 1000) + "&eatTime=" + umbVar.f();
        LogUtil.a("BloodSugarDietMonitorCardView", "jumpDietDetails uri = ", str);
        DietDiaryRepository.jumpDietDetails(this.f27211a, str);
    }

    private void c(umb umbVar, HealthTextView healthTextView, String str, String str2) {
        int iL = umbVar.l();
        if (iL == 10) {
            healthTextView.setText(this.f27211a.getString(R.string.IDS_diet_percentage1, 2));
            this.f27212b.setText(this.f27211a.getString(R.string.IDS_bsdiet_breakfast));
            this.i.setText(this.f27211a.getString(R.string.IDS_bsdiet_highgi_breakfast));
            this.j.setImageResource(R.drawable.ic_blood_sugar_diet_breakfast);
            this.h.setImageResource(R.drawable.ic_blood_sugar_diet_breakfast);
            return;
        }
        if (iL == 11) {
            healthTextView.setText(this.f27211a.getString(R.string.IDS_other_diet_percentage1, str, str2));
            this.f27212b.setText(this.f27211a.getString(R.string.IDS_bsdiet_breakfast_extra));
            this.i.setText(this.f27211a.getString(R.string.IDS_bsdiet_highgi_breakfast));
            this.j.setImageResource(R.drawable.ic_blood_sugar_diet_breakfast);
            this.h.setImageResource(R.drawable.ic_blood_sugar_diet_breakfast);
            return;
        }
        if (iL == 20) {
            healthTextView.setText(this.f27211a.getString(R.string.IDS_diet_percentage2, 2));
            this.f27212b.setText(this.f27211a.getString(R.string.IDS_bsdiet_lunch));
            this.i.setText(this.f27211a.getString(R.string.IDS_bsdiet_highgi_lunch));
            this.j.setImageResource(R.drawable.ic_blood_sugar_diet_lunch);
            this.h.setImageResource(R.drawable.ic_blood_sugar_diet_lunch);
            return;
        }
        if (iL == 21) {
            healthTextView.setText(this.f27211a.getString(R.string.IDS_other_diet_percentage2, str, str2));
            this.f27212b.setText(this.f27211a.getString(R.string.IDS_bsdiet_afternoon_extra));
            this.i.setText(this.f27211a.getString(R.string.IDS_bsdiet_highgi_lunch));
            this.j.setImageResource(R.drawable.ic_blood_sugar_diet_lunch);
            this.h.setImageResource(R.drawable.ic_blood_sugar_diet_lunch);
            return;
        }
        if (iL == 30) {
            healthTextView.setText(this.f27211a.getString(R.string.IDS_diet_percentage3, 2));
            this.f27212b.setText(this.f27211a.getString(R.string.IDS_bsdiet_dinner));
            this.i.setText(this.f27211a.getString(R.string.IDS_bsdiet_highgi_dinner));
            this.j.setImageResource(R.drawable.ic_blood_sugar_diet_dinner);
            this.h.setImageResource(R.drawable.ic_blood_sugar_diet_dinner);
            return;
        }
        if (iL == 31) {
            healthTextView.setText(this.f27211a.getString(R.string.IDS_other_diet_percentage3, str, str2));
            this.f27212b.setText(this.f27211a.getString(R.string.IDS_bsdiet_dinner_extra));
            this.i.setText(this.f27211a.getString(R.string.IDS_bsdiet_highgi_dinner));
            this.j.setImageResource(R.drawable.ic_blood_sugar_diet_dinner);
            this.h.setImageResource(R.drawable.ic_blood_sugar_diet_dinner);
            return;
        }
        healthTextView.setText("");
        this.f27212b.setText("");
        LogUtil.j("BloodSugarDietMonitorCardView", "setDietTypeText no support mDietType");
    }

    private BloodSugarDietMonitorCharView d(long j, long j2, List<Pair<Long, Float>> list, float[] fArr) {
        BloodSugarDietMonitorCharView bloodSugarDietMonitorCharView = new BloodSugarDietMonitorCharView(this.f27211a);
        bloodSugarDietMonitorCharView.setStartTime(j);
        bloodSugarDietMonitorCharView.setEndTime(j2);
        bloodSugarDietMonitorCharView.setData(list, fArr);
        return bloodSugarDietMonitorCharView;
    }
}
