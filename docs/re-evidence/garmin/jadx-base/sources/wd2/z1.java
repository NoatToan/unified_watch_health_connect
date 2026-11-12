package wd2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwd2/z1;", "", "", "deviceUnitId", "", "name", "Lorg/joda/time/DateTime;", TtmlNode.START, "", "isInitiatedByDevice", "publisherId", "", "Lwd2/h2;", "sessionList", "", "Lwd2/f2;", "", "Lwd2/d2;", "sharingErrors", "<init>", "(JLjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f184693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f184695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f184696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f184697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<h2> f184698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<f2, List<d2>> f184699g;

    public z1(long j8, String str, DateTime dateTime, Boolean bool, String str2, Set set, Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : dateTime, (i14 & 8) != 0 ? Boolean.FALSE : bool, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? p13.l0.f134950a : set, (i14 & 64) != 0 ? null : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.f184693a == z1Var.f184693a && p005kotlin.jvm.internal.s.g(this.f184694b, z1Var.f184694b) && p005kotlin.jvm.internal.s.g(this.f184695c, z1Var.f184695c) && p005kotlin.jvm.internal.s.g(this.f184696d, z1Var.f184696d) && p005kotlin.jvm.internal.s.g(this.f184697e, z1Var.f184697e) && p005kotlin.jvm.internal.s.g(this.f184698f, z1Var.f184698f) && p005kotlin.jvm.internal.s.g(this.f184699g, z1Var.f184699g);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f184693a) * 31;
        String str = this.f184694b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DateTime dateTime = this.f184695c;
        int iHashCode3 = (iHashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Boolean bool = this.f184696d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f184697e;
        int iHashCode5 = (this.f184698f.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Map<f2, List<d2>> map = this.f184699g;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f184693a, "Session(deviceUnitId=", ", name=", this.f184694b);
        sbK.append(", start=");
        sbK.append(this.f184695c);
        sbK.append(", isInitiatedByDevice=");
        sbK.append(this.f184696d);
        sbK.append(", publisherId=");
        sbK.append(this.f184697e);
        sbK.append(", sessionList=");
        sbK.append(this.f184698f);
        sbK.append(", sharingErrors=");
        sbK.append(this.f184699g);
        sbK.append(")");
        return sbK.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z1(long j8, String str, DateTime dateTime, Boolean bool, String str2, Set<h2> set, Map<f2, ? extends List<d2>> map) {
        set.getClass();
        this.f184693a = j8;
        this.f184694b = str;
        this.f184695c = dateTime;
        this.f184696d = bool;
        this.f184697e = str2;
        this.f184698f = set;
        this.f184699g = map;
    }
}
