package pe0;

import com.garmin.android.apps.connectmobile.f3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpe0/i;", "", "", "totalDistance", "totalTime", "", "totalActivityCount", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f137448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f137449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f137450c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(Double d14, Double d15, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        Double dValueOf = Double.valueOf(0.0d);
        this((i14 & 1) != 0 ? dValueOf : d14, (i14 & 2) != 0 ? dValueOf : d15, (i14 & 4) != 0 ? 0 : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f137448a, iVar.f137448a) && s.g(this.f137449b, iVar.f137449b) && s.g(this.f137450c, iVar.f137450c);
    }

    public final int hashCode() {
        Double d14 = this.f137448a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f137449b;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num = this.f137450c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return f3.i(k.i("DogSummaryStats(totalDistance=", this.f137448a, this.f137449b, ", totalTime=", ", totalActivityCount="), this.f137450c, ")");
    }

    public i(Double d14, Double d15, Integer num) {
        this.f137448a = d14;
        this.f137449b = d15;
        this.f137450c = num;
    }

    public i() {
        this(null, null, null, 7, null);
    }
}
