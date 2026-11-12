package or1;

import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lor1/d;", "", "Lyz1/d;", "status", "", "averageStressLevel", "restStressDuration", "lowStressDuration", "mediumStressDuration", "highStressDuration", "Li53/c;", "stressData", "restData", "", "last7DaysDataAvailable", "<init>", "(Lyz1/d;Ljava/lang/Integer;IIIILi53/c;Li53/c;Z)V", "gcm-stress_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f133413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f133414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f133415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f133416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f133417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f133418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.c<Integer> f133419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.c<Integer> f133420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f133421i;

    public /* synthetic */ d(yz1.d dVar, Integer num, int i14, int i15, int i16, int i17, i53.c cVar, i53.c cVar2, boolean z14, int i18, j jVar) {
        this(dVar, (i18 & 2) != 0 ? null : num, (i18 & 4) != 0 ? -1 : i14, (i18 & 8) != 0 ? -1 : i15, (i18 & 16) != 0 ? -1 : i16, (i18 & 32) != 0 ? -1 : i17, cVar, cVar2, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f133413a, dVar.f133413a) && s.g(this.f133414b, dVar.f133414b) && this.f133415c == dVar.f133415c && this.f133416d == dVar.f133416d && this.f133417e == dVar.f133417e && this.f133418f == dVar.f133418f && s.g(this.f133419g, dVar.f133419g) && s.g(this.f133420h, dVar.f133420h) && this.f133421i == dVar.f133421i;
    }

    public final int hashCode() {
        int iHashCode = this.f133413a.hashCode() * 31;
        Integer num = this.f133414b;
        return Boolean.hashCode(this.f133421i) + l2.a(this.f133420h, l2.a(this.f133419g, q2.d(this.f133418f, q2.d(this.f133417e, q2.d(this.f133416d, q2.d(this.f133415c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StressData(status=");
        sb3.append(this.f133413a);
        sb3.append(", averageStressLevel=");
        sb3.append(this.f133414b);
        sb3.append(", restStressDuration=");
        e0.m(this.f133415c, this.f133416d, ", lowStressDuration=", ", mediumStressDuration=", sb3);
        e0.m(this.f133417e, this.f133418f, ", highStressDuration=", ", stressData=", sb3);
        f.w(sb3, this.f133419g, ", restData=", this.f133420h, ", last7DaysDataAvailable=");
        return hb.a.k(sb3, this.f133421i, ")");
    }

    public d(yz1.d dVar, Integer num, int i14, int i15, int i16, int i17, i53.c<Integer> cVar, i53.c<Integer> cVar2, boolean z14) {
        dVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        this.f133413a = dVar;
        this.f133414b = num;
        this.f133415c = i14;
        this.f133416d = i15;
        this.f133417e = i16;
        this.f133418f = i17;
        this.f133419g = cVar;
        this.f133420h = cVar2;
        this.f133421i = z14;
    }
}
