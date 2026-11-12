package fx2;

import p005kotlin.Metadata;
import v.e0;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfx2/a;", "", "", "deviceUnitId", "", "gcWebBaseUrl", "omtBaseUrl", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f73849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73851c;

    public a(long j8, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f73849a = j8;
        this.f73850b = str;
        this.f73851c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f73849a == aVar.f73849a && this.f73850b.equals(aVar.f73850b) && this.f73851c.equals(aVar.f73851c);
    }

    public final int hashCode() {
        return this.f73851c.hashCode() + g.j(Long.hashCode(this.f73849a) * 31, 31, this.f73850b);
    }

    public final String toString() {
        return e0.h(com.airbnb.lottie.animation.keyframe.a.k(this.f73849a, "NetworkConfiguration(deviceUnitId=", ", gcWebBaseUrl=", this.f73850b), ", omtBaseUrl=", this.f73851c, ")");
    }
}
