package q8;

import androidx.health.platform.client.proto.p;
import androidx.health.platform.client.proto.s;
import androidx.health.platform.client.proto.u;
import c9.f;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.garmin.android.gncs.NotificationConstants;
import e23.l;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import y8.a0;
import y8.a1;
import y8.b0;
import y8.c0;
import y8.c1;
import y8.d0;
import y8.d1;
import y8.e0;
import y8.e1;
import y8.f0;
import y8.g;
import y8.g0;
import y8.h;
import y8.h0;
import y8.i;
import y8.i0;
import y8.j;
import y8.j0;
import y8.k;
import y8.k0;
import y8.l0;
import y8.m;
import y8.n;
import y8.o;
import y8.p0;
import y8.q;
import y8.q0;
import y8.r0;
import y8.s0;
import y8.t;
import y8.t0;
import y8.u0;
import y8.v;
import y8.v0;
import y8.w0;
import y8.x;
import y8.x0;
import y8.y;
import y8.y0;
import y8.z;
import y8.z0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly8/m$b;", "sample", "Landroidx/health/platform/client/proto/s;", "invoke", "(Ly8/m$b;)Landroidx/health/platform/client/proto/s;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class a extends w implements l<m.b, s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f143293a = new a();

        public a() {
            super(1);
        }

        @Override // e23.l
        public final s invoke(m.b bVar) {
            m.b bVar2 = bVar;
            bVar2.getClass();
            s.a aVarV = s.v();
            aVarV.j(q8.d.a(bVar2.f194893b), "rpm");
            aVarV.k(bVar2.f194892a.toEpochMilli());
            return aVarV.e();
        }
    }

    /* JADX INFO: renamed from: q8.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly8/x$b;", "sample", "Landroidx/health/platform/client/proto/s;", "invoke", "(Ly8/x$b;)Landroidx/health/platform/client/proto/s;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class C2697b extends w implements l<x.b, s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2697b f143294a = new C2697b();

        public C2697b() {
            super(1);
        }

        @Override // e23.l
        public final s invoke(x.b bVar) {
            x.b bVar2 = bVar;
            bVar2.getClass();
            s.a aVarV = s.v();
            aVarV.j(q8.d.d(bVar2.f195050b), "bpm");
            aVarV.k(bVar2.f195049a.toEpochMilli());
            return aVarV.e();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly8/p0$e;", "sample", "Landroidx/health/platform/client/proto/s;", "invoke", "(Ly8/p0$e;)Landroidx/health/platform/client/proto/s;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class c extends w implements l<p0.e, s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f143295a = new c();

        public c() {
            super(1);
        }

        @Override // e23.l
        public final s invoke(p0.e eVar) {
            p0.e eVar2 = eVar;
            eVar2.getClass();
            s.a aVarV = s.v();
            aVarV.j(q8.d.a(eVar2.f194945b.a()), "power");
            aVarV.k(eVar2.f194944a.toEpochMilli());
            return aVarV.e();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly8/x0$e;", "sample", "Landroidx/health/platform/client/proto/s;", "invoke", "(Ly8/x0$e;)Landroidx/health/platform/client/proto/s;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class d extends w implements l<x0.e, s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f143296a = new d();

        public d() {
            super(1);
        }

        @Override // e23.l
        public final s invoke(x0.e eVar) {
            x0.e eVar2 = eVar;
            eVar2.getClass();
            s.a aVarV = s.v();
            aVarV.j(q8.d.a(eVar2.f195059b.a()), "speed");
            aVarV.k(eVar2.f195058a.toEpochMilli());
            return aVarV.e();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly8/y0$b;", "sample", "Landroidx/health/platform/client/proto/s;", "invoke", "(Ly8/y0$b;)Landroidx/health/platform/client/proto/s;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class e extends w implements l<y0.b, s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f143297a = new e();

        public e() {
            super(1);
        }

        @Override // e23.l
        public final s invoke(y0.b bVar) {
            y0.b bVar2 = bVar;
            bVar2.getClass();
            s.a aVarV = s.v();
            aVarV.j(q8.d.a(bVar2.f195071b), "rate");
            aVarV.k(bVar2.f195070a.toEpochMilli());
            return aVarV.e();
        }
    }

    public static final p a(q0 q0Var) {
        q0Var.getClass();
        if (q0Var instanceof y8.b) {
            p.a aVarB = q8.c.b((d0) q0Var);
            aVarB.l(q8.c.c("ActivityIntensity"));
            u uVarC = q8.d.c(((y8.b) q0Var).f194726f, y8.b.f194720h);
            if (uVarC == null) {
                uVarC = q8.d.b("moderate");
            }
            aVarB.k(uVarC, "activityIntensityType");
            return aVarB.e();
        }
        if (q0Var instanceof y8.c) {
            p.a aVarA = q8.c.a((b0) q0Var);
            aVarA.l(q8.c.c("BasalBodyTemperature"));
            y8.c cVar = (y8.c) q0Var;
            aVarA.k(q8.d.a(cVar.f194732d.a()), "temperature");
            u uVarC2 = q8.d.c(cVar.f194733e, h.f194806b);
            if (uVarC2 != null) {
                aVarA.k(uVarC2, "measurementLocation");
                Unit unit = Unit.INSTANCE;
            }
            return aVarA.e();
        }
        if (q0Var instanceof y8.d) {
            p.a aVarA2 = q8.c.a((b0) q0Var);
            aVarA2.l(q8.c.c("BasalMetabolicRate"));
            f fVar = ((y8.d) q0Var).f194747c;
            f.b.a aVar = f.b.f25991b;
            aVarA2.k(q8.d.a(fVar.f25989b == aVar ? fVar.f25988a : fVar.a() / aVar.f25993d), "bmr");
            return aVarA2.e();
        }
        if (q0Var instanceof y8.e) {
            p.a aVarA3 = q8.c.a((b0) q0Var);
            aVarA3.l(q8.c.c("BloodGlucose"));
            y8.e eVar = (y8.e) q0Var;
            aVarA3.k(q8.d.a(eVar.f194762d.a()), "level");
            u uVarC3 = q8.d.c(eVar.f194763e, y8.e.f194758l);
            if (uVarC3 != null) {
                aVarA3.k(uVarC3, "specimenSource");
            }
            u uVarC4 = q8.d.c(eVar.f194764f, f0.f194793b);
            if (uVarC4 != null) {
                aVarA3.k(uVarC4, "mealType");
            }
            u uVarC5 = q8.d.c(eVar.f194765g, y8.e.f194756j);
            if (uVarC5 != null) {
                aVarA3.k(uVarC5, "relationToMeal");
                Unit unit2 = Unit.INSTANCE;
            }
            return aVarA3.e();
        }
        if (q0Var instanceof y8.f) {
            p.a aVarA4 = q8.c.a((b0) q0Var);
            aVarA4.l(q8.c.c("BloodPressure"));
            y8.f fVar2 = (y8.f) q0Var;
            aVarA4.k(q8.d.a(fVar2.f194788d.f25998a), "systolic");
            aVarA4.k(q8.d.a(fVar2.f194789e.f25998a), "diastolic");
            u uVarC6 = q8.d.c(fVar2.f194790f, y8.f.f194780k);
            if (uVarC6 != null) {
                aVarA4.k(uVarC6, "bodyPosition");
            }
            u uVarC7 = q8.d.c(fVar2.f194791g, y8.f.f194778i);
            if (uVarC7 != null) {
                aVarA4.k(uVarC7, "measurementLocation");
                Unit unit3 = Unit.INSTANCE;
            }
            return aVarA4.e();
        }
        if (q0Var instanceof g) {
            p.a aVarA5 = q8.c.a((b0) q0Var);
            aVarA5.l(q8.c.c("BodyFat"));
            aVarA5.k(q8.d.a(((g) q0Var).f194797c.f25985a), "percentage");
            return aVarA5.e();
        }
        if (q0Var instanceof i) {
            p.a aVarA6 = q8.c.a((b0) q0Var);
            aVarA6.l(q8.c.c("BodyTemperature"));
            i iVar = (i) q0Var;
            aVarA6.k(q8.d.a(iVar.f194816d.a()), "temperature");
            u uVarC8 = q8.d.c(iVar.f194817e, h.f194806b);
            if (uVarC8 != null) {
                aVarA6.k(uVarC8, "measurementLocation");
                Unit unit4 = Unit.INSTANCE;
            }
            return aVarA6.e();
        }
        if (q0Var instanceof j) {
            p.a aVarA7 = q8.c.a((b0) q0Var);
            aVarA7.l(q8.c.c("BodyWaterMass"));
            aVarA7.k(q8.d.a(((j) q0Var).f194831c.b()), "mass");
            return aVarA7.e();
        }
        if (q0Var instanceof k) {
            p.a aVarA8 = q8.c.a((b0) q0Var);
            aVarA8.l(q8.c.c("BoneMass"));
            aVarA8.k(q8.d.a(((k) q0Var).f194864c.b()), "mass");
            return aVarA8.e();
        }
        if (q0Var instanceof y8.l) {
            p.a aVarA9 = q8.c.a((b0) q0Var);
            aVarA9.l(q8.c.c("CervicalMucus"));
            y8.l lVar = (y8.l) q0Var;
            u uVarC9 = q8.d.c(lVar.f194879d, y8.l.f194873g);
            if (uVarC9 != null) {
                aVarA9.k(uVarC9, "texture");
            }
            u uVarC10 = q8.d.c(lVar.f194880e, y8.l.f194875i);
            if (uVarC10 != null) {
                aVarA9.k(uVarC10, "amount");
                Unit unit5 = Unit.INSTANCE;
            }
            return aVarA9.e();
        }
        if (q0Var instanceof m) {
            return b((t0) q0Var, "CyclingPedalingCadenceSeries", a.f143293a);
        }
        if (q0Var instanceof x) {
            return b((t0) q0Var, "HeartRateSeries", C2697b.f143294a);
        }
        if (q0Var instanceof z) {
            p.a aVarA10 = q8.c.a((b0) q0Var);
            aVarA10.l(q8.c.c("Height"));
            aVarA10.k(q8.d.a(((z) q0Var).f195075c.a()), "height");
            return aVarA10.e();
        }
        if (q0Var instanceof y) {
            p.a aVarA11 = q8.c.a((b0) q0Var);
            aVarA11.l(q8.c.c("HeartRateVariabilityRmssd"));
            aVarA11.k(q8.d.a(((y) q0Var).f195062c), "heartRateVariability");
            return aVarA11.e();
        }
        if (q0Var instanceof c0) {
            p.a aVarA12 = q8.c.a((b0) q0Var);
            aVarA12.l(q8.c.c("IntermenstrualBleeding"));
            return aVarA12.e();
        }
        if (q0Var instanceof e0) {
            p.a aVarA13 = q8.c.a((b0) q0Var);
            aVarA13.l(q8.c.c("LeanBodyMass"));
            aVarA13.k(q8.d.a(((e0) q0Var).f194769c.b()), "mass");
            return aVarA13.e();
        }
        if (q0Var instanceof g0) {
            p.a aVarA14 = q8.c.a((b0) q0Var);
            aVarA14.l(q8.c.c("Menstruation"));
            u uVarC11 = q8.d.c(((g0) q0Var).f194804d, g0.f194800f);
            if (uVarC11 != null) {
                aVarA14.k(uVarC11, "flow");
                Unit unit6 = Unit.INSTANCE;
            }
            return aVarA14.e();
        }
        if (q0Var instanceof h0) {
            p.a aVarB2 = q8.c.b((d0) q0Var);
            aVarB2.l(q8.c.c("MenstruationPeriod"));
            return aVarB2.e();
        }
        if (q0Var instanceof i0) {
            p.a aVarB3 = q8.c.b((d0) q0Var);
            aVarB3.l(q8.c.c("MindfulnessSession"));
            i0 i0Var = (i0) q0Var;
            u uVarC12 = q8.d.c(i0Var.f194825f, i0.f194819j);
            if (uVarC12 == null) {
                uVarC12 = q8.d.b(PrivacyUpdateRequestError.UNKNOWN);
            }
            aVarB3.k(uVarC12, "sessionType");
            String str = i0Var.f194826g;
            if (str != null) {
                aVarB3.k(q8.d.e(str), "title");
            }
            String str2 = i0Var.f194827h;
            if (str2 != null) {
                aVarB3.k(q8.d.e(str2), "notes");
                Unit unit7 = Unit.INSTANCE;
            }
            return aVarB3.e();
        }
        if (q0Var instanceof k0) {
            p.a aVarA15 = q8.c.a((b0) q0Var);
            aVarA15.l(q8.c.c("OvulationTest"));
            u uVarC13 = q8.d.c(((k0) q0Var).f194870c, k0.f194867f);
            if (uVarC13 != null) {
                aVarA15.k(uVarC13, "result");
                Unit unit8 = Unit.INSTANCE;
            }
            return aVarA15.e();
        }
        if (q0Var instanceof l0) {
            p.a aVarA16 = q8.c.a((b0) q0Var);
            aVarA16.l(q8.c.c("OxygenSaturation"));
            aVarA16.k(q8.d.a(((l0) q0Var).f194883c.f25985a), "percentage");
            return aVarA16.e();
        }
        if (q0Var instanceof p0) {
            return b((t0) q0Var, "PowerSeries", c.f143295a);
        }
        if (q0Var instanceof r0) {
            p.a aVarA17 = q8.c.a((b0) q0Var);
            aVarA17.l(q8.c.c("RespiratoryRate"));
            aVarA17.k(q8.d.a(((r0) q0Var).f194961c), "rate");
            return aVarA17.e();
        }
        if (q0Var instanceof s0) {
            p.a aVarA18 = q8.c.a((b0) q0Var);
            aVarA18.l(q8.c.c("RestingHeartRate"));
            aVarA18.k(q8.d.d(((s0) q0Var).f194972c), "bpm");
            return aVarA18.e();
        }
        if (q0Var instanceof u0) {
            p.a aVarA19 = q8.c.a((b0) q0Var);
            aVarA19.l(q8.c.c("SexualActivity"));
            u uVarC14 = q8.d.c(((u0) q0Var).f194990d, u0.f194986f);
            if (uVarC14 != null) {
                aVarA19.k(uVarC14, "protectionUsed");
                Unit unit9 = Unit.INSTANCE;
            }
            return aVarA19.e();
        }
        if (q0Var instanceof x0) {
            return b((t0) q0Var, "SpeedSeries", d.f143296a);
        }
        if (q0Var instanceof y0) {
            return b((t0) q0Var, "StepsCadenceSeries", e.f143297a);
        }
        if (q0Var instanceof c1) {
            p.a aVarA20 = q8.c.a((b0) q0Var);
            aVarA20.l(q8.c.c("Vo2Max"));
            c1 c1Var = (c1) q0Var;
            aVarA20.k(q8.d.a(c1Var.f194742d), "vo2");
            u uVarC15 = q8.d.c(c1Var.f194743e, c1.f194738g);
            if (uVarC15 != null) {
                aVarA20.k(uVarC15, "measurementMethod");
                Unit unit10 = Unit.INSTANCE;
            }
            return aVarA20.e();
        }
        if (q0Var instanceof d1) {
            p.a aVarA21 = q8.c.a((b0) q0Var);
            aVarA21.l(q8.c.c("Weight"));
            aVarA21.k(q8.d.a(((d1) q0Var).f194752c.b()), "weight");
            return aVarA21.e();
        }
        if (q0Var instanceof y8.a) {
            p.a aVarB4 = q8.c.b((d0) q0Var);
            aVarB4.l(q8.c.c("ActiveCaloriesBurned"));
            aVarB4.k(q8.d.a(((y8.a) q0Var).f194703e.b()), "energy");
            return aVarB4.e();
        }
        if (q0Var instanceof v) {
            p.a aVarB5 = q8.c.b((d0) q0Var);
            aVarB5.l(q8.c.c("ActivitySession"));
            v vVar = (v) q0Var;
            List<q> list = vVar.f195002j;
            List<y8.u> list2 = vVar.f195001i;
            t tVar = vVar.f195003k;
            u.a aVarZ = u.z();
            aVarZ.g();
            u.u((u) aVarZ.f7677b, !(tVar instanceof t.b));
            aVarB5.k(aVarZ.e(), "hasRoute");
            u uVarC16 = q8.d.c(vVar.f194998f, v.f194992n);
            if (uVarC16 == null) {
                uVarC16 = q8.d.b("workout");
            }
            aVarB5.k(uVarC16, "activityType");
            String str3 = vVar.f194999g;
            if (str3 != null) {
                aVarB5.k(q8.d.e(str3), "title");
            }
            String str4 = vVar.f195000h;
            if (str4 != null) {
                aVarB5.k(q8.d.e(str4), "notes");
            }
            if (!list2.isEmpty()) {
                p.b.a aVarV = p.b.v();
                ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
                for (y8.u uVar : list2) {
                    uVar.getClass();
                    androidx.health.platform.client.proto.t.a aVarW = androidx.health.platform.client.proto.t.w();
                    aVarW.l(uVar.f194981a.toEpochMilli());
                    aVarW.k(uVar.f194982b.toEpochMilli());
                    aVarW.j(q8.d.d(uVar.f194983c), NotificationConstants.KEY_DATA_MIME_TYPE);
                    aVarW.j(q8.d.d(uVar.f194984d), "reps");
                    arrayList.add(aVarW.e());
                }
                aVarV.j(arrayList);
                aVarB5.j("segments", aVarV.e());
            }
            if (!list.isEmpty()) {
                p.b.a aVarV2 = p.b.v();
                ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
                for (q qVar : list) {
                    qVar.getClass();
                    androidx.health.platform.client.proto.t.a aVarW2 = androidx.health.platform.client.proto.t.w();
                    aVarW2.l(qVar.f194946a.toEpochMilli());
                    aVarW2.k(qVar.f194947b.toEpochMilli());
                    c9.c cVar2 = qVar.f194948c;
                    if (cVar2 != null) {
                        aVarW2.j(q8.d.a(cVar2.a()), "length");
                    }
                    arrayList2.add(aVarW2.e());
                }
                aVarV2.j(arrayList2);
                aVarB5.j("laps", aVarV2.e());
            }
            if (tVar instanceof t.a) {
                p.b.a aVarV3 = p.b.v();
                List<y8.s.a> list3 = ((t.a) tVar).f194974a.f194963a;
                ArrayList arrayList3 = new ArrayList(p13.y.r(list3, 10));
                for (y8.s.a aVar2 : list3) {
                    aVar2.getClass();
                    androidx.health.platform.client.proto.t.a aVarW3 = androidx.health.platform.client.proto.t.w();
                    Instant instant = aVar2.f194964a;
                    aVarW3.l(instant.toEpochMilli());
                    aVarW3.k(instant.toEpochMilli());
                    aVarW3.j(q8.d.a(aVar2.f194965b), "latitude");
                    aVarW3.j(q8.d.a(aVar2.f194966c), "longitude");
                    c9.c cVar3 = aVar2.f194967d;
                    if (cVar3 != null) {
                        aVarW3.j(q8.d.a(cVar3.a()), "horizontal_accuracy");
                    }
                    c9.c cVar4 = aVar2.f194968e;
                    if (cVar4 != null) {
                        aVarW3.j(q8.d.a(cVar4.a()), "vertical_accuracy");
                    }
                    c9.c cVar5 = aVar2.f194969f;
                    if (cVar5 != null) {
                        aVarW3.j(q8.d.a(cVar5.a()), "altitude");
                    }
                    arrayList3.add(aVarW3.e());
                }
                aVarV3.j(arrayList3);
                aVarB5.j("route", aVarV3.e());
            }
            return aVarB5.e();
        }
        if (q0Var instanceof n) {
            p.a aVarB6 = q8.c.b((d0) q0Var);
            aVarB6.l(q8.c.c("Distance"));
            aVarB6.k(q8.d.a(((n) q0Var).f194902e.a()), "distance");
            return aVarB6.e();
        }
        if (q0Var instanceof o) {
            p.a aVarB7 = q8.c.b((d0) q0Var);
            aVarB7.l(q8.c.c("ElevationGained"));
            aVarB7.k(q8.d.a(((o) q0Var).f194922e.a()), "elevation");
            return aVarB7.e();
        }
        if (q0Var instanceof y8.w) {
            p.a aVarB8 = q8.c.b((d0) q0Var);
            aVarB8.l(q8.c.c("FloorsClimbed"));
            aVarB8.k(q8.d.a(((y8.w) q0Var).f195027e), "floors");
            return aVarB8.e();
        }
        if (q0Var instanceof a0) {
            p.a aVarB9 = q8.c.b((d0) q0Var);
            aVarB9.l(q8.c.c("Hydration"));
            aVarB9.k(q8.d.a(((a0) q0Var).f194710e.a()), "volume");
            return aVarB9.e();
        }
        if (!(q0Var instanceof j0)) {
            if (q0Var instanceof v0) {
                p.a aVarB10 = q8.c.b((d0) q0Var);
                aVarB10.l(q8.c.c("SkinTemperature"));
                v0 v0Var = (v0) q0Var;
                List<v0.e> list4 = v0Var.f195016f;
                c9.h hVar = v0Var.f195017g;
                if (hVar != null) {
                    aVarB10.k(q8.d.a(hVar.a()), "baseline");
                }
                if (!list4.isEmpty()) {
                    p.b.a aVarV4 = p.b.v();
                    ArrayList arrayList4 = new ArrayList(p13.y.r(list4, 10));
                    for (v0.e eVar2 : list4) {
                        eVar2.getClass();
                        androidx.health.platform.client.proto.t.a aVarW4 = androidx.health.platform.client.proto.t.w();
                        Instant instant2 = eVar2.f195021a;
                        aVarW4.l(instant2.toEpochMilli());
                        aVarW4.k(instant2.toEpochMilli());
                        aVarW4.j(q8.d.a(eVar2.f195022b.a()), "temperatureDelta");
                        arrayList4.add(aVarW4.e());
                    }
                    aVarV4.j(arrayList4);
                    aVarB10.j("deltas", aVarV4.e());
                }
                u uVarC17 = q8.d.c(v0Var.f195018h, v0.f195010l);
                if (uVarC17 != null) {
                    aVarB10.k(uVarC17, "measurementLocation");
                    Unit unit11 = Unit.INSTANCE;
                }
                return aVarB10.e();
            }
            if (!(q0Var instanceof w0)) {
                if (q0Var instanceof z0) {
                    p.a aVarB11 = q8.c.b((d0) q0Var);
                    aVarB11.l(q8.c.c("Steps"));
                    aVarB11.k(q8.d.d(((z0) q0Var).f195081e), "count");
                    return aVarB11.e();
                }
                if (q0Var instanceof a1) {
                    p.a aVarB12 = q8.c.b((d0) q0Var);
                    aVarB12.l(q8.c.c("TotalCaloriesBurned"));
                    aVarB12.k(q8.d.a(((a1) q0Var).f194717e.b()), "energy");
                    return aVarB12.e();
                }
                if (!(q0Var instanceof e1)) {
                    kg.f.n("Unsupported yet!");
                    return null;
                }
                p.a aVarB13 = q8.c.b((d0) q0Var);
                aVarB13.l(q8.c.c("WheelchairPushes"));
                aVarB13.k(q8.d.d(((e1) q0Var).f194775e), "count");
                return aVarB13.e();
            }
            p.a aVarB14 = q8.c.b((d0) q0Var);
            aVarB14.l(q8.c.c("SleepSession"));
            w0 w0Var = (w0) q0Var;
            List<w0.b> list5 = w0Var.f195038h;
            if (!list5.isEmpty()) {
                p.b.a aVarV5 = p.b.v();
                ArrayList arrayList5 = new ArrayList(p13.y.r(list5, 10));
                for (w0.b bVar : list5) {
                    bVar.getClass();
                    androidx.health.platform.client.proto.t.a aVarW5 = androidx.health.platform.client.proto.t.w();
                    aVarW5.l(bVar.f195039a.toEpochMilli());
                    aVarW5.k(bVar.f195040b.toEpochMilli());
                    u uVarC18 = q8.d.c(bVar.f195041c, w0.f195030j);
                    if (uVarC18 != null) {
                        aVarW5.j(uVarC18, "stage");
                    }
                    arrayList5.add(aVarW5.e());
                }
                aVarV5.j(arrayList5);
                aVarB14.j("stages", aVarV5.e());
            }
            String str5 = w0Var.f195036f;
            if (str5 != null) {
                aVarB14.k(q8.d.e(str5), "title");
            }
            String str6 = w0Var.f195037g;
            if (str6 != null) {
                aVarB14.k(q8.d.e(str6), "notes");
                Unit unit12 = Unit.INSTANCE;
            }
            return aVarB14.e();
        }
        p.a aVarB15 = q8.c.b((d0) q0Var);
        aVarB15.l(q8.c.c("Nutrition"));
        j0 j0Var = (j0) q0Var;
        c9.d dVar = j0Var.f194840f;
        if (dVar != null) {
            q6.f.u(dVar, aVarB15, "biotin");
        }
        c9.d dVar2 = j0Var.f194841g;
        if (dVar2 != null) {
            q6.f.u(dVar2, aVarB15, "caffeine");
        }
        c9.d dVar3 = j0Var.f194842h;
        if (dVar3 != null) {
            q6.f.u(dVar3, aVarB15, "calcium");
        }
        c9.b bVar2 = j0Var.f194843i;
        if (bVar2 != null) {
            aVarB15.k(q8.d.a(bVar2.b()), "calories");
        }
        c9.b bVar3 = j0Var.f194844j;
        if (bVar3 != null) {
            aVarB15.k(q8.d.a(bVar3.b()), "caloriesFromFat");
        }
        c9.d dVar4 = j0Var.f194845k;
        if (dVar4 != null) {
            q6.f.u(dVar4, aVarB15, "chloride");
        }
        c9.d dVar5 = j0Var.f194846l;
        if (dVar5 != null) {
            q6.f.u(dVar5, aVarB15, "cholesterol");
        }
        c9.d dVar6 = j0Var.f194847m;
        if (dVar6 != null) {
            q6.f.u(dVar6, aVarB15, "chromium");
        }
        c9.d dVar7 = j0Var.f194848n;
        if (dVar7 != null) {
            q6.f.u(dVar7, aVarB15, "copper");
        }
        c9.d dVar8 = j0Var.f194849o;
        if (dVar8 != null) {
            q6.f.u(dVar8, aVarB15, "dietaryFiber");
        }
        c9.d dVar9 = j0Var.f194850p;
        if (dVar9 != null) {
            q6.f.u(dVar9, aVarB15, "folate");
        }
        c9.d dVar10 = j0Var.f194851q;
        if (dVar10 != null) {
            q6.f.u(dVar10, aVarB15, "folicAcid");
        }
        c9.d dVar11 = j0Var.f194852r;
        if (dVar11 != null) {
            q6.f.u(dVar11, aVarB15, "iodine");
        }
        c9.d dVar12 = j0Var.f194853s;
        if (dVar12 != null) {
            q6.f.u(dVar12, aVarB15, "iron");
        }
        c9.d dVar13 = j0Var.f194854t;
        if (dVar13 != null) {
            q6.f.u(dVar13, aVarB15, "magnesium");
        }
        c9.d dVar14 = j0Var.f194855u;
        if (dVar14 != null) {
            q6.f.u(dVar14, aVarB15, "manganese");
        }
        c9.d dVar15 = j0Var.f194856v;
        if (dVar15 != null) {
            q6.f.u(dVar15, aVarB15, "molybdenum");
        }
        c9.d dVar16 = j0Var.f194857w;
        if (dVar16 != null) {
            q6.f.u(dVar16, aVarB15, "monounsaturatedFat");
        }
        c9.d dVar17 = j0Var.f194858x;
        if (dVar17 != null) {
            q6.f.u(dVar17, aVarB15, "niacin");
        }
        c9.d dVar18 = j0Var.f194859y;
        if (dVar18 != null) {
            q6.f.u(dVar18, aVarB15, "pantothenicAcid");
        }
        c9.d dVar19 = j0Var.f194860z;
        if (dVar19 != null) {
            q6.f.u(dVar19, aVarB15, "phosphorus");
        }
        c9.d dVar20 = j0Var.A;
        if (dVar20 != null) {
            q6.f.u(dVar20, aVarB15, "polyunsaturatedFat");
        }
        c9.d dVar21 = j0Var.B;
        if (dVar21 != null) {
            q6.f.u(dVar21, aVarB15, "potassium");
        }
        c9.d dVar22 = j0Var.C;
        if (dVar22 != null) {
            q6.f.u(dVar22, aVarB15, "protein");
        }
        c9.d dVar23 = j0Var.D;
        if (dVar23 != null) {
            q6.f.u(dVar23, aVarB15, "riboflavin");
        }
        c9.d dVar24 = j0Var.E;
        if (dVar24 != null) {
            q6.f.u(dVar24, aVarB15, "saturatedFat");
        }
        c9.d dVar25 = j0Var.F;
        if (dVar25 != null) {
            q6.f.u(dVar25, aVarB15, "selenium");
        }
        c9.d dVar26 = j0Var.G;
        if (dVar26 != null) {
            q6.f.u(dVar26, aVarB15, "sodium");
        }
        c9.d dVar27 = j0Var.H;
        if (dVar27 != null) {
            q6.f.u(dVar27, aVarB15, "sugar");
        }
        c9.d dVar28 = j0Var.I;
        if (dVar28 != null) {
            q6.f.u(dVar28, aVarB15, "thiamin");
        }
        c9.d dVar29 = j0Var.J;
        if (dVar29 != null) {
            q6.f.u(dVar29, aVarB15, "totalCarbohydrate");
        }
        c9.d dVar30 = j0Var.K;
        if (dVar30 != null) {
            q6.f.u(dVar30, aVarB15, "totalFat");
        }
        c9.d dVar31 = j0Var.L;
        if (dVar31 != null) {
            q6.f.u(dVar31, aVarB15, "transFat");
        }
        c9.d dVar32 = j0Var.M;
        if (dVar32 != null) {
            q6.f.u(dVar32, aVarB15, "unsaturatedFat");
        }
        c9.d dVar33 = j0Var.N;
        if (dVar33 != null) {
            q6.f.u(dVar33, aVarB15, "vitaminA");
        }
        c9.d dVar34 = j0Var.O;
        if (dVar34 != null) {
            q6.f.u(dVar34, aVarB15, "vitaminB12");
        }
        c9.d dVar35 = j0Var.P;
        if (dVar35 != null) {
            q6.f.u(dVar35, aVarB15, "vitaminB6");
        }
        c9.d dVar36 = j0Var.Q;
        if (dVar36 != null) {
            q6.f.u(dVar36, aVarB15, "vitaminC");
        }
        c9.d dVar37 = j0Var.R;
        if (dVar37 != null) {
            q6.f.u(dVar37, aVarB15, "vitaminD");
        }
        c9.d dVar38 = j0Var.S;
        if (dVar38 != null) {
            q6.f.u(dVar38, aVarB15, "vitaminE");
        }
        c9.d dVar39 = j0Var.T;
        if (dVar39 != null) {
            q6.f.u(dVar39, aVarB15, "vitaminK");
        }
        c9.d dVar40 = j0Var.U;
        if (dVar40 != null) {
            q6.f.u(dVar40, aVarB15, "zinc");
        }
        u uVarC19 = q8.d.c(j0Var.W, f0.f194793b);
        if (uVarC19 != null) {
            aVarB15.k(uVarC19, "mealType");
        }
        String str7 = j0Var.V;
        if (str7 != null) {
            aVarB15.k(q8.d.e(str7), "name");
            Unit unit13 = Unit.INSTANCE;
        }
        return aVarB15.e();
    }

    public static final <T> p b(t0<? extends T> t0Var, String str, l<? super T, s> lVar) {
        p.a aVarB = q8.c.b(t0Var);
        aVarB.l(q8.c.c(str));
        Iterator<? extends T> it = t0Var.b().iterator();
        while (it.hasNext()) {
            s sVarInvoke = lVar.invoke(it.next());
            aVarB.g();
            p.J((p) aVarB.f7677b, sVarInvoke);
        }
        return aVarB.e();
    }
}
