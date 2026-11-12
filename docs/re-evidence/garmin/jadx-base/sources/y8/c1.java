package y8;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ly8/c1;", "Ly8/b0;", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "Lz8/c;", TtmlNode.TAG_METADATA, "", "vo2MillilitersPerMinuteKilogram", "", "measurementMethod", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;DI)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c1 implements b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f194737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LinkedHashMap f194738g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z8.c f194741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f194742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f194743e;

    static {
        new a(null);
        Map mapE = p13.u0.e(new o13.p("other", 0), new o13.p("metabolic_cart", 1), new o13.p("heart_rate_ratio", 2), new o13.p("cooper_test", 3), new o13.p("multistage_fitness_test", 4), new o13.p("rockport_fitness_test", 5));
        f194737f = mapE;
        f194738g = b1.f(mapE);
    }

    public c1(Instant instant, ZoneOffset zoneOffset, z8.c cVar, double d14, int i14) {
        instant.getClass();
        cVar.getClass();
        this.f194739a = instant;
        this.f194740b = zoneOffset;
        this.f194741c = cVar;
        this.f194742d = d14;
        this.f194743e = i14;
        if (Build.VERSION.SDK_INT >= 34) {
            t8.k.b(this);
        } else {
            b1.c(d14, "vo2MillilitersPerMinuteKilogram");
            b1.e(Double.valueOf(d14), Double.valueOf(100.0d), "vo2MillilitersPerMinuteKilogram");
        }
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ZoneOffset getF195074b() {
        return this.f194740b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f194742d == c1Var.f194742d && this.f194743e == c1Var.f194743e && p005kotlin.jvm.internal.s.g(this.f194739a, c1Var.f194739a) && p005kotlin.jvm.internal.s.g(this.f194740b, c1Var.f194740b) && p005kotlin.jvm.internal.s.g(this.f194741c, c1Var.f194741c);
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f194741c;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: getTime, reason: from getter */
    public final Instant getF195073a() {
        return this.f194739a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f194739a, ((Double.hashCode(this.f194742d) * 31) + this.f194743e) * 31, 31);
        ZoneOffset zoneOffset = this.f194740b;
        return this.f194741c.hashCode() + ((iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Vo2MaxRecord(time=");
        sb3.append(this.f194739a);
        sb3.append(", zoneOffset=");
        sb3.append(this.f194740b);
        sb3.append(", vo2MillilitersPerMinuteKilogram=");
        sb3.append(this.f194742d);
        sb3.append(", measurementMethod=");
        sb3.append(this.f194743e);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194741c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Ly8/c1$a;", "", "<init>", "()V", "", "MEASUREMENT_METHOD_OTHER", "I", "MEASUREMENT_METHOD_METABOLIC_CART", "MEASUREMENT_METHOD_HEART_RATE_RATIO", "MEASUREMENT_METHOD_COOPER_TEST", "MEASUREMENT_METHOD_MULTISTAGE_FITNESS_TEST", "MEASUREMENT_METHOD_ROCKPORT_FITNESS_TEST", "", "", "MEASUREMENT_METHOD_STRING_TO_INT_MAP", "Ljava/util/Map;", "MEASUREMENT_METHOD_INT_TO_STRING_MAP", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c1(Instant instant, ZoneOffset zoneOffset, z8.c cVar, double d14, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(instant, zoneOffset, cVar, d14, (i15 & 16) != 0 ? 0 : i14);
    }
}
