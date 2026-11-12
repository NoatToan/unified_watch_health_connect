package c80;

import java.util.List;
import java.util.Map;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lc80/o;", "", "", "Lc80/n;", "discounts", "", "hasDiscountVisibility", "", "", "Lc80/e;", "couponRestrictionGroupUsages", "<init>", "(Ljava/util/List;ZLjava/util/Map;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;ZLjava/util/Map;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class o {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f25500d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<n> f25501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, e> f25503c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/data/model/ExclusiveOfferListDTO.$serializer", "Lm63/e0;", "Lc80/o;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25504a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f25504a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.data.model.ExclusiveOfferListDTO", aVar, 3);
            m1Var.j("discounts", false);
            m1Var.j("hasDiscountVisibility", false);
            m1Var.j("couponRestrictionGroupUsages", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = o.f25500d;
            return new i63.c[]{lVarArr[0].getValue(), m63.g.f116948a, j63.a.d(lVarArr[2].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = o.f25500d;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            boolean zG = false;
            List list = null;
            Map map = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    list = (List) cVarC.l(eVar2, 0, lVarArr[0].getValue(), list);
                    i15 |= 1;
                } else if (iE == 1) {
                    zG = cVarC.g(eVar2, 1);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    map = (Map) cVarC.v(eVar2, 2, lVarArr[2].getValue(), map);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new o(i15, list, zG, map, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            o oVar = (o) obj;
            oVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = o.f25500d;
            dVarC.e(eVar, 0, lVarArr[0].getValue(), oVar.f25501a);
            dVarC.n(eVar, 1, oVar.f25502b);
            dVarC.d(eVar, 2, lVarArr[2].getValue(), oVar.f25503c);
            dVarC.b(eVar);
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f25500d = new o13.l[]{o13.m.a(nVar, new c63.g0(10)), null, o13.m.a(nVar, new c63.g0(11))};
    }

    public /* synthetic */ o(int i14, List list, boolean z14, Map map, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f25504a.getF158591b());
            throw null;
        }
        this.f25501a = list;
        this.f25502b = z14;
        this.f25503c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.f25501a, oVar.f25501a) && this.f25502b == oVar.f25502b && p005kotlin.jvm.internal.s.g(this.f25503c, oVar.f25503c);
    }

    public final int hashCode() {
        int iG = q6.f.g(this.f25501a.hashCode() * 31, 31, this.f25502b);
        Map<String, e> map = this.f25503c;
        return iG + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ExclusiveOfferListDTO(discounts=");
        sb3.append(this.f25501a);
        sb3.append(", hasDiscountVisibility=");
        sb3.append(this.f25502b);
        sb3.append(", couponRestrictionGroupUsages=");
        return am.j.s(sb3, this.f25503c, ")");
    }

    /* JADX INFO: renamed from: c80.o$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc80/o$b;", "", "<init>", "()V", "Li63/c;", "Lc80/o;", "serializer", "()Li63/c;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<o> serializer() {
            return a.f25504a;
        }

        private Companion() {
        }
    }

    public o(List<n> list, boolean z14, Map<String, e> map) {
        list.getClass();
        this.f25501a = list;
        this.f25502b = z14;
        this.f25503c = map;
    }
}
