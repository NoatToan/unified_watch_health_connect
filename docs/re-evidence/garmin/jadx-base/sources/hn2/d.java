package hn2;

import android.content.Intent;
import com.garmin.feature.garminpay.GarminPayInitializer;
import e23.l;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GarminPayInitializer f84559b;

    public /* synthetic */ d(GarminPayInitializer garminPayInitializer, int i14) {
        this.f84558a = i14;
        this.f84559b = garminPayInitializer;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f84558a) {
            case 0:
                return GarminPayInitializer.initialize$lambda$0(this.f84559b, (Intent) obj);
            case 1:
                return GarminPayInitializer.initialize$lambda$2(this.f84559b, (Throwable) obj);
            default:
                return GarminPayInitializer.signOut$lambda$2(this.f84559b, (Throwable) obj);
        }
    }
}
