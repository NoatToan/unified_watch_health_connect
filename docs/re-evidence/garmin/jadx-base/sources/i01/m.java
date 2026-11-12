package i01;

import b63.v;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import o13.n;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B»\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b&\u0010'B³\u0002\b\u0010\u0012\u0006\u0010(\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0012\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+¨\u0006/"}, d2 = {"Li01/m;", "", "", TtmlNode.ATTR_ID, "Lb63/l;", "timestamp", "logSource", "Li01/i;", "logCategory", "name", "Lb63/v;", "mealTime", "", "mealId", "Li01/e;", "action", "", "calories", "", "carbs", "protein", "fat", "otherCalories", "fiber", "addedSugars", "sugar", "saturatedFat", "monounsaturatedFat", "polyunsaturatedFat", "transFat", "cholesterol", "sodium", "potassium", "iron", "calcium", "vitaminA", "vitaminC", "vitaminD", "<init>", "(Ljava/lang/String;Lb63/l;Ljava/lang/String;Li01/i;Ljava/lang/String;Lb63/v;Ljava/lang/Long;Li01/e;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lb63/l;Ljava/lang/String;Li01/i;Ljava/lang/String;Lb63/v;Ljava/lang/Long;Li01/e;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class m {
    public static final o13.l<i63.c<Object>>[] C;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final Double A;
    public final Double B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.l f86801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f86803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f86804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f86805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f86806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f86807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f86808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f86809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Double f86810k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f86811l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Double f86812m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Double f86813n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Double f86814o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Double f86815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Double f86816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Double f86817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Double f86818s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Double f86819t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Double f86820u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Double f86821v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Double f86822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Double f86823x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Double f86824y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Double f86825z;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/log/QuickAddFoodLogItemDTO.$serializer", "Lm63/e0;", "Li01/m;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f86826a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f86826a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.log.QuickAddFoodLogItemDTO", aVar, 28);
            m1Var.j("logId", false);
            m1Var.j("logTimestamp", false);
            m1Var.j("logSource", true);
            m1Var.j("logCategory", false);
            m1Var.j("name", false);
            m1Var.j("mealTime", false);
            m1Var.j("mealId", false);
            m1Var.j("action", false);
            m1Var.j("calories", false);
            m1Var.j("carbs", false);
            m1Var.j("protein", false);
            m1Var.j("fat", false);
            m1Var.j("otherCalories", true);
            m1Var.j("fiber", true);
            m1Var.j("addedSugars", true);
            m1Var.j("sugar", true);
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
            o13.l<i63.c<Object>>[] lVarArr = m.C;
            y1 y1Var = y1.f117048a;
            x xVar = x.f117036a;
            return new i63.c[]{j63.a.d(y1Var), j63.a.d(h63.j.f82302a), y1Var, lVarArr[3].getValue(), j63.a.d(y1Var), j63.a.d(lVarArr[5].getValue()), j63.a.d(v0.f117027a), lVarArr[7].getValue(), j63.a.d(m0.f116981a), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            Double d14;
            int i14;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = m.C;
            int i15 = l63.c.f110557a;
            Double d15 = null;
            Double d16 = null;
            Double d17 = null;
            Double d18 = null;
            Double d19 = null;
            Double d24 = null;
            Double d25 = null;
            Double d26 = null;
            Double d27 = null;
            Double d28 = null;
            Double d29 = null;
            Double d34 = null;
            Double d35 = null;
            Double d36 = null;
            boolean z14 = true;
            String str = null;
            String str2 = null;
            b63.l lVar = null;
            i iVar = null;
            String str3 = null;
            v vVar = null;
            Long l14 = null;
            e eVar3 = null;
            Integer num = null;
            Double d37 = null;
            Double d38 = null;
            Double d39 = null;
            Double d44 = null;
            Double d45 = null;
            int i16 = 0;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        Double d46 = d15;
                        d17 = d17;
                        Unit unit = Unit.INSTANCE;
                        z14 = false;
                        d16 = d16;
                        d15 = d46;
                        lVar = lVar;
                        i16 = i16;
                        d26 = d26;
                        d27 = d27;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 0:
                        Double d47 = d15;
                        Double d48 = d27;
                        int i17 = i16;
                        Double d49 = d16;
                        String str4 = (String) cVarC.v(eVar2, 0, y1.f117048a, str2);
                        int i18 = i17 | 1;
                        Unit unit2 = Unit.INSTANCE;
                        i16 = i18;
                        d16 = d49;
                        str2 = str4;
                        d27 = d48;
                        d15 = d47;
                        lVar = lVar;
                        d26 = d26;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 1:
                        Double d54 = d26;
                        Double d55 = d27;
                        b63.l lVar2 = (b63.l) cVarC.v(eVar2, 1, h63.j.f82302a, lVar);
                        int i19 = i16 | 2;
                        Unit unit3 = Unit.INSTANCE;
                        iVar = iVar;
                        d16 = d16;
                        d27 = d55;
                        lVar = lVar2;
                        i16 = i19;
                        d26 = d54;
                        d15 = d15;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 2:
                        Double d56 = d15;
                        Double d57 = d27;
                        String strR = cVarC.r(eVar2, 2);
                        Unit unit4 = Unit.INSTANCE;
                        str = strR;
                        lVar = lVar;
                        d16 = d16;
                        d27 = d57;
                        d15 = d56;
                        i16 |= 4;
                        d26 = d26;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 3:
                        d14 = d26;
                        i iVar2 = (i) cVarC.l(eVar2, 3, lVarArr[3].getValue(), iVar);
                        Unit unit5 = Unit.INSTANCE;
                        i16 |= 8;
                        d16 = d16;
                        iVar = iVar2;
                        d26 = d14;
                        d27 = d27;
                        d15 = d15;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 4:
                        d14 = d26;
                        String str5 = (String) cVarC.v(eVar2, 4, y1.f117048a, str3);
                        Unit unit6 = Unit.INSTANCE;
                        i16 |= 16;
                        d16 = d16;
                        str3 = str5;
                        d26 = d14;
                        d27 = d27;
                        d15 = d15;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 5:
                        d14 = d26;
                        v vVar2 = (v) cVarC.v(eVar2, 5, lVarArr[5].getValue(), vVar);
                        Unit unit7 = Unit.INSTANCE;
                        i16 |= 32;
                        d16 = d16;
                        vVar = vVar2;
                        d26 = d14;
                        d27 = d27;
                        d15 = d15;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 6:
                        d14 = d26;
                        Long l15 = (Long) cVarC.v(eVar2, 6, v0.f117027a, l14);
                        Unit unit8 = Unit.INSTANCE;
                        i16 |= 64;
                        d16 = d16;
                        l14 = l15;
                        d26 = d14;
                        d27 = d27;
                        d15 = d15;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 7:
                        d14 = d26;
                        e eVar4 = (e) cVarC.l(eVar2, 7, lVarArr[7].getValue(), eVar3);
                        Unit unit9 = Unit.INSTANCE;
                        i16 |= 128;
                        d16 = d16;
                        eVar3 = eVar4;
                        d26 = d14;
                        d27 = d27;
                        d15 = d15;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 8:
                        d14 = d26;
                        Integer num2 = (Integer) cVarC.v(eVar2, 8, m0.f116981a, num);
                        Unit unit10 = Unit.INSTANCE;
                        i16 |= 256;
                        d16 = d16;
                        num = num2;
                        d26 = d14;
                        d27 = d27;
                        d15 = d15;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 9:
                        d14 = d26;
                        Double d58 = (Double) cVarC.v(eVar2, 9, x.f117036a, d37);
                        Unit unit11 = Unit.INSTANCE;
                        i16 |= 512;
                        d16 = d16;
                        d37 = d58;
                        d26 = d14;
                        d27 = d27;
                        d15 = d15;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 10:
                        Double d59 = d26;
                        Double d64 = d27;
                        int i24 = i16;
                        Double d65 = d16;
                        Double d66 = (Double) cVarC.v(eVar2, 10, x.f117036a, d38);
                        int i25 = i24 | 1024;
                        Unit unit12 = Unit.INSTANCE;
                        d38 = d66;
                        lVar = lVar;
                        d16 = d65;
                        d26 = d59;
                        d27 = d64;
                        i16 = i25;
                        d15 = d15;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 11:
                        d14 = d26;
                        Double d67 = (Double) cVarC.v(eVar2, 11, x.f117036a, d39);
                        Unit unit13 = Unit.INSTANCE;
                        i16 |= 2048;
                        d16 = d16;
                        d39 = d67;
                        d26 = d14;
                        d27 = d27;
                        d15 = d15;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 12:
                        d14 = d26;
                        Double d68 = (Double) cVarC.v(eVar2, 12, x.f117036a, d44);
                        Unit unit14 = Unit.INSTANCE;
                        i16 |= 4096;
                        d16 = d16;
                        d44 = d68;
                        d26 = d14;
                        d27 = d27;
                        d15 = d15;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 13:
                        d14 = d26;
                        Double d69 = (Double) cVarC.v(eVar2, 13, x.f117036a, d45);
                        Unit unit15 = Unit.INSTANCE;
                        i16 |= 8192;
                        d16 = d16;
                        d45 = d69;
                        d26 = d14;
                        d27 = d27;
                        d15 = d15;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 14:
                        d15 = d15;
                        d27 = d27;
                        d26 = (Double) cVarC.v(eVar2, 14, x.f117036a, d26);
                        Unit unit16 = Unit.INSTANCE;
                        i16 |= 16384;
                        d27 = d27;
                        d15 = d15;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 15:
                        Double d74 = d26;
                        d15 = d15;
                        d27 = (Double) cVarC.v(eVar2, 15, x.f117036a, d27);
                        Unit unit17 = Unit.INSTANCE;
                        i16 |= 32768;
                        d17 = d17;
                        lVar = lVar;
                        d26 = d74;
                        d15 = d15;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 16:
                        d29 = (Double) cVarC.v(eVar2, 16, x.f117036a, d29);
                        i14 = 65536;
                        Unit unit18 = Unit.INSTANCE;
                        d17 = d17;
                        i16 |= i14;
                        lVar = lVar;
                        d26 = d26;
                        d27 = d27;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 17:
                        d34 = (Double) cVarC.v(eVar2, 17, x.f117036a, d34);
                        i14 = 131072;
                        Unit unit19 = Unit.INSTANCE;
                        d17 = d17;
                        i16 |= i14;
                        lVar = lVar;
                        d26 = d26;
                        d27 = d27;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 18:
                        d35 = (Double) cVarC.v(eVar2, 18, x.f117036a, d35);
                        i14 = GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                        Unit unit110 = Unit.INSTANCE;
                        d17 = d17;
                        i16 |= i14;
                        lVar = lVar;
                        d26 = d26;
                        d27 = d27;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 19:
                        d36 = (Double) cVarC.v(eVar2, 19, x.f117036a, d36);
                        i14 = 524288;
                        Unit unit111 = Unit.INSTANCE;
                        d17 = d17;
                        i16 |= i14;
                        lVar = lVar;
                        d26 = d26;
                        d27 = d27;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 20:
                        d24 = (Double) cVarC.v(eVar2, 20, x.f117036a, d24);
                        i14 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        Unit unit112 = Unit.INSTANCE;
                        d17 = d17;
                        i16 |= i14;
                        lVar = lVar;
                        d26 = d26;
                        d27 = d27;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 21:
                        d18 = (Double) cVarC.v(eVar2, 21, x.f117036a, d18);
                        i14 = 2097152;
                        Unit unit113 = Unit.INSTANCE;
                        d17 = d17;
                        i16 |= i14;
                        lVar = lVar;
                        d26 = d26;
                        d27 = d27;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 22:
                        d17 = (Double) cVarC.v(eVar2, 22, x.f117036a, d17);
                        i14 = 4194304;
                        Unit unit114 = Unit.INSTANCE;
                        d17 = d17;
                        i16 |= i14;
                        lVar = lVar;
                        d26 = d26;
                        d27 = d27;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 23:
                        d16 = (Double) cVarC.v(eVar2, 23, x.f117036a, d16);
                        i14 = 8388608;
                        Unit unit115 = Unit.INSTANCE;
                        d17 = d17;
                        i16 |= i14;
                        lVar = lVar;
                        d26 = d26;
                        d27 = d27;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 24:
                        d15 = (Double) cVarC.v(eVar2, 24, x.f117036a, d15);
                        i14 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                        Unit unit116 = Unit.INSTANCE;
                        d17 = d17;
                        i16 |= i14;
                        lVar = lVar;
                        d26 = d26;
                        d27 = d27;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 25:
                        d19 = (Double) cVarC.v(eVar2, 25, x.f117036a, d19);
                        i14 = 33554432;
                        Unit unit117 = Unit.INSTANCE;
                        d17 = d17;
                        i16 |= i14;
                        lVar = lVar;
                        d26 = d26;
                        d27 = d27;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 26:
                        d28 = (Double) cVarC.v(eVar2, 26, x.f117036a, d28);
                        i14 = 67108864;
                        Unit unit118 = Unit.INSTANCE;
                        d17 = d17;
                        i16 |= i14;
                        lVar = lVar;
                        d26 = d26;
                        d27 = d27;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    case 27:
                        d25 = (Double) cVarC.v(eVar2, 27, x.f117036a, d25);
                        i14 = 134217728;
                        Unit unit119 = Unit.INSTANCE;
                        d17 = d17;
                        i16 |= i14;
                        lVar = lVar;
                        d26 = d26;
                        d27 = d27;
                        d17 = d17;
                        lVar = lVar;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            Double d75 = d17;
            Double d76 = d26;
            Double d77 = d27;
            b63.l lVar3 = lVar;
            i iVar3 = iVar;
            int i26 = i16;
            Double d78 = d16;
            String str6 = str2;
            cVarC.b(eVar2);
            Integer num3 = num;
            Double d79 = d36;
            return new m(i26, str6, lVar3, str, iVar3, str3, vVar, l14, eVar3, num3, d37, d38, d39, d44, d45, d76, d77, d29, d34, d35, d79, d24, d18, d75, d78, d15, d19, d28, d25, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            m mVar = (m) obj;
            mVar.getClass();
            Double d14 = mVar.B;
            Double d15 = mVar.A;
            Double d16 = mVar.f86825z;
            Double d17 = mVar.f86824y;
            Double d18 = mVar.f86823x;
            Double d19 = mVar.f86822w;
            Double d24 = mVar.f86821v;
            Double d25 = mVar.f86820u;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = m.C;
            y1 y1Var = y1.f117048a;
            String str = mVar.f86800a;
            Double d26 = mVar.f86819t;
            Double d27 = mVar.f86818s;
            Double d28 = mVar.f86817r;
            Double d29 = mVar.f86816q;
            Double d34 = mVar.f86815p;
            Double d35 = mVar.f86814o;
            Double d36 = mVar.f86813n;
            Double d37 = mVar.f86812m;
            String str2 = mVar.f86802c;
            dVarC.d(eVar, 0, y1Var, str);
            dVarC.d(eVar, 1, h63.j.f82302a, mVar.f86801b);
            if (dVarC.C(eVar) || !s.g(str2, "GCM")) {
                dVarC.k(eVar, 2, str2);
            }
            dVarC.e(eVar, 3, lVarArr[3].getValue(), mVar.f86803d);
            dVarC.d(eVar, 4, y1Var, mVar.f86804e);
            dVarC.d(eVar, 5, lVarArr[5].getValue(), mVar.f86805f);
            dVarC.d(eVar, 6, v0.f117027a, mVar.f86806g);
            dVarC.e(eVar, 7, lVarArr[7].getValue(), mVar.f86807h);
            dVarC.d(eVar, 8, m0.f116981a, mVar.f86808i);
            x xVar = x.f117036a;
            dVarC.d(eVar, 9, xVar, mVar.f86809j);
            dVarC.d(eVar, 10, xVar, mVar.f86810k);
            dVarC.d(eVar, 11, xVar, mVar.f86811l);
            if (dVarC.C(eVar) || d37 != null) {
                dVarC.d(eVar, 12, xVar, d37);
            }
            if (dVarC.C(eVar) || d36 != null) {
                dVarC.d(eVar, 13, xVar, d36);
            }
            if (dVarC.C(eVar) || d35 != null) {
                dVarC.d(eVar, 14, xVar, d35);
            }
            if (dVarC.C(eVar) || d34 != null) {
                dVarC.d(eVar, 15, xVar, d34);
            }
            if (dVarC.C(eVar) || d29 != null) {
                dVarC.d(eVar, 16, xVar, d29);
            }
            if (dVarC.C(eVar) || d28 != null) {
                dVarC.d(eVar, 17, xVar, d28);
            }
            if (dVarC.C(eVar) || d27 != null) {
                dVarC.d(eVar, 18, xVar, d27);
            }
            if (dVarC.C(eVar) || d26 != null) {
                dVarC.d(eVar, 19, xVar, d26);
            }
            if (dVarC.C(eVar) || d25 != null) {
                dVarC.d(eVar, 20, xVar, d25);
            }
            if (dVarC.C(eVar) || d24 != null) {
                dVarC.d(eVar, 21, xVar, d24);
            }
            if (dVarC.C(eVar) || d19 != null) {
                dVarC.d(eVar, 22, xVar, d19);
            }
            if (dVarC.C(eVar) || d18 != null) {
                dVarC.d(eVar, 23, xVar, d18);
            }
            if (dVarC.C(eVar) || d17 != null) {
                dVarC.d(eVar, 24, xVar, d17);
            }
            if (dVarC.C(eVar) || d16 != null) {
                dVarC.d(eVar, 25, xVar, d16);
            }
            if (dVarC.C(eVar) || d15 != null) {
                dVarC.d(eVar, 26, xVar, d15);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 27, xVar, d14);
            }
            dVarC.b(eVar);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        C = new o13.l[]{null, null, null, o13.m.a(nVar, new j(3)), null, o13.m.a(nVar, new j(4)), null, o13.m.a(nVar, new j(5)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ m(int i14, String str, b63.l lVar, String str2, i iVar, String str3, v vVar, Long l14, e eVar, Integer num, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44, u1 u1Var) {
        if (4091 != (i14 & 4091)) {
            k1.h(i14, 4091, a.f86826a.getF158591b());
            throw null;
        }
        this.f86800a = str;
        this.f86801b = lVar;
        if ((i14 & 4) == 0) {
            this.f86802c = "GCM";
        } else {
            this.f86802c = str2;
        }
        this.f86803d = iVar;
        this.f86804e = str3;
        this.f86805f = vVar;
        this.f86806g = l14;
        this.f86807h = eVar;
        this.f86808i = num;
        this.f86809j = d14;
        this.f86810k = d15;
        this.f86811l = d16;
        if ((i14 & 4096) == 0) {
            this.f86812m = null;
        } else {
            this.f86812m = d17;
        }
        if ((i14 & 8192) == 0) {
            this.f86813n = null;
        } else {
            this.f86813n = d18;
        }
        if ((i14 & 16384) == 0) {
            this.f86814o = null;
        } else {
            this.f86814o = d19;
        }
        if ((32768 & i14) == 0) {
            this.f86815p = null;
        } else {
            this.f86815p = d24;
        }
        if ((65536 & i14) == 0) {
            this.f86816q = null;
        } else {
            this.f86816q = d25;
        }
        if ((131072 & i14) == 0) {
            this.f86817r = null;
        } else {
            this.f86817r = d26;
        }
        if ((262144 & i14) == 0) {
            this.f86818s = null;
        } else {
            this.f86818s = d27;
        }
        if ((524288 & i14) == 0) {
            this.f86819t = null;
        } else {
            this.f86819t = d28;
        }
        if ((1048576 & i14) == 0) {
            this.f86820u = null;
        } else {
            this.f86820u = d29;
        }
        if ((2097152 & i14) == 0) {
            this.f86821v = null;
        } else {
            this.f86821v = d34;
        }
        if ((4194304 & i14) == 0) {
            this.f86822w = null;
        } else {
            this.f86822w = d35;
        }
        if ((8388608 & i14) == 0) {
            this.f86823x = null;
        } else {
            this.f86823x = d36;
        }
        if ((16777216 & i14) == 0) {
            this.f86824y = null;
        } else {
            this.f86824y = d37;
        }
        if ((33554432 & i14) == 0) {
            this.f86825z = null;
        } else {
            this.f86825z = d38;
        }
        if ((67108864 & i14) == 0) {
            this.A = null;
        } else {
            this.A = d39;
        }
        if ((i14 & 134217728) == 0) {
            this.B = null;
        } else {
            this.B = d44;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return s.g(this.f86800a, mVar.f86800a) && s.g(this.f86801b, mVar.f86801b) && s.g(this.f86802c, mVar.f86802c) && this.f86803d == mVar.f86803d && s.g(this.f86804e, mVar.f86804e) && s.g(this.f86805f, mVar.f86805f) && s.g(this.f86806g, mVar.f86806g) && this.f86807h == mVar.f86807h && s.g(this.f86808i, mVar.f86808i) && s.g(this.f86809j, mVar.f86809j) && s.g(this.f86810k, mVar.f86810k) && s.g(this.f86811l, mVar.f86811l) && s.g(this.f86812m, mVar.f86812m) && s.g(this.f86813n, mVar.f86813n) && s.g(this.f86814o, mVar.f86814o) && s.g(this.f86815p, mVar.f86815p) && s.g(this.f86816q, mVar.f86816q) && s.g(this.f86817r, mVar.f86817r) && s.g(this.f86818s, mVar.f86818s) && s.g(this.f86819t, mVar.f86819t) && s.g(this.f86820u, mVar.f86820u) && s.g(this.f86821v, mVar.f86821v) && s.g(this.f86822w, mVar.f86822w) && s.g(this.f86823x, mVar.f86823x) && s.g(this.f86824y, mVar.f86824y) && s.g(this.f86825z, mVar.f86825z) && s.g(this.A, mVar.A) && s.g(this.B, mVar.B);
    }

    public final int hashCode() {
        String str = this.f86800a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        b63.l lVar = this.f86801b;
        int iHashCode2 = (this.f86803d.hashCode() + wr.g.j((iHashCode + (lVar == null ? 0 : lVar.f16204a.hashCode())) * 31, 31, this.f86802c)) * 31;
        String str2 = this.f86804e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        v vVar = this.f86805f;
        int iHashCode4 = (iHashCode3 + (vVar == null ? 0 : vVar.f16219a.hashCode())) * 31;
        Long l14 = this.f86806g;
        int iHashCode5 = (this.f86807h.hashCode() + ((iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31)) * 31;
        Integer num = this.f86808i;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.f86809j;
        int iHashCode7 = (iHashCode6 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f86810k;
        int iHashCode8 = (iHashCode7 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f86811l;
        int iHashCode9 = (iHashCode8 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f86812m;
        int iHashCode10 = (iHashCode9 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f86813n;
        int iHashCode11 = (iHashCode10 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f86814o;
        int iHashCode12 = (iHashCode11 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.f86815p;
        int iHashCode13 = (iHashCode12 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.f86816q;
        int iHashCode14 = (iHashCode13 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.f86817r;
        int iHashCode15 = (iHashCode14 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.f86818s;
        int iHashCode16 = (iHashCode15 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Double d28 = this.f86819t;
        int iHashCode17 = (iHashCode16 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.f86820u;
        int iHashCode18 = (iHashCode17 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Double d34 = this.f86821v;
        int iHashCode19 = (iHashCode18 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Double d35 = this.f86822w;
        int iHashCode20 = (iHashCode19 + (d35 == null ? 0 : d35.hashCode())) * 31;
        Double d36 = this.f86823x;
        int iHashCode21 = (iHashCode20 + (d36 == null ? 0 : d36.hashCode())) * 31;
        Double d37 = this.f86824y;
        int iHashCode22 = (iHashCode21 + (d37 == null ? 0 : d37.hashCode())) * 31;
        Double d38 = this.f86825z;
        int iHashCode23 = (iHashCode22 + (d38 == null ? 0 : d38.hashCode())) * 31;
        Double d39 = this.A;
        int iHashCode24 = (iHashCode23 + (d39 == null ? 0 : d39.hashCode())) * 31;
        Double d44 = this.B;
        return iHashCode24 + (d44 != null ? d44.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("QuickAddFoodLogItemDTO(id=");
        sb3.append(this.f86800a);
        sb3.append(", timestamp=");
        sb3.append(this.f86801b);
        sb3.append(", logSource=");
        sb3.append(this.f86802c);
        sb3.append(", logCategory=");
        sb3.append(this.f86803d);
        sb3.append(", name=");
        sb3.append(this.f86804e);
        sb3.append(", mealTime=");
        sb3.append(this.f86805f);
        sb3.append(", mealId=");
        sb3.append(this.f86806g);
        sb3.append(", action=");
        sb3.append(this.f86807h);
        sb3.append(", calories=");
        b71.i.v(sb3, this.f86808i, ", carbs=", this.f86809j, ", protein=");
        b71.i.p(this.f86810k, this.f86811l, ", fat=", ", otherCalories=", sb3);
        b71.i.p(this.f86812m, this.f86813n, ", fiber=", ", addedSugars=", sb3);
        b71.i.p(this.f86814o, this.f86815p, ", sugar=", ", saturatedFat=", sb3);
        b71.i.p(this.f86816q, this.f86817r, ", monounsaturatedFat=", ", polyunsaturatedFat=", sb3);
        b71.i.p(this.f86818s, this.f86819t, ", transFat=", ", cholesterol=", sb3);
        b71.i.p(this.f86820u, this.f86821v, ", sodium=", ", potassium=", sb3);
        b71.i.p(this.f86822w, this.f86823x, ", iron=", ", calcium=", sb3);
        b71.i.p(this.f86824y, this.f86825z, ", vitaminA=", ", vitaminC=", sb3);
        return sn.a.f(this.A, this.B, ", vitaminD=", ")", sb3);
    }

    /* JADX INFO: renamed from: i01.m$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li01/m$b;", "", "<init>", "()V", "Li63/c;", "Li01/m;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<m> serializer() {
            return a.f86826a;
        }

        private Companion() {
        }
    }

    public m(String str, b63.l lVar, String str2, i iVar, String str3, v vVar, Long l14, e eVar, Integer num, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44) {
        str2.getClass();
        iVar.getClass();
        eVar.getClass();
        this.f86800a = str;
        this.f86801b = lVar;
        this.f86802c = str2;
        this.f86803d = iVar;
        this.f86804e = str3;
        this.f86805f = vVar;
        this.f86806g = l14;
        this.f86807h = eVar;
        this.f86808i = num;
        this.f86809j = d14;
        this.f86810k = d15;
        this.f86811l = d16;
        this.f86812m = d17;
        this.f86813n = d18;
        this.f86814o = d19;
        this.f86815p = d24;
        this.f86816q = d25;
        this.f86817r = d26;
        this.f86818s = d27;
        this.f86819t = d28;
        this.f86820u = d29;
        this.f86821v = d34;
        this.f86822w = d35;
        this.f86823x = d36;
        this.f86824y = d37;
        this.f86825z = d38;
        this.A = d39;
        this.B = d44;
    }

    public /* synthetic */ m(String str, b63.l lVar, String str2, i iVar, String str3, v vVar, Long l14, e eVar, Integer num, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, lVar, (i14 & 4) != 0 ? "GCM" : str2, iVar, str3, vVar, l14, eVar, num, d14, d15, d16, (i14 & 4096) != 0 ? null : d17, (i14 & 8192) != 0 ? null : d18, (i14 & 16384) != 0 ? null : d19, (32768 & i14) != 0 ? null : d24, (65536 & i14) != 0 ? null : d25, (131072 & i14) != 0 ? null : d26, (262144 & i14) != 0 ? null : d27, (524288 & i14) != 0 ? null : d28, (1048576 & i14) != 0 ? null : d29, (2097152 & i14) != 0 ? null : d34, (4194304 & i14) != 0 ? null : d35, (8388608 & i14) != 0 ? null : d36, (16777216 & i14) != 0 ? null : d37, (33554432 & i14) != 0 ? null : d38, (67108864 & i14) != 0 ? null : d39, (i14 & 134217728) != 0 ? null : d44);
    }
}
