package av1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lav1/g;", "", "", "contentId", "", "caption", "captionDesc", "title", "duration", "durationInSeconds", "imgUrl", "Lhv1/c;", "contentType", "", "displayNewTag", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lhv1/c;Z)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f13275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hv1.c f13277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f13278i;

    public g(long j8, String str, String str2, String str3, String str4, Long l14, String str5, hv1.c cVar, boolean z14) {
        str.getClass();
        str3.getClass();
        cVar.getClass();
        this.f13270a = j8;
        this.f13271b = str;
        this.f13272c = str2;
        this.f13273d = str3;
        this.f13274e = str4;
        this.f13275f = l14;
        this.f13276g = str5;
        this.f13277h = cVar;
        this.f13278i = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f13270a == gVar.f13270a && this.f13271b.equals(gVar.f13271b) && s.g(this.f13272c, gVar.f13272c) && this.f13273d.equals(gVar.f13273d) && s.g(this.f13274e, gVar.f13274e) && s.g(this.f13275f, gVar.f13275f) && s.g(this.f13276g, gVar.f13276g) && this.f13277h == gVar.f13277h && this.f13278i == gVar.f13278i;
    }

    public final int hashCode() {
        int iJ = wr.g.j(Long.hashCode(this.f13270a) * 31, 31, this.f13271b);
        String str = this.f13272c;
        int iJ2 = wr.g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f13273d);
        String str2 = this.f13274e;
        int iHashCode = (iJ2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l14 = this.f13275f;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str3 = this.f13276g;
        return Boolean.hashCode(this.f13278i) + ((this.f13277h.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f13270a, "PremiumCoachContentModel(contentId=", ", caption=", this.f13271b);
        sn.a.t(sbK, ", captionDesc=", this.f13272c, ", title=", this.f13273d);
        sbK.append(", duration=");
        sbK.append(this.f13274e);
        sbK.append(", durationInSeconds=");
        sbK.append(this.f13275f);
        sbK.append(", imgUrl=");
        sbK.append(this.f13276g);
        sbK.append(", contentType=");
        sbK.append(this.f13277h);
        return com.airbnb.lottie.animation.keyframe.a.i(sbK, ", displayNewTag=", this.f13278i, ")");
    }
}
