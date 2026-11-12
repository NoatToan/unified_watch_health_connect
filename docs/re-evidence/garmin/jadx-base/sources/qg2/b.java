package qg2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqg2/b;", "", "", "min", "max", "step", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f144673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f144674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f144675c;

    public b(Float f14, Float f15, Float f16) {
        this.f144673a = f14;
        this.f144674b = f15;
        this.f144675c = f16;
    }

    public static b a(b bVar, Float f14, Float f15, int i14) {
        if ((i14 & 1) != 0) {
            f14 = bVar.f144673a;
        }
        if ((i14 & 2) != 0) {
            f15 = bVar.f144674b;
        }
        return new b(f14, f15, bVar.f144675c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f144673a, bVar.f144673a) && s.g(this.f144674b, bVar.f144674b) && s.g(this.f144675c, bVar.f144675c);
    }

    public final int hashCode() {
        Float f14 = this.f144673a;
        int iHashCode = (f14 == null ? 0 : f14.hashCode()) * 31;
        Float f15 = this.f144674b;
        int iHashCode2 = (iHashCode + (f15 == null ? 0 : f15.hashCode())) * 31;
        Float f16 = this.f144675c;
        return iHashCode2 + (f16 != null ? f16.hashCode() : 0);
    }

    public final String toString() {
        return "AxisConstraints(min=" + this.f144673a + ", max=" + this.f144674b + ", step=" + this.f144675c + ")";
    }
}
