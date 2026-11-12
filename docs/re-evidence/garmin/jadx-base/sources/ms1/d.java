package ms1;

import b71.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lms1/d;", "", "", "curatedCourseId", "", "trailName", "trailLocation", "coverPhotoUrl", "reviewId", "", "reviewRating", "reviewDate", "reviewerProfileImageUrl", "", "reviewIsAnonymous", "reviewIsHidden", "courseDistanceCM", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f120483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f120486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f120487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f120488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f120489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f120490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f120491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f120492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Long f120493k;

    public /* synthetic */ d(Long l14, String str, String str2, String str3, Long l15, Integer num, Long l16, String str4, Boolean bool, Boolean bool2, Long l17, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : l15, (i14 & 32) != 0 ? null : num, (i14 & 64) != 0 ? null : l16, (i14 & 128) != 0 ? null : str4, (i14 & 256) != 0 ? null : bool, (i14 & 512) != 0 ? null : bool2, (i14 & 1024) != 0 ? null : l17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f120483a, dVar.f120483a) && s.g(this.f120484b, dVar.f120484b) && s.g(this.f120485c, dVar.f120485c) && s.g(this.f120486d, dVar.f120486d) && s.g(this.f120487e, dVar.f120487e) && s.g(this.f120488f, dVar.f120488f) && s.g(this.f120489g, dVar.f120489g) && s.g(this.f120490h, dVar.f120490h) && s.g(this.f120491i, dVar.f120491i) && s.g(this.f120492j, dVar.f120492j) && s.g(this.f120493k, dVar.f120493k);
    }

    public final int hashCode() {
        Long l14 = this.f120483a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f120484b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f120485c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120486d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l15 = this.f120487e;
        int iHashCode5 = (iHashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num = this.f120488f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Long l16 = this.f120489g;
        int iHashCode7 = (iHashCode6 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str4 = this.f120490h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f120491i;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f120492j;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l17 = this.f120493k;
        return iHashCode10 + (l17 != null ? l17.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = i.j("TrailActivityDetails(curatedCourseId=", ", trailName=", this.f120484b, this.f120483a, ", trailLocation=");
        sn.a.t(sbJ, this.f120485c, ", coverPhotoUrl=", this.f120486d, ", reviewId=");
        sbJ.append(this.f120487e);
        sbJ.append(", reviewRating=");
        sbJ.append(this.f120488f);
        sbJ.append(", reviewDate=");
        i.q(this.f120489g, ", reviewerProfileImageUrl=", this.f120490h, ", reviewIsAnonymous=", sbJ);
        i.o(this.f120491i, this.f120492j, ", reviewIsHidden=", ", courseDistanceCM=", sbJ);
        return p6.b.g(sbJ, this.f120493k, ")");
    }

    public d(Long l14, String str, String str2, String str3, Long l15, Integer num, Long l16, String str4, Boolean bool, Boolean bool2, Long l17) {
        this.f120483a = l14;
        this.f120484b = str;
        this.f120485c = str2;
        this.f120486d = str3;
        this.f120487e = l15;
        this.f120488f = num;
        this.f120489g = l16;
        this.f120490h = str4;
        this.f120491i = bool;
        this.f120492j = bool2;
        this.f120493k = l17;
    }

    public d() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
