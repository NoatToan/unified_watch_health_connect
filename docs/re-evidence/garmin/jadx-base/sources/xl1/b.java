package xl1;

import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.YAxis;
import o13.p;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxl1/b;", "Lsl1/a$a;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements sl1.a.InterfaceC3024a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f191307a;

    public b(c cVar) {
        this.f191307a = cVar;
    }

    @Override // sl1.a.InterfaceC3024a
    public final String a(float f14, YAxis yAxis) {
        yAxis.getClass();
        float axisMaximum = yAxis.getAxisMaximum();
        Float fValueOf = Float.valueOf(axisMaximum / (yAxis.getLabelCount() - 1));
        b10.c cVar = this.f191307a.f191308c;
        return (String) u0.e(new p(fValueOf, cVar.f14211a.getString(R.string.txt_activity_level_low_label)), new p(Float.valueOf(axisMaximum), cVar.f14211a.getString(R.string.txt_activity_level_high_label))).get(Float.valueOf(f14));
    }
}
