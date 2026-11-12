package rm1;

import ds.e0;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lrm1/l;", "", "", "version", "userProfilePk", "", "calendarDate", "deviceId", "timestampGmt", "", "baseline", "actual", "feedback", "trainingFeedback", "sleepHistoryAdjustment", "hrvAdjustment", "napAdjustment", "", "preferredActivityTracker", "<init>", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f153613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f153614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f153616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f153617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f153618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f153619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f153620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f153621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f153622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f153623k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f153624l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f153625m;

    public l(long j8, long j14, String str, long j15, String str2, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        this.f153613a = j8;
        this.f153614b = j14;
        this.f153615c = str;
        this.f153616d = j15;
        this.f153617e = str2;
        this.f153618f = num;
        this.f153619g = num2;
        this.f153620h = str3;
        this.f153621i = str4;
        this.f153622j = str5;
        this.f153623k = str6;
        this.f153624l = str7;
        this.f153625m = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f153613a == lVar.f153613a && this.f153614b == lVar.f153614b && s.g(this.f153615c, lVar.f153615c) && this.f153616d == lVar.f153616d && s.g(this.f153617e, lVar.f153617e) && s.g(this.f153618f, lVar.f153618f) && s.g(this.f153619g, lVar.f153619g) && s.g(this.f153620h, lVar.f153620h) && s.g(this.f153621i, lVar.f153621i) && s.g(this.f153622j, lVar.f153622j) && s.g(this.f153623k, lVar.f153623k) && s.g(this.f153624l, lVar.f153624l) && s.g(this.f153625m, lVar.f153625m);
    }

    public final int hashCode() {
        int iE = q6.f.e(Long.hashCode(this.f153613a) * 31, 31, this.f153614b);
        String str = this.f153615c;
        int iE2 = q6.f.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.f153616d);
        String str2 = this.f153617e;
        int iHashCode = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f153618f;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f153619g;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f153620h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f153621i;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f153622j;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f153623k;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f153624l;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.f153625m;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = e0.k(this.f153613a, "SleepNeed(version=", ", userProfilePk=");
        p6.b.k(this.f153614b, ", calendarDate=", this.f153615c, sbK);
        x.j(this.f153616d, ", deviceId=", ", timestampGmt=", sbK);
        fb1.c.u(this.f153618f, this.f153617e, ", baseline=", ", actual=", sbK);
        p6.b.l(this.f153619g, ", feedback=", this.f153620h, ", trainingFeedback=", sbK);
        sn.a.t(sbK, this.f153621i, ", sleepHistoryAdjustment=", this.f153622j, ", hrvAdjustment=");
        sn.a.t(sbK, this.f153623k, ", napAdjustment=", this.f153624l, ", preferredActivityTracker=");
        return p6.b.f(sbK, this.f153625m, ")");
    }
}
