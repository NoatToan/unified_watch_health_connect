package du2;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldu2/i;", "Landroid/location/LocationListener;", "weather-gdi_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f61311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t13.d<Location> f61312b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(g gVar, t13.d<? super Location> dVar) {
        this.f61311a = gVar;
        this.f61312b = dVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        location.getClass();
        g.a(this.f61311a, location, this.f61312b);
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
    @o13.e
    public final void onStatusChanged(String str, int i14, Bundle bundle) {
    }
}
