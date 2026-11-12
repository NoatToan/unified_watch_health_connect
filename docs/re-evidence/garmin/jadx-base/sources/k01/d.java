package k01;

import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g21.u;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u009f\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001dB\u008b\u0002\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!¨\u0006%"}, d2 = {"Lk01/d;", "", "", "calories", "adjustedCalories", "", "fat", "protein", "carbs", "adjustedCarbs", "adjustedFat", "adjustedProtein", "defaultGoalPercentage", "fiber", "sugar", "addedSugars", "saturatedFat", "monounsaturatedFat", "polyunsaturatedFat", "transFat", "cholesterol", "sodium", "potassium", "iron", "calcium", "vitaminA", "vitaminC", "vitaminD", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f102022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f102023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f102024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f102025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f102026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f102027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f102028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f102029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Double f102030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f102031j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Double f102032k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f102033l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Double f102034m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Double f102035n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Double f102036o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Double f102037p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Double f102038q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Double f102039r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Double f102040s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Double f102041t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Double f102042u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Double f102043v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Double f102044w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Double f102045x;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/reports/NutritionGoalsDTO.$serializer", "Lm63/e0;", "Lk01/d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f102046a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f102046a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.reports.NutritionGoalsDTO", aVar, 24);
            m1Var.j("calories", false);
            m1Var.j("adjustedCalories", true);
            m1Var.j("fat", false);
            m1Var.j("protein", false);
            m1Var.j("carbs", false);
            m1Var.j("adjustedCarbs", true);
            m1Var.j("adjustedFat", true);
            m1Var.j("adjustedProtein", true);
            m1Var.j("defaultGoalPercentage", true);
            m1Var.j("fiber", true);
            m1Var.j("sugar", true);
            m1Var.j("addedSugars", true);
            m1Var.j("saturatedFat", true);
            m1Var.j("monounsaturatedFat", true);
            m1Var.j("polyunsaturatedFat", true);
            m1Var.j("transFat", true);
            m1Var.j("cholesterol", true);
            m1Var.j("sodium", true);
            m1Var.j("potassium", true);
            m1Var.j("iron", true);
            m1Var.j("calcium", true);
            m1Var.j("vitaminA", true);
            m1Var.j("vitaminC", true);
            m1Var.j("vitaminD", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m0 m0Var = m0.f116981a;
            i63.c<?> cVarD = j63.a.d(m0Var);
            i63.c<?> cVarD2 = j63.a.d(m0Var);
            x xVar = x.f117036a;
            return new i63.c[]{cVarD, cVarD2, j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            int i14;
            Double d14;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i15 = l63.c.f110557a;
            Double d15 = null;
            Double d16 = null;
            Double d17 = null;
            Double d18 = null;
            Double d19 = null;
            int i16 = 0;
            Double d24 = null;
            Double d25 = null;
            Double d26 = null;
            Double d27 = null;
            Double d28 = null;
            Double d29 = null;
            Double d34 = null;
            Double d35 = null;
            boolean z14 = true;
            Integer num = null;
            Integer num2 = null;
            Double d36 = null;
            Double d37 = null;
            Double d38 = null;
            Double d39 = null;
            Double d44 = null;
            Double d45 = null;
            Double d46 = null;
            Double d47 = null;
            Double d48 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        d16 = d16;
                        d18 = d18;
                        z14 = false;
                        d17 = d17;
                        d18 = d18;
                        d16 = d16;
                        break;
                    case 0:
                        d14 = d15;
                        num = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num);
                        i16 |= 1;
                        d17 = d17;
                        d15 = d14;
                        d18 = d18;
                        d16 = d16;
                        break;
                    case 1:
                        d14 = d15;
                        num2 = (Integer) cVarC.v(eVar2, 1, m0.f116981a, num2);
                        i16 |= 2;
                        d36 = d36;
                        d15 = d14;
                        d18 = d18;
                        d16 = d16;
                        break;
                    case 2:
                        d14 = d15;
                        d36 = (Double) cVarC.v(eVar2, 2, x.f117036a, d36);
                        i16 |= 4;
                        d15 = d14;
                        d18 = d18;
                        d16 = d16;
                        break;
                    case 3:
                        d14 = d15;
                        d37 = (Double) cVarC.v(eVar2, 3, x.f117036a, d37);
                        i16 |= 8;
                        d15 = d14;
                        d18 = d18;
                        d16 = d16;
                        break;
                    case 4:
                        d14 = d15;
                        d38 = (Double) cVarC.v(eVar2, 4, x.f117036a, d38);
                        i16 |= 16;
                        d15 = d14;
                        d18 = d18;
                        d16 = d16;
                        break;
                    case 5:
                        d14 = d15;
                        d39 = (Double) cVarC.v(eVar2, 5, x.f117036a, d39);
                        i16 |= 32;
                        d15 = d14;
                        d18 = d18;
                        d16 = d16;
                        break;
                    case 6:
                        d14 = d15;
                        d44 = (Double) cVarC.v(eVar2, 6, x.f117036a, d44);
                        i16 |= 64;
                        d15 = d14;
                        d18 = d18;
                        d16 = d16;
                        break;
                    case 7:
                        d14 = d15;
                        d45 = (Double) cVarC.v(eVar2, 7, x.f117036a, d45);
                        i16 |= 128;
                        d15 = d14;
                        d18 = d18;
                        d16 = d16;
                        break;
                    case 8:
                        d14 = d15;
                        d46 = (Double) cVarC.v(eVar2, 8, x.f117036a, d46);
                        i16 |= 256;
                        d15 = d14;
                        d18 = d18;
                        d16 = d16;
                        break;
                    case 9:
                        d14 = d15;
                        d47 = (Double) cVarC.v(eVar2, 9, x.f117036a, d47);
                        i16 |= 512;
                        d15 = d14;
                        d18 = d18;
                        d16 = d16;
                        break;
                    case 10:
                        d14 = d15;
                        d48 = (Double) cVarC.v(eVar2, 10, x.f117036a, d48);
                        i16 |= 1024;
                        d15 = d14;
                        d18 = d18;
                        d16 = d16;
                        break;
                    case 11:
                        d16 = d16;
                        d18 = d18;
                        d15 = (Double) cVarC.v(eVar2, 11, x.f117036a, d15);
                        i16 |= 2048;
                        d18 = d18;
                        d16 = d16;
                        break;
                    case 12:
                        d16 = d16;
                        d18 = (Double) cVarC.v(eVar2, 12, x.f117036a, d18);
                        i16 |= 4096;
                        d15 = d15;
                        d16 = d16;
                        break;
                    case 13:
                        d15 = d15;
                        d18 = d18;
                        d24 = (Double) cVarC.v(eVar2, 13, x.f117036a, d24);
                        i16 |= 8192;
                        d15 = d15;
                        d18 = d18;
                        break;
                    case 14:
                        d15 = d15;
                        d18 = d18;
                        d25 = (Double) cVarC.v(eVar2, 14, x.f117036a, d25);
                        i16 |= 16384;
                        d15 = d15;
                        d18 = d18;
                        break;
                    case 15:
                        d26 = (Double) cVarC.v(eVar2, 15, x.f117036a, d26);
                        i14 = 32768;
                        i16 |= i14;
                        d15 = d15;
                        d18 = d18;
                        break;
                    case 16:
                        d27 = (Double) cVarC.v(eVar2, 16, x.f117036a, d27);
                        i14 = 65536;
                        i16 |= i14;
                        d15 = d15;
                        d18 = d18;
                        break;
                    case 17:
                        d28 = (Double) cVarC.v(eVar2, 17, x.f117036a, d28);
                        i14 = 131072;
                        i16 |= i14;
                        d15 = d15;
                        d18 = d18;
                        break;
                    case 18:
                        d29 = (Double) cVarC.v(eVar2, 18, x.f117036a, d29);
                        i14 = GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                        i16 |= i14;
                        d15 = d15;
                        d18 = d18;
                        break;
                    case 19:
                        d34 = (Double) cVarC.v(eVar2, 19, x.f117036a, d34);
                        i14 = 524288;
                        i16 |= i14;
                        d15 = d15;
                        d18 = d18;
                        break;
                    case 20:
                        d35 = (Double) cVarC.v(eVar2, 20, x.f117036a, d35);
                        i14 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        i16 |= i14;
                        d15 = d15;
                        d18 = d18;
                        break;
                    case 21:
                        d19 = (Double) cVarC.v(eVar2, 21, x.f117036a, d19);
                        i14 = 2097152;
                        i16 |= i14;
                        d15 = d15;
                        d18 = d18;
                        break;
                    case 22:
                        d17 = (Double) cVarC.v(eVar2, 22, x.f117036a, d17);
                        i14 = 4194304;
                        i16 |= i14;
                        d15 = d15;
                        d18 = d18;
                        break;
                    case 23:
                        d16 = (Double) cVarC.v(eVar2, 23, x.f117036a, d16);
                        i14 = 8388608;
                        i16 |= i14;
                        d15 = d15;
                        d18 = d18;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            Double d49 = d16;
            Double d54 = d18;
            Integer num3 = num;
            Integer num4 = num2;
            Double d55 = d36;
            cVarC.b(eVar2);
            Double d56 = d46;
            Double d57 = d34;
            Double d58 = d47;
            Double d59 = d35;
            Double d64 = d45;
            Double d65 = d29;
            return new d(i16, num3, num4, d55, d37, d38, d39, d44, d64, d56, d58, d48, d15, d54, d24, d25, d26, d27, d28, d65, d57, d59, d19, d17, d49, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            d dVar = (d) obj;
            dVar.getClass();
            Double d14 = dVar.f102045x;
            Double d15 = dVar.f102044w;
            Double d16 = dVar.f102043v;
            Double d17 = dVar.f102042u;
            Double d18 = dVar.f102041t;
            Double d19 = dVar.f102040s;
            Double d24 = dVar.f102039r;
            Double d25 = dVar.f102038q;
            Double d26 = dVar.f102037p;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            m0 m0Var = m0.f116981a;
            Integer num = dVar.f102022a;
            Double d27 = dVar.f102036o;
            Double d28 = dVar.f102035n;
            Double d29 = dVar.f102034m;
            Double d34 = dVar.f102033l;
            Double d35 = dVar.f102032k;
            Double d36 = dVar.f102031j;
            Double d37 = dVar.f102030i;
            Double d38 = dVar.f102029h;
            Double d39 = dVar.f102028g;
            Double d44 = dVar.f102027f;
            Integer num2 = dVar.f102023b;
            dVarC.d(eVar, 0, m0Var, num);
            if (dVarC.C(eVar) || num2 != null) {
                dVarC.d(eVar, 1, m0Var, num2);
            }
            x xVar = x.f117036a;
            dVarC.d(eVar, 2, xVar, dVar.f102024c);
            dVarC.d(eVar, 3, xVar, dVar.f102025d);
            dVarC.d(eVar, 4, xVar, dVar.f102026e);
            if (dVarC.C(eVar) || d44 != null) {
                dVarC.d(eVar, 5, xVar, d44);
            }
            if (dVarC.C(eVar) || d39 != null) {
                dVarC.d(eVar, 6, xVar, d39);
            }
            if (dVarC.C(eVar) || d38 != null) {
                dVarC.d(eVar, 7, xVar, d38);
            }
            if (dVarC.C(eVar) || d37 != null) {
                dVarC.d(eVar, 8, xVar, d37);
            }
            if (dVarC.C(eVar) || d36 != null) {
                dVarC.d(eVar, 9, xVar, d36);
            }
            if (dVarC.C(eVar) || d35 != null) {
                dVarC.d(eVar, 10, xVar, d35);
            }
            if (dVarC.C(eVar) || d34 != null) {
                dVarC.d(eVar, 11, xVar, d34);
            }
            if (dVarC.C(eVar) || d29 != null) {
                dVarC.d(eVar, 12, xVar, d29);
            }
            if (dVarC.C(eVar) || d28 != null) {
                dVarC.d(eVar, 13, xVar, d28);
            }
            if (dVarC.C(eVar) || d27 != null) {
                dVarC.d(eVar, 14, xVar, d27);
            }
            if (dVarC.C(eVar) || d26 != null) {
                dVarC.d(eVar, 15, xVar, d26);
            }
            if (dVarC.C(eVar) || d25 != null) {
                dVarC.d(eVar, 16, xVar, d25);
            }
            if (dVarC.C(eVar) || d24 != null) {
                dVarC.d(eVar, 17, xVar, d24);
            }
            if (dVarC.C(eVar) || d19 != null) {
                dVarC.d(eVar, 18, xVar, d19);
            }
            if (dVarC.C(eVar) || d18 != null) {
                dVarC.d(eVar, 19, xVar, d18);
            }
            if (dVarC.C(eVar) || d17 != null) {
                dVarC.d(eVar, 20, xVar, d17);
            }
            if (dVarC.C(eVar) || d16 != null) {
                dVarC.d(eVar, 21, xVar, d16);
            }
            if (dVarC.C(eVar) || d15 != null) {
                dVarC.d(eVar, 22, xVar, d15);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 23, xVar, d14);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ d(int i14, Integer num, Integer num2, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44, Double d45, Double d46, Double d47, u1 u1Var) {
        if (29 != (i14 & 29)) {
            k1.h(i14, 29, a.f102046a.getF158591b());
            throw null;
        }
        this.f102022a = num;
        if ((i14 & 2) == 0) {
            this.f102023b = null;
        } else {
            this.f102023b = num2;
        }
        this.f102024c = d14;
        this.f102025d = d15;
        this.f102026e = d16;
        if ((i14 & 32) == 0) {
            this.f102027f = null;
        } else {
            this.f102027f = d17;
        }
        if ((i14 & 64) == 0) {
            this.f102028g = null;
        } else {
            this.f102028g = d18;
        }
        if ((i14 & 128) == 0) {
            this.f102029h = null;
        } else {
            this.f102029h = d19;
        }
        if ((i14 & 256) == 0) {
            this.f102030i = null;
        } else {
            this.f102030i = d24;
        }
        if ((i14 & 512) == 0) {
            this.f102031j = null;
        } else {
            this.f102031j = d25;
        }
        if ((i14 & 1024) == 0) {
            this.f102032k = null;
        } else {
            this.f102032k = d26;
        }
        if ((i14 & 2048) == 0) {
            this.f102033l = null;
        } else {
            this.f102033l = d27;
        }
        if ((i14 & 4096) == 0) {
            this.f102034m = null;
        } else {
            this.f102034m = d28;
        }
        if ((i14 & 8192) == 0) {
            this.f102035n = null;
        } else {
            this.f102035n = d29;
        }
        if ((i14 & 16384) == 0) {
            this.f102036o = null;
        } else {
            this.f102036o = d34;
        }
        if ((32768 & i14) == 0) {
            this.f102037p = null;
        } else {
            this.f102037p = d35;
        }
        if ((65536 & i14) == 0) {
            this.f102038q = null;
        } else {
            this.f102038q = d36;
        }
        if ((131072 & i14) == 0) {
            this.f102039r = null;
        } else {
            this.f102039r = d37;
        }
        if ((262144 & i14) == 0) {
            this.f102040s = null;
        } else {
            this.f102040s = d38;
        }
        if ((524288 & i14) == 0) {
            this.f102041t = null;
        } else {
            this.f102041t = d39;
        }
        if ((1048576 & i14) == 0) {
            this.f102042u = null;
        } else {
            this.f102042u = d44;
        }
        if ((2097152 & i14) == 0) {
            this.f102043v = null;
        } else {
            this.f102043v = d45;
        }
        if ((4194304 & i14) == 0) {
            this.f102044w = null;
        } else {
            this.f102044w = d46;
        }
        if ((i14 & 8388608) == 0) {
            this.f102045x = null;
        } else {
            this.f102045x = d47;
        }
    }

    public static d a(d dVar, Integer num, Double d14, Double d15, Double d16) {
        return new d(num, dVar.f102023b, d14, d15, d16, dVar.f102027f, dVar.f102028g, dVar.f102029h, dVar.f102030i, dVar.f102031j, dVar.f102032k, dVar.f102033l, dVar.f102034m, dVar.f102035n, dVar.f102036o, dVar.f102037p, dVar.f102038q, dVar.f102039r, dVar.f102040s, dVar.f102041t, dVar.f102042u, dVar.f102043v, dVar.f102044w, dVar.f102045x);
    }

    public final u b() {
        Integer num = this.f102022a;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        Integer num2 = this.f102023b;
        int iIntValue2 = num2 != null ? num2.intValue() : num.intValue();
        Double d14 = this.f102024c;
        Double d15 = this.f102028g;
        Double d16 = d15 == null ? d14 : d15;
        Double d17 = this.f102025d;
        Double d18 = this.f102029h;
        Double d19 = d18 == null ? d17 : d18;
        Double d24 = this.f102026e;
        Double d25 = this.f102027f;
        return new u(iIntValue, iIntValue2, d24, d14, d17, d25 == null ? d24 : d25, d16, d19, this.f102031j, this.f102032k, this.f102033l, this.f102034m, this.f102035n, this.f102036o, this.f102037p, this.f102038q, this.f102039r, this.f102040s, this.f102041t, this.f102042u, this.f102043v, this.f102044w, this.f102045x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f102022a, dVar.f102022a) && s.g(this.f102023b, dVar.f102023b) && s.g(this.f102024c, dVar.f102024c) && s.g(this.f102025d, dVar.f102025d) && s.g(this.f102026e, dVar.f102026e) && s.g(this.f102027f, dVar.f102027f) && s.g(this.f102028g, dVar.f102028g) && s.g(this.f102029h, dVar.f102029h) && s.g(this.f102030i, dVar.f102030i) && s.g(this.f102031j, dVar.f102031j) && s.g(this.f102032k, dVar.f102032k) && s.g(this.f102033l, dVar.f102033l) && s.g(this.f102034m, dVar.f102034m) && s.g(this.f102035n, dVar.f102035n) && s.g(this.f102036o, dVar.f102036o) && s.g(this.f102037p, dVar.f102037p) && s.g(this.f102038q, dVar.f102038q) && s.g(this.f102039r, dVar.f102039r) && s.g(this.f102040s, dVar.f102040s) && s.g(this.f102041t, dVar.f102041t) && s.g(this.f102042u, dVar.f102042u) && s.g(this.f102043v, dVar.f102043v) && s.g(this.f102044w, dVar.f102044w) && s.g(this.f102045x, dVar.f102045x);
    }

    public final int hashCode() {
        Integer num = this.f102022a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f102023b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d14 = this.f102024c;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f102025d;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f102026e;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f102027f;
        int iHashCode6 = (iHashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f102028g;
        int iHashCode7 = (iHashCode6 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f102029h;
        int iHashCode8 = (iHashCode7 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.f102030i;
        int iHashCode9 = (iHashCode8 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.f102031j;
        int iHashCode10 = (iHashCode9 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.f102032k;
        int iHashCode11 = (iHashCode10 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.f102033l;
        int iHashCode12 = (iHashCode11 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Double d28 = this.f102034m;
        int iHashCode13 = (iHashCode12 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.f102035n;
        int iHashCode14 = (iHashCode13 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Double d34 = this.f102036o;
        int iHashCode15 = (iHashCode14 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Double d35 = this.f102037p;
        int iHashCode16 = (iHashCode15 + (d35 == null ? 0 : d35.hashCode())) * 31;
        Double d36 = this.f102038q;
        int iHashCode17 = (iHashCode16 + (d36 == null ? 0 : d36.hashCode())) * 31;
        Double d37 = this.f102039r;
        int iHashCode18 = (iHashCode17 + (d37 == null ? 0 : d37.hashCode())) * 31;
        Double d38 = this.f102040s;
        int iHashCode19 = (iHashCode18 + (d38 == null ? 0 : d38.hashCode())) * 31;
        Double d39 = this.f102041t;
        int iHashCode20 = (iHashCode19 + (d39 == null ? 0 : d39.hashCode())) * 31;
        Double d44 = this.f102042u;
        int iHashCode21 = (iHashCode20 + (d44 == null ? 0 : d44.hashCode())) * 31;
        Double d45 = this.f102043v;
        int iHashCode22 = (iHashCode21 + (d45 == null ? 0 : d45.hashCode())) * 31;
        Double d46 = this.f102044w;
        int iHashCode23 = (iHashCode22 + (d46 == null ? 0 : d46.hashCode())) * 31;
        Double d47 = this.f102045x;
        return iHashCode23 + (d47 != null ? d47.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(this.f102022a, "NutritionGoalsDTO(calories=", ", adjustedCalories=", ", fat=", this.f102023b);
        b71.i.p(this.f102024c, this.f102025d, ", protein=", ", carbs=", sbL);
        b71.i.p(this.f102026e, this.f102027f, ", adjustedCarbs=", ", adjustedFat=", sbL);
        b71.i.p(this.f102028g, this.f102029h, ", adjustedProtein=", ", defaultGoalPercentage=", sbL);
        b71.i.p(this.f102030i, this.f102031j, ", fiber=", ", sugar=", sbL);
        b71.i.p(this.f102032k, this.f102033l, ", addedSugars=", ", saturatedFat=", sbL);
        b71.i.p(this.f102034m, this.f102035n, ", monounsaturatedFat=", ", polyunsaturatedFat=", sbL);
        b71.i.p(this.f102036o, this.f102037p, ", transFat=", ", cholesterol=", sbL);
        b71.i.p(this.f102038q, this.f102039r, ", sodium=", ", potassium=", sbL);
        b71.i.p(this.f102040s, this.f102041t, ", iron=", ", calcium=", sbL);
        b71.i.p(this.f102042u, this.f102043v, ", vitaminA=", ", vitaminC=", sbL);
        return sn.a.f(this.f102044w, this.f102045x, ", vitaminD=", ")", sbL);
    }

    /* JADX INFO: renamed from: k01.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk01/d$b;", "", "<init>", "()V", "Li63/c;", "Lk01/d;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<d> serializer() {
            return a.f102046a;
        }

        private Companion() {
        }
    }

    public d(Integer num, Integer num2, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44, Double d45, Double d46, Double d47) {
        this.f102022a = num;
        this.f102023b = num2;
        this.f102024c = d14;
        this.f102025d = d15;
        this.f102026e = d16;
        this.f102027f = d17;
        this.f102028g = d18;
        this.f102029h = d19;
        this.f102030i = d24;
        this.f102031j = d25;
        this.f102032k = d26;
        this.f102033l = d27;
        this.f102034m = d28;
        this.f102035n = d29;
        this.f102036o = d34;
        this.f102037p = d35;
        this.f102038q = d36;
        this.f102039r = d37;
        this.f102040s = d38;
        this.f102041t = d39;
        this.f102042u = d44;
        this.f102043v = d45;
        this.f102044w = d46;
        this.f102045x = d47;
    }

    public /* synthetic */ d(Integer num, Integer num2, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44, Double d45, Double d46, Double d47, int i14, p005kotlin.jvm.internal.j jVar) {
        this(num, (i14 & 2) != 0 ? null : num2, d14, d15, d16, (i14 & 32) != 0 ? null : d17, (i14 & 64) != 0 ? null : d18, (i14 & 128) != 0 ? null : d19, (i14 & 256) != 0 ? null : d24, (i14 & 512) != 0 ? null : d25, (i14 & 1024) != 0 ? null : d26, (i14 & 2048) != 0 ? null : d27, (i14 & 4096) != 0 ? null : d28, (i14 & 8192) != 0 ? null : d29, (i14 & 16384) != 0 ? null : d34, (32768 & i14) != 0 ? null : d35, (65536 & i14) != 0 ? null : d36, (131072 & i14) != 0 ? null : d37, (262144 & i14) != 0 ? null : d38, (524288 & i14) != 0 ? null : d39, (1048576 & i14) != 0 ? null : d44, (2097152 & i14) != 0 ? null : d45, (4194304 & i14) != 0 ? null : d46, (i14 & 8388608) != 0 ? null : d47);
    }
}
