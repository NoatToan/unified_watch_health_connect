package g01;

import java.util.List;
import lc.u0;
import m63.m1;
import m63.u1;
import m63.v0;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aBk\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b¢\u0006\u0004\b\u0011\u0010\u0012Bs\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017¨\u0006\u001b"}, d2 = {"Lg01/r;", "Lg01/a;", "", "servingQty", "Lg01/o;", "foodMetaData", "Lg01/c0;", "selectedNutritionContent", "", "nutritionContents", "", "mealId", "", "isFavorite", "isRecent", "Lg01/j;", "foodImages", "<init>", "(Ljava/lang/Double;Lg01/o;Lg01/c0;Ljava/util/List;Ljava/lang/Long;ZZLjava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Double;Lg01/o;Lg01/c0;Ljava/util/List;Ljava/lang/Long;ZZLjava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class r extends g01.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f74241j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f74242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f74243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f74244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<c0> f74245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f74246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f74247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f74248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<j> f74249i;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/consumable/FoodResultDTO.$serializer", "Lm63/e0;", "Lg01/r;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74250a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f74250a = aVar;
            m1 m1Var = new m1("FOOD", aVar, 8);
            m1Var.j("servingQty", true);
            m1Var.j("foodMetaData", true);
            m1Var.j("selectedNutritionContent", true);
            m1Var.j("nutritionContents", true);
            m1Var.j("mealId", true);
            m1Var.j("isFavorite", true);
            m1Var.j("isRecent", true);
            m1Var.j("foodImages", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = r.f74241j;
            m63.g gVar = m63.g.f116948a;
            return new i63.c[]{j63.a.d(m63.x.f117036a), j63.a.d(o.a.f74236a), j63.a.d(c0.a.f74146a), lVarArr[3].getValue(), j63.a.d(v0.f117027a), gVar, gVar, lVarArr[7].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = r.f74241j;
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            List list = null;
            Double d14 = null;
            o oVar = null;
            c0 c0Var = null;
            List list2 = null;
            Long l14 = null;
            int i15 = 0;
            boolean zG = false;
            boolean zG2 = false;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        d14 = (Double) cVarC.v(eVar2, 0, m63.x.f117036a, d14);
                        i15 |= 1;
                        break;
                    case 1:
                        oVar = (o) cVarC.v(eVar2, 1, o.a.f74236a, oVar);
                        i15 |= 2;
                        break;
                    case 2:
                        c0Var = (c0) cVarC.v(eVar2, 2, c0.a.f74146a, c0Var);
                        i15 |= 4;
                        break;
                    case 3:
                        list2 = (List) cVarC.l(eVar2, 3, lVarArr[3].getValue(), list2);
                        i15 |= 8;
                        break;
                    case 4:
                        l14 = (Long) cVarC.v(eVar2, 4, v0.f117027a, l14);
                        i15 |= 16;
                        break;
                    case 5:
                        zG = cVarC.g(eVar2, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        zG2 = cVarC.g(eVar2, 6);
                        i15 |= 64;
                        break;
                    case 7:
                        list = (List) cVarC.l(eVar2, 7, lVarArr[7].getValue(), list);
                        i15 |= 128;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new r(i15, d14, oVar, c0Var, list2, l14, zG, zG2, list, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            r rVar = (r) obj;
            rVar.getClass();
            List<j> list = rVar.f74249i;
            boolean z14 = rVar.f74248h;
            boolean z15 = rVar.f74247g;
            Long l14 = rVar.f74246f;
            List<c0> list2 = rVar.f74245e;
            c0 c0Var = rVar.f74244d;
            o oVar = rVar.f74243c;
            Double d14 = rVar.f74242b;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = r.f74241j;
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 0, m63.x.f117036a, d14);
            }
            if (dVarC.C(eVar) || oVar != null) {
                dVarC.d(eVar, 1, o.a.f74236a, oVar);
            }
            if (dVarC.C(eVar) || c0Var != null) {
                dVarC.d(eVar, 2, c0.a.f74146a, c0Var);
            }
            if (dVarC.C(eVar) || !p005kotlin.jvm.internal.s.g(list2, j0.f134944a)) {
                dVarC.e(eVar, 3, lVarArr[3].getValue(), list2);
            }
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 4, v0.f117027a, l14);
            }
            if (dVarC.C(eVar) || z15) {
                dVarC.n(eVar, 5, z15);
            }
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 6, z14);
            }
            if (dVarC.C(eVar) || !p005kotlin.jvm.internal.s.g(list, j0.f134944a)) {
                dVarC.e(eVar, 7, lVarArr[7].getValue(), list);
            }
            dVarC.b(eVar);
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f74241j = new o13.l[]{null, null, null, o13.m.a(nVar, new q(0)), null, null, null, o13.m.a(nVar, new q(1))};
    }

    public r(int i14, Double d14, o oVar, c0 c0Var, List list, Long l14, boolean z14, boolean z15, List list2, u1 u1Var) {
        super(i14, u1Var);
        if ((i14 & 1) == 0) {
            this.f74242b = null;
        } else {
            this.f74242b = d14;
        }
        if ((i14 & 2) == 0) {
            this.f74243c = null;
        } else {
            this.f74243c = oVar;
        }
        if ((i14 & 4) == 0) {
            this.f74244d = null;
        } else {
            this.f74244d = c0Var;
        }
        if ((i14 & 8) == 0) {
            this.f74245e = j0.f134944a;
        } else {
            this.f74245e = list;
        }
        if ((i14 & 16) == 0) {
            this.f74246f = null;
        } else {
            this.f74246f = l14;
        }
        if ((i14 & 32) == 0) {
            this.f74247g = false;
        } else {
            this.f74247g = z14;
        }
        if ((i14 & 64) == 0) {
            this.f74248h = false;
        } else {
            this.f74248h = z15;
        }
        if ((i14 & 128) == 0) {
            this.f74249i = j0.f134944a;
        } else {
            this.f74249i = list2;
        }
    }

    @Override // g01.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final b11.a.C0202a a() {
        b11.d dVarA;
        b11.s sVarB;
        o oVar = this.f74243c;
        if (oVar == null || (dVarA = oVar.a()) == null) {
            return null;
        }
        c0 c0Var = this.f74244d;
        if (c0Var == null) {
            c0Var = (c0) h0.d0(this.f74245e);
        }
        if (c0Var == null || (sVarB = c0Var.b()) == null) {
            return null;
        }
        Double d14 = this.f74242b;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 1.0d;
        b11.t.a aVar = b11.t.f14377d;
        u uVar = dVarA.f14257e;
        aVar.getClass();
        return new b11.a.C0202a(null, dDoubleValue, this.f74247g, this.f74246f, dVarA, sVarB, b11.t.a.a(this.f74249i, uVar), 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.f74242b, rVar.f74242b) && p005kotlin.jvm.internal.s.g(this.f74243c, rVar.f74243c) && p005kotlin.jvm.internal.s.g(this.f74244d, rVar.f74244d) && p005kotlin.jvm.internal.s.g(this.f74245e, rVar.f74245e) && p005kotlin.jvm.internal.s.g(this.f74246f, rVar.f74246f) && this.f74247g == rVar.f74247g && this.f74248h == rVar.f74248h && p005kotlin.jvm.internal.s.g(this.f74249i, rVar.f74249i);
    }

    public final int hashCode() {
        Double d14 = this.f74242b;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        o oVar = this.f74243c;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        c0 c0Var = this.f74244d;
        int iB = u0.b((iHashCode2 + (c0Var == null ? 0 : c0Var.hashCode())) * 31, 31, this.f74245e);
        Long l14 = this.f74246f;
        return this.f74249i.hashCode() + q6.f.g(q6.f.g((iB + (l14 != null ? l14.hashCode() : 0)) * 31, 31, this.f74247g), 31, this.f74248h);
    }

    public final String toString() {
        return "FoodResultDTO(servingQty=" + this.f74242b + ", foodMetaData=" + this.f74243c + ", selectedNutritionContent=" + this.f74244d + ", nutritionContents=" + this.f74245e + ", mealId=" + this.f74246f + ", isFavorite=" + this.f74247g + ", isRecent=" + this.f74248h + ", foodImages=" + this.f74249i + ")";
    }

    /* JADX INFO: renamed from: g01.r$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/r$b;", "", "<init>", "()V", "Li63/c;", "Lg01/r;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<r> serializer() {
            return a.f74250a;
        }

        private Companion() {
        }
    }

    public r() {
        this((Double) null, (o) null, (c0) null, (List) null, (Long) null, false, false, (List) null, 255, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Double d14, o oVar, c0 c0Var, List<c0> list, Long l14, boolean z14, boolean z15, List<j> list2) {
        super(null);
        list.getClass();
        list2.getClass();
        this.f74242b = d14;
        this.f74243c = oVar;
        this.f74244d = c0Var;
        this.f74245e = list;
        this.f74246f = l14;
        this.f74247g = z14;
        this.f74248h = z15;
        this.f74249i = list2;
    }

    public r(Double d14, o oVar, c0 c0Var, List list, Long l14, boolean z14, boolean z15, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : oVar, (i14 & 4) != 0 ? null : c0Var, (i14 & 8) != 0 ? j0.f134944a : list, (i14 & 16) != 0 ? null : l14, (i14 & 32) != 0 ? false : z14, (i14 & 64) != 0 ? false : z15, (i14 & 128) != 0 ? j0.f134944a : list2);
    }
}
