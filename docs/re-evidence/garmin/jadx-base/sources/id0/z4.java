package id0;

import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.github.mikephil.charting.components.Legend;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lid0/z4;", "Lq30/g;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z4 extends q30.g {
    public z4(CustomLineChart customLineChart) {
        super(customLineChart);
    }

    @Override // q30.g, qz.f
    /* JADX INFO: renamed from: c */
    public final a00.a b() {
        a00.a aVarB = super.b();
        aVarB.setOrientation(Legend.LegendOrientation.VERTICAL);
        return aVarB;
    }
}
