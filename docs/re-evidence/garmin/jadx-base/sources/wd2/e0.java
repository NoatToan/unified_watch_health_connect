package wd2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwd2/e0;", "", "", "deviceUnitId", "Lcom/garmin/android/library/livetrack/i;", "initiator", "", "nickname", "", "isDeviceDriven", "publisherIdentifier", "Lwd2/n1;", "trackerType", "", "Lwd2/b2;", "sessionInfoList", "macAddress", "startTimestamp", "<init>", "(JLcom/garmin/android/library/livetrack/i;Ljava/lang/String;ZLjava/lang/String;Lwd2/n1;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f184433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.library.livetrack.i f184434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f184435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f184436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f184437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f184438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<b2> f184439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f184440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f184441i;

    public e0(long j8, com.garmin.android.library.livetrack.i iVar, String str, boolean z14, String str2, n1 n1Var, List list, String str3, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, iVar, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? new n1.b() : n1Var, (i14 & 64) != 0 ? p13.j0.f134944a : list, (i14 & 128) != 0 ? null : str3, (i14 & 256) != 0 ? null : l14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f184433a == e0Var.f184433a && p005kotlin.jvm.internal.s.g(this.f184434b, e0Var.f184434b) && p005kotlin.jvm.internal.s.g(this.f184435c, e0Var.f184435c) && this.f184436d == e0Var.f184436d && p005kotlin.jvm.internal.s.g(this.f184437e, e0Var.f184437e) && p005kotlin.jvm.internal.s.g(this.f184438f, e0Var.f184438f) && p005kotlin.jvm.internal.s.g(this.f184439g, e0Var.f184439g) && p005kotlin.jvm.internal.s.g(this.f184440h, e0Var.f184440h) && p005kotlin.jvm.internal.s.g(this.f184441i, e0Var.f184441i);
    }

    public final int hashCode() {
        int iHashCode = (this.f184434b.hashCode() + (Long.hashCode(this.f184433a) * 31)) * 31;
        String str = this.f184435c;
        int iG = q6.f.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f184436d);
        String str2 = this.f184437e;
        int iHashCode2 = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        n1 n1Var = this.f184438f;
        int iB = lc.u0.b((iHashCode2 + (n1Var == null ? 0 : n1Var.hashCode())) * 31, 31, this.f184439g);
        String str3 = this.f184440h;
        int iHashCode3 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l14 = this.f184441i;
        return iHashCode3 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LivetrackRequestInput(deviceUnitId=");
        sb3.append(this.f184433a);
        sb3.append(", initiator=");
        sb3.append(this.f184434b);
        com.airbnb.lottie.animation.keyframe.a.t(", nickname=", this.f184435c, ", isDeviceDriven=", sb3, this.f184436d);
        sb3.append(", publisherIdentifier=");
        sb3.append(this.f184437e);
        sb3.append(", trackerType=");
        sb3.append(this.f184438f);
        sb3.append(", sessionInfoList=");
        sb3.append(this.f184439g);
        sb3.append(", macAddress=");
        sb3.append(this.f184440h);
        sb3.append(", startTimestamp=");
        sb3.append(this.f184441i);
        sb3.append(")");
        return sb3.toString();
    }

    public e0(long j8, com.garmin.android.library.livetrack.i iVar, String str, boolean z14, String str2, n1 n1Var, List<b2> list, String str3, Long l14) {
        iVar.getClass();
        list.getClass();
        this.f184433a = j8;
        this.f184434b = iVar;
        this.f184435c = str;
        this.f184436d = z14;
        this.f184437e = str2;
        this.f184438f = n1Var;
        this.f184439g = list;
        this.f184440h = str3;
        this.f184441i = l14;
    }
}
