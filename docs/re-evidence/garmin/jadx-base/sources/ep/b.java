package ep;

import ds.e0;
import m92.h0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lep/b;", "", "Lm92/h0$e$a;", "chartPoint", "Lorg/joda/time/DateTime;", "calendarDate", "", "duration", "", "activityId", "", "activityDate", "<init>", "(Lm92/h0$e$a;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.e.a f64801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f64802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f64803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f64804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f64805e;

    public b(h0.e.a aVar, DateTime dateTime, Integer num, Long l14, String str) {
        aVar.getClass();
        dateTime.getClass();
        this.f64801a = aVar;
        this.f64802b = dateTime;
        this.f64803c = num;
        this.f64804d = l14;
        this.f64805e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f64801a.equals(bVar.f64801a) && this.f64802b.equals(bVar.f64802b) && s.g(this.f64803c, bVar.f64803c) && s.g(this.f64804d, bVar.f64804d) && s.g(this.f64805e, bVar.f64805e);
    }

    public final int hashCode() {
        int iA = e0.a(this.f64801a.hashCode() * 31, this.f64802b, 31);
        Integer num = this.f64803c;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Long l14 = this.f64804d;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.f64805e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PeakPowerCurvePoint(chartPoint=");
        sb3.append(this.f64801a);
        sb3.append(", calendarDate=");
        sb3.append(this.f64802b);
        sb3.append(", duration=");
        sb3.append(this.f64803c);
        sb3.append(", activityId=");
        sb3.append(this.f64804d);
        sb3.append(", activityDate=");
        return am.j.o(this.f64805e, ")", sb3);
    }
}
