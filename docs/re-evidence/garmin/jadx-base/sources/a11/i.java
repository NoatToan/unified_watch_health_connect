package a11;

import i3.e5;
import p005kotlin.Metadata;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"La11/i;", "", "", "minWholeNumber", "maxWholeNumber", "Li53/c;", "La11/h;", "fractions", "<init>", "(IILi53/c;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<h> f312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<Integer> f313d;

    public i(int i14, int i15, i53.c<h> cVar) {
        cVar.getClass();
        this.f310a = i14;
        this.f311b = i15;
        this.f312c = cVar;
        this.f313d = ds.e0.h(i14, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f310a == iVar.f310a && this.f311b == iVar.f311b && p005kotlin.jvm.internal.s.g(this.f312c, iVar.f312c);
    }

    public final int hashCode() {
        return this.f312c.hashCode() + q2.d(this.f311b, Integer.hashCode(this.f310a) * 31, 31);
    }

    public final String toString() {
        return l2.e(e5.j(this.f310a, this.f311b, "FractionInputConfiguration(minWholeNumber=", ", maxWholeNumber=", ", fractions="), this.f312c, ")");
    }

    public /* synthetic */ i(int i14, int i15, i53.c cVar, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? 0 : i14, i15, cVar);
    }
}
