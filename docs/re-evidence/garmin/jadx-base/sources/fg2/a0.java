package fg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfg2/a0;", "", "", "text", "noteHandle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71404b;

    public a0(String str, String str2) {
        str.getClass();
        this.f71403a = str;
        this.f71404b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f71403a.equals(a0Var.f71403a) && p005kotlin.jvm.internal.s.g(this.f71404b, a0Var.f71404b);
    }

    public final int hashCode() {
        int iHashCode = this.f71403a.hashCode() * 31;
        String str = this.f71404b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return v.e0.g("WarmUpNote(text=", this.f71403a, ", noteHandle=", this.f71404b, ")");
    }
}
