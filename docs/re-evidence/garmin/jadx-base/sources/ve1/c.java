package ve1;

import af1.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lve1/c;", "", "", "date", "", FirebaseAnalytics.Param.SCORE, "Laf1/e;", "classification", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Laf1/e;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f177674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f177675c;

    public c(String str, Integer num, e eVar) {
        this.f177673a = str;
        this.f177674b = num;
        this.f177675c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f177673a, cVar.f177673a) && s.g(this.f177674b, cVar.f177674b) && this.f177675c == cVar.f177675c;
    }

    public final int hashCode() {
        String str = this.f177673a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f177674b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        e eVar = this.f177675c;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = u0.n("RunningEconomyMetrics(date=", this.f177674b, this.f177673a, ", score=", ", classification=");
        sbN.append(this.f177675c);
        sbN.append(")");
        return sbN.toString();
    }
}
