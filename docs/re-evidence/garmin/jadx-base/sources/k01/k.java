package k01;

import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import lc.u0;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B÷\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aBí\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001e¨\u0006\""}, d2 = {"Lk01/k;", "", "", "calories", "", "fat", "protein", "carbs", "otherCalories", "caloriesPercentage", "fiber", "sugar", "addedSugars", "saturatedFat", "monounsaturatedFat", "polyunsaturatedFat", "transFat", "cholesterol", "sodium", "potassium", "iron", "calcium", "vitaminA", "vitaminC", "vitaminD", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f102072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f102073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f102074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f102075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f102076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f102077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f102078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f102079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Double f102080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f102081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Double f102082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f102083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Double f102084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Double f102085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Double f102086o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Double f102087p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Double f102088q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Double f102089r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Double f102090s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Double f102091t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Double f102092u;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/reports/ThinNutritionContentDTO.$serializer", "Lm63/e0;", "Lk01/k;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f102093a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f102093a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.reports.ThinNutritionContentDTO", aVar, 21);
            m1Var.j("calories", false);
            m1Var.j("fat", false);
            m1Var.j("protein", false);
            m1Var.j("carbs", false);
            m1Var.j("otherCalories", false);
            m1Var.j("caloriesPercentage", false);
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
            x xVar = x.f117036a;
            return new i63.c[]{cVarD, j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(m0Var), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar)};
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
            Double d36 = null;
            Double d37 = null;
            Double d38 = null;
            Integer num2 = null;
            Double d39 = null;
            Double d44 = null;
            Double d45 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        d16 = d16;
                        d19 = d19;
                        d15 = d15;
                        break;
                    case 0:
                        d14 = d19;
                        num = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num);
                        i16 |= 1;
                        d16 = d16;
                        d19 = d14;
                        d17 = d17;
                        d15 = d15;
                        break;
                    case 1:
                        d14 = d19;
                        d36 = (Double) cVarC.v(eVar2, 1, x.f117036a, d36);
                        i16 |= 2;
                        d37 = d37;
                        d19 = d14;
                        d17 = d17;
                        d15 = d15;
                        break;
                    case 2:
                        d14 = d19;
                        d37 = (Double) cVarC.v(eVar2, 2, x.f117036a, d37);
                        i16 |= 4;
                        d19 = d14;
                        d17 = d17;
                        d15 = d15;
                        break;
                    case 3:
                        d14 = d19;
                        d38 = (Double) cVarC.v(eVar2, 3, x.f117036a, d38);
                        i16 |= 8;
                        d19 = d14;
                        d17 = d17;
                        d15 = d15;
                        break;
                    case 4:
                        d14 = d19;
                        num2 = (Integer) cVarC.v(eVar2, 4, m0.f116981a, num2);
                        i16 |= 16;
                        d19 = d14;
                        d17 = d17;
                        d15 = d15;
                        break;
                    case 5:
                        d14 = d19;
                        d39 = (Double) cVarC.v(eVar2, 5, x.f117036a, d39);
                        i16 |= 32;
                        d19 = d14;
                        d17 = d17;
                        d15 = d15;
                        break;
                    case 6:
                        d14 = d19;
                        d44 = (Double) cVarC.v(eVar2, 6, x.f117036a, d44);
                        i16 |= 64;
                        d19 = d14;
                        d17 = d17;
                        d15 = d15;
                        break;
                    case 7:
                        d14 = d19;
                        d45 = (Double) cVarC.v(eVar2, 7, x.f117036a, d45);
                        i16 |= 128;
                        d19 = d14;
                        d17 = d17;
                        d15 = d15;
                        break;
                    case 8:
                        d15 = d15;
                        d17 = d17;
                        d19 = (Double) cVarC.v(eVar2, 8, x.f117036a, d19);
                        i16 |= 256;
                        d17 = d17;
                        d15 = d15;
                        break;
                    case 9:
                        d17 = (Double) cVarC.v(eVar2, 9, x.f117036a, d17);
                        i16 |= 512;
                        d19 = d19;
                        d15 = d15;
                        break;
                    case 10:
                        d17 = d17;
                        d19 = d19;
                        d16 = (Double) cVarC.v(eVar2, 10, x.f117036a, d16);
                        i16 |= 1024;
                        d19 = d19;
                        d17 = d17;
                        break;
                    case 11:
                        d17 = d17;
                        d19 = d19;
                        d15 = (Double) cVarC.v(eVar2, 11, x.f117036a, d15);
                        i16 |= 2048;
                        d19 = d19;
                        d17 = d17;
                        break;
                    case 12:
                        d17 = d17;
                        d19 = d19;
                        d18 = (Double) cVarC.v(eVar2, 12, x.f117036a, d18);
                        i16 |= 4096;
                        d19 = d19;
                        d17 = d17;
                        break;
                    case 13:
                        d17 = d17;
                        d19 = d19;
                        d24 = (Double) cVarC.v(eVar2, 13, x.f117036a, d24);
                        i16 |= 8192;
                        d19 = d19;
                        d17 = d17;
                        break;
                    case 14:
                        d17 = d17;
                        d19 = d19;
                        d25 = (Double) cVarC.v(eVar2, 14, x.f117036a, d25);
                        i16 |= 16384;
                        d19 = d19;
                        d17 = d17;
                        break;
                    case 15:
                        d26 = (Double) cVarC.v(eVar2, 15, x.f117036a, d26);
                        i14 = 32768;
                        i16 |= i14;
                        d19 = d19;
                        d17 = d17;
                        break;
                    case 16:
                        d27 = (Double) cVarC.v(eVar2, 16, x.f117036a, d27);
                        i14 = 65536;
                        i16 |= i14;
                        d19 = d19;
                        d17 = d17;
                        break;
                    case 17:
                        d28 = (Double) cVarC.v(eVar2, 17, x.f117036a, d28);
                        i14 = 131072;
                        i16 |= i14;
                        d19 = d19;
                        d17 = d17;
                        break;
                    case 18:
                        d29 = (Double) cVarC.v(eVar2, 18, x.f117036a, d29);
                        i14 = GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                        i16 |= i14;
                        d19 = d19;
                        d17 = d17;
                        break;
                    case 19:
                        d34 = (Double) cVarC.v(eVar2, 19, x.f117036a, d34);
                        i14 = 524288;
                        i16 |= i14;
                        d19 = d19;
                        d17 = d17;
                        break;
                    case 20:
                        d35 = (Double) cVarC.v(eVar2, 20, x.f117036a, d35);
                        i14 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        i16 |= i14;
                        d19 = d19;
                        d17 = d17;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            Double d46 = d15;
            Double d47 = d17;
            Double d48 = d19;
            Integer num3 = num;
            Double d49 = d36;
            Double d54 = d37;
            cVarC.b(eVar2);
            Double d55 = d34;
            Double d56 = d35;
            Double d57 = d45;
            Double d58 = d29;
            return new k(i16, num3, d49, d54, d38, num2, d39, d44, d57, d48, d47, d16, d46, d18, d24, d25, d26, d27, d28, d58, d55, d56, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            k kVar = (k) obj;
            kVar.getClass();
            Double d14 = kVar.f102092u;
            Double d15 = kVar.f102091t;
            Double d16 = kVar.f102090s;
            Double d17 = kVar.f102089r;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            m0 m0Var = m0.f116981a;
            Integer num = kVar.f102072a;
            Double d18 = kVar.f102088q;
            Double d19 = kVar.f102087p;
            Double d24 = kVar.f102086o;
            Double d25 = kVar.f102085n;
            Double d26 = kVar.f102084m;
            Double d27 = kVar.f102083l;
            Double d28 = kVar.f102082k;
            Double d29 = kVar.f102081j;
            Double d34 = kVar.f102080i;
            Double d35 = kVar.f102079h;
            Double d36 = kVar.f102078g;
            dVarC.d(eVar, 0, m0Var, num);
            x xVar = x.f117036a;
            dVarC.d(eVar, 1, xVar, kVar.f102073b);
            dVarC.d(eVar, 2, xVar, kVar.f102074c);
            dVarC.d(eVar, 3, xVar, kVar.f102075d);
            dVarC.d(eVar, 4, m0Var, kVar.f102076e);
            dVarC.d(eVar, 5, xVar, kVar.f102077f);
            if (dVarC.C(eVar) || d36 != null) {
                dVarC.d(eVar, 6, xVar, d36);
            }
            if (dVarC.C(eVar) || d35 != null) {
                dVarC.d(eVar, 7, xVar, d35);
            }
            if (dVarC.C(eVar) || d34 != null) {
                dVarC.d(eVar, 8, xVar, d34);
            }
            if (dVarC.C(eVar) || d29 != null) {
                dVarC.d(eVar, 9, xVar, d29);
            }
            if (dVarC.C(eVar) || d28 != null) {
                dVarC.d(eVar, 10, xVar, d28);
            }
            if (dVarC.C(eVar) || d27 != null) {
                dVarC.d(eVar, 11, xVar, d27);
            }
            if (dVarC.C(eVar) || d26 != null) {
                dVarC.d(eVar, 12, xVar, d26);
            }
            if (dVarC.C(eVar) || d25 != null) {
                dVarC.d(eVar, 13, xVar, d25);
            }
            if (dVarC.C(eVar) || d24 != null) {
                dVarC.d(eVar, 14, xVar, d24);
            }
            if (dVarC.C(eVar) || d19 != null) {
                dVarC.d(eVar, 15, xVar, d19);
            }
            if (dVarC.C(eVar) || d18 != null) {
                dVarC.d(eVar, 16, xVar, d18);
            }
            if (dVarC.C(eVar) || d17 != null) {
                dVarC.d(eVar, 17, xVar, d17);
            }
            if (dVarC.C(eVar) || d16 != null) {
                dVarC.d(eVar, 18, xVar, d16);
            }
            if (dVarC.C(eVar) || d15 != null) {
                dVarC.d(eVar, 19, xVar, d15);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 20, xVar, d14);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ k(int i14, Integer num, Double d14, Double d15, Double d16, Integer num2, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44, u1 u1Var) {
        if (63 != (i14 & 63)) {
            k1.h(i14, 63, a.f102093a.getF158591b());
            throw null;
        }
        this.f102072a = num;
        this.f102073b = d14;
        this.f102074c = d15;
        this.f102075d = d16;
        this.f102076e = num2;
        this.f102077f = d17;
        if ((i14 & 64) == 0) {
            this.f102078g = null;
        } else {
            this.f102078g = d18;
        }
        if ((i14 & 128) == 0) {
            this.f102079h = null;
        } else {
            this.f102079h = d19;
        }
        if ((i14 & 256) == 0) {
            this.f102080i = null;
        } else {
            this.f102080i = d24;
        }
        if ((i14 & 512) == 0) {
            this.f102081j = null;
        } else {
            this.f102081j = d25;
        }
        if ((i14 & 1024) == 0) {
            this.f102082k = null;
        } else {
            this.f102082k = d26;
        }
        if ((i14 & 2048) == 0) {
            this.f102083l = null;
        } else {
            this.f102083l = d27;
        }
        if ((i14 & 4096) == 0) {
            this.f102084m = null;
        } else {
            this.f102084m = d28;
        }
        if ((i14 & 8192) == 0) {
            this.f102085n = null;
        } else {
            this.f102085n = d29;
        }
        if ((i14 & 16384) == 0) {
            this.f102086o = null;
        } else {
            this.f102086o = d34;
        }
        if ((32768 & i14) == 0) {
            this.f102087p = null;
        } else {
            this.f102087p = d35;
        }
        if ((65536 & i14) == 0) {
            this.f102088q = null;
        } else {
            this.f102088q = d36;
        }
        if ((131072 & i14) == 0) {
            this.f102089r = null;
        } else {
            this.f102089r = d37;
        }
        if ((262144 & i14) == 0) {
            this.f102090s = null;
        } else {
            this.f102090s = d38;
        }
        if ((524288 & i14) == 0) {
            this.f102091t = null;
        } else {
            this.f102091t = d39;
        }
        if ((i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
            this.f102092u = null;
        } else {
            this.f102092u = d44;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.f102072a, kVar.f102072a) && s.g(this.f102073b, kVar.f102073b) && s.g(this.f102074c, kVar.f102074c) && s.g(this.f102075d, kVar.f102075d) && s.g(this.f102076e, kVar.f102076e) && s.g(this.f102077f, kVar.f102077f) && s.g(this.f102078g, kVar.f102078g) && s.g(this.f102079h, kVar.f102079h) && s.g(this.f102080i, kVar.f102080i) && s.g(this.f102081j, kVar.f102081j) && s.g(this.f102082k, kVar.f102082k) && s.g(this.f102083l, kVar.f102083l) && s.g(this.f102084m, kVar.f102084m) && s.g(this.f102085n, kVar.f102085n) && s.g(this.f102086o, kVar.f102086o) && s.g(this.f102087p, kVar.f102087p) && s.g(this.f102088q, kVar.f102088q) && s.g(this.f102089r, kVar.f102089r) && s.g(this.f102090s, kVar.f102090s) && s.g(this.f102091t, kVar.f102091t) && s.g(this.f102092u, kVar.f102092u);
    }

    public final int hashCode() {
        Integer num = this.f102072a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d14 = this.f102073b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f102074c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f102075d;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Integer num2 = this.f102076e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d17 = this.f102077f;
        int iHashCode6 = (iHashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f102078g;
        int iHashCode7 = (iHashCode6 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f102079h;
        int iHashCode8 = (iHashCode7 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.f102080i;
        int iHashCode9 = (iHashCode8 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.f102081j;
        int iHashCode10 = (iHashCode9 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.f102082k;
        int iHashCode11 = (iHashCode10 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.f102083l;
        int iHashCode12 = (iHashCode11 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Double d28 = this.f102084m;
        int iHashCode13 = (iHashCode12 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.f102085n;
        int iHashCode14 = (iHashCode13 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Double d34 = this.f102086o;
        int iHashCode15 = (iHashCode14 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Double d35 = this.f102087p;
        int iHashCode16 = (iHashCode15 + (d35 == null ? 0 : d35.hashCode())) * 31;
        Double d36 = this.f102088q;
        int iHashCode17 = (iHashCode16 + (d36 == null ? 0 : d36.hashCode())) * 31;
        Double d37 = this.f102089r;
        int iHashCode18 = (iHashCode17 + (d37 == null ? 0 : d37.hashCode())) * 31;
        Double d38 = this.f102090s;
        int iHashCode19 = (iHashCode18 + (d38 == null ? 0 : d38.hashCode())) * 31;
        Double d39 = this.f102091t;
        int iHashCode20 = (iHashCode19 + (d39 == null ? 0 : d39.hashCode())) * 31;
        Double d44 = this.f102092u;
        return iHashCode20 + (d44 != null ? d44.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = u0.m("ThinNutritionContentDTO(calories=", this.f102072a, ", fat=", this.f102073b, ", protein=");
        b71.i.p(this.f102074c, this.f102075d, ", carbs=", ", otherCalories=", sbM);
        b71.i.v(sbM, this.f102076e, ", caloriesPercentage=", this.f102077f, ", fiber=");
        b71.i.p(this.f102078g, this.f102079h, ", sugar=", ", addedSugars=", sbM);
        b71.i.p(this.f102080i, this.f102081j, ", saturatedFat=", ", monounsaturatedFat=", sbM);
        b71.i.p(this.f102082k, this.f102083l, ", polyunsaturatedFat=", ", transFat=", sbM);
        b71.i.p(this.f102084m, this.f102085n, ", cholesterol=", ", sodium=", sbM);
        b71.i.p(this.f102086o, this.f102087p, ", potassium=", ", iron=", sbM);
        b71.i.p(this.f102088q, this.f102089r, ", calcium=", ", vitaminA=", sbM);
        b71.i.p(this.f102090s, this.f102091t, ", vitaminC=", ", vitaminD=", sbM);
        return b71.i.g(sbM, this.f102092u, ")");
    }

    /* JADX INFO: renamed from: k01.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk01/k$b;", "", "<init>", "()V", "Li63/c;", "Lk01/k;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<k> serializer() {
            return a.f102093a;
        }

        private Companion() {
        }
    }

    public k(Integer num, Double d14, Double d15, Double d16, Integer num2, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44) {
        this.f102072a = num;
        this.f102073b = d14;
        this.f102074c = d15;
        this.f102075d = d16;
        this.f102076e = num2;
        this.f102077f = d17;
        this.f102078g = d18;
        this.f102079h = d19;
        this.f102080i = d24;
        this.f102081j = d25;
        this.f102082k = d26;
        this.f102083l = d27;
        this.f102084m = d28;
        this.f102085n = d29;
        this.f102086o = d34;
        this.f102087p = d35;
        this.f102088q = d36;
        this.f102089r = d37;
        this.f102090s = d38;
        this.f102091t = d39;
        this.f102092u = d44;
    }

    public /* synthetic */ k(Integer num, Double d14, Double d15, Double d16, Integer num2, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44, int i14, p005kotlin.jvm.internal.j jVar) {
        this(num, d14, d15, d16, num2, d17, (i14 & 64) != 0 ? null : d18, (i14 & 128) != 0 ? null : d19, (i14 & 256) != 0 ? null : d24, (i14 & 512) != 0 ? null : d25, (i14 & 1024) != 0 ? null : d26, (i14 & 2048) != 0 ? null : d27, (i14 & 4096) != 0 ? null : d28, (i14 & 8192) != 0 ? null : d29, (i14 & 16384) != 0 ? null : d34, (32768 & i14) != 0 ? null : d35, (65536 & i14) != 0 ? null : d36, (131072 & i14) != 0 ? null : d37, (262144 & i14) != 0 ? null : d38, (524288 & i14) != 0 ? null : d39, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : d44);
    }
}
