package z92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz92/a;", "", "", "userId", "", "environment", "<init>", "(JLjava/lang/String;)V", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f203139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203140b;

    public a(long j8, String str) {
        str.getClass();
        this.f203139a = j8;
        this.f203140b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f203139a == aVar.f203139a && this.f203140b.equals(aVar.f203140b);
    }

    public final int hashCode() {
        return this.f203140b.hashCode() + (Long.hashCode(this.f203139a) * 31);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f203139a, "DevicePasscodeOwnerData(userId=", ", environment=", this.f203140b);
        sbK.append(")");
        return sbK.toString();
    }
}
