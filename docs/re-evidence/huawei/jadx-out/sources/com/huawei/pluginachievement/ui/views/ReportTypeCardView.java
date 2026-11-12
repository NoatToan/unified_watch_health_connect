package com.huawei.pluginachievement.ui.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.ui.commonui.reportchart.CustomIndicatorView;
import com.huawei.ui.commonui.reportchart.PercentageView;
import com.huawei.ui.commonui.reportchart.SportCardCircleView;
import defpackage.njy;
import defpackage.ozk;
import defpackage.ozt;
import defpackage.ozz;
import defpackage.pab;
import defpackage.pac;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ReportTypeCardView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LayoutInflater f22305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f22306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f22307c;
    private Context d;
    private PieChart e;

    public ReportTypeCardView(Context context) {
        this(context, null);
        this.d = context;
        c();
    }

    public ReportTypeCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet == null) {
            return;
        }
        this.d = context;
        c();
    }

    private void c() {
        Context context = this.d;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("layout_inflater");
        if (!(systemService instanceof LayoutInflater)) {
            LogUtil.j("ReportTypeCardView", "initView mLayoutInflater invalid");
            return;
        }
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        this.f22305a = layoutInflater;
        b(layoutInflater.inflate(R.layout.report_type_pie_view, this));
    }

    private void b(View view) {
        this.f22307c = (LinearLayout) view.findViewById(R.id.exercise_type_pie_chart_label);
        this.e = (PieChart) view.findViewById(R.id.exercise_type_pie_chart);
        this.f22306b = (LinearLayout) view.findViewById(R.id.exercise_sport_card);
    }

    public void setSportCardViewData(pac pacVar, List<ozk> list, int i) {
        c(pacVar, list);
        setPieChartLabel(list);
        b(list, i);
    }

    private void c(pac pacVar, List<ozk> list) {
        if (njy.e(list)) {
            LogUtil.j("ReportTypeCardView", "setPieChartData reportSportTypeBeanList isEmpty.");
            return;
        }
        this.e.setUsePercentValues(true);
        this.e.getDescription().setEnabled(false);
        this.e.setDragDecelerationFrictionCoef(0.95f);
        setPieChartCenterText(pacVar);
        this.e.setDrawHoleEnabled(true);
        this.e.setHoleColor(0);
        this.e.setTransparentCircleColor(-1);
        this.e.setTransparentCircleAlpha(110);
        this.e.setHoleRadius(72.0f);
        this.e.setTransparentCircleRadius(0.0f);
        this.e.setDrawCenterText(true);
        this.e.setDrawEntryLabels(false);
        this.e.setDrawRoundedSlices(true);
        this.e.setRotationEnabled(false);
        this.e.getLegend().setEnabled(false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ozk ozkVar : list) {
            arrayList.add(new PieEntry(ozkVar.j(), ""));
            arrayList2.add(Integer.valueOf(ozkVar.f()));
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList, "");
        pieDataSet.setSliceSpace(0.0f);
        pieDataSet.setSelectionShift(5.0f);
        pieDataSet.setColors(arrayList2);
        PieData pieData = new PieData(pieDataSet);
        pieData.setDrawValues(false);
        pieData.setValueFormatter(new PercentFormatter());
        pieData.setValueTextSize(11.0f);
        pieData.setValueTextColor(-16777216);
        this.e.setData(pieData);
        this.e.highlightValues(null);
        this.e.invalidate();
    }

    private void setPieChartCenterText(pac pacVar) {
        int i = R.style.report_sport_indicate_name_text;
        int i2 = R.style.report_sport_indicate_content_text;
        int i3 = R.style.report_sport_indicate_content_content;
        String strA = pacVar.a();
        if (LanguageUtil.l(BaseApplication.b())) {
            String strD = pacVar.d();
            SpannableString spannableString = new SpannableString(strA + strD + pacVar.c());
            spannableString.setSpan(new TextAppearanceSpan(this.d, i), 0, strA.length(), 33);
            spannableString.setSpan(new TextAppearanceSpan(this.d, i2), strA.length(), strA.length() + strD.length(), 33);
            spannableString.setSpan(new TextAppearanceSpan(this.d, i3), strA.length() + strD.length(), spannableString.length(), 33);
            this.e.setCenterText(spannableString);
            return;
        }
        this.e.setCenterTextColor(this.d.getResources().getColor(R.color.colorForeground));
        this.e.setCenterText(strA);
    }

    private void setPieChartLabel(List<ozk> list) {
        if (njy.e(list)) {
            LogUtil.j("ReportTypeCardView", "setPieChartLabel reportSportTypeBeanList isEmpty.");
            return;
        }
        int size = list.size();
        this.f22307c.removeAllViews();
        View viewInflate = this.f22305a.inflate(R.layout.pie_label_item, (ViewGroup) null);
        for (int i = 0; i < size; i++) {
            int i2 = i % 3;
            if (i2 == 0) {
                viewInflate = this.f22305a.inflate(R.layout.pie_label_item, (ViewGroup) null);
            }
            TextView textView = (TextView) viewInflate.findViewById(R.id.pieLeftLabel);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.pieLeftIcon);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.pieMiddleLabel);
            ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.pieMiddleIcon);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.pieRightLabel);
            ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.pieRightIcon);
            Drawable drawableI = list.get(i).i();
            if (i2 == 0) {
                imageView.setBackground(drawableI);
                textView.setText(list.get(i).h());
                this.f22307c.addView(viewInflate);
            } else if (i2 == 1) {
                imageView2.setBackground(drawableI);
                textView2.setText(list.get(i).h());
            } else if (i2 == 2) {
                imageView3.setBackground(drawableI);
                textView3.setText(list.get(i).h());
            }
        }
    }

    private void b(List<ozk> list, int i) {
        if (njy.e(list)) {
            return;
        }
        this.f22306b.removeAllViews();
        for (ozk ozkVar : list) {
            if (ozkVar.g() == -1) {
                c(ozkVar, i);
            } else {
                this.f22306b.addView(c(ozkVar));
            }
        }
    }

    public static Drawable a(Drawable drawable, int i) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTint(drawableWrap, i);
        return drawableWrap;
    }

    private View c(ozk ozkVar) {
        View viewInflate = this.f22305a.inflate(R.layout.include_sport_type_item, (ViewGroup) null);
        d(viewInflate, ozkVar);
        return viewInflate;
    }

    private void b(LinearLayout linearLayout, List<ozz> list) {
        if (njy.e(list)) {
            LogUtil.j("ReportTypeCardView", "setFitnessLabel reportFitnessList isEmpty.");
            return;
        }
        int size = list.size();
        linearLayout.removeAllViews();
        View viewInflate = this.f22305a.inflate(R.layout.pie_label_item, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qrs.d(this.d, 5.0f), qrs.d(this.d, 5.0f));
        layoutParams.setMargins(0, qrs.d(this.d, 8.0f), 0, 0);
        for (int i = 0; i < size; i++) {
            int i2 = i % 3;
            if (i2 == 0) {
                viewInflate = this.f22305a.inflate(R.layout.pie_label_item, (ViewGroup) null);
            }
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.pieLeftIcon);
            imageView.setLayoutParams(layoutParams);
            ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.pieMiddleIcon);
            imageView2.setLayoutParams(layoutParams);
            ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.pieRightIcon);
            imageView3.setLayoutParams(layoutParams);
            Drawable drawableB = b(list.get(i));
            String strB = list.get(i).b();
            if (i2 == 0) {
                imageView.setBackground(drawableB);
                ((TextView) viewInflate.findViewById(R.id.pieLeftLabel)).setText(strB);
                linearLayout.addView(viewInflate);
            } else if (i2 == 1) {
                imageView2.setBackground(drawableB);
                ((TextView) viewInflate.findViewById(R.id.pieMiddleLabel)).setText(strB);
            } else if (i2 == 2) {
                imageView3.setBackground(drawableB);
                ((TextView) viewInflate.findViewById(R.id.pieRightLabel)).setText(strB);
            }
        }
    }

    private Drawable b(ozz ozzVar) {
        Drawable drawable;
        if (ozzVar == null || (drawable = ContextCompat.getDrawable(this.d, ozzVar.e())) == null) {
            return null;
        }
        return a(drawable, ozzVar.a());
    }

    private void c(ozk ozkVar, int i) {
        if (ozkVar instanceof ozt) {
            ozt oztVar = (ozt) ozkVar;
            View viewInflate = this.f22305a.inflate(R.layout.include_fitness_type_item, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(R.id.fitness_count)).setText(String.valueOf(oztVar.j()));
            ((TextView) viewInflate.findViewById(R.id.total_fitness_time)).setText(oztVar.m());
            ((TextView) viewInflate.findViewById(R.id.longest_fitness_time)).setText(oztVar.n());
            TextView textView = (TextView) viewInflate.findViewById(R.id.sport_type_title_label);
            textView.setText(oztVar.l());
            textView.setBackground(oztVar.d());
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.cardLayout);
            if (oztVar.c() != 0) {
                ((GradientDrawable) relativeLayout.getBackground()).setColor(oztVar.c());
            }
            ((ImageView) viewInflate.findViewById(R.id.circleView)).setImageDrawable(oztVar.b());
            int iJ = oztVar.j();
            c((TextView) viewInflate.findViewById(R.id.fitness_desc), String.valueOf(iJ), oztVar.o(), oztVar.k(), i);
            List<ozz> listR = oztVar.r();
            ArrayList arrayList = new ArrayList();
            for (ozz ozzVar : listR) {
                arrayList.add(new PercentageView.d(ozzVar.c(), ozzVar.a()));
            }
            ((PercentageView) viewInflate.findViewById(R.id.report_percentage_view)).setData(arrayList);
            b((LinearLayout) viewInflate.findViewById(R.id.fitness_type_label), listR);
            a((LinearLayout) viewInflate.findViewById(R.id.exercise_area_layout), oztVar);
            this.f22306b.addView(viewInflate);
        }
    }

    private void c(TextView textView, String str, String str2, String str3, int i) {
        String str4;
        CharSequence quantityString = BaseApplication.b().getResources().getQuantityString(R.plurals.IDS_report_week_fitness_desc, qrs.a(str), str, str2, str3);
        if (i != 0) {
            str4 = "本周完成健身课程";
        } else {
            quantityString = BaseApplication.b().getResources().getQuantityString(R.plurals.IDS_report_month_fitness, qrs.a(str), str, str2, str3);
            str4 = "本月完成健身课程";
        }
        if (LanguageUtil.l(BaseApplication.b())) {
            int i2 = R.style.achieve_fitness_content;
            int i3 = R.style.achieve_fitness_value;
            String str5 = "“" + str2 + "”";
            String str6 = "“" + str3 + "”";
            SpannableString spannableString = new SpannableString(str4 + str + "次，偏爱" + str5 + "类健身课程，" + str6 + "是你锻炼次数最多的健身课程。");
            int length = str4.length();
            spannableString.setSpan(new TextAppearanceSpan(this.d, i2), 0, length, 33);
            int length2 = str.length() + length;
            spannableString.setSpan(new TextAppearanceSpan(this.d, i3), length, length2, 33);
            int i4 = length2 + 4;
            spannableString.setSpan(new TextAppearanceSpan(this.d, i2), length2, i4, 33);
            int length3 = str5.length() + i4;
            spannableString.setSpan(new TextAppearanceSpan(this.d, i3), i4, length3, 33);
            int i5 = length3 + 6;
            spannableString.setSpan(new TextAppearanceSpan(this.d, i2), length3, i5, 33);
            int length4 = str6.length() + i5;
            spannableString.setSpan(new TextAppearanceSpan(this.d, i3), i5, length4, 33);
            spannableString.setSpan(new TextAppearanceSpan(this.d, i2), length4, length4 + 14, 33);
            textView.setText(spannableString);
            return;
        }
        textView.setText(quantityString);
    }

    private void a(LinearLayout linearLayout, ozt oztVar) {
        if (oztVar == null || njy.e(oztVar.p())) {
            LogUtil.j("ReportTypeCardView", "setPieChartData reportSportTypeBean is null || AreaList isEmpty.");
            return;
        }
        int size = oztVar.p().size();
        linearLayout.removeAllViews();
        View viewInflate = this.f22305a.inflate(R.layout.fitness_area_item, (ViewGroup) null);
        for (int i = 0; i < size; i++) {
            int i2 = i % 3;
            if (i2 == 0) {
                viewInflate = this.f22305a.inflate(R.layout.fitness_area_item, (ViewGroup) null);
            }
            TextView textView = (TextView) viewInflate.findViewById(R.id.pieLeftLabel);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.pieLeftIcon);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.pieMiddleLabel);
            ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.pieMiddleIcon);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.pieRightLabel);
            ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.pieRightIcon);
            int iIntValue = oztVar.p().get(i).intValue();
            if (i2 == 0) {
                imageView.setBackgroundResource(iIntValue);
                textView.setText(oztVar.s().get(i));
                linearLayout.addView(viewInflate);
            } else if (i2 == 1) {
                imageView2.setBackgroundResource(iIntValue);
                textView2.setText(oztVar.s().get(i));
            } else if (i2 == 2) {
                imageView3.setBackgroundResource(iIntValue);
                textView3.setText(oztVar.s().get(i));
            }
        }
    }

    private void d(View view, ozk ozkVar) {
        if (ozkVar instanceof pab) {
            pab pabVar = (pab) ozkVar;
            TextView textView = (TextView) view.findViewById(R.id.sport_type_title_label);
            textView.setText(pabVar.l());
            textView.setBackground(pabVar.d());
            if (pabVar.c() != 0) {
                Drawable background = view.findViewById(R.id.cardLayout).getBackground();
                if (background instanceof GradientDrawable) {
                    ((GradientDrawable) background).setColor(pabVar.c());
                }
            }
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.circleViewLayout);
            if (pabVar.b() == null) {
                relativeLayout.setVisibility(0);
                ((ImageView) view.findViewById(R.id.sport_type_body_icon)).setImageDrawable(pabVar.e());
                ((SportCardCircleView) view.findViewById(R.id.sport_circle_view)).setCircle(pabVar.a());
            } else {
                relativeLayout.setVisibility(8);
                ((ImageView) view.findViewById(R.id.circleView)).setImageDrawable(pabVar.b());
            }
            d((LinearLayout) view.findViewById(R.id.sport_item_layout), pabVar.k());
        }
    }

    private void d(LinearLayout linearLayout, List<pac> list) {
        if (njy.e(list)) {
            LogUtil.j("ReportTypeCardView", "setLabelLayout sportItemList isEmpty.");
            return;
        }
        int size = list.size();
        linearLayout.removeAllViews();
        View viewInflate = this.f22305a.inflate(R.layout.sport_label_item, (ViewGroup) null);
        for (int i = 0; i < size; i++) {
            int i2 = i % 2;
            if (i2 == 0) {
                viewInflate = this.f22305a.inflate(R.layout.sport_label_item, (ViewGroup) null);
            }
            CustomIndicatorView customIndicatorView = (CustomIndicatorView) viewInflate.findViewById(R.id.sportLeftLabel);
            CustomIndicatorView customIndicatorView2 = (CustomIndicatorView) viewInflate.findViewById(R.id.sportRightLabel);
            if (i2 == 0) {
                c(customIndicatorView, list.get(i));
                linearLayout.addView(viewInflate);
            } else if (i2 == 1) {
                c(customIndicatorView2, list.get(i));
            }
        }
    }

    private void c(CustomIndicatorView customIndicatorView, pac pacVar) {
        if (pacVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(pacVar.e())) {
            customIndicatorView.setIndicatorTitle(pacVar.e());
        }
        if (!TextUtils.isEmpty(pacVar.a())) {
            customIndicatorView.setIndicatorValue(pacVar.a());
        }
        if (!TextUtils.isEmpty(pacVar.d())) {
            customIndicatorView.setIndicatorUnit(pacVar.d());
        }
        if (TextUtils.isEmpty(pacVar.c())) {
            return;
        }
        customIndicatorView.setIndicatorDesc(pacVar.c());
    }
}
