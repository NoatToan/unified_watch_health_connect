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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ld70/k;", "", "", "title", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "Lorg/joda/time/DateTime;", "startDate", "endDate", "Lj61/h;", "aggregation", "Li53/c;", "Lk61/a;", "points", "", "limitLineValue", "limitLineColor", "", "xAxisLabelsCount", "", "navFromTPProgressReport", "<init>", "(Ljava/lang/String;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lj61/h;Li53/c;Ljava/lang/Float;JIZLkotlin/jvm/internal/j;)V", "gcm-cycling-ability_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f58115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f58116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTime f58117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j61.h f58118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.c<k61.a> f58119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Float f58120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f58121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f58122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f58123j;

    private k(String str, long j8, DateTime dateTime, DateTime dateTime2, j61.h hVar, i53.c<k61.a> cVar, Float f14, long j14, int i14, boolean z14) {
        str.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        cVar.getClass();
        this.f58114a = str;
        this.f58115b = j8;
        this.f58116c = dateTime;
        this.f58117d = dateTime2;
        this.f58118e = hVar;
        this.f58119f = cVar;
        this.f58120g = f14;
        this.f58121h = j14;
        this.f58122i = i14;
        this.f58123j = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.f58114a, kVar.f58114a) && d0.d(this.f58115b, kVar.f58115b) && s.g(this.f58116c, kVar.f58116c) && s.g(this.f58117d, kVar.f58117d) && this.f58118e == kVar.f58118e && s.g(this.f58119f, kVar.f58119f) && s.g(this.f58120g, kVar.f58120g) && d0.d(this.f58121h, kVar.f58121h) && this.f58122i == kVar.f58122i && this.f58123j == kVar.f58123j;
    }

    public final int hashCode() {
        int iHashCode = this.f58114a.hashCode() * 31;
        d0.a aVar = d0.f128823b;
        z.a aVar2 = z.f128618b;
        int iA = e0.a(e0.a(q6.f.e(iHashCode, 31, this.f58115b), this.f58116c, 31), this.f58117d, 31);
        j61.h hVar = this.f58118e;
        int iA2 = l2.a(this.f58119f, (iA + (hVar == null ? 0 : hVar.hashCode())) * 31, 31);
        Float f14 = this.f58120g;
        return Boolean.hashCode(this.f58123j) + q2.d(this.f58122i, q6.f.e((iA2 + (f14 != null ? f14.hashCode() : 0)) * 31, 31, this.f58121h), 31);
    }

    public final String toString() {
        String strJ = d0.j(this.f58115b);
        String strJ2 = d0.j(this.f58121h);
        StringBuilder sbI = p6.b.i("TrainingPlanChartDataConfig(title=", this.f58114a, ", color=", strJ, ", startDate=");
        sbI.append(this.f58116c);
        sbI.append(", endDate=");
        sbI.append(this.f58117d);
        sbI.append(", aggregation=");
        sbI.append(this.f58118e);
        sbI.append(", points=");
        sbI.append(this.f58119f);
        sbI.append(", limitLineValue=");
        sbI.append(this.f58120g);
        sbI.append(", limitLineColor=");
        sbI.append(strJ2);
        sbI.append(", xAxisLabelsCount=");
        sbI.append(this.f58122i);
        sbI.append(", navFromTPProgressReport=");
        sbI.append(this.f58123j);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ k(String str, long j8, DateTime dateTime, DateTime dateTime2, j61.h hVar, i53.c cVar, Float f14, long j14, int i14, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(str, j8, dateTime, dateTime2, hVar, cVar, f14, j14, i14, z14);
    }
}
