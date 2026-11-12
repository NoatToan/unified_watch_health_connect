package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class d2 extends a5<zk0.h, Double> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f27318g = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xg1.j f27320f;

    public d2(Context context, boolean z14, xg1.j jVar) {
        super(context);
        this.f27319e = z14;
        this.f27320f = jVar;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        return this.f27319e || ((zk0.h) obj).C() > -1;
    }

    @Override // ch1.a5
    public final Double s(zk0.h hVar) {
        zk0.h hVar2 = hVar;
        return hVar2.C() > -1 ? Double.valueOf(hVar2.C()) : Double.valueOf(Double.NaN);
    }

    @Override // ch1.a5
    public final int t() {
        return R.id.user_settings_weekly_intensity_minutes;
    }

    @Override // ch1.a5
    public final String u() {
        return b(R.string.title_intensity_minutes);
    }

    @Override // ch1.a5
    public final xg1.c<Double> v(zk0.h hVar) {
        return new bd0.e(this, hVar);
    }

    @Override // ch1.a5
    public final xg1.r<Double> w() {
        return new c2(this);
    }

    @Override // ch1.a5
    public final void x(Double d14, zk0.h hVar) {
        Double d15 = d14;
        zk0.h hVar2 = hVar;
        nr0.a aVar = new nr0.a();
        aVar.f127609c = hVar2;
        if (hVar2.C() > -1) {
            hVar2.D(d15 != null ? d15.intValue() : 0);
            xg1.j jVar = this.f27320f;
            if (jVar != null) {
                jVar.a(aVar);
            }
        }
    }
}
