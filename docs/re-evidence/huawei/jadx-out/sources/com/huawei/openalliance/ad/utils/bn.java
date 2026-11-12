package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    LocationCallback f20496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LocationRequest f20497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FusedLocationProviderClient f20498c;
    private a d;
    private volatile boolean e = false;

    public interface a {
        void a();

        void a(Location location);
    }

    public void a() {
        if (this.f20498c == null) {
            return;
        }
        this.e = false;
        this.f20498c.requestLocationUpdates(this.f20497b, this.f20496a, Looper.getMainLooper()).addOnSuccessListener(new OnSuccessListener<Void>() { // from class: com.huawei.openalliance.ad.utils.bn.3
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r2) {
                hw.b("LocationUtils", "loc_tag requestLocationUpdates onSuccess");
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.openalliance.ad.utils.bn.2
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                hw.d("LocationUtils", "loc_tag requestLocationUpdates onFailure");
                bn.this.d.a();
                bn.this.e = true;
            }
        });
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.bn.4
            @Override // java.lang.Runnable
            public void run() {
                bn.this.b();
            }
        }, 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.e) {
            return;
        }
        try {
            this.f20498c.removeLocationUpdates(this.f20496a).addOnSuccessListener(new OnSuccessListener<Void>() { // from class: com.huawei.openalliance.ad.utils.bn.6
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Void r2) {
                    hw.a("LocationUtils", "loc_tag removeLocationUpdates onSuccess");
                    bn.this.e = true;
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.openalliance.ad.utils.bn.5
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    hw.a("LocationUtils", "loc_tag removeLocationUpdates onFailure:%s", exc.getClass().getSimpleName());
                    bn.this.e = false;
                }
            });
        } catch (Throwable th) {
            hw.c("LocationUtils", "loc_tag removeLocationUpdates encounter exception:" + th.getClass().getSimpleName());
        }
    }

    public bn(Context context, final a aVar) {
        if (context == null || aVar == null) {
            return;
        }
        this.d = aVar;
        this.f20498c = LocationServices.getFusedLocationProviderClient(context);
        LocationRequest locationRequest = new LocationRequest();
        this.f20497b = locationRequest;
        locationRequest.setPriority(100);
        this.f20497b.setNumUpdates(1);
        this.f20497b.setInterval(5000L);
        this.f20496a = new LocationCallback() { // from class: com.huawei.openalliance.ad.utils.bn.1
            public void onLocationResult(LocationResult locationResult) {
                String str;
                hw.a("LocationUtils", "loc_tag getLocationByKit onLocationResult-callback");
                if (locationResult == null) {
                    str = "loc_tag getLocationByKit onLocationResult-callback is null";
                } else {
                    if (!bm.a(locationResult.getLocations())) {
                        Location location = (Location) locationResult.getLocations().get(0);
                        if (location != null) {
                            hw.a("LocationUtils", "loc_tag getLocationByKit onLocationResult-callback lat = %s, lon = %s", ds.a(String.valueOf(location.getLatitude())), ds.a(String.valueOf(location.getLongitude())));
                            aVar.a(location);
                        } else {
                            str = "loc_tag getLocationByKit onLocationResult-callback location is null";
                        }
                        bn.this.e = true;
                    }
                    str = "loc_tag getLocationByKit onLocationResult-callback getLocations() is wrong";
                }
                hw.c("LocationUtils", str);
                aVar.a();
                bn.this.e = true;
            }

            public void onLocationAvailability(LocationAvailability locationAvailability) {
                if (locationAvailability != null) {
                    hw.a("LocationUtils", "loc_tag onLocationResult onLocationAvailability isLocationAvailable: %s", Boolean.valueOf(locationAvailability.isLocationAvailable()));
                }
            }
        };
    }
}
