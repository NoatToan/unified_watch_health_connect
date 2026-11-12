package hq2;

import android.content.Context;
import android.content.Intent;
import com.garmin.feature.garminpay.providers.preload.ui.PreloadTransitManageCardActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhq2/i;", "Lms2/g;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements ms2.g {
    @Override // ms2.g
    /* JADX INFO: renamed from: a */
    public final is2.b getF78513a() {
        return is2.b.PRELOAD_EASYCARD;
    }

    @Override // ms2.g
    public final ms2.d c(hs2.d dVar, hs2.a aVar) {
        aVar.getClass();
        dVar.getClass();
        return new g(dVar, this, aVar);
    }

    @Override // ms2.g
    public final Intent d(ms2.f fVar, long j8) {
        fVar.getClass();
        throw new IllegalStateException("Add card flow should not be entered for preload EasyCard");
    }

    @Override // ms2.g
    public final q03.b destroy() {
        z03.f fVar = z03.f.f200765a;
        fVar.getClass();
        return fVar;
    }

    @Override // ms2.g
    public final Intent e(qs2.d dVar) {
        PreloadTransitManageCardActivity.a aVar = PreloadTransitManageCardActivity.f51737l;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        is2.b f73427b = dVar.getF73427b();
        long f73431f = dVar.getF73431f();
        aVar.getClass();
        return PreloadTransitManageCardActivity.a.a(contextC, f73427b, f73431f);
    }

    @Override // ms2.g
    public final q03.b initialize() {
        z03.f fVar = z03.f.f200765a;
        fVar.getClass();
        return fVar;
    }

    @Override // ms2.g
    public final Intent k(String str, vr2.q qVar) {
        str.getClass();
        qVar.getClass();
        fs2.a aVar = qVar.f179658e;
        PreloadTransitManageCardActivity.a aVar2 = PreloadTransitManageCardActivity.f51737l;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        is2.b bVar = aVar.f73427b;
        long j8 = aVar.f73431f;
        aVar2.getClass();
        return PreloadTransitManageCardActivity.a.a(contextC, bVar, j8);
    }
}
