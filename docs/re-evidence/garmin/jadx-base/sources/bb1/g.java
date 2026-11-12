package bb1;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lbb1/g;", "", "", TtmlNode.ATTR_ID, "coursePk", "", "strategyName", "estCompletionTime", "estCompletionTimeContentDescription", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17324e;

    public g(long j8, long j14, String str, String str2, String str3) {
        str.getClass();
        this.f17320a = j8;
        this.f17321b = j14;
        this.f17322c = str;
        this.f17323d = str2;
        this.f17324e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f17320a == gVar.f17320a && this.f17321b == gVar.f17321b && this.f17322c.equals(gVar.f17322c) && s.g(this.f17323d, gVar.f17323d) && s.g(this.f17324e, gVar.f17324e);
    }

    public final int hashCode() {
        int iJ = wr.g.j(q6.f.e(Long.hashCode(this.f17320a) * 31, 31, this.f17321b), 31, this.f17322c);
        String str = this.f17323d;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17324e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = e0.k(this.f17320a, "PowerGuideStrategyUIData(id=", ", coursePk=");
        p6.b.k(this.f17321b, ", strategyName=", this.f17322c, sbK);
        sn.a.t(sbK, ", estCompletionTime=", this.f17323d, ", estCompletionTimeContentDescription=", this.f17324e);
        sbK.append(")");
        return sbK.toString();
    }
}
