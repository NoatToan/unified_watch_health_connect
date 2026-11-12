package com.mapbox.common.location;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseDeviceLocationProvider.LocationCancelable f54370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GetLocationCallback f54371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.location.Location f54372d;

    public /* synthetic */ c(BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback, android.location.Location location, int i14) {
        this.f54369a = i14;
        this.f54370b = locationCancelable;
        this.f54371c = getLocationCallback;
        this.f54372d = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54369a) {
            case 0:
                GoogleDeviceLocationProvider$getLastLocation$1$1.invoke$lambda$0(this.f54370b, this.f54371c, this.f54372d);
                break;
            default:
                AndroidDeviceLocationProvider.getLastLocation$lambda$2(this.f54370b, this.f54371c, this.f54372d);
                break;
        }
    }
}
