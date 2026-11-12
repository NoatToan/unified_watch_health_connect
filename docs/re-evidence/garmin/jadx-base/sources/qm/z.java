package qm;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.charts.PieChart;
import com.github.mikephil.chartingv2.data.BarEntry;
import com.github.mikephil.chartingv2.data.PieData;
import com.github.mikephil.chartingv2.data.PieDataSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f145467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PieChart f145468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f145469c;

    public z(Context context, int i14) {
        this.f145467a = context;
        this.f145469c = i14;
    }

    public final void a(PieChart pieChart) {
        this.f145468b = pieChart;
        if (pieChart != null) {
            pieChart.setDescription(null);
            this.f145468b.setDragDecelerationFrictionCoef(0.95f);
            PieChart pieChart2 = this.f145468b;
            int i14 = this.f145469c == 0 ? R.string.left_bike_pedal : R.string.right_bike_pedal;
            Context context = this.f145467a;
            String string = context.getString(i14);
            SpannableString spannableString = new SpannableString(string.toUpperCase(Locale.getDefault()));
            spannableString.setSpan(new RelativeSizeSpan(1.8f), 0, string.length(), 0);
            spannableString.setSpan(new ForegroundColorSpan(a7.b.getColor(context, R.color.gcm_text_primary)), 0, string.length(), 0);
            pieChart2.setCenterText(spannableString);
            this.f145468b.setDescription(null);
            PieChart pieChart3 = this.f145468b;
            pieChart3.setRenderer(new om.d(pieChart3));
            this.f145468b.setHoleRadius(80.0f);
            int color = a7.b.getColor(this.f145468b.getContext(), R.color.gcm_background_hero);
            this.f145468b.setTransparentCircleColor(color);
            this.f145468b.setTransparentCircleAlpha(255);
            this.f145468b.setTransparentCircleRadius(50.0f);
            this.f145468b.setBackgroundColor(color);
            this.f145468b.setDrawCenterText(true);
            this.f145468b.setRotationEnabled(false);
            this.f145468b.setHighlightPerTapEnabled(false);
            this.f145468b.getLegend().setEnabled(false);
            this.f145468b.highlightValues(null);
            this.f145468b.setDrawSliceText(false);
            this.f145468b.setExtraRightOffset(5.0f);
            this.f145468b.setTouchEnabled(false);
        }
    }

    public final void b(float f14, float f15, float f16, float f17) {
        if (this.f145468b != null) {
            float f18 = 360.0f - f14;
            Float[] fArr = {Float.valueOf((f16 + f18) % 360.0f), Float.valueOf((f17 + f18) % 360.0f), Float.valueOf((f15 + f18) % 360.0f), Float.valueOf(360.0f)};
            ArrayList arrayList = new ArrayList(4);
            for (int i14 = 0; i14 < 4; i14++) {
                if (i14 == 0) {
                    arrayList.add(new BarEntry((fArr[i14].floatValue() * 100.0f) / 360.0f, i14));
                } else {
                    arrayList.add(new BarEntry(((fArr[i14].floatValue() - fArr[i14 - 1].floatValue()) * 100.0f) / 360.0f, i14));
                }
            }
            PieDataSet pieDataSet = new PieDataSet(arrayList, null);
            ArrayList arrayList2 = new ArrayList(4);
            int i15 = this.f145469c;
            Context context = this.f145467a;
            if (i15 == 1) {
                arrayList2.add(Integer.valueOf(a7.b.getColor(context, R.color.palette_delta_2)));
                arrayList2.add(Integer.valueOf(a7.b.getColor(context, R.color.palette_delta_1)));
                q6.f.t(context, R.color.palette_delta_2, arrayList2);
            } else {
                arrayList2.add(Integer.valueOf(a7.b.getColor(context, R.color.palette_swagger_2)));
                arrayList2.add(Integer.valueOf(a7.b.getColor(context, R.color.palette_swagger_1)));
                q6.f.t(context, R.color.palette_swagger_2, arrayList2);
            }
            arrayList2.add(Integer.valueOf(a7.b.getColor(context, R.color.gcm_progress_indicator_empty)));
            pieDataSet.setColors(arrayList2);
            PieData pieData = new PieData((List<String>) Collections.nCopies(5, ""), pieDataSet);
            pieData.setDrawValues(false);
            this.f145468b.setRotationAngle(f14 - 90.0f);
            this.f145468b.setData(pieData);
            this.f145468b.invalidate();
        }
    }
}
