package k31;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lk31/a;", "", "", "deviceId", "", "deviceName", "deviceProductNumber", "deviceImageUrl", "", "Lk31/c;", FirebaseAnalytics.Param.ITEMS, "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f102605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f102606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<c> f102607e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(long j8, String str, String str2, String str3, List<? extends c> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f102603a = j8;
        this.f102604b = str;
        this.f102605c = str2;
        this.f102606d = str3;
        this.f102607e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f102603a == aVar.f102603a && this.f102604b.equals(aVar.f102604b) && this.f102605c.equals(aVar.f102605c) && s.g(this.f102606d, aVar.f102606d) && this.f102607e.equals(aVar.f102607e);
    }

    public final int hashCode() {
        int iJ = g.j(g.j(Long.hashCode(this.f102603a) * 31, 31, this.f102604b), 31, this.f102605c);
        String str = this.f102606d;
        return this.f102607e.hashCode() + ((iJ + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f102603a, "DeviceOnboardingData(deviceId=", ", deviceName=", this.f102604b);
        sn.a.t(sbK, ", deviceProductNumber=", this.f102605c, ", deviceImageUrl=", this.f102606d);
        sbK.append(", items=");
        sbK.append(this.f102607e);
        sbK.append(")");
        return sbK.toString();
    }
}
