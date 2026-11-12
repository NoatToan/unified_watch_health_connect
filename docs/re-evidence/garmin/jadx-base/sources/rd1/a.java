package rd1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lrd1/a;", "", "Lqd1/a;", "morning", "evening", "Lpd1/a;", "reminderType", "", "userProfileId", "<init>", "(Lqd1/a;Lqd1/a;Lpd1/a;Ljava/lang/Integer;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd1.a f152032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd1.a f152033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pd1.a f152034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f152035d;

    public a(qd1.a aVar, qd1.a aVar2, pd1.a aVar3, Integer num) {
        aVar.getClass();
        aVar2.getClass();
        this.f152032a = aVar;
        this.f152033b = aVar2;
        this.f152034c = aVar3;
        this.f152035d = num;
    }

    public static a a(a aVar, qd1.a aVar2, qd1.a aVar3, int i14) {
        if ((i14 & 1) != 0) {
            aVar2 = aVar.f152032a;
        }
        if ((i14 & 2) != 0) {
            aVar3 = aVar.f152033b;
        }
        pd1.a aVar4 = aVar.f152034c;
        Integer num = aVar.f152035d;
        aVar.getClass();
        return new a(aVar2, aVar3, aVar4, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f152032a.equals(aVar.f152032a) && this.f152033b.equals(aVar.f152033b) && this.f152034c == aVar.f152034c && s.g(this.f152035d, aVar.f152035d);
    }

    public final int hashCode() {
        int iHashCode = (this.f152033b.hashCode() + (this.f152032a.hashCode() * 31)) * 31;
        pd1.a aVar = this.f152034c;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num = this.f152035d;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "DayPhaseReminders(morning=" + this.f152032a + ", evening=" + this.f152033b + ", reminderType=" + this.f152034c + ", userProfileId=" + this.f152035d + ")";
    }
}
