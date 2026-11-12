package y8;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.turf.TurfConstants;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ly8/z;", "Ly8/b0;", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "Lc9/c;", "height", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Lc9/c;Lz8/c;)V", "d", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z implements b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c9.c f195072e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f195073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f195074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.c f195075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z8.c f195076d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.c> {
        public a(Object obj) {
            super(1, obj, c9.c.a.class, TurfConstants.UNIT_METERS, "meters(D)Landroidx/health/connect/client/units/Length;", 0);
        }

        @Override // e23.l
        public final c9.c invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.c.a) this.receiver).getClass();
            return c9.c.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.c> {
        public b(Object obj) {
            super(1, obj, c9.c.a.class, TurfConstants.UNIT_METERS, "meters(D)Landroidx/health/connect/client/units/Length;", 0);
        }

        @Override // e23.l
        public final c9.c invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.c.a) this.receiver).getClass();
            return c9.c.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.c> {
        public c(Object obj) {
            super(1, obj, c9.c.a.class, TurfConstants.UNIT_METERS, "meters(D)Landroidx/health/connect/client/units/Length;", 0);
        }

        @Override // e23.l
        public final c9.c invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.c.a) this.receiver).getClass();
            return c9.c.a.a(dDoubleValue);
        }
    }

    static {
        new d(null);
        c9.c.a aVar = c9.c.f25961c;
        aVar.getClass();
        f195072e = c9.c.a.a(3);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.AVERAGE;
        a aVar2 = new a(aVar);
        bVar.getClass();
        l8.a.b.b("Height", enumC2129a, "height", aVar2);
        l8.a.b.b("Height", l8.a.EnumC2129a.MINIMUM, "height", new c(aVar));
        l8.a.b.b("Height", l8.a.EnumC2129a.MAXIMUM, "height", new b(aVar));
    }

    public z(Instant instant, ZoneOffset zoneOffset, c9.c cVar, z8.c cVar2) {
        instant.getClass();
        cVar.getClass();
        cVar2.getClass();
        this.f195073a = instant;
        this.f195074b = zoneOffset;
        this.f195075c = cVar;
        this.f195076d = cVar2;
        if (Build.VERSION.SDK_INT >= 34) {
            t8.k.b(this);
            return;
        }
        b1.d(cVar, (c9.c) p13.u0.c(cVar.f25964b, c9.c.f25962d), "height");
        b1.e(cVar, f195072e, "height");
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ZoneOffset getF195074b() {
        return this.f195074b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f195075c.equals(zVar.f195075c) && this.f195073a.equals(zVar.f195073a) && p005kotlin.jvm.internal.s.g(this.f195074b, zVar.f195074b) && this.f195076d.equals(zVar.f195076d);
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f195076d;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: getTime, reason: from getter */
    public final Instant getF195073a() {
        return this.f195073a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f195073a, this.f195075c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f195074b;
        return this.f195076d.hashCode() + ((iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HeightRecord(time=");
        sb3.append(this.f195073a);
        sb3.append(", zoneOffset=");
        sb3.append(this.f195074b);
        sb3.append(", height=");
        sb3.append(this.f195075c);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f195076d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Ly8/z$d;", "", "<init>", "()V", "", "HEIGHT_NAME", "Ljava/lang/String;", "HEIGHT_FIELD_NAME", "Lc9/c;", "MAX_HEIGHT", "Lc9/c;", "Ll8/a;", "HEIGHT_AVG", "Ll8/a;", "HEIGHT_MIN", "HEIGHT_MAX", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }
}
