package f01;

import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lf01/i;", "", "Lf01/g;", "currentStatus", "", "hasUsedNutrition", "hasUsedMFP", "<init>", "(Lf01/g;ZZ)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILf01/g;ZZLm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f67707d = {m.a(n.PUBLICATION, new ey0.a(15)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f67708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f67710c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/NutritionUserDTO.$serializer", "Lm63/e0;", "Lf01/i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f67711a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f67711a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.NutritionUserDTO", aVar, 3);
            m1Var.j("currentStatus", false);
            m1Var.j("hasUsedNutrition", false);
            m1Var.j("hasUsedMFP", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m63.g gVar = m63.g.f116948a;
            return new i63.c[]{i.f67707d[0].getValue(), gVar, gVar};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = i.f67707d;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            boolean zG = false;
            boolean zG2 = false;
            g gVar = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    gVar = (g) cVarC.l(eVar2, 0, lVarArr[0].getValue(), gVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    zG = cVarC.g(eVar2, 1);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    zG2 = cVarC.g(eVar2, 2);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new i(i15, gVar, zG, zG2, null);
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
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.e(eVar, 0, i.f67707d[0].getValue(), iVar.f67708a);
            dVarC.n(eVar, 1, iVar.f67709b);
            dVarC.n(eVar, 2, iVar.f67710c);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ i(int i14, g gVar, boolean z14, boolean z15, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f67711a.getF158591b());
            throw null;
        }
        this.f67708a = gVar;
        this.f67709b = z14;
        this.f67710c = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f67708a == iVar.f67708a && this.f67709b == iVar.f67709b && this.f67710c == iVar.f67710c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67710c) + q6.f.g(this.f67708a.hashCode() * 31, 31, this.f67709b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NutritionUserDTO(currentStatus=");
        sb3.append(this.f67708a);
        sb3.append(", hasUsedNutrition=");
        sb3.append(this.f67709b);
        sb3.append(", hasUsedMFP=");
        return hb.a.k(sb3, this.f67710c, ")");
    }

    /* JADX INFO: renamed from: f01.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf01/i$b;", "", "<init>", "()V", "Li63/c;", "Lf01/i;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<i> serializer() {
            return a.f67711a;
        }

        private Companion() {
        }
    }

    public i(g gVar, boolean z14, boolean z15) {
        gVar.getClass();
        this.f67708a = gVar;
        this.f67709b = z14;
        this.f67710c = z15;
    }
}
