package pt1;

import p005kotlin.Metadata;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpt1/a;", "", "Lkt1/a;", "bottomSheetContentType", "", "visibleTrailsCount", "Li53/c;", "Lpt1/t;", "selectedTrails", "visibleTrails", "Lus1/k;", "trailsSortingMethod", "<init>", "(Lkt1/a;ILi53/c;Li53/c;Lus1/k;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kt1.a f140798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f140799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<t> f140800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<t> f140801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final us1.k f140802e;

    public a(kt1.a aVar, int i14, i53.c cVar, i53.c cVar2, us1.k kVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? kt1.a.NO_NEARBY_TRAILS : aVar, (i15 & 2) != 0 ? 0 : i14, (i15 & 4) != 0 ? j53.l.b() : cVar, (i15 & 8) != 0 ? j53.l.b() : cVar2, (i15 & 16) != 0 ? us1.k.MOST_POPULAR : kVar);
    }

    public static a a(a aVar, kt1.a aVar2, int i14, i53.c cVar, i53.c cVar2, us1.k kVar, int i15) {
        if ((i15 & 1) != 0) {
            aVar2 = aVar.f140798a;
        }
        kt1.a aVar3 = aVar2;
        if ((i15 & 2) != 0) {
            i14 = aVar.f140799b;
        }
        int i16 = i14;
        if ((i15 & 4) != 0) {
            cVar = aVar.f140800c;
        }
        i53.c cVar3 = cVar;
        if ((i15 & 8) != 0) {
            cVar2 = aVar.f140801d;
        }
        i53.c cVar4 = cVar2;
        if ((i15 & 16) != 0) {
            kVar = aVar.f140802e;
        }
        us1.k kVar2 = kVar;
        aVar.getClass();
        aVar3.getClass();
        cVar3.getClass();
        cVar4.getClass();
        kVar2.getClass();
        return new a(aVar3, i16, cVar3, cVar4, kVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f140798a == aVar.f140798a && this.f140799b == aVar.f140799b && p005kotlin.jvm.internal.s.g(this.f140800c, aVar.f140800c) && p005kotlin.jvm.internal.s.g(this.f140801d, aVar.f140801d) && this.f140802e == aVar.f140802e;
    }

    public final int hashCode() {
        return this.f140802e.hashCode() + l2.a(this.f140801d, l2.a(this.f140800c, q2.d(this.f140799b, this.f140798a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BottomSheetState(bottomSheetContentType=");
        sb3.append(this.f140798a);
        sb3.append(", visibleTrailsCount=");
        sb3.append(this.f140799b);
        sb3.append(", selectedTrails=");
        q6.f.w(sb3, this.f140800c, ", visibleTrails=", this.f140801d, ", trailsSortingMethod=");
        sb3.append(this.f140802e);
        sb3.append(")");
        return sb3.toString();
    }

    public a(kt1.a aVar, int i14, i53.c<t> cVar, i53.c<t> cVar2, us1.k kVar) {
        aVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        kVar.getClass();
        this.f140798a = aVar;
        this.f140799b = i14;
        this.f140800c = cVar;
        this.f140801d = cVar2;
        this.f140802e = kVar;
    }

    public a() {
        this(null, 0, null, null, null, 31, null);
    }
}
