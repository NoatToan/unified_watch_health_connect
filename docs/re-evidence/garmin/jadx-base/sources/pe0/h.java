package pe0;

import b63.u;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import g22.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lpe0/h;", "", "", TtmlNode.ATTR_ID, "", "name", "Lje0/j;", "status", "", "activityCount", "Lb63/u;", "mostRecentActivityTime", "profileImageUrl", "<init>", "(JLjava/lang/String;Lje0/j;ILb63/u;Ljava/lang/String;)V", "a", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f137441g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f137442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je0.j f137444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f137445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f137446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f137447f;

    public /* synthetic */ h(long j8, String str, je0.j jVar, int i14, u uVar, String str2, int i15, p005kotlin.jvm.internal.j jVar2) {
        this(j8, (i15 & 2) != 0 ? "" : str, jVar, (i15 & 8) != 0 ? 0 : i14, uVar, (i15 & 32) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f137442a == hVar.f137442a && s.g(this.f137443b, hVar.f137443b) && this.f137444c == hVar.f137444c && this.f137445d == hVar.f137445d && s.g(this.f137446e, hVar.f137446e) && s.g(this.f137447f, hVar.f137447f);
    }

    public final int hashCode() {
        int iD = q2.d(this.f137445d, (this.f137444c.hashCode() + wr.g.j(Long.hashCode(this.f137442a) * 31, 31, this.f137443b)) * 31, 31);
        u uVar = this.f137446e;
        int iHashCode = (iD + (uVar == null ? 0 : uVar.f16216a.hashCode())) * 31;
        String str = this.f137447f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f137442a, "DogSummaryData(id=", ", name=", this.f137443b);
        sbK.append(", status=");
        sbK.append(this.f137444c);
        sbK.append(", activityCount=");
        sbK.append(this.f137445d);
        sbK.append(", mostRecentActivityTime=");
        sbK.append(this.f137446e);
        sbK.append(", profileImageUrl=");
        sbK.append(this.f137447f);
        sbK.append(")");
        return sbK.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpe0/h$a;", "", "<init>", "()V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static h a(a aVar, long j8, String str, je0.j jVar, int i14) {
            if ((i14 & 4) != 0) {
                jVar = je0.j.ACTIVE;
            }
            je0.j jVar2 = jVar;
            u uVarE = l.e(u.INSTANCE);
            jVar2.getClass();
            return new h(j8, str, jVar2, 0, uVarE, null);
        }

        public final i53.f<h> b() {
            return i53.a.a(a(this, 1L, "_Buddy", null, 60), a(this, 2L, "_Luna", null, 60), a(this, 3L, "_Max", je0.j.RETIRED, 56));
        }

        private a() {
        }
    }

    public h(long j8, String str, je0.j jVar, int i14, u uVar, String str2) {
        str.getClass();
        jVar.getClass();
        this.f137442a = j8;
        this.f137443b = str;
        this.f137444c = jVar;
        this.f137445d = i14;
        this.f137446e = uVar;
        this.f137447f = str2;
    }
}
