package c22;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc22/p2;", "", "", "drawableRes", "colorRes", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f23192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f23193b;

    public /* synthetic */ p2(Integer num, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return p005kotlin.jvm.internal.s.g(this.f23192a, p2Var.f23192a) && p005kotlin.jvm.internal.s.g(this.f23193b, p2Var.f23193b);
    }

    public final int hashCode() {
        Integer num = this.f23192a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f23193b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ResourceItem(drawableRes=" + this.f23192a + ", colorRes=" + this.f23193b + ")";
    }

    public p2(Integer num, Integer num2) {
        this.f23192a = num;
        this.f23193b = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p2() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
