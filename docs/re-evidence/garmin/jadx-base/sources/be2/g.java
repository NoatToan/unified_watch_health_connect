package be2;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0013Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lbe2/g;", "", "", "deviceUnitId", "", "name", "publisherId", "publisherType", "", "isDeviceDriven", "shouldStopOnDevice", "groupTrackSessionId", "activityType", "activityCreatedTime", "", "Lbe2/g$a;", "sharingErrors", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f17772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f17773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<a> f17774j;

    public /* synthetic */ g(long j8, String str, String str2, String str3, boolean z14, boolean z15, String str4, String str5, Long l14, List list, int i14, j jVar) {
        this(j8, str, str2, str3, z14, (i14 & 32) != 0 ? false : z15, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : str5, (i14 & 256) != 0 ? null : l14, (i14 & 512) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f17765a == gVar.f17765a && s.g(this.f17766b, gVar.f17766b) && s.g(this.f17767c, gVar.f17767c) && s.g(this.f17768d, gVar.f17768d) && this.f17769e == gVar.f17769e && this.f17770f == gVar.f17770f && s.g(this.f17771g, gVar.f17771g) && s.g(this.f17772h, gVar.f17772h) && s.g(this.f17773i, gVar.f17773i) && s.g(this.f17774j, gVar.f17774j);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(wr.g.j(wr.g.j(wr.g.j(Long.hashCode(this.f17765a) * 31, 31, this.f17766b), 31, this.f17767c), 31, this.f17768d), 31, this.f17769e), 31, this.f17770f);
        String str = this.f17771g;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17772h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l14 = this.f17773i;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        List<a> list = this.f17774j;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        boolean z14 = this.f17770f;
        String str = this.f17772h;
        Long l14 = this.f17773i;
        List<a> list = this.f17774j;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f17765a, "SessionInfo(deviceUnitId=", ", name=", this.f17766b);
        sn.a.t(sbK, ", publisherId=", this.f17767c, ", publisherType=", this.f17768d);
        com.airbnb.lottie.animation.keyframe.a.v(", isDeviceDriven=", ", shouldStopOnDevice=", sbK, this.f17769e, z14);
        sn.a.t(sbK, ", groupTrackSessionId=", this.f17771g, ", activityType=", str);
        sbK.append(", activityCreatedTime=");
        sbK.append(l14);
        sbK.append(", sharingErrors=");
        sbK.append(list);
        sbK.append(")");
        return sbK.toString();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbe2/g$a;", "", "", "errorName", "errorType", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f17776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f17777c;

        public /* synthetic */ a(String str, String str2, String str3, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f17775a, aVar.f17775a) && s.g(this.f17776b, aVar.f17776b) && s.g(this.f17777c, aVar.f17777c);
        }

        public final int hashCode() {
            String str = this.f17775a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f17776b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f17777c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return am.j.o(this.f17777c, ")", p6.b.i("SharingError(errorName=", this.f17775a, ", errorType=", this.f17776b, ", value="));
        }

        public a(String str, String str2, String str3) {
            this.f17775a = str;
            this.f17776b = str2;
            this.f17777c = str3;
        }

        public a() {
            this(null, null, null, 7, null);
        }
    }

    public g(long j8, String str, String str2, String str3, boolean z14, boolean z15, String str4, String str5, Long l14, List<a> list) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f17765a = j8;
        this.f17766b = str;
        this.f17767c = str2;
        this.f17768d = str3;
        this.f17769e = z14;
        this.f17770f = z15;
        this.f17771g = str4;
        this.f17772h = str5;
        this.f17773i = l14;
        this.f17774j = list;
    }
}
