package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lfe2/r1;", "", "Lae2/e0;", "publisher", "", "autoStarted", "isDeviceDriven", "isMessagingCapable", "isLiveEventSharingEnabled", "Lwd2/g2;", "stravaBeaconOption", "<init>", "(Lae2/e0;ZZZZLwd2/g2;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ae2.e0 f70906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f70907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f70908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f70909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f70910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wd2.g2 f70911f;

    public r1(ae2.e0 e0Var, boolean z14, boolean z15, boolean z16, boolean z17, wd2.g2 g2Var) {
        e0Var.getClass();
        this.f70906a = e0Var;
        this.f70907b = z14;
        this.f70908c = z15;
        this.f70909d = z16;
        this.f70910e = z17;
        this.f70911f = g2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return this.f70906a.equals(r1Var.f70906a) && this.f70907b == r1Var.f70907b && this.f70908c == r1Var.f70908c && this.f70909d == r1Var.f70909d && this.f70910e == r1Var.f70910e && p005kotlin.jvm.internal.s.g(this.f70911f, r1Var.f70911f);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g(this.f70906a.hashCode() * 31, 31, this.f70907b), 31, this.f70908c), 31, this.f70909d), 31, this.f70910e);
        wd2.g2 g2Var = this.f70911f;
        return iG + (g2Var == null ? 0 : g2Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LivetrackStartDetails(publisher=");
        sb3.append(this.f70906a);
        sb3.append(", autoStarted=");
        sb3.append(this.f70907b);
        sb3.append(", isDeviceDriven=");
        kg.f.q(", isMessagingCapable=", ", isLiveEventSharingEnabled=", sb3, this.f70908c, this.f70909d);
        sb3.append(this.f70910e);
        sb3.append(", stravaBeaconOption=");
        sb3.append(this.f70911f);
        sb3.append(")");
        return sb3.toString();
    }
}
