package g01;

import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import lc.u0;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B9\u0012\u0013\b\u0002\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002\u0012\u0013\b\u0002\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lg01/v;", "", "", "Lg01/a;", "Li63/d;", "frequentFoods", "recentFoods", "", "moreRecentFoodsAvailable", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;ZLm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class v {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f74264d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<g01.a> f74265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g01.a> f74266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f74267c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/consumable/FoodSuggestionsDTO.$serializer", "Lm63/e0;", "Lg01/v;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74268a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f74268a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.FoodSuggestionsDTO", aVar, 3);
            m1Var.j("frequentFoods", true);
            m1Var.j("recentFoods", true);
            m1Var.j("moreRecentFoodsAvailable", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = v.f74264d;
            return new i63.c[]{lVarArr[0].getValue(), lVarArr[1].getValue(), m63.g.f116948a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = v.f74264d;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            boolean zG = false;
            List list = null;
            List list2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    list = (List) cVarC.l(eVar2, 0, lVarArr[0].getValue(), list);
                    i15 |= 1;
                } else if (iE == 1) {
                    list2 = (List) cVarC.l(eVar2, 1, lVarArr[1].getValue(), list2);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    zG = cVarC.g(eVar2, 2);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new v(i15, list, list2, zG, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            v vVar = (v) obj;
            vVar.getClass();
            List<g01.a> list = vVar.f74266b;
            List<g01.a> list2 = vVar.f74265a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = v.f74264d;
            if (dVarC.C(eVar) || !p005kotlin.jvm.internal.s.g(list2, j0.f134944a)) {
                dVarC.e(eVar, 0, lVarArr[0].getValue(), list2);
            }
            if (dVarC.C(eVar) || !p005kotlin.jvm.internal.s.g(list, j0.f134944a)) {
                dVarC.e(eVar, 1, lVarArr[1].getValue(), list);
            }
            dVarC.n(eVar, 2, vVar.f74267c);
            dVarC.b(eVar);
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f74264d = new o13.l[]{o13.m.a(nVar, new q(5)), o13.m.a(nVar, new q(6)), null};
    }

    public v(int i14, List list, List list2, boolean z14, u1 u1Var) {
        if (4 != (i14 & 4)) {
            k1.h(i14, 4, a.f74268a.getF158591b());
            throw null;
        }
        this.f74265a = (i14 & 1) == 0 ? j0.f134944a : list;
        if ((i14 & 2) == 0) {
            this.f74266b = j0.f134944a;
        } else {
            this.f74266b = list2;
        }
        this.f74267c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f74265a, vVar.f74265a) && p005kotlin.jvm.internal.s.g(this.f74266b, vVar.f74266b) && this.f74267c == vVar.f74267c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f74267c) + u0.b(this.f74265a.hashCode() * 31, 31, this.f74266b);
    }

    public final String toString() {
        return hb.a.k(f3.k("FoodSuggestionsDTO(frequentFoods=", ", recentFoods=", ", moreRecentFoodsAvailable=", this.f74265a, this.f74266b), this.f74267c, ")");
    }

    /* JADX INFO: renamed from: g01.v$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/v$b;", "", "<init>", "()V", "Li63/c;", "Lg01/v;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<v> serializer() {
            return a.f74268a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(List<? extends g01.a> list, List<? extends g01.a> list2, boolean z14) {
        list.getClass();
        list2.getClass();
        this.f74265a = list;
        this.f74266b = list2;
        this.f74267c = z14;
    }

    public v(List list, List list2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? j0.f134944a : list2, z14);
    }
}
