package jw0;

import b63.o;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.github.mikephil.charting.components.YAxis;
import p005kotlin.Metadata;
import pv0.r;
import qz.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ljw0/g;", "Luz/e;", "Lkw0/b;", "Lpv0/r;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;", "chart", "Lj23/g;", "Lb63/o;", "dateInterval", "", "daily", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;Lj23/g;Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements uz.e<kw0.b, r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomCombinedChart f101354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j23.g<o> f101355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f101356c;

    public g(CustomCombinedChart customCombinedChart, j23.g<o> gVar, boolean z14) {
        customCombinedChart.getClass();
        gVar.getClass();
        this.f101354a = customCombinedChart;
        this.f101355b = gVar;
        this.f101356c = z14;
    }

    @Override // uz.e
    public final h a(YAxis yAxis, kw0.b bVar, r rVar) {
        yz.e eVar = new yz.e();
        j23.g<o> gVar = this.f101355b;
        boolean z14 = this.f101356c;
        CustomCombinedChart customCombinedChart = this.f101354a;
        return new e(customCombinedChart, customCombinedChart, yAxis, eVar, gVar, z14);
    }

    @Override // uz.e
    public final h b(kw0.b bVar, r rVar) {
        bVar.getClass();
        j23.g<o> gVar = this.f101355b;
        boolean z14 = this.f101356c;
        CustomCombinedChart customCombinedChart = this.f101354a;
        return new d(customCombinedChart, customCombinedChart, gVar, z14);
    }
}
