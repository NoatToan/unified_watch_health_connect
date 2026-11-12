package rm1;

import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrm1/a;", "", "", "endTimeGMT", "startTimeGMT", "", "severity", "<init>", "(JJLjava/lang/Integer;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f153529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f153530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f153531c;

    public a(long j8, long j14, Integer num) {
        this.f153529a = j8;
        this.f153530b = j14;
        this.f153531c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f153529a == aVar.f153529a && this.f153530b == aVar.f153530b && s.g(this.f153531c, aVar.f153531c);
    }

    public final int hashCode() {
        int iE = q6.f.e(Long.hashCode(this.f153529a) * 31, 31, this.f153530b);
        Integer num = this.f153531c;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbK = e0.k(this.f153529a, "BreathingVariationEvent(endTimeGMT=", ", startTimeGMT=");
        sbK.append(this.f153530b);
        sbK.append(", severity=");
        sbK.append(this.f153531c);
        sbK.append(")");
        return sbK.toString();
    }
}
