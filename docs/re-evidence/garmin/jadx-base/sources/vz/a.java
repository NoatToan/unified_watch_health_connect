package vz;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomPieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import g00.d;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lvz/a;", "T", "", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomPieChart;", "chart", "Lvz/b;", "dataConfig", "Lvz/c;", "rendererConfig", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomPieChart;Lvz/b;Lvz/c;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomPieChart f180862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<T> f180863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f180864c;

    public a(CustomPieChart customPieChart, b<T> bVar, c cVar) {
        customPieChart.getClass();
        bVar.getClass();
        cVar.getClass();
        this.f180862a = customPieChart;
        this.f180863b = bVar;
        this.f180864c = cVar;
        customPieChart.setRenderer(cVar.c());
        customPieChart.setDescription(null);
        customPieChart.setNoDataText("");
        customPieChart.setCenterTextColor(a7.b.getColor(customPieChart.getContext(), R.color.gcm_text_primary));
        customPieChart.setCenterTextTypeface(h22.a.a("font/roboto_light.ttf", customPieChart.getContext()));
        customPieChart.setDrawHoleEnabled(true);
        customPieChart.setHoleColor(a7.b.getColor(customPieChart.getContext(), R.color.gcm3_transparent));
        customPieChart.setDrawSlicesUnderHole(false);
        customPieChart.setDrawCenterText(cVar.b());
        customPieChart.setRotationEnabled(false);
        customPieChart.setHighlightPerTapEnabled(false);
        customPieChart.getF31342c().setEnabled(false);
        customPieChart.setTouchEnabled(false);
    }

    public final void a(T t7) {
        b<T> bVar = this.f180863b;
        PieDataSet pieDataSetA = bVar.a(t7);
        c cVar = this.f180864c;
        Float fD = cVar.d();
        if (fD != null) {
            pieDataSetA.setSliceSpace(fD.floatValue());
        }
        pieDataSetA.setDrawValues(false);
        pieDataSetA.setSelectionShift(0.8f);
        PieData pieData = new PieData(pieDataSetA);
        CustomPieChart customPieChart = this.f180862a;
        customPieChart.setData(pieData);
        customPieChart.setCenterText(bVar.d(t7));
        if (cVar.c() != null) {
            bVar.c(t7);
        }
        d dVarC = cVar.c();
        if (dVarC != null) {
            dVarC.f74089g = cVar.a();
        }
        customPieChart.setContentDescription(bVar.b(t7));
        CharSequence contentDescription = customPieChart.getContentDescription();
        contentDescription.getClass();
        customPieChart.setFocusable(contentDescription.length() > 0);
        customPieChart.invalidate();
    }
}
