package fd1;

import j53.l;
import java.util.Iterator;
import m92.h0;
import o82.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lfd1/e;", "", "Lo82/g;", "dateIntervalType", "Li53/c;", "Lfd1/c;", "chartLines", "Li53/d;", "", "Lfd1/b;", "chartHoverEntries", "", "chartXAxisLabels", "", "overallMaxPace", "overallMinPace", "<init>", "(Lo82/g;Li53/c;Li53/d;Li53/c;FF)V", "gcm-race-predictor_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f70490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<c> f70491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.d<Integer, b> f70492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<String> f70493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f70494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f70495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f70496g;

    public e(g gVar, i53.c<c> cVar, i53.d<Integer, b> dVar, i53.c<String> cVar2, float f14, float f15) {
        gVar.getClass();
        cVar.getClass();
        dVar.getClass();
        cVar2.getClass();
        this.f70490a = gVar;
        this.f70491b = cVar;
        this.f70492c = dVar;
        this.f70493d = cVar2;
        this.f70494e = f14;
        this.f70495f = f15;
        boolean z14 = false;
        if (!cVar.isEmpty()) {
            Iterator<c> it = cVar.iterator();
            loop0: while (it.hasNext()) {
                i53.c<h0.e.a> cVar3 = it.next().f70482b;
                if (!cVar3.isEmpty()) {
                    Iterator<h0.e.a> it3 = cVar3.iterator();
                    while (it3.hasNext()) {
                        if (it3.next().f117347b > 0.0f) {
                            z14 = true;
                            break loop0;
                        }
                    }
                }
            }
        }
        this.f70496g = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f70490a == eVar.f70490a && s.g(this.f70491b, eVar.f70491b) && s.g(this.f70492c, eVar.f70492c) && s.g(this.f70493d, eVar.f70493d) && Float.compare(this.f70494e, eVar.f70494e) == 0 && Float.compare(this.f70495f, eVar.f70495f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f70495f) + f.d(this.f70494e, l2.a(this.f70493d, l2.b(this.f70492c, l2.a(this.f70491b, this.f70490a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "RacePredictorReportState(dateIntervalType=" + this.f70490a + ", chartLines=" + this.f70491b + ", chartHoverEntries=" + this.f70492c + ", chartXAxisLabels=" + this.f70493d + ", overallMaxPace=" + this.f70494e + ", overallMinPace=" + this.f70495f + ")";
    }

    public e() {
        this(null, null, null, null, 0.0f, 0.0f, 63, null);
    }

    public e(g gVar, i53.c cVar, i53.d dVar, i53.c cVar2, float f14, float f15, int i14, j jVar) {
        this((i14 & 1) != 0 ? g.f130853f : gVar, (i14 & 2) != 0 ? l.b() : cVar, (i14 & 4) != 0 ? i53.a.c() : dVar, (i14 & 8) != 0 ? l.b() : cVar2, (i14 & 16) != 0 ? 1.0f : f14, (i14 & 32) != 0 ? 0.0f : f15);
    }
}
