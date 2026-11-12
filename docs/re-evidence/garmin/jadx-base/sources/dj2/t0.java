package dj2;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ldj2/t0;", "", "", Action.KEY_ATTRIBUTE, "value", "", "isValid", "isMandatory", "isVisible", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZ)V", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f60138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f60139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f60140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f60141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f60142e;

    public /* synthetic */ t0(String str, String str2, boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? true : z14, (i14 & 8) != 0 ? true : z15, (i14 & 16) != 0 ? true : z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return p005kotlin.jvm.internal.s.g(this.f60138a, t0Var.f60138a) && p005kotlin.jvm.internal.s.g(this.f60139b, t0Var.f60139b) && this.f60140c == t0Var.f60140c && this.f60141d == t0Var.f60141d && this.f60142e == t0Var.f60142e;
    }

    public final int hashCode() {
        String str = this.f60138a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f60139b;
        return Boolean.hashCode(this.f60142e) + q6.f.g(q6.f.g((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f60140c), 31, this.f60141d);
    }

    public final String toString() {
        String str = this.f60138a;
        String str2 = this.f60139b;
        boolean z14 = this.f60141d;
        boolean z15 = this.f60142e;
        StringBuilder sbI = p6.b.i("InputWrapper(key=", str, ", value=", str2, ", isValid=");
        kg.f.q(", isMandatory=", ", isVisible=", sbI, this.f60140c, z14);
        return hb.a.k(sbI, z15, ")");
    }

    public t0(String str, String str2, boolean z14, boolean z15, boolean z16) {
        this.f60138a = str;
        this.f60139b = str2;
        this.f60140c = z14;
        this.f60141d = z15;
        this.f60142e = z16;
    }

    public t0() {
        this(null, null, false, false, false, 31, null);
    }
}
