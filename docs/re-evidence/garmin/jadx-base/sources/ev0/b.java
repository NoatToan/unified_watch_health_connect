package ev0;

import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import wd2.z1;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lev0/b;", "", "", "unitId", "", "deviceImage", "deviceName", "", "isConnected", "isDeviceDriven", "isCourseEnabled", "isAutoStartEnabled", "spectatorAudio", "spectatorText", "isSpectatorMessagingCapable", "Lwd2/z1;", "activeSession", "showShareSessionTooltip", "<init>", "(JLjava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lwd2/z1;Z)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f66140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f66143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f66144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f66145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f66146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f66147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f66148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f66149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z1 f66150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f66151l;

    public /* synthetic */ b(long j8, String str, String str2, boolean z14, boolean z15, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, z1 z1Var, boolean z16, int i14, j jVar) {
        this(j8, str, str2, z14, z15, bool, bool2, bool3, bool4, (i14 & 512) != 0 ? null : bool5, (i14 & 1024) != 0 ? null : z1Var, (i14 & 2048) != 0 ? false : z16);
    }

    public final boolean a() {
        return this.f66150k != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f66140a == bVar.f66140a && s.g(this.f66141b, bVar.f66141b) && s.g(this.f66142c, bVar.f66142c) && this.f66143d == bVar.f66143d && this.f66144e == bVar.f66144e && s.g(this.f66145f, bVar.f66145f) && s.g(this.f66146g, bVar.f66146g) && s.g(this.f66147h, bVar.f66147h) && s.g(this.f66148i, bVar.f66148i) && s.g(this.f66149j, bVar.f66149j) && s.g(this.f66150k, bVar.f66150k) && this.f66151l == bVar.f66151l;
    }

    public final int hashCode() {
        int iG = f.g(f.g(g.j(g.j(Long.hashCode(this.f66140a) * 31, 31, this.f66141b), 31, this.f66142c), 31, this.f66143d), 31, this.f66144e);
        Boolean bool = this.f66145f;
        int iHashCode = (iG + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f66146g;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f66147h;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f66148i;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f66149j;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        z1 z1Var = this.f66150k;
        return Boolean.hashCode(this.f66151l) + ((iHashCode5 + (z1Var != null ? z1Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f66140a, "LiveTrackDeviceUiModel(unitId=", ", deviceImage=", this.f66141b);
        com.airbnb.lottie.animation.keyframe.a.t(", deviceName=", this.f66142c, ", isConnected=", sbK, this.f66143d);
        sbK.append(", isDeviceDriven=");
        sbK.append(this.f66144e);
        sbK.append(", isCourseEnabled=");
        sbK.append(this.f66145f);
        e0.r(this.f66146g, this.f66147h, ", isAutoStartEnabled=", ", spectatorAudio=", sbK);
        e0.r(this.f66148i, this.f66149j, ", spectatorText=", ", isSpectatorMessagingCapable=", sbK);
        sbK.append(", activeSession=");
        sbK.append(this.f66150k);
        sbK.append(", showShareSessionTooltip=");
        sbK.append(this.f66151l);
        sbK.append(")");
        return sbK.toString();
    }

    public b(long j8, String str, String str2, boolean z14, boolean z15, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, z1 z1Var, boolean z16) {
        str.getClass();
        str2.getClass();
        this.f66140a = j8;
        this.f66141b = str;
        this.f66142c = str2;
        this.f66143d = z14;
        this.f66144e = z15;
        this.f66145f = bool;
        this.f66146g = bool2;
        this.f66147h = bool3;
        this.f66148i = bool4;
        this.f66149j = bool5;
        this.f66150k = z1Var;
        this.f66151l = z16;
    }
}
