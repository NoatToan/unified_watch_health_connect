package vp0;

import android.view.View;
import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f179357b;

    public /* synthetic */ g(k kVar, int i14) {
        this.f179356a = i14;
        this.f179357b = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        double d14;
        switch (this.f179356a) {
            case 0:
                vc2.b bVar = (vc2.b) obj;
                int i14 = k.f179366q;
                bVar.getClass();
                this.f179357b.f179381o = !(bVar instanceof vc2.b.c);
                break;
            default:
                View view2 = (View) obj;
                int i15 = k.f179366q;
                view2.getClass();
                k kVar = this.f179357b;
                if (kVar.f179381o) {
                    Double d15 = kVar.f179369c;
                    double dDoubleValue = 0.0d;
                    double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
                    if (view2.equals(kVar.f179377k)) {
                        Double volume = kVar.f179371e.f128605a.getVolume();
                        if (volume != null) {
                            dDoubleValue = volume.doubleValue();
                            d14 = dDoubleValue;
                        } else {
                            d14 = 250.0d;
                        }
                    } else if (view2.equals(kVar.f179378l)) {
                        Double volume2 = kVar.f179371e.f128606b.getVolume();
                        if (volume2 != null) {
                            dDoubleValue = volume2.doubleValue();
                            d14 = dDoubleValue;
                        } else {
                            d14 = 250.0d;
                        }
                    } else {
                        if (view2.equals(kVar.f179379m)) {
                            Double volume3 = kVar.f179371e.f128607c.getVolume();
                            if (volume3 != null) {
                                dDoubleValue = volume3.doubleValue();
                            } else {
                                d14 = 250.0d;
                            }
                        }
                        d14 = dDoubleValue;
                    }
                    kVar.f179367a.o0(d14, new j(kVar, dDoubleValue2, d14, 0));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
