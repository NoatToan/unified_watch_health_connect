package y8;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ly8/a1;", "Ly8/d0;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "Lc9/b;", "energy", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lc9/b;Lz8/c;)V", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a1 implements d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c9.b f194712g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f194715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f194716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.b f194717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z8.c f194718f;

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
        c9.b.a aVar = c9.b.f25946c;
        aVar.getClass();
        f194712g = c9.b.a.a(1000000);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.TOTAL;
        a aVar2 = new a(aVar);
        bVar.getClass();
        l8.a.b.b("TotalCaloriesBurned", enumC2129a, "energy", aVar2);
    }

    public a1(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, c9.b bVar, z8.c cVar) {
        instant.getClass();
        instant2.getClass();
        bVar.getClass();
        cVar.getClass();
        this.f194713a = instant;
        this.f194714b = zoneOffset;
        this.f194715c = instant2;
        this.f194716d = zoneOffset2;
        this.f194717e = bVar;
        this.f194718f = cVar;
        if (!instant.isBefore(instant2)) {
            vb.h.s("startTime must be before endTime.");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            t8.k.b(this);
            return;
        }
        b1.d(bVar, (c9.b) p13.u0.c(bVar.f25949b, c9.b.f25947d), "energy");
        b1.e(bVar, f194712g, "energy");
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF195067d() {
        return this.f194716d;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF195065b() {
        return this.f194714b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f194717e.equals(a1Var.f194717e) && this.f194713a.equals(a1Var.f194713a) && p005kotlin.jvm.internal.s.g(this.f194714b, a1Var.f194714b) && this.f194715c.equals(a1Var.f194715c) && p005kotlin.jvm.internal.s.g(this.f194716d, a1Var.f194716d) && this.f194718f.equals(a1Var.f194718f);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF195066c() {
        return this.f194715c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f194718f;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF195064a() {
        return this.f194713a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f194713a, this.f194717e.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f194714b;
        int iK2 = wr.g.k(this.f194715c, (iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f194716d;
        return this.f194718f.hashCode() + ((iK2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TotalCaloriesBurnedRecord(startTime=");
        sb3.append(this.f194713a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f194714b);
        sb3.append(", endTime=");
        sb3.append(this.f194715c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f194716d);
        sb3.append(", energy=");
        sb3.append(this.f194717e);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194718f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly8/a1$b;", "", "<init>", "()V", "Lc9/b;", "MAX_ENERGY", "Lc9/b;", "Ll8/a;", "ENERGY_TOTAL", "Ll8/a;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
