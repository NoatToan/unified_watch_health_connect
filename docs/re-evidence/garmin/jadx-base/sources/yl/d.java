package yl;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyl/d;", "", "", "spo2Value", "", "latestSpo2ValueReadingTime", "Lyl/c;", "chartState", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lyl/c;)V", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f197639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f197640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f197641c;

    public d(Integer num, String str, c cVar) {
        cVar.getClass();
        this.f197639a = num;
        this.f197640b = str;
        this.f197641c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f197639a, dVar.f197639a) && s.g(this.f197640b, dVar.f197640b) && this.f197641c.equals(dVar.f197641c);
    }

    public final int hashCode() {
        Integer num = this.f197639a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f197640b;
        return this.f197641c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = l2.f("PulseOxAcclimationDailyReportState(spo2Value=", this.f197639a, ", latestSpo2ValueReadingTime=", this.f197640b, ", chartState=");
        sbF.append(this.f197641c);
        sbF.append(")");
        return sbF.toString();
    }
}
