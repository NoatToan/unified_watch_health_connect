package h90;

import go1.j;
import i63.h;
import java.util.List;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import r1.q2;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lh90/a;", "", "", "Lj90/a;", "defaultActivityOptions", "", "descriptionText", "maxAcceptedActivities", "minAcceptedActivities", "", "descriptionVarArgs", "<init>", "(Ljava/util/List;IIILjava/util/List;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;IIILjava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f82510f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<j90.a> f82511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f82514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f82515e;

    /* JADX INFO: renamed from: h90.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/domain/customization/ActivityOptionsConfig.$serializer", "Lm63/e0;", "Lh90/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class C1632a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1632a f82516a;
        private static final k63.e descriptor;

        static {
            C1632a c1632a = new C1632a();
            f82516a = c1632a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.domain.customization.ActivityOptionsConfig", c1632a, 5);
            m1Var.j("defaultActivityOptions", false);
            m1Var.j("descriptionText", false);
            m1Var.j("maxAcceptedActivities", false);
            m1Var.j("minAcceptedActivities", false);
            m1Var.j("descriptionVarArgs", true);
            descriptor = m1Var;
        }

        private C1632a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = a.f82510f;
            m0 m0Var = m0.f116981a;
            return new i63.c[]{lVarArr[0].getValue(), m0Var, m0Var, m0Var, lVarArr[4].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = a.f82510f;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            int iA = 0;
            int iA2 = 0;
            int iA3 = 0;
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
                    iA = cVarC.A(eVar2, 1);
                    i15 |= 2;
                } else if (iE == 2) {
                    iA2 = cVarC.A(eVar2, 2);
                    i15 |= 4;
                } else if (iE == 3) {
                    iA3 = cVarC.A(eVar2, 3);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    list2 = (List) cVarC.l(eVar2, 4, lVarArr[4].getValue(), list2);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, list, iA, iA2, iA3, list2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = a.f82510f;
            i63.c<Object> value = lVarArr[0].getValue();
            List<j90.a> list = aVar.f82511a;
            List<String> list2 = aVar.f82515e;
            dVarC.e(eVar, 0, value, list);
            dVarC.v(1, aVar.f82512b, eVar);
            dVarC.v(2, aVar.f82513c, eVar);
            dVarC.v(3, aVar.f82514d, eVar);
            if (dVarC.C(eVar) || !s.g(list2, j0.f134944a)) {
                dVarC.e(eVar, 4, lVarArr[4].getValue(), list2);
            }
            dVarC.b(eVar);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f82510f = new l[]{m.a(nVar, new j(28)), null, null, null, m.a(nVar, new j(29))};
    }

    public a(int i14, List list, int i15, int i16, int i17, List list2, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, C1632a.f82516a.getF158591b());
            throw null;
        }
        this.f82511a = list;
        this.f82512b = i15;
        this.f82513c = i16;
        this.f82514d = i17;
        if ((i14 & 16) == 0) {
            this.f82515e = j0.f134944a;
        } else {
            this.f82515e = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f82511a, aVar.f82511a) && this.f82512b == aVar.f82512b && this.f82513c == aVar.f82513c && this.f82514d == aVar.f82514d && s.g(this.f82515e, aVar.f82515e);
    }

    public final int hashCode() {
        return this.f82515e.hashCode() + q2.d(this.f82514d, q2.d(this.f82513c, q2.d(this.f82512b, this.f82511a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityOptionsConfig(defaultActivityOptions=");
        sb3.append(this.f82511a);
        sb3.append(", descriptionText=");
        sb3.append(this.f82512b);
        sb3.append(", maxAcceptedActivities=");
        ds.e0.m(this.f82513c, this.f82514d, ", minAcceptedActivities=", ", descriptionVarArgs=", sb3);
        return z.c(sb3, this.f82515e, ")");
    }

    /* JADX INFO: renamed from: h90.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh90/a$b;", "", "<init>", "()V", "Li63/c;", "Lh90/a;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C1632a.f82516a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends j90.a> list, int i14, int i15, int i16, List<String> list2) {
        list.getClass();
        list2.getClass();
        this.f82511a = list;
        this.f82512b = i14;
        this.f82513c = i15;
        this.f82514d = i16;
        this.f82515e = list2;
    }

    public a(List list, int i14, int i15, int i16, List list2, int i17, p005kotlin.jvm.internal.j jVar) {
        this(list, i14, i15, i16, (i17 & 16) != 0 ? j0.f134944a : list2);
    }
}
