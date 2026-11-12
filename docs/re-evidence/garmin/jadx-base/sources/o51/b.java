package o51;

import j53.l;
import m92.h0;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lo51/b;", "", "Li53/c;", "Lm92/h0$e$a;", "paceProfilePoints", "Lo13/p;", "", "", "paceProfileColors", "elevationProfilePoints", "", "xAxisLabels", "Lo51/a;", "chartMarkers", "paceRangeMax", "paceRangeMin", "paceRangeTarget", "elevationRangeMax", "elevationRangeMin", "", "isPaceAndDistanceMetric", "<init>", "(Li53/c;Li53/c;Li53/c;Li53/c;Li53/c;FFFLjava/lang/Float;Ljava/lang/Float;Z)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<h0.e.a> f129208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<p<Float, Integer>> f129209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<h0.e.a> f129210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<String> f129211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<a> f129212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f129213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f129214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f129215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Float f129216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Float f129217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f129218k;

    public b(i53.c cVar, i53.c cVar2, i53.c cVar3, i53.c cVar4, i53.c cVar5, float f14, float f15, float f16, Float f17, Float f18, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? l.b() : cVar, (i14 & 2) != 0 ? l.b() : cVar2, (i14 & 4) != 0 ? null : cVar3, (i14 & 8) != 0 ? l.b() : cVar4, (i14 & 16) != 0 ? l.b() : cVar5, (i14 & 32) != 0 ? 0.0f : f14, (i14 & 64) != 0 ? 1.0f : f15, (i14 & 128) != 0 ? 0.5f : f16, (i14 & 256) != 0 ? null : f17, (i14 & 512) != 0 ? null : f18, (i14 & 1024) != 0 ? true : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f129208a, bVar.f129208a) && s.g(this.f129209b, bVar.f129209b) && s.g(this.f129210c, bVar.f129210c) && s.g(this.f129211d, bVar.f129211d) && s.g(this.f129212e, bVar.f129212e) && Float.compare(this.f129213f, bVar.f129213f) == 0 && Float.compare(this.f129214g, bVar.f129214g) == 0 && Float.compare(this.f129215h, bVar.f129215h) == 0 && s.g(this.f129216i, bVar.f129216i) && s.g(this.f129217j, bVar.f129217j) && this.f129218k == bVar.f129218k;
    }

    public final int hashCode() {
        int iA = l2.a(this.f129209b, this.f129208a.hashCode() * 31, 31);
        i53.c<h0.e.a> cVar = this.f129210c;
        int iD = q6.f.d(this.f129215h, q6.f.d(this.f129214g, q6.f.d(this.f129213f, l2.a(this.f129212e, l2.a(this.f129211d, (iA + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31), 31), 31), 31);
        Float f14 = this.f129216i;
        int iHashCode = (iD + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.f129217j;
        return Boolean.hashCode(this.f129218k) + ((iHashCode + (f15 != null ? f15.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PaceProChartState(paceProfilePoints=");
        sb3.append(this.f129208a);
        sb3.append(", paceProfileColors=");
        sb3.append(this.f129209b);
        sb3.append(", elevationProfilePoints=");
        q6.f.w(sb3, this.f129210c, ", xAxisLabels=", this.f129211d, ", chartMarkers=");
        sb3.append(this.f129212e);
        sb3.append(", paceRangeMax=");
        sb3.append(this.f129213f);
        sb3.append(", paceRangeMin=");
        l2.n(sb3, this.f129214g, ", paceRangeTarget=", this.f129215h, ", elevationRangeMax=");
        sb3.append(this.f129216i);
        sb3.append(", elevationRangeMin=");
        sb3.append(this.f129217j);
        sb3.append(", isPaceAndDistanceMetric=");
        return hb.a.k(sb3, this.f129218k, ")");
    }

    public b(i53.c<h0.e.a> cVar, i53.c<p<Float, Integer>> cVar2, i53.c<h0.e.a> cVar3, i53.c<String> cVar4, i53.c<a> cVar5, float f14, float f15, float f16, Float f17, Float f18, boolean z14) {
        cVar.getClass();
        cVar2.getClass();
        cVar4.getClass();
        cVar5.getClass();
        this.f129208a = cVar;
        this.f129209b = cVar2;
        this.f129210c = cVar3;
        this.f129211d = cVar4;
        this.f129212e = cVar5;
        this.f129213f = f14;
        this.f129214g = f15;
        this.f129215h = f16;
        this.f129216i = f17;
        this.f129217j = f18;
        this.f129218k = z14;
    }

    public b() {
        this(null, null, null, null, null, 0.0f, 0.0f, 0.0f, null, null, false, 2047, null);
    }
}
