package z10;

import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class j0 implements e23.l<wd2.m1, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t13.d<Boolean> f201062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f201063b;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(t13.d<? super Boolean> dVar, o53.b0 b0Var) {
        this.f201062a = dVar;
        this.f201063b = b0Var;
    }

    @Override // e23.l
    public final Unit invoke(wd2.m1 m1Var) {
        wd2.m1 m1Var2 = m1Var;
        m1Var2.getClass();
        GarminConnectMobileApp.f28685g.getClass();
        m1Var2.i(GarminConnectMobileApp.a.a(), new i0(this.f201062a, this.f201063b, m1Var2));
        return Unit.INSTANCE;
    }
}
