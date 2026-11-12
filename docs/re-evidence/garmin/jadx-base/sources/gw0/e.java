package gw0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lgw0/e;", "", "", "metricId", "", "behaviourId", "Lb63/o;", "startDate", "endDate", "<init>", "(Ljava/lang/String;JLb63/o;Lb63/o;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f79581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.o f79582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63.o f79583d;

    public e(String str, long j8, b63.o oVar, b63.o oVar2) {
        str.getClass();
        oVar.getClass();
        oVar2.getClass();
        this.f79580a = str;
        this.f79581b = j8;
        this.f79582c = oVar;
        this.f79583d = oVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f79580a, eVar.f79580a) && this.f79581b == eVar.f79581b && p005kotlin.jvm.internal.s.g(this.f79582c, eVar.f79582c) && p005kotlin.jvm.internal.s.g(this.f79583d, eVar.f79583d);
    }

    public final int hashCode() {
        return this.f79583d.f16206a.hashCode() + n23.j.a(this.f79582c.f16206a, q6.f.e(this.f79580a.hashCode() * 31, 31, this.f79581b), 31);
    }

    public final String toString() {
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(this.f79581b, "DailySummaryRequest(metricId=", this.f79580a, ", behaviourId=");
        sbJ.append(", startDate=");
        sbJ.append(this.f79582c);
        sbJ.append(", endDate=");
        sbJ.append(this.f79583d);
        sbJ.append(")");
        return sbJ.toString();
    }

    public /* synthetic */ e(String str, long j8, b63.o oVar, b63.o oVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? -1L : j8, oVar, oVar2);
    }
}
