package qm1;

import b63.u;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqm1/m;", "", "Lyz1/d;", "status", "", "nextSleepNeedMinutes", "", "nextSleepNeedFeedbackKey", "", "nextSleepNeedDisplayForDay", "noOfNaps", "Lb63/u;", "localRecommendedBedStartDateTime", "localRecommendedBedEndDateTime", "<init>", "(Lyz1/d;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lb63/u;Lb63/u;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f145629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f145630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f145632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f145633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f145634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f145635g;

    public m(yz1.d dVar, Integer num, String str, Boolean bool, Integer num2, u uVar, u uVar2) {
        dVar.getClass();
        this.f145629a = dVar;
        this.f145630b = num;
        this.f145631c = str;
        this.f145632d = bool;
        this.f145633e = num2;
        this.f145634f = uVar;
        this.f145635g = uVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f145629a.equals(mVar.f145629a) && s.g(this.f145630b, mVar.f145630b) && s.g(this.f145631c, mVar.f145631c) && s.g(this.f145632d, mVar.f145632d) && s.g(this.f145633e, mVar.f145633e) && s.g(this.f145634f, mVar.f145634f) && s.g(this.f145635g, mVar.f145635g);
    }

    public final int hashCode() {
        int iHashCode = this.f145629a.hashCode() * 31;
        Integer num = this.f145630b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f145631c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f145632d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.f145633e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        u uVar = this.f145634f;
        int iHashCode6 = (iHashCode5 + (uVar == null ? 0 : uVar.f16216a.hashCode())) * 31;
        u uVar2 = this.f145635g;
        return iHashCode6 + (uVar2 != null ? uVar2.f16216a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SleepCoachCardData(status=");
        sb3.append(this.f145629a);
        sb3.append(", nextSleepNeedMinutes=");
        sb3.append(this.f145630b);
        sb3.append(", nextSleepNeedFeedbackKey=");
        b71.i.w(sb3, this.f145631c, ", nextSleepNeedDisplayForDay=", this.f145632d, ", noOfNaps=");
        sb3.append(this.f145633e);
        sb3.append(", localRecommendedBedStartDateTime=");
        sb3.append(this.f145634f);
        sb3.append(", localRecommendedBedEndDateTime=");
        sb3.append(this.f145635g);
        sb3.append(")");
        return sb3.toString();
    }
}
