package o70;

import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo70/m;", "", "", "deviceUnitId", "", "deviceName", "", "retries", "", "hasNfc", "hasWalletSetUp", "Lo70/l;", "cardType", "<init>", "(JLjava/lang/String;IZZLo70/l;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f130028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f130029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f130030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f130031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f130032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f130033f;

    public m(long j8, String str, int i14, boolean z14, boolean z15, l lVar) {
        str.getClass();
        lVar.getClass();
        this.f130028a = j8;
        this.f130029b = str;
        this.f130030c = i14;
        this.f130031d = z14;
        this.f130032e = z15;
        this.f130033f = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f130028a == mVar.f130028a && this.f130029b.equals(mVar.f130029b) && this.f130030c == mVar.f130030c && this.f130031d == mVar.f130031d && this.f130032e == mVar.f130032e && this.f130033f == mVar.f130033f;
    }

    public final int hashCode() {
        return this.f130033f.hashCode() + q6.f.g(q6.f.g(q2.d(this.f130030c, wr.g.j(Long.hashCode(this.f130028a) * 31, 31, this.f130029b), 31), 31, this.f130031d), 31, this.f130032e);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f130028a, "IncorrectPasscodeDevice(deviceUnitId=", ", deviceName=", this.f130029b);
        sbK.append(", retries=");
        sbK.append(this.f130030c);
        sbK.append(", hasNfc=");
        sbK.append(this.f130031d);
        sbK.append(", hasWalletSetUp=");
        sbK.append(this.f130032e);
        sbK.append(", cardType=");
        sbK.append(this.f130033f);
        sbK.append(")");
        return sbK.toString();
    }
}
