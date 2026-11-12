package qp;

import am.x0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;
import yc.l2;
import yp.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lqp/c;", "", "Lam/x0;", "filterSelectionType", "Lyp/b;", "chartInfo", "Lyp/f;", "reportsTotals", "Li53/c;", "Lyp/a;", "reportsItems", "", "showPersonalRecords", "", "startDateString", "isUsingMetric", "isNotStatuteUS", "<init>", "(Lam/x0;Lyp/b;Lyp/f;Li53/c;ZLjava/lang/String;ZZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f145999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yp.b f146000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f146001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<yp.a> f146002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f146003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f146004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f146005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f146006h;

    /* JADX WARN: Multi-variable type inference failed */
    public c(x0 x0Var, yp.b bVar, f fVar, i53.c<? extends yp.a> cVar, boolean z14, String str, boolean z15, boolean z16) {
        x0Var.getClass();
        fVar.getClass();
        cVar.getClass();
        str.getClass();
        this.f145999a = x0Var;
        this.f146000b = bVar;
        this.f146001c = fVar;
        this.f146002d = cVar;
        this.f146003e = z14;
        this.f146004f = str;
        this.f146005g = z15;
        this.f146006h = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f145999a == cVar.f145999a && s.g(this.f146000b, cVar.f146000b) && this.f146001c.equals(cVar.f146001c) && this.f146002d.equals(cVar.f146002d) && this.f146003e == cVar.f146003e && this.f146004f.equals(cVar.f146004f) && this.f146005g == cVar.f146005g && this.f146006h == cVar.f146006h;
    }

    public final int hashCode() {
        int iHashCode = this.f145999a.hashCode() * 31;
        yp.b bVar = this.f146000b;
        return Boolean.hashCode(this.f146006h) + q6.f.g(g.j(q6.f.g(l2.a(this.f146002d, (this.f146001c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.f198605a.hashCode())) * 31)) * 31, 31), 31, this.f146003e), 31, this.f146004f), 31, this.f146005g);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ReportTabUiState(filterSelectionType=");
        sb3.append(this.f145999a);
        sb3.append(", chartInfo=");
        sb3.append(this.f146000b);
        sb3.append(", reportsTotals=");
        sb3.append(this.f146001c);
        sb3.append(", reportsItems=");
        sb3.append(this.f146002d);
        sb3.append(", showPersonalRecords=");
        fb1.c.w(", startDateString=", this.f146004f, ", isUsingMetric=", sb3, this.f146003e);
        return com.airbnb.lottie.animation.keyframe.a.f(", isNotStatuteUS=", ")", sb3, this.f146005g, this.f146006h);
    }
}
