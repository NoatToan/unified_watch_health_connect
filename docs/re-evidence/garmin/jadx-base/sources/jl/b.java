package jl;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;
import v.h;
import yz1.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ljl/b;", "", "Lyz1/d;", "status", "", "heatAcclimationPercentage", "Lx61/a;", "heatAcclimationTrend", "previousHeatAcclimationPercentage", "", "lastUpdated", "", "isUsingMetric", "Lorg/joda/time/LocalDate;", "calendarLocalDate", "<init>", "(Lyz1/d;Ljava/lang/Integer;Lx61/a;Ljava/lang/Integer;Ljava/lang/String;ZLorg/joda/time/LocalDate;)V", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f99446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f99447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x61.a f99448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f99449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f99450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f99451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f99452g;

    public b(d dVar, Integer num, x61.a aVar, Integer num2, String str, boolean z14, LocalDate localDate) {
        dVar.getClass();
        this.f99446a = dVar;
        this.f99447b = num;
        this.f99448c = aVar;
        this.f99449d = num2;
        this.f99450e = str;
        this.f99451f = z14;
        this.f99452g = localDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f99446a.equals(bVar.f99446a) && s.g(this.f99447b, bVar.f99447b) && s.g(this.f99448c, bVar.f99448c) && s.g(this.f99449d, bVar.f99449d) && s.g(this.f99450e, bVar.f99450e) && this.f99451f == bVar.f99451f && s.g(this.f99452g, bVar.f99452g);
    }

    public final int hashCode() {
        int iHashCode = this.f99446a.hashCode() * 31;
        Integer num = this.f99447b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        x61.a aVar = this.f99448c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num2 = this.f99449d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f99450e;
        int iG = f.g((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f99451f);
        LocalDate localDate = this.f99452g;
        return iG + (localDate != null ? localDate.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HeatAcclimationCardData(status=");
        sb3.append(this.f99446a);
        sb3.append(", heatAcclimationPercentage=");
        sb3.append(this.f99447b);
        sb3.append(", heatAcclimationTrend=");
        sb3.append(this.f99448c);
        sb3.append(", previousHeatAcclimationPercentage=");
        sb3.append(this.f99449d);
        sb3.append(", lastUpdated=");
        h.C(this.f99450e, ", isUsingMetric=", ", calendarLocalDate=", sb3, this.f99451f);
        sb3.append(this.f99452g);
        sb3.append(")");
        return sb3.toString();
    }
}
