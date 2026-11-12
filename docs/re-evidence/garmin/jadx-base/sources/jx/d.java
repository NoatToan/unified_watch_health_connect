package jx;

import org.joda.time.Interval;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljx/d;", "", "Ljx/a;", "bodyBatteryData", "Lgt/a;", "stressData", "Lorg/joda/time/Interval;", "interval", "<init>", "(Ljx/a;Lgt/a;Lorg/joda/time/Interval;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f101394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gt.a f101395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interval f101396c;

    public d(a aVar, gt.a aVar2, Interval interval) {
        this.f101394a = aVar;
        this.f101395b = aVar2;
        this.f101396c = interval;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f101394a, dVar.f101394a) && s.g(this.f101395b, dVar.f101395b) && s.g(this.f101396c, dVar.f101396c);
    }

    public final int hashCode() {
        a aVar = this.f101394a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        gt.a aVar2 = this.f101395b;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Interval interval = this.f101396c;
        return iHashCode2 + (interval != null ? interval.hashCode() : 0);
    }

    public final String toString() {
        return "BodyBatteryDetailsChartData(bodyBatteryData=" + this.f101394a + ", stressData=" + this.f101395b + ", interval=" + this.f101396c + ")";
    }

    public /* synthetic */ d(a aVar, gt.a aVar2, Interval interval, int i14, j jVar) {
        this(aVar, aVar2, (i14 & 4) != 0 ? null : interval);
    }
}
