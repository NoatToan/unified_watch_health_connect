package t82;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt82/a;", "", "", "name", "contentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f163159b;

    public a(String str, String str2) {
        str.getClass();
        this.f163158a = str;
        this.f163159b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f163158a, aVar.f163158a) && s.g(this.f163159b, aVar.f163159b);
    }

    public final int hashCode() {
        int iHashCode = this.f163158a.hashCode() * 31;
        String str = this.f163159b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return e0.g("DateRange(name=", this.f163158a, ", contentDescription=", this.f163159b, ")");
    }

    public /* synthetic */ a(String str, String str2, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2);
    }
}
