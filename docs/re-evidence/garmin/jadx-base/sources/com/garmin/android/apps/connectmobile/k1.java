package com.garmin.android.apps.connectmobile;

import android.content.Context;
import c22.s3;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.feature.garminpay.GarminPayInitializer;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/k1;", "Lcom/garmin/android/apps/connectmobile/b1;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k1 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1 f37122a = new k1();

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/garmin/android/apps/connectmobile/k1$a", "Lcom/google/gson/reflect/TypeToken;", "", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends String>> {
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/garmin/android/apps/connectmobile/k1$b", "Lcom/google/gson/reflect/TypeToken;", "", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends TypeToken<List<? extends String>> {
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/garmin/android/apps/connectmobile/k1$c", "Lcom/google/gson/reflect/TypeToken;", "", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends TypeToken<List<? extends String>> {
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/garmin/android/apps/connectmobile/k1$d", "Lcom/google/gson/reflect/TypeToken;", "", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends TypeToken<List<? extends String>> {
    }

    private k1() {
    }

    public static boolean u() {
        if (bo1.a.a().c().w()) {
            return true;
        }
        s3.f23252a.getClass();
        return s3.a("ROLE_TACX_APP_USER");
    }

    public final boolean A() {
        s3.f23252a.getClass();
        if (s3.a("ROLE_MBTESTER")) {
            return true;
        }
        l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("pack_weight_enabled");
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean A0() {
        return bo1.a.a().c().r0();
    }

    public final boolean B() {
        s3.f23252a.getClass();
        return s3.a("ROLE_MBTESTER") || ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("post_dive");
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean B0() {
        return bo1.a.a().c().D();
    }

    public final boolean C() {
        return bo1.a.a().c().G0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean C0() {
        return bo1.a.a().c().I0();
    }

    public final boolean D() {
        s3.f23252a.getClass();
        if (s3.a("ROLE_MBTESTER")) {
            return true;
        }
        l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("sync_activity_edits_released");
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean D0() {
        return bo1.a.a().c().T();
    }

    public final boolean E() {
        s3.f23252a.getClass();
        if (s3.a("ROLE_MBTESTER")) {
            return true;
        }
        l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("unreleased_vo2_max_estimation");
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean E0() {
        f12.l.f68084a.getClass();
        return f12.l.a.a().L0();
    }

    public final boolean F() {
        return G() && l0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean F0() {
        s3.f23252a.getClass();
        return s3.a("ROLE_WELLNESS_USER");
    }

    public final boolean G() {
        s3.f23252a.getClass();
        return s3.a("ROLE_MBTESTER") || ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("wheelchair_workouts_enabled");
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean G0() {
        s3.f23252a.getClass();
        return s3.a("ROLE_MBTESTER") || s3.a("ROLE_DI_TESTER");
    }

    public final boolean H() {
        return bo1.a.a().c().p0() && ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("rucking_workouts_enabled");
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean H0() {
        List<String> list = (List) new Gson().fromJson(((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).e("dogs_release"), new a().getType());
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (String str : list) {
            s3.f23252a.getClass();
            if (s3.a(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean I() {
        f12.l.f68084a.getClass();
        return f12.l.a.a().I();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean I0() {
        Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
        rd2.f.a().f152045a.getClass();
        List list = (List) Optional.ofNullable(rd2.j.d()).orElse(Collections.EMPTY_LIST);
        List list2 = (List) list.stream().filter(new im.c(13)).collect(Collectors.toList());
        return !(!list2.isEmpty() && list2.size() == list.size());
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean J() {
        wr2.p.f186870a.getClass();
        boolean z14 = Boolean.parseBoolean(wr2.p.c("dynamic_feature_app", GarminPayInitializer.HAS_FITPAY_ACCOUNT));
        kj0.c.f104941a.getClass();
        return kj0.c.f104946f || z14;
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean J0() {
        return bo1.a.a().c().P();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean K() {
        return km2.a.g(SupportedCapability.INCIDENT_DETECT_AND_ASSISTANCE.ordinal(), zb0.n0.f203579c);
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean K0() {
        return bo1.a.a().c().a0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean L() {
        return c22.b0.b(null).equalsIgnoreCase(Locale.JAPAN.getCountry()) && !d53.u.q(hb2.h.a((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null)).getLanguage(), Locale.JAPANESE.getLanguage(), true);
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean L0() {
        s3.f23252a.getClass();
        return s3.a("ROLE_OUTDOOR_USER");
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean M() {
        return bo1.a.a().c().W();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean M0() {
        return bo1.a.a().c().n0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean N() {
        return bo1.a.a().c().o0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean N0() {
        return bo1.a.a().c().O0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean O() {
        f12.l.f68084a.getClass();
        return r() && !s3.b() && (f12.l.a.a().u() >= 18);
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean O0() {
        return bo1.a.a().c().D0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean P() {
        return bo1.a.a().c().q();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean P0() {
        s3.f23252a.getClass();
        if (!s3.a("ROLE_WELLNESS_USER")) {
            return false;
        }
        List<com.garmin.android.apps.connectmobile.navigation.more.b.e> listA = ((uy0.k0) KoinJavaComponent.get$default(uy0.k0.class, null, null, 6, null)).a();
        ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.garmin.android.apps.connectmobile.navigation.more.b.e) it.next()).f39406d);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((ty0.b) obj) != ty0.b.f166889l) {
                arrayList2.add(obj);
            }
        }
        return arrayList2.size() == 1 && p13.h0.b0(arrayList2) == ty0.b.D;
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean Q() {
        return bo1.a.a().c().Q();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean Q0() {
        return bo1.a.a().c().e0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean R() {
        List<com.garmin.android.apps.connectmobile.navigation.more.b.e> listA = ((uy0.k0) KoinJavaComponent.get$default(uy0.k0.class, null, null, 6, null)).a();
        ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.garmin.android.apps.connectmobile.navigation.more.b.e) it.next()).f39406d);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((ty0.b) obj) != ty0.b.f166889l) {
                arrayList2.add(obj);
            }
        }
        return (arrayList2.isEmpty() || P0()) ? false : true;
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean R0() {
        s3.f23252a.getClass();
        return s3.a("ROLE_DIVE_USER");
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean S() {
        return !l0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean S0() {
        s3.f23252a.getClass();
        return s3.a("ROLE_OUTDOOR_USER") || s3.a("ROLE_WELLNESS_USER") || s3.a("ROLE_FITNESS_USER") || s3.a("ROLE_DIVE_USER");
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean T() {
        return bo1.a.a().c().c();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean T0() {
        return bo1.a.a().c().I();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean U() {
        return bo1.a.a().c().A() || K() || r0() || a0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean U0() {
        kg1.a.f104701a.getClass();
        return kg1.a.C2003a.a().D();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean V() {
        return bo1.a.a().c().L0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean V0() {
        return bo1.a.a().c().l0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean W() {
        ei1.a.f64383a.getClass();
        if (s3.b()) {
            return false;
        }
        return ((jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null)).c().b();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean X() {
        return bo1.a.a().c().F0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean Y() {
        return bo1.a.a().c().Z();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean Z() {
        return bo1.a.a().c().Q0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean a() {
        return bo1.a.a().c().g0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean a0() {
        return km2.a.f(SupportedCapability.INCIDENT_DETECTION.ordinal());
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean b() {
        l.g().getClass();
        return l.j();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean b0() {
        return bo1.a.a().c().B();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean c() {
        s3.f23252a.getClass();
        if (!((!s3.a("ROLE_OUTDOOR_USER") || s3.a("ROLE_FITNESS_USER") || s3.a("ROLE_WELLNESS_USER")) ? false : true)) {
            i52.a aVar = i52.a.f91796a;
            f12.l.a aVar2 = f12.l.f68084a;
            aVar2.getClass();
            if (f12.l.a.a().q0()) {
                i52.a.f91796a.getClass();
                aVar2.getClass();
                if (f12.l.a.a().C2()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean c0() {
        return bo1.a.a().c().u0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean d() {
        i52.a.f91796a.getClass();
        return i52.a.l() != ww0.a.INACTIVE || i52.a.a() > 1;
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean d0() {
        return bo1.a.a().c().l();
    }

    public final boolean e() {
        return bo1.a.a().c().v();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean e0() {
        Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
        e12.e eVarC = bo1.a.a().c();
        return eVarC.T0() && eVarC.o() && !L();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean f() {
        return bo1.a.a().c().K0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean f0() {
        s3.f23252a.getClass();
        return !((!s3.a("ROLE_OUTDOOR_USER") || s3.a("ROLE_FITNESS_USER") || s3.a("ROLE_WELLNESS_USER")) ? false : true);
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean g() {
        return T() || u() || C();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean g0() {
        return bo1.a.a().c().V();
    }

    public final boolean h() {
        return bo1.a.a().c().N();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean h0() {
        return bo1.a.a().c().K() || bo1.a.a().c().L();
    }

    public final boolean i() {
        return bo1.a.a().c().Y();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean i0() {
        return bo1.a.a().c().R0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean j() {
        return bo1.a.a().c().x();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean j0() {
        return bo1.a.a().c().O();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean k() {
        f12.l.f68084a.getClass();
        boolean zEquals = f12.l.a.a().w().equals(UserSettingsDTO.c.MALE.f43537a);
        s3.f23252a.getClass();
        boolean z14 = !(s3.a("ROLE_OUTDOOR_USER") && !s3.a("ROLE_FITNESS_USER") && !s3.a("ROLE_WELLNESS_USER")) || d();
        if (!z14 || zEquals) {
            if (!z14) {
                if (zEquals) {
                    i52.a.f91796a.getClass();
                    if (i52.a.l() == ww0.a.INACTIVE) {
                    }
                }
                return false;
            }
            i52.a.f91796a.getClass();
            if (i52.a.l() == ww0.a.INACTIVE) {
                if (zEquals) {
                    i52.a.f91796a.getClass();
                    if (i52.a.l() == ww0.a.INACTIVE || i52.a.a() == -1) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean k0() {
        return bo1.a.a().c().J();
    }

    public final boolean l() {
        e12.e eVarC = bo1.a.a().c();
        return eVarC.T0() && eVarC.k0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean l0() {
        if (!Z()) {
            return false;
        }
        f12.l.f68084a.getClass();
        return f12.l.a.a().B3();
    }

    public final boolean m() {
        return bo1.a.a().c().w0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean m0() {
        s3.f23252a.getClass();
        return s3.a("ROLE_FITNESS_USER");
    }

    public final boolean n() {
        return bo1.a.a().c().x0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean n0() {
        return bo1.a.a().c().R();
    }

    public final boolean o() {
        return bo1.a.a().c().A0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean o0() {
        return bo1.a.a().c().n();
    }

    public final boolean p() {
        return bo1.a.a().c().C0();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean p0() {
        return bo1.a.a().c().s0();
    }

    public final boolean q() {
        s3.f23252a.getClass();
        if (s3.a("ROLE_MBTESTER")) {
            return true;
        }
        l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("unreleased_activity_gym_equipment");
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean q0() {
        return bo1.a.a().c().N0();
    }

    public final boolean r() {
        boolean zF = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f();
        l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("unreleased_child_account") && !zF;
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean r0() {
        ImmutableList<String> immutableList = zb0.n0.f203578b;
        return km2.a.g(SupportedCapability.LIVETRACK.ordinal(), immutableList) || km2.a.g(SupportedCapability.DEVICE_DRIVEN_LIVETRACK_SUPPORT.ordinal(), immutableList);
    }

    public final boolean s() {
        s3.f23252a.getClass();
        if (s3.a("ROLE_TESTER_ASSOCIATE") || ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("course_planner_enabled")) {
            return true;
        }
        return ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("course_planner_beta_enabled") && s3.a("ROLE_MBTESTER");
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean s0() {
        return km2.a.f(SupportedCapability.SWING_SENSOR.ordinal());
    }

    public final boolean t() {
        s3.f23252a.getClass();
        if (s3.a("ROLE_MBTESTER")) {
            return true;
        }
        l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("cycling_position_released");
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean t0() {
        f12.l.f68084a.getClass();
        return f12.l.a.a().C4();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean u0() {
        return bo1.a.a().c().G();
    }

    public final boolean v() {
        return bo1.a.a().c().X();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean v0() {
        return km2.a.h(km2.a.c());
    }

    public final boolean w() {
        s3.f23252a.getClass();
        if (s3.a("ROLE_MBTESTER")) {
            return true;
        }
        l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("unreleased_mobility_activity");
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean w0() {
        return !((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f();
    }

    public final boolean x() {
        List<String> list = (List) new Gson().fromJson(((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).e("multi_day_activities_mvp"), new b().getType());
        if (list == null) {
            return false;
        }
        if (!list.isEmpty()) {
            for (String str : list) {
                s3.f23252a.getClass();
                if (s3.a(str)) {
                    return true;
                }
            }
        }
        return y();
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean x0() {
        boolean z14;
        cu0.g gVar = cu0.g.f55579a;
        ru0.a aVar = (ru0.a) KoinJavaComponent.get$default(ru0.a.class, null, null, 6, null);
        boolean zG = km2.a.g(SupportedCapability.EVENT_SHARING.ordinal(), zb0.n0.f203578b);
        boolean zC = aVar.c();
        boolean zB = aVar.b();
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListE = rd2.j.e();
        if (arrayListE != null && !arrayListE.isEmpty()) {
            Iterator it = arrayListE.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z14 = false;
                    break;
                }
                if (zb0.u0.b(((sd2.f) it.next()).getProductNumber()) == zb0.u0.A1) {
                    z14 = true;
                    break;
                }
            }
        } else {
            z14 = false;
            break;
        }
        return (zG && zC && zB) || z14;
    }

    public final boolean y() {
        List<String> list = (List) new Gson().fromJson(((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).e("multi_day_activities_release"), new c().getType());
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (String str : list) {
            s3.f23252a.getClass();
            if (s3.a(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean y0() {
        return bo1.a.a().c().s();
    }

    public final boolean z() {
        List list = (List) new Gson().fromJson(((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).e("nutrition_2_0_logging_feature_enabled"), new d().getType());
        if (list == null) {
            return false;
        }
        if (list.contains("AnyUser")) {
            return true;
        }
        if (list.contains("DITester")) {
            s3.f23252a.getClass();
            if (s3.a("ROLE_DI_TESTER")) {
                return true;
            }
        }
        if (list.contains("MBTester")) {
            s3.f23252a.getClass();
            if (s3.a("ROLE_MBTESTER")) {
                return true;
            }
        }
        if (!list.contains("AssociateTester")) {
            return false;
        }
        s3.f23252a.getClass();
        return s3.a("ROLE_TESTER_ASSOCIATE");
    }

    @Override // com.garmin.android.apps.connectmobile.b1
    public final boolean z0() {
        s3.f23252a.getClass();
        return (!s3.a("ROLE_OUTDOOR_USER") || s3.a("ROLE_FITNESS_USER") || s3.a("ROLE_WELLNESS_USER")) ? false : true;
    }
}
