package b82;

import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lb82/g1;", "", "", "selectedName", "deselectedName", "selectedContentDescription", "deselectedContentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16585d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g1(String str, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        str2 = (i14 & 2) != 0 ? str : str2;
        str3 = (i14 & 4) != 0 ? null : str3;
        this(str, str2, str3, (i14 & 8) != 0 ? str3 : str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return p005kotlin.jvm.internal.s.g(this.f16582a, g1Var.f16582a) && p005kotlin.jvm.internal.s.g(this.f16583b, g1Var.f16583b) && p005kotlin.jvm.internal.s.g(this.f16584c, g1Var.f16584c) && p005kotlin.jvm.internal.s.g(this.f16585d, g1Var.f16585d);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f16582a.hashCode() * 31, 31, this.f16583b);
        String str = this.f16584c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16585d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return e5.h(p6.b.i("Segment(selectedName=", this.f16582a, ", deselectedName=", this.f16583b, ", selectedContentDescription="), this.f16584c, ", deselectedContentDescription=", this.f16585d, ")");
    }

    public g1(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f16582a = str;
        this.f16583b = str2;
        this.f16584c = str3;
        this.f16585d = str4;
    }
}
