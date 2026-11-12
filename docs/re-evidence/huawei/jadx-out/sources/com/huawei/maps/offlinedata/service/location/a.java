package com.huawei.maps.offlinedata.service.location;

import android.location.Location;
import android.os.Looper;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import com.huawei.maps.offlinedata.jsbridge.b;
import com.huawei.maps.offlinedata.utils.d;
import com.huawei.maps.offlinedata.utils.g;

/* JADX INFO: loaded from: classes40.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a f17983b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FusedLocationProviderClient f17984a = LocationServices.getFusedLocationProviderClient(com.huawei.maps.offlinedata.utils.a.b());

    /* JADX INFO: renamed from: com.huawei.maps.offlinedata.service.location.a$a, reason: collision with other inner class name */
    class C0190a extends LocationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f17985a;

        C0190a(long j) {
            this.f17985a = j;
        }

        public void onLocationResult(LocationResult locationResult) {
            if (locationResult == null) {
                com.huawei.maps.offlinedata.jsbridge.a.a().a(-1, "", this.f17985a);
                return;
            }
            MyLocation myLocation = new MyLocation(((Location) locationResult.getLocations().get(0)).getLatitude(), ((Location) locationResult.getLocations().get(0)).getLongitude());
            com.huawei.maps.offlinedata.jsbridge.a.a().a(d.a(myLocation), this.f17985a);
            b.a().a("configHolder.location", d.a(myLocation));
        }
    }

    private a() {
    }

    public static a a() {
        if (f17983b == null) {
            synchronized (a.class) {
                if (f17983b == null) {
                    f17983b = new a();
                }
            }
        }
        return f17983b;
    }

    public void a(final long j) {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setPriority(102);
        locationRequest.setNumUpdates(1);
        this.f17984a.requestLocationUpdates(locationRequest, new C0190a(j), Looper.getMainLooper()).addOnSuccessListener(new OnSuccessListener() { // from class: com.huawei.maps.offlinedata.service.location.a$$ExternalSyntheticLambda0
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                g.c("LocationService", "requestLocationUpdates onSuccess");
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.maps.offlinedata.service.location.a$$ExternalSyntheticLambda1
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                a.a(j, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(long j, Exception exc) {
        com.huawei.maps.offlinedata.jsbridge.a.a().a(-1, "", j);
        g.b("LocationService", "requestLocationUpdates onFailure, exception: " + exc.getMessage());
    }
}
