package mf2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmf2/f;", "", "", "unitId", "", "productDisplayName", "partNumber", "softwareVersion", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f118299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f118301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f118302d;

    public f(long j8, String str, String str2, String str3) {
        this.f118299a = j8;
        this.f118300b = str;
        this.f118301c = str2;
        this.f118302d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f118299a == fVar.f118299a && s.g(this.f118300b, fVar.f118300b) && s.g(this.f118301c, fVar.f118301c) && s.g(this.f118302d, fVar.f118302d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f118299a) * 31;
        String str = this.f118300b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f118301c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f118302d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f118299a, "LiveActivityAnalyticsDeviceDescriptor(unitId=", ", productDisplayName=", this.f118300b);
        sn.a.t(sbK, ", partNumber=", this.f118301c, ", softwareVersion=", this.f118302d);
        sbK.append(")");
        return sbK.toString();
    }
}
