package nr;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnr/m0;", "", "", TtmlNode.ATTR_ID, "", "isCurrent", "isCandidate", "", "title", "Lq91/d;", "personalRecordType", "<init>", "(JZZLjava/lang/String;Lq91/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f127258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f127259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f127260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f127261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q91.d f127262e;

    public m0(long j8, boolean z14, boolean z15, String str, q91.d dVar) {
        this.f127258a = j8;
        this.f127259b = z14;
        this.f127260c = z15;
        this.f127261d = str;
        this.f127262e = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f127258a == m0Var.f127258a && this.f127259b == m0Var.f127259b && this.f127260c == m0Var.f127260c && p005kotlin.jvm.internal.s.g(this.f127261d, m0Var.f127261d) && this.f127262e == m0Var.f127262e;
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(Long.hashCode(this.f127258a) * 31, 31, this.f127259b), 31, this.f127260c);
        String str = this.f127261d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        q91.d dVar = this.f127262e;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "PersonalRecordData(id=" + this.f127258a + ", isCurrent=" + this.f127259b + ", isCandidate=" + this.f127260c + ", title=" + this.f127261d + ", personalRecordType=" + this.f127262e + ")";
    }
}
