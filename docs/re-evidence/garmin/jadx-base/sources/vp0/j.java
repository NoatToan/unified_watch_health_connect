package vp0;

import com.garmin.android.apps.connectmobile.hydration.presentation.detail.HydrationView;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f179363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f179364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f179365d;

    public /* synthetic */ j(k kVar, double d14, double d15, int i14) {
        this.f179362a = i14;
        this.f179363b = kVar;
        this.f179364c = d14;
        this.f179365d = d15;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f179362a) {
            case 0:
                k kVar = this.f179363b;
                kVar.f179381o = false;
                double d14 = this.f179364c;
                double d15 = this.f179365d;
                kVar.f179369c = Double.valueOf(d14 + d15);
                kVar.f179373g.a(Double.valueOf(d15));
                kVar.d();
                break;
            default:
                k kVar2 = this.f179363b;
                kVar2.f179381o = false;
                HydrationView hydrationView = kVar2.f179373g;
                double d16 = this.f179364c;
                double d17 = this.f179365d;
                double d18 = d16 - d17;
                if (d18 < 0.01d) {
                    hydrationView.a(Double.valueOf(((double) (-1)) * d16));
                    kVar2.f179369c = Double.valueOf(0.0d);
                } else {
                    kVar2.f179369c = Double.valueOf(d18);
                    hydrationView.a(Double.valueOf(((double) (-1)) * d17));
                }
                kVar2.d();
                break;
        }
        return Unit.INSTANCE;
    }
}
