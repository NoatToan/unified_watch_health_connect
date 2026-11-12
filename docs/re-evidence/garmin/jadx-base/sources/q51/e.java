package q51;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lq51/e;", "", "", TtmlNode.ATTR_ID, "", "strategyName", "distance", "distanceContentDescription", "goalTime", "goalTimeContentDescription", "pace", "paceContentDescription", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f142881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f142883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f142884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f142885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f142886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f142887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f142888h;

    public e(long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        hb.a.p(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.f142881a = j8;
        this.f142882b = str;
        this.f142883c = str2;
        this.f142884d = str3;
        this.f142885e = str4;
        this.f142886f = str5;
        this.f142887g = str6;
        this.f142888h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f142881a == eVar.f142881a && this.f142882b.equals(eVar.f142882b) && this.f142883c.equals(eVar.f142883c) && this.f142884d.equals(eVar.f142884d) && this.f142885e.equals(eVar.f142885e) && this.f142886f.equals(eVar.f142886f) && this.f142887g.equals(eVar.f142887g) && this.f142888h.equals(eVar.f142888h);
    }

    public final int hashCode() {
        return this.f142888h.hashCode() + g.j(g.j(g.j(g.j(g.j(g.j(Long.hashCode(this.f142881a) * 31, 31, this.f142882b), 31, this.f142883c), 31, this.f142884d), 31, this.f142885e), 31, this.f142886f), 31, this.f142887g);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f142881a, "PaceProStrategyUIData(id=", ", strategyName=", this.f142882b);
        sn.a.t(sbK, ", distance=", this.f142883c, ", distanceContentDescription=", this.f142884d);
        sn.a.t(sbK, ", goalTime=", this.f142885e, ", goalTimeContentDescription=", this.f142886f);
        sn.a.t(sbK, ", pace=", this.f142887g, ", paceContentDescription=", this.f142888h);
        sbK.append(")");
        return sbK.toString();
    }
}
