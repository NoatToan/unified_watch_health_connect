package wo0;

import am.j;
import am.x0;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lwo0/a;", "", "", "activityId", "", "activityName", "", "duration", "startTimeLocal", "startTimeGmt", "Lam/x0;", "activityType", "primaryMetric", "primaryMetricContentDescription", "", "isPr", "<init>", "(JLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lam/x0;Ljava/lang/String;Ljava/lang/String;Z)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f186415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f186417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f186418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f186419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0 f186420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f186421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f186422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f186423i;

    public a(long j8, String str, double d14, String str2, String str3, x0 x0Var, String str4, String str5, boolean z14) {
        x0Var.getClass();
        this.f186415a = j8;
        this.f186416b = str;
        this.f186417c = d14;
        this.f186418d = str2;
        this.f186419e = str3;
        this.f186420f = x0Var;
        this.f186421g = str4;
        this.f186422h = str5;
        this.f186423i = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f186415a == aVar.f186415a && s.g(this.f186416b, aVar.f186416b) && Double.compare(this.f186417c, aVar.f186417c) == 0 && s.g(this.f186418d, aVar.f186418d) && s.g(this.f186419e, aVar.f186419e) && this.f186420f == aVar.f186420f && s.g(this.f186421g, aVar.f186421g) && s.g(this.f186422h, aVar.f186422h) && this.f186423i == aVar.f186423i;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f186415a) * 31;
        String str = this.f186416b;
        int iB = e.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f186417c);
        String str2 = this.f186418d;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f186419e;
        int iHashCode3 = (this.f186420f.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f186421g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f186422h;
        return Boolean.hashCode(this.f186423i) + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f186415a, "ActivityListItem(activityId=", ", activityName=", this.f186416b);
        j.x(sbK, ", duration=", this.f186417c, ", startTimeLocal=");
        sn.a.t(sbK, this.f186418d, ", startTimeGmt=", this.f186419e, ", activityType=");
        sbK.append(this.f186420f);
        sbK.append(", primaryMetric=");
        sbK.append(this.f186421g);
        sbK.append(", primaryMetricContentDescription=");
        return j.n(this.f186422h, ", isPr=", ")", sbK, this.f186423i);
    }
}
