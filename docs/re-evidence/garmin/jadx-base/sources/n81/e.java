package n81;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ln81/e;", "", "Lyz1/d;", "status", "", "todayScore", "", "indicatorValue", "trendingTypeKey", "", "last4WeeksValidData", "<init>", "(Lyz1/d;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f124940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f124941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f124942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f124943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f124944e;

    public e(yz1.d dVar, Integer num, Float f14, Integer num2, Boolean bool) {
        dVar.getClass();
        this.f124940a = dVar;
        this.f124941b = num;
        this.f124942c = f14;
        this.f124943d = num2;
        this.f124944e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f124940a.equals(eVar.f124940a) && s.g(this.f124941b, eVar.f124941b) && s.g(this.f124942c, eVar.f124942c) && s.g(this.f124943d, eVar.f124943d) && s.g(this.f124944e, eVar.f124944e);
    }

    public final int hashCode() {
        int iHashCode = this.f124940a.hashCode() * 31;
        Integer num = this.f124941b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f14 = this.f124942c;
        int iHashCode3 = (iHashCode2 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Integer num2 = this.f124943d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f124944e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HillScoreCardData(status=");
        sb3.append(this.f124940a);
        sb3.append(", todayScore=");
        sb3.append(this.f124941b);
        sb3.append(", indicatorValue=");
        sb3.append(this.f124942c);
        sb3.append(", trendingTypeKey=");
        sb3.append(this.f124943d);
        sb3.append(", last4WeeksValidData=");
        return p6.b.f(sb3, this.f124944e, ")");
    }
}
