package ml2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lml2/c0;", "", "", "productNumber", "firmwareVersion", "", "unitId", "<init>", "(ILjava/lang/Integer;Ljava/lang/Long;)V", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f119309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f119310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f119311c;

    public c0(int i14, Integer num, Long l14) {
        this.f119309a = i14;
        this.f119310b = num;
        this.f119311c = l14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f119309a == c0Var.f119309a && p005kotlin.jvm.internal.s.g(this.f119310b, c0Var.f119310b) && p005kotlin.jvm.internal.s.g(this.f119311c, c0Var.f119311c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f119309a) * 31;
        Integer num = this.f119310b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l14 = this.f119311c;
        return iHashCode2 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProductInfo(productNumber=");
        sb3.append(this.f119309a);
        sb3.append(", firmwareVersion=");
        sb3.append(this.f119310b);
        sb3.append(", unitId=");
        return p6.b.g(sb3, this.f119311c, ")");
    }
}
