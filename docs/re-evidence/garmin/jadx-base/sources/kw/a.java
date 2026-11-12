package kw;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkw/a;", "", "Lyz1/d;", "status", "", "category", "", "levelColor", "", "systolic", "diastolic", "", "lastUpdatedTimestamp", "Li53/c;", "Lkw/c;", "bloodPressureChartPoint", "<init>", "(Lyz1/d;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Li53/c;)V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f106817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f106819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f106820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f106821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f106822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.c<c> f106823g;

    public a(yz1.d dVar, String str, Integer num, Double d14, Double d15, Long l14, i53.c<c> cVar) {
        dVar.getClass();
        this.f106817a = dVar;
        this.f106818b = str;
        this.f106819c = num;
        this.f106820d = d14;
        this.f106821e = d15;
        this.f106822f = l14;
        this.f106823g = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f106817a.equals(aVar.f106817a) && p005kotlin.jvm.internal.s.g(this.f106818b, aVar.f106818b) && p005kotlin.jvm.internal.s.g(this.f106819c, aVar.f106819c) && p005kotlin.jvm.internal.s.g(this.f106820d, aVar.f106820d) && p005kotlin.jvm.internal.s.g(this.f106821e, aVar.f106821e) && p005kotlin.jvm.internal.s.g(this.f106822f, aVar.f106822f) && p005kotlin.jvm.internal.s.g(this.f106823g, aVar.f106823g);
    }

    public final int hashCode() {
        int iHashCode = this.f106817a.hashCode() * 31;
        String str = this.f106818b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f106819c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.f106820d;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f106821e;
        int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Long l14 = this.f106822f;
        int iHashCode6 = (iHashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
        i53.c<c> cVar = this.f106823g;
        return iHashCode6 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BloodPressureCardData(status=");
        sb3.append(this.f106817a);
        sb3.append(", category=");
        sb3.append(this.f106818b);
        sb3.append(", levelColor=");
        b71.i.v(sb3, this.f106819c, ", systolic=", this.f106820d, ", diastolic=");
        sb3.append(this.f106821e);
        sb3.append(", lastUpdatedTimestamp=");
        sb3.append(this.f106822f);
        sb3.append(", bloodPressureChartPoint=");
        return l2.e(sb3, this.f106823g, ")");
    }
}
