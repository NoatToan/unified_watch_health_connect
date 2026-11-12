package l01;

import b63.o;
import b63.v;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import g01.x;
import java.util.List;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'Bå\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 BÕ\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$¨\u0006("}, d2 = {"Ll01/k;", "", "", "weightChangeType", "Lb63/o;", "targetDate", "", "weightChangeRate", "activityLevel", "activeDailyCalories", "", "userDefinedActiveCalories", "calorieGoal", "Ll01/i;", "macroGoals", "Ll01/h;", "micronutrientsSettings", "autoCalorieAdjustment", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lb63/v;", "dailyTimelineStartTime", "dailyTimelineEndTime", "", "startingWeight", "targetWeightGoal", "Ll01/e;", "dailyViewType", "", "Lg01/x;", "meals", "<init>", "(Ljava/lang/String;Lb63/o;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ll01/i;Ll01/h;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lb63/v;Lb63/v;Ljava/lang/Double;Ljava/lang/Double;Ll01/e;Ljava/util/List;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lb63/o;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ll01/i;Ll01/h;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lb63/v;Lb63/v;Ljava/lang/Double;Ljava/lang/Double;Ll01/e;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f107877s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f107879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f107880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f107881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f107882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f107883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f107884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f107885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f107886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f107887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f107888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f107889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v f107890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v f107891n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Double f107892o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Double f107893p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f107894q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<x> f107895r;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/settings/NutritionSettingsDTO.$serializer", "Lm63/e0;", "Ll01/k;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f107896a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f107896a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.settings.NutritionSettingsDTO", aVar, 18);
            m1Var.j("weightChangeType", true);
            m1Var.j("targetDate", true);
            m1Var.j("weightChangeRate", true);
            m1Var.j("activityLevel", true);
            m1Var.j("activeDailyCalories", true);
            m1Var.j("userDefinedActiveCalories", true);
            m1Var.j("calorieGoal", true);
            m1Var.j("macroGoals", true);
            m1Var.j("micronutrientsSettings", true);
            m1Var.j("autoCalorieAdjustment", true);
            m1Var.j("regionCode", true);
            m1Var.j(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, true);
            m1Var.j("dailyTimelineStartTime", true);
            m1Var.j("dailyTimelineEndTime", true);
            m1Var.j("startingWeight", true);
            m1Var.j("targetWeightGoal", true);
            m1Var.j("dailyViewType", true);
            m1Var.j("meals", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = k.f107877s;
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD = j63.a.d(y1Var);
            i63.c<?> cVarD2 = j63.a.d(h63.k.f82304a);
            m0 m0Var = m0.f116981a;
            i63.c<?> cVarD3 = j63.a.d(m0Var);
            i63.c<?> cVarD4 = j63.a.d(y1Var);
            i63.c<?> cVarD5 = j63.a.d(m0Var);
            m63.g gVar = m63.g.f116948a;
            i63.c<?> cVarD6 = j63.a.d(gVar);
            i63.c<?> cVarD7 = j63.a.d(m0Var);
            i63.c<?> cVarD8 = j63.a.d(i.a.f107870a);
            i63.c<?> cVarD9 = j63.a.d(h.a.f107866a);
            i63.c<?> cVarD10 = j63.a.d(gVar);
            i63.c<?> cVarD11 = j63.a.d(y1Var);
            i63.c<?> cVarD12 = j63.a.d(y1Var);
            i63.c<?> cVarD13 = j63.a.d(lVarArr[12].getValue());
            i63.c<?> cVarD14 = j63.a.d(lVarArr[13].getValue());
            m63.x xVar = m63.x.f117036a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, cVarD4, cVarD5, cVarD6, cVarD7, cVarD8, cVarD9, cVarD10, cVarD11, cVarD12, cVarD13, cVarD14, j63.a.d(xVar), j63.a.d(xVar), j63.a.d(lVarArr[16].getValue()), j63.a.d(lVarArr[17].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            Boolean bool;
            int i14;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = k.f107877s;
            int i15 = l63.c.f110557a;
            String str = null;
            String str2 = null;
            Boolean bool2 = null;
            h hVar = null;
            v vVar = null;
            i iVar = null;
            int i16 = 0;
            v vVar2 = null;
            Double d14 = null;
            Double d15 = null;
            e eVar3 = null;
            List list = null;
            Boolean bool3 = null;
            Integer num = null;
            boolean z14 = true;
            String str3 = null;
            o oVar = null;
            Integer num2 = null;
            String str4 = null;
            Integer num3 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        str = str;
                        num = num;
                        z14 = false;
                        str2 = str2;
                        str = str;
                        num = num;
                        break;
                    case 0:
                        bool = bool3;
                        str3 = (String) cVarC.v(eVar2, 0, y1.f117048a, str3);
                        i16 |= 1;
                        str2 = str2;
                        bool3 = bool;
                        str = str;
                        num = num;
                        break;
                    case 1:
                        bool = bool3;
                        oVar = (o) cVarC.v(eVar2, 1, h63.k.f82304a, oVar);
                        i16 |= 2;
                        num2 = num2;
                        bool3 = bool;
                        str = str;
                        num = num;
                        break;
                    case 2:
                        bool = bool3;
                        num2 = (Integer) cVarC.v(eVar2, 2, m0.f116981a, num2);
                        i16 |= 4;
                        bool3 = bool;
                        str = str;
                        num = num;
                        break;
                    case 3:
                        bool = bool3;
                        str4 = (String) cVarC.v(eVar2, 3, y1.f117048a, str4);
                        i16 |= 8;
                        bool3 = bool;
                        str = str;
                        num = num;
                        break;
                    case 4:
                        bool = bool3;
                        num3 = (Integer) cVarC.v(eVar2, 4, m0.f116981a, num3);
                        i16 |= 16;
                        bool3 = bool;
                        str = str;
                        num = num;
                        break;
                    case 5:
                        str = str;
                        num = num;
                        bool3 = (Boolean) cVarC.v(eVar2, 5, m63.g.f116948a, bool3);
                        i16 |= 32;
                        str = str;
                        num = num;
                        break;
                    case 6:
                        num = (Integer) cVarC.v(eVar2, 6, m0.f116981a, num);
                        i16 |= 64;
                        bool3 = bool3;
                        str = str;
                        break;
                    case 7:
                        bool3 = bool3;
                        num = num;
                        iVar = (i) cVarC.v(eVar2, 7, i.a.f107870a, iVar);
                        i16 |= 128;
                        bool3 = bool3;
                        num = num;
                        break;
                    case 8:
                        bool3 = bool3;
                        num = num;
                        hVar = (h) cVarC.v(eVar2, 8, h.a.f107866a, hVar);
                        i16 |= 256;
                        bool3 = bool3;
                        num = num;
                        break;
                    case 9:
                        bool3 = bool3;
                        num = num;
                        bool2 = (Boolean) cVarC.v(eVar2, 9, m63.g.f116948a, bool2);
                        i16 |= 512;
                        bool3 = bool3;
                        num = num;
                        break;
                    case 10:
                        bool3 = bool3;
                        num = num;
                        str2 = (String) cVarC.v(eVar2, 10, y1.f117048a, str2);
                        i16 |= 1024;
                        bool3 = bool3;
                        num = num;
                        break;
                    case 11:
                        bool3 = bool3;
                        num = num;
                        str = (String) cVarC.v(eVar2, 11, y1.f117048a, str);
                        i16 |= 2048;
                        bool3 = bool3;
                        num = num;
                        break;
                    case 12:
                        bool3 = bool3;
                        num = num;
                        vVar = (v) cVarC.v(eVar2, 12, lVarArr[12].getValue(), vVar);
                        i16 |= 4096;
                        bool3 = bool3;
                        num = num;
                        break;
                    case 13:
                        bool3 = bool3;
                        num = num;
                        vVar2 = (v) cVarC.v(eVar2, 13, lVarArr[13].getValue(), vVar2);
                        i16 |= 8192;
                        bool3 = bool3;
                        num = num;
                        break;
                    case 14:
                        bool3 = bool3;
                        num = num;
                        d14 = (Double) cVarC.v(eVar2, 14, m63.x.f117036a, d14);
                        i16 |= 16384;
                        bool3 = bool3;
                        num = num;
                        break;
                    case 15:
                        d15 = (Double) cVarC.v(eVar2, 15, m63.x.f117036a, d15);
                        i14 = 32768;
                        i16 |= i14;
                        bool3 = bool3;
                        num = num;
                        break;
                    case 16:
                        eVar3 = (e) cVarC.v(eVar2, 16, lVarArr[16].getValue(), eVar3);
                        i14 = 65536;
                        i16 |= i14;
                        bool3 = bool3;
                        num = num;
                        break;
                    case 17:
                        list = (List) cVarC.v(eVar2, 17, lVarArr[17].getValue(), list);
                        i14 = 131072;
                        i16 |= i14;
                        bool3 = bool3;
                        num = num;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            String str5 = str;
            Integer num4 = num;
            String str6 = str3;
            o oVar2 = oVar;
            Integer num5 = num2;
            cVarC.b(eVar2);
            return new k(i16, str6, oVar2, num5, str4, num3, bool3, num4, iVar, hVar, bool2, str2, str5, vVar, vVar2, d14, d15, eVar3, list, (u1) null);
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
            List<x> list = kVar.f107895r;
            e eVar = kVar.f107894q;
            Double d14 = kVar.f107893p;
            Double d15 = kVar.f107892o;
            v vVar = kVar.f107891n;
            v vVar2 = kVar.f107890m;
            String str = kVar.f107889l;
            String str2 = kVar.f107888k;
            Boolean bool = kVar.f107887j;
            h hVar = kVar.f107886i;
            i iVar = kVar.f107885h;
            Integer num = kVar.f107884g;
            Boolean bool2 = kVar.f107883f;
            Integer num2 = kVar.f107882e;
            String str3 = kVar.f107881d;
            Integer num3 = kVar.f107880c;
            o oVar = kVar.f107879b;
            String str4 = kVar.f107878a;
            k63.e eVar2 = descriptor;
            l63.d dVarC = fVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = k.f107877s;
            if (dVarC.C(eVar2) || str4 != null) {
                dVarC.d(eVar2, 0, y1.f117048a, str4);
            }
            if (dVarC.C(eVar2) || oVar != null) {
                dVarC.d(eVar2, 1, h63.k.f82304a, oVar);
            }
            if (dVarC.C(eVar2) || num3 != null) {
                dVarC.d(eVar2, 2, m0.f116981a, num3);
            }
            if (dVarC.C(eVar2) || str3 != null) {
                dVarC.d(eVar2, 3, y1.f117048a, str3);
            }
            if (dVarC.C(eVar2) || num2 != null) {
                dVarC.d(eVar2, 4, m0.f116981a, num2);
            }
            if (dVarC.C(eVar2) || bool2 != null) {
                dVarC.d(eVar2, 5, m63.g.f116948a, bool2);
            }
            if (dVarC.C(eVar2) || num != null) {
                dVarC.d(eVar2, 6, m0.f116981a, num);
            }
            if (dVarC.C(eVar2) || iVar != null) {
                dVarC.d(eVar2, 7, i.a.f107870a, iVar);
            }
            if (dVarC.C(eVar2) || hVar != null) {
                dVarC.d(eVar2, 8, h.a.f107866a, hVar);
            }
            if (dVarC.C(eVar2) || bool != null) {
                dVarC.d(eVar2, 9, m63.g.f116948a, bool);
            }
            if (dVarC.C(eVar2) || str2 != null) {
                dVarC.d(eVar2, 10, y1.f117048a, str2);
            }
            if (dVarC.C(eVar2) || str != null) {
                dVarC.d(eVar2, 11, y1.f117048a, str);
            }
            if (dVarC.C(eVar2) || vVar2 != 0) {
                dVarC.d(eVar2, 12, lVarArr[12].getValue(), vVar2);
            }
            if (dVarC.C(eVar2) || vVar != 0) {
                dVarC.d(eVar2, 13, lVarArr[13].getValue(), vVar);
            }
            if (dVarC.C(eVar2) || d15 != null) {
                dVarC.d(eVar2, 14, m63.x.f117036a, d15);
            }
            if (dVarC.C(eVar2) || d14 != null) {
                dVarC.d(eVar2, 15, m63.x.f117036a, d14);
            }
            if (dVarC.C(eVar2) || eVar != null) {
                dVarC.d(eVar2, 16, lVarArr[16].getValue(), eVar);
            }
            if (dVarC.C(eVar2) || list != null) {
                dVarC.d(eVar2, 17, lVarArr[17].getValue(), list);
            }
            dVarC.b(eVar2);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f107877s = new o13.l[]{null, null, null, null, null, null, null, null, null, null, null, null, m.a(nVar, new b(4)), m.a(nVar, new b(5)), null, null, m.a(nVar, new b(6)), m.a(nVar, new b(7))};
    }

    public /* synthetic */ k(String str, o oVar, Integer num, String str2, Integer num2, Boolean bool, Integer num3, i iVar, h hVar, Boolean bool2, String str3, String str4, v vVar, v vVar2, Double d14, Double d15, e eVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : oVar, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : num2, (i14 & 32) != 0 ? null : bool, (i14 & 64) != 0 ? null : num3, (i14 & 128) != 0 ? null : iVar, (i14 & 256) != 0 ? null : hVar, (i14 & 512) != 0 ? null : bool2, (i14 & 1024) != 0 ? null : str3, (i14 & 2048) != 0 ? null : str4, (i14 & 4096) != 0 ? null : vVar, (i14 & 8192) != 0 ? null : vVar2, (i14 & 16384) != 0 ? null : d14, (i14 & 32768) != 0 ? null : d15, (i14 & 65536) != 0 ? null : eVar, (i14 & 131072) != 0 ? null : list);
    }

    public static k a(k kVar, String str, String str2, v vVar, v vVar2, e eVar, int i14) {
        String str3 = kVar.f107878a;
        o oVar = kVar.f107879b;
        Integer num = kVar.f107880c;
        String str4 = kVar.f107881d;
        Integer num2 = kVar.f107882e;
        Boolean bool = kVar.f107883f;
        Integer num3 = kVar.f107884g;
        i iVar = kVar.f107885h;
        h hVar = kVar.f107886i;
        Boolean bool2 = kVar.f107887j;
        String str5 = (i14 & 1024) != 0 ? kVar.f107888k : str;
        String str6 = (i14 & 2048) != 0 ? kVar.f107889l : str2;
        v vVar3 = (i14 & 4096) != 0 ? kVar.f107890m : vVar;
        v vVar4 = (i14 & 8192) != 0 ? kVar.f107891n : vVar2;
        Double d14 = kVar.f107892o;
        Double d15 = kVar.f107893p;
        e eVar2 = (i14 & 65536) != 0 ? kVar.f107894q : eVar;
        List<x> list = kVar.f107895r;
        kVar.getClass();
        return new k(str3, oVar, num, str4, num2, bool, num3, iVar, hVar, bool2, str5, str6, vVar3, vVar4, d14, d15, eVar2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.f107878a, kVar.f107878a) && s.g(this.f107879b, kVar.f107879b) && s.g(this.f107880c, kVar.f107880c) && s.g(this.f107881d, kVar.f107881d) && s.g(this.f107882e, kVar.f107882e) && s.g(this.f107883f, kVar.f107883f) && s.g(this.f107884g, kVar.f107884g) && s.g(this.f107885h, kVar.f107885h) && s.g(this.f107886i, kVar.f107886i) && s.g(this.f107887j, kVar.f107887j) && s.g(this.f107888k, kVar.f107888k) && s.g(this.f107889l, kVar.f107889l) && s.g(this.f107890m, kVar.f107890m) && s.g(this.f107891n, kVar.f107891n) && s.g(this.f107892o, kVar.f107892o) && s.g(this.f107893p, kVar.f107893p) && this.f107894q == kVar.f107894q && s.g(this.f107895r, kVar.f107895r);
    }

    public final int hashCode() {
        String str = this.f107878a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        o oVar = this.f107879b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.f16206a.hashCode())) * 31;
        Integer num = this.f107880c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f107881d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f107882e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f107883f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.f107884g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        i iVar = this.f107885h;
        int iHashCode8 = (iHashCode7 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        h hVar = this.f107886i;
        int iHashCode9 = (iHashCode8 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        Boolean bool2 = this.f107887j;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.f107888k;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f107889l;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        v vVar = this.f107890m;
        int iHashCode13 = (iHashCode12 + (vVar == null ? 0 : vVar.f16219a.hashCode())) * 31;
        v vVar2 = this.f107891n;
        int iHashCode14 = (iHashCode13 + (vVar2 == null ? 0 : vVar2.f16219a.hashCode())) * 31;
        Double d14 = this.f107892o;
        int iHashCode15 = (iHashCode14 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f107893p;
        int iHashCode16 = (iHashCode15 + (d15 == null ? 0 : d15.hashCode())) * 31;
        e eVar = this.f107894q;
        int iHashCode17 = (iHashCode16 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        List<x> list = this.f107895r;
        return iHashCode17 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NutritionSettingsDTO(weightChangeType=");
        sb3.append(this.f107878a);
        sb3.append(", targetDate=");
        sb3.append(this.f107879b);
        sb3.append(", weightChangeRate=");
        p6.b.l(this.f107880c, ", activityLevel=", this.f107881d, ", activeDailyCalories=", sb3);
        kg.f.r(sb3, this.f107882e, ", userDefinedActiveCalories=", this.f107883f, ", calorieGoal=");
        sb3.append(this.f107884g);
        sb3.append(", macroGoals=");
        sb3.append(this.f107885h);
        sb3.append(", micronutrientsSettings=");
        sb3.append(this.f107886i);
        sb3.append(", autoCalorieAdjustment=");
        sb3.append(this.f107887j);
        sb3.append(", regionCode=");
        sn.a.t(sb3, this.f107888k, ", languageCode=", this.f107889l, ", dailyTimelineStartTime=");
        sb3.append(this.f107890m);
        sb3.append(", dailyTimelineEndTime=");
        sb3.append(this.f107891n);
        sb3.append(", startingWeight=");
        b71.i.p(this.f107892o, this.f107893p, ", targetWeightGoal=", ", dailyViewType=", sb3);
        sb3.append(this.f107894q);
        sb3.append(", meals=");
        sb3.append(this.f107895r);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: l01.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll01/k$b;", "", "<init>", "()V", "Li63/c;", "Ll01/k;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<k> serializer() {
            return a.f107896a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ k(int i14, String str, o oVar, Integer num, String str2, Integer num2, Boolean bool, Integer num3, i iVar, h hVar, Boolean bool2, String str3, String str4, v vVar, v vVar2, Double d14, Double d15, e eVar, List list, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f107878a = null;
        } else {
            this.f107878a = str;
        }
        if ((i14 & 2) == 0) {
            this.f107879b = null;
        } else {
            this.f107879b = oVar;
        }
        if ((i14 & 4) == 0) {
            this.f107880c = null;
        } else {
            this.f107880c = num;
        }
        if ((i14 & 8) == 0) {
            this.f107881d = null;
        } else {
            this.f107881d = str2;
        }
        if ((i14 & 16) == 0) {
            this.f107882e = null;
        } else {
            this.f107882e = num2;
        }
        if ((i14 & 32) == 0) {
            this.f107883f = null;
        } else {
            this.f107883f = bool;
        }
        if ((i14 & 64) == 0) {
            this.f107884g = null;
        } else {
            this.f107884g = num3;
        }
        if ((i14 & 128) == 0) {
            this.f107885h = null;
        } else {
            this.f107885h = iVar;
        }
        if ((i14 & 256) == 0) {
            this.f107886i = null;
        } else {
            this.f107886i = hVar;
        }
        if ((i14 & 512) == 0) {
            this.f107887j = null;
        } else {
            this.f107887j = bool2;
        }
        if ((i14 & 1024) == 0) {
            this.f107888k = null;
        } else {
            this.f107888k = str3;
        }
        if ((i14 & 2048) == 0) {
            this.f107889l = null;
        } else {
            this.f107889l = str4;
        }
        if ((i14 & 4096) == 0) {
            this.f107890m = null;
        } else {
            this.f107890m = vVar;
        }
        if ((i14 & 8192) == 0) {
            this.f107891n = null;
        } else {
            this.f107891n = vVar2;
        }
        if ((i14 & 16384) == 0) {
            this.f107892o = null;
        } else {
            this.f107892o = d14;
        }
        if ((32768 & i14) == 0) {
            this.f107893p = null;
        } else {
            this.f107893p = d15;
        }
        if ((65536 & i14) == 0) {
            this.f107894q = null;
        } else {
            this.f107894q = eVar;
        }
        if ((i14 & 131072) == 0) {
            this.f107895r = null;
        } else {
            this.f107895r = list;
        }
    }

    public k(String str, o oVar, Integer num, String str2, Integer num2, Boolean bool, Integer num3, i iVar, h hVar, Boolean bool2, String str3, String str4, v vVar, v vVar2, Double d14, Double d15, e eVar, List<x> list) {
        this.f107878a = str;
        this.f107879b = oVar;
        this.f107880c = num;
        this.f107881d = str2;
        this.f107882e = num2;
        this.f107883f = bool;
        this.f107884g = num3;
        this.f107885h = iVar;
        this.f107886i = hVar;
        this.f107887j = bool2;
        this.f107888k = str3;
        this.f107889l = str4;
        this.f107890m = vVar;
        this.f107891n = vVar2;
        this.f107892o = d14;
        this.f107893p = d15;
        this.f107894q = eVar;
        this.f107895r = list;
    }

    public k() {
        this((String) null, (o) null, (Integer) null, (String) null, (Integer) null, (Boolean) null, (Integer) null, (i) null, (h) null, (Boolean) null, (String) null, (String) null, (v) null, (v) null, (Double) null, (Double) null, (e) null, (List) null, 262143, (p005kotlin.jvm.internal.j) null);
    }
}
