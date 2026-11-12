package k01;

import b63.o;
import m63.e0;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lk01/l;", "", "Lb63/o;", "startDate", "endDate", "Lk01/k;", "averageNutritionContents", "averageDailyGoal", "<init>", "(Lb63/o;Lb63/o;Lk01/k;Lk01/k;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILb63/o;Lb63/o;Lk01/k;Lk01/k;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f102094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f102095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f102096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f102097d;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/reports/ThinWeeklyNutritionDTO.$serializer", "Lm63/e0;", "Lk01/l;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f102098a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f102098a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.reports.ThinWeeklyNutritionDTO", aVar, 4);
            m1Var.j("startDate", true);
            m1Var.j("endDate", true);
            m1Var.j("averageNutritionContents", true);
            m1Var.j("averageDailyGoal", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            h63.k kVar = h63.k.f82304a;
            i63.c<?> cVarD = j63.a.d(kVar);
            i63.c<?> cVarD2 = j63.a.d(kVar);
            k.a aVar = k.a.f102093a;
            return new i63.c[]{cVarD, cVarD2, j63.a.d(aVar), j63.a.d(aVar)};
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
            o oVar2 = null;
            k kVar = null;
            k kVar2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    oVar = (o) cVarC.v(eVar2, 0, h63.k.f82304a, oVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    oVar2 = (o) cVarC.v(eVar2, 1, h63.k.f82304a, oVar2);
                    i15 |= 2;
                } else if (iE == 2) {
                    kVar = (k) cVarC.v(eVar2, 2, k.a.f102093a, kVar);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    kVar2 = (k) cVarC.v(eVar2, 3, k.a.f102093a, kVar2);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new l(i15, oVar, oVar2, kVar, kVar2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            l lVar = (l) obj;
            lVar.getClass();
            k kVar = lVar.f102097d;
            k kVar2 = lVar.f102096c;
            o oVar = lVar.f102095b;
            o oVar2 = lVar.f102094a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || oVar2 != null) {
                dVarC.d(eVar, 0, h63.k.f82304a, oVar2);
            }
            if (dVarC.C(eVar) || oVar != null) {
                dVarC.d(eVar, 1, h63.k.f82304a, oVar);
            }
            if (dVarC.C(eVar) || kVar2 != null) {
                dVarC.d(eVar, 2, k.a.f102093a, kVar2);
            }
            if (dVarC.C(eVar) || kVar != null) {
                dVarC.d(eVar, 3, k.a.f102093a, kVar);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ l(int i14, o oVar, o oVar2, k kVar, k kVar2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f102094a = null;
        } else {
            this.f102094a = oVar;
        }
        if ((i14 & 2) == 0) {
            this.f102095b = null;
        } else {
            this.f102095b = oVar2;
        }
        if ((i14 & 4) == 0) {
            this.f102096c = null;
        } else {
            this.f102096c = kVar;
        }
        if ((i14 & 8) == 0) {
            this.f102097d = null;
        } else {
            this.f102097d = kVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.f102094a, lVar.f102094a) && s.g(this.f102095b, lVar.f102095b) && s.g(this.f102096c, lVar.f102096c) && s.g(this.f102097d, lVar.f102097d);
    }

    public final int hashCode() {
        o oVar = this.f102094a;
        int iHashCode = (oVar == null ? 0 : oVar.f16206a.hashCode()) * 31;
        o oVar2 = this.f102095b;
        int iHashCode2 = (iHashCode + (oVar2 == null ? 0 : oVar2.f16206a.hashCode())) * 31;
        k kVar = this.f102096c;
        int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        k kVar2 = this.f102097d;
        return iHashCode3 + (kVar2 != null ? kVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ThinWeeklyNutritionDTO(startDate=" + this.f102094a + ", endDate=" + this.f102095b + ", averageNutritionContents=" + this.f102096c + ", averageDailyGoal=" + this.f102097d + ")";
    }

    /* JADX INFO: renamed from: k01.l$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk01/l$b;", "", "<init>", "()V", "Li63/c;", "Lk01/l;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<l> serializer() {
            return a.f102098a;
        }

        private Companion() {
        }
    }

    public l() {
        this((o) null, (o) null, (k) null, (k) null, 15, (p005kotlin.jvm.internal.j) null);
    }

    public l(o oVar, o oVar2, k kVar, k kVar2) {
        this.f102094a = oVar;
        this.f102095b = oVar2;
        this.f102096c = kVar;
        this.f102097d = kVar2;
    }

    public /* synthetic */ l(o oVar, o oVar2, k kVar, k kVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : oVar, (i14 & 2) != 0 ? null : oVar2, (i14 & 4) != 0 ? null : kVar, (i14 & 8) != 0 ? null : kVar2);
    }
}
