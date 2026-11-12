package if1;

import i3.e5;
import o13.z;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q6.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lif1/a;", "", "Lo4/d0;", "impactLoadBelowToleranceColor", "impactLoadAboveToleranceColor", "impactLoadInactiveColor", "realDistanceColor", "<init>", "(JJJJLkotlin/jvm/internal/j;)V", "gcm-running-tolerance_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f93182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f93183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f93184d;

    private a(long j8, long j14, long j15, long j16) {
        this.f93181a = j8;
        this.f93182b = j14;
        this.f93183c = j15;
        this.f93184d = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return d0.d(this.f93181a, aVar.f93181a) && d0.d(this.f93182b, aVar.f93182b) && d0.d(this.f93183c, aVar.f93183c) && d0.d(this.f93184d, aVar.f93184d);
    }

    public final int hashCode() {
        d0.a aVar = d0.f128823b;
        z.a aVar2 = z.f128618b;
        return Long.hashCode(this.f93184d) + f.e(f.e(Long.hashCode(this.f93181a) * 31, 31, this.f93182b), 31, this.f93183c);
    }

    public final String toString() {
        String strJ = d0.j(this.f93181a);
        String strJ2 = d0.j(this.f93182b);
        return e5.h(p6.b.i("RunningToleranceChartColors(impactLoadBelowToleranceColor=", strJ, ", impactLoadAboveToleranceColor=", strJ2, ", impactLoadInactiveColor="), d0.j(this.f93183c), ", realDistanceColor=", d0.j(this.f93184d), ")");
    }

    public /* synthetic */ a(long j8, long j14, long j15, long j16, j jVar) {
        this(j8, j14, j15, j16);
    }
}
