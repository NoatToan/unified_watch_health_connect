package ge1;

import com.garmin.android.apps.connectmobile.f3;
import ds.e0;
import gs1.t;
import hz.d;
import java.util.List;
import lc.u0;
import n23.j;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lge1/a;", "", "", "Lhz/d;", "respirationAveragesValues", "respirationAveragesHighValues", "respirationAveragesLowValues", "respirationAveragesTooActiveValues", "respirationUnmeasurableValues", "Lgs1/t;", "timelineData", "Lorg/joda/time/DateTime;", "startDate", "endDate", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lgs1/t;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f76993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<d> f76994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<d> f76995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<d> f76996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<d> f76997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f76998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f76999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f77000h;

    public a(List<d> list, List<d> list2, List<d> list3, List<d> list4, List<d> list5, t tVar, DateTime dateTime, DateTime dateTime2) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        this.f76993a = list;
        this.f76994b = list2;
        this.f76995c = list3;
        this.f76996d = list4;
        this.f76997e = list5;
        this.f76998f = tVar;
        this.f76999g = dateTime;
        this.f77000h = dateTime2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f76993a, aVar.f76993a) && s.g(this.f76994b, aVar.f76994b) && s.g(this.f76995c, aVar.f76995c) && s.g(this.f76996d, aVar.f76996d) && s.g(this.f76997e, aVar.f76997e) && s.g(this.f76998f, aVar.f76998f) && s.g(this.f76999g, aVar.f76999g) && s.g(this.f77000h, aVar.f77000h);
    }

    public final int hashCode() {
        int iB = u0.b(u0.b(u0.b(u0.b(this.f76993a.hashCode() * 31, 31, this.f76994b), 31, this.f76995c), 31, this.f76996d), 31, this.f76997e);
        t tVar = this.f76998f;
        return this.f77000h.hashCode() + e0.a((iB + (tVar == null ? 0 : tVar.hashCode())) * 31, this.f76999g, 31);
    }

    public final String toString() {
        StringBuilder sbK = f3.k("RespirationAveragesChartData(respirationAveragesValues=", ", respirationAveragesHighValues=", ", respirationAveragesLowValues=", this.f76993a, this.f76994b);
        j.z(sbK, this.f76995c, ", respirationAveragesTooActiveValues=", this.f76996d, ", respirationUnmeasurableValues=");
        sbK.append(this.f76997e);
        sbK.append(", timelineData=");
        sbK.append(this.f76998f);
        sbK.append(", startDate=");
        sbK.append(this.f76999g);
        sbK.append(", endDate=");
        sbK.append(this.f77000h);
        sbK.append(")");
        return sbK.toString();
    }

    public /* synthetic */ a(List list, List list2, List list3, List list4, List list5, t tVar, DateTime dateTime, DateTime dateTime2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, list2, list3, list4, list5, (i14 & 32) != 0 ? null : tVar, dateTime, dateTime2);
    }
}
