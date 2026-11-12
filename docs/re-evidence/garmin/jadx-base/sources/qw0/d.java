package qw0;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqw0/d;", "Landroid/location/LocationListener;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f148309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.InterfaceC2796b f148310b;

    public d(b bVar, b.InterfaceC2796b interfaceC2796b) {
        this.f148309a = bVar;
        this.f148310b = interfaceC2796b;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        location.getClass();
        a2 a2Var = a2.LOCATION;
        String str = this.f148309a.f148298b + " LocationListener: onLocationChanged " + location;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "GCMBackgroundLocationClient", str);
        this.f148310b.onLocationChanged(location);
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        str.getClass();
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        str.getClass();
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i14, Bundle bundle) {
    }
}
