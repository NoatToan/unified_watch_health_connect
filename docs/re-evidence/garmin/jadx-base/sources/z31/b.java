package z31;

import ds.e0;
import i41.f;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lz31/b;", "", "", "yMaximum", "yMinimum", "xMinimum", "xMaximum", "Lorg/joda/time/DateTime;", "startDateTime", "endDateTime", "", "days", "", "Li41/f;", "hrvSummaries", "", "isShowOvernightAvg", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILjava/util/List;Z)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f202139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f202140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f202141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Float f202142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DateTime f202143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTime f202144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f202145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<f> f202146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f202147i;

    public /* synthetic */ b(Float f14, Float f15, Float f16, Float f17, DateTime dateTime, DateTime dateTime2, int i14, List list, boolean z14, int i15, j jVar) {
        this((i15 & 1) != 0 ? null : f14, (i15 & 2) != 0 ? null : f15, (i15 & 4) != 0 ? null : f16, (i15 & 8) != 0 ? null : f17, dateTime, dateTime2, i14, (i15 & 128) != 0 ? null : list, (i15 & 256) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f202139a, bVar.f202139a) && s.g(this.f202140b, bVar.f202140b) && s.g(this.f202141c, bVar.f202141c) && s.g(this.f202142d, bVar.f202142d) && s.g(this.f202143e, bVar.f202143e) && s.g(this.f202144f, bVar.f202144f) && this.f202145g == bVar.f202145g && s.g(this.f202146h, bVar.f202146h) && this.f202147i == bVar.f202147i;
    }

    public final int hashCode() {
        Float f14 = this.f202139a;
        int iHashCode = (f14 == null ? 0 : f14.hashCode()) * 31;
        Float f15 = this.f202140b;
        int iHashCode2 = (iHashCode + (f15 == null ? 0 : f15.hashCode())) * 31;
        Float f16 = this.f202141c;
        int iHashCode3 = (iHashCode2 + (f16 == null ? 0 : f16.hashCode())) * 31;
        Float f17 = this.f202142d;
        int iD = q2.d(this.f202145g, e0.a(e0.a((iHashCode3 + (f17 == null ? 0 : f17.hashCode())) * 31, this.f202143e, 31), this.f202144f, 31), 31);
        List<f> list = this.f202146h;
        return Boolean.hashCode(this.f202147i) + ((iD + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        boolean z14 = this.f202147i;
        StringBuilder sb3 = new StringBuilder("OhrvSummariesChartDTO(yMaximum=");
        sb3.append(this.f202139a);
        sb3.append(", yMinimum=");
        sb3.append(this.f202140b);
        sb3.append(", xMinimum=");
        sb3.append(this.f202141c);
        sb3.append(", xMaximum=");
        sb3.append(this.f202142d);
        sb3.append(", startDateTime=");
        sb3.append(this.f202143e);
        sb3.append(", endDateTime=");
        sb3.append(this.f202144f);
        sb3.append(", days=");
        sb3.append(this.f202145g);
        sb3.append(", hrvSummaries=");
        sb3.append(this.f202146h);
        sb3.append(", isShowOvernightAvg=");
        return hb.a.k(sb3, z14, ")");
    }

    public b(Float f14, Float f15, Float f16, Float f17, DateTime dateTime, DateTime dateTime2, int i14, List<f> list, boolean z14) {
        dateTime.getClass();
        dateTime2.getClass();
        this.f202139a = f14;
        this.f202140b = f15;
        this.f202141c = f16;
        this.f202142d = f17;
        this.f202143e = dateTime;
        this.f202144f = dateTime2;
        this.f202145g = i14;
        this.f202146h = list;
        this.f202147i = z14;
    }
}
