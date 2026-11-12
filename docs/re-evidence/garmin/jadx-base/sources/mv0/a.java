package mv0;

import android.location.Location;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e23.l;
import e23.p;
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
@v13.e(c = "com.garmin.android.apps.connectmobile.location.GCMLocationProvider$getCurrentLocationWithFusedClient$2", f = "GCMLocationProvider.kt", l = {173}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, t13.d<? super Location>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f121126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f121127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f121128e;

    /* JADX INFO: renamed from: mv0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2296a<TResult> implements OnCompleteListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j<Location> f121129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f121130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f121131c;

        /* JADX WARN: Multi-variable type inference failed */
        public C2296a(j<? super Location> jVar, b0 b0Var, String str) {
            this.f121129a = jVar;
            this.f121130b = b0Var;
            this.f121131c = str;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<Location> task) {
            Location result;
            task.getClass();
            int i14 = q.f128596b;
            boolean zIsSuccessful = task.isSuccessful();
            String str = this.f121131c;
            if (zIsSuccessful) {
                result = task.getResult();
                i2.f36769a.getClass();
                i2.a.a(a2.LOCATION, str + " - getCurrentLocation SUCCESS " + result);
            } else {
                a2 a2Var = a2.LOCATION;
                String str2 = str + " - getCurrentLocation ERROR " + task.getException();
                i2.f36769a.getClass();
                i2.a.e(a2Var, str2);
                result = null;
            }
            this.f121129a.resumeWith(result);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements l<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f121132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f121133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CancellationTokenSource f121134c;

        public b(b0 b0Var, String str, CancellationTokenSource cancellationTokenSource) {
            this.f121132a = b0Var;
            this.f121133b = str;
            this.f121134c = cancellationTokenSource;
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            a2 a2Var = a2.LOCATION;
            String strG = k.g(this.f121133b, " - getCurrentLocation TIMEOUT");
            i2.f36769a.getClass();
            i2.a.a(a2Var, strG);
            this.f121134c.cancel();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, int i14, String str, t13.d<? super a> dVar2) {
        super(2, dVar2);
        this.f121126c = dVar;
        this.f121127d = i14;
        this.f121128e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a aVar = new a(this.f121126c, this.f121127d, this.f121128e, dVar);
        aVar.f121125b = obj;
        return aVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Location> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var = (b0) this.f121125b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121124a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        this.f121125b = b0Var;
        this.f121124a = 1;
        o53.k kVar = new o53.k(u13.f.b(this), 1);
        kVar.q();
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this.f121126c.f121149a);
        fusedLocationProviderClient.getClass();
        Task<Location> currentLocation = fusedLocationProviderClient.getCurrentLocation(this.f121127d, cancellationTokenSource.getToken());
        String str = this.f121128e;
        currentLocation.addOnCompleteListener(new C2296a(kVar, b0Var, str));
        kVar.r(new b(b0Var, str, cancellationTokenSource));
        Object objP = kVar.p();
        return objP == aVar ? aVar : objP;
    }
}
