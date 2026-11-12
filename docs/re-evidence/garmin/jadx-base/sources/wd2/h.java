package wd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwd2/h;", "", "", "deviceUnitId", "", "firmwareVersion", "partNumber", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f184483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f184485c;

    public h(long j8, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f184483a = j8;
        this.f184484b = str;
        this.f184485c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f184483a == hVar.f184483a && this.f184484b.equals(hVar.f184484b) && this.f184485c.equals(hVar.f184485c);
    }

    public final int hashCode() {
        return this.f184485c.hashCode() + wr.g.j(Long.hashCode(this.f184483a) * 31, 31, this.f184484b);
    }

    public final String toString() {
        return v.e0.h(com.airbnb.lottie.animation.keyframe.a.k(this.f184483a, "GarminDeviceInfo(deviceUnitId=", ", firmwareVersion=", this.f184484b), ", partNumber=", this.f184485c, ")");
    }
}
