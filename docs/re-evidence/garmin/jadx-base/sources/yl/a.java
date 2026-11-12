package yl;

import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyl/a;", "", "", "timestamp", "", "formattedDate", "formattedSpo2", "formattedAverageElevation", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f197624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f197625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f197626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f197627d;

    public a(long j8, String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f197624a = j8;
        this.f197625b = str;
        this.f197626c = str2;
        this.f197627d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f197624a == aVar.f197624a && this.f197625b.equals(aVar.f197625b) && this.f197626c.equals(aVar.f197626c) && this.f197627d.equals(aVar.f197627d);
    }

    public final int hashCode() {
        return this.f197627d.hashCode() + g.j(g.j(Long.hashCode(this.f197624a) * 31, 31, this.f197625b), 31, this.f197626c);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f197624a, "PulseOxAcclimationDailyReadingState(timestamp=", ", formattedDate=", this.f197625b);
        sn.a.t(sbK, ", formattedSpo2=", this.f197626c, ", formattedAverageElevation=", this.f197627d);
        sbK.append(")");
        return sbK.toString();
    }
}
