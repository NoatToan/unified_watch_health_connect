package i01;

import b63.v;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import g01.c0;
import g01.o;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002!\"B\u0093\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB¥\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001f¨\u0006#"}, d2 = {"Li01/k;", "", "", TtmlNode.ATTR_ID, "logId", "Lb63/l;", "logTimestamp", "_logCategory", "", "servingQty", "Lg01/o;", "foodMetaData", "Lg01/c0;", "nutritionContent", "", "isRecent", "isFavorite", "", "mealId", "customMealId", "Lb63/v;", "mealTime", "foodInactive", "Li01/l;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb63/l;Ljava/lang/String;Ljava/lang/Double;Lg01/o;Lg01/c0;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lb63/v;ZLi01/l;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lb63/l;Ljava/lang/String;Ljava/lang/Double;Lg01/o;Lg01/c0;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lb63/v;ZLi01/l;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f86778o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.l f86781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f86782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f86783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f86784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f86785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f86786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f86787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f86788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Long f86789k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v f86790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f86791m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f86792n;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/log/LoggedFoodDTO.$serializer", "Lm63/e0;", "Li01/k;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f86793a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f86793a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.log.LoggedFoodDTO", aVar, 14);
            m1Var.j(TtmlNode.ATTR_ID, false);
            m1Var.j("logId", false);
            m1Var.j("logTimestamp", false);
            m1Var.j("logCategory", false);
            m1Var.j("servingQty", false);
            m1Var.j("foodMetaData", false);
            m1Var.j("nutritionContent", false);
            m1Var.j("isRecent", false);
            m1Var.j("isFavorite", false);
            m1Var.j("mealId", false);
            m1Var.j("customMealId", false);
            m1Var.j("mealTime", false);
            m1Var.j("foodInactive", false);
            m1Var.j(NotificationConstants.KEY_DATA_MIME_TYPE, true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = k.f86778o;
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD = j63.a.d(y1Var);
            i63.c<?> cVarD2 = j63.a.d(y1Var);
            i63.c<?> cVarD3 = j63.a.d(h63.j.f82302a);
            i63.c<?> cVarD4 = j63.a.d(y1Var);
            i63.c<?> cVarD5 = j63.a.d(x.f117036a);
            i63.c<?> cVarD6 = j63.a.d(o.a.f74236a);
            i63.c<?> cVarD7 = j63.a.d(c0.a.f74146a);
            m63.g gVar = m63.g.f116948a;
            i63.c<?> cVarD8 = j63.a.d(gVar);
            i63.c<?> cVarD9 = j63.a.d(gVar);
            v0 v0Var = v0.f117027a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, cVarD4, cVarD5, cVarD6, cVarD7, cVarD8, cVarD9, j63.a.d(v0Var), j63.a.d(v0Var), j63.a.d(lVarArr[11].getValue()), gVar, j63.a.d(lVarArr[13].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = k.f86778o;
            int i14 = l63.c.f110557a;
            v vVar = null;
            Long l14 = null;
            Long l15 = null;
            Boolean bool = null;
            l lVar = null;
            Boolean bool2 = null;
            int i15 = 0;
            String str = null;
            String str2 = null;
            b63.l lVar2 = null;
            String str3 = null;
            Double d14 = null;
            o oVar = null;
            c0 c0Var = null;
            boolean z14 = true;
            boolean zG = false;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        l14 = l14;
                        vVar = vVar;
                        break;
                    case 0:
                        str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                        i15 |= 1;
                        l14 = l14;
                        vVar = vVar;
                        break;
                    case 1:
                        str2 = (String) cVarC.v(eVar2, 1, y1.f117048a, str2);
                        i15 |= 2;
                        vVar = vVar;
                        str = str;
                        break;
                    case 2:
                        lVar2 = (b63.l) cVarC.v(eVar2, 2, h63.j.f82302a, lVar2);
                        i15 |= 4;
                        str = str;
                        str2 = str2;
                        break;
                    case 3:
                        str3 = (String) cVarC.v(eVar2, 3, y1.f117048a, str3);
                        i15 |= 8;
                        str = str;
                        str2 = str2;
                        break;
                    case 4:
                        d14 = (Double) cVarC.v(eVar2, 4, x.f117036a, d14);
                        i15 |= 16;
                        str = str;
                        str2 = str2;
                        break;
                    case 5:
                        oVar = (o) cVarC.v(eVar2, 5, o.a.f74236a, oVar);
                        i15 |= 32;
                        str = str;
                        str2 = str2;
                        break;
                    case 6:
                        c0Var = (c0) cVarC.v(eVar2, 6, c0.a.f74146a, c0Var);
                        i15 |= 64;
                        str = str;
                        str2 = str2;
                        break;
                    case 7:
                        bool2 = (Boolean) cVarC.v(eVar2, 7, m63.g.f116948a, bool2);
                        i15 |= 128;
                        str = str;
                        str2 = str2;
                        break;
                    case 8:
                        bool = (Boolean) cVarC.v(eVar2, 8, m63.g.f116948a, bool);
                        i15 |= 256;
                        str = str;
                        str2 = str2;
                        break;
                    case 9:
                        l15 = (Long) cVarC.v(eVar2, 9, v0.f117027a, l15);
                        i15 |= 512;
                        str = str;
                        str2 = str2;
                        break;
                    case 10:
                        l14 = (Long) cVarC.v(eVar2, 10, v0.f117027a, l14);
                        i15 |= 1024;
                        str = str;
                        str2 = str2;
                        break;
                    case 11:
                        vVar = (v) cVarC.v(eVar2, 11, lVarArr[11].getValue(), vVar);
                        i15 |= 2048;
                        str = str;
                        str2 = str2;
                        break;
                    case 12:
                        zG = cVarC.g(eVar2, 12);
                        i15 |= 4096;
                        str = str;
                        break;
                    case 13:
                        lVar = (l) cVarC.v(eVar2, 13, lVarArr[13].getValue(), lVar);
                        i15 |= 8192;
                        str = str;
                        str2 = str2;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            Long l16 = l14;
            cVarC.b(eVar2);
            return new k(i15, str, str2, lVar2, str3, d14, oVar, c0Var, bool2, bool, l15, l16, vVar, zG, lVar, (u1) null);
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
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = k.f86778o;
            y1 y1Var = y1.f117048a;
            String str = kVar.f86779a;
            l lVar = kVar.f86792n;
            dVarC.d(eVar, 0, y1Var, str);
            dVarC.d(eVar, 1, y1Var, kVar.f86780b);
            dVarC.d(eVar, 2, h63.j.f82302a, kVar.f86781c);
            dVarC.d(eVar, 3, y1Var, kVar.f86782d);
            dVarC.d(eVar, 4, x.f117036a, kVar.f86783e);
            dVarC.d(eVar, 5, o.a.f74236a, kVar.f86784f);
            dVarC.d(eVar, 6, c0.a.f74146a, kVar.f86785g);
            m63.g gVar = m63.g.f116948a;
            dVarC.d(eVar, 7, gVar, kVar.f86786h);
            dVarC.d(eVar, 8, gVar, kVar.f86787i);
            v0 v0Var = v0.f117027a;
            dVarC.d(eVar, 9, v0Var, kVar.f86788j);
            dVarC.d(eVar, 10, v0Var, kVar.f86789k);
            dVarC.d(eVar, 11, lVarArr[11].getValue(), kVar.f86790l);
            dVarC.n(eVar, 12, kVar.f86791m);
            if (dVarC.C(eVar) || lVar != null) {
                dVarC.d(eVar, 13, lVarArr[13].getValue(), lVar);
            }
            dVarC.b(eVar);
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f86795b;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.QUICK_ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f86794a = iArr;
            int[] iArr2 = new int[l.values().length];
            try {
                iArr2[l.FOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[l.RECIPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f86795b = iArr2;
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f86778o = new o13.l[]{null, null, null, null, null, null, null, null, null, null, null, o13.m.a(nVar, new j(0)), null, o13.m.a(nVar, new j(1))};
    }

    public /* synthetic */ k(int i14, String str, String str2, b63.l lVar, String str3, Double d14, o oVar, c0 c0Var, Boolean bool, Boolean bool2, Long l14, Long l15, v vVar, boolean z14, l lVar2, u1 u1Var) {
        if (8191 != (i14 & 8191)) {
            k1.h(i14, 8191, a.f86793a.getF158591b());
            throw null;
        }
        this.f86779a = str;
        this.f86780b = str2;
        this.f86781c = lVar;
        this.f86782d = str3;
        this.f86783e = d14;
        this.f86784f = oVar;
        this.f86785g = c0Var;
        this.f86786h = bool;
        this.f86787i = bool2;
        this.f86788j = l14;
        this.f86789k = l15;
        this.f86790l = vVar;
        this.f86791m = z14;
        if ((i14 & 8192) == 0) {
            this.f86792n = null;
        } else {
            this.f86792n = lVar2;
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
        return s.g(this.f86779a, kVar.f86779a) && s.g(this.f86780b, kVar.f86780b) && s.g(this.f86781c, kVar.f86781c) && s.g(this.f86782d, kVar.f86782d) && s.g(this.f86783e, kVar.f86783e) && s.g(this.f86784f, kVar.f86784f) && s.g(this.f86785g, kVar.f86785g) && s.g(this.f86786h, kVar.f86786h) && s.g(this.f86787i, kVar.f86787i) && s.g(this.f86788j, kVar.f86788j) && s.g(this.f86789k, kVar.f86789k) && s.g(this.f86790l, kVar.f86790l) && this.f86791m == kVar.f86791m && this.f86792n == kVar.f86792n;
    }

    public final int hashCode() {
        String str = this.f86779a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f86780b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        b63.l lVar = this.f86781c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.f16204a.hashCode())) * 31;
        String str3 = this.f86782d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d14 = this.f86783e;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        o oVar = this.f86784f;
        int iHashCode6 = (iHashCode5 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        c0 c0Var = this.f86785g;
        int iHashCode7 = (iHashCode6 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        Boolean bool = this.f86786h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f86787i;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l14 = this.f86788j;
        int iHashCode10 = (iHashCode9 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f86789k;
        int iHashCode11 = (iHashCode10 + (l15 == null ? 0 : l15.hashCode())) * 31;
        v vVar = this.f86790l;
        int iG = q6.f.g((iHashCode11 + (vVar == null ? 0 : vVar.f16219a.hashCode())) * 31, 31, this.f86791m);
        l lVar2 = this.f86792n;
        return iG + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("LoggedFoodDTO(id=", this.f86779a, ", logId=", this.f86780b, ", logTimestamp=");
        sbI.append(this.f86781c);
        sbI.append(", _logCategory=");
        sbI.append(this.f86782d);
        sbI.append(", servingQty=");
        sbI.append(this.f86783e);
        sbI.append(", foodMetaData=");
        sbI.append(this.f86784f);
        sbI.append(", nutritionContent=");
        sbI.append(this.f86785g);
        sbI.append(", isRecent=");
        sbI.append(this.f86786h);
        sbI.append(", isFavorite=");
        sbI.append(this.f86787i);
        sbI.append(", mealId=");
        sbI.append(this.f86788j);
        sbI.append(", customMealId=");
        sbI.append(this.f86789k);
        sbI.append(", mealTime=");
        sbI.append(this.f86790l);
        sbI.append(", foodInactive=");
        sbI.append(this.f86791m);
        sbI.append(", type=");
        sbI.append(this.f86792n);
        sbI.append(")");
        return sbI.toString();
    }

    /* JADX INFO: renamed from: i01.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li01/k$b;", "", "<init>", "()V", "Li63/c;", "Li01/k;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<k> serializer() {
            return a.f86793a;
        }

        private Companion() {
        }
    }

    public k(String str, String str2, b63.l lVar, String str3, Double d14, o oVar, c0 c0Var, Boolean bool, Boolean bool2, Long l14, Long l15, v vVar, boolean z14, l lVar2) {
        this.f86779a = str;
        this.f86780b = str2;
        this.f86781c = lVar;
        this.f86782d = str3;
        this.f86783e = d14;
        this.f86784f = oVar;
        this.f86785g = c0Var;
        this.f86786h = bool;
        this.f86787i = bool2;
        this.f86788j = l14;
        this.f86789k = l15;
        this.f86790l = vVar;
        this.f86791m = z14;
        this.f86792n = lVar2;
    }

    public /* synthetic */ k(String str, String str2, b63.l lVar, String str3, Double d14, o oVar, c0 c0Var, Boolean bool, Boolean bool2, Long l14, Long l15, v vVar, boolean z14, l lVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, lVar, str3, d14, oVar, c0Var, bool, bool2, l14, l15, vVar, z14, (i14 & 8192) != 0 ? null : lVar2);
    }
}
