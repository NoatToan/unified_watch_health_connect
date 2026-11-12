package qw0;

import android.location.Location;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqw0/c;", "Lcom/google/android/gms/location/LocationCallback;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends LocationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f148307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.InterfaceC2796b f148308b;

    public c(b bVar, b.InterfaceC2796b interfaceC2796b) {
        this.f148307a = bVar;
        this.f148308b = interfaceC2796b;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        locationResult.getClass();
        Location lastLocation = locationResult.getLastLocation();
        a2 a2Var = a2.LOCATION;
        String str = this.f148307a.f148298b + " LocationCallback: onLocationResult " + lastLocation;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "GCMBackgroundLocationClient", str);
        if (lastLocation != null) {
            this.f148308b.onLocationChanged(lastLocation);
        }
    }
}
