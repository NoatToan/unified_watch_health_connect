package ry0;

import com.garmin.android.apps.connectmobile.map.GCMMapView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lry0/d;", "", "Lcom/garmin/android/apps/connectmobile/map/GCMMapView;", "mapView", "", "isMapSeen", "<init>", "(Lcom/garmin/android/apps/connectmobile/map/GCMMapView;Z)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GCMMapView f155067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f155068b;

    public d(GCMMapView gCMMapView, boolean z14) {
        gCMMapView.getClass();
        this.f155067a = gCMMapView;
        this.f155068b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f155067a.equals(dVar.f155067a) && this.f155068b == dVar.f155068b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f155068b) + (this.f155067a.hashCode() * 31);
    }

    public final String toString() {
        return "MapViewCache(mapView=" + this.f155067a + ", isMapSeen=" + this.f155068b + ")";
    }
}
