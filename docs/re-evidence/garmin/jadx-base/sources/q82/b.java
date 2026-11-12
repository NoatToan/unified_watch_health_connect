package q82;

import p005kotlin.Metadata;
import p3.m;
import p3.p1;
import q6.f;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
public interface b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq82/b$a;", "", "", "pageTitle", "", "firstPage", "lastPage", "<init>", "(Ljava/lang/String;ZZ)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f143362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f143363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f143364c;

        public a(String str, boolean z14, boolean z15) {
            str.getClass();
            this.f143362a = str;
            this.f143363b = z14;
            this.f143364c = z15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f143362a.equals(aVar.f143362a) && this.f143363b == aVar.f143363b && this.f143364c == aVar.f143364c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f143364c) + f.g(this.f143362a.hashCode() * 31, 31, this.f143363b);
        }

        public final String toString() {
            return hb.a.k(zl.a.d("Page(pageTitle=", this.f143362a, ", firstPage=", this.f143363b, ", lastPage="), this.f143364c, ")");
        }
    }

    Object a(i iVar);

    p1 b(m mVar, int i14);

    Object c(i iVar);
}
