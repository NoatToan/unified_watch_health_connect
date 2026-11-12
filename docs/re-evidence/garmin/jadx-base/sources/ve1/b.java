package ve1;

import am.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lve1/b;", "", "", "calendarDate", "", FirebaseAnalytics.Param.SCORE, "classification", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f177671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f177672c;

    public b(String str, Integer num, String str2) {
        this.f177670a = str;
        this.f177671b = num;
        this.f177672c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f177670a, bVar.f177670a) && s.g(this.f177671b, bVar.f177671b) && s.g(this.f177672c, bVar.f177672c);
    }

    public final int hashCode() {
        String str = this.f177670a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f177671b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f177672c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return j.o(this.f177672c, ")", u0.n("RunningEconomyDailyMetrics(calendarDate=", this.f177671b, this.f177670a, ", score=", ", classification="));
    }
}
