package cm1;

import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.YAxis;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import rl1.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcm1/c;", "Lsl1/a$a;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements sl1.a.InterfaceC3024a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f27965a;

    public c(d dVar) {
        this.f27965a = dVar;
    }

    @Override // sl1.a.InterfaceC3024a
    public final String a(float f14, YAxis yAxis) {
        yAxis.getClass();
        float axisMaximum = yAxis.getAxisMaximum();
        b10.c cVar = this.f27965a.f27966c;
        k kVar = k.AWAKE;
        boolean z14 = axisMaximum == ((float) oc.b.r(kVar, true, false));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Float fValueOf = Float.valueOf(oc.b.r(k.DEEP, z14, false));
        l22.b bVar = cVar.f14211a;
        l22.b bVar2 = cVar.f14211a;
        linkedHashMap.put(fValueOf, bVar.getString(R.string.sleep_lbl_deep));
        linkedHashMap.put(Float.valueOf(oc.b.r(k.LIGHT, z14, false)), bVar2.getString(R.string.sleep_lbl_light));
        if (z14) {
            linkedHashMap.put(Float.valueOf(oc.b.r(k.REM, true, false)), bVar2.getString(R.string.sleep_lbl_rem));
        }
        linkedHashMap.put(Float.valueOf(oc.b.r(kVar, z14, false)), bVar2.getString(R.string.sleep_lbl_awake));
        return (String) linkedHashMap.get(Float.valueOf(f14));
    }
}
