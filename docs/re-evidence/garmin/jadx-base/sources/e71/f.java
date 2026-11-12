package e71;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ds.e0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Le71/f;", "", "", TtmlNode.ATTR_ID, "", "typeKey", "", "loadValue", "Lorg/joda/time/DateTime;", "dateTime", "", "colorInt", "formattedDateTime", "formattedDistance", "formattedLoad", "formattedBenefit", "Lzz/l;", "markerData", "<init>", "(JLjava/lang/String;DLorg/joda/time/DateTime;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzz/l;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f63295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f63297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTime f63298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f63299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f63300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f63302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f63303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zz.l f63304j;

    public f(long j8, String str, double d14, DateTime dateTime, int i14, String str2, String str3, String str4, String str5, zz.l lVar) {
        str.getClass();
        dateTime.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f63295a = j8;
        this.f63296b = str;
        this.f63297c = d14;
        this.f63298d = dateTime;
        this.f63299e = i14;
        this.f63300f = str2;
        this.f63301g = str3;
        this.f63302h = str4;
        this.f63303i = str5;
        this.f63304j = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f63295a == fVar.f63295a && this.f63296b.equals(fVar.f63296b) && Double.compare(this.f63297c, fVar.f63297c) == 0 && this.f63298d.equals(fVar.f63298d) && this.f63299e == fVar.f63299e && this.f63300f.equals(fVar.f63300f) && this.f63301g.equals(fVar.f63301g) && this.f63302h.equals(fVar.f63302h) && s.g(this.f63303i, fVar.f63303i) && s.g(this.f63304j, fVar.f63304j);
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(wr.g.j(q2.d(this.f63299e, e0.a(org.apache.commons.lang3.e.b(wr.g.j(Long.hashCode(this.f63295a) * 31, 31, this.f63296b), 31, this.f63297c), this.f63298d, 31), 31), 31, this.f63300f), 31, this.f63301g), 31, this.f63302h);
        String str = this.f63303i;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        zz.l lVar = this.f63304j;
        return iHashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f63295a, "ExerciseLoadSummaryItem(id=", ", typeKey=", this.f63296b);
        am.j.x(sbK, ", loadValue=", this.f63297c, ", dateTime=");
        sbK.append(this.f63298d);
        sbK.append(", colorInt=");
        sbK.append(this.f63299e);
        sbK.append(", formattedDateTime=");
        sn.a.t(sbK, this.f63300f, ", formattedDistance=", this.f63301g, ", formattedLoad=");
        sn.a.t(sbK, this.f63302h, ", formattedBenefit=", this.f63303i, ", markerData=");
        sbK.append(this.f63304j);
        sbK.append(")");
        return sbK.toString();
    }
}
