package p8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o13.p;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.u0;
import y8.a0;
import y8.a1;
import y8.c0;
import y8.c1;
import y8.d;
import y8.d1;
import y8.e;
import y8.e0;
import y8.e1;
import y8.f;
import y8.g;
import y8.g0;
import y8.h0;
import y8.i;
import y8.i0;
import y8.j;
import y8.j0;
import y8.k;
import y8.k0;
import y8.l;
import y8.l0;
import y8.m;
import y8.n;
import y8.o;
import y8.p0;
import y8.r0;
import y8.v;
import y8.v0;
import y8.w;
import y8.w0;
import y8.x;
import y8.x0;
import y8.y;
import y8.y0;
import y8.z;
import y8.z0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f136340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f136341b;

    static {
        t0 t0Var = s0.f105811a;
        Map mapE = u0.e(new p("ActiveCaloriesBurned", t0Var.b(y8.a.class)), new p("ActivityIntensity", t0Var.b(y8.b.class)), new p("ActivitySession", t0Var.b(v.class)), new p("BasalBodyTemperature", t0Var.b(y8.c.class)), new p("BasalMetabolicRate", t0Var.b(d.class)), new p("BloodGlucose", t0Var.b(e.class)), new p("BloodPressure", t0Var.b(f.class)), new p("BodyFat", t0Var.b(g.class)), new p("BodyTemperature", t0Var.b(i.class)), new p("BodyWaterMass", t0Var.b(j.class)), new p("BoneMass", t0Var.b(k.class)), new p("CervicalMucus", t0Var.b(l.class)), new p("CyclingPedalingCadenceSeries", t0Var.b(m.class)), new p("Distance", t0Var.b(n.class)), new p("ElevationGained", t0Var.b(o.class)), new p("FloorsClimbed", t0Var.b(w.class)), new p("HeartRateSeries", t0Var.b(x.class)), new p("HeartRateVariabilityRmssd", t0Var.b(y.class)), new p("Height", t0Var.b(z.class)), new p("Hydration", t0Var.b(a0.class)), new p("LeanBodyMass", t0Var.b(e0.class)), new p("Menstruation", t0Var.b(g0.class)), new p("MenstruationPeriod", t0Var.b(h0.class)), new p("MindfulnessSession", t0Var.b(i0.class)), new p("Nutrition", t0Var.b(j0.class)), new p("OvulationTest", t0Var.b(k0.class)), new p("OxygenSaturation", t0Var.b(l0.class)), new p("PowerSeries", t0Var.b(p0.class)), new p("RespiratoryRate", t0Var.b(r0.class)), new p("RestingHeartRate", t0Var.b(y8.s0.class)), new p("SexualActivity", t0Var.b(y8.u0.class)), new p("SkinTemperature", t0Var.b(v0.class)), new p("SleepSession", t0Var.b(w0.class)), new p("SpeedSeries", t0Var.b(x0.class)), new p("IntermenstrualBleeding", t0Var.b(c0.class)), new p("Steps", t0Var.b(z0.class)), new p("StepsCadenceSeries", t0Var.b(y0.class)), new p("TotalCaloriesBurned", t0Var.b(a1.class)), new p("Vo2Max", t0Var.b(c1.class)), new p("WheelchairPushes", t0Var.b(e1.class)), new p("Weight", t0Var.b(d1.class)));
        f136340a = mapE;
        Set<Map.Entry> setEntrySet = mapE.entrySet();
        int iA = p13.t0.a(p13.y.r(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            p pVar = new p(entry.getValue(), entry.getKey());
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
        f136341b = linkedHashMap;
    }
}
