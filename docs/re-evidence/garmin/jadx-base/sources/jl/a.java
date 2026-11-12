package jl;

import gg1.o0;
import j20.x;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yz1.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ljl/a;", "", "Lyz1/d;", "status", "", "altitudeAcclimation", "currentAltitudeAcclimation", "altitudeAcclimationPercentage", "Lx61/a;", "acclimationTrend", "Lgg1/o0;", "preferredMeasurementSystem", "", "lastUpdated", "Lorg/joda/time/LocalDate;", "calendarLocalDate", "<init>", "(Lyz1/d;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lx61/a;Lgg1/o0;Ljava/lang/String;Lorg/joda/time/LocalDate;)V", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f99438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f99439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f99440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f99441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x61.a f99442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f99443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f99444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f99445h;

    public a(d dVar, Integer num, Integer num2, Integer num3, x61.a aVar, o0 o0Var, String str, LocalDate localDate) {
        dVar.getClass();
        o0Var.getClass();
        this.f99438a = dVar;
        this.f99439b = num;
        this.f99440c = num2;
        this.f99441d = num3;
        this.f99442e = aVar;
        this.f99443f = o0Var;
        this.f99444g = str;
        this.f99445h = localDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f99438a.equals(aVar.f99438a) && s.g(this.f99439b, aVar.f99439b) && s.g(this.f99440c, aVar.f99440c) && s.g(this.f99441d, aVar.f99441d) && s.g(this.f99442e, aVar.f99442e) && this.f99443f == aVar.f99443f && s.g(this.f99444g, aVar.f99444g) && s.g(this.f99445h, aVar.f99445h);
    }

    public final int hashCode() {
        int iHashCode = this.f99438a.hashCode() * 31;
        Integer num = this.f99439b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f99440c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f99441d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        x61.a aVar = this.f99442e;
        int iHashCode5 = (this.f99443f.hashCode() + ((iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
        String str = this.f99444g;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.f99445h;
        return iHashCode6 + (localDate != null ? localDate.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AltitudeAcclimationCardData(status=");
        sb3.append(this.f99438a);
        sb3.append(", altitudeAcclimation=");
        sb3.append(this.f99439b);
        sb3.append(", currentAltitudeAcclimation=");
        x.m(sb3, this.f99440c, ", altitudeAcclimationPercentage=", this.f99441d, ", acclimationTrend=");
        sb3.append(this.f99442e);
        sb3.append(", preferredMeasurementSystem=");
        sb3.append(this.f99443f);
        sb3.append(", lastUpdated=");
        sb3.append(this.f99444g);
        sb3.append(", calendarLocalDate=");
        sb3.append(this.f99445h);
        sb3.append(")");
        return sb3.toString();
    }
}
