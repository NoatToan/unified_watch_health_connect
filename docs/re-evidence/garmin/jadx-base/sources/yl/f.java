package yl;

import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lyl/f;", "", "", "reportTitle", "formattedOverallSpo2Average", "Lyl/e;", "chartState", "Li53/c;", "Lyl/a;", "dailyReadingsStates", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lyl/e;Li53/c;)V", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f197648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f197649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<a> f197650d;

    public f(String str, String str2, e eVar, i53.c<a> cVar) {
        str.getClass();
        str2.getClass();
        eVar.getClass();
        cVar.getClass();
        this.f197647a = str;
        this.f197648b = str2;
        this.f197649c = eVar;
        this.f197650d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f197647a.equals(fVar.f197647a) && this.f197648b.equals(fVar.f197648b) && this.f197649c.equals(fVar.f197649c) && this.f197650d.equals(fVar.f197650d);
    }

    public final int hashCode() {
        return this.f197650d.hashCode() + ((this.f197649c.hashCode() + g.j(this.f197647a.hashCode() * 31, 31, this.f197648b)) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("PulseOxAcclimationWeeklyReportState(reportTitle=", this.f197647a, ", formattedOverallSpo2Average=", this.f197648b, ", chartState=");
        sbI.append(this.f197649c);
        sbI.append(", dailyReadingsStates=");
        sbI.append(this.f197650d);
        sbI.append(")");
        return sbI.toString();
    }
}
