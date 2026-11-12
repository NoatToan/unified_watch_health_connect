package a71;

import ds.e0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"La71/d;", "", "", "trainingLoad", "chronicTrainingLoad", "trainingLoadRatio", "loadTunnelMin", "loadTunnelMax", "Lorg/joda/time/DateTime;", "dateTime", "", "formattedDate", "formattedTrainingLoad", "formattedChronicTrainingLoad", "", "tsPaused", "acuteLoadStatus", "acuteLoadFeedbackPhrase", "isAcuteLoadDataAvailable", "formattedLoadQualifier", "<init>", "(DDDDDLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f1737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f1738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f1739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f1740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f1741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTime f1742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f1745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f1746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f1747k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f1748l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f1749m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f1750n;

    public /* synthetic */ d(double d14, double d15, double d16, double d17, double d18, DateTime dateTime, String str, String str2, String str3, boolean z14, String str4, String str5, boolean z15, String str6, int i14, p005kotlin.jvm.internal.j jVar) {
        this(d14, d15, d16, d17, d18, dateTime, str, str2, str3, (i14 & 512) != 0 ? false : z14, (i14 & 1024) != 0 ? "" : str4, (i14 & 2048) != 0 ? "" : str5, (i14 & 4096) != 0 ? false : z15, (i14 & 8192) != 0 ? "" : str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Double.compare(this.f1737a, dVar.f1737a) == 0 && Double.compare(this.f1738b, dVar.f1738b) == 0 && Double.compare(this.f1739c, dVar.f1739c) == 0 && Double.compare(this.f1740d, dVar.f1740d) == 0 && Double.compare(this.f1741e, dVar.f1741e) == 0 && s.g(this.f1742f, dVar.f1742f) && s.g(this.f1743g, dVar.f1743g) && s.g(this.f1744h, dVar.f1744h) && s.g(this.f1745i, dVar.f1745i) && this.f1746j == dVar.f1746j && s.g(this.f1747k, dVar.f1747k) && s.g(this.f1748l, dVar.f1748l) && this.f1749m == dVar.f1749m && s.g(this.f1750n, dVar.f1750n);
    }

    public final int hashCode() {
        return this.f1750n.hashCode() + q6.f.g(wr.g.j(wr.g.j(q6.f.g(wr.g.j(wr.g.j(wr.g.j(e0.a(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(Double.hashCode(this.f1737a) * 31, 31, this.f1738b), 31, this.f1739c), 31, this.f1740d), 31, this.f1741e), this.f1742f, 31), 31, this.f1743g), 31, this.f1744h), 31, this.f1745i), 31, this.f1746j), 31, this.f1747k), 31, this.f1748l), 31, this.f1749m);
    }

    public final String toString() {
        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("SevenDayLoadSummaryItem(trainingLoad=", this.f1737a, ", chronicTrainingLoad=");
        sbA.append(this.f1738b);
        am.j.x(sbA, ", trainingLoadRatio=", this.f1739c, ", loadTunnelMin=");
        sbA.append(this.f1740d);
        am.j.x(sbA, ", loadTunnelMax=", this.f1741e, ", dateTime=");
        sbA.append(this.f1742f);
        sbA.append(", formattedDate=");
        sbA.append(this.f1743g);
        sbA.append(", formattedTrainingLoad=");
        sn.a.t(sbA, this.f1744h, ", formattedChronicTrainingLoad=", this.f1745i, ", tsPaused=");
        fb1.c.w(", acuteLoadStatus=", this.f1747k, ", acuteLoadFeedbackPhrase=", sbA, this.f1746j);
        v.h.C(this.f1748l, ", isAcuteLoadDataAvailable=", ", formattedLoadQualifier=", sbA, this.f1749m);
        return am.j.o(this.f1750n, ")", sbA);
    }

    public d(double d14, double d15, double d16, double d17, double d18, DateTime dateTime, String str, String str2, String str3, boolean z14, String str4, String str5, boolean z15, String str6) {
        dateTime.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.f1737a = d14;
        this.f1738b = d15;
        this.f1739c = d16;
        this.f1740d = d17;
        this.f1741e = d18;
        this.f1742f = dateTime;
        this.f1743g = str;
        this.f1744h = str2;
        this.f1745i = str3;
        this.f1746j = z14;
        this.f1747k = str4;
        this.f1748l = str5;
        this.f1749m = z15;
        this.f1750n = str6;
    }
}
