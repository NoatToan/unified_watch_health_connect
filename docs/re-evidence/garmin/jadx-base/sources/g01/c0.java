package g01;

import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#Bã\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cB÷\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 ¨\u0006$"}, d2 = {"Lg01/c0;", "", "", "servingId", "servingUnit", "", "numberOfUnits", "", "calories", "carbs", "protein", "fat", "fiber", "sugar", "addedSugars", "saturatedFat", "monounsaturatedFat", "polyunsaturatedFat", "transFat", "cholesterol", "sodium", "potassium", "vitaminA", "vitaminC", "vitaminD", "calcium", "iron", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class c0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f74126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f74127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f74128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f74129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f74130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f74131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Double f74132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f74133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Double f74134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f74135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Double f74136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Double f74137n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Double f74138o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Double f74139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Double f74140q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Double f74141r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Double f74142s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Double f74143t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Double f74144u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Double f74145v;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/consumable/NutritionContentDTO.$serializer", "Lm63/e0;", "Lg01/c0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<c0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74146a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f74146a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.NutritionContentDTO", aVar, 22);
            m1Var.j("servingId", false);
            m1Var.j("servingUnit", false);
            m1Var.j("numberOfUnits", false);
            m1Var.j("calories", false);
            m1Var.j("carbs", false);
            m1Var.j("protein", false);
            m1Var.j("fat", false);
            m1Var.j("fiber", false);
            m1Var.j("sugar", false);
            m1Var.j("addedSugars", false);
            m1Var.j("saturatedFat", false);
            m1Var.j("monounsaturatedFat", false);
            m1Var.j("polyunsaturatedFat", false);
            m1Var.j("transFat", false);
            m1Var.j("cholesterol", false);
            m1Var.j("sodium", false);
            m1Var.j("potassium", false);
            m1Var.j("vitaminA", false);
            m1Var.j("vitaminC", false);
            m1Var.j("vitaminD", false);
            m1Var.j("calcium", false);
            m1Var.j("iron", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD = j63.a.d(y1Var);
            i63.c<?> cVarD2 = j63.a.d(y1Var);
            m63.x xVar = m63.x.f117036a;
            return new i63.c[]{cVarD, cVarD2, j63.a.d(xVar), j63.a.d(m0.f116981a), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar)};
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
            String str = null;
            String str2 = null;
            Double d36 = null;
            Integer num = null;
            Double d37 = null;
            Double d38 = null;
            Double d39 = null;
            Double d44 = null;
            Double d45 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        d17 = d17;
                        d15 = d15;
                        break;
                    case 0:
                        d14 = d17;
                        str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                        i16 |= 1;
                        str2 = str2;
                        d17 = d14;
                        d16 = d16;
                        d15 = d15;
                        break;
                    case 1:
                        d14 = d17;
                        str2 = (String) cVarC.v(eVar2, 1, y1.f117048a, str2);
                        i16 |= 2;
                        d36 = d36;
                        d17 = d14;
                        d16 = d16;
                        d15 = d15;
                        break;
                    case 2:
                        d14 = d17;
                        d36 = (Double) cVarC.v(eVar2, 2, m63.x.f117036a, d36);
                        i16 |= 4;
                        d17 = d14;
                        d16 = d16;
                        d15 = d15;
                        break;
                    case 3:
                        d14 = d17;
                        num = (Integer) cVarC.v(eVar2, 3, m0.f116981a, num);
                        i16 |= 8;
                        d17 = d14;
                        d16 = d16;
                        d15 = d15;
                        break;
                    case 4:
                        d14 = d17;
                        d37 = (Double) cVarC.v(eVar2, 4, m63.x.f117036a, d37);
                        i16 |= 16;
                        d17 = d14;
                        d16 = d16;
                        d15 = d15;
                        break;
                    case 5:
                        d14 = d17;
                        d38 = (Double) cVarC.v(eVar2, 5, m63.x.f117036a, d38);
                        i16 |= 32;
                        d17 = d14;
                        d16 = d16;
                        d15 = d15;
                        break;
                    case 6:
                        d14 = d17;
                        d39 = (Double) cVarC.v(eVar2, 6, m63.x.f117036a, d39);
                        i16 |= 64;
                        d17 = d14;
                        d16 = d16;
                        d15 = d15;
                        break;
                    case 7:
                        d14 = d17;
                        d44 = (Double) cVarC.v(eVar2, 7, m63.x.f117036a, d44);
                        i16 |= 128;
                        d17 = d14;
                        d16 = d16;
                        d15 = d15;
                        break;
                    case 8:
                        d14 = d17;
                        d45 = (Double) cVarC.v(eVar2, 8, m63.x.f117036a, d45);
                        i16 |= 256;
                        d17 = d14;
                        d16 = d16;
                        d15 = d15;
                        break;
                    case 9:
                        d15 = d15;
                        d16 = d16;
                        d17 = (Double) cVarC.v(eVar2, 9, m63.x.f117036a, d17);
                        i16 |= 512;
                        d16 = d16;
                        d15 = d15;
                        break;
                    case 10:
                        d16 = (Double) cVarC.v(eVar2, 10, m63.x.f117036a, d16);
                        i16 |= 1024;
                        d17 = d17;
                        d15 = d15;
                        break;
                    case 11:
                        d16 = d16;
                        d17 = d17;
                        d15 = (Double) cVarC.v(eVar2, 11, m63.x.f117036a, d15);
                        i16 |= 2048;
                        d17 = d17;
                        d16 = d16;
                        break;
                    case 12:
                        d16 = d16;
                        d17 = d17;
                        d18 = (Double) cVarC.v(eVar2, 12, m63.x.f117036a, d18);
                        i16 |= 4096;
                        d17 = d17;
                        d16 = d16;
                        break;
                    case 13:
                        d16 = d16;
                        d17 = d17;
                        d24 = (Double) cVarC.v(eVar2, 13, m63.x.f117036a, d24);
                        i16 |= 8192;
                        d17 = d17;
                        d16 = d16;
                        break;
                    case 14:
                        d16 = d16;
                        d17 = d17;
                        d25 = (Double) cVarC.v(eVar2, 14, m63.x.f117036a, d25);
                        i16 |= 16384;
                        d17 = d17;
                        d16 = d16;
                        break;
                    case 15:
                        d26 = (Double) cVarC.v(eVar2, 15, m63.x.f117036a, d26);
                        i14 = 32768;
                        i16 |= i14;
                        d17 = d17;
                        d16 = d16;
                        break;
                    case 16:
                        d27 = (Double) cVarC.v(eVar2, 16, m63.x.f117036a, d27);
                        i14 = 65536;
                        i16 |= i14;
                        d17 = d17;
                        d16 = d16;
                        break;
                    case 17:
                        d28 = (Double) cVarC.v(eVar2, 17, m63.x.f117036a, d28);
                        i14 = 131072;
                        i16 |= i14;
                        d17 = d17;
                        d16 = d16;
                        break;
                    case 18:
                        d29 = (Double) cVarC.v(eVar2, 18, m63.x.f117036a, d29);
                        i14 = GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                        i16 |= i14;
                        d17 = d17;
                        d16 = d16;
                        break;
                    case 19:
                        d34 = (Double) cVarC.v(eVar2, 19, m63.x.f117036a, d34);
                        i14 = 524288;
                        i16 |= i14;
                        d17 = d17;
                        d16 = d16;
                        break;
                    case 20:
                        d35 = (Double) cVarC.v(eVar2, 20, m63.x.f117036a, d35);
                        i14 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        i16 |= i14;
                        d17 = d17;
                        d16 = d16;
                        break;
                    case 21:
                        d19 = (Double) cVarC.v(eVar2, 21, m63.x.f117036a, d19);
                        i14 = 2097152;
                        i16 |= i14;
                        d17 = d17;
                        d16 = d16;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            Double d46 = d15;
            Double d47 = d17;
            String str3 = str;
            String str4 = str2;
            Double d48 = d36;
            cVarC.b(eVar2);
            Double d49 = d45;
            Double d54 = d34;
            Double d55 = d35;
            return new c0(i16, str3, str4, d48, num, d37, d38, d39, d44, d49, d47, d16, d46, d18, d24, d25, d26, d27, d28, d29, d54, d55, d19, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            c0 c0Var = (c0) obj;
            c0Var.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 0, y1Var, c0Var.f74124a);
            dVarC.d(eVar, 1, y1Var, c0Var.f74125b);
            m63.x xVar = m63.x.f117036a;
            dVarC.d(eVar, 2, xVar, c0Var.f74126c);
            dVarC.d(eVar, 3, m0.f116981a, c0Var.f74127d);
            dVarC.d(eVar, 4, xVar, c0Var.f74128e);
            dVarC.d(eVar, 5, xVar, c0Var.f74129f);
            dVarC.d(eVar, 6, xVar, c0Var.f74130g);
            dVarC.d(eVar, 7, xVar, c0Var.f74131h);
            dVarC.d(eVar, 8, xVar, c0Var.f74132i);
            dVarC.d(eVar, 9, xVar, c0Var.f74133j);
            dVarC.d(eVar, 10, xVar, c0Var.f74134k);
            dVarC.d(eVar, 11, xVar, c0Var.f74135l);
            dVarC.d(eVar, 12, xVar, c0Var.f74136m);
            dVarC.d(eVar, 13, xVar, c0Var.f74137n);
            dVarC.d(eVar, 14, xVar, c0Var.f74138o);
            dVarC.d(eVar, 15, xVar, c0Var.f74139p);
            dVarC.d(eVar, 16, xVar, c0Var.f74140q);
            dVarC.d(eVar, 17, xVar, c0Var.f74141r);
            dVarC.d(eVar, 18, xVar, c0Var.f74142s);
            dVarC.d(eVar, 19, xVar, c0Var.f74143t);
            dVarC.d(eVar, 20, xVar, c0Var.f74144u);
            dVarC.d(eVar, 21, xVar, c0Var.f74145v);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ c0(int i14, String str, String str2, Double d14, Integer num, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44, u1 u1Var) {
        if (4194303 != (i14 & 4194303)) {
            k1.h(i14, 4194303, a.f74146a.getF158591b());
            throw null;
        }
        this.f74124a = str;
        this.f74125b = str2;
        this.f74126c = d14;
        this.f74127d = num;
        this.f74128e = d15;
        this.f74129f = d16;
        this.f74130g = d17;
        this.f74131h = d18;
        this.f74132i = d19;
        this.f74133j = d24;
        this.f74134k = d25;
        this.f74135l = d26;
        this.f74136m = d27;
        this.f74137n = d28;
        this.f74138o = d29;
        this.f74139p = d34;
        this.f74140q = d35;
        this.f74141r = d36;
        this.f74142s = d37;
        this.f74143t = d38;
        this.f74144u = d39;
        this.f74145v = d44;
    }

    public final b11.f a() {
        return new b11.f(this.f74127d, this.f74128e, this.f74129f, this.f74130g, this.f74131h, this.f74132i, this.f74133j, this.f74134k, this.f74135l, this.f74136m, this.f74137n, this.f74138o, this.f74139p, this.f74140q, this.f74141r, this.f74142s, this.f74143t, this.f74144u, this.f74145v);
    }

    public final b11.s b() {
        Double d14;
        if (this.f74124a == null || this.f74125b == null || (d14 = this.f74126c) == null) {
            return null;
        }
        return new b11.s(this.f74124a, this.f74125b, d14.doubleValue(), a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return p005kotlin.jvm.internal.s.g(this.f74124a, c0Var.f74124a) && p005kotlin.jvm.internal.s.g(this.f74125b, c0Var.f74125b) && p005kotlin.jvm.internal.s.g(this.f74126c, c0Var.f74126c) && p005kotlin.jvm.internal.s.g(this.f74127d, c0Var.f74127d) && p005kotlin.jvm.internal.s.g(this.f74128e, c0Var.f74128e) && p005kotlin.jvm.internal.s.g(this.f74129f, c0Var.f74129f) && p005kotlin.jvm.internal.s.g(this.f74130g, c0Var.f74130g) && p005kotlin.jvm.internal.s.g(this.f74131h, c0Var.f74131h) && p005kotlin.jvm.internal.s.g(this.f74132i, c0Var.f74132i) && p005kotlin.jvm.internal.s.g(this.f74133j, c0Var.f74133j) && p005kotlin.jvm.internal.s.g(this.f74134k, c0Var.f74134k) && p005kotlin.jvm.internal.s.g(this.f74135l, c0Var.f74135l) && p005kotlin.jvm.internal.s.g(this.f74136m, c0Var.f74136m) && p005kotlin.jvm.internal.s.g(this.f74137n, c0Var.f74137n) && p005kotlin.jvm.internal.s.g(this.f74138o, c0Var.f74138o) && p005kotlin.jvm.internal.s.g(this.f74139p, c0Var.f74139p) && p005kotlin.jvm.internal.s.g(this.f74140q, c0Var.f74140q) && p005kotlin.jvm.internal.s.g(this.f74141r, c0Var.f74141r) && p005kotlin.jvm.internal.s.g(this.f74142s, c0Var.f74142s) && p005kotlin.jvm.internal.s.g(this.f74143t, c0Var.f74143t) && p005kotlin.jvm.internal.s.g(this.f74144u, c0Var.f74144u) && p005kotlin.jvm.internal.s.g(this.f74145v, c0Var.f74145v);
    }

    public final int hashCode() {
        String str = this.f74124a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f74125b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.f74126c;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Integer num = this.f74127d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Double d15 = this.f74128e;
        int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f74129f;
        int iHashCode6 = (iHashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f74130g;
        int iHashCode7 = (iHashCode6 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f74131h;
        int iHashCode8 = (iHashCode7 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f74132i;
        int iHashCode9 = (iHashCode8 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.f74133j;
        int iHashCode10 = (iHashCode9 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.f74134k;
        int iHashCode11 = (iHashCode10 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.f74135l;
        int iHashCode12 = (iHashCode11 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.f74136m;
        int iHashCode13 = (iHashCode12 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Double d28 = this.f74137n;
        int iHashCode14 = (iHashCode13 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.f74138o;
        int iHashCode15 = (iHashCode14 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Double d34 = this.f74139p;
        int iHashCode16 = (iHashCode15 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Double d35 = this.f74140q;
        int iHashCode17 = (iHashCode16 + (d35 == null ? 0 : d35.hashCode())) * 31;
        Double d36 = this.f74141r;
        int iHashCode18 = (iHashCode17 + (d36 == null ? 0 : d36.hashCode())) * 31;
        Double d37 = this.f74142s;
        int iHashCode19 = (iHashCode18 + (d37 == null ? 0 : d37.hashCode())) * 31;
        Double d38 = this.f74143t;
        int iHashCode20 = (iHashCode19 + (d38 == null ? 0 : d38.hashCode())) * 31;
        Double d39 = this.f74144u;
        int iHashCode21 = (iHashCode20 + (d39 == null ? 0 : d39.hashCode())) * 31;
        Double d44 = this.f74145v;
        return iHashCode21 + (d44 != null ? d44.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("NutritionContentDTO(servingId=", this.f74124a, ", servingUnit=", this.f74125b, ", numberOfUnits=");
        b71.i.t(sbI, this.f74126c, ", calories=", this.f74127d, ", carbs=");
        b71.i.p(this.f74128e, this.f74129f, ", protein=", ", fat=", sbI);
        b71.i.p(this.f74130g, this.f74131h, ", fiber=", ", sugar=", sbI);
        b71.i.p(this.f74132i, this.f74133j, ", addedSugars=", ", saturatedFat=", sbI);
        b71.i.p(this.f74134k, this.f74135l, ", monounsaturatedFat=", ", polyunsaturatedFat=", sbI);
        b71.i.p(this.f74136m, this.f74137n, ", transFat=", ", cholesterol=", sbI);
        b71.i.p(this.f74138o, this.f74139p, ", sodium=", ", potassium=", sbI);
        b71.i.p(this.f74140q, this.f74141r, ", vitaminA=", ", vitaminC=", sbI);
        b71.i.p(this.f74142s, this.f74143t, ", vitaminD=", ", calcium=", sbI);
        return sn.a.f(this.f74144u, this.f74145v, ", iron=", ")", sbI);
    }

    /* JADX INFO: renamed from: g01.c0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/c0$b;", "", "<init>", "()V", "Li63/c;", "Lg01/c0;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<c0> serializer() {
            return a.f74146a;
        }

        private Companion() {
        }
    }

    public c0(String str, String str2, Double d14, Integer num, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44) {
        this.f74124a = str;
        this.f74125b = str2;
        this.f74126c = d14;
        this.f74127d = num;
        this.f74128e = d15;
        this.f74129f = d16;
        this.f74130g = d17;
        this.f74131h = d18;
        this.f74132i = d19;
        this.f74133j = d24;
        this.f74134k = d25;
        this.f74135l = d26;
        this.f74136m = d27;
        this.f74137n = d28;
        this.f74138o = d29;
        this.f74139p = d34;
        this.f74140q = d35;
        this.f74141r = d36;
        this.f74142s = d37;
        this.f74143t = d38;
        this.f74144u = d39;
        this.f74145v = d44;
    }
}
