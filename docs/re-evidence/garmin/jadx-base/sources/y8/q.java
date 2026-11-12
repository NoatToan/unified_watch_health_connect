package y8;

import ch.qos.logback.core.CoreConstants;
import java.time.Instant;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ly8/q;", "", "Ljava/time/Instant;", "startTime", "endTime", "Lc9/c;", "length", "<init>", "(Ljava/time/Instant;Ljava/time/Instant;Lc9/c;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f194947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.c f194948c;

    public q(Instant instant, Instant instant2, c9.c cVar) {
        instant.getClass();
        instant2.getClass();
        this.f194946a = instant;
        this.f194947b = instant2;
        this.f194948c = cVar;
        if (!instant.isBefore(instant2)) {
            vb.h.s("startTime must be before endTime.");
            throw null;
        }
        if (cVar != null) {
            double dA = cVar.a();
            if (0.0d > dA || dA > 1000000.0d) {
                vb.h.s("length valid range: 0-1000000.");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.f194946a, qVar.f194946a) && p005kotlin.jvm.internal.s.g(this.f194947b, qVar.f194947b) && p005kotlin.jvm.internal.s.g(this.f194948c, qVar.f194948c);
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f194947b, this.f194946a.hashCode() * 31, 31);
        c9.c cVar = this.f194948c;
        return iK + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "ExerciseLap(startTime=" + this.f194946a + ", endTime=" + this.f194947b + ", length=" + this.f194948c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ q(Instant instant, Instant instant2, c9.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(instant, instant2, (i14 & 4) != 0 ? null : cVar);
    }
}
