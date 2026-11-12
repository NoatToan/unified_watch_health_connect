package f7;

import a73.o;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import df.d;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f69398a = 0;

    public static class a {
        private a() {
        }

        public static void a(LocationManager locationManager, String str, CancellationSignal cancellationSignal, Executor executor, mv0.b.a aVar) {
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new o(aVar, 3));
        }
    }

    /* JADX INFO: renamed from: f7.b$b, reason: collision with other inner class name */
    public static final class C1430b implements LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocationManager f69399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f69400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f69401c = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public k7.b<Location> f69402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f69403e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public eh2.b f69404f;

        public C1430b(LocationManager locationManager, Executor executor, k7.b<Location> bVar) {
            this.f69399a = locationManager;
            this.f69400b = executor;
            this.f69402d = bVar;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            synchronized (this) {
                try {
                    if (this.f69403e) {
                        return;
                    }
                    this.f69403e = true;
                    this.f69400b.execute(new d(7, this.f69402d, location));
                    this.f69402d = null;
                    this.f69399a.removeUpdates(this);
                    eh2.b bVar = this.f69404f;
                    if (bVar != null) {
                        this.f69401c.removeCallbacks(bVar);
                        this.f69404f = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i14, Bundle bundle) {
        }
    }

    static {
        new WeakHashMap();
    }

    private b() {
    }
}
