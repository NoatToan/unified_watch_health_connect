package mv0;

import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.os.SystemClock;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import e23.l;
import e23.p;
import java.util.concurrent.Executor;
import o13.q;
import o13.r;
import o53.b0;
import o53.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import tn.k;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/location/Location;", "<anonymous>", "(Lo53/b0;)Landroid/location/Location;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.location.GCMLocationProvider$getCurrentLocationWithLocationManager$2", f = "GCMLocationProvider.kt", l = {173}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Location>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f121137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f121138d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements k7.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f121139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f121140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j<Location> f121141c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(b0 b0Var, String str, j<? super Location> jVar) {
            this.f121139a = b0Var;
            this.f121140b = str;
            this.f121141c = jVar;
        }

        @Override // k7.b
        public final void accept(Object obj) {
            Location location = (Location) obj;
            a2 a2Var = a2.LOCATION;
            String str = this.f121140b + " - getCurrentLocation SUCCESS " + location;
            i2.f36769a.getClass();
            i2.a.a(a2Var, str);
            int i14 = q.f128596b;
            this.f121141c.resumeWith(location);
        }
    }

    /* JADX INFO: renamed from: mv0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2297b implements l<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f121142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f121143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h7.d f121144c;

        public C2297b(b0 b0Var, String str, h7.d dVar) {
            this.f121142a = b0Var;
            this.f121143b = str;
            this.f121144c = dVar;
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            a2 a2Var = a2.LOCATION;
            String strG = k.g(this.f121143b, " - getCurrentLocation TIMEOUT");
            i2.f36769a.getClass();
            i2.a.a(a2Var, strG);
            this.f121144c.a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, String str, t13.d<? super b> dVar2) {
        super(2, dVar2);
        this.f121137c = dVar;
        this.f121138d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f121137c, this.f121138d, dVar);
        bVar.f121136b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Location> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        CancellationSignal cancellationSignal;
        b0 b0Var = (b0) this.f121136b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121135a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        d dVar = this.f121137c;
        String str2 = this.f121138d;
        this.f121136b = b0Var;
        this.f121135a = 1;
        o53.k kVar = new o53.k(u13.f.b(this), 1);
        kVar.q();
        h7.d dVar2 = new h7.d();
        LocationManager locationManager = (LocationManager) dVar.f121149a.getSystemService(FirebaseAnalytics.Param.LOCATION);
        if (locationManager == null) {
            int i15 = q.f128596b;
            kVar.resumeWith(null);
        } else {
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 31) {
                str = "fused";
            } else {
                str = (locationManager.isProviderEnabled("gps") && dVar.f121149a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) ? "gps" : "network";
            }
            String str3 = str;
            a2 a2Var = a2.LOCATION;
            String strH = com.nimbusds.jose.shaded.gson.internal.a.h(str2, " - getCurrentLocation provider[", str3, "]");
            i2.f36769a.getClass();
            i2.a.a(a2Var, strH);
            Executor mainExecutor = a7.b.getMainExecutor(dVar.f121149a);
            a aVar2 = new a(b0Var, str2, kVar);
            int i17 = f7.b.f69398a;
            synchronized (dVar2) {
                try {
                    if (dVar2.f82324c == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        dVar2.f82324c = cancellationSignal2;
                        if (dVar2.f82322a) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = dVar2.f82324c;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (i16 >= 30) {
                f7.b.a.a(locationManager, str3, cancellationSignal, mainExecutor, aVar2);
            } else {
                if (cancellationSignal != null) {
                    cancellationSignal.throwIfCanceled();
                }
                Location lastKnownLocation = locationManager.getLastKnownLocation(str3);
                if (lastKnownLocation == null || SystemClock.elapsedRealtime() - (lastKnownLocation.getElapsedRealtimeNanos() / 1000000) >= AbstractComponentTracker.LINGERING_TIMEOUT) {
                    f7.b.C1430b c1430b = new f7.b.C1430b(locationManager, mainExecutor, aVar2);
                    locationManager.requestLocationUpdates(str3, 0L, 0.0f, c1430b, Looper.getMainLooper());
                    if (cancellationSignal != null) {
                        cancellationSignal.setOnCancelListener(new f7.a(c1430b, 0));
                    }
                    synchronized (c1430b) {
                        try {
                            if (!c1430b.f69403e) {
                                eh2.b bVar = new eh2.b(c1430b, 3);
                                c1430b.f69404f = bVar;
                                c1430b.f69401c.postDelayed(bVar, 30000L);
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                } else {
                    mainExecutor.execute(new df.d(6, aVar2, lastKnownLocation));
                }
            }
            kVar.r(new C2297b(b0Var, str2, dVar2));
        }
        Object objP = kVar.p();
        return objP == aVar ? aVar : objP;
    }
}
