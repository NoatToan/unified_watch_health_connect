package pe0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.common.HttpHeaders;
import j53.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lpe0/f;", "", "", TtmlNode.ATTR_ID, "", "name", "Lpe0/d;", "primaryBreed", "Li53/c;", "secondaryBreeds", "Lje0/g;", "gender", "", "weight", HttpHeaders.AGE, "Lje0/j;", "status", "Lpe0/i;", "sevenDayStats", "lifetimeStats", "activityIds", "profileImageUrl", "activityTypes", "selectedActivityType", "<init>", "(JLjava/lang/String;Lpe0/d;Li53/c;Lje0/g;Ljava/lang/Double;Ljava/lang/String;Lje0/j;Lpe0/i;Lpe0/i;Li53/c;Ljava/lang/String;Li53/c;Ljava/lang/String;)V", "a", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f137420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f137422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<d> f137423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final je0.g f137424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f137425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f137426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final je0.j f137427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f137428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f137429j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i53.c<Long> f137430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f137431l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i53.c<String> f137432m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f137433n;

    static {
        new a(null);
    }

    public f(long j8, String str, d dVar, i53.c cVar, je0.g gVar, Double d14, String str2, je0.j jVar, i iVar, i iVar2, i53.c cVar2, String str3, i53.c cVar3, String str4, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(j8, (i14 & 2) != 0 ? "" : str, dVar, cVar, gVar, d14, str2, jVar, iVar, iVar2, cVar2, str3, (i14 & 4096) != 0 ? l.b() : cVar3, (i14 & 8192) != 0 ? null : str4);
    }

    public static f a(f fVar, i53.c cVar, String str, int i14) {
        long j8 = fVar.f137420a;
        String str2 = fVar.f137421b;
        d dVar = fVar.f137422c;
        i53.c<d> cVar2 = fVar.f137423d;
        je0.g gVar = fVar.f137424e;
        Double d14 = fVar.f137425f;
        String str3 = fVar.f137426g;
        je0.j jVar = fVar.f137427h;
        i iVar = fVar.f137428i;
        i iVar2 = fVar.f137429j;
        i53.c<Long> cVar3 = fVar.f137430k;
        String str4 = fVar.f137431l;
        i53.c cVar4 = (i14 & 4096) != 0 ? fVar.f137432m : cVar;
        String str5 = (i14 & 8192) != 0 ? fVar.f137433n : str;
        fVar.getClass();
        str2.getClass();
        cVar2.getClass();
        jVar.getClass();
        iVar.getClass();
        iVar2.getClass();
        cVar3.getClass();
        cVar4.getClass();
        return new f(j8, str2, dVar, cVar2, gVar, d14, str3, jVar, iVar, iVar2, cVar3, str4, cVar4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f137420a == fVar.f137420a && s.g(this.f137421b, fVar.f137421b) && s.g(this.f137422c, fVar.f137422c) && s.g(this.f137423d, fVar.f137423d) && this.f137424e == fVar.f137424e && s.g(this.f137425f, fVar.f137425f) && s.g(this.f137426g, fVar.f137426g) && this.f137427h == fVar.f137427h && s.g(this.f137428i, fVar.f137428i) && s.g(this.f137429j, fVar.f137429j) && s.g(this.f137430k, fVar.f137430k) && s.g(this.f137431l, fVar.f137431l) && s.g(this.f137432m, fVar.f137432m) && s.g(this.f137433n, fVar.f137433n);
    }

    public final int hashCode() {
        int iJ = wr.g.j(Long.hashCode(this.f137420a) * 31, 31, this.f137421b);
        d dVar = this.f137422c;
        int iA = l2.a(this.f137423d, (iJ + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
        je0.g gVar = this.f137424e;
        int iHashCode = (iA + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Double d14 = this.f137425f;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str = this.f137426g;
        int iA2 = l2.a(this.f137430k, (this.f137429j.hashCode() + ((this.f137428i.hashCode() + ((this.f137427h.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31, 31);
        String str2 = this.f137431l;
        int iA3 = l2.a(this.f137432m, (iA2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f137433n;
        return iA3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f137420a, "DogProfileData(id=", ", name=", this.f137421b);
        sbK.append(", primaryBreed=");
        sbK.append(this.f137422c);
        sbK.append(", secondaryBreeds=");
        sbK.append(this.f137423d);
        sbK.append(", gender=");
        sbK.append(this.f137424e);
        sbK.append(", weight=");
        sbK.append(this.f137425f);
        sbK.append(", age=");
        sbK.append(this.f137426g);
        sbK.append(", status=");
        sbK.append(this.f137427h);
        sbK.append(", sevenDayStats=");
        sbK.append(this.f137428i);
        sbK.append(", lifetimeStats=");
        sbK.append(this.f137429j);
        sbK.append(", activityIds=");
        sbK.append(this.f137430k);
        sbK.append(", profileImageUrl=");
        sbK.append(this.f137431l);
        sbK.append(", activityTypes=");
        sbK.append(this.f137432m);
        sbK.append(", selectedActivityType=");
        sbK.append(this.f137433n);
        sbK.append(")");
        return sbK.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpe0/f$a;", "", "<init>", "()V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public f(long j8, String str, d dVar, i53.c<d> cVar, je0.g gVar, Double d14, String str2, je0.j jVar, i iVar, i iVar2, i53.c<Long> cVar2, String str3, i53.c<String> cVar3, String str4) {
        str.getClass();
        cVar.getClass();
        jVar.getClass();
        iVar.getClass();
        iVar2.getClass();
        cVar2.getClass();
        cVar3.getClass();
        this.f137420a = j8;
        this.f137421b = str;
        this.f137422c = dVar;
        this.f137423d = cVar;
        this.f137424e = gVar;
        this.f137425f = d14;
        this.f137426g = str2;
        this.f137427h = jVar;
        this.f137428i = iVar;
        this.f137429j = iVar2;
        this.f137430k = cVar2;
        this.f137431l = str3;
        this.f137432m = cVar3;
        this.f137433n = str4;
    }
}
