package tn2;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltn2/k;", "Lms2/c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements ms2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final is2.b f165586a = is2.b.FELICA;

    @Override // ms2.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public final is2.b getF165586a() {
        return this.f165586a;
    }

    @Override // ms2.c
    public final Object b(ms2.e eVar, ps2.o oVar) {
        return !(eVar instanceof zq2.g) ? gg.b.q(false) : new ns2.a(p13.w.c(eVar), true);
    }

    @Override // ms2.c
    public final Object c(hs2.a aVar, t13.d<? super ns2.a<? extends ms2.e>> dVar) {
        zf.b.r();
        ns2.b bVar = new ns2.b(aVar, gh2.i.f77458c.a().f77477b.h("garminpay_feature_felica_restricted_devices"), ((com.garmin.android.apps.connectmobile.l) zf.b.r()).l());
        qs2.a aVar2 = qs2.a.f147386o;
        ArrayList arrayListA = bVar.a(aVar2);
        zq2.g.a aVar3 = zq2.g.f206679k;
        String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.operator_suica);
        string.getClass();
        aVar3.getClass();
        return new ns2.a(p13.w.c(zq2.g.a.a(aVar2, string, arrayListA)), true);
    }
}
