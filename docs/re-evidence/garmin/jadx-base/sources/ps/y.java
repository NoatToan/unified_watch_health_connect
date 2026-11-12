package ps;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lps/y;", "", "", "numericData", "", "stringData", "splitMode", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f140408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f140410c;

    public /* synthetic */ y(Double d14, String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return p005kotlin.jvm.internal.s.g(this.f140408a, yVar.f140408a) && p005kotlin.jvm.internal.s.g(this.f140409b, yVar.f140409b) && p005kotlin.jvm.internal.s.g(this.f140410c, yVar.f140410c);
    }

    public final int hashCode() {
        Double d14 = this.f140408a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        String str = this.f140409b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f140410c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ClimbingMetric(numericData=");
        sb3.append(this.f140408a);
        sb3.append(", stringData=");
        sb3.append(this.f140409b);
        sb3.append(", splitMode=");
        return am.j.o(this.f140410c, ")", sb3);
    }

    public y(Double d14, String str, String str2) {
        this.f140408a = d14;
        this.f140409b = str;
        this.f140410c = str2;
    }
}
