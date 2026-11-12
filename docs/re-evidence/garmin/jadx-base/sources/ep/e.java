package ep;

import i3.e5;
import m92.h0;
import o13.z;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lep/e;", "", "Li53/c;", "Lm92/h0$e$a;", "activityPowerCurvePoints", "Lep/b;", "peakPowerCurvePoints", "Lo4/d0;", "activityPowerCurveColor", "peakPowerCurveColor", "<init>", "(Li53/c;Li53/c;JJLkotlin/jvm/internal/j;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<h0.e.a> f64812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<b> f64813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f64814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f64815d;

    private e(i53.c<h0.e.a> cVar, i53.c<b> cVar2, long j8, long j14) {
        cVar.getClass();
        cVar2.getClass();
        this.f64812a = cVar;
        this.f64813b = cVar2;
        this.f64814c = j8;
        this.f64815d = j14;
    }

    public static e a(e eVar, i53.c cVar, i53.c cVar2, int i14) {
        if ((i14 & 1) != 0) {
            cVar = eVar.f64812a;
        }
        i53.c cVar3 = cVar;
        long j8 = eVar.f64814c;
        long j14 = eVar.f64815d;
        eVar.getClass();
        cVar3.getClass();
        cVar2.getClass();
        return new e(cVar3, cVar2, j8, j14, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f64812a, eVar.f64812a) && s.g(this.f64813b, eVar.f64813b) && d0.d(this.f64814c, eVar.f64814c) && d0.d(this.f64815d, eVar.f64815d);
    }

    public final int hashCode() {
        int iA = l2.a(this.f64813b, this.f64812a.hashCode() * 31, 31);
        d0.a aVar = d0.f128823b;
        z.a aVar2 = z.f128618b;
        return Long.hashCode(this.f64815d) + q6.f.e(iA, 31, this.f64814c);
    }

    public final String toString() {
        String strJ = d0.j(this.f64814c);
        String strJ2 = d0.j(this.f64815d);
        StringBuilder sb3 = new StringBuilder("PowerCurveDataConfig(activityPowerCurvePoints=");
        sb3.append(this.f64812a);
        sb3.append(", peakPowerCurvePoints=");
        sb3.append(this.f64813b);
        sb3.append(", activityPowerCurveColor=");
        return e5.h(sb3, strJ, ", peakPowerCurveColor=", strJ2, ")");
    }

    public /* synthetic */ e(i53.c cVar, i53.c cVar2, long j8, long j14, p005kotlin.jvm.internal.j jVar) {
        this(cVar, cVar2, j8, j14);
    }
}
