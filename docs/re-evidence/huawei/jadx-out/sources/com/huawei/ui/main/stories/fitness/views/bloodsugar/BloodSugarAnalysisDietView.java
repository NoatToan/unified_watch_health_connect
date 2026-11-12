package com.huawei.ui.main.stories.fitness.views.bloodsugar;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.manager.util.TimeUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarDiffActivity;
import com.huawei.ui.main.stories.health.weight.callback.DietDiaryRepository;
import defpackage.idy;
import defpackage.iov;
import defpackage.qrs;
import defpackage.uma;
import defpackage.umb;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import health.compact.a.utils.StringUtils;
import java.text.SimpleDateFormat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarAnalysisDietView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f27195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f27196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private uma f27197c;
    private HealthTextView d;
    private HealthTextView e;
    private ImageView f;
    private HealthTextView g;
    private LinearLayout h;
    private int i;
    private HealthTextView j;
    private HealthTextView k;
    private HealthTextView l;
    private RelativeLayout m;
    private HealthTextView n;
    private LinearLayout o;
    private HealthTextView p;
    private HealthDivider q;
    private HealthTextView r;
    private ImageView s;
    private long t;
    private RelativeLayout w;
    private int y;

    public BloodSugarAnalysisDietView(Context context) {
        this(context, null);
    }

    public BloodSugarAnalysisDietView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BloodSugarAnalysisDietView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27196b = context;
        a();
    }

    private void a() {
        View viewInflate;
        Context context = this.f27196b;
        if (context == null) {
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (qrs.v()) {
            viewInflate = layoutInflaterFrom.inflate(R.layout.health_data_blood_sugar_analysis_diet_large, this);
        } else {
            viewInflate = layoutInflaterFrom.inflate(R.layout.health_data_blood_sugar_analysis_diet, this);
        }
        this.o = (LinearLayout) viewInflate.findViewById(R.id.blood_sugar_difference_view);
        this.l = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_diff_num);
        this.n = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_diff_des);
        this.k = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_diff_status_text);
        this.h = (LinearLayout) viewInflate.findViewById(R.id.blood_sugar_diet_root);
        this.m = (RelativeLayout) viewInflate.findViewById(R.id.blood_sugar_diet_view);
        this.j = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_diet_title);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_diet_calorie);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_diet_carbohydrates);
        this.f = (ImageView) viewInflate.findViewById(R.id.blood_sugar_diet_img);
        this.s = (ImageView) viewInflate.findViewById(R.id.blood_sugar_gi_img);
        this.f27195a = (ImageView) viewInflate.findViewById(R.id.blood_sugar_diet_carbohydrates_icon);
        this.q = (HealthDivider) viewInflate.findViewById(R.id.blood_sugar_diet_divide);
        this.g = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_diet_description);
        this.w = (RelativeLayout) viewInflate.findViewById(R.id.blood_sugar_diet_highGi_view);
        this.p = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_diet_highGi_title);
        this.r = (HealthTextView) viewInflate.findViewById(R.id.blood_sugar_diet_highGi_food);
        this.h.setVisibility(8);
        this.w.setVisibility(8);
        this.o.setOnClickListener(this);
        this.m.setOnClickListener(this);
    }

    public void setDietRootVisibility(int i) {
        this.h.setVisibility(i);
    }

    public void setDiffData(umb umbVar, uma umaVar) {
        if (umbVar == null) {
            LogUtil.d("BloodSugarDietAnalysisView", "setDietData bean can not null!");
            return;
        }
        this.o.setVisibility(0);
        this.f27197c = umaVar;
        this.i = umbVar.c();
        this.l.setText(c(umbVar.a()));
        setDiffStatusText(umbVar.j());
        e();
    }

    public void setDietData(umb umbVar) {
        if (umbVar == null) {
            LogUtil.d("BloodSugarDietAnalysisView", "setDietData bean can not null!");
            return;
        }
        float fB = umbVar.b();
        if (fB == 0.0f) {
            this.h.setVisibility(8);
            return;
        }
        this.h.setVisibility(0);
        this.i = umbVar.c();
        this.y = umbVar.l();
        this.t = umbVar.f();
        c();
        this.d.setText(String.format("%s%s", Float.valueOf(fB), this.f27196b.getString(R.string.IDS_hw_show_sport_cal_unit)));
        if (umbVar.d() == 0.0f) {
            LogUtil.a("BloodSugarDietAnalysisView", "Carbohydrates is 0");
        }
        this.e.setVisibility(0);
        this.f27195a.setVisibility(0);
        this.e.setText(this.f27196b.getResources().getQuantityString(R.plurals.IDS_gravity_unit_with_value, (int) umbVar.d(), Integer.valueOf((int) umbVar.d())));
        if (StringUtils.g(umbVar.e())) {
            this.q.setVisibility(8);
            this.g.setVisibility(8);
            this.m.setPadding(0, 0, 0, 4);
        } else {
            this.g.setText(umbVar.e());
            this.g.setVisibility(0);
            this.q.setVisibility(0);
            this.m.setPadding(0, 0, 0, 0);
        }
        if (!LanguageUtil.l(this.f27196b) || umbVar.h().isEmpty()) {
            this.w.setVisibility(8);
            this.g.setPadding(0, 0, 0, 4);
        } else {
            this.w.setVisibility(0);
            this.g.setPadding(0, 0, 0, 0);
            this.r.setText(umbVar.h());
        }
    }

    private void e() {
        int i = this.i;
        if (i == 0) {
            this.n.setText(this.f27196b.getString(R.string.IDS_hw_show_healthdata_bloodsugar_breakfast_difference));
            return;
        }
        if (i == 1) {
            this.n.setText(this.f27196b.getString(R.string.IDS_hw_show_healthdata_bloodsugar_lunch_difference));
        } else if (i == 2) {
            this.n.setText(this.f27196b.getString(R.string.IDS_hw_show_healthdata_bloodsugar_dinner_difference));
        } else {
            LogUtil.d("BloodSugarDietAnalysisView", "setDiffTypeText no support mDietType");
        }
    }

    private void c() {
        int i = this.i;
        if (i == 0) {
            this.j.setText(this.f27196b.getString(R.string.IDS_bsdiet_breakfast));
            this.p.setText(this.f27196b.getString(R.string.IDS_bsdiet_highgi_breakfast));
            this.f.setImageResource(R.drawable.ic_blood_sugar_diet_breakfast);
            this.s.setImageResource(R.drawable.ic_blood_sugar_diet_breakfast);
        } else if (i == 1) {
            this.j.setText(this.f27196b.getString(R.string.IDS_bsdiet_lunch));
            this.p.setText(this.f27196b.getString(R.string.IDS_bsdiet_highgi_lunch));
            this.f.setImageResource(R.drawable.ic_blood_sugar_diet_lunch);
            this.s.setImageResource(R.drawable.ic_blood_sugar_diet_lunch);
        } else if (i == 2) {
            this.j.setText(this.f27196b.getString(R.string.IDS_bsdiet_dinner));
            this.p.setText(this.f27196b.getString(R.string.IDS_bsdiet_highgi_dinner));
            this.f.setImageResource(R.drawable.ic_blood_sugar_diet_dinner);
            this.s.setImageResource(R.drawable.ic_blood_sugar_diet_dinner);
        } else {
            LogUtil.d("BloodSugarDietAnalysisView", "setDietTypeText no support mDietType");
        }
        b(this.i, AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_ANALYSIS_FEED_FINGER_2040137.value());
    }

    private void b(int i, String str) {
        HashMap map = new HashMap(16);
        map.put("type", Integer.valueOf(i));
        map.put("click", "1");
        idy.b(str, map);
    }

    private void setDiffStatusText(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 1001:
                        b(R.string.IDS_hw_show_healthdata_bloodsugar_status_too_low, R.color.color_blood_low);
                        break;
                    case 1002:
                        b(R.string.IDS_hw_health_show_healthdata_status_low, R.color.color_blood_low);
                        break;
                    case 1003:
                        break;
                    case 1004:
                        break;
                    case 1005:
                        b(R.string.IDS_hw_show_healthdata_bloodsugar_status_high, R.color.color_blood_high);
                        break;
                    case 1006:
                        b(R.string.IDS_hw_show_healthdata_bloodsugar_status_too_high, R.color.color_blood_high);
                        break;
                    default:
                        LogUtil.d("BloodSugarDietAnalysisView", "no support blood type");
                        break;
                }
                return;
            }
            b(R.string.IDS_hw_health_show_healthdata_status_high, R.color.color_blood_high);
            return;
        }
        b(R.string.IDS_hw_health_show_healthdata_status_normal, R.color.color_blood_normal);
    }

    private void b(int i, int i2) {
        this.k.setText(getResources().getString(i));
        this.k.setTextColor(getResources().getColor(i2));
    }

    private String c(float f) {
        return UnitUtil.e(f, 1, 1) + this.f27196b.getString(R.string.IDS_hw_health_show_healthdata_bloodsugar_mmol);
    }

    private void d() {
        Intent intent = new Intent(this.f27196b, (Class<?>) BloodSugarDiffActivity.class);
        int i = this.i;
        if (i == 0) {
            intent.putExtra("bloodSugar_diff_title", this.f27196b.getString(R.string.IDS_hw_show_healthdata_bloodsugar_breakfast_difference));
            intent.putExtra("bloodSugar_diff_befor_message", this.f27196b.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_breakfast));
            intent.putExtra("bloodSugar_diff_after_message", this.f27196b.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_breakfast));
        } else if (i == 1) {
            intent.putExtra("bloodSugar_diff_title", this.f27196b.getString(R.string.IDS_hw_show_healthdata_bloodsugar_lunch_difference));
            intent.putExtra("bloodSugar_diff_befor_message", this.f27196b.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_lunch));
            intent.putExtra("bloodSugar_diff_after_message", this.f27196b.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_lunch));
        } else if (i == 2) {
            intent.putExtra("bloodSugar_diff_title", this.f27196b.getString(R.string.IDS_hw_show_healthdata_bloodsugar_dinner_difference));
            intent.putExtra("bloodSugar_diff_befor_message", this.f27196b.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_dinner));
            intent.putExtra("bloodSugar_diff_after_message", this.f27196b.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_dinner));
        } else {
            LogUtil.d("BloodSugarDietAnalysisView", "startActivityWithParams param can not null");
            return;
        }
        uma umaVar = this.f27197c;
        if (umaVar == null || umaVar.c() == null || this.f27197c.a() == null) {
            LogUtil.d("BloodSugarDietAnalysisView", "startActivityWithParams model , beforeModel or afterModel can not null");
            return;
        }
        uma umaVarC = this.f27197c.c();
        uma umaVarA = this.f27197c.a();
        intent.putExtra("bloodSugar_diff_time", c(Long.valueOf(this.f27197c.m()), true));
        intent.putExtra("bloodSugar_diff_number", this.f27197c.e());
        intent.putExtra("bloodSugar_diff_status", this.f27197c.h());
        intent.putExtra("bloodSugar_diff_befor_title", umaVarC.e());
        intent.putExtra("bloodSugar_diff_befor_status", umaVarC.h());
        intent.putExtra("bloodSUgar_diff_befor_time", c(Long.valueOf(umaVarC.m()), false));
        intent.putExtra("bloodSugar_diff_after_title", umaVarA.e());
        intent.putExtra("bloodSugar_diff_after_status", umaVarA.h());
        intent.putExtra("bloodSugar_diff_after_time", c(Long.valueOf(umaVarA.m()), false));
        iov.d(this.f27196b, intent);
    }

    private String c(Long l, boolean z) {
        return new SimpleDateFormat(z ? "yyyy/MM/dd HH:mm" : "HH:mm").format(l);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String string;
        if (view.getId() == R.id.blood_sugar_difference_view) {
            HashMap map = new HashMap(3);
            map.put("click", 1);
            map.put("type", String.valueOf(2));
            map.put(FunctionSetBeanReader.BI_ELEMENT, String.valueOf(11));
            idy.b(AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_CARD_DATA_2030070.value(), map);
            b(1, AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_ANALYSIS_DIE_2040135.value());
            d();
        }
        if (view == this.m) {
            int i = this.i;
            if (i == 0) {
                string = this.f27196b.getString(R.string.IDS_bsdiet_breakfast);
            } else if (i == 1) {
                string = this.f27196b.getString(R.string.IDS_bsdiet_lunch);
            } else if (i == 2) {
                string = this.f27196b.getString(R.string.IDS_bsdiet_dinner);
            } else {
                LogUtil.d("BloodSugarDietAnalysisView", "onClick other mDietType ", Integer.valueOf(i));
                string = "";
            }
            String str = "#/breakfast_detail?whichMeal=" + this.y + "&whichMealLabel=" + string + "&date=" + (TimeUtil.b(this.t * 1000) / 1000) + "&eatTime=" + this.t;
            LogUtil.a("BloodSugarDietAnalysisView", "jumpDietDetails uri = ", str);
            b(0, AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_ANALYSIS_DIE_2040135.value());
            DietDiaryRepository.jumpDietDetails(this.f27196b, str);
        }
    }
}
