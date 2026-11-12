package tn2;

import android.content.Context;
import android.content.Intent;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaAddCardActivity;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaCardDetailActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltn2/w0;", "Lms2/g;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w0 implements ms2.g {
    @Override // ms2.g
    /* JADX INFO: renamed from: a */
    public final is2.b getF133320a() {
        return is2.b.FELICA;
    }

    @Override // ms2.g
    public final ms2.d c(hs2.d dVar, hs2.a aVar) {
        aVar.getClass();
        dVar.getClass();
        return new d0(is2.b.FELICA, dVar, this, aVar);
    }

    @Override // ms2.g
    public final Intent d(ms2.f fVar, long j8) {
        fVar.getClass();
        FelicaAddCardActivity.a aVar = FelicaAddCardActivity.f50949l;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        aVar.getClass();
        return FelicaAddCardActivity.a.a(contextC, j8);
    }

    @Override // ms2.g
    public final q03.b destroy() {
        tn.k kVar = new tn.k(5);
        int i14 = w03.b.f181178a;
        return new z03.h(kVar);
    }

    @Override // ms2.g
    public final Intent e(qs2.d dVar) {
        if (!(dVar instanceof fs2.a)) {
            vb.h.s("Failed requirement.");
            return null;
        }
        FelicaCardDetailActivity.a aVar = FelicaCardDetailActivity.f50960l;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        fs2.a aVar2 = (fs2.a) dVar;
        String str = aVar2.f73426a;
        long j8 = aVar2.f73431f;
        aVar.getClass();
        return FelicaCardDetailActivity.a.a(contextC, j8, str);
    }

    @Override // ms2.g
    public final q03.b initialize() {
        tn.k kVar = new tn.k(6);
        int i14 = w03.b.f181178a;
        return new z03.h(kVar);
    }

    @Override // ms2.g
    public final Intent k(String str, vr2.q qVar) {
        str.getClass();
        qVar.getClass();
        throw new IllegalStateException("Never hit");
    }
}
