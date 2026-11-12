package qe1;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqe1/k;", "", "", "startDate", "endDate", "", FirebaseAnalytics.Param.SCORE, "classification", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f144560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f144561d;

    public k(String str, String str2, Integer num, String str3) {
        this.f144558a = str;
        this.f144559b = str2;
        this.f144560c = num;
        this.f144561d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.f144558a, kVar.f144558a) && s.g(this.f144559b, kVar.f144559b) && s.g(this.f144560c, kVar.f144560c) && s.g(this.f144561d, kVar.f144561d);
    }

    public final int hashCode() {
        String str = this.f144558a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f144559b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f144560c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f144561d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("RunningEconomyWeeklyMetrics(startDate=", this.f144558a, ", endDate=", this.f144559b, ", score=");
        sbI.append(this.f144560c);
        sbI.append(", classification=");
        sbI.append(this.f144561d);
        sbI.append(")");
        return sbI.toString();
    }
}
