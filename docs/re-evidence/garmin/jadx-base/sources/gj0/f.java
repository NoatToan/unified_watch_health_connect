package gj0;

import j53.l;
import m92.h0;
import o82.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lgj0/f;", "", "Li53/d;", "Lyi0/b;", "Li53/c;", "Lm92/h0$e$a;", "chartsLineData", "Lgj0/c;", "chartsHoverEntries", "", "chartXAxisLabels", "Lo82/g;", "dateIntervalType", "", "fixedIntervalSize", "<init>", "(Li53/d;Li53/d;Li53/c;Lo82/g;Ljava/lang/Float;)V", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.d<yi0.b, i53.c<h0.e.a>> f77512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.d<yi0.b, i53.c<c>> f77513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<String> f77514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f77515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Float f77516e;

    public f(i53.d dVar, i53.d dVar2, i53.c cVar, g gVar, Float f14, int i14, j jVar) {
        this((i14 & 1) != 0 ? i53.a.c() : dVar, (i14 & 2) != 0 ? i53.a.c() : dVar2, (i14 & 4) != 0 ? l.b() : cVar, (i14 & 8) != 0 ? g.f130853f : gVar, (i14 & 16) != 0 ? null : f14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f77512a, fVar.f77512a) && s.g(this.f77513b, fVar.f77513b) && s.g(this.f77514c, fVar.f77514c) && this.f77515d == fVar.f77515d && s.g(this.f77516e, fVar.f77516e);
    }

    public final int hashCode() {
        int i14 = q6.f.i(this.f77515d, l2.a(this.f77514c, l2.b(this.f77513b, this.f77512a.hashCode() * 31, 31), 31), 31);
        Float f14 = this.f77516e;
        return i14 + (f14 == null ? 0 : f14.hashCode());
    }

    public final String toString() {
        return "FtpSportReportState(chartsLineData=" + this.f77512a + ", chartsHoverEntries=" + this.f77513b + ", chartXAxisLabels=" + this.f77514c + ", dateIntervalType=" + this.f77515d + ", fixedIntervalSize=" + this.f77516e + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(i53.d<yi0.b, ? extends i53.c<h0.e.a>> dVar, i53.d<yi0.b, ? extends i53.c<c>> dVar2, i53.c<String> cVar, g gVar, Float f14) {
        dVar.getClass();
        dVar2.getClass();
        cVar.getClass();
        gVar.getClass();
        this.f77512a = dVar;
        this.f77513b = dVar2;
        this.f77514c = cVar;
        this.f77515d = gVar;
        this.f77516e = f14;
    }

    public f() {
        this(null, null, null, null, null, 31, null);
    }
}
