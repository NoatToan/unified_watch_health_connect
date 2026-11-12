package ii1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lii1/l;", "Lxt2/a$d;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements xt2.a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f93787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f93788b;

    public l(e23.a<Unit> aVar, e23.a<Unit> aVar2) {
        this.f93787a = aVar;
        this.f93788b = aVar2;
    }

    @Override // xt2.a.d
    public final void c(rs2.c cVar) {
        cVar.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "SendFindMyBandUseCase", "[sendFindMyBand] onFailedToSendFindMyWatchMessage");
        this.f93787a.invoke();
    }

    @Override // xt2.a.d
    public final void d(rs2.c cVar) {
        cVar.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "SendFindMyBandUseCase", "[sendFindMyBand] onFindMyWatchMessageSent");
        this.f93788b.invoke();
    }
}
