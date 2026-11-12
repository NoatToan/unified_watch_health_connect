package k01;

import b63.o;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lk01/h;", "", "Lb63/o;", "date", "Lk01/k;", "nutritionContent", "Lk01/d;", "nutritionGoals", "<init>", "(Lb63/o;Lk01/k;Lk01/d;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILb63/o;Lk01/k;Lk01/d;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f102060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f102061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f102062c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/reports/ThinDailyNutritionDTO.$serializer", "Lm63/e0;", "Lk01/h;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f102063a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f102063a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.reports.ThinDailyNutritionDTO", aVar, 3);
            m1Var.j("mealDate", false);
            m1Var.j("nutritionContent", false);
            m1Var.j("nutritionGoals", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(h63.k.f82304a), j63.a.d(k.a.f102093a), j63.a.d(d.a.f102046a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            o oVar = null;
            k kVar = null;
            d dVar = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    oVar = (o) cVarC.v(eVar2, 0, h63.k.f82304a, oVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    kVar = (k) cVarC.v(eVar2, 1, k.a.f102093a, kVar);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    dVar = (d) cVarC.v(eVar2, 2, d.a.f102046a, dVar);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new h(i15, oVar, kVar, dVar, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            h hVar = (h) obj;
            hVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.d(eVar, 0, h63.k.f82304a, hVar.f102060a);
            dVarC.d(eVar, 1, k.a.f102093a, hVar.f102061b);
            dVarC.d(eVar, 2, d.a.f102046a, hVar.f102062c);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ h(int i14, o oVar, k kVar, d dVar, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f102063a.getF158591b());
            throw null;
        }
        this.f102060a = oVar;
        this.f102061b = kVar;
        this.f102062c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f102060a, hVar.f102060a) && s.g(this.f102061b, hVar.f102061b) && s.g(this.f102062c, hVar.f102062c);
    }

    public final int hashCode() {
        o oVar = this.f102060a;
        int iHashCode = (oVar == null ? 0 : oVar.f16206a.hashCode()) * 31;
        k kVar = this.f102061b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        d dVar = this.f102062c;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "ThinDailyNutritionDTO(date=" + this.f102060a + ", nutritionContent=" + this.f102061b + ", nutritionGoals=" + this.f102062c + ")";
    }

    /* JADX INFO: renamed from: k01.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk01/h$b;", "", "<init>", "()V", "Li63/c;", "Lk01/h;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<h> serializer() {
            return a.f102063a;
        }

        private Companion() {
        }
    }

    public h(o oVar, k kVar, d dVar) {
        this.f102060a = oVar;
        this.f102061b = kVar;
        this.f102062c = dVar;
    }
}
