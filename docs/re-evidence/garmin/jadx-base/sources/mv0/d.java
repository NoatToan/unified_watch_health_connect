package mv0;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import o13.r;
import o53.j2;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmv0/d;", "Lmv0/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "preferFusedLocation", "<init>", "(Landroid/content/Context;Z)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f121149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f121150b;

    public d(Context context, boolean z14) {
        context.getClass();
        this.f121149a = context;
        this.f121150b = z14;
    }

    @Override // mv0.e
    public final boolean a(String str) {
        LocationManager locationManager = (LocationManager) this.f121149a.getSystemService(FirebaseAnalytics.Param.LOCATION);
        boolean zIsLocationEnabled = false;
        if (locationManager == null) {
            return false;
        }
        try {
            int i14 = f7.b.f69398a;
            zIsLocationEnabled = locationManager.isLocationEnabled();
        } catch (Exception e4) {
            i2.f36769a.getClass();
            i2.a.e(a2.LOCATION, str + " - isLocationServiceEnabled ERROR " + e4);
        }
        i2.f36769a.getClass();
        i2.a.a(a2.LOCATION, str + " isLocationServiceEnabled " + zIsLocationEnabled);
        return zIsLocationEnabled;
    }

    @Override // mv0.e
    public final boolean b(String str) {
        Context context = this.f121149a;
        boolean z14 = (a7.b.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) || (a7.b.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0);
        i2.f36769a.getClass();
        i2.a.a(a2.LOCATION, str + " isLocationPermissionGranted " + z14);
        return z14;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mv0.e
    public final Object c(String str, v13.c cVar) {
        c cVar2;
        String str2;
        Location lastKnownLocation;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f121148d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f121148d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.f121146b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f121148d;
        try {
            if (i15 == 0) {
                r.b(objJ);
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                Context context = this.f121149a;
                boolean z14 = googleApiAvailability.isGooglePlayServicesAvailable(context) == 0;
                a2 a2Var = a2.LOCATION;
                i2.f36769a.getClass();
                i2.a.a(a2Var, str + " - getLastKnownLocation googlePlayServicesAvailable[" + z14 + "]");
                if (z14) {
                    FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
                    fusedLocationProviderClient.getClass();
                    Task<Location> lastLocation = fusedLocationProviderClient.getLastLocation();
                    lastLocation.getClass();
                    cVar2.f121145a = str;
                    cVar2.f121148d = 1;
                    objJ = xy2.b.j(lastLocation, cVar2);
                    if (objJ == aVar) {
                        return aVar;
                    }
                } else {
                    LocationManager locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION);
                    if (locationManager == null) {
                        return null;
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        str2 = "fused";
                    } else {
                        str2 = "gps";
                        if (!locationManager.isProviderEnabled("gps")) {
                            str2 = "network";
                        }
                    }
                    i2.a.a(a2Var, str + " - getLastKnownLocation provider[" + str2 + "]");
                    try {
                        lastKnownLocation = locationManager.getLastKnownLocation(str2);
                        i2.a.a(a2Var, str + " - getLastKnownLocation SUCCESS " + lastKnownLocation);
                    } catch (Exception e4) {
                        i2.f36769a.getClass();
                        i2.a.e(a2.LOCATION, str + " - getLastKnownLocation ERROR " + e4);
                        return null;
                    }
                }
                return lastKnownLocation;
            }
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = cVar2.f121145a;
            r.b(objJ);
            lastKnownLocation = (Location) objJ;
            i2.f36769a.getClass();
            i2.a.a(a2.LOCATION, str + " - getLastKnownLocation SUCCESS " + lastKnownLocation);
            return lastKnownLocation;
        } catch (Exception e14) {
            i2.f36769a.getClass();
            i2.a.e(a2.LOCATION, str + " - getLastKnownLocation ERROR " + e14);
            return null;
        }
    }

    @Override // mv0.e
    public final Object d(String str, int i14, long j8, t13.d<? super Location> dVar) {
        boolean z14 = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f121149a) == 0;
        a2 a2Var = a2.LOCATION;
        i2.f36769a.getClass();
        i2.a.a(a2Var, str + " - getCurrentLocation googlePlayServicesAvailable[" + z14 + "]");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(" - getCurrentLocation preferFusedClient[");
        boolean z15 = this.f121150b;
        sb3.append(z15);
        sb3.append("]");
        i2.a.a(a2Var, sb3.toString());
        return (z15 && z14) ? j2.c(j8, new a(this, i14, str, null), dVar) : j2.c(j8, new b(this, str, null), dVar);
    }
}
