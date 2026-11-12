package zm1;

import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzm1/s;", "", "", "Lzm1/q;", "sleepScoreValues", "Lzm1/g;", "restingHeartRateValues", "Lzm1/d;", "overnightHeartRateValues", "Lzm1/a;", "bodyBatteryChangeValues", "Lzm1/h;", "skinTempValues", "Lzm1/e;", "pulseOxValues", "Lzm1/f;", "respirationValues", "Lzm1/b;", "hrvStatusValues", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<q> f205335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g> f205336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<d> f205337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<a> f205338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<h> f205339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e> f205340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<f> f205341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<b> f205342h;

    public /* synthetic */ s(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : list2, (i14 & 4) != 0 ? null : list3, (i14 & 8) != 0 ? null : list4, (i14 & 16) != 0 ? null : list5, (i14 & 32) != 0 ? null : list6, (i14 & 64) != 0 ? null : list7, (i14 & 128) != 0 ? null : list8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.f205335a, sVar.f205335a) && p005kotlin.jvm.internal.s.g(this.f205336b, sVar.f205336b) && p005kotlin.jvm.internal.s.g(this.f205337c, sVar.f205337c) && p005kotlin.jvm.internal.s.g(this.f205338d, sVar.f205338d) && p005kotlin.jvm.internal.s.g(this.f205339e, sVar.f205339e) && p005kotlin.jvm.internal.s.g(this.f205340f, sVar.f205340f) && p005kotlin.jvm.internal.s.g(this.f205341g, sVar.f205341g) && p005kotlin.jvm.internal.s.g(this.f205342h, sVar.f205342h);
    }

    public final int hashCode() {
        List<q> list = this.f205335a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<g> list2 = this.f205336b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<d> list3 = this.f205337c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<a> list4 = this.f205338d;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<h> list5 = this.f205339e;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<e> list6 = this.f205340f;
        int iHashCode6 = (iHashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<f> list7 = this.f205341g;
        int iHashCode7 = (iHashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<b> list8 = this.f205342h;
        return iHashCode7 + (list8 != null ? list8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = f3.k("SleepSummaryChartData(sleepScoreValues=", ", restingHeartRateValues=", ", overnightHeartRateValues=", this.f205335a, this.f205336b);
        n23.j.z(sbK, this.f205337c, ", bodyBatteryChangeValues=", this.f205338d, ", skinTempValues=");
        n23.j.z(sbK, this.f205339e, ", pulseOxValues=", this.f205340f, ", respirationValues=");
        return n23.j.j(sbK, this.f205341g, ", hrvStatusValues=", this.f205342h, ")");
    }

    public s(List<q> list, List<g> list2, List<d> list3, List<a> list4, List<h> list5, List<e> list6, List<f> list7, List<b> list8) {
        this.f205335a = list;
        this.f205336b = list2;
        this.f205337c = list3;
        this.f205338d = list4;
        this.f205339e = list5;
        this.f205340f = list6;
        this.f205341g = list7;
        this.f205342h = list8;
    }

    public s() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
