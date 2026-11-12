package s80;

import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ls80/b;", "", "", "deviceUnitId", "", "deviceName", "", "retries", "", "hasNfc", "hasWalletSetUp", "<init>", "(JLjava/lang/String;IZZ)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f157872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f157874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f157875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f157876e;

    public b(long j8, String str, int i14, boolean z14, boolean z15) {
        str.getClass();
        this.f157872a = j8;
        this.f157873b = str;
        this.f157874c = i14;
        this.f157875d = z14;
        this.f157876e = z15;
    }

    public static b a(b bVar, int i14) {
        return new b(bVar.f157872a, bVar.f157873b, i14, bVar.f157875d, bVar.f157876e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f157872a == bVar.f157872a && this.f157873b.equals(bVar.f157873b) && this.f157874c == bVar.f157874c && this.f157875d == bVar.f157875d && this.f157876e == bVar.f157876e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f157876e) + q6.f.g(q2.d(this.f157874c, wr.g.j(Long.hashCode(this.f157872a) * 31, 31, this.f157873b), 31), 31, this.f157875d);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f157872a, "DeviceIncorrectPasscode(deviceUnitId=", ", deviceName=", this.f157873b);
        sbK.append(", retries=");
        sbK.append(this.f157874c);
        sbK.append(", hasNfc=");
        sbK.append(this.f157875d);
        return com.airbnb.lottie.animation.keyframe.a.i(sbK, ", hasWalletSetUp=", this.f157876e, ")");
    }
}
