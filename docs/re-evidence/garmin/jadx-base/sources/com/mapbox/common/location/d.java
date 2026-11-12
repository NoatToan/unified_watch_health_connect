package com.mapbox.common.location;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f54375c;

    public /* synthetic */ d(int i14, Object obj, Object obj2) {
        this.f54373a = i14;
        this.f54374b = obj;
        this.f54375c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54373a) {
            case 0:
                GoogleDeviceLocationProvider$getLastLocation$1$1.invoke$lambda$1((BaseDeviceLocationProvider.LocationCancelable) this.f54374b, (GetLocationCallback) this.f54375c);
                break;
            case 1:
                AndroidDeviceLocationProvider.getLastLocation$lambda$3((BaseDeviceLocationProvider.LocationCancelable) this.f54374b, (GetLocationCallback) this.f54375c);
                break;
            case 2:
                AndroidDeviceLocationProvider.getLastLocation$lambda$4((BaseDeviceLocationProvider.LocationCancelable) this.f54374b, (GetLocationCallback) this.f54375c);
                break;
            default:
                BaseLocationProvider.notifyLocationUpdate$lambda$1$lambda$0((LocationObserver) this.f54374b, (List) this.f54375c);
                break;
        }
    }
}
