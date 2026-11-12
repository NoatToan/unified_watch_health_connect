package dc1;

import b71.i;
import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ldc1/f;", "", "", "Ldc1/d;", "spO2HourlyAverages", "Ldc1/c;", "spO2DailyAverages", "", "averageSpO2", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Double;)V", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f59147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f59148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f59149c;

    public f(List<d> list, List<c> list2, Double d14) {
        this.f59147a = list;
        this.f59148b = list2;
        this.f59149c = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f59147a, fVar.f59147a) && s.g(this.f59148b, fVar.f59148b) && s.g(this.f59149c, fVar.f59149c);
    }

    public final int hashCode() {
        List<d> list = this.f59147a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<c> list2 = this.f59148b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Double d14 = this.f59149c;
        return iHashCode2 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        return i.g(f3.k("SummaryPulseOxDTO(spO2HourlyAverages=", ", spO2DailyAverages=", ", averageSpO2=", this.f59147a, this.f59148b), this.f59149c, ")");
    }
}
