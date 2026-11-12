package h41;

import i41.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lh41/g;", "", "Lyz1/d;", "status", "Li41/h;", "hrvStatus", "", "avg", "Lh41/e;", "avgType", "", "markerValue", "Li53/c;", "Lh41/f;", "last4WeekHrvChartPoints", "<init>", "(Lyz1/d;Li41/h;Ljava/lang/Integer;Lh41/e;Ljava/lang/Float;Li53/c;)V", "gcm-overnighthrv_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f81618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f81619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f81620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f81621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Float f81622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.c<f> f81623f;

    public g(yz1.d dVar, h hVar, Integer num, e eVar, Float f14, i53.c<f> cVar) {
        dVar.getClass();
        hVar.getClass();
        cVar.getClass();
        this.f81618a = dVar;
        this.f81619b = hVar;
        this.f81620c = num;
        this.f81621d = eVar;
        this.f81622e = f14;
        this.f81623f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f81618a.equals(gVar.f81618a) && this.f81619b == gVar.f81619b && s.g(this.f81620c, gVar.f81620c) && this.f81621d == gVar.f81621d && s.g(this.f81622e, gVar.f81622e) && this.f81623f.equals(gVar.f81623f);
    }

    public final int hashCode() {
        int iHashCode = (this.f81619b.hashCode() + (this.f81618a.hashCode() * 31)) * 31;
        Integer num = this.f81620c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        e eVar = this.f81621d;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Float f14 = this.f81622e;
        return this.f81623f.hashCode() + ((iHashCode3 + (f14 != null ? f14.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "HrvStatusCardData(status=" + this.f81618a + ", hrvStatus=" + this.f81619b + ", avg=" + this.f81620c + ", avgType=" + this.f81621d + ", markerValue=" + this.f81622e + ", last4WeekHrvChartPoints=" + this.f81623f + ")";
    }
}
