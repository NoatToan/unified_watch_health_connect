package sz1;

import m92.h0;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lsz1/q;", "", "Li53/c;", "Lm92/h0$e$a;", "chartLineData", "", "chartXAxisLabels", "", "chartMaxY", "chartMinY", "<init>", "(Li53/c;Li53/c;Ljava/lang/Float;Ljava/lang/Float;)V", "gcm-training-readiness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<h0.e.a> f161568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<String> f161569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f161570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Float f161571d;

    /* JADX WARN: Illegal instructions before constructor call */
    public q(i53.c cVar, i53.c cVar2, Float f14, Float f15, int i14, p005kotlin.jvm.internal.j jVar) {
        Float fValueOf = Float.valueOf(0.0f);
        this((i14 & 1) != 0 ? j53.l.b() : cVar, (i14 & 2) != 0 ? j53.l.b() : cVar2, (i14 & 4) != 0 ? fValueOf : f14, (i14 & 8) != 0 ? fValueOf : f15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.f161568a, qVar.f161568a) && p005kotlin.jvm.internal.s.g(this.f161569b, qVar.f161569b) && p005kotlin.jvm.internal.s.g(this.f161570c, qVar.f161570c) && p005kotlin.jvm.internal.s.g(this.f161571d, qVar.f161571d);
    }

    public final int hashCode() {
        int iA = l2.a(this.f161569b, this.f161568a.hashCode() * 31, 31);
        Float f14 = this.f161570c;
        int iHashCode = (iA + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.f161571d;
        return iHashCode + (f15 != null ? f15.hashCode() : 0);
    }

    public final String toString() {
        return "TrainingReadinessReportState(chartLineData=" + this.f161568a + ", chartXAxisLabels=" + this.f161569b + ", chartMaxY=" + this.f161570c + ", chartMinY=" + this.f161571d + ")";
    }

    public q(i53.c<h0.e.a> cVar, i53.c<String> cVar2, Float f14, Float f15) {
        cVar.getClass();
        cVar2.getClass();
        this.f161568a = cVar;
        this.f161569b = cVar2;
        this.f161570c = f14;
        this.f161571d = f15;
    }

    public q() {
        this(null, null, null, null, 15, null);
    }
}
