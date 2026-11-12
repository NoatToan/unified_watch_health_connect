package c63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc63/j;", "Le63/q;", "Lc63/v0;", "Lc63/i;", "", "amString", "pmString", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends e63.q<v0, i> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f24992f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, String str2) {
        super(w0.f25073f, p13.u0.e(new o13.p(i.AM, str), new o13.p(i.PM, str2)), "AM/PM marker");
        str.getClass();
        str2.getClass();
        w0.f25068a.getClass();
        this.f24991e = str;
        this.f24992f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.f24991e, jVar.f24991e) && p005kotlin.jvm.internal.s.g(this.f24992f, jVar.f24992f);
    }

    public final int hashCode() {
        return this.f24992f.hashCode() + (this.f24991e.hashCode() * 31);
    }
}
