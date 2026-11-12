package sc2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsc2/l;", "", "", TtmlNode.ATTR_ID, "secret", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158525b;

    public l(String str, String str2) {
        str.getClass();
        this.f158524a = str;
        this.f158525b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.f158524a, lVar.f158524a) && s.g(this.f158525b, lVar.f158525b);
    }

    public final int hashCode() {
        int iHashCode = this.f158524a.hashCode() * 31;
        String str = this.f158525b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return e0.g("OAuth2Client(id=", this.f158524a, ", secret=", this.f158525b, ")");
    }

    public /* synthetic */ l(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2);
    }
}
