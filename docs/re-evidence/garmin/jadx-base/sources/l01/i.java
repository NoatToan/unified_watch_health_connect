package l01;

import m63.e0;
import m63.m1;
import m63.u1;
import m63.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Ll01/i;", "", "", "carbs", "fat", "protein", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f107867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f107868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f107869c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/settings/NutrientMacrosDTO.$serializer", "Lm63/e0;", "Ll01/i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f107870a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f107870a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.settings.NutrientMacrosDTO", aVar, 3);
            m1Var.j("carbs", true);
            m1Var.j("fat", true);
            m1Var.j("protein", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            x xVar = x.f117036a;
            return new i63.c[]{j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Double d14 = null;
            Double d15 = null;
            Double d16 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    d14 = (Double) cVarC.v(eVar2, 0, x.f117036a, d14);
                    i15 |= 1;
                } else if (iE == 1) {
                    d15 = (Double) cVarC.v(eVar2, 1, x.f117036a, d15);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    d16 = (Double) cVarC.v(eVar2, 2, x.f117036a, d16);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new i(i15, d14, d15, d16, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            i iVar = (i) obj;
            iVar.getClass();
            Double d14 = iVar.f107869c;
            Double d15 = iVar.f107868b;
            Double d16 = iVar.f107867a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || d16 != null) {
                dVarC.d(eVar, 0, x.f117036a, d16);
            }
            if (dVarC.C(eVar) || d15 != null) {
                dVarC.d(eVar, 1, x.f117036a, d15);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 2, x.f117036a, d14);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ i(int i14, Double d14, Double d15, Double d16, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f107867a = null;
        } else {
            this.f107867a = d14;
        }
        if ((i14 & 2) == 0) {
            this.f107868b = null;
        } else {
            this.f107868b = d15;
        }
        if ((i14 & 4) == 0) {
            this.f107869c = null;
        } else {
            this.f107869c = d16;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f107867a, iVar.f107867a) && s.g(this.f107868b, iVar.f107868b) && s.g(this.f107869c, iVar.f107869c);
    }

    public final int hashCode() {
        Double d14 = this.f107867a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f107868b;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f107869c;
        return iHashCode2 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        return b71.i.g(tn.k.i("NutrientMacrosDTO(carbs=", this.f107867a, this.f107868b, ", fat=", ", protein="), this.f107869c, ")");
    }

    /* JADX INFO: renamed from: l01.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll01/i$b;", "", "<init>", "()V", "Li63/c;", "Ll01/i;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<i> serializer() {
            return a.f107870a;
        }

        private Companion() {
        }
    }

    public i() {
        this((Double) null, (Double) null, (Double) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public i(Double d14, Double d15, Double d16) {
        this.f107867a = d14;
        this.f107868b = d15;
        this.f107869c = d16;
    }

    public /* synthetic */ i(Double d14, Double d15, Double d16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : d15, (i14 & 4) != 0 ? null : d16);
    }
}
