package xp1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lxp1/d;", "", "", "readingTimestampLocal", "readingTimestampGmt", "", "solarUtilization", "", "isCharging", "notChargingTooHot", "notChargingTooCold", "notChargingBatteryFull", "notChargingExternalPower", "notChargingUserDisabled", "notChargingOther", "<init>", "(Ljava/lang/String;Ljava/lang/String;FZZZZZZZ)V", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f191860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f191861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f191862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f191863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f191864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f191865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f191866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f191867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f191868j;

    public /* synthetic */ d(String str, String str2, float f14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? 0.0f : f14, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? false : z15, (i14 & 32) != 0 ? false : z16, (i14 & 64) != 0 ? false : z17, (i14 & 128) != 0 ? false : z18, (i14 & 256) != 0 ? false : z19, (i14 & 512) != 0 ? false : z24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f191859a, dVar.f191859a) && s.g(this.f191860b, dVar.f191860b) && Float.compare(this.f191861c, dVar.f191861c) == 0 && this.f191862d == dVar.f191862d && this.f191863e == dVar.f191863e && this.f191864f == dVar.f191864f && this.f191865g == dVar.f191865g && this.f191866h == dVar.f191866h && this.f191867i == dVar.f191867i && this.f191868j == dVar.f191868j;
    }

    public final int hashCode() {
        String str = this.f191859a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f191860b;
        return Boolean.hashCode(this.f191868j) + f.g(f.g(f.g(f.g(f.g(f.g(f.d(this.f191861c, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.f191862d), 31, this.f191863e), 31, this.f191864f), 31, this.f191865g), 31, this.f191866h), 31, this.f191867i);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("SolarInputReadingState(readingTimestampLocal=", this.f191859a, ", readingTimestampGmt=", this.f191860b, ", solarUtilization=");
        sbI.append(this.f191861c);
        sbI.append(", isCharging=");
        sbI.append(this.f191862d);
        sbI.append(", notChargingTooHot=");
        kg.f.q(", notChargingTooCold=", ", notChargingBatteryFull=", sbI, this.f191863e, this.f191864f);
        kg.f.q(", notChargingExternalPower=", ", notChargingUserDisabled=", sbI, this.f191865g, this.f191866h);
        return com.airbnb.lottie.animation.keyframe.a.f(", notChargingOther=", ")", sbI, this.f191867i, this.f191868j);
    }

    public d(String str, String str2, float f14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24) {
        this.f191859a = str;
        this.f191860b = str2;
        this.f191861c = f14;
        this.f191862d = z14;
        this.f191863e = z15;
        this.f191864f = z16;
        this.f191865g = z17;
        this.f191866h = z18;
        this.f191867i = z19;
        this.f191868j = z24;
    }

    public d() {
        this(null, null, 0.0f, false, false, false, false, false, false, false, 1023, null);
    }
}
