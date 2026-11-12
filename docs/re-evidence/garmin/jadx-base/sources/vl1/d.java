package vl1;

import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.YAxis;
import o13.p;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvl1/d;", "Lsl1/a$a;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements sl1.a.InterfaceC3024a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f178707a;

    public d(e eVar) {
        this.f178707a = eVar;
    }

    @Override // sl1.a.InterfaceC3024a
    public final String a(float f14, YAxis yAxis) {
        yAxis.getClass();
        e eVar = this.f178707a;
        eVar.getClass();
        Float fValueOf = Float.valueOf(a.NONE.f178704a);
        b10.c cVar = eVar.f178708c;
        p pVar = new p(fValueOf, cVar.f14211a.getString(R.string.lbl_minimal_dot_abbreviated));
        Float fValueOf2 = Float.valueOf(a.FEW.f178704a);
        l22.b bVar = cVar.f14211a;
        return (String) u0.e(pVar, new p(fValueOf2, bVar.getString(R.string.lbl_few)), new p(Float.valueOf(a.OCCASIONAL.f178704a), bVar.getString(R.string.lbl_occ_dot)), new p(Float.valueOf(a.FREQUENT.f178704a), bVar.getString(R.string.lbl_freq_dot))).get(Float.valueOf(f14));
    }
}
