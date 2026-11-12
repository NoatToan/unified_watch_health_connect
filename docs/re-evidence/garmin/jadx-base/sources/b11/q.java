package b11;

import ds.e0;
import p005kotlin.Metadata;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lb11/q;", "", "", "labelRes", "", "value", "unitRes", "unitContentDescriptionRes", "Li53/c;", "subNutrients", "<init>", "(ILjava/lang/Double;IILi53/c;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f14368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<q> f14371e;

    public q(int i14, Double d14, int i15, int i16, i53.c cVar, int i17, p005kotlin.jvm.internal.j jVar) {
        this(i14, d14, i15, i16, (i17 & 16) != 0 ? j53.l.b() : cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f14367a == qVar.f14367a && p005kotlin.jvm.internal.s.g(this.f14368b, qVar.f14368b) && this.f14369c == qVar.f14369c && this.f14370d == qVar.f14370d && p005kotlin.jvm.internal.s.g(this.f14371e, qVar.f14371e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f14367a) * 31;
        Double d14 = this.f14368b;
        return this.f14371e.hashCode() + q2.d(this.f14370d, q2.d(this.f14369c, (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Nutrient(labelRes=");
        sb3.append(this.f14367a);
        sb3.append(", value=");
        sb3.append(this.f14368b);
        sb3.append(", unitRes=");
        e0.m(this.f14369c, this.f14370d, ", unitContentDescriptionRes=", ", subNutrients=", sb3);
        return l2.e(sb3, this.f14371e, ")");
    }

    public q(int i14, Double d14, int i15, int i16, i53.c<q> cVar) {
        cVar.getClass();
        this.f14367a = i14;
        this.f14368b = d14;
        this.f14369c = i15;
        this.f14370d = i16;
        this.f14371e = cVar;
    }
}
