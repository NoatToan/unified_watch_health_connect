package je0;

import java.util.Map;
import lc.u0;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.x;
import m63.y1;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0010\u0011\u0012B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00060\u0006¢\u0006\u0004\b\t\u0010\nBO\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u0013"}, d2 = {"Lje0/h;", "", "", "date", "", "countOfActivities", "", "Lje0/h$c;", "stats", "<init>", "(Ljava/lang/String;ILjava/util/Map;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/util/Map;Lm63/u1;)V", "Companion", "c", "a", "b", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f98525d = {null, null, o13.m.a(o13.n.PUBLICATION, new j21.f(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Map<String, c>> f98528c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/domaindogs/data/model/DogLifetimeStatsResponse.$serializer", "Lm63/e0;", "Lje0/h;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f98529a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f98529a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.domaindogs.data.model.DogLifetimeStatsResponse", aVar, 3);
            m1Var.j("date", true);
            m1Var.j("countOfActivities", false);
            m1Var.j("stats", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(y1.f117048a), m0.f116981a, h.f98525d[2].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = h.f98525d;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            int iA = 0;
            String str = null;
            Map map = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                    i15 |= 1;
                } else if (iE == 1) {
                    iA = cVarC.A(eVar2, 1);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    map = (Map) cVarC.l(eVar2, 2, lVarArr[2].getValue(), map);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new h(i15, str, iA, map, (u1) null);
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
            String str = hVar.f98526a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = h.f98525d;
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 0, y1.f117048a, str);
            }
            dVarC.v(1, hVar.f98527b, eVar);
            dVarC.e(eVar, 2, lVarArr[2].getValue(), hVar.f98528c);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ h(int i14, String str, int i15, Map map, u1 u1Var) {
        if (6 != (i14 & 6)) {
            k1.h(i14, 6, a.f98529a.getF158591b());
            throw null;
        }
        if ((i14 & 1) == 0) {
            this.f98526a = null;
        } else {
            this.f98526a = str;
        }
        this.f98527b = i15;
        this.f98528c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p005kotlin.jvm.internal.s.g(this.f98526a, hVar.f98526a) && this.f98527b == hVar.f98527b && p005kotlin.jvm.internal.s.g(this.f98528c, hVar.f98528c);
    }

    public final int hashCode() {
        String str = this.f98526a;
        return this.f98528c.hashCode() + q2.d(this.f98527b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        return am.j.s(androidx.core.view.j.k(this.f98527b, "DogLifetimeStatsResponse(date=", this.f98526a, ", countOfActivities=", ", stats="), this.f98528c, ")");
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u0012"}, d2 = {"Lje0/h$c;", "", "", "count", "", "min", "max", "avg", "sum", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f98530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f98531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f98532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Double f98533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Double f98534e;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/domaindogs/data/model/DogLifetimeStatsResponse.StatsDTO.$serializer", "Lm63/e0;", "Lje0/h$c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f98535a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f98535a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.domaindogs.data.model.DogLifetimeStatsResponse.StatsDTO", aVar, 5);
                m1Var.j("count", true);
                m1Var.j("min", true);
                m1Var.j("max", true);
                m1Var.j("avg", true);
                m1Var.j("sum", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                i63.c<?> cVarD = j63.a.d(m0.f116981a);
                x xVar = x.f117036a;
                return new i63.c[]{cVarD, j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                Integer num = null;
                Double d14 = null;
                Double d15 = null;
                Double d16 = null;
                Double d17 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        num = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num);
                        i15 |= 1;
                    } else if (iE == 1) {
                        d14 = (Double) cVarC.v(eVar2, 1, x.f117036a, d14);
                        i15 |= 2;
                    } else if (iE == 2) {
                        d15 = (Double) cVarC.v(eVar2, 2, x.f117036a, d15);
                        i15 |= 4;
                    } else if (iE == 3) {
                        d16 = (Double) cVarC.v(eVar2, 3, x.f117036a, d16);
                        i15 |= 8;
                    } else {
                        if (iE != 4) {
                            hb.a.o(iE);
                            return null;
                        }
                        d17 = (Double) cVarC.v(eVar2, 4, x.f117036a, d17);
                        i15 |= 16;
                    }
                }
                cVarC.b(eVar2);
                return new c(i15, num, d14, d15, d16, d17, (u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                Double d14 = cVar.f98534e;
                Double d15 = cVar.f98533d;
                Double d16 = cVar.f98532c;
                Double d17 = cVar.f98531b;
                Integer num = cVar.f98530a;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || num != null) {
                    dVarC.d(eVar, 0, m0.f116981a, num);
                }
                if (dVarC.C(eVar) || d17 != null) {
                    dVarC.d(eVar, 1, x.f117036a, d17);
                }
                if (dVarC.C(eVar) || d16 != null) {
                    dVarC.d(eVar, 2, x.f117036a, d16);
                }
                if (dVarC.C(eVar) || d15 != null) {
                    dVarC.d(eVar, 3, x.f117036a, d15);
                }
                if (dVarC.C(eVar) || d14 != null) {
                    dVarC.d(eVar, 4, x.f117036a, d14);
                }
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ c(int i14, Integer num, Double d14, Double d15, Double d16, Double d17, u1 u1Var) {
            if ((i14 & 1) == 0) {
                this.f98530a = null;
            } else {
                this.f98530a = num;
            }
            if ((i14 & 2) == 0) {
                this.f98531b = null;
            } else {
                this.f98531b = d14;
            }
            if ((i14 & 4) == 0) {
                this.f98532c = null;
            } else {
                this.f98532c = d15;
            }
            if ((i14 & 8) == 0) {
                this.f98533d = null;
            } else {
                this.f98533d = d16;
            }
            if ((i14 & 16) == 0) {
                this.f98534e = null;
            } else {
                this.f98534e = d17;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f98530a, cVar.f98530a) && p005kotlin.jvm.internal.s.g(this.f98531b, cVar.f98531b) && p005kotlin.jvm.internal.s.g(this.f98532c, cVar.f98532c) && p005kotlin.jvm.internal.s.g(this.f98533d, cVar.f98533d) && p005kotlin.jvm.internal.s.g(this.f98534e, cVar.f98534e);
        }

        public final int hashCode() {
            Integer num = this.f98530a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Double d14 = this.f98531b;
            int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f98532c;
            int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f98533d;
            int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Double d17 = this.f98534e;
            return iHashCode4 + (d17 != null ? d17.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbM = u0.m("StatsDTO(count=", this.f98530a, ", min=", this.f98531b, ", max=");
            b71.i.p(this.f98532c, this.f98533d, ", avg=", ", sum=", sbM);
            return b71.i.g(sbM, this.f98534e, ")");
        }

        /* JADX INFO: renamed from: je0.h$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lje0/h$c$b;", "", "<init>", "()V", "Li63/c;", "Lje0/h$c;", "serializer", "()Li63/c;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<c> serializer() {
                return a.f98535a;
            }

            private Companion() {
            }
        }

        public c() {
            this((Integer) null, (Double) null, (Double) null, (Double) null, (Double) null, 31, (p005kotlin.jvm.internal.j) null);
        }

        public c(Integer num, Double d14, Double d15, Double d16, Double d17) {
            this.f98530a = num;
            this.f98531b = d14;
            this.f98532c = d15;
            this.f98533d = d16;
            this.f98534e = d17;
        }

        public /* synthetic */ c(Integer num, Double d14, Double d15, Double d16, Double d17, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : d16, (i14 & 16) != 0 ? null : d17);
        }
    }

    /* JADX INFO: renamed from: je0.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lje0/h$b;", "", "<init>", "()V", "Li63/c;", "Lje0/h;", "serializer", "()Li63/c;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<h> serializer() {
            return a.f98529a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(String str, int i14, Map<String, ? extends Map<String, c>> map) {
        map.getClass();
        this.f98526a = str;
        this.f98527b = i14;
        this.f98528c = map;
    }

    public /* synthetic */ h(String str, int i14, Map map, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : str, i14, map);
    }
}
