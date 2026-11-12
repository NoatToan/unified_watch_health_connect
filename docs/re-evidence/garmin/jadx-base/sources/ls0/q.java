package ls0;

import android.location.Location;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import o53.c2;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.a1;
import p13.c1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lls0/q;", "Landroidx/lifecycle/u1;", "", "returnFlight", "", "destinationIndex", "Lyr0/i;", "flight", "<init>", "(ZILyr0/i;)V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f114744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yr0.i f114746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uo0.b f114747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0<g3<List<yr0.n>>> f114748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0 f114749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c2 f114750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f114751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yr0.i f114752i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripFlightViewModel$getLocationSuggestions$1", f = "TripFlightViewModel.kt", l = {50}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f114753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f114754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f114755c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f114757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Location f114758f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Location location, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f114757e = str;
            this.f114758f = location;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = q.this.new b(this.f114757e, this.f114758f, dVar);
            bVar.f114755c = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean zD;
            Object objB;
            vo0.f fVarC;
            yr0.n nVar;
            String utcOffset;
            o53.b0 b0Var = (o53.b0) this.f114755c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f114754b;
            q qVar = q.this;
            if (i14 == 0) {
                o13.r.b(obj);
                zD = c22.b0.d();
                uo0.b bVar = qVar.f114747d;
                Location location = this.f114758f;
                double latitude = location != null ? location.getLatitude() : 0.0d;
                double longitude = location != null ? location.getLongitude() : 0.0d;
                Set setB = a1.b(uo0.h.TIME_ZONE);
                if (zD) {
                    setB = c1.i(setB, uo0.h.DETAILS);
                }
                Integer num = new Integer(100);
                String strX4 = q.x4(qVar);
                this.f114755c = b0Var;
                this.f114753a = zD;
                this.f114754b = 1;
                objB = bVar.b(this.f114757e, latitude, longitude, setB, num, strX4, this);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z14 = this.f114753a;
                o13.r.b(obj);
                zD = z14;
                objB = obj;
            }
            v2 v2Var = (v2) objB;
            if (v2Var instanceof v2.b) {
                if (zD) {
                    to0.b bVar2 = to0.b.f165839a;
                    vo0.f fVar = (vo0.f) ((v2.b) v2Var).f47386a;
                    bVar2.getClass();
                    fVarC = to0.b.c(fVar);
                } else {
                    fVarC = (vo0.f) ((v2.b) v2Var).f47386a;
                }
                List<vo0.e> listB = fVarC.b();
                ArrayList<vo0.e> arrayList = new ArrayList();
                for (Object obj2 : listB) {
                    to0.b.f165839a.getClass();
                    if (to0.b.a((vo0.e) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (vo0.e eVar : arrayList) {
                    String title = eVar.getTitle();
                    String str = "";
                    if (title == null) {
                        title = "";
                    }
                    vo0.d dVar = eVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.TIME_ZONE java.lang.String();
                    if (dVar != null && (utcOffset = dVar.getUtcOffset()) != null) {
                        str = utcOffset;
                    }
                    if (title.length() <= 0 || str.length() <= 0) {
                        nVar = null;
                    } else {
                        to0.b.f165839a.getClass();
                        if (to0.b.a(eVar)) {
                            nVar = new yr0.n(title, str);
                        } else {
                            nVar = null;
                        }
                    }
                    if (nVar != null) {
                        arrayList2.add(nVar);
                    }
                }
                if (o53.c0.g(b0Var)) {
                    y0<g3<List<yr0.n>>> y0Var = qVar.f114748e;
                    g3.f35298f.getClass();
                    y0Var.j(g3.a.d(arrayList2));
                }
            } else if (o53.c0.g(b0Var)) {
                qVar.f114748e.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public q(boolean z14, int i14, yr0.i iVar) {
        iVar.getClass();
        this.f114744a = z14;
        this.f114745b = i14;
        this.f114746c = iVar;
        this.f114747d = (uo0.b) KoinJavaComponent.get$default(uo0.b.class, null, null, 6, null);
        y0<g3<List<yr0.n>>> y0Var = new y0<>();
        this.f114748e = y0Var;
        this.f114749f = y0Var;
        this.f114751h = new p();
        this.f114752i = new yr0.i(iVar.f198993a, iVar.f198994b, iVar.f198995c, iVar.f198996d, iVar.f198997e, iVar.f198998f, iVar.f198999g, iVar.f199000h, iVar.f199001i, iVar.f199002j);
    }

    public static final String x4(q qVar) {
        qVar.getClass();
        String lowerCase = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).b().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return d53.u.v(lowerCase, "_", "-", false);
    }

    public final void A4() {
        c2 c2Var;
        c2 c2Var2 = this.f114750g;
        if (c2Var2 != null && c2Var2.isActive() && (c2Var = this.f114750g) != null) {
            c2Var.c(null);
        }
        this.f114748e.m(g3.a.e(g3.f35298f));
    }

    public final void y4(String str, Location location) {
        c2 c2Var;
        str.getClass();
        c2 c2Var2 = this.f114750g;
        if (c2Var2 != null && c2Var2.isActive() && (c2Var = this.f114750g) != null) {
            c2Var.c(null);
        }
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        this.f114750g = ge1.b.T(aVarA, x53.b.f189152a, null, new b(str, location, null), 2);
    }

    public final boolean z4() {
        int i14;
        return !this.f114744a && 1 <= (i14 = this.f114745b) && i14 < 5;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lls0/q$a;", "", "<init>", "()V", "", "STARTING_DESTINATION_INDEX", "I", "MAX_MULTI_CITY_DESTINATION_COUNT", "", "DEFAULT_LATITUDE", "D", "DEFAULT_LONGITUDE", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
