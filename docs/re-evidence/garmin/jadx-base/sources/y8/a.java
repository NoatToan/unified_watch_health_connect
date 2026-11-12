package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ly8/a;", "Ly8/d0;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "Lc9/b;", "energy", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lc9/b;Lz8/c;)V", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c9.b f194698g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f194701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f194702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.b f194703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z8.c f194704f;

    /* JADX INFO: renamed from: y8.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class C3626a extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.b> {
        public C3626a(Object obj) {
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
        c9.b.a aVar = c9.b.f25946c;
        aVar.getClass();
        f194698g = c9.b.a.a(1000000);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.TOTAL;
        C3626a c3626a = new C3626a(aVar);
        bVar.getClass();
        l8.a.b.b("ActiveCaloriesBurned", enumC2129a, "energy", c3626a);
    }

    public a(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, c9.b bVar, z8.c cVar) {
        instant.getClass();
        instant2.getClass();
        bVar.getClass();
        cVar.getClass();
        this.f194699a = instant;
        this.f194700b = zoneOffset;
        this.f194701c = instant2;
        this.f194702d = zoneOffset2;
        this.f194703e = bVar;
        this.f194704f = cVar;
        b1.d(bVar, (c9.b) p13.u0.c(bVar.f25949b, c9.b.f25947d), "energy");
        b1.e(bVar, f194698g, "energy");
        if (instant.isBefore(instant2)) {
            return;
        }
        vb.h.s("startTime must be before endTime.");
        throw null;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF195067d() {
        return this.f194702d;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF195065b() {
        return this.f194700b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f194703e.equals(aVar.f194703e) && this.f194699a.equals(aVar.f194699a) && p005kotlin.jvm.internal.s.g(this.f194700b, aVar.f194700b) && this.f194701c.equals(aVar.f194701c) && p005kotlin.jvm.internal.s.g(this.f194702d, aVar.f194702d) && this.f194704f.equals(aVar.f194704f);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF195066c() {
        return this.f194701c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195069f() {
        return this.f194704f;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF195064a() {
        return this.f194699a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f194699a, this.f194703e.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f194700b;
        int iK2 = wr.g.k(this.f194701c, (iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f194702d;
        return this.f194704f.hashCode() + ((iK2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActiveCaloriesBurnedRecord(startTime=");
        sb3.append(this.f194699a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f194700b);
        sb3.append(", endTime=");
        sb3.append(this.f194701c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f194702d);
        sb3.append(", energy=");
        sb3.append(this.f194703e);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194704f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ly8/a$b;", "", "<init>", "()V", "", "TYPE_NAME", "Ljava/lang/String;", "ENERGY_FIELD_NAME", "Lc9/b;", "MAX_ENERGY", "Lc9/b;", "Ll8/a;", "ACTIVE_CALORIES_TOTAL", "Ll8/a;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
