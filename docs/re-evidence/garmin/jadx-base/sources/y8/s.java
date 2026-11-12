package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.location.FusedLocationProviderClient;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ly8/s;", "", "", "Ly8/s$a;", "route", "<init>", "(Ljava/util/List;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f194963a;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((a) t7).f194964a, ((a) t14).f194964a);
        }
    }

    public s(List<a> list) {
        list.getClass();
        this.f194963a = list;
        List listN0 = p13.h0.N0(list, new b());
        int iJ = p13.x.j(listN0);
        int i14 = 0;
        while (i14 < iJ) {
            Instant instant = ((a) listN0.get(i14)).f194964a;
            i14++;
            if (!instant.isBefore(((a) listN0.get(i14)).f194964a)) {
                vb.h.s("Failed requirement.");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        return this.f194963a.equals(((s) obj).f194963a);
    }

    public final int hashCode() {
        return this.f194963a.hashCode();
    }

    public final String toString() {
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f194963a, new StringBuilder("ExerciseRoute(route="));
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\rBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ly8/s$a;", "", "Ljava/time/Instant;", "time", "", "latitude", "longitude", "Lc9/c;", "horizontalAccuracy", FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, "altitude", "<init>", "(Ljava/time/Instant;DDLc9/c;Lc9/c;Lc9/c;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Instant f194964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f194965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f194966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c9.c f194967d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c9.c f194968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final c9.c f194969f;

        static {
            new C3629a(null);
        }

        public a(Instant instant, double d14, double d15, c9.c cVar, c9.c cVar2, c9.c cVar3) {
            instant.getClass();
            this.f194964a = instant;
            this.f194965b = d14;
            this.f194966c = d15;
            this.f194967d = cVar;
            this.f194968e = cVar2;
            this.f194969f = cVar3;
            b1.d(Double.valueOf(d14), Double.valueOf(-90.0d), "latitude");
            b1.e(Double.valueOf(d14), Double.valueOf(90.0d), "latitude");
            b1.d(Double.valueOf(d15), Double.valueOf(-180.0d), "longitude");
            b1.e(Double.valueOf(d15), Double.valueOf(180.0d), "longitude");
            if (cVar != null) {
                b1.d(cVar, (c9.c) p13.u0.c(cVar.f25964b, c9.c.f25962d), "horizontalAccuracy");
            }
            if (cVar2 != null) {
                b1.d(cVar2, (c9.c) p13.u0.c(cVar2.f25964b, c9.c.f25962d), FusedLocationProviderClient.KEY_VERTICAL_ACCURACY);
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
            return p005kotlin.jvm.internal.s.g(this.f194964a, aVar.f194964a) && this.f194965b == aVar.f194965b && this.f194966c == aVar.f194966c && p005kotlin.jvm.internal.s.g(this.f194967d, aVar.f194967d) && p005kotlin.jvm.internal.s.g(this.f194968e, aVar.f194968e) && p005kotlin.jvm.internal.s.g(this.f194969f, aVar.f194969f);
        }

        public final int hashCode() {
            int iB = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(this.f194964a.hashCode() * 31, 31, this.f194965b), 31, this.f194966c);
            c9.c cVar = this.f194967d;
            int iHashCode = (iB + (cVar != null ? cVar.hashCode() : 0)) * 31;
            c9.c cVar2 = this.f194968e;
            int iHashCode2 = (iHashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
            c9.c cVar3 = this.f194969f;
            return iHashCode2 + (cVar3 != null ? cVar3.hashCode() : 0);
        }

        public final String toString() {
            return "Location(time=" + this.f194964a + ", latitude=" + this.f194965b + ", longitude=" + this.f194966c + ", horizontalAccuracy=" + this.f194967d + ", verticalAccuracy=" + this.f194968e + ", altitude=" + this.f194969f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        /* JADX INFO: renamed from: y8.s$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Ly8/s$a$a;", "", "<init>", "()V", "", "MIN_LONGITUDE", "D", "MAX_LONGITUDE", "MIN_LATITUDE", "MAX_LATITUDE", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C3629a {
            public /* synthetic */ C3629a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C3629a() {
            }
        }

        public /* synthetic */ a(Instant instant, double d14, double d15, c9.c cVar, c9.c cVar2, c9.c cVar3, int i14, p005kotlin.jvm.internal.j jVar) {
            this(instant, d14, d15, (i14 & 8) != 0 ? null : cVar, (i14 & 16) != 0 ? null : cVar2, (i14 & 32) != 0 ? null : cVar3);
        }
    }
}
