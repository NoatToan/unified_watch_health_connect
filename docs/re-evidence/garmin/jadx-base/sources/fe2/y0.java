package fe2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfe2/y0;", "", "", "nickname", "publisherIdentifier", "Lwd2/n1;", "trackerType", "", "Lwd2/b2;", "sessionInfoList", "", "startTimestampMillis", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lwd2/n1;Ljava/util/List;Ljava/lang/Long;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wd2.n1 f71008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<wd2.b2> f71009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f71010e;

    public y0(String str, String str2, wd2.n1 n1Var, List list, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? new wd2.n1.b() : n1Var, (i14 & 8) != 0 ? p13.j0.f134944a : list, (i14 & 16) != 0 ? null : l14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return p005kotlin.jvm.internal.s.g(this.f71006a, y0Var.f71006a) && p005kotlin.jvm.internal.s.g(this.f71007b, y0Var.f71007b) && p005kotlin.jvm.internal.s.g(this.f71008c, y0Var.f71008c) && p005kotlin.jvm.internal.s.g(this.f71009d, y0Var.f71009d) && p005kotlin.jvm.internal.s.g(this.f71010e, y0Var.f71010e);
    }

    public final int hashCode() {
        String str = this.f71006a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f71007b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        wd2.n1 n1Var = this.f71008c;
        int iB = lc.u0.b((iHashCode2 + (n1Var == null ? 0 : n1Var.hashCode())) * 31, 31, this.f71009d);
        Long l14 = this.f71010e;
        return iB + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("DeviceDrivenSessionInput(nickname=", this.f71006a, ", publisherIdentifier=", this.f71007b, ", trackerType=");
        sbI.append(this.f71008c);
        sbI.append(", sessionInfoList=");
        sbI.append(this.f71009d);
        sbI.append(", startTimestampMillis=");
        return p6.b.g(sbI, this.f71010e, ")");
    }

    public y0(String str, String str2, wd2.n1 n1Var, List<wd2.b2> list, Long l14) {
        list.getClass();
        this.f71006a = str;
        this.f71007b = str2;
        this.f71008c = n1Var;
        this.f71009d = list;
        this.f71010e = l14;
    }

    public y0() {
        this(null, null, null, null, null, 31, null);
    }
}
