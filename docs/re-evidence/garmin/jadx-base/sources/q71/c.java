package q71;

import j53.l;
import m92.h0;
import o82.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lq71/c;", "", "Li53/c;", "Lm92/h0$e$a;", "chartLineData", "Lq71/b;", "chartHoverEntries", "", "chartXAxisLabels", "Lo82/g;", "dateIntervalType", "", "fixedIntervalSize", "<init>", "(Li53/c;Li53/c;Li53/c;Lo82/g;Ljava/lang/Float;)V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<h0.e.a> f143233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<b> f143234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<String> f143235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f143236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Float f143237e;

    public c(i53.c cVar, i53.c cVar2, i53.c cVar3, g gVar, Float f14, int i14, j jVar) {
        this((i14 & 1) != 0 ? l.b() : cVar, (i14 & 2) != 0 ? l.b() : cVar2, (i14 & 4) != 0 ? l.b() : cVar3, (i14 & 8) != 0 ? g.f130853f : gVar, (i14 & 16) != 0 ? null : f14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f143233a, cVar.f143233a) && s.g(this.f143234b, cVar.f143234b) && s.g(this.f143235c, cVar.f143235c) && this.f143236d == cVar.f143236d && s.g(this.f143237e, cVar.f143237e);
    }

    public final int hashCode() {
        int i14 = q6.f.i(this.f143236d, l2.a(this.f143235c, l2.a(this.f143234b, this.f143233a.hashCode() * 31, 31), 31), 31);
        Float f14 = this.f143237e;
        return i14 + (f14 == null ? 0 : f14.hashCode());
    }

    public final String toString() {
        return "VO2MaxReportRecordState(chartLineData=" + this.f143233a + ", chartHoverEntries=" + this.f143234b + ", chartXAxisLabels=" + this.f143235c + ", dateIntervalType=" + this.f143236d + ", fixedIntervalSize=" + this.f143237e + ")";
    }

    public c(i53.c<h0.e.a> cVar, i53.c<b> cVar2, i53.c<String> cVar3, g gVar, Float f14) {
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        gVar.getClass();
        this.f143233a = cVar;
        this.f143234b = cVar2;
        this.f143235c = cVar3;
        this.f143236d = gVar;
        this.f143237e = f14;
    }

    public c() {
        this(null, null, null, null, null, 31, null);
    }
}
