package com.garmin.android.apps.connectmobile.jet_lag.presentation.setup;

import android.content.Context;
import android.location.Location;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import f12.l;
import java.util.ArrayList;
import java.util.List;
import ls0.b0;
import o53.s0;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import yr0.f;
import yr0.j;
import yr0.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/e;", "Landroidx/lifecycle/u1;", "Lyr0/o;", "editedTrip", "", "initialNotEditedTrips", "<init>", "(Lyr0/o;Ljava/util/List;)V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f37102n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f37103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<o> f37104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zr0.a f37105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mv0.e f37106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f37107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f37108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f37109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Location f37110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<g3<List<o>>> f37111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0 f37112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<g3<Unit>> f37113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0<b> f37114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0<g3<o>> f37115m;

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    public e(o oVar, List<o> list) {
        ArrayList arrayList;
        list.getClass();
        this.f37103a = oVar;
        this.f37104b = list;
        j jVar = null;
        this.f37105c = (zr0.a) KoinJavaComponent.get$default(zr0.a.class, null, null, 6, null);
        this.f37106d = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
        if (oVar != null) {
            ns0.b.f127812a.getClass();
            List<j> listV = oVar.f199040e;
            if (listV != null) {
                listV = listV.size() != 1 ? h0.V(1, listV) : listV;
                listV = listV == null ? j0.f134944a : listV;
            }
            if (listV != null) {
                arrayList = new ArrayList(listV);
            } else {
                arrayList = new ArrayList();
            }
        } else {
            arrayList = new ArrayList();
        }
        this.f37107e = arrayList;
        if (oVar != null) {
            ns0.b.f127812a.getClass();
            List<j> list2 = oVar.f199040e;
            if (list2 != null && list2.size() != 1) {
                jVar = (j) h0.n0(list2);
            }
        }
        this.f37108f = jVar;
        this.f37109g = new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
        g3.f35298f.getClass();
        y0<g3<List<o>>> y0Var = new y0<>(g3.a.d(list));
        this.f37111i = y0Var;
        this.f37112j = y0Var;
        this.f37113k = new y0<>();
        this.f37114l = new y0<>();
        this.f37115m = new y0<>();
    }

    public final void A4() {
        a2 a2Var = a2.JET_LAG;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "TripSetupViewModel", "[locationNotAllowedByUser] location not allowed by user");
        C4(null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005c  */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    public final void B4(boolean z14) {
        b cVar;
        b bVar;
        a2 a2Var = a2.JET_LAG;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("[requestCurrentLocation] started with forcedMode=", z14);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "TripSetupViewModel", strH);
        this.f37110h = null;
        y0<g3<Unit>> y0Var = this.f37113k;
        y0Var.m(null);
        y0<b> y0Var2 = this.f37114l;
        y0Var2.m(null);
        if (y4()) {
            i2.a.b(a2Var, "TripSetupViewModel", "[getLocationStatus] location permission is granted");
            if (this.f37106d.a("TripSetupViewModel")) {
                i2.a.b(a2Var, "TripSetupViewModel", "[getLocationStatus] location is enabled");
                bVar = b.a.f37095a;
            } else {
                i2.a.b(a2Var, "TripSetupViewModel", "[getLocationStatus] location is disabled");
                cVar = new b.C0665b(z14);
            }
            y0Var2.j(bVar);
            if (s.g(bVar, b.a.f37095a)) {
                i2.a.b(a2Var, "TripSetupViewModel", "[requestCurrentLocation] get current location");
                y0Var.j(g3.a.c(g3.f35298f));
                i2.a.b(a2Var, "TripSetupViewModel", "[getCurrentLocation] request current location started");
                w9.a aVarA = v1.a(this);
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new b0(this, null), 2);
            }
        }
        i2.a.b(a2Var, "TripSetupViewModel", "[getLocationStatus] location permission is not granted");
        cVar = new b.c(z14);
        bVar = cVar;
        y0Var2.j(bVar);
        if (s.g(bVar, b.a.f37095a)) {
            i2.a.b(a2Var, "TripSetupViewModel", "[requestCurrentLocation] get current location");
            y0Var.j(g3.a.c(g3.f35298f));
            i2.a.b(a2Var, "TripSetupViewModel", "[getCurrentLocation] request current location started");
            w9.a aVarA2 = v1.a(this);
            x53.c cVar3 = s0.f129406a;
            ge1.b.T(aVarA2, x53.b.f189152a, null, new b0(this, null), 2);
        }
    }

    public final void C4(Location location) {
        i2.f36769a.getClass();
        i2.a.b(a2.JET_LAG, "TripSetupViewModel", "[updateCurrentLocation] location=" + location);
        this.f37110h = location;
        this.f37113k.j(g3.a.e(g3.f35298f));
    }

    public final o x4() {
        long jLongValue;
        LocalDate localDateJ;
        Long l14;
        j jVar = this.f37108f;
        ArrayList arrayListD0 = this.f37107e;
        if (jVar != null) {
            arrayListD0 = h0.D0(arrayListD0, jVar);
        }
        ArrayList arrayList = arrayListD0;
        LocalDate localDateB = null;
        o oVar = this.f37103a;
        Long l15 = oVar != null ? oVar.f199036a : null;
        if (oVar == null || (l14 = oVar.f199037b) == null) {
            l.f68084a.getClass();
            jLongValue = Long.parseLong(l.a.a().U1());
        } else {
            jLongValue = l14.longValue();
        }
        Long lValueOf = Long.valueOf(jLongValue);
        j jVar2 = (j) h0.d0(arrayList);
        if (jVar2 != null) {
            j.Companion companion = j.INSTANCE;
            localDateJ = jVar2.j("yyyy-MM-dd'T'HH:mm:ss.S");
        } else {
            localDateJ = null;
        }
        String strValueOf = String.valueOf(localDateJ);
        j jVar3 = (j) h0.n0(arrayList);
        if (jVar3 != null) {
            j.Companion companion2 = j.INSTANCE;
            localDateB = jVar3.b("yyyy-MM-dd'T'HH:mm:ss.S");
        }
        return new o(l15, lValueOf, strValueOf, String.valueOf(localDateB), arrayList, (f) null, 32, (p005kotlin.jvm.internal.j) null);
    }

    public final boolean y4() {
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
        for (String str : this.f37109g) {
            if (a7.b.checkSelfPermission(contextC, str) == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean z4() {
        return this.f37103a != null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
