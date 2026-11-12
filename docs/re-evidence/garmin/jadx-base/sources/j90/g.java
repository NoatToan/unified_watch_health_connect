package j90;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lj90/g;", "", "", "deviceId", "", "productDisplayName", "deviceImageUrl", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f97815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97817c;

    public g(long j8, String str, String str2) {
        this.f97815a = j8;
        this.f97816b = str;
        this.f97817c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f97815a == gVar.f97815a && s.g(this.f97816b, gVar.f97816b) && s.g(this.f97817c, gVar.f97817c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f97815a) * 31;
        String str = this.f97816b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97817c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return e0.h(com.airbnb.lottie.animation.keyframe.a.k(this.f97815a, "LTESubscriptionDevice(deviceId=", ", productDisplayName=", this.f97816b), ", deviceImageUrl=", this.f97817c, ")");
    }
}
