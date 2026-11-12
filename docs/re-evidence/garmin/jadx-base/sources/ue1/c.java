package ue1;

import am.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lue1/c;", "", "", "calendarDate", "", FirebaseAnalytics.Param.SCORE, "classification", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f170235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170236c;

    public c(String str, Integer num, String str2) {
        this.f170234a = str;
        this.f170235b = num;
        this.f170236c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f170234a, cVar.f170234a) && s.g(this.f170235b, cVar.f170235b) && s.g(this.f170236c, cVar.f170236c);
    }

    public final int hashCode() {
        String str = this.f170234a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f170235b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f170236c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return j.o(this.f170236c, ")", u0.n("RunningEconomy(calendarDate=", this.f170235b, this.f170234a, ", score=", ", classification="));
    }
}
