package sf;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.FirebasePerformance;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lsf/n;", "", "", "url", FirebaseAnalytics.Param.METHOD, "Lsf/m;", "headers", "Lsf/o;", TtmlNode.TAG_BODY, "Lhf/f;", "extras", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lsf/m;Lsf/o;Lhf/f;)V", "(Ljava/lang/String;Ljava/lang/String;Lsf/m;Lsf/o;)V", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f158811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f158812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hf.f f158813e;

    public /* synthetic */ n(String str, String str2, m mVar, o oVar, hf.f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? FirebasePerformance.HttpMethod.GET : str2, (i14 & 4) != 0 ? m.f158806b : mVar, (i14 & 8) != 0 ? null : oVar, (i14 & 16) != 0 ? hf.f.f83558b : fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return s.g(this.f158809a, nVar.f158809a) && s.g(this.f158810b, nVar.f158810b) && s.g(this.f158811c, nVar.f158811c) && s.g(this.f158812d, nVar.f158812d) && s.g(this.f158813e, nVar.f158813e);
    }

    public final int hashCode() {
        int iB = am.j.b(this.f158811c.f158807a, wr.g.j(this.f158809a.hashCode() * 31, 31, this.f158810b), 31);
        o oVar = this.f158812d;
        return this.f158813e.f83559a.hashCode() + ((iB + (oVar == null ? 0 : oVar.hashCode())) * 31);
    }

    public final String toString() {
        return "NetworkRequest(url=" + this.f158809a + ", method=" + this.f158810b + ", headers=" + this.f158811c + ", body=" + this.f158812d + ", extras=" + this.f158813e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public n(String str, String str2, m mVar, o oVar, hf.f fVar) {
        this.f158809a = str;
        this.f158810b = str2;
        this.f158811c = mVar;
        this.f158812d = oVar;
        this.f158813e = fVar;
    }

    public /* synthetic */ n(String str, String str2, m mVar, o oVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? FirebasePerformance.HttpMethod.GET : str2, (i14 & 4) != 0 ? m.f158806b : mVar, (i14 & 8) != 0 ? null : oVar);
    }

    @o13.e
    public /* synthetic */ n(String str, String str2, m mVar, o oVar) {
        this(str, str2, mVar, oVar, null, 16, null);
    }
}
