package o4;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lo4/q1;", "", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "Ln4/c;", MapboxMap.QFE_OFFSET, "", "blurRadius", "<init>", "(JJFLkotlin/jvm/internal/j;)V", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f128956d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q1 f128957e = new q1(0, 0, 0.0f, 7, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f128958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f128959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f128960c;

    /* JADX WARN: Illegal instructions before constructor call */
    public q1(long j8, long j14, float f14, int i14, p005kotlin.jvm.internal.j jVar) {
        long jD = (i14 & 1) != 0 ? f0.d(4278190080L) : j8;
        if ((i14 & 2) != 0) {
            n4.c.f123541b.getClass();
            j14 = 0;
        }
        this(jD, j14, (i14 & 4) != 0 ? 0.0f : f14, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return d0.d(this.f128958a, q1Var.f128958a) && n4.c.d(this.f128959b, q1Var.f128959b) && this.f128960c == q1Var.f128960c;
    }

    public final int hashCode() {
        d0.a aVar = d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        int iHashCode = Long.hashCode(this.f128958a) * 31;
        n4.c.a aVar3 = n4.c.f123541b;
        return Float.hashCode(this.f128960c) + q6.f.e(iHashCode, 31, this.f128959b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Shadow(color=");
        q2.m(this.f128958a, ", offset=", sb3);
        sb3.append((Object) n4.c.l(this.f128959b));
        sb3.append(", blurRadius=");
        return q6.f.p(sb3, this.f128960c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/q1$a;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private q1(long j8, long j14, float f14) {
        this.f128958a = j8;
        this.f128959b = j14;
        this.f128960c = f14;
    }

    public /* synthetic */ q1(long j8, long j14, float f14, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, f14);
    }
}
