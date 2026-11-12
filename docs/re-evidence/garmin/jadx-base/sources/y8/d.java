package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ly8/d;", "Ly8/b0;", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "Lc9/f;", "basalMetabolicRate", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Lc9/f;Lz8/c;)V", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c9.f f194744e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.f f194747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z8.c f194748d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.b> {
        public a(Object obj) {
            super(1, obj, c9.b.a.class, "kilocalories", "kilocalories(D)Landroidx/health/connect/client/units/Energy;", 0);
        }

        @Override // e23.l
        public final c9.b invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.b.a) this.receiver).getClass();
            return c9.b.a.a(dDoubleValue);
        }
    }

    static {
        new b(null);
        c9.f.f25986c.getClass();
        f194744e = new c9.f(10000, c9.f.b.f25991b, null);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.TOTAL;
        a aVar = new a(c9.b.f25946c);
        bVar.getClass();
        l8.a.b.b("BasalCaloriesBurned", enumC2129a, "energy", aVar);
    }

    public d(Instant instant, ZoneOffset zoneOffset, c9.f fVar, z8.c cVar) {
        instant.getClass();
        fVar.getClass();
        cVar.getClass();
        this.f194745a = instant;
        this.f194746b = zoneOffset;
        this.f194747c = fVar;
        this.f194748d = cVar;
        b1.d(fVar, (c9.f) p13.u0.c(fVar.f25989b, c9.f.f25987d), "bmr");
        b1.e(fVar, f194744e, "bmr");
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ZoneOffset getF194746b() {
        return this.f194746b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f194747c.equals(dVar.f194747c) && this.f194745a.equals(dVar.f194745a) && p005kotlin.jvm.internal.s.g(this.f194746b, dVar.f194746b) && this.f194748d.equals(dVar.f194748d);
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF194748d() {
        return this.f194748d;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: getTime, reason: from getter */
    public final Instant getF194745a() {
        return this.f194745a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f194745a, this.f194747c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f194746b;
        return this.f194748d.hashCode() + ((iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BasalMetabolicRateRecord(time=");
        sb3.append(this.f194745a);
        sb3.append(", zoneOffset=");
        sb3.append(this.f194746b);
        sb3.append(", basalMetabolicRate=");
        sb3.append(this.f194747c);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194748d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly8/d$b;", "", "<init>", "()V", "", "BASAL_CALORIES_TYPE_NAME", "Ljava/lang/String;", "ENERGY_FIELD_NAME", "Lc9/f;", "MAX_BASAL_METABLOIC_RATE", "Lc9/f;", "Ll8/a;", "Lc9/b;", "BASAL_CALORIES_TOTAL", "Ll8/a;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
