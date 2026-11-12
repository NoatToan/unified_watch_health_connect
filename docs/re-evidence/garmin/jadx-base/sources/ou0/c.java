package ou0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lou0/c;", "", "", "unitId", "", "productNumber", "deviceImageUrl", "deviceName", "", "isConnected", "isAutoStartCapable", "isCourseSharingCapable", "isSpectatorMessagingCapable", "hasLteSubscription", "isLteCapable", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZZ)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f133964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f133965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f133966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f133967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f133968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f133969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f133970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f133971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f133972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f133973j;

    public /* synthetic */ c(long j8, String str, String str2, String str3, Boolean bool, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i14, j jVar) {
        this(j8, str, str2, str3, bool, (i14 & 32) != 0 ? false : z14, (i14 & 64) != 0 ? false : z15, (i14 & 128) != 0 ? false : z16, (i14 & 256) != 0 ? false : z17, (i14 & 512) != 0 ? false : z18);
    }

    public static c a(c cVar, Boolean bool, boolean z14, boolean z15, boolean z16, boolean z17, int i14) {
        long j8 = cVar.f133964a;
        String str = cVar.f133965b;
        String str2 = cVar.f133966c;
        String str3 = cVar.f133967d;
        Boolean bool2 = (i14 & 16) != 0 ? cVar.f133968e : bool;
        boolean z18 = (i14 & 32) != 0 ? cVar.f133969f : z14;
        boolean z19 = (i14 & 64) != 0 ? cVar.f133970g : z15;
        boolean z24 = (i14 & 128) != 0 ? cVar.f133971h : z16;
        boolean z25 = (i14 & 256) != 0 ? cVar.f133972i : true;
        boolean z26 = (i14 & 512) != 0 ? cVar.f133973j : z17;
        cVar.getClass();
        str.getClass();
        str3.getClass();
        return new c(j8, str, str2, str3, bool2, z18, z19, z24, z25, z26);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f133964a == cVar.f133964a && s.g(this.f133965b, cVar.f133965b) && s.g(this.f133966c, cVar.f133966c) && s.g(this.f133967d, cVar.f133967d) && s.g(this.f133968e, cVar.f133968e) && this.f133969f == cVar.f133969f && this.f133970g == cVar.f133970g && this.f133971h == cVar.f133971h && this.f133972i == cVar.f133972i && this.f133973j == cVar.f133973j;
    }

    public final int hashCode() {
        int iJ = g.j(Long.hashCode(this.f133964a) * 31, 31, this.f133965b);
        String str = this.f133966c;
        int iJ2 = g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f133967d);
        Boolean bool = this.f133968e;
        return Boolean.hashCode(this.f133973j) + q6.f.g(q6.f.g(q6.f.g(q6.f.g((iJ2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.f133969f), 31, this.f133970g), 31, this.f133971h), 31, this.f133972i);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f133964a, "LiveTrackDeviceInfo(unitId=", ", productNumber=", this.f133965b);
        sn.a.t(sbK, ", deviceImageUrl=", this.f133966c, ", deviceName=", this.f133967d);
        sbK.append(", isConnected=");
        sbK.append(this.f133968e);
        sbK.append(", isAutoStartCapable=");
        sbK.append(this.f133969f);
        com.airbnb.lottie.animation.keyframe.a.v(", isCourseSharingCapable=", ", isSpectatorMessagingCapable=", sbK, this.f133970g, this.f133971h);
        com.airbnb.lottie.animation.keyframe.a.v(", hasLteSubscription=", ", isLteCapable=", sbK, this.f133972i, this.f133973j);
        sbK.append(")");
        return sbK.toString();
    }

    public c(long j8, String str, String str2, String str3, Boolean bool, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        str.getClass();
        str3.getClass();
        this.f133964a = j8;
        this.f133965b = str;
        this.f133966c = str2;
        this.f133967d = str3;
        this.f133968e = bool;
        this.f133969f = z14;
        this.f133970g = z15;
        this.f133971h = z16;
        this.f133972i = z17;
        this.f133973j = z18;
    }
}
