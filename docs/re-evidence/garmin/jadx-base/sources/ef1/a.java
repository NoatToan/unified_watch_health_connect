package ef1;

import am.j;
import j20.x;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lef1/a;", "", "", "date", "", "acuteImpactLoad", "acuteDistance", "acuteTolerance", "feedBackPhrase", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f63949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f63950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f63951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f63952e;

    public a(String str, Integer num, Integer num2, Integer num3, String str2) {
        this.f63948a = str;
        this.f63949b = num;
        this.f63950c = num2;
        this.f63951d = num3;
        this.f63952e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f63948a, aVar.f63948a) && s.g(this.f63949b, aVar.f63949b) && s.g(this.f63950c, aVar.f63950c) && s.g(this.f63951d, aVar.f63951d) && s.g(this.f63952e, aVar.f63952e);
    }

    public final int hashCode() {
        String str = this.f63948a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f63949b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f63950c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f63951d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.f63952e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = u0.n("RunningToleranceMetrics(date=", this.f63949b, this.f63948a, ", acuteImpactLoad=", ", acuteDistance=");
        x.m(sbN, this.f63950c, ", acuteTolerance=", this.f63951d, ", feedBackPhrase=");
        return j.o(this.f63952e, ")", sbN);
    }
}
