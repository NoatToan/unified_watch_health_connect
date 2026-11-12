package sf;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lsf/p;", "", "", "code", "", "requestMillis", "responseMillis", "Lsf/m;", "headers", "Lsf/q;", TtmlNode.TAG_BODY, "delegate", "<init>", "(IJJLsf/m;Lsf/q;Ljava/lang/Object;)V", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f158814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f158815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f158816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f158817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f158818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f158819f;

    public /* synthetic */ p(int i14, long j8, long j14, m mVar, q qVar, Object obj, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 200 : i14, (i15 & 2) != 0 ? 0L : j8, (i15 & 4) != 0 ? 0L : j14, (i15 & 8) != 0 ? m.f158806b : mVar, (i15 & 16) != 0 ? null : qVar, (i15 & 32) != 0 ? null : obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f158814a == pVar.f158814a && this.f158815b == pVar.f158815b && this.f158816c == pVar.f158816c && s.g(this.f158817d, pVar.f158817d) && s.g(this.f158818e, pVar.f158818e) && s.g(this.f158819f, pVar.f158819f);
    }

    public final int hashCode() {
        int iB = am.j.b(this.f158817d.f158807a, q6.f.e(q6.f.e(this.f158814a * 31, 31, this.f158815b), 31, this.f158816c), 31);
        q qVar = this.f158818e;
        int iHashCode = (iB + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj = this.f158819f;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NetworkResponse(code=");
        sb3.append(this.f158814a);
        sb3.append(", requestMillis=");
        sb3.append(this.f158815b);
        sb3.append(", responseMillis=");
        sb3.append(this.f158816c);
        sb3.append(", headers=");
        sb3.append(this.f158817d);
        sb3.append(", body=");
        sb3.append(this.f158818e);
        sb3.append(", delegate=");
        return wr.g.p(sb3, this.f158819f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public p(int i14, long j8, long j14, m mVar, q qVar, Object obj) {
        this.f158814a = i14;
        this.f158815b = j8;
        this.f158816c = j14;
        this.f158817d = mVar;
        this.f158818e = qVar;
        this.f158819f = obj;
    }

    public p() {
        this(0, 0L, 0L, null, null, null, 63, null);
    }
}
