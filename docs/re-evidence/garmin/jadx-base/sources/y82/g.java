package y82;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly82/g;", "Ly82/a;", "", "throwable", "", "message", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f195242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195243b;

    public g(Throwable th3, String str) {
        th3.getClass();
        this.f195242a = th3;
        this.f195243b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f195242a, gVar.f195242a) && s.g(this.f195243b, gVar.f195243b);
    }

    public final int hashCode() {
        int iHashCode = this.f195242a.hashCode() * 31;
        String str = this.f195243b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ReportsPageThrowableFailure(throwable=" + this.f195242a + ", message=" + this.f195243b + ")";
    }

    public /* synthetic */ g(Throwable th3, String str, int i14, j jVar) {
        this(th3, (i14 & 2) != 0 ? null : str);
    }
}
