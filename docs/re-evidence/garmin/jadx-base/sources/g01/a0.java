package g01;

import java.util.List;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lg01/a0;", "", "Lb63/o;", "startDate", "endDate", "", "Lg01/g;", "dailyMeals", "<init>", "(Lb63/o;Lb63/o;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILb63/o;Lb63/o;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class a0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f74094d = {null, null, o13.m.a(o13.n.PUBLICATION, new q(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b63.o f74095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.o f74096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<g> f74097c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/consumable/MealsRangeDTO.$serializer", "Lm63/e0;", "Lg01/a0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74098a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f74098a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.MealsRangeDTO", aVar, 3);
            m1Var.j("startDate", false);
            m1Var.j("endDate", false);
            m1Var.j("dailyMeals", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = a0.f74094d;
            h63.k kVar = h63.k.f82304a;
            return new i63.c[]{kVar, kVar, lVarArr[2].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = a0.f74094d;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            b63.o oVar = null;
            b63.o oVar2 = null;
            List list = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    oVar = (b63.o) cVarC.l(eVar2, 0, h63.k.f82304a, oVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    oVar2 = (b63.o) cVarC.l(eVar2, 1, h63.k.f82304a, oVar2);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    list = (List) cVarC.l(eVar2, 2, lVarArr[2].getValue(), list);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new a0(i15, oVar, oVar2, list, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            a0 a0Var = (a0) obj;
            a0Var.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = a0.f74094d;
            h63.k kVar = h63.k.f82304a;
            dVarC.e(eVar, 0, kVar, a0Var.f74095a);
            dVarC.e(eVar, 1, kVar, a0Var.f74096b);
            dVarC.e(eVar, 2, lVarArr[2].getValue(), a0Var.f74097c);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ a0(int i14, b63.o oVar, b63.o oVar2, List list, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f74098a.getF158591b());
            throw null;
        }
        this.f74095a = oVar;
        this.f74096b = oVar2;
        this.f74097c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return p005kotlin.jvm.internal.s.g(this.f74095a, a0Var.f74095a) && p005kotlin.jvm.internal.s.g(this.f74096b, a0Var.f74096b) && p005kotlin.jvm.internal.s.g(this.f74097c, a0Var.f74097c);
    }

    public final int hashCode() {
        return this.f74097c.hashCode() + n23.j.a(this.f74096b.f16206a, this.f74095a.f16206a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MealsRangeDTO(startDate=");
        sb3.append(this.f74095a);
        sb3.append(", endDate=");
        sb3.append(this.f74096b);
        sb3.append(", dailyMeals=");
        return u62.z.c(sb3, this.f74097c, ")");
    }

    /* JADX INFO: renamed from: g01.a0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/a0$b;", "", "<init>", "()V", "Li63/c;", "Lg01/a0;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a0> serializer() {
            return a.f74098a;
        }

        private Companion() {
        }
    }

    public a0(b63.o oVar, b63.o oVar2, List<g> list) {
        oVar.getClass();
        oVar2.getClass();
        list.getClass();
        this.f74095a = oVar;
        this.f74096b = oVar2;
        this.f74097c = list;
    }
}
