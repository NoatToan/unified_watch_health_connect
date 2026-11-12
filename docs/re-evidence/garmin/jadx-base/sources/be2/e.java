package be2;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbe2/e;", "", "", "deviceUnitId", "", "publisherId", "publisherType", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17750c;

    public e(long j8, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f17748a = j8;
        this.f17749b = str;
        this.f17750c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f17748a == eVar.f17748a && this.f17749b.equals(eVar.f17749b) && this.f17750c.equals(eVar.f17750c);
    }

    public final int hashCode() {
        return this.f17750c.hashCode() + wr.g.j(Long.hashCode(this.f17748a) * 31, 31, this.f17749b);
    }

    public final String toString() {
        return e0.h(com.airbnb.lottie.animation.keyframe.a.k(this.f17748a, "LivetrackPublisher(deviceUnitId=", ", publisherId=", this.f17749b), ", publisherType=", this.f17750c, ")");
    }
}
