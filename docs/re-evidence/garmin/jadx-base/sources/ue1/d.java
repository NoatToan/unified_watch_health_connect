package ue1;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lue1/d;", "", "", "startDate", "endDate", "", FirebaseAnalytics.Param.SCORE, "classification", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f170239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f170240d;

    public d(String str, String str2, Integer num, String str3) {
        this.f170237a = str;
        this.f170238b = str2;
        this.f170239c = num;
        this.f170240d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f170237a, dVar.f170237a) && s.g(this.f170238b, dVar.f170238b) && s.g(this.f170239c, dVar.f170239c) && s.g(this.f170240d, dVar.f170240d);
    }

    public final int hashCode() {
        String str = this.f170237a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f170238b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f170239c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f170240d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("RunningEconomyAggregate(startDate=", this.f170237a, ", endDate=", this.f170238b, ", score=");
        sbI.append(this.f170239c);
        sbI.append(", classification=");
        sbI.append(this.f170240d);
        sbI.append(")");
        return sbI.toString();
    }
}
