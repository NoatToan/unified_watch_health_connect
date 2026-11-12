package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public class j4q {
    public static j4q d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f22419b;
    public final a c = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f22420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f22421b;
        public long c;
        public long d;
        public long e;
        public long f;
    }

    @VisibleForTesting
    public j4q(Context context, LocationManager locationManager) {
        this.f22418a = context;
        this.f22419b = locationManager;
    }

    public static j4q a(Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new j4q(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return d;
    }

    @SuppressLint({"MissingPermission"})
    public final Location b() {
        Location locationC = trh.b(this.f22418a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = trh.b(this.f22418a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final Location c(String str) {
        try {
            if (this.f22419b.isProviderEnabled(str)) {
                return this.f22419b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean d() {
        a aVar = this.c;
        if (e()) {
            return aVar.f22420a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f22420a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    public final boolean e() {
        return this.c.f > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long j;
        long j2;
        a aVar = this.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        i4q i4qVarB = i4q.b();
        i4qVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = i4qVarB.f20785a;
        i4qVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = i4qVarB.c == 1;
        long j4 = i4qVarB.f20786b;
        long j5 = i4qVarB.f20785a;
        i4qVarB.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = i4qVarB.f20786b;
        if (j4 == -1 || j5 == -1) {
            j = 43200000 + jCurrentTimeMillis;
        } else {
            if (jCurrentTimeMillis > j5) {
                j2 = j6;
            } else {
                j2 = jCurrentTimeMillis > j4 ? j5 : j4;
            }
            j = j2 + 60000;
        }
        aVar.f22420a = z;
        aVar.f22421b = j3;
        aVar.c = j4;
        aVar.d = j5;
        aVar.e = j6;
        aVar.f = j;
    }
}
