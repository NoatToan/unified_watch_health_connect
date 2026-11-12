package z51;

import am.j;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.x;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aBs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013B\u008b\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017¨\u0006\u001b"}, d2 = {"Lz51/b;", "", "", "numberOfPoints", "", "polylineSourceType", "sourceId", "encodedSamples", "encodedLevels", "", "maxLat", "maxLon", "minLat", "minLon", "startLat", "startLon", "endLat", "endLon", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;DDDDDDDD)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;DDDDDDDDLm63/u1;)V", "Companion", "a", "b", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f202468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f202469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f202470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f202471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f202472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f202473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f202474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f202475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f202476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final double f202477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final double f202478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final double f202479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final double f202480m;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/pendingactivity/model/GPolylineDTO.$serializer", "Lm63/e0;", "Lz51/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f202481a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f202481a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.pendingactivity.model.GPolylineDTO", aVar, 13);
            m1Var.j("numberOfPoints", false);
            m1Var.j("polylineSourceType", false);
            m1Var.j("sourceId", false);
            m1Var.j("encodedSamples", false);
            m1Var.j("encodedLevels", false);
            m1Var.j("maxLat", false);
            m1Var.j("maxLon", false);
            m1Var.j("minLat", false);
            m1Var.j("minLon", false);
            m1Var.j("startLat", false);
            m1Var.j("startLon", false);
            m1Var.j("endLat", false);
            m1Var.j("endLon", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m0 m0Var = m0.f116981a;
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD = j63.a.d(y1Var);
            i63.c<?> cVarD2 = j63.a.d(m0Var);
            x xVar = x.f117036a;
            return new i63.c[]{m0Var, cVarD, cVarD2, y1Var, y1Var, xVar, xVar, xVar, xVar, xVar, xVar, xVar, xVar};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            int i15 = 0;
            int iA = 0;
            String str = null;
            Integer num = null;
            String strR = null;
            String strR2 = null;
            double dT = 0.0d;
            double dT2 = 0.0d;
            double dT3 = 0.0d;
            double dT4 = 0.0d;
            double dT5 = 0.0d;
            double dT6 = 0.0d;
            double dT7 = 0.0d;
            double dT8 = 0.0d;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        iA = cVarC.A(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                        i15 |= 2;
                        break;
                    case 2:
                        num = (Integer) cVarC.v(eVar2, 2, m0.f116981a, num);
                        i15 |= 4;
                        break;
                    case 3:
                        strR = cVarC.r(eVar2, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        strR2 = cVarC.r(eVar2, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        dT = cVarC.t(eVar2, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        dT2 = cVarC.t(eVar2, 6);
                        i15 |= 64;
                        break;
                    case 7:
                        dT3 = cVarC.t(eVar2, 7);
                        i15 |= 128;
                        break;
                    case 8:
                        dT4 = cVarC.t(eVar2, 8);
                        i15 |= 256;
                        break;
                    case 9:
                        dT5 = cVarC.t(eVar2, 9);
                        i15 |= 512;
                        break;
                    case 10:
                        dT6 = cVarC.t(eVar2, 10);
                        i15 |= 1024;
                        break;
                    case 11:
                        dT7 = cVarC.t(eVar2, 11);
                        i15 |= 2048;
                        break;
                    case 12:
                        dT8 = cVarC.t(eVar2, 12);
                        i15 |= 4096;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, iA, str, num, strR, strR2, dT, dT2, dT3, dT4, dT5, dT6, dT7, dT8, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.v(0, bVar.f202468a, eVar);
            dVarC.d(eVar, 1, y1.f117048a, bVar.f202469b);
            dVarC.d(eVar, 2, m0.f116981a, bVar.f202470c);
            dVarC.k(eVar, 3, bVar.f202471d);
            dVarC.k(eVar, 4, bVar.f202472e);
            dVarC.B(eVar, 5, bVar.f202473f);
            dVarC.B(eVar, 6, bVar.f202474g);
            dVarC.B(eVar, 7, bVar.f202475h);
            dVarC.B(eVar, 8, bVar.f202476i);
            dVarC.B(eVar, 9, bVar.f202477j);
            dVarC.B(eVar, 10, bVar.f202478k);
            dVarC.B(eVar, 11, bVar.f202479l);
            dVarC.B(eVar, 12, bVar.f202480m);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ b(int i14, int i15, String str, Integer num, String str2, String str3, double d14, double d15, double d16, double d17, double d18, double d19, double d24, double d25, u1 u1Var) {
        if (8191 != (i14 & 8191)) {
            k1.h(i14, 8191, a.f202481a.getF158591b());
            throw null;
        }
        this.f202468a = i15;
        this.f202469b = str;
        this.f202470c = num;
        this.f202471d = str2;
        this.f202472e = str3;
        this.f202473f = d14;
        this.f202474g = d15;
        this.f202475h = d16;
        this.f202476i = d17;
        this.f202477j = d18;
        this.f202478k = d19;
        this.f202479l = d24;
        this.f202480m = d25;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f202468a == bVar.f202468a && s.g(this.f202469b, bVar.f202469b) && s.g(this.f202470c, bVar.f202470c) && s.g(this.f202471d, bVar.f202471d) && s.g(this.f202472e, bVar.f202472e) && Double.compare(this.f202473f, bVar.f202473f) == 0 && Double.compare(this.f202474g, bVar.f202474g) == 0 && Double.compare(this.f202475h, bVar.f202475h) == 0 && Double.compare(this.f202476i, bVar.f202476i) == 0 && Double.compare(this.f202477j, bVar.f202477j) == 0 && Double.compare(this.f202478k, bVar.f202478k) == 0 && Double.compare(this.f202479l, bVar.f202479l) == 0 && Double.compare(this.f202480m, bVar.f202480m) == 0;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f202468a) * 31;
        String str = this.f202469b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f202470c;
        return Double.hashCode(this.f202480m) + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(wr.g.j(wr.g.j((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f202471d), 31, this.f202472e), 31, this.f202473f), 31, this.f202474g), 31, this.f202475h), 31, this.f202476i), 31, this.f202477j), 31, this.f202478k), 31, this.f202479l);
    }

    public final String toString() {
        StringBuilder sbR = wr.g.r(this.f202468a, "GPolylineDTO(numberOfPoints=", ", polylineSourceType=", this.f202469b, ", sourceId=");
        p6.b.l(this.f202470c, ", encodedSamples=", this.f202471d, ", encodedLevels=", sbR);
        sbR.append(this.f202472e);
        sbR.append(", maxLat=");
        sbR.append(this.f202473f);
        j.x(sbR, ", maxLon=", this.f202474g, ", minLat=");
        sbR.append(this.f202475h);
        j.x(sbR, ", minLon=", this.f202476i, ", startLat=");
        sbR.append(this.f202477j);
        j.x(sbR, ", startLon=", this.f202478k, ", endLat=");
        sbR.append(this.f202479l);
        return j.r(sbR, ", endLon=", this.f202480m, ")");
    }

    /* JADX INFO: renamed from: z51.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz51/b$b;", "", "<init>", "()V", "Li63/c;", "Lz51/b;", "serializer", "()Li63/c;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f202481a;
        }

        private Companion() {
        }
    }

    public b(int i14, String str, Integer num, String str2, String str3, double d14, double d15, double d16, double d17, double d18, double d19, double d24, double d25) {
        str2.getClass();
        str3.getClass();
        this.f202468a = i14;
        this.f202469b = str;
        this.f202470c = num;
        this.f202471d = str2;
        this.f202472e = str3;
        this.f202473f = d14;
        this.f202474g = d15;
        this.f202475h = d16;
        this.f202476i = d17;
        this.f202477j = d18;
        this.f202478k = d19;
        this.f202479l = d24;
        this.f202480m = d25;
    }
}
