package vc2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvc2/l;", "", "", "maintenanceCardMessage", "maintenanceBannerMessage", "", "cardDismissible", "bannerDismissible", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f177125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f177126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f177127d;

    public /* synthetic */ l(String str, String str2, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.f177124a, lVar.f177124a) && s.g(this.f177125b, lVar.f177125b) && this.f177126c == lVar.f177126c && this.f177127d == lVar.f177127d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f177127d) + q6.f.g(wr.g.j(this.f177124a.hashCode() * 31, 31, this.f177125b), 31, this.f177126c);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.f(", bannerDismissible=", ")", p6.b.i("ServerStatusData(maintenanceCardMessage=", this.f177124a, ", maintenanceBannerMessage=", this.f177125b, ", cardDismissible="), this.f177126c, this.f177127d);
    }

    public l(String str, String str2, boolean z14, boolean z15) {
        str.getClass();
        str2.getClass();
        this.f177124a = str;
        this.f177125b = str2;
        this.f177126c = z14;
        this.f177127d = z15;
    }

    public l() {
        this(null, null, false, false, 15, null);
    }
}
