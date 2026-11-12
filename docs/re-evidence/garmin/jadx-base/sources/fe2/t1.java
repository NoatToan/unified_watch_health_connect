package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfe2/t1;", "", "Lae2/o;", "errorDetail", "", "value", "<init>", "(Lae2/o;Ljava/lang/String;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ae2.o f70934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70935b;

    public t1(ae2.o oVar, String str) {
        oVar.getClass();
        this.f70934a = oVar;
        this.f70935b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return p005kotlin.jvm.internal.s.g(this.f70934a, t1Var.f70934a) && p005kotlin.jvm.internal.s.g(this.f70935b, t1Var.f70935b);
    }

    public final int hashCode() {
        int iHashCode = this.f70934a.hashCode() * 31;
        String str = this.f70935b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CreatorError(errorDetail=" + this.f70934a + ", value=" + this.f70935b + ")";
    }

    public /* synthetic */ t1(ae2.o oVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(oVar, (i14 & 2) != 0 ? null : str);
    }
}
