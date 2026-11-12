package fi1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;
import wr.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lfi1/a;", "", "", "deviceId", "", "deviceName", "deviceImageUrl", "productNumber", "macAddress", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f71761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f71764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f71765e;

    public /* synthetic */ a(long j8, String str, String str2, String str3, String str4, int i14, j jVar) {
        this(j8, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? "" : str3, (i14 & 16) != 0 ? "" : str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f71761a == aVar.f71761a && s.g(this.f71762b, aVar.f71762b) && s.g(this.f71763c, aVar.f71763c) && s.g(this.f71764d, aVar.f71764d) && s.g(this.f71765e, aVar.f71765e);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f71761a) * 31;
        String str = this.f71762b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71763c;
        return this.f71765e.hashCode() + g.j((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f71764d);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f71761a, "DeviceInfo(deviceId=", ", deviceName=", this.f71762b);
        sn.a.t(sbK, ", deviceImageUrl=", this.f71763c, ", productNumber=", this.f71764d);
        return e0.h(sbK, ", macAddress=", this.f71765e, ")");
    }

    public a(long j8, String str, String str2, String str3, String str4) {
        str3.getClass();
        str4.getClass();
        this.f71761a = j8;
        this.f71762b = str;
        this.f71763c = str2;
        this.f71764d = str3;
        this.f71765e = str4;
    }
}
