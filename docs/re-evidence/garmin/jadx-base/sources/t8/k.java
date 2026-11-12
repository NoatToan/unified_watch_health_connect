package t8;

import android.annotation.SuppressLint;
import android.health.connect.datatypes.ActiveCaloriesBurnedRecord;
import android.health.connect.datatypes.ActivityIntensityRecord;
import android.health.connect.datatypes.BasalBodyTemperatureRecord;
import android.health.connect.datatypes.BasalMetabolicRateRecord;
import android.health.connect.datatypes.BloodGlucoseRecord;
import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.BodyFatRecord;
import android.health.connect.datatypes.BodyTemperatureRecord;
import android.health.connect.datatypes.BodyWaterMassRecord;
import android.health.connect.datatypes.BoneMassRecord;
import android.health.connect.datatypes.CervicalMucusRecord;
import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.DistanceRecord;
import android.health.connect.datatypes.ElevationGainedRecord;
import android.health.connect.datatypes.ExerciseCompletionGoal;
import android.health.connect.datatypes.ExerciseLap;
import android.health.connect.datatypes.ExercisePerformanceGoal;
import android.health.connect.datatypes.ExerciseRoute;
import android.health.connect.datatypes.ExerciseSegment;
import android.health.connect.datatypes.ExerciseSessionRecord;
import android.health.connect.datatypes.FloorsClimbedRecord;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.HeartRateVariabilityRmssdRecord;
import android.health.connect.datatypes.HeightRecord;
import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.MenstruationPeriodRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.MindfulnessSessionRecord;
import android.health.connect.datatypes.NutritionRecord;
import android.health.connect.datatypes.OvulationTestRecord;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.health.connect.datatypes.PlannedExerciseBlock;
import android.health.connect.datatypes.PlannedExerciseSessionRecord;
import android.health.connect.datatypes.PlannedExerciseStep;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.Record;
import android.health.connect.datatypes.RespiratoryRateRecord;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.SexualActivityRecord;
import android.health.connect.datatypes.SkinTemperatureRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import android.health.connect.datatypes.StepsRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.Vo2MaxRecord;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.WheelchairPushesRecord;
import android.health.connect.datatypes.units.BloodGlucose;
import android.health.connect.datatypes.units.Percentage;
import android.health.connect.datatypes.units.Pressure;
import android.health.connect.datatypes.units.Temperature;
import android.health.connect.datatypes.units.TemperatureDelta;
import android.health.connect.datatypes.units.Velocity;
import android.health.connect.datatypes.units.Volume;
import android.os.ext.SdkExtensions;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.math.MathKt;
import p13.y;
import y8.a0;
import y8.a1;
import y8.b1;
import y8.c0;
import y8.c1;
import y8.d1;
import y8.e0;
import y8.e1;
import y8.g0;
import y8.h0;
import y8.i0;
import y8.j0;
import y8.k0;
import y8.l0;
import y8.m0;
import y8.n0;
import y8.o0;
import y8.p;
import y8.p0;
import y8.q;
import y8.q0;
import y8.r;
import y8.r0;
import y8.s;
import y8.s0;
import y8.t;
import y8.u;
import y8.u0;
import y8.v;
import y8.v0;
import y8.w;
import y8.w0;
import y8.x;
import y8.x0;
import y8.y0;
import y8.z;
import y8.z0;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static final NutritionRecord a(j0 j0Var) {
        h.x();
        NutritionRecord.Builder builderH = h.h(b.a(j0Var.f194839e), j0Var.f194835a, j0Var.f194837c);
        Integer num = (Integer) a.f163132d.get(Integer.valueOf(j0Var.W));
        NutritionRecord.Builder mealType = builderH.setMealType(num != null ? num.intValue() : 0);
        ZoneOffset zoneOffset = j0Var.f194836b;
        if (zoneOffset != null) {
            mealType.setStartZoneOffset(zoneOffset);
        }
        ZoneOffset zoneOffset2 = j0Var.f194838d;
        if (zoneOffset2 != null) {
            mealType.setEndZoneOffset(zoneOffset2);
        }
        c9.d dVar = j0Var.f194840f;
        if (dVar != null) {
            mealType.setBiotin(o.c(dVar));
        }
        c9.d dVar2 = j0Var.f194841g;
        if (dVar2 != null) {
            mealType.setCaffeine(o.c(dVar2));
        }
        c9.d dVar3 = j0Var.f194842h;
        if (dVar3 != null) {
            mealType.setCalcium(o.c(dVar3));
        }
        c9.d dVar4 = j0Var.f194845k;
        if (dVar4 != null) {
            mealType.setChloride(o.c(dVar4));
        }
        c9.d dVar5 = j0Var.f194846l;
        if (dVar5 != null) {
            mealType.setCholesterol(o.c(dVar5));
        }
        c9.d dVar6 = j0Var.f194847m;
        if (dVar6 != null) {
            mealType.setChromium(o.c(dVar6));
        }
        c9.d dVar7 = j0Var.f194848n;
        if (dVar7 != null) {
            mealType.setCopper(o.c(dVar7));
        }
        c9.d dVar8 = j0Var.f194849o;
        if (dVar8 != null) {
            mealType.setDietaryFiber(o.c(dVar8));
        }
        c9.b bVar = j0Var.f194843i;
        if (bVar != null) {
            mealType.setEnergy(o.a(bVar));
        }
        c9.b bVar2 = j0Var.f194844j;
        if (bVar2 != null) {
            mealType.setEnergyFromFat(o.a(bVar2));
        }
        c9.d dVar9 = j0Var.f194850p;
        if (dVar9 != null) {
            mealType.setFolate(o.c(dVar9));
        }
        c9.d dVar10 = j0Var.f194851q;
        if (dVar10 != null) {
            mealType.setFolicAcid(o.c(dVar10));
        }
        c9.d dVar11 = j0Var.f194852r;
        if (dVar11 != null) {
            mealType.setIodine(o.c(dVar11));
        }
        c9.d dVar12 = j0Var.f194853s;
        if (dVar12 != null) {
            mealType.setIron(o.c(dVar12));
        }
        c9.d dVar13 = j0Var.f194854t;
        if (dVar13 != null) {
            mealType.setMagnesium(o.c(dVar13));
        }
        c9.d dVar14 = j0Var.f194855u;
        if (dVar14 != null) {
            mealType.setManganese(o.c(dVar14));
        }
        c9.d dVar15 = j0Var.f194856v;
        if (dVar15 != null) {
            mealType.setMolybdenum(o.c(dVar15));
        }
        c9.d dVar16 = j0Var.f194857w;
        if (dVar16 != null) {
            mealType.setMonounsaturatedFat(o.c(dVar16));
        }
        String str = j0Var.V;
        if (str != null) {
            mealType.setMealName(str);
        }
        c9.d dVar17 = j0Var.f194858x;
        if (dVar17 != null) {
            mealType.setNiacin(o.c(dVar17));
        }
        c9.d dVar18 = j0Var.f194859y;
        if (dVar18 != null) {
            mealType.setPantothenicAcid(o.c(dVar18));
        }
        c9.d dVar19 = j0Var.f194860z;
        if (dVar19 != null) {
            mealType.setPhosphorus(o.c(dVar19));
        }
        c9.d dVar20 = j0Var.A;
        if (dVar20 != null) {
            mealType.setPolyunsaturatedFat(o.c(dVar20));
        }
        c9.d dVar21 = j0Var.B;
        if (dVar21 != null) {
            mealType.setPotassium(o.c(dVar21));
        }
        c9.d dVar22 = j0Var.C;
        if (dVar22 != null) {
            mealType.setProtein(o.c(dVar22));
        }
        c9.d dVar23 = j0Var.D;
        if (dVar23 != null) {
            mealType.setRiboflavin(o.c(dVar23));
        }
        c9.d dVar24 = j0Var.E;
        if (dVar24 != null) {
            mealType.setSaturatedFat(o.c(dVar24));
        }
        c9.d dVar25 = j0Var.F;
        if (dVar25 != null) {
            mealType.setSelenium(o.c(dVar25));
        }
        c9.d dVar26 = j0Var.G;
        if (dVar26 != null) {
            mealType.setSodium(o.c(dVar26));
        }
        c9.d dVar27 = j0Var.H;
        if (dVar27 != null) {
            mealType.setSugar(o.c(dVar27));
        }
        c9.d dVar28 = j0Var.I;
        if (dVar28 != null) {
            mealType.setThiamin(o.c(dVar28));
        }
        c9.d dVar29 = j0Var.J;
        if (dVar29 != null) {
            mealType.setTotalCarbohydrate(o.c(dVar29));
        }
        c9.d dVar30 = j0Var.K;
        if (dVar30 != null) {
            mealType.setTotalFat(o.c(dVar30));
        }
        c9.d dVar31 = j0Var.L;
        if (dVar31 != null) {
            mealType.setTransFat(o.c(dVar31));
        }
        c9.d dVar32 = j0Var.M;
        if (dVar32 != null) {
            mealType.setUnsaturatedFat(o.c(dVar32));
        }
        c9.d dVar33 = j0Var.N;
        if (dVar33 != null) {
            mealType.setVitaminA(o.c(dVar33));
        }
        c9.d dVar34 = j0Var.P;
        if (dVar34 != null) {
            mealType.setVitaminB6(o.c(dVar34));
        }
        c9.d dVar35 = j0Var.O;
        if (dVar35 != null) {
            mealType.setVitaminB12(o.c(dVar35));
        }
        c9.d dVar36 = j0Var.Q;
        if (dVar36 != null) {
            mealType.setVitaminC(o.c(dVar36));
        }
        c9.d dVar37 = j0Var.R;
        if (dVar37 != null) {
            mealType.setVitaminD(o.c(dVar37));
        }
        c9.d dVar38 = j0Var.S;
        if (dVar38 != null) {
            mealType.setVitaminE(o.c(dVar38));
        }
        c9.d dVar39 = j0Var.T;
        if (dVar39 != null) {
            mealType.setVitaminK(o.c(dVar39));
        }
        c9.d dVar40 = j0Var.U;
        if (dVar40 != null) {
            mealType.setZinc(o.c(dVar40));
        }
        NutritionRecord nutritionRecordBuild = mealType.build();
        nutritionRecordBuild.getClass();
        return nutritionRecordBuild;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v92, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v59, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v65, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    @SuppressLint({"NewApi"})
    public static final Record b(q0 q0Var) {
        ActivityIntensityRecord activityIntensityRecordBuild;
        MindfulnessSessionRecord mindfulnessSessionRecordBuild;
        ExerciseCompletionGoal.DistanceGoal activeCaloriesBurnedGoal;
        ArrayList arrayList;
        ExercisePerformanceGoal.PowerGoal rateOfPerceivedExertionGoal;
        q0Var.getClass();
        PlannedExerciseSessionRecord plannedExerciseSessionRecordBuild = null;
        if (b1.a() && (q0Var instanceof y8.b)) {
            y8.b bVar = (y8.b) q0Var;
            b.b.A();
            Metadata metadataA = b.a(bVar.f194725e);
            Instant instant = bVar.f194721a;
            Instant instant2 = bVar.f194723c;
            Integer num = (Integer) a.f163146r.get(Integer.valueOf(bVar.f194726f));
            ActivityIntensityRecord.Builder builderI = b.b.i(metadataA, instant, instant2, num != null ? num.intValue() : 0);
            ZoneOffset zoneOffset = bVar.f194722b;
            if (zoneOffset != null) {
                builderI.setStartZoneOffset(zoneOffset);
            }
            ZoneOffset zoneOffset2 = bVar.f194724d;
            if (zoneOffset2 != null) {
                builderI.setEndZoneOffset(zoneOffset2);
            }
            activityIntensityRecordBuild = builderI.build();
            activityIntensityRecordBuild.getClass();
        } else {
            activityIntensityRecordBuild = null;
        }
        if (activityIntensityRecordBuild != null) {
            return (Record) activityIntensityRecordBuild;
        }
        if (SdkExtensions.getExtensionVersion(34) < 15 || !(q0Var instanceof i0)) {
            mindfulnessSessionRecordBuild = null;
        } else {
            i0 i0Var = (i0) q0Var;
            b.b.u();
            Metadata metadataA2 = b.a(i0Var.f194824e);
            Instant instant3 = i0Var.f194820a;
            Instant instant4 = i0Var.f194822c;
            Integer num2 = (Integer) a.f163147s.get(Integer.valueOf(i0Var.f194825f));
            MindfulnessSessionRecord.Builder builderK = b.b.k(metadataA2, instant3, instant4, num2 != null ? num2.intValue() : 0);
            ZoneOffset zoneOffset3 = i0Var.f194821b;
            if (zoneOffset3 != null) {
                builderK.setStartZoneOffset(zoneOffset3);
            }
            ZoneOffset zoneOffset4 = i0Var.f194823d;
            if (zoneOffset4 != null) {
                builderK.setEndZoneOffset(zoneOffset4);
            }
            String str = i0Var.f194826g;
            if (str != null) {
                builderK.setTitle(str);
            }
            String str2 = i0Var.f194827h;
            if (str2 != null) {
                builderK.setNotes(str2);
            }
            mindfulnessSessionRecordBuild = builderK.build();
            mindfulnessSessionRecordBuild.getClass();
        }
        if (mindfulnessSessionRecordBuild != null) {
            return (Record) mindfulnessSessionRecordBuild;
        }
        if (SdkExtensions.getExtensionVersion(34) >= 13) {
            if (q0Var instanceof n0) {
                n0 n0Var = (n0) q0Var;
                boolean z14 = n0Var.f194910f;
                ZoneOffset zoneOffset5 = n0Var.f194906b;
                Instant instant5 = n0Var.f194907c;
                int i14 = n0Var.f194911g;
                z8.c cVar = n0Var.f194909e;
                Instant instant6 = n0Var.f194905a;
                PlannedExerciseSessionRecord.Builder builder = z14 ? new PlannedExerciseSessionRecord.Builder(b.a(cVar), a.b(i14), instant6, instant5) : new PlannedExerciseSessionRecord.Builder(b.a(cVar), a.b(i14), instant6.atZone(zoneOffset5).toLocalDate(), Duration.between(instant6, instant5));
                if (zoneOffset5 != null) {
                    builder.setStartZoneOffset(zoneOffset5);
                }
                ZoneOffset zoneOffset6 = n0Var.f194908d;
                if (zoneOffset6 != null) {
                    builder.setEndZoneOffset(zoneOffset6);
                }
                String str3 = n0Var.f194914j;
                if (str3 != null) {
                    builder.setTitle(str3);
                }
                String str4 = n0Var.f194915k;
                if (str4 != null) {
                    builder.setNotes(str4);
                }
                List<m0> list = n0Var.f194913i;
                ArrayList arrayList2 = new ArrayList(y.r(list, 10));
                for (m0 m0Var : list) {
                    PlannedExerciseBlock.Builder builder2 = new PlannedExerciseBlock.Builder(m0Var.f194894a);
                    builder2.setDescription(m0Var.f194896c);
                    List<o0> list2 = m0Var.f194895b;
                    ArrayList arrayList3 = new ArrayList(y.r(list2, 10));
                    for (o0 o0Var : list2) {
                        Integer num3 = (Integer) a.f163145q.get(Integer.valueOf(o0Var.f194924a));
                        int iIntValue = num3 != null ? num3.intValue() : 0;
                        Integer num4 = (Integer) a.f163141m.get(Integer.valueOf(o0Var.f194925b));
                        int iIntValue2 = num4 != null ? num4.intValue() : 0;
                        p pVar = o0Var.f194926c;
                        pVar.getClass();
                        if (pVar instanceof p.c) {
                            activeCaloriesBurnedGoal = new ExerciseCompletionGoal.DistanceGoal(o.b(((p.c) pVar).f194932a));
                        } else if (pVar instanceof p.b) {
                            p.b bVar2 = (p.b) pVar;
                            activeCaloriesBurnedGoal = new ExerciseCompletionGoal.DistanceWithVariableRestGoal(o.b(bVar2.f194930a), bVar2.f194931b);
                        } else if (pVar instanceof p.g) {
                            activeCaloriesBurnedGoal = new ExerciseCompletionGoal.StepsGoal(((p.g) pVar).f194935a);
                        } else if (pVar instanceof p.d) {
                            activeCaloriesBurnedGoal = new ExerciseCompletionGoal.DurationGoal(((p.d) pVar).f194933a);
                        } else if (pVar instanceof p.f) {
                            activeCaloriesBurnedGoal = new ExerciseCompletionGoal.RepetitionsGoal(((p.f) pVar).f194934a);
                        } else if (pVar instanceof p.h) {
                            activeCaloriesBurnedGoal = new ExerciseCompletionGoal.TotalCaloriesBurnedGoal(o.a(((p.h) pVar).f194936a));
                        } else if (pVar instanceof p.a) {
                            activeCaloriesBurnedGoal = new ExerciseCompletionGoal.ActiveCaloriesBurnedGoal(o.a(((p.a) pVar).f194929a));
                        } else if (pVar instanceof p.i) {
                            activeCaloriesBurnedGoal = ExerciseCompletionGoal.UnknownGoal.INSTANCE;
                            activeCaloriesBurnedGoal.getClass();
                        } else {
                            if (!(pVar instanceof p.e)) {
                                com.google.firebase.messaging.l.j(pVar, "Unsupported exercise completion goal ");
                                return null;
                            }
                            activeCaloriesBurnedGoal = ExerciseCompletionGoal.UnspecifiedGoal.INSTANCE;
                            activeCaloriesBurnedGoal.getClass();
                        }
                        PlannedExerciseStep.Builder builder3 = new PlannedExerciseStep.Builder(iIntValue, iIntValue2, activeCaloriesBurnedGoal);
                        builder3.setDescription(o0Var.f194928e);
                        List<r> list3 = o0Var.f194927d;
                        ArrayList arrayList4 = new ArrayList(y.r(list3, 10));
                        for (r rVar : list3) {
                            rVar.getClass();
                            if (rVar instanceof r.d) {
                                r.d dVar = (r.d) rVar;
                                rateOfPerceivedExertionGoal = new ExercisePerformanceGoal.PowerGoal(o.d(dVar.f194953a), o.d(dVar.f194954b));
                            } else {
                                if (rVar instanceof r.f) {
                                    r.f fVar = (r.f) rVar;
                                    c9.k kVar = fVar.f194956a;
                                    kVar.getClass();
                                    Velocity velocityFromMetersPerSecond = Velocity.fromMetersPerSecond(kVar.a());
                                    velocityFromMetersPerSecond.getClass();
                                    c9.k kVar2 = fVar.f194957b;
                                    kVar2.getClass();
                                    Velocity velocityFromMetersPerSecond2 = Velocity.fromMetersPerSecond(kVar2.a());
                                    velocityFromMetersPerSecond2.getClass();
                                    rateOfPerceivedExertionGoal = new ExercisePerformanceGoal.SpeedGoal(velocityFromMetersPerSecond, velocityFromMetersPerSecond2);
                                } else if (rVar instanceof r.b) {
                                    r.b bVar3 = (r.b) rVar;
                                    arrayList = arrayList2;
                                    rateOfPerceivedExertionGoal = new ExercisePerformanceGoal.CadenceGoal(bVar3.f194949a, bVar3.f194950b);
                                } else {
                                    arrayList = arrayList2;
                                    if (rVar instanceof r.c) {
                                        r.c cVar2 = (r.c) rVar;
                                        rateOfPerceivedExertionGoal = new ExercisePerformanceGoal.HeartRateGoal(MathKt.b(cVar2.f194951a), MathKt.b(cVar2.f194952b));
                                    } else if (rVar instanceof r.h) {
                                        rateOfPerceivedExertionGoal = new ExercisePerformanceGoal.WeightGoal(o.c(((r.h) rVar).f194958a));
                                    } else if (rVar instanceof r.e) {
                                        rateOfPerceivedExertionGoal = new ExercisePerformanceGoal.RateOfPerceivedExertionGoal(((r.e) rVar).f194955a);
                                    } else if (rVar instanceof r.a) {
                                        rateOfPerceivedExertionGoal = ExercisePerformanceGoal.AmrapGoal.INSTANCE;
                                        rateOfPerceivedExertionGoal.getClass();
                                    } else {
                                        if (!(rVar instanceof r.g)) {
                                            com.google.firebase.messaging.l.j(rVar, "Unsupported exercise performance target ");
                                            return null;
                                        }
                                        rateOfPerceivedExertionGoal = ExercisePerformanceGoal.UnknownGoal.INSTANCE;
                                        rateOfPerceivedExertionGoal.getClass();
                                    }
                                }
                                arrayList4.add(rateOfPerceivedExertionGoal);
                                arrayList2 = arrayList;
                            }
                            arrayList = arrayList2;
                            arrayList4.add(rateOfPerceivedExertionGoal);
                            arrayList2 = arrayList;
                        }
                        builder3.setPerformanceGoals(arrayList4);
                        PlannedExerciseStep plannedExerciseStepBuild = builder3.build();
                        plannedExerciseStepBuild.getClass();
                        arrayList3.add(plannedExerciseStepBuild);
                    }
                    builder2.setSteps(arrayList3);
                    PlannedExerciseBlock plannedExerciseBlockBuild = builder2.build();
                    plannedExerciseBlockBuild.getClass();
                    arrayList2.add(plannedExerciseBlockBuild);
                }
                builder.setBlocks(arrayList2);
                plannedExerciseSessionRecordBuild = builder.build();
                plannedExerciseSessionRecordBuild.getClass();
            } else if (q0Var instanceof v0) {
                v0 v0Var = (v0) q0Var;
                SkinTemperatureRecord.Builder builder4 = new SkinTemperatureRecord.Builder(b.a(v0Var.f195015e), v0Var.f195011a, v0Var.f195013c);
                ZoneOffset zoneOffset7 = v0Var.f195012b;
                if (zoneOffset7 != null) {
                    builder4.setStartZoneOffset(zoneOffset7);
                }
                ZoneOffset zoneOffset8 = v0Var.f195014d;
                if (zoneOffset8 != null) {
                    builder4.setEndZoneOffset(zoneOffset8);
                }
                c9.h hVar = v0Var.f195017g;
                if (hVar != null) {
                    Temperature temperatureFromCelsius = Temperature.fromCelsius(hVar.a());
                    temperatureFromCelsius.getClass();
                    builder4.setBaseline(temperatureFromCelsius);
                }
                Integer num5 = (Integer) a.f163140l.get(Integer.valueOf(v0Var.f195018h));
                builder4.setMeasurementLocation(num5 != null ? num5.intValue() : 0);
                List<v0.e> list4 = v0Var.f195016f;
                ArrayList arrayList5 = new ArrayList(y.r(list4, 10));
                for (v0.e eVar : list4) {
                    TemperatureDelta temperatureDeltaFromCelsius = TemperatureDelta.fromCelsius(eVar.f195022b.a());
                    temperatureDeltaFromCelsius.getClass();
                    arrayList5.add(new SkinTemperatureRecord.Delta(temperatureDeltaFromCelsius, eVar.f195021a));
                }
                builder4.setDeltas(arrayList5);
                plannedExerciseSessionRecordBuild = builder4.build();
                plannedExerciseSessionRecordBuild.getClass();
            }
        }
        if (plannedExerciseSessionRecordBuild != null) {
            return (Record) plannedExerciseSessionRecordBuild;
        }
        if (q0Var instanceof y8.a) {
            y8.a aVar = (y8.a) q0Var;
            ActiveCaloriesBurnedRecord.Builder builder5 = new ActiveCaloriesBurnedRecord.Builder(b.a(aVar.f194704f), aVar.f194699a, aVar.f194701c, o.a(aVar.f194703e));
            ZoneOffset zoneOffset9 = aVar.f194700b;
            if (zoneOffset9 != null) {
                builder5.setStartZoneOffset(zoneOffset9);
            }
            ZoneOffset zoneOffset10 = aVar.f194702d;
            if (zoneOffset10 != null) {
                builder5.setEndZoneOffset(zoneOffset10);
            }
            ActiveCaloriesBurnedRecord activeCaloriesBurnedRecordBuild = builder5.build();
            activeCaloriesBurnedRecordBuild.getClass();
            return activeCaloriesBurnedRecordBuild;
        }
        if (q0Var instanceof y8.c) {
            y8.c cVar3 = (y8.c) q0Var;
            Metadata metadataA3 = b.a(cVar3.f194731c);
            Instant instant7 = cVar3.f194729a;
            Integer num6 = (Integer) a.f163135g.get(Integer.valueOf(cVar3.f194733e));
            int iIntValue3 = num6 != null ? num6.intValue() : 0;
            c9.h hVar2 = cVar3.f194732d;
            hVar2.getClass();
            Temperature temperatureFromCelsius2 = Temperature.fromCelsius(hVar2.a());
            temperatureFromCelsius2.getClass();
            BasalBodyTemperatureRecord.Builder builder6 = new BasalBodyTemperatureRecord.Builder(metadataA3, instant7, iIntValue3, temperatureFromCelsius2);
            ZoneOffset zoneOffset11 = cVar3.f194730b;
            if (zoneOffset11 != null) {
                builder6.setZoneOffset(zoneOffset11);
            }
            BasalBodyTemperatureRecord basalBodyTemperatureRecordBuild = builder6.build();
            basalBodyTemperatureRecordBuild.getClass();
            return basalBodyTemperatureRecordBuild;
        }
        if (q0Var instanceof y8.d) {
            y8.d dVar2 = (y8.d) q0Var;
            BasalMetabolicRateRecord.Builder builder7 = new BasalMetabolicRateRecord.Builder(b.a(dVar2.f194748d), dVar2.f194745a, o.d(dVar2.f194747c));
            ZoneOffset zoneOffset12 = dVar2.f194746b;
            if (zoneOffset12 != null) {
                builder7.setZoneOffset(zoneOffset12);
            }
            BasalMetabolicRateRecord basalMetabolicRateRecordBuild = builder7.build();
            basalMetabolicRateRecordBuild.getClass();
            return basalMetabolicRateRecordBuild;
        }
        if (q0Var instanceof y8.e) {
            y8.e eVar2 = (y8.e) q0Var;
            Metadata metadataA4 = b.a(eVar2.f194761c);
            Instant instant8 = eVar2.f194759a;
            Integer num7 = (Integer) a.f163141m.get(Integer.valueOf(eVar2.f194763e));
            int iIntValue4 = num7 != null ? num7.intValue() : 0;
            c9.a aVar2 = eVar2.f194762d;
            aVar2.getClass();
            BloodGlucose bloodGlucoseFromMillimolesPerLiter = BloodGlucose.fromMillimolesPerLiter(aVar2.a());
            bloodGlucoseFromMillimolesPerLiter.getClass();
            Integer num8 = (Integer) a.f163142n.get(Integer.valueOf(eVar2.f194765g));
            int iIntValue5 = num8 != null ? num8.intValue() : 0;
            Integer num9 = (Integer) a.f163132d.get(Integer.valueOf(eVar2.f194764f));
            BloodGlucoseRecord.Builder builder8 = new BloodGlucoseRecord.Builder(metadataA4, instant8, iIntValue4, bloodGlucoseFromMillimolesPerLiter, iIntValue5, num9 != null ? num9.intValue() : 0);
            ZoneOffset zoneOffset13 = eVar2.f194760b;
            if (zoneOffset13 != null) {
                builder8.setZoneOffset(zoneOffset13);
            }
            BloodGlucoseRecord bloodGlucoseRecordBuild = builder8.build();
            bloodGlucoseRecordBuild.getClass();
            return bloodGlucoseRecordBuild;
        }
        if (q0Var instanceof y8.f) {
            y8.f fVar2 = (y8.f) q0Var;
            Metadata metadataA5 = b.a(fVar2.f194787c);
            Instant instant9 = fVar2.f194785a;
            Integer num10 = (Integer) a.f163136h.get(Integer.valueOf(fVar2.f194791g));
            int iIntValue6 = num10 != null ? num10.intValue() : 0;
            c9.g gVar = fVar2.f194788d;
            gVar.getClass();
            Pressure pressureFromMillimetersOfMercury = Pressure.fromMillimetersOfMercury(gVar.f25998a);
            pressureFromMillimetersOfMercury.getClass();
            c9.g gVar2 = fVar2.f194789e;
            gVar2.getClass();
            Pressure pressureFromMillimetersOfMercury2 = Pressure.fromMillimetersOfMercury(gVar2.f25998a);
            pressureFromMillimetersOfMercury2.getClass();
            Integer num11 = (Integer) a.f163130b.get(Integer.valueOf(fVar2.f194790f));
            BloodPressureRecord.Builder builder9 = new BloodPressureRecord.Builder(metadataA5, instant9, iIntValue6, pressureFromMillimetersOfMercury, pressureFromMillimetersOfMercury2, num11 != null ? num11.intValue() : 0);
            ZoneOffset zoneOffset14 = fVar2.f194786b;
            if (zoneOffset14 != null) {
                builder9.setZoneOffset(zoneOffset14);
            }
            BloodPressureRecord bloodPressureRecordBuild = builder9.build();
            bloodPressureRecordBuild.getClass();
            return bloodPressureRecordBuild;
        }
        if (q0Var instanceof y8.g) {
            y8.g gVar3 = (y8.g) q0Var;
            Metadata metadataA6 = b.a(gVar3.f194798d);
            Instant instant10 = gVar3.f194795a;
            Percentage percentageFromValue = Percentage.fromValue(gVar3.f194797c.f25985a);
            percentageFromValue.getClass();
            BodyFatRecord.Builder builder10 = new BodyFatRecord.Builder(metadataA6, instant10, percentageFromValue);
            ZoneOffset zoneOffset15 = gVar3.f194796b;
            if (zoneOffset15 != null) {
                builder10.setZoneOffset(zoneOffset15);
            }
            BodyFatRecord bodyFatRecordBuild = builder10.build();
            bodyFatRecordBuild.getClass();
            return bodyFatRecordBuild;
        }
        if (q0Var instanceof y8.i) {
            y8.i iVar = (y8.i) q0Var;
            Metadata metadataA7 = b.a(iVar.f194815c);
            Instant instant11 = iVar.f194813a;
            Integer num12 = (Integer) a.f163135g.get(Integer.valueOf(iVar.f194817e));
            int iIntValue7 = num12 != null ? num12.intValue() : 0;
            c9.h hVar3 = iVar.f194816d;
            hVar3.getClass();
            Temperature temperatureFromCelsius3 = Temperature.fromCelsius(hVar3.a());
            temperatureFromCelsius3.getClass();
            BodyTemperatureRecord.Builder builder11 = new BodyTemperatureRecord.Builder(metadataA7, instant11, iIntValue7, temperatureFromCelsius3);
            ZoneOffset zoneOffset16 = iVar.f194814b;
            if (zoneOffset16 != null) {
                builder11.setZoneOffset(zoneOffset16);
            }
            BodyTemperatureRecord bodyTemperatureRecordBuild = builder11.build();
            bodyTemperatureRecordBuild.getClass();
            return bodyTemperatureRecordBuild;
        }
        if (q0Var instanceof y8.j) {
            y8.j jVar = (y8.j) q0Var;
            BodyWaterMassRecord.Builder builder12 = new BodyWaterMassRecord.Builder(b.a(jVar.f194832d), jVar.f194829a, o.c(jVar.f194831c));
            ZoneOffset zoneOffset17 = jVar.f194830b;
            if (zoneOffset17 != null) {
                builder12.setZoneOffset(zoneOffset17);
            }
            BodyWaterMassRecord bodyWaterMassRecordBuild = builder12.build();
            bodyWaterMassRecordBuild.getClass();
            return bodyWaterMassRecordBuild;
        }
        if (q0Var instanceof y8.k) {
            y8.k kVar3 = (y8.k) q0Var;
            BoneMassRecord.Builder builder13 = new BoneMassRecord.Builder(b.a(kVar3.f194865d), kVar3.f194862a, o.c(kVar3.f194864c));
            ZoneOffset zoneOffset18 = kVar3.f194863b;
            if (zoneOffset18 != null) {
                builder13.setZoneOffset(zoneOffset18);
            }
            BoneMassRecord boneMassRecordBuild = builder13.build();
            boneMassRecordBuild.getClass();
            return boneMassRecordBuild;
        }
        if (q0Var instanceof y8.l) {
            y8.l lVar = (y8.l) q0Var;
            Metadata metadataA8 = b.a(lVar.f194878c);
            Instant instant12 = lVar.f194876a;
            Integer num13 = (Integer) a.f163138j.get(Integer.valueOf(lVar.f194880e));
            int iIntValue8 = num13 != null ? num13.intValue() : 0;
            Integer num14 = (Integer) a.f163129a.get(Integer.valueOf(lVar.f194879d));
            CervicalMucusRecord.Builder builder14 = new CervicalMucusRecord.Builder(metadataA8, instant12, iIntValue8, num14 != null ? num14.intValue() : 0);
            ZoneOffset zoneOffset19 = lVar.f194877b;
            if (zoneOffset19 != null) {
                builder14.setZoneOffset(zoneOffset19);
            }
            CervicalMucusRecord cervicalMucusRecordBuild = builder14.build();
            cervicalMucusRecordBuild.getClass();
            return cervicalMucusRecordBuild;
        }
        if (q0Var instanceof y8.m) {
            y8.m mVar = (y8.m) q0Var;
            Metadata metadataA9 = b.a(mVar.f194891f);
            Instant instant13 = mVar.f194886a;
            Instant instant14 = mVar.f194888c;
            List<y8.m.b> list5 = mVar.f194890e;
            ArrayList arrayList6 = new ArrayList(y.r(list5, 10));
            for (y8.m.b bVar4 : list5) {
                arrayList6.add(new CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample(bVar4.f194893b, bVar4.f194892a));
            }
            CyclingPedalingCadenceRecord.Builder builder15 = new CyclingPedalingCadenceRecord.Builder(metadataA9, instant13, instant14, arrayList6);
            ZoneOffset zoneOffset20 = mVar.f194887b;
            if (zoneOffset20 != null) {
                builder15.setStartZoneOffset(zoneOffset20);
            }
            ZoneOffset zoneOffset21 = mVar.f194889d;
            if (zoneOffset21 != null) {
                builder15.setEndZoneOffset(zoneOffset21);
            }
            CyclingPedalingCadenceRecord cyclingPedalingCadenceRecordBuild = builder15.build();
            cyclingPedalingCadenceRecordBuild.getClass();
            return cyclingPedalingCadenceRecordBuild;
        }
        if (q0Var instanceof y8.n) {
            y8.n nVar = (y8.n) q0Var;
            DistanceRecord.Builder builder16 = new DistanceRecord.Builder(b.a(nVar.f194903f), nVar.f194898a, nVar.f194900c, o.b(nVar.f194902e));
            ZoneOffset zoneOffset22 = nVar.f194899b;
            if (zoneOffset22 != null) {
                builder16.setStartZoneOffset(zoneOffset22);
            }
            ZoneOffset zoneOffset23 = nVar.f194901d;
            if (zoneOffset23 != null) {
                builder16.setEndZoneOffset(zoneOffset23);
            }
            DistanceRecord distanceRecordBuild = builder16.build();
            distanceRecordBuild.getClass();
            return distanceRecordBuild;
        }
        if (q0Var instanceof y8.o) {
            y8.o oVar = (y8.o) q0Var;
            ElevationGainedRecord.Builder builderA = j.a(b.a(oVar.f194923f), oVar.f194918a, oVar.f194920c, o.b(oVar.f194922e));
            ZoneOffset zoneOffset24 = oVar.f194919b;
            if (zoneOffset24 != null) {
                builderA.setStartZoneOffset(zoneOffset24);
            }
            ZoneOffset zoneOffset25 = oVar.f194921d;
            if (zoneOffset25 != null) {
                builderA.setEndZoneOffset(zoneOffset25);
            }
            ElevationGainedRecord elevationGainedRecordBuild = builderA.build();
            elevationGainedRecordBuild.getClass();
            return elevationGainedRecordBuild;
        }
        if (q0Var instanceof v) {
            v vVar = (v) q0Var;
            j.q();
            ExerciseSessionRecord.Builder builderB = j.b(b.a(vVar.f194997e), vVar.f194993a, vVar.f194995c, a.b(vVar.f194998f));
            ZoneOffset zoneOffset26 = vVar.f194994b;
            if (zoneOffset26 != null) {
                builderB.setStartZoneOffset(zoneOffset26);
            }
            ZoneOffset zoneOffset27 = vVar.f194996d;
            if (zoneOffset27 != null) {
                builderB.setEndZoneOffset(zoneOffset27);
            }
            String str5 = vVar.f195000h;
            if (str5 != null) {
                builderB.setNotes(str5);
            }
            String str6 = vVar.f194999g;
            if (str6 != null) {
                builderB.setTitle(str6);
            }
            List<q> list6 = vVar.f195002j;
            ArrayList arrayList7 = new ArrayList(y.r(list6, 10));
            for (q qVar : list6) {
                f.p();
                ExerciseLap.Builder builderG = q2.o.g(qVar.f194946a, qVar.f194947b);
                c9.c cVar4 = qVar.f194948c;
                if (cVar4 != null) {
                    builderG.setLength(o.b(cVar4));
                }
                ExerciseLap exerciseLapBuild = builderG.build();
                exerciseLapBuild.getClass();
                arrayList7.add(exerciseLapBuild);
            }
            builderB.setLaps(arrayList7);
            List<u> list7 = vVar.f195001i;
            ArrayList arrayList8 = new ArrayList(y.r(list7, 10));
            for (u uVar : list7) {
                d.b();
                Instant instant15 = uVar.f194981a;
                Instant instant16 = uVar.f194982b;
                Integer num15 = (Integer) a.f163145q.get(Integer.valueOf(uVar.f194983c));
                ExerciseSegment exerciseSegmentBuild = d.a(instant15, instant16, num15 != null ? num15.intValue() : 0).setRepetitionsCount(uVar.f194984d).build();
                exerciseSegmentBuild.getClass();
                arrayList8.add(exerciseSegmentBuild);
            }
            builderB.setSegments(arrayList8);
            t tVar = vVar.f195003k;
            if (tVar instanceof t.a) {
                List<s.a> list8 = ((t.a) tVar).f194974a.f194963a;
                ArrayList arrayList9 = new ArrayList(y.r(list8, 10));
                for (s.a aVar3 : list8) {
                    c.j();
                    ExerciseRoute.Location.Builder builderA2 = c.a(aVar3.f194964a, aVar3.f194965b, aVar3.f194966c);
                    c9.c cVar5 = aVar3.f194967d;
                    if (cVar5 != null) {
                        builderA2.setHorizontalAccuracy(o.b(cVar5));
                    }
                    c9.c cVar6 = aVar3.f194968e;
                    if (cVar6 != null) {
                        builderA2.setVerticalAccuracy(o.b(cVar6));
                    }
                    c9.c cVar7 = aVar3.f194969f;
                    if (cVar7 != null) {
                        builderA2.setAltitude(o.b(cVar7));
                    }
                    arrayList9.add(builderA2.build());
                }
                builderB.setRoute(c.b(arrayList9));
            }
            String str7 = vVar.f195004l;
            if (str7 != null) {
                builderB.setPlannedExerciseSessionId(str7);
            }
            ExerciseSessionRecord exerciseSessionRecordBuild = builderB.build();
            exerciseSessionRecordBuild.getClass();
            return exerciseSessionRecordBuild;
        }
        if (q0Var instanceof w) {
            w wVar = (w) q0Var;
            h.p();
            FloorsClimbedRecord.Builder builderE = g.e(b.a(wVar.f195028f), wVar.f195023a, wVar.f195025c, wVar.f195027e);
            ZoneOffset zoneOffset28 = wVar.f195024b;
            if (zoneOffset28 != null) {
                builderE.setStartZoneOffset(zoneOffset28);
            }
            ZoneOffset zoneOffset29 = wVar.f195026d;
            if (zoneOffset29 != null) {
                builderE.setEndZoneOffset(zoneOffset29);
            }
            FloorsClimbedRecord floorsClimbedRecordBuild = builderE.build();
            floorsClimbedRecordBuild.getClass();
            return floorsClimbedRecordBuild;
        }
        if (q0Var instanceof x) {
            x xVar = (x) q0Var;
            Metadata metadataA10 = b.a(xVar.f195048f);
            Instant instant17 = xVar.f195043a;
            Instant instant18 = xVar.f195045c;
            List<x.b> list9 = xVar.f195047e;
            ArrayList arrayList10 = new ArrayList(y.r(list9, 10));
            for (x.b bVar5 : list9) {
                i.n();
                arrayList10.add(h.c(bVar5.f195049a, bVar5.f195050b));
            }
            HeartRateRecord.Builder builderB2 = h.b(metadataA10, instant17, instant18, arrayList10);
            ZoneOffset zoneOffset30 = xVar.f195044b;
            if (zoneOffset30 != null) {
                builderB2.setStartZoneOffset(zoneOffset30);
            }
            ZoneOffset zoneOffset31 = xVar.f195046d;
            if (zoneOffset31 != null) {
                builderB2.setEndZoneOffset(zoneOffset31);
            }
            HeartRateRecord heartRateRecordBuild = builderB2.build();
            heartRateRecordBuild.getClass();
            return heartRateRecordBuild;
        }
        if (q0Var instanceof y8.y) {
            y8.y yVar = (y8.y) q0Var;
            i.k();
            HeartRateVariabilityRmssdRecord.Builder builderA3 = i.a(b.a(yVar.f195063d), yVar.f195060a, yVar.f195062c);
            ZoneOffset zoneOffset32 = yVar.f195061b;
            if (zoneOffset32 != null) {
                builderA3.setZoneOffset(zoneOffset32);
            }
            HeartRateVariabilityRmssdRecord heartRateVariabilityRmssdRecordBuild = builderA3.build();
            heartRateVariabilityRmssdRecordBuild.getClass();
            return heartRateVariabilityRmssdRecordBuild;
        }
        if (q0Var instanceof z) {
            z zVar = (z) q0Var;
            i.o();
            HeightRecord.Builder builderB3 = i.b(b.a(zVar.f195076d), zVar.f195073a, o.b(zVar.f195075c));
            ZoneOffset zoneOffset33 = zVar.f195074b;
            if (zoneOffset33 != null) {
                builderB3.setZoneOffset(zoneOffset33);
            }
            HeightRecord heightRecordBuild = builderB3.build();
            heightRecordBuild.getClass();
            return heightRecordBuild;
        }
        if (q0Var instanceof a0) {
            a0 a0Var = (a0) q0Var;
            h.s();
            Metadata metadataA11 = b.a(a0Var.f194711f);
            Instant instant19 = a0Var.f194706a;
            Instant instant20 = a0Var.f194708c;
            Volume volumeFromLiters = Volume.fromLiters(a0Var.f194710e.a());
            volumeFromLiters.getClass();
            HydrationRecord.Builder builderD = h.d(metadataA11, instant19, instant20, volumeFromLiters);
            ZoneOffset zoneOffset34 = a0Var.f194707b;
            if (zoneOffset34 != null) {
                builderD.setStartZoneOffset(zoneOffset34);
            }
            ZoneOffset zoneOffset35 = a0Var.f194709d;
            if (zoneOffset35 != null) {
                builderD.setEndZoneOffset(zoneOffset35);
            }
            HydrationRecord hydrationRecordBuild = builderD.build();
            hydrationRecordBuild.getClass();
            return hydrationRecordBuild;
        }
        if (q0Var instanceof c0) {
            c0 c0Var = (c0) q0Var;
            h.u();
            IntermenstrualBleedingRecord.Builder builderE2 = h.e(b.a(c0Var.f194736c), c0Var.f194734a);
            ZoneOffset zoneOffset36 = c0Var.f194735b;
            if (zoneOffset36 != null) {
                builderE2.setZoneOffset(zoneOffset36);
            }
            IntermenstrualBleedingRecord intermenstrualBleedingRecordBuild = builderE2.build();
            intermenstrualBleedingRecordBuild.getClass();
            return intermenstrualBleedingRecordBuild;
        }
        if (q0Var instanceof e0) {
            e0 e0Var = (e0) q0Var;
            i.q();
            LeanBodyMassRecord.Builder builderC = i.c(b.a(e0Var.f194770d), e0Var.f194767a, o.c(e0Var.f194769c));
            ZoneOffset zoneOffset37 = e0Var.f194768b;
            if (zoneOffset37 != null) {
                builderC.setZoneOffset(zoneOffset37);
            }
            LeanBodyMassRecord leanBodyMassRecordBuild = builderC.build();
            leanBodyMassRecordBuild.getClass();
            return leanBodyMassRecordBuild;
        }
        if (q0Var instanceof g0) {
            g0 g0Var = (g0) q0Var;
            h.w();
            Metadata metadataA12 = b.a(g0Var.f194803c);
            Instant instant21 = g0Var.f194801a;
            Integer num16 = (Integer) a.f163134f.get(Integer.valueOf(g0Var.f194804d));
            MenstruationFlowRecord.Builder builderF = h.f(metadataA12, instant21, num16 != null ? num16.intValue() : 0);
            ZoneOffset zoneOffset38 = g0Var.f194802b;
            if (zoneOffset38 != null) {
                builderF.setZoneOffset(zoneOffset38);
            }
            MenstruationFlowRecord menstruationFlowRecordBuild = builderF.build();
            menstruationFlowRecordBuild.getClass();
            return menstruationFlowRecordBuild;
        }
        if (q0Var instanceof h0) {
            h0 h0Var = (h0) q0Var;
            h.v();
            MenstruationPeriodRecord.Builder builderG2 = h.g(b.a(h0Var.f194812e), h0Var.f194808a, h0Var.f194810c);
            ZoneOffset zoneOffset39 = h0Var.f194809b;
            if (zoneOffset39 != null) {
                builderG2.setStartZoneOffset(zoneOffset39);
            }
            ZoneOffset zoneOffset40 = h0Var.f194811d;
            if (zoneOffset40 != null) {
                builderG2.setEndZoneOffset(zoneOffset40);
            }
            MenstruationPeriodRecord menstruationPeriodRecordBuild = builderG2.build();
            menstruationPeriodRecordBuild.getClass();
            return menstruationPeriodRecordBuild;
        }
        if (q0Var instanceof j0) {
            return a((j0) q0Var);
        }
        if (q0Var instanceof k0) {
            k0 k0Var = (k0) q0Var;
            h.r();
            Metadata metadataA13 = b.a(k0Var.f194871d);
            Instant instant22 = k0Var.f194868a;
            Integer num17 = (Integer) a.f163137i.get(Integer.valueOf(k0Var.f194870c));
            OvulationTestRecord.Builder builderI2 = h.i(metadataA13, instant22, num17 != null ? num17.intValue() : 0);
            ZoneOffset zoneOffset41 = k0Var.f194869b;
            if (zoneOffset41 != null) {
                builderI2.setZoneOffset(zoneOffset41);
            }
            OvulationTestRecord ovulationTestRecordBuild = builderI2.build();
            ovulationTestRecordBuild.getClass();
            return ovulationTestRecordBuild;
        }
        if (q0Var instanceof l0) {
            l0 l0Var = (l0) q0Var;
            i.m();
            Metadata metadataA14 = b.a(l0Var.f194884d);
            Instant instant23 = l0Var.f194881a;
            Percentage percentageFromValue2 = Percentage.fromValue(l0Var.f194883c.f25985a);
            percentageFromValue2.getClass();
            OxygenSaturationRecord.Builder builderD2 = i.d(metadataA14, instant23, percentageFromValue2);
            ZoneOffset zoneOffset42 = l0Var.f194882b;
            if (zoneOffset42 != null) {
                builderD2.setZoneOffset(zoneOffset42);
            }
            OxygenSaturationRecord oxygenSaturationRecordBuild = builderD2.build();
            oxygenSaturationRecordBuild.getClass();
            return oxygenSaturationRecordBuild;
        }
        if (q0Var instanceof p0) {
            p0 p0Var = (p0) q0Var;
            Metadata metadataA15 = b.a(p0Var.f194943f);
            Instant instant24 = p0Var.f194938a;
            Instant instant25 = p0Var.f194940c;
            List<p0.e> list10 = p0Var.f194942e;
            ArrayList arrayList11 = new ArrayList(y.r(list10, 10));
            for (p0.e eVar3 : list10) {
                h.t();
                arrayList11.add(h.j(o.d(eVar3.f194945b), eVar3.f194944a));
            }
            PowerRecord.Builder builderC2 = j.c(metadataA15, instant24, instant25, arrayList11);
            ZoneOffset zoneOffset43 = p0Var.f194939b;
            if (zoneOffset43 != null) {
                builderC2.setStartZoneOffset(zoneOffset43);
            }
            ZoneOffset zoneOffset44 = p0Var.f194941d;
            if (zoneOffset44 != null) {
                builderC2.setEndZoneOffset(zoneOffset44);
            }
            PowerRecord powerRecordBuild = builderC2.build();
            powerRecordBuild.getClass();
            return powerRecordBuild;
        }
        if (q0Var instanceof r0) {
            r0 r0Var = (r0) q0Var;
            i.j();
            RespiratoryRateRecord.Builder builderE3 = i.e(b.a(r0Var.f194962d), r0Var.f194959a, r0Var.f194961c);
            ZoneOffset zoneOffset45 = r0Var.f194960b;
            if (zoneOffset45 != null) {
                builderE3.setZoneOffset(zoneOffset45);
            }
            RespiratoryRateRecord respiratoryRateRecordBuild = builderE3.build();
            respiratoryRateRecordBuild.getClass();
            return respiratoryRateRecordBuild;
        }
        if (q0Var instanceof s0) {
            s0 s0Var = (s0) q0Var;
            i.l();
            RestingHeartRateRecord.Builder builderF2 = i.f(b.a(s0Var.f194973d), s0Var.f194970a, s0Var.f194972c);
            ZoneOffset zoneOffset46 = s0Var.f194971b;
            if (zoneOffset46 != null) {
                builderF2.setZoneOffset(zoneOffset46);
            }
            RestingHeartRateRecord restingHeartRateRecordBuild = builderF2.build();
            restingHeartRateRecordBuild.getClass();
            return restingHeartRateRecordBuild;
        }
        if (q0Var instanceof u0) {
            u0 u0Var = (u0) q0Var;
            h.A();
            Metadata metadataA16 = b.a(u0Var.f194989c);
            Instant instant26 = u0Var.f194987a;
            Integer num18 = (Integer) a.f163139k.get(Integer.valueOf(u0Var.f194990d));
            SexualActivityRecord.Builder builderK2 = h.k(metadataA16, instant26, num18 != null ? num18.intValue() : 0);
            ZoneOffset zoneOffset47 = u0Var.f194988b;
            if (zoneOffset47 != null) {
                builderK2.setZoneOffset(zoneOffset47);
            }
            SexualActivityRecord sexualActivityRecordBuild = builderK2.build();
            sexualActivityRecordBuild.getClass();
            return sexualActivityRecordBuild;
        }
        if (q0Var instanceof w0) {
            w0 w0Var = (w0) q0Var;
            h.q();
            SleepSessionRecord.Builder builderL = h.l(b.a(w0Var.f195035e), w0Var.f195031a, w0Var.f195033c);
            ZoneOffset zoneOffset48 = w0Var.f195032b;
            if (zoneOffset48 != null) {
                builderL.setStartZoneOffset(zoneOffset48);
            }
            ZoneOffset zoneOffset49 = w0Var.f195034d;
            if (zoneOffset49 != null) {
                builderL.setEndZoneOffset(zoneOffset49);
            }
            String str8 = w0Var.f195037g;
            if (str8 != null) {
                builderL.setNotes(str8);
            }
            String str9 = w0Var.f195036f;
            if (str9 != null) {
                builderL.setTitle(str9);
            }
            List<w0.b> list11 = w0Var.f195038h;
            ArrayList arrayList12 = new ArrayList(y.r(list11, 10));
            for (w0.b bVar6 : list11) {
                j.s();
                Instant instant27 = bVar6.f195039a;
                Instant instant28 = bVar6.f195040b;
                Integer num19 = (Integer) a.f163144p.get(Integer.valueOf(bVar6.f195041c));
                arrayList12.add(j.e(instant27, instant28, num19 != null ? num19.intValue() : 0));
            }
            builderL.setStages(arrayList12);
            SleepSessionRecord sleepSessionRecordBuild = builderL.build();
            sleepSessionRecordBuild.getClass();
            return sleepSessionRecordBuild;
        }
        if (q0Var instanceof x0) {
            x0 x0Var = (x0) q0Var;
            Metadata metadataA17 = b.a(x0Var.f195057f);
            Instant instant29 = x0Var.f195052a;
            Instant instant30 = x0Var.f195054c;
            List<x0.e> list12 = x0Var.f195056e;
            ArrayList arrayList13 = new ArrayList(y.r(list12, 10));
            for (x0.e eVar4 : list12) {
                f.t();
                Velocity velocityFromMetersPerSecond3 = Velocity.fromMetersPerSecond(eVar4.f195059b.a());
                velocityFromMetersPerSecond3.getClass();
                arrayList13.add(f.f(velocityFromMetersPerSecond3, eVar4.f195058a));
            }
            SpeedRecord.Builder builderF3 = j.f(metadataA17, instant29, instant30, arrayList13);
            ZoneOffset zoneOffset50 = x0Var.f195053b;
            if (zoneOffset50 != null) {
                builderF3.setStartZoneOffset(zoneOffset50);
            }
            ZoneOffset zoneOffset51 = x0Var.f195055d;
            if (zoneOffset51 != null) {
                builderF3.setEndZoneOffset(zoneOffset51);
            }
            SpeedRecord speedRecordBuild = builderF3.build();
            speedRecordBuild.getClass();
            return speedRecordBuild;
        }
        if (q0Var instanceof y0) {
            return d((y0) q0Var);
        }
        if (!(q0Var instanceof z0)) {
            if (q0Var instanceof a1) {
                return e((a1) q0Var);
            }
            if (q0Var instanceof c1) {
                return f((c1) q0Var);
            }
            if (q0Var instanceof d1) {
                return g((d1) q0Var);
            }
            if (q0Var instanceof e1) {
                return h((e1) q0Var);
            }
            com.google.firebase.messaging.l.j(q0Var, "Unsupported record ");
            return null;
        }
        z0 z0Var = (z0) q0Var;
        i.i();
        StepsRecord.Builder builderG3 = i.g(b.a(z0Var.f195082f), z0Var.f195077a, z0Var.f195079c, z0Var.f195081e);
        ZoneOffset zoneOffset52 = z0Var.f195078b;
        if (zoneOffset52 != null) {
            builderG3.setStartZoneOffset(zoneOffset52);
        }
        ZoneOffset zoneOffset53 = z0Var.f195080d;
        if (zoneOffset53 != null) {
            builderG3.setEndZoneOffset(zoneOffset53);
        }
        StepsRecord stepsRecordBuild = builderG3.build();
        stepsRecordBuild.getClass();
        return stepsRecordBuild;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.Map] */
    public static final Class<? extends Record> c(k23.d<? extends q0> dVar) {
        dVar.getClass();
        Class<? extends Record> cls = !b1.a() ? null : m.f163154c.get(dVar);
        if (cls == null) {
            cls = SdkExtensions.getExtensionVersion(34) >= 15 ? m.f163153b.get(dVar) : null;
            if (cls == null) {
                Class<? extends Record> cls2 = SdkExtensions.getExtensionVersion(34) >= 13 ? (Class) m.f163152a.get(dVar) : null;
                if (cls2 != null) {
                    return cls2;
                }
                Class<? extends Record> cls3 = (Class) m.f163155d.get(dVar);
                if (cls3 != null) {
                    return cls3;
                }
                vb.h.s(p6.b.e("Unsupported record type ", dVar));
                return null;
            }
        }
        return cls;
    }

    public static final StepsCadenceRecord d(y0 y0Var) {
        Metadata metadataA = b.a(y0Var.f195069f);
        Instant instant = y0Var.f195064a;
        Instant instant2 = y0Var.f195066c;
        List<y0.b> list = y0Var.f195068e;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        for (y0.b bVar : list) {
            h.y();
            arrayList.add(h.n(bVar.f195070a, bVar.f195071b));
        }
        StepsCadenceRecord.Builder builderM = h.m(metadataA, instant, instant2, arrayList);
        ZoneOffset zoneOffset = y0Var.f195065b;
        if (zoneOffset != null) {
            builderM.setStartZoneOffset(zoneOffset);
        }
        ZoneOffset zoneOffset2 = y0Var.f195067d;
        if (zoneOffset2 != null) {
            builderM.setEndZoneOffset(zoneOffset2);
        }
        StepsCadenceRecord stepsCadenceRecordBuild = builderM.build();
        stepsCadenceRecordBuild.getClass();
        return stepsCadenceRecordBuild;
    }

    public static final TotalCaloriesBurnedRecord e(a1 a1Var) {
        j.j();
        TotalCaloriesBurnedRecord.Builder builderG = j.g(b.a(a1Var.f194718f), a1Var.f194713a, a1Var.f194715c, o.a(a1Var.f194717e));
        ZoneOffset zoneOffset = a1Var.f194714b;
        if (zoneOffset != null) {
            builderG.setStartZoneOffset(zoneOffset);
        }
        ZoneOffset zoneOffset2 = a1Var.f194716d;
        if (zoneOffset2 != null) {
            builderG.setEndZoneOffset(zoneOffset2);
        }
        TotalCaloriesBurnedRecord totalCaloriesBurnedRecordBuild = builderG.build();
        totalCaloriesBurnedRecordBuild.getClass();
        return totalCaloriesBurnedRecordBuild;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final Vo2MaxRecord f(c1 c1Var) {
        h.z();
        Metadata metadataA = b.a(c1Var.f194741c);
        Instant instant = c1Var.f194739a;
        Integer num = (Integer) a.f163133e.get(Integer.valueOf(c1Var.f194743e));
        Vo2MaxRecord.Builder builderO = h.o(metadataA, instant, num != null ? num.intValue() : 0, c1Var.f194742d);
        ZoneOffset zoneOffset = c1Var.f194740b;
        if (zoneOffset != null) {
            builderO.setZoneOffset(zoneOffset);
        }
        Vo2MaxRecord vo2MaxRecordBuild = builderO.build();
        vo2MaxRecordBuild.getClass();
        return vo2MaxRecordBuild;
    }

    public static final WeightRecord g(d1 d1Var) {
        e.f();
        WeightRecord.Builder builderE = e.e(b.a(d1Var.f194753d), d1Var.f194750a, o.c(d1Var.f194752c));
        ZoneOffset zoneOffset = d1Var.f194751b;
        if (zoneOffset != null) {
            builderE.setZoneOffset(zoneOffset);
        }
        WeightRecord weightRecordBuild = builderE.build();
        weightRecordBuild.getClass();
        return weightRecordBuild;
    }

    public static final WheelchairPushesRecord h(e1 e1Var) {
        i.p();
        WheelchairPushesRecord.Builder builderH = i.h(b.a(e1Var.f194776f), e1Var.f194771a, e1Var.f194773c, e1Var.f194775e);
        ZoneOffset zoneOffset = e1Var.f194772b;
        if (zoneOffset != null) {
            builderH.setStartZoneOffset(zoneOffset);
        }
        ZoneOffset zoneOffset2 = e1Var.f194774d;
        if (zoneOffset2 != null) {
            builderH.setEndZoneOffset(zoneOffset2);
        }
        WheelchairPushesRecord wheelchairPushesRecordBuild = builderH.build();
        wheelchairPushesRecordBuild.getClass();
        return wheelchairPushesRecordBuild;
    }
}
