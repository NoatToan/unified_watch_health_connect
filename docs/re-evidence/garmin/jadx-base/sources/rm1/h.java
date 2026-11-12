package rm1;

import j20.x;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lrm1/h;", "", "", "calendarDate", "Lorg/joda/time/LocalDate;", "calendarLocalDate", "", "sleepStartTimestampGMT", "sleepStartTimestampLocal", "sleepEndTimestampGMT", "sleepEndTimestampLocal", "", "unmeasurableSleepSeconds", "", "lowestRespirationValue", "highestRespirationValue", "lowestHeartRateValue", "highestHeartRateValue", "", "isManualSleep", "isUnmeasurableSleep", "averageRespirationValue", "Lrm1/l;", "sleepNeed", "nextSleepNeed", "<init>", "(Ljava/lang/String;Lorg/joda/time/LocalDate;JJJJILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZZLjava/lang/Double;Lrm1/l;Lrm1/l;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f153567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f153568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f153569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f153570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f153571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f153572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f153573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Double f153574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f153575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Double f153576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f153577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f153578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Double f153579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f153580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f153581p;

    public h(String str, LocalDate localDate, long j8, long j14, long j15, long j16, int i14, Double d14, Double d15, Double d16, Double d17, boolean z14, boolean z15, Double d18, l lVar, l lVar2) {
        this.f153566a = str;
        this.f153567b = localDate;
        this.f153568c = j8;
        this.f153569d = j14;
        this.f153570e = j15;
        this.f153571f = j16;
        this.f153572g = i14;
        this.f153573h = d14;
        this.f153574i = d15;
        this.f153575j = d16;
        this.f153576k = d17;
        this.f153577l = z14;
        this.f153578m = z15;
        this.f153579n = d18;
        this.f153580o = lVar;
        this.f153581p = lVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f153566a, hVar.f153566a) && s.g(this.f153567b, hVar.f153567b) && this.f153568c == hVar.f153568c && this.f153569d == hVar.f153569d && this.f153570e == hVar.f153570e && this.f153571f == hVar.f153571f && this.f153572g == hVar.f153572g && s.g(this.f153573h, hVar.f153573h) && s.g(this.f153574i, hVar.f153574i) && s.g(this.f153575j, hVar.f153575j) && s.g(this.f153576k, hVar.f153576k) && this.f153577l == hVar.f153577l && this.f153578m == hVar.f153578m && s.g(this.f153579n, hVar.f153579n) && s.g(this.f153580o, hVar.f153580o) && s.g(this.f153581p, hVar.f153581p);
    }

    public final int hashCode() {
        String str = this.f153566a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocalDate localDate = this.f153567b;
        int iD = q2.d(this.f153572g, q6.f.e(q6.f.e(q6.f.e(q6.f.e((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.f153568c), 31, this.f153569d), 31, this.f153570e), 31, this.f153571f), 31);
        Double d14 = this.f153573h;
        int iHashCode2 = (iD + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f153574i;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f153575j;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f153576k;
        int iG = q6.f.g(q6.f.g((iHashCode4 + (d17 == null ? 0 : d17.hashCode())) * 31, 31, this.f153577l), 31, this.f153578m);
        Double d18 = this.f153579n;
        int iHashCode5 = (iG + (d18 == null ? 0 : d18.hashCode())) * 31;
        l lVar = this.f153580o;
        int iHashCode6 = (iHashCode5 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        l lVar2 = this.f153581p;
        return iHashCode6 + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Sleep(calendarDate=");
        sb3.append(this.f153566a);
        sb3.append(", calendarLocalDate=");
        sb3.append(this.f153567b);
        sb3.append(", sleepStartTimestampGMT=");
        sb3.append(this.f153568c);
        x.j(this.f153569d, ", sleepStartTimestampLocal=", ", sleepEndTimestampGMT=", sb3);
        sb3.append(this.f153570e);
        x.j(this.f153571f, ", sleepEndTimestampLocal=", ", unmeasurableSleepSeconds=", sb3);
        sb3.append(this.f153572g);
        sb3.append(", lowestRespirationValue=");
        sb3.append(this.f153573h);
        sb3.append(", highestRespirationValue=");
        b71.i.p(this.f153574i, this.f153575j, ", lowestHeartRateValue=", ", highestHeartRateValue=", sb3);
        sb3.append(this.f153576k);
        sb3.append(", isManualSleep=");
        sb3.append(this.f153577l);
        sb3.append(", isUnmeasurableSleep=");
        sb3.append(this.f153578m);
        sb3.append(", averageRespirationValue=");
        sb3.append(this.f153579n);
        sb3.append(", sleepNeed=");
        sb3.append(this.f153580o);
        sb3.append(", nextSleepNeed=");
        sb3.append(this.f153581p);
        sb3.append(")");
        return sb3.toString();
    }
}
