package c80;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lc80/z;", "", "Lc80/n;", FirebaseAnalytics.Param.DISCOUNT, "", "", "Lc80/e;", "couponRestrictionGroupUsages", "<init>", "(Lc80/n;Ljava/util/Map;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILc80/n;Ljava/util/Map;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class z {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f25651c = {null, o13.m.a(o13.n.PUBLICATION, new c63.g0(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f25652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, e> f25653b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/data/model/GenerateOfferCodeResponseDTO.$serializer", "Lm63/e0;", "Lc80/z;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25654a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f25654a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.data.model.GenerateOfferCodeResponseDTO", aVar, 2);
            m1Var.j(FirebaseAnalytics.Param.DISCOUNT, false);
            m1Var.j("couponRestrictionGroupUsages", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{n.a.f25475a, j63.a.d(z.f25651c[1].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = z.f25651c;
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            n nVar = null;
            Map map = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    nVar = (n) cVarC.l(eVar2, 0, n.a.f25475a, nVar);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    map = (Map) cVarC.v(eVar2, 1, lVarArr[1].getValue(), map);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new z(i15, nVar, map, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            z zVar = (z) obj;
            zVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = z.f25651c;
            dVarC.e(eVar, 0, n.a.f25475a, zVar.f25652a);
            dVarC.d(eVar, 1, lVarArr[1].getValue(), zVar.f25653b);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ z(int i14, n nVar, Map map, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, a.f25654a.getF158591b());
            throw null;
        }
        this.f25652a = nVar;
        this.f25653b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return p005kotlin.jvm.internal.s.g(this.f25652a, zVar.f25652a) && p005kotlin.jvm.internal.s.g(this.f25653b, zVar.f25653b);
    }

    public final int hashCode() {
        int iHashCode = this.f25652a.hashCode() * 31;
        Map<String, e> map = this.f25653b;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "GenerateOfferCodeResponseDTO(discount=" + this.f25652a + ", couponRestrictionGroupUsages=" + this.f25653b + ")";
    }

    /* JADX INFO: renamed from: c80.z$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc80/z$b;", "", "<init>", "()V", "Li63/c;", "Lc80/z;", "serializer", "()Li63/c;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<z> serializer() {
            return a.f25654a;
        }

        private Companion() {
        }
    }

    public z(n nVar, Map<String, e> map) {
        nVar.getClass();
        this.f25652a = nVar;
        this.f25653b = map;
    }
}
