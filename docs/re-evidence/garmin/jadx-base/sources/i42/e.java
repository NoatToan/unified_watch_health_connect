package i42;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li42/e;", "", "", "recordId", "", "handle", "text", "hash", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f90991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f90994d;

    public e(long j8, String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f90991a = j8;
        this.f90992b = str;
        this.f90993c = str2;
        this.f90994d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f90991a == eVar.f90991a && s.g(this.f90992b, eVar.f90992b) && s.g(this.f90993c, eVar.f90993c) && s.g(this.f90994d, eVar.f90994d);
    }

    public final int hashCode() {
        return this.f90994d.hashCode() + wr.g.j(wr.g.j(Long.hashCode(this.f90991a) * 31, 31, this.f90992b), 31, this.f90993c);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f90991a, "Translation(recordId=", ", handle=", this.f90992b);
        sn.a.t(sbK, ", text=", this.f90993c, ", hash=", this.f90994d);
        sbK.append(")");
        return sbK.toString();
    }

    public /* synthetic */ e(long j8, String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, str, str2, str3);
    }
}
