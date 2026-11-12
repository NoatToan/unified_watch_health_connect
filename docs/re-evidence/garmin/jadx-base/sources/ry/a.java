package ry;

import b71.i;
import i53.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;
import yz1.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lry/a;", "", "Lyz1/d;", "status", "", "totalKilocalories", "todayActiveCalories", "todayRestingCalories", "Li53/c;", "last7DaysCaloriesBurned", "<init>", "(Lyz1/d;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Li53/c;)V", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f155056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f155057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f155058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f155059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c<Double> f155060e;

    public a(d dVar, Double d14, Double d15, Double d16, c<Double> cVar) {
        dVar.getClass();
        cVar.getClass();
        this.f155056a = dVar;
        this.f155057b = d14;
        this.f155058c = d15;
        this.f155059d = d16;
        this.f155060e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f155056a.equals(aVar.f155056a) && s.g(this.f155057b, aVar.f155057b) && s.g(this.f155058c, aVar.f155058c) && s.g(this.f155059d, aVar.f155059d) && this.f155060e.equals(aVar.f155060e);
    }

    public final int hashCode() {
        int iHashCode = this.f155056a.hashCode() * 31;
        Double d14 = this.f155057b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f155058c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f155059d;
        return this.f155060e.hashCode() + ((iHashCode3 + (d16 != null ? d16.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CaloriesBurnedData(status=");
        sb3.append(this.f155056a);
        sb3.append(", totalKilocalories=");
        sb3.append(this.f155057b);
        sb3.append(", todayActiveCalories=");
        i.p(this.f155058c, this.f155059d, ", todayRestingCalories=", ", last7DaysCaloriesBurned=", sb3);
        return l2.e(sb3, this.f155060e, ")");
    }
}
