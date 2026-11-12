package y8;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ly8/d1;", "Ly8/b0;", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "Lc9/d;", "weight", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Lc9/d;Lz8/c;)V", "d", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d1 implements b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c9.d f194749e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.d f194752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z8.c f194753d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public a(Object obj) {
            super(1, obj, c9.d.a.class, "kilograms", "kilograms(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return new c9.d(dDoubleValue, c9.d.b.f25977b, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public b(Object obj) {
            super(1, obj, c9.d.a.class, "kilograms", "kilograms(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return new c9.d(dDoubleValue, c9.d.b.f25977b, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public c(Object obj) {
            super(1, obj, c9.d.a.class, "kilograms", "kilograms(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return new c9.d(dDoubleValue, c9.d.b.f25977b, null);
        }
    }

    static {
        new d(null);
        c9.d.a aVar = c9.d.f25972c;
        aVar.getClass();
        f194749e = new c9.d(1000, c9.d.b.f25977b, null);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.AVERAGE;
        a aVar2 = new a(aVar);
        bVar.getClass();
        l8.a.b.b("Weight", enumC2129a, "weight", aVar2);
        l8.a.b.b("Weight", l8.a.EnumC2129a.MINIMUM, "weight", new c(aVar));
        l8.a.b.b("Weight", l8.a.EnumC2129a.MAXIMUM, "weight", new b(aVar));
    }

    public d1(Instant instant, ZoneOffset zoneOffset, c9.d dVar, z8.c cVar) {
        instant.getClass();
        dVar.getClass();
        cVar.getClass();
        this.f194750a = instant;
        this.f194751b = zoneOffset;
        this.f194752c = dVar;
        this.f194753d = cVar;
        if (Build.VERSION.SDK_INT >= 34) {
            t8.k.b(this);
            return;
        }
        b1.d(dVar, (c9.d) p13.u0.c(dVar.f25975b, c9.d.f25973d), "weight");
        b1.e(dVar, f194749e, "weight");
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ZoneOffset getF195074b() {
        return this.f194751b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.f194752c.equals(d1Var.f194752c) && this.f194750a.equals(d1Var.f194750a) && p005kotlin.jvm.internal.s.g(this.f194751b, d1Var.f194751b) && this.f194753d.equals(d1Var.f194753d);
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f194753d;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: getTime, reason: from getter */
    public final Instant getF195073a() {
        return this.f194750a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f194750a, this.f194752c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f194751b;
        return this.f194753d.hashCode() + ((iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WeightRecord(time=");
        sb3.append(this.f194750a);
        sb3.append(", zoneOffset=");
        sb3.append(this.f194751b);
        sb3.append(", weight=");
        sb3.append(this.f194752c);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194753d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Ly8/d1$d;", "", "<init>", "()V", "", "WEIGHT_NAME", "Ljava/lang/String;", "WEIGHT_FIELD", "Lc9/d;", "MAX_WEIGHT", "Lc9/d;", "Ll8/a;", "WEIGHT_AVG", "Ll8/a;", "WEIGHT_MIN", "WEIGHT_MAX", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }
}
