package qw0;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Looper;
import c22.c1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lqw0/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "callerTag", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f148296j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f148297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f148299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FusedLocationProviderClient f148300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PendingIntent f148301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f148302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f148303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LocationRequest f148304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LocationManager f148305i;

    /* JADX INFO: renamed from: qw0.b$b, reason: collision with other inner class name */
    public interface InterfaceC2796b {
        void onLocationChanged(Location location);
    }

    private b(Context context, String str) {
        this.f148297a = context;
        this.f148298b = str;
        this.f148299c = Boolean.TRUE;
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        systemService.getClass();
        this.f148305i = (LocationManager) systemService;
        if (!c22.h.c(context) || ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f()) {
            this.f148299c = Boolean.FALSE;
        } else {
            this.f148300d = LocationServices.getFusedLocationProviderClient(context);
        }
        LocationRequest locationRequestCreate = LocationRequest.create();
        locationRequestCreate.getClass();
        this.f148304h = locationRequestCreate;
    }

    public static LocationRequest e(g gVar, long j8, float f14) {
        LocationRequest locationRequestCreate = LocationRequest.create();
        locationRequestCreate.getClass();
        locationRequestCreate.setPriority(gVar.f148314a);
        if (j8 != -1) {
            locationRequestCreate.setInterval(j8);
        }
        if (f14 > 0.0f) {
            locationRequestCreate.setSmallestDisplacement(f14);
        }
        return locationRequestCreate;
    }

    public final void a(String str) {
        String str2 = this.f148298b;
        LocationManager locationManager = this.f148305i;
        if (locationManager == null) {
            return;
        }
        try {
            PendingIntent pendingIntent = this.f148301e;
            if (pendingIntent != null) {
                locationManager.removeUpdates(pendingIntent);
            }
            d dVar = this.f148303g;
            if (dVar != null) {
                locationManager.removeUpdates(dVar);
                this.f148303g = null;
            }
            i2.f36769a.getClass();
            i2.a.b(a2.LOCATION, "GCMBackgroundLocationClient", str2 + " LocationManager.removeUpdates() -> provider=" + str + ".");
        } catch (SecurityException e4) {
            i2.f36769a.getClass();
            i2.a.f(a2.LOCATION, "GCMBackgroundLocationClient", str2 + " Failed to disable location provider. " + e4);
        }
    }

    public final void b() {
        FusedLocationProviderClient fusedLocationProviderClient = this.f148300d;
        if (fusedLocationProviderClient != null) {
            Context context = this.f148297a;
            if (c22.h.c(context)) {
                if (c22.h.c(context)) {
                    PendingIntent pendingIntent = this.f148301e;
                    String str = this.f148298b;
                    if (pendingIntent != null) {
                        fusedLocationProviderClient.removeLocationUpdates(pendingIntent);
                        a2 a2Var = a2.LOCATION;
                        String strG = tn.k.g(str, " FusedLocationProviderClient.removeLocationUpdates() with pending intent.");
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "GCMBackgroundLocationClient", strG);
                    }
                    c cVar = this.f148302f;
                    if (cVar != null) {
                        fusedLocationProviderClient.removeLocationUpdates(cVar);
                        this.f148302f = null;
                        a2 a2Var2 = a2.LOCATION;
                        String strG2 = tn.k.g(str, " FusedLocationProviderClient.removeLocationUpdates() with location callback.");
                        i2.f36769a.getClass();
                        i2.a.b(a2Var2, "GCMBackgroundLocationClient", strG2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        a("gps");
        a("network");
    }

    @SuppressLint({"MissingPermission"})
    public final void c() {
        if (e.a()) {
            Context context = this.f148297a;
            if (c1.a(context) || c1.b(context)) {
                PendingIntent pendingIntent = this.f148301e;
                String str = this.f148298b;
                FusedLocationProviderClient fusedLocationProviderClient = this.f148300d;
                if (pendingIntent != null) {
                    if (fusedLocationProviderClient != null) {
                        fusedLocationProviderClient.requestLocationUpdates(this.f148304h, pendingIntent);
                    }
                    a2 a2Var = a2.LOCATION;
                    String str2 = str + " FusedLocationProviderClient.requestLocationUpdates() with pending intent. " + this.f148304h;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "GCMBackgroundLocationClient", str2);
                }
                c cVar = this.f148302f;
                if (cVar != null) {
                    if (fusedLocationProviderClient != null) {
                        fusedLocationProviderClient.requestLocationUpdates(this.f148304h, cVar, Looper.myLooper());
                    }
                    a2 a2Var2 = a2.LOCATION;
                    String str3 = str + " FusedLocationProviderClient.requestLocationUpdates() with location callback. " + this.f148304h;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "GCMBackgroundLocationClient", str3);
                }
            }
        }
    }

    public final void d(String str) {
        LocationManager locationManager;
        boolean zIsProviderEnabled;
        String str2;
        String str3 = this.f148298b;
        if (!e.a() || (locationManager = this.f148305i) == null) {
            return;
        }
        try {
            zIsProviderEnabled = locationManager.isProviderEnabled(str);
        } catch (Exception e4) {
            i2.f36769a.getClass();
            i2.a.f(a2.LOCATION, "GCMBackgroundLocationClient", str3 + " isLocationProviderEnabled " + e4);
            zIsProviderEnabled = false;
        }
        if (zIsProviderEnabled) {
            try {
                PendingIntent pendingIntent = this.f148301e;
                if (pendingIntent != null) {
                    str2 = str;
                    locationManager.requestLocationUpdates(str2, this.f148304h.getInterval(), this.f148304h.getSmallestDisplacement(), pendingIntent);
                } else {
                    str2 = str;
                }
                d dVar = this.f148303g;
                if (dVar != null) {
                    locationManager.requestLocationUpdates(str2, this.f148304h.getInterval(), this.f148304h.getSmallestDisplacement(), dVar);
                }
                i2.f36769a.getClass();
                i2.a.b(a2.LOCATION, "GCMBackgroundLocationClient", str3 + " LocationManager.requestLocationUpdates() -> provider=" + str2 + ".");
            } catch (SecurityException e14) {
                i2.f36769a.getClass();
                i2.a.f(a2.LOCATION, "GCMBackgroundLocationClient", str3 + " Failed to enable location provider. " + e14);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lqw0/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_SINGLE_SHOT_LOCATION_ACCURACY_CRITERIA", "I", "MINIMUM_ACCURACY_IN_METERS", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void a(Context context, String str, InterfaceC2796b interfaceC2796b) {
            FusedLocationProviderClient fusedLocationProviderClient;
            context.getClass();
            str.getClass();
            Location location = null;
            b bVar = new b(context, str, 0 == true ? 1 : 0);
            a2 a2Var = a2.LOCATION;
            String str2 = bVar.f148298b;
            String strG = tn.k.g(str2, " getLastKnownLocation: request location.");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GCMBackgroundLocationClient", strG);
            if (e.a() && (fusedLocationProviderClient = bVar.f148300d) != null && fusedLocationProviderClient.getLastLocation() != null) {
                Task<Location> lastLocation = fusedLocationProviderClient.getLastLocation();
                if (lastLocation != null) {
                    lastLocation.addOnSuccessListener(new ps2.d(new ph1.d(19, interfaceC2796b, bVar), 29));
                    return;
                }
                return;
            }
            LocationManager locationManager = bVar.f148305i;
            if (locationManager != null) {
                List<String> providers = locationManager.getProviders(true);
                if (providers == null) {
                    providers = j0.f134944a;
                }
                Iterator<String> it = providers.iterator();
                while (it.hasNext()) {
                    try {
                        Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
                        if (lastKnownLocation != null && (location == null || lastKnownLocation.getElapsedRealtimeNanos() > location.getElapsedRealtimeNanos() + 11000000000L || (lastKnownLocation.hasAccuracy() && (!location.hasAccuracy() || lastKnownLocation.getAccuracy() < location.getAccuracy())))) {
                            location = lastKnownLocation;
                        }
                    } catch (SecurityException e4) {
                        i2.f36769a.getClass();
                        i2.a.f(a2.LOCATION, "GCMBackgroundLocationClient", str2 + " Failed to get last location. " + e4);
                    }
                }
                interfaceC2796b.onLocationChanged(location);
                i2.f36769a.getClass();
                i2.a.b(a2.LOCATION, "GCMBackgroundLocationClient", str2 + "  getLastKnownLocation: ANDROID Client - new location: " + location + ".");
            }
        }

        private a() {
        }
    }

    public /* synthetic */ b(Context context, String str, p005kotlin.jvm.internal.j jVar) {
        this(context, str);
    }
}
