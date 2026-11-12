package yw1;

import java.util.Map;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u0012"}, d2 = {"Lyw1/g;", "", "", "countOfActivities", "", "date", "", "Lyw1/e;", "stats", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f199920d = {null, null, o13.m.a(o13.n.PUBLICATION, new ya0.j(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f199921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, e> f199923c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/training/model/progressreport/FBTPerformanceStats.$serializer", "Lm63/e0;", "Lyw1/g;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f199924a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f199924a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.training.model.progressreport.FBTPerformanceStats", aVar, 3);
            m1Var.j("countOfActivities", false);
            m1Var.j("date", false);
            m1Var.j("stats", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(m0.f116981a), j63.a.d(y1.f117048a), j63.a.d(g.f199920d[2].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = g.f199920d;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Integer num = null;
            String str = null;
            Map map = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    num = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num);
                    i15 |= 1;
                } else if (iE == 1) {
                    str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
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
            return new g(i15, num, str, map, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            g gVar = (g) obj;
            gVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = g.f199920d;
            dVarC.d(eVar, 0, m0.f116981a, gVar.f199921a);
            dVarC.d(eVar, 1, y1.f117048a, gVar.f199922b);
            dVarC.d(eVar, 2, lVarArr[2].getValue(), gVar.f199923c);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ g(int i14, Integer num, String str, Map map, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f199924a.getF158591b());
            throw null;
        }
        this.f199921a = num;
        this.f199922b = str;
        this.f199923c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.f199921a, gVar.f199921a) && p005kotlin.jvm.internal.s.g(this.f199922b, gVar.f199922b) && p005kotlin.jvm.internal.s.g(this.f199923c, gVar.f199923c);
    }

    public final int hashCode() {
        Integer num = this.f199921a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f199922b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, e> map = this.f199923c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return am.j.s(l2.f("FBTPerformanceStats(countOfActivities=", this.f199921a, ", date=", this.f199922b, ", stats="), this.f199923c, ")");
    }

    /* JADX INFO: renamed from: yw1.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyw1/g$b;", "", "<init>", "()V", "Li63/c;", "Lyw1/g;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<g> serializer() {
            return a.f199924a;
        }

        private Companion() {
        }
    }

    public g(Integer num, String str, Map<String, e> map) {
        this.f199921a = num;
        this.f199922b = str;
        this.f199923c = map;
    }
}
