package hc1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhc1/b;", "", "", "deviceId", "", "pulseOxDeviceDisplayName", "pulseOxDeviceProductNo", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f83274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83276c;

    public /* synthetic */ b(long j8, String str, String str2, int i14, j jVar) {
        this(j8, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f83274a == bVar.f83274a && s.g(this.f83275b, bVar.f83275b) && s.g(this.f83276c, bVar.f83276c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f83274a) * 31;
        String str = this.f83275b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f83276c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return e0.h(com.airbnb.lottie.animation.keyframe.a.k(this.f83274a, "PulseOxSupportedDevice(deviceId=", ", pulseOxDeviceDisplayName=", this.f83275b), ", pulseOxDeviceProductNo=", this.f83276c, ")");
    }

    public b(long j8, String str, String str2) {
        this.f83274a = j8;
        this.f83275b = str;
        this.f83276c = str2;
    }
}
