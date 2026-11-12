package d70;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ds.e0;
import o13.z;
import o4.d0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ld70/b;", "", "", "title", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "Lorg/joda/time/DateTime;", "startDate", "Li53/c;", "Lk61/a;", "points", "", "xAxisLabelsCount", "Ln92/n;", "xAxisRenderer", "<init>", "(Ljava/lang/String;JLorg/joda/time/DateTime;Li53/c;ILn92/n;Lkotlin/jvm/internal/j;)V", "gcm-cycling-ability_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f58083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f58084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<k61.a> f58085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f58086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n92.n f58087f;

    private b(String str, long j8, DateTime dateTime, i53.c<k61.a> cVar, int i14, n92.n nVar) {
        str.getClass();
        dateTime.getClass();
        cVar.getClass();
        nVar.getClass();
        this.f58082a = str;
        this.f58083b = j8;
        this.f58084c = dateTime;
        this.f58085d = cVar;
        this.f58086e = i14;
        this.f58087f = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f58082a, bVar.f58082a) && d0.d(this.f58083b, bVar.f58083b) && s.g(this.f58084c, bVar.f58084c) && s.g(this.f58085d, bVar.f58085d) && this.f58086e == bVar.f58086e && s.g(this.f58087f, bVar.f58087f);
    }

    public final int hashCode() {
        int iHashCode = this.f58082a.hashCode() * 31;
        d0.a aVar = d0.f128823b;
        z.a aVar2 = z.f128618b;
        return this.f58087f.hashCode() + q2.d(this.f58086e, l2.a(this.f58085d, e0.a(q6.f.e(iHashCode, 31, this.f58083b), this.f58084c, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("CyclingAbilityChartDataConfig(title=", this.f58082a, ", color=", d0.j(this.f58083b), ", startDate=");
        sbI.append(this.f58084c);
        sbI.append(", points=");
        sbI.append(this.f58085d);
        sbI.append(", xAxisLabelsCount=");
        sbI.append(this.f58086e);
        sbI.append(", xAxisRenderer=");
        sbI.append(this.f58087f);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ b(String str, long j8, DateTime dateTime, i53.c cVar, int i14, n92.n nVar, p005kotlin.jvm.internal.j jVar) {
        this(str, j8, dateTime, cVar, i14, nVar);
    }
}
