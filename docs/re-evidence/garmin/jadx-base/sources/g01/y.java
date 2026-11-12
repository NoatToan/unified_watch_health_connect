package g01;

import java.util.List;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lg01/y;", "", "Lg01/x;", "meal", "Lg01/c0;", "nutritionContent", "Lk01/d;", "nutritionGoals", "", "Li01/k;", "loggedFoods", "<init>", "(Lg01/x;Lg01/c0;Lk01/d;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILg01/x;Lg01/c0;Lk01/d;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class y {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f74287e = {null, null, null, o13.m.a(o13.n.PUBLICATION, new q(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f74288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f74289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k01.d f74290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<i01.k> f74291d;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/consumable/MealDetailsDTO.$serializer", "Lm63/e0;", "Lg01/y;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74292a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f74292a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.MealDetailsDTO", aVar, 4);
            m1Var.j("meal", false);
            m1Var.j("mealNutritionContent", false);
            m1Var.j("mealNutritionGoals", false);
            m1Var.j("loggedFoods", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(x.a.f74286a), j63.a.d(c0.a.f74146a), j63.a.d(k01.d.a.f102046a), j63.a.d(y.f74287e[3].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = y.f74287e;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            x xVar = null;
            c0 c0Var = null;
            k01.d dVar = null;
            List list = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    xVar = (x) cVarC.v(eVar2, 0, x.a.f74286a, xVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    c0Var = (c0) cVarC.v(eVar2, 1, c0.a.f74146a, c0Var);
                    i15 |= 2;
                } else if (iE == 2) {
                    dVar = (k01.d) cVarC.v(eVar2, 2, k01.d.a.f102046a, dVar);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    list = (List) cVarC.v(eVar2, 3, lVarArr[3].getValue(), list);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new y(i15, xVar, c0Var, dVar, list, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            y yVar = (y) obj;
            yVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = y.f74287e;
            dVarC.d(eVar, 0, x.a.f74286a, yVar.f74288a);
            dVarC.d(eVar, 1, c0.a.f74146a, yVar.f74289b);
            dVarC.d(eVar, 2, k01.d.a.f102046a, yVar.f74290c);
            dVarC.d(eVar, 3, lVarArr[3].getValue(), yVar.f74291d);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ y(int i14, x xVar, c0 c0Var, k01.d dVar, List list, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, a.f74292a.getF158591b());
            throw null;
        }
        this.f74288a = xVar;
        this.f74289b = c0Var;
        this.f74290c = dVar;
        this.f74291d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return p005kotlin.jvm.internal.s.g(this.f74288a, yVar.f74288a) && p005kotlin.jvm.internal.s.g(this.f74289b, yVar.f74289b) && p005kotlin.jvm.internal.s.g(this.f74290c, yVar.f74290c) && p005kotlin.jvm.internal.s.g(this.f74291d, yVar.f74291d);
    }

    public final int hashCode() {
        x xVar = this.f74288a;
        int iHashCode = (xVar == null ? 0 : xVar.hashCode()) * 31;
        c0 c0Var = this.f74289b;
        int iHashCode2 = (iHashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        k01.d dVar = this.f74290c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List<i01.k> list = this.f74291d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "MealDetailsDTO(meal=" + this.f74288a + ", nutritionContent=" + this.f74289b + ", nutritionGoals=" + this.f74290c + ", loggedFoods=" + this.f74291d + ")";
    }

    /* JADX INFO: renamed from: g01.y$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/y$b;", "", "<init>", "()V", "Li63/c;", "Lg01/y;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<y> serializer() {
            return a.f74292a;
        }

        private Companion() {
        }
    }

    public y(x xVar, c0 c0Var, k01.d dVar, List<i01.k> list) {
        this.f74288a = xVar;
        this.f74289b = c0Var;
        this.f74290c = dVar;
        this.f74291d = list;
    }
}
