package li2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lli2/a;", "", "", "deviceID", "", "deviceSettingsFileName", "deviceSoftwareVersion", "userDisplayName", "sportRun", "sportWalk", "subSportAll", "", "isCIQMusicCapable", "isSolarPanelUtilizationCapable", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f112900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f112903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f112904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f112905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f112906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f112907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f112908i;

    public /* synthetic */ a(long j8, String str, String str2, String str3, String str4, String str5, String str6, boolean z14, boolean z15, int i14, j jVar) {
        this(j8, str, str2, str3, (i14 & 16) != 0 ? "running" : str4, (i14 & 32) != 0 ? "walking" : str5, (i14 & 64) != 0 ? TtmlNode.COMBINE_ALL : str6, (i14 & 128) != 0 ? false : z14, (i14 & 256) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f112900a == aVar.f112900a && s.g(this.f112901b, aVar.f112901b) && s.g(this.f112902c, aVar.f112902c) && s.g(this.f112903d, aVar.f112903d) && s.g(this.f112904e, aVar.f112904e) && s.g(this.f112905f, aVar.f112905f) && s.g(this.f112906g, aVar.f112906g) && this.f112907h == aVar.f112907h && this.f112908i == aVar.f112908i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final int hashCode() {
        int iJ = g.j(Long.hashCode(this.f112900a) * 31, 31, this.f112901b);
        String str = this.f112902c;
        int iJ2 = g.j(g.j(g.j(g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f112903d), 31, this.f112904e), 31, this.f112905f), 31, this.f112906g);
        boolean z14 = this.f112907h;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (iJ2 + r14) * 31;
        boolean z15 = this.f112908i;
        return i14 + (z15 ? 1 : z15);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f112900a, "DeviceSettingsConfiguration(deviceID=", ", deviceSettingsFileName=", this.f112901b);
        sn.a.t(sbK, ", deviceSoftwareVersion=", this.f112902c, ", userDisplayName=", this.f112903d);
        sn.a.t(sbK, ", sportRun=", this.f112904e, ", sportWalk=", this.f112905f);
        com.airbnb.lottie.animation.keyframe.a.t(", subSportAll=", this.f112906g, ", isCIQMusicCapable=", sbK, this.f112907h);
        return com.airbnb.lottie.animation.keyframe.a.i(sbK, ", isSolarPanelUtilizationCapable=", this.f112908i, ")");
    }

    public a(long j8, String str, String str2, String str3, String str4, String str5, String str6, boolean z14, boolean z15) {
        hb.a.p(str, str3, str4, str5, str6);
        this.f112900a = j8;
        this.f112901b = str;
        this.f112902c = str2;
        this.f112903d = str3;
        this.f112904e = str4;
        this.f112905f = str5;
        this.f112906g = str6;
        this.f112907h = z14;
        this.f112908i = z15;
    }
}
