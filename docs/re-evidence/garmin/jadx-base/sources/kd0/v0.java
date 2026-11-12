package kd0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkd0/v0;", "Lij2/a;", "Lf12/b;", "gcmUserAccount", "<init>", "(Lf12/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 implements ij2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.b f104390a;

    public v0(f12.b bVar) {
        bVar.getClass();
        this.f104390a = bVar;
    }

    @Override // ij2.a
    public final Context b() {
        GarminConnectMobileApp.f28685g.getClass();
        return GarminConnectMobileApp.a.a();
    }

    @Override // ij2.a
    public final Locale c() {
        GarminConnectMobileApp.f28685g.getClass();
        Locale localeA = hb2.h.a(GarminConnectMobileApp.a.a());
        localeA.getClass();
        return localeA;
    }

    @Override // ij2.a
    public final String d() {
        f12.b bVar = this.f104390a;
        if (bVar.i()) {
            return "https://buy.garmin.com";
        }
        return bVar.x() ? "https://buy-staging.garmin.com" : "https://buy-test.garmin.com";
    }

    @Override // ij2.a
    public final Object e(hj2.g gVar) {
        return this.f104390a.j(gVar);
    }

    @Override // ij2.a
    public final String f() {
        return this.f104390a.i() ? "https://account.customer.services.garmin.com" : "https://account-test.customer.services.garmin.com";
    }

    @Override // ij2.a
    public final boolean g() {
        c22.s3.f23252a.getClass();
        return c22.s3.a("ROLE_MBTESTER");
    }

    @Override // ij2.a
    public final String h() {
        return this.f104390a.G() ? zi2.b.GARMIN_ATP_GATEWAY_TEST.f204886a : zi2.b.GARMIN_ATP_GATEWAY.f204886a;
    }

    @Override // ij2.a
    public final String i() {
        return this.f104390a.h().f177721c;
    }

    @Override // ij2.a
    public final Object j(v13.i iVar) {
        return this.f104390a.C(iVar);
    }

    @Override // ij2.a
    public final String k() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        String strH = gh2.i.f77458c.a().f77477b.h("loqate");
        strH.getClass();
        return strH;
    }
}
