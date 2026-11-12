package pj1;

import android.annotation.SuppressLint;
import android.location.Location;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpj1/m;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f137942f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uo0.b f137943a = (uo0.b) KoinJavaComponent.get$default(uo0.b.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<g3<Location>> f137944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<g3<vo0.e>> f137945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f137946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tj1.n f137947e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.SafetyFeaturesLocationViewModel$requestCurrentLocation$1", f = "SafetyFeaturesLocationViewModel.kt", l = {129}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f137948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f137949b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = m.this.new b(dVar);
            bVar.f137949b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f137949b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f137948a;
            if (i14 == 0) {
                o13.r.b(obj);
                mv0.e eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                this.f137949b = b0Var;
                this.f137948a = 1;
                obj = eVar.d("SafetyFeaturesLocationViewModel", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            Location location = (Location) obj;
            m mVar = m.this;
            if (location != null) {
                i2.f36769a.getClass();
                i2.a.b(a2.SAFETY_FEATURES, "SafetyFeaturesLocationViewModel", "[getCurrentLocation] GPS location=" + location);
                y0<g3<Location>> y0Var = mVar.f137944b;
                g3.f35298f.getClass();
                y0Var.j(g3.a.d(location));
            } else {
                a2 a2Var = a2.SAFETY_FEATURES;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SafetyFeaturesLocationViewModel", "[getCurrentLocation] couldn't get GPS location");
                mVar.f137944b.j(g3.a.a(g3.f35298f, "LOCATION_NOT_AVAILABLE", null, null, null, 14));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public m() {
        new y0();
        this.f137944b = new y0<>();
        y0<g3<vo0.e>> y0Var = new y0<>();
        this.f137945c = y0Var;
        this.f137946d = y0Var;
        this.f137947e = tj1.n.a.a(tj1.n.f165155b);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:14:0x0063  */
    /* JADX WARN: Code duplicated, block: B:16:0x0074  */
    /* JADX WARN: Code duplicated, block: B:18:0x0085  */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x002f  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        if (g22.n.d(r5.getCountryName()) != false) goto L20;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:10:0x0032, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean x4(m mVar, vo0.e eVar, boolean z14) {
        vo0.a address;
        vo0.a address2;
        vo0.a address3;
        vo0.a address4;
        mVar.getClass();
        if (eVar.getAddress() != null) {
            vo0.a address5 = eVar.getAddress();
            address5.getClass();
            if (g22.n.d(address5.getCity())) {
                if (!z14) {
                    a2 a2Var = a2.SAFETY_FEATURES;
                    String str = "[includeLocation] geofenceSearchItem with address " + eVar.getAddress() + " has correct information for regular assistance";
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "SafetyFeaturesLocationViewModel", str);
                    return true;
                }
                address2 = eVar.getAddress();
                address2.getClass();
                if (!g22.n.d(address2.getPostalCode())) {
                    address3 = eVar.getAddress();
                    address3.getClass();
                    if (!g22.n.d(address3.getStreet())) {
                        address4 = eVar.getAddress();
                        address4.getClass();
                        if (!g22.n.d(address4.getHouseNumber())) {
                            vo0.a address6 = eVar.getAddress();
                            address6.getClass();
                        }
                    }
                }
                a2 a2Var2 = a2.SAFETY_FEATURES;
                String str2 = "[includeLocation] geofenceSearchItem with address " + eVar.getAddress() + " has correct information for Assistance Plus";
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "SafetyFeaturesLocationViewModel", str2);
                return true;
            }
            address = eVar.getAddress();
            address.getClass();
            if (g22.n.d(address.getState())) {
                if (!z14) {
                    a2 a2Var3 = a2.SAFETY_FEATURES;
                    String str3 = "[includeLocation] geofenceSearchItem with address " + eVar.getAddress() + " has correct information for regular assistance";
                    i2.f36769a.getClass();
                    i2.a.b(a2Var3, "SafetyFeaturesLocationViewModel", str3);
                    return true;
                }
                address2 = eVar.getAddress();
                address2.getClass();
                if (!g22.n.d(address2.getPostalCode())) {
                    address3 = eVar.getAddress();
                    address3.getClass();
                    if (!g22.n.d(address3.getStreet())) {
                        address4 = eVar.getAddress();
                        address4.getClass();
                        if (!g22.n.d(address4.getHouseNumber())) {
                            vo0.a address7 = eVar.getAddress();
                            address7.getClass();
                        }
                    }
                }
                a2 a2Var4 = a2.SAFETY_FEATURES;
                String str4 = "[includeLocation] geofenceSearchItem with address " + eVar.getAddress() + " has correct information for Assistance Plus";
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "SafetyFeaturesLocationViewModel", str4);
                return true;
            }
        } else {
            address = eVar.getAddress();
            address.getClass();
            if (g22.n.d(address.getState())) {
                if (!z14) {
                    a2 a2Var5 = a2.SAFETY_FEATURES;
                    String str5 = "[includeLocation] geofenceSearchItem with address " + eVar.getAddress() + " has correct information for regular assistance";
                    i2.f36769a.getClass();
                    i2.a.b(a2Var5, "SafetyFeaturesLocationViewModel", str5);
                    return true;
                }
                address2 = eVar.getAddress();
                address2.getClass();
                if (!g22.n.d(address2.getPostalCode())) {
                    address3 = eVar.getAddress();
                    address3.getClass();
                    if (!g22.n.d(address3.getStreet())) {
                        address4 = eVar.getAddress();
                        address4.getClass();
                        if (!g22.n.d(address4.getHouseNumber())) {
                            vo0.a address8 = eVar.getAddress();
                            address8.getClass();
                        }
                    }
                }
                a2 a2Var6 = a2.SAFETY_FEATURES;
                String str6 = "[includeLocation] geofenceSearchItem with address " + eVar.getAddress() + " has correct information for Assistance Plus";
                i2.f36769a.getClass();
                i2.a.b(a2Var6, "SafetyFeaturesLocationViewModel", str6);
                return true;
            }
        }
        a2 a2Var7 = a2.SAFETY_FEATURES;
        String str7 = "[includeLocation] geofenceSearchItem with address " + eVar.getAddress() + " didn't have correct information for the current type of assistance.";
        i2.f36769a.getClass();
        i2.a.b(a2Var7, "SafetyFeaturesLocationViewModel", str7);
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public final void y4(boolean z14) {
        boolean zK;
        a2 a2Var = a2.SAFETY_FEATURES;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "SafetyFeaturesLocationViewModel", "[requestCurrentLocation] request current location started");
        g3.a aVar = g3.f35298f;
        g3<Location> g3VarC = g3.a.c(aVar);
        y0<g3<Location>> y0Var = this.f137944b;
        y0Var.j(g3VarC);
        if (z14) {
            j22.b bVar = j22.b.f96736a;
            j22.a[] aVarArr = {j22.a.f96719h};
            bVar.getClass();
            zK = j22.b.k(aVarArr);
        } else {
            j22.b bVar2 = j22.b.f96736a;
            j22.a[] aVarArr2 = {j22.a.f96718g};
            bVar2.getClass();
            zK = j22.b.k(aVarArr2);
        }
        if (!zK) {
            i2.a.b(a2Var, "SafetyFeaturesLocationViewModel", "[requestCurrentLocation] location permission not granted");
            y0Var.j(g3.a.a(aVar, "NEED_LOCATION_PERMISSION", null, null, null, 14));
            return;
        }
        i2.a.b(a2Var, "SafetyFeaturesLocationViewModel", "[requestCurrentLocation] location permission is already granted");
        if (((mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null)).a("SafetyFeaturesLocationViewModel")) {
            i2.a.b(a2Var, "SafetyFeaturesLocationViewModel", "[requestCurrentLocation] location is already enabled");
            ge1.b.T(v1.a(this), null, null, new b(null), 3);
        } else {
            i2.a.b(a2Var, "SafetyFeaturesLocationViewModel", "[requestCurrentLocation] location is disabled");
            y0Var.j(g3.a.a(aVar, "LOCATION_SERVICES_OFF", null, null, null, 14));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lpj1/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "NEED_LOCATION_PERMISSION", "LOCATION_SERVICES_OFF", "LOCATION_NOT_AVAILABLE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
