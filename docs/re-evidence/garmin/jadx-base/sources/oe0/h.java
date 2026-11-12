package oe0;

import java.util.List;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Loe0/h;", "", "", "labelTitle", "labelMeta1", "labelMeta2", "labelMeta3", "", "Lo13/p;", "", "decodedPolyline", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f131279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<o13.p<Double, Double>> f131280e;

    public h(String str, String str2, String str3, String str4, List<o13.p<Double, Double>> list) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f131276a = str;
        this.f131277b = str2;
        this.f131278c = str3;
        this.f131279d = str4;
        this.f131280e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f131276a.equals(hVar.f131276a) && this.f131277b.equals(hVar.f131277b) && this.f131278c.equals(hVar.f131278c) && p005kotlin.jvm.internal.s.g(this.f131279d, hVar.f131279d) && p005kotlin.jvm.internal.s.g(this.f131280e, hVar.f131280e);
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(this.f131276a.hashCode() * 31, 31, this.f131277b), 31, this.f131278c);
        String str = this.f131279d;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        List<o13.p<Double, Double>> list = this.f131280e;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("DogActivityCardStats(labelTitle=", this.f131276a, ", labelMeta1=", this.f131277b, ", labelMeta2=");
        sn.a.t(sbI, this.f131278c, ", labelMeta3=", this.f131279d, ", decodedPolyline=");
        return z.c(sbI, this.f131280e, ")");
    }
}
