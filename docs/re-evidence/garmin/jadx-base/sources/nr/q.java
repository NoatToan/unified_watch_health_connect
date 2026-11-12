package nr;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnr/q;", "", "Lzm/p;", "chartData", "", "hasGradeAdjustedPace", "", "deviceId", "isOwnActivity", "<init>", "(Lzm/p;ZLjava/lang/Long;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm.p f127304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f127305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f127306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f127307d;

    public q(zm.p pVar, boolean z14, Long l14, boolean z15) {
        pVar.getClass();
        this.f127304a = pVar;
        this.f127305b = z14;
        this.f127306c = l14;
        this.f127307d = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f127304a.equals(qVar.f127304a) && this.f127305b == qVar.f127305b && p005kotlin.jvm.internal.s.g(this.f127306c, qVar.f127306c) && this.f127307d == qVar.f127307d;
    }

    public final int hashCode() {
        int iG = q6.f.g(this.f127304a.hashCode() * 31, 31, this.f127305b);
        Long l14 = this.f127306c;
        return Boolean.hashCode(this.f127307d) + ((iG + (l14 == null ? 0 : l14.hashCode())) * 31);
    }

    public final String toString() {
        return "ChartHelpData(chartData=" + this.f127304a + ", hasGradeAdjustedPace=" + this.f127305b + ", deviceId=" + this.f127306c + ", isOwnActivity=" + this.f127307d + ")";
    }
}
