package hn2;

import com.garmin.feature.garminpay.GarminPayInitializer;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements u03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GarminPayInitializer f84561b;

    public /* synthetic */ e(GarminPayInitializer garminPayInitializer, int i14) {
        this.f84560a = i14;
        this.f84561b = garminPayInitializer;
    }

    @Override // u03.a
    public final void run() {
        switch (this.f84560a) {
            case 0:
                GarminPayInitializer.initServiceProviderFactorySingletons$lambda$0(this.f84561b);
                break;
            default:
                GarminPayInitializer.signOut$lambda$1(this.f84561b);
                break;
        }
    }
}
