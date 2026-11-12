package w8;

import d53.w;
import java.util.ArrayList;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.d0;
import p13.u0;
import y8.a0;
import y8.a1;
import y8.c0;
import y8.c1;
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
import y8.n0;
import y8.o;
import y8.p0;
import y8.r0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lw8/a;", "", "<init>", "()V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3399a f183535a = new C3399a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f183536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q13.b f183537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q13.b f183538d;

    static {
        t0 t0Var = s0.f105811a;
        Map mapE = u0.e(new p(t0Var.b(y8.a.class), w.c0("android.permission.health.READ_ACTIVE_CALORIES_BURNED", "android.permission.health.READ_", "android.permission.health.READ_ACTIVE_CALORIES_BURNED")), new p(t0Var.b(y8.c.class), w.c0("android.permission.health.READ_BASAL_BODY_TEMPERATURE", "android.permission.health.READ_", "android.permission.health.READ_BASAL_BODY_TEMPERATURE")), new p(t0Var.b(y8.d.class), w.c0("android.permission.health.READ_BASAL_METABOLIC_RATE", "android.permission.health.READ_", "android.permission.health.READ_BASAL_METABOLIC_RATE")), new p(t0Var.b(e.class), w.c0("android.permission.health.READ_BLOOD_GLUCOSE", "android.permission.health.READ_", "android.permission.health.READ_BLOOD_GLUCOSE")), new p(t0Var.b(f.class), w.c0("android.permission.health.READ_BLOOD_PRESSURE", "android.permission.health.READ_", "android.permission.health.READ_BLOOD_PRESSURE")), new p(t0Var.b(g.class), w.c0("android.permission.health.READ_BODY_FAT", "android.permission.health.READ_", "android.permission.health.READ_BODY_FAT")), new p(t0Var.b(i.class), w.c0("android.permission.health.READ_BODY_TEMPERATURE", "android.permission.health.READ_", "android.permission.health.READ_BODY_TEMPERATURE")), new p(t0Var.b(j.class), w.c0("android.permission.health.READ_BODY_WATER_MASS", "android.permission.health.READ_", "android.permission.health.READ_BODY_WATER_MASS")), new p(t0Var.b(k.class), w.c0("android.permission.health.READ_BONE_MASS", "android.permission.health.READ_", "android.permission.health.READ_BONE_MASS")), new p(t0Var.b(l.class), w.c0("android.permission.health.READ_CERVICAL_MUCUS", "android.permission.health.READ_", "android.permission.health.READ_CERVICAL_MUCUS")), new p(t0Var.b(m.class), w.c0("android.permission.health.READ_EXERCISE", "android.permission.health.READ_", "android.permission.health.READ_EXERCISE")), new p(t0Var.b(n.class), w.c0("android.permission.health.READ_DISTANCE", "android.permission.health.READ_", "android.permission.health.READ_DISTANCE")), new p(t0Var.b(o.class), w.c0("android.permission.health.READ_ELEVATION_GAINED", "android.permission.health.READ_", "android.permission.health.READ_ELEVATION_GAINED")), new p(t0Var.b(v.class), w.c0("android.permission.health.READ_EXERCISE", "android.permission.health.READ_", "android.permission.health.READ_EXERCISE")), new p(t0Var.b(y8.w.class), w.c0("android.permission.health.READ_FLOORS_CLIMBED", "android.permission.health.READ_", "android.permission.health.READ_FLOORS_CLIMBED")), new p(t0Var.b(x.class), w.c0("android.permission.health.READ_HEART_RATE", "android.permission.health.READ_", "android.permission.health.READ_HEART_RATE")), new p(t0Var.b(y.class), w.c0("android.permission.health.READ_HEART_RATE_VARIABILITY", "android.permission.health.READ_", "android.permission.health.READ_HEART_RATE_VARIABILITY")), new p(t0Var.b(z.class), w.c0("android.permission.health.READ_HEIGHT", "android.permission.health.READ_", "android.permission.health.READ_HEIGHT")), new p(t0Var.b(a0.class), w.c0("android.permission.health.READ_HYDRATION", "android.permission.health.READ_", "android.permission.health.READ_HYDRATION")), new p(t0Var.b(c0.class), w.c0("android.permission.health.READ_INTERMENSTRUAL_BLEEDING", "android.permission.health.READ_", "android.permission.health.READ_INTERMENSTRUAL_BLEEDING")), new p(t0Var.b(e0.class), w.c0("android.permission.health.READ_LEAN_BODY_MASS", "android.permission.health.READ_", "android.permission.health.READ_LEAN_BODY_MASS")), new p(t0Var.b(g0.class), w.c0("android.permission.health.READ_MENSTRUATION", "android.permission.health.READ_", "android.permission.health.READ_MENSTRUATION")), new p(t0Var.b(h0.class), w.c0("android.permission.health.READ_MENSTRUATION", "android.permission.health.READ_", "android.permission.health.READ_MENSTRUATION")), new p(t0Var.b(i0.class), w.c0("android.permission.health.READ_MINDFULNESS", "android.permission.health.READ_", "android.permission.health.READ_MINDFULNESS")), new p(t0Var.b(j0.class), w.c0("android.permission.health.READ_NUTRITION", "android.permission.health.READ_", "android.permission.health.READ_NUTRITION")), new p(t0Var.b(k0.class), w.c0("android.permission.health.READ_OVULATION_TEST", "android.permission.health.READ_", "android.permission.health.READ_OVULATION_TEST")), new p(t0Var.b(l0.class), w.c0("android.permission.health.READ_OXYGEN_SATURATION", "android.permission.health.READ_", "android.permission.health.READ_OXYGEN_SATURATION")), new p(t0Var.b(n0.class), w.c0("android.permission.health.READ_PLANNED_EXERCISE", "android.permission.health.READ_", "android.permission.health.READ_PLANNED_EXERCISE")), new p(t0Var.b(p0.class), w.c0("android.permission.health.READ_POWER", "android.permission.health.READ_", "android.permission.health.READ_POWER")), new p(t0Var.b(r0.class), w.c0("android.permission.health.READ_RESPIRATORY_RATE", "android.permission.health.READ_", "android.permission.health.READ_RESPIRATORY_RATE")), new p(t0Var.b(y8.s0.class), w.c0("android.permission.health.READ_RESTING_HEART_RATE", "android.permission.health.READ_", "android.permission.health.READ_RESTING_HEART_RATE")), new p(t0Var.b(y8.u0.class), w.c0("android.permission.health.READ_SEXUAL_ACTIVITY", "android.permission.health.READ_", "android.permission.health.READ_SEXUAL_ACTIVITY")), new p(t0Var.b(w0.class), w.c0("android.permission.health.READ_SLEEP", "android.permission.health.READ_", "android.permission.health.READ_SLEEP")), new p(t0Var.b(x0.class), w.c0("android.permission.health.READ_SPEED", "android.permission.health.READ_", "android.permission.health.READ_SPEED")), new p(t0Var.b(v0.class), w.c0("android.permission.health.READ_SKIN_TEMPERATURE", "android.permission.health.READ_", "android.permission.health.READ_SKIN_TEMPERATURE")), new p(t0Var.b(y0.class), w.c0("android.permission.health.READ_STEPS", "android.permission.health.READ_", "android.permission.health.READ_STEPS")), new p(t0Var.b(z0.class), w.c0("android.permission.health.READ_STEPS", "android.permission.health.READ_", "android.permission.health.READ_STEPS")), new p(t0Var.b(a1.class), w.c0("android.permission.health.READ_TOTAL_CALORIES_BURNED", "android.permission.health.READ_", "android.permission.health.READ_TOTAL_CALORIES_BURNED")), new p(t0Var.b(c1.class), w.c0("android.permission.health.READ_VO2_MAX", "android.permission.health.READ_", "android.permission.health.READ_VO2_MAX")), new p(t0Var.b(d1.class), w.c0("android.permission.health.READ_WEIGHT", "android.permission.health.READ_", "android.permission.health.READ_WEIGHT")), new p(t0Var.b(e1.class), w.c0("android.permission.health.READ_WHEELCHAIR_PUSHES", "android.permission.health.READ_", "android.permission.health.READ_WHEELCHAIR_PUSHES")), new p(t0Var.b(y8.b.class), w.c0("android.permission.health.READ_ACTIVITY_INTENSITY", "android.permission.health.READ_", "android.permission.health.READ_ACTIVITY_INTENSITY")));
        f183536b = mapE;
        q13.b bVarB = p13.w.b();
        bVarB.add("android.permission.health.WRITE_MEDICAL_DATA");
        bVarB.add("android.permission.health.READ_MEDICAL_DATA_ALLERGIES_INTOLERANCES");
        bVarB.add("android.permission.health.READ_MEDICAL_DATA_CONDITIONS");
        bVarB.add("android.permission.health.READ_MEDICAL_DATA_LABORATORY_RESULTS");
        bVarB.add("android.permission.health.READ_MEDICAL_DATA_MEDICATIONS");
        bVarB.add("android.permission.health.READ_MEDICAL_DATA_PERSONAL_DETAILS");
        bVarB.add("android.permission.health.READ_MEDICAL_DATA_PRACTITIONER_DETAILS");
        bVarB.add("android.permission.health.READ_MEDICAL_DATA_PREGNANCY");
        bVarB.add("android.permission.health.READ_MEDICAL_DATA_PROCEDURES");
        bVarB.add("android.permission.health.READ_MEDICAL_DATA_SOCIAL_HISTORY");
        bVarB.add("android.permission.health.READ_MEDICAL_DATA_VACCINES");
        bVarB.add("android.permission.health.READ_MEDICAL_DATA_VISITS");
        bVarB.add("android.permission.health.READ_MEDICAL_DATA_VITAL_SIGNS");
        f183537c = p13.w.a(bVarB);
        q13.b bVarB2 = p13.w.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapE.entrySet()) {
            d0.v(arrayList, p13.x.k("android.permission.health.WRITE_" + ((String) entry.getValue()), "android.permission.health.READ_" + ((String) entry.getValue())));
        }
        bVarB2.addAll(arrayList);
        bVarB2.addAll(f183537c);
        bVarB2.add("android.permission.health.WRITE_EXERCISE_ROUTE");
        bVarB2.add("android.permission.health.READ_HEALTH_DATA_IN_BACKGROUND");
        bVarB2.add("android.permission.health.READ_HEALTH_DATA_HISTORY");
        bVarB2.add("android.permission.health.READ_EXERCISE_ROUTES");
        f183538d = p13.w.a(bVarB2);
    }

    /* JADX INFO: renamed from: w8.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bV\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u0014\u0010*\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010\u0006R\u0014\u0010,\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010\u0006R\u0014\u00102\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u0014\u00103\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u0010\u0006R\u0014\u00104\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u0010\u0006R\u0014\u00105\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010\u0006R\u0014\u00106\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u0010\u0006R\u0014\u00107\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u0010\u0006R\u0014\u00108\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u0010\u0006R\u0014\u00109\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u0010\u0006R\u0014\u0010:\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u0010\u0006R\u0014\u0010;\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u0010\u0006R\u0014\u0010<\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010\u0006R\u0014\u0010=\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u0010\u0006R\u0014\u0010>\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010\u0006R\u0014\u0010?\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b?\u0010\u0006R\u0014\u0010@\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u0010\u0006R\u0014\u0010A\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u0010\u0006R\u0014\u0010B\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u0010\u0006R\u0014\u0010C\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u0010\u0006R\u0014\u0010D\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bD\u0010\u0006R\u0014\u0010E\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010\u0006R\u0014\u0010F\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u0010\u0006R\u0014\u0010G\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010\u0006R\u0014\u0010H\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bH\u0010\u0006R\u0014\u0010I\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bI\u0010\u0006R\u0014\u0010J\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bJ\u0010\u0006R\u0014\u0010K\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bK\u0010\u0006R\u0014\u0010L\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bL\u0010\u0006R\u0014\u0010M\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bM\u0010\u0006R\u0014\u0010N\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bN\u0010\u0006R\u0014\u0010O\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bO\u0010\u0006R\u0014\u0010P\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bP\u0010\u0006R\u0014\u0010Q\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bQ\u0010\u0006R\u0014\u0010R\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bR\u0010\u0006R\u0014\u0010S\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bS\u0010\u0006R\u0014\u0010T\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bT\u0010\u0006R\u0014\u0010U\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bU\u0010\u0006R\u0014\u0010V\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bV\u0010\u0006R\u0014\u0010W\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bW\u0010\u0006R\u0014\u0010X\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bX\u0010\u0006R\u0014\u0010Y\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bY\u0010\u0006R\u0014\u0010Z\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bZ\u0010\u0006R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00040[8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006^"}, d2 = {"Lw8/a$a;", "", "<init>", "()V", "", "PERMISSION_PREFIX", "Ljava/lang/String;", "PERMISSION_WRITE_EXERCISE_ROUTE", "PERMISSION_READ_EXERCISE_ROUTES", "PERMISSION_READ_HEALTH_DATA_IN_BACKGROUND", "PERMISSION_READ_HEALTH_DATA_HISTORY", "READ_ACTIVE_CALORIES_BURNED", "READ_DISTANCE", "READ_ELEVATION_GAINED", "READ_EXERCISE", "READ_FLOORS_CLIMBED", "READ_STEPS", "READ_TOTAL_CALORIES_BURNED", "READ_VO2_MAX", "READ_WHEELCHAIR_PUSHES", "READ_PLANNED_EXERCISE", "READ_POWER", "READ_SPEED", "READ_ACTIVITY_INTENSITY", "READ_BASAL_METABOLIC_RATE", "READ_BODY_FAT", "READ_BODY_WATER_MASS", "READ_BONE_MASS", "READ_HEIGHT", "READ_LEAN_BODY_MASS", "READ_WEIGHT", "READ_CERVICAL_MUCUS", "READ_INTERMENSTRUAL_BLEEDING", "READ_MENSTRUATION", "READ_OVULATION_TEST", "READ_SEXUAL_ACTIVITY", "READ_MINDFULNESS_SESSION", "READ_HYDRATION", "READ_NUTRITION", "READ_SLEEP", "READ_BASAL_BODY_TEMPERATURE", "READ_BLOOD_GLUCOSE", "READ_BLOOD_PRESSURE", "READ_BODY_TEMPERATURE", "READ_HEART_RATE", "READ_HEART_RATE_VARIABILITY", "READ_OXYGEN_SATURATION", "READ_RESPIRATORY_RATE", "READ_RESTING_HEART_RATE", "READ_SKIN_TEMPERATURE", "WRITE_ACTIVE_CALORIES_BURNED", "WRITE_DISTANCE", "WRITE_ELEVATION_GAINED", "WRITE_EXERCISE", "WRITE_FLOORS_CLIMBED", "WRITE_STEPS", "WRITE_TOTAL_CALORIES_BURNED", "WRITE_VO2_MAX", "WRITE_WHEELCHAIR_PUSHES", "WRITE_PLANNED_EXERCISE", "WRITE_POWER", "WRITE_SPEED", "WRITE_ACTIVITY_INTENSITY", "WRITE_BASAL_METABOLIC_RATE", "WRITE_BODY_FAT", "WRITE_BODY_WATER_MASS", "WRITE_BONE_MASS", "WRITE_HEIGHT", "WRITE_LEAN_BODY_MASS", "WRITE_WEIGHT", "WRITE_CERVICAL_MUCUS", "WRITE_INTERMENSTRUAL_BLEEDING", "WRITE_MENSTRUATION", "WRITE_OVULATION_TEST", "WRITE_SEXUAL_ACTIVITY", "WRITE_HYDRATION", "WRITE_NUTRITION", "WRITE_MINDFULNESS_SESSION", "WRITE_SLEEP", "WRITE_BASAL_BODY_TEMPERATURE", "WRITE_BLOOD_GLUCOSE", "WRITE_BLOOD_PRESSURE", "WRITE_BODY_TEMPERATURE", "WRITE_HEART_RATE", "WRITE_HEART_RATE_VARIABILITY", "WRITE_OXYGEN_SATURATION", "WRITE_RESPIRATORY_RATE", "WRITE_RESTING_HEART_RATE", "WRITE_SKIN_TEMPERATURE", "READ_PERMISSION_PREFIX", "WRITE_PERMISSION_PREFIX", "", "ALL_PERMISSIONS", "Ljava/util/List;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C3399a {
        public /* synthetic */ C3399a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        public static String a(k23.d dVar) {
            dVar.getClass();
            ?? r14 = a.f183536b;
            if (r14.get(dVar) == null) {
                org.apache.commons.lang3.e.l("Given recordType is not valid : ", dVar, ".simpleName");
                return null;
            }
            return "android.permission.health.WRITE_" + ((String) r14.getOrDefault(dVar, ""));
        }

        private C3399a() {
        }
    }
}
